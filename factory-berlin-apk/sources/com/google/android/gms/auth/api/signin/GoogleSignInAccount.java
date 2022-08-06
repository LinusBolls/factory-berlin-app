package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.util.e;
import com.google.android.gms.common.util.h;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

public class GoogleSignInAccount extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new b();
    private static e t = h.d();

    /* renamed from: g  reason: collision with root package name */
    private final int f2011g;

    /* renamed from: h  reason: collision with root package name */
    private String f2012h;

    /* renamed from: i  reason: collision with root package name */
    private String f2013i;

    /* renamed from: j  reason: collision with root package name */
    private String f2014j;

    /* renamed from: k  reason: collision with root package name */
    private String f2015k;

    /* renamed from: l  reason: collision with root package name */
    private Uri f2016l;

    /* renamed from: m  reason: collision with root package name */
    private String f2017m;

    /* renamed from: n  reason: collision with root package name */
    private long f2018n;
    private String o;
    private List<Scope> p;
    private String q;
    private String r;
    private Set<Scope> s = new HashSet();

    GoogleSignInAccount(int i2, String str, String str2, String str3, String str4, Uri uri, String str5, long j2, String str6, List<Scope> list, String str7, String str8) {
        this.f2011g = i2;
        this.f2012h = str;
        this.f2013i = str2;
        this.f2014j = str3;
        this.f2015k = str4;
        this.f2016l = uri;
        this.f2017m = str5;
        this.f2018n = j2;
        this.o = str6;
        this.p = list;
        this.q = str7;
        this.r = str8;
    }

    public static GoogleSignInAccount V(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl", (String) null);
        Uri parse = !TextUtils.isEmpty(optString) ? Uri.parse(optString) : null;
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            hashSet.add(new Scope(jSONArray.getString(i2)));
        }
        GoogleSignInAccount W = W(jSONObject.optString("id"), jSONObject.optString("tokenId", (String) null), jSONObject.optString("email", (String) null), jSONObject.optString("displayName", (String) null), jSONObject.optString("givenName", (String) null), jSONObject.optString("familyName", (String) null), parse, Long.valueOf(parseLong), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        W.f2017m = jSONObject.optString("serverAuthCode", (String) null);
        return W;
    }

    private static GoogleSignInAccount W(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Long l2, String str7, Set<Scope> set) {
        long longValue = (l2 == null ? Long.valueOf(t.b() / 1000) : l2).longValue();
        r.g(str7);
        r.k(set);
        return new GoogleSignInAccount(3, str, str2, str3, str4, uri, (String) null, longValue, str7, new ArrayList(set), str5, str6);
    }

    public String K() {
        return this.q;
    }

    public String L() {
        return this.f2012h;
    }

    public String Q() {
        return this.f2013i;
    }

    public Uri R() {
        return this.f2016l;
    }

    public Set<Scope> S() {
        HashSet hashSet = new HashSet(this.p);
        hashSet.addAll(this.s);
        return hashSet;
    }

    public String T() {
        return this.f2017m;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.o.equals(this.o) && googleSignInAccount.S().equals(S());
    }

    public int hashCode() {
        return ((this.o.hashCode() + 527) * 31) + S().hashCode();
    }

    public Account l() {
        if (this.f2014j == null) {
            return null;
        }
        return new Account(this.f2014j, "com.google");
    }

    public String n() {
        return this.f2015k;
    }

    public String o() {
        return this.f2014j;
    }

    public String q() {
        return this.r;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a = b.a(parcel);
        b.l(parcel, 1, this.f2011g);
        b.q(parcel, 2, L(), false);
        b.q(parcel, 3, Q(), false);
        b.q(parcel, 4, o(), false);
        b.q(parcel, 5, n(), false);
        b.o(parcel, 6, R(), i2, false);
        b.q(parcel, 7, T(), false);
        b.m(parcel, 8, this.f2018n);
        b.q(parcel, 9, this.o, false);
        b.t(parcel, 10, this.p, false);
        b.q(parcel, 11, K(), false);
        b.q(parcel, 12, q(), false);
        b.b(parcel, a);
    }
}
