package e.r.a;

import android.content.Context;
import android.content.SharedPreferences;
import e.r.a.a;
import kotlin.jvm.internal.k;

/* compiled from: EncryptedSharedPreferences.kt */
public final class b {
    public static final SharedPreferences a(Context context, String str, c cVar, a.d dVar, a.e eVar) {
        k.f(context, "context");
        k.f(str, "fileName");
        k.f(cVar, "masterKey");
        k.f(dVar, "prefKeyEncryptionScheme");
        k.f(eVar, "prefValueEncryptionScheme");
        SharedPreferences a = a.a(context, str, cVar, dVar, eVar);
        k.b(a, "EncryptedSharedPreferenc…efValueEncryptionScheme\n)");
        return a;
    }
}
