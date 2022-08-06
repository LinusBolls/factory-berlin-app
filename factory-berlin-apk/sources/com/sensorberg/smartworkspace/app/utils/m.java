package com.sensorberg.smartworkspace.app.utils;

import android.content.Context;
import android.content.SharedPreferences;
import e.r.a.a;
import e.r.a.b;
import e.r.a.c;
import kotlin.jvm.internal.k;

/* compiled from: SharedPreferenceProviderImpl.kt */
public final class m implements l {
    private final Context a;
    private final g.e.p.c.a b;

    /* compiled from: SharedPreferenceProviderImpl.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new a((DefaultConstructorMarker) null);
    }

    public m(Context context, g.e.p.c.a aVar) {
        k.e(context, "context");
        k.e(aVar, "buildVersionProvider");
        this.a = context;
        this.b = aVar;
    }

    public SharedPreferences a(String str, boolean z) {
        k.e(str, "name");
        if (!z || this.b.a() < 23) {
            SharedPreferences sharedPreferences = this.a.getSharedPreferences("not_encrypted_" + str + "_preferences", 0);
            k.d(sharedPreferences, "context.getSharedPrefere…X\", Context.MODE_PRIVATE)");
            return sharedPreferences;
        }
        Context context = this.a;
        String str2 = "encrypted_" + str + "_preferences";
        c.b bVar = new c.b(this.a);
        bVar.c(c.C0583c.AES256_GCM);
        c a2 = bVar.a();
        k.d(a2, "MasterKey.Builder(contex…cheme.AES256_GCM).build()");
        return b.a(context, str2, a2, a.d.AES256_SIV, a.e.AES256_GCM);
    }
}
