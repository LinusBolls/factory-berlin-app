package com.sensorberg.smartspaces.myrenz.storage;

import g.e.n.c.g.f.f;
import java.util.Collection;
import java.util.List;
import kotlin.c0.j.a.k;
import kotlin.e0.c.p;
import kotlin.l;
import kotlin.x;
import kotlinx.coroutines.a1;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.i0;

/* compiled from: PostBoxStorageImpl.kt */
public final class d implements f {
    /* access modifiers changed from: private */
    public final a a;
    private final d0 b;

    @kotlin.c0.j.a.f(c = "com.sensorberg.smartspaces.myrenz.storage.PostBoxStorageImpl$getAddressForPkaId$2", f = "PostBoxStorageImpl.kt", l = {21}, m = "invokeSuspend")
    /* compiled from: PostBoxStorageImpl.kt */
    static final class a extends k implements p<i0, kotlin.c0.d<? super String>, Object> {

        /* renamed from: k  reason: collision with root package name */
        private i0 f6157k;

        /* renamed from: l  reason: collision with root package name */
        Object f6158l;

        /* renamed from: m  reason: collision with root package name */
        int f6159m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ d f6160n;
        final /* synthetic */ String o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(d dVar, String str, kotlin.c0.d dVar2) {
            super(2, dVar2);
            this.f6160n = dVar;
            this.o = str;
        }

        public final kotlin.c0.d<x> b(Object obj, kotlin.c0.d<?> dVar) {
            kotlin.jvm.internal.k.e(dVar, "completion");
            a aVar = new a(this.f6160n, this.o, dVar);
            aVar.f6157k = (i0) obj;
            return aVar;
        }

        public final Object i(Object obj) {
            Object c = d.c();
            int i2 = this.f6159m;
            if (i2 == 0) {
                l.b(obj);
                i0 i0Var = this.f6157k;
                a d2 = this.f6160n.a;
                String str = this.o;
                this.f6158l = i0Var;
                this.f6159m = 1;
                obj = d2.c(str, this);
                if (obj == c) {
                    return c;
                }
            } else if (i2 == 1) {
                i0 i0Var2 = (i0) this.f6158l;
                l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c cVar = (c) v.A((List) obj);
            if (cVar != null) {
                return cVar.a();
            }
            return null;
        }

        public final Object l(Object obj, Object obj2) {
            return ((a) b(obj, (kotlin.c0.d) obj2)).i(x.a);
        }
    }

    @kotlin.c0.j.a.f(c = "com.sensorberg.smartspaces.myrenz.storage.PostBoxStorageImpl$isPkaIdKnown$2", f = "PostBoxStorageImpl.kt", l = {11}, m = "invokeSuspend")
    /* compiled from: PostBoxStorageImpl.kt */
    static final class b extends k implements p<i0, kotlin.c0.d<? super Boolean>, Object> {

        /* renamed from: k  reason: collision with root package name */
        private i0 f6161k;

        /* renamed from: l  reason: collision with root package name */
        Object f6162l;

        /* renamed from: m  reason: collision with root package name */
        int f6163m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ d f6164n;
        final /* synthetic */ String o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(d dVar, String str, kotlin.c0.d dVar2) {
            super(2, dVar2);
            this.f6164n = dVar;
            this.o = str;
        }

        public final kotlin.c0.d<x> b(Object obj, kotlin.c0.d<?> dVar) {
            kotlin.jvm.internal.k.e(dVar, "completion");
            b bVar = new b(this.f6164n, this.o, dVar);
            bVar.f6161k = (i0) obj;
            return bVar;
        }

        public final Object i(Object obj) {
            Object c = d.c();
            int i2 = this.f6163m;
            if (i2 == 0) {
                l.b(obj);
                i0 i0Var = this.f6161k;
                a d2 = this.f6164n.a;
                String str = this.o;
                this.f6162l = i0Var;
                this.f6163m = 1;
                obj = d2.b(str, this);
                if (obj == c) {
                    return c;
                }
            } else if (i2 == 1) {
                i0 i0Var2 = (i0) this.f6162l;
                l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return kotlin.c0.j.a.b.a(!((Collection) obj).isEmpty());
        }

        public final Object l(Object obj, Object obj2) {
            return ((b) b(obj, (kotlin.c0.d) obj2)).i(x.a);
        }
    }

    @kotlin.c0.j.a.f(c = "com.sensorberg.smartspaces.myrenz.storage.PostBoxStorageImpl$savePkaId$2", f = "PostBoxStorageImpl.kt", l = {17}, m = "invokeSuspend")
    /* compiled from: PostBoxStorageImpl.kt */
    static final class c extends k implements p<i0, kotlin.c0.d<? super x>, Object> {

        /* renamed from: k  reason: collision with root package name */
        private i0 f6165k;

        /* renamed from: l  reason: collision with root package name */
        Object f6166l;

        /* renamed from: m  reason: collision with root package name */
        Object f6167m;

        /* renamed from: n  reason: collision with root package name */
        int f6168n;
        final /* synthetic */ d o;
        final /* synthetic */ String p;
        final /* synthetic */ String q;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(d dVar, String str, String str2, kotlin.c0.d dVar2) {
            super(2, dVar2);
            this.o = dVar;
            this.p = str;
            this.q = str2;
        }

        public final kotlin.c0.d<x> b(Object obj, kotlin.c0.d<?> dVar) {
            kotlin.jvm.internal.k.e(dVar, "completion");
            c cVar = new c(this.o, this.p, this.q, dVar);
            cVar.f6165k = (i0) obj;
            return cVar;
        }

        public final Object i(Object obj) {
            Object c = d.c();
            int i2 = this.f6168n;
            if (i2 == 0) {
                l.b(obj);
                i0 i0Var = this.f6165k;
                c cVar = new c(this.p, this.q);
                a d2 = this.o.a;
                this.f6166l = i0Var;
                this.f6167m = cVar;
                this.f6168n = 1;
                if (d2.a(cVar, this) == c) {
                    return c;
                }
            } else if (i2 == 1) {
                c cVar2 = (c) this.f6167m;
                i0 i0Var2 = (i0) this.f6166l;
                l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return x.a;
        }

        public final Object l(Object obj, Object obj2) {
            return ((c) b(obj, (kotlin.c0.d) obj2)).i(x.a);
        }
    }

    public d(a aVar, d0 d0Var) {
        kotlin.jvm.internal.k.e(aVar, "myRenzDao");
        kotlin.jvm.internal.k.e(d0Var, "dispatcher");
        this.a = aVar;
        this.b = d0Var;
    }

    public Object a(String str, String str2, kotlin.c0.d<? super x> dVar) {
        Object c2 = kotlinx.coroutines.d.c(this.b, new c(this, str, str2, (kotlin.c0.d) null), dVar);
        return c2 == d.c() ? c2 : x.a;
    }

    public Object b(String str, kotlin.c0.d<? super Boolean> dVar) {
        return kotlinx.coroutines.d.c(this.b, new b(this, str, (kotlin.c0.d) null), dVar);
    }

    public Object c(String str, kotlin.c0.d<? super String> dVar) {
        return kotlinx.coroutines.d.c(this.b, new a(this, str, (kotlin.c0.d) null), dVar);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(a aVar, d0 d0Var, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, (i2 & 2) != 0 ? a1.b() : d0Var);
    }
}
