package l;

import kotlin.jvm.internal.k;

/* compiled from: Segment.kt */
public final class w {
    public final byte[] a;
    public int b;
    public int c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f11134d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f11135e;

    /* renamed from: f  reason: collision with root package name */
    public w f11136f;

    /* renamed from: g  reason: collision with root package name */
    public w f11137g;

    /* compiled from: Segment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new a((DefaultConstructorMarker) null);
    }

    public w() {
        this.a = new byte[8192];
        this.f11135e = true;
        this.f11134d = false;
    }

    public final void a() {
        int i2 = 0;
        if (this.f11137g != this) {
            w wVar = this.f11137g;
            if (wVar == null) {
                k.m();
                throw null;
            } else if (wVar.f11135e) {
                int i3 = this.c - this.b;
                if (wVar != null) {
                    int i4 = 8192 - wVar.c;
                    if (wVar != null) {
                        if (!wVar.f11134d) {
                            if (wVar != null) {
                                i2 = wVar.b;
                            } else {
                                k.m();
                                throw null;
                            }
                        }
                        if (i3 <= i4 + i2) {
                            w wVar2 = this.f11137g;
                            if (wVar2 != null) {
                                f(wVar2, i3);
                                b();
                                x.b(this);
                                return;
                            }
                            k.m();
                            throw null;
                        }
                        return;
                    }
                    k.m();
                    throw null;
                }
                k.m();
                throw null;
            }
        } else {
            throw new IllegalStateException("cannot compact".toString());
        }
    }

    public final w b() {
        w wVar = this.f11136f;
        if (wVar == this) {
            wVar = null;
        }
        w wVar2 = this.f11137g;
        if (wVar2 != null) {
            wVar2.f11136f = this.f11136f;
            w wVar3 = this.f11136f;
            if (wVar3 != null) {
                wVar3.f11137g = wVar2;
                this.f11136f = null;
                this.f11137g = null;
                return wVar;
            }
            k.m();
            throw null;
        }
        k.m();
        throw null;
    }

    public final w c(w wVar) {
        k.f(wVar, "segment");
        wVar.f11137g = this;
        wVar.f11136f = this.f11136f;
        w wVar2 = this.f11136f;
        if (wVar2 != null) {
            wVar2.f11137g = wVar;
            this.f11136f = wVar;
            return wVar;
        }
        k.m();
        throw null;
    }

    public final w d() {
        this.f11134d = true;
        return new w(this.a, this.b, this.c, true, false);
    }

    public final w e(int i2) {
        w wVar;
        if (i2 > 0 && i2 <= this.c - this.b) {
            if (i2 >= 1024) {
                wVar = d();
            } else {
                wVar = x.c();
                byte[] bArr = this.a;
                byte[] bArr2 = wVar.a;
                int i3 = this.b;
                byte[] unused = i.f(bArr, bArr2, 0, i3, i3 + i2, 2, (Object) null);
            }
            wVar.c = wVar.b + i2;
            this.b += i2;
            w wVar2 = this.f11137g;
            if (wVar2 != null) {
                wVar2.c(wVar);
                return wVar;
            }
            k.m();
            throw null;
        }
        throw new IllegalArgumentException("byteCount out of range".toString());
    }

    public final void f(w wVar, int i2) {
        k.f(wVar, "sink");
        if (wVar.f11135e) {
            int i3 = wVar.c;
            if (i3 + i2 > 8192) {
                if (!wVar.f11134d) {
                    int i4 = wVar.b;
                    if ((i3 + i2) - i4 <= 8192) {
                        byte[] bArr = wVar.a;
                        byte[] unused = i.f(bArr, bArr, 0, i4, i3, 2, (Object) null);
                        wVar.c -= wVar.b;
                        wVar.b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            byte[] bArr2 = this.a;
            byte[] bArr3 = wVar.a;
            int i5 = wVar.c;
            int i6 = this.b;
            byte[] unused2 = i.d(bArr2, bArr3, i5, i6, i6 + i2);
            wVar.c += i2;
            this.b += i2;
            return;
        }
        throw new IllegalStateException("only owner can write".toString());
    }

    public w(byte[] bArr, int i2, int i3, boolean z, boolean z2) {
        k.f(bArr, "data");
        this.a = bArr;
        this.b = i2;
        this.c = i3;
        this.f11134d = z;
        this.f11135e = z2;
    }
}
