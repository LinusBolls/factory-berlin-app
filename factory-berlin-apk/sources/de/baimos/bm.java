package de.baimos;

import android.os.Build;
import de.baimos.blueid.sdk.api.SdkInfo;
import de.baimos.blueid.sdk.api.exceptions.ConnectException;
import de.baimos.blueid.sdk.api.exceptions.ConnectionIOException;
import de.baimos.blueid.sdk.api.exceptions.ConnectionTimeoutException;
import de.baimos.blueid.sdk.api.exceptions.TimeDriftException;
import de.baimos.blueid.sdk.conn.SdkClientFactory;
import de.baimos.blueid.sdk.metrics.AndroidSdkMetrics;
import de.baimos.blueid.sdk.util.a;
import java.io.IOException;
import java.io.OutputStream;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.UUID;

public final class bm {
    private static final dr a = ds.a(bm.class);

    private bm() {
    }

    public static bl a(String str, String str2, String str3, String str4, byte[] bArr, Map<String, String> map, SdkClientFactory sdkClientFactory, AndroidSdkMetrics androidSdkMetrics) {
        return a(str, str2, str3, str4, bArr, map, sdkClientFactory, (String) null, (String) null, androidSdkMetrics);
    }

    public static bl a(String str, String str2, String str3, String str4, byte[] bArr, Map<String, String> map, SdkClientFactory sdkClientFactory, String str5, String str6, AndroidSdkMetrics androidSdkMetrics) {
        dr drVar = a;
        drVar.d(str2 + " " + str);
        bl blVar = new bl();
        ce ceVar = (ce) sdkClientFactory.b(str);
        ceVar.b(str2);
        if (str3 != null) {
            ceVar.a("Accept", str3);
        }
        if (str4 != null) {
            ceVar.a("Content-Type", str4);
        }
        ceVar.a("BlueID-App-Name", System.getProperty("android.app.name", ""));
        ceVar.a("BlueID-App-Version", System.getProperty("android.app.version", ""));
        ceVar.a("BlueID-SDK-Version", SdkInfo.getUrlEncodedVersion());
        ceVar.a("BlueID-Runtime-Version", System.getProperty("java.vm.vendor") + "_" + System.getProperty("java.vm.name") + "_" + System.getProperty("java.vm.version"));
        ceVar.a("BlueID-OS-Version", System.getProperty("os.arch") + "_" + System.getProperty("os.name") + "_" + System.getProperty("os.version"));
        if (!(str5 == null || str6 == null)) {
            ceVar.b(str5, str6);
        }
        Date date = new Date();
        String format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ").format(date);
        ceVar.a("BlueID-Device-Date", format);
        ceVar.a("BlueID-Device-Timestamp", Long.toString(date.getTime()));
        dr drVar2 = a;
        drVar2.c("http request date: " + format + ", timestamp: " + date.getTime());
        String uuid = UUID.randomUUID().toString();
        dr drVar3 = a;
        drVar3.c("requestId=" + uuid);
        ceVar.a("X-Request-ID", uuid);
        try {
            Class.forName("android.os.Build");
            ceVar.a("BlueID-Hardware-Version", Build.MANUFACTURER + "_" + Build.MODEL + "_" + Build.PRODUCT + "_" + Build.VERSION.RELEASE);
        } catch (Throwable unused) {
            androidSdkMetrics.addMessage("BlueID-Hardware-Version not available");
        }
        if (map != null && !map.isEmpty()) {
            for (String next : map.keySet()) {
                ceVar.a(next, map.get(next));
            }
        }
        long j2 = 30000;
        String property = System.getProperty("de.baimos.blueid.sdk.sync.timeout");
        if (property != null) {
            try {
                j2 = Long.parseLong(property);
                dr drVar4 = a;
                drVar4.d("overriding default timeout with " + j2 + "ms");
            } catch (NumberFormatException unused2) {
                dr drVar5 = a;
                drVar5.b("cannot set timeout to '" + property + "', using default setting");
                androidSdkMetrics.addMessage("cannot set timeout to '" + property + "', using default setting");
            }
        }
        ceVar.a(j2);
        a.d("opening connection");
        try {
            cm h2 = ceVar.h();
            a.d("connection opened");
            long currentTimeMillis = System.currentTimeMillis();
            if (bArr != null) {
                try {
                    OutputStream b = h2.b();
                    b.write(bArr);
                    b.flush();
                } catch (TimeDriftException e2) {
                    throw e2;
                } catch (ar e3) {
                    throw e3;
                } catch (IOException e4) {
                    a.d("error", e4);
                    dr drVar6 = a;
                    drVar6.d("connected at " + currentTimeMillis);
                    dr drVar7 = a;
                    drVar7.d("now is " + System.currentTimeMillis());
                    boolean z = System.currentTimeMillis() - currentTimeMillis > j2 - 1000;
                    if (e4 instanceof SocketException) {
                        if (z) {
                            throw new ConnectionTimeoutException((Throwable) e4);
                        }
                    }
                    if (e4 instanceof SocketTimeoutException) {
                        throw new ConnectionTimeoutException((Throwable) e4);
                    } else if (e4 instanceof UnknownHostException) {
                        throw new ConnectException((Throwable) e4);
                    } else {
                        throw new ConnectionIOException((Throwable) e4);
                    }
                } catch (Throwable th) {
                    if (h2 != null) {
                        h2.d();
                    }
                    throw th;
                }
            }
            a.d("getting response code");
            int b2 = ceVar.b();
            dr drVar8 = a;
            drVar8.d("response code = " + b2);
            if (b2 < 400) {
                blVar.a(b2);
                String a2 = ceVar.a("BlueID-Server-Timestamp");
                if (a2 != null) {
                    long parseLong = Long.parseLong(a2);
                    int abs = (int) (Math.abs(parseLong - System.currentTimeMillis()) / 60000);
                    if (((long) abs) <= 30) {
                        dr drVar9 = a;
                        drVar9.c("time drift to server time: " + abs + " minutes");
                        blVar.a(Long.valueOf(parseLong));
                    } else {
                        dr drVar10 = a;
                        drVar10.b("time drift to server time too large! time drift = " + abs + " minutes. The time on the smartphone needs to get set correctly.");
                        throw new TimeDriftException(new Date(parseLong), abs);
                    }
                }
                if (!(b2 == 204 || b2 == 304)) {
                    blVar.a(cq.a(h2.a()));
                }
                if (h2 != null) {
                    h2.d();
                }
                return blVar;
            }
            throw new ar(str, b2);
        } catch (IOException e5) {
            if (e5 instanceof SocketTimeoutException) {
                throw new ConnectionTimeoutException((Throwable) e5);
            }
            throw new ConnectException((Throwable) e5);
        }
    }

    public static String a(String str, al alVar) {
        if (!str.contains("://")) {
            String a2 = a.a(str);
            if (!str.equals(a2) && alVar != null) {
                alVar.a("HOST", a2);
            }
            return "https://" + a2 + "/deviceapi";
        } else if (!str.endsWith("/")) {
            return str;
        } else {
            dr drVar = a;
            drVar.d("hostname before: " + str);
            String substring = str.substring(0, str.length() + -1);
            dr drVar2 = a;
            drVar2.d("hostname after: " + substring);
            return substring;
        }
    }
}
