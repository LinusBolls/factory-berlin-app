package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.io.CharacterEscapes;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.core.util.VersionUtil;
import java.io.Closeable;
import java.io.Flushable;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public abstract class JsonGenerator implements Closeable, Flushable {
    protected PrettyPrinter _cfgPrettyPrinter;

    /* renamed from: com.fasterxml.jackson.core.JsonGenerator$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$fasterxml$jackson$core$type$WritableTypeId$Inclusion;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.fasterxml.jackson.core.type.WritableTypeId$Inclusion[] r0 = com.fasterxml.jackson.core.type.WritableTypeId.Inclusion.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$fasterxml$jackson$core$type$WritableTypeId$Inclusion = r0
                com.fasterxml.jackson.core.type.WritableTypeId$Inclusion r1 = com.fasterxml.jackson.core.type.WritableTypeId.Inclusion.PARENT_PROPERTY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$fasterxml$jackson$core$type$WritableTypeId$Inclusion     // Catch:{ NoSuchFieldError -> 0x001d }
                com.fasterxml.jackson.core.type.WritableTypeId$Inclusion r1 = com.fasterxml.jackson.core.type.WritableTypeId.Inclusion.PAYLOAD_PROPERTY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$fasterxml$jackson$core$type$WritableTypeId$Inclusion     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.fasterxml.jackson.core.type.WritableTypeId$Inclusion r1 = com.fasterxml.jackson.core.type.WritableTypeId.Inclusion.METADATA_PROPERTY     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$com$fasterxml$jackson$core$type$WritableTypeId$Inclusion     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.fasterxml.jackson.core.type.WritableTypeId$Inclusion r1 = com.fasterxml.jackson.core.type.WritableTypeId.Inclusion.WRAPPER_OBJECT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$com$fasterxml$jackson$core$type$WritableTypeId$Inclusion     // Catch:{ NoSuchFieldError -> 0x003e }
                com.fasterxml.jackson.core.type.WritableTypeId$Inclusion r1 = com.fasterxml.jackson.core.type.WritableTypeId.Inclusion.WRAPPER_ARRAY     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.JsonGenerator.AnonymousClass1.<clinit>():void");
        }
    }

    public enum Feature {
        AUTO_CLOSE_TARGET(true),
        AUTO_CLOSE_JSON_CONTENT(true),
        FLUSH_PASSED_TO_STREAM(true),
        QUOTE_FIELD_NAMES(true),
        QUOTE_NON_NUMERIC_NUMBERS(true),
        WRITE_NUMBERS_AS_STRINGS(false),
        WRITE_BIGDECIMAL_AS_PLAIN(false),
        ESCAPE_NON_ASCII(false),
        STRICT_DUPLICATE_DETECTION(false),
        IGNORE_UNKNOWN(false);
        
        private final boolean _defaultState;
        private final int _mask;

        private Feature(boolean z) {
            this._defaultState = z;
            this._mask = 1 << ordinal();
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
            return (i2 & this._mask) != 0;
        }

        public int getMask() {
            return this._mask;
        }
    }

    protected JsonGenerator() {
    }

    /* access modifiers changed from: protected */
    public void _reportError(String str) {
        throw new JsonGenerationException(str, this);
    }

    /* access modifiers changed from: protected */
    public final void _throwInternal() {
        VersionUtil.throwInternal();
        throw null;
    }

    /* access modifiers changed from: protected */
    public final void _verifyOffsets(int i2, int i3, int i4) {
        if (i3 < 0 || i3 + i4 > i2) {
            throw new IllegalArgumentException(String.format("invalid argument(s) (offset=%d, length=%d) for input array of %d element", new Object[]{Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i2)}));
        }
    }

    /* access modifiers changed from: protected */
    public void _writeSimpleObject(Object obj) {
        if (obj == null) {
            writeNull();
        } else if (obj instanceof String) {
            writeString((String) obj);
        } else {
            if (obj instanceof Number) {
                Number number = (Number) obj;
                if (number instanceof Integer) {
                    writeNumber(number.intValue());
                    return;
                } else if (number instanceof Long) {
                    writeNumber(number.longValue());
                    return;
                } else if (number instanceof Double) {
                    writeNumber(number.doubleValue());
                    return;
                } else if (number instanceof Float) {
                    writeNumber(number.floatValue());
                    return;
                } else if (number instanceof Short) {
                    writeNumber(number.shortValue());
                    return;
                } else if (number instanceof Byte) {
                    writeNumber((short) number.byteValue());
                    return;
                } else if (number instanceof BigInteger) {
                    writeNumber((BigInteger) number);
                    return;
                } else if (number instanceof BigDecimal) {
                    writeNumber((BigDecimal) number);
                    return;
                } else if (number instanceof AtomicInteger) {
                    writeNumber(((AtomicInteger) number).get());
                    return;
                } else if (number instanceof AtomicLong) {
                    writeNumber(((AtomicLong) number).get());
                    return;
                }
            } else if (obj instanceof byte[]) {
                writeBinary((byte[]) obj);
                return;
            } else if (obj instanceof Boolean) {
                writeBoolean(((Boolean) obj).booleanValue());
                return;
            } else if (obj instanceof AtomicBoolean) {
                writeBoolean(((AtomicBoolean) obj).get());
                return;
            }
            throw new IllegalStateException("No ObjectCodec defined for the generator, can only serialize simple wrapper types (type passed " + obj.getClass().getName() + ")");
        }
    }

    public boolean canOmitFields() {
        return true;
    }

    public boolean canWriteBinaryNatively() {
        return false;
    }

    public boolean canWriteObjectId() {
        return false;
    }

    public boolean canWriteTypeId() {
        return false;
    }

    public abstract void close();

    public abstract JsonGenerator disable(Feature feature);

    public abstract void flush();

    public abstract int getFeatureMask();

    public abstract JsonStreamContext getOutputContext();

    public PrettyPrinter getPrettyPrinter() {
        return this._cfgPrettyPrinter;
    }

    public JsonGenerator overrideFormatFeatures(int i2, int i3) {
        throw new IllegalArgumentException("No FormatFeatures defined for generator of type " + getClass().getName());
    }

    public JsonGenerator overrideStdFeatures(int i2, int i3) {
        return setFeatureMask((i2 & i3) | (getFeatureMask() & (~i3)));
    }

    public JsonGenerator setCharacterEscapes(CharacterEscapes characterEscapes) {
        return this;
    }

    public void setCurrentValue(Object obj) {
        JsonStreamContext outputContext = getOutputContext();
        if (outputContext != null) {
            outputContext.setCurrentValue(obj);
        }
    }

    @Deprecated
    public abstract JsonGenerator setFeatureMask(int i2);

    public JsonGenerator setHighestNonEscapedChar(int i2) {
        return this;
    }

    public JsonGenerator setPrettyPrinter(PrettyPrinter prettyPrinter) {
        this._cfgPrettyPrinter = prettyPrinter;
        return this;
    }

    public JsonGenerator setRootValueSeparator(SerializableString serializableString) {
        throw new UnsupportedOperationException();
    }

    public void setSchema(FormatSchema formatSchema) {
        throw new UnsupportedOperationException("Generator of type " + getClass().getName() + " does not support schema of type '" + formatSchema.getSchemaType() + "'");
    }

    public void writeArray(int[] iArr, int i2, int i3) {
        if (iArr != null) {
            _verifyOffsets(iArr.length, i2, i3);
            writeStartArray();
            int i4 = i3 + i2;
            while (i2 < i4) {
                writeNumber(iArr[i2]);
                i2++;
            }
            writeEndArray();
            return;
        }
        throw new IllegalArgumentException("null array");
    }

    public abstract int writeBinary(Base64Variant base64Variant, InputStream inputStream, int i2);

    public abstract void writeBinary(Base64Variant base64Variant, byte[] bArr, int i2, int i3);

    public void writeBinary(byte[] bArr, int i2, int i3) {
        writeBinary(Base64Variants.getDefaultVariant(), bArr, i2, i3);
    }

    public abstract void writeBoolean(boolean z);

    public void writeEmbeddedObject(Object obj) {
        if (obj == null) {
            writeNull();
        } else if (obj instanceof byte[]) {
            writeBinary((byte[]) obj);
        } else {
            throw new JsonGenerationException("No native support for writing embedded objects of type " + obj.getClass().getName(), this);
        }
    }

    public abstract void writeEndArray();

    public abstract void writeEndObject();

    public void writeFieldId(long j2) {
        writeFieldName(Long.toString(j2));
    }

    public abstract void writeFieldName(SerializableString serializableString);

    public abstract void writeFieldName(String str);

    public abstract void writeNull();

    public abstract void writeNumber(double d2);

    public abstract void writeNumber(float f2);

    public abstract void writeNumber(int i2);

    public abstract void writeNumber(long j2);

    public abstract void writeNumber(String str);

    public abstract void writeNumber(BigDecimal bigDecimal);

    public abstract void writeNumber(BigInteger bigInteger);

    public void writeNumber(short s) {
        writeNumber((int) s);
    }

    public abstract void writeObject(Object obj);

    public void writeObjectId(Object obj) {
        throw new JsonGenerationException("No native support for writing Object Ids", this);
    }

    public void writeObjectRef(Object obj) {
        throw new JsonGenerationException("No native support for writing Object Ids", this);
    }

    public void writeOmittedField(String str) {
    }

    public abstract void writeRaw(char c);

    public void writeRaw(SerializableString serializableString) {
        writeRaw(serializableString.getValue());
    }

    public abstract void writeRaw(String str);

    public abstract void writeRaw(char[] cArr, int i2, int i3);

    public void writeRawValue(SerializableString serializableString) {
        writeRawValue(serializableString.getValue());
    }

    public abstract void writeRawValue(String str);

    public abstract void writeStartArray();

    public void writeStartArray(int i2) {
        writeStartArray();
    }

    public abstract void writeStartObject();

    public void writeStartObject(Object obj) {
        writeStartObject();
        setCurrentValue(obj);
    }

    public abstract void writeString(SerializableString serializableString);

    public abstract void writeString(String str);

    public abstract void writeString(char[] cArr, int i2, int i3);

    public void writeStringField(String str, String str2) {
        writeFieldName(str);
        writeString(str2);
    }

    public void writeTypeId(Object obj) {
        throw new JsonGenerationException("No native support for writing Type Ids", this);
    }

    public WritableTypeId writeTypePrefix(WritableTypeId writableTypeId) {
        Object obj = writableTypeId.id;
        JsonToken jsonToken = writableTypeId.valueShape;
        if (canWriteTypeId()) {
            writableTypeId.wrapperWritten = false;
            writeTypeId(obj);
        } else {
            String valueOf = obj instanceof String ? (String) obj : String.valueOf(obj);
            writableTypeId.wrapperWritten = true;
            WritableTypeId.Inclusion inclusion = writableTypeId.include;
            if (jsonToken != JsonToken.START_OBJECT && inclusion.requiresObjectContext()) {
                inclusion = WritableTypeId.Inclusion.WRAPPER_ARRAY;
                writableTypeId.include = inclusion;
            }
            int i2 = AnonymousClass1.$SwitchMap$com$fasterxml$jackson$core$type$WritableTypeId$Inclusion[inclusion.ordinal()];
            if (!(i2 == 1 || i2 == 2)) {
                if (i2 == 3) {
                    writeStartObject(writableTypeId.forValue);
                    writeStringField(writableTypeId.asProperty, valueOf);
                    return writableTypeId;
                } else if (i2 != 4) {
                    writeStartArray();
                    writeString(valueOf);
                } else {
                    writeStartObject();
                    writeFieldName(valueOf);
                }
            }
        }
        if (jsonToken == JsonToken.START_OBJECT) {
            writeStartObject(writableTypeId.forValue);
        } else if (jsonToken == JsonToken.START_ARRAY) {
            writeStartArray();
        }
        return writableTypeId;
    }

    public WritableTypeId writeTypeSuffix(WritableTypeId writableTypeId) {
        JsonToken jsonToken = writableTypeId.valueShape;
        if (jsonToken == JsonToken.START_OBJECT) {
            writeEndObject();
        } else if (jsonToken == JsonToken.START_ARRAY) {
            writeEndArray();
        }
        if (writableTypeId.wrapperWritten) {
            int i2 = AnonymousClass1.$SwitchMap$com$fasterxml$jackson$core$type$WritableTypeId$Inclusion[writableTypeId.include.ordinal()];
            if (i2 == 1) {
                Object obj = writableTypeId.id;
                writeStringField(writableTypeId.asProperty, obj instanceof String ? (String) obj : String.valueOf(obj));
            } else if (!(i2 == 2 || i2 == 3)) {
                if (i2 != 5) {
                    writeEndObject();
                } else {
                    writeEndArray();
                }
            }
        }
        return writableTypeId;
    }

    public void writeBinary(byte[] bArr) {
        writeBinary(Base64Variants.getDefaultVariant(), bArr, 0, bArr.length);
    }

    public int writeBinary(InputStream inputStream, int i2) {
        return writeBinary(Base64Variants.getDefaultVariant(), inputStream, i2);
    }

    public void writeArray(long[] jArr, int i2, int i3) {
        if (jArr != null) {
            _verifyOffsets(jArr.length, i2, i3);
            writeStartArray();
            int i4 = i3 + i2;
            while (i2 < i4) {
                writeNumber(jArr[i2]);
                i2++;
            }
            writeEndArray();
            return;
        }
        throw new IllegalArgumentException("null array");
    }

    public void writeArray(double[] dArr, int i2, int i3) {
        if (dArr != null) {
            _verifyOffsets(dArr.length, i2, i3);
            writeStartArray();
            int i4 = i3 + i2;
            while (i2 < i4) {
                writeNumber(dArr[i2]);
                i2++;
            }
            writeEndArray();
            return;
        }
        throw new IllegalArgumentException("null array");
    }
}
