package no.nordicsemi.android.support.v18.scanner;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: ScanSettings */
public final class n implements Parcelable {
    public static final Parcelable.Creator<n> CREATOR = new a();

    /* renamed from: g  reason: collision with root package name */
    private final long f11245g;

    /* renamed from: h  reason: collision with root package name */
    private final long f11246h;

    /* renamed from: i  reason: collision with root package name */
    private int f11247i;

    /* renamed from: j  reason: collision with root package name */
    private int f11248j;

    /* renamed from: k  reason: collision with root package name */
    private long f11249k;

    /* renamed from: l  reason: collision with root package name */
    private int f11250l;

    /* renamed from: m  reason: collision with root package name */
    private int f11251m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f11252n;
    private boolean o;
    private boolean p;
    private long q;
    private long r;
    private boolean s;
    private int t;

    /* compiled from: ScanSettings */
    static class a implements Parcelable.Creator<n> {
        a() {
        }

        /* renamed from: a */
        public n createFromParcel(Parcel parcel) {
            return new n(parcel, (a) null);
        }

        /* renamed from: b */
        public n[] newArray(int i2) {
            return new n[i2];
        }
    }

    /* compiled from: ScanSettings */
    public static final class b {
        private int a = 0;
        private int b = 1;
        private long c = 0;

        /* renamed from: d  reason: collision with root package name */
        private int f11253d = 1;

        /* renamed from: e  reason: collision with root package name */
        private int f11254e = 3;

        /* renamed from: f  reason: collision with root package name */
        private boolean f11255f = true;

        /* renamed from: g  reason: collision with root package name */
        private int f11256g = 255;

        /* renamed from: h  reason: collision with root package name */
        private boolean f11257h = true;

        /* renamed from: i  reason: collision with root package name */
        private boolean f11258i = true;

        /* renamed from: j  reason: collision with root package name */
        private boolean f11259j = true;

        /* renamed from: k  reason: collision with root package name */
        private long f11260k = 10000;

        /* renamed from: l  reason: collision with root package name */
        private long f11261l = 10000;

        /* renamed from: m  reason: collision with root package name */
        private long f11262m = 0;

        /* renamed from: n  reason: collision with root package name */
        private long f11263n = 0;

        private boolean b(int i2) {
            return i2 == 1 || i2 == 2 || i2 == 4 || i2 == 6;
        }

        private void n() {
            int i2 = this.a;
            if (i2 == 1) {
                this.f11263n = 2000;
                this.f11262m = 3000;
            } else if (i2 != 2) {
                this.f11263n = 500;
                this.f11262m = 4500;
            } else {
                this.f11263n = 0;
                this.f11262m = 0;
            }
        }

        public n a() {
            if (this.f11262m == 0 && this.f11263n == 0) {
                n();
            }
            return new n(this.a, this.b, this.c, this.f11253d, this.f11254e, this.f11255f, this.f11256g, this.f11257h, this.f11258i, this.f11259j, this.f11260k, this.f11261l, this.f11263n, this.f11262m, (a) null);
        }

        public b c(int i2) {
            if (b(i2)) {
                this.b = i2;
                return this;
            }
            throw new IllegalArgumentException("invalid callback type - " + i2);
        }

        public b d(boolean z) {
            this.f11255f = z;
            return this;
        }

        public b e(int i2) {
            if (i2 < 1 || i2 > 2) {
                throw new IllegalArgumentException("invalid matchMode " + i2);
            }
            this.f11253d = i2;
            return this;
        }

        public b f(long j2, long j3) {
            if (j2 <= 0 || j3 <= 0) {
                throw new IllegalArgumentException("maxDeviceAgeMillis and taskIntervalMillis must be > 0");
            }
            this.f11260k = j2;
            this.f11261l = j3;
            return this;
        }

        public b g(int i2) {
            if (i2 < 1 || i2 > 3) {
                throw new IllegalArgumentException("invalid numOfMatches " + i2);
            }
            this.f11254e = i2;
            return this;
        }

        public b h(int i2) {
            this.f11256g = i2;
            return this;
        }

        public b i(long j2) {
            if (j2 >= 0) {
                this.c = j2;
                return this;
            }
            throw new IllegalArgumentException("reportDelay must be > 0");
        }

        public b j(int i2) {
            if (i2 < -1 || i2 > 2) {
                throw new IllegalArgumentException("invalid scan mode " + i2);
            }
            this.a = i2;
            return this;
        }

        public b k(boolean z) {
            this.f11258i = z;
            return this;
        }

        public b l(boolean z) {
            this.f11259j = z;
            return this;
        }

        public b m(boolean z) {
            this.f11257h = z;
            return this;
        }
    }

    /* synthetic */ n(int i2, int i3, long j2, int i4, int i5, boolean z, int i6, boolean z2, boolean z3, boolean z4, long j3, long j4, long j5, long j6, a aVar) {
        this(i2, i3, j2, i4, i5, z, i6, z2, z3, z4, j3, j4, j5, j6);
    }

    /* access modifiers changed from: package-private */
    public void a() {
        this.p = false;
    }

    public int b() {
        return this.f11248j;
    }

    public boolean c() {
        return this.s;
    }

    public long d() {
        return this.q;
    }

    public int describeContents() {
        return 0;
    }

    public long e() {
        return this.r;
    }

    public int f() {
        return this.f11250l;
    }

    public int g() {
        return this.f11251m;
    }

    public int h() {
        return this.t;
    }

    public long i() {
        return this.f11246h;
    }

    public long j() {
        return this.f11245g;
    }

    public long k() {
        return this.f11249k;
    }

    public int l() {
        return this.f11247i;
    }

    public boolean m() {
        return this.o;
    }

    public boolean n() {
        return this.p;
    }

    public boolean o() {
        return this.f11252n;
    }

    public boolean p() {
        return this.f11246h > 0 && this.f11245g > 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f11247i);
        parcel.writeInt(this.f11248j);
        parcel.writeLong(this.f11249k);
        parcel.writeInt(this.f11250l);
        parcel.writeInt(this.f11251m);
        parcel.writeInt(this.s ? 1 : 0);
        parcel.writeInt(this.t);
        parcel.writeInt(this.f11252n ? 1 : 0);
        parcel.writeInt(this.o ? 1 : 0);
        parcel.writeLong(this.f11245g);
        parcel.writeLong(this.f11246h);
    }

    /* synthetic */ n(Parcel parcel, a aVar) {
        this(parcel);
    }

    private n(int i2, int i3, long j2, int i4, int i5, boolean z, int i6, boolean z2, boolean z3, boolean z4, long j3, long j4, long j5, long j6) {
        this.f11247i = i2;
        this.f11248j = i3;
        this.f11249k = j2;
        this.f11251m = i5;
        this.f11250l = i4;
        this.s = z;
        this.t = i6;
        this.f11252n = z2;
        this.o = z3;
        this.p = z4;
        this.q = 1000000 * j3;
        this.r = j4;
        this.f11245g = j5;
        this.f11246h = j6;
    }

    private n(Parcel parcel) {
        this.f11247i = parcel.readInt();
        this.f11248j = parcel.readInt();
        this.f11249k = parcel.readLong();
        this.f11250l = parcel.readInt();
        this.f11251m = parcel.readInt();
        boolean z = false;
        this.s = parcel.readInt() != 0;
        this.t = parcel.readInt();
        this.f11252n = parcel.readInt() == 1;
        this.o = parcel.readInt() == 1 ? true : z;
        this.f11245g = parcel.readLong();
        this.f11246h = parcel.readLong();
    }
}
