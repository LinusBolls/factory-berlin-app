package l;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.k;

/* compiled from: SegmentPool.kt */
public final class x {
    private static final int a = 65536;
    private static final w b = new w(new byte[0], 0, 0, false, false);
    private static final int c;

    /* renamed from: d  reason: collision with root package name */
    private static final AtomicReference<w>[] f11138d;

    /* renamed from: e  reason: collision with root package name */
    public static final x f11139e = new x();

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        c = highestOneBit;
        AtomicReference<w>[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i2 = 0; i2 < highestOneBit; i2++) {
            atomicReferenceArr[i2] = new AtomicReference<>();
        }
        f11138d = atomicReferenceArr;
    }

    private x() {
    }

    private final AtomicReference<w> a() {
        Thread currentThread = Thread.currentThread();
        k.b(currentThread, "Thread.currentThread()");
        return f11138d[(int) (currentThread.getId() & (((long) c) - 1))];
    }

    public static final void b(w wVar) {
        AtomicReference<w> a2;
        w wVar2;
        k.f(wVar, "segment");
        if (!(wVar.f11136f == null && wVar.f11137g == null)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (!wVar.f11134d && (wVar2 = a2.get()) != b) {
            int i2 = wVar2 != null ? wVar2.c : 0;
            if (i2 < a) {
                wVar.f11136f = wVar2;
                wVar.b = 0;
                wVar.c = i2 + 8192;
                if (!(a2 = f11139e.a()).compareAndSet(wVar2, wVar)) {
                    wVar.f11136f = null;
                }
            }
        }
    }

    public static final w c() {
        AtomicReference<w> a2 = f11139e.a();
        w andSet = a2.getAndSet(b);
        if (andSet == b) {
            return new w();
        }
        if (andSet == null) {
            a2.set((Object) null);
            return new w();
        }
        a2.set(andSet.f11136f);
        andSet.f11136f = null;
        andSet.c = 0;
        return andSet;
    }
}
