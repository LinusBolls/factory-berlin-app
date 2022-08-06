package androidx.work.impl.k.e;

import android.content.Context;
import androidx.work.impl.k.b;
import androidx.work.impl.l.j;
import androidx.work.impl.utils.k.a;

/* compiled from: NetworkUnmeteredController */
public class g extends c<b> {
    public g(Context context, a aVar) {
        super(androidx.work.impl.k.f.g.c(context, aVar).d());
    }

    /* access modifiers changed from: package-private */
    public boolean b(j jVar) {
        return jVar.f1728j.b() == androidx.work.j.UNMETERED;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean c(b bVar) {
        return !bVar.a() || bVar.b();
    }
}
