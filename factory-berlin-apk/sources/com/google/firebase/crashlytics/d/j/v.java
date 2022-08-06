package com.google.firebase.crashlytics.d.j;

import com.google.auto.value.AutoValue;
import com.google.firebase.crashlytics.d.j.b;
import com.google.firebase.crashlytics.d.j.c;
import com.google.firebase.crashlytics.d.j.d;
import com.google.firebase.crashlytics.d.j.e;
import com.google.firebase.crashlytics.d.j.f;
import com.google.firebase.crashlytics.d.j.g;
import com.google.firebase.crashlytics.d.j.i;
import com.google.firebase.crashlytics.d.j.j;
import com.google.firebase.crashlytics.d.j.k;
import com.google.firebase.crashlytics.d.j.l;
import com.google.firebase.crashlytics.d.j.m;
import com.google.firebase.crashlytics.d.j.n;
import com.google.firebase.crashlytics.d.j.o;
import com.google.firebase.crashlytics.d.j.p;
import com.google.firebase.crashlytics.d.j.q;
import com.google.firebase.crashlytics.d.j.r;
import com.google.firebase.crashlytics.d.j.s;
import com.google.firebase.crashlytics.d.j.t;
import com.google.firebase.crashlytics.d.j.u;
import java.nio.charset.Charset;

@AutoValue
/* compiled from: CrashlyticsReport */
public abstract class v {
    /* access modifiers changed from: private */
    public static final Charset a = Charset.forName("UTF-8");

    @AutoValue.Builder
    /* compiled from: CrashlyticsReport */
    public static abstract class a {
        public abstract v a();

        public abstract a b(String str);

        public abstract a c(String str);

        public abstract a d(String str);

        public abstract a e(String str);

        public abstract a f(c cVar);

        public abstract a g(int i2);

        public abstract a h(String str);

        public abstract a i(d dVar);
    }

    @AutoValue
    /* compiled from: CrashlyticsReport */
    public static abstract class b {

        @AutoValue.Builder
        /* compiled from: CrashlyticsReport */
        public static abstract class a {
            public abstract b a();

            public abstract a b(String str);

            public abstract a c(String str);
        }

        public static a a() {
            return new c.b();
        }

        public abstract String b();

        public abstract String c();
    }

    @AutoValue
    /* compiled from: CrashlyticsReport */
    public static abstract class c {

        @AutoValue.Builder
        /* compiled from: CrashlyticsReport */
        public static abstract class a {
            public abstract c a();

            public abstract a b(w<b> wVar);

            public abstract a c(String str);
        }

        @AutoValue
        /* compiled from: CrashlyticsReport */
        public static abstract class b {

            @AutoValue.Builder
            /* compiled from: CrashlyticsReport */
            public static abstract class a {
                public abstract b a();

                public abstract a b(byte[] bArr);

                public abstract a c(String str);
            }

            public static a a() {
                return new e.b();
            }

            public abstract byte[] b();

            public abstract String c();
        }

        public static a a() {
            return new d.b();
        }

        public abstract w<b> b();

        public abstract String c();
    }

    @AutoValue
    /* compiled from: CrashlyticsReport */
    public static abstract class d {

        @AutoValue
        /* compiled from: CrashlyticsReport */
        public static abstract class a {

            @AutoValue.Builder
            /* renamed from: com.google.firebase.crashlytics.d.j.v$d$a$a  reason: collision with other inner class name */
            /* compiled from: CrashlyticsReport */
            public static abstract class C0095a {
                public abstract a a();

                public abstract C0095a b(String str);

                public abstract C0095a c(String str);

                public abstract C0095a d(String str);

                public abstract C0095a e(String str);
            }

            @AutoValue
            /* compiled from: CrashlyticsReport */
            public static abstract class b {
                public abstract String a();
            }

            public static C0095a a() {
                return new g.b();
            }

            public abstract String b();

            public abstract String c();

            public abstract String d();

            public abstract b e();

            public abstract String f();
        }

        @AutoValue.Builder
        /* compiled from: CrashlyticsReport */
        public static abstract class b {
            public abstract d a();

            public abstract b b(a aVar);

            public abstract b c(boolean z);

            public abstract b d(c cVar);

            public abstract b e(Long l2);

            public abstract b f(w<C0096d> wVar);

            public abstract b g(String str);

            public abstract b h(int i2);

            public abstract b i(String str);

            public b j(byte[] bArr) {
                i(new String(bArr, v.a));
                return this;
            }

            public abstract b k(e eVar);

            public abstract b l(long j2);

            public abstract b m(f fVar);
        }

        @AutoValue
        /* compiled from: CrashlyticsReport */
        public static abstract class c {

            @AutoValue.Builder
            /* compiled from: CrashlyticsReport */
            public static abstract class a {
                public abstract c a();

                public abstract a b(int i2);

                public abstract a c(int i2);

                public abstract a d(long j2);

                public abstract a e(String str);

                public abstract a f(String str);

                public abstract a g(String str);

                public abstract a h(long j2);

                public abstract a i(boolean z);

                public abstract a j(int i2);
            }

            public static a a() {
                return new i.b();
            }

            public abstract int b();

            public abstract int c();

            public abstract long d();

            public abstract String e();

            public abstract String f();

            public abstract String g();

            public abstract long h();

            public abstract int i();

            public abstract boolean j();
        }

        @AutoValue
        /* renamed from: com.google.firebase.crashlytics.d.j.v$d$d  reason: collision with other inner class name */
        /* compiled from: CrashlyticsReport */
        public static abstract class C0096d {

            @AutoValue
            /* renamed from: com.google.firebase.crashlytics.d.j.v$d$d$a */
            /* compiled from: CrashlyticsReport */
            public static abstract class a {

                @AutoValue.Builder
                /* renamed from: com.google.firebase.crashlytics.d.j.v$d$d$a$a  reason: collision with other inner class name */
                /* compiled from: CrashlyticsReport */
                public static abstract class C0097a {
                    public abstract a a();

                    public abstract C0097a b(Boolean bool);

                    public abstract C0097a c(w<b> wVar);

                    public abstract C0097a d(b bVar);

                    public abstract C0097a e(int i2);
                }

                @AutoValue
                /* renamed from: com.google.firebase.crashlytics.d.j.v$d$d$a$b */
                /* compiled from: CrashlyticsReport */
                public static abstract class b {

                    @AutoValue
                    /* renamed from: com.google.firebase.crashlytics.d.j.v$d$d$a$b$a  reason: collision with other inner class name */
                    /* compiled from: CrashlyticsReport */
                    public static abstract class C0098a {

                        @AutoValue.Builder
                        /* renamed from: com.google.firebase.crashlytics.d.j.v$d$d$a$b$a$a  reason: collision with other inner class name */
                        /* compiled from: CrashlyticsReport */
                        public static abstract class C0099a {
                            public abstract C0098a a();

                            public abstract C0099a b(long j2);

                            public abstract C0099a c(String str);

                            public abstract C0099a d(long j2);

                            public abstract C0099a e(String str);

                            public C0099a f(byte[] bArr) {
                                e(new String(bArr, v.a));
                                return this;
                            }
                        }

                        public static C0099a a() {
                            return new m.b();
                        }

                        public abstract long b();

                        public abstract String c();

                        public abstract long d();

                        public abstract String e();

                        public byte[] f() {
                            String e2 = e();
                            if (e2 != null) {
                                return e2.getBytes(v.a);
                            }
                            return null;
                        }
                    }

                    @AutoValue.Builder
                    /* renamed from: com.google.firebase.crashlytics.d.j.v$d$d$a$b$b  reason: collision with other inner class name */
                    /* compiled from: CrashlyticsReport */
                    public static abstract class C0100b {
                        public abstract b a();

                        public abstract C0100b b(w<C0098a> wVar);

                        public abstract C0100b c(c cVar);

                        public abstract C0100b d(C0102d dVar);

                        public abstract C0100b e(w<e> wVar);
                    }

                    @AutoValue
                    /* renamed from: com.google.firebase.crashlytics.d.j.v$d$d$a$b$c */
                    /* compiled from: CrashlyticsReport */
                    public static abstract class c {

                        @AutoValue.Builder
                        /* renamed from: com.google.firebase.crashlytics.d.j.v$d$d$a$b$c$a  reason: collision with other inner class name */
                        /* compiled from: CrashlyticsReport */
                        public static abstract class C0101a {
                            public abstract c a();

                            public abstract C0101a b(c cVar);

                            public abstract C0101a c(w<e.C0105b> wVar);

                            public abstract C0101a d(int i2);

                            public abstract C0101a e(String str);

                            public abstract C0101a f(String str);
                        }

                        public static C0101a a() {
                            return new n.b();
                        }

                        public abstract c b();

                        public abstract w<e.C0105b> c();

                        public abstract int d();

                        public abstract String e();

                        public abstract String f();
                    }

                    @AutoValue
                    /* renamed from: com.google.firebase.crashlytics.d.j.v$d$d$a$b$d  reason: collision with other inner class name */
                    /* compiled from: CrashlyticsReport */
                    public static abstract class C0102d {

                        @AutoValue.Builder
                        /* renamed from: com.google.firebase.crashlytics.d.j.v$d$d$a$b$d$a  reason: collision with other inner class name */
                        /* compiled from: CrashlyticsReport */
                        public static abstract class C0103a {
                            public abstract C0102d a();

                            public abstract C0103a b(long j2);

                            public abstract C0103a c(String str);

                            public abstract C0103a d(String str);
                        }

                        public static C0103a a() {
                            return new o.b();
                        }

                        public abstract long b();

                        public abstract String c();

                        public abstract String d();
                    }

                    @AutoValue
                    /* renamed from: com.google.firebase.crashlytics.d.j.v$d$d$a$b$e */
                    /* compiled from: CrashlyticsReport */
                    public static abstract class e {

                        @AutoValue.Builder
                        /* renamed from: com.google.firebase.crashlytics.d.j.v$d$d$a$b$e$a  reason: collision with other inner class name */
                        /* compiled from: CrashlyticsReport */
                        public static abstract class C0104a {
                            public abstract e a();

                            public abstract C0104a b(w<C0105b> wVar);

                            public abstract C0104a c(int i2);

                            public abstract C0104a d(String str);
                        }

                        @AutoValue
                        /* renamed from: com.google.firebase.crashlytics.d.j.v$d$d$a$b$e$b  reason: collision with other inner class name */
                        /* compiled from: CrashlyticsReport */
                        public static abstract class C0105b {

                            @AutoValue.Builder
                            /* renamed from: com.google.firebase.crashlytics.d.j.v$d$d$a$b$e$b$a  reason: collision with other inner class name */
                            /* compiled from: CrashlyticsReport */
                            public static abstract class C0106a {
                                public abstract C0105b a();

                                public abstract C0106a b(String str);

                                public abstract C0106a c(int i2);

                                public abstract C0106a d(long j2);

                                public abstract C0106a e(long j2);

                                public abstract C0106a f(String str);
                            }

                            public static C0106a a() {
                                return new q.b();
                            }

                            public abstract String b();

                            public abstract int c();

                            public abstract long d();

                            public abstract long e();

                            public abstract String f();
                        }

                        public static C0104a a() {
                            return new p.b();
                        }

                        public abstract w<C0105b> b();

                        public abstract int c();

                        public abstract String d();
                    }

                    public static C0100b a() {
                        return new l.b();
                    }

                    public abstract w<C0098a> b();

                    public abstract c c();

                    public abstract C0102d d();

                    public abstract w<e> e();
                }

                public static C0097a a() {
                    return new k.b();
                }

                public abstract Boolean b();

                public abstract w<b> c();

                public abstract b d();

                public abstract int e();

                public abstract C0097a f();
            }

            @AutoValue.Builder
            /* renamed from: com.google.firebase.crashlytics.d.j.v$d$d$b */
            /* compiled from: CrashlyticsReport */
            public static abstract class b {
                public abstract C0096d a();

                public abstract b b(a aVar);

                public abstract b c(c cVar);

                public abstract b d(C0107d dVar);

                public abstract b e(long j2);

                public abstract b f(String str);
            }

            @AutoValue
            /* renamed from: com.google.firebase.crashlytics.d.j.v$d$d$c */
            /* compiled from: CrashlyticsReport */
            public static abstract class c {

                @AutoValue.Builder
                /* renamed from: com.google.firebase.crashlytics.d.j.v$d$d$c$a */
                /* compiled from: CrashlyticsReport */
                public static abstract class a {
                    public abstract c a();

                    public abstract a b(Double d2);

                    public abstract a c(int i2);

                    public abstract a d(long j2);

                    public abstract a e(int i2);

                    public abstract a f(boolean z);

                    public abstract a g(long j2);
                }

                public static a a() {
                    return new r.b();
                }

                public abstract Double b();

                public abstract int c();

                public abstract long d();

                public abstract int e();

                public abstract long f();

                public abstract boolean g();
            }

            @AutoValue
            /* renamed from: com.google.firebase.crashlytics.d.j.v$d$d$d  reason: collision with other inner class name */
            /* compiled from: CrashlyticsReport */
            public static abstract class C0107d {

                @AutoValue.Builder
                /* renamed from: com.google.firebase.crashlytics.d.j.v$d$d$d$a */
                /* compiled from: CrashlyticsReport */
                public static abstract class a {
                    public abstract C0107d a();

                    public abstract a b(String str);
                }

                public static a a() {
                    return new s.b();
                }

                public abstract String b();
            }

            public static b a() {
                return new j.b();
            }

            public abstract a b();

            public abstract c c();

            public abstract C0107d d();

            public abstract long e();

            public abstract String f();

            public abstract b g();
        }

        @AutoValue
        /* compiled from: CrashlyticsReport */
        public static abstract class e {

            @AutoValue.Builder
            /* compiled from: CrashlyticsReport */
            public static abstract class a {
                public abstract e a();

                public abstract a b(String str);

                public abstract a c(boolean z);

                public abstract a d(int i2);

                public abstract a e(String str);
            }

            public static a a() {
                return new t.b();
            }

            public abstract String b();

            public abstract int c();

            public abstract String d();

            public abstract boolean e();
        }

        @AutoValue
        /* compiled from: CrashlyticsReport */
        public static abstract class f {

            @AutoValue.Builder
            /* compiled from: CrashlyticsReport */
            public static abstract class a {
                public abstract f a();

                public abstract a b(String str);
            }

            public static a a() {
                return new u.b();
            }

            public abstract String b();
        }

        public static b a() {
            f.b bVar = new f.b();
            bVar.c(false);
            return bVar;
        }

        public abstract a b();

        public abstract c c();

        public abstract Long d();

        public abstract w<C0096d> e();

        public abstract String f();

        public abstract int g();

        public abstract String h();

        public byte[] i() {
            return h().getBytes(v.a);
        }

        public abstract e j();

        public abstract long k();

        public abstract f l();

        public abstract boolean m();

        public abstract b n();

        /* access modifiers changed from: package-private */
        public d o(w<C0096d> wVar) {
            b n2 = n();
            n2.f(wVar);
            return n2.a();
        }

        /* access modifiers changed from: package-private */
        public d p(long j2, boolean z, String str) {
            b n2 = n();
            n2.e(Long.valueOf(j2));
            n2.c(z);
            if (str != null) {
                f.a a2 = f.a();
                a2.b(str);
                n2.m(a2.a());
                n2.a();
            }
            return n2.a();
        }
    }

    /* compiled from: CrashlyticsReport */
    public enum e {
        INCOMPLETE,
        JAVA,
        NATIVE
    }

    public static a b() {
        return new b.C0094b();
    }

    public abstract String c();

    public abstract String d();

    public abstract String e();

    public abstract String f();

    public abstract c g();

    public abstract int h();

    public abstract String i();

    public abstract d j();

    public e k() {
        if (j() != null) {
            return e.JAVA;
        }
        if (g() != null) {
            return e.NATIVE;
        }
        return e.INCOMPLETE;
    }

    /* access modifiers changed from: protected */
    public abstract a l();

    public v m(w<d.C0096d> wVar) {
        if (j() != null) {
            a l2 = l();
            l2.i(j().o(wVar));
            return l2.a();
        }
        throw new IllegalStateException("Reports without sessions cannot have events added to them.");
    }

    public v n(c cVar) {
        a l2 = l();
        l2.i((d) null);
        l2.f(cVar);
        return l2.a();
    }

    public v o(long j2, boolean z, String str) {
        a l2 = l();
        if (j() != null) {
            l2.i(j().p(j2, z, str));
        }
        return l2.a();
    }
}
