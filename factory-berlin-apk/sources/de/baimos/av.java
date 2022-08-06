package de.baimos;

import de.baimos.blueid.sdk.api.SdkInfo;
import de.baimos.blueid.sdk.api.exceptions.ConnectionIOException;
import de.baimos.blueid.sdk.conn.SdkClientFactory;
import de.baimos.blueid.sdk.metrics.AndroidSdkMetrics;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import org.json.JSONArray;

public class av {
    private static final dr a = ds.a(av.class);
    private al b;
    private ap c;

    /* renamed from: d  reason: collision with root package name */
    private ao f8200d;

    /* renamed from: e  reason: collision with root package name */
    private SdkClientFactory f8201e;

    /* renamed from: f  reason: collision with root package name */
    private String f8202f = SdkInfo.getUrlEncodedVersion();

    /* renamed from: g  reason: collision with root package name */
    private AndroidSdkMetrics f8203g;

    public av(al alVar, ap apVar, ao aoVar, SdkClientFactory sdkClientFactory, AndroidSdkMetrics androidSdkMetrics) {
        this.b = alVar;
        this.c = apVar;
        this.f8200d = aoVar;
        this.f8201e = sdkClientFactory;
        this.f8203g = androidSdkMetrics;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0071 A[SYNTHETIC, Splitter:B:22:0x0071] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0010 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(java.lang.String r17) {
        /*
            r16 = this;
            r1 = r16
            java.lang.String r2 = r16.b()
            de.baimos.ao r0 = r1.f8200d
            java.util.Set r0 = r0.f()
            java.util.Iterator r3 = r0.iterator()
        L_0x0010:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0088
            java.lang.Object r0 = r3.next()
            r4 = r0
            java.lang.String r4 = (java.lang.String) r4
            de.baimos.ao r0 = r1.f8200d
            java.lang.String r0 = r0.b(r4)
            if (r0 == 0) goto L_0x0085
            r5 = 0
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ ar -> 0x0060, Exception -> 0x0058 }
            r6.<init>()     // Catch:{ ar -> 0x0060, Exception -> 0x0058 }
            r6.append(r2)     // Catch:{ ar -> 0x0060, Exception -> 0x0058 }
            java.lang.String r7 = "/tickets/mobiledevice/"
            r6.append(r7)     // Catch:{ ar -> 0x0060, Exception -> 0x0058 }
            r6.append(r4)     // Catch:{ ar -> 0x0060, Exception -> 0x0058 }
            java.lang.String r8 = r6.toString()     // Catch:{ ar -> 0x0060, Exception -> 0x0058 }
            java.lang.String r9 = "POST"
            java.lang.String r10 = ""
            java.lang.String r11 = "application/octet-stream"
            byte[] r12 = de.baimos.bd.a((java.lang.String) r0)     // Catch:{ ar -> 0x0060, Exception -> 0x0058 }
            de.baimos.av$2 r13 = new de.baimos.av$2     // Catch:{ ar -> 0x0060, Exception -> 0x0058 }
            r6 = r17
            r13.<init>(r6)     // Catch:{ ar -> 0x0056, Exception -> 0x0054 }
            de.baimos.blueid.sdk.conn.SdkClientFactory r14 = r1.f8201e     // Catch:{ ar -> 0x0056, Exception -> 0x0054 }
            de.baimos.blueid.sdk.metrics.AndroidSdkMetrics r15 = r1.f8203g     // Catch:{ ar -> 0x0056, Exception -> 0x0054 }
            de.baimos.bm.a(r8, r9, r10, r11, r12, r13, r14, r15)     // Catch:{ ar -> 0x0056, Exception -> 0x0054 }
            r5 = 1
            goto L_0x006f
        L_0x0054:
            r0 = move-exception
            goto L_0x005b
        L_0x0056:
            r0 = move-exception
            goto L_0x0063
        L_0x0058:
            r0 = move-exception
            r6 = r17
        L_0x005b:
            de.baimos.dr r7 = a
            java.lang.String r8 = "Failed to send revocation data to Trust Center. Make sure that you are connected to the internet and your BlueID SDK is not outdated."
            goto L_0x0067
        L_0x0060:
            r0 = move-exception
            r6 = r17
        L_0x0063:
            de.baimos.dr r7 = a
            java.lang.String r8 = "Failed to send revocation data to Trust Center. Make sure that the BlueID SDK is not outdated."
        L_0x0067:
            r7.a(r8, r0)
            de.baimos.blueid.sdk.metrics.AndroidSdkMetrics r7 = r1.f8203g
            r7.addMessage(r8, r0)
        L_0x006f:
            if (r5 == 0) goto L_0x0010
            de.baimos.ao r0 = r1.f8200d     // Catch:{ Exception -> 0x0077 }
            r0.c(r4)     // Catch:{ Exception -> 0x0077 }
            goto L_0x0010
        L_0x0077:
            r0 = move-exception
            de.baimos.dr r4 = a
            java.lang.String r5 = "Failed to remove revocation entry. Make sure the BlueID Mobile Device is properly initialized."
            r4.a(r5, r0)
            de.baimos.blueid.sdk.metrics.AndroidSdkMetrics r4 = r1.f8203g
            r4.addMessage(r5, r0)
            goto L_0x0010
        L_0x0085:
            r6 = r17
            goto L_0x0010
        L_0x0088:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: de.baimos.av.a(java.lang.String):void");
    }

    public void a() {
        final String a2 = new au(this.b, this.f8201e, this.f8203g).a();
        if (this.f8200d != null) {
            a(a2);
        }
        bl a3 = bm.a(b() + "/tickets/v5?apiVersion=" + this.f8202f, "GET", (String) null, (String) null, (byte[]) null, new HashMap<String, String>() {
            {
                put("Authorization", "Bearer " + a2);
            }
        }, this.f8201e, this.f8203g);
        if (a3.a() == 200) {
            if (a3.c() != null) {
                this.b.a("LAST_SYNC_DATE", Long.toString(a3.c().longValue()));
            }
            try {
                JSONArray jSONArray = new JSONArray(new String(a3.b(), "UTF-8"));
                dr drVar = a;
                drVar.d("tickets: " + jSONArray.toString());
                this.c.a(jSONArray);
                a.c("sync complete!");
            } catch (UnsupportedEncodingException e2) {
                throw new ConnectionIOException("failed to decode json", e2);
            }
        } else {
            throw new ConnectionIOException("expected status code 200, but was " + a3.a());
        }
    }

    public String b() {
        return bm.a(this.b.b("HOST"), this.b);
    }
}
