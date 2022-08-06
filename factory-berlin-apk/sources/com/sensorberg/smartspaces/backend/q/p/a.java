package com.sensorberg.smartspaces.backend.q.p;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.k;

/* compiled from: Error.kt */
public final class a {
    private final String a;
    private final List<C0349a> b;
    private final Map<String, Object> c;

    /* renamed from: com.sensorberg.smartspaces.backend.q.p.a$a  reason: collision with other inner class name */
    /* compiled from: Error.kt */
    public static final class C0349a {
        private final long a;
        private final long b;

        public C0349a() {
            this(0, 0, 3, (DefaultConstructorMarker) null);
        }

        public C0349a(long j2, long j3) {
            this.a = j2;
            this.b = j3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0349a)) {
                return false;
            }
            C0349a aVar = (C0349a) obj;
            return this.a == aVar.a && this.b == aVar.b;
        }

        public int hashCode() {
            return (c.a(this.a) * 31) + c.a(this.b);
        }

        public String toString() {
            return "Location(line=" + this.a + ", column=" + this.b + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C0349a(long j2, long j3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 0 : j2, (i2 & 2) != 0 ? 0 : j3);
        }
    }

    public a() {
        this((String) null, (List) null, (Map) null, 7, (DefaultConstructorMarker) null);
    }

    public a(String str, List<C0349a> list, Map<String, ? extends Object> map) {
        k.e(map, "customAttributes");
        this.a = str;
        this.b = list;
        this.c = map;
    }

    public final String a() {
        return this.a;
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
        String str = this.a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List<C0349a> list = this.b;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        Map<String, Object> map = this.c;
        if (map != null) {
            i2 = map.hashCode();
        }
        return hashCode2 + i2;
    }

    public String toString() {
        return "Error(message=" + this.a + ", locations=" + this.b + ", customAttributes=" + this.c + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(String str, List list, Map map, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : list, (i2 & 4) != 0 ? e0.e() : map);
    }
}
