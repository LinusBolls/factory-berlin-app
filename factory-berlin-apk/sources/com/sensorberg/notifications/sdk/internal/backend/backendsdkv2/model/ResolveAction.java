package com.sensorberg.notifications.sdk.internal.backend.backendsdkv2.model;

import com.sensorberg.notifications.sdk.internal.model.Trigger;
import com.squareup.moshi.e;
import java.util.List;
import kotlin.i;
import kotlin.jvm.internal.k;

@e(generateAdapter = true)
@i(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001a\b\b\u0018\u0000 E:\u0001EB\u0001\u0012\u0006\u0010\u001a\u001a\u00020\u0001\u0012\u0006\u0010\u001b\u001a\u00020\u000e\u0012\u0006\u0010\u001c\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0001\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010$\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\bC\u0010DJ\u0010\u0010\u0002\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0003J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0013\u0010\nJ\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u0014\u0010\rJ\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u0018\u0010\rJ\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J¤\u0001\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u001a\u001a\u00020\u00012\b\b\u0002\u0010\u001b\u001a\u00020\u000e2\b\b\u0002\u0010\u001c\u001a\u00020\u000e2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00012\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010$\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u00020\u00152\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b*\u0010+J\r\u0010-\u001a\u00020,¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b/\u0010\u0010J\u0010\u00100\u001a\u00020\u0001HÖ\u0001¢\u0006\u0004\b0\u0010\u0003R\u001f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00010\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u00101\u001a\u0004\b2\u0010\nR\u001b\u0010#\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b#\u00103\u001a\u0004\b4\u0010\u0006R\u001b\u0010!\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b!\u00105\u001a\u0004\b6\u0010\rR\u001b\u0010%\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b%\u00105\u001a\u0004\b7\u0010\rR\u0019\u0010\u001a\u001a\u00020\u00018\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u00108\u001a\u0004\b9\u0010\u0003R\u001b\u0010\u001d\u001a\u0004\u0018\u00010\u00018\u0006@\u0006¢\u0006\f\n\u0004\b\u001d\u00108\u001a\u0004\b:\u0010\u0003R\u001b\u0010\"\u001a\u0004\u0018\u00010\u00158\u0006@\u0006¢\u0006\f\n\u0004\b\"\u0010;\u001a\u0004\b<\u0010\u0017R\u001b\u0010 \u001a\u0004\u0018\u00010\u00158\u0006@\u0006¢\u0006\f\n\u0004\b \u0010;\u001a\u0004\b=\u0010\u0017R\u001b\u0010\u001f\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b\u001f\u00105\u001a\u0004\b>\u0010\rR!\u0010$\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006@\u0006¢\u0006\f\n\u0004\b$\u00101\u001a\u0004\b?\u0010\nR\u0019\u0010\u001b\u001a\u00020\u000e8\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010@\u001a\u0004\bA\u0010\u0010R\u0019\u0010\u001c\u001a\u00020\u000e8\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010@\u001a\u0004\bB\u0010\u0010¨\u0006F"}, d2 = {"Lcom/sensorberg/notifications/sdk/internal/backend/backendsdkv2/model/ResolveAction;", "", "component1", "()Ljava/lang/String;", "Lcom/sensorberg/notifications/sdk/internal/backend/backendsdkv2/model/Content;", "component10", "()Lcom/sensorberg/notifications/sdk/internal/backend/backendsdkv2/model/Content;", "", "Lcom/sensorberg/notifications/sdk/internal/backend/backendsdkv2/model/Timeframe;", "component11", "()Ljava/util/List;", "", "component12", "()Ljava/lang/Long;", "", "component2", "()I", "component3", "component4", "component5", "component6", "", "component7", "()Ljava/lang/Boolean;", "component8", "component9", "eid", "trigger", "type", "name", "beacons", "suppressionTime", "sendOnlyOnce", "delay", "reportImmediately", "content", "timeframes", "deliverAt", "copy", "(Ljava/lang/String;IILjava/lang/String;Ljava/util/List;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Boolean;Lcom/sensorberg/notifications/sdk/internal/backend/backendsdkv2/model/Content;Ljava/util/List;Ljava/lang/Long;)Lcom/sensorberg/notifications/sdk/internal/backend/backendsdkv2/model/ResolveAction;", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/sensorberg/notifications/sdk/internal/model/Trigger$Type;", "getTriggerType", "()Lcom/sensorberg/notifications/sdk/internal/model/Trigger$Type;", "hashCode", "toString", "Ljava/util/List;", "getBeacons", "Lcom/sensorberg/notifications/sdk/internal/backend/backendsdkv2/model/Content;", "getContent", "Ljava/lang/Long;", "getDelay", "getDeliverAt", "Ljava/lang/String;", "getEid", "getName", "Ljava/lang/Boolean;", "getReportImmediately", "getSendOnlyOnce", "getSuppressionTime", "getTimeframes", "I", "getTrigger", "getType", "<init>", "(Ljava/lang/String;IILjava/lang/String;Ljava/util/List;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Boolean;Lcom/sensorberg/notifications/sdk/internal/backend/backendsdkv2/model/Content;Ljava/util/List;Ljava/lang/Long;)V", "Companion", "notifications_release"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
/* compiled from: ResolveAction.kt */
public final class ResolveAction {
    private final String a;
    private final int b;
    private final int c;

    /* renamed from: d  reason: collision with root package name */
    private final String f5159d;

    /* renamed from: e  reason: collision with root package name */
    private final List<String> f5160e;

    /* renamed from: f  reason: collision with root package name */
    private final Long f5161f;

    /* renamed from: g  reason: collision with root package name */
    private final Boolean f5162g;

    /* renamed from: h  reason: collision with root package name */
    private final Long f5163h;

    /* renamed from: i  reason: collision with root package name */
    private final Boolean f5164i;

    /* renamed from: j  reason: collision with root package name */
    private final Content f5165j;

    /* renamed from: k  reason: collision with root package name */
    private final List<Timeframe> f5166k;

    /* renamed from: l  reason: collision with root package name */
    private final Long f5167l;

    /* compiled from: ResolveAction.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new a((DefaultConstructorMarker) null);
    }

    public ResolveAction(String str, int i2, int i3, String str2, List<String> list, Long l2, Boolean bool, Long l3, Boolean bool2, Content content, List<Timeframe> list2, Long l4) {
        k.f(str, "eid");
        k.f(list, "beacons");
        this.a = str;
        this.b = i2;
        this.c = i3;
        this.f5159d = str2;
        this.f5160e = list;
        this.f5161f = l2;
        this.f5162g = bool;
        this.f5163h = l3;
        this.f5164i = bool2;
        this.f5165j = content;
        this.f5166k = list2;
        this.f5167l = l4;
    }

    public final List<String> a() {
        return this.f5160e;
    }

    public final Content b() {
        return this.f5165j;
    }

    public final Long c() {
        return this.f5163h;
    }

    public final Long d() {
        return this.f5167l;
    }

    public final String e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResolveAction)) {
            return false;
        }
        ResolveAction resolveAction = (ResolveAction) obj;
        return k.a(this.a, resolveAction.a) && this.b == resolveAction.b && this.c == resolveAction.c && k.a(this.f5159d, resolveAction.f5159d) && k.a(this.f5160e, resolveAction.f5160e) && k.a(this.f5161f, resolveAction.f5161f) && k.a(this.f5162g, resolveAction.f5162g) && k.a(this.f5163h, resolveAction.f5163h) && k.a(this.f5164i, resolveAction.f5164i) && k.a(this.f5165j, resolveAction.f5165j) && k.a(this.f5166k, resolveAction.f5166k) && k.a(this.f5167l, resolveAction.f5167l);
    }

    public final String f() {
        return this.f5159d;
    }

    public final Boolean g() {
        return this.f5164i;
    }

    public final Boolean h() {
        return this.f5162g;
    }

    public int hashCode() {
        String str = this.a;
        int i2 = 0;
        int hashCode = (((((str != null ? str.hashCode() : 0) * 31) + this.b) * 31) + this.c) * 31;
        String str2 = this.f5159d;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        List<String> list = this.f5160e;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        Long l2 = this.f5161f;
        int hashCode4 = (hashCode3 + (l2 != null ? l2.hashCode() : 0)) * 31;
        Boolean bool = this.f5162g;
        int hashCode5 = (hashCode4 + (bool != null ? bool.hashCode() : 0)) * 31;
        Long l3 = this.f5163h;
        int hashCode6 = (hashCode5 + (l3 != null ? l3.hashCode() : 0)) * 31;
        Boolean bool2 = this.f5164i;
        int hashCode7 = (hashCode6 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        Content content = this.f5165j;
        int hashCode8 = (hashCode7 + (content != null ? content.hashCode() : 0)) * 31;
        List<Timeframe> list2 = this.f5166k;
        int hashCode9 = (hashCode8 + (list2 != null ? list2.hashCode() : 0)) * 31;
        Long l4 = this.f5167l;
        if (l4 != null) {
            i2 = l4.hashCode();
        }
        return hashCode9 + i2;
    }

    public final Long i() {
        return this.f5161f;
    }

    public final List<Timeframe> j() {
        return this.f5166k;
    }

    public final int k() {
        return this.b;
    }

    public final Trigger.b l() {
        int i2 = this.b;
        if (i2 == 1) {
            return Trigger.b.Enter;
        }
        if (i2 == 2) {
            return Trigger.b.Exit;
        }
        if (i2 != 3) {
            return Trigger.b.Enter;
        }
        return Trigger.b.EnterOrExit;
    }

    public final int m() {
        return this.c;
    }

    public String toString() {
        return "ResolveAction(eid=" + this.a + ", trigger=" + this.b + ", type=" + this.c + ", name=" + this.f5159d + ", beacons=" + this.f5160e + ", suppressionTime=" + this.f5161f + ", sendOnlyOnce=" + this.f5162g + ", delay=" + this.f5163h + ", reportImmediately=" + this.f5164i + ", content=" + this.f5165j + ", timeframes=" + this.f5166k + ", deliverAt=" + this.f5167l + ")";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ResolveAction(java.lang.String r17, int r18, int r19, java.lang.String r20, java.util.List r21, java.lang.Long r22, java.lang.Boolean r23, java.lang.Long r24, java.lang.Boolean r25, com.sensorberg.notifications.sdk.internal.backend.backendsdkv2.model.Content r26, java.util.List r27, java.lang.Long r28, int r29, kotlin.jvm.internal.DefaultConstructorMarker r30) {
        /*
            r16 = this;
            r0 = r29
            r1 = r0 & 8
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r7 = r2
            goto L_0x000b
        L_0x0009:
            r7 = r20
        L_0x000b:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0011
            r9 = r2
            goto L_0x0013
        L_0x0011:
            r9 = r22
        L_0x0013:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0019
            r10 = r2
            goto L_0x001b
        L_0x0019:
            r10 = r23
        L_0x001b:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0021
            r11 = r2
            goto L_0x0023
        L_0x0021:
            r11 = r24
        L_0x0023:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0029
            r12 = r2
            goto L_0x002b
        L_0x0029:
            r12 = r25
        L_0x002b:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0031
            r13 = r2
            goto L_0x0033
        L_0x0031:
            r13 = r26
        L_0x0033:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x0039
            r14 = r2
            goto L_0x003b
        L_0x0039:
            r14 = r27
        L_0x003b:
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x0041
            r15 = r2
            goto L_0x0043
        L_0x0041:
            r15 = r28
        L_0x0043:
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r8 = r21
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sensorberg.notifications.sdk.internal.backend.backendsdkv2.model.ResolveAction.<init>(java.lang.String, int, int, java.lang.String, java.util.List, java.lang.Long, java.lang.Boolean, java.lang.Long, java.lang.Boolean, com.sensorberg.notifications.sdk.internal.backend.backendsdkv2.model.Content, java.util.List, java.lang.Long, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
