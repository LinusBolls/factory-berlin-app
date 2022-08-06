package g.a.a.h;

import kotlin.jvm.internal.k;

/* compiled from: FileUpload.kt */
public final class g {
    private final String a;
    private final String b;

    public g(String str, String str2) {
        k.f(str, "mimetype");
        k.f(str2, "filePath");
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return !(k.a(this.a, gVar.a) ^ true) && !(k.a(this.b, gVar.b) ^ true);
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }
}
