package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.dynamic.a;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
public interface cf extends IInterface {
    void beginAdUnitExposure(String str, long j2);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void clearMeasurementEnabled(long j2);

    void endAdUnitExposure(String str, long j2);

    void generateEventId(df dfVar);

    void getAppInstanceId(df dfVar);

    void getCachedAppInstanceId(df dfVar);

    void getConditionalUserProperties(String str, String str2, df dfVar);

    void getCurrentScreenClass(df dfVar);

    void getCurrentScreenName(df dfVar);

    void getGmpAppId(df dfVar);

    void getMaxUserProperties(String str, df dfVar);

    void getTestFlag(df dfVar, int i2);

    void getUserProperties(String str, String str2, boolean z, df dfVar);

    void initForTests(Map map);

    void initialize(a aVar, f fVar, long j2);

    void isDataCollectionEnabled(df dfVar);

    void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j2);

    void logEventAndBundle(String str, String str2, Bundle bundle, df dfVar, long j2);

    void logHealthData(int i2, String str, a aVar, a aVar2, a aVar3);

    void onActivityCreated(a aVar, Bundle bundle, long j2);

    void onActivityDestroyed(a aVar, long j2);

    void onActivityPaused(a aVar, long j2);

    void onActivityResumed(a aVar, long j2);

    void onActivitySaveInstanceState(a aVar, df dfVar, long j2);

    void onActivityStarted(a aVar, long j2);

    void onActivityStopped(a aVar, long j2);

    void performAction(Bundle bundle, df dfVar, long j2);

    void registerOnMeasurementEventListener(c cVar);

    void resetAnalyticsData(long j2);

    void setConditionalUserProperty(Bundle bundle, long j2);

    void setConsent(Bundle bundle, long j2);

    void setCurrentScreen(a aVar, String str, String str2, long j2);

    void setDataCollectionEnabled(boolean z);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(c cVar);

    void setInstanceIdProvider(d dVar);

    void setMeasurementEnabled(boolean z, long j2);

    void setMinimumSessionDuration(long j2);

    void setSessionTimeoutDuration(long j2);

    void setUserId(String str, long j2);

    void setUserProperty(String str, String str2, a aVar, boolean z, long j2);

    void unregisterOnMeasurementEventListener(c cVar);
}
