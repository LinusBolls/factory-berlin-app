package g.e.n.d;

import kotlin.jvm.internal.k;

/* compiled from: MyRenzSettings.kt */
public final class w {
    private final String a;

    public w() {
        this((String) null, 1, (DefaultConstructorMarker) null);
    }

    public w(String str) {
        k.e(str, "apiKey");
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof w) && k.a(this.a, ((w) obj).a);
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
        return "MyRenzSettings(apiKey=" + this.a + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "26268583-4445-4d4f-ea2f-67afd3b75be0" : str);
    }
}
