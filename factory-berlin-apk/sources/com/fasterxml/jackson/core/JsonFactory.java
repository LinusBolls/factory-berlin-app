package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.io.CharacterEscapes;
import com.fasterxml.jackson.core.io.DataOutputAsStream;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.io.InputDecorator;
import com.fasterxml.jackson.core.io.OutputDecorator;
import com.fasterxml.jackson.core.io.UTF8Writer;
import com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper;
import com.fasterxml.jackson.core.json.PackageVersion;
import com.fasterxml.jackson.core.json.ReaderBasedJsonParser;
import com.fasterxml.jackson.core.json.UTF8DataInputJsonParser;
import com.fasterxml.jackson.core.json.UTF8JsonGenerator;
import com.fasterxml.jackson.core.json.WriterBasedJsonGenerator;
import com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer;
import com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer;
import com.fasterxml.jackson.core.util.BufferRecycler;
import com.fasterxml.jackson.core.util.BufferRecyclers;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Serializable;
import java.io.StringReader;
import java.io.Writer;
import java.net.URL;

public class JsonFactory implements Serializable {
    protected static final int DEFAULT_FACTORY_FEATURE_FLAGS = Feature.collectDefaults();
    protected static final int DEFAULT_GENERATOR_FEATURE_FLAGS = JsonGenerator.Feature.collectDefaults();
    protected static final int DEFAULT_PARSER_FEATURE_FLAGS = JsonParser.Feature.collectDefaults();
    private static final SerializableString DEFAULT_ROOT_VALUE_SEPARATOR = DefaultPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
    protected final transient ByteQuadsCanonicalizer _byteSymbolCanonicalizer;
    protected CharacterEscapes _characterEscapes;
    protected int _factoryFeatures;
    protected int _generatorFeatures;
    protected InputDecorator _inputDecorator;
    protected ObjectCodec _objectCodec;
    protected OutputDecorator _outputDecorator;
    protected int _parserFeatures;
    protected final transient CharsToNameCanonicalizer _rootCharSymbols;
    protected SerializableString _rootValueSeparator;

    public enum Feature {
        INTERN_FIELD_NAMES(true),
        CANONICALIZE_FIELD_NAMES(true),
        FAIL_ON_SYMBOL_HASH_OVERFLOW(true),
        USE_THREAD_LOCAL_FOR_BUFFER_RECYCLING(true);
        
        private final boolean _defaultState;

        private Feature(boolean z) {
            this._defaultState = z;
        }

        public static int collectDefaults() {
            int i2 = 0;
            for (Feature feature : values()) {
                if (feature.enabledByDefault()) {
                    i2 |= feature.getMask();
                }
            }
            return i2;
        }

        public boolean enabledByDefault() {
            return this._defaultState;
        }

        public boolean enabledIn(int i2) {
            return (i2 & getMask()) != 0;
        }

        public int getMask() {
            return 1 << ordinal();
        }
    }

    public JsonFactory() {
        this((ObjectCodec) null);
    }

    private final boolean _isJSONFactory() {
        return getFormatName() == "JSON";
    }

    private final void _requireJSONFactory(String str) {
        if (!_isJSONFactory()) {
            throw new UnsupportedOperationException(String.format(str, new Object[]{getFormatName()}));
        }
    }

    /* access modifiers changed from: protected */
    public void _checkInvalidCopy(Class<?> cls) {
        if (getClass() != cls) {
            throw new IllegalStateException("Failed copy(): " + getClass().getName() + " (version: " + version() + ") does not override copy(); it has to");
        }
    }

    /* access modifiers changed from: protected */
    public IOContext _createContext(Object obj, boolean z) {
        return new IOContext(_getBufferRecycler(), obj, z);
    }

    /* access modifiers changed from: protected */
    public OutputStream _createDataOutputWrapper(DataOutput dataOutput) {
        return new DataOutputAsStream(dataOutput);
    }

    /* access modifiers changed from: protected */
    public JsonGenerator _createGenerator(Writer writer, IOContext iOContext) {
        WriterBasedJsonGenerator writerBasedJsonGenerator = new WriterBasedJsonGenerator(iOContext, this._generatorFeatures, this._objectCodec, writer);
        CharacterEscapes characterEscapes = this._characterEscapes;
        if (characterEscapes != null) {
            writerBasedJsonGenerator.setCharacterEscapes(characterEscapes);
        }
        SerializableString serializableString = this._rootValueSeparator;
        if (serializableString != DEFAULT_ROOT_VALUE_SEPARATOR) {
            writerBasedJsonGenerator.setRootValueSeparator(serializableString);
        }
        return writerBasedJsonGenerator;
    }

    /* access modifiers changed from: protected */
    public JsonParser _createParser(InputStream inputStream, IOContext iOContext) {
        return new ByteSourceJsonBootstrapper(iOContext, inputStream).constructParser(this._parserFeatures, this._objectCodec, this._byteSymbolCanonicalizer, this._rootCharSymbols, this._factoryFeatures);
    }

    /* access modifiers changed from: protected */
    public JsonGenerator _createUTF8Generator(OutputStream outputStream, IOContext iOContext) {
        UTF8JsonGenerator uTF8JsonGenerator = new UTF8JsonGenerator(iOContext, this._generatorFeatures, this._objectCodec, outputStream);
        CharacterEscapes characterEscapes = this._characterEscapes;
        if (characterEscapes != null) {
            uTF8JsonGenerator.setCharacterEscapes(characterEscapes);
        }
        SerializableString serializableString = this._rootValueSeparator;
        if (serializableString != DEFAULT_ROOT_VALUE_SEPARATOR) {
            uTF8JsonGenerator.setRootValueSeparator(serializableString);
        }
        return uTF8JsonGenerator;
    }

    /* access modifiers changed from: protected */
    public Writer _createWriter(OutputStream outputStream, JsonEncoding jsonEncoding, IOContext iOContext) {
        if (jsonEncoding == JsonEncoding.UTF8) {
            return new UTF8Writer(iOContext, outputStream);
        }
        return new OutputStreamWriter(outputStream, jsonEncoding.getJavaName());
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r3 = r0.decorate(r3, r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.io.InputStream _decorate(java.io.InputStream r2, com.fasterxml.jackson.core.io.IOContext r3) {
        /*
            r1 = this;
            com.fasterxml.jackson.core.io.InputDecorator r0 = r1._inputDecorator
            if (r0 == 0) goto L_0x000b
            java.io.InputStream r3 = r0.decorate((com.fasterxml.jackson.core.io.IOContext) r3, (java.io.InputStream) r2)
            if (r3 == 0) goto L_0x000b
            return r3
        L_0x000b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.JsonFactory._decorate(java.io.InputStream, com.fasterxml.jackson.core.io.IOContext):java.io.InputStream");
    }

    public BufferRecycler _getBufferRecycler() {
        if (Feature.USE_THREAD_LOCAL_FOR_BUFFER_RECYCLING.enabledIn(this._factoryFeatures)) {
            return BufferRecyclers.getBufferRecycler();
        }
        return new BufferRecycler();
    }

    /* access modifiers changed from: protected */
    public InputStream _optimizedStreamFromURL(URL url) {
        String host;
        if (!"file".equals(url.getProtocol()) || (((host = url.getHost()) != null && host.length() != 0) || url.getPath().indexOf(37) >= 0)) {
            return url.openStream();
        }
        return new FileInputStream(url.getPath());
    }

    public boolean canUseCharArrays() {
        return true;
    }

    public boolean canUseSchema(FormatSchema formatSchema) {
        String formatName;
        if (formatSchema == null || (formatName = getFormatName()) == null || !formatName.equals(formatSchema.getSchemaType())) {
            return false;
        }
        return true;
    }

    public final JsonFactory configure(JsonParser.Feature feature, boolean z) {
        if (z) {
            enable(feature);
        } else {
            disable(feature);
        }
        return this;
    }

    public JsonFactory copy() {
        _checkInvalidCopy(JsonFactory.class);
        return new JsonFactory(this, (ObjectCodec) null);
    }

    public JsonGenerator createGenerator(OutputStream outputStream, JsonEncoding jsonEncoding) {
        IOContext _createContext = _createContext(outputStream, false);
        _createContext.setEncoding(jsonEncoding);
        if (jsonEncoding == JsonEncoding.UTF8) {
            return _createUTF8Generator(_decorate(outputStream, _createContext), _createContext);
        }
        return _createGenerator(_decorate(_createWriter(outputStream, jsonEncoding, _createContext), _createContext), _createContext);
    }

    public JsonParser createParser(File file) {
        IOContext _createContext = _createContext(file, true);
        return _createParser(_decorate((InputStream) new FileInputStream(file), _createContext), _createContext);
    }

    public JsonFactory disable(JsonParser.Feature feature) {
        this._parserFeatures = (~feature.getMask()) & this._parserFeatures;
        return this;
    }

    public JsonFactory enable(JsonParser.Feature feature) {
        this._parserFeatures = feature.getMask() | this._parserFeatures;
        return this;
    }

    public ObjectCodec getCodec() {
        return this._objectCodec;
    }

    public String getFormatName() {
        if (getClass() == JsonFactory.class) {
            return "JSON";
        }
        return null;
    }

    public final boolean isEnabled(Feature feature) {
        return (feature.getMask() & this._factoryFeatures) != 0;
    }

    public boolean requiresPropertyOrdering() {
        return false;
    }

    public JsonFactory setCodec(ObjectCodec objectCodec) {
        this._objectCodec = objectCodec;
        return this;
    }

    public Version version() {
        return PackageVersion.VERSION;
    }

    public JsonFactory(ObjectCodec objectCodec) {
        this._rootCharSymbols = CharsToNameCanonicalizer.createRoot();
        this._byteSymbolCanonicalizer = ByteQuadsCanonicalizer.createRoot();
        this._factoryFeatures = DEFAULT_FACTORY_FEATURE_FLAGS;
        this._parserFeatures = DEFAULT_PARSER_FEATURE_FLAGS;
        this._generatorFeatures = DEFAULT_GENERATOR_FEATURE_FLAGS;
        this._rootValueSeparator = DEFAULT_ROOT_VALUE_SEPARATOR;
        this._objectCodec = objectCodec;
    }

    /* access modifiers changed from: protected */
    public JsonParser _createParser(Reader reader, IOContext iOContext) {
        return new ReaderBasedJsonParser(iOContext, this._parserFeatures, reader, this._objectCodec, this._rootCharSymbols.makeChild(this._factoryFeatures));
    }

    public final JsonFactory configure(JsonGenerator.Feature feature, boolean z) {
        if (z) {
            enable(feature);
        } else {
            disable(feature);
        }
        return this;
    }

    public JsonFactory disable(JsonGenerator.Feature feature) {
        this._generatorFeatures = (~feature.getMask()) & this._generatorFeatures;
        return this;
    }

    public JsonFactory enable(JsonGenerator.Feature feature) {
        this._generatorFeatures = feature.getMask() | this._generatorFeatures;
        return this;
    }

    public final boolean isEnabled(JsonParser.Feature feature) {
        return (feature.getMask() & this._parserFeatures) != 0;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r3 = r0.decorate(r3, r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.io.Reader _decorate(java.io.Reader r2, com.fasterxml.jackson.core.io.IOContext r3) {
        /*
            r1 = this;
            com.fasterxml.jackson.core.io.InputDecorator r0 = r1._inputDecorator
            if (r0 == 0) goto L_0x000b
            java.io.Reader r3 = r0.decorate((com.fasterxml.jackson.core.io.IOContext) r3, (java.io.Reader) r2)
            if (r3 == 0) goto L_0x000b
            return r3
        L_0x000b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.JsonFactory._decorate(java.io.Reader, com.fasterxml.jackson.core.io.IOContext):java.io.Reader");
    }

    public final boolean isEnabled(JsonGenerator.Feature feature) {
        return (feature.getMask() & this._generatorFeatures) != 0;
    }

    /* access modifiers changed from: protected */
    public JsonParser _createParser(char[] cArr, int i2, int i3, IOContext iOContext, boolean z) {
        return new ReaderBasedJsonParser(iOContext, this._parserFeatures, (Reader) null, this._objectCodec, this._rootCharSymbols.makeChild(this._factoryFeatures), cArr, i2, i2 + i3, z);
    }

    public JsonParser createParser(URL url) {
        IOContext _createContext = _createContext(url, true);
        return _createParser(_decorate(_optimizedStreamFromURL(url), _createContext), _createContext);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r3 = r0.decorate(r3, r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.io.DataInput _decorate(java.io.DataInput r2, com.fasterxml.jackson.core.io.IOContext r3) {
        /*
            r1 = this;
            com.fasterxml.jackson.core.io.InputDecorator r0 = r1._inputDecorator
            if (r0 == 0) goto L_0x000b
            java.io.DataInput r3 = r0.decorate((com.fasterxml.jackson.core.io.IOContext) r3, (java.io.DataInput) r2)
            if (r3 == 0) goto L_0x000b
            return r3
        L_0x000b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.JsonFactory._decorate(java.io.DataInput, com.fasterxml.jackson.core.io.IOContext):java.io.DataInput");
    }

    /* access modifiers changed from: protected */
    public JsonParser _createParser(byte[] bArr, int i2, int i3, IOContext iOContext) {
        return new ByteSourceJsonBootstrapper(iOContext, bArr, i2, i3).constructParser(this._parserFeatures, this._objectCodec, this._byteSymbolCanonicalizer, this._rootCharSymbols, this._factoryFeatures);
    }

    /* access modifiers changed from: protected */
    public JsonParser _createParser(DataInput dataInput, IOContext iOContext) {
        _requireJSONFactory("InputData source not (yet?) support for this format (%s)");
        int skipUTF8BOM = ByteSourceJsonBootstrapper.skipUTF8BOM(dataInput);
        return new UTF8DataInputJsonParser(iOContext, this._parserFeatures, dataInput, this._objectCodec, this._byteSymbolCanonicalizer.makeChild(this._factoryFeatures), skipUTF8BOM);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r3 = r0.decorate(r3, r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.io.OutputStream _decorate(java.io.OutputStream r2, com.fasterxml.jackson.core.io.IOContext r3) {
        /*
            r1 = this;
            com.fasterxml.jackson.core.io.OutputDecorator r0 = r1._outputDecorator
            if (r0 == 0) goto L_0x000b
            java.io.OutputStream r3 = r0.decorate((com.fasterxml.jackson.core.io.IOContext) r3, (java.io.OutputStream) r2)
            if (r3 == 0) goto L_0x000b
            return r3
        L_0x000b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.JsonFactory._decorate(java.io.OutputStream, com.fasterxml.jackson.core.io.IOContext):java.io.OutputStream");
    }

    public JsonGenerator createGenerator(Writer writer) {
        IOContext _createContext = _createContext(writer, false);
        return _createGenerator(_decorate(writer, _createContext), _createContext);
    }

    public JsonParser createParser(InputStream inputStream) {
        IOContext _createContext = _createContext(inputStream, false);
        return _createParser(_decorate(inputStream, _createContext), _createContext);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r3 = r0.decorate(r3, r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.io.Writer _decorate(java.io.Writer r2, com.fasterxml.jackson.core.io.IOContext r3) {
        /*
            r1 = this;
            com.fasterxml.jackson.core.io.OutputDecorator r0 = r1._outputDecorator
            if (r0 == 0) goto L_0x000b
            java.io.Writer r3 = r0.decorate((com.fasterxml.jackson.core.io.IOContext) r3, (java.io.Writer) r2)
            if (r3 == 0) goto L_0x000b
            return r3
        L_0x000b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.JsonFactory._decorate(java.io.Writer, com.fasterxml.jackson.core.io.IOContext):java.io.Writer");
    }

    public JsonGenerator createGenerator(File file, JsonEncoding jsonEncoding) {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        IOContext _createContext = _createContext(fileOutputStream, true);
        _createContext.setEncoding(jsonEncoding);
        if (jsonEncoding == JsonEncoding.UTF8) {
            return _createUTF8Generator(_decorate((OutputStream) fileOutputStream, _createContext), _createContext);
        }
        return _createGenerator(_decorate(_createWriter(fileOutputStream, jsonEncoding, _createContext), _createContext), _createContext);
    }

    public JsonParser createParser(Reader reader) {
        IOContext _createContext = _createContext(reader, false);
        return _createParser(_decorate(reader, _createContext), _createContext);
    }

    protected JsonFactory(JsonFactory jsonFactory, ObjectCodec objectCodec) {
        this._rootCharSymbols = CharsToNameCanonicalizer.createRoot();
        this._byteSymbolCanonicalizer = ByteQuadsCanonicalizer.createRoot();
        this._factoryFeatures = DEFAULT_FACTORY_FEATURE_FLAGS;
        this._parserFeatures = DEFAULT_PARSER_FEATURE_FLAGS;
        this._generatorFeatures = DEFAULT_GENERATOR_FEATURE_FLAGS;
        this._rootValueSeparator = DEFAULT_ROOT_VALUE_SEPARATOR;
        this._objectCodec = objectCodec;
        this._factoryFeatures = jsonFactory._factoryFeatures;
        this._parserFeatures = jsonFactory._parserFeatures;
        this._generatorFeatures = jsonFactory._generatorFeatures;
        this._characterEscapes = jsonFactory._characterEscapes;
        this._inputDecorator = jsonFactory._inputDecorator;
        this._outputDecorator = jsonFactory._outputDecorator;
        this._rootValueSeparator = jsonFactory._rootValueSeparator;
    }

    public JsonParser createParser(byte[] bArr) {
        InputStream decorate;
        IOContext _createContext = _createContext(bArr, true);
        InputDecorator inputDecorator = this._inputDecorator;
        if (inputDecorator == null || (decorate = inputDecorator.decorate(_createContext, bArr, 0, bArr.length)) == null) {
            return _createParser(bArr, 0, bArr.length, _createContext);
        }
        return _createParser(decorate, _createContext);
    }

    public JsonGenerator createGenerator(DataOutput dataOutput, JsonEncoding jsonEncoding) {
        return createGenerator(_createDataOutputWrapper(dataOutput), jsonEncoding);
    }

    public JsonParser createParser(byte[] bArr, int i2, int i3) {
        InputStream decorate;
        IOContext _createContext = _createContext(bArr, true);
        InputDecorator inputDecorator = this._inputDecorator;
        if (inputDecorator == null || (decorate = inputDecorator.decorate(_createContext, bArr, i2, i3)) == null) {
            return _createParser(bArr, i2, i3, _createContext);
        }
        return _createParser(decorate, _createContext);
    }

    public JsonParser createParser(String str) {
        int length = str.length();
        if (this._inputDecorator != null || length > 32768 || !canUseCharArrays()) {
            return createParser((Reader) new StringReader(str));
        }
        IOContext _createContext = _createContext(str, true);
        char[] allocTokenBuffer = _createContext.allocTokenBuffer(length);
        str.getChars(0, length, allocTokenBuffer, 0);
        return _createParser(allocTokenBuffer, 0, length, _createContext, true);
    }

    public JsonParser createParser(DataInput dataInput) {
        IOContext _createContext = _createContext(dataInput, false);
        return _createParser(_decorate(dataInput, _createContext), _createContext);
    }
}
