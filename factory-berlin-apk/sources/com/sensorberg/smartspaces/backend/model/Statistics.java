package com.sensorberg.smartspaces.backend.model;

import android.os.SystemClock;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.jasminb.jsonapi.p.a;
import com.github.jasminb.jsonapi.p.g;
import kotlin.i;
import kotlin.jvm.internal.k;

@i(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b4\b\b\u0018\u0000 Z:\u0001ZB!\b\u0017\u0012\u0006\u0010\u0014\u001a\u00020\u0001\u0012\u0006\u0010\u0015\u001a\u00020\u0001\u0012\u0006\u0010F\u001a\u00020\r¢\u0006\u0004\bW\u0010XBw\b\u0007\u0012\b\b\u0001\u0010\u0014\u001a\u00020\u0001\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u0001\u0012\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u0001\u0012\b\b\u0003\u0010\u0018\u001a\u00020\n\u0012\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\r\u0012\b\b\u0003\u0010\u001a\u001a\u00020\r\u0012\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\r\u0012\b\b\u0003\u0010\u001c\u001a\u00020\r\u0012\n\b\u0003\u0010\u001d\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\bW\u0010YJ\u0010\u0010\u0002\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0007\u0010\u0003J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\b\u0010\u0003J\u0012\u0010\t\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\t\u0010\u0003J\u0010\u0010\u000b\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000fJ\u0010\u0010\u0013\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0011J~\u0010\u001e\u001a\u00020\u00002\b\b\u0003\u0010\u0014\u001a\u00020\u00012\b\b\u0003\u0010\u0015\u001a\u00020\u00012\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u00012\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u00012\b\b\u0003\u0010\u0018\u001a\u00020\n2\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\r2\b\b\u0003\u0010\u001a\u001a\u00020\r2\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\r2\b\b\u0003\u0010\u001c\u001a\u00020\r2\n\b\u0003\u0010\u001d\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$J=\u0010(\u001a\u00020'2\u0006\u0010%\u001a\u00020\u00012\u0006\u0010&\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\n¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b*\u0010\fJ\u0015\u0010+\u001a\u00020'2\u0006\u0010\u0017\u001a\u00020\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0001HÖ\u0001¢\u0006\u0004\b-\u0010\u0003J\u0015\u0010/\u001a\u00020'2\u0006\u0010.\u001a\u00020\r¢\u0006\u0004\b/\u00100R$\u0010\u0016\u001a\u0004\u0018\u00010\u00018\u0007@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0016\u00101\u001a\u0004\b2\u0010\u0003\"\u0004\b3\u0010,R\"\u00104\u001a\u00020\"8G@\u0006X\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R$\u0010:\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b:\u00101\u001a\u0004\b;\u0010\u0003\"\u0004\b<\u0010,R$\u0010\u001d\u001a\u0004\u0018\u00010\u00048\u0007@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010=\u001a\u0004\b>\u0010\u0006\"\u0004\b?\u0010@R\u001c\u0010\u0014\u001a\u00020\u00018\u0007@\u0007X\u0004¢\u0006\f\n\u0004\b\u0014\u00101\u001a\u0004\bA\u0010\u0003R\"\u0010\u0018\u001a\u00020\n8\u0007@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010B\u001a\u0004\bC\u0010\f\"\u0004\bD\u0010ER\"\u0010F\u001a\u00020\r8G@\u0006X\u000e¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010\u0011\"\u0004\bI\u00100R\"\u0010\u001a\u001a\u00020\r8\u0007@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010G\u001a\u0004\bJ\u0010\u0011\"\u0004\bK\u00100R$\u0010\u0019\u001a\u0004\u0018\u00010\r8\u0007@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010L\u001a\u0004\bM\u0010\u000f\"\u0004\bN\u0010OR\"\u0010\u001c\u001a\u00020\r8\u0007@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010G\u001a\u0004\bP\u0010\u0011\"\u0004\bQ\u00100R$\u0010\u001b\u001a\u0004\u0018\u00010\r8\u0007@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010L\u001a\u0004\bR\u0010\u000f\"\u0004\bS\u0010OR$\u0010\u0017\u001a\u0004\u0018\u00010\u00018\u0007@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0017\u00101\u001a\u0004\bT\u0010\u0003\"\u0004\bU\u0010,R\u0019\u0010\u0015\u001a\u00020\u00018\u0007@\u0006¢\u0006\f\n\u0004\b\u0015\u00101\u001a\u0004\bV\u0010\u0003¨\u0006["}, d2 = {"Lcom/sensorberg/smartspaces/backend/model/Statistics;", "", "component1", "()Ljava/lang/String;", "Lcom/sensorberg/smartspaces/backend/model/PlatformDetails;", "component10", "()Lcom/sensorberg/smartspaces/backend/model/PlatformDetails;", "component2", "component3", "component4", "", "component5", "()I", "", "component6", "()Ljava/lang/Long;", "component7", "()J", "component8", "component9", "requestId", "triggerStart", "connectionType", "triggerFound", "retryNumber", "timeSearching", "timeConnecting", "timeWriting", "timeWaiting", "platformDetails", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Long;JLjava/lang/Long;JLcom/sensorberg/smartspaces/backend/model/PlatformDetails;)Lcom/sensorberg/smartspaces/backend/model/Statistics;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "channel", "channelStartTimestamp", "", "fillChannelTimes", "(Ljava/lang/String;JJJJI)V", "hashCode", "markSearchEnd", "(Ljava/lang/String;)V", "toString", "finishedTimestamp", "validateStatistics", "(J)V", "Ljava/lang/String;", "getConnectionType", "setConnectionType", "finished", "Z", "getFinished", "()Z", "setFinished", "(Z)V", "id", "getId", "setId", "Lcom/sensorberg/smartspaces/backend/model/PlatformDetails;", "getPlatformDetails", "setPlatformDetails", "(Lcom/sensorberg/smartspaces/backend/model/PlatformDetails;)V", "getRequestId", "I", "getRetryNumber", "setRetryNumber", "(I)V", "started", "J", "getStarted", "setStarted", "getTimeConnecting", "setTimeConnecting", "Ljava/lang/Long;", "getTimeSearching", "setTimeSearching", "(Ljava/lang/Long;)V", "getTimeWaiting", "setTimeWaiting", "getTimeWriting", "setTimeWriting", "getTriggerFound", "setTriggerFound", "getTriggerStart", "<init>", "(Ljava/lang/String;Ljava/lang/String;J)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Long;JLjava/lang/Long;JLcom/sensorberg/smartspaces/backend/model/PlatformDetails;)V", "Companion", "backend_release"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
@g("user-device-statistics")
/* compiled from: Statistics.kt */
public final class Statistics {
    public static final String CHANNEL_BTLE = "ble";
    public static final String CHANNEL_IP = "ip";
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String TRIGGER_BLUETOOTH = "ble";
    public static final String TRIGGER_MAGNETO = "magneto";
    public static final String TRIGGER_MANUAL_PICK = "manual-pick";
    public static final String TRIGGER_NFC = "nfc";
    private String connectionType;
    private boolean finished;
    @a
    private String id;
    private PlatformDetails platformDetails;
    private final String requestId;
    private int retryNumber;
    private long started;
    private long timeConnecting;
    private Long timeSearching;
    private long timeWaiting;
    private Long timeWriting;
    private String triggerFound;
    private final String triggerStart;

    @i(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0003\u0018\u0000B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0005\u001a\u00020\u00048\u0006@\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0007\u001a\u00020\u00048\u0006@\u0006XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0016\u0010\b\u001a\u00020\u00048\u0006@\u0006XT¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0016\u0010\t\u001a\u00020\u00048\u0006@\u0006XT¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0016\u0010\n\u001a\u00020\u00048\u0006@\u0006XT¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0016\u0010\u000b\u001a\u00020\u00048\u0006@\u0006XT¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006¨\u0006\u000e"}, d2 = {"Lcom/sensorberg/smartspaces/backend/model/Statistics$Companion;", "", "now", "()J", "", "CHANNEL_BTLE", "Ljava/lang/String;", "CHANNEL_IP", "TRIGGER_BLUETOOTH", "TRIGGER_MAGNETO", "TRIGGER_MANUAL_PICK", "TRIGGER_NFC", "<init>", "()V", "backend_release"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
    /* compiled from: Statistics.kt */
    public static final class Companion {
        private Companion() {
        }

        public final long now() {
            return SystemClock.elapsedRealtime();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @JsonCreator
    public Statistics(@JsonProperty("unique-request-id") String str, @JsonProperty("trigger-start") String str2, @JsonProperty("connection-type") String str3, @JsonProperty("trigger-found") String str4, @JsonProperty("retry-number") int i2, @JsonProperty("searching-time-in-ms") Long l2, @JsonProperty("connecting-time-in-ms") long j2, @JsonProperty("writing-time-in-ms") Long l3, @JsonProperty("waiting-time-in-ms") long j3, @JsonProperty("platform-details") PlatformDetails platformDetails2) {
        k.e(str, "requestId");
        k.e(str2, "triggerStart");
        this.requestId = str;
        this.triggerStart = str2;
        this.connectionType = str3;
        this.triggerFound = str4;
        this.retryNumber = i2;
        this.timeSearching = l2;
        this.timeConnecting = j2;
        this.timeWriting = l3;
        this.timeWaiting = j3;
        this.platformDetails = platformDetails2;
    }

    public static /* synthetic */ Statistics copy$default(Statistics statistics, String str, String str2, String str3, String str4, int i2, Long l2, long j2, Long l3, long j3, PlatformDetails platformDetails2, int i3, Object obj) {
        Statistics statistics2 = statistics;
        int i4 = i3;
        return statistics.copy((i4 & 1) != 0 ? statistics2.requestId : str, (i4 & 2) != 0 ? statistics2.triggerStart : str2, (i4 & 4) != 0 ? statistics2.connectionType : str3, (i4 & 8) != 0 ? statistics2.triggerFound : str4, (i4 & 16) != 0 ? statistics2.retryNumber : i2, (i4 & 32) != 0 ? statistics2.timeSearching : l2, (i4 & 64) != 0 ? statistics2.timeConnecting : j2, (i4 & 128) != 0 ? statistics2.timeWriting : l3, (i4 & 256) != 0 ? statistics2.timeWaiting : j3, (i4 & 512) != 0 ? statistics2.platformDetails : platformDetails2);
    }

    public final String component1() {
        return this.requestId;
    }

    public final PlatformDetails component10() {
        return this.platformDetails;
    }

    public final String component2() {
        return this.triggerStart;
    }

    public final String component3() {
        return this.connectionType;
    }

    public final String component4() {
        return this.triggerFound;
    }

    public final int component5() {
        return this.retryNumber;
    }

    public final Long component6() {
        return this.timeSearching;
    }

    public final long component7() {
        return this.timeConnecting;
    }

    public final Long component8() {
        return this.timeWriting;
    }

    public final long component9() {
        return this.timeWaiting;
    }

    public final Statistics copy(@JsonProperty("unique-request-id") String str, @JsonProperty("trigger-start") String str2, @JsonProperty("connection-type") String str3, @JsonProperty("trigger-found") String str4, @JsonProperty("retry-number") int i2, @JsonProperty("searching-time-in-ms") Long l2, @JsonProperty("connecting-time-in-ms") long j2, @JsonProperty("writing-time-in-ms") Long l3, @JsonProperty("waiting-time-in-ms") long j3, @JsonProperty("platform-details") PlatformDetails platformDetails2) {
        k.e(str, "requestId");
        String str5 = str2;
        k.e(str5, "triggerStart");
        return new Statistics(str, str5, str3, str4, i2, l2, j2, l3, j3, platformDetails2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Statistics)) {
            return false;
        }
        Statistics statistics = (Statistics) obj;
        return k.a(this.requestId, statistics.requestId) && k.a(this.triggerStart, statistics.triggerStart) && k.a(this.connectionType, statistics.connectionType) && k.a(this.triggerFound, statistics.triggerFound) && this.retryNumber == statistics.retryNumber && k.a(this.timeSearching, statistics.timeSearching) && this.timeConnecting == statistics.timeConnecting && k.a(this.timeWriting, statistics.timeWriting) && this.timeWaiting == statistics.timeWaiting && k.a(this.platformDetails, statistics.platformDetails);
    }

    public final void fillChannelTimes(String str, long j2, long j3, long j4, long j5, int i2) {
        k.e(str, "channel");
        this.timeSearching = Long.valueOf(j2 - this.started);
        this.timeConnecting = j3;
        this.timeWriting = Long.valueOf(j4);
        this.timeWaiting = j5;
        this.retryNumber = i2;
        this.connectionType = str;
        this.finished = true;
    }

    @JsonProperty("connection-type")
    public final String getConnectionType() {
        return this.connectionType;
    }

    @JsonIgnore
    public final boolean getFinished() {
        return this.finished;
    }

    public final String getId() {
        return this.id;
    }

    @JsonProperty("platform-details")
    public final PlatformDetails getPlatformDetails() {
        return this.platformDetails;
    }

    @JsonProperty("unique-request-id")
    public final String getRequestId() {
        return this.requestId;
    }

    @JsonProperty("retry-number")
    public final int getRetryNumber() {
        return this.retryNumber;
    }

    @JsonIgnore
    public final long getStarted() {
        return this.started;
    }

    @JsonProperty("connecting-time-in-ms")
    public final long getTimeConnecting() {
        return this.timeConnecting;
    }

    @JsonProperty("searching-time-in-ms")
    public final Long getTimeSearching() {
        return this.timeSearching;
    }

    @JsonProperty("waiting-time-in-ms")
    public final long getTimeWaiting() {
        return this.timeWaiting;
    }

    @JsonProperty("writing-time-in-ms")
    public final Long getTimeWriting() {
        return this.timeWriting;
    }

    @JsonProperty("trigger-found")
    public final String getTriggerFound() {
        return this.triggerFound;
    }

    @JsonProperty("trigger-start")
    public final String getTriggerStart() {
        return this.triggerStart;
    }

    public int hashCode() {
        String str = this.requestId;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.triggerStart;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.connectionType;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.triggerFound;
        int hashCode4 = (((hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.retryNumber) * 31;
        Long l2 = this.timeSearching;
        int hashCode5 = (((hashCode4 + (l2 != null ? l2.hashCode() : 0)) * 31) + c.a(this.timeConnecting)) * 31;
        Long l3 = this.timeWriting;
        int hashCode6 = (((hashCode5 + (l3 != null ? l3.hashCode() : 0)) * 31) + c.a(this.timeWaiting)) * 31;
        PlatformDetails platformDetails2 = this.platformDetails;
        if (platformDetails2 != null) {
            i2 = platformDetails2.hashCode();
        }
        return hashCode6 + i2;
    }

    public final void markSearchEnd(String str) {
        k.e(str, "triggerFound");
        this.timeSearching = Long.valueOf(Companion.now() - this.started);
        if (k.a(this.triggerStart, TRIGGER_MAGNETO)) {
            this.triggerFound = str;
        }
    }

    public final void setConnectionType(String str) {
        this.connectionType = str;
    }

    public final void setFinished(boolean z) {
        this.finished = z;
    }

    public final void setId(String str) {
        this.id = str;
    }

    public final void setPlatformDetails(PlatformDetails platformDetails2) {
        this.platformDetails = platformDetails2;
    }

    public final void setRetryNumber(int i2) {
        this.retryNumber = i2;
    }

    public final void setStarted(long j2) {
        this.started = j2;
    }

    public final void setTimeConnecting(long j2) {
        this.timeConnecting = j2;
    }

    public final void setTimeSearching(Long l2) {
        this.timeSearching = l2;
    }

    public final void setTimeWaiting(long j2) {
        this.timeWaiting = j2;
    }

    public final void setTimeWriting(Long l2) {
        this.timeWriting = l2;
    }

    public final void setTriggerFound(String str) {
        this.triggerFound = str;
    }

    public String toString() {
        return "Statistics(requestId=" + this.requestId + ", triggerStart=" + this.triggerStart + ", connectionType=" + this.connectionType + ", triggerFound=" + this.triggerFound + ", retryNumber=" + this.retryNumber + ", timeSearching=" + this.timeSearching + ", timeConnecting=" + this.timeConnecting + ", timeWriting=" + this.timeWriting + ", timeWaiting=" + this.timeWaiting + ", platformDetails=" + this.platformDetails + ")";
    }

    public final void validateStatistics(long j2) {
        long j3 = j2 - this.started;
        Long l2 = this.timeSearching;
        long longValue = (l2 != null ? l2.longValue() : 0) + this.timeConnecting;
        Long l3 = this.timeWriting;
        long longValue2 = longValue + (l3 != null ? l3.longValue() : 0) + this.timeWaiting;
        long j4 = j3 - longValue2;
        if (j4 != 0) {
            n.a.a.k("Statistics check failed: Realtime: " + j3 + " Summary: " + longValue2 + " Diff: " + j4, new Object[0]);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ Statistics(java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, int r21, java.lang.Long r22, long r23, java.lang.Long r25, long r26, com.sensorberg.smartspaces.backend.model.PlatformDetails r28, int r29, kotlin.jvm.internal.DefaultConstructorMarker r30) {
        /*
            r16 = this;
            r0 = r29
            r1 = r0 & 4
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r6 = r2
            goto L_0x000b
        L_0x0009:
            r6 = r19
        L_0x000b:
            r1 = r0 & 8
            if (r1 == 0) goto L_0x0011
            r7 = r2
            goto L_0x0013
        L_0x0011:
            r7 = r20
        L_0x0013:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x001a
            r1 = 0
            r8 = 0
            goto L_0x001c
        L_0x001a:
            r8 = r21
        L_0x001c:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0022
            r9 = r2
            goto L_0x0024
        L_0x0022:
            r9 = r22
        L_0x0024:
            r1 = r0 & 64
            r3 = 0
            if (r1 == 0) goto L_0x002c
            r10 = r3
            goto L_0x002e
        L_0x002c:
            r10 = r23
        L_0x002e:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0034
            r12 = r2
            goto L_0x0036
        L_0x0034:
            r12 = r25
        L_0x0036:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x003c
            r13 = r3
            goto L_0x003e
        L_0x003c:
            r13 = r26
        L_0x003e:
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0044
            r15 = r2
            goto L_0x0046
        L_0x0044:
            r15 = r28
        L_0x0046:
            r3 = r16
            r4 = r17
            r5 = r18
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r12, r13, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sensorberg.smartspaces.backend.model.Statistics.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.Long, long, java.lang.Long, long, com.sensorberg.smartspaces.backend.model.PlatformDetails, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Statistics(java.lang.String r17, java.lang.String r18, long r19) {
        /*
            r16 = this;
            java.lang.String r0 = "requestId"
            r2 = r17
            kotlin.jvm.internal.k.e(r2, r0)
            java.lang.String r0 = "triggerStart"
            r3 = r18
            kotlin.jvm.internal.k.e(r3, r0)
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r10 = 0
            r11 = 0
            r13 = 0
            r14 = 1020(0x3fc, float:1.43E-42)
            r15 = 0
            r1 = r16
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r10, r11, r13, r14, r15)
            r0 = r16
            r1 = r19
            r0.started = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sensorberg.smartspaces.backend.model.Statistics.<init>(java.lang.String, java.lang.String, long):void");
    }
}
