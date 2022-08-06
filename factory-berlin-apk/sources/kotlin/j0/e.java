package kotlin.j0;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.e0.c.p;
import kotlin.g0.c;
import kotlin.i0.d;
import kotlin.j;
import kotlin.jvm.internal.k;

/* compiled from: Strings.kt */
final class e implements d<c> {
    /* access modifiers changed from: private */
    public final CharSequence a;
    /* access modifiers changed from: private */
    public final int b;
    /* access modifiers changed from: private */
    public final int c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final p<CharSequence, Integer, j<Integer, Integer>> f10651d;

    /* compiled from: Strings.kt */
    public static final class a implements Iterator<c>, kotlin.jvm.internal.z.a {

        /* renamed from: g  reason: collision with root package name */
        private int f10652g = -1;

        /* renamed from: h  reason: collision with root package name */
        private int f10653h;

        /* renamed from: i  reason: collision with root package name */
        private int f10654i;

        /* renamed from: j  reason: collision with root package name */
        private c f10655j;

        /* renamed from: k  reason: collision with root package name */
        private int f10656k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ e f10657l;

        a(e eVar) {
            this.f10657l = eVar;
            int f2 = f.f(eVar.b, 0, eVar.a.length());
            this.f10653h = f2;
            this.f10654i = f2;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0021, code lost:
            if (r0 < kotlin.j0.e.d(r6.f10657l)) goto L_0x0023;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final void a() {
            /*
                r6 = this;
                int r0 = r6.f10654i
                r1 = 0
                if (r0 >= 0) goto L_0x000c
                r6.f10652g = r1
                r0 = 0
                r6.f10655j = r0
                goto L_0x009e
            L_0x000c:
                kotlin.j0.e r0 = r6.f10657l
                int r0 = r0.c
                r2 = -1
                r3 = 1
                if (r0 <= 0) goto L_0x0023
                int r0 = r6.f10656k
                int r0 = r0 + r3
                r6.f10656k = r0
                kotlin.j0.e r4 = r6.f10657l
                int r4 = r4.c
                if (r0 >= r4) goto L_0x0031
            L_0x0023:
                int r0 = r6.f10654i
                kotlin.j0.e r4 = r6.f10657l
                java.lang.CharSequence r4 = r4.a
                int r4 = r4.length()
                if (r0 <= r4) goto L_0x0047
            L_0x0031:
                int r0 = r6.f10653h
                kotlin.g0.c r1 = new kotlin.g0.c
                kotlin.j0.e r4 = r6.f10657l
                java.lang.CharSequence r4 = r4.a
                int r4 = kotlin.j0.q.N(r4)
                r1.<init>(r0, r4)
                r6.f10655j = r1
                r6.f10654i = r2
                goto L_0x009c
            L_0x0047:
                kotlin.j0.e r0 = r6.f10657l
                kotlin.e0.c.p r0 = r0.f10651d
                kotlin.j0.e r4 = r6.f10657l
                java.lang.CharSequence r4 = r4.a
                int r5 = r6.f10654i
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object r0 = r0.l(r4, r5)
                kotlin.j r0 = (kotlin.j) r0
                if (r0 != 0) goto L_0x0077
                int r0 = r6.f10653h
                kotlin.g0.c r1 = new kotlin.g0.c
                kotlin.j0.e r4 = r6.f10657l
                java.lang.CharSequence r4 = r4.a
                int r4 = kotlin.j0.q.N(r4)
                r1.<init>(r0, r4)
                r6.f10655j = r1
                r6.f10654i = r2
                goto L_0x009c
            L_0x0077:
                java.lang.Object r2 = r0.a()
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                java.lang.Object r0 = r0.b()
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r4 = r6.f10653h
                kotlin.g0.c r4 = kotlin.g0.f.i(r4, r2)
                r6.f10655j = r4
                int r2 = r2 + r0
                r6.f10653h = r2
                if (r0 != 0) goto L_0x0099
                r1 = 1
            L_0x0099:
                int r2 = r2 + r1
                r6.f10654i = r2
            L_0x009c:
                r6.f10652g = r3
            L_0x009e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.j0.e.a.a():void");
        }

        /* renamed from: c */
        public c next() {
            if (this.f10652g == -1) {
                a();
            }
            if (this.f10652g != 0) {
                c cVar = this.f10655j;
                if (cVar != null) {
                    this.f10655j = null;
                    this.f10652g = -1;
                    return cVar;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.ranges.IntRange");
            }
            throw new NoSuchElementException();
        }

        public boolean hasNext() {
            if (this.f10652g == -1) {
                a();
            }
            return this.f10652g == 1;
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public e(CharSequence charSequence, int i2, int i3, p<? super CharSequence, ? super Integer, j<Integer, Integer>> pVar) {
        k.e(charSequence, "input");
        k.e(pVar, "getNextMatch");
        this.a = charSequence;
        this.b = i2;
        this.c = i3;
        this.f10651d = pVar;
    }

    public Iterator<c> iterator() {
        return new a(this);
    }
}
