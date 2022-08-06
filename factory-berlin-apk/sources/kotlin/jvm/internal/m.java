package kotlin.jvm.internal;

/* compiled from: PackageReference.kt */
public final class m implements d {
    private final Class<?> a;

    public m(Class<?> cls, String str) {
        k.e(cls, "jClass");
        k.e(str, "moduleName");
        this.a = cls;
    }

    public Class<?> b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof m) && k.a(b(), ((m) obj).b());
    }

    public int hashCode() {
        return b().hashCode();
    }

    public String toString() {
        return b().toString() + " (Kotlin reflection is not available)";
    }
}
