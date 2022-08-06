package com.sensorberg.smartworkspace.app.screens.spaces;

import com.sensorberg.factory.R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.k;

/* compiled from: IotDeviceIcon.kt */
public abstract class b {

    /* compiled from: IotDeviceIcon.kt */
    public static final class a extends b {
        private final C0522a a;
        private final boolean b;

        /* renamed from: com.sensorberg.smartworkspace.app.screens.spaces.b$a$a  reason: collision with other inner class name */
        /* compiled from: IotDeviceIcon.kt */
        public enum C0522a {
            ON,
            OFF
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(C0522a aVar, boolean z) {
            super((DefaultConstructorMarker) null);
            k.e(aVar, "state");
            this.a = aVar;
            this.b = z;
        }

        public int a() {
            int i2 = c.a[this.a.ordinal()];
            if (i2 == 1) {
                return c() ? R.drawable.icn_air_conditioning_on_warning : R.drawable.icn_air_conditioning_on;
            }
            if (i2 == 2) {
                return c() ? R.drawable.icn_air_conditioning_off_warning : R.drawable.icn_air_conditioning_off;
            }
            throw new NoWhenBranchMatchedException();
        }

        public Integer b() {
            int i2;
            int i3 = c.b[this.a.ordinal()];
            if (i3 == 1) {
                i2 = R.string.label_iotdevice_status_on;
            } else if (i3 == 2) {
                i2 = R.string.label_iotdevice_status_off;
            } else {
                throw new NoWhenBranchMatchedException();
            }
            return Integer.valueOf(i2);
        }

        public boolean c() {
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
            return k.a(this.a, aVar.a) && c() == aVar.c();
        }

        public int hashCode() {
            C0522a aVar = this.a;
            int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
            boolean c = c();
            if (c) {
                c = true;
            }
            return hashCode + (c ? 1 : 0);
        }

        public String toString() {
            return "AirCondition(state=" + this.a + ", warning=" + c() + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ a(C0522a aVar, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(aVar, (i2 & 2) != 0 ? false : z);
        }
    }

    /* renamed from: com.sensorberg.smartworkspace.app.screens.spaces.b$b  reason: collision with other inner class name */
    /* compiled from: IotDeviceIcon.kt */
    public static final class C0523b extends b {
        private final a a;
        private final boolean b;

        /* renamed from: com.sensorberg.smartworkspace.app.screens.spaces.b$b$a */
        /* compiled from: IotDeviceIcon.kt */
        public enum a {
            OPEN,
            CLOSED
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0523b(a aVar, boolean z) {
            super((DefaultConstructorMarker) null);
            k.e(aVar, "state");
            this.a = aVar;
            this.b = z;
        }

        public int a() {
            int i2 = d.a[this.a.ordinal()];
            if (i2 == 1) {
                return c() ? R.drawable.icn_door_open_warning : R.drawable.icn_door_open;
            }
            if (i2 == 2) {
                return c() ? R.drawable.icn_door_closed_warning : R.drawable.icn_door_closed;
            }
            throw new NoWhenBranchMatchedException();
        }

        public Integer b() {
            int i2;
            int i3 = d.b[this.a.ordinal()];
            if (i3 == 1) {
                i2 = R.string.label_iotdevice_status_opened;
            } else if (i3 == 2) {
                i2 = R.string.label_iotdevice_status_closed;
            } else {
                throw new NoWhenBranchMatchedException();
            }
            return Integer.valueOf(i2);
        }

        public boolean c() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0523b)) {
                return false;
            }
            C0523b bVar = (C0523b) obj;
            return k.a(this.a, bVar.a) && c() == bVar.c();
        }

        public int hashCode() {
            a aVar = this.a;
            int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
            boolean c = c();
            if (c) {
                c = true;
            }
            return hashCode + (c ? 1 : 0);
        }

        public String toString() {
            return "Door(state=" + this.a + ", warning=" + c() + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C0523b(a aVar, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(aVar, (i2 & 2) != 0 ? false : z);
        }
    }

    /* compiled from: IotDeviceIcon.kt */
    public static final class c extends b {
        private final a a;
        private final boolean b;

        /* compiled from: IotDeviceIcon.kt */
        public enum a {
            ON,
            OFF
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(a aVar, boolean z) {
            super((DefaultConstructorMarker) null);
            k.e(aVar, "state");
            this.a = aVar;
            this.b = z;
        }

        public int a() {
            int i2 = e.a[this.a.ordinal()];
            if (i2 == 1) {
                return c() ? R.drawable.icn_heater_on_warning : R.drawable.icn_heater_on;
            }
            if (i2 == 2) {
                return c() ? R.drawable.icn_heater_off_warning : R.drawable.icn_heater_off;
            }
            throw new NoWhenBranchMatchedException();
        }

        public Integer b() {
            int i2;
            int i3 = e.b[this.a.ordinal()];
            if (i3 == 1) {
                i2 = R.string.label_iotdevice_status_on;
            } else if (i3 == 2) {
                i2 = R.string.label_iotdevice_status_off;
            } else {
                throw new NoWhenBranchMatchedException();
            }
            return Integer.valueOf(i2);
        }

        public boolean c() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return k.a(this.a, cVar.a) && c() == cVar.c();
        }

        public int hashCode() {
            a aVar = this.a;
            int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
            boolean c = c();
            if (c) {
                c = true;
            }
            return hashCode + (c ? 1 : 0);
        }

        public String toString() {
            return "Heater(state=" + this.a + ", warning=" + c() + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ c(a aVar, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(aVar, (i2 & 2) != 0 ? false : z);
        }
    }

    /* compiled from: IotDeviceIcon.kt */
    public static final class d extends b {
        private final a a;
        private final boolean b;

        /* compiled from: IotDeviceIcon.kt */
        public enum a {
            OPEN,
            HALF,
            CLOSED
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(a aVar, boolean z) {
            super((DefaultConstructorMarker) null);
            k.e(aVar, "state");
            this.a = aVar;
            this.b = z;
        }

        public int a() {
            int i2 = f.a[this.a.ordinal()];
            if (i2 == 1) {
                return R.drawable.icn_jalousie_open;
            }
            if (i2 == 2) {
                return c() ? R.drawable.icn_jalousie_half_warning : R.drawable.icn_jalousie_half_closed;
            }
            if (i2 == 3) {
                return c() ? R.drawable.icn_jalousie_closed_warning : R.drawable.icn_jalousie_closed;
            }
            throw new NoWhenBranchMatchedException();
        }

        public Integer b() {
            int i2;
            int i3 = f.b[this.a.ordinal()];
            if (i3 == 1) {
                i2 = R.string.label_iotdevice_status_opened;
            } else if (i3 == 2) {
                i2 = R.string.label_iotdevice_status_closed;
            } else if (i3 == 3) {
                i2 = R.string.label_iotdevice_status_half_opened;
            } else {
                throw new NoWhenBranchMatchedException();
            }
            return Integer.valueOf(i2);
        }

        public boolean c() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return k.a(this.a, dVar.a) && c() == dVar.c();
        }

        public int hashCode() {
            a aVar = this.a;
            int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
            boolean c = c();
            if (c) {
                c = true;
            }
            return hashCode + (c ? 1 : 0);
        }

        public String toString() {
            return "Jalousie(state=" + this.a + ", warning=" + c() + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ d(a aVar, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(aVar, (i2 & 2) != 0 ? false : z);
        }
    }

    /* compiled from: IotDeviceIcon.kt */
    public static final class e extends b {
        private final a a;
        private final boolean b;

        /* compiled from: IotDeviceIcon.kt */
        public enum a {
            ON,
            OFF
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(a aVar, boolean z) {
            super((DefaultConstructorMarker) null);
            k.e(aVar, "state");
            this.a = aVar;
            this.b = z;
        }

        public int a() {
            int i2 = g.a[this.a.ordinal()];
            if (i2 == 1) {
                return c() ? R.drawable.icn_lamp_on_warning : R.drawable.icn_lamp_on;
            }
            if (i2 == 2) {
                return c() ? R.drawable.icn_lamp_off_warning : R.drawable.icn_lamp_off;
            }
            throw new NoWhenBranchMatchedException();
        }

        public Integer b() {
            int i2;
            int i3 = g.b[this.a.ordinal()];
            if (i3 == 1) {
                i2 = R.string.label_iotdevice_status_on;
            } else if (i3 == 2) {
                i2 = R.string.label_iotdevice_status_off;
            } else {
                throw new NoWhenBranchMatchedException();
            }
            return Integer.valueOf(i2);
        }

        public boolean c() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return k.a(this.a, eVar.a) && c() == eVar.c();
        }

        public int hashCode() {
            a aVar = this.a;
            int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
            boolean c = c();
            if (c) {
                c = true;
            }
            return hashCode + (c ? 1 : 0);
        }

        public String toString() {
            return "Lamp(state=" + this.a + ", warning=" + c() + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ e(a aVar, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(aVar, (i2 & 2) != 0 ? false : z);
        }
    }

    /* compiled from: IotDeviceIcon.kt */
    public static final class f extends b {
        private final boolean a;

        public f() {
            this(false, 1, (DefaultConstructorMarker) null);
        }

        public f(boolean z) {
            super((DefaultConstructorMarker) null);
            this.a = z;
        }

        public int a() {
            return c() ? R.drawable.icn_misc_on_warning : R.drawable.icn_misc_on;
        }

        public boolean c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof f) && c() == ((f) obj).c();
            }
            return true;
        }

        public int hashCode() {
            boolean c = c();
            if (c) {
                return 1;
            }
            return c ? 1 : 0;
        }

        public String toString() {
            return "Misc(warning=" + c() + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ f(boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? false : z);
        }
    }

    /* compiled from: IotDeviceIcon.kt */
    public static final class g extends b {
        private final a a;
        private final boolean b;

        /* compiled from: IotDeviceIcon.kt */
        public enum a {
            ON,
            OFF
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(a aVar, boolean z) {
            super((DefaultConstructorMarker) null);
            k.e(aVar, "state");
            this.a = aVar;
            this.b = z;
        }

        public int a() {
            int i2 = h.a[this.a.ordinal()];
            if (i2 == 1) {
                return c() ? R.drawable.icn_plug_on_warning : R.drawable.icn_plug_on;
            }
            if (i2 == 2) {
                return c() ? R.drawable.icn_plug_off_warning : R.drawable.icn_plug_off;
            }
            throw new NoWhenBranchMatchedException();
        }

        public Integer b() {
            int i2;
            int i3 = h.b[this.a.ordinal()];
            if (i3 == 1) {
                i2 = R.string.label_iotdevice_status_on;
            } else if (i3 == 2) {
                i2 = R.string.label_iotdevice_status_off;
            } else {
                throw new NoWhenBranchMatchedException();
            }
            return Integer.valueOf(i2);
        }

        public boolean c() {
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
            return k.a(this.a, gVar.a) && c() == gVar.c();
        }

        public int hashCode() {
            a aVar = this.a;
            int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
            boolean c = c();
            if (c) {
                c = true;
            }
            return hashCode + (c ? 1 : 0);
        }

        public String toString() {
            return "Plug(state=" + this.a + ", warning=" + c() + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ g(a aVar, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(aVar, (i2 & 2) != 0 ? false : z);
        }
    }

    /* compiled from: IotDeviceIcon.kt */
    public static final class h extends b {
        private final a a;
        private final boolean b;

        /* compiled from: IotDeviceIcon.kt */
        public enum a {
            ALARM,
            OFF
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(a aVar, boolean z) {
            super((DefaultConstructorMarker) null);
            k.e(aVar, "state");
            this.a = aVar;
            this.b = z;
        }

        public int a() {
            int i2 = i.a[this.a.ordinal()];
            if (i2 == 1) {
                return R.drawable.icn_smoke_on_warning;
            }
            if (i2 == 2) {
                return c() ? R.drawable.icn_smoke_off_warning : R.drawable.icn_smoke_off;
            }
            throw new NoWhenBranchMatchedException();
        }

        public Integer b() {
            int i2;
            int i3 = i.b[this.a.ordinal()];
            if (i3 == 1) {
                i2 = R.string.label_iotdevice_status_smoke_alarm;
            } else if (i3 == 2) {
                i2 = R.string.label_iotdevice_status_smoke_ok;
            } else {
                throw new NoWhenBranchMatchedException();
            }
            return Integer.valueOf(i2);
        }

        public boolean c() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return k.a(this.a, hVar.a) && c() == hVar.c();
        }

        public int hashCode() {
            a aVar = this.a;
            int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
            boolean c = c();
            if (c) {
                c = true;
            }
            return hashCode + (c ? 1 : 0);
        }

        public String toString() {
            return "SmokeDetector(state=" + this.a + ", warning=" + c() + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ h(a aVar, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(aVar, (i2 & 2) != 0 ? false : z);
        }
    }

    /* compiled from: IotDeviceIcon.kt */
    public static final class i extends b {
        private final boolean a;

        public i() {
            this(false, 1, (DefaultConstructorMarker) null);
        }

        public i(boolean z) {
            super((DefaultConstructorMarker) null);
            this.a = z;
        }

        public int a() {
            return c() ? R.drawable.icn_temperature_on_warning : R.drawable.icn_temperature_on;
        }

        public boolean c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof i) && c() == ((i) obj).c();
            }
            return true;
        }

        public int hashCode() {
            boolean c = c();
            if (c) {
                return 1;
            }
            return c ? 1 : 0;
        }

        public String toString() {
            return "Temperature(warning=" + c() + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ i(boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? false : z);
        }
    }

    /* compiled from: IotDeviceIcon.kt */
    public static final class j extends b {
        private final a a;
        private final boolean b;

        /* compiled from: IotDeviceIcon.kt */
        public enum a {
            OPEN,
            CLOSED
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public j(a aVar, boolean z) {
            super((DefaultConstructorMarker) null);
            k.e(aVar, "state");
            this.a = aVar;
            this.b = z;
        }

        public int a() {
            int i2 = j.a[this.a.ordinal()];
            if (i2 == 1) {
                return c() ? R.drawable.icn_window_open_warning : R.drawable.icn_window_open;
            }
            if (i2 == 2) {
                return c() ? R.drawable.icn_window_closed_warning : R.drawable.icn_window_closed;
            }
            throw new NoWhenBranchMatchedException();
        }

        public Integer b() {
            int i2;
            int i3 = j.b[this.a.ordinal()];
            if (i3 == 1) {
                i2 = R.string.label_iotdevice_status_opened;
            } else if (i3 == 2) {
                i2 = R.string.label_iotdevice_status_closed;
            } else {
                throw new NoWhenBranchMatchedException();
            }
            return Integer.valueOf(i2);
        }

        public boolean c() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return k.a(this.a, jVar.a) && c() == jVar.c();
        }

        public int hashCode() {
            a aVar = this.a;
            int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
            boolean c = c();
            if (c) {
                c = true;
            }
            return hashCode + (c ? 1 : 0);
        }

        public String toString() {
            return "Window(state=" + this.a + ", warning=" + c() + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ j(a aVar, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(aVar, (i2 & 2) != 0 ? false : z);
        }
    }

    private b() {
    }

    public abstract int a();

    public Integer b() {
        return null;
    }

    public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
