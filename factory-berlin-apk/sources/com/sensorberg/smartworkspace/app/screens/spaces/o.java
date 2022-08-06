package com.sensorberg.smartworkspace.app.screens.spaces;

import com.sensorberg.factory.R;
import com.sensorberg.smartspaces.sdk.model.Property;
import kotlin.jvm.internal.k;

/* compiled from: PropertyKind.kt */
public abstract class o {

    /* renamed from: d  reason: collision with root package name */
    public static final c f7957d = new c((DefaultConstructorMarker) null);
    private final String a;
    private final int b;
    private final String c;

    /* compiled from: PropertyKind.kt */
    public static final class a extends o {

        /* renamed from: e  reason: collision with root package name */
        public static final a f7958e = new a();

        private a() {
            super("alarm", R.string.label_alarm, (String) null, (DefaultConstructorMarker) null);
        }
    }

    /* compiled from: PropertyKind.kt */
    public static final class b extends o {

        /* renamed from: e  reason: collision with root package name */
        public static final b f7959e = new b();

        private b() {
            super("angle", R.string.label_iotdevice_angle, "°", (DefaultConstructorMarker) null);
        }
    }

    /* compiled from: PropertyKind.kt */
    public static final class c {
        private c() {
        }

        public final o a(Property property) {
            k.e(property, "property");
            String kind = property.getKind();
            if (k.a(kind, b.f7959e.a())) {
                return b.f7959e;
            }
            if (k.a(kind, d.f7960e.a())) {
                return d.f7960e;
            }
            if (k.a(kind, f.f7962e.a())) {
                return f.f7962e;
            }
            if (k.a(kind, h.f7964e.a())) {
                return h.f7964e;
            }
            if (k.a(kind, g.f7963e.a())) {
                return g.f7963e;
            }
            if (k.a(kind, e.f7961e.a())) {
                return e.f7961e;
            }
            if (k.a(kind, i.f7965e.a())) {
                return i.f7965e;
            }
            if (k.a(kind, a.f7958e.a())) {
                return a.f7958e;
            }
            return null;
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: PropertyKind.kt */
    public static final class d extends o {

        /* renamed from: e  reason: collision with root package name */
        public static final d f7960e = new d();

        private d() {
            super("intensity", R.string.label_iotdevice_intensity, "%", (DefaultConstructorMarker) null);
        }
    }

    /* compiled from: PropertyKind.kt */
    public static final class e extends o {

        /* renamed from: e  reason: collision with root package name */
        public static final e f7961e = new e();

        private e() {
            super("open", R.string.label_open, (String) null, (DefaultConstructorMarker) null);
        }
    }

    /* compiled from: PropertyKind.kt */
    public static final class f extends o {

        /* renamed from: e  reason: collision with root package name */
        public static final f f7962e = new f();

        private f() {
            super("open_position", R.string.label_iotdevice_position, "", (DefaultConstructorMarker) null);
        }
    }

    /* compiled from: PropertyKind.kt */
    public static final class g extends o {

        /* renamed from: e  reason: collision with root package name */
        public static final g f7963e = new g();

        private g() {
            super("power", R.string.label_power, (String) null, (DefaultConstructorMarker) null);
        }
    }

    /* compiled from: PropertyKind.kt */
    public static final class h extends o {

        /* renamed from: e  reason: collision with root package name */
        public static final h f7964e = new h();

        private h() {
            super("temperature", R.string.label_iotdevice_temperature, "°C", (DefaultConstructorMarker) null);
        }
    }

    /* compiled from: PropertyKind.kt */
    public static final class i extends o {

        /* renamed from: e  reason: collision with root package name */
        public static final i f7965e = new i();

        private i() {
            super("warning", R.string.label_warning, (String) null, (DefaultConstructorMarker) null);
        }
    }

    private o(String str, int i2, String str2) {
        this.a = str;
        this.b = i2;
        this.c = str2;
    }

    public final String a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public /* synthetic */ o(String str, int i2, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i2, str2);
    }
}
