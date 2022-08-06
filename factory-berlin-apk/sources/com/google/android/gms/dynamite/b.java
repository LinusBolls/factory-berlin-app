package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

final class b implements DynamiteModule.a {
    b() {
    }

    public final DynamiteModule.a.b a(Context context, String str, DynamiteModule.a.C0067a aVar) {
        DynamiteModule.a.b bVar = new DynamiteModule.a.b();
        int a = aVar.a(context, str);
        bVar.a = a;
        if (a != 0) {
            bVar.c = -1;
        } else {
            int b = aVar.b(context, str, true);
            bVar.b = b;
            if (b != 0) {
                bVar.c = 1;
            }
        }
        return bVar;
    }
}
