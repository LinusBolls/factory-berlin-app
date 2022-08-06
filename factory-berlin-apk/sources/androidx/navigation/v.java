package androidx.navigation;

import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;

/* compiled from: NavType */
public abstract class v<T> {
    public static final v<Integer> b = new c(false);
    public static final v<Integer> c = new d(false);

    /* renamed from: d  reason: collision with root package name */
    public static final v<int[]> f1113d = new e(true);

    /* renamed from: e  reason: collision with root package name */
    public static final v<Long> f1114e = new f(false);

    /* renamed from: f  reason: collision with root package name */
    public static final v<long[]> f1115f = new g(true);

    /* renamed from: g  reason: collision with root package name */
    public static final v<Float> f1116g = new h(false);

    /* renamed from: h  reason: collision with root package name */
    public static final v<float[]> f1117h = new i(true);

    /* renamed from: i  reason: collision with root package name */
    public static final v<Boolean> f1118i = new j(false);

    /* renamed from: j  reason: collision with root package name */
    public static final v<boolean[]> f1119j = new k(true);

    /* renamed from: k  reason: collision with root package name */
    public static final v<String> f1120k = new a(true);

    /* renamed from: l  reason: collision with root package name */
    public static final v<String[]> f1121l = new b(true);
    private final boolean a;

    /* compiled from: NavType */
    class a extends v<String> {
        a(boolean z) {
            super(z);
        }

        public String c() {
            return "string";
        }

        public /* bridge */ /* synthetic */ Object h(String str) {
            k(str);
            return str;
        }

        /* renamed from: j */
        public String b(Bundle bundle, String str) {
            return (String) bundle.get(str);
        }

        public String k(String str) {
            return str;
        }

        /* renamed from: l */
        public void i(Bundle bundle, String str, String str2) {
            bundle.putString(str, str2);
        }
    }

    /* compiled from: NavType */
    class b extends v<String[]> {
        b(boolean z) {
            super(z);
        }

        public String c() {
            return "string[]";
        }

        public /* bridge */ /* synthetic */ Object h(String str) {
            k(str);
            throw null;
        }

        /* renamed from: j */
        public String[] b(Bundle bundle, String str) {
            return (String[]) bundle.get(str);
        }

        public String[] k(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* renamed from: l */
        public void i(Bundle bundle, String str, String[] strArr) {
            bundle.putStringArray(str, strArr);
        }
    }

    /* compiled from: NavType */
    class c extends v<Integer> {
        c(boolean z) {
            super(z);
        }

        public String c() {
            return "integer";
        }

        /* renamed from: j */
        public Integer b(Bundle bundle, String str) {
            return (Integer) bundle.get(str);
        }

        /* renamed from: k */
        public Integer h(String str) {
            if (str.startsWith("0x")) {
                return Integer.valueOf(Integer.parseInt(str.substring(2), 16));
            }
            return Integer.valueOf(Integer.parseInt(str));
        }

        /* renamed from: l */
        public void i(Bundle bundle, String str, Integer num) {
            bundle.putInt(str, num.intValue());
        }
    }

    /* compiled from: NavType */
    class d extends v<Integer> {
        d(boolean z) {
            super(z);
        }

        public String c() {
            return "reference";
        }

        public /* bridge */ /* synthetic */ Object h(String str) {
            k(str);
            throw null;
        }

        /* renamed from: j */
        public Integer b(Bundle bundle, String str) {
            return (Integer) bundle.get(str);
        }

        public Integer k(String str) {
            throw new UnsupportedOperationException("References don't support parsing string values.");
        }

        /* renamed from: l */
        public void i(Bundle bundle, String str, Integer num) {
            bundle.putInt(str, num.intValue());
        }
    }

    /* compiled from: NavType */
    class e extends v<int[]> {
        e(boolean z) {
            super(z);
        }

        public String c() {
            return "integer[]";
        }

        public /* bridge */ /* synthetic */ Object h(String str) {
            k(str);
            throw null;
        }

        /* renamed from: j */
        public int[] b(Bundle bundle, String str) {
            return (int[]) bundle.get(str);
        }

        public int[] k(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* renamed from: l */
        public void i(Bundle bundle, String str, int[] iArr) {
            bundle.putIntArray(str, iArr);
        }
    }

    /* compiled from: NavType */
    class f extends v<Long> {
        f(boolean z) {
            super(z);
        }

        public String c() {
            return "long";
        }

        /* renamed from: j */
        public Long b(Bundle bundle, String str) {
            return (Long) bundle.get(str);
        }

        /* renamed from: k */
        public Long h(String str) {
            if (str.endsWith("L")) {
                str = str.substring(0, str.length() - 1);
            }
            if (str.startsWith("0x")) {
                return Long.valueOf(Long.parseLong(str.substring(2), 16));
            }
            return Long.valueOf(Long.parseLong(str));
        }

        /* renamed from: l */
        public void i(Bundle bundle, String str, Long l2) {
            bundle.putLong(str, l2.longValue());
        }
    }

    /* compiled from: NavType */
    class g extends v<long[]> {
        g(boolean z) {
            super(z);
        }

        public String c() {
            return "long[]";
        }

        public /* bridge */ /* synthetic */ Object h(String str) {
            k(str);
            throw null;
        }

        /* renamed from: j */
        public long[] b(Bundle bundle, String str) {
            return (long[]) bundle.get(str);
        }

        public long[] k(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* renamed from: l */
        public void i(Bundle bundle, String str, long[] jArr) {
            bundle.putLongArray(str, jArr);
        }
    }

    /* compiled from: NavType */
    class h extends v<Float> {
        h(boolean z) {
            super(z);
        }

        public String c() {
            return "float";
        }

        /* renamed from: j */
        public Float b(Bundle bundle, String str) {
            return (Float) bundle.get(str);
        }

        /* renamed from: k */
        public Float h(String str) {
            return Float.valueOf(Float.parseFloat(str));
        }

        /* renamed from: l */
        public void i(Bundle bundle, String str, Float f2) {
            bundle.putFloat(str, f2.floatValue());
        }
    }

    /* compiled from: NavType */
    class i extends v<float[]> {
        i(boolean z) {
            super(z);
        }

        public String c() {
            return "float[]";
        }

        public /* bridge */ /* synthetic */ Object h(String str) {
            k(str);
            throw null;
        }

        /* renamed from: j */
        public float[] b(Bundle bundle, String str) {
            return (float[]) bundle.get(str);
        }

        public float[] k(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* renamed from: l */
        public void i(Bundle bundle, String str, float[] fArr) {
            bundle.putFloatArray(str, fArr);
        }
    }

    /* compiled from: NavType */
    class j extends v<Boolean> {
        j(boolean z) {
            super(z);
        }

        public String c() {
            return "boolean";
        }

        /* renamed from: j */
        public Boolean b(Bundle bundle, String str) {
            return (Boolean) bundle.get(str);
        }

        /* renamed from: k */
        public Boolean h(String str) {
            if ("true".equals(str)) {
                return Boolean.TRUE;
            }
            if ("false".equals(str)) {
                return Boolean.FALSE;
            }
            throw new IllegalArgumentException("A boolean NavType only accepts \"true\" or \"false\" values.");
        }

        /* renamed from: l */
        public void i(Bundle bundle, String str, Boolean bool) {
            bundle.putBoolean(str, bool.booleanValue());
        }
    }

    /* compiled from: NavType */
    class k extends v<boolean[]> {
        k(boolean z) {
            super(z);
        }

        public String c() {
            return "boolean[]";
        }

        public /* bridge */ /* synthetic */ Object h(String str) {
            k(str);
            throw null;
        }

        /* renamed from: j */
        public boolean[] b(Bundle bundle, String str) {
            return (boolean[]) bundle.get(str);
        }

        public boolean[] k(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* renamed from: l */
        public void i(Bundle bundle, String str, boolean[] zArr) {
            bundle.putBooleanArray(str, zArr);
        }
    }

    /* compiled from: NavType */
    public static final class l<D extends Enum> extends p<D> {

        /* renamed from: n  reason: collision with root package name */
        private final Class<D> f1122n;

        public l(Class<D> cls) {
            super(false, cls);
            if (cls.isEnum()) {
                this.f1122n = cls;
                return;
            }
            throw new IllegalArgumentException(cls + " is not an Enum type.");
        }

        public String c() {
            return this.f1122n.getName();
        }

        /* renamed from: m */
        public D k(String str) {
            for (D d2 : (Enum[]) this.f1122n.getEnumConstants()) {
                if (d2.name().equals(str)) {
                    return d2;
                }
            }
            throw new IllegalArgumentException("Enum value " + str + " not found for type " + this.f1122n.getName() + ".");
        }
    }

    /* compiled from: NavType */
    public static final class m<D extends Parcelable> extends v<D[]> {

        /* renamed from: m  reason: collision with root package name */
        private final Class<D[]> f1123m;

        public m(Class<D> cls) {
            super(true);
            if (Parcelable.class.isAssignableFrom(cls)) {
                try {
                    this.f1123m = Class.forName("[L" + cls.getName() + ";");
                } catch (ClassNotFoundException e2) {
                    throw new RuntimeException(e2);
                }
            } else {
                throw new IllegalArgumentException(cls + " does not implement Parcelable.");
            }
        }

        public String c() {
            return this.f1123m.getName();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || m.class != obj.getClass()) {
                return false;
            }
            return this.f1123m.equals(((m) obj).f1123m);
        }

        public /* bridge */ /* synthetic */ Object h(String str) {
            k(str);
            throw null;
        }

        public int hashCode() {
            return this.f1123m.hashCode();
        }

        /* renamed from: j */
        public D[] b(Bundle bundle, String str) {
            return (Parcelable[]) bundle.get(str);
        }

        public D[] k(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* renamed from: l */
        public void i(Bundle bundle, String str, D[] dArr) {
            this.f1123m.cast(dArr);
            bundle.putParcelableArray(str, dArr);
        }
    }

    /* compiled from: NavType */
    public static final class n<D> extends v<D> {

        /* renamed from: m  reason: collision with root package name */
        private final Class<D> f1124m;

        public n(Class<D> cls) {
            super(true);
            if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
                this.f1124m = cls;
                return;
            }
            throw new IllegalArgumentException(cls + " does not implement Parcelable or Serializable.");
        }

        public D b(Bundle bundle, String str) {
            return bundle.get(str);
        }

        public String c() {
            return this.f1124m.getName();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || n.class != obj.getClass()) {
                return false;
            }
            return this.f1124m.equals(((n) obj).f1124m);
        }

        public D h(String str) {
            throw new UnsupportedOperationException("Parcelables don't support default values.");
        }

        public int hashCode() {
            return this.f1124m.hashCode();
        }

        public void i(Bundle bundle, String str, D d2) {
            this.f1124m.cast(d2);
            if (d2 == null || (d2 instanceof Parcelable)) {
                bundle.putParcelable(str, (Parcelable) d2);
            } else if (d2 instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) d2);
            }
        }
    }

    /* compiled from: NavType */
    public static final class o<D extends Serializable> extends v<D[]> {

        /* renamed from: m  reason: collision with root package name */
        private final Class<D[]> f1125m;

        public o(Class<D> cls) {
            super(true);
            if (Serializable.class.isAssignableFrom(cls)) {
                try {
                    this.f1125m = Class.forName("[L" + cls.getName() + ";");
                } catch (ClassNotFoundException e2) {
                    throw new RuntimeException(e2);
                }
            } else {
                throw new IllegalArgumentException(cls + " does not implement Serializable.");
            }
        }

        public String c() {
            return this.f1125m.getName();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || o.class != obj.getClass()) {
                return false;
            }
            return this.f1125m.equals(((o) obj).f1125m);
        }

        public /* bridge */ /* synthetic */ Object h(String str) {
            k(str);
            throw null;
        }

        public int hashCode() {
            return this.f1125m.hashCode();
        }

        /* renamed from: j */
        public D[] b(Bundle bundle, String str) {
            return (Serializable[]) bundle.get(str);
        }

        public D[] k(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* JADX WARNING: type inference failed for: r4v0, types: [D[], java.lang.Object, java.io.Serializable] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: l */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void i(android.os.Bundle r2, java.lang.String r3, D[] r4) {
            /*
                r1 = this;
                java.lang.Class<D[]> r0 = r1.f1125m
                r0.cast(r4)
                r2.putSerializable(r3, r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.v.o.i(android.os.Bundle, java.lang.String, java.io.Serializable[]):void");
        }
    }

    v(boolean z) {
        this.a = z;
    }

    public static v<?> a(String str, String str2) {
        String str3;
        if (b.c().equals(str)) {
            return b;
        }
        if (f1113d.c().equals(str)) {
            return f1113d;
        }
        if (f1114e.c().equals(str)) {
            return f1114e;
        }
        if (f1115f.c().equals(str)) {
            return f1115f;
        }
        if (f1118i.c().equals(str)) {
            return f1118i;
        }
        if (f1119j.c().equals(str)) {
            return f1119j;
        }
        if (f1120k.c().equals(str)) {
            return f1120k;
        }
        if (f1121l.c().equals(str)) {
            return f1121l;
        }
        if (f1116g.c().equals(str)) {
            return f1116g;
        }
        if (f1117h.c().equals(str)) {
            return f1117h;
        }
        if (c.c().equals(str)) {
            return c;
        }
        if (str == null || str.isEmpty()) {
            return f1120k;
        }
        try {
            if (!str.startsWith(".") || str2 == null) {
                str3 = str;
            } else {
                str3 = str2 + str;
            }
            if (str.endsWith("[]")) {
                str3 = str3.substring(0, str3.length() - 2);
                Class<?> cls = Class.forName(str3);
                if (Parcelable.class.isAssignableFrom(cls)) {
                    return new m(cls);
                }
                if (Serializable.class.isAssignableFrom(cls)) {
                    return new o(cls);
                }
            } else {
                Class<?> cls2 = Class.forName(str3);
                if (Parcelable.class.isAssignableFrom(cls2)) {
                    return new n(cls2);
                }
                if (Enum.class.isAssignableFrom(cls2)) {
                    return new l(cls2);
                }
                if (Serializable.class.isAssignableFrom(cls2)) {
                    return new p(cls2);
                }
            }
            throw new IllegalArgumentException(str3 + " is not Serializable or Parcelable.");
        } catch (ClassNotFoundException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* JADX WARNING: type inference failed for: r1v6, types: [androidx.navigation.v, androidx.navigation.v<java.lang.Float>] */
    /* JADX WARNING: type inference failed for: r1v7, types: [androidx.navigation.v<java.lang.Long>, androidx.navigation.v] */
    /* JADX WARNING: type inference failed for: r1v8, types: [androidx.navigation.v<java.lang.Integer>, androidx.navigation.v] */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:3|4|5) */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:6|7|8) */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:9|10|11) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        f1118i.h(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
        return f1118i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0022, code lost:
        return f1120k;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:?, code lost:
        f1114e.h(r1);
        r1 = f1114e;
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000f, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
        f1116g.h(r1);
        r1 = f1116g;
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
        return r1;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0008 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0010 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0018 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static androidx.navigation.v d(java.lang.String r1) {
        /*
            androidx.navigation.v<java.lang.Integer> r0 = b     // Catch:{ IllegalArgumentException -> 0x0008 }
            r0.h(r1)     // Catch:{ IllegalArgumentException -> 0x0008 }
            androidx.navigation.v<java.lang.Integer> r1 = b     // Catch:{ IllegalArgumentException -> 0x0008 }
            return r1
        L_0x0008:
            androidx.navigation.v<java.lang.Long> r0 = f1114e     // Catch:{ IllegalArgumentException -> 0x0010 }
            r0.h(r1)     // Catch:{ IllegalArgumentException -> 0x0010 }
            androidx.navigation.v<java.lang.Long> r1 = f1114e     // Catch:{ IllegalArgumentException -> 0x0010 }
            return r1
        L_0x0010:
            androidx.navigation.v<java.lang.Float> r0 = f1116g     // Catch:{ IllegalArgumentException -> 0x0018 }
            r0.h(r1)     // Catch:{ IllegalArgumentException -> 0x0018 }
            androidx.navigation.v<java.lang.Float> r1 = f1116g     // Catch:{ IllegalArgumentException -> 0x0018 }
            return r1
        L_0x0018:
            androidx.navigation.v<java.lang.Boolean> r0 = f1118i     // Catch:{ IllegalArgumentException -> 0x0020 }
            r0.h(r1)     // Catch:{ IllegalArgumentException -> 0x0020 }
            androidx.navigation.v<java.lang.Boolean> r1 = f1118i     // Catch:{ IllegalArgumentException -> 0x0020 }
            return r1
        L_0x0020:
            androidx.navigation.v<java.lang.String> r1 = f1120k
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.v.d(java.lang.String):androidx.navigation.v");
    }

    static v e(Object obj) {
        if (obj instanceof Integer) {
            return b;
        }
        if (obj instanceof int[]) {
            return f1113d;
        }
        if (obj instanceof Long) {
            return f1114e;
        }
        if (obj instanceof long[]) {
            return f1115f;
        }
        if (obj instanceof Float) {
            return f1116g;
        }
        if (obj instanceof float[]) {
            return f1117h;
        }
        if (obj instanceof Boolean) {
            return f1118i;
        }
        if (obj instanceof boolean[]) {
            return f1119j;
        }
        if ((obj instanceof String) || obj == null) {
            return f1120k;
        }
        if (obj instanceof String[]) {
            return f1121l;
        }
        if (obj.getClass().isArray() && Parcelable.class.isAssignableFrom(obj.getClass().getComponentType())) {
            return new m(obj.getClass().getComponentType());
        }
        if (obj.getClass().isArray() && Serializable.class.isAssignableFrom(obj.getClass().getComponentType())) {
            return new o(obj.getClass().getComponentType());
        }
        if (obj instanceof Parcelable) {
            return new n(obj.getClass());
        }
        if (obj instanceof Enum) {
            return new l(obj.getClass());
        }
        if (obj instanceof Serializable) {
            return new p(obj.getClass());
        }
        throw new IllegalArgumentException("Object of type " + obj.getClass().getName() + " is not supported for navigation arguments.");
    }

    public abstract T b(Bundle bundle, String str);

    public abstract String c();

    public boolean f() {
        return this.a;
    }

    /* access modifiers changed from: package-private */
    public T g(Bundle bundle, String str, String str2) {
        T h2 = h(str2);
        i(bundle, str, h2);
        return h2;
    }

    public abstract T h(String str);

    public abstract void i(Bundle bundle, String str, T t);

    public String toString() {
        return c();
    }

    /* compiled from: NavType */
    public static class p<D extends Serializable> extends v<D> {

        /* renamed from: m  reason: collision with root package name */
        private final Class<D> f1126m;

        public p(Class<D> cls) {
            super(true);
            if (!Serializable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException(cls + " does not implement Serializable.");
            } else if (!cls.isEnum()) {
                this.f1126m = cls;
            } else {
                throw new IllegalArgumentException(cls + " is an Enum. You should use EnumType instead.");
            }
        }

        public String c() {
            return this.f1126m.getName();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof p)) {
                return false;
            }
            return this.f1126m.equals(((p) obj).f1126m);
        }

        public int hashCode() {
            return this.f1126m.hashCode();
        }

        /* renamed from: j */
        public D b(Bundle bundle, String str) {
            return (Serializable) bundle.get(str);
        }

        /* renamed from: k */
        public D h(String str) {
            throw new UnsupportedOperationException("Serializables don't support default values.");
        }

        /* renamed from: l */
        public void i(Bundle bundle, String str, D d2) {
            this.f1126m.cast(d2);
            bundle.putSerializable(str, d2);
        }

        p(boolean z, Class<D> cls) {
            super(z);
            if (Serializable.class.isAssignableFrom(cls)) {
                this.f1126m = cls;
                return;
            }
            throw new IllegalArgumentException(cls + " does not implement Serializable.");
        }
    }
}
