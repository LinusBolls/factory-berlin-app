package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.nearby.messages.Message;
import e.e.b;
import g.b.a.b.c.f.d1;
import g.b.a.b.c.f.e1;
import java.util.Arrays;

public class Update extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<Update> CREATOR = new a0();

    /* renamed from: g  reason: collision with root package name */
    private final int f3280g;

    /* renamed from: h  reason: collision with root package name */
    private final int f3281h;

    /* renamed from: i  reason: collision with root package name */
    public final Message f3282i;

    /* renamed from: j  reason: collision with root package name */
    public final c0 f3283j;

    /* renamed from: k  reason: collision with root package name */
    public final a f3284k;

    /* renamed from: l  reason: collision with root package name */
    public final e1 f3285l;

    /* renamed from: m  reason: collision with root package name */
    private final byte[] f3286m;

    Update(int i2, int i3, Message message, c0 c0Var, a aVar, e1 e1Var, byte[] bArr) {
        this.f3280g = i2;
        if (l(i3, 2)) {
            c0Var = null;
            aVar = null;
            e1Var = null;
            bArr = null;
            i3 = 2;
        }
        this.f3281h = i3;
        this.f3282i = message;
        this.f3283j = c0Var;
        this.f3284k = aVar;
        this.f3285l = e1Var;
        this.f3286m = bArr;
    }

    private static boolean l(int i2, int i3) {
        return (i2 & i3) != 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Update)) {
            return false;
        }
        Update update = (Update) obj;
        return this.f3281h == update.f3281h && p.a(this.f3282i, update.f3282i) && p.a(this.f3283j, update.f3283j) && p.a(this.f3284k, update.f3284k) && p.a(this.f3285l, update.f3285l) && Arrays.equals(this.f3286m, update.f3286m);
    }

    public int hashCode() {
        return p.b(Integer.valueOf(this.f3281h), this.f3282i, this.f3283j, this.f3284k, this.f3285l, this.f3286m);
    }

    public final boolean n(int i2) {
        return l(this.f3281h, i2);
    }

    public String toString() {
        b bVar = new b();
        if (n(1)) {
            bVar.add("FOUND");
        }
        if (n(2)) {
            bVar.add("LOST");
        }
        if (n(4)) {
            bVar.add("DISTANCE");
        }
        if (n(8)) {
            bVar.add("BLE_SIGNAL");
        }
        if (n(16)) {
            bVar.add("DEVICE");
        }
        if (n(32)) {
            bVar.add("BLE_RECORD");
        }
        String valueOf = String.valueOf(bVar);
        String valueOf2 = String.valueOf(this.f3282i);
        String valueOf3 = String.valueOf(this.f3283j);
        String valueOf4 = String.valueOf(this.f3284k);
        String valueOf5 = String.valueOf(this.f3285l);
        String valueOf6 = String.valueOf(d1.c(this.f3286m));
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 68 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length() + String.valueOf(valueOf6).length());
        sb.append("Update{types=");
        sb.append(valueOf);
        sb.append(", message=");
        sb.append(valueOf2);
        sb.append(", distance=");
        sb.append(valueOf3);
        sb.append(", bleSignal=");
        sb.append(valueOf4);
        sb.append(", device=");
        sb.append(valueOf5);
        sb.append(", bleRecord=");
        sb.append(valueOf6);
        sb.append("}");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a = com.google.android.gms.common.internal.safeparcel.b.a(parcel);
        com.google.android.gms.common.internal.safeparcel.b.l(parcel, 1, this.f3280g);
        com.google.android.gms.common.internal.safeparcel.b.l(parcel, 2, this.f3281h);
        com.google.android.gms.common.internal.safeparcel.b.o(parcel, 3, this.f3282i, i2, false);
        com.google.android.gms.common.internal.safeparcel.b.o(parcel, 4, this.f3283j, i2, false);
        com.google.android.gms.common.internal.safeparcel.b.o(parcel, 5, this.f3284k, i2, false);
        com.google.android.gms.common.internal.safeparcel.b.o(parcel, 6, this.f3285l, i2, false);
        com.google.android.gms.common.internal.safeparcel.b.f(parcel, 7, this.f3286m, false);
        com.google.android.gms.common.internal.safeparcel.b.b(parcel, a);
    }
}
