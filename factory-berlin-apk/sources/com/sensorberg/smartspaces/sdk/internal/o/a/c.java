package com.sensorberg.smartspaces.sdk.internal.o.a;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* compiled from: GattResult */
public class c {
    public final boolean a;
    public final boolean b;
    public final String c;

    /* renamed from: d  reason: collision with root package name */
    public final String f6414d;

    /* renamed from: e  reason: collision with root package name */
    public final C0384c f6415e;

    /* renamed from: f  reason: collision with root package name */
    public final Exception f6416f;

    /* compiled from: GattResult */
    static class b {
        private boolean a = false;
        private boolean b = false;
        private String c;

        /* renamed from: d  reason: collision with root package name */
        String f6417d;

        /* renamed from: e  reason: collision with root package name */
        private C0384c f6418e;

        /* renamed from: f  reason: collision with root package name */
        private Exception f6419f;

        b() {
        }

        public c a() {
            return new c(this.a, this.b, this.c, this.f6417d, this.f6418e, this.f6419f);
        }

        public b b(boolean z) {
            this.b = z;
            return this;
        }

        public b c(boolean z) {
            this.a = z;
            return this;
        }

        public b d(Exception exc) {
            this.f6419f = exc;
            return this;
        }

        public b e(String str) {
            this.c = str;
            return this;
        }

        public b f(String str) {
            this.f6417d = str;
            return this;
        }

        public b g(C0384c cVar) {
            this.f6418e = cVar;
            return this;
        }
    }

    /* renamed from: com.sensorberg.smartspaces.sdk.internal.o.a.c$c  reason: collision with other inner class name */
    /* compiled from: GattResult */
    public static class C0384c {
        public final long a;
        public final long b;
        public final int c;

        /* renamed from: d  reason: collision with root package name */
        public final int f6420d;

        /* renamed from: e  reason: collision with root package name */
        public final long f6421e;

        /* renamed from: f  reason: collision with root package name */
        public final long f6422f;

        /* renamed from: g  reason: collision with root package name */
        public final long f6423g;

        /* renamed from: h  reason: collision with root package name */
        public final long f6424h;

        /* renamed from: i  reason: collision with root package name */
        public final long f6425i;

        /* renamed from: j  reason: collision with root package name */
        public final long f6426j;

        /* renamed from: com.sensorberg.smartspaces.sdk.internal.o.a.c$c$a */
        /* compiled from: GattResult */
        static class a {
            private long a;
            private long b;
            private int c;

            /* renamed from: d  reason: collision with root package name */
            private int f6427d;

            /* renamed from: e  reason: collision with root package name */
            private long f6428e;

            /* renamed from: f  reason: collision with root package name */
            private long f6429f;

            /* renamed from: g  reason: collision with root package name */
            private long f6430g;

            /* renamed from: h  reason: collision with root package name */
            private long f6431h;

            /* renamed from: i  reason: collision with root package name */
            private long f6432i;

            /* renamed from: j  reason: collision with root package name */
            private long f6433j;

            a() {
            }

            public C0384c a() {
                return new C0384c(this.a, this.b, this.c, this.f6427d, this.f6428e, this.f6429f, this.f6430g, this.f6431h, this.f6432i, this.f6433j);
            }

            public a b(long j2) {
                this.f6432i = j2;
                return this;
            }

            public a c(long j2) {
                this.f6428e = j2;
                return this;
            }

            public a d(long j2) {
                this.f6433j = j2;
                return this;
            }

            public a e(long j2) {
                this.f6429f = j2;
                return this;
            }

            public a f(long j2) {
                this.a = j2;
                return this;
            }

            public a g(long j2) {
                this.b = j2;
                return this;
            }

            public a h(int i2) {
                this.c = i2;
                return this;
            }

            public a i(int i2) {
                this.f6427d = i2;
                return this;
            }

            public a j(long j2) {
                this.f6431h = j2;
                return this;
            }

            public a k(long j2) {
                this.f6430g = j2;
                return this;
            }
        }

        public String toString() {
            return String.format("Gateway Gatt started at %s (%s)\ntotalElapsedTime(%S)\ntotalRetryProcess(%S)\ntotalRetrySteps(%S)\nconnectStartTime(%S)\ndiscoverStartTime(%S)\nwriteDescriptorStartTime(%S)\nwriteCharacteristicStartTime(%S)\nawaitNotifyStartTime(%S)\ndisconnectStartTime(%S)\n", new Object[]{new SimpleDateFormat("HH:mm:ss", Locale.getDefault()).format(new Date(this.a)), Long.valueOf(this.a), Long.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.f6420d), Long.valueOf(this.f6421e), Long.valueOf(this.f6422f), Long.valueOf(this.f6423g), Long.valueOf(this.f6424h), Long.valueOf(this.f6425i), Long.valueOf(this.f6426j)});
        }

        private C0384c(long j2, long j3, int i2, int i3, long j4, long j5, long j6, long j7, long j8, long j9) {
            this.a = j2;
            this.b = j3;
            this.c = i2;
            this.f6420d = i3;
            this.f6421e = j4;
            this.f6422f = j5;
            this.f6423g = j6;
            this.f6424h = j7;
            this.f6425i = j8;
            this.f6426j = j9;
        }
    }

    public String toString() {
        if (this.a) {
            return String.format("Gatt Result Success: %s. %s", new Object[]{this.c, this.f6415e.toString()});
        }
        return String.format("Gatt Result Failed: %s. %s", new Object[]{this.f6414d, this.f6415e.toString()});
    }

    private c(boolean z, boolean z2, String str, String str2, C0384c cVar, Exception exc) {
        this.a = z;
        this.b = z2;
        this.c = str;
        this.f6414d = str2;
        this.f6415e = cVar;
        this.f6416f = exc;
    }
}
