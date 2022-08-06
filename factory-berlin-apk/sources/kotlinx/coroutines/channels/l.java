package kotlinx.coroutines.channels;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.k;
import kotlinx.coroutines.h3.d;
import kotlinx.coroutines.h3.e;
import kotlinx.coroutines.internal.m;
import kotlinx.coroutines.internal.x;
import kotlinx.coroutines.n0;

/* compiled from: ConflatedChannel.kt */
public class l<E> extends a<E> {

    /* renamed from: k  reason: collision with root package name */
    private static final x f10755k = new x("EMPTY");

    /* renamed from: i  reason: collision with root package name */
    private final ReentrantLock f10756i = new ReentrantLock();

    /* renamed from: j  reason: collision with root package name */
    private Object f10757j = f10755k;

    /* compiled from: ConflatedChannel.kt */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new a((DefaultConstructorMarker) null);
    }

    /* access modifiers changed from: protected */
    public boolean G(q<? super E> qVar) {
        ReentrantLock reentrantLock = this.f10756i;
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
        return this.f10757j == f10755k;
    }

    /* access modifiers changed from: protected */
    public void L(boolean z) {
        if (z) {
            ReentrantLock reentrantLock = this.f10756i;
            reentrantLock.lock();
            try {
                this.f10757j = f10755k;
                kotlin.x xVar = kotlin.x.a;
            } finally {
                reentrantLock.unlock();
            }
        }
        super.L(z);
    }

    /* access modifiers changed from: protected */
    public Object O() {
        ReentrantLock reentrantLock = this.f10756i;
        reentrantLock.lock();
        try {
            if (this.f10757j == f10755k) {
                Object h2 = h();
                if (h2 == null) {
                    h2 = b.c;
                }
                return h2;
            }
            Object obj = this.f10757j;
            this.f10757j = f10755k;
            kotlin.x xVar = kotlin.x.a;
            reentrantLock.unlock();
            return obj;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* access modifiers changed from: protected */
    public Object P(d<?> dVar) {
        ReentrantLock reentrantLock = this.f10756i;
        reentrantLock.lock();
        try {
            if (this.f10757j == f10755k) {
                Object h2 = h();
                if (h2 == null) {
                    h2 = b.c;
                }
                return h2;
            } else if (!dVar.u()) {
                Object d2 = e.d();
                reentrantLock.unlock();
                return d2;
            } else {
                Object obj = this.f10757j;
                this.f10757j = f10755k;
                kotlin.x xVar = kotlin.x.a;
                reentrantLock.unlock();
                return obj;
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    /* access modifiers changed from: protected */
    public String f() {
        return "(value=" + this.f10757j + ')';
    }

    /* access modifiers changed from: protected */
    public final boolean o() {
        return false;
    }

    /* access modifiers changed from: protected */
    public final boolean q() {
        return false;
    }

    /* access modifiers changed from: protected */
    public Object t(E e2) {
        s y;
        x w;
        ReentrantLock reentrantLock = this.f10756i;
        reentrantLock.lock();
        try {
            k<?> h2 = h();
            if (h2 != null) {
                return h2;
            }
            if (this.f10757j == f10755k) {
                do {
                    y = y();
                    if (y != null) {
                        if (y instanceof k) {
                            if (y != null) {
                                reentrantLock.unlock();
                                return y;
                            }
                            k.m();
                            throw null;
                        } else if (y != null) {
                            w = y.w(e2, (m.c) null);
                        } else {
                            k.m();
                            throw null;
                        }
                    }
                } while (w == null);
                if (n0.a()) {
                    if (!(w == kotlinx.coroutines.k.a)) {
                        throw new AssertionError();
                    }
                }
                kotlin.x xVar = kotlin.x.a;
                reentrantLock.unlock();
                if (y != null) {
                    y.i(e2);
                    if (y != null) {
                        return y.t();
                    }
                    k.m();
                    throw null;
                }
                k.m();
                throw null;
            }
            this.f10757j = e2;
            Object obj = b.a;
            reentrantLock.unlock();
            return obj;
        } finally {
            reentrantLock.unlock();
        }
    }
}
