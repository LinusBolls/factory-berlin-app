package androidx.work.impl.k.e;

import android.content.Context;
import android.os.Build;
import androidx.work.i;
import androidx.work.impl.k.b;
import androidx.work.impl.k.f.g;
import androidx.work.impl.l.j;
import androidx.work.impl.utils.k.a;

/* compiled from: NetworkNotRoamingController */
public class f extends c<b> {

    /* renamed from: e  reason: collision with root package name */
    private static final String f1705e = i.f("NetworkNotRoamingCtrlr");

    public f(Context context, a aVar) {
        super(g.c(context, aVar).d());
    }

    /* access modifiers changed from: package-private */
    public boolean b(j jVar) {
        return jVar.f1728j.b() == androidx.work.j.NOT_ROAMING;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean c(b bVar) {
        if (Build.VERSION.SDK_INT < 24) {
            i.c().a(f1705e, "Not-roaming network constraint is not supported before API 24, only checking for connected state.", new Throwable[0]);
            return !bVar.a();
        } else if (!bVar.a() || !bVar.c()) {
            return true;
        } else {
            return false;
        }
    }
}
