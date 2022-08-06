package com.sensorberg.encryptor;

import android.content.Context;
import android.content.SharedPreferences;
import g.e.f.b;
import java.util.List;
import kotlin.jvm.internal.k;
import n.a.a;

/* compiled from: DataMigration.kt */
public final class b {
    public static final b a = new b();

    private b() {
    }

    public final void a(EncryptorDb encryptorDb, Context context, String str) {
        k.f(encryptorDb, "newDb");
        k.f(context, "context");
        k.f(str, "alias");
        n nVar = n.a;
        Context applicationContext = context.getApplicationContext();
        k.b(applicationContext, "context.applicationContext");
        EncryptorDb a2 = nVar.a(applicationContext, str);
        List<c> c = a2.y().c();
        a.a("Migrating " + c.size() + " from encrypted messages", new Object[0]);
        encryptorDb.y().d(c);
        a2.d();
        a2.e();
        context.deleteDatabase(n.a.b(str));
    }

    public final boolean b(SharedPreferences sharedPreferences, Context context, String str) {
        k.f(sharedPreferences, "newPrefs");
        k.f(context, "context");
        k.f(str, "alias");
        b.c cVar = g.e.f.b.f9799i;
        return cVar.b(context, "prefs_encryptor_" + str, sharedPreferences);
    }
}
