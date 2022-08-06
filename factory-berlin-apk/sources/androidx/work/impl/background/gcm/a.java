package androidx.work.impl.background.gcm;

import androidx.work.c;
import androidx.work.impl.l.j;
import com.google.android.gms.gcm.OneoffTask;
import com.google.android.gms.gcm.Task;
import java.util.concurrent.TimeUnit;

/* compiled from: GcmTaskConverter */
public class a {

    /* renamed from: androidx.work.impl.background.gcm.a$a  reason: collision with other inner class name */
    /* compiled from: GcmTaskConverter */
    static /* synthetic */ class C0042a {
        static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                androidx.work.j[] r0 = androidx.work.j.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                androidx.work.j r1 = androidx.work.j.METERED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.work.j r1 = androidx.work.j.NOT_ROAMING     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.work.j r1 = androidx.work.j.CONNECTED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.work.j r1 = androidx.work.j.UNMETERED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.work.j r1 = androidx.work.j.NOT_REQUIRED     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.background.gcm.a.C0042a.<clinit>():void");
        }
    }

    private static Task.a a(Task.a aVar, j jVar) {
        aVar.c(false);
        aVar.b(2);
        if (jVar.b()) {
            c cVar = jVar.f1728j;
            int i2 = C0042a.a[cVar.b().ordinal()];
            if (i2 == 1 || i2 == 2 || i2 == 3) {
                aVar.b(0);
            } else if (i2 == 4) {
                aVar.b(1);
            } else if (i2 == 5) {
                aVar.b(2);
            }
            if (cVar.g()) {
                aVar.c(true);
            } else {
                aVar.c(false);
            }
        }
        return aVar;
    }

    /* access modifiers changed from: package-private */
    public OneoffTask b(j jVar) {
        OneoffTask.a aVar = new OneoffTask.a();
        aVar.i(WorkManagerGcmService.class);
        aVar.j(jVar.a);
        aVar.k(true);
        aVar.f(false);
        long max = Math.max(TimeUnit.SECONDS.convert(jVar.a(), TimeUnit.MILLISECONDS) - TimeUnit.SECONDS.convert(c(), TimeUnit.MILLISECONDS), 0);
        aVar.e(max, 5 + max);
        a(aVar, jVar);
        return aVar.d();
    }

    public long c() {
        return System.currentTimeMillis();
    }
}
