package g.e.n.c.k;

import kotlin.jvm.internal.k;

/* compiled from: User.kt */
public final class a {
    private final String a;

    public a(String str) {
        k.e(str, "id");
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof a) && k.a(this.a, ((a) obj).a);
        }
        return true;
    }

    public int hashCode() {
        String str = this.a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "User(id=" + this.a + ")";
    }
}
