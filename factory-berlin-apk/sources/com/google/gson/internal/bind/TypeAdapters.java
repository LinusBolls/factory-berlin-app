package com.google.gson.internal.bind;

import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

public final class TypeAdapters {
    public static final com.google.gson.s<String> A = new g();
    public static final com.google.gson.s<BigDecimal> B = new h();
    public static final com.google.gson.s<BigInteger> C = new i();
    public static final com.google.gson.t D = a(String.class, A);
    public static final com.google.gson.s<StringBuilder> E;
    public static final com.google.gson.t F;
    public static final com.google.gson.s<StringBuffer> G;
    public static final com.google.gson.t H;
    public static final com.google.gson.s<URL> I;
    public static final com.google.gson.t J;
    public static final com.google.gson.s<URI> K;
    public static final com.google.gson.t L;
    public static final com.google.gson.s<InetAddress> M;
    public static final com.google.gson.t N;
    public static final com.google.gson.s<UUID> O;
    public static final com.google.gson.t P;
    public static final com.google.gson.s<Currency> Q;
    public static final com.google.gson.t R;
    public static final com.google.gson.t S = new com.google.gson.t() {

        /* renamed from: com.google.gson.internal.bind.TypeAdapters$26$a */
        class a extends com.google.gson.s<Timestamp> {
            final /* synthetic */ com.google.gson.s a;

            a(AnonymousClass26 r1, com.google.gson.s sVar) {
                this.a = sVar;
            }

            /* renamed from: e */
            public Timestamp b(com.google.gson.stream.a aVar) {
                Date date = (Date) this.a.b(aVar);
                if (date != null) {
                    return new Timestamp(date.getTime());
                }
                return null;
            }

            /* renamed from: f */
            public void d(com.google.gson.stream.c cVar, Timestamp timestamp) {
                this.a.d(cVar, timestamp);
            }
        }

        public <T> com.google.gson.s<T> c(com.google.gson.f fVar, com.google.gson.u.a<T> aVar) {
            if (aVar.c() != Timestamp.class) {
                return null;
            }
            return new a(this, fVar.l(Date.class));
        }
    };
    public static final com.google.gson.s<Calendar> T;
    public static final com.google.gson.t U;
    public static final com.google.gson.s<Locale> V;
    public static final com.google.gson.t W;
    public static final com.google.gson.s<com.google.gson.l> X;
    public static final com.google.gson.t Y;
    public static final com.google.gson.t Z = new com.google.gson.t() {
        /* JADX WARNING: type inference failed for: r2v0, types: [com.google.gson.u.a, com.google.gson.u.a<T>] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public <T> com.google.gson.s<T> c(com.google.gson.f r1, com.google.gson.u.a<T> r2) {
            /*
                r0 = this;
                java.lang.Class r1 = r2.c()
                java.lang.Class<java.lang.Enum> r2 = java.lang.Enum.class
                boolean r2 = r2.isAssignableFrom(r1)
                if (r2 == 0) goto L_0x0021
                java.lang.Class<java.lang.Enum> r2 = java.lang.Enum.class
                if (r1 != r2) goto L_0x0011
                goto L_0x0021
            L_0x0011:
                boolean r2 = r1.isEnum()
                if (r2 != 0) goto L_0x001b
                java.lang.Class r1 = r1.getSuperclass()
            L_0x001b:
                com.google.gson.internal.bind.TypeAdapters$d0 r2 = new com.google.gson.internal.bind.TypeAdapters$d0
                r2.<init>(r1)
                return r2
            L_0x0021:
                r1 = 0
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.TypeAdapters.AnonymousClass30.c(com.google.gson.f, com.google.gson.u.a):com.google.gson.s");
        }
    };
    public static final com.google.gson.s<Class> a;
    public static final com.google.gson.t b;
    public static final com.google.gson.s<BitSet> c;

    /* renamed from: d  reason: collision with root package name */
    public static final com.google.gson.t f4280d;

    /* renamed from: e  reason: collision with root package name */
    public static final com.google.gson.s<Boolean> f4281e = new w();

    /* renamed from: f  reason: collision with root package name */
    public static final com.google.gson.s<Boolean> f4282f = new x();

    /* renamed from: g  reason: collision with root package name */
    public static final com.google.gson.t f4283g = b(Boolean.TYPE, Boolean.class, f4281e);

    /* renamed from: h  reason: collision with root package name */
    public static final com.google.gson.s<Number> f4284h = new y();

    /* renamed from: i  reason: collision with root package name */
    public static final com.google.gson.t f4285i = b(Byte.TYPE, Byte.class, f4284h);

    /* renamed from: j  reason: collision with root package name */
    public static final com.google.gson.s<Number> f4286j = new z();

    /* renamed from: k  reason: collision with root package name */
    public static final com.google.gson.t f4287k = b(Short.TYPE, Short.class, f4286j);

    /* renamed from: l  reason: collision with root package name */
    public static final com.google.gson.s<Number> f4288l = new a0();

    /* renamed from: m  reason: collision with root package name */
    public static final com.google.gson.t f4289m = b(Integer.TYPE, Integer.class, f4288l);

    /* renamed from: n  reason: collision with root package name */
    public static final com.google.gson.s<AtomicInteger> f4290n;
    public static final com.google.gson.t o;
    public static final com.google.gson.s<AtomicBoolean> p;
    public static final com.google.gson.t q;
    public static final com.google.gson.s<AtomicIntegerArray> r;
    public static final com.google.gson.t s;
    public static final com.google.gson.s<Number> t = new b();
    public static final com.google.gson.s<Number> u = new c();
    public static final com.google.gson.s<Number> v = new d();
    public static final com.google.gson.s<Number> w;
    public static final com.google.gson.t x;
    public static final com.google.gson.s<Character> y = new f();
    public static final com.google.gson.t z = b(Character.TYPE, Character.class, y);

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$31  reason: invalid class name */
    class AnonymousClass31 implements com.google.gson.t {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ com.google.gson.u.a f4291g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ com.google.gson.s f4292h;

        public <T> com.google.gson.s<T> c(com.google.gson.f fVar, com.google.gson.u.a<T> aVar) {
            if (aVar.equals(this.f4291g)) {
                return this.f4292h;
            }
            return null;
        }
    }

    class a extends com.google.gson.s<AtomicIntegerArray> {
        a() {
        }

        /* renamed from: e */
        public AtomicIntegerArray b(com.google.gson.stream.a aVar) {
            ArrayList arrayList = new ArrayList();
            aVar.a();
            while (aVar.hasNext()) {
                try {
                    arrayList.add(Integer.valueOf(aVar.D()));
                } catch (NumberFormatException e2) {
                    throw new JsonSyntaxException((Throwable) e2);
                }
            }
            aVar.k();
            int size = arrayList.size();
            AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
            for (int i2 = 0; i2 < size; i2++) {
                atomicIntegerArray.set(i2, ((Integer) arrayList.get(i2)).intValue());
            }
            return atomicIntegerArray;
        }

        /* renamed from: f */
        public void d(com.google.gson.stream.c cVar, AtomicIntegerArray atomicIntegerArray) {
            cVar.h();
            int length = atomicIntegerArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                cVar.n0((long) atomicIntegerArray.get(i2));
            }
            cVar.k();
        }
    }

    class a0 extends com.google.gson.s<Number> {
        a0() {
        }

        /* renamed from: e */
        public Number b(com.google.gson.stream.a aVar) {
            if (aVar.Z() == com.google.gson.stream.b.NULL) {
                aVar.L();
                return null;
            }
            try {
                return Integer.valueOf(aVar.D());
            } catch (NumberFormatException e2) {
                throw new JsonSyntaxException((Throwable) e2);
            }
        }

        /* renamed from: f */
        public void d(com.google.gson.stream.c cVar, Number number) {
            cVar.t0(number);
        }
    }

    class b extends com.google.gson.s<Number> {
        b() {
        }

        /* renamed from: e */
        public Number b(com.google.gson.stream.a aVar) {
            if (aVar.Z() == com.google.gson.stream.b.NULL) {
                aVar.L();
                return null;
            }
            try {
                return Long.valueOf(aVar.F());
            } catch (NumberFormatException e2) {
                throw new JsonSyntaxException((Throwable) e2);
            }
        }

        /* renamed from: f */
        public void d(com.google.gson.stream.c cVar, Number number) {
            cVar.t0(number);
        }
    }

    class b0 extends com.google.gson.s<AtomicInteger> {
        b0() {
        }

        /* renamed from: e */
        public AtomicInteger b(com.google.gson.stream.a aVar) {
            try {
                return new AtomicInteger(aVar.D());
            } catch (NumberFormatException e2) {
                throw new JsonSyntaxException((Throwable) e2);
            }
        }

        /* renamed from: f */
        public void d(com.google.gson.stream.c cVar, AtomicInteger atomicInteger) {
            cVar.n0((long) atomicInteger.get());
        }
    }

    class c extends com.google.gson.s<Number> {
        c() {
        }

        /* renamed from: e */
        public Number b(com.google.gson.stream.a aVar) {
            if (aVar.Z() != com.google.gson.stream.b.NULL) {
                return Float.valueOf((float) aVar.z());
            }
            aVar.L();
            return null;
        }

        /* renamed from: f */
        public void d(com.google.gson.stream.c cVar, Number number) {
            cVar.t0(number);
        }
    }

    class c0 extends com.google.gson.s<AtomicBoolean> {
        c0() {
        }

        /* renamed from: e */
        public AtomicBoolean b(com.google.gson.stream.a aVar) {
            return new AtomicBoolean(aVar.nextBoolean());
        }

        /* renamed from: f */
        public void d(com.google.gson.stream.c cVar, AtomicBoolean atomicBoolean) {
            cVar.F0(atomicBoolean.get());
        }
    }

    class d extends com.google.gson.s<Number> {
        d() {
        }

        /* renamed from: e */
        public Number b(com.google.gson.stream.a aVar) {
            if (aVar.Z() != com.google.gson.stream.b.NULL) {
                return Double.valueOf(aVar.z());
            }
            aVar.L();
            return null;
        }

        /* renamed from: f */
        public void d(com.google.gson.stream.c cVar, Number number) {
            cVar.t0(number);
        }
    }

    private static final class d0<T extends Enum<T>> extends com.google.gson.s<T> {
        private final Map<String, T> a = new HashMap();
        private final Map<T, String> b = new HashMap();

        public d0(Class<T> cls) {
            try {
                for (Enum enumR : (Enum[]) cls.getEnumConstants()) {
                    String name = enumR.name();
                    com.google.gson.annotations.b bVar = (com.google.gson.annotations.b) cls.getField(name).getAnnotation(com.google.gson.annotations.b.class);
                    if (bVar != null) {
                        name = bVar.value();
                        for (String put : bVar.alternate()) {
                            this.a.put(put, enumR);
                        }
                    }
                    this.a.put(name, enumR);
                    this.b.put(enumR, name);
                }
            } catch (NoSuchFieldException e2) {
                throw new AssertionError(e2);
            }
        }

        /* renamed from: e */
        public T b(com.google.gson.stream.a aVar) {
            if (aVar.Z() != com.google.gson.stream.b.NULL) {
                return (Enum) this.a.get(aVar.nextString());
            }
            aVar.L();
            return null;
        }

        /* renamed from: f */
        public void d(com.google.gson.stream.c cVar, T t) {
            cVar.w0(t == null ? null : this.b.get(t));
        }
    }

    class e extends com.google.gson.s<Number> {
        e() {
        }

        /* renamed from: e */
        public Number b(com.google.gson.stream.a aVar) {
            com.google.gson.stream.b Z = aVar.Z();
            int i2 = v.a[Z.ordinal()];
            if (i2 == 1 || i2 == 3) {
                return new com.google.gson.internal.f(aVar.nextString());
            }
            if (i2 == 4) {
                aVar.L();
                return null;
            }
            throw new JsonSyntaxException("Expecting number, got: " + Z);
        }

        /* renamed from: f */
        public void d(com.google.gson.stream.c cVar, Number number) {
            cVar.t0(number);
        }
    }

    class f extends com.google.gson.s<Character> {
        f() {
        }

        /* renamed from: e */
        public Character b(com.google.gson.stream.a aVar) {
            if (aVar.Z() == com.google.gson.stream.b.NULL) {
                aVar.L();
                return null;
            }
            String nextString = aVar.nextString();
            if (nextString.length() == 1) {
                return Character.valueOf(nextString.charAt(0));
            }
            throw new JsonSyntaxException("Expecting character, got: " + nextString);
        }

        /* renamed from: f */
        public void d(com.google.gson.stream.c cVar, Character ch) {
            cVar.w0(ch == null ? null : String.valueOf(ch));
        }
    }

    class g extends com.google.gson.s<String> {
        g() {
        }

        /* renamed from: e */
        public String b(com.google.gson.stream.a aVar) {
            com.google.gson.stream.b Z = aVar.Z();
            if (Z == com.google.gson.stream.b.NULL) {
                aVar.L();
                return null;
            } else if (Z == com.google.gson.stream.b.BOOLEAN) {
                return Boolean.toString(aVar.nextBoolean());
            } else {
                return aVar.nextString();
            }
        }

        /* renamed from: f */
        public void d(com.google.gson.stream.c cVar, String str) {
            cVar.w0(str);
        }
    }

    class h extends com.google.gson.s<BigDecimal> {
        h() {
        }

        /* renamed from: e */
        public BigDecimal b(com.google.gson.stream.a aVar) {
            if (aVar.Z() == com.google.gson.stream.b.NULL) {
                aVar.L();
                return null;
            }
            try {
                return new BigDecimal(aVar.nextString());
            } catch (NumberFormatException e2) {
                throw new JsonSyntaxException((Throwable) e2);
            }
        }

        /* renamed from: f */
        public void d(com.google.gson.stream.c cVar, BigDecimal bigDecimal) {
            cVar.t0(bigDecimal);
        }
    }

    class i extends com.google.gson.s<BigInteger> {
        i() {
        }

        /* renamed from: e */
        public BigInteger b(com.google.gson.stream.a aVar) {
            if (aVar.Z() == com.google.gson.stream.b.NULL) {
                aVar.L();
                return null;
            }
            try {
                return new BigInteger(aVar.nextString());
            } catch (NumberFormatException e2) {
                throw new JsonSyntaxException((Throwable) e2);
            }
        }

        /* renamed from: f */
        public void d(com.google.gson.stream.c cVar, BigInteger bigInteger) {
            cVar.t0(bigInteger);
        }
    }

    class j extends com.google.gson.s<StringBuilder> {
        j() {
        }

        /* renamed from: e */
        public StringBuilder b(com.google.gson.stream.a aVar) {
            if (aVar.Z() != com.google.gson.stream.b.NULL) {
                return new StringBuilder(aVar.nextString());
            }
            aVar.L();
            return null;
        }

        /* renamed from: f */
        public void d(com.google.gson.stream.c cVar, StringBuilder sb) {
            cVar.w0(sb == null ? null : sb.toString());
        }
    }

    class k extends com.google.gson.s<Class> {
        k() {
        }

        public /* bridge */ /* synthetic */ Object b(com.google.gson.stream.a aVar) {
            e(aVar);
            throw null;
        }

        public /* bridge */ /* synthetic */ void d(com.google.gson.stream.c cVar, Object obj) {
            f(cVar, (Class) obj);
            throw null;
        }

        public Class e(com.google.gson.stream.a aVar) {
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
        }

        public void f(com.google.gson.stream.c cVar, Class cls) {
            throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + cls.getName() + ". Forgot to register a type adapter?");
        }
    }

    class l extends com.google.gson.s<StringBuffer> {
        l() {
        }

        /* renamed from: e */
        public StringBuffer b(com.google.gson.stream.a aVar) {
            if (aVar.Z() != com.google.gson.stream.b.NULL) {
                return new StringBuffer(aVar.nextString());
            }
            aVar.L();
            return null;
        }

        /* renamed from: f */
        public void d(com.google.gson.stream.c cVar, StringBuffer stringBuffer) {
            cVar.w0(stringBuffer == null ? null : stringBuffer.toString());
        }
    }

    class m extends com.google.gson.s<URL> {
        m() {
        }

        /* renamed from: e */
        public URL b(com.google.gson.stream.a aVar) {
            if (aVar.Z() == com.google.gson.stream.b.NULL) {
                aVar.L();
                return null;
            }
            String nextString = aVar.nextString();
            if ("null".equals(nextString)) {
                return null;
            }
            return new URL(nextString);
        }

        /* renamed from: f */
        public void d(com.google.gson.stream.c cVar, URL url) {
            cVar.w0(url == null ? null : url.toExternalForm());
        }
    }

    class n extends com.google.gson.s<URI> {
        n() {
        }

        /* renamed from: e */
        public URI b(com.google.gson.stream.a aVar) {
            if (aVar.Z() == com.google.gson.stream.b.NULL) {
                aVar.L();
                return null;
            }
            try {
                String nextString = aVar.nextString();
                if ("null".equals(nextString)) {
                    return null;
                }
                return new URI(nextString);
            } catch (URISyntaxException e2) {
                throw new JsonIOException((Throwable) e2);
            }
        }

        /* renamed from: f */
        public void d(com.google.gson.stream.c cVar, URI uri) {
            cVar.w0(uri == null ? null : uri.toASCIIString());
        }
    }

    class o extends com.google.gson.s<InetAddress> {
        o() {
        }

        /* renamed from: e */
        public InetAddress b(com.google.gson.stream.a aVar) {
            if (aVar.Z() != com.google.gson.stream.b.NULL) {
                return InetAddress.getByName(aVar.nextString());
            }
            aVar.L();
            return null;
        }

        /* renamed from: f */
        public void d(com.google.gson.stream.c cVar, InetAddress inetAddress) {
            cVar.w0(inetAddress == null ? null : inetAddress.getHostAddress());
        }
    }

    class p extends com.google.gson.s<UUID> {
        p() {
        }

        /* renamed from: e */
        public UUID b(com.google.gson.stream.a aVar) {
            if (aVar.Z() != com.google.gson.stream.b.NULL) {
                return UUID.fromString(aVar.nextString());
            }
            aVar.L();
            return null;
        }

        /* renamed from: f */
        public void d(com.google.gson.stream.c cVar, UUID uuid) {
            cVar.w0(uuid == null ? null : uuid.toString());
        }
    }

    class q extends com.google.gson.s<Currency> {
        q() {
        }

        /* renamed from: e */
        public Currency b(com.google.gson.stream.a aVar) {
            return Currency.getInstance(aVar.nextString());
        }

        /* renamed from: f */
        public void d(com.google.gson.stream.c cVar, Currency currency) {
            cVar.w0(currency.getCurrencyCode());
        }
    }

    class r extends com.google.gson.s<Calendar> {
        r() {
        }

        /* renamed from: e */
        public Calendar b(com.google.gson.stream.a aVar) {
            if (aVar.Z() == com.google.gson.stream.b.NULL) {
                aVar.L();
                return null;
            }
            aVar.b();
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            while (aVar.Z() != com.google.gson.stream.b.END_OBJECT) {
                String nextName = aVar.nextName();
                int D = aVar.D();
                if ("year".equals(nextName)) {
                    i2 = D;
                } else if ("month".equals(nextName)) {
                    i3 = D;
                } else if ("dayOfMonth".equals(nextName)) {
                    i4 = D;
                } else if ("hourOfDay".equals(nextName)) {
                    i5 = D;
                } else if ("minute".equals(nextName)) {
                    i6 = D;
                } else if ("second".equals(nextName)) {
                    i7 = D;
                }
            }
            aVar.l();
            return new GregorianCalendar(i2, i3, i4, i5, i6, i7);
        }

        /* renamed from: f */
        public void d(com.google.gson.stream.c cVar, Calendar calendar) {
            if (calendar == null) {
                cVar.D();
                return;
            }
            cVar.i();
            cVar.y("year");
            cVar.n0((long) calendar.get(1));
            cVar.y("month");
            cVar.n0((long) calendar.get(2));
            cVar.y("dayOfMonth");
            cVar.n0((long) calendar.get(5));
            cVar.y("hourOfDay");
            cVar.n0((long) calendar.get(11));
            cVar.y("minute");
            cVar.n0((long) calendar.get(12));
            cVar.y("second");
            cVar.n0((long) calendar.get(13));
            cVar.l();
        }
    }

    class s extends com.google.gson.s<Locale> {
        s() {
        }

        /* renamed from: e */
        public Locale b(com.google.gson.stream.a aVar) {
            String str = null;
            if (aVar.Z() == com.google.gson.stream.b.NULL) {
                aVar.L();
                return null;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(aVar.nextString(), "_");
            String nextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String nextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            if (stringTokenizer.hasMoreElements()) {
                str = stringTokenizer.nextToken();
            }
            if (nextToken2 == null && str == null) {
                return new Locale(nextToken);
            }
            if (str == null) {
                return new Locale(nextToken, nextToken2);
            }
            return new Locale(nextToken, nextToken2, str);
        }

        /* renamed from: f */
        public void d(com.google.gson.stream.c cVar, Locale locale) {
            cVar.w0(locale == null ? null : locale.toString());
        }
    }

    class t extends com.google.gson.s<com.google.gson.l> {
        t() {
        }

        /* renamed from: e */
        public com.google.gson.l b(com.google.gson.stream.a aVar) {
            switch (v.a[aVar.Z().ordinal()]) {
                case 1:
                    return new com.google.gson.o((Number) new com.google.gson.internal.f(aVar.nextString()));
                case 2:
                    return new com.google.gson.o(Boolean.valueOf(aVar.nextBoolean()));
                case 3:
                    return new com.google.gson.o(aVar.nextString());
                case 4:
                    aVar.L();
                    return com.google.gson.m.a;
                case 5:
                    com.google.gson.i iVar = new com.google.gson.i();
                    aVar.a();
                    while (aVar.hasNext()) {
                        iVar.l(b(aVar));
                    }
                    aVar.k();
                    return iVar;
                case 6:
                    com.google.gson.n nVar = new com.google.gson.n();
                    aVar.b();
                    while (aVar.hasNext()) {
                        nVar.l(aVar.nextName(), b(aVar));
                    }
                    aVar.l();
                    return nVar;
                default:
                    throw new IllegalArgumentException();
            }
        }

        /* renamed from: f */
        public void d(com.google.gson.stream.c cVar, com.google.gson.l lVar) {
            if (lVar == null || lVar.i()) {
                cVar.D();
            } else if (lVar.k()) {
                com.google.gson.o e2 = lVar.e();
                if (e2.y()) {
                    cVar.t0(e2.q());
                } else if (e2.s()) {
                    cVar.F0(e2.l());
                } else {
                    cVar.w0(e2.r());
                }
            } else if (lVar.g()) {
                cVar.h();
                Iterator<com.google.gson.l> it = lVar.a().iterator();
                while (it.hasNext()) {
                    d(cVar, it.next());
                }
                cVar.k();
            } else if (lVar.j()) {
                cVar.i();
                for (Map.Entry next : lVar.d().m()) {
                    cVar.y((String) next.getKey());
                    d(cVar, (com.google.gson.l) next.getValue());
                }
                cVar.l();
            } else {
                throw new IllegalArgumentException("Couldn't write " + lVar.getClass());
            }
        }
    }

    class u extends com.google.gson.s<BitSet> {
        u() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x002b, code lost:
            if (java.lang.Integer.parseInt(r1) != 0) goto L_0x0069;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0067, code lost:
            if (r8.D() != 0) goto L_0x0069;
         */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x006b  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x006e A[SYNTHETIC] */
        /* renamed from: e */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.util.BitSet b(com.google.gson.stream.a r8) {
            /*
                r7 = this;
                java.util.BitSet r0 = new java.util.BitSet
                r0.<init>()
                r8.a()
                com.google.gson.stream.b r1 = r8.Z()
                r2 = 0
                r3 = 0
            L_0x000e:
                com.google.gson.stream.b r4 = com.google.gson.stream.b.END_ARRAY
                if (r1 == r4) goto L_0x0075
                int[] r4 = com.google.gson.internal.bind.TypeAdapters.v.a
                int r5 = r1.ordinal()
                r4 = r4[r5]
                r5 = 1
                if (r4 == r5) goto L_0x0063
                r6 = 2
                if (r4 == r6) goto L_0x005e
                r6 = 3
                if (r4 != r6) goto L_0x0047
                java.lang.String r1 = r8.nextString()
                int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x0030 }
                if (r1 == 0) goto L_0x002e
                goto L_0x0069
            L_0x002e:
                r5 = 0
                goto L_0x0069
            L_0x0030:
                com.google.gson.JsonSyntaxException r8 = new com.google.gson.JsonSyntaxException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "Error: Expecting: bitset number value (1, 0), Found: "
                r0.append(r2)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r8.<init>((java.lang.String) r0)
                throw r8
            L_0x0047:
                com.google.gson.JsonSyntaxException r8 = new com.google.gson.JsonSyntaxException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "Invalid bitset value type: "
                r0.append(r2)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r8.<init>((java.lang.String) r0)
                throw r8
            L_0x005e:
                boolean r5 = r8.nextBoolean()
                goto L_0x0069
            L_0x0063:
                int r1 = r8.D()
                if (r1 == 0) goto L_0x002e
            L_0x0069:
                if (r5 == 0) goto L_0x006e
                r0.set(r3)
            L_0x006e:
                int r3 = r3 + 1
                com.google.gson.stream.b r1 = r8.Z()
                goto L_0x000e
            L_0x0075:
                r8.k()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.TypeAdapters.u.b(com.google.gson.stream.a):java.util.BitSet");
        }

        /* renamed from: f */
        public void d(com.google.gson.stream.c cVar, BitSet bitSet) {
            cVar.h();
            int length = bitSet.length();
            for (int i2 = 0; i2 < length; i2++) {
                cVar.n0(bitSet.get(i2) ? 1 : 0);
            }
            cVar.k();
        }
    }

    static /* synthetic */ class v {
        static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|(3:19|20|22)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.gson.stream.b[] r0 = com.google.gson.stream.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                com.google.gson.stream.b r1 = com.google.gson.stream.b.NUMBER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.gson.stream.b r1 = com.google.gson.stream.b.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.gson.stream.b r1 = com.google.gson.stream.b.STRING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.gson.stream.b r1 = com.google.gson.stream.b.NULL     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.gson.stream.b r1 = com.google.gson.stream.b.BEGIN_ARRAY     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.gson.stream.b r1 = com.google.gson.stream.b.BEGIN_OBJECT     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.gson.stream.b r1 = com.google.gson.stream.b.END_DOCUMENT     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.google.gson.stream.b r1 = com.google.gson.stream.b.NAME     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.google.gson.stream.b r1 = com.google.gson.stream.b.END_OBJECT     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.google.gson.stream.b r1 = com.google.gson.stream.b.END_ARRAY     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.TypeAdapters.v.<clinit>():void");
        }
    }

    class w extends com.google.gson.s<Boolean> {
        w() {
        }

        /* renamed from: e */
        public Boolean b(com.google.gson.stream.a aVar) {
            com.google.gson.stream.b Z = aVar.Z();
            if (Z == com.google.gson.stream.b.NULL) {
                aVar.L();
                return null;
            } else if (Z == com.google.gson.stream.b.STRING) {
                return Boolean.valueOf(Boolean.parseBoolean(aVar.nextString()));
            } else {
                return Boolean.valueOf(aVar.nextBoolean());
            }
        }

        /* renamed from: f */
        public void d(com.google.gson.stream.c cVar, Boolean bool) {
            cVar.r0(bool);
        }
    }

    class x extends com.google.gson.s<Boolean> {
        x() {
        }

        /* renamed from: e */
        public Boolean b(com.google.gson.stream.a aVar) {
            if (aVar.Z() != com.google.gson.stream.b.NULL) {
                return Boolean.valueOf(aVar.nextString());
            }
            aVar.L();
            return null;
        }

        /* renamed from: f */
        public void d(com.google.gson.stream.c cVar, Boolean bool) {
            cVar.w0(bool == null ? "null" : bool.toString());
        }
    }

    class y extends com.google.gson.s<Number> {
        y() {
        }

        /* renamed from: e */
        public Number b(com.google.gson.stream.a aVar) {
            if (aVar.Z() == com.google.gson.stream.b.NULL) {
                aVar.L();
                return null;
            }
            try {
                return Byte.valueOf((byte) aVar.D());
            } catch (NumberFormatException e2) {
                throw new JsonSyntaxException((Throwable) e2);
            }
        }

        /* renamed from: f */
        public void d(com.google.gson.stream.c cVar, Number number) {
            cVar.t0(number);
        }
    }

    class z extends com.google.gson.s<Number> {
        z() {
        }

        /* renamed from: e */
        public Number b(com.google.gson.stream.a aVar) {
            if (aVar.Z() == com.google.gson.stream.b.NULL) {
                aVar.L();
                return null;
            }
            try {
                return Short.valueOf((short) aVar.D());
            } catch (NumberFormatException e2) {
                throw new JsonSyntaxException((Throwable) e2);
            }
        }

        /* renamed from: f */
        public void d(com.google.gson.stream.c cVar, Number number) {
            cVar.t0(number);
        }
    }

    static {
        com.google.gson.s<Class> a2 = new k().a();
        a = a2;
        b = a(Class.class, a2);
        com.google.gson.s<BitSet> a3 = new u().a();
        c = a3;
        f4280d = a(BitSet.class, a3);
        com.google.gson.s<AtomicInteger> a4 = new b0().a();
        f4290n = a4;
        o = a(AtomicInteger.class, a4);
        com.google.gson.s<AtomicBoolean> a5 = new c0().a();
        p = a5;
        q = a(AtomicBoolean.class, a5);
        com.google.gson.s<AtomicIntegerArray> a6 = new a().a();
        r = a6;
        s = a(AtomicIntegerArray.class, a6);
        e eVar = new e();
        w = eVar;
        x = a(Number.class, eVar);
        j jVar = new j();
        E = jVar;
        F = a(StringBuilder.class, jVar);
        l lVar = new l();
        G = lVar;
        H = a(StringBuffer.class, lVar);
        m mVar = new m();
        I = mVar;
        J = a(URL.class, mVar);
        n nVar = new n();
        K = nVar;
        L = a(URI.class, nVar);
        o oVar = new o();
        M = oVar;
        N = d(InetAddress.class, oVar);
        p pVar = new p();
        O = pVar;
        P = a(UUID.class, pVar);
        com.google.gson.s<Currency> a7 = new q().a();
        Q = a7;
        R = a(Currency.class, a7);
        r rVar = new r();
        T = rVar;
        U = c(Calendar.class, GregorianCalendar.class, rVar);
        s sVar = new s();
        V = sVar;
        W = a(Locale.class, sVar);
        t tVar = new t();
        X = tVar;
        Y = d(com.google.gson.l.class, tVar);
    }

    public static <TT> com.google.gson.t a(final Class<TT> cls, final com.google.gson.s<TT> sVar) {
        return new com.google.gson.t() {
            public <T> com.google.gson.s<T> c(com.google.gson.f fVar, com.google.gson.u.a<T> aVar) {
                if (aVar.c() == cls) {
                    return sVar;
                }
                return null;
            }

            public String toString() {
                return "Factory[type=" + cls.getName() + ",adapter=" + sVar + "]";
            }
        };
    }

    public static <TT> com.google.gson.t b(final Class<TT> cls, final Class<TT> cls2, final com.google.gson.s<? super TT> sVar) {
        return new com.google.gson.t() {
            public <T> com.google.gson.s<T> c(com.google.gson.f fVar, com.google.gson.u.a<T> aVar) {
                Class<? super T> c = aVar.c();
                if (c == cls || c == cls2) {
                    return sVar;
                }
                return null;
            }

            public String toString() {
                return "Factory[type=" + cls2.getName() + "+" + cls.getName() + ",adapter=" + sVar + "]";
            }
        };
    }

    public static <TT> com.google.gson.t c(final Class<TT> cls, final Class<? extends TT> cls2, final com.google.gson.s<? super TT> sVar) {
        return new com.google.gson.t() {
            public <T> com.google.gson.s<T> c(com.google.gson.f fVar, com.google.gson.u.a<T> aVar) {
                Class<? super T> c = aVar.c();
                if (c == cls || c == cls2) {
                    return sVar;
                }
                return null;
            }

            public String toString() {
                return "Factory[type=" + cls.getName() + "+" + cls2.getName() + ",adapter=" + sVar + "]";
            }
        };
    }

    public static <T1> com.google.gson.t d(final Class<T1> cls, final com.google.gson.s<T1> sVar) {
        return new com.google.gson.t() {

            /* renamed from: com.google.gson.internal.bind.TypeAdapters$35$a */
            class a extends com.google.gson.s<T1> {
                final /* synthetic */ Class a;

                a(Class cls) {
                    this.a = cls;
                }

                public T1 b(com.google.gson.stream.a aVar) {
                    T1 b2 = sVar.b(aVar);
                    if (b2 == null || this.a.isInstance(b2)) {
                        return b2;
                    }
                    throw new JsonSyntaxException("Expected a " + this.a.getName() + " but was " + b2.getClass().getName());
                }

                public void d(com.google.gson.stream.c cVar, T1 t1) {
                    sVar.d(cVar, t1);
                }
            }

            public <T2> com.google.gson.s<T2> c(com.google.gson.f fVar, com.google.gson.u.a<T2> aVar) {
                Class<? super T2> c = aVar.c();
                if (!cls.isAssignableFrom(c)) {
                    return null;
                }
                return new a(c);
            }

            public String toString() {
                return "Factory[typeHierarchy=" + cls.getName() + ",adapter=" + sVar + "]";
            }
        };
    }
}
