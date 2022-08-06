package androidx.work;

import android.os.Build;
import androidx.work.r;

/* compiled from: OneTimeWorkRequest */
public final class k extends r {

    /* compiled from: OneTimeWorkRequest */
    public static final class a extends r.a<a, k> {
        public a(Class<? extends ListenableWorker> cls) {
            super(cls);
            this.c.f1722d = OverwritingInputMerger.class.getName();
        }

        /* access modifiers changed from: package-private */
        public /* bridge */ /* synthetic */ r.a d() {
            j();
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public k c() {
            if (!this.a || Build.VERSION.SDK_INT < 23 || !this.c.f1728j.h()) {
                return new k(this);
            }
            throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
        }

        /* access modifiers changed from: package-private */
        public a j() {
            return this;
        }
    }

    k(a aVar) {
        super(aVar.b, aVar.c, aVar.f1801d);
    }
}
