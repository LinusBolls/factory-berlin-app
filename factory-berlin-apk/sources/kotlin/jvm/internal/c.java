package kotlin.jvm.internal;

import java.io.Serializable;
import kotlin.e0.b;

/* compiled from: CallableReference */
public abstract class c implements kotlin.h0.a, Serializable {

    /* renamed from: m  reason: collision with root package name */
    public static final Object f10669m = a.f10676g;

    /* renamed from: g  reason: collision with root package name */
    private transient kotlin.h0.a f10670g;

    /* renamed from: h  reason: collision with root package name */
    protected final Object f10671h;

    /* renamed from: i  reason: collision with root package name */
    private final Class f10672i;

    /* renamed from: j  reason: collision with root package name */
    private final String f10673j;

    /* renamed from: k  reason: collision with root package name */
    private final String f10674k;

    /* renamed from: l  reason: collision with root package name */
    private final boolean f10675l;

    /* compiled from: CallableReference */
    private static class a implements Serializable {
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public static final a f10676g = new a();

        private a() {
        }
    }

    public c() {
        this(f10669m);
    }

    public Object a(Object... objArr) {
        return i().a(objArr);
    }

    public kotlin.h0.a b() {
        kotlin.h0.a aVar = this.f10670g;
        if (aVar != null) {
            return aVar;
        }
        kotlin.h0.a c = c();
        this.f10670g = c;
        return c;
    }

    /* access modifiers changed from: protected */
    public abstract kotlin.h0.a c();

    public Object e() {
        return this.f10671h;
    }

    public String f() {
        return this.f10673j;
    }

    public kotlin.h0.c g() {
        Class cls = this.f10672i;
        if (cls == null) {
            return null;
        }
        return this.f10675l ? v.c(cls) : v.b(cls);
    }

    /* access modifiers changed from: protected */
    public kotlin.h0.a i() {
        kotlin.h0.a b = b();
        if (b != this) {
            return b;
        }
        throw new b();
    }

    public String j() {
        return this.f10674k;
    }

    protected c(Object obj) {
        this(obj, (Class) null, (String) null, (String) null, false);
    }

    protected c(Object obj, Class cls, String str, String str2, boolean z) {
        this.f10671h = obj;
        this.f10672i = cls;
        this.f10673j = str;
        this.f10674k = str2;
        this.f10675l = z;
    }
}
