package com.fasterxml.jackson.core;

public abstract class TreeCodec {
    public abstract TreeNode createArrayNode();

    public abstract TreeNode createObjectNode();

    public abstract <T extends TreeNode> T readTree(JsonParser jsonParser);

    public abstract JsonParser treeAsTokens(TreeNode treeNode);

    public abstract void writeTree(JsonGenerator jsonGenerator, TreeNode treeNode);
}
