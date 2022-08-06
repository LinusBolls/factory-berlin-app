package com.google.android.datatransport.cct;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import com.google.android.datatransport.cct.b.a;
import com.google.android.datatransport.cct.b.j;
import com.google.android.datatransport.cct.b.k;
import com.google.android.datatransport.cct.b.l;
import com.google.android.datatransport.cct.b.m;
import com.google.android.datatransport.cct.b.o;
import com.google.android.datatransport.cct.b.p;
import com.google.android.datatransport.runtime.backends.f;
import com.google.android.datatransport.runtime.backends.g;
import com.google.android.datatransport.runtime.backends.m;
import com.google.firebase.encoders.g.d;
import g.b.a.a.i.h;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

final class e implements m {
    private final com.google.firebase.encoders.a a;
    private final ConnectivityManager b;
    final URL c = f(a.c);

    /* renamed from: d  reason: collision with root package name */
    private final g.b.a.a.i.w.a f1977d;

    /* renamed from: e  reason: collision with root package name */
    private final g.b.a.a.i.w.a f1978e;

    /* renamed from: f  reason: collision with root package name */
    private final int f1979f;

    static final class a {
        final URL a;
        final j b;
        final String c;

        a(URL url, j jVar, String str) {
            this.a = url;
            this.b = jVar;
            this.c = str;
        }

        /* access modifiers changed from: package-private */
        public a a(URL url) {
            return new a(url, this.b, this.c);
        }
    }

    static final class b {
        final int a;
        final URL b;
        final long c;

        b(int i2, URL url, long j2) {
            this.a = i2;
            this.b = url;
            this.c = j2;
        }
    }

    e(Context context, g.b.a.a.i.w.a aVar, g.b.a.a.i.w.a aVar2) {
        d dVar = new d();
        dVar.g(com.google.android.datatransport.cct.b.b.a);
        dVar.h(true);
        this.a = dVar.f();
        this.b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f1977d = aVar2;
        this.f1978e = aVar;
        this.f1979f = 40000;
    }

    static /* synthetic */ a c(a aVar, b bVar) {
        URL url = bVar.b;
        if (url == null) {
            return null;
        }
        g.b.a.a.i.t.a.a("CctTransportBackend", "Following redirect to: %s", url);
        return aVar.a(bVar.b);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x0116 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:56:0x0133 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:62:0x013a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.datatransport.cct.e.b d(com.google.android.datatransport.cct.e.a r14) {
        /*
            r13 = this;
            java.net.URL r0 = r14.a
            java.lang.String r1 = "CctTransportBackend"
            java.lang.String r2 = "Making request to: %s"
            g.b.a.a.i.t.a.a(r1, r2, r0)
            java.net.URL r0 = r14.a
            java.net.URLConnection r0 = r0.openConnection()
            java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0
            r2 = 30000(0x7530, float:4.2039E-41)
            r0.setConnectTimeout(r2)
            int r2 = r13.f1979f
            r0.setReadTimeout(r2)
            r2 = 1
            r0.setDoOutput(r2)
            r3 = 0
            r0.setInstanceFollowRedirects(r3)
            java.lang.String r4 = "POST"
            r0.setRequestMethod(r4)
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r4 = "2.3.1"
            r2[r3] = r4
            java.lang.String r3 = "datatransport/%s android/"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            java.lang.String r3 = "User-Agent"
            r0.setRequestProperty(r3, r2)
            java.lang.String r2 = "Content-Encoding"
            java.lang.String r3 = "gzip"
            r0.setRequestProperty(r2, r3)
            java.lang.String r4 = "Content-Type"
            java.lang.String r5 = "application/json"
            r0.setRequestProperty(r4, r5)
            java.lang.String r5 = "Accept-Encoding"
            r0.setRequestProperty(r5, r3)
            java.lang.String r5 = r14.c
            if (r5 == 0) goto L_0x0055
            java.lang.String r6 = "X-Goog-Api-Key"
            r0.setRequestProperty(r6, r5)
        L_0x0055:
            r5 = 0
            r7 = 0
            java.io.OutputStream r8 = r0.getOutputStream()     // Catch:{ ConnectException -> 0x014d, UnknownHostException -> 0x014b, EncodingException -> 0x013d, IOException -> 0x013b }
            java.util.zip.GZIPOutputStream r9 = new java.util.zip.GZIPOutputStream     // Catch:{ all -> 0x0134 }
            r9.<init>(r8)     // Catch:{ all -> 0x0134 }
            com.google.firebase.encoders.a r10 = r13.a     // Catch:{ all -> 0x012f }
            com.google.android.datatransport.cct.b.j r14 = r14.b     // Catch:{ all -> 0x012f }
            java.io.BufferedWriter r11 = new java.io.BufferedWriter     // Catch:{ all -> 0x012f }
            java.io.OutputStreamWriter r12 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x012f }
            r12.<init>(r9)     // Catch:{ all -> 0x012f }
            r11.<init>(r12)     // Catch:{ all -> 0x012f }
            r10.b(r14, r11)     // Catch:{ all -> 0x012f }
            r9.close()     // Catch:{ all -> 0x0134 }
            if (r8 == 0) goto L_0x007a
            r8.close()     // Catch:{ ConnectException -> 0x014d, UnknownHostException -> 0x014b, EncodingException -> 0x013d, IOException -> 0x013b }
        L_0x007a:
            int r14 = r0.getResponseCode()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Status Code: "
            r8.append(r9)
            r8.append(r14)
            java.lang.String r8 = r8.toString()
            g.b.a.a.i.t.a.e(r1, r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Content-Type: "
            r8.append(r9)
            java.lang.String r4 = r0.getHeaderField(r4)
            r8.append(r4)
            java.lang.String r4 = r8.toString()
            g.b.a.a.i.t.a.e(r1, r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r8 = "Content-Encoding: "
            r4.append(r8)
            java.lang.String r8 = r0.getHeaderField(r2)
            r4.append(r8)
            java.lang.String r4 = r4.toString()
            g.b.a.a.i.t.a.e(r1, r4)
            r1 = 302(0x12e, float:4.23E-43)
            if (r14 == r1) goto L_0x011e
            r1 = 301(0x12d, float:4.22E-43)
            if (r14 == r1) goto L_0x011e
            r1 = 307(0x133, float:4.3E-43)
            if (r14 != r1) goto L_0x00cf
            goto L_0x011e
        L_0x00cf:
            r1 = 200(0xc8, float:2.8E-43)
            if (r14 == r1) goto L_0x00d9
            com.google.android.datatransport.cct.e$b r0 = new com.google.android.datatransport.cct.e$b
            r0.<init>(r14, r7, r5)
            return r0
        L_0x00d9:
            java.io.InputStream r1 = r0.getInputStream()
            java.lang.String r0 = r0.getHeaderField(r2)     // Catch:{ all -> 0x0117 }
            boolean r0 = r3.equals(r0)     // Catch:{ all -> 0x0117 }
            if (r0 == 0) goto L_0x00ed
            java.util.zip.GZIPInputStream r0 = new java.util.zip.GZIPInputStream     // Catch:{ all -> 0x0117 }
            r0.<init>(r1)     // Catch:{ all -> 0x0117 }
            goto L_0x00ee
        L_0x00ed:
            r0 = r1
        L_0x00ee:
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ all -> 0x0110 }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ all -> 0x0110 }
            r3.<init>(r0)     // Catch:{ all -> 0x0110 }
            r2.<init>(r3)     // Catch:{ all -> 0x0110 }
            com.google.android.datatransport.cct.b.n r2 = com.google.android.datatransport.cct.b.n.b(r2)     // Catch:{ all -> 0x0110 }
            long r2 = r2.a()     // Catch:{ all -> 0x0110 }
            com.google.android.datatransport.cct.e$b r4 = new com.google.android.datatransport.cct.e$b     // Catch:{ all -> 0x0110 }
            r4.<init>(r14, r7, r2)     // Catch:{ all -> 0x0110 }
            if (r0 == 0) goto L_0x010a
            r0.close()     // Catch:{ all -> 0x0117 }
        L_0x010a:
            if (r1 == 0) goto L_0x010f
            r1.close()
        L_0x010f:
            return r4
        L_0x0110:
            r14 = move-exception
            if (r0 == 0) goto L_0x0116
            r0.close()     // Catch:{ all -> 0x0116 }
        L_0x0116:
            throw r14     // Catch:{ all -> 0x0117 }
        L_0x0117:
            r14 = move-exception
            if (r1 == 0) goto L_0x011d
            r1.close()     // Catch:{ all -> 0x011d }
        L_0x011d:
            throw r14
        L_0x011e:
            java.lang.String r1 = "Location"
            java.lang.String r0 = r0.getHeaderField(r1)
            com.google.android.datatransport.cct.e$b r1 = new com.google.android.datatransport.cct.e$b
            java.net.URL r2 = new java.net.URL
            r2.<init>(r0)
            r1.<init>(r14, r2, r5)
            return r1
        L_0x012f:
            r14 = move-exception
            r9.close()     // Catch:{ all -> 0x0133 }
        L_0x0133:
            throw r14     // Catch:{ all -> 0x0134 }
        L_0x0134:
            r14 = move-exception
            if (r8 == 0) goto L_0x013a
            r8.close()     // Catch:{ all -> 0x013a }
        L_0x013a:
            throw r14     // Catch:{ ConnectException -> 0x014d, UnknownHostException -> 0x014b, EncodingException -> 0x013d, IOException -> 0x013b }
        L_0x013b:
            r14 = move-exception
            goto L_0x013e
        L_0x013d:
            r14 = move-exception
        L_0x013e:
            java.lang.String r0 = "Couldn't encode request, returning with 400"
            g.b.a.a.i.t.a.c(r1, r0, r14)
            com.google.android.datatransport.cct.e$b r14 = new com.google.android.datatransport.cct.e$b
            r0 = 400(0x190, float:5.6E-43)
            r14.<init>(r0, r7, r5)
            return r14
        L_0x014b:
            r14 = move-exception
            goto L_0x014e
        L_0x014d:
            r14 = move-exception
        L_0x014e:
            java.lang.String r0 = "Couldn't open connection, returning with 500"
            g.b.a.a.i.t.a.c(r1, r0, r14)
            com.google.android.datatransport.cct.e$b r14 = new com.google.android.datatransport.cct.e$b
            r0 = 500(0x1f4, float:7.0E-43)
            r14.<init>(r0, r7, r5)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.datatransport.cct.e.d(com.google.android.datatransport.cct.e$a):com.google.android.datatransport.cct.e$b");
    }

    private static URL f(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e2) {
            throw new IllegalArgumentException("Invalid url: " + str, e2);
        }
    }

    public h a(h hVar) {
        int i2;
        int i3;
        NetworkInfo activeNetworkInfo = this.b.getActiveNetworkInfo();
        h.a l2 = hVar.l();
        l2.a("sdk-version", Build.VERSION.SDK_INT);
        l2.c("model", Build.MODEL);
        l2.c("hardware", Build.HARDWARE);
        l2.c("device", Build.DEVICE);
        l2.c("product", Build.PRODUCT);
        l2.c("os-uild", Build.ID);
        l2.c("manufacturer", Build.MANUFACTURER);
        l2.c("fingerprint", Build.FINGERPRINT);
        Calendar.getInstance();
        l2.b("tz-offset", (long) (TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000));
        if (activeNetworkInfo == null) {
            i2 = o.c.NONE.b();
        } else {
            i2 = activeNetworkInfo.getType();
        }
        l2.a("net-type", i2);
        if (activeNetworkInfo == null) {
            i3 = o.b.UNKNOWN_MOBILE_SUBTYPE.b();
        } else {
            i3 = activeNetworkInfo.getSubtype();
            if (i3 == -1) {
                i3 = o.b.COMBINED.b();
            } else if (o.b.a(i3) == null) {
                i3 = 0;
            }
        }
        l2.a("mobile-subtype", i3);
        return l2.d();
    }

    public g b(f fVar) {
        l.a aVar;
        HashMap hashMap = new HashMap();
        for (h next : fVar.b()) {
            String j2 = next.j();
            if (!hashMap.containsKey(j2)) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                hashMap.put(j2, arrayList);
            } else {
                ((List) hashMap.get(j2)).add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            h hVar = (h) ((List) entry.getValue()).get(0);
            m.a a2 = com.google.android.datatransport.cct.b.m.a();
            a2.d(p.DEFAULT);
            a2.b(this.f1978e.a());
            a2.i(this.f1977d.a());
            k.a a3 = k.a();
            a3.b(k.b.ANDROID_FIREBASE);
            a.C0056a a4 = com.google.android.datatransport.cct.b.a.a();
            a4.a(Integer.valueOf(hVar.g("sdk-version")));
            a4.g(hVar.b("model"));
            a4.e(hVar.b("hardware"));
            a4.b(hVar.b("device"));
            a4.i(hVar.b("product"));
            a4.h(hVar.b("os-uild"));
            a4.f(hVar.b("manufacturer"));
            a4.d(hVar.b("fingerprint"));
            a3.a(a4.c());
            a2.c(a3.c());
            try {
                a2.a(Integer.parseInt((String) entry.getKey()));
            } catch (NumberFormatException unused) {
                a2.j((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (h hVar2 : (List) entry.getValue()) {
                g.b.a.a.i.g e2 = hVar2.e();
                g.b.a.a.b b2 = e2.b();
                if (b2.equals(g.b.a.a.b.b("proto"))) {
                    aVar = l.b(e2.a());
                } else if (b2.equals(g.b.a.a.b.b("json"))) {
                    aVar = l.a(new String(e2.a(), Charset.forName("UTF-8")));
                } else {
                    g.b.a.a.i.t.a.f("CctTransportBackend", "Received event of unsupported encoding %s. Skipping...", b2);
                }
                aVar.a(hVar2.f());
                aVar.e(hVar2.k());
                aVar.f(hVar2.h("tz-offset"));
                o.a a5 = o.a();
                a5.b(o.c.a(hVar2.g("net-type")));
                a5.a(o.b.a(hVar2.g("mobile-subtype")));
                aVar.b(a5.c());
                if (hVar2.d() != null) {
                    aVar.c(hVar2.d());
                }
                arrayList3.add(aVar.d());
            }
            a2.g(arrayList3);
            arrayList2.add(a2.h());
        }
        j a6 = j.a(arrayList2);
        String str = null;
        URL url = this.c;
        if (fVar.c() != null) {
            try {
                a d2 = a.d(fVar.c());
                if (d2.e() != null) {
                    str = d2.e();
                }
                if (d2.f() != null) {
                    url = f(d2.f());
                }
            } catch (IllegalArgumentException unused2) {
                return g.a();
            }
        }
        try {
            b bVar = (b) g.b.a.a.i.u.b.a(5, new a(url, a6, str), c.b(this), d.b());
            if (bVar.a == 200) {
                return g.d(bVar.c);
            }
            int i2 = bVar.a;
            if (i2 < 500) {
                if (i2 != 404) {
                    return g.a();
                }
            }
            return g.e();
        } catch (IOException e3) {
            g.b.a.a.i.t.a.c("CctTransportBackend", "Could not make request to the backend", e3);
            return g.e();
        }
    }
}
