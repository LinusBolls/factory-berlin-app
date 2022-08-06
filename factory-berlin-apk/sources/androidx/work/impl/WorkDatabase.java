package androidx.work.impl;

import android.content.Context;
import androidx.room.k;
import androidx.room.l;
import androidx.work.impl.g;
import androidx.work.impl.l.e;
import androidx.work.impl.l.h;
import androidx.work.impl.l.n;
import e.s.a.b;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public abstract class WorkDatabase extends l {

    /* renamed from: l  reason: collision with root package name */
    private static final long f1591l = TimeUnit.DAYS.toMillis(7);

    static class a extends l.b {
        a() {
        }

        public void c(b bVar) {
            super.c(bVar);
            bVar.beginTransaction();
            try {
                bVar.execSQL(WorkDatabase.C());
                bVar.setTransactionSuccessful();
            } finally {
                bVar.endTransaction();
            }
        }
    }

    static l.b A() {
        return new a();
    }

    static long B() {
        return System.currentTimeMillis() - f1591l;
    }

    static String C() {
        return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (period_start_time + minimum_retention_duration) < " + B() + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
    }

    public static WorkDatabase y(Context context, Executor executor, boolean z) {
        l.a<WorkDatabase> aVar;
        Class<WorkDatabase> cls = WorkDatabase.class;
        if (z) {
            aVar = k.c(context, cls);
            aVar.c();
        } else {
            l.a<WorkDatabase> a2 = k.a(context, cls, "androidx.work.workdb");
            a2.f(executor);
            aVar = a2;
        }
        aVar.a(A());
        aVar.b(g.a);
        aVar.b(new g.d(context, 2, 3));
        aVar.b(g.b);
        aVar.b(g.c);
        aVar.b(new g.d(context, 5, 6));
        aVar.e();
        return aVar.d();
    }

    public abstract e D();

    public abstract h E();

    public abstract androidx.work.impl.l.k F();

    public abstract n G();

    public abstract androidx.work.impl.l.b z();
}
