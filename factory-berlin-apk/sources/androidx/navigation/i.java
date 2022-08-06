package androidx.navigation;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.k0;
import androidx.lifecycle.o;
import androidx.lifecycle.p;
import androidx.lifecycle.p0;
import androidx.lifecycle.r0;
import androidx.lifecycle.s0;
import androidx.lifecycle.v;
import androidx.lifecycle.w;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.b;
import java.util.UUID;

/* compiled from: NavBackStackEntry */
public final class i implements v, s0, o, b {

    /* renamed from: g  reason: collision with root package name */
    private final Context f1065g;

    /* renamed from: h  reason: collision with root package name */
    private final o f1066h;

    /* renamed from: i  reason: collision with root package name */
    private Bundle f1067i;

    /* renamed from: j  reason: collision with root package name */
    private final w f1068j;

    /* renamed from: k  reason: collision with root package name */
    private final androidx.savedstate.a f1069k;

    /* renamed from: l  reason: collision with root package name */
    final UUID f1070l;

    /* renamed from: m  reason: collision with root package name */
    private p.b f1071m;

    /* renamed from: n  reason: collision with root package name */
    private p.b f1072n;
    private k o;
    private p0.b p;

    /* compiled from: NavBackStackEntry */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                androidx.lifecycle.p$a[] r0 = androidx.lifecycle.p.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                androidx.lifecycle.p$a r1 = androidx.lifecycle.p.a.ON_CREATE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.lifecycle.p$a r1 = androidx.lifecycle.p.a.ON_STOP     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.lifecycle.p$a r1 = androidx.lifecycle.p.a.ON_START     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.lifecycle.p$a r1 = androidx.lifecycle.p.a.ON_PAUSE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.lifecycle.p$a r1 = androidx.lifecycle.p.a.ON_RESUME     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.lifecycle.p$a r1 = androidx.lifecycle.p.a.ON_DESTROY     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0054 }
                androidx.lifecycle.p$a r1 = androidx.lifecycle.p.a.ON_ANY     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.i.a.<clinit>():void");
        }
    }

    i(Context context, o oVar, Bundle bundle, v vVar, k kVar) {
        this(context, oVar, bundle, vVar, kVar, UUID.randomUUID(), (Bundle) null);
    }

    private static p.b g(p.a aVar) {
        switch (a.a[aVar.ordinal()]) {
            case 1:
            case 2:
                return p.b.CREATED;
            case 3:
            case 4:
                return p.b.STARTED;
            case 5:
                return p.b.RESUMED;
            case 6:
                return p.b.DESTROYED;
            default:
                throw new IllegalArgumentException("Unexpected event value " + aVar);
        }
    }

    public p a() {
        return this.f1068j;
    }

    public Bundle b() {
        return this.f1067i;
    }

    public SavedStateRegistry d() {
        return this.f1069k.b();
    }

    public o e() {
        return this.f1066h;
    }

    /* access modifiers changed from: package-private */
    public p.b f() {
        return this.f1072n;
    }

    /* access modifiers changed from: package-private */
    public void h(p.a aVar) {
        this.f1071m = g(aVar);
        m();
    }

    public p0.b i() {
        if (this.p == null) {
            this.p = new k0((Application) this.f1065g.getApplicationContext(), this, this.f1067i);
        }
        return this.p;
    }

    /* access modifiers changed from: package-private */
    public void j(Bundle bundle) {
        this.f1067i = bundle;
    }

    /* access modifiers changed from: package-private */
    public void k(Bundle bundle) {
        this.f1069k.d(bundle);
    }

    /* access modifiers changed from: package-private */
    public void l(p.b bVar) {
        this.f1072n = bVar;
        m();
    }

    /* access modifiers changed from: package-private */
    public void m() {
        if (this.f1071m.ordinal() < this.f1072n.ordinal()) {
            this.f1068j.p(this.f1071m);
        } else {
            this.f1068j.p(this.f1072n);
        }
    }

    public r0 o() {
        k kVar = this.o;
        if (kVar != null) {
            return kVar.t(this.f1070l);
        }
        throw new IllegalStateException("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
    }

    i(Context context, o oVar, Bundle bundle, v vVar, k kVar, UUID uuid, Bundle bundle2) {
        this.f1068j = new w(this);
        androidx.savedstate.a a2 = androidx.savedstate.a.a(this);
        this.f1069k = a2;
        this.f1071m = p.b.CREATED;
        this.f1072n = p.b.RESUMED;
        this.f1065g = context;
        this.f1070l = uuid;
        this.f1066h = oVar;
        this.f1067i = bundle;
        this.o = kVar;
        a2.c(bundle2);
        if (vVar != null) {
            this.f1071m = vVar.a().b();
        }
    }
}
