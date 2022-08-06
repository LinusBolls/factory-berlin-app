package de.baimos;

import android.os.Parcel;
import android.os.Parcelable;

public final class ca implements Parcelable {
    public static final Parcelable.Creator<ca> CREATOR = new Parcelable.Creator<ca>() {
        /* renamed from: a */
        public ca createFromParcel(Parcel parcel) {
            return new ca(parcel);
        }

        /* renamed from: a */
        public ca[] newArray(int i2) {
            return new ca[i2];
        }
    };
    private final long a;
    private final long b;
    private int c;

    /* renamed from: d  reason: collision with root package name */
    private int f8286d;

    /* renamed from: e  reason: collision with root package name */
    private long f8287e;

    /* renamed from: f  reason: collision with root package name */
    private int f8288f;

    /* renamed from: g  reason: collision with root package name */
    private int f8289g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f8290h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f8291i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f8292j;

    /* renamed from: k  reason: collision with root package name */
    private long f8293k;

    /* renamed from: l  reason: collision with root package name */
    private long f8294l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f8295m;

    /* renamed from: n  reason: collision with root package name */
    private int f8296n;

    public static final class a {
        private int a = 0;
        private int b = 1;
        private long c = 0;

        /* renamed from: d  reason: collision with root package name */
        private int f8297d = 1;

        /* renamed from: e  reason: collision with root package name */
        private int f8298e = 3;

        /* renamed from: f  reason: collision with root package name */
        private boolean f8299f = true;

        /* renamed from: g  reason: collision with root package name */
        private int f8300g = 255;

        /* renamed from: h  reason: collision with root package name */
        private boolean f8301h = true;

        /* renamed from: i  reason: collision with root package name */
        private boolean f8302i = true;

        /* renamed from: j  reason: collision with root package name */
        private boolean f8303j = true;

        /* renamed from: k  reason: collision with root package name */
        private long f8304k = 10000;

        /* renamed from: l  reason: collision with root package name */
        private long f8305l = 10000;

        /* renamed from: m  reason: collision with root package name */
        private long f8306m = 0;

        /* renamed from: n  reason: collision with root package name */
        private long f8307n = 0;

        private void b() {
            long j2;
            int i2 = this.a;
            if (i2 == 1) {
                this.f8307n = 2000;
                j2 = 3000;
            } else if (i2 != 2) {
                this.f8307n = 500;
                j2 = 4500;
            } else {
                j2 = 0;
                this.f8307n = 0;
            }
            this.f8306m = j2;
        }

        private boolean e(int i2) {
            return i2 == 1 || i2 == 2 || i2 == 4 || i2 == 6;
        }

        public a a(int i2) {
            if (i2 < -1 || i2 > 2) {
                throw new IllegalArgumentException("invalid scan mode " + i2);
            }
            this.a = i2;
            return this;
        }

        public a a(boolean z) {
            this.f8301h = z;
            return this;
        }

        public ca a() {
            if (this.f8306m == 0 && this.f8307n == 0) {
                b();
            }
            return new ca(this.a, this.b, this.c, this.f8297d, this.f8298e, this.f8299f, this.f8300g, this.f8301h, this.f8302i, this.f8303j, this.f8304k, this.f8305l, this.f8307n, this.f8306m);
        }

        public a b(int i2) {
            if (e(i2)) {
                this.b = i2;
                return this;
            }
            throw new IllegalArgumentException("invalid callback type - " + i2);
        }

        public a b(boolean z) {
            this.f8302i = z;
            return this;
        }

        public a c(int i2) {
            if (i2 < 1 || i2 > 3) {
                throw new IllegalArgumentException("invalid numOfMatches " + i2);
            }
            this.f8298e = i2;
            return this;
        }

        public a c(boolean z) {
            this.f8303j = z;
            return this;
        }

        public a d(int i2) {
            if (i2 < 1 || i2 > 2) {
                throw new IllegalArgumentException("invalid matchMode " + i2);
            }
            this.f8297d = i2;
            return this;
        }
    }

    private ca(int i2, int i3, long j2, int i4, int i5, boolean z, int i6, boolean z2, boolean z3, boolean z4, long j3, long j4, long j5, long j6) {
        this.c = i2;
        this.f8286d = i3;
        this.f8287e = j2;
        this.f8289g = i5;
        this.f8288f = i4;
        this.f8295m = z;
        this.f8296n = i6;
        this.f8290h = z2;
        this.f8291i = z3;
        this.f8292j = z4;
        this.f8293k = 1000000 * j3;
        this.f8294l = j4;
        this.a = j5;
        this.b = j6;
    }

    private ca(Parcel parcel) {
        this.c = parcel.readInt();
        this.f8286d = parcel.readInt();
        this.f8287e = parcel.readLong();
        this.f8288f = parcel.readInt();
        this.f8289g = parcel.readInt();
        boolean z = false;
        this.f8295m = parcel.readInt() != 0;
        this.f8296n = parcel.readInt();
        this.f8290h = parcel.readInt() == 1;
        this.f8291i = parcel.readInt() == 1 ? true : z;
        this.a = parcel.readLong();
        this.b = parcel.readLong();
    }

    public int a() {
        return this.c;
    }

    public int b() {
        return this.f8286d;
    }

    public int c() {
        return this.f8288f;
    }

    public int d() {
        return this.f8289g;
    }

    public int describeContents() {
        return 0;
    }

    public boolean e() {
        return this.f8290h;
    }

    public boolean f() {
        return this.f8291i;
    }

    public boolean g() {
        return this.f8292j;
    }

    /* access modifiers changed from: package-private */
    public void h() {
        this.f8292j = false;
    }

    public long i() {
        return this.f8293k;
    }

    public long j() {
        return this.f8294l;
    }

    public long k() {
        return this.f8287e;
    }

    public boolean l() {
        return this.b > 0 && this.a > 0;
    }

    public long m() {
        return this.b;
    }

    public long n() {
        return this.a;
    }

    public boolean o() {
        return this.f8295m;
    }

    public int p() {
        return this.f8296n;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.c);
        parcel.writeInt(this.f8286d);
        parcel.writeLong(this.f8287e);
        parcel.writeInt(this.f8288f);
        parcel.writeInt(this.f8289g);
        parcel.writeInt(this.f8295m ? 1 : 0);
        parcel.writeInt(this.f8296n);
        parcel.writeInt(this.f8290h ? 1 : 0);
        parcel.writeInt(this.f8291i ? 1 : 0);
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
    }
}
