package kotlinx.coroutines.e3;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.c0.j.a.d;
import kotlin.c0.j.a.f;
import kotlin.x;
import kotlinx.coroutines.channels.r;

/* compiled from: Channels.kt */
final /* synthetic */ class g {

    @f(c = "kotlinx.coroutines.flow.FlowKt__ChannelsKt", f = "Channels.kt", l = {47, 58}, m = "emitAllImpl$FlowKt__ChannelsKt")
    /* compiled from: Channels.kt */
    static final class a extends d {

        /* renamed from: j  reason: collision with root package name */
        /* synthetic */ Object f10779j;

        /* renamed from: k  reason: collision with root package name */
        int f10780k;

        /* renamed from: l  reason: collision with root package name */
        Object f10781l;

        /* renamed from: m  reason: collision with root package name */
        Object f10782m;

        /* renamed from: n  reason: collision with root package name */
        Object f10783n;
        Object o;
        boolean p;

        a(kotlin.c0.d dVar) {
            super(dVar);
        }

        public final Object i(Object obj) {
            this.f10779j = obj;
            this.f10780k |= RecyclerView.UNDEFINED_DURATION;
            return g.b((d) null, (r) null, false, this);
        }
    }

    public static final <T> Object a(d<? super T> dVar, r<? extends T> rVar, kotlin.c0.d<? super x> dVar2) {
        Object b = b(dVar, rVar, true, dVar2);
        return b == d.c() ? b : x.a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0077 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0099 A[SYNTHETIC, Splitter:B:35:0x0099] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x009a A[Catch:{ all -> 0x005f }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static final /* synthetic */ <T> java.lang.Object b(kotlinx.coroutines.e3.d<? super T> r8, kotlinx.coroutines.channels.r<? extends T> r9, boolean r10, kotlin.c0.d<? super kotlin.x> r11) {
        /*
            boolean r0 = r11 instanceof kotlinx.coroutines.e3.g.a
            if (r0 == 0) goto L_0x0013
            r0 = r11
            kotlinx.coroutines.e3.g$a r0 = (kotlinx.coroutines.e3.g.a) r0
            int r1 = r0.f10780k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f10780k = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.e3.g$a r0 = new kotlinx.coroutines.e3.g$a
            r0.<init>(r11)
        L_0x0018:
            java.lang.Object r11 = r0.f10779j
            java.lang.Object r1 = kotlin.c0.i.d.c()
            int r2 = r0.f10780k
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0061
            if (r2 == r4) goto L_0x0049
            if (r2 != r3) goto L_0x0041
            java.lang.Object r8 = r0.o
            java.lang.Object r8 = r0.f10783n
            java.lang.Throwable r8 = (java.lang.Throwable) r8
            boolean r9 = r0.p
            java.lang.Object r10 = r0.f10782m
            kotlinx.coroutines.channels.r r10 = (kotlinx.coroutines.channels.r) r10
            java.lang.Object r2 = r0.f10781l
            kotlinx.coroutines.e3.d r2 = (kotlinx.coroutines.e3.d) r2
            kotlin.l.b(r11)     // Catch:{ all -> 0x005f }
        L_0x003b:
            r11 = r8
            r8 = r2
            r6 = r10
            r10 = r9
            r9 = r6
            goto L_0x0065
        L_0x0041:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0049:
            java.lang.Object r8 = r0.o
            kotlinx.coroutines.e3.d r8 = (kotlinx.coroutines.e3.d) r8
            java.lang.Object r8 = r0.f10783n
            java.lang.Throwable r8 = (java.lang.Throwable) r8
            boolean r9 = r0.p
            java.lang.Object r10 = r0.f10782m
            kotlinx.coroutines.channels.r r10 = (kotlinx.coroutines.channels.r) r10
            java.lang.Object r2 = r0.f10781l
            kotlinx.coroutines.e3.d r2 = (kotlinx.coroutines.e3.d) r2
            kotlin.l.b(r11)     // Catch:{ all -> 0x005f }
            goto L_0x007f
        L_0x005f:
            r8 = move-exception
            goto L_0x00b4
        L_0x0061:
            kotlin.l.b(r11)
            r11 = 0
        L_0x0065:
            r0.f10781l = r8     // Catch:{ all -> 0x00b0 }
            r0.f10782m = r9     // Catch:{ all -> 0x00b0 }
            r0.p = r10     // Catch:{ all -> 0x00b0 }
            r0.f10783n = r11     // Catch:{ all -> 0x00b0 }
            r0.o = r8     // Catch:{ all -> 0x00b0 }
            r0.f10780k = r4     // Catch:{ all -> 0x00b0 }
            java.lang.Object r2 = r9.d(r0)     // Catch:{ all -> 0x00b0 }
            if (r2 != r1) goto L_0x0078
            return r1
        L_0x0078:
            r6 = r2
            r2 = r8
            r8 = r11
            r11 = r6
            r7 = r10
            r10 = r9
            r9 = r7
        L_0x007f:
            kotlinx.coroutines.channels.x r11 = (kotlinx.coroutines.channels.x) r11     // Catch:{ all -> 0x005f }
            java.lang.Object r11 = r11.i()     // Catch:{ all -> 0x005f }
            boolean r5 = kotlinx.coroutines.channels.x.g(r11)     // Catch:{ all -> 0x005f }
            if (r5 == 0) goto L_0x009a
            java.lang.Throwable r11 = kotlinx.coroutines.channels.x.d(r11)     // Catch:{ all -> 0x005f }
            if (r11 != 0) goto L_0x0099
            if (r9 == 0) goto L_0x0096
            kotlinx.coroutines.channels.i.a(r10, r8)
        L_0x0096:
            kotlin.x r8 = kotlin.x.a
            return r8
        L_0x0099:
            throw r11     // Catch:{ all -> 0x005f }
        L_0x009a:
            kotlinx.coroutines.channels.x.e(r11)     // Catch:{ all -> 0x005f }
            r0.f10781l = r2     // Catch:{ all -> 0x005f }
            r0.f10782m = r10     // Catch:{ all -> 0x005f }
            r0.p = r9     // Catch:{ all -> 0x005f }
            r0.f10783n = r8     // Catch:{ all -> 0x005f }
            r0.o = r11     // Catch:{ all -> 0x005f }
            r0.f10780k = r3     // Catch:{ all -> 0x005f }
            java.lang.Object r11 = r2.a(r11, r0)     // Catch:{ all -> 0x005f }
            if (r11 != r1) goto L_0x003b
            return r1
        L_0x00b0:
            r8 = move-exception
            r6 = r10
            r10 = r9
            r9 = r6
        L_0x00b4:
            throw r8     // Catch:{ all -> 0x00b5 }
        L_0x00b5:
            r11 = move-exception
            if (r9 == 0) goto L_0x00bb
            kotlinx.coroutines.channels.i.a(r10, r8)
        L_0x00bb:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.e3.g.b(kotlinx.coroutines.e3.d, kotlinx.coroutines.channels.r, boolean, kotlin.c0.d):java.lang.Object");
    }
}
