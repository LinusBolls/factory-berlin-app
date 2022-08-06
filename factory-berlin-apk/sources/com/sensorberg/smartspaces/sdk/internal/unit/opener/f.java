package com.sensorberg.smartspaces.sdk.internal.unit.opener;

import com.sensorberg.smartspaces.backend.model.Statistics;
import com.sensorberg.smartspaces.sdk.internal.o.a.c;
import kotlin.jvm.internal.k;
import n.a.a;

/* compiled from: ChannelStats.kt */
public final class f {
    private final long a = Statistics.Companion.now();
    private long b;
    private long c;

    /* renamed from: d  reason: collision with root package name */
    private long f6747d;

    /* renamed from: e  reason: collision with root package name */
    private long f6748e;

    /* renamed from: f  reason: collision with root package name */
    private int f6749f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f6750g;

    /* renamed from: h  reason: collision with root package name */
    private long f6751h = -1;

    /* renamed from: i  reason: collision with root package name */
    private final String f6752i;

    public f(String str) {
        k.e(str, "channel");
        this.f6752i = str;
    }

    public final void a(Statistics statistics) {
        k.e(statistics, "statistics");
        if (this.f6750g) {
            statistics.fillChannelTimes(this.f6752i, this.a, this.c, this.f6747d, this.f6748e, this.f6749f);
            statistics.validateStatistics(this.b);
            return;
        }
        throw new IllegalStateException("ChannelStats not finished, have you called markStopTimeNow?");
    }

    public final void b() {
        if (!this.f6750g) {
            this.c = Statistics.Companion.now() - this.a;
            return;
        }
        throw new IllegalStateException("ChannelStats already finished");
    }

    public final void c() {
        if (!this.f6750g) {
            long now = Statistics.Companion.now();
            this.b = now;
            long j2 = ((now - this.a) - this.c) - this.f6747d;
            this.f6748e = j2;
            if (j2 < 0) {
                if (this.f6751h > 0) {
                    a.d(new IllegalStateException("Statistics time sum doesn't match, check if timeConnecting/timeWriting are valid. channelStartTimestamp=" + this.a + "; channelStopTimestamp=" + this.b));
                    this.f6748e = this.f6751h;
                } else {
                    throw new IllegalStateException("Statistics time sum doesn't match, check if timeConnecting/timeWriting are valid. channelStartTimestamp=" + this.a + "; channelStopTimestamp=" + this.b);
                }
            }
            this.f6750g = true;
            return;
        }
        throw new IllegalStateException("ChannelStats already finished");
    }

    public final void d(c.C0384c cVar) {
        k.e(cVar, "gattStats");
        if (!this.f6750g) {
            long j2 = cVar.a - this.a;
            long j3 = cVar.f6422f;
            this.c = j2 + j3;
            long j4 = cVar.f6425i;
            if (j4 <= 0) {
                j4 = Statistics.Companion.now() - this.a;
                j3 = this.c;
            }
            this.f6747d = j4 - j3;
            this.f6749f = cVar.c;
            this.f6751h = cVar.f6426j - cVar.f6425i;
            c();
            return;
        }
        throw new IllegalStateException("ChannelStats already finished");
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof f) && k.a(this.f6752i, ((f) obj).f6752i);
        }
        return true;
    }

    public int hashCode() {
        String str = this.f6752i;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "ChannelStats(channel=" + this.f6752i + ")";
    }
}
