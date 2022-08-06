package kotlin.jvm.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.c;
import kotlin.e0.c.d;
import kotlin.e0.c.f;
import kotlin.e0.c.g;
import kotlin.e0.c.h;
import kotlin.e0.c.i;
import kotlin.e0.c.j;
import kotlin.e0.c.k;
import kotlin.e0.c.l;
import kotlin.e0.c.m;
import kotlin.e0.c.n;
import kotlin.e0.c.o;
import kotlin.e0.c.p;
import kotlin.e0.c.q;
import kotlin.e0.c.r;
import kotlin.e0.c.s;
import kotlin.e0.c.t;
import kotlin.e0.c.u;
import kotlin.e0.c.v;
import kotlin.e0.c.w;
import kotlin.h0.b;

/* compiled from: ClassReference.kt */
public final class e implements b<Object>, d {
    private static final Map<Class<? extends c<?>>, Integer> b;
    private static final HashMap<String, String> c;

    /* renamed from: d  reason: collision with root package name */
    private static final HashMap<String, String> f10677d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final HashMap<String, String> f10678e;

    /* renamed from: f  reason: collision with root package name */
    public static final a f10679f = new a((DefaultConstructorMarker) null);
    private final Class<?> a;

    /* compiled from: ClassReference.kt */
    public static final class a {
        private a() {
        }

        public final String a(Class<?> cls) {
            String str;
            k.e(cls, "jClass");
            String str2 = null;
            if (cls.isAnonymousClass() || cls.isLocalClass()) {
                return null;
            }
            if (cls.isArray()) {
                Class<?> componentType = cls.getComponentType();
                if (componentType.isPrimitive() && (str = (String) e.f10678e.get(componentType.getName())) != null) {
                    str2 = str + "Array";
                }
                if (str2 != null) {
                    return str2;
                }
                return "kotlin.Array";
            }
            String str3 = (String) e.f10678e.get(cls.getName());
            return str3 != null ? str3 : cls.getCanonicalName();
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        int i2 = 0;
        List i3 = n.i(kotlin.e0.c.a.class, l.class, p.class, q.class, r.class, s.class, t.class, u.class, v.class, w.class, kotlin.e0.c.b.class, kotlin.e0.c.c.class, d.class, kotlin.e0.c.e.class, f.class, g.class, h.class, i.class, j.class, k.class, m.class, n.class, o.class);
        ArrayList arrayList = new ArrayList(o.p(i3, 10));
        for (Object next : i3) {
            int i4 = i2 + 1;
            if (i2 >= 0) {
                arrayList.add(kotlin.n.a((Class) next, Integer.valueOf(i2)));
                i2 = i4;
            } else {
                kotlin.a0.l.o();
                throw null;
            }
        }
        b = e0.k(arrayList);
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        c = hashMap;
        HashMap<String, String> hashMap2 = new HashMap<>();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        f10677d = hashMap2;
        HashMap<String, String> hashMap3 = new HashMap<>();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(c);
        hashMap3.putAll(f10677d);
        Collection<String> values = c.values();
        k.d(values, "primitiveFqNames.values");
        for (String str : values) {
            StringBuilder sb = new StringBuilder();
            sb.append("kotlin.jvm.internal.");
            k.d(str, "kotlinName");
            sb.append(q.y0(str, '.', (String) null, 2, (Object) null));
            sb.append("CompanionObject");
            String sb2 = sb.toString();
            kotlin.j a2 = kotlin.n.a(sb2, str + ".Companion");
            hashMap3.put(a2.c(), a2.d());
        }
        for (Map.Entry next2 : b.entrySet()) {
            int intValue = ((Number) next2.getValue()).intValue();
            String name = ((Class) next2.getKey()).getName();
            hashMap3.put(name, "kotlin.Function" + intValue);
        }
        f10678e = hashMap3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(d0.a(hashMap3.size()));
        for (Map.Entry entry : hashMap3.entrySet()) {
            linkedHashMap.put(entry.getKey(), q.y0((String) entry.getValue(), '.', (String) null, 2, (Object) null));
        }
    }

    public e(Class<?> cls) {
        k.e(cls, "jClass");
        this.a = cls;
    }

    public String a() {
        return f10679f.a(b());
    }

    public Class<?> b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof e) && k.a(kotlin.e0.a.b(this), kotlin.e0.a.b((b) obj));
    }

    public int hashCode() {
        return kotlin.e0.a.b(this).hashCode();
    }

    public String toString() {
        return b().toString() + " (Kotlin reflection is not available)";
    }
}
