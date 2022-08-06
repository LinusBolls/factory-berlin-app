package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.Base64Variants;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import java.util.Arrays;
import java.util.UUID;

public class UUIDDeserializer extends FromStringDeserializer<UUID> {
    static final int[] HEX_DIGITS;

    static {
        int[] iArr = new int[127];
        HEX_DIGITS = iArr;
        Arrays.fill(iArr, -1);
        for (int i2 = 0; i2 < 10; i2++) {
            HEX_DIGITS[i2 + 48] = i2;
        }
        for (int i3 = 0; i3 < 6; i3++) {
            int[] iArr2 = HEX_DIGITS;
            int i4 = i3 + 10;
            iArr2[i3 + 97] = i4;
            iArr2[i3 + 65] = i4;
        }
    }

    public UUIDDeserializer() {
        super(UUID.class);
    }

    private UUID _badFormat(String str, DeserializationContext deserializationContext) {
        return (UUID) deserializationContext.handleWeirdStringValue(handledType(), str, "UUID has to be represented by standard 36-char representation", new Object[0]);
    }

    private UUID _fromBytes(byte[] bArr, DeserializationContext deserializationContext) {
        if (bArr.length == 16) {
            return new UUID(_long(bArr, 0), _long(bArr, 8));
        }
        JsonParser parser = deserializationContext.getParser();
        throw InvalidFormatException.from(parser, "Can only construct UUIDs from byte[16]; got " + bArr.length + " bytes", bArr, handledType());
    }

    private static int _int(byte[] bArr, int i2) {
        return (bArr[i2 + 3] & 255) | (bArr[i2] << 24) | ((bArr[i2 + 1] & 255) << 16) | ((bArr[i2 + 2] & 255) << 8);
    }

    private static long _long(byte[] bArr, int i2) {
        return ((((long) _int(bArr, i2 + 4)) << 32) >>> 32) | (((long) _int(bArr, i2)) << 32);
    }

    /* access modifiers changed from: package-private */
    public int _badChar(String str, int i2, DeserializationContext deserializationContext, char c) {
        throw deserializationContext.weirdStringException(str, handledType(), String.format("Non-hex character '%c' (value 0x%s), not valid for UUID String", new Object[]{Character.valueOf(c), Integer.toHexString(c)}));
    }

    /* access modifiers changed from: package-private */
    public int byteFromChars(String str, int i2, DeserializationContext deserializationContext) {
        char charAt = str.charAt(i2);
        int i3 = i2 + 1;
        char charAt2 = str.charAt(i3);
        if (charAt <= 127 && charAt2 <= 127) {
            int[] iArr = HEX_DIGITS;
            int i4 = iArr[charAt2] | (iArr[charAt] << 4);
            if (i4 >= 0) {
                return i4;
            }
        }
        if (charAt > 127 || HEX_DIGITS[charAt] < 0) {
            _badChar(str, i2, deserializationContext, charAt);
            throw null;
        }
        _badChar(str, i3, deserializationContext, charAt2);
        throw null;
    }

    /* access modifiers changed from: package-private */
    public int intFromChars(String str, int i2, DeserializationContext deserializationContext) {
        return (byteFromChars(str, i2, deserializationContext) << 24) + (byteFromChars(str, i2 + 2, deserializationContext) << 16) + (byteFromChars(str, i2 + 4, deserializationContext) << 8) + byteFromChars(str, i2 + 6, deserializationContext);
    }

    /* access modifiers changed from: package-private */
    public int shortFromChars(String str, int i2, DeserializationContext deserializationContext) {
        return (byteFromChars(str, i2, deserializationContext) << 8) + byteFromChars(str, i2 + 2, deserializationContext);
    }

    /* access modifiers changed from: protected */
    public UUID _deserialize(String str, DeserializationContext deserializationContext) {
        if (str.length() == 36) {
            if (!(str.charAt(8) == '-' && str.charAt(13) == '-' && str.charAt(18) == '-' && str.charAt(23) == '-')) {
                _badFormat(str, deserializationContext);
            }
            int shortFromChars = shortFromChars(str, 24, deserializationContext);
            return new UUID((((long) intFromChars(str, 0, deserializationContext)) << 32) + ((((long) shortFromChars(str, 9, deserializationContext)) << 16) | ((long) shortFromChars(str, 14, deserializationContext))), ((((long) intFromChars(str, 28, deserializationContext)) << 32) >>> 32) | (((long) (shortFromChars | (shortFromChars(str, 19, deserializationContext) << 16))) << 32));
        } else if (str.length() == 24) {
            return _fromBytes(Base64Variants.getDefaultVariant().decode(str), deserializationContext);
        } else {
            return _badFormat(str, deserializationContext);
        }
    }

    /* access modifiers changed from: protected */
    public UUID _deserializeEmbedded(Object obj, DeserializationContext deserializationContext) {
        if (obj instanceof byte[]) {
            return _fromBytes((byte[]) obj, deserializationContext);
        }
        super._deserializeEmbedded(obj, deserializationContext);
        throw null;
    }
}
