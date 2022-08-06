package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

final class d implements DynamiteModule.a {
    d() {
    }

    public final DynamiteModule.a.b a(Context context, String str, DynamiteModule.a.C0067a aVar) {
        DynamiteModule.a.b bVar = new DynamiteModule.a.b();
        bVar.a = aVar.a(context, str);
        int b = aVar.b(context, str, true);
        bVar.b = b;
        if (bVar.a == 0 && b == 0) {
            bVar.c = 0;
        } else if (bVar.b >= bVar.a) {
            bVar.c = 1;
        } else {
            bVar.c = -1;
        }
        return bVar;
    }
}
