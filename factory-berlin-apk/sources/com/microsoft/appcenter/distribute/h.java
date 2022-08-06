package com.microsoft.appcenter.distribute;

import android.net.Uri;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ReleaseDetails */
public class h {
    private int a;
    private int b;
    private String c;

    /* renamed from: d  reason: collision with root package name */
    private long f4464d;

    /* renamed from: e  reason: collision with root package name */
    private String f4465e;

    /* renamed from: f  reason: collision with root package name */
    private Uri f4466f;

    /* renamed from: g  reason: collision with root package name */
    private int f4467g;

    /* renamed from: h  reason: collision with root package name */
    private Uri f4468h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f4469i;

    /* renamed from: j  reason: collision with root package name */
    private String f4470j;

    /* renamed from: k  reason: collision with root package name */
    private String f4471k;

    static h l(String str) {
        JSONObject jSONObject = new JSONObject(str);
        h hVar = new h();
        hVar.a = jSONObject.getInt("id");
        hVar.b = jSONObject.getInt("version");
        hVar.c = jSONObject.getString("short_version");
        hVar.f4464d = jSONObject.getLong("size");
        String str2 = null;
        hVar.f4465e = jSONObject.isNull("release_notes") ? null : jSONObject.getString("release_notes");
        hVar.f4466f = jSONObject.isNull("release_notes_url") ? null : Uri.parse(jSONObject.getString("release_notes_url"));
        hVar.f4467g = jSONObject.getInt("android_min_api_level");
        Uri parse = Uri.parse(jSONObject.getString("download_url"));
        hVar.f4468h = parse;
        String scheme = parse.getScheme();
        if (scheme == null || !scheme.startsWith("http")) {
            throw new JSONException("Invalid download_url scheme.");
        }
        hVar.f4469i = jSONObject.getBoolean("mandatory_update");
        hVar.f4470j = jSONObject.getJSONArray("package_hashes").getString(0);
        if (!jSONObject.isNull("distribution_group_id")) {
            str2 = jSONObject.getString("distribution_group_id");
        }
        hVar.f4471k = str2;
        return hVar;
    }

    public String a() {
        return this.f4471k;
    }

    public Uri b() {
        return this.f4468h;
    }

    public int c() {
        return this.a;
    }

    /* access modifiers changed from: package-private */
    public int d() {
        return this.f4467g;
    }

    public String e() {
        return this.f4470j;
    }

    public String f() {
        return this.f4465e;
    }

    public Uri g() {
        return this.f4466f;
    }

    public String h() {
        return this.c;
    }

    public long i() {
        return this.f4464d;
    }

    public int j() {
        return this.b;
    }

    public boolean k() {
        return this.f4469i;
    }
}
