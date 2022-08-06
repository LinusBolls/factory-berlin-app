package okhttp3.internal.http2;

import kotlin.jvm.internal.k;
import l.i;

/* compiled from: Header.kt */
public final class b {

    /* renamed from: d  reason: collision with root package name */
    public static final i f11336d = i.f11104k.d(":");

    /* renamed from: e  reason: collision with root package name */
    public static final i f11337e = i.f11104k.d(":status");

    /* renamed from: f  reason: collision with root package name */
    public static final i f11338f = i.f11104k.d(":method");

    /* renamed from: g  reason: collision with root package name */
    public static final i f11339g = i.f11104k.d(":path");

    /* renamed from: h  reason: collision with root package name */
    public static final i f11340h = i.f11104k.d(":scheme");

    /* renamed from: i  reason: collision with root package name */
    public static final i f11341i = i.f11104k.d(":authority");
    public final int a;
    public final i b;
    public final i c;

    /* compiled from: Header.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new a((DefaultConstructorMarker) null);
    }

    public b(i iVar, i iVar2) {
        k.f(iVar, "name");
        k.f(iVar2, "value");
        this.b = iVar;
        this.c = iVar2;
        this.a = iVar.G() + 32 + this.c.G();
    }

    public final i a() {
        return this.b;
    }

    public final i b() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return k.a(this.b, bVar.b) && k.a(this.c, bVar.c);
    }

    public int hashCode() {
        i iVar = this.b;
        int i2 = 0;
        int hashCode = (iVar != null ? iVar.hashCode() : 0) * 31;
        i iVar2 = this.c;
        if (iVar2 != null) {
            i2 = iVar2.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        return this.b.L() + ": " + this.c.L();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public b(String str, String str2) {
        this(i.f11104k.d(str), i.f11104k.d(str2));
        k.f(str, "name");
        k.f(str2, "value");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public b(i iVar, String str) {
        this(iVar, i.f11104k.d(str));
        k.f(iVar, "name");
        k.f(str, "value");
    }
}
