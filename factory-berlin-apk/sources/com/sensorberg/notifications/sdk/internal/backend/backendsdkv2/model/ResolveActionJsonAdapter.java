package com.sensorberg.notifications.sdk.internal.backend.backendsdkv2.model;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.g;
import com.squareup.moshi.l;
import com.squareup.moshi.n;
import com.squareup.moshi.p;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.i;
import kotlin.jvm.internal.k;

@i(bv = {1, 0, 3}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00108\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\"\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00160\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u001e\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0015R\u001e\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0015R$\u0010\u001d\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u00160\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0015R\u001e\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0015R\u001e\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010\u0015R\u0016\u0010\"\u001a\u00020!8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001c\u0010$\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0015¨\u0006)"}, d2 = {"Lcom/sensorberg/notifications/sdk/internal/backend/backendsdkv2/model/ResolveActionJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/squareup/moshi/JsonReader;", "reader", "Lcom/sensorberg/notifications/sdk/internal/backend/backendsdkv2/model/ResolveAction;", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lcom/sensorberg/notifications/sdk/internal/backend/backendsdkv2/model/ResolveAction;", "Lcom/squareup/moshi/JsonWriter;", "writer", "value", "", "toJson", "(Lcom/squareup/moshi/JsonWriter;Lcom/sensorberg/notifications/sdk/internal/backend/backendsdkv2/model/ResolveAction;)V", "", "toString", "()Ljava/lang/String;", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "", "intAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "listOfStringAdapter", "", "nullableBooleanAdapter", "Lcom/sensorberg/notifications/sdk/internal/backend/backendsdkv2/model/Content;", "nullableContentAdapter", "Lcom/sensorberg/notifications/sdk/internal/backend/backendsdkv2/model/Timeframe;", "nullableListOfTimeframeAdapter", "", "nullableLongAdapter", "nullableStringAdapter", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "stringAdapter", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "notifications_release"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
/* compiled from: ResolveActionJsonAdapter.kt */
public final class ResolveActionJsonAdapter extends JsonAdapter<ResolveAction> {
    private volatile Constructor<ResolveAction> constructorRef;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<List<String>> listOfStringAdapter;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<Content> nullableContentAdapter;
    private final JsonAdapter<List<Timeframe>> nullableListOfTimeframeAdapter;
    private final JsonAdapter<Long> nullableLongAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final g.b options;
    private final JsonAdapter<String> stringAdapter;

    public ResolveActionJsonAdapter(n nVar) {
        Class<String> cls = String.class;
        k.f(nVar, "moshi");
        g.b a = g.b.a("eid", "trigger", "type", "name", "beacons", "suppressionTime", "sendOnlyOnce", "delay", "reportImmediately", "content", "timeframes", "deliverAt");
        k.b(a, "JsonReader.Options.of(\"e…timeframes\", \"deliverAt\")");
        this.options = a;
        JsonAdapter<String> f2 = nVar.f(cls, i0.b(), "eid");
        k.b(f2, "moshi.adapter(String::cl… emptySet(),\n      \"eid\")");
        this.stringAdapter = f2;
        JsonAdapter<Integer> f3 = nVar.f(Integer.TYPE, i0.b(), "trigger");
        k.b(f3, "moshi.adapter(Int::class…a, emptySet(), \"trigger\")");
        this.intAdapter = f3;
        JsonAdapter<String> f4 = nVar.f(cls, i0.b(), "name");
        k.b(f4, "moshi.adapter(String::cl…      emptySet(), \"name\")");
        this.nullableStringAdapter = f4;
        JsonAdapter<List<String>> f5 = nVar.f(p.j(List.class, cls), i0.b(), "beacons");
        k.b(f5, "moshi.adapter(Types.newP…tySet(),\n      \"beacons\")");
        this.listOfStringAdapter = f5;
        JsonAdapter<Long> f6 = nVar.f(Long.class, i0.b(), "suppressionTime");
        k.b(f6, "moshi.adapter(Long::clas…Set(), \"suppressionTime\")");
        this.nullableLongAdapter = f6;
        JsonAdapter<Boolean> f7 = nVar.f(Boolean.class, i0.b(), "sendOnlyOnce");
        k.b(f7, "moshi.adapter(Boolean::c…ptySet(), \"sendOnlyOnce\")");
        this.nullableBooleanAdapter = f7;
        JsonAdapter<Content> f8 = nVar.f(Content.class, i0.b(), "content");
        k.b(f8, "moshi.adapter(Content::c…   emptySet(), \"content\")");
        this.nullableContentAdapter = f8;
        JsonAdapter<List<Timeframe>> f9 = nVar.f(p.j(List.class, Timeframe.class), i0.b(), "timeframes");
        k.b(f9, "moshi.adapter(Types.newP…et(),\n      \"timeframes\")");
        this.nullableListOfTimeframeAdapter = f9;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00f2, code lost:
        r6 = ((int) r12) & r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x014c, code lost:
        r12 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x014e, code lost:
        r15 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0150, code lost:
        r14 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0152, code lost:
        r13 = r22;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.sensorberg.notifications.sdk.internal.backend.backendsdkv2.model.ResolveAction b(com.squareup.moshi.g r40) {
        /*
            r39 = this;
            r0 = r39
            r1 = r40
            java.lang.Class<java.lang.Boolean> r2 = java.lang.Boolean.class
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            java.lang.Class<java.lang.Long> r4 = java.lang.Long.class
            java.lang.String r5 = "reader"
            kotlin.jvm.internal.k.f(r1, r5)
            r40.b()
            r6 = -1
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
        L_0x0022:
            boolean r19 = r40.hasNext()
            java.lang.String r5 = "beacons"
            r20 = r15
            java.lang.String r15 = "type"
            r21 = r14
            java.lang.String r14 = "trigger"
            r22 = r13
            java.lang.String r13 = "eid"
            if (r19 == 0) goto L_0x0156
            r19 = r12
            com.squareup.moshi.g$b r12 = r0.options
            int r12 = r1.K(r12)
            switch(r12) {
                case -1: goto L_0x0146;
                case 0: goto L_0x0130;
                case 1: goto L_0x0113;
                case 2: goto L_0x00f6;
                case 3: goto L_0x00e4;
                case 4: goto L_0x00ce;
                case 5: goto L_0x00bb;
                case 6: goto L_0x00a2;
                case 7: goto L_0x008b;
                case 8: goto L_0x0076;
                case 9: goto L_0x0065;
                case 10: goto L_0x0054;
                case 11: goto L_0x0043;
                default: goto L_0x0041;
            }
        L_0x0041:
            goto L_0x014c
        L_0x0043:
            com.squareup.moshi.JsonAdapter<java.lang.Long> r5 = r0.nullableLongAdapter
            java.lang.Object r5 = r5.b(r1)
            r18 = r5
            java.lang.Long r18 = (java.lang.Long) r18
            r12 = 4294965247(0xfffff7ff, double:2.1219947786E-314)
            goto L_0x00f2
        L_0x0054:
            com.squareup.moshi.JsonAdapter<java.util.List<com.sensorberg.notifications.sdk.internal.backend.backendsdkv2.model.Timeframe>> r5 = r0.nullableListOfTimeframeAdapter
            java.lang.Object r5 = r5.b(r1)
            r17 = r5
            java.util.List r17 = (java.util.List) r17
            r12 = 4294966271(0xfffffbff, double:2.1219952845E-314)
            goto L_0x00f2
        L_0x0065:
            com.squareup.moshi.JsonAdapter<com.sensorberg.notifications.sdk.internal.backend.backendsdkv2.model.Content> r5 = r0.nullableContentAdapter
            java.lang.Object r5 = r5.b(r1)
            r16 = r5
            com.sensorberg.notifications.sdk.internal.backend.backendsdkv2.model.Content r16 = (com.sensorberg.notifications.sdk.internal.backend.backendsdkv2.model.Content) r16
            r12 = 4294966783(0xfffffdff, double:2.1219955375E-314)
            goto L_0x00f2
        L_0x0076:
            com.squareup.moshi.JsonAdapter<java.lang.Boolean> r5 = r0.nullableBooleanAdapter
            java.lang.Object r5 = r5.b(r1)
            r15 = r5
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            r12 = 4294967039(0xfffffeff, double:2.121995664E-314)
            int r5 = (int) r12
            r5 = r5 & r6
            r6 = r5
            r12 = r19
            goto L_0x0150
        L_0x008b:
            com.squareup.moshi.JsonAdapter<java.lang.Long> r5 = r0.nullableLongAdapter
            java.lang.Object r5 = r5.b(r1)
            r14 = r5
            java.lang.Long r14 = (java.lang.Long) r14
            r12 = 4294967167(0xffffff7f, double:2.121995727E-314)
            int r5 = (int) r12
            r5 = r5 & r6
            r6 = r5
            r12 = r19
            r15 = r20
            goto L_0x0152
        L_0x00a2:
            com.squareup.moshi.JsonAdapter<java.lang.Boolean> r5 = r0.nullableBooleanAdapter
            java.lang.Object r5 = r5.b(r1)
            r13 = r5
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            r14 = 4294967231(0xffffffbf, double:2.121995759E-314)
            int r5 = (int) r14
            r5 = r5 & r6
            r6 = r5
            r12 = r19
            r15 = r20
            r14 = r21
            goto L_0x0022
        L_0x00bb:
            com.squareup.moshi.JsonAdapter<java.lang.Long> r5 = r0.nullableLongAdapter
            java.lang.Object r5 = r5.b(r1)
            r12 = r5
            java.lang.Long r12 = (java.lang.Long) r12
            r13 = 4294967263(0xffffffdf, double:2.1219957747E-314)
            int r5 = (int) r13
            r5 = r5 & r6
            r6 = r5
            goto L_0x014e
        L_0x00ce:
            com.squareup.moshi.JsonAdapter<java.util.List<java.lang.String>> r11 = r0.listOfStringAdapter
            java.lang.Object r11 = r11.b(r1)
            java.util.List r11 = (java.util.List) r11
            if (r11 == 0) goto L_0x00da
            goto L_0x014c
        L_0x00da:
            com.squareup.moshi.JsonDataException r1 = com.squareup.moshi.internal.a.u(r5, r5, r1)
            java.lang.String r2 = "Util.unexpectedNull(\"bea…       \"beacons\", reader)"
            kotlin.jvm.internal.k.b(r1, r2)
            throw r1
        L_0x00e4:
            com.squareup.moshi.JsonAdapter<java.lang.String> r5 = r0.nullableStringAdapter
            java.lang.Object r5 = r5.b(r1)
            r10 = r5
            java.lang.String r10 = (java.lang.String) r10
            r12 = 4294967287(0xfffffff7, double:2.1219957865E-314)
        L_0x00f2:
            int r5 = (int) r12
            r5 = r5 & r6
            r6 = r5
            goto L_0x014c
        L_0x00f6:
            com.squareup.moshi.JsonAdapter<java.lang.Integer> r5 = r0.intAdapter
            java.lang.Object r5 = r5.b(r1)
            java.lang.Integer r5 = (java.lang.Integer) r5
            if (r5 == 0) goto L_0x0109
            int r5 = r5.intValue()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r5)
            goto L_0x014c
        L_0x0109:
            com.squareup.moshi.JsonDataException r1 = com.squareup.moshi.internal.a.u(r15, r15, r1)
            java.lang.String r2 = "Util.unexpectedNull(\"type\", \"type\", reader)"
            kotlin.jvm.internal.k.b(r1, r2)
            throw r1
        L_0x0113:
            com.squareup.moshi.JsonAdapter<java.lang.Integer> r5 = r0.intAdapter
            java.lang.Object r5 = r5.b(r1)
            java.lang.Integer r5 = (java.lang.Integer) r5
            if (r5 == 0) goto L_0x0126
            int r5 = r5.intValue()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r5)
            goto L_0x014c
        L_0x0126:
            com.squareup.moshi.JsonDataException r1 = com.squareup.moshi.internal.a.u(r14, r14, r1)
            java.lang.String r2 = "Util.unexpectedNull(\"tri…       \"trigger\", reader)"
            kotlin.jvm.internal.k.b(r1, r2)
            throw r1
        L_0x0130:
            com.squareup.moshi.JsonAdapter<java.lang.String> r5 = r0.stringAdapter
            java.lang.Object r5 = r5.b(r1)
            r7 = r5
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto L_0x013c
            goto L_0x014c
        L_0x013c:
            com.squareup.moshi.JsonDataException r1 = com.squareup.moshi.internal.a.u(r13, r13, r1)
            java.lang.String r2 = "Util.unexpectedNull(\"eid\", \"eid\", reader)"
            kotlin.jvm.internal.k.b(r1, r2)
            throw r1
        L_0x0146:
            r40.Z()
            r40.skipValue()
        L_0x014c:
            r12 = r19
        L_0x014e:
            r15 = r20
        L_0x0150:
            r14 = r21
        L_0x0152:
            r13 = r22
            goto L_0x0022
        L_0x0156:
            r19 = r12
            r40.i()
            java.lang.reflect.Constructor<com.sensorberg.notifications.sdk.internal.backend.backendsdkv2.model.ResolveAction> r12 = r0.constructorRef
            r23 = 12
            r24 = 11
            r25 = 10
            r26 = 9
            r27 = 8
            r28 = 7
            r29 = 6
            r30 = 5
            r31 = 4
            r32 = 3
            r33 = 2
            r34 = 1
            r35 = 0
            r36 = r13
            r13 = 14
            if (r12 == 0) goto L_0x0180
            r37 = r14
            goto L_0x01b9
        L_0x0180:
            java.lang.Class<com.sensorberg.notifications.sdk.internal.backend.backendsdkv2.model.ResolveAction> r12 = com.sensorberg.notifications.sdk.internal.backend.backendsdkv2.model.ResolveAction.class
            r37 = r14
            java.lang.Class[] r14 = new java.lang.Class[r13]
            r14[r35] = r3
            java.lang.Class r38 = java.lang.Integer.TYPE
            r14[r34] = r38
            r14[r33] = r38
            r14[r32] = r3
            java.lang.Class<java.util.List> r3 = java.util.List.class
            r14[r31] = r3
            r14[r30] = r4
            r14[r29] = r2
            r14[r28] = r4
            r14[r27] = r2
            java.lang.Class<com.sensorberg.notifications.sdk.internal.backend.backendsdkv2.model.Content> r2 = com.sensorberg.notifications.sdk.internal.backend.backendsdkv2.model.Content.class
            r14[r26] = r2
            java.lang.Class<java.util.List> r2 = java.util.List.class
            r14[r25] = r2
            r14[r24] = r4
            r14[r23] = r38
            r2 = 13
            java.lang.Class<?> r3 = com.squareup.moshi.internal.a.c
            r14[r2] = r3
            java.lang.reflect.Constructor r12 = r12.getDeclaredConstructor(r14)
            r0.constructorRef = r12
            java.lang.String r2 = "ResolveAction::class.jav…his.constructorRef = it }"
            kotlin.jvm.internal.k.b(r12, r2)
        L_0x01b9:
            java.lang.Object[] r2 = new java.lang.Object[r13]
            if (r7 == 0) goto L_0x0212
            r2[r35] = r7
            if (r8 == 0) goto L_0x0206
            r2[r34] = r8
            if (r9 == 0) goto L_0x01fc
            r2[r33] = r9
            r2[r32] = r10
            if (r11 == 0) goto L_0x01f2
            r2[r31] = r11
            r2[r30] = r19
            r2[r29] = r22
            r2[r28] = r21
            r2[r27] = r20
            r2[r26] = r16
            r2[r25] = r17
            r2[r24] = r18
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            r2[r23] = r1
            r1 = 13
            r3 = 0
            r2[r1] = r3
            java.lang.Object r1 = r12.newInstance(r2)
            java.lang.String r2 = "localConstructor.newInst…mask0,\n        null\n    )"
            kotlin.jvm.internal.k.b(r1, r2)
            com.sensorberg.notifications.sdk.internal.backend.backendsdkv2.model.ResolveAction r1 = (com.sensorberg.notifications.sdk.internal.backend.backendsdkv2.model.ResolveAction) r1
            return r1
        L_0x01f2:
            com.squareup.moshi.JsonDataException r1 = com.squareup.moshi.internal.a.m(r5, r5, r1)
            java.lang.String r2 = "Util.missingProperty(\"beacons\", \"beacons\", reader)"
            kotlin.jvm.internal.k.b(r1, r2)
            throw r1
        L_0x01fc:
            com.squareup.moshi.JsonDataException r1 = com.squareup.moshi.internal.a.m(r15, r15, r1)
            java.lang.String r2 = "Util.missingProperty(\"type\", \"type\", reader)"
            kotlin.jvm.internal.k.b(r1, r2)
            throw r1
        L_0x0206:
            r2 = r37
            com.squareup.moshi.JsonDataException r1 = com.squareup.moshi.internal.a.m(r2, r2, r1)
            java.lang.String r2 = "Util.missingProperty(\"trigger\", \"trigger\", reader)"
            kotlin.jvm.internal.k.b(r1, r2)
            throw r1
        L_0x0212:
            r2 = r36
            com.squareup.moshi.JsonDataException r1 = com.squareup.moshi.internal.a.m(r2, r2, r1)
            java.lang.String r2 = "Util.missingProperty(\"eid\", \"eid\", reader)"
            kotlin.jvm.internal.k.b(r1, r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sensorberg.notifications.sdk.internal.backend.backendsdkv2.model.ResolveActionJsonAdapter.b(com.squareup.moshi.g):com.sensorberg.notifications.sdk.internal.backend.backendsdkv2.model.ResolveAction");
    }

    /* renamed from: j */
    public void h(l lVar, ResolveAction resolveAction) {
        k.f(lVar, "writer");
        if (resolveAction != null) {
            lVar.b();
            lVar.n("eid");
            this.stringAdapter.h(lVar, resolveAction.e());
            lVar.n("trigger");
            this.intAdapter.h(lVar, Integer.valueOf(resolveAction.k()));
            lVar.n("type");
            this.intAdapter.h(lVar, Integer.valueOf(resolveAction.m()));
            lVar.n("name");
            this.nullableStringAdapter.h(lVar, resolveAction.f());
            lVar.n("beacons");
            this.listOfStringAdapter.h(lVar, resolveAction.a());
            lVar.n("suppressionTime");
            this.nullableLongAdapter.h(lVar, resolveAction.i());
            lVar.n("sendOnlyOnce");
            this.nullableBooleanAdapter.h(lVar, resolveAction.h());
            lVar.n("delay");
            this.nullableLongAdapter.h(lVar, resolveAction.c());
            lVar.n("reportImmediately");
            this.nullableBooleanAdapter.h(lVar, resolveAction.g());
            lVar.n("content");
            this.nullableContentAdapter.h(lVar, resolveAction.b());
            lVar.n("timeframes");
            this.nullableListOfTimeframeAdapter.h(lVar, resolveAction.j());
            lVar.n("deliverAt");
            this.nullableLongAdapter.h(lVar, resolveAction.d());
            lVar.j();
            return;
        }
        throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(35);
        sb.append("GeneratedJsonAdapter(");
        sb.append("ResolveAction");
        sb.append(')');
        String sb2 = sb.toString();
        k.b(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }
}
