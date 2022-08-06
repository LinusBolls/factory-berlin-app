package g.e.n.c.g;

import kotlin.jvm.internal.k;

/* compiled from: PostBoxCredentials.kt */
public final class e {
    private final String a;
    private final String b;

    public e(String str, String str2) {
        k.e(str, "username");
        k.e(str2, "password");
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
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return k.a(this.a, eVar.a) && k.a(this.b, eVar.b);
    }

    public int hashCode() {
        String str = this.a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        return "PostBoxCredentials(username=" + this.a + ", password=" + this.b + ")";
    }
}
