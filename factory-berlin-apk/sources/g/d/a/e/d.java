package g.d.a.e;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;

public class d extends AsyncTask<Void, Void, c> {
    private e a;
    private final String b;
    private final String c;

    /* renamed from: d  reason: collision with root package name */
    private a f9723d;

    /* renamed from: e  reason: collision with root package name */
    private ConnectivityManager f9724e;

    /* renamed from: f  reason: collision with root package name */
    private NetworkInfo f9725f;

    /* renamed from: g  reason: collision with root package name */
    private String f9726g;

    public d(e eVar, String str, String str2) {
        this(eVar, str, str2, a.PortalAPIVariationTenant);
    }

    public d(e eVar, String str, String str2, a aVar) {
        this.f9726g = "";
        this.a = eVar;
        this.b = str;
        this.c = str2;
        this.f9723d = aVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0167, code lost:
        if (r1 != null) goto L_0x0169;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0186, code lost:
        if (r1 == null) goto L_0x0189;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private g.d.a.e.c a() {
        /*
            r12 = this;
            java.lang.String r0 = "logisticConfiguration"
            android.content.Context r1 = g.d.a.d.b()
            java.lang.String r2 = "connectivity"
            java.lang.Object r1 = r1.getSystemService(r2)
            android.net.ConnectivityManager r1 = (android.net.ConnectivityManager) r1
            r12.f9724e = r1
            android.net.NetworkInfo r1 = r1.getActiveNetworkInfo()
            r12.f9725f = r1
            if (r1 != 0) goto L_0x001b
            g.d.a.e.c r0 = g.d.a.e.c.LOGIN_FAILED_NONETWORK
            return r0
        L_0x001b:
            boolean r1 = r1.isConnected()
            if (r1 != 0) goto L_0x0024
            g.d.a.e.c r0 = g.d.a.e.c.LOGIN_FAILED_NONETWORK
            return r0
        L_0x0024:
            java.lang.String r1 = r12.c
            if (r1 == 0) goto L_0x0195
            java.lang.String r2 = r12.b
            if (r2 != 0) goto L_0x002e
            goto L_0x0195
        L_0x002e:
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0192
            java.lang.String r1 = r12.b
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x003e
            goto L_0x0192
        L_0x003e:
            java.lang.String r1 = r12.b
            java.lang.String r1 = r1.toLowerCase()
            java.lang.String r2 = "demo"
            boolean r1 = r1.equals(r2)
            java.lang.String r3 = "pkas"
            java.lang.String r4 = "password"
            java.lang.String r5 = "username"
            java.lang.String r6 = "token"
            if (r1 == 0) goto L_0x0082
            java.lang.String r1 = r12.c
            java.lang.String r1 = r1.toLowerCase()
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0082
            android.content.SharedPreferences r0 = g.d.a.d.d()
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = r12.b
            r0.putString(r5, r1)
            java.lang.String r1 = r12.c
            r0.putString(r4, r1)
            java.lang.String r1 = "9474f1ed11d3df0d20a024b1e2c30e1d5e761a1c29b258d29f33803cbe1af551"
            r0.putString(r6, r1)
            java.lang.String r1 = "[{\"id\":\"0000000_000_00\",\"name\":\"Boschstraße 3, 71737 Kirchberg an der Murr\"}]"
            r0.putString(r3, r1)
            r0.apply()
            g.d.a.e.c r0 = g.d.a.e.c.LOGIN_SUCCESSFUL
            return r0
        L_0x0082:
            java.lang.String r1 = r12.b
            java.lang.String r1 = g.d.a.e.f.d(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r7 = g.d.a.d.c()
            r2.append(r7)
            java.lang.String r7 = g.d.a.e.f.c()
            r2.append(r7)
            java.lang.String r7 = "/getCredentials"
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            g.d.a.e.a r7 = r12.f9723d
            g.d.a.e.a r8 = g.d.a.e.a.PortalAPIVariationLogistic
            if (r7 != r8) goto L_0x00c6
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r7 = g.d.a.d.c()
            r2.append(r7)
            java.lang.String r7 = g.d.a.e.f.b()
            r2.append(r7)
            java.lang.String r7 = "/getLogisticCredentials"
            r2.append(r7)
            java.lang.String r2 = r2.toString()
        L_0x00c6:
            java.lang.String r7 = r12.c
            javax.net.ssl.HttpsURLConnection r1 = g.d.a.e.f.a(r2, r1, r7)
            if (r1 != 0) goto L_0x00d5
            java.lang.String r0 = "HttpsURLConnection could not be established."
            r12.f9726g = r0
            g.d.a.e.c r0 = g.d.a.e.c.LOGIN_FAILED_SERVERERROR
            return r0
        L_0x00d5:
            r1.connect()     // Catch:{ IOException -> 0x017c, JSONException -> 0x016f }
            int r2 = r1.getResponseCode()     // Catch:{ IOException -> 0x017c, JSONException -> 0x016f }
            r7 = 200(0xc8, float:2.8E-43)
            if (r2 != r7) goto L_0x014d
            java.io.InputStream r2 = r1.getInputStream()     // Catch:{ IOException -> 0x017c, JSONException -> 0x016f }
            java.lang.String r7 = g.d.a.e.f.e(r2)     // Catch:{ IOException -> 0x017c, JSONException -> 0x016f }
            r2.close()     // Catch:{ IOException -> 0x017c, JSONException -> 0x016f }
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ IOException -> 0x017c, JSONException -> 0x016f }
            r2.<init>(r7)     // Catch:{ IOException -> 0x017c, JSONException -> 0x016f }
            java.lang.String r7 = r2.getString(r6)     // Catch:{ IOException -> 0x017c, JSONException -> 0x016f }
            java.lang.String r8 = "pka"
            org.json.JSONArray r8 = r2.getJSONArray(r8)     // Catch:{ IOException -> 0x017c, JSONException -> 0x016f }
            java.lang.String r9 = "initpassword"
            boolean r9 = r2.getBoolean(r9)     // Catch:{ IOException -> 0x017c, JSONException -> 0x016f }
            android.content.SharedPreferences r10 = g.d.a.d.d()     // Catch:{ IOException -> 0x017c, JSONException -> 0x016f }
            android.content.SharedPreferences$Editor r10 = r10.edit()     // Catch:{ IOException -> 0x017c, JSONException -> 0x016f }
            java.lang.String r11 = r12.b     // Catch:{ IOException -> 0x017c, JSONException -> 0x016f }
            r10.putString(r5, r11)     // Catch:{ IOException -> 0x017c, JSONException -> 0x016f }
            java.lang.String r5 = r12.c     // Catch:{ IOException -> 0x017c, JSONException -> 0x016f }
            r10.putString(r4, r5)     // Catch:{ IOException -> 0x017c, JSONException -> 0x016f }
            r10.putString(r6, r7)     // Catch:{ IOException -> 0x017c, JSONException -> 0x016f }
            java.lang.String r4 = r8.toString()     // Catch:{ IOException -> 0x017c, JSONException -> 0x016f }
            r10.putString(r3, r4)     // Catch:{ IOException -> 0x017c, JSONException -> 0x016f }
            g.d.a.e.a r3 = r12.f9723d     // Catch:{ IOException -> 0x017c, JSONException -> 0x016f }
            g.d.a.e.a r4 = g.d.a.e.a.PortalAPIVariationLogistic     // Catch:{ IOException -> 0x017c, JSONException -> 0x016f }
            java.lang.String r5 = "userIsLogisticLogin"
            if (r3 != r4) goto L_0x0134
            org.json.JSONObject r2 = r2.getJSONObject(r0)     // Catch:{ IOException -> 0x017c, JSONException -> 0x016f }
            java.lang.String r2 = r2.toString()     // Catch:{ IOException -> 0x017c, JSONException -> 0x016f }
            r10.putString(r0, r2)     // Catch:{ IOException -> 0x017c, JSONException -> 0x016f }
            r0 = 1
            r10.putBoolean(r5, r0)     // Catch:{ IOException -> 0x017c, JSONException -> 0x016f }
            goto L_0x0138
        L_0x0134:
            r0 = 0
            r10.putBoolean(r5, r0)     // Catch:{ IOException -> 0x017c, JSONException -> 0x016f }
        L_0x0138:
            r10.apply()     // Catch:{ IOException -> 0x017c, JSONException -> 0x016f }
            if (r9 != 0) goto L_0x0145
            g.d.a.e.c r0 = g.d.a.e.c.LOGIN_SUCCESSFUL     // Catch:{ IOException -> 0x017c, JSONException -> 0x016f }
            if (r1 == 0) goto L_0x0144
            r1.disconnect()
        L_0x0144:
            return r0
        L_0x0145:
            g.d.a.e.c r0 = g.d.a.e.c.LOGIN_SUCCESSFUL_CHANGEPASSWORDREQUIRED     // Catch:{ IOException -> 0x017c, JSONException -> 0x016f }
            if (r1 == 0) goto L_0x014c
            r1.disconnect()
        L_0x014c:
            return r0
        L_0x014d:
            r0 = 401(0x191, float:5.62E-43)
            if (r2 != r0) goto L_0x0167
            android.content.SharedPreferences r0 = g.d.a.d.d()     // Catch:{ IOException -> 0x017c, JSONException -> 0x016f }
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch:{ IOException -> 0x017c, JSONException -> 0x016f }
            r0.clear()     // Catch:{ IOException -> 0x017c, JSONException -> 0x016f }
            r0.apply()     // Catch:{ IOException -> 0x017c, JSONException -> 0x016f }
            g.d.a.e.c r0 = g.d.a.e.c.LOGIN_FAILED_WRONGCREDENTIALS     // Catch:{ IOException -> 0x017c, JSONException -> 0x016f }
            if (r1 == 0) goto L_0x0166
            r1.disconnect()
        L_0x0166:
            return r0
        L_0x0167:
            if (r1 == 0) goto L_0x0189
        L_0x0169:
            r1.disconnect()
            goto L_0x0189
        L_0x016d:
            r0 = move-exception
            goto L_0x018c
        L_0x016f:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ all -> 0x016d }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x016d }
            r12.f9726g = r0     // Catch:{ all -> 0x016d }
            if (r1 == 0) goto L_0x0189
            goto L_0x0169
        L_0x017c:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ all -> 0x016d }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x016d }
            r12.f9726g = r0     // Catch:{ all -> 0x016d }
            if (r1 == 0) goto L_0x0189
            goto L_0x0169
        L_0x0189:
            g.d.a.e.c r0 = g.d.a.e.c.LOGIN_FAILED_SERVERERROR
            return r0
        L_0x018c:
            if (r1 == 0) goto L_0x0191
            r1.disconnect()
        L_0x0191:
            throw r0
        L_0x0192:
            g.d.a.e.c r0 = g.d.a.e.c.LOGIN_FAILED_WRONGCREDENTIALS
            return r0
        L_0x0195:
            g.d.a.e.c r0 = g.d.a.e.c.LOGIN_FAILED_WRONGCREDENTIALS
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g.d.a.e.d.a():g.d.a.e.c");
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ Object doInBackground(Object[] objArr) {
        return a();
    }

    /* access modifiers changed from: protected */
    public void onCancelled() {
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ void onPostExecute(Object obj) {
        this.a.a((c) obj, this.f9726g);
    }
}
