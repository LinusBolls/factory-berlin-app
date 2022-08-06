package de.baimos;

import android.util.Log;
import de.baimos.bh;
import de.baimos.blueid.sdk.api.log.BlueIDLog;

public class bf extends bh implements dr {

    /* renamed from: de.baimos.bf$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                de.baimos.bh$a[] r0 = de.baimos.bh.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                de.baimos.bh$a r1 = de.baimos.bh.a.ERROR     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001d }
                de.baimos.bh$a r1 = de.baimos.bh.a.WARN     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0028 }
                de.baimos.bh$a r1 = de.baimos.bh.a.INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0033 }
                de.baimos.bh$a r1 = de.baimos.bh.a.DEBUG     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: de.baimos.bf.AnonymousClass1.<clinit>():void");
        }
    }

    public bf(Class cls) {
        this.a = cls.getSimpleName();
    }

    private String e(String str) {
        if (!d()) {
            return str;
        }
        return this.a + "[" + Thread.currentThread().getName() + "]: " + str;
    }

    public void a(bh.a aVar, String str) {
        String e2 = e(str);
        String logTag = BlueIDLog.getLogTag();
        int i2 = AnonymousClass1.a[aVar.ordinal()];
        if (i2 == 1) {
            Log.e(logTag, e2);
        } else if (i2 == 2) {
            Log.w(logTag, e2);
        } else if (i2 == 3) {
            Log.i(logTag, e2);
        } else if (i2 == 4) {
            Log.d(logTag, e2);
        }
    }

    public void a(bh.a aVar, String str, Throwable th) {
        String e2 = e(str);
        String logTag = BlueIDLog.getLogTag();
        int i2 = AnonymousClass1.a[aVar.ordinal()];
        if (i2 == 1) {
            Log.e(logTag, e2, th);
        } else if (i2 == 2) {
            Log.w(logTag, e2, th);
        } else if (i2 == 3) {
            Log.i(logTag, e2, th);
        } else if (i2 == 4) {
            Log.d(logTag, e2, th);
        }
    }

    public /* bridge */ /* synthetic */ void a(String str) {
        super.a(str);
    }

    public /* bridge */ /* synthetic */ void a(String str, Throwable th) {
        super.a(str, th);
    }

    public /* bridge */ /* synthetic */ boolean a() {
        return super.a();
    }

    public /* bridge */ /* synthetic */ void b(String str) {
        super.b(str);
    }

    public /* bridge */ /* synthetic */ void b(String str, Throwable th) {
        super.b(str, th);
    }

    public /* bridge */ /* synthetic */ boolean b() {
        return super.b();
    }

    public /* bridge */ /* synthetic */ void c(String str) {
        super.c(str);
    }

    public /* bridge */ /* synthetic */ void c(String str, Throwable th) {
        super.c(str, th);
    }

    public /* bridge */ /* synthetic */ boolean c() {
        return super.c();
    }

    public /* bridge */ /* synthetic */ void d(String str) {
        super.d(str);
    }

    public /* bridge */ /* synthetic */ void d(String str, Throwable th) {
        super.d(str, th);
    }

    public /* bridge */ /* synthetic */ boolean d() {
        return super.d();
    }
}
