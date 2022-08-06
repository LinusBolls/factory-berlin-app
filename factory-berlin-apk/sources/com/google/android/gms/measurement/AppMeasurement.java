package com.google.android.gms.measurement;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.internal.measurement.f;
import com.google.android.gms.measurement.internal.f6;
import com.google.android.gms.measurement.internal.h5;
import com.google.android.gms.measurement.internal.l7;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Deprecated
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
public class AppMeasurement {

    /* renamed from: d  reason: collision with root package name */
    private static volatile AppMeasurement f2700d;
    private final h5 a;
    private final l7 b;
    private final boolean c;

    /* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
    public static class ConditionalUserProperty {
        @Keep
        public boolean mActive;
        @Keep
        public String mAppId;
        @Keep
        public long mCreationTimestamp;
        @Keep
        public String mExpiredEventName;
        @Keep
        public Bundle mExpiredEventParams;
        @Keep
        public String mName;
        @Keep
        public String mOrigin;
        @Keep
        public long mTimeToLive;
        @Keep
        public String mTimedOutEventName;
        @Keep
        public Bundle mTimedOutEventParams;
        @Keep
        public String mTriggerEventName;
        @Keep
        public long mTriggerTimeout;
        @Keep
        public String mTriggeredEventName;
        @Keep
        public Bundle mTriggeredEventParams;
        @Keep
        public long mTriggeredTimestamp;
        @Keep
        public Object mValue;

        public ConditionalUserProperty() {
        }

        /* access modifiers changed from: package-private */
        public final Bundle a() {
            Bundle bundle = new Bundle();
            String str = this.mAppId;
            if (str != null) {
                bundle.putString("app_id", str);
            }
            String str2 = this.mOrigin;
            if (str2 != null) {
                bundle.putString("origin", str2);
            }
            String str3 = this.mName;
            if (str3 != null) {
                bundle.putString("name", str3);
            }
            Object obj = this.mValue;
            if (obj != null) {
                f6.b(bundle, obj);
            }
            String str4 = this.mTriggerEventName;
            if (str4 != null) {
                bundle.putString("trigger_event_name", str4);
            }
            bundle.putLong("trigger_timeout", this.mTriggerTimeout);
            String str5 = this.mTimedOutEventName;
            if (str5 != null) {
                bundle.putString("timed_out_event_name", str5);
            }
            Bundle bundle2 = this.mTimedOutEventParams;
            if (bundle2 != null) {
                bundle.putBundle("timed_out_event_params", bundle2);
            }
            String str6 = this.mTriggeredEventName;
            if (str6 != null) {
                bundle.putString("triggered_event_name", str6);
            }
            Bundle bundle3 = this.mTriggeredEventParams;
            if (bundle3 != null) {
                bundle.putBundle("triggered_event_params", bundle3);
            }
            bundle.putLong("time_to_live", this.mTimeToLive);
            String str7 = this.mExpiredEventName;
            if (str7 != null) {
                bundle.putString("expired_event_name", str7);
            }
            Bundle bundle4 = this.mExpiredEventParams;
            if (bundle4 != null) {
                bundle.putBundle("expired_event_params", bundle4);
            }
            bundle.putLong("creation_timestamp", this.mCreationTimestamp);
            bundle.putBoolean("active", this.mActive);
            bundle.putLong("triggered_timestamp", this.mTriggeredTimestamp);
            return bundle;
        }

        ConditionalUserProperty(Bundle bundle) {
            Class cls = Long.class;
            Class cls2 = String.class;
            r.k(bundle);
            this.mAppId = (String) f6.a(bundle, "app_id", cls2, null);
            this.mOrigin = (String) f6.a(bundle, "origin", cls2, null);
            this.mName = (String) f6.a(bundle, "name", cls2, null);
            this.mValue = f6.a(bundle, "value", Object.class, null);
            this.mTriggerEventName = (String) f6.a(bundle, "trigger_event_name", cls2, null);
            this.mTriggerTimeout = ((Long) f6.a(bundle, "trigger_timeout", cls, 0L)).longValue();
            this.mTimedOutEventName = (String) f6.a(bundle, "timed_out_event_name", cls2, null);
            this.mTimedOutEventParams = (Bundle) f6.a(bundle, "timed_out_event_params", Bundle.class, null);
            this.mTriggeredEventName = (String) f6.a(bundle, "triggered_event_name", cls2, null);
            this.mTriggeredEventParams = (Bundle) f6.a(bundle, "triggered_event_params", Bundle.class, null);
            this.mTimeToLive = ((Long) f6.a(bundle, "time_to_live", cls, 0L)).longValue();
            this.mExpiredEventName = (String) f6.a(bundle, "expired_event_name", cls2, null);
            this.mExpiredEventParams = (Bundle) f6.a(bundle, "expired_event_params", Bundle.class, null);
            this.mActive = ((Boolean) f6.a(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            this.mCreationTimestamp = ((Long) f6.a(bundle, "creation_timestamp", cls, 0L)).longValue();
            this.mTriggeredTimestamp = ((Long) f6.a(bundle, "triggered_timestamp", cls, 0L)).longValue();
        }
    }

    private AppMeasurement(h5 h5Var) {
        r.k(h5Var);
        this.a = h5Var;
        this.b = null;
        this.c = false;
    }

    private static AppMeasurement a(Context context, String str, String str2) {
        if (f2700d == null) {
            synchronized (AppMeasurement.class) {
                if (f2700d == null) {
                    l7 b2 = b(context, (Bundle) null);
                    if (b2 != null) {
                        f2700d = new AppMeasurement(b2);
                    } else {
                        f2700d = new AppMeasurement(h5.b(context, new f(0, 0, true, (String) null, (String) null, (String) null, (Bundle) null), (Long) null));
                    }
                }
            }
        }
        return f2700d;
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.android.gms.measurement.internal.l7 b(android.content.Context r7, android.os.Bundle r8) {
        /*
            r8 = 0
            java.lang.String r0 = "com.google.firebase.analytics.FirebaseAnalytics"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException -> 0x0027 }
            java.lang.String r1 = "getScionFrontendApiImplementation"
            r2 = 2
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch:{  }
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            r5 = 0
            r3[r5] = r4     // Catch:{  }
            java.lang.Class<android.os.Bundle> r4 = android.os.Bundle.class
            r6 = 1
            r3[r6] = r4     // Catch:{  }
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r3)     // Catch:{  }
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch:{  }
            r1[r5] = r7     // Catch:{  }
            r1[r6] = r8     // Catch:{  }
            java.lang.Object r7 = r0.invoke(r8, r1)     // Catch:{  }
            com.google.android.gms.measurement.internal.l7 r7 = (com.google.android.gms.measurement.internal.l7) r7     // Catch:{  }
            return r7
        L_0x0027:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.AppMeasurement.b(android.content.Context, android.os.Bundle):com.google.android.gms.measurement.internal.l7");
    }

    @Deprecated
    @Keep
    public static AppMeasurement getInstance(Context context) {
        return a(context, (String) null, (String) null);
    }

    @Keep
    public void beginAdUnitExposure(String str) {
        if (this.c) {
            this.b.a(str);
        } else {
            this.a.S().z(str, this.a.f().c());
        }
    }

    @Keep
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        if (this.c) {
            this.b.l(str, str2, bundle);
        } else {
            this.a.F().y0(str, str2, bundle);
        }
    }

    /* access modifiers changed from: protected */
    @Keep
    public void clearConditionalUserPropertyAs(String str, String str2, String str3, Bundle bundle) {
        if (this.c) {
            throw new IllegalStateException("Unexpected call on client side");
        }
        this.a.F().c0(str, str2, str3, bundle);
        throw null;
    }

    @Keep
    public void endAdUnitExposure(String str) {
        if (this.c) {
            this.b.j(str);
        } else {
            this.a.S().D(str, this.a.f().c());
        }
    }

    @Keep
    public long generateEventId() {
        if (this.c) {
            return this.b.g();
        }
        return this.a.G().E0();
    }

    @Keep
    public String getAppInstanceId() {
        if (this.c) {
            return this.b.d();
        }
        return this.a.F().j0();
    }

    @Keep
    public List<ConditionalUserProperty> getConditionalUserProperties(String str, String str2) {
        List<Bundle> list;
        int i2;
        if (this.c) {
            list = this.b.h(str, str2);
        } else {
            list = this.a.F().B(str, str2);
        }
        if (list == null) {
            i2 = 0;
        } else {
            i2 = list.size();
        }
        ArrayList arrayList = new ArrayList(i2);
        for (Bundle conditionalUserProperty : list) {
            arrayList.add(new ConditionalUserProperty(conditionalUserProperty));
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    @Keep
    public List<ConditionalUserProperty> getConditionalUserPropertiesAs(String str, String str2, String str3) {
        if (this.c) {
            throw new IllegalStateException("Unexpected call on client side");
        }
        this.a.F().C(str, str2, str3);
        throw null;
    }

    @Keep
    public String getCurrentScreenClass() {
        if (this.c) {
            return this.b.c();
        }
        return this.a.F().m0();
    }

    @Keep
    public String getCurrentScreenName() {
        if (this.c) {
            return this.b.b();
        }
        return this.a.F().l0();
    }

    @Keep
    public String getGmpAppId() {
        if (this.c) {
            return this.b.e();
        }
        return this.a.F().n0();
    }

    @Keep
    public int getMaxUserProperties(String str) {
        if (this.c) {
            return this.b.i(str);
        }
        this.a.F();
        r.g(str);
        return 25;
    }

    /* access modifiers changed from: protected */
    @Keep
    public Map<String, Object> getUserProperties(String str, String str2, boolean z) {
        if (this.c) {
            return this.b.k(str, str2, z);
        }
        return this.a.F().E(str, str2, z);
    }

    /* access modifiers changed from: protected */
    @Keep
    public Map<String, Object> getUserPropertiesAs(String str, String str2, String str3, boolean z) {
        if (this.c) {
            throw new IllegalStateException("Unexpected call on client side");
        }
        this.a.F().D(str, str2, str3, z);
        throw null;
    }

    @Keep
    public void logEventInternal(String str, String str2, Bundle bundle) {
        if (this.c) {
            this.b.m(str, str2, bundle);
        } else {
            this.a.F().X(str, str2, bundle);
        }
    }

    @Keep
    public void setConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
        r.k(conditionalUserProperty);
        if (this.c) {
            this.b.f(conditionalUserProperty.a());
        } else {
            this.a.F().G(conditionalUserProperty.a());
        }
    }

    /* access modifiers changed from: protected */
    @Keep
    public void setConditionalUserPropertyAs(ConditionalUserProperty conditionalUserProperty) {
        r.k(conditionalUserProperty);
        if (this.c) {
            throw new IllegalStateException("Unexpected call on client side");
        }
        this.a.F().r0(conditionalUserProperty.a());
        throw null;
    }

    private AppMeasurement(l7 l7Var) {
        r.k(l7Var);
        this.b = l7Var;
        this.a = null;
        this.c = true;
    }
}
