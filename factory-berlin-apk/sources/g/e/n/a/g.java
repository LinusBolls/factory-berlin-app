package g.e.n.a;

/* compiled from: ScannerRestrictionResult.kt */
public final class g {
    private final boolean a;
    private final long b;

    public g(boolean z, long j2) {
        this.a = z;
        this.b = j2;
    }

    public final boolean a() {
        return this.a;
    }

    public final long b() {
        if (this.a) {
            return 0;
        }
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.a == gVar.a && this.b == gVar.b;
    }

    public int hashCode() {
        boolean z = this.a;
        if (z) {
            z = true;
        }
        long j2 = this.b;
        return ((z ? 1 : 0) * true) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        return "ScannerRestrictionResult(allowedToScan=" + this.a + ", waitingTimeInMillis=" + this.b + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(boolean z, long j2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i2 & 2) != 0 ? 0 : j2);
    }
}
