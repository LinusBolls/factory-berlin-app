package de.baimos;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

public class ce extends bn implements cf {
    private final Map a = new HashMap();
    private final URL b;
    /* access modifiers changed from: private */
    public HttpURLConnection c;

    /* renamed from: d  reason: collision with root package name */
    private String f8308d = "POST";
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public boolean f8309e = false;

    /* renamed from: f  reason: collision with root package name */
    private SSLSocketFactory f8310f;

    public ce() {
        try {
            this.b = new URL("http://ticketmanager.blueid.de");
        } catch (MalformedURLException e2) {
            throw new RuntimeException("illegal url format: https://ticketmanager.blueid.de", e2);
        }
    }

    public ce(String str) {
        try {
            this.b = new URL(str);
        } catch (MalformedURLException e2) {
            throw new RuntimeException("illegal url format: " + str, e2);
        }
    }

    /* access modifiers changed from: protected */
    public cm a() {
        SSLSocketFactory sSLSocketFactory;
        final HttpURLConnection httpURLConnection = (HttpURLConnection) this.b.openConnection();
        if ((httpURLConnection instanceof HttpsURLConnection) && (sSLSocketFactory = this.f8310f) != null) {
            ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(sSLSocketFactory);
        }
        this.c = httpURLConnection;
        httpURLConnection.setDoInput(true);
        if (this.f8308d.equals("POST")) {
            this.c.setDoOutput(true);
        }
        int g2 = (int) g();
        if (g2 > 0) {
            this.c.setConnectTimeout(g2);
        }
        try {
            this.c.setRequestMethod(this.f8308d);
            for (Map.Entry entry : this.a.entrySet()) {
                this.c.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            this.c.setRequestProperty("Connection", "Close");
            return new cm() {
                private InputStream c;

                /* renamed from: d  reason: collision with root package name */
                private OutputStream f8311d;

                public InputStream a() {
                    if (!ce.this.f8309e || ce.this.c.getResponseCode() == 200) {
                        InputStream inputStream = httpURLConnection.getInputStream();
                        this.c = inputStream;
                        return inputStream;
                    }
                    throw new IOException(ce.this.c.getResponseMessage());
                }

                public OutputStream b() {
                    OutputStream outputStream = httpURLConnection.getOutputStream();
                    this.f8311d = outputStream;
                    return outputStream;
                }

                public String c() {
                    return ce.this.c.getURL().toString();
                }

                public void d() {
                    try {
                        cq.a(this.f8311d);
                        cq.d(this.c);
                    } catch (IllegalStateException unused) {
                    }
                    ce.this.c.disconnect();
                }
            };
        } catch (ProtocolException unused) {
            throw new IOException("illegal method: " + this.f8308d);
        }
    }

    public String a(String str) {
        return this.c.getHeaderField(str);
    }

    public void a(String str, String str2) {
        this.a.put(str, str2);
    }

    public int b() {
        HttpURLConnection httpURLConnection = this.c;
        if (httpURLConnection != null) {
            return httpURLConnection.getResponseCode();
        }
        throw new IOException("open connection before calling this method!");
    }

    public void b(String str) {
        this.f8308d = str;
    }

    public void b(String str, String str2) {
        cl clVar = new cl();
        String str3 = str + ":" + str2;
        try {
            this.a.put("Authorization", "Basic " + new String(clVar.a(str3.getBytes("UTF-8"))));
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException("unsupported encoding", e2);
        }
    }

    public String toString() {
        return ce.class.getSimpleName() + "{url=" + this.b + ",requestMethod=" + this.f8308d + ",requestProperties=" + this.a + "}";
    }
}
