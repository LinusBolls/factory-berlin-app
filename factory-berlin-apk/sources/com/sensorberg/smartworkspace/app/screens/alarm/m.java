package com.sensorberg.smartworkspace.app.screens.alarm;

import kotlin.jvm.internal.k;

/* compiled from: AlarmWidget.kt */
public abstract class m {
    private final String a;

    /* compiled from: AlarmWidget.kt */
    public static final class a extends m {
        private final int b;

        public a(int i2) {
            super("widget_alarm_info", (DefaultConstructorMarker) null);
            this.b = i2;
        }

        public final int b() {
            return this.b;
        }
    }

    /* compiled from: AlarmWidget.kt */
    public static final class b extends m {
        private final String b;
        private final String c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f7341d;

        /* renamed from: e  reason: collision with root package name */
        private final long f7342e;

        /* renamed from: f  reason: collision with root package name */
        private final int f7343f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(String str, String str2, boolean z, long j2, int i2) {
            super("widget_alarm_item", (DefaultConstructorMarker) null);
            k.e(str, "id");
            k.e(str2, "title");
            this.b = str;
            this.c = str2;
            this.f7341d = z;
            this.f7342e = j2;
            this.f7343f = i2;
        }

        public final boolean b() {
            return this.f7341d;
        }

        public final long c() {
            return this.f7342e;
        }

        public final String d() {
            return this.b;
        }

        public final int e() {
            return this.f7343f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return k.a(this.b, bVar.b) && k.a(this.c, bVar.c) && this.f7341d == bVar.f7341d && this.f7342e == bVar.f7342e && this.f7343f == bVar.f7343f;
        }

        public final String f() {
            return this.c;
        }

        public int hashCode() {
            String str = this.b;
            int i2 = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.c;
            if (str2 != null) {
                i2 = str2.hashCode();
            }
            int i3 = (hashCode + i2) * 31;
            boolean z = this.f7341d;
            if (z) {
                z = true;
            }
            return ((((i3 + (z ? 1 : 0)) * 31) + defpackage.c.a(this.f7342e)) * 31) + this.f7343f;
        }

        public String toString() {
            return "Item(id=" + this.b + ", title=" + this.c + ", enabled=" + this.f7341d + ", endsAt=" + this.f7342e + ", snoozeSeconds=" + this.f7343f + ")";
        }
    }

    /* compiled from: AlarmWidget.kt */
    public static final class c extends m {
        private final int b;

        public c(int i2) {
            super("widget_alarm_title", (DefaultConstructorMarker) null);
            this.b = i2;
        }

        public final int b() {
            return this.b;
        }
    }

    private m(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public /* synthetic */ m(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
