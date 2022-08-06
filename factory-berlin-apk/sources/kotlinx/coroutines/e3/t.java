package kotlinx.coroutines.e3;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import kotlin.c0.g;
import kotlin.c0.j.a.d;
import kotlin.c0.j.a.f;
import kotlin.jvm.internal.k;
import kotlin.x;
import kotlinx.coroutines.flow.internal.j;
import kotlinx.coroutines.flow.internal.m;

/* compiled from: StateFlow.kt */
final class t<T> implements q<T>, j<T> {
    private volatile Object _state;
    private int a;
    private v[] b = new v[2];
    private int c;

    /* renamed from: d  reason: collision with root package name */
    private int f10846d;

    @f(c = "kotlinx.coroutines.flow.StateFlowImpl", f = "StateFlow.kt", l = {321, 279}, m = "collect")
    /* compiled from: StateFlow.kt */
    static final class a extends d {

        /* renamed from: j  reason: collision with root package name */
        /* synthetic */ Object f10847j;

        /* renamed from: k  reason: collision with root package name */
        int f10848k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ t f10849l;

        /* renamed from: m  reason: collision with root package name */
        Object f10850m;

        /* renamed from: n  reason: collision with root package name */
        Object f10851n;
        Object o;
        Object p;
        Object q;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(t tVar, kotlin.c0.d dVar) {
            super(dVar);
            this.f10849l = tVar;
        }

        public final Object i(Object obj) {
            this.f10847j = obj;
            this.f10848k |= RecyclerView.UNDEFINED_DURATION;
            return this.f10849l.a((d) null, this);
        }
    }

    public t(Object obj) {
        this._state = obj;
    }

    private final v c() {
        v vVar;
        synchronized (this) {
            int length = this.b.length;
            if (this.c >= length) {
                Object[] copyOf = Arrays.copyOf(this.b, length * 2);
                k.b(copyOf, "java.util.Arrays.copyOf(this, newSize)");
                this.b = (v[]) copyOf;
            }
            int i2 = this.f10846d;
            do {
                vVar = this.b[i2];
                if (vVar == null) {
                    vVar = new v();
                    this.b[i2] = vVar;
                }
                i2++;
                if (i2 >= this.b.length) {
                    i2 = 0;
                }
            } while (!vVar.a());
            this.f10846d = i2;
            this.c++;
        }
        return vVar;
    }

    private final void d(v vVar) {
        synchronized (this) {
            vVar.c();
            this.c--;
            x xVar = x.a;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0076 A[Catch:{ all -> 0x005b }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0078 A[Catch:{ all -> 0x005b }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x008b A[Catch:{ all -> 0x005b }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x008c A[Catch:{ all -> 0x005b }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0098 A[Catch:{ all -> 0x005b }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(kotlinx.coroutines.e3.d<? super T> r11, kotlin.c0.d<? super kotlin.x> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof kotlinx.coroutines.e3.t.a
            if (r0 == 0) goto L_0x0013
            r0 = r12
            kotlinx.coroutines.e3.t$a r0 = (kotlinx.coroutines.e3.t.a) r0
            int r1 = r0.f10848k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f10848k = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.e3.t$a r0 = new kotlinx.coroutines.e3.t$a
            r0.<init>(r10, r12)
        L_0x0018:
            java.lang.Object r12 = r0.f10847j
            java.lang.Object r1 = kotlin.c0.i.d.c()
            int r2 = r0.f10848k
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x005d
            if (r2 == r5) goto L_0x0047
            if (r2 != r4) goto L_0x003f
            java.lang.Object r11 = r0.q
            java.lang.Object r11 = r0.p
            java.lang.Object r2 = r0.o
            kotlinx.coroutines.e3.v r2 = (kotlinx.coroutines.e3.v) r2
            java.lang.Object r6 = r0.f10851n
            kotlinx.coroutines.e3.d r6 = (kotlinx.coroutines.e3.d) r6
            java.lang.Object r7 = r0.f10850m
            kotlinx.coroutines.e3.t r7 = (kotlinx.coroutines.e3.t) r7
            kotlin.l.b(r12)     // Catch:{ all -> 0x005b }
            r12 = r11
            r11 = r6
            goto L_0x0067
        L_0x003f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0047:
            java.lang.Object r11 = r0.q
            java.lang.Object r2 = r0.p
            java.lang.Object r2 = r0.o
            kotlinx.coroutines.e3.v r2 = (kotlinx.coroutines.e3.v) r2
            java.lang.Object r6 = r0.f10851n
            kotlinx.coroutines.e3.d r6 = (kotlinx.coroutines.e3.d) r6
            java.lang.Object r7 = r0.f10850m
            kotlinx.coroutines.e3.t r7 = (kotlinx.coroutines.e3.t) r7
            kotlin.l.b(r12)     // Catch:{ all -> 0x005b }
            goto L_0x008f
        L_0x005b:
            r11 = move-exception
            goto L_0x00ab
        L_0x005d:
            kotlin.l.b(r12)
            kotlinx.coroutines.e3.v r12 = r10.c()
            r7 = r10
            r2 = r12
            r12 = r3
        L_0x0067:
            java.lang.Object r6 = r7._state     // Catch:{ all -> 0x005b }
            if (r12 == 0) goto L_0x0072
            boolean r8 = kotlin.jvm.internal.k.a(r6, r12)     // Catch:{ all -> 0x005b }
            r8 = r8 ^ r5
            if (r8 == 0) goto L_0x0092
        L_0x0072:
            kotlinx.coroutines.internal.x r8 = kotlinx.coroutines.flow.internal.m.a     // Catch:{ all -> 0x005b }
            if (r6 != r8) goto L_0x0078
            r8 = r3
            goto L_0x0079
        L_0x0078:
            r8 = r6
        L_0x0079:
            r0.f10850m = r7     // Catch:{ all -> 0x005b }
            r0.f10851n = r11     // Catch:{ all -> 0x005b }
            r0.o = r2     // Catch:{ all -> 0x005b }
            r0.p = r12     // Catch:{ all -> 0x005b }
            r0.q = r6     // Catch:{ all -> 0x005b }
            r0.f10848k = r5     // Catch:{ all -> 0x005b }
            java.lang.Object r12 = r11.a(r8, r0)     // Catch:{ all -> 0x005b }
            if (r12 != r1) goto L_0x008c
            return r1
        L_0x008c:
            r9 = r6
            r6 = r11
            r11 = r9
        L_0x008f:
            r12 = r11
            r11 = r6
            r6 = r12
        L_0x0092:
            boolean r8 = r2.e()     // Catch:{ all -> 0x005b }
            if (r8 != 0) goto L_0x0067
            r0.f10850m = r7     // Catch:{ all -> 0x005b }
            r0.f10851n = r11     // Catch:{ all -> 0x005b }
            r0.o = r2     // Catch:{ all -> 0x005b }
            r0.p = r12     // Catch:{ all -> 0x005b }
            r0.q = r6     // Catch:{ all -> 0x005b }
            r0.f10848k = r4     // Catch:{ all -> 0x005b }
            java.lang.Object r6 = r2.b(r0)     // Catch:{ all -> 0x005b }
            if (r6 != r1) goto L_0x0067
            return r1
        L_0x00ab:
            r7.d(r2)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.e3.t.a(kotlinx.coroutines.e3.d, kotlin.c0.d):java.lang.Object");
    }

    public j<T> b(g gVar, int i2) {
        return (i2 == -1 || i2 == 0) ? this : new kotlinx.coroutines.flow.internal.d(this, gVar, i2);
    }

    public T getValue() {
        T t = m.a;
        T t2 = this._state;
        if (t2 == t) {
            return null;
        }
        return t2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0021, code lost:
        r1 = r0.length;
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0023, code lost:
        if (r2 >= r1) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0025, code lost:
        r3 = r0[r2];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0027, code lost:
        if (r3 == null) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0029, code lost:
        r3.d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002c, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002f, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0032, code lost:
        if (r4.a != r5) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0034, code lost:
        r4.a = r5 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0038, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0039, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r5 = r4.a;
        r0 = r4.b;
        r1 = kotlin.x.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0040, code lost:
        monitor-exit(r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setValue(T r5) {
        /*
            r4 = this;
            if (r5 == 0) goto L_0x0003
            goto L_0x0005
        L_0x0003:
            kotlinx.coroutines.internal.x r5 = kotlinx.coroutines.flow.internal.m.a
        L_0x0005:
            monitor-enter(r4)
            java.lang.Object r0 = r4._state     // Catch:{ all -> 0x004b }
            boolean r0 = kotlin.jvm.internal.k.a(r0, r5)     // Catch:{ all -> 0x004b }
            if (r0 == 0) goto L_0x0010
            monitor-exit(r4)
            return
        L_0x0010:
            r4._state = r5     // Catch:{ all -> 0x004b }
            int r5 = r4.a     // Catch:{ all -> 0x004b }
            r0 = r5 & 1
            if (r0 != 0) goto L_0x0045
            int r5 = r5 + 1
            r4.a = r5     // Catch:{ all -> 0x004b }
            kotlinx.coroutines.e3.v[] r0 = r4.b     // Catch:{ all -> 0x004b }
            kotlin.x r1 = kotlin.x.a     // Catch:{ all -> 0x004b }
            monitor-exit(r4)
        L_0x0021:
            int r1 = r0.length
            r2 = 0
        L_0x0023:
            if (r2 >= r1) goto L_0x002f
            r3 = r0[r2]
            if (r3 == 0) goto L_0x002c
            r3.d()
        L_0x002c:
            int r2 = r2 + 1
            goto L_0x0023
        L_0x002f:
            monitor-enter(r4)
            int r0 = r4.a     // Catch:{ all -> 0x0042 }
            if (r0 != r5) goto L_0x003a
            int r5 = r5 + 1
            r4.a = r5     // Catch:{ all -> 0x0042 }
            monitor-exit(r4)
            return
        L_0x003a:
            int r5 = r4.a     // Catch:{ all -> 0x0042 }
            kotlinx.coroutines.e3.v[] r0 = r4.b     // Catch:{ all -> 0x0042 }
            kotlin.x r1 = kotlin.x.a     // Catch:{ all -> 0x0042 }
            monitor-exit(r4)
            goto L_0x0021
        L_0x0042:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        L_0x0045:
            int r5 = r5 + 2
            r4.a = r5     // Catch:{ all -> 0x004b }
            monitor-exit(r4)
            return
        L_0x004b:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.e3.t.setValue(java.lang.Object):void");
    }
}
