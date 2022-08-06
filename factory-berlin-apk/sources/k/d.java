package k;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.k;

/* compiled from: CacheControl.kt */
public final class d {

    /* renamed from: n  reason: collision with root package name */
    public static final d f10307n;
    public static final b o = new b((DefaultConstructorMarker) null);
    private final boolean a;
    private final boolean b;
    private final int c;

    /* renamed from: d  reason: collision with root package name */
    private final int f10308d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f10309e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f10310f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f10311g;

    /* renamed from: h  reason: collision with root package name */
    private final int f10312h;

    /* renamed from: i  reason: collision with root package name */
    private final int f10313i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f10314j;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f10315k;

    /* renamed from: l  reason: collision with root package name */
    private final boolean f10316l;

    /* renamed from: m  reason: collision with root package name */
    private String f10317m;

    /* compiled from: CacheControl.kt */
    public static final class a {
        private boolean a;
        private boolean b;
        private int c = -1;

        /* renamed from: d  reason: collision with root package name */
        private int f10318d = -1;

        /* renamed from: e  reason: collision with root package name */
        private int f10319e = -1;

        /* renamed from: f  reason: collision with root package name */
        private boolean f10320f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f10321g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f10322h;

        private final int b(long j2) {
            if (j2 > ((long) Integer.MAX_VALUE)) {
                return Integer.MAX_VALUE;
            }
            return (int) j2;
        }

        public final d a() {
            return new d(this.a, this.b, this.c, -1, false, false, false, this.f10318d, this.f10319e, this.f10320f, this.f10321g, this.f10322h, (String) null, (DefaultConstructorMarker) null);
        }

        public final a c(int i2, TimeUnit timeUnit) {
            k.f(timeUnit, "timeUnit");
            if (i2 >= 0) {
                this.f10318d = b(timeUnit.toSeconds((long) i2));
                return this;
            }
            throw new IllegalArgumentException(("maxStale < 0: " + i2).toString());
        }

        public final a d() {
            this.a = true;
            return this;
        }

        public final a e() {
            this.f10320f = true;
            return this;
        }
    }

    /* compiled from: CacheControl.kt */
    public static final class b {
        private b() {
        }

        private final int a(String str, String str2, int i2) {
            int length = str.length();
            while (i2 < length) {
                if (q.H(str2, str.charAt(i2), false, 2, (Object) null)) {
                    return i2;
                }
                i2++;
            }
            return str.length();
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x004a  */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x00f4  */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x00f8  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final k.d b(k.u r33) {
            /*
                r32 = this;
                r0 = r32
                r1 = r33
                java.lang.String r2 = "headers"
                kotlin.jvm.internal.k.f(r1, r2)
                int r2 = r33.size()
                r6 = 1
                r7 = 0
                r8 = 1
                r9 = 0
                r10 = 0
                r11 = 0
                r12 = -1
                r13 = -1
                r14 = 0
                r15 = 0
                r16 = 0
                r17 = -1
                r18 = -1
                r19 = 0
                r20 = 0
                r21 = 0
            L_0x0023:
                if (r7 >= r2) goto L_0x01ac
                java.lang.String r3 = r1.d(r7)
                java.lang.String r5 = r1.j(r7)
                java.lang.String r4 = "Cache-Control"
                boolean r4 = kotlin.j0.p.q(r3, r4, r6)
                if (r4 == 0) goto L_0x003a
                if (r9 == 0) goto L_0x0038
                goto L_0x0042
            L_0x0038:
                r9 = r5
                goto L_0x0043
            L_0x003a:
                java.lang.String r4 = "Pragma"
                boolean r3 = kotlin.j0.p.q(r3, r4, r6)
                if (r3 == 0) goto L_0x01a1
            L_0x0042:
                r8 = 0
            L_0x0043:
                r3 = 0
            L_0x0044:
                int r4 = r5.length()
                if (r3 >= r4) goto L_0x019a
                java.lang.String r4 = "=,;"
                int r4 = r0.a(r5, r4, r3)
                java.lang.String r6 = "null cannot be cast to non-null type java.lang.String"
                if (r5 == 0) goto L_0x0194
                java.lang.String r3 = r5.substring(r3, r4)
                java.lang.String r1 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
                kotlin.jvm.internal.k.b(r3, r1)
                r29 = r2
                java.lang.String r2 = "null cannot be cast to non-null type kotlin.CharSequence"
                if (r3 == 0) goto L_0x018e
                java.lang.CharSequence r3 = kotlin.j0.q.F0(r3)
                java.lang.String r3 = r3.toString()
                r30 = r8
                int r8 = r5.length()
                if (r4 == r8) goto L_0x00e5
                char r8 = r5.charAt(r4)
                r31 = r9
                r9 = 44
                if (r8 == r9) goto L_0x00e7
                char r8 = r5.charAt(r4)
                r9 = 59
                if (r8 != r9) goto L_0x0086
                goto L_0x00e7
            L_0x0086:
                int r4 = r4 + 1
                int r4 = k.h0.b.A(r5, r4)
                int r8 = r5.length()
                if (r4 >= r8) goto L_0x00be
                char r8 = r5.charAt(r4)
                r9 = 34
                if (r8 != r9) goto L_0x00be
                int r4 = r4 + 1
                r24 = 34
                r26 = 0
                r27 = 4
                r28 = 0
                r23 = r5
                r25 = r4
                int r2 = kotlin.j0.q.S(r23, r24, r25, r26, r27, r28)
                if (r5 == 0) goto L_0x00b8
                java.lang.String r4 = r5.substring(r4, r2)
                kotlin.jvm.internal.k.b(r4, r1)
                r1 = 1
                int r2 = r2 + r1
                goto L_0x00eb
            L_0x00b8:
                kotlin.TypeCastException r1 = new kotlin.TypeCastException
                r1.<init>(r6)
                throw r1
            L_0x00be:
                java.lang.String r8 = ",;"
                int r8 = r0.a(r5, r8, r4)
                if (r5 == 0) goto L_0x00df
                java.lang.String r4 = r5.substring(r4, r8)
                kotlin.jvm.internal.k.b(r4, r1)
                if (r4 == 0) goto L_0x00d9
                java.lang.CharSequence r1 = kotlin.j0.q.F0(r4)
                java.lang.String r4 = r1.toString()
                r2 = r8
                goto L_0x00eb
            L_0x00d9:
                kotlin.TypeCastException r1 = new kotlin.TypeCastException
                r1.<init>(r2)
                throw r1
            L_0x00df:
                kotlin.TypeCastException r1 = new kotlin.TypeCastException
                r1.<init>(r6)
                throw r1
            L_0x00e5:
                r31 = r9
            L_0x00e7:
                int r4 = r4 + 1
                r2 = r4
                r4 = 0
            L_0x00eb:
                java.lang.String r1 = "no-cache"
                r6 = 1
                boolean r1 = kotlin.j0.p.q(r1, r3, r6)
                if (r1 == 0) goto L_0x00f8
                r1 = -1
                r10 = 1
                goto L_0x0183
            L_0x00f8:
                java.lang.String r1 = "no-store"
                boolean r1 = kotlin.j0.p.q(r1, r3, r6)
                if (r1 == 0) goto L_0x0104
                r1 = -1
                r11 = 1
                goto L_0x0183
            L_0x0104:
                java.lang.String r1 = "max-age"
                boolean r1 = kotlin.j0.p.q(r1, r3, r6)
                if (r1 == 0) goto L_0x0113
                r1 = -1
                int r12 = k.h0.b.R(r4, r1)
                goto L_0x0183
            L_0x0113:
                r1 = -1
                java.lang.String r8 = "s-maxage"
                boolean r8 = kotlin.j0.p.q(r8, r3, r6)
                if (r8 == 0) goto L_0x0121
                int r13 = k.h0.b.R(r4, r1)
                goto L_0x0183
            L_0x0121:
                java.lang.String r1 = "private"
                boolean r1 = kotlin.j0.p.q(r1, r3, r6)
                if (r1 == 0) goto L_0x012c
                r1 = -1
                r14 = 1
                goto L_0x0183
            L_0x012c:
                java.lang.String r1 = "public"
                boolean r1 = kotlin.j0.p.q(r1, r3, r6)
                if (r1 == 0) goto L_0x0137
                r1 = -1
                r15 = 1
                goto L_0x0183
            L_0x0137:
                java.lang.String r1 = "must-revalidate"
                boolean r1 = kotlin.j0.p.q(r1, r3, r6)
                if (r1 == 0) goto L_0x0143
                r1 = -1
                r16 = 1
                goto L_0x0183
            L_0x0143:
                java.lang.String r1 = "max-stale"
                boolean r1 = kotlin.j0.p.q(r1, r3, r6)
                if (r1 == 0) goto L_0x0154
                r1 = 2147483647(0x7fffffff, float:NaN)
                int r17 = k.h0.b.R(r4, r1)
                r1 = -1
                goto L_0x0183
            L_0x0154:
                java.lang.String r1 = "min-fresh"
                boolean r1 = kotlin.j0.p.q(r1, r3, r6)
                if (r1 == 0) goto L_0x0162
                r1 = -1
                int r18 = k.h0.b.R(r4, r1)
                goto L_0x0183
            L_0x0162:
                r1 = -1
                java.lang.String r4 = "only-if-cached"
                boolean r4 = kotlin.j0.p.q(r4, r3, r6)
                if (r4 == 0) goto L_0x016e
                r19 = 1
                goto L_0x0183
            L_0x016e:
                java.lang.String r4 = "no-transform"
                boolean r4 = kotlin.j0.p.q(r4, r3, r6)
                if (r4 == 0) goto L_0x0179
                r20 = 1
                goto L_0x0183
            L_0x0179:
                java.lang.String r4 = "immutable"
                boolean r3 = kotlin.j0.p.q(r4, r3, r6)
                if (r3 == 0) goto L_0x0183
                r21 = 1
            L_0x0183:
                r1 = r33
                r3 = r2
                r2 = r29
                r8 = r30
                r9 = r31
                goto L_0x0044
            L_0x018e:
                kotlin.TypeCastException r1 = new kotlin.TypeCastException
                r1.<init>(r2)
                throw r1
            L_0x0194:
                kotlin.TypeCastException r1 = new kotlin.TypeCastException
                r1.<init>(r6)
                throw r1
            L_0x019a:
                r29 = r2
                r30 = r8
                r31 = r9
                goto L_0x01a3
            L_0x01a1:
                r29 = r2
            L_0x01a3:
                r1 = -1
                int r7 = r7 + 1
                r1 = r33
                r2 = r29
                goto L_0x0023
            L_0x01ac:
                if (r8 != 0) goto L_0x01b1
                r22 = 0
                goto L_0x01b3
            L_0x01b1:
                r22 = r9
            L_0x01b3:
                k.d r1 = new k.d
                r23 = 0
                r9 = r1
                r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: k.d.b.b(k.u):k.d");
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        a aVar = new a();
        aVar.d();
        aVar.a();
        a aVar2 = new a();
        aVar2.e();
        aVar2.c(Integer.MAX_VALUE, TimeUnit.SECONDS);
        f10307n = aVar2.a();
    }

    private d(boolean z, boolean z2, int i2, int i3, boolean z3, boolean z4, boolean z5, int i4, int i5, boolean z6, boolean z7, boolean z8, String str) {
        this.a = z;
        this.b = z2;
        this.c = i2;
        this.f10308d = i3;
        this.f10309e = z3;
        this.f10310f = z4;
        this.f10311g = z5;
        this.f10312h = i4;
        this.f10313i = i5;
        this.f10314j = z6;
        this.f10315k = z7;
        this.f10316l = z8;
        this.f10317m = str;
    }

    public final boolean a() {
        return this.f10309e;
    }

    public final boolean b() {
        return this.f10310f;
    }

    public final int c() {
        return this.c;
    }

    public final int d() {
        return this.f10312h;
    }

    public final int e() {
        return this.f10313i;
    }

    public final boolean f() {
        return this.f10311g;
    }

    public final boolean g() {
        return this.a;
    }

    public final boolean h() {
        return this.b;
    }

    public final boolean i() {
        return this.f10314j;
    }

    public String toString() {
        String str = this.f10317m;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (this.a) {
            sb.append("no-cache, ");
        }
        if (this.b) {
            sb.append("no-store, ");
        }
        if (this.c != -1) {
            sb.append("max-age=");
            sb.append(this.c);
            sb.append(", ");
        }
        if (this.f10308d != -1) {
            sb.append("s-maxage=");
            sb.append(this.f10308d);
            sb.append(", ");
        }
        if (this.f10309e) {
            sb.append("private, ");
        }
        if (this.f10310f) {
            sb.append("public, ");
        }
        if (this.f10311g) {
            sb.append("must-revalidate, ");
        }
        if (this.f10312h != -1) {
            sb.append("max-stale=");
            sb.append(this.f10312h);
            sb.append(", ");
        }
        if (this.f10313i != -1) {
            sb.append("min-fresh=");
            sb.append(this.f10313i);
            sb.append(", ");
        }
        if (this.f10314j) {
            sb.append("only-if-cached, ");
        }
        if (this.f10315k) {
            sb.append("no-transform, ");
        }
        if (this.f10316l) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        String sb2 = sb.toString();
        k.b(sb2, "StringBuilder().apply(builderAction).toString()");
        this.f10317m = sb2;
        return sb2;
    }

    public /* synthetic */ d(boolean z, boolean z2, int i2, int i3, boolean z3, boolean z4, boolean z5, int i4, int i5, boolean z6, boolean z7, boolean z8, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, z2, i2, i3, z3, z4, z5, i4, i5, z6, z7, z8, str);
    }
}
