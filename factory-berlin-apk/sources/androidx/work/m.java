package androidx.work;

import android.os.Build;
import androidx.work.r;
import java.util.concurrent.TimeUnit;

/* compiled from: PeriodicWorkRequest */
public final class m extends r {

    /* compiled from: PeriodicWorkRequest */
    public static final class a extends r.a<a, m> {
        public a(Class<? extends ListenableWorker> cls, long j2, TimeUnit timeUnit, long j3, TimeUnit timeUnit2) {
            super(cls);
            this.c.f(timeUnit.toMillis(j2), timeUnit2.toMillis(j3));
        }

        /* access modifiers changed from: package-private */
        public /* bridge */ /* synthetic */ r.a d() {
            j();
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public m c() {
            if (!this.a || Build.VERSION.SDK_INT < 23 || !this.c.f1728j.h()) {
                return new m(this);
            }
            throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
        }

        /* access modifiers changed from: package-private */
        public a j() {
            return this;
        }
    }

    m(a aVar) {
        super(aVar.b, aVar.c, aVar.f1801d);
    }
}
