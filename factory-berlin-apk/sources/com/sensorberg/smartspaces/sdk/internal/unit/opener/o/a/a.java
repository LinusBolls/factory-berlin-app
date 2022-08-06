package com.sensorberg.smartspaces.sdk.internal.unit.opener.o.a;

import java.util.List;
import kotlin.jvm.internal.k;

/* compiled from: GatewayBleResponse.kt */
public final class a {

    /* renamed from: d  reason: collision with root package name */
    public static final C0411a f6771d = new C0411a((DefaultConstructorMarker) null);
    private final b a;
    private final c b;
    private final String c;

    /* renamed from: com.sensorberg.smartspaces.sdk.internal.unit.opener.o.a.a$a  reason: collision with other inner class name */
    /* compiled from: GatewayBleResponse.kt */
    public static final class C0411a {
        private C0411a() {
        }

        public final a a(String str) {
            k.e(str, "response");
            List n0 = q.n0(str, new String[]{":"}, false, 0, 6, (Object) null);
            return new a(b.f6776k.a((String) v.B(n0, 0)), c.r.a((String) v.B(n0, 1)), (String) v.B(n0, 2));
        }

        public /* synthetic */ C0411a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public a(b bVar, c cVar, String str) {
        k.e(bVar, "code");
        k.e(cVar, "reason");
        this.a = bVar;
        this.b = cVar;
        this.c = str;
    }

    public final b a() {
        return this.a;
    }

    public final String b() {
        return this.c;
    }

    public final c c() {
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
        return k.a(this.a, aVar.a) && k.a(this.b, aVar.b) && k.a(this.c, aVar.c);
    }

    public int hashCode() {
        b bVar = this.a;
        int i2 = 0;
        int hashCode = (bVar != null ? bVar.hashCode() : 0) * 31;
        c cVar = this.b;
        int hashCode2 = (hashCode + (cVar != null ? cVar.hashCode() : 0)) * 31;
        String str = this.c;
        if (str != null) {
            i2 = str.hashCode();
        }
        return hashCode2 + i2;
    }

    public String toString() {
        return "GatewayBleResponse(code=" + this.a + ", reason=" + this.b + ", freeText=" + this.c + ")";
    }
}
