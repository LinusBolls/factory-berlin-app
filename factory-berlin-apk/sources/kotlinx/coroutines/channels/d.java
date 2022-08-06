package kotlinx.coroutines.channels;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.x;
import kotlinx.coroutines.internal.m;
import kotlinx.coroutines.k;
import kotlinx.coroutines.n0;

/* compiled from: ArrayChannel.kt */
public class d<E> extends a<E> {

    /* renamed from: i  reason: collision with root package name */
    private final ReentrantLock f10748i;

    /* renamed from: j  reason: collision with root package name */
    private Object[] f10749j;

    /* renamed from: k  reason: collision with root package name */
    private int f10750k;

    /* renamed from: l  reason: collision with root package name */
    private final int f10751l;
    private volatile int size;

    public d(int i2) {
        this.f10751l = i2;
        if (i2 < 1 ? false : true) {
            this.f10748i = new ReentrantLock();
            this.f10749j = new Object[Math.min(this.f10751l, 8)];
            this.size = 0;
            return;
        }
        throw new IllegalArgumentException(("ArrayChannel capacity must be at least 1, but " + this.f10751l + " was specified").toString());
    }

    private final void V(int i2) {
        Object[] objArr = this.f10749j;
        if (i2 >= objArr.length) {
            Object[] objArr2 = new Object[Math.min(objArr.length * 2, this.f10751l)];
            for (int i3 = 0; i3 < i2; i3++) {
                Object[] objArr3 = this.f10749j;
                objArr2[i3] = objArr3[(this.f10750k + i3) % objArr3.length];
            }
            this.f10749j = objArr2;
            this.f10750k = 0;
        }
    }

    /* access modifiers changed from: protected */
    public boolean G(q<? super E> qVar) {
        ReentrantLock reentrantLock = this.f10748i;
        reentrantLock.lock();
        try {
            return super.G(qVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* access modifiers changed from: protected */
    public final boolean I() {
        return false;
    }

    /* access modifiers changed from: protected */
    public final boolean J() {
        return this.size == 0;
    }

    /* access modifiers changed from: protected */
    public void L(boolean z) {
        if (z) {
            ReentrantLock reentrantLock = this.f10748i;
            reentrantLock.lock();
            try {
                int i2 = this.size;
                for (int i3 = 0; i3 < i2; i3++) {
                    this.f10749j[this.f10750k] = 0;
                    this.f10750k = (this.f10750k + 1) % this.f10749j.length;
                }
                this.size = 0;
                x xVar = x.a;
            } finally {
                reentrantLock.unlock();
            }
        }
        super.L(z);
    }

    /* access modifiers changed from: protected */
    public Object O() {
        u uVar;
        ReentrantLock reentrantLock = this.f10748i;
        reentrantLock.lock();
        try {
            int i2 = this.size;
            if (i2 == 0) {
                Object h2 = h();
                if (h2 == null) {
                    h2 = b.c;
                }
                return h2;
            }
            Object obj = this.f10749j[this.f10750k];
            this.f10749j[this.f10750k] = null;
            this.size = i2 - 1;
            Object obj2 = b.c;
            boolean z = false;
            if (i2 == this.f10751l) {
                uVar = null;
                while (true) {
                    u z2 = z();
                    if (z2 != null) {
                        if (z2 != null) {
                            kotlinx.coroutines.internal.x c0 = z2.c0((m.c) null);
                            if (c0 != null) {
                                if (n0.a()) {
                                    if (c0 == k.a) {
                                        z = true;
                                    }
                                    if (!z) {
                                        throw new AssertionError();
                                    }
                                }
                                if (z2 != null) {
                                    obj2 = z2.a0();
                                    uVar = z2;
                                    z = true;
                                } else {
                                    kotlin.jvm.internal.k.m();
                                    throw null;
                                }
                            } else {
                                uVar = z2;
                            }
                        } else {
                            kotlin.jvm.internal.k.m();
                            throw null;
                        }
                    }
                }
            } else {
                uVar = null;
            }
            if (obj2 != b.c && !(obj2 instanceof k)) {
                this.size = i2;
                this.f10749j[(this.f10750k + i2) % this.f10749j.length] = obj2;
            }
            this.f10750k = (this.f10750k + 1) % this.f10749j.length;
            x xVar = x.a;
            reentrantLock.unlock();
            if (z) {
                if (uVar != null) {
                    uVar.Z();
                } else {
                    kotlin.jvm.internal.k.m();
                    throw null;
                }
            }
            return obj;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005b, code lost:
        if (r7 != kotlinx.coroutines.h3.e.d()) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005d, code lost:
        r10.size = r1;
        r10.f10749j[r10.f10750k] = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0065, code lost:
        r0.unlock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0068, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x006b, code lost:
        if ((r7 instanceof kotlinx.coroutines.channels.k) == false) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x006d, code lost:
        r4 = (kotlinx.coroutines.channels.u) r7;
        r3 = r7;
        r7 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008e, code lost:
        throw new java.lang.IllegalStateException(("performAtomicTrySelect(describeTryOffer) returned " + r7).toString());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object P(kotlinx.coroutines.h3.d<?> r11) {
        /*
            r10 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r10.f10748i
            r0.lock()
            int r1 = r10.size     // Catch:{ all -> 0x00d9 }
            if (r1 != 0) goto L_0x0016
            kotlinx.coroutines.channels.k r11 = r10.h()     // Catch:{ all -> 0x00d9 }
            if (r11 == 0) goto L_0x0010
            goto L_0x0012
        L_0x0010:
            java.lang.Object r11 = kotlinx.coroutines.channels.b.c     // Catch:{ all -> 0x00d9 }
        L_0x0012:
            r0.unlock()
            return r11
        L_0x0016:
            java.lang.Object[] r2 = r10.f10749j     // Catch:{ all -> 0x00d9 }
            int r3 = r10.f10750k     // Catch:{ all -> 0x00d9 }
            r2 = r2[r3]     // Catch:{ all -> 0x00d9 }
            java.lang.Object[] r3 = r10.f10749j     // Catch:{ all -> 0x00d9 }
            int r4 = r10.f10750k     // Catch:{ all -> 0x00d9 }
            r5 = 0
            r3[r4] = r5     // Catch:{ all -> 0x00d9 }
            int r3 = r1 + -1
            r10.size = r3     // Catch:{ all -> 0x00d9 }
            java.lang.Object r3 = kotlinx.coroutines.channels.b.c     // Catch:{ all -> 0x00d9 }
            int r4 = r10.f10751l     // Catch:{ all -> 0x00d9 }
            r6 = 1
            if (r1 != r4) goto L_0x008f
        L_0x002e:
            kotlinx.coroutines.channels.a$f r4 = r10.E()     // Catch:{ all -> 0x00d9 }
            java.lang.Object r7 = r11.q(r4)     // Catch:{ all -> 0x00d9 }
            if (r7 != 0) goto L_0x004d
            java.lang.Object r3 = r4.n()     // Catch:{ all -> 0x00d9 }
            kotlinx.coroutines.channels.u r3 = (kotlinx.coroutines.channels.u) r3     // Catch:{ all -> 0x00d9 }
            if (r3 == 0) goto L_0x0049
            java.lang.Object r4 = r3.a0()     // Catch:{ all -> 0x00d9 }
            r7 = 1
            r9 = r4
            r4 = r3
            r3 = r9
            goto L_0x0092
        L_0x0049:
            kotlin.jvm.internal.k.m()     // Catch:{ all -> 0x00d9 }
            throw r5
        L_0x004d:
            java.lang.Object r4 = kotlinx.coroutines.channels.b.c     // Catch:{ all -> 0x00d9 }
            if (r7 != r4) goto L_0x0052
            goto L_0x008f
        L_0x0052:
            java.lang.Object r4 = kotlinx.coroutines.internal.c.b     // Catch:{ all -> 0x00d9 }
            if (r7 != r4) goto L_0x0057
            goto L_0x002e
        L_0x0057:
            java.lang.Object r3 = kotlinx.coroutines.h3.e.d()     // Catch:{ all -> 0x00d9 }
            if (r7 != r3) goto L_0x0069
            r10.size = r1     // Catch:{ all -> 0x00d9 }
            java.lang.Object[] r11 = r10.f10749j     // Catch:{ all -> 0x00d9 }
            int r1 = r10.f10750k     // Catch:{ all -> 0x00d9 }
            r11[r1] = r2     // Catch:{ all -> 0x00d9 }
            r0.unlock()
            return r7
        L_0x0069:
            boolean r3 = r7 instanceof kotlinx.coroutines.channels.k     // Catch:{ all -> 0x00d9 }
            if (r3 == 0) goto L_0x0074
            r3 = r7
            kotlinx.coroutines.channels.u r3 = (kotlinx.coroutines.channels.u) r3     // Catch:{ all -> 0x00d9 }
            r4 = r3
            r3 = r7
            r7 = 1
            goto L_0x0092
        L_0x0074:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d9 }
            r11.<init>()     // Catch:{ all -> 0x00d9 }
            java.lang.String r1 = "performAtomicTrySelect(describeTryOffer) returned "
            r11.append(r1)     // Catch:{ all -> 0x00d9 }
            r11.append(r7)     // Catch:{ all -> 0x00d9 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x00d9 }
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00d9 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x00d9 }
            r1.<init>(r11)     // Catch:{ all -> 0x00d9 }
            throw r1     // Catch:{ all -> 0x00d9 }
        L_0x008f:
            r4 = 0
            r4 = r5
            r7 = 0
        L_0x0092:
            java.lang.Object r8 = kotlinx.coroutines.channels.b.c     // Catch:{ all -> 0x00d9 }
            if (r3 == r8) goto L_0x00a8
            boolean r8 = r3 instanceof kotlinx.coroutines.channels.k     // Catch:{ all -> 0x00d9 }
            if (r8 != 0) goto L_0x00a8
            r10.size = r1     // Catch:{ all -> 0x00d9 }
            java.lang.Object[] r11 = r10.f10749j     // Catch:{ all -> 0x00d9 }
            int r8 = r10.f10750k     // Catch:{ all -> 0x00d9 }
            int r8 = r8 + r1
            java.lang.Object[] r1 = r10.f10749j     // Catch:{ all -> 0x00d9 }
            int r1 = r1.length     // Catch:{ all -> 0x00d9 }
            int r8 = r8 % r1
            r11[r8] = r3     // Catch:{ all -> 0x00d9 }
            goto L_0x00be
        L_0x00a8:
            boolean r11 = r11.u()     // Catch:{ all -> 0x00d9 }
            if (r11 != 0) goto L_0x00be
            r10.size = r1     // Catch:{ all -> 0x00d9 }
            java.lang.Object[] r11 = r10.f10749j     // Catch:{ all -> 0x00d9 }
            int r1 = r10.f10750k     // Catch:{ all -> 0x00d9 }
            r11[r1] = r2     // Catch:{ all -> 0x00d9 }
            java.lang.Object r11 = kotlinx.coroutines.h3.e.d()     // Catch:{ all -> 0x00d9 }
            r0.unlock()
            return r11
        L_0x00be:
            int r11 = r10.f10750k     // Catch:{ all -> 0x00d9 }
            int r11 = r11 + r6
            java.lang.Object[] r1 = r10.f10749j     // Catch:{ all -> 0x00d9 }
            int r1 = r1.length     // Catch:{ all -> 0x00d9 }
            int r11 = r11 % r1
            r10.f10750k = r11     // Catch:{ all -> 0x00d9 }
            kotlin.x r11 = kotlin.x.a     // Catch:{ all -> 0x00d9 }
            r0.unlock()
            if (r7 == 0) goto L_0x00d8
            if (r4 == 0) goto L_0x00d4
            r4.Z()
            goto L_0x00d8
        L_0x00d4:
            kotlin.jvm.internal.k.m()
            throw r5
        L_0x00d8:
            return r2
        L_0x00d9:
            r11 = move-exception
            r0.unlock()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.d.P(kotlinx.coroutines.h3.d):java.lang.Object");
    }

    /* access modifiers changed from: protected */
    public Object e(u uVar) {
        ReentrantLock reentrantLock = this.f10748i;
        reentrantLock.lock();
        try {
            return super.e(uVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* access modifiers changed from: protected */
    public String f() {
        return "(buffer:capacity=" + this.f10751l + ",size=" + this.size + ')';
    }

    /* access modifiers changed from: protected */
    public final boolean o() {
        return false;
    }

    /* access modifiers changed from: protected */
    public final boolean q() {
        return this.size == this.f10751l;
    }

    /* access modifiers changed from: protected */
    public Object t(E e2) {
        s y;
        kotlinx.coroutines.internal.x w;
        ReentrantLock reentrantLock = this.f10748i;
        reentrantLock.lock();
        try {
            int i2 = this.size;
            k<?> h2 = h();
            if (h2 != null) {
                return h2;
            }
            if (i2 < this.f10751l) {
                this.size = i2 + 1;
                if (i2 == 0) {
                    do {
                        y = y();
                        if (y != null) {
                            if (y instanceof k) {
                                this.size = i2;
                                if (y != null) {
                                    reentrantLock.unlock();
                                    return y;
                                }
                                kotlin.jvm.internal.k.m();
                                throw null;
                            } else if (y != null) {
                                w = y.w(e2, (m.c) null);
                            } else {
                                kotlin.jvm.internal.k.m();
                                throw null;
                            }
                        }
                    } while (w == null);
                    if (n0.a()) {
                        if (!(w == k.a)) {
                            throw new AssertionError();
                        }
                    }
                    this.size = i2;
                    x xVar = x.a;
                    reentrantLock.unlock();
                    if (y != null) {
                        y.i(e2);
                        if (y != null) {
                            return y.t();
                        }
                        kotlin.jvm.internal.k.m();
                        throw null;
                    }
                    kotlin.jvm.internal.k.m();
                    throw null;
                }
                V(i2);
                this.f10749j[(this.f10750k + i2) % this.f10749j.length] = e2;
                Object obj = b.a;
                reentrantLock.unlock();
                return obj;
            }
            Object obj2 = b.b;
            reentrantLock.unlock();
            return obj2;
        } finally {
            reentrantLock.unlock();
        }
    }
}
