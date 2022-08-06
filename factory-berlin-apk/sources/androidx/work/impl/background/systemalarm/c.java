package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import androidx.work.i;
import androidx.work.impl.background.systemalarm.e;
import androidx.work.impl.k.d;
import androidx.work.impl.l.j;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ConstraintsCommandHandler */
class c {

    /* renamed from: e  reason: collision with root package name */
    private static final String f1611e = i.f("ConstraintsCmdHandler");
    private final Context a;
    private final int b;
    private final e c;

    /* renamed from: d  reason: collision with root package name */
    private final d f1612d;

    c(Context context, int i2, e eVar) {
        this.a = context;
        this.b = i2;
        this.c = eVar;
        this.f1612d = new d(this.a, eVar.f(), (androidx.work.impl.k.c) null);
    }

    /* access modifiers changed from: package-private */
    public void a() {
        List<j> q = this.c.g().u().F().q();
        ConstraintProxy.a(this.a, q);
        this.f1612d.d(q);
        ArrayList<j> arrayList = new ArrayList<>(q.size());
        long currentTimeMillis = System.currentTimeMillis();
        for (j next : q) {
            String str = next.a;
            if (currentTimeMillis >= next.a() && (!next.b() || this.f1612d.c(str))) {
                arrayList.add(next);
            }
        }
        for (j jVar : arrayList) {
            String str2 = jVar.a;
            Intent c2 = b.c(this.a, str2);
            i.c().a(f1611e, String.format("Creating a delay_met command for workSpec with id (%s)", new Object[]{str2}), new Throwable[0]);
            e eVar = this.c;
            eVar.k(new e.b(eVar, c2, this.b));
        }
        this.f1612d.e();
    }
}
