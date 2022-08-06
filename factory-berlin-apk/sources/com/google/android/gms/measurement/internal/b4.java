package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
final class b4 implements Runnable {

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ int f2729g;

    /* renamed from: h  reason: collision with root package name */
    private final /* synthetic */ String f2730h;

    /* renamed from: i  reason: collision with root package name */
    private final /* synthetic */ Object f2731i;

    /* renamed from: j  reason: collision with root package name */
    private final /* synthetic */ Object f2732j;

    /* renamed from: k  reason: collision with root package name */
    private final /* synthetic */ Object f2733k;

    /* renamed from: l  reason: collision with root package name */
    private final /* synthetic */ c4 f2734l;

    b4(c4 c4Var, int i2, String str, Object obj, Object obj2, Object obj3) {
        this.f2734l = c4Var;
        this.f2729g = i2;
        this.f2730h = str;
        this.f2731i = obj;
        this.f2732j = obj2;
        this.f2733k = obj3;
    }

    public final void run() {
        p4 x = this.f2734l.a.x();
        if (!x.s()) {
            this.f2734l.z(6, "Persisted config not initialized. Not logging error/warn");
            return;
        }
        if (this.f2734l.c == 0) {
            if (this.f2734l.l().B()) {
                char unused = this.f2734l.c = 'C';
            } else {
                char unused2 = this.f2734l.c = 'c';
            }
        }
        if (this.f2734l.f2757d < 0) {
            long unused3 = this.f2734l.f2757d = 31049;
        }
        char charAt = "01VDIWEA?".charAt(this.f2729g);
        char t = this.f2734l.c;
        long C = this.f2734l.f2757d;
        String y = c4.y(true, this.f2730h, this.f2731i, this.f2732j, this.f2733k);
        StringBuilder sb = new StringBuilder(String.valueOf(y).length() + 24);
        sb.append("2");
        sb.append(charAt);
        sb.append(t);
        sb.append(C);
        sb.append(":");
        sb.append(y);
        String sb2 = sb.toString();
        if (sb2.length() > 1024) {
            sb2 = this.f2730h.substring(0, 1024);
        }
        x.f3024d.b(sb2, 1);
    }
}
