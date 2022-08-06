package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.internal.measurement.bf;
import com.google.android.gms.internal.measurement.c;
import com.google.android.gms.internal.measurement.d;
import com.google.android.gms.internal.measurement.df;
import com.google.android.gms.internal.measurement.f;
import com.google.android.gms.internal.measurement.fb;
import java.util.Map;

@DynamiteApi
/* compiled from: com.google.android.gms:play-services-measurement-sdk@@17.5.0 */
public class AppMeasurementDynamiteService extends bf {
    h5 a = null;
    private Map<Integer, j6> b = new e.e.a();

    /* compiled from: com.google.android.gms:play-services-measurement-sdk@@17.5.0 */
    class a implements j6 {
        private c a;

        a(c cVar) {
            this.a = cVar;
        }

        public final void a(String str, String str2, Bundle bundle, long j2) {
            try {
                this.a.D(str, str2, bundle, j2);
            } catch (RemoteException e2) {
                AppMeasurementDynamiteService.this.a.i().H().b("Event listener threw exception", e2);
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-sdk@@17.5.0 */
    class b implements k6 {
        private c a;

        b(c cVar) {
            this.a = cVar;
        }

        public final void a(String str, String str2, Bundle bundle, long j2) {
            try {
                this.a.D(str, str2, bundle, j2);
            } catch (RemoteException e2) {
                AppMeasurementDynamiteService.this.a.i().H().b("Event interceptor threw exception", e2);
            }
        }
    }

    private final void l() {
        if (this.a == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    private final void o(df dfVar, String str) {
        this.a.G().R(dfVar, str);
    }

    public void beginAdUnitExposure(String str, long j2) {
        l();
        this.a.S().z(str, j2);
    }

    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        l();
        this.a.F().y0(str, str2, bundle);
    }

    public void clearMeasurementEnabled(long j2) {
        l();
        this.a.F().R((Boolean) null);
    }

    public void endAdUnitExposure(String str, long j2) {
        l();
        this.a.S().D(str, j2);
    }

    public void generateEventId(df dfVar) {
        l();
        this.a.G().P(dfVar, this.a.G().E0());
    }

    public void getAppInstanceId(df dfVar) {
        l();
        this.a.a().y(new g6(this, dfVar));
    }

    public void getCachedAppInstanceId(df dfVar) {
        l();
        o(dfVar, this.a.F().j0());
    }

    public void getConditionalUserProperties(String str, String str2, df dfVar) {
        l();
        this.a.a().y(new ia(this, dfVar, str, str2));
    }

    public void getCurrentScreenClass(df dfVar) {
        l();
        o(dfVar, this.a.F().m0());
    }

    public void getCurrentScreenName(df dfVar) {
        l();
        o(dfVar, this.a.F().l0());
    }

    public void getGmpAppId(df dfVar) {
        l();
        o(dfVar, this.a.F().n0());
    }

    public void getMaxUserProperties(String str, df dfVar) {
        l();
        this.a.F();
        r.g(str);
        this.a.G().O(dfVar, 25);
    }

    public void getTestFlag(df dfVar, int i2) {
        l();
        if (i2 == 0) {
            this.a.G().R(dfVar, this.a.F().f0());
        } else if (i2 == 1) {
            this.a.G().P(dfVar, this.a.F().g0().longValue());
        } else if (i2 == 2) {
            fa G = this.a.G();
            double doubleValue = this.a.F().i0().doubleValue();
            Bundle bundle = new Bundle();
            bundle.putDouble("r", doubleValue);
            try {
                dfVar.f(bundle);
            } catch (RemoteException e2) {
                G.a.i().H().b("Error returning double value to wrapper", e2);
            }
        } else if (i2 == 3) {
            this.a.G().O(dfVar, this.a.F().h0().intValue());
        } else if (i2 == 4) {
            this.a.G().T(dfVar, this.a.F().e0().booleanValue());
        }
    }

    public void getUserProperties(String str, String str2, boolean z, df dfVar) {
        l();
        this.a.a().y(new g7(this, dfVar, str, str2, z));
    }

    public void initForTests(Map map) {
        l();
    }

    public void initialize(com.google.android.gms.dynamic.a aVar, f fVar, long j2) {
        Context context = (Context) com.google.android.gms.dynamic.b.o(aVar);
        h5 h5Var = this.a;
        if (h5Var == null) {
            this.a = h5.b(context, fVar, Long.valueOf(j2));
        } else {
            h5Var.i().H().a("Attempting to initialize multiple times");
        }
    }

    public void isDataCollectionEnabled(df dfVar) {
        l();
        this.a.a().y(new h9(this, dfVar));
    }

    public void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j2) {
        l();
        this.a.F().Y(str, str2, bundle, z, z2, j2);
    }

    public void logEventAndBundle(String str, String str2, Bundle bundle, df dfVar, long j2) {
        Bundle bundle2;
        l();
        r.g(str2);
        if (bundle == null) {
            bundle2 = new Bundle();
        }
        bundle2.putString("_o", "app");
        this.a.a().y(new g8(this, dfVar, new s(str2, new n(bundle), "app", j2), str));
    }

    public void logHealthData(int i2, String str, com.google.android.gms.dynamic.a aVar, com.google.android.gms.dynamic.a aVar2, com.google.android.gms.dynamic.a aVar3) {
        Object obj;
        Object obj2;
        l();
        Object obj3 = null;
        if (aVar == null) {
            obj = null;
        } else {
            obj = com.google.android.gms.dynamic.b.o(aVar);
        }
        if (aVar2 == null) {
            obj2 = null;
        } else {
            obj2 = com.google.android.gms.dynamic.b.o(aVar2);
        }
        if (aVar3 != null) {
            obj3 = com.google.android.gms.dynamic.b.o(aVar3);
        }
        this.a.i().A(i2, true, false, str, obj, obj2, obj3);
    }

    public void onActivityCreated(com.google.android.gms.dynamic.a aVar, Bundle bundle, long j2) {
        l();
        j7 j7Var = this.a.F().c;
        if (j7Var != null) {
            this.a.F().d0();
            j7Var.onActivityCreated((Activity) com.google.android.gms.dynamic.b.o(aVar), bundle);
        }
    }

    public void onActivityDestroyed(com.google.android.gms.dynamic.a aVar, long j2) {
        l();
        j7 j7Var = this.a.F().c;
        if (j7Var != null) {
            this.a.F().d0();
            j7Var.onActivityDestroyed((Activity) com.google.android.gms.dynamic.b.o(aVar));
        }
    }

    public void onActivityPaused(com.google.android.gms.dynamic.a aVar, long j2) {
        l();
        j7 j7Var = this.a.F().c;
        if (j7Var != null) {
            this.a.F().d0();
            j7Var.onActivityPaused((Activity) com.google.android.gms.dynamic.b.o(aVar));
        }
    }

    public void onActivityResumed(com.google.android.gms.dynamic.a aVar, long j2) {
        l();
        j7 j7Var = this.a.F().c;
        if (j7Var != null) {
            this.a.F().d0();
            j7Var.onActivityResumed((Activity) com.google.android.gms.dynamic.b.o(aVar));
        }
    }

    public void onActivitySaveInstanceState(com.google.android.gms.dynamic.a aVar, df dfVar, long j2) {
        l();
        j7 j7Var = this.a.F().c;
        Bundle bundle = new Bundle();
        if (j7Var != null) {
            this.a.F().d0();
            j7Var.onActivitySaveInstanceState((Activity) com.google.android.gms.dynamic.b.o(aVar), bundle);
        }
        try {
            dfVar.f(bundle);
        } catch (RemoteException e2) {
            this.a.i().H().b("Error returning bundle value to wrapper", e2);
        }
    }

    public void onActivityStarted(com.google.android.gms.dynamic.a aVar, long j2) {
        l();
        j7 j7Var = this.a.F().c;
        if (j7Var != null) {
            this.a.F().d0();
            j7Var.onActivityStarted((Activity) com.google.android.gms.dynamic.b.o(aVar));
        }
    }

    public void onActivityStopped(com.google.android.gms.dynamic.a aVar, long j2) {
        l();
        j7 j7Var = this.a.F().c;
        if (j7Var != null) {
            this.a.F().d0();
            j7Var.onActivityStopped((Activity) com.google.android.gms.dynamic.b.o(aVar));
        }
    }

    public void performAction(Bundle bundle, df dfVar, long j2) {
        l();
        dfVar.f((Bundle) null);
    }

    public void registerOnMeasurementEventListener(c cVar) {
        l();
        j6 j6Var = this.b.get(Integer.valueOf(cVar.b()));
        if (j6Var == null) {
            j6Var = new a(cVar);
            this.b.put(Integer.valueOf(cVar.b()), j6Var);
        }
        this.a.F().L(j6Var);
    }

    public void resetAnalyticsData(long j2) {
        l();
        l6 F = this.a.F();
        F.T((String) null);
        F.a().y(new v6(F, j2));
    }

    public void setConditionalUserProperty(Bundle bundle, long j2) {
        l();
        if (bundle == null) {
            this.a.i().E().a("Conditional user property must not be null");
        } else {
            this.a.F().H(bundle, j2);
        }
    }

    public void setConsent(Bundle bundle, long j2) {
        l();
        l6 F = this.a.F();
        if (fb.a() && F.l().z((String) null, u.P0)) {
            F.w();
            String f2 = e.f(bundle);
            if (f2 != null) {
                F.i().J().b("Ignoring invalid consent setting", f2);
                F.i().J().a("Valid consent values are 'granted', 'denied'");
            }
            F.J(e.j(bundle), 10, j2);
        }
    }

    public void setCurrentScreen(com.google.android.gms.dynamic.a aVar, String str, String str2, long j2) {
        l();
        this.a.O().I((Activity) com.google.android.gms.dynamic.b.o(aVar), str, str2);
    }

    public void setDataCollectionEnabled(boolean z) {
        l();
        l6 F = this.a.F();
        F.w();
        F.a().y(new k7(F, z));
    }

    public void setDefaultEventParameters(Bundle bundle) {
        Bundle bundle2;
        l();
        l6 F = this.a.F();
        if (bundle == null) {
            bundle2 = null;
        } else {
            bundle2 = new Bundle(bundle);
        }
        F.a().y(new o6(F, bundle2));
    }

    public void setEventInterceptor(c cVar) {
        l();
        l6 F = this.a.F();
        b bVar = new b(cVar);
        F.w();
        F.a().y(new x6(F, bVar));
    }

    public void setInstanceIdProvider(d dVar) {
        l();
    }

    public void setMeasurementEnabled(boolean z, long j2) {
        l();
        this.a.F().R(Boolean.valueOf(z));
    }

    public void setMinimumSessionDuration(long j2) {
        l();
        l6 F = this.a.F();
        F.a().y(new s6(F, j2));
    }

    public void setSessionTimeoutDuration(long j2) {
        l();
        l6 F = this.a.F();
        F.a().y(new r6(F, j2));
    }

    public void setUserId(String str, long j2) {
        l();
        this.a.F().b0((String) null, "_id", str, true, j2);
    }

    public void setUserProperty(String str, String str2, com.google.android.gms.dynamic.a aVar, boolean z, long j2) {
        l();
        this.a.F().b0(str, str2, com.google.android.gms.dynamic.b.o(aVar), z, j2);
    }

    public void unregisterOnMeasurementEventListener(c cVar) {
        l();
        j6 remove = this.b.remove(Integer.valueOf(cVar.b()));
        if (remove == null) {
            remove = new a(cVar);
        }
        this.a.F().t0(remove);
    }
}
