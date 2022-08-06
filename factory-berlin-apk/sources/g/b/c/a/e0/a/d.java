package g.b.c.a.e0.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.crypto.tink.shaded.protobuf.p;
import g.b.c.a.h0.n0;
import g.b.c.a.h0.z0;
import g.b.c.a.k0.e0;
import g.b.c.a.m;
import java.io.CharConversionException;
import java.io.FileNotFoundException;

/* compiled from: SharedPrefKeysetReader */
public final class d implements m {
    private final SharedPreferences a;
    private final String b;

    public d(Context context, String str, String str2) {
        if (str != null) {
            this.b = str;
            Context applicationContext = context.getApplicationContext();
            if (str2 == null) {
                this.a = PreferenceManager.getDefaultSharedPreferences(applicationContext);
            } else {
                this.a = applicationContext.getSharedPreferences(str2, 0);
            }
        } else {
            throw new IllegalArgumentException("keysetName cannot be null");
        }
    }

    private byte[] c() {
        try {
            String string = this.a.getString(this.b, (String) null);
            if (string != null) {
                return e0.a(string);
            }
            throw new FileNotFoundException(String.format("can't read keyset; the pref value %s does not exist", new Object[]{this.b}));
        } catch (ClassCastException | IllegalArgumentException unused) {
            throw new CharConversionException(String.format("can't read keyset; the pref value %s is not a valid hex string", new Object[]{this.b}));
        }
    }

    public z0 a() {
        return z0.W(c(), p.b());
    }

    public n0 b() {
        return n0.R(c(), p.b());
    }
}
