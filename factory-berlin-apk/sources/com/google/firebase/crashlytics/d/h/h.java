package com.google.firebase.crashlytics.d.h;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.hardware.SensorManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Debug;
import android.os.StatFs;
import android.provider.Settings;
import android.text.TextUtils;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

/* compiled from: CommonUtils */
public class h {
    private static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    private static long b = -1;
    public static final Comparator<File> c = new a();

    /* compiled from: CommonUtils */
    class a implements Comparator<File> {
        a() {
        }

        /* renamed from: a */
        public int compare(File file, File file2) {
            return (int) (file.lastModified() - file2.lastModified());
        }
    }

    /* compiled from: CommonUtils */
    enum b {
        X86_32,
        X86_64,
        ARM_UNKNOWN,
        PPC,
        PPC64,
        ARMV6,
        ARMV7,
        UNKNOWN,
        ARMV7S,
        ARM64;
        
        private static final Map<String, b> q = null;

        static {
            HashMap hashMap = new HashMap(4);
            q = hashMap;
            hashMap.put("armeabi-v7a", ARMV7);
            q.put("armeabi", ARMV6);
            q.put("arm64-v8a", ARM64);
            q.put("x86", X86_32);
        }

        static b a() {
            b bVar = UNKNOWN;
            String str = Build.CPU_ABI;
            if (TextUtils.isEmpty(str)) {
                com.google.firebase.crashlytics.d.b.f().b("Architecture#getValue()::Build.CPU_ABI returned null or empty");
                return bVar;
            }
            b bVar2 = q.get(str.toLowerCase(Locale.US));
            return bVar2 == null ? bVar : bVar2;
        }
    }

    public static boolean A() {
        return Debug.isDebuggerConnected() || Debug.waitingForDebugger();
    }

    public static boolean B(Context context) {
        return "sdk".equals(Build.PRODUCT) || "google_sdk".equals(Build.PRODUCT) || Settings.Secure.getString(context.getContentResolver(), "android_id") == null;
    }

    public static boolean C(String str) {
        return str == null || str.length() == 0;
    }

    public static boolean D(Context context) {
        boolean B = B(context);
        String str = Build.TAGS;
        if ((!B && str != null && str.contains("test-keys")) || new File("/system/app/Superuser.apk").exists()) {
            return true;
        }
        File file = new File("/system/xbin/su");
        if (B || !file.exists()) {
            return false;
        }
        return true;
    }

    public static String E(Context context) {
        int s = s(context, "com.google.firebase.crashlytics.unity_version", "string");
        if (s == 0) {
            return null;
        }
        String string = context.getResources().getString(s);
        com.google.firebase.crashlytics.d.b f2 = com.google.firebase.crashlytics.d.b.f();
        f2.b("Unity Editor version is: " + string);
        return string;
    }

    public static String F(InputStream inputStream) {
        return w(inputStream, "SHA-1");
    }

    public static String G(String str) {
        return x(str, "SHA-1");
    }

    public static String H(InputStream inputStream) {
        Scanner useDelimiter = new Scanner(inputStream).useDelimiter("\\A");
        return useDelimiter.hasNext() ? useDelimiter.next() : "";
    }

    public static long a(Context context) {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        return memoryInfo.availMem;
    }

    public static long b(String str) {
        StatFs statFs = new StatFs(str);
        long blockSize = (long) statFs.getBlockSize();
        return (((long) statFs.getBlockCount()) * blockSize) - (blockSize * ((long) statFs.getAvailableBlocks()));
    }

    @SuppressLint({"MissingPermission"})
    public static boolean c(Context context) {
        if (!d(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return true;
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnectedOrConnecting()) {
            return false;
        }
        return true;
    }

    public static boolean d(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    public static void e(Closeable closeable, String str) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e2) {
                com.google.firebase.crashlytics.d.b.f().e(str, e2);
            }
        }
    }

    public static void f(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    static long g(String str, String str2, int i2) {
        return Long.parseLong(str.split(str2)[0].trim()) * ((long) i2);
    }

    public static String h(String... strArr) {
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        for (String str : strArr) {
            if (str != null) {
                arrayList.add(str.replace("-", "").toLowerCase(Locale.US));
            }
        }
        Collections.sort(arrayList);
        StringBuilder sb = new StringBuilder();
        for (String append : arrayList) {
            sb.append(append);
        }
        String sb2 = sb.toString();
        if (sb2.length() > 0) {
            return G(sb2);
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v2, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r2v3 */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String i(java.io.File r6, java.lang.String r7) {
        /*
            java.lang.String r0 = "Failed to close system file reader."
            boolean r1 = r6.exists()
            r2 = 0
            if (r1 == 0) goto L_0x005f
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ Exception -> 0x003e, all -> 0x003c }
            java.io.FileReader r3 = new java.io.FileReader     // Catch:{ Exception -> 0x003e, all -> 0x003c }
            r3.<init>(r6)     // Catch:{ Exception -> 0x003e, all -> 0x003c }
            r4 = 1024(0x400, float:1.435E-42)
            r1.<init>(r3, r4)     // Catch:{ Exception -> 0x003e, all -> 0x003c }
        L_0x0015:
            java.lang.String r3 = r1.readLine()     // Catch:{ Exception -> 0x003a }
            if (r3 == 0) goto L_0x0036
            java.lang.String r4 = "\\s*:\\s*"
            java.util.regex.Pattern r4 = java.util.regex.Pattern.compile(r4)     // Catch:{ Exception -> 0x003a }
            r5 = 2
            java.lang.String[] r3 = r4.split(r3, r5)     // Catch:{ Exception -> 0x003a }
            int r4 = r3.length     // Catch:{ Exception -> 0x003a }
            r5 = 1
            if (r4 <= r5) goto L_0x0015
            r4 = 0
            r4 = r3[r4]     // Catch:{ Exception -> 0x003a }
            boolean r4 = r4.equals(r7)     // Catch:{ Exception -> 0x003a }
            if (r4 == 0) goto L_0x0015
            r6 = r3[r5]     // Catch:{ Exception -> 0x003a }
            r2 = r6
        L_0x0036:
            e(r1, r0)
            goto L_0x005f
        L_0x003a:
            r7 = move-exception
            goto L_0x0040
        L_0x003c:
            r6 = move-exception
            goto L_0x005b
        L_0x003e:
            r7 = move-exception
            r1 = r2
        L_0x0040:
            com.google.firebase.crashlytics.d.b r3 = com.google.firebase.crashlytics.d.b.f()     // Catch:{ all -> 0x0059 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0059 }
            r4.<init>()     // Catch:{ all -> 0x0059 }
            java.lang.String r5 = "Error parsing "
            r4.append(r5)     // Catch:{ all -> 0x0059 }
            r4.append(r6)     // Catch:{ all -> 0x0059 }
            java.lang.String r6 = r4.toString()     // Catch:{ all -> 0x0059 }
            r3.e(r6, r7)     // Catch:{ all -> 0x0059 }
            goto L_0x0036
        L_0x0059:
            r6 = move-exception
            r2 = r1
        L_0x005b:
            e(r2, r0)
            throw r6
        L_0x005f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.d.h.h.i(java.io.File, java.lang.String):java.lang.String");
    }

    public static void j(Flushable flushable, String str) {
        if (flushable != null) {
            try {
                flushable.flush();
            } catch (IOException e2) {
                com.google.firebase.crashlytics.d.b.f().e(str, e2);
            }
        }
    }

    public static ActivityManager.RunningAppProcessInfo k(String str, Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
                if (next.processName.equals(str)) {
                    return next;
                }
            }
        }
        return null;
    }

    public static boolean l(Context context, String str, boolean z) {
        Resources resources;
        if (!(context == null || (resources = context.getResources()) == null)) {
            int s = s(context, str, "bool");
            if (s > 0) {
                return resources.getBoolean(s);
            }
            int s2 = s(context, str, "string");
            if (s2 > 0) {
                return Boolean.parseBoolean(context.getString(s2));
            }
        }
        return z;
    }

    public static int m() {
        return b.a().ordinal();
    }

    public static int n(Context context) {
        int i2 = B(context) ? 1 : 0;
        if (D(context)) {
            i2 |= 2;
        }
        return A() ? i2 | 4 : i2;
    }

    public static SharedPreferences o(Context context) {
        return context.getSharedPreferences("com.crashlytics.prefs", 0);
    }

    public static String p(Context context) {
        int s = s(context, "com.google.firebase.crashlytics.mapping_file_id", "string");
        if (s == 0) {
            s = s(context, "com.crashlytics.android.build_id", "string");
        }
        if (s != 0) {
            return context.getResources().getString(s);
        }
        return null;
    }

    public static boolean q(Context context) {
        if (!B(context) && ((SensorManager) context.getSystemService("sensor")).getDefaultSensor(8) != null) {
            return true;
        }
        return false;
    }

    public static String r(Context context) {
        int i2 = context.getApplicationContext().getApplicationInfo().icon;
        if (i2 <= 0) {
            return context.getPackageName();
        }
        try {
            return context.getResources().getResourcePackageName(i2);
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }

    public static int s(Context context, String str, String str2) {
        return context.getResources().getIdentifier(str, str2, r(context));
    }

    public static SharedPreferences t(Context context) {
        return context.getSharedPreferences("com.google.firebase.crashlytics", 0);
    }

    public static String u(Context context, String str) {
        int s = s(context, str, "string");
        return s > 0 ? context.getString(s) : "";
    }

    public static synchronized long v() {
        long j2;
        synchronized (h.class) {
            if (b == -1) {
                long j3 = 0;
                String i2 = i(new File("/proc/meminfo"), "MemTotal");
                if (!TextUtils.isEmpty(i2)) {
                    String upperCase = i2.toUpperCase(Locale.US);
                    try {
                        if (upperCase.endsWith("KB")) {
                            j3 = g(upperCase, "KB", 1024);
                        } else if (upperCase.endsWith("MB")) {
                            j3 = g(upperCase, "MB", 1048576);
                        } else if (upperCase.endsWith("GB")) {
                            j3 = g(upperCase, "GB", 1073741824);
                        } else {
                            com.google.firebase.crashlytics.d.b f2 = com.google.firebase.crashlytics.d.b.f();
                            f2.b("Unexpected meminfo format while computing RAM: " + upperCase);
                        }
                    } catch (NumberFormatException e2) {
                        com.google.firebase.crashlytics.d.b f3 = com.google.firebase.crashlytics.d.b.f();
                        f3.e("Unexpected meminfo format while computing RAM: " + upperCase, e2);
                    }
                }
                b = j3;
            }
            j2 = b;
        }
        return j2;
    }

    private static String w(InputStream inputStream, String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance(str);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    return z(instance.digest());
                }
                instance.update(bArr, 0, read);
            }
        } catch (Exception e2) {
            com.google.firebase.crashlytics.d.b.f().e("Could not calculate hash for app icon.", e2);
            return "";
        }
    }

    private static String x(String str, String str2) {
        return y(str.getBytes(), str2);
    }

    private static String y(byte[] bArr, String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance(str);
            instance.update(bArr);
            return z(instance.digest());
        } catch (NoSuchAlgorithmException e2) {
            com.google.firebase.crashlytics.d.b f2 = com.google.firebase.crashlytics.d.b.f();
            f2.e("Could not create hashing algorithm: " + str + ", returning empty string.", e2);
            return "";
        }
    }

    public static String z(byte[] bArr) {
        char[] cArr = new char[(bArr.length * 2)];
        for (int i2 = 0; i2 < bArr.length; i2++) {
            byte b2 = bArr[i2] & 255;
            int i3 = i2 * 2;
            char[] cArr2 = a;
            cArr[i3] = cArr2[b2 >>> 4];
            cArr[i3 + 1] = cArr2[b2 & 15];
        }
        return new String(cArr);
    }
}
