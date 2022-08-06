package com.sensorberg.notifications.sdk.internal.backend.backendsdkv2.model;

import com.squareup.moshi.d;
import com.squareup.moshi.e;
import kotlin.i;
import kotlin.jvm.internal.k;

@e(generateAdapter = true)
@i(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\b\b\u0018\u0000B?\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0001\u0012\b\b\u0003\u0010\r\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u000e\u001a\u00020\u0007\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b*\u0010+J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\n\u0010\u0003J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u000b\u0010\u0003JH\u0010\u0011\u001a\u00020\u00002\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00012\b\b\u0003\u0010\r\u001a\u00020\u00042\b\b\u0003\u0010\u000e\u001a\u00020\u00072\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0018\u0010\tJ\u0010\u0010\u0019\u001a\u00020\u0001HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0003R$\u0010\f\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u001a\u001a\u0004\b\u001b\u0010\u0003\"\u0004\b\u001c\u0010\u001dR$\u0010\u0010\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u001a\u001a\u0004\b\u001e\u0010\u0003\"\u0004\b\u001f\u0010\u001dR$\u0010\u000f\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u001a\u001a\u0004\b \u0010\u0003\"\u0004\b!\u0010\u001dR\"\u0010\r\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\r\u0010\"\u001a\u0004\b#\u0010\u0006\"\u0004\b$\u0010%R\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010&\u001a\u0004\b'\u0010\t\"\u0004\b(\u0010)¨\u0006,"}, d2 = {"Lcom/sensorberg/notifications/sdk/internal/backend/backendsdkv2/model/BeaconAction;", "", "component1", "()Ljava/lang/String;", "", "component2", "()J", "", "component3", "()I", "component4", "component5", "actionId", "timeOfPresentation", "trigger", "pid", "actionInstanceUuid", "copy", "(Ljava/lang/String;JILjava/lang/String;Ljava/lang/String;)Lcom/sensorberg/notifications/sdk/internal/backend/backendsdkv2/model/BeaconAction;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Ljava/lang/String;", "getActionId", "setActionId", "(Ljava/lang/String;)V", "getActionInstanceUuid", "setActionInstanceUuid", "getPid", "setPid", "J", "getTimeOfPresentation", "setTimeOfPresentation", "(J)V", "I", "getTrigger", "setTrigger", "(I)V", "<init>", "(Ljava/lang/String;JILjava/lang/String;Ljava/lang/String;)V", "notifications_release"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
/* compiled from: BeaconAction.kt */
public final class BeaconAction {
    private String a;
    private long b;
    private int c;

    /* renamed from: d  reason: collision with root package name */
    private String f5154d;

    /* renamed from: e  reason: collision with root package name */
    private String f5155e;

    public BeaconAction() {
        this((String) null, 0, 0, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    public BeaconAction(@d(name = "eid") String str, @d(name = "dt") long j2, @d(name = "trigger") int i2, @d(name = "pid") String str2, @d(name = "uuid") String str3) {
        this.a = str;
        this.b = j2;
        this.c = i2;
        this.f5154d = str2;
        this.f5155e = str3;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.f5155e;
    }

    public final String c() {
        return this.f5154d;
    }

    public final BeaconAction copy(@d(name = "eid") String str, @d(name = "dt") long j2, @d(name = "trigger") int i2, @d(name = "pid") String str2, @d(name = "uuid") String str3) {
        return new BeaconAction(str, j2, i2, str2, str3);
    }

    public final long d() {
        return this.b;
    }

    public final int e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BeaconAction)) {
            return false;
        }
        BeaconAction beaconAction = (BeaconAction) obj;
        return k.a(this.a, beaconAction.a) && this.b == beaconAction.b && this.c == beaconAction.c && k.a(this.f5154d, beaconAction.f5154d) && k.a(this.f5155e, beaconAction.f5155e);
    }

    public final void f(String str) {
        this.a = str;
    }

    public final void g(String str) {
        this.f5155e = str;
    }

    public final void h(String str) {
        this.f5154d = str;
    }

    public int hashCode() {
        String str = this.a;
        int i2 = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        long j2 = this.b;
        int i3 = ((((hashCode * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.c) * 31;
        String str2 = this.f5154d;
        int hashCode2 = (i3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f5155e;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return hashCode2 + i2;
    }

    public final void i(long j2) {
        this.b = j2;
    }

    public final void j(int i2) {
        this.c = i2;
    }

    public String toString() {
        return "BeaconAction(actionId=" + this.a + ", timeOfPresentation=" + this.b + ", trigger=" + this.c + ", pid=" + this.f5154d + ", actionInstanceUuid=" + this.f5155e + ")";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ BeaconAction(java.lang.String r6, long r7, int r9, java.lang.String r10, java.lang.String r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
        /*
            r5 = this;
            r13 = r12 & 1
            r0 = 0
            if (r13 == 0) goto L_0x0007
            r13 = r0
            goto L_0x0008
        L_0x0007:
            r13 = r6
        L_0x0008:
            r6 = r12 & 2
            if (r6 == 0) goto L_0x000e
            r7 = 0
        L_0x000e:
            r1 = r7
            r6 = r12 & 4
            if (r6 == 0) goto L_0x0016
            r9 = 0
            r3 = 0
            goto L_0x0017
        L_0x0016:
            r3 = r9
        L_0x0017:
            r6 = r12 & 8
            if (r6 == 0) goto L_0x001d
            r4 = r0
            goto L_0x001e
        L_0x001d:
            r4 = r10
        L_0x001e:
            r6 = r12 & 16
            if (r6 == 0) goto L_0x0024
            r12 = r0
            goto L_0x0025
        L_0x0024:
            r12 = r11
        L_0x0025:
            r6 = r5
            r7 = r13
            r8 = r1
            r10 = r3
            r11 = r4
            r6.<init>(r7, r8, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sensorberg.notifications.sdk.internal.backend.backendsdkv2.model.BeaconAction.<init>(java.lang.String, long, int, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
