package de.baimos;

import de.baimos.blueid.sdk.metrics.AndroidSdkMetrics;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;

public class an {
    private String a;
    private AndroidSdkMetrics b;

    public an(String str, AndroidSdkMetrics androidSdkMetrics) {
        this.a = str;
        this.b = androidSdkMetrics;
    }

    public KeyPair a(String str, String str2) {
        if (str.equals("RSA")) {
            return az.a().a(Integer.parseInt(str2), this.a, "prvKeyMD");
        }
        if (str.equals("EC")) {
            return az.a().a(str2, this.a, "prvKeyMD");
        }
        throw new NoSuchAlgorithmException(str);
    }

    public PrivateKey a() {
        return az.a().a(this.a, "prvKeyMD", this.b);
    }

    public void b() {
        try {
            for (String next : az.a().b()) {
                if (next.startsWith(this.a + "_") && !next.endsWith("_system")) {
                    az.a().b(next);
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            this.b.addMessage(e2);
        }
    }
}
