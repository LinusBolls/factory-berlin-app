package com.sensorberg.smartspaces.sdk.debug;

import android.os.Bundle;
import androidx.appcompat.app.c;
import androidx.lifecycle.f0;
import com.sensorberg.smartspaces.sdk.internal.s.d;
import com.sensorberg.smartspaces.sdk.model.IotUnit;
import g.e.n.g.t;
import g.e.n.g.u;
import g.e.n.g.x;
import java.util.List;
import kotlin.e;
import kotlin.i;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.v;

@i(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00192\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0019B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J=\u0010\u000b\u001a\u00020\n2,\u0010\t\u001a(\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004j\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u0001`\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0016\u001a\u00020\u00118B@\u0002X\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001a"}, d2 = {"Lcom/sensorberg/smartspaces/sdk/debug/DebugActivity;", "Lcom/sensorberg/smartspaces/sdk/internal/s/d;", "Landroidx/lifecycle/f0;", "Landroidx/appcompat/app/c;", "Lcom/sensorberg/response/Response;", "", "Lcom/sensorberg/smartspaces/sdk/model/IotUnit;", "Ljava/lang/Void;", "Lcom/sensorberg/response/SimpleResponse;", "response", "", "onChanged", "(Lcom/sensorberg/response/Response;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Lcom/sensorberg/smartspaces/sdk/UnitController;", "unitController$delegate", "Lkotlin/Lazy;", "getUnitController", "()Lcom/sensorberg/smartspaces/sdk/UnitController;", "unitController", "<init>", "()V", "Companion", "sdk_release"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
/* compiled from: DebugActivity.kt */
public final class DebugActivity extends c implements d, f0<g.e.m.a<List<? extends IotUnit>, Void>> {
    private final e z = g.a(new a(n().d(), (m.a.c.j.a) null, (kotlin.e0.c.a) null));

    /* compiled from: Scope.kt */
    public static final class a extends l implements kotlin.e0.c.a<x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ m.a.c.l.a f6175h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f6176i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f6177j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(m.a.c.l.a aVar, m.a.c.j.a aVar2, kotlin.e0.c.a aVar3) {
            super(0);
            this.f6175h = aVar;
            this.f6176i = aVar2;
            this.f6177j = aVar3;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [g.e.n.g.x, java.lang.Object] */
        public final x d() {
            return this.f6175h.e(v.b(x.class), this.f6176i, this.f6177j);
        }
    }

    /* compiled from: DebugActivity.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new b((DefaultConstructorMarker) null);
    }

    private final x L() {
        return (x) this.z.getValue();
    }

    /* renamed from: M */
    public void k(g.e.m.a<List<IotUnit>, Void> aVar) {
    }

    public m.a.c.a n() {
        return d.a.a(this);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        u.a.a(L(), g.e.n.g.b.All, t.Distance, (IotUnit.Type) null, 4, (Object) null).o(this, this);
        if (bundle == null) {
            com.sensorberg.smartspaces.sdk.debug.c.a.a aVar = new com.sensorberg.smartspaces.sdk.debug.c.a.a();
            androidx.fragment.app.u i2 = s().i();
            i2.v(aVar);
            i2.r(16908290, aVar);
            i2.j();
        }
    }
}
