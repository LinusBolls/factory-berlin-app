package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.internal.r;
import g.b.a.b.c.b.d;

public final class i<L> {
    private final c a;
    private volatile L b;

    public static final class a<L> {
        private final L a;
        private final String b;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b.equals(aVar.b);
        }

        public final int hashCode() {
            return (System.identityHashCode(this.a) * 31) + this.b.hashCode();
        }
    }

    public interface b<L> {
        void a(L l2);

        void b();
    }

    private final class c extends d {
        public c(Looper looper) {
            super(looper);
        }

        public final void handleMessage(Message message) {
            boolean z = true;
            if (message.what != 1) {
                z = false;
            }
            r.a(z);
            i.this.b((b) message.obj);
        }
    }

    i(Looper looper, L l2, String str) {
        this.a = new c(looper);
        r.l(l2, "Listener must not be null");
        this.b = l2;
        r.g(str);
    }

    public final void a(b<? super L> bVar) {
        r.l(bVar, "Notifier must not be null");
        this.a.sendMessage(this.a.obtainMessage(1, bVar));
    }

    /* access modifiers changed from: package-private */
    public final void b(b<? super L> bVar) {
        L l2 = this.b;
        if (l2 == null) {
            bVar.b();
            return;
        }
        try {
            bVar.a(l2);
        } catch (RuntimeException e2) {
            bVar.b();
            throw e2;
        }
    }
}
