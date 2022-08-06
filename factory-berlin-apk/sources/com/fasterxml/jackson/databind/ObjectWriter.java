package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.FormatSchema;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.PrettyPrinter;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.io.CharacterEscapes;
import com.fasterxml.jackson.core.io.SegmentedStringWriter;
import com.fasterxml.jackson.core.util.Instantiatable;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import com.fasterxml.jackson.databind.ser.SerializerFactory;
import com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.Closeable;
import java.io.IOException;
import java.io.Serializable;

public class ObjectWriter implements Serializable {
    protected static final PrettyPrinter NULL_PRETTY_PRINTER = new MinimalPrettyPrinter();
    protected final SerializationConfig _config;
    protected final JsonFactory _generatorFactory;
    protected final GeneratorSettings _generatorSettings;
    protected final Prefetch _prefetch;
    protected final SerializerFactory _serializerFactory;
    protected final DefaultSerializerProvider _serializerProvider;

    public static final class GeneratorSettings implements Serializable {
        public static final GeneratorSettings empty = new GeneratorSettings((PrettyPrinter) null, (FormatSchema) null, (CharacterEscapes) null, (SerializableString) null);
        public final CharacterEscapes characterEscapes;
        public final PrettyPrinter prettyPrinter;
        public final SerializableString rootValueSeparator;
        public final FormatSchema schema;

        public GeneratorSettings(PrettyPrinter prettyPrinter2, FormatSchema formatSchema, CharacterEscapes characterEscapes2, SerializableString serializableString) {
            this.prettyPrinter = prettyPrinter2;
            this.schema = formatSchema;
            this.characterEscapes = characterEscapes2;
            this.rootValueSeparator = serializableString;
        }

        public void initialize(JsonGenerator jsonGenerator) {
            PrettyPrinter prettyPrinter2 = this.prettyPrinter;
            if (prettyPrinter2 != null) {
                if (prettyPrinter2 == ObjectWriter.NULL_PRETTY_PRINTER) {
                    jsonGenerator.setPrettyPrinter((PrettyPrinter) null);
                } else {
                    if (prettyPrinter2 instanceof Instantiatable) {
                        prettyPrinter2 = (PrettyPrinter) ((Instantiatable) prettyPrinter2).createInstance();
                    }
                    jsonGenerator.setPrettyPrinter(prettyPrinter2);
                }
            }
            CharacterEscapes characterEscapes2 = this.characterEscapes;
            if (characterEscapes2 != null) {
                jsonGenerator.setCharacterEscapes(characterEscapes2);
            }
            FormatSchema formatSchema = this.schema;
            if (formatSchema == null) {
                SerializableString serializableString = this.rootValueSeparator;
                if (serializableString != null) {
                    jsonGenerator.setRootValueSeparator(serializableString);
                    return;
                }
                return;
            }
            jsonGenerator.setSchema(formatSchema);
            throw null;
        }

        public GeneratorSettings with(CharacterEscapes characterEscapes2) {
            return this.characterEscapes == characterEscapes2 ? this : new GeneratorSettings(this.prettyPrinter, this.schema, characterEscapes2, this.rootValueSeparator);
        }
    }

    public static final class Prefetch implements Serializable {
        public static final Prefetch empty = new Prefetch((JavaType) null, (JsonSerializer<Object>) null, (TypeSerializer) null);
        private final JavaType rootType;
        private final TypeSerializer typeSerializer;
        private final JsonSerializer<Object> valueSerializer;

        private Prefetch(JavaType javaType, JsonSerializer<Object> jsonSerializer, TypeSerializer typeSerializer2) {
            this.rootType = javaType;
            this.valueSerializer = jsonSerializer;
            this.typeSerializer = typeSerializer2;
        }

        public Prefetch forRootType(ObjectWriter objectWriter, JavaType javaType) {
            if (javaType == null || javaType.isJavaLangObject()) {
                return (this.rootType == null || this.valueSerializer == null) ? this : new Prefetch((JavaType) null, (JsonSerializer<Object>) null, this.typeSerializer);
            }
            if (javaType.equals(this.rootType)) {
                return this;
            }
            if (objectWriter.isEnabled(SerializationFeature.EAGER_SERIALIZER_FETCH)) {
                try {
                    JsonSerializer<Object> findTypedValueSerializer = objectWriter._serializerProvider().findTypedValueSerializer(javaType, true, (BeanProperty) null);
                    if (findTypedValueSerializer instanceof TypeWrappedSerializer) {
                        return new Prefetch(javaType, (JsonSerializer<Object>) null, ((TypeWrappedSerializer) findTypedValueSerializer).typeSerializer());
                    }
                    return new Prefetch(javaType, findTypedValueSerializer, (TypeSerializer) null);
                } catch (JsonProcessingException unused) {
                }
            }
            return new Prefetch(javaType, (JsonSerializer<Object>) null, this.typeSerializer);
        }

        public void serialize(JsonGenerator jsonGenerator, Object obj, DefaultSerializerProvider defaultSerializerProvider) {
            TypeSerializer typeSerializer2 = this.typeSerializer;
            if (typeSerializer2 != null) {
                defaultSerializerProvider.serializePolymorphic(jsonGenerator, obj, this.rootType, this.valueSerializer, typeSerializer2);
                return;
            }
            JsonSerializer<Object> jsonSerializer = this.valueSerializer;
            if (jsonSerializer != null) {
                defaultSerializerProvider.serializeValue(jsonGenerator, obj, this.rootType, jsonSerializer);
                return;
            }
            JavaType javaType = this.rootType;
            if (javaType != null) {
                defaultSerializerProvider.serializeValue(jsonGenerator, obj, javaType);
            } else {
                defaultSerializerProvider.serializeValue(jsonGenerator, obj);
            }
        }
    }

    protected ObjectWriter(ObjectMapper objectMapper, SerializationConfig serializationConfig, JavaType javaType, PrettyPrinter prettyPrinter) {
        this._config = serializationConfig;
        this._serializerProvider = objectMapper._serializerProvider;
        this._serializerFactory = objectMapper._serializerFactory;
        this._generatorFactory = objectMapper._jsonFactory;
        this._generatorSettings = prettyPrinter == null ? GeneratorSettings.empty : new GeneratorSettings(prettyPrinter, (FormatSchema) null, (CharacterEscapes) null, (SerializableString) null);
        if (javaType == null || javaType.hasRawClass(Object.class)) {
            this._prefetch = Prefetch.empty;
        } else {
            this._prefetch = Prefetch.empty.forRootType(this, javaType.withStaticTyping());
        }
    }

    private final void _writeCloseable(JsonGenerator jsonGenerator, Object obj) {
        Closeable closeable = (Closeable) obj;
        try {
            this._prefetch.serialize(jsonGenerator, obj, _serializerProvider());
            try {
                closeable.close();
                jsonGenerator.close();
            } catch (Exception e2) {
                e = e2;
                closeable = null;
                ClassUtil.closeOnFailAndThrowAsIOE(jsonGenerator, closeable, e);
                throw null;
            }
        } catch (Exception e3) {
            e = e3;
            ClassUtil.closeOnFailAndThrowAsIOE(jsonGenerator, closeable, e);
            throw null;
        }
    }

    /* access modifiers changed from: protected */
    public final void _configAndWriteValue(JsonGenerator jsonGenerator, Object obj) {
        _configureGenerator(jsonGenerator);
        if (!this._config.isEnabled(SerializationFeature.CLOSE_CLOSEABLE) || !(obj instanceof Closeable)) {
            try {
                this._prefetch.serialize(jsonGenerator, obj, _serializerProvider());
                jsonGenerator.close();
            } catch (Exception e2) {
                ClassUtil.closeOnFailAndThrowAsIOE(jsonGenerator, e2);
                throw null;
            }
        } else {
            _writeCloseable(jsonGenerator, obj);
        }
    }

    /* access modifiers changed from: protected */
    public final void _configureGenerator(JsonGenerator jsonGenerator) {
        this._config.initialize(jsonGenerator);
        this._generatorSettings.initialize(jsonGenerator);
    }

    /* access modifiers changed from: protected */
    public ObjectWriter _new(GeneratorSettings generatorSettings, Prefetch prefetch) {
        if (this._generatorSettings == generatorSettings && this._prefetch == prefetch) {
            return this;
        }
        return new ObjectWriter(this, this._config, generatorSettings, prefetch);
    }

    /* access modifiers changed from: protected */
    public DefaultSerializerProvider _serializerProvider() {
        return this._serializerProvider.createInstance(this._config, this._serializerFactory);
    }

    public boolean isEnabled(SerializationFeature serializationFeature) {
        return this._config.isEnabled(serializationFeature);
    }

    public ObjectWriter with(CharacterEscapes characterEscapes) {
        return _new(this._generatorSettings.with(characterEscapes), this._prefetch);
    }

    public String writeValueAsString(Object obj) {
        SegmentedStringWriter segmentedStringWriter = new SegmentedStringWriter(this._generatorFactory._getBufferRecycler());
        try {
            _configAndWriteValue(this._generatorFactory.createGenerator(segmentedStringWriter), obj);
            return segmentedStringWriter.getAndClear();
        } catch (JsonProcessingException e2) {
            throw e2;
        } catch (IOException e3) {
            throw JsonMappingException.fromUnexpectedIOE(e3);
        }
    }

    protected ObjectWriter(ObjectMapper objectMapper, SerializationConfig serializationConfig) {
        this._config = serializationConfig;
        this._serializerProvider = objectMapper._serializerProvider;
        this._serializerFactory = objectMapper._serializerFactory;
        this._generatorFactory = objectMapper._jsonFactory;
        this._generatorSettings = GeneratorSettings.empty;
        this._prefetch = Prefetch.empty;
    }

    protected ObjectWriter(ObjectMapper objectMapper, SerializationConfig serializationConfig, FormatSchema formatSchema) {
        this._config = serializationConfig;
        this._serializerProvider = objectMapper._serializerProvider;
        this._serializerFactory = objectMapper._serializerFactory;
        this._generatorFactory = objectMapper._jsonFactory;
        this._generatorSettings = formatSchema == null ? GeneratorSettings.empty : new GeneratorSettings((PrettyPrinter) null, formatSchema, (CharacterEscapes) null, (SerializableString) null);
        this._prefetch = Prefetch.empty;
    }

    protected ObjectWriter(ObjectWriter objectWriter, SerializationConfig serializationConfig, GeneratorSettings generatorSettings, Prefetch prefetch) {
        this._config = serializationConfig;
        this._serializerProvider = objectWriter._serializerProvider;
        this._serializerFactory = objectWriter._serializerFactory;
        this._generatorFactory = objectWriter._generatorFactory;
        this._generatorSettings = generatorSettings;
        this._prefetch = prefetch;
    }
}
