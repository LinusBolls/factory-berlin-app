package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.safeparcel.b;
import g.b.a.b.c.e.a0;
import java.util.ArrayList;
import java.util.List;

public class g extends com.google.android.gms.common.internal.safeparcel.a {
    public static final Parcelable.Creator<g> CREATOR = new w();

    /* renamed from: g  reason: collision with root package name */
    private final List<a0> f2684g;

    /* renamed from: h  reason: collision with root package name */
    private final int f2685h;

    /* renamed from: i  reason: collision with root package name */
    private final String f2686i;

    public static final class a {
        private final List<a0> a = new ArrayList();
        private int b = 5;
        private String c = "";

        public final a a(b bVar) {
            r.l(bVar, "geofence can't be null.");
            r.b(bVar instanceof a0, "Geofence must be created using Geofence.Builder.");
            this.a.add((a0) bVar);
            return this;
        }

        public final a b(List<b> list) {
            if (list != null && !list.isEmpty()) {
                for (b next : list) {
                    if (next != null) {
                        a(next);
                    }
                }
            }
            return this;
        }

        public final g c() {
            r.b(!this.a.isEmpty(), "No geofence has been added to this request.");
            return new g(this.a, this.b, this.c);
        }

        public final a d(int i2) {
            this.b = i2 & 7;
            return this;
        }
    }

    g(List<a0> list, int i2, String str) {
        this.f2684g = list;
        this.f2685h = i2;
        this.f2686i = str;
    }

    public int l() {
        return this.f2685h;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("GeofencingRequest[");
        sb.append("geofences=");
        sb.append(this.f2684g);
        int i2 = this.f2685h;
        StringBuilder sb2 = new StringBuilder(30);
        sb2.append(", initialTrigger=");
        sb2.append(i2);
        sb2.append(", ");
        sb.append(sb2.toString());
        String valueOf = String.valueOf(this.f2686i);
        sb.append(valueOf.length() != 0 ? "tag=".concat(valueOf) : new String("tag="));
        sb.append("]");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a2 = b.a(parcel);
        b.t(parcel, 1, this.f2684g, false);
        b.l(parcel, 2, l());
        b.q(parcel, 3, this.f2686i, false);
        b.b(parcel, a2);
    }
}
