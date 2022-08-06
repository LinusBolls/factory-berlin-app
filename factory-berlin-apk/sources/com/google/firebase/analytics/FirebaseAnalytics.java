package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.internal.measurement.h;
import com.google.android.gms.measurement.internal.l7;
import com.google.android.gms.tasks.j;
import com.google.firebase.installations.d;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-measurement-api@@17.5.0 */
public final class FirebaseAnalytics {
    private static volatile FirebaseAnalytics b;
    private final h a;

    private FirebaseAnalytics(h hVar) {
        r.k(hVar);
        this.a = hVar;
    }

    @Keep
    public static FirebaseAnalytics getInstance(Context context) {
        if (b == null) {
            synchronized (FirebaseAnalytics.class) {
                if (b == null) {
                    b = new FirebaseAnalytics(h.a(context));
                }
            }
        }
        return b;
    }

    @Keep
    public static l7 getScionFrontendApiImplementation(Context context, Bundle bundle) {
        h b2 = h.b(context, (String) null, (String) null, (String) null, bundle);
        if (b2 == null) {
            return null;
        }
        return new b(b2);
    }

    @Keep
    public final String getFirebaseInstanceId() {
        try {
            return (String) j.a(d.i().getId(), 30000, TimeUnit.MILLISECONDS);
        } catch (ExecutionException e2) {
            throw new IllegalStateException(e2.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        } catch (InterruptedException e3) {
            throw new IllegalStateException(e3);
        }
    }

    @Deprecated
    @Keep
    public final void setCurrentScreen(Activity activity, String str, String str2) {
        this.a.i(activity, str, str2);
    }
}
