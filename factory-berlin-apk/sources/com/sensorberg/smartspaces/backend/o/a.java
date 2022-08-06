package com.sensorberg.smartspaces.backend.o;

import com.sensorberg.smartspaces.backend.j.d.a;
import com.sensorberg.smartspaces.backend.q.p.b;
import g.e.m.c;
import g.e.n.c.g.d;
import g.e.n.c.g.e;
import g.e.n.c.g.f.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.c0.d;
import kotlin.c0.j.a.f;
import kotlin.c0.j.a.k;
import kotlin.e0.c.p;
import kotlin.l;
import kotlin.x;
import kotlinx.coroutines.a1;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.i0;

/* compiled from: PostBoxDataSourceImpl.kt */
public final class a implements c {
    /* access modifiers changed from: private */
    public final b a;
    private final d0 b;

    @f(c = "com.sensorberg.smartspaces.backend.postbox.PostBoxDataSourceImpl$getPostBoxes$2", f = "PostBoxDataSourceImpl.kt", l = {18}, m = "invokeSuspend")
    /* renamed from: com.sensorberg.smartspaces.backend.o.a$a  reason: collision with other inner class name */
    /* compiled from: PostBoxDataSourceImpl.kt */
    static final class C0344a extends k implements p<i0, d<? super g.e.m.c<? extends List<? extends g.e.n.c.g.d>>>, Object> {

        /* renamed from: k  reason: collision with root package name */
        private i0 f6059k;

        /* renamed from: l  reason: collision with root package name */
        Object f6060l;

        /* renamed from: m  reason: collision with root package name */
        int f6061m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ a f6062n;
        final /* synthetic */ String o;
        final /* synthetic */ List p;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0344a(a aVar, String str, List list, d dVar) {
            super(2, dVar);
            this.f6062n = aVar;
            this.o = str;
            this.p = list;
        }

        public final d<x> b(Object obj, d<?> dVar) {
            kotlin.jvm.internal.k.e(dVar, "completion");
            C0344a aVar = new C0344a(this.f6062n, this.o, this.p, dVar);
            aVar.f6059k = (i0) obj;
            return aVar;
        }

        public final Object i(Object obj) {
            Object c = d.c();
            int i2 = this.f6061m;
            if (i2 == 0) {
                l.b(obj);
                i0 i0Var = this.f6059k;
                b c2 = this.f6062n.a;
                com.sensorberg.smartspaces.backend.j.d.a aVar = new com.sensorberg.smartspaces.backend.j.d.a(this.o, this.p);
                this.f6060l = i0Var;
                this.f6061m = 1;
                obj = b.a.b(c2, aVar, false, this, 2, (Object) null);
                if (obj == c) {
                    return c;
                }
            } else if (i2 == 1) {
                i0 i0Var2 = (i0) this.f6060l;
                l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.e.m.c cVar = (g.e.m.c) obj;
            if (cVar instanceof c.a) {
                return cVar;
            }
            List<a.g> b = this.f6062n.e((a.h) cVar.a());
            ArrayList arrayList = new ArrayList();
            for (a.g gVar : b) {
                a.c b2 = gVar.b();
                g.e.n.c.g.d dVar = null;
                if (b2 != null) {
                    String d2 = b2.d();
                    String str = "";
                    if (d2 == null) {
                        d2 = str;
                    }
                    String b3 = b2.b();
                    if (b3 != null) {
                        str = b3;
                    }
                    dVar = new d.a(b2.c(), new e(d2, str));
                } else {
                    a.d c3 = gVar.c();
                    if (c3 != null) {
                        dVar = new d.b(c3.b(), (e) null);
                    }
                }
                if (dVar != null) {
                    arrayList.add(dVar);
                }
            }
            return new c.b(arrayList);
        }

        public final Object l(Object obj, Object obj2) {
            return ((C0344a) b(obj, (kotlin.c0.d) obj2)).i(x.a);
        }
    }

    public a(b bVar, d0 d0Var) {
        kotlin.jvm.internal.k.e(bVar, "graphQlDataSource");
        kotlin.jvm.internal.k.e(d0Var, "dispatcher");
        this.a = bVar;
        this.b = d0Var;
    }

    private final a.g d(a.k kVar) {
        List<a.b> list;
        Object obj;
        boolean z;
        List<a.l> b2 = kVar.b();
        if (b2 != null) {
            list = new ArrayList<>();
            for (a.l b3 : b2) {
                a.b b4 = b3.b();
                if (b4 != null) {
                    list.add(b4);
                }
            }
        } else {
            list = n.g();
        }
        ArrayList arrayList = new ArrayList();
        for (a.b b5 : list) {
            List<a.m> b6 = b5.b();
            if (b6 == null) {
                b6 = n.g();
            }
            boolean unused = s.s(arrayList, b6);
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((a.m) obj).b() != null) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        a.m mVar = (a.m) obj;
        if (mVar != null) {
            return mVar.b();
        }
        return null;
    }

    /* access modifiers changed from: private */
    public final List<a.g> e(a.h hVar) {
        a.n c;
        a.C0263a b2;
        List<a.j> b3;
        a.j jVar;
        a.i b4;
        List<a.k> b5;
        List<T> w;
        if (hVar == null || (c = hVar.c()) == null || (b2 = c.b()) == null || (b3 = b2.b()) == null || (jVar = (a.j) v.A(b3)) == null || (b4 = jVar.b()) == null || (b5 = b4.b()) == null || (w = v.w(b5)) == null) {
            return n.g();
        }
        ArrayList arrayList = new ArrayList();
        for (T d2 : w) {
            a.g d3 = d(d2);
            if (d3 != null) {
                arrayList.add(d3);
            }
        }
        return arrayList;
    }

    public Object a(String str, List<String> list, kotlin.c0.d<? super g.e.m.c<? extends List<? extends g.e.n.c.g.d>>> dVar) {
        return kotlinx.coroutines.d.c(this.b, new C0344a(this, str, list, (kotlin.c0.d) null), dVar);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(b bVar, d0 d0Var, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, (i2 & 2) != 0 ? a1.a() : d0Var);
    }
}
