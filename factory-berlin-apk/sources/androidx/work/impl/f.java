package androidx.work.impl;

import android.text.TextUtils;
import androidx.work.g;
import androidx.work.i;
import androidx.work.impl.utils.b;
import androidx.work.k;
import androidx.work.l;
import androidx.work.o;
import androidx.work.r;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: WorkContinuationImpl */
public class f extends o {

    /* renamed from: j  reason: collision with root package name */
    private static final String f1661j = i.f("WorkContinuationImpl");
    private final h a;
    private final String b;
    private final g c;

    /* renamed from: d  reason: collision with root package name */
    private final List<? extends r> f1662d;

    /* renamed from: e  reason: collision with root package name */
    private final List<String> f1663e;

    /* renamed from: f  reason: collision with root package name */
    private final List<String> f1664f;

    /* renamed from: g  reason: collision with root package name */
    private final List<f> f1665g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f1666h;

    /* renamed from: i  reason: collision with root package name */
    private l f1667i;

    f(h hVar, List<? extends r> list) {
        this(hVar, (String) null, g.KEEP, list, (List<f>) null);
    }

    private static boolean k(f fVar, Set<String> set) {
        set.addAll(fVar.e());
        Set<String> n2 = n(fVar);
        for (String contains : set) {
            if (n2.contains(contains)) {
                return true;
            }
        }
        List<f> g2 = fVar.g();
        if (g2 != null && !g2.isEmpty()) {
            for (f k2 : g2) {
                if (k(k2, set)) {
                    return true;
                }
            }
        }
        set.removeAll(fVar.e());
        return false;
    }

    public static Set<String> n(f fVar) {
        HashSet hashSet = new HashSet();
        List<f> g2 = fVar.g();
        if (g2 != null && !g2.isEmpty()) {
            for (f e2 : g2) {
                hashSet.addAll(e2.e());
            }
        }
        return hashSet;
    }

    public l a() {
        if (!this.f1666h) {
            b bVar = new b(this);
            this.a.v().b(bVar);
            this.f1667i = bVar.d();
        } else {
            i.c().h(f1661j, String.format("Already enqueued work ids (%s)", new Object[]{TextUtils.join(", ", this.f1663e)}), new Throwable[0]);
        }
        return this.f1667i;
    }

    public o c(List<k> list) {
        return new f(this.a, this.b, g.KEEP, list, Collections.singletonList(this));
    }

    public g d() {
        return this.c;
    }

    public List<String> e() {
        return this.f1663e;
    }

    public String f() {
        return this.b;
    }

    public List<f> g() {
        return this.f1665g;
    }

    public List<? extends r> h() {
        return this.f1662d;
    }

    public h i() {
        return this.a;
    }

    public boolean j() {
        return k(this, new HashSet());
    }

    public boolean l() {
        return this.f1666h;
    }

    public void m() {
        this.f1666h = true;
    }

    f(h hVar, String str, g gVar, List<? extends r> list) {
        this(hVar, str, gVar, list, (List<f>) null);
    }

    f(h hVar, String str, g gVar, List<? extends r> list, List<f> list2) {
        this.a = hVar;
        this.b = str;
        this.c = gVar;
        this.f1662d = list;
        this.f1665g = list2;
        this.f1663e = new ArrayList(this.f1662d.size());
        this.f1664f = new ArrayList();
        if (list2 != null) {
            for (f fVar : list2) {
                this.f1664f.addAll(fVar.f1664f);
            }
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            String b2 = ((r) list.get(i2)).b();
            this.f1663e.add(b2);
            this.f1664f.add(b2);
        }
    }
}
