package com.github.jasminb.jsonapi;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.node.TextNode;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.github.jasminb.jsonapi.exceptions.DocumentSerializationException;
import com.github.jasminb.jsonapi.exceptions.UnregisteredTypeException;
import com.github.jasminb.jsonapi.p.d;
import com.github.jasminb.jsonapi.p.g;
import com.github.jasminb.jsonapi.q.a.a;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: ResourceConverter */
public class k {
    private final a a;
    private final ObjectMapper b;
    private final PropertyNamingStrategy c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<Class<?>, i> f1906d;

    /* renamed from: e  reason: collision with root package name */
    private final j f1907e;

    /* renamed from: f  reason: collision with root package name */
    private final Set<b> f1908f;

    /* renamed from: g  reason: collision with root package name */
    private final Set<m> f1909g;

    /* renamed from: h  reason: collision with root package name */
    private i f1910h;

    /* renamed from: i  reason: collision with root package name */
    private String f1911i;

    public k(ObjectMapper objectMapper, Class<?>... clsArr) {
        this(objectMapper, (String) null, clsArr);
    }

    private void A(Object obj, JsonNode jsonNode) {
        Field b2 = this.a.b(obj.getClass());
        l c2 = this.a.c(obj.getClass());
        if (jsonNode != null) {
            b2.set(obj, c2.b(jsonNode.asText()));
        }
    }

    private boolean B(n nVar) {
        if (nVar == null || nVar.c() == null) {
            return this.f1909g.contains(m.INCLUDE_LINKS);
        }
        return nVar.c().booleanValue();
    }

    private boolean C(n nVar) {
        if (nVar == null || nVar.d() == null) {
            return this.f1909g.contains(m.INCLUDE_META);
        }
        return nVar.d().booleanValue();
    }

    private boolean D(String str, n nVar) {
        if (nVar != null) {
            if (nVar.b(str) && !nVar.a(str)) {
                return true;
            }
            if (nVar.a(str)) {
                return false;
            }
        }
        return this.f1909g.contains(m.INCLUDE_RELATIONSHIP_ATTRIBUTES);
    }

    private ObjectNode a(ObjectNode objectNode, Map<String, ObjectNode> map) {
        if (!map.isEmpty()) {
            ArrayNode createArrayNode = this.b.createArrayNode();
            createArrayNode.addAll(map.values());
            objectNode.set("included", createArrayNode);
        }
        return objectNode;
    }

    private Collection<?> b(Class<?> cls) {
        if (!cls.isInterface() && !Modifier.isAbstract(cls.getModifiers())) {
            return (Collection) cls.newInstance();
        }
        if (List.class.equals(cls) || Collection.class.equals(cls)) {
            return new ArrayList();
        }
        if (Set.class.equals(cls)) {
            return new HashSet();
        }
        throw new RuntimeException("Unable to create appropriate instance for type: " + cls.getSimpleName());
    }

    private String c(JsonNode jsonNode) {
        JsonNode jsonNode2 = jsonNode.get("id");
        String trim = jsonNode2 != null ? jsonNode2.asText().trim() : "";
        if (!trim.isEmpty() || !this.f1908f.contains(b.REQUIRE_RESOURCE_ID)) {
            return jsonNode.get("type").asText().concat(trim);
        }
        throw new IllegalArgumentException(String.format("Resource must have a non null and non-empty 'id' attribute! %s", new Object[]{jsonNode.toString()}));
    }

    private String d(String str, String str2) {
        if (!str.endsWith("/")) {
            str = str.concat("/");
        }
        if (str2.startsWith("/")) {
            return str.concat(str2.substring(1));
        }
        return str.concat(str2);
    }

    private Class<?> e(JsonNode jsonNode, Class<?> cls) {
        String asText = jsonNode.get("type").asText();
        String o = this.a.o(cls);
        if (o != null && o.equals(asText)) {
            return cls;
        }
        Class<?> n2 = this.a.n(asText);
        if (n2 != null && cls.isAssignableFrom(n2)) {
            return n2;
        }
        throw new UnregisteredTypeException(asText);
    }

    private ObjectNode f(Object obj, Map<String, ObjectNode> map, n nVar) {
        String str;
        String str2;
        JsonNode jsonNode;
        JsonNode jsonNode2;
        ObjectNode objectNode;
        ObjectNode objectNode2;
        String str3;
        ObjectNode objectNode3;
        ObjectNode objectNode4;
        JsonNode jsonNode3;
        JsonNode jsonNode4;
        JsonNode jsonNode5;
        Object obj2 = obj;
        Map<String, ObjectNode> map2 = map;
        n nVar2 = nVar;
        ObjectNode createObjectNode = this.b.createObjectNode();
        ObjectNode objectNode5 = (ObjectNode) this.b.valueToTree(obj2);
        String g2 = g(obj);
        x(objectNode5, this.a.b(obj.getClass()));
        Field e2 = this.a.e(obj.getClass());
        JsonNode x = e2 != null ? x(objectNode5, e2) : null;
        JsonNode m2 = m(obj2, objectNode5, g2, nVar2);
        if (m2 == null || !m2.has("self")) {
            str = null;
        } else {
            JsonNode jsonNode6 = m2.get("self");
            str = jsonNode6 instanceof TextNode ? jsonNode6.textValue() : jsonNode6.get("href").asText();
        }
        createObjectNode.put("type", this.a.o(obj.getClass()));
        if (g2 != null) {
            createObjectNode.put("id", g2);
            this.f1907e.a(g2.concat(this.a.o(obj.getClass())), (Object) null);
        }
        createObjectNode.set("attributes", objectNode5);
        List<Field> h2 = this.a.h(obj.getClass());
        String str4 = "meta";
        if (h2 != null) {
            ObjectNode createObjectNode2 = this.b.createObjectNode();
            Iterator<Field> it = h2.iterator();
            while (it.hasNext()) {
                Field next = it.next();
                Iterator<Field> it2 = it;
                Object obj3 = next.get(obj2);
                x(objectNode5, next);
                if (obj3 != null) {
                    jsonNode4 = x;
                    d a2 = this.a.a(next);
                    if (!a2.serialise()) {
                        it = it2;
                        jsonNode5 = jsonNode4;
                    } else {
                        jsonNode3 = m2;
                        String value = a2.value();
                        objectNode4 = createObjectNode;
                        ObjectNode createObjectNode3 = this.b.createObjectNode();
                        createObjectNode2.set(value, createObjectNode3);
                        objectNode3 = createObjectNode2;
                        JsonNode k2 = k(obj2, value, nVar2);
                        if (k2 != null) {
                            createObjectNode3.set(str4, k2);
                            str3 = str4;
                            x(objectNode5, this.a.j(obj.getClass(), value));
                        } else {
                            str3 = str4;
                        }
                        JsonNode j2 = j(obj2, a2, str, nVar2);
                        if (j2 != null) {
                            createObjectNode3.set("links", j2);
                            x(objectNode5, this.a.i(obj.getClass(), value));
                        }
                        if (!this.a.a(next).serialiseData()) {
                            objectNode2 = objectNode5;
                        } else if (obj3 instanceof Collection) {
                            ArrayNode createArrayNode = this.b.createArrayNode();
                            for (Object next2 : (Collection) obj3) {
                                String o = this.a.o(next2.getClass());
                                String g3 = g(next2);
                                ObjectNode objectNode6 = objectNode5;
                                ObjectNode createObjectNode4 = this.b.createObjectNode();
                                createObjectNode4.put("type", o);
                                createObjectNode4.put("id", g3);
                                createArrayNode.add((JsonNode) createObjectNode4);
                                if (D(value, nVar2) && g3 != null) {
                                    String concat = g3.concat(o);
                                    if (!map2.containsKey(concat) && !this.f1907e.d(concat)) {
                                        map2.put(concat, f(next2, map2, nVar2));
                                    }
                                }
                                Object obj4 = obj;
                                objectNode5 = objectNode6;
                            }
                            objectNode2 = objectNode5;
                            createObjectNode3.set("data", createArrayNode);
                        } else {
                            objectNode2 = objectNode5;
                            String o2 = this.a.o(obj3.getClass());
                            String g4 = g(obj3);
                            ObjectNode createObjectNode5 = this.b.createObjectNode();
                            createObjectNode5.put("type", o2);
                            createObjectNode5.put("id", g4);
                            createObjectNode3.set("data", createObjectNode5);
                            if (D(value, nVar2) && g4 != null) {
                                String concat2 = g4.concat(o2);
                                if (!map2.containsKey(concat2)) {
                                    map2.put(concat2, f(obj3, map2, nVar2));
                                }
                            }
                        }
                    }
                } else {
                    objectNode4 = createObjectNode;
                    objectNode2 = objectNode5;
                    jsonNode4 = x;
                    str3 = str4;
                    jsonNode3 = m2;
                    objectNode3 = createObjectNode2;
                }
                obj2 = obj;
                it = it2;
                jsonNode5 = jsonNode4;
                m2 = jsonNode3;
                createObjectNode = objectNode4;
                createObjectNode2 = objectNode3;
                str4 = str3;
                objectNode5 = objectNode2;
            }
            ObjectNode objectNode7 = createObjectNode;
            jsonNode2 = x;
            str2 = str4;
            jsonNode = m2;
            ObjectNode objectNode8 = createObjectNode2;
            if (objectNode8.size() > 0) {
                objectNode = objectNode7;
                objectNode.set("relationships", objectNode8);
            } else {
                objectNode = objectNode7;
            }
        } else {
            objectNode = createObjectNode;
            jsonNode2 = x;
            str2 = str4;
            jsonNode = m2;
        }
        if (jsonNode != null) {
            objectNode.set("links", jsonNode);
        }
        if (jsonNode2 != null && C(nVar2)) {
            objectNode.set(str2, jsonNode2);
        }
        return objectNode;
    }

    private String g(Object obj) {
        return this.a.c(obj.getClass()).a(this.a.b(obj.getClass()).get(obj));
    }

    private Map<String, Object> h(JsonNode jsonNode) {
        HashMap hashMap = new HashMap();
        JsonNode jsonNode2 = jsonNode.get("included");
        o.d(jsonNode2);
        Iterator<JsonNode> it = jsonNode2.iterator();
        while (it.hasNext()) {
            JsonNode next = it.next();
            String asText = next.get("type").asText();
            Class<?> n2 = this.a.n(asText);
            if (n2 != null) {
                Object w = w(next, n2, false);
                if (w != null) {
                    hashMap.put(c(next), w);
                }
            } else if (!this.f1908f.contains(b.ALLOW_UNKNOWN_INCLUSIONS)) {
                throw new IllegalArgumentException("Included section contains unknown resource type: " + asText);
            }
        }
        return hashMap;
    }

    private JsonNode j(Object obj, d dVar, String str, n nVar) {
        if (B(nVar)) {
            Field i2 = this.a.i(obj.getClass(), dVar.value());
            f fVar = i2 != null ? (f) i2.get(obj) : null;
            HashMap hashMap = new HashMap();
            if (fVar != null) {
                hashMap.putAll(fVar.a());
            }
            if (!dVar.path().trim().isEmpty() && !hashMap.containsKey("self")) {
                hashMap.put("self", new e(d(str, dVar.path())));
            }
            if (!dVar.relatedPath().trim().isEmpty() && !hashMap.containsKey("related")) {
                hashMap.put("related", new e(d(str, dVar.relatedPath())));
            }
            if (!hashMap.isEmpty()) {
                return this.b.valueToTree(new f(hashMap)).get("links");
            }
        }
        return null;
    }

    private JsonNode k(Object obj, String str, n nVar) {
        Field j2;
        if (!C(nVar) || (j2 = this.a.j(obj.getClass(), str)) == null || j2.get(obj) == null) {
            return null;
        }
        return this.b.valueToTree(j2.get(obj));
    }

    private i l(Class<?> cls) {
        i iVar = this.f1906d.get(cls);
        return iVar != null ? iVar : this.f1910h;
    }

    private JsonNode m(Object obj, ObjectNode objectNode, String str, n nVar) {
        f fVar;
        g m2 = this.a.m(obj.getClass());
        Field d2 = this.a.d(obj.getClass());
        if (d2 != null) {
            fVar = (f) d2.get(obj);
            if (fVar != null) {
                x(objectNode, d2);
            }
        } else {
            fVar = null;
        }
        if (B(nVar)) {
            HashMap hashMap = new HashMap();
            if (fVar != null) {
                hashMap.putAll(fVar.a());
            }
            if (!m2.path().trim().isEmpty() && !hashMap.containsKey("self") && str != null) {
                hashMap.put("self", new e(d(this.f1911i, m2.path().replace("{id}", str))));
            }
            if (!hashMap.isEmpty()) {
                return this.b.valueToTree(new f(hashMap)).get("links");
            }
        }
        return null;
    }

    private void n(JsonNode jsonNode, Object obj) {
        Class<?> l2;
        String i2;
        Field i3;
        Field j2;
        JsonNode jsonNode2 = jsonNode.get("relationships");
        if (jsonNode2 != null) {
            Iterator<String> fieldNames = jsonNode2.fieldNames();
            while (fieldNames.hasNext()) {
                String next = fieldNames.next();
                JsonNode jsonNode3 = jsonNode2.get(next);
                Field g2 = this.a.g(obj.getClass(), next);
                if (!(g2 == null || (l2 = this.a.l(obj.getClass(), next)) == null)) {
                    if (jsonNode3.has("meta") && (j2 = this.a.j(obj.getClass(), next)) != null) {
                        j2.set(obj, this.b.treeToValue(jsonNode3.get("meta"), this.a.k(obj.getClass(), next)));
                    }
                    if (jsonNode3.has("links") && (i3 = this.a.i(obj.getClass(), next)) != null) {
                        i3.set(obj, new f(q(jsonNode3.get("links"))));
                    }
                    boolean resolve = this.a.a(g2).resolve();
                    i l3 = l(l2);
                    if (resolve && l3 != null && jsonNode3.has("links")) {
                        JsonNode jsonNode4 = jsonNode3.get("links").get(this.a.a(g2).relType().a());
                        if (!(jsonNode4 == null || (i2 = i(jsonNode4)) == null)) {
                            if (o(jsonNode3)) {
                                g2.set(obj, v(new ByteArrayInputStream(l3.a(i2)), l2).a());
                            } else {
                                g2.set(obj, u(new ByteArrayInputStream(l3.a(i2)), l2).a());
                            }
                        }
                    } else if (o(jsonNode3)) {
                        Collection<?> b2 = b(g2.getType());
                        Iterator<JsonNode> it = jsonNode3.get("data").iterator();
                        while (it.hasNext()) {
                            try {
                                Object t = t(it.next(), l2);
                                if (t != null) {
                                    b2.add(t);
                                }
                            } catch (UnregisteredTypeException e2) {
                                if (g2.getType().isInterface() && !this.f1908f.contains(b.ALLOW_UNKNOWN_TYPE_IN_RELATIONSHIP)) {
                                    throw e2;
                                }
                            }
                        }
                        g2.set(obj, b2);
                    } else {
                        try {
                            Object t2 = t(jsonNode3.get("data"), l2);
                            if (t2 != null) {
                                g2.set(obj, t2);
                            }
                        } catch (UnregisteredTypeException e3) {
                            if (g2.getType().isInterface() && !this.f1908f.contains(b.ALLOW_UNKNOWN_TYPE_IN_RELATIONSHIP)) {
                                throw e3;
                            }
                        }
                    }
                }
            }
        }
    }

    private boolean o(JsonNode jsonNode) {
        JsonNode jsonNode2 = jsonNode.get("data");
        return jsonNode2 != null && jsonNode2.isArray();
    }

    private Map<String, e> q(JsonNode jsonNode) {
        HashMap hashMap = new HashMap();
        Iterator<Map.Entry<String, JsonNode>> fields = jsonNode.fields();
        while (fields.hasNext()) {
            Map.Entry next = fields.next();
            e eVar = new e();
            eVar.b(i((JsonNode) next.getValue()));
            if (((JsonNode) next.getValue()).has("meta")) {
                eVar.c(r(((JsonNode) next.getValue()).get("meta")));
            }
            hashMap.put(next.getKey(), eVar);
        }
        return hashMap;
    }

    private Map<String, Object> r(JsonNode jsonNode) {
        try {
            return (Map) this.b.readValue(this.b.treeAsTokens(jsonNode), (JavaType) TypeFactory.defaultInstance().constructMapType((Class<? extends Map>) HashMap.class, (Class<?>) String.class, (Class<?>) Object.class));
        } catch (IOException unused) {
            return null;
        }
    }

    private Map<String, Object> s(JsonNode jsonNode) {
        HashMap hashMap = new HashMap();
        if (jsonNode.has("included")) {
            Map<String, Object> h2 = h(jsonNode);
            if (!h2.isEmpty()) {
                for (String next : h2.keySet()) {
                    hashMap.put(next, h2.get(next));
                }
                ArrayNode arrayNode = (ArrayNode) jsonNode.get("included");
                for (int i2 = 0; i2 < arrayNode.size(); i2++) {
                    JsonNode jsonNode2 = arrayNode.get(i2);
                    Object obj = h2.get(c(jsonNode2));
                    if (obj != null) {
                        n(jsonNode2, obj);
                    }
                }
            }
        }
        return hashMap;
    }

    private Object t(JsonNode jsonNode, Class<?> cls) {
        if (!o.l(jsonNode)) {
            return null;
        }
        String c2 = c(jsonNode);
        if (this.f1907e.d(c2)) {
            return this.f1907e.e(c2);
        }
        this.f1907e.g();
        try {
            return w(jsonNode, cls, true);
        } finally {
            this.f1907e.h();
        }
    }

    private <T> T w(JsonNode jsonNode, Class<T> cls, boolean z) {
        Field d2;
        Field e2;
        String c2 = c(jsonNode);
        T e3 = this.f1907e.e(c2);
        if (e3 == null) {
            Class<?> e4 = e(jsonNode, cls);
            if (jsonNode.has("attributes")) {
                e3 = this.b.treeToValue(jsonNode.get("attributes"), e4);
            } else if (e4.isInterface()) {
                e3 = null;
            } else {
                ObjectMapper objectMapper = this.b;
                e3 = objectMapper.treeToValue(objectMapper.createObjectNode(), e4);
            }
            if (jsonNode.has("meta") && (e2 = this.a.e(e4)) != null) {
                e2.set(e3, this.b.treeToValue(jsonNode.get("meta"), this.a.f(e4)));
            }
            if (jsonNode.has("links") && (d2 = this.a.d(e4)) != null) {
                d2.set(e3, new f(q(jsonNode.get("links"))));
            }
            if (e3 != null) {
                this.f1907e.a(c2, e3);
                A(e3, jsonNode.get("id"));
                if (z) {
                    n(jsonNode, e3);
                }
            }
        }
        return e3;
    }

    private JsonNode x(ObjectNode objectNode, Field field) {
        if (field != null) {
            return objectNode.remove(this.c.nameForField((MapperConfig<?>) null, (AnnotatedField) null, field.getName()));
        }
        return null;
    }

    private void y(d<?> dVar, ObjectNode objectNode, n nVar) {
        if (dVar.c() != null && !dVar.c().a().isEmpty() && B(nVar)) {
            objectNode.set("links", this.b.valueToTree(dVar.c()).get("links"));
        }
    }

    private void z(d<?> dVar, ObjectNode objectNode, n nVar) {
        if (dVar.e() != null && !dVar.e().isEmpty() && C(nVar)) {
            objectNode.set("meta", this.b.valueToTree(dVar.e()));
        }
    }

    public byte[] E(d<?> dVar) {
        return F(dVar, (n) null);
    }

    public byte[] F(d<?> dVar, n nVar) {
        try {
            this.f1907e.f();
            HashMap hashMap = new HashMap();
            ObjectNode createObjectNode = this.b.createObjectNode();
            if (dVar.a() != null) {
                createObjectNode.set("data", f(dVar.a(), hashMap, nVar));
                hashMap.remove(String.valueOf(g(dVar.a())).concat(this.a.o(dVar.a().getClass())));
                a(createObjectNode, hashMap);
            }
            if (dVar.b() != null) {
                ArrayNode createArrayNode = this.b.createArrayNode();
                for (a valueToTree : dVar.b()) {
                    createArrayNode.add(this.b.valueToTree(valueToTree));
                }
                createObjectNode.set("errors", createArrayNode);
            }
            z(dVar, createObjectNode, nVar);
            y(dVar, createObjectNode, nVar);
            byte[] writeValueAsBytes = this.b.writeValueAsBytes(createObjectNode);
            this.f1907e.c();
            return writeValueAsBytes;
        } catch (Exception e2) {
            throw new DocumentSerializationException(e2);
        } catch (Throwable th) {
            this.f1907e.c();
            throw th;
        }
    }

    public byte[] G(d<? extends Iterable<?>> dVar) {
        return H(dVar, (n) null);
    }

    public byte[] H(d<? extends Iterable<?>> dVar, n nVar) {
        try {
            this.f1907e.f();
            ArrayNode createArrayNode = this.b.createArrayNode();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object f2 : (Iterable) dVar.a()) {
                createArrayNode.add((JsonNode) f(f2, linkedHashMap, nVar));
            }
            ObjectNode createObjectNode = this.b.createObjectNode();
            createObjectNode.set("data", createArrayNode);
            z(dVar, createObjectNode, nVar);
            y(dVar, createObjectNode, nVar);
            a(createObjectNode, linkedHashMap);
            byte[] writeValueAsBytes = this.b.writeValueAsBytes(createObjectNode);
            this.f1907e.c();
            return writeValueAsBytes;
        } catch (Exception e2) {
            throw new DocumentSerializationException(e2);
        } catch (Throwable th) {
            this.f1907e.c();
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    public String i(JsonNode jsonNode) {
        if (jsonNode.has("href")) {
            return jsonNode.get("href").asText();
        }
        return jsonNode.asText((String) null);
    }

    public boolean p(Class<?> cls) {
        return this.a.p(cls);
    }

    public <T> d<T> u(InputStream inputStream, Class<T> cls) {
        try {
            this.f1907e.f();
            JsonNode readTree = this.b.readTree(inputStream);
            o.c(this.b, readTree);
            JsonNode jsonNode = readTree.get("data");
            o.b(jsonNode);
            T t = null;
            boolean z = false;
            if (o.k(jsonNode)) {
                String c2 = c(jsonNode);
                boolean d2 = this.f1907e.d(c2);
                if (d2) {
                    t = this.f1907e.e(c2);
                } else {
                    t = w(jsonNode, cls, false);
                }
                z = d2;
            }
            this.f1907e.b(s(readTree));
            if (t != null && !z) {
                n(jsonNode, t);
            }
            d<T> dVar = new d<>(t, readTree, this.b);
            if (readTree.has("meta")) {
                dVar.g(r(readTree.get("meta")));
            }
            if (readTree.has("links")) {
                dVar.f(new f(q(readTree.get("links"))));
            }
            this.f1907e.c();
            return dVar;
        } catch (RuntimeException e2) {
            throw e2;
        } catch (Exception e3) {
            throw new RuntimeException(e3);
        } catch (Throwable th) {
            this.f1907e.c();
            throw th;
        }
    }

    public <T> d<List<T>> v(InputStream inputStream, Class<T> cls) {
        int i2;
        try {
            this.f1907e.f();
            JsonNode readTree = this.b.readTree(inputStream);
            o.c(this.b, readTree);
            JsonNode jsonNode = readTree.get("data");
            o.a(jsonNode);
            ArrayList arrayList = new ArrayList();
            Iterator<JsonNode> it = jsonNode.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                arrayList.add(w(it.next(), cls, false));
            }
            this.f1907e.b(s(readTree));
            for (i2 = 0; i2 < arrayList.size(); i2++) {
                n(jsonNode.get(i2), arrayList.get(i2));
            }
            d<List<T>> dVar = new d<>(arrayList, readTree, this.b);
            if (readTree.has("meta")) {
                dVar.g(r(readTree.get("meta")));
            }
            if (readTree.has("links")) {
                dVar.f(new f(q(readTree.get("links"))));
            }
            this.f1907e.c();
            return dVar;
        } catch (RuntimeException e2) {
            throw e2;
        } catch (Exception e3) {
            throw new RuntimeException(e3);
        } catch (Throwable th) {
            this.f1907e.c();
            throw th;
        }
    }

    public k(ObjectMapper objectMapper, String str, Class<?>... clsArr) {
        this.f1906d = new HashMap();
        this.f1908f = b.a();
        this.f1909g = m.a();
        this.a = new a(clsArr);
        this.f1911i = str == null ? "" : str;
        if (objectMapper != null) {
            this.b = objectMapper;
        } else {
            ObjectMapper objectMapper2 = new ObjectMapper();
            this.b = objectMapper2;
            objectMapper2.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        }
        if (this.b.getPropertyNamingStrategy() != null) {
            this.c = this.b.getPropertyNamingStrategy();
        } else {
            this.c = new PropertyNamingStrategy();
        }
        this.f1907e = new j();
    }
}
