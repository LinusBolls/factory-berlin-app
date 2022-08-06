package g.e.n.c;

import java.util.List;
import kotlin.jvm.internal.k;

/* compiled from: Paged.kt */
public final class b<T> {
    private final List<T> a;
    private final boolean b;
    private final String c;

    public b(List<? extends T> list, boolean z, String str) {
        k.e(list, "items");
        this.a = list;
        this.b = z;
        this.c = str;
    }

    public final List<T> a() {
        return this.a;
    }

    public final String b() {
        if (this.b) {
            return this.c;
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return k.a(this.a, bVar.a) && this.b == bVar.b && k.a(this.c, bVar.c);
    }

    public int hashCode() {
        List<T> list = this.a;
        int i2 = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        boolean z = this.b;
        if (z) {
            z = true;
        }
        int i3 = (hashCode + (z ? 1 : 0)) * 31;
        String str = this.c;
        if (str != null) {
            i2 = str.hashCode();
        }
        return i3 + i2;
    }

    public String toString() {
        return "Paged(items=" + this.a + ", hasNextPage=" + this.b + ", nextPageKey=" + this.c + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(List list, boolean z, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, z, (i2 & 4) != 0 ? null : str);
    }
}
