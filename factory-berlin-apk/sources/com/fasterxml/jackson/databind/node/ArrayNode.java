package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class ArrayNode extends ContainerNode<ArrayNode> {
    private final List<JsonNode> _children = new ArrayList();

    public ArrayNode(JsonNodeFactory jsonNodeFactory) {
        super(jsonNodeFactory);
    }

    /* access modifiers changed from: protected */
    public ArrayNode _add(JsonNode jsonNode) {
        this._children.add(jsonNode);
        return this;
    }

    public ArrayNode add(JsonNode jsonNode) {
        if (jsonNode == null) {
            jsonNode = nullNode();
        }
        _add(jsonNode);
        return this;
    }

    public ArrayNode addAll(Collection<? extends JsonNode> collection) {
        this._children.addAll(collection);
        return this;
    }

    public ArrayNode addNull() {
        _add(nullNode());
        return this;
    }

    public JsonToken asToken() {
        return JsonToken.START_ARRAY;
    }

    public Iterator<JsonNode> elements() {
        return this._children.iterator();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof ArrayNode)) {
            return this._children.equals(((ArrayNode) obj)._children);
        }
        return false;
    }

    public JsonNode get(int i2) {
        if (i2 < 0 || i2 >= this._children.size()) {
            return null;
        }
        return this._children.get(i2);
    }

    public JsonNode get(String str) {
        return null;
    }

    public JsonNodeType getNodeType() {
        return JsonNodeType.ARRAY;
    }

    public int hashCode() {
        return this._children.hashCode();
    }

    public boolean isArray() {
        return true;
    }

    public boolean isEmpty(SerializerProvider serializerProvider) {
        return this._children.isEmpty();
    }

    public void serialize(JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        List<JsonNode> list = this._children;
        int size = list.size();
        jsonGenerator.writeStartArray(size);
        for (int i2 = 0; i2 < size; i2++) {
            ((BaseJsonNode) list.get(i2)).serialize(jsonGenerator, serializerProvider);
        }
        jsonGenerator.writeEndArray();
    }

    public void serializeWithType(JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) {
        WritableTypeId writeTypePrefix = typeSerializer.writeTypePrefix(jsonGenerator, typeSerializer.typeId(this, JsonToken.START_ARRAY));
        Iterator<JsonNode> it = this._children.iterator();
        while (it.hasNext()) {
            ((BaseJsonNode) it.next()).serialize(jsonGenerator, serializerProvider);
        }
        typeSerializer.writeTypeSuffix(jsonGenerator, writeTypePrefix);
    }

    public int size() {
        return this._children.size();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((size() << 4) + 16);
        sb.append('[');
        int size = this._children.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (i2 > 0) {
                sb.append(',');
            }
            sb.append(this._children.get(i2).toString());
        }
        sb.append(']');
        return sb.toString();
    }

    public ArrayNode add(String str) {
        if (str == null) {
            addNull();
            return this;
        }
        _add(textNode(str));
        return this;
    }
}
