package g.e.f;

import java.io.File;
import kotlin.jvm.internal.k;

/* compiled from: RealFileAccess.kt */
public final class e implements a {
    public static final a c = new a((DefaultConstructorMarker) null);
    private String a;
    private final File b;

    /* compiled from: RealFileAccess.kt */
    public static final class a {
        private a() {
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x003c  */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0041  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.String c(java.io.File r5) {
            /*
                r4 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r1 = 0
                java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ all -> 0x0038 }
                r2.<init>(r5)     // Catch:{ all -> 0x0038 }
                java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch:{ all -> 0x0036 }
                java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ all -> 0x0036 }
                r3.<init>(r2)     // Catch:{ all -> 0x0036 }
                r5.<init>(r3)     // Catch:{ all -> 0x0036 }
                java.lang.String r1 = r5.readLine()     // Catch:{ all -> 0x0033 }
            L_0x0019:
                if (r1 == 0) goto L_0x0023
                r0.append(r1)     // Catch:{ all -> 0x0033 }
                java.lang.String r1 = r5.readLine()     // Catch:{ all -> 0x0033 }
                goto L_0x0019
            L_0x0023:
                r5.close()
                r2.close()
                java.lang.String r5 = r0.toString()
                java.lang.String r0 = "sb.toString()"
                kotlin.jvm.internal.k.b(r5, r0)
                return r5
            L_0x0033:
                r0 = move-exception
                r1 = r5
                goto L_0x003a
            L_0x0036:
                r0 = move-exception
                goto L_0x003a
            L_0x0038:
                r0 = move-exception
                r2 = r1
            L_0x003a:
                if (r1 == 0) goto L_0x003f
                r1.close()
            L_0x003f:
                if (r2 == 0) goto L_0x0044
                r2.close()
            L_0x0044:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: g.e.f.e.a.c(java.io.File):java.lang.String");
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0021  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0026  */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x002b  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void d(java.io.File r3, java.lang.String r4) {
            /*
                r2 = this;
                r0 = 0
                java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ all -> 0x001d }
                r1.<init>(r3)     // Catch:{ all -> 0x001d }
                java.io.OutputStreamWriter r3 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x001b }
                r3.<init>(r1)     // Catch:{ all -> 0x001b }
                r3.write(r4)     // Catch:{ all -> 0x0018 }
                r3.close()
                r1.flush()
                r1.close()
                return
            L_0x0018:
                r4 = move-exception
                r0 = r3
                goto L_0x001f
            L_0x001b:
                r4 = move-exception
                goto L_0x001f
            L_0x001d:
                r4 = move-exception
                r1 = r0
            L_0x001f:
                if (r0 == 0) goto L_0x0024
                r0.close()
            L_0x0024:
                if (r1 == 0) goto L_0x0029
                r1.flush()
            L_0x0029:
                if (r1 == 0) goto L_0x002e
                r1.close()
            L_0x002e:
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: g.e.f.e.a.d(java.io.File, java.lang.String):void");
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public e(File file) {
        k.f(file, "file");
        this.b = file;
    }

    public void a(String str) {
        k.f(str, "data");
        if (!this.b.exists() || (!k.a(str, this.a))) {
            c.d(this.b, str);
            this.a = str;
        }
    }

    public String b() {
        String a2 = this.b.exists() ? c.c(this.b) : null;
        this.a = a2;
        return a2;
    }

    public String toString() {
        return "FileAccess to " + this.b.getAbsolutePath();
    }
}
