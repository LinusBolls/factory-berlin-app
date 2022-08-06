package com.microsoft.appcenter.distribute.l.d;

import android.net.TrafficStats;
import android.net.Uri;
import android.os.AsyncTask;
import com.microsoft.appcenter.http.j;
import com.microsoft.appcenter.utils.a;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;

/* compiled from: HttpConnectionDownloadFileTask */
class b extends AsyncTask<Void, Void, Void> {
    private final c a;
    private final Uri b;
    private final File c;

    b(c cVar, Uri uri, File file) {
        this.a = cVar;
        this.b = uri;
        this.c = file;
    }

    private static void a(Closeable... closeableArr) {
        for (Closeable closeable : closeableArr) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (IOException unused) {
                }
            }
        }
    }

    private long b(InputStream inputStream, OutputStream outputStream, long j2) {
        long j3;
        long j4 = j2;
        byte[] bArr = new byte[1024];
        long j5 = 0;
        InputStream inputStream2 = inputStream;
        long j6 = 0;
        long j7 = 0;
        while (true) {
            int read = inputStream2.read(bArr);
            if (read == -1) {
                OutputStream outputStream2 = outputStream;
                break;
            }
            j5 += (long) read;
            outputStream.write(bArr, 0, read);
            long currentTimeMillis = System.currentTimeMillis();
            if (j5 >= 524288 + j6 || j5 == j4 || currentTimeMillis >= 500 + j7) {
                this.a.o(j5, j4);
                j3 = j5;
            } else {
                currentTimeMillis = j7;
                j3 = j6;
            }
            if (isCancelled()) {
                break;
            }
            j6 = j3;
            j7 = currentTimeMillis;
        }
        outputStream.flush();
        return j5;
    }

    private URLConnection c() {
        HttpsURLConnection d2 = j.d(new URL(this.b.toString()));
        d2.setInstanceFollowRedirects(true);
        d2.connect();
        if (!"application/vnd.android.package-archive".equals(d2.getContentType())) {
            a.i("AppCenterDistribute", "The requested download has not expected content type.");
        }
        int responseCode = d2.getResponseCode();
        if (responseCode >= 200 && responseCode < 300) {
            return d2;
        }
        throw new IOException("Download failed with HTTP error code: " + responseCode);
    }

    private long e(URLConnection uRLConnection) {
        FileOutputStream fileOutputStream;
        BufferedInputStream bufferedInputStream = null;
        try {
            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(uRLConnection.getInputStream());
            try {
                fileOutputStream = new FileOutputStream(this.c);
            } catch (Throwable th) {
                th = th;
                fileOutputStream = null;
                bufferedInputStream = bufferedInputStream2;
                a(bufferedInputStream, fileOutputStream);
                throw th;
            }
            try {
                long b2 = b(bufferedInputStream2, fileOutputStream, (long) uRLConnection.getContentLength());
                a(bufferedInputStream2, fileOutputStream);
                return b2;
            } catch (Throwable th2) {
                th = th2;
                bufferedInputStream = bufferedInputStream2;
                a(bufferedInputStream, fileOutputStream);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
            a(bufferedInputStream, fileOutputStream);
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public Void doInBackground(Void... voidArr) {
        TrafficStats.setThreadStatsTag(-667034599);
        try {
            this.a.p(System.currentTimeMillis());
            if (e(c()) > 0) {
                this.a.m(this.c);
                TrafficStats.clearThreadStatsTag();
                return null;
            }
            throw new IOException("The content of downloaded file is empty");
        } catch (IOException e2) {
            this.a.n(e2.getMessage());
        } catch (Throwable th) {
            TrafficStats.clearThreadStatsTag();
            throw th;
        }
    }
}
