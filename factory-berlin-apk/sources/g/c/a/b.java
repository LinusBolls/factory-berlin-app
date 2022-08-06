package g.c.a;

import android.content.Context;
import java.io.IOException;
import java.io.InputStream;
import org.threeten.bp.zone.c;
import org.threeten.bp.zone.g;
import org.threeten.bp.zone.h;

/* compiled from: AssetsZoneRulesInitializer */
final class b extends g {
    private final Context c;

    /* renamed from: d  reason: collision with root package name */
    private final String f9687d;

    b(Context context, String str) {
        this.c = context;
        this.f9687d = str;
    }

    /* access modifiers changed from: protected */
    public void b() {
        InputStream inputStream = null;
        try {
            inputStream = this.c.getAssets().open(this.f9687d);
            c cVar = new c(inputStream);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused) {
                }
            }
            h.f(cVar);
        } catch (IOException e2) {
            throw new IllegalStateException(this.f9687d + " missing from assets", e2);
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
    }
}
