package g.e.n.d;

import android.app.Application;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import g.e.m.c;
import g.e.n.c.g.f.e;
import g.e.n.d.d;
import g.e.n.d.j;
import g.e.n.d.q;
import g.e.n.d.v;
import kotlin.c0.j.a.f;
import kotlin.c0.j.a.k;
import kotlin.e0.c.l;
import kotlin.e0.c.p;
import kotlin.x;
import kotlinx.coroutines.a1;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.i0;
import kotlinx.coroutines.z2;

/* compiled from: PostBoxInteractorImpl.kt */
public final class y implements e {

    /* renamed from: d  reason: collision with root package name */
    private static final v f10125d = v.b.b;

    /* renamed from: e  reason: collision with root package name */
    public static final a f10126e = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public final s a;
    private final d0 b;
    /* access modifiers changed from: private */
    public final Long c;

    /* compiled from: PostBoxInteractorImpl.kt */
    public static final class a {

        @f(c = "com.sensorberg.smartspaces.myrenz.PostBoxInteractorImpl$Companion", f = "PostBoxInteractorImpl.kt", l = {125}, m = "logMeasuredTime")
        /* renamed from: g.e.n.d.y$a$a  reason: collision with other inner class name */
        /* compiled from: PostBoxInteractorImpl.kt */
        static final class C0714a extends kotlin.c0.j.a.d {

            /* renamed from: j  reason: collision with root package name */
            /* synthetic */ Object f10127j;

            /* renamed from: k  reason: collision with root package name */
            int f10128k;

            /* renamed from: l  reason: collision with root package name */
            final /* synthetic */ a f10129l;

            /* renamed from: m  reason: collision with root package name */
            Object f10130m;

            /* renamed from: n  reason: collision with root package name */
            Object f10131n;
            Object o;
            long p;
            long q;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0714a(a aVar, kotlin.c0.d dVar) {
                super(dVar);
                this.f10129l = aVar;
            }

            public final Object i(Object obj) {
                this.f10127j = obj;
                this.f10128k |= RecyclerView.UNDEFINED_DURATION;
                return this.f10129l.a((String) null, 0, (l) null, this);
            }
        }

        private a() {
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x0044  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ <T> java.lang.Object a(java.lang.String r7, long r8, kotlin.e0.c.l<? super kotlin.c0.d<? super T>, ? extends java.lang.Object> r10, kotlin.c0.d<? super T> r11) {
            /*
                r6 = this;
                boolean r0 = r11 instanceof g.e.n.d.y.a.C0714a
                if (r0 == 0) goto L_0x0013
                r0 = r11
                g.e.n.d.y$a$a r0 = (g.e.n.d.y.a.C0714a) r0
                int r1 = r0.f10128k
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f10128k = r1
                goto L_0x0018
            L_0x0013:
                g.e.n.d.y$a$a r0 = new g.e.n.d.y$a$a
                r0.<init>(r6, r11)
            L_0x0018:
                java.lang.Object r11 = r0.f10127j
                java.lang.Object r1 = kotlin.c0.i.d.c()
                int r2 = r0.f10128k
                r3 = 1
                if (r2 == 0) goto L_0x0044
                if (r2 != r3) goto L_0x003c
                long r7 = r0.q
                java.lang.Object r9 = r0.o
                kotlin.e0.c.l r9 = (kotlin.e0.c.l) r9
                long r9 = r0.p
                java.lang.Object r1 = r0.f10131n
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r0 = r0.f10130m
                g.e.n.d.y$a r0 = (g.e.n.d.y.a) r0
                kotlin.l.b(r11)
                r4 = r7
                r8 = r9
                r7 = r1
                goto L_0x005e
            L_0x003c:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L_0x0044:
                kotlin.l.b(r11)
                long r4 = java.lang.System.currentTimeMillis()
                r0.f10130m = r6
                r0.f10131n = r7
                r0.p = r8
                r0.o = r10
                r0.q = r4
                r0.f10128k = r3
                java.lang.Object r11 = r10.o(r0)
                if (r11 != r1) goto L_0x005e
                return r1
            L_0x005e:
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                r10.append(r7)
                java.lang.String r7 = "  "
                r10.append(r7)
                long r0 = java.lang.System.currentTimeMillis()
                long r0 = r0 - r4
                r10.append(r0)
                java.lang.String r7 = " ms (Timeout : "
                r10.append(r7)
                r10.append(r8)
                java.lang.String r7 = " ms)"
                r10.append(r7)
                java.lang.String r7 = r10.toString()
                r8 = 0
                java.lang.Object[] r8 = new java.lang.Object[r8]
                n.a.a.a(r7, r8)
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: g.e.n.d.y.a.a(java.lang.String, long, kotlin.e0.c.l, kotlin.c0.d):java.lang.Object");
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @f(c = "com.sensorberg.smartspaces.myrenz.PostBoxInteractorImpl$authenticate$2", f = "PostBoxInteractorImpl.kt", l = {32}, m = "invokeSuspend")
    /* compiled from: PostBoxInteractorImpl.kt */
    static final class b extends k implements p<i0, kotlin.c0.d<? super g.e.m.c<? extends x>>, Object> {

        /* renamed from: k  reason: collision with root package name */
        private i0 f10132k;

        /* renamed from: l  reason: collision with root package name */
        Object f10133l;

        /* renamed from: m  reason: collision with root package name */
        long f10134m;

        /* renamed from: n  reason: collision with root package name */
        int f10135n;
        final /* synthetic */ y o;
        final /* synthetic */ g.e.n.c.g.e p;

        @f(c = "com.sensorberg.smartspaces.myrenz.PostBoxInteractorImpl$authenticate$2$authenticationResponse$1", f = "PostBoxInteractorImpl.kt", l = {33}, m = "invokeSuspend")
        /* compiled from: PostBoxInteractorImpl.kt */
        static final class a extends k implements p<i0, kotlin.c0.d<? super d>, Object> {

            /* renamed from: k  reason: collision with root package name */
            private i0 f10136k;

            /* renamed from: l  reason: collision with root package name */
            Object f10137l;

            /* renamed from: m  reason: collision with root package name */
            int f10138m;

            /* renamed from: n  reason: collision with root package name */
            final /* synthetic */ b f10139n;
            final /* synthetic */ long o;

            @f(c = "com.sensorberg.smartspaces.myrenz.PostBoxInteractorImpl$authenticate$2$authenticationResponse$1$1", f = "PostBoxInteractorImpl.kt", l = {35}, m = "invokeSuspend")
            /* renamed from: g.e.n.d.y$b$a$a  reason: collision with other inner class name */
            /* compiled from: PostBoxInteractorImpl.kt */
            static final class C0715a extends k implements l<kotlin.c0.d<? super d>, Object> {

                /* renamed from: k  reason: collision with root package name */
                int f10140k;

                /* renamed from: l  reason: collision with root package name */
                final /* synthetic */ a f10141l;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C0715a(a aVar, kotlin.c0.d dVar) {
                    super(1, dVar);
                    this.f10141l = aVar;
                }

                public final Object i(Object obj) {
                    Object c = d.c();
                    int i2 = this.f10140k;
                    if (i2 == 0) {
                        kotlin.l.b(obj);
                        s f2 = this.f10141l.f10139n.o.a;
                        String b = this.f10141l.f10139n.p.b();
                        String a = this.f10141l.f10139n.p.a();
                        this.f10140k = 1;
                        obj = f2.h(b, a, this);
                        if (obj == c) {
                            return c;
                        }
                    } else if (i2 == 1) {
                        kotlin.l.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    return obj;
                }

                public final Object o(Object obj) {
                    return ((C0715a) s((kotlin.c0.d) obj)).i(x.a);
                }

                public final kotlin.c0.d<x> s(kotlin.c0.d<?> dVar) {
                    kotlin.jvm.internal.k.e(dVar, "completion");
                    return new C0715a(this.f10141l, dVar);
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(b bVar, long j2, kotlin.c0.d dVar) {
                super(2, dVar);
                this.f10139n = bVar;
                this.o = j2;
            }

            public final kotlin.c0.d<x> b(Object obj, kotlin.c0.d<?> dVar) {
                kotlin.jvm.internal.k.e(dVar, "completion");
                a aVar = new a(this.f10139n, this.o, dVar);
                aVar.f10136k = (i0) obj;
                return aVar;
            }

            public final Object i(Object obj) {
                Object c = d.c();
                int i2 = this.f10138m;
                if (i2 == 0) {
                    kotlin.l.b(obj);
                    i0 i0Var = this.f10136k;
                    a aVar = y.f10126e;
                    long j2 = this.o;
                    C0715a aVar2 = new C0715a(this, (kotlin.c0.d) null);
                    this.f10137l = i0Var;
                    this.f10138m = 1;
                    obj = aVar.a("authenticate", j2, aVar2, this);
                    if (obj == c) {
                        return c;
                    }
                } else if (i2 == 1) {
                    i0 i0Var2 = (i0) this.f10137l;
                    kotlin.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return obj;
            }

            public final Object l(Object obj, Object obj2) {
                return ((a) b(obj, (kotlin.c0.d) obj2)).i(x.a);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(y yVar, g.e.n.c.g.e eVar, kotlin.c0.d dVar) {
            super(2, dVar);
            this.o = yVar;
            this.p = eVar;
        }

        public final kotlin.c0.d<x> b(Object obj, kotlin.c0.d<?> dVar) {
            kotlin.jvm.internal.k.e(dVar, "completion");
            b bVar = new b(this.o, this.p, dVar);
            bVar.f10132k = (i0) obj;
            return bVar;
        }

        public final Object i(Object obj) {
            long j2;
            Object c = d.c();
            int i2 = this.f10135n;
            if (i2 == 0) {
                kotlin.l.b(obj);
                i0 i0Var = this.f10132k;
                Long g2 = this.o.c;
                long longValue = g2 != null ? g2.longValue() : 4000;
                a aVar = new a(this, longValue, (kotlin.c0.d) null);
                this.f10133l = i0Var;
                this.f10134m = longValue;
                this.f10135n = 1;
                obj = z2.c(longValue, aVar, this);
                if (obj == c) {
                    return c;
                }
                j2 = longValue;
            } else if (i2 == 1) {
                j2 = this.f10134m;
                i0 i0Var2 = (i0) this.f10133l;
                kotlin.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d dVar = (d) obj;
            if (dVar == null) {
                n.a.a.a("Could not authenticate because of timeout after " + j2 + " ms", new Object[0]);
                return new c.a((Throwable) new Exception("Could not authenticate because of timeout"));
            } else if (dVar instanceof d.b) {
                StringBuilder sb = new StringBuilder();
                sb.append("authentication response: ");
                d.b bVar = (d.b) dVar;
                sb.append(bVar.a());
                n.a.a.a(sb.toString(), new Object[0]);
                return new c.a((Throwable) new Exception(bVar.a()));
            } else {
                n.a.a.a("successfully authenticated", new Object[0]);
                return new c.b(x.a);
            }
        }

        public final Object l(Object obj, Object obj2) {
            return ((b) b(obj, (kotlin.c0.d) obj2)).i(x.a);
        }
    }

    @f(c = "com.sensorberg.smartspaces.myrenz.PostBoxInteractorImpl$connect$2", f = "PostBoxInteractorImpl.kt", l = {92}, m = "invokeSuspend")
    /* compiled from: PostBoxInteractorImpl.kt */
    static final class c extends k implements p<i0, kotlin.c0.d<? super g.e.m.c<? extends x>>, Object> {

        /* renamed from: k  reason: collision with root package name */
        private i0 f10142k;

        /* renamed from: l  reason: collision with root package name */
        Object f10143l;

        /* renamed from: m  reason: collision with root package name */
        long f10144m;

        /* renamed from: n  reason: collision with root package name */
        int f10145n;
        final /* synthetic */ y o;
        final /* synthetic */ BluetoothDevice p;

        @f(c = "com.sensorberg.smartspaces.myrenz.PostBoxInteractorImpl$connect$2$device$1", f = "PostBoxInteractorImpl.kt", l = {93}, m = "invokeSuspend")
        /* compiled from: PostBoxInteractorImpl.kt */
        static final class a extends k implements p<i0, kotlin.c0.d<? super n>, Object> {

            /* renamed from: k  reason: collision with root package name */
            private i0 f10146k;

            /* renamed from: l  reason: collision with root package name */
            Object f10147l;

            /* renamed from: m  reason: collision with root package name */
            int f10148m;

            /* renamed from: n  reason: collision with root package name */
            final /* synthetic */ c f10149n;
            final /* synthetic */ long o;

            @f(c = "com.sensorberg.smartspaces.myrenz.PostBoxInteractorImpl$connect$2$device$1$1", f = "PostBoxInteractorImpl.kt", l = {94}, m = "invokeSuspend")
            /* renamed from: g.e.n.d.y$c$a$a  reason: collision with other inner class name */
            /* compiled from: PostBoxInteractorImpl.kt */
            static final class C0716a extends k implements l<kotlin.c0.d<? super n>, Object> {

                /* renamed from: k  reason: collision with root package name */
                int f10150k;

                /* renamed from: l  reason: collision with root package name */
                final /* synthetic */ a f10151l;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C0716a(a aVar, kotlin.c0.d dVar) {
                    super(1, dVar);
                    this.f10151l = aVar;
                }

                public final Object i(Object obj) {
                    Object c = d.c();
                    int i2 = this.f10150k;
                    if (i2 == 0) {
                        kotlin.l.b(obj);
                        s f2 = this.f10151l.f10149n.o.a;
                        BluetoothDevice bluetoothDevice = this.f10151l.f10149n.p;
                        this.f10150k = 1;
                        obj = f2.a(bluetoothDevice, this);
                        if (obj == c) {
                            return c;
                        }
                    } else if (i2 == 1) {
                        kotlin.l.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    return obj;
                }

                public final Object o(Object obj) {
                    return ((C0716a) s((kotlin.c0.d) obj)).i(x.a);
                }

                public final kotlin.c0.d<x> s(kotlin.c0.d<?> dVar) {
                    kotlin.jvm.internal.k.e(dVar, "completion");
                    return new C0716a(this.f10151l, dVar);
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(c cVar, long j2, kotlin.c0.d dVar) {
                super(2, dVar);
                this.f10149n = cVar;
                this.o = j2;
            }

            public final kotlin.c0.d<x> b(Object obj, kotlin.c0.d<?> dVar) {
                kotlin.jvm.internal.k.e(dVar, "completion");
                a aVar = new a(this.f10149n, this.o, dVar);
                aVar.f10146k = (i0) obj;
                return aVar;
            }

            public final Object i(Object obj) {
                Object c = d.c();
                int i2 = this.f10148m;
                if (i2 == 0) {
                    kotlin.l.b(obj);
                    i0 i0Var = this.f10146k;
                    a aVar = y.f10126e;
                    long j2 = this.o;
                    C0716a aVar2 = new C0716a(this, (kotlin.c0.d) null);
                    this.f10147l = i0Var;
                    this.f10148m = 1;
                    obj = aVar.a("connect", j2, aVar2, this);
                    if (obj == c) {
                        return c;
                    }
                } else if (i2 == 1) {
                    i0 i0Var2 = (i0) this.f10147l;
                    kotlin.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return obj;
            }

            public final Object l(Object obj, Object obj2) {
                return ((a) b(obj, (kotlin.c0.d) obj2)).i(x.a);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(y yVar, BluetoothDevice bluetoothDevice, kotlin.c0.d dVar) {
            super(2, dVar);
            this.o = yVar;
            this.p = bluetoothDevice;
        }

        public final kotlin.c0.d<x> b(Object obj, kotlin.c0.d<?> dVar) {
            kotlin.jvm.internal.k.e(dVar, "completion");
            c cVar = new c(this.o, this.p, dVar);
            cVar.f10142k = (i0) obj;
            return cVar;
        }

        public final Object i(Object obj) {
            Object c = d.c();
            int i2 = this.f10145n;
            if (i2 == 0) {
                kotlin.l.b(obj);
                i0 i0Var = this.f10142k;
                Long g2 = this.o.c;
                long longValue = g2 != null ? g2.longValue() : 8000;
                a aVar = new a(this, longValue, (kotlin.c0.d) null);
                this.f10143l = i0Var;
                this.f10144m = longValue;
                this.f10145n = 1;
                obj = z2.c(longValue, aVar, this);
                if (obj == c) {
                    return c;
                }
            } else if (i2 == 1) {
                i0 i0Var2 = (i0) this.f10143l;
                kotlin.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            n nVar = (n) obj;
            if (nVar == null) {
                n.a.a.a("Could not connect because of timeout after 8000 ms", new Object[0]);
                return new c.a((Throwable) new Exception("Could not connect because of timeout"));
            } else if (kotlin.jvm.internal.k.a(nVar.a(), q.d.c)) {
                n.a.a.a("connected with device " + nVar, new Object[0]);
                return new c.b(x.a);
            } else {
                n.a.a.a("connected with device, but status is: " + nVar.a().a(), new Object[0]);
                return new c.a((Throwable) new Exception(nVar.a().a()));
            }
        }

        public final Object l(Object obj, Object obj2) {
            return ((c) b(obj, (kotlin.c0.d) obj2)).i(x.a);
        }
    }

    @f(c = "com.sensorberg.smartspaces.myrenz.PostBoxInteractorImpl$open$2", f = "PostBoxInteractorImpl.kt", l = {57}, m = "invokeSuspend")
    /* compiled from: PostBoxInteractorImpl.kt */
    static final class d extends k implements p<i0, kotlin.c0.d<? super g.e.m.c<? extends x>>, Object> {

        /* renamed from: k  reason: collision with root package name */
        private i0 f10152k;

        /* renamed from: l  reason: collision with root package name */
        Object f10153l;

        /* renamed from: m  reason: collision with root package name */
        long f10154m;

        /* renamed from: n  reason: collision with root package name */
        int f10155n;
        final /* synthetic */ y o;

        @f(c = "com.sensorberg.smartspaces.myrenz.PostBoxInteractorImpl$open$2$communicationResponse$1", f = "PostBoxInteractorImpl.kt", l = {58}, m = "invokeSuspend")
        /* compiled from: PostBoxInteractorImpl.kt */
        static final class a extends k implements p<i0, kotlin.c0.d<? super j>, Object> {

            /* renamed from: k  reason: collision with root package name */
            private i0 f10156k;

            /* renamed from: l  reason: collision with root package name */
            Object f10157l;

            /* renamed from: m  reason: collision with root package name */
            int f10158m;

            /* renamed from: n  reason: collision with root package name */
            final /* synthetic */ d f10159n;
            final /* synthetic */ long o;

            @f(c = "com.sensorberg.smartspaces.myrenz.PostBoxInteractorImpl$open$2$communicationResponse$1$1", f = "PostBoxInteractorImpl.kt", l = {59}, m = "invokeSuspend")
            /* renamed from: g.e.n.d.y$d$a$a  reason: collision with other inner class name */
            /* compiled from: PostBoxInteractorImpl.kt */
            static final class C0717a extends k implements l<kotlin.c0.d<? super j>, Object> {

                /* renamed from: k  reason: collision with root package name */
                int f10160k;

                /* renamed from: l  reason: collision with root package name */
                final /* synthetic */ a f10161l;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C0717a(a aVar, kotlin.c0.d dVar) {
                    super(1, dVar);
                    this.f10161l = aVar;
                }

                public final Object i(Object obj) {
                    Object c = d.c();
                    int i2 = this.f10160k;
                    if (i2 == 0) {
                        kotlin.l.b(obj);
                        s f2 = this.f10161l.f10159n.o.a;
                        this.f10160k = 1;
                        obj = f2.f(this);
                        if (obj == c) {
                            return c;
                        }
                    } else if (i2 == 1) {
                        kotlin.l.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    return obj;
                }

                public final Object o(Object obj) {
                    return ((C0717a) s((kotlin.c0.d) obj)).i(x.a);
                }

                public final kotlin.c0.d<x> s(kotlin.c0.d<?> dVar) {
                    kotlin.jvm.internal.k.e(dVar, "completion");
                    return new C0717a(this.f10161l, dVar);
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(d dVar, long j2, kotlin.c0.d dVar2) {
                super(2, dVar2);
                this.f10159n = dVar;
                this.o = j2;
            }

            public final kotlin.c0.d<x> b(Object obj, kotlin.c0.d<?> dVar) {
                kotlin.jvm.internal.k.e(dVar, "completion");
                a aVar = new a(this.f10159n, this.o, dVar);
                aVar.f10156k = (i0) obj;
                return aVar;
            }

            public final Object i(Object obj) {
                Object c = d.c();
                int i2 = this.f10158m;
                if (i2 == 0) {
                    kotlin.l.b(obj);
                    i0 i0Var = this.f10156k;
                    a aVar = y.f10126e;
                    long j2 = this.o;
                    C0717a aVar2 = new C0717a(this, (kotlin.c0.d) null);
                    this.f10157l = i0Var;
                    this.f10158m = 1;
                    obj = aVar.a("open", j2, aVar2, this);
                    if (obj == c) {
                        return c;
                    }
                } else if (i2 == 1) {
                    i0 i0Var2 = (i0) this.f10157l;
                    kotlin.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return obj;
            }

            public final Object l(Object obj, Object obj2) {
                return ((a) b(obj, (kotlin.c0.d) obj2)).i(x.a);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(y yVar, kotlin.c0.d dVar) {
            super(2, dVar);
            this.o = yVar;
        }

        public final kotlin.c0.d<x> b(Object obj, kotlin.c0.d<?> dVar) {
            kotlin.jvm.internal.k.e(dVar, "completion");
            d dVar2 = new d(this.o, dVar);
            dVar2.f10152k = (i0) obj;
            return dVar2;
        }

        public final Object i(Object obj) {
            long j2;
            Object c = d.c();
            int i2 = this.f10155n;
            if (i2 == 0) {
                kotlin.l.b(obj);
                i0 i0Var = this.f10152k;
                Long g2 = this.o.c;
                long longValue = g2 != null ? g2.longValue() : 5000;
                a aVar = new a(this, longValue, (kotlin.c0.d) null);
                this.f10153l = i0Var;
                this.f10154m = longValue;
                this.f10155n = 1;
                obj = z2.c(longValue, aVar, this);
                if (obj == c) {
                    return c;
                }
                j2 = longValue;
            } else if (i2 == 1) {
                j2 = this.f10154m;
                i0 i0Var2 = (i0) this.f10153l;
                kotlin.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j jVar = (j) obj;
            if (jVar == null) {
                n.a.a.a("could not open box because of timeout after " + j2 + " ms", new Object[0]);
                return new c.a((Throwable) new Exception("Could not open box because of timeout"));
            } else if (kotlin.jvm.internal.k.a(jVar, j.b.c)) {
                n.a.a.a("open box successfully", new Object[0]);
                return new c.b(x.a);
            } else {
                n.a.a.a("communication response from box: " + jVar.a(), new Object[0]);
                return new c.a((Throwable) new Exception(jVar.a()));
            }
        }

        public final Object l(Object obj, Object obj2) {
            return ((d) b(obj, (kotlin.c0.d) obj2)).i(x.a);
        }
    }

    public y(s sVar, d0 d0Var, Long l2) {
        kotlin.jvm.internal.k.e(sVar, "myRenz");
        kotlin.jvm.internal.k.e(d0Var, "dispatcher");
        this.a = sVar;
        this.b = d0Var;
        this.c = l2;
    }

    public Object a(BluetoothDevice bluetoothDevice, kotlin.c0.d<? super g.e.m.c<x>> dVar) {
        return kotlinx.coroutines.d.c(this.b, new c(this, bluetoothDevice, (kotlin.c0.d) null), dVar);
    }

    public Object b(g.e.n.c.g.e eVar, kotlin.c0.d<? super g.e.m.c<x>> dVar) {
        return kotlinx.coroutines.d.c(this.b, new b(this, eVar, (kotlin.c0.d) null), dVar);
    }

    public void c(Application application, boolean z, boolean z2) {
        kotlin.jvm.internal.k.e(application, "application");
        this.a.e(application);
        this.a.j(f10125d);
        this.a.b(application, z, z2);
    }

    public void d(Context context) {
        kotlin.jvm.internal.k.e(context, "context");
        this.a.g();
        n.a.a.a("disconnected", new Object[0]);
        this.a.c();
        n.a.a.a("authentication revoked", new Object[0]);
        this.a.d(context);
        n.a.a.a("unbound from service", new Object[0]);
    }

    public Object e(kotlin.c0.d<? super g.e.m.c<x>> dVar) {
        return kotlinx.coroutines.d.c(this.b, new d(this, (kotlin.c0.d) null), dVar);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(s sVar, d0 d0Var, Long l2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(sVar, (i2 & 2) != 0 ? a1.b() : d0Var, (i2 & 4) != 0 ? null : l2);
    }
}
