package m.a.c.e;

/* compiled from: Options.kt */
public final class e {
    private boolean a;
    private boolean b;

    public e() {
        this(false, false, 3, (DefaultConstructorMarker) null);
    }

    public e(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean a() {
        return this.b;
    }

    public final boolean b() {
        return this.a;
    }

    public final void c(boolean z) {
        this.a = z;
    }

    public final void d(boolean z) {
        this.b = z;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof e) {
                e eVar = (e) obj;
                if (this.a == eVar.a) {
                    if (this.b == eVar.b) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        boolean z = this.a;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (z ? 1 : 0) * true;
        boolean z3 = this.b;
        if (!z3) {
            z2 = z3;
        }
        return i2 + (z2 ? 1 : 0);
    }

    public String toString() {
        return "Options(isCreatedAtStart=" + this.a + ", override=" + this.b + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(boolean z, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? false : z2);
    }
}
