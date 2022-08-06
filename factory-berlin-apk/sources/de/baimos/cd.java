package de.baimos;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class cd extends bn {
    /* access modifiers changed from: private */
    public static final dr c = ds.a(cd.class);
    protected final String a;
    protected final int b;

    public cd(String str) {
        cr crVar = new cr(str);
        this.a = crVar.c();
        this.b = crVar.d();
    }

    /* access modifiers changed from: protected */
    public cm a() {
        final Socket b2 = b();
        int g2 = (int) g();
        if (g2 > 0) {
            b2.setSoTimeout(g2);
        }
        return new cm() {
            public InputStream a() {
                return b2.getInputStream();
            }

            public OutputStream b() {
                return b2.getOutputStream();
            }

            public String c() {
                return "socket://" + cd.this.a + ":" + cd.this.b;
            }

            public void d() {
                try {
                    b2.close();
                } catch (IOException e2) {
                    cd.c.b("failed to close socket", e2);
                }
            }
        };
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x004a, code lost:
        throw new java.io.IOException("Socket refused connection on " + r5.a + ":" + r5.b);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.net.Socket b() {
        /*
            r5 = this;
            java.net.Socket r0 = new java.net.Socket     // Catch:{ Exception -> 0x0028 }
            r0.<init>()     // Catch:{ Exception -> 0x0028 }
            long r1 = r5.g()     // Catch:{ Exception -> 0x0028 }
            int r2 = (int) r1     // Catch:{ Exception -> 0x0028 }
            if (r2 <= 0) goto L_0x0019
            java.net.InetSocketAddress r1 = new java.net.InetSocketAddress     // Catch:{ Exception -> 0x0028 }
            java.lang.String r3 = r5.a     // Catch:{ Exception -> 0x0028 }
            int r4 = r5.b     // Catch:{ Exception -> 0x0028 }
            r1.<init>(r3, r4)     // Catch:{ Exception -> 0x0028 }
            r0.connect(r1, r2)     // Catch:{ Exception -> 0x0028 }
            goto L_0x0025
        L_0x0019:
            java.net.InetSocketAddress r1 = new java.net.InetSocketAddress     // Catch:{ Exception -> 0x0028 }
            java.lang.String r2 = r5.a     // Catch:{ Exception -> 0x0028 }
            int r3 = r5.b     // Catch:{ Exception -> 0x0028 }
            r1.<init>(r2, r3)     // Catch:{ Exception -> 0x0028 }
            r0.connect(r1)     // Catch:{ Exception -> 0x0028 }
        L_0x0025:
            return r0
        L_0x0026:
            r0 = move-exception
            goto L_0x004b
        L_0x0028:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0026 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0026 }
            r1.<init>()     // Catch:{ all -> 0x0026 }
            java.lang.String r2 = "Socket refused connection on "
            r1.append(r2)     // Catch:{ all -> 0x0026 }
            java.lang.String r2 = r5.a     // Catch:{ all -> 0x0026 }
            r1.append(r2)     // Catch:{ all -> 0x0026 }
            java.lang.String r2 = ":"
            r1.append(r2)     // Catch:{ all -> 0x0026 }
            int r2 = r5.b     // Catch:{ all -> 0x0026 }
            r1.append(r2)     // Catch:{ all -> 0x0026 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0026 }
            r0.<init>(r1)     // Catch:{ all -> 0x0026 }
            throw r0     // Catch:{ all -> 0x0026 }
        L_0x004b:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: de.baimos.cd.b():java.net.Socket");
    }
}
