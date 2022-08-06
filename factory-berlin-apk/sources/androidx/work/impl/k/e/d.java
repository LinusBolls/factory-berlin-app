package androidx.work.impl.k.e;

import android.content.Context;
import android.os.Build;
import androidx.work.impl.k.b;
import androidx.work.impl.k.f.g;
import androidx.work.impl.l.j;
import androidx.work.impl.utils.k.a;

/* compiled from: NetworkConnectedController */
public class d extends c<b> {
    public d(Context context, a aVar) {
        super(g.c(context, aVar).d());
    }

    /* access modifiers changed from: package-private */
    public boolean b(j jVar) {
        return jVar.f1728j.b() == androidx.work.j.CONNECTED;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean c(b bVar) {
        if (Build.VERSION.SDK_INT < 26) {
            return !bVar.a();
        }
        if (!bVar.a() || !bVar.d()) {
            return true;
        }
        return false;
    }
}
