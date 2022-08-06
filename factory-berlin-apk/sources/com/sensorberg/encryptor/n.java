package com.sensorberg.encryptor;

import android.content.Context;
import kotlin.jvm.internal.k;

/* compiled from: Storage.kt */
public final class n {
    public static final n a = new n();

    private n() {
    }

    public final EncryptorDb a(Context context, String str) {
        k.f(context, "context");
        k.f(str, "alias");
        EncryptorDb d2 = androidx.room.k.a(context, EncryptorDb.class, b(str)).d();
        k.b(d2, "Room.databaseBuilder(con…eFileName(alias)).build()");
        return d2;
    }

    public final String b(String str) {
        k.f(str, "alias");
        return "encryptor_" + str + ".db";
    }
}
