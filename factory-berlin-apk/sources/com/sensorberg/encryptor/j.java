package com.sensorberg.encryptor;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.c0;
import androidx.lifecycle.f0;
import g.e.c.h;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;
import javax.crypto.SecretKey;
import kotlin.e0.c.p;
import kotlin.e0.c.q;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import kotlin.x;

/* compiled from: LiveEncryptedString.kt */
public final class j extends c0<String> {
    /* access modifiers changed from: private */
    public static final c I = new c();
    /* access modifiers changed from: private */
    public static final String J;
    private static final long K = K;
    /* access modifiers changed from: private */
    public static final c L;
    /* access modifiers changed from: private */
    public final Executor A;
    /* access modifiers changed from: private */
    public final String B;
    /* access modifiers changed from: private */
    public final e C;
    /* access modifiers changed from: private */
    public final LiveData<SecretKey> D;
    /* access modifiers changed from: private */
    public final boolean E;
    /* access modifiers changed from: private */
    public final LiveData<Boolean> F;
    /* access modifiers changed from: private */
    public final q<String, String, SecretKey, c> G;
    /* access modifiers changed from: private */
    public final p<c, SecretKey, String> H;
    private SecretKey r;
    /* access modifiers changed from: private */
    public final LiveData<c> s;
    /* access modifiers changed from: private */
    public final AtomicLong t = new AtomicLong(K);
    /* access modifiers changed from: private */
    public volatile Long u = Long.valueOf(K);
    /* access modifiers changed from: private */
    public volatile String v = J;
    /* access modifiers changed from: private */
    public volatile c w = L;
    private final Runnable x;
    private final Runnable y;
    private final Executor z;

    /* compiled from: LiveEncryptedString.kt */
    static final class a extends l implements kotlin.e0.c.l<SecretKey, x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ j f5100h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(j jVar) {
            super(1);
            this.f5100h = jVar;
        }

        public final void a(SecretKey secretKey) {
            k.f(secretKey, "it");
            this.f5100h.S(secretKey);
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            a((SecretKey) obj);
            return x.a;
        }
    }

    /* compiled from: LiveEncryptedString.kt */
    static final class b<T> implements f0<Boolean> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ j f5101g;

        b(j jVar) {
            this.f5101g = jVar;
        }

        /* renamed from: a */
        public final void k(Boolean bool) {
            if (k.a(bool, Boolean.TRUE)) {
                n.a.a.j(this.f5101g.B + '(' + this.f5101g.hashCode() + "):onDestroy, nulling the data", new Object[0]);
                this.f5101g.u((String) null);
                j jVar = this.f5101g;
                jVar.w(jVar.D);
                j jVar2 = this.f5101g;
                jVar2.w(jVar2.s);
                j jVar3 = this.f5101g;
                jVar3.w(jVar3.F);
            }
        }
    }

    /* compiled from: LiveEncryptedString.kt */
    public static final class c {
        c() {
        }
    }

    /* compiled from: LiveEncryptedString.kt */
    public static final class d {
        private d() {
        }

        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: LiveEncryptedString.kt */
    static final class e implements Runnable {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ j f5102g;

        e(j jVar) {
            this.f5102g = jVar;
        }

        public final void run() {
            String I;
            synchronized (j.I) {
                I = this.f5102g.v;
                this.f5102g.v = j.J;
                x xVar = x.a;
            }
            if (this.f5102g.E) {
                n.a.a.j(this.f5102g.B + '(' + this.f5102g.hashCode() + "):encrypting. " + I, new Object[0]);
            } else {
                n.a.a.j(this.f5102g.B + '(' + this.f5102g.hashCode() + "):encrypting", new Object[0]);
            }
            if (!k.a(I, j.J)) {
                if (I == null) {
                    n.a.a.j(this.f5102g.B + '(' + this.f5102g.hashCode() + "):deleting message from DB", new Object[0]);
                    this.f5102g.C.f(this.f5102g.B);
                    return;
                }
                q C = this.f5102g.G;
                String x = this.f5102g.B;
                if (I != null) {
                    c cVar = (c) C.k(x, I, j.J(this.f5102g));
                    if (cVar != null) {
                        synchronized (j.I) {
                            this.f5102g.w = cVar;
                            x xVar2 = x.a;
                        }
                        if (this.f5102g.E) {
                            n.a.a.j(this.f5102g.B + '(' + this.f5102g.hashCode() + "):writing message to DB " + cVar.c(), new Object[0]);
                        } else {
                            n.a.a.j(this.f5102g.B + '(' + this.f5102g.hashCode() + "):writing message to DB", new Object[0]);
                        }
                        this.f5102g.C.b(cVar);
                        return;
                    }
                    return;
                }
                k.m();
                throw null;
            }
        }
    }

    /* compiled from: LiveEncryptedString.kt */
    static final class f implements Runnable {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ j f5103g;

        /* compiled from: LiveEncryptedString.kt */
        static final class a implements Runnable {

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ f f5104g;

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ String f5105h;

            a(f fVar, String str) {
                this.f5104g = fVar;
                this.f5105h = str;
            }

            public final void run() {
                Long M = this.f5104g.f5103g.u;
                long j2 = this.f5104g.f5103g.t.get();
                if (M != null && M.longValue() == j2) {
                    this.f5104g.f5103g.u(this.f5105h);
                    return;
                }
                n.a.a.j(this.f5104g.f5103g.B + '(' + this.f5104g.f5103g.hashCode() + "):new value was set, cancelling decrypted message", new Object[0]);
            }
        }

        f(j jVar) {
            this.f5103g = jVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v17, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.lang.String} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r6 = this;
                com.sensorberg.encryptor.j r0 = r6.f5103g
                com.sensorberg.encryptor.e r0 = r0.C
                com.sensorberg.encryptor.j r1 = r6.f5103g
                java.lang.String r1 = r1.B
                com.sensorberg.encryptor.c r0 = r0.a(r1)
                com.sensorberg.encryptor.j r1 = r6.f5103g
                boolean r1 = r1.E
                r2 = 0
                r3 = 0
                r4 = 40
                if (r1 == 0) goto L_0x0060
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                com.sensorberg.encryptor.j r5 = r6.f5103g
                java.lang.String r5 = r5.B
                r1.append(r5)
                r1.append(r4)
                com.sensorberg.encryptor.j r5 = r6.f5103g
                int r5 = r5.hashCode()
                r1.append(r5)
                java.lang.String r5 = "):decrypting from DB. "
                r1.append(r5)
                if (r0 == 0) goto L_0x0042
                java.lang.String r5 = r0.c()
                goto L_0x0043
            L_0x0042:
                r5 = r2
            L_0x0043:
                r1.append(r5)
                java.lang.String r5 = " - "
                r1.append(r5)
                if (r0 == 0) goto L_0x0052
                java.lang.String r5 = r0.d()
                goto L_0x0053
            L_0x0052:
                r5 = r2
            L_0x0053:
                r1.append(r5)
                java.lang.String r1 = r1.toString()
                java.lang.Object[] r5 = new java.lang.Object[r3]
                n.a.a.j(r1, r5)
                goto L_0x0088
            L_0x0060:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                com.sensorberg.encryptor.j r5 = r6.f5103g
                java.lang.String r5 = r5.B
                r1.append(r5)
                r1.append(r4)
                com.sensorberg.encryptor.j r5 = r6.f5103g
                int r5 = r5.hashCode()
                r1.append(r5)
                java.lang.String r5 = "):decrypting from DB"
                r1.append(r5)
                java.lang.String r1 = r1.toString()
                java.lang.Object[] r5 = new java.lang.Object[r3]
                n.a.a.j(r1, r5)
            L_0x0088:
                com.sensorberg.encryptor.c r1 = com.sensorberg.encryptor.j.L
                boolean r1 = kotlin.jvm.internal.k.a(r0, r1)
                if (r1 == 0) goto L_0x0093
                return
            L_0x0093:
                if (r0 != 0) goto L_0x0096
                goto L_0x00a9
            L_0x0096:
                com.sensorberg.encryptor.j r1 = r6.f5103g
                kotlin.e0.c.p r1 = r1.H
                com.sensorberg.encryptor.j r2 = r6.f5103g
                javax.crypto.SecretKey r2 = com.sensorberg.encryptor.j.J(r2)
                java.lang.Object r0 = r1.l(r0, r2)
                r2 = r0
                java.lang.String r2 = (java.lang.String) r2
            L_0x00a9:
                com.sensorberg.encryptor.j r0 = r6.f5103g
                java.lang.Object r0 = r0.l()
                boolean r0 = kotlin.jvm.internal.k.a(r2, r0)
                r0 = r0 ^ 1
                if (r0 == 0) goto L_0x0122
                com.sensorberg.encryptor.j r0 = r6.f5103g
                boolean r0 = r0.E
                if (r0 == 0) goto L_0x00eb
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                com.sensorberg.encryptor.j r1 = r6.f5103g
                java.lang.String r1 = r1.B
                r0.append(r1)
                r0.append(r4)
                com.sensorberg.encryptor.j r1 = r6.f5103g
                int r1 = r1.hashCode()
                r0.append(r1)
                java.lang.String r1 = "):new decrypted value is: "
                r0.append(r1)
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                java.lang.Object[] r1 = new java.lang.Object[r3]
                n.a.a.j(r0, r1)
                goto L_0x0113
            L_0x00eb:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                com.sensorberg.encryptor.j r1 = r6.f5103g
                java.lang.String r1 = r1.B
                r0.append(r1)
                r0.append(r4)
                com.sensorberg.encryptor.j r1 = r6.f5103g
                int r1 = r1.hashCode()
                r0.append(r1)
                java.lang.String r1 = "):new value decrypted."
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.Object[] r1 = new java.lang.Object[r3]
                n.a.a.j(r0, r1)
            L_0x0113:
                com.sensorberg.encryptor.j r0 = r6.f5103g
                java.util.concurrent.Executor r0 = r0.A
                com.sensorberg.encryptor.j$f$a r1 = new com.sensorberg.encryptor.j$f$a
                r1.<init>(r6, r2)
                r0.execute(r1)
                goto L_0x014a
            L_0x0122:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                com.sensorberg.encryptor.j r1 = r6.f5103g
                java.lang.String r1 = r1.B
                r0.append(r1)
                r0.append(r4)
                com.sensorberg.encryptor.j r1 = r6.f5103g
                int r1 = r1.hashCode()
                r0.append(r1)
                java.lang.String r1 = "):decrypted value already set, no need to post"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.Object[] r1 = new java.lang.Object[r3]
                n.a.a.j(r0, r1)
            L_0x014a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sensorberg.encryptor.j.f.run():void");
        }
    }

    /* compiled from: LiveEncryptedString.kt */
    static final class g<T> implements f0<c> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ j f5106g;

        g(j jVar) {
            this.f5106g = jVar;
        }

        /* renamed from: a */
        public final void k(c cVar) {
            this.f5106g.R(cVar);
        }
    }

    static {
        new d((DefaultConstructorMarker) null);
        String str = "com.sensorberg.encryptor.LiveEncryptedString.NOT_SET." + UUID.randomUUID();
        J = str;
        L = new c(str, str, str);
    }

    public j(Executor executor, Executor executor2, String str, e eVar, LiveData<SecretKey> liveData, boolean z2, LiveData<Boolean> liveData2, q<? super String, ? super String, ? super SecretKey, c> qVar, p<? super c, ? super SecretKey, String> pVar) {
        k.f(executor, "bgExecutor");
        k.f(executor2, "uiExecutor");
        k.f(str, "alias");
        k.f(eVar, "dao");
        k.f(liveData, "liveSecretKey");
        k.f(liveData2, "onDestroy");
        k.f(qVar, "encrypt");
        k.f(pVar, "decrypt");
        this.z = executor;
        this.A = executor2;
        this.B = str;
        this.C = eVar;
        this.D = liveData;
        this.E = z2;
        this.F = liveData2;
        this.G = qVar;
        this.H = pVar;
        this.s = eVar.e(str);
        n.a.a.j(this.B + '(' + hashCode() + "):Initialising LiveEncryptedString", new Object[0]);
        v(this.D, new h(new a(this)));
        v(this.F, new b(this));
        this.x = new f(this);
        this.y = new e(this);
    }

    public static final /* synthetic */ SecretKey J(j jVar) {
        SecretKey secretKey = jVar.r;
        if (secretKey != null) {
            return secretKey;
        }
        k.q("secretKey");
        throw null;
    }

    /* access modifiers changed from: private */
    public final void R(c cVar) {
        synchronized (I) {
            if (k.a(this.v, J) && (!k.a(cVar, this.w))) {
                this.w = L;
                n.a.a.j(this.B + '(' + hashCode() + "):database modification received, posting notifyDatabaseChanged", new Object[0]);
                this.u = Long.valueOf(this.t.get());
                this.z.execute(this.x);
            }
            x xVar = x.a;
        }
    }

    /* access modifiers changed from: private */
    public final void S(SecretKey secretKey) {
        this.r = secretKey;
        w(this.D);
        n.a.a.j(this.B + '(' + hashCode() + "):secret key received, adding DB source", new Object[0]);
        synchronized (I) {
            if (!k.a(this.v, J)) {
                n.a.a.j(this.B + '(' + hashCode() + "):there is a pendingEncryption, posting encrypt", new Object[0]);
                this.z.execute(this.y);
            }
            x xVar = x.a;
        }
        v(this.s, new g(this));
    }

    /* renamed from: T */
    public void u(String str) {
        if (!k.a(this.F.l(), Boolean.TRUE)) {
            super.u(str);
            this.t.incrementAndGet();
            synchronized (I) {
                this.v = str;
                x xVar = x.a;
            }
            if (this.r != null) {
                n.a.a.j(this.B + '(' + hashCode() + "):new value set, posting encrypt", new Object[0]);
                this.z.execute(this.y);
            }
        } else if (l() != null) {
            super.u(null);
        } else if (this.E) {
            n.a.a.k(this.B + '(' + hashCode() + "):attempt to write " + str + " after onDestroy", new Object[0]);
        }
    }
}
