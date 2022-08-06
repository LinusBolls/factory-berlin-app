package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import de.baimos.blueid.sdk.metrics.AndroidSdkMetrics;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class ObjectNode extends ContainerNode<ObjectNode> {
    protected final Map<String, JsonNode> _children = new LinkedHashMap();

    public ObjectNode(JsonNodeFactory jsonNodeFactory) {
        super(jsonNodeFactory);
    }

    /* access modifiers changed from: protected */
    public boolean _childrenEqual(ObjectNode objectNode) {
        return this._children.equals(objectNode._children);
    }

    /* access modifiers changed from: protected */
    public ObjectNode _put(String str, JsonNode jsonNode) {
        this._children.put(str, jsonNode);
        return this;
    }

    public JsonToken asToken() {
        return JsonToken.START_OBJECT;
    }

    public Iterator<JsonNode> elements() {
        return this._children.values().iterator();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof ObjectNode)) {
            return _childrenEqual((ObjectNode) obj);
        }
        return false;
    }

    public Iterator<String> fieldNames() {
        return this._children.keySet().iterator();
    }

    public Iterator<Map.Entry<String, JsonNode>> fields() {
        return this._children.entrySet().iterator();
    }

    public JsonNode get(int i2) {
        return null;
    }

    public JsonNode get(String str) {
        return this._children.get(str);
    }

    public JsonNodeType getNodeType() {
        return JsonNodeType.OBJECT;
    }

    public int hashCode() {
        return this._children.hashCode();
    }

    public boolean isEmpty(SerializerProvider serializerProvider) {
        return this._children.isEmpty();
    }

    public final boolean isObject() {
        return true;
    }

    public ObjectNode put(String str, String str2) {
        JsonNode jsonNode;
        if (str2 == null) {
            jsonNode = nullNode();
        } else {
            jsonNode = textNode(str2);
        }
        _put(str, jsonNode);
        return this;
    }

    public ArrayNode putArray(String str) {
        ArrayNode arrayNode = arrayNode();
        _put(str, arrayNode);
        return arrayNode;
    }

    public JsonNode remove(String str) {
        return this._children.remove(str);
    }

    public JsonNode replace(String str, JsonNode jsonNode) {
        if (jsonNode == null) {
            jsonNode = nullNode();
        }
        return this._children.put(str, jsonNode);
    }

    public void serialize(JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        boolean z = serializerProvider != null && !serializerProvider.isEnabled(SerializationFeature.WRITE_EMPTY_JSON_ARRAYS);
        jsonGenerator.writeStartObject(this);
        for (Map.Entry next : this._children.entrySet()) {
            BaseJsonNode baseJsonNode = (BaseJsonNode) next.getValue();
            if (!z || !baseJsonNode.isArray() || !baseJsonNode.isEmpty(serializerProvider)) {
                jsonGenerator.writeFieldName((String) next.getKey());
                baseJsonNode.serialize(jsonGenerator, serializerProvider);
            }
        }
        jsonGenerator.writeEndObject();
    }

    public void serializeWithType(JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) {
        boolean z = serializerProvider != null && !serializerProvider.isEnabled(SerializationFeature.WRITE_EMPTY_JSON_ARRAYS);
        WritableTypeId writeTypePrefix = typeSerializer.writeTypePrefix(jsonGenerator, typeSerializer.typeId(this, JsonToken.START_OBJECT));
        for (Map.Entry next : this._children.entrySet()) {
            BaseJsonNode baseJsonNode = (BaseJsonNode) next.getValue();
            if (!z || !baseJsonNode.isArray() || !baseJsonNode.isEmpty(serializerProvider)) {
                jsonGenerator.writeFieldName((String) next.getKey());
                baseJsonNode.serialize(jsonGenerator, serializerProvider);
            }
        }
        typeSerializer.writeTypeSuffix(jsonGenerator, writeTypePrefix);
    }

    public JsonNode set(String str, JsonNode jsonNode) {
        if (jsonNode == null) {
            jsonNode = nullNode();
        }
        this._children.put(str, jsonNode);
        return this;
    }

    public int size() {
        return this._children.size();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((size() << 4) + 32);
        sb.append("{");
        int i2 = 0;
        for (Map.Entry next : this._children.entrySet()) {
            if (i2 > 0) {
                sb.append(AndroidSdkMetrics.SEPARATOR);
            }
            i2++;
            TextNode.appendQuoted(sb, (String) next.getKey());
            sb.append(':');
            sb.append(((JsonNode) next.getValue()).toString());
        }
        sb.append("}");
        return sb.toString();
    }

    public ObjectNode put(String str, boolean z) {
        _put(str, booleanNode(z));
        return this;
    }
}
