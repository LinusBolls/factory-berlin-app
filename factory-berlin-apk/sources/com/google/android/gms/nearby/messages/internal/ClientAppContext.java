package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.Locale;

public final class ClientAppContext extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<ClientAppContext> CREATOR = new b0();

    /* renamed from: g  reason: collision with root package name */
    private final int f3266g;

    /* renamed from: h  reason: collision with root package name */
    private final String f3267h;

    /* renamed from: i  reason: collision with root package name */
    private final String f3268i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f3269j;
    @Deprecated

    /* renamed from: k  reason: collision with root package name */
    public final int f3270k;

    /* renamed from: l  reason: collision with root package name */
    private final String f3271l;

    ClientAppContext(int i2, String str, String str2, boolean z, int i3, String str3) {
        this.f3266g = i2;
        r.k(str);
        this.f3267h = str;
        if (str2 != null && !str2.isEmpty() && !str2.startsWith("0p:")) {
            Log.w("NearbyMessages", String.format(Locale.US, "ClientAppContext: 0P identifier(%s) without 0P prefix(%s)", new Object[]{str2, "0p:"}));
            String valueOf = String.valueOf(str2);
            str2 = valueOf.length() != 0 ? "0p:".concat(valueOf) : new String("0p:");
        }
        this.f3268i = str2;
        this.f3269j = z;
        this.f3270k = i3;
        this.f3271l = str3;
    }

    public ClientAppContext(String str, String str2, boolean z, String str3, int i2) {
        this(1, str, str2, z, i2, str3);
    }

    static final ClientAppContext l(ClientAppContext clientAppContext, String str, String str2, boolean z) {
        if (clientAppContext != null) {
            return clientAppContext;
        }
        if (str == null && str2 == null) {
            return null;
        }
        return new ClientAppContext(str, str2, z, (String) null, 0);
    }

    private static boolean n(String str, String str2) {
        return TextUtils.isEmpty(str) ? TextUtils.isEmpty(str2) : str.equals(str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClientAppContext)) {
            return false;
        }
        ClientAppContext clientAppContext = (ClientAppContext) obj;
        return n(this.f3267h, clientAppContext.f3267h) && n(this.f3268i, clientAppContext.f3268i) && this.f3269j == clientAppContext.f3269j && n(this.f3271l, clientAppContext.f3271l) && this.f3270k == clientAppContext.f3270k;
    }

    public final int hashCode() {
        return p.b(this.f3267h, this.f3268i, Boolean.valueOf(this.f3269j), this.f3271l, Integer.valueOf(this.f3270k));
    }

    public final String toString() {
        return String.format(Locale.US, "{realClientPackageName: %s, zeroPartyIdentifier: %s, useRealClientApiKey: %b, apiKey: %s, callingContext: %d}", new Object[]{this.f3267h, this.f3268i, Boolean.valueOf(this.f3269j), this.f3271l, Integer.valueOf(this.f3270k)});
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = b.a(parcel);
        b.l(parcel, 1, this.f3266g);
        b.q(parcel, 2, this.f3267h, false);
        b.q(parcel, 3, this.f3268i, false);
        b.c(parcel, 4, this.f3269j);
        b.l(parcel, 5, this.f3270k);
        b.q(parcel, 6, this.f3271l, false);
        b.b(parcel, a);
    }
}
