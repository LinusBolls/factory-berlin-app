package com.google.android.gms.nearby.messages;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import g.b.a.b.c.f.e1;
import java.util.Arrays;

public class Message extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<Message> CREATOR = new k();

    /* renamed from: m  reason: collision with root package name */
    private static final e1[] f3241m = {e1.f9376j};

    /* renamed from: g  reason: collision with root package name */
    private final int f3242g;

    /* renamed from: h  reason: collision with root package name */
    private final byte[] f3243h;

    /* renamed from: i  reason: collision with root package name */
    private final String f3244i;

    /* renamed from: j  reason: collision with root package name */
    private final String f3245j;
    @Deprecated

    /* renamed from: k  reason: collision with root package name */
    private final e1[] f3246k;

    /* renamed from: l  reason: collision with root package name */
    private final long f3247l;

    Message(int i2, byte[] bArr, String str, String str2, e1[] e1VarArr, long j2) {
        this.f3242g = i2;
        r.k(str2);
        this.f3244i = str2;
        this.f3245j = str == null ? "" : str;
        this.f3247l = j2;
        r.k(bArr);
        r.c(bArr.length <= 102400, "Content length(%d) must not exceed MAX_CONTENT_SIZE_BYTES(%d)", Integer.valueOf(bArr.length), 102400);
        this.f3243h = bArr;
        this.f3246k = (e1VarArr == null || e1VarArr.length == 0) ? f3241m : e1VarArr;
        r.c(str2.length() <= 32, "Type length(%d) must not exceed MAX_TYPE_LENGTH(%d)", Integer.valueOf(str2.length()), 32);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Message)) {
            return false;
        }
        Message message = (Message) obj;
        return TextUtils.equals(this.f3245j, message.f3245j) && TextUtils.equals(this.f3244i, message.f3244i) && Arrays.equals(this.f3243h, message.f3243h) && this.f3247l == message.f3247l;
    }

    public int hashCode() {
        return p.b(this.f3245j, this.f3244i, Integer.valueOf(Arrays.hashCode(this.f3243h)), Long.valueOf(this.f3247l));
    }

    public byte[] l() {
        return this.f3243h;
    }

    public String n() {
        return this.f3245j;
    }

    public String o() {
        return this.f3244i;
    }

    public final boolean q(String str) {
        return "__reserved_namespace".equals(n()) && str.equals(o());
    }

    public String toString() {
        String str = this.f3245j;
        String str2 = this.f3244i;
        byte[] bArr = this.f3243h;
        int length = bArr == null ? 0 : bArr.length;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 59 + String.valueOf(str2).length());
        sb.append("Message{namespace='");
        sb.append(str);
        sb.append("', type='");
        sb.append(str2);
        sb.append("', content=[");
        sb.append(length);
        sb.append(" bytes]}");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a = b.a(parcel);
        b.f(parcel, 1, l(), false);
        b.q(parcel, 2, o(), false);
        b.q(parcel, 3, n(), false);
        b.s(parcel, 4, this.f3246k, i2, false);
        b.m(parcel, 5, this.f3247l);
        b.l(parcel, 1000, this.f3242g);
        b.b(parcel, a);
    }
}
