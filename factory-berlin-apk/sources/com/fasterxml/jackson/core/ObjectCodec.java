package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.type.ResolvedType;
import com.fasterxml.jackson.core.type.TypeReference;
import java.util.Iterator;

public abstract class ObjectCodec extends TreeCodec {
    protected ObjectCodec() {
    }

    public abstract TreeNode createArrayNode();

    public abstract TreeNode createObjectNode();

    public abstract JsonFactory getFactory();

    @Deprecated
    public JsonFactory getJsonFactory() {
        return getFactory();
    }

    public abstract <T extends TreeNode> T readTree(JsonParser jsonParser);

    public abstract <T> T readValue(JsonParser jsonParser, ResolvedType resolvedType);

    public abstract <T> T readValue(JsonParser jsonParser, TypeReference<?> typeReference);

    public abstract <T> T readValue(JsonParser jsonParser, Class<T> cls);

    public abstract <T> Iterator<T> readValues(JsonParser jsonParser, ResolvedType resolvedType);

    public abstract <T> Iterator<T> readValues(JsonParser jsonParser, TypeReference<?> typeReference);

    public abstract <T> Iterator<T> readValues(JsonParser jsonParser, Class<T> cls);

    public abstract JsonParser treeAsTokens(TreeNode treeNode);

    public abstract <T> T treeToValue(TreeNode treeNode, Class<T> cls);

    public abstract Version version();

    public abstract void writeTree(JsonGenerator jsonGenerator, TreeNode treeNode);

    public abstract void writeValue(JsonGenerator jsonGenerator, Object obj);
}
