package com.sensorberg.smartworkspace.app.screens.spaces.iotdetails;

import com.sensorberg.smartspaces.sdk.model.Property;
import java.util.List;
import kotlin.jvm.internal.k;

/* compiled from: Widget.kt */
public abstract class e {

    /* compiled from: Widget.kt */
    public static final class a extends e {
        private final long a;
        private final boolean b;
        private final int c;

        /* renamed from: d  reason: collision with root package name */
        private final List<String> f7943d;

        public long a() {
            return this.a;
        }

        public final int b() {
            return this.c;
        }

        public final List<String> c() {
            return this.f7943d;
        }

        public final boolean d() {
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
            return a() == aVar.a() && this.b == aVar.b && this.c == aVar.c && k.a(this.f7943d, aVar.f7943d);
        }

        public int hashCode() {
            int a2 = defpackage.c.a(a()) * 31;
            boolean z = this.b;
            if (z) {
                z = true;
            }
            int i2 = (((a2 + (z ? 1 : 0)) * 31) + this.c) * 31;
            List<String> list = this.f7943d;
            return i2 + (list != null ? list.hashCode() : 0);
        }

        public String toString() {
            return "ButtonRow(id=" + a() + ", isLoading=" + this.b + ", selected=" + this.c + ", texts=" + this.f7943d + ")";
        }
    }

    /* compiled from: Widget.kt */
    public static final class b extends e {
        private final long a;
        private final String b;
        private final boolean c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f7944d;

        /* renamed from: e  reason: collision with root package name */
        private final int f7945e;

        public b(long j2, String str, boolean z, boolean z2, int i2) {
            super((DefaultConstructorMarker) null);
            this.a = j2;
            this.b = str;
            this.c = z;
            this.f7944d = z2;
            this.f7945e = i2;
        }

        public long a() {
            return this.a;
        }

        public final int b() {
            return this.f7945e;
        }

        public final String c() {
            return this.b;
        }

        public final boolean d() {
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
            return a() == bVar.a() && k.a(this.b, bVar.b) && this.c == bVar.c && this.f7944d == bVar.f7944d && this.f7945e == bVar.f7945e;
        }

        public int hashCode() {
            int a2 = defpackage.c.a(a()) * 31;
            String str = this.b;
            int hashCode = (a2 + (str != null ? str.hashCode() : 0)) * 31;
            boolean z = this.c;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i2 = (hashCode + (z ? 1 : 0)) * 31;
            boolean z3 = this.f7944d;
            if (!z3) {
                z2 = z3;
            }
            return ((i2 + (z2 ? 1 : 0)) * 31) + this.f7945e;
        }

        public String toString() {
            return "Header(id=" + a() + ", title=" + this.b + ", isEditable=" + this.c + ", isLoading=" + this.f7944d + ", icon=" + this.f7945e + ")";
        }
    }

    /* compiled from: Widget.kt */
    public static final class c extends e {
        private final long a;
        private final String b;
        private final String c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(long j2, String str, String str2) {
            super((DefaultConstructorMarker) null);
            k.e(str, "line1");
            k.e(str2, "line2");
            this.a = j2;
            this.b = str;
            this.c = str2;
        }

        public long a() {
            return this.a;
        }

        public final String b() {
            return this.b;
        }

        public final String c() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return a() == cVar.a() && k.a(this.b, cVar.b) && k.a(this.c, cVar.c);
        }

        public int hashCode() {
            int a2 = defpackage.c.a(a()) * 31;
            String str = this.b;
            int i2 = 0;
            int hashCode = (a2 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.c;
            if (str2 != null) {
                i2 = str2.hashCode();
            }
            return hashCode + i2;
        }

        public String toString() {
            return "Info(id=" + a() + ", line1=" + this.b + ", line2=" + this.c + ")";
        }
    }

    /* compiled from: Widget.kt */
    public static final class d extends e {
        private final long a;
        private final Property.Numeric b;
        private final String c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f7946d;

        /* renamed from: e  reason: collision with root package name */
        private final int f7947e;

        /* renamed from: f  reason: collision with root package name */
        private final com.sensorberg.smartworkspace.app.utils.k f7948f;

        /* renamed from: g  reason: collision with root package name */
        private final String f7949g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(long j2, Property.Numeric numeric, String str, boolean z, int i2, com.sensorberg.smartworkspace.app.utils.k kVar, String str2) {
            super((DefaultConstructorMarker) null);
            k.e(numeric, "property");
            k.e(str, "title");
            k.e(kVar, "scale");
            k.e(str2, "unit");
            this.a = j2;
            this.b = numeric;
            this.c = str;
            this.f7946d = z;
            this.f7947e = i2;
            this.f7948f = kVar;
            this.f7949g = str2;
        }

        public static /* synthetic */ d c(d dVar, long j2, Property.Numeric numeric, String str, boolean z, int i2, com.sensorberg.smartworkspace.app.utils.k kVar, String str2, int i3, Object obj) {
            d dVar2 = dVar;
            return dVar.b((i3 & 1) != 0 ? dVar.a() : j2, (i3 & 2) != 0 ? dVar2.b : numeric, (i3 & 4) != 0 ? dVar2.c : str, (i3 & 8) != 0 ? dVar2.f7946d : z, (i3 & 16) != 0 ? dVar2.f7947e : i2, (i3 & 32) != 0 ? dVar2.f7948f : kVar, (i3 & 64) != 0 ? dVar2.f7949g : str2);
        }

        public long a() {
            return this.a;
        }

        public final d b(long j2, Property.Numeric numeric, String str, boolean z, int i2, com.sensorberg.smartworkspace.app.utils.k kVar, String str2) {
            k.e(numeric, "property");
            k.e(str, "title");
            com.sensorberg.smartworkspace.app.utils.k kVar2 = kVar;
            k.e(kVar2, "scale");
            String str3 = str2;
            k.e(str3, "unit");
            return new d(j2, numeric, str, z, i2, kVar2, str3);
        }

        public final Property.Numeric d() {
            return this.b;
        }

        public final com.sensorberg.smartworkspace.app.utils.k e() {
            return this.f7948f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return a() == dVar.a() && k.a(this.b, dVar.b) && k.a(this.c, dVar.c) && this.f7946d == dVar.f7946d && this.f7947e == dVar.f7947e && k.a(this.f7948f, dVar.f7948f) && k.a(this.f7949g, dVar.f7949g);
        }

        public final String f() {
            return this.c;
        }

        public final String g() {
            return this.f7949g;
        }

        public final int h() {
            return this.f7947e;
        }

        public int hashCode() {
            int a2 = defpackage.c.a(a()) * 31;
            Property.Numeric numeric = this.b;
            int i2 = 0;
            int hashCode = (a2 + (numeric != null ? numeric.hashCode() : 0)) * 31;
            String str = this.c;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
            boolean z = this.f7946d;
            if (z) {
                z = true;
            }
            int i3 = (((hashCode2 + (z ? 1 : 0)) * 31) + this.f7947e) * 31;
            com.sensorberg.smartworkspace.app.utils.k kVar = this.f7948f;
            int hashCode3 = (i3 + (kVar != null ? kVar.hashCode() : 0)) * 31;
            String str2 = this.f7949g;
            if (str2 != null) {
                i2 = str2.hashCode();
            }
            return hashCode3 + i2;
        }

        public final boolean i() {
            return this.f7946d;
        }

        public String toString() {
            return "SeekBar(id=" + a() + ", property=" + this.b + ", title=" + this.c + ", isLoading=" + this.f7946d + ", value=" + this.f7947e + ", scale=" + this.f7948f + ", unit=" + this.f7949g + ")";
        }
    }

    /* renamed from: com.sensorberg.smartworkspace.app.screens.spaces.iotdetails.e$e  reason: collision with other inner class name */
    /* compiled from: Widget.kt */
    public static final class C0532e extends e {
        private final long a;
        private final Property.Binary b;
        private final String c;

        /* renamed from: d  reason: collision with root package name */
        private final String f7950d;

        /* renamed from: e  reason: collision with root package name */
        private final boolean f7951e;

        /* renamed from: f  reason: collision with root package name */
        private final boolean f7952f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0532e(long j2, Property.Binary binary, String str, String str2, boolean z, boolean z2) {
            super((DefaultConstructorMarker) null);
            k.e(binary, "property");
            k.e(str, "title");
            this.a = j2;
            this.b = binary;
            this.c = str;
            this.f7950d = str2;
            this.f7951e = z;
            this.f7952f = z2;
        }

        public static /* synthetic */ C0532e c(C0532e eVar, long j2, Property.Binary binary, String str, String str2, boolean z, boolean z2, int i2, Object obj) {
            C0532e eVar2 = eVar;
            return eVar.b((i2 & 1) != 0 ? eVar.a() : j2, (i2 & 2) != 0 ? eVar2.b : binary, (i2 & 4) != 0 ? eVar2.c : str, (i2 & 8) != 0 ? eVar2.f7950d : str2, (i2 & 16) != 0 ? eVar2.f7951e : z, (i2 & 32) != 0 ? eVar2.f7952f : z2);
        }

        public long a() {
            return this.a;
        }

        public final C0532e b(long j2, Property.Binary binary, String str, String str2, boolean z, boolean z2) {
            k.e(binary, "property");
            k.e(str, "title");
            return new C0532e(j2, binary, str, str2, z, z2);
        }

        public final Property.Binary d() {
            return this.b;
        }

        public final boolean e() {
            return this.f7952f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0532e)) {
                return false;
            }
            C0532e eVar = (C0532e) obj;
            return a() == eVar.a() && k.a(this.b, eVar.b) && k.a(this.c, eVar.c) && k.a(this.f7950d, eVar.f7950d) && this.f7951e == eVar.f7951e && this.f7952f == eVar.f7952f;
        }

        public final String f() {
            return this.f7950d;
        }

        public final String g() {
            return this.c;
        }

        public final boolean h() {
            return this.f7951e;
        }

        public int hashCode() {
            int a2 = defpackage.c.a(a()) * 31;
            Property.Binary binary = this.b;
            int i2 = 0;
            int hashCode = (a2 + (binary != null ? binary.hashCode() : 0)) * 31;
            String str = this.c;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f7950d;
            if (str2 != null) {
                i2 = str2.hashCode();
            }
            int i3 = (hashCode2 + i2) * 31;
            boolean z = this.f7951e;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i4 = (i3 + (z ? 1 : 0)) * 31;
            boolean z3 = this.f7952f;
            if (!z3) {
                z2 = z3;
            }
            return i4 + (z2 ? 1 : 0);
        }

        public String toString() {
            return "Switch(id=" + a() + ", property=" + this.b + ", title=" + this.c + ", subtitle=" + this.f7950d + ", isLoading=" + this.f7951e + ", state=" + this.f7952f + ")";
        }
    }

    private e() {
    }

    public abstract long a();

    public /* synthetic */ e(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
