package com.google.android.gms.gcm;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.gcm.Task;

public class OneoffTask extends Task {
    public static final Parcelable.Creator<OneoffTask> CREATOR = new h();
    private final long p;
    private final long q;

    public static class a extends Task.a {
        /* access modifiers changed from: private */

        /* renamed from: j  reason: collision with root package name */
        public long f2189j = -1;
        /* access modifiers changed from: private */

        /* renamed from: k  reason: collision with root package name */
        public long f2190k = -1;

        public a() {
            this.f2201e = false;
        }

        /* access modifiers changed from: protected */
        public void a() {
            super.a();
            long j2 = this.f2189j;
            if (j2 != -1) {
                long j3 = this.f2190k;
                if (j3 != -1) {
                    if (j2 >= j3) {
                        throw new IllegalArgumentException("Window start must be shorter than window end.");
                    }
                    return;
                }
            }
            throw new IllegalArgumentException("Must specify an execution window using setExecutionWindow.");
        }

        public /* bridge */ /* synthetic */ Task.a b(int i2) {
            g(i2);
            return this;
        }

        public /* bridge */ /* synthetic */ Task.a c(boolean z) {
            h(z);
            return this;
        }

        public OneoffTask d() {
            a();
            return new OneoffTask(this, (h) null);
        }

        public a e(long j2, long j3) {
            this.f2189j = j2;
            this.f2190k = j3;
            return this;
        }

        public a f(boolean z) {
            this.f2201e = z;
            return this;
        }

        public a g(int i2) {
            this.a = i2;
            return this;
        }

        public a h(boolean z) {
            this.f2202f = z;
            return this;
        }

        public a i(Class<? extends b> cls) {
            this.b = cls.getName();
            return this;
        }

        public a j(String str) {
            this.c = str;
            return this;
        }

        public a k(boolean z) {
            this.f2200d = z;
            return this;
        }
    }

    private OneoffTask(a aVar) {
        super((Task.a) aVar);
        this.p = aVar.f2189j;
        this.q = aVar.f2190k;
    }

    public void c(Bundle bundle) {
        super.c(bundle);
        bundle.putLong("window_start", this.p);
        bundle.putLong("window_end", this.q);
    }

    public long g() {
        return this.q;
    }

    public long h() {
        return this.p;
    }

    public String toString() {
        String obj = super.toString();
        long h2 = h();
        long g2 = g();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 64);
        sb.append(obj);
        sb.append(" windowStart=");
        sb.append(h2);
        sb.append(" windowEnd=");
        sb.append(g2);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeLong(this.p);
        parcel.writeLong(this.q);
    }

    @Deprecated
    private OneoffTask(Parcel parcel) {
        super(parcel);
        this.p = parcel.readLong();
        this.q = parcel.readLong();
    }

    /* synthetic */ OneoffTask(Parcel parcel, h hVar) {
        this(parcel);
    }

    /* synthetic */ OneoffTask(a aVar, h hVar) {
        this(aVar);
    }
}
