package e.h.k;

/* compiled from: DisplayCutoutCompat */
public final class c {
    private final Object a;

    private c(Object obj) {
        this.a = obj;
    }

    static c a(Object obj) {
        if (obj == null) {
            return null;
        }
        return new c(obj);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        Object obj2 = this.a;
        if (obj2 != null) {
            return obj2.equals(cVar.a);
        }
        if (cVar.a == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public String toString() {
        return "DisplayCutoutCompat{" + this.a + "}";
    }
}
