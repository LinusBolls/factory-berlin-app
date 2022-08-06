package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.FormatSchema;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.TreeNode;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.filter.TokenFilter;
import com.fasterxml.jackson.core.type.ResolvedType;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.cfg.PackageVersion;
import com.fasterxml.jackson.databind.deser.DataFormatReaders;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.TreeTraversingParser;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.IOException;
import java.io.Serializable;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class ObjectReader extends ObjectCodec implements Serializable {
    private static final JavaType JSON_NODE_TYPE = SimpleType.constructUnsafe(JsonNode.class);
    protected final DeserializationConfig _config;
    protected final DefaultDeserializationContext _context;
    protected final DataFormatReaders _dataFormatReaders;
    private final TokenFilter _filter;
    protected final InjectableValues _injectableValues;
    protected final JsonFactory _parserFactory;
    protected final JsonDeserializer<Object> _rootDeserializer;
    protected final ConcurrentHashMap<JavaType, JsonDeserializer<Object>> _rootDeserializers;
    protected final FormatSchema _schema;
    protected final boolean _unwrapRoot;
    protected final Object _valueToUpdate;
    protected final JavaType _valueType;

    protected ObjectReader(ObjectMapper objectMapper, DeserializationConfig deserializationConfig) {
        this(objectMapper, deserializationConfig, (JavaType) null, (Object) null, (FormatSchema) null, (InjectableValues) null);
    }

    /* access modifiers changed from: protected */
    public Object _bind(JsonParser jsonParser, Object obj) {
        DefaultDeserializationContext createDeserializationContext = createDeserializationContext(jsonParser);
        JsonToken _initForReading = _initForReading(createDeserializationContext, jsonParser);
        if (_initForReading == JsonToken.VALUE_NULL) {
            if (obj == null) {
                obj = _findRootDeserializer(createDeserializationContext).getNullValue(createDeserializationContext);
            }
        } else if (!(_initForReading == JsonToken.END_ARRAY || _initForReading == JsonToken.END_OBJECT)) {
            JsonDeserializer<Object> _findRootDeserializer = _findRootDeserializer(createDeserializationContext);
            if (this._unwrapRoot) {
                obj = _unwrapAndDeserialize(jsonParser, createDeserializationContext, this._valueType, _findRootDeserializer);
            } else if (obj == null) {
                obj = _findRootDeserializer.deserialize(jsonParser, createDeserializationContext);
            } else {
                obj = _findRootDeserializer.deserialize(jsonParser, createDeserializationContext, obj);
            }
        }
        jsonParser.clearCurrentToken();
        if (this._config.isEnabled(DeserializationFeature.FAIL_ON_TRAILING_TOKENS)) {
            _verifyNoTrailingTokens(jsonParser, createDeserializationContext, this._valueType);
        }
        return obj;
    }

    /* access modifiers changed from: protected */
    public final JsonNode _bindAsTree(JsonParser jsonParser) {
        Object obj;
        this._config.initialize(jsonParser);
        FormatSchema formatSchema = this._schema;
        if (formatSchema != null) {
            jsonParser.setSchema(formatSchema);
        }
        JsonToken currentToken = jsonParser.getCurrentToken();
        if (currentToken == null && (currentToken = jsonParser.nextToken()) == null) {
            return null;
        }
        DefaultDeserializationContext createDeserializationContext = createDeserializationContext(jsonParser);
        if (currentToken == JsonToken.VALUE_NULL) {
            return createDeserializationContext.getNodeFactory().nullNode();
        }
        JsonDeserializer<Object> _findTreeDeserializer = _findTreeDeserializer(createDeserializationContext);
        if (this._unwrapRoot) {
            obj = _unwrapAndDeserialize(jsonParser, createDeserializationContext, JSON_NODE_TYPE, _findTreeDeserializer);
        } else {
            Object deserialize = _findTreeDeserializer.deserialize(jsonParser, createDeserializationContext);
            if (this._config.isEnabled(DeserializationFeature.FAIL_ON_TRAILING_TOKENS)) {
                _verifyNoTrailingTokens(jsonParser, createDeserializationContext, JSON_NODE_TYPE);
            }
            obj = deserialize;
        }
        return (JsonNode) obj;
    }

    /* access modifiers changed from: protected */
    public JsonDeserializer<Object> _findRootDeserializer(DeserializationContext deserializationContext) {
        JsonDeserializer<Object> jsonDeserializer = this._rootDeserializer;
        if (jsonDeserializer != null) {
            return jsonDeserializer;
        }
        JavaType javaType = this._valueType;
        if (javaType != null) {
            JsonDeserializer<Object> jsonDeserializer2 = this._rootDeserializers.get(javaType);
            if (jsonDeserializer2 != null) {
                return jsonDeserializer2;
            }
            JsonDeserializer<Object> findRootValueDeserializer = deserializationContext.findRootValueDeserializer(javaType);
            if (findRootValueDeserializer != null) {
                this._rootDeserializers.put(javaType, findRootValueDeserializer);
                return findRootValueDeserializer;
            }
            deserializationContext.reportBadDefinition(javaType, "Cannot find a deserializer for type " + javaType);
            throw null;
        }
        deserializationContext.reportBadDefinition((JavaType) null, "No value type configured for ObjectReader");
        throw null;
    }

    /* access modifiers changed from: protected */
    public JsonDeserializer<Object> _findTreeDeserializer(DeserializationContext deserializationContext) {
        JsonDeserializer<Object> jsonDeserializer = this._rootDeserializers.get(JSON_NODE_TYPE);
        if (jsonDeserializer == null) {
            jsonDeserializer = deserializationContext.findRootValueDeserializer(JSON_NODE_TYPE);
            if (jsonDeserializer != null) {
                this._rootDeserializers.put(JSON_NODE_TYPE, jsonDeserializer);
            } else {
                JavaType javaType = JSON_NODE_TYPE;
                deserializationContext.reportBadDefinition(javaType, "Cannot find a deserializer for type " + JSON_NODE_TYPE);
                throw null;
            }
        }
        return jsonDeserializer;
    }

    /* access modifiers changed from: protected */
    public JsonToken _initForReading(DeserializationContext deserializationContext, JsonParser jsonParser) {
        FormatSchema formatSchema = this._schema;
        if (formatSchema != null) {
            jsonParser.setSchema(formatSchema);
        }
        this._config.initialize(jsonParser);
        JsonToken currentToken = jsonParser.getCurrentToken();
        if (currentToken != null || (currentToken = jsonParser.nextToken()) != null) {
            return currentToken;
        }
        deserializationContext.reportInputMismatch(this._valueType, "No content to map due to end-of-input", new Object[0]);
        throw null;
    }

    /* access modifiers changed from: protected */
    public ObjectReader _new(ObjectReader objectReader, DeserializationConfig deserializationConfig) {
        return new ObjectReader(objectReader, deserializationConfig);
    }

    /* access modifiers changed from: protected */
    public <T> MappingIterator<T> _newIterator(JsonParser jsonParser, DeserializationContext deserializationContext, JsonDeserializer<?> jsonDeserializer, boolean z) {
        return new MappingIterator(this._valueType, jsonParser, deserializationContext, jsonDeserializer, z, this._valueToUpdate);
    }

    /* access modifiers changed from: protected */
    public JsonDeserializer<Object> _prefetchRootDeserializer(JavaType javaType) {
        if (javaType == null || !this._config.isEnabled(DeserializationFeature.EAGER_DESERIALIZER_FETCH)) {
            return null;
        }
        JsonDeserializer<Object> jsonDeserializer = this._rootDeserializers.get(javaType);
        if (jsonDeserializer != null) {
            return jsonDeserializer;
        }
        try {
            JsonDeserializer<Object> findRootValueDeserializer = createDeserializationContext((JsonParser) null).findRootValueDeserializer(javaType);
            if (findRootValueDeserializer != null) {
                try {
                    this._rootDeserializers.put(javaType, findRootValueDeserializer);
                } catch (JsonProcessingException unused) {
                    return findRootValueDeserializer;
                }
            }
            return findRootValueDeserializer;
        } catch (JsonProcessingException unused2) {
            return jsonDeserializer;
        }
    }

    /* access modifiers changed from: protected */
    public Object _unwrapAndDeserialize(JsonParser jsonParser, DeserializationContext deserializationContext, JavaType javaType, JsonDeserializer<Object> jsonDeserializer) {
        Object obj;
        String simpleName = this._config.findRootName(javaType).getSimpleName();
        JsonToken currentToken = jsonParser.getCurrentToken();
        JsonToken jsonToken = JsonToken.START_OBJECT;
        if (currentToken == jsonToken) {
            JsonToken nextToken = jsonParser.nextToken();
            JsonToken jsonToken2 = JsonToken.FIELD_NAME;
            if (nextToken == jsonToken2) {
                String currentName = jsonParser.getCurrentName();
                if (simpleName.equals(currentName)) {
                    jsonParser.nextToken();
                    Object obj2 = this._valueToUpdate;
                    if (obj2 == null) {
                        obj = jsonDeserializer.deserialize(jsonParser, deserializationContext);
                    } else {
                        jsonDeserializer.deserialize(jsonParser, deserializationContext, obj2);
                        obj = this._valueToUpdate;
                    }
                    JsonToken nextToken2 = jsonParser.nextToken();
                    JsonToken jsonToken3 = JsonToken.END_OBJECT;
                    if (nextToken2 == jsonToken3) {
                        if (this._config.isEnabled(DeserializationFeature.FAIL_ON_TRAILING_TOKENS)) {
                            _verifyNoTrailingTokens(jsonParser, deserializationContext, this._valueType);
                        }
                        return obj;
                    }
                    deserializationContext.reportWrongTokenException(javaType, jsonToken3, "Current token not END_OBJECT (to match wrapper object with root name '%s'), but %s", simpleName, jsonParser.getCurrentToken());
                    throw null;
                }
                deserializationContext.reportInputMismatch(javaType, "Root name '%s' does not match expected ('%s') for type %s", currentName, simpleName, javaType);
                throw null;
            }
            deserializationContext.reportWrongTokenException(javaType, jsonToken2, "Current token not FIELD_NAME (to contain expected root name '%s'), but %s", simpleName, jsonParser.getCurrentToken());
            throw null;
        }
        deserializationContext.reportWrongTokenException(javaType, jsonToken, "Current token not START_OBJECT (needed to unwrap root name '%s'), but %s", simpleName, jsonParser.getCurrentToken());
        throw null;
    }

    /* access modifiers changed from: protected */
    public final void _verifyNoTrailingTokens(JsonParser jsonParser, DeserializationContext deserializationContext, JavaType javaType) {
        Object obj;
        JsonToken nextToken = jsonParser.nextToken();
        if (nextToken != null) {
            Class<?> rawClass = ClassUtil.rawClass(javaType);
            if (rawClass == null && (obj = this._valueToUpdate) != null) {
                rawClass = obj.getClass();
            }
            deserializationContext.reportTrailingTokens(rawClass, jsonParser, nextToken);
            throw null;
        }
    }

    /* access modifiers changed from: protected */
    public ObjectReader _with(DeserializationConfig deserializationConfig) {
        if (deserializationConfig == this._config) {
            return this;
        }
        ObjectReader _new = _new(this, deserializationConfig);
        DataFormatReaders dataFormatReaders = this._dataFormatReaders;
        return dataFormatReaders != null ? _new.withFormatDetection(dataFormatReaders.with(deserializationConfig)) : _new;
    }

    /* access modifiers changed from: protected */
    public DefaultDeserializationContext createDeserializationContext(JsonParser jsonParser) {
        return this._context.createInstance(this._config, jsonParser, this._injectableValues);
    }

    public ObjectReader forType(JavaType javaType) {
        if (javaType != null && javaType.equals(this._valueType)) {
            return this;
        }
        JsonDeserializer<Object> _prefetchRootDeserializer = _prefetchRootDeserializer(javaType);
        DataFormatReaders dataFormatReaders = this._dataFormatReaders;
        if (dataFormatReaders != null) {
            dataFormatReaders = dataFormatReaders.withType(javaType);
        }
        return _new(this, this._config, javaType, _prefetchRootDeserializer, this._valueToUpdate, this._schema, this._injectableValues, dataFormatReaders);
    }

    public JsonFactory getFactory() {
        return this._parserFactory;
    }

    public <T extends TreeNode> T readTree(JsonParser jsonParser) {
        return _bindAsTree(jsonParser);
    }

    public <T> T readValue(JsonParser jsonParser) {
        return _bind(jsonParser, this._valueToUpdate);
    }

    public <T> Iterator<T> readValues(JsonParser jsonParser, Class<T> cls) {
        return forType((Class<?>) cls).readValues(jsonParser);
    }

    public JsonParser treeAsTokens(TreeNode treeNode) {
        return new TreeTraversingParser((JsonNode) treeNode, withValueToUpdate((Object) null));
    }

    public <T> T treeToValue(TreeNode treeNode, Class<T> cls) {
        try {
            return readValue(treeAsTokens(treeNode), cls);
        } catch (JsonProcessingException e2) {
            throw e2;
        } catch (IOException e3) {
            throw JsonMappingException.fromUnexpectedIOE(e3);
        }
    }

    public Version version() {
        return PackageVersion.VERSION;
    }

    public ObjectReader with(InjectableValues injectableValues) {
        if (this._injectableValues == injectableValues) {
            return this;
        }
        return _new(this, this._config, this._valueType, this._rootDeserializer, this._valueToUpdate, this._schema, injectableValues, this._dataFormatReaders);
    }

    public ObjectReader withFormatDetection(DataFormatReaders dataFormatReaders) {
        return _new(this, this._config, this._valueType, this._rootDeserializer, this._valueToUpdate, this._schema, this._injectableValues, dataFormatReaders);
    }

    public ObjectReader withValueToUpdate(Object obj) {
        if (obj == this._valueToUpdate) {
            return this;
        }
        if (obj == null) {
            return _new(this, this._config, this._valueType, this._rootDeserializer, (Object) null, this._schema, this._injectableValues, this._dataFormatReaders);
        }
        JavaType javaType = this._valueType;
        if (javaType == null) {
            javaType = this._config.constructType(obj.getClass());
        }
        return _new(this, this._config, javaType, this._rootDeserializer, obj, this._schema, this._injectableValues, this._dataFormatReaders);
    }

    public void writeTree(JsonGenerator jsonGenerator, TreeNode treeNode) {
        throw new UnsupportedOperationException();
    }

    public void writeValue(JsonGenerator jsonGenerator, Object obj) {
        throw new UnsupportedOperationException("Not implemented for ObjectReader");
    }

    protected ObjectReader(ObjectMapper objectMapper, DeserializationConfig deserializationConfig, JavaType javaType, Object obj, FormatSchema formatSchema, InjectableValues injectableValues) {
        this._config = deserializationConfig;
        this._context = objectMapper._deserializationContext;
        this._rootDeserializers = objectMapper._rootDeserializers;
        this._parserFactory = objectMapper._jsonFactory;
        this._valueType = javaType;
        this._valueToUpdate = obj;
        this._schema = formatSchema;
        this._injectableValues = injectableValues;
        this._unwrapRoot = deserializationConfig.useRootWrapping();
        this._rootDeserializer = _prefetchRootDeserializer(javaType);
        this._dataFormatReaders = null;
        this._filter = null;
    }

    /* access modifiers changed from: protected */
    public ObjectReader _new(ObjectReader objectReader, DeserializationConfig deserializationConfig, JavaType javaType, JsonDeserializer<Object> jsonDeserializer, Object obj, FormatSchema formatSchema, InjectableValues injectableValues, DataFormatReaders dataFormatReaders) {
        return new ObjectReader(objectReader, deserializationConfig, javaType, jsonDeserializer, obj, formatSchema, injectableValues, dataFormatReaders);
    }

    public JsonNode createArrayNode() {
        return this._config.getNodeFactory().arrayNode();
    }

    public JsonNode createObjectNode() {
        return this._config.getNodeFactory().objectNode();
    }

    public <T> T readValue(JsonParser jsonParser, Class<T> cls) {
        return forType((Class<?>) cls).readValue(jsonParser);
    }

    public <T> Iterator<T> readValues(JsonParser jsonParser, TypeReference<?> typeReference) {
        return forType(typeReference).readValues(jsonParser);
    }

    public <T> T readValue(JsonParser jsonParser, TypeReference<?> typeReference) {
        return forType(typeReference).readValue(jsonParser);
    }

    public <T> Iterator<T> readValues(JsonParser jsonParser, ResolvedType resolvedType) {
        return readValues(jsonParser, (JavaType) resolvedType);
    }

    public ObjectReader with(JsonNodeFactory jsonNodeFactory) {
        return _with(this._config.with(jsonNodeFactory));
    }

    public <T> T readValue(JsonParser jsonParser, ResolvedType resolvedType) {
        return forType((JavaType) resolvedType).readValue(jsonParser);
    }

    public <T> Iterator<T> readValues(JsonParser jsonParser, JavaType javaType) {
        return forType(javaType).readValues(jsonParser);
    }

    public <T> MappingIterator<T> readValues(JsonParser jsonParser) {
        DefaultDeserializationContext createDeserializationContext = createDeserializationContext(jsonParser);
        return _newIterator(jsonParser, createDeserializationContext, _findRootDeserializer(createDeserializationContext), false);
    }

    public ObjectReader forType(Class<?> cls) {
        return forType(this._config.constructType(cls));
    }

    public ObjectReader forType(TypeReference<?> typeReference) {
        return forType(this._config.getTypeFactory().constructType(typeReference.getType()));
    }

    protected ObjectReader(ObjectReader objectReader, DeserializationConfig deserializationConfig, JavaType javaType, JsonDeserializer<Object> jsonDeserializer, Object obj, FormatSchema formatSchema, InjectableValues injectableValues, DataFormatReaders dataFormatReaders) {
        this._config = deserializationConfig;
        this._context = objectReader._context;
        this._rootDeserializers = objectReader._rootDeserializers;
        this._parserFactory = objectReader._parserFactory;
        this._valueType = javaType;
        this._rootDeserializer = jsonDeserializer;
        this._valueToUpdate = obj;
        this._schema = formatSchema;
        this._injectableValues = injectableValues;
        this._unwrapRoot = deserializationConfig.useRootWrapping();
        this._dataFormatReaders = dataFormatReaders;
        this._filter = objectReader._filter;
    }

    protected ObjectReader(ObjectReader objectReader, DeserializationConfig deserializationConfig) {
        this._config = deserializationConfig;
        this._context = objectReader._context;
        this._rootDeserializers = objectReader._rootDeserializers;
        this._parserFactory = objectReader._parserFactory;
        this._valueType = objectReader._valueType;
        this._rootDeserializer = objectReader._rootDeserializer;
        this._valueToUpdate = objectReader._valueToUpdate;
        this._schema = objectReader._schema;
        this._injectableValues = objectReader._injectableValues;
        this._unwrapRoot = deserializationConfig.useRootWrapping();
        this._dataFormatReaders = objectReader._dataFormatReaders;
        this._filter = objectReader._filter;
    }
}
