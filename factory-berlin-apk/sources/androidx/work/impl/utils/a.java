package androidx.work.impl.utils;

import androidx.work.impl.WorkDatabase;
import androidx.work.impl.d;
import androidx.work.impl.e;
import androidx.work.impl.h;
import androidx.work.impl.l.k;
import androidx.work.l;
import androidx.work.p;
import java.util.LinkedList;

/* compiled from: CancelWorkRunnable */
public abstract class a implements Runnable {

    /* renamed from: g  reason: collision with root package name */
    private final androidx.work.impl.b f1743g = new androidx.work.impl.b();

    /* renamed from: androidx.work.impl.utils.a$a  reason: collision with other inner class name */
    /* compiled from: CancelWorkRunnable */
    static class C0045a extends a {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ h f1744h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ String f1745i;

        C0045a(h hVar, String str) {
            this.f1744h = hVar;
            this.f1745i = str;
        }

        /* JADX INFO: finally extract failed */
        /* access modifiers changed from: package-private */
        public void g() {
            WorkDatabase u = this.f1744h.u();
            u.c();
            try {
                for (String a : u.F().m(this.f1745i)) {
                    a(this.f1744h, a);
                }
                u.x();
                u.i();
                f(this.f1744h);
            } catch (Throwable th) {
                u.i();
                throw th;
            }
        }
    }

    /* compiled from: CancelWorkRunnable */
    static class b extends a {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ h f1746h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ String f1747i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ boolean f1748j;

        b(h hVar, String str, boolean z) {
            this.f1746h = hVar;
            this.f1747i = str;
            this.f1748j = z;
        }

        /* JADX INFO: finally extract failed */
        /* access modifiers changed from: package-private */
        public void g() {
            WorkDatabase u = this.f1746h.u();
            u.c();
            try {
                for (String a : u.F().f(this.f1747i)) {
                    a(this.f1746h, a);
                }
                u.x();
                u.i();
                if (this.f1748j) {
                    f(this.f1746h);
                }
            } catch (Throwable th) {
                u.i();
                throw th;
            }
        }
    }

    public static a b(String str, h hVar, boolean z) {
        return new b(hVar, str, z);
    }

    public static a c(String str, h hVar) {
        return new C0045a(hVar, str);
    }

    private void e(WorkDatabase workDatabase, String str) {
        k F = workDatabase.F();
        androidx.work.impl.l.b z = workDatabase.z();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            p h2 = F.h(str2);
            if (!(h2 == p.SUCCEEDED || h2 == p.FAILED)) {
                F.b(p.CANCELLED, str2);
            }
            linkedList.addAll(z.d(str2));
        }
    }

    /* access modifiers changed from: package-private */
    public void a(h hVar, String str) {
        e(hVar.u(), str);
        hVar.s().h(str);
        for (d cancel : hVar.t()) {
            cancel.cancel(str);
        }
    }

    public l d() {
        return this.f1743g;
    }

    /* access modifiers changed from: package-private */
    public void f(h hVar) {
        e.b(hVar.o(), hVar.u(), hVar.t());
    }

    /* access modifiers changed from: package-private */
    public abstract void g();

    public void run() {
        try {
            g();
            this.f1743g.a(l.a);
        } catch (Throwable th) {
            this.f1743g.a(new l.b.a(th));
        }
    }
}
