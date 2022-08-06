package com.google.firebase.crashlytics.d.o.d;

/* compiled from: CompositeCreateReportSpiCall */
public class a implements b {
    private final c a;
    private final d b;

    /* renamed from: com.google.firebase.crashlytics.d.o.d.a$a  reason: collision with other inner class name */
    /* compiled from: CompositeCreateReportSpiCall */
    static /* synthetic */ class C0110a {
        static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.google.firebase.crashlytics.d.o.c.c$a[] r0 = com.google.firebase.crashlytics.d.o.c.c.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                com.google.firebase.crashlytics.d.o.c.c$a r1 = com.google.firebase.crashlytics.d.o.c.c.a.JAVA     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.firebase.crashlytics.d.o.c.c$a r1 = com.google.firebase.crashlytics.d.o.c.c.a.NATIVE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.d.o.d.a.C0110a.<clinit>():void");
        }
    }

    public a(c cVar, d dVar) {
        this.a = cVar;
        this.b = dVar;
    }

    public boolean b(com.google.firebase.crashlytics.d.o.c.a aVar, boolean z) {
        int i2 = C0110a.a[aVar.c.getType().ordinal()];
        if (i2 == 1) {
            this.a.b(aVar, z);
            return true;
        } else if (i2 != 2) {
            return false;
        } else {
            this.b.b(aVar, z);
            return true;
        }
    }
}
