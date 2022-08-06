package g.e.n.c;

import kotlin.jvm.internal.k;

/* compiled from: PageConfig.kt */
public final class a {
    private final Integer a;
    private final String b;

    public a(Integer num, String str) {
        this.a = num;
        this.b = str;
    }

    public final Integer a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return k.a(this.a, aVar.a) && k.a(this.b, aVar.b);
    }

    public int hashCode() {
        Integer num = this.a;
        int i2 = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        String str = this.b;
        if (str != null) {
            i2 = str.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        return "PageConfig(itemsPerPage=" + this.a + ", key=" + this.b + ")";
    }
}
