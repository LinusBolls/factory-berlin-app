package com.github.jasminb.jsonapi;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.jasminb.jsonapi.q.a.b;

/* compiled from: ErrorUtils */
public class c {
    public static <T extends b> T a(ObjectMapper objectMapper, JsonNode jsonNode, Class<T> cls) {
        return (b) objectMapper.treeToValue(jsonNode, cls);
    }
}
