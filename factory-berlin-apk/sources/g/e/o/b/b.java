package g.e.o.b;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import n.a.a;

/* compiled from: FileLogTree */
public class b extends a.c {
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public static final String f10216k = System.getProperty("line.separator");
    private final ThreadLocal<StringBuilder> b = new a(this);
    private final DateFormat c = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss_SSS");
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final DateFormat f10217d = new SimpleDateFormat("HH:mm:ss:SSS");

    /* renamed from: e  reason: collision with root package name */
    private final long f10218e;

    /* renamed from: f  reason: collision with root package name */
    private final Handler f10219f;

    /* renamed from: g  reason: collision with root package name */
    private final HandlerThread f10220g;

    /* renamed from: h  reason: collision with root package name */
    private final File f10221h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final Date f10222i = new Date();

    /* renamed from: j  reason: collision with root package name */
    private File f10223j;

    /* compiled from: FileLogTree */
    class a extends ThreadLocal<StringBuilder> {
        a(b bVar) {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public StringBuilder initialValue() {
            return new StringBuilder();
        }
    }

    /* renamed from: g.e.o.b.b$b  reason: collision with other inner class name */
    /* compiled from: FileLogTree */
    private class C0728b {
        /* access modifiers changed from: private */
        public final String a;
        /* access modifiers changed from: private */
        public final String b;
        /* access modifiers changed from: private */
        public final Throwable c;

        /* synthetic */ C0728b(b bVar, String str, String str2, Throwable th, a aVar) {
            this(bVar, str, str2, th);
        }

        private C0728b(b bVar, String str, String str2, Throwable th) {
            this.a = str;
            this.b = str2;
            this.c = th;
        }
    }

    /* compiled from: FileLogTree */
    private class c extends Handler {
        c(Looper looper) {
            super(looper);
        }

        /* JADX WARNING: Removed duplicated region for block: B:29:0x00bf A[SYNTHETIC, Splitter:B:29:0x00bf] */
        /* JADX WARNING: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void handleMessage(android.os.Message r7) {
            /*
                r6 = this;
                java.lang.String r0 = ","
                java.lang.Object r1 = r7.obj
                g.e.o.b.b$b r1 = (g.e.o.b.b.C0728b) r1
                int r7 = r7.what
                r2 = 3
                if (r7 == r2) goto L_0x001e
                r2 = 4
                if (r7 == r2) goto L_0x001b
                r2 = 5
                if (r7 == r2) goto L_0x0018
                r2 = 6
                if (r7 == r2) goto L_0x0015
                return
            L_0x0015:
                java.lang.String r7 = "ERROR"
                goto L_0x0020
            L_0x0018:
                java.lang.String r7 = "WARN"
                goto L_0x0020
            L_0x001b:
                java.lang.String r7 = "INFO"
                goto L_0x0020
            L_0x001e:
                java.lang.String r7 = "DEBUG"
            L_0x0020:
                g.e.o.b.b r2 = g.e.o.b.b.this
                java.util.Date r2 = r2.f10222i
                long r3 = java.lang.System.currentTimeMillis()
                r2.setTime(r3)
                r2 = 0
                g.e.o.b.b r3 = g.e.o.b.b.this     // Catch:{ IOException -> 0x00bc }
                java.io.File r3 = r3.w()     // Catch:{ IOException -> 0x00bc }
                java.io.FileWriter r4 = new java.io.FileWriter     // Catch:{ IOException -> 0x00bc }
                r5 = 1
                r4.<init>(r3, r5)     // Catch:{ IOException -> 0x00bc }
                g.e.o.b.b r2 = g.e.o.b.b.this     // Catch:{ IOException -> 0x00ba }
                java.util.Date r2 = r2.f10222i     // Catch:{ IOException -> 0x00ba }
                long r2 = r2.getTime()     // Catch:{ IOException -> 0x00ba }
                java.lang.String r2 = java.lang.Long.toString(r2)     // Catch:{ IOException -> 0x00ba }
                r4.append(r2)     // Catch:{ IOException -> 0x00ba }
                r4.append(r0)     // Catch:{ IOException -> 0x00ba }
                g.e.o.b.b r2 = g.e.o.b.b.this     // Catch:{ IOException -> 0x00ba }
                java.text.DateFormat r2 = r2.f10217d     // Catch:{ IOException -> 0x00ba }
                g.e.o.b.b r3 = g.e.o.b.b.this     // Catch:{ IOException -> 0x00ba }
                java.util.Date r3 = r3.f10222i     // Catch:{ IOException -> 0x00ba }
                java.lang.String r2 = r2.format(r3)     // Catch:{ IOException -> 0x00ba }
                r4.append(r2)     // Catch:{ IOException -> 0x00ba }
                r4.append(r0)     // Catch:{ IOException -> 0x00ba }
                r4.append(r7)     // Catch:{ IOException -> 0x00ba }
                r4.append(r0)     // Catch:{ IOException -> 0x00ba }
                java.lang.String r7 = r1.a     // Catch:{ IOException -> 0x00ba }
                r4.append(r7)     // Catch:{ IOException -> 0x00ba }
                java.lang.String r7 = r1.b     // Catch:{ IOException -> 0x00ba }
                java.lang.String r2 = g.e.o.b.b.f10216k     // Catch:{ IOException -> 0x00ba }
                boolean r7 = r7.contains(r2)     // Catch:{ IOException -> 0x00ba }
                if (r7 == 0) goto L_0x008e
                java.lang.String r7 = r1.b     // Catch:{ IOException -> 0x00ba }
                java.lang.String r2 = g.e.o.b.b.f10216k     // Catch:{ IOException -> 0x00ba }
                java.lang.String r3 = " <br> "
                java.lang.String r7 = r7.replace(r2, r3)     // Catch:{ IOException -> 0x00ba }
                goto L_0x0092
            L_0x008e:
                java.lang.String r7 = r1.b     // Catch:{ IOException -> 0x00ba }
            L_0x0092:
                r4.append(r0)     // Catch:{ IOException -> 0x00ba }
                r4.append(r7)     // Catch:{ IOException -> 0x00ba }
                java.lang.Throwable r7 = r1.c     // Catch:{ IOException -> 0x00ba }
                if (r7 == 0) goto L_0x00ac
                r4.append(r0)     // Catch:{ IOException -> 0x00ba }
                java.lang.Throwable r7 = r1.c     // Catch:{ IOException -> 0x00ba }
                java.lang.String r7 = r7.toString()     // Catch:{ IOException -> 0x00ba }
                r4.append(r7)     // Catch:{ IOException -> 0x00ba }
            L_0x00ac:
                java.lang.String r7 = g.e.o.b.b.f10216k     // Catch:{ IOException -> 0x00ba }
                r4.append(r7)     // Catch:{ IOException -> 0x00ba }
                r4.flush()     // Catch:{ IOException -> 0x00ba }
                r4.close()     // Catch:{ IOException -> 0x00ba }
                goto L_0x00c5
            L_0x00ba:
                r2 = r4
                goto L_0x00bd
            L_0x00bc:
            L_0x00bd:
                if (r2 == 0) goto L_0x00c5
                r2.flush()     // Catch:{ IOException -> 0x00c5 }
                r2.close()     // Catch:{ IOException -> 0x00c5 }
            L_0x00c5:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: g.e.o.b.b.c.handleMessage(android.os.Message):void");
        }
    }

    public b(String str, long j2, int i2) {
        this.f10218e = j2 * 1024 * 1024;
        this.f10221h = new File(str);
        HandlerThread handlerThread = new HandlerThread("FileLogTree");
        this.f10220g = handlerThread;
        handlerThread.start();
        this.f10219f = new c(this.f10220g.getLooper());
    }

    /* access modifiers changed from: private */
    public File w() {
        if (this.f10221h.exists() || this.f10221h.mkdirs()) {
            if (this.f10223j == null) {
                String[] list = this.f10221h.list();
                if (list == null) {
                    throw new IOException("Cannot read folder");
                } else if (list.length == 0) {
                    File file = this.f10221h;
                    this.f10223j = new File(file, "log_" + this.c.format(this.f10222i));
                } else {
                    List asList = Arrays.asList(this.f10221h.list());
                    Collections.sort(asList);
                    this.f10223j = new File(this.f10221h, (String) asList.get(asList.size() - 1));
                }
            }
            if (this.f10223j.length() > this.f10218e) {
                File file2 = this.f10221h;
                this.f10223j = new File(file2, "log_" + this.c.format(this.f10222i) + ".log");
            }
            return this.f10223j;
        }
        throw new IOException("Cannot create folders");
    }

    /* access modifiers changed from: protected */
    public void l(int i2, String str, String str2, Throwable th) {
        if (str == null) {
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            if (stackTrace.length > 5) {
                StackTraceElement stackTraceElement = stackTrace[5];
                StringBuilder sb = this.b.get();
                sb.setLength(0);
                sb.append(stackTraceElement.getFileName());
                sb.append(':');
                sb.append(stackTraceElement.getLineNumber());
                sb.append(":");
                sb.append(stackTraceElement.getMethodName());
                str = sb.toString();
            }
        }
        String str3 = str;
        Handler handler = this.f10219f;
        handler.sendMessage(handler.obtainMessage(i2, new C0728b(this, str3, str2, th, (a) null)));
    }
}
