package de.baimos;

import de.baimos.blueid.sdk.conn.SdkClientFactory;
import de.baimos.blueid.sdk.metrics.AndroidSdkMetrics;
import java.util.Map;
import org.json.JSONObject;

public class au {
    private al a;
    private SdkClientFactory b;
    private AndroidSdkMetrics c;

    public au(al alVar, SdkClientFactory sdkClientFactory, AndroidSdkMetrics androidSdkMetrics) {
        this.a = alVar;
        this.b = sdkClientFactory;
        this.c = androidSdkMetrics;
    }

    private String a(String str) {
        return new JSONObject(new String(bm.a(c() + "/oauth/token", "POST", (String) null, (String) null, ("scope=" + str + "&grant_type=client_credentials").getBytes("UTF-8"), (Map<String, String>) null, this.b, "MD_" + this.a.b("DEVICE_ID"), this.a.b("CLIENT_SECRET"), this.c).b(), "UTF-8")).getString("access_token");
    }

    private String c() {
        return bm.a(this.a.b("HOST"), this.a);
    }

    /* access modifiers changed from: protected */
    public String a() {
        return a("sync");
    }

    public final String b() {
        return a("identity");
    }
}
