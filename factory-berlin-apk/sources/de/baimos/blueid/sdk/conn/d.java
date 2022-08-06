package de.baimos.blueid.sdk.conn;

import de.baimos.ao;
import de.baimos.bd;
import de.baimos.blueid.sdk.metrics.AndroidSdkMetrics;
import de.baimos.dr;
import de.baimos.ds;

public class d implements de.baimos.blueid.sdk.data.d {
    /* access modifiers changed from: private */
    public static final dr a = ds.a(d.class);
    /* access modifiers changed from: private */
    public ao b;
    /* access modifiers changed from: private */
    public AndroidSdkMetrics c;

    public d(ao aoVar, AndroidSdkMetrics androidSdkMetrics) {
        this.b = aoVar;
        this.c = androidSdkMetrics;
    }

    public void a(final byte[] bArr, final String str) {
        new Thread() {
            public void run() {
                try {
                    d.this.b.a(str, bd.a(bArr));
                } catch (Exception e2) {
                    d.a.a("failed to save revocations", e2);
                    d.this.c.addMessage(e2.toString());
                }
            }
        }.start();
    }
}
