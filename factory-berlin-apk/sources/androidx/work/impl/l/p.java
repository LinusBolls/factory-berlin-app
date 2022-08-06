package androidx.work.impl.l;

import androidx.work.j;

/* compiled from: WorkTypeConverters */
public class p {

    /* compiled from: WorkTypeConverters */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;
        static final /* synthetic */ int[] c;

        /* JADX WARNING: Can't wrap try/catch for region: R(28:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|(2:17|18)|19|21|22|23|24|25|27|28|29|30|31|32|33|34|35|36|(3:37|38|40)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(29:0|1|2|3|(2:5|6)|7|9|10|11|(2:13|14)|15|(2:17|18)|19|21|22|23|24|25|27|28|29|30|31|32|33|34|35|36|(3:37|38|40)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(30:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|(2:17|18)|19|21|22|23|24|25|27|28|29|30|31|32|33|34|35|36|(3:37|38|40)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(31:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|21|22|23|24|25|27|28|29|30|31|32|33|34|35|36|(3:37|38|40)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x004f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x006a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0074 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x007e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x0088 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x0092 */
        static {
            /*
                androidx.work.j[] r0 = androidx.work.j.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                c = r0
                r1 = 1
                androidx.work.j r2 = androidx.work.j.NOT_REQUIRED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = c     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.work.j r3 = androidx.work.j.CONNECTED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = c     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.work.j r4 = androidx.work.j.UNMETERED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = c     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.work.j r5 = androidx.work.j.NOT_ROAMING     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                r4 = 5
                int[] r5 = c     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.work.j r6 = androidx.work.j.METERED     // Catch:{ NoSuchFieldError -> 0x003e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                androidx.work.a[] r5 = androidx.work.a.values()
                int r5 = r5.length
                int[] r5 = new int[r5]
                b = r5
                androidx.work.a r6 = androidx.work.a.EXPONENTIAL     // Catch:{ NoSuchFieldError -> 0x004f }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x004f }
                r5[r6] = r1     // Catch:{ NoSuchFieldError -> 0x004f }
            L_0x004f:
                int[] r5 = b     // Catch:{ NoSuchFieldError -> 0x0059 }
                androidx.work.a r6 = androidx.work.a.LINEAR     // Catch:{ NoSuchFieldError -> 0x0059 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0059 }
                r5[r6] = r0     // Catch:{ NoSuchFieldError -> 0x0059 }
            L_0x0059:
                androidx.work.p[] r5 = androidx.work.p.values()
                int r5 = r5.length
                int[] r5 = new int[r5]
                a = r5
                androidx.work.p r6 = androidx.work.p.ENQUEUED     // Catch:{ NoSuchFieldError -> 0x006a }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x006a }
                r5[r6] = r1     // Catch:{ NoSuchFieldError -> 0x006a }
            L_0x006a:
                int[] r1 = a     // Catch:{ NoSuchFieldError -> 0x0074 }
                androidx.work.p r5 = androidx.work.p.RUNNING     // Catch:{ NoSuchFieldError -> 0x0074 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0074 }
                r1[r5] = r0     // Catch:{ NoSuchFieldError -> 0x0074 }
            L_0x0074:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x007e }
                androidx.work.p r1 = androidx.work.p.SUCCEEDED     // Catch:{ NoSuchFieldError -> 0x007e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007e }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x007e }
            L_0x007e:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0088 }
                androidx.work.p r1 = androidx.work.p.FAILED     // Catch:{ NoSuchFieldError -> 0x0088 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0088 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0088 }
            L_0x0088:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0092 }
                androidx.work.p r1 = androidx.work.p.BLOCKED     // Catch:{ NoSuchFieldError -> 0x0092 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0092 }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x0092 }
            L_0x0092:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x009d }
                androidx.work.p r1 = androidx.work.p.CANCELLED     // Catch:{ NoSuchFieldError -> 0x009d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009d }
            L_0x009d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.l.p.a.<clinit>():void");
        }
    }

    public static int a(androidx.work.a aVar) {
        int i2 = a.b[aVar.ordinal()];
        if (i2 == 1) {
            return 0;
        }
        if (i2 == 2) {
            return 1;
        }
        throw new IllegalArgumentException("Could not convert " + aVar + " to int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0046 A[SYNTHETIC, Splitter:B:25:0x0046] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x005a A[SYNTHETIC, Splitter:B:36:0x005a] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:15:0x0033=Splitter:B:15:0x0033, B:29:0x004e=Splitter:B:29:0x004e} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static androidx.work.d b(byte[] r6) {
        /*
            androidx.work.d r0 = new androidx.work.d
            r0.<init>()
            if (r6 != 0) goto L_0x0008
            return r0
        L_0x0008:
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            r1.<init>(r6)
            r6 = 0
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch:{ IOException -> 0x003d, all -> 0x0039 }
            r2.<init>(r1)     // Catch:{ IOException -> 0x003d, all -> 0x0039 }
            int r6 = r2.readInt()     // Catch:{ IOException -> 0x0037 }
        L_0x0017:
            if (r6 <= 0) goto L_0x002b
            java.lang.String r3 = r2.readUTF()     // Catch:{ IOException -> 0x0037 }
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch:{ IOException -> 0x0037 }
            boolean r4 = r2.readBoolean()     // Catch:{ IOException -> 0x0037 }
            r0.a(r3, r4)     // Catch:{ IOException -> 0x0037 }
            int r6 = r6 + -1
            goto L_0x0017
        L_0x002b:
            r2.close()     // Catch:{ IOException -> 0x002f }
            goto L_0x0033
        L_0x002f:
            r6 = move-exception
            r6.printStackTrace()
        L_0x0033:
            r1.close()     // Catch:{ IOException -> 0x0052 }
            goto L_0x0056
        L_0x0037:
            r6 = move-exception
            goto L_0x0041
        L_0x0039:
            r0 = move-exception
            r2 = r6
            r6 = r0
            goto L_0x0058
        L_0x003d:
            r2 = move-exception
            r5 = r2
            r2 = r6
            r6 = r5
        L_0x0041:
            r6.printStackTrace()     // Catch:{ all -> 0x0057 }
            if (r2 == 0) goto L_0x004e
            r2.close()     // Catch:{ IOException -> 0x004a }
            goto L_0x004e
        L_0x004a:
            r6 = move-exception
            r6.printStackTrace()
        L_0x004e:
            r1.close()     // Catch:{ IOException -> 0x0052 }
            goto L_0x0056
        L_0x0052:
            r6 = move-exception
            r6.printStackTrace()
        L_0x0056:
            return r0
        L_0x0057:
            r6 = move-exception
        L_0x0058:
            if (r2 == 0) goto L_0x0062
            r2.close()     // Catch:{ IOException -> 0x005e }
            goto L_0x0062
        L_0x005e:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0062:
            r1.close()     // Catch:{ IOException -> 0x0066 }
            goto L_0x006a
        L_0x0066:
            r0 = move-exception
            r0.printStackTrace()
        L_0x006a:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.l.p.b(byte[]):androidx.work.d");
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x005a A[SYNTHETIC, Splitter:B:26:0x005a] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0071 A[SYNTHETIC, Splitter:B:37:0x0071] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:30:0x0062=Splitter:B:30:0x0062, B:15:0x0048=Splitter:B:15:0x0048} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] c(androidx.work.d r4) {
        /*
            int r0 = r4.c()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            java.io.ObjectOutputStream r2 = new java.io.ObjectOutputStream     // Catch:{ IOException -> 0x0054 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x0054 }
            int r1 = r4.c()     // Catch:{ IOException -> 0x004f, all -> 0x004c }
            r2.writeInt(r1)     // Catch:{ IOException -> 0x004f, all -> 0x004c }
            java.util.Set r4 = r4.b()     // Catch:{ IOException -> 0x004f, all -> 0x004c }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ IOException -> 0x004f, all -> 0x004c }
        L_0x0021:
            boolean r1 = r4.hasNext()     // Catch:{ IOException -> 0x004f, all -> 0x004c }
            if (r1 == 0) goto L_0x0040
            java.lang.Object r1 = r4.next()     // Catch:{ IOException -> 0x004f, all -> 0x004c }
            androidx.work.d$a r1 = (androidx.work.d.a) r1     // Catch:{ IOException -> 0x004f, all -> 0x004c }
            android.net.Uri r3 = r1.a()     // Catch:{ IOException -> 0x004f, all -> 0x004c }
            java.lang.String r3 = r3.toString()     // Catch:{ IOException -> 0x004f, all -> 0x004c }
            r2.writeUTF(r3)     // Catch:{ IOException -> 0x004f, all -> 0x004c }
            boolean r1 = r1.b()     // Catch:{ IOException -> 0x004f, all -> 0x004c }
            r2.writeBoolean(r1)     // Catch:{ IOException -> 0x004f, all -> 0x004c }
            goto L_0x0021
        L_0x0040:
            r2.close()     // Catch:{ IOException -> 0x0044 }
            goto L_0x0048
        L_0x0044:
            r4 = move-exception
            r4.printStackTrace()
        L_0x0048:
            r0.close()     // Catch:{ IOException -> 0x0066 }
            goto L_0x006a
        L_0x004c:
            r4 = move-exception
            r1 = r2
            goto L_0x006f
        L_0x004f:
            r4 = move-exception
            r1 = r2
            goto L_0x0055
        L_0x0052:
            r4 = move-exception
            goto L_0x006f
        L_0x0054:
            r4 = move-exception
        L_0x0055:
            r4.printStackTrace()     // Catch:{ all -> 0x0052 }
            if (r1 == 0) goto L_0x0062
            r1.close()     // Catch:{ IOException -> 0x005e }
            goto L_0x0062
        L_0x005e:
            r4 = move-exception
            r4.printStackTrace()
        L_0x0062:
            r0.close()     // Catch:{ IOException -> 0x0066 }
            goto L_0x006a
        L_0x0066:
            r4 = move-exception
            r4.printStackTrace()
        L_0x006a:
            byte[] r4 = r0.toByteArray()
            return r4
        L_0x006f:
            if (r1 == 0) goto L_0x0079
            r1.close()     // Catch:{ IOException -> 0x0075 }
            goto L_0x0079
        L_0x0075:
            r1 = move-exception
            r1.printStackTrace()
        L_0x0079:
            r0.close()     // Catch:{ IOException -> 0x007d }
            goto L_0x0081
        L_0x007d:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0081:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.l.p.c(androidx.work.d):byte[]");
    }

    public static androidx.work.a d(int i2) {
        if (i2 == 0) {
            return androidx.work.a.EXPONENTIAL;
        }
        if (i2 == 1) {
            return androidx.work.a.LINEAR;
        }
        throw new IllegalArgumentException("Could not convert " + i2 + " to BackoffPolicy");
    }

    public static j e(int i2) {
        if (i2 == 0) {
            return j.NOT_REQUIRED;
        }
        if (i2 == 1) {
            return j.CONNECTED;
        }
        if (i2 == 2) {
            return j.UNMETERED;
        }
        if (i2 == 3) {
            return j.NOT_ROAMING;
        }
        if (i2 == 4) {
            return j.METERED;
        }
        throw new IllegalArgumentException("Could not convert " + i2 + " to NetworkType");
    }

    public static androidx.work.p f(int i2) {
        if (i2 == 0) {
            return androidx.work.p.ENQUEUED;
        }
        if (i2 == 1) {
            return androidx.work.p.RUNNING;
        }
        if (i2 == 2) {
            return androidx.work.p.SUCCEEDED;
        }
        if (i2 == 3) {
            return androidx.work.p.FAILED;
        }
        if (i2 == 4) {
            return androidx.work.p.BLOCKED;
        }
        if (i2 == 5) {
            return androidx.work.p.CANCELLED;
        }
        throw new IllegalArgumentException("Could not convert " + i2 + " to State");
    }

    public static int g(j jVar) {
        int i2 = a.c[jVar.ordinal()];
        if (i2 == 1) {
            return 0;
        }
        if (i2 == 2) {
            return 1;
        }
        if (i2 == 3) {
            return 2;
        }
        if (i2 == 4) {
            return 3;
        }
        if (i2 == 5) {
            return 4;
        }
        throw new IllegalArgumentException("Could not convert " + jVar + " to int");
    }

    public static int h(androidx.work.p pVar) {
        switch (a.a[pVar.ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            default:
                throw new IllegalArgumentException("Could not convert " + pVar + " to int");
        }
    }
}
