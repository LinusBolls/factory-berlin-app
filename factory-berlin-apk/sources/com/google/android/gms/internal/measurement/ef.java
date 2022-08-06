package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.a;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
public final class ef extends a implements cf {
    ef(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public final void beginAdUnitExposure(String str, long j2) {
        Parcel i2 = i();
        i2.writeString(str);
        i2.writeLong(j2);
        o(23, i2);
    }

    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel i2 = i();
        i2.writeString(str);
        i2.writeString(str2);
        v.c(i2, bundle);
        o(9, i2);
    }

    public final void clearMeasurementEnabled(long j2) {
        Parcel i2 = i();
        i2.writeLong(j2);
        o(43, i2);
    }

    public final void endAdUnitExposure(String str, long j2) {
        Parcel i2 = i();
        i2.writeString(str);
        i2.writeLong(j2);
        o(24, i2);
    }

    public final void generateEventId(df dfVar) {
        Parcel i2 = i();
        v.b(i2, dfVar);
        o(22, i2);
    }

    public final void getAppInstanceId(df dfVar) {
        Parcel i2 = i();
        v.b(i2, dfVar);
        o(20, i2);
    }

    public final void getCachedAppInstanceId(df dfVar) {
        Parcel i2 = i();
        v.b(i2, dfVar);
        o(19, i2);
    }

    public final void getConditionalUserProperties(String str, String str2, df dfVar) {
        Parcel i2 = i();
        i2.writeString(str);
        i2.writeString(str2);
        v.b(i2, dfVar);
        o(10, i2);
    }

    public final void getCurrentScreenClass(df dfVar) {
        Parcel i2 = i();
        v.b(i2, dfVar);
        o(17, i2);
    }

    public final void getCurrentScreenName(df dfVar) {
        Parcel i2 = i();
        v.b(i2, dfVar);
        o(16, i2);
    }

    public final void getGmpAppId(df dfVar) {
        Parcel i2 = i();
        v.b(i2, dfVar);
        o(21, i2);
    }

    public final void getMaxUserProperties(String str, df dfVar) {
        Parcel i2 = i();
        i2.writeString(str);
        v.b(i2, dfVar);
        o(6, i2);
    }

    public final void getTestFlag(df dfVar, int i2) {
        Parcel i3 = i();
        v.b(i3, dfVar);
        i3.writeInt(i2);
        o(38, i3);
    }

    public final void getUserProperties(String str, String str2, boolean z, df dfVar) {
        Parcel i2 = i();
        i2.writeString(str);
        i2.writeString(str2);
        v.d(i2, z);
        v.b(i2, dfVar);
        o(5, i2);
    }

    public final void initForTests(Map map) {
        Parcel i2 = i();
        i2.writeMap(map);
        o(37, i2);
    }

    public final void initialize(a aVar, f fVar, long j2) {
        Parcel i2 = i();
        v.b(i2, aVar);
        v.c(i2, fVar);
        i2.writeLong(j2);
        o(1, i2);
    }

    public final void isDataCollectionEnabled(df dfVar) {
        Parcel i2 = i();
        v.b(i2, dfVar);
        o(40, i2);
    }

    public final void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j2) {
        Parcel i2 = i();
        i2.writeString(str);
        i2.writeString(str2);
        v.c(i2, bundle);
        v.d(i2, z);
        v.d(i2, z2);
        i2.writeLong(j2);
        o(2, i2);
    }

    public final void logEventAndBundle(String str, String str2, Bundle bundle, df dfVar, long j2) {
        Parcel i2 = i();
        i2.writeString(str);
        i2.writeString(str2);
        v.c(i2, bundle);
        v.b(i2, dfVar);
        i2.writeLong(j2);
        o(3, i2);
    }

    public final void logHealthData(int i2, String str, a aVar, a aVar2, a aVar3) {
        Parcel i3 = i();
        i3.writeInt(i2);
        i3.writeString(str);
        v.b(i3, aVar);
        v.b(i3, aVar2);
        v.b(i3, aVar3);
        o(33, i3);
    }

    public final void onActivityCreated(a aVar, Bundle bundle, long j2) {
        Parcel i2 = i();
        v.b(i2, aVar);
        v.c(i2, bundle);
        i2.writeLong(j2);
        o(27, i2);
    }

    public final void onActivityDestroyed(a aVar, long j2) {
        Parcel i2 = i();
        v.b(i2, aVar);
        i2.writeLong(j2);
        o(28, i2);
    }

    public final void onActivityPaused(a aVar, long j2) {
        Parcel i2 = i();
        v.b(i2, aVar);
        i2.writeLong(j2);
        o(29, i2);
    }

    public final void onActivityResumed(a aVar, long j2) {
        Parcel i2 = i();
        v.b(i2, aVar);
        i2.writeLong(j2);
        o(30, i2);
    }

    public final void onActivitySaveInstanceState(a aVar, df dfVar, long j2) {
        Parcel i2 = i();
        v.b(i2, aVar);
        v.b(i2, dfVar);
        i2.writeLong(j2);
        o(31, i2);
    }

    public final void onActivityStarted(a aVar, long j2) {
        Parcel i2 = i();
        v.b(i2, aVar);
        i2.writeLong(j2);
        o(25, i2);
    }

    public final void onActivityStopped(a aVar, long j2) {
        Parcel i2 = i();
        v.b(i2, aVar);
        i2.writeLong(j2);
        o(26, i2);
    }

    public final void performAction(Bundle bundle, df dfVar, long j2) {
        Parcel i2 = i();
        v.c(i2, bundle);
        v.b(i2, dfVar);
        i2.writeLong(j2);
        o(32, i2);
    }

    public final void registerOnMeasurementEventListener(c cVar) {
        Parcel i2 = i();
        v.b(i2, cVar);
        o(35, i2);
    }

    public final void resetAnalyticsData(long j2) {
        Parcel i2 = i();
        i2.writeLong(j2);
        o(12, i2);
    }

    public final void setConditionalUserProperty(Bundle bundle, long j2) {
        Parcel i2 = i();
        v.c(i2, bundle);
        i2.writeLong(j2);
        o(8, i2);
    }

    public final void setConsent(Bundle bundle, long j2) {
        Parcel i2 = i();
        v.c(i2, bundle);
        i2.writeLong(j2);
        o(44, i2);
    }

    public final void setCurrentScreen(a aVar, String str, String str2, long j2) {
        Parcel i2 = i();
        v.b(i2, aVar);
        i2.writeString(str);
        i2.writeString(str2);
        i2.writeLong(j2);
        o(15, i2);
    }

    public final void setDataCollectionEnabled(boolean z) {
        Parcel i2 = i();
        v.d(i2, z);
        o(39, i2);
    }

    public final void setDefaultEventParameters(Bundle bundle) {
        Parcel i2 = i();
        v.c(i2, bundle);
        o(42, i2);
    }

    public final void setEventInterceptor(c cVar) {
        Parcel i2 = i();
        v.b(i2, cVar);
        o(34, i2);
    }

    public final void setInstanceIdProvider(d dVar) {
        Parcel i2 = i();
        v.b(i2, dVar);
        o(18, i2);
    }

    public final void setMeasurementEnabled(boolean z, long j2) {
        Parcel i2 = i();
        v.d(i2, z);
        i2.writeLong(j2);
        o(11, i2);
    }

    public final void setMinimumSessionDuration(long j2) {
        Parcel i2 = i();
        i2.writeLong(j2);
        o(13, i2);
    }

    public final void setSessionTimeoutDuration(long j2) {
        Parcel i2 = i();
        i2.writeLong(j2);
        o(14, i2);
    }

    public final void setUserId(String str, long j2) {
        Parcel i2 = i();
        i2.writeString(str);
        i2.writeLong(j2);
        o(7, i2);
    }

    public final void setUserProperty(String str, String str2, a aVar, boolean z, long j2) {
        Parcel i2 = i();
        i2.writeString(str);
        i2.writeString(str2);
        v.b(i2, aVar);
        v.d(i2, z);
        i2.writeLong(j2);
        o(4, i2);
    }

    public final void unregisterOnMeasurementEventListener(c cVar) {
        Parcel i2 = i();
        v.b(i2, cVar);
        o(36, i2);
    }
}
