package g.e.n.b.g;

import kotlin.jvm.internal.k;

/* compiled from: UserId.kt */
public final class b {
    private final String a;

    public b(String str) {
        k.e(str, "value");
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof b) && k.a(this.a, ((b) obj).a);
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
        return "UserId(value=" + this.a + ")";
    }
}
