package com.google.android.gms.location;

import android.os.SystemClock;
import g.b.a.b.c.e.a0;

public interface b {

    public static final class a {
        private String a = null;
        private int b = 0;
        private long c = Long.MIN_VALUE;

        /* renamed from: d  reason: collision with root package name */
        private short f2678d = -1;

        /* renamed from: e  reason: collision with root package name */
        private double f2679e;

        /* renamed from: f  reason: collision with root package name */
        private double f2680f;

        /* renamed from: g  reason: collision with root package name */
        private float f2681g;

        /* renamed from: h  reason: collision with root package name */
        private int f2682h = 0;

        /* renamed from: i  reason: collision with root package name */
        private int f2683i = -1;

        public final b a() {
            if (this.a != null) {
                int i2 = this.b;
                if (i2 == 0) {
                    throw new IllegalArgumentException("Transitions types not set.");
                } else if ((i2 & 4) != 0 && this.f2683i < 0) {
                    throw new IllegalArgumentException("Non-negative loitering delay needs to be set when transition types include GEOFENCE_TRANSITION_DWELLING.");
                } else if (this.c == Long.MIN_VALUE) {
                    throw new IllegalArgumentException("Expiration not set.");
                } else if (this.f2678d == -1) {
                    throw new IllegalArgumentException("Geofence region not set.");
                } else if (this.f2682h >= 0) {
                    return new a0(this.a, this.b, 1, this.f2679e, this.f2680f, this.f2681g, this.c, this.f2682h, this.f2683i);
                } else {
                    throw new IllegalArgumentException("Notification responsiveness should be nonnegative.");
                }
            } else {
                throw new IllegalArgumentException("Request ID not set.");
            }
        }

        public final a b(double d2, double d3, float f2) {
            this.f2678d = 1;
            this.f2679e = d2;
            this.f2680f = d3;
            this.f2681g = f2;
            return this;
        }

        public final a c(long j2) {
            if (j2 < 0) {
                this.c = -1;
            } else {
                this.c = SystemClock.elapsedRealtime() + j2;
            }
            return this;
        }

        public final a d(String str) {
            this.a = str;
            return this;
        }

        public final a e(int i2) {
            this.b = i2;
            return this;
        }
    }

    String k();
}
