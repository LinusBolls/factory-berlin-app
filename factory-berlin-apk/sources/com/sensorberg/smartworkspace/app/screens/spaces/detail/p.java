package com.sensorberg.smartworkspace.app.screens.spaces.detail;

import android.graphics.drawable.Drawable;
import com.sensorberg.smartspaces.sdk.model.IotDevice;
import com.sensorberg.smartspaces.sdk.model.Property;
import com.sensorberg.smartworkspace.app.screens.spaces.IotDeviceIdentifier;
import kotlin.jvm.internal.k;

/* compiled from: Widget.kt */
public abstract class p {

    /* compiled from: Widget.kt */
    public static final class a extends p {

        /* renamed from: e  reason: collision with root package name */
        public static final C0525a f7865e = new C0525a((DefaultConstructorMarker) null);
        private final String a;
        private final String b;
        private final String c;

        /* renamed from: d  reason: collision with root package name */
        private final IotDeviceIdentifier f7866d;

        /* renamed from: com.sensorberg.smartworkspace.app.screens.spaces.detail.p$a$a  reason: collision with other inner class name */
        /* compiled from: Widget.kt */
        public static final class C0525a {
            private C0525a() {
            }

            public final a a(String str, String str2, IotDeviceIdentifier iotDeviceIdentifier) {
                k.e(str, "deviceId");
                k.e(iotDeviceIdentifier, "iotDeviceIdentifier");
                return new a(str + "_details", str, str2, iotDeviceIdentifier, (DefaultConstructorMarker) null);
            }

            public /* synthetic */ C0525a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* compiled from: Widget.kt */
        public interface b {
            void g(a aVar);
        }

        public /* synthetic */ a(String str, String str2, String str3, IotDeviceIdentifier iotDeviceIdentifier, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, iotDeviceIdentifier);
        }

        public String a() {
            return this.a;
        }

        public final String b() {
            return this.b;
        }

        public final IotDeviceIdentifier c() {
            return this.f7866d;
        }

        public final String d() {
            return this.c;
        }

        private a(String str, String str2, String str3, IotDeviceIdentifier iotDeviceIdentifier) {
            super((DefaultConstructorMarker) null);
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.f7866d = iotDeviceIdentifier;
        }
    }

    /* compiled from: Widget.kt */
    public static final class b extends p {
        public static final a b = new a((DefaultConstructorMarker) null);
        private final String a;

        /* compiled from: Widget.kt */
        public static final class a {
            private a() {
            }

            public final b a(String str) {
                k.e(str, "deviceId");
                return new b(str + "_divider", (DefaultConstructorMarker) null);
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        private b(String str) {
            super((DefaultConstructorMarker) null);
            this.a = str;
        }

        public String a() {
            return this.a;
        }

        public /* synthetic */ b(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }
    }

    /* compiled from: Widget.kt */
    public static abstract class d extends p {

        /* compiled from: Widget.kt */
        public static final class a extends d {
            private final String a;
            private final Drawable b;
            private final String c;

            /* renamed from: d  reason: collision with root package name */
            private final IotDeviceIdentifier f7867d;

            /* renamed from: com.sensorberg.smartworkspace.app.screens.spaces.detail.p$d$a$a  reason: collision with other inner class name */
            /* compiled from: Widget.kt */
            public interface C0526a {
                void f(a aVar);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(String str, Drawable drawable, String str2, IotDeviceIdentifier iotDeviceIdentifier) {
                super((DefaultConstructorMarker) null);
                k.e(str, "widgetId");
                k.e(drawable, "icon");
                k.e(str2, "status");
                k.e(iotDeviceIdentifier, "iotDeviceIdentifier");
                this.a = str;
                this.b = drawable;
                this.c = str2;
                this.f7867d = iotDeviceIdentifier;
            }

            public String a() {
                return this.a;
            }

            public final Drawable b() {
                return this.b;
            }

            public final IotDeviceIdentifier c() {
                return this.f7867d;
            }

            public final String d() {
                return this.c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return k.a(a(), aVar.a()) && k.a(this.b, aVar.b) && k.a(this.c, aVar.c) && k.a(this.f7867d, aVar.f7867d);
            }

            public int hashCode() {
                String a2 = a();
                int i2 = 0;
                int hashCode = (a2 != null ? a2.hashCode() : 0) * 31;
                Drawable drawable = this.b;
                int hashCode2 = (hashCode + (drawable != null ? drawable.hashCode() : 0)) * 31;
                String str = this.c;
                int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
                IotDeviceIdentifier iotDeviceIdentifier = this.f7867d;
                if (iotDeviceIdentifier != null) {
                    i2 = iotDeviceIdentifier.hashCode();
                }
                return hashCode3 + i2;
            }

            public String toString() {
                return "MiniIcon(widgetId=" + a() + ", icon=" + this.b + ", status=" + this.c + ", iotDeviceIdentifier=" + this.f7867d + ")";
            }
        }

        /* compiled from: Widget.kt */
        public static final class b extends d {
            private final String a = "more_id";
            private final String b;

            /* compiled from: Widget.kt */
            public interface a {
                void m();
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public b(String str) {
                super((DefaultConstructorMarker) null);
                k.e(str, "label");
                this.b = str;
            }

            public String a() {
                return this.a;
            }

            public final String b() {
                return this.b;
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    return (obj instanceof b) && k.a(this.b, ((b) obj).b);
                }
                return true;
            }

            public int hashCode() {
                String str = this.b;
                if (str != null) {
                    return str.hashCode();
                }
                return 0;
            }

            public String toString() {
                return "MoreButton(label=" + this.b + ")";
            }
        }

        private d() {
            super((DefaultConstructorMarker) null);
        }

        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: Widget.kt */
    public static abstract class e extends p {

        /* compiled from: Widget.kt */
        public static final class a extends e {
            private final String a;
            private final String b;
            private final com.sensorberg.smartworkspace.app.screens.spaces.b c;

            /* renamed from: d  reason: collision with root package name */
            private final String f7868d;

            /* renamed from: e  reason: collision with root package name */
            private final boolean f7869e;

            /* renamed from: f  reason: collision with root package name */
            private final IotDeviceIdentifier f7870f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(String str, String str2, com.sensorberg.smartworkspace.app.screens.spaces.b bVar, String str3, boolean z, IotDeviceIdentifier iotDeviceIdentifier) {
                super((DefaultConstructorMarker) null);
                k.e(str, "widgetId");
                k.e(bVar, "iotDeviceIcon");
                k.e(iotDeviceIdentifier, "iotDeviceIdentifier");
                this.a = str;
                this.b = str2;
                this.c = bVar;
                this.f7868d = str3;
                this.f7869e = z;
                this.f7870f = iotDeviceIdentifier;
            }

            public String a() {
                return this.a;
            }

            public boolean b() {
                return this.f7869e;
            }

            public IotDeviceIdentifier c() {
                return this.f7870f;
            }

            public String d() {
                return this.b;
            }

            public int e() {
                return this.c.a();
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return k.a(a(), aVar.a()) && k.a(d(), aVar.d()) && k.a(this.c, aVar.c) && k.a(f(), aVar.f()) && b() == aVar.b() && k.a(c(), aVar.c());
            }

            public String f() {
                return this.f7868d;
            }

            public int hashCode() {
                String a2 = a();
                int i2 = 0;
                int hashCode = (a2 != null ? a2.hashCode() : 0) * 31;
                String d2 = d();
                int hashCode2 = (hashCode + (d2 != null ? d2.hashCode() : 0)) * 31;
                com.sensorberg.smartworkspace.app.screens.spaces.b bVar = this.c;
                int hashCode3 = (hashCode2 + (bVar != null ? bVar.hashCode() : 0)) * 31;
                String f2 = f();
                int hashCode4 = (hashCode3 + (f2 != null ? f2.hashCode() : 0)) * 31;
                boolean b2 = b();
                if (b2) {
                    b2 = true;
                }
                int i3 = (hashCode4 + (b2 ? 1 : 0)) * 31;
                IotDeviceIdentifier c2 = c();
                if (c2 != null) {
                    i2 = c2.hashCode();
                }
                return i3 + i2;
            }

            public String toString() {
                return "IconRow(widgetId=" + a() + ", name=" + d() + ", iotDeviceIcon=" + this.c + ", status=" + f() + ", hasSubWidgets=" + b() + ", iotDeviceIdentifier=" + c() + ")";
            }
        }

        /* compiled from: Widget.kt */
        public static final class b extends e {
            private final IotDevice a;
            private final Property.Binary b;
            private final String c;

            /* renamed from: d  reason: collision with root package name */
            private final String f7871d;

            /* renamed from: e  reason: collision with root package name */
            private final com.sensorberg.smartworkspace.app.screens.spaces.b f7872e;

            /* renamed from: f  reason: collision with root package name */
            private final String f7873f;

            /* renamed from: g  reason: collision with root package name */
            private final String f7874g;

            /* renamed from: h  reason: collision with root package name */
            private final boolean f7875h;

            /* renamed from: i  reason: collision with root package name */
            private final IotDeviceIdentifier f7876i;

            /* renamed from: j  reason: collision with root package name */
            private final boolean f7877j;

            /* compiled from: Widget.kt */
            public interface a {
                void p(b bVar);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public b(IotDevice iotDevice, Property.Binary binary, String str, String str2, com.sensorberg.smartworkspace.app.screens.spaces.b bVar, String str3, String str4, boolean z, IotDeviceIdentifier iotDeviceIdentifier, boolean z2) {
                super((DefaultConstructorMarker) null);
                k.e(iotDevice, "iotDevice");
                k.e(binary, "property");
                k.e(str, "widgetId");
                k.e(bVar, "iotDeviceIcon");
                k.e(str4, "buttonLabel");
                k.e(iotDeviceIdentifier, "iotDeviceIdentifier");
                this.a = iotDevice;
                this.b = binary;
                this.c = str;
                this.f7871d = str2;
                this.f7872e = bVar;
                this.f7873f = str3;
                this.f7874g = str4;
                this.f7875h = z;
                this.f7876i = iotDeviceIdentifier;
                this.f7877j = z2;
            }

            public String a() {
                return this.c;
            }

            public boolean b() {
                return this.f7875h;
            }

            public IotDeviceIdentifier c() {
                return this.f7876i;
            }

            public String d() {
                return this.f7871d;
            }

            public final String e() {
                return this.f7874g;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return k.a(this.a, bVar.a) && k.a(this.b, bVar.b) && k.a(a(), bVar.a()) && k.a(d(), bVar.d()) && k.a(this.f7872e, bVar.f7872e) && k.a(i(), bVar.i()) && k.a(this.f7874g, bVar.f7874g) && b() == bVar.b() && k.a(c(), bVar.c()) && this.f7877j == bVar.f7877j;
            }

            public int f() {
                return this.f7872e.a();
            }

            public final IotDevice g() {
                return this.a;
            }

            public final Property.Binary h() {
                return this.b;
            }

            public int hashCode() {
                IotDevice iotDevice = this.a;
                int i2 = 0;
                int hashCode = (iotDevice != null ? iotDevice.hashCode() : 0) * 31;
                Property.Binary binary = this.b;
                int hashCode2 = (hashCode + (binary != null ? binary.hashCode() : 0)) * 31;
                String a2 = a();
                int hashCode3 = (hashCode2 + (a2 != null ? a2.hashCode() : 0)) * 31;
                String d2 = d();
                int hashCode4 = (hashCode3 + (d2 != null ? d2.hashCode() : 0)) * 31;
                com.sensorberg.smartworkspace.app.screens.spaces.b bVar = this.f7872e;
                int hashCode5 = (hashCode4 + (bVar != null ? bVar.hashCode() : 0)) * 31;
                String i3 = i();
                int hashCode6 = (hashCode5 + (i3 != null ? i3.hashCode() : 0)) * 31;
                String str = this.f7874g;
                int hashCode7 = (hashCode6 + (str != null ? str.hashCode() : 0)) * 31;
                boolean b2 = b();
                boolean z = true;
                if (b2) {
                    b2 = true;
                }
                int i4 = (hashCode7 + (b2 ? 1 : 0)) * 31;
                IotDeviceIdentifier c2 = c();
                if (c2 != null) {
                    i2 = c2.hashCode();
                }
                int i5 = (i4 + i2) * 31;
                boolean z2 = this.f7877j;
                if (!z2) {
                    z = z2;
                }
                return i5 + (z ? 1 : 0);
            }

            public String i() {
                return this.f7873f;
            }

            public final boolean j() {
                return this.f7877j;
            }

            public String toString() {
                return "IconRowButton(iotDevice=" + this.a + ", property=" + this.b + ", widgetId=" + a() + ", name=" + d() + ", iotDeviceIcon=" + this.f7872e + ", status=" + i() + ", buttonLabel=" + this.f7874g + ", hasSubWidgets=" + b() + ", iotDeviceIdentifier=" + c() + ", isLoading=" + this.f7877j + ")";
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ b(IotDevice iotDevice, Property.Binary binary, String str, String str2, com.sensorberg.smartworkspace.app.screens.spaces.b bVar, String str3, String str4, boolean z, IotDeviceIdentifier iotDeviceIdentifier, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this(iotDevice, binary, str, str2, bVar, str3, str4, z, iotDeviceIdentifier, (i2 & 512) != 0 ? false : z2);
            }
        }

        /* compiled from: Widget.kt */
        public interface c {
            void b(e eVar);
        }

        /* compiled from: Widget.kt */
        public static final class d extends e {
            private final IotDevice a;
            private final Property.Binary b;
            private final String c;

            /* renamed from: d  reason: collision with root package name */
            private final String f7878d;

            /* renamed from: e  reason: collision with root package name */
            private final com.sensorberg.smartworkspace.app.screens.spaces.b f7879e;

            /* renamed from: f  reason: collision with root package name */
            private final String f7880f;

            /* renamed from: g  reason: collision with root package name */
            private final boolean f7881g;

            /* renamed from: h  reason: collision with root package name */
            private final IotDeviceIdentifier f7882h;

            /* renamed from: i  reason: collision with root package name */
            private final boolean f7883i;

            /* compiled from: Widget.kt */
            public interface a {
                void e(d dVar, boolean z);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public d(IotDevice iotDevice, Property.Binary binary, String str, String str2, com.sensorberg.smartworkspace.app.screens.spaces.b bVar, String str3, boolean z, IotDeviceIdentifier iotDeviceIdentifier, boolean z2) {
                super((DefaultConstructorMarker) null);
                k.e(iotDevice, "iotDevice");
                k.e(binary, "property");
                k.e(str, "widgetId");
                k.e(bVar, "iotDeviceIcon");
                k.e(iotDeviceIdentifier, "iotDeviceIdentifier");
                this.a = iotDevice;
                this.b = binary;
                this.c = str;
                this.f7878d = str2;
                this.f7879e = bVar;
                this.f7880f = str3;
                this.f7881g = z;
                this.f7882h = iotDeviceIdentifier;
                this.f7883i = z2;
            }

            public static /* synthetic */ d f(d dVar, IotDevice iotDevice, Property.Binary binary, String str, String str2, com.sensorberg.smartworkspace.app.screens.spaces.b bVar, String str3, boolean z, IotDeviceIdentifier iotDeviceIdentifier, boolean z2, int i2, Object obj) {
                d dVar2 = dVar;
                int i3 = i2;
                return dVar.e((i3 & 1) != 0 ? dVar2.a : iotDevice, (i3 & 2) != 0 ? dVar2.b : binary, (i3 & 4) != 0 ? dVar.a() : str, (i3 & 8) != 0 ? dVar.d() : str2, (i3 & 16) != 0 ? dVar2.f7879e : bVar, (i3 & 32) != 0 ? dVar.j() : str3, (i3 & 64) != 0 ? dVar.b() : z, (i3 & 128) != 0 ? dVar.c() : iotDeviceIdentifier, (i3 & 256) != 0 ? dVar2.f7883i : z2);
            }

            public String a() {
                return this.c;
            }

            public boolean b() {
                return this.f7881g;
            }

            public IotDeviceIdentifier c() {
                return this.f7882h;
            }

            public String d() {
                return this.f7878d;
            }

            public final d e(IotDevice iotDevice, Property.Binary binary, String str, String str2, com.sensorberg.smartworkspace.app.screens.spaces.b bVar, String str3, boolean z, IotDeviceIdentifier iotDeviceIdentifier, boolean z2) {
                k.e(iotDevice, "iotDevice");
                k.e(binary, "property");
                k.e(str, "widgetId");
                com.sensorberg.smartworkspace.app.screens.spaces.b bVar2 = bVar;
                k.e(bVar2, "iotDeviceIcon");
                IotDeviceIdentifier iotDeviceIdentifier2 = iotDeviceIdentifier;
                k.e(iotDeviceIdentifier2, "iotDeviceIdentifier");
                return new d(iotDevice, binary, str, str2, bVar2, str3, z, iotDeviceIdentifier2, z2);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return k.a(this.a, dVar.a) && k.a(this.b, dVar.b) && k.a(a(), dVar.a()) && k.a(d(), dVar.d()) && k.a(this.f7879e, dVar.f7879e) && k.a(j(), dVar.j()) && b() == dVar.b() && k.a(c(), dVar.c()) && this.f7883i == dVar.f7883i;
            }

            public int g() {
                return this.f7879e.a();
            }

            public final IotDevice h() {
                return this.a;
            }

            public int hashCode() {
                IotDevice iotDevice = this.a;
                int i2 = 0;
                int hashCode = (iotDevice != null ? iotDevice.hashCode() : 0) * 31;
                Property.Binary binary = this.b;
                int hashCode2 = (hashCode + (binary != null ? binary.hashCode() : 0)) * 31;
                String a2 = a();
                int hashCode3 = (hashCode2 + (a2 != null ? a2.hashCode() : 0)) * 31;
                String d2 = d();
                int hashCode4 = (hashCode3 + (d2 != null ? d2.hashCode() : 0)) * 31;
                com.sensorberg.smartworkspace.app.screens.spaces.b bVar = this.f7879e;
                int hashCode5 = (hashCode4 + (bVar != null ? bVar.hashCode() : 0)) * 31;
                String j2 = j();
                int hashCode6 = (hashCode5 + (j2 != null ? j2.hashCode() : 0)) * 31;
                boolean b2 = b();
                boolean z = true;
                if (b2) {
                    b2 = true;
                }
                int i3 = (hashCode6 + (b2 ? 1 : 0)) * 31;
                IotDeviceIdentifier c2 = c();
                if (c2 != null) {
                    i2 = c2.hashCode();
                }
                int i4 = (i3 + i2) * 31;
                boolean z2 = this.f7883i;
                if (!z2) {
                    z = z2;
                }
                return i4 + (z ? 1 : 0);
            }

            public final Property.Binary i() {
                return this.b;
            }

            public String j() {
                return this.f7880f;
            }

            public final boolean k() {
                return this.f7883i;
            }

            public String toString() {
                return "IconRowSwitch(iotDevice=" + this.a + ", property=" + this.b + ", widgetId=" + a() + ", name=" + d() + ", iotDeviceIcon=" + this.f7879e + ", status=" + j() + ", hasSubWidgets=" + b() + ", iotDeviceIdentifier=" + c() + ", isLoading=" + this.f7883i + ")";
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ d(IotDevice iotDevice, Property.Binary binary, String str, String str2, com.sensorberg.smartworkspace.app.screens.spaces.b bVar, String str3, boolean z, IotDeviceIdentifier iotDeviceIdentifier, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this(iotDevice, binary, str, str2, bVar, str3, z, iotDeviceIdentifier, (i2 & 256) != 0 ? false : z2);
            }
        }

        private e() {
            super((DefaultConstructorMarker) null);
        }

        public abstract boolean b();

        public abstract IotDeviceIdentifier c();

        public abstract String d();

        public /* synthetic */ e(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: Widget.kt */
    public static final class f extends p {
        private final IotDevice a;
        private final Property.Numeric b;
        private final String c;

        /* renamed from: d  reason: collision with root package name */
        private final String f7884d;

        /* renamed from: e  reason: collision with root package name */
        private final boolean f7885e;

        /* renamed from: f  reason: collision with root package name */
        private final com.sensorberg.smartworkspace.app.utils.k f7886f;

        /* renamed from: g  reason: collision with root package name */
        private final String f7887g;

        /* compiled from: Widget.kt */
        public interface a {
            void q(f fVar, int i2);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(IotDevice iotDevice, Property.Numeric numeric, String str, String str2, boolean z, com.sensorberg.smartworkspace.app.utils.k kVar, String str3) {
            super((DefaultConstructorMarker) null);
            k.e(iotDevice, "iotDevice");
            k.e(numeric, "property");
            k.e(str, "widgetId");
            k.e(str2, "title");
            k.e(kVar, "scale");
            k.e(str3, "unit");
            this.a = iotDevice;
            this.b = numeric;
            this.c = str;
            this.f7884d = str2;
            this.f7885e = z;
            this.f7886f = kVar;
            this.f7887g = str3;
        }

        public static /* synthetic */ f c(f fVar, IotDevice iotDevice, Property.Numeric numeric, String str, String str2, boolean z, com.sensorberg.smartworkspace.app.utils.k kVar, String str3, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                iotDevice = fVar.a;
            }
            if ((i2 & 2) != 0) {
                numeric = fVar.b;
            }
            Property.Numeric numeric2 = numeric;
            if ((i2 & 4) != 0) {
                str = fVar.a();
            }
            String str4 = str;
            if ((i2 & 8) != 0) {
                str2 = fVar.f7884d;
            }
            String str5 = str2;
            if ((i2 & 16) != 0) {
                z = fVar.f7885e;
            }
            boolean z2 = z;
            if ((i2 & 32) != 0) {
                kVar = fVar.f7886f;
            }
            com.sensorberg.smartworkspace.app.utils.k kVar2 = kVar;
            if ((i2 & 64) != 0) {
                str3 = fVar.f7887g;
            }
            return fVar.b(iotDevice, numeric2, str4, str5, z2, kVar2, str3);
        }

        public String a() {
            return this.c;
        }

        public final f b(IotDevice iotDevice, Property.Numeric numeric, String str, String str2, boolean z, com.sensorberg.smartworkspace.app.utils.k kVar, String str3) {
            k.e(iotDevice, "iotDevice");
            k.e(numeric, "property");
            k.e(str, "widgetId");
            k.e(str2, "title");
            k.e(kVar, "scale");
            String str4 = str3;
            k.e(str4, "unit");
            return new f(iotDevice, numeric, str, str2, z, kVar, str4);
        }

        public final IotDevice d() {
            return this.a;
        }

        public final Property.Numeric e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return k.a(this.a, fVar.a) && k.a(this.b, fVar.b) && k.a(a(), fVar.a()) && k.a(this.f7884d, fVar.f7884d) && this.f7885e == fVar.f7885e && k.a(this.f7886f, fVar.f7886f) && k.a(this.f7887g, fVar.f7887g);
        }

        public final com.sensorberg.smartworkspace.app.utils.k f() {
            return this.f7886f;
        }

        public final String g() {
            return this.f7884d;
        }

        public final String h() {
            return this.f7887g;
        }

        public int hashCode() {
            IotDevice iotDevice = this.a;
            int i2 = 0;
            int hashCode = (iotDevice != null ? iotDevice.hashCode() : 0) * 31;
            Property.Numeric numeric = this.b;
            int hashCode2 = (hashCode + (numeric != null ? numeric.hashCode() : 0)) * 31;
            String a2 = a();
            int hashCode3 = (hashCode2 + (a2 != null ? a2.hashCode() : 0)) * 31;
            String str = this.f7884d;
            int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 31;
            boolean z = this.f7885e;
            if (z) {
                z = true;
            }
            int i3 = (hashCode4 + (z ? 1 : 0)) * 31;
            com.sensorberg.smartworkspace.app.utils.k kVar = this.f7886f;
            int hashCode5 = (i3 + (kVar != null ? kVar.hashCode() : 0)) * 31;
            String str2 = this.f7887g;
            if (str2 != null) {
                i2 = str2.hashCode();
            }
            return hashCode5 + i2;
        }

        public final boolean i() {
            return this.f7885e;
        }

        public String toString() {
            return "SeekBarRow(iotDevice=" + this.a + ", property=" + this.b + ", widgetId=" + a() + ", title=" + this.f7884d + ", isLoading=" + this.f7885e + ", scale=" + this.f7886f + ", unit=" + this.f7887g + ")";
        }
    }

    /* compiled from: Widget.kt */
    public static final class g extends p {
        private final String a = "space";

        public g() {
            super((DefaultConstructorMarker) null);
        }

        public String a() {
            return this.a;
        }
    }

    private p() {
    }

    public abstract String a();

    /* compiled from: Widget.kt */
    public static final class c extends p {
        private final String a;
        private final String b;
        private final boolean c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(String str, boolean z) {
            super((DefaultConstructorMarker) null);
            k.e(str, "name");
            this.b = str;
            this.c = z;
            this.a = "widget_id_header";
        }

        public String a() {
            return this.a;
        }

        public final String b() {
            return this.b;
        }

        public final boolean c() {
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
            return k.a(this.b, cVar.b) && this.c == cVar.c;
        }

        public int hashCode() {
            String str = this.b;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            boolean z = this.c;
            if (z) {
                z = true;
            }
            return hashCode + (z ? 1 : 0);
        }

        public String toString() {
            return "Header(name=" + this.b + ", isLoading=" + this.c + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ c(String str, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i2 & 2) != 0 ? false : z);
        }
    }

    public /* synthetic */ p(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
