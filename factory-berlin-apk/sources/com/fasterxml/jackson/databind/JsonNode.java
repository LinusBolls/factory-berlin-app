package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.TreeNode;
import com.fasterxml.jackson.databind.JsonSerializable;
import com.fasterxml.jackson.databind.node.JsonNodeType;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Iterator;
import java.util.Map;

public abstract class JsonNode extends JsonSerializable.Base implements TreeNode, Iterable<JsonNode> {

    /* renamed from: com.fasterxml.jackson.databind.JsonNode$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$fasterxml$jackson$databind$node$JsonNodeType;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.fasterxml.jackson.databind.node.JsonNodeType[] r0 = com.fasterxml.jackson.databind.node.JsonNodeType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$fasterxml$jackson$databind$node$JsonNodeType = r0
                com.fasterxml.jackson.databind.node.JsonNodeType r1 = com.fasterxml.jackson.databind.node.JsonNodeType.ARRAY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$fasterxml$jackson$databind$node$JsonNodeType     // Catch:{ NoSuchFieldError -> 0x001d }
                com.fasterxml.jackson.databind.node.JsonNodeType r1 = com.fasterxml.jackson.databind.node.JsonNodeType.OBJECT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$fasterxml$jackson$databind$node$JsonNodeType     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.fasterxml.jackson.databind.node.JsonNodeType r1 = com.fasterxml.jackson.databind.node.JsonNodeType.MISSING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.JsonNode.AnonymousClass1.<clinit>():void");
        }
    }

    protected JsonNode() {
    }

    public abstract String asText();

    public String asText(String str) {
        String asText = asText();
        return asText == null ? str : asText;
    }

    public BigInteger bigIntegerValue() {
        return BigInteger.ZERO;
    }

    public byte[] binaryValue() {
        return null;
    }

    public BigDecimal decimalValue() {
        return BigDecimal.ZERO;
    }

    public double doubleValue() {
        return 0.0d;
    }

    public Iterator<JsonNode> elements() {
        return ClassUtil.emptyIterator();
    }

    public Iterator<String> fieldNames() {
        return ClassUtil.emptyIterator();
    }

    public Iterator<Map.Entry<String, JsonNode>> fields() {
        return ClassUtil.emptyIterator();
    }

    public abstract JsonNode get(int i2);

    public JsonNode get(String str) {
        return null;
    }

    public abstract JsonNodeType getNodeType();

    public boolean has(String str) {
        return get(str) != null;
    }

    public boolean hasNonNull(String str) {
        JsonNode jsonNode = get(str);
        return jsonNode != null && !jsonNode.isNull();
    }

    public int intValue() {
        return 0;
    }

    public boolean isArray() {
        return false;
    }

    public final boolean isBinary() {
        return getNodeType() == JsonNodeType.BINARY;
    }

    public final boolean isContainerNode() {
        JsonNodeType nodeType = getNodeType();
        return nodeType == JsonNodeType.OBJECT || nodeType == JsonNodeType.ARRAY;
    }

    public final boolean isNull() {
        return getNodeType() == JsonNodeType.NULL;
    }

    public final boolean isNumber() {
        return getNodeType() == JsonNodeType.NUMBER;
    }

    public boolean isObject() {
        return false;
    }

    public final boolean isPojo() {
        return getNodeType() == JsonNodeType.POJO;
    }

    public final boolean isValueNode() {
        int i2 = AnonymousClass1.$SwitchMap$com$fasterxml$jackson$databind$node$JsonNodeType[getNodeType().ordinal()];
        return (i2 == 1 || i2 == 2 || i2 == 3) ? false : true;
    }

    public final Iterator<JsonNode> iterator() {
        return elements();
    }

    public long longValue() {
        return 0;
    }

    public Number numberValue() {
        return null;
    }

    public String textValue() {
        return null;
    }

    public abstract String toString();
}
