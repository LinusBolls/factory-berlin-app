package com.google.android.gms.nearby.messages;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.nearby.messages.internal.e;
import g.b.a.b.c.f.b1;
import g.b.a.b.c.f.g1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

public class d extends com.google.android.gms.common.internal.safeparcel.a {
    public static final Parcelable.Creator<d> CREATOR = new m();

    /* renamed from: m  reason: collision with root package name */
    public static final d f3248m;

    /* renamed from: g  reason: collision with root package name */
    private final int f3249g;

    /* renamed from: h  reason: collision with root package name */
    private final List<e> f3250h;

    /* renamed from: i  reason: collision with root package name */
    private final List<g1> f3251i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f3252j;

    /* renamed from: k  reason: collision with root package name */
    private final List<b1> f3253k;

    /* renamed from: l  reason: collision with root package name */
    private final int f3254l;

    public static final class a {
        private final Set<e> a = new HashSet();
        private final List<g1> b = new ArrayList();
        private final Set<b1> c = new HashSet();

        /* renamed from: d  reason: collision with root package name */
        private boolean f3255d;

        /* renamed from: e  reason: collision with root package name */
        private int f3256e = 0;

        private final a d(String str, String str2) {
            this.a.add(new e(str, str2));
            return this;
        }

        public final d a() {
            r.o(this.f3255d || !this.a.isEmpty(), "At least one of the include methods must be called.");
            return new d((List) new ArrayList(this.a), (List) this.b, this.f3255d, (List) new ArrayList(this.c), this.f3256e);
        }

        public final a b() {
            this.f3255d = true;
            return this;
        }

        public final a c(UUID uuid, Short sh, Short sh2) {
            d("__reserved_namespace", "__i_beacon_id");
            this.b.add(g1.l(uuid, sh, sh2));
            return this;
        }
    }

    static {
        a aVar = new a();
        aVar.b();
        f3248m = aVar.a();
    }

    d(int i2, List<e> list, List<g1> list2, boolean z, List<b1> list3, int i3) {
        this.f3249g = i2;
        r.k(list);
        this.f3250h = Collections.unmodifiableList(list);
        this.f3252j = z;
        this.f3251i = Collections.unmodifiableList(list2 == null ? Collections.emptyList() : list2);
        this.f3253k = Collections.unmodifiableList(list3 == null ? Collections.emptyList() : list3);
        this.f3254l = i3;
    }

    private d(List<e> list, List<g1> list2, boolean z, List<b1> list3, int i2) {
        this(2, list, list2, z, list3, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f3252j == dVar.f3252j && p.a(this.f3250h, dVar.f3250h) && p.a(this.f3251i, dVar.f3251i) && p.a(this.f3253k, dVar.f3253k);
    }

    public int hashCode() {
        return p.b(this.f3250h, this.f3251i, Boolean.valueOf(this.f3252j), this.f3253k);
    }

    public String toString() {
        boolean z = this.f3252j;
        String valueOf = String.valueOf(this.f3250h);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 53);
        sb.append("MessageFilter{includeAllMyTypes=");
        sb.append(z);
        sb.append(", messageTypes=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a2 = b.a(parcel);
        b.t(parcel, 1, this.f3250h, false);
        b.t(parcel, 2, this.f3251i, false);
        b.c(parcel, 3, this.f3252j);
        b.t(parcel, 4, this.f3253k, false);
        b.l(parcel, 5, this.f3254l);
        b.l(parcel, 1000, this.f3249g);
        b.b(parcel, a2);
    }
}
