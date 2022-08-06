package com.github.jasminb.jsonapi;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.jasminb.jsonapi.exceptions.InvalidJsonApiResourceException;
import com.github.jasminb.jsonapi.exceptions.ResourceParseException;
import com.github.jasminb.jsonapi.q.a.b;
import java.util.Iterator;

/* compiled from: ValidationUtils */
public class o {
    public static void a(JsonNode jsonNode) {
        if (!j(jsonNode) && !i(jsonNode)) {
            throw new InvalidJsonApiResourceException("Primary data must be an array of resource objects, an array of resource identifier objects, or an empty array ([])");
        }
    }

    public static void b(JsonNode jsonNode) {
        if (!n(jsonNode) && k(jsonNode)) {
            throw new InvalidJsonApiResourceException("Primary data must be either a single resource object, a single resource identifier object, or null");
        }
    }

    public static void c(ObjectMapper objectMapper, JsonNode jsonNode) {
        if (jsonNode == null || jsonNode.isNull()) {
            throw new InvalidJsonApiResourceException();
        }
        boolean hasNonNull = jsonNode.hasNonNull("errors");
        boolean has = jsonNode.has("data");
        boolean has2 = jsonNode.has("meta");
        if (hasNonNull) {
            try {
                throw new ResourceParseException(c.a(objectMapper, jsonNode, b.class));
            } catch (JsonProcessingException e2) {
                throw new RuntimeException(e2);
            }
        } else if (!has && !has2) {
            throw new InvalidJsonApiResourceException();
        }
    }

    public static void d(JsonNode jsonNode) {
        if (!j(jsonNode)) {
            throw new InvalidJsonApiResourceException("Included must be an array of valid resource objects, or an empty array ([])");
        }
    }

    private static boolean e(JsonNode jsonNode, String str) {
        return jsonNode.hasNonNull(str) && jsonNode.get(str).isContainerNode();
    }

    private static boolean f(JsonNode jsonNode, String str) {
        if (jsonNode.hasNonNull(str)) {
            return jsonNode.get(str).isContainerNode();
        }
        return true;
    }

    private static boolean g(JsonNode jsonNode, String str) {
        return jsonNode.hasNonNull(str) && jsonNode.get(str).isValueNode();
    }

    private static boolean h(JsonNode jsonNode, String str) {
        if (jsonNode.hasNonNull(str)) {
            return jsonNode.get(str).isValueNode();
        }
        return true;
    }

    public static boolean i(JsonNode jsonNode) {
        if (jsonNode == null || !jsonNode.isArray()) {
            return false;
        }
        Iterator<JsonNode> it = jsonNode.iterator();
        while (it.hasNext()) {
            if (!l(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static boolean j(JsonNode jsonNode) {
        if (jsonNode == null || !jsonNode.isArray()) {
            return false;
        }
        Iterator<JsonNode> it = jsonNode.iterator();
        while (it.hasNext()) {
            if (!m(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static boolean k(JsonNode jsonNode) {
        return jsonNode != null && !jsonNode.isNull();
    }

    public static boolean l(JsonNode jsonNode) {
        return jsonNode != null && jsonNode.isObject() && g(jsonNode, "id") && g(jsonNode, "type") && f(jsonNode, "meta");
    }

    public static boolean m(JsonNode jsonNode) {
        return jsonNode != null && jsonNode.isObject() && h(jsonNode, "id") && g(jsonNode, "type") && f(jsonNode, "meta") && e(jsonNode, "attributes") && f(jsonNode, "links") && f(jsonNode, "relationships");
    }

    public static boolean n(JsonNode jsonNode) {
        return m(jsonNode) || l(jsonNode);
    }
}
