package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

final class c implements DynamiteModule.a {
    c() {
    }

    public final DynamiteModule.a.b a(Context context, String str, DynamiteModule.a.C0067a aVar) {
        DynamiteModule.a.b bVar = new DynamiteModule.a.b();
        int a = aVar.a(context, str);
        bVar.a = a;
        if (a != 0) {
            bVar.b = aVar.b(context, str, false);
        } else {
            bVar.b = aVar.b(context, str, true);
        }
        if (bVar.a == 0 && bVar.b == 0) {
            bVar.c = 0;
        } else if (bVar.a >= bVar.b) {
            bVar.c = -1;
        } else {
            bVar.c = 1;
        }
        return bVar;
    }
}
