package g.d.a.a.d;

import android.app.Application;
import android.security.KeyChain;
import android.util.Base64;
import java.io.File;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import javax.crypto.spec.SecretKeySpec;

public class a {
    private Application a;
    private File b;

    private a(Application application, String str) {
        this.a = application;
        KeyChain.isBoundKeyAlgorithm("RSA");
        this.b = new File(application.getFilesDir(), str);
        try {
            b();
        } catch (IOException e2) {
            throw new IllegalStateException(e2);
        } catch (GeneralSecurityException e3) {
            throw new IllegalStateException(e3);
        }
    }

    public static a a(Application application, String str) {
        return new a(application, str);
    }

    public String b() {
        d dVar = new d(this.a, "KeyGenerator");
        if (!this.b.exists()) {
            byte[] bArr = new byte[32];
            new SecureRandom().nextBytes(bArr);
            e.b(this.b, dVar.b(new SecretKeySpec(bArr, "AES")));
        }
        return Base64.encodeToString(dVar.a(e.a(this.b)).getEncoded(), 0);
    }
}
