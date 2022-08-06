package com.google.android.gms.measurement.internal;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.h;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.m.c;
import com.google.android.gms.common.util.f;
import com.google.android.gms.internal.measurement.df;
import com.google.android.gms.internal.measurement.lb;
import com.google.android.gms.internal.measurement.vc;
import java.io.ByteArrayInputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
public final class fa extends d6 {

    /* renamed from: g  reason: collision with root package name */
    private static final String[] f2844g = {"firebase_", "google_", "ga_"};

    /* renamed from: h  reason: collision with root package name */
    private static final String[] f2845h = {"_err"};
    private SecureRandom c;

    /* renamed from: d  reason: collision with root package name */
    private final AtomicLong f2846d = new AtomicLong(0);

    /* renamed from: e  reason: collision with root package name */
    private int f2847e;

    /* renamed from: f  reason: collision with root package name */
    private Integer f2848f = null;

    fa(h5 h5Var) {
        super(h5Var);
    }

    static boolean B0(String str, String str2) {
        if (str == null && str2 == null) {
            return true;
        }
        if (str == null) {
            return false;
        }
        return str.equals(str2);
    }

    static boolean C0(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    public static Bundle D(List<ea> list) {
        Bundle bundle = new Bundle();
        if (list == null) {
            return bundle;
        }
        for (ea next : list) {
            String str = next.f2826k;
            if (str != null) {
                bundle.putString(next.f2823h, str);
            } else {
                Long l2 = next.f2825j;
                if (l2 != null) {
                    bundle.putLong(next.f2823h, l2.longValue());
                } else {
                    Double d2 = next.f2828m;
                    if (d2 != null) {
                        bundle.putDouble(next.f2823h, d2.doubleValue());
                    }
                }
            }
        }
        return bundle;
    }

    private final Object F(int i2, Object obj, boolean z, boolean z2) {
        Bundle B;
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf((long) ((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf((long) ((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf((long) ((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(((Boolean) obj).booleanValue() ? 1 : 0);
        } else if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        } else {
            if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
                return H(String.valueOf(obj), i2, z);
            }
            if (!lb.a() || !l().s(u.B0) || !l().s(u.A0) || !z2 || (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[]))) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Parcelable parcelable : (Parcelable[]) obj) {
                if ((parcelable instanceof Bundle) && (B = B((Bundle) parcelable)) != null && !B.isEmpty()) {
                    arrayList.add(B);
                }
            }
            return arrayList.toArray(new Bundle[arrayList.size()]);
        }
    }

    public static boolean F0(String str) {
        for (String equals : f2845h) {
            if (equals.equals(str)) {
                return false;
            }
        }
        return true;
    }

    private final int G0(String str) {
        if (!g0("event param", str)) {
            return 3;
        }
        if (!l0("event param", (String[]) null, str)) {
            return 14;
        }
        if (!f0("event param", 40, str)) {
            return 3;
        }
        return 0;
    }

    public static String H(String str, int i2, boolean z) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i2) {
            return str;
        }
        if (z) {
            return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i2))).concat("...");
        }
        return null;
    }

    private final int I0(String str) {
        if (!v0("event param", str)) {
            return 3;
        }
        if (!l0("event param", (String[]) null, str)) {
            return 14;
        }
        if (!f0("event param", 40, str)) {
            return 3;
        }
        return 0;
    }

    static MessageDigest J0() {
        int i2 = 0;
        while (i2 < 2) {
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                if (instance != null) {
                    return instance;
                }
                i2++;
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }

    private static void K(Bundle bundle, int i2, String str, String str2, Object obj) {
        if (u0(bundle, i2)) {
            bundle.putString("_ev", H(str, 40, true));
            if (obj != null) {
                r.k(bundle);
                if (obj == null) {
                    return;
                }
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", (long) String.valueOf(obj).length());
                }
            }
        }
    }

    private static boolean L0(String str) {
        r.k(str);
        return str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$");
    }

    private final int M0(String str) {
        if ("_ldl".equals(str)) {
            return 2048;
        }
        if ("_id".equals(str)) {
            return 256;
        }
        return (!l().s(u.i0) || !"_lgclid".equals(str)) ? 36 : 100;
    }

    private final void X(String str, String str2, String str3, Bundle bundle, List<String> list, boolean z) {
        int i2;
        int i3;
        String str4;
        int i4;
        String str5;
        String str6 = str2;
        Bundle bundle2 = bundle;
        List<String> list2 = list;
        if (bundle2 != null) {
            boolean s = l().s(u.C0);
            if (s) {
                i2 = 0;
            } else {
                i2 = l().x();
            }
            int i5 = 0;
            for (String str7 : new TreeSet(bundle.keySet())) {
                if (list2 == null || !list2.contains(str7)) {
                    i3 = z ? G0(str7) : 0;
                    if (i3 == 0) {
                        i3 = I0(str7);
                    }
                } else {
                    i3 = 0;
                }
                if (i3 != 0) {
                    K(bundle2, i3, str7, str7, i3 == 3 ? str7 : null);
                    bundle2.remove(str7);
                } else {
                    if (c0(bundle2.get(str7))) {
                        i().J().d("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str6, str3, str7);
                        i4 = 22;
                        str4 = str7;
                    } else {
                        String str8 = str3;
                        str4 = str7;
                        i4 = u(str, str2, str7, bundle2.get(str7), bundle, list, z, false);
                    }
                    if (i4 != 0 && !"_ev".equals(str4)) {
                        K(bundle2, i4, str4, str4, bundle2.get(str4));
                        bundle2.remove(str4);
                    } else if (d0(str4) && (!s || !k0(str4, i6.f2891d))) {
                        int i6 = i5 + 1;
                        if (i6 > i2) {
                            if (s) {
                                str5 = "Item cannot contain custom parameters";
                            } else {
                                StringBuilder sb = new StringBuilder(63);
                                sb.append("Child bundles can't contain more than ");
                                sb.append(i2);
                                sb.append(" custom params");
                                str5 = sb.toString();
                            }
                            i().G().c(str5, e().v(str6), e().t(bundle2));
                            u0(bundle2, s ? 23 : 5);
                            bundle2.remove(str4);
                        }
                        i5 = i6;
                    }
                }
            }
        }
    }

    static boolean Y(Context context, boolean z) {
        r.k(context);
        if (Build.VERSION.SDK_INT >= 24) {
            return t0(context, "com.google.android.gms.measurement.AppMeasurementJobService");
        }
        return t0(context, "com.google.android.gms.measurement.AppMeasurementService");
    }

    static boolean Z(Intent intent) {
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        return "android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra);
    }

    static boolean a0(Bundle bundle, int i2) {
        int i3 = 0;
        if (bundle.size() <= i2) {
            return false;
        }
        for (String str : new TreeSet(bundle.keySet())) {
            i3++;
            if (i3 > i2) {
                bundle.remove(str);
            }
        }
        return true;
    }

    static boolean b0(Boolean bool, Boolean bool2) {
        if (bool == null && bool2 == null) {
            return true;
        }
        if (bool == null) {
            return false;
        }
        return bool.equals(bool2);
    }

    static boolean c0(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    static boolean d0(String str) {
        r.g(str);
        if (str.charAt(0) != '_' || str.equals("_ep")) {
            return true;
        }
        return false;
    }

    static boolean j0(String str, String str2, String str3, String str4) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        if (!isEmpty && !isEmpty2) {
            return !str.equals(str2);
        }
        if (isEmpty && isEmpty2) {
            return (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) ? !TextUtils.isEmpty(str4) : !str3.equals(str4);
        }
        if (isEmpty || !isEmpty2) {
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        }
        if (TextUtils.isEmpty(str4)) {
            return false;
        }
        return TextUtils.isEmpty(str3) || !str3.equals(str4);
    }

    private static boolean k0(String str, String[] strArr) {
        r.k(strArr);
        for (String B0 : strArr) {
            if (B0(str, B0)) {
                return true;
            }
        }
        return false;
    }

    static boolean n0(List<String> list, List<String> list2) {
        if (list == null && list2 == null) {
            return true;
        }
        if (list == null) {
            return false;
        }
        return list.equals(list2);
    }

    static byte[] o0(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    public static Bundle r0(Bundle bundle) {
        if (bundle == null) {
            return new Bundle();
        }
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle2.keySet()) {
            Object obj = bundle2.get(str);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str, new Bundle((Bundle) obj));
            } else {
                int i2 = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i2 < parcelableArr.length) {
                        if (parcelableArr[i2] instanceof Bundle) {
                            parcelableArr[i2] = new Bundle((Bundle) parcelableArr[i2]);
                        }
                        i2++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i2 < list.size()) {
                        Object obj2 = list.get(i2);
                        if (obj2 instanceof Bundle) {
                            list.set(i2, new Bundle((Bundle) obj2));
                        }
                        i2++;
                    }
                }
            }
        }
        return bundle2;
    }

    public static ArrayList<Bundle> s0(List<ua> list) {
        if (list == null) {
            return new ArrayList<>(0);
        }
        ArrayList<Bundle> arrayList = new ArrayList<>(list.size());
        for (ua next : list) {
            Bundle bundle = new Bundle();
            bundle.putString("app_id", next.f3163g);
            bundle.putString("origin", next.f3164h);
            bundle.putLong("creation_timestamp", next.f3166j);
            bundle.putString("name", next.f3165i.f2823h);
            f6.b(bundle, next.f3165i.l());
            bundle.putBoolean("active", next.f3167k);
            String str = next.f3168l;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            s sVar = next.f3169m;
            if (sVar != null) {
                bundle.putString("timed_out_event_name", sVar.f3081g);
                n nVar = next.f3169m.f3082h;
                if (nVar != null) {
                    bundle.putBundle("timed_out_event_params", nVar.o());
                }
            }
            bundle.putLong("trigger_timeout", next.f3170n);
            s sVar2 = next.o;
            if (sVar2 != null) {
                bundle.putString("triggered_event_name", sVar2.f3081g);
                n nVar2 = next.o.f3082h;
                if (nVar2 != null) {
                    bundle.putBundle("triggered_event_params", nVar2.o());
                }
            }
            bundle.putLong("triggered_timestamp", next.f3165i.f2824i);
            bundle.putLong("time_to_live", next.p);
            s sVar3 = next.q;
            if (sVar3 != null) {
                bundle.putString("expired_event_name", sVar3.f3081g);
                n nVar3 = next.q.f3082h;
                if (nVar3 != null) {
                    bundle.putBundle("expired_event_params", nVar3.o());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    private static boolean t0(Context context, String str) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, str), 0)) == null || !serviceInfo.enabled) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00b0 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0166 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int u(java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.Object r21, android.os.Bundle r22, java.util.List<java.lang.String> r23, boolean r24, boolean r25) {
        /*
            r17 = this;
            r7 = r17
            r8 = r20
            r0 = r21
            r1 = r22
            r17.c()
            boolean r2 = com.google.android.gms.internal.measurement.lb.a()
            r3 = 17
            java.lang.String r4 = "param"
            r9 = 0
            if (r2 == 0) goto L_0x007f
            com.google.android.gms.measurement.internal.wa r2 = r17.l()
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r5 = com.google.android.gms.measurement.internal.u.C0
            boolean r2 = r2.s(r5)
            if (r2 == 0) goto L_0x007f
            boolean r2 = c0(r21)
            if (r2 == 0) goto L_0x008a
            if (r25 == 0) goto L_0x007c
            java.lang.String[] r2 = com.google.android.gms.measurement.internal.i6.c
            boolean r2 = k0(r8, r2)
            if (r2 != 0) goto L_0x0035
            r0 = 20
            return r0
        L_0x0035:
            com.google.android.gms.measurement.internal.h5 r2 = r7.a
            com.google.android.gms.measurement.internal.c8 r2 = r2.P()
            boolean r2 = r2.c0()
            if (r2 != 0) goto L_0x0044
            r0 = 25
            return r0
        L_0x0044:
            r2 = 200(0xc8, float:2.8E-43)
            boolean r5 = r7.w0(r4, r8, r2, r0)
            if (r5 != 0) goto L_0x008a
            boolean r5 = r0 instanceof android.os.Parcelable[]
            if (r5 == 0) goto L_0x0060
            r5 = r0
            android.os.Parcelable[] r5 = (android.os.Parcelable[]) r5
            int r6 = r5.length
            if (r6 <= r2) goto L_0x0079
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r5, r2)
            android.os.Parcelable[] r2 = (android.os.Parcelable[]) r2
            r1.putParcelableArray(r8, r2)
            goto L_0x0079
        L_0x0060:
            boolean r5 = r0 instanceof java.util.ArrayList
            if (r5 == 0) goto L_0x0079
            r5 = r0
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            int r6 = r5.size()
            if (r6 <= r2) goto L_0x0079
            java.util.ArrayList r6 = new java.util.ArrayList
            java.util.List r2 = r5.subList(r9, r2)
            r6.<init>(r2)
            r1.putParcelableArrayList(r8, r6)
        L_0x0079:
            r10 = 17
            goto L_0x008b
        L_0x007c:
            r0 = 21
            return r0
        L_0x007f:
            if (r25 == 0) goto L_0x008a
            r1 = 1000(0x3e8, float:1.401E-42)
            boolean r1 = r7.w0(r4, r8, r1, r0)
            if (r1 != 0) goto L_0x008a
            return r3
        L_0x008a:
            r10 = 0
        L_0x008b:
            com.google.android.gms.measurement.internal.wa r1 = r17.l()
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r2 = com.google.android.gms.measurement.internal.u.R
            r11 = r18
            boolean r1 = r1.C(r11, r2)
            if (r1 == 0) goto L_0x009f
            boolean r1 = C0(r19)
            if (r1 != 0) goto L_0x00a5
        L_0x009f:
            boolean r1 = C0(r20)
            if (r1 == 0) goto L_0x00a8
        L_0x00a5:
            r1 = 256(0x100, float:3.59E-43)
            goto L_0x00aa
        L_0x00a8:
            r1 = 100
        L_0x00aa:
            boolean r1 = r7.h0(r4, r8, r1, r0)
            if (r1 == 0) goto L_0x00b1
            return r10
        L_0x00b1:
            if (r25 == 0) goto L_0x0167
            boolean r1 = com.google.android.gms.internal.measurement.lb.a()
            r12 = 1
            if (r1 == 0) goto L_0x00c8
            com.google.android.gms.measurement.internal.wa r1 = r17.l()
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r2 = com.google.android.gms.measurement.internal.u.B0
            boolean r1 = r1.s(r2)
            if (r1 == 0) goto L_0x00c8
            r13 = 1
            goto L_0x00c9
        L_0x00c8:
            r13 = 0
        L_0x00c9:
            boolean r1 = r0 instanceof android.os.Bundle
            if (r1 == 0) goto L_0x00e4
            if (r13 == 0) goto L_0x00e1
            r4 = r0
            android.os.Bundle r4 = (android.os.Bundle) r4
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            r5 = r23
            r6 = r24
            r0.X(r1, r2, r3, r4, r5, r6)
        L_0x00e1:
            r9 = 1
            goto L_0x0164
        L_0x00e4:
            boolean r1 = r0 instanceof android.os.Parcelable[]
            if (r1 == 0) goto L_0x0123
            r14 = r0
            android.os.Parcelable[] r14 = (android.os.Parcelable[]) r14
            int r15 = r14.length
            r6 = 0
        L_0x00ed:
            if (r6 >= r15) goto L_0x00e1
            r0 = r14[r6]
            boolean r1 = r0 instanceof android.os.Bundle
            if (r1 != 0) goto L_0x0107
            com.google.android.gms.measurement.internal.c4 r1 = r17.i()
            com.google.android.gms.measurement.internal.e4 r1 = r1.J()
            java.lang.Class r0 = r0.getClass()
            java.lang.String r2 = "All Parcelable[] elements must be of type Bundle. Value type, name"
            r1.c(r2, r0, r8)
            goto L_0x0164
        L_0x0107:
            if (r13 == 0) goto L_0x011e
            r4 = r0
            android.os.Bundle r4 = (android.os.Bundle) r4
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            r5 = r23
            r16 = r6
            r6 = r24
            r0.X(r1, r2, r3, r4, r5, r6)
            goto L_0x0120
        L_0x011e:
            r16 = r6
        L_0x0120:
            int r6 = r16 + 1
            goto L_0x00ed
        L_0x0123:
            boolean r1 = r0 instanceof java.util.ArrayList
            if (r1 == 0) goto L_0x0164
            r14 = r0
            java.util.ArrayList r14 = (java.util.ArrayList) r14
            int r15 = r14.size()
            r0 = 0
        L_0x012f:
            if (r0 >= r15) goto L_0x00e1
            java.lang.Object r1 = r14.get(r0)
            int r16 = r0 + 1
            boolean r0 = r1 instanceof android.os.Bundle
            if (r0 != 0) goto L_0x014d
            com.google.android.gms.measurement.internal.c4 r0 = r17.i()
            com.google.android.gms.measurement.internal.e4 r0 = r0.J()
            java.lang.Class r1 = r1.getClass()
            java.lang.String r2 = "All ArrayList elements must be of type Bundle. Value type, name"
            r0.c(r2, r1, r8)
            goto L_0x0164
        L_0x014d:
            if (r13 == 0) goto L_0x0161
            r4 = r1
            android.os.Bundle r4 = (android.os.Bundle) r4
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            r5 = r23
            r6 = r24
            r0.X(r1, r2, r3, r4, r5, r6)
        L_0x0161:
            r0 = r16
            goto L_0x012f
        L_0x0164:
            if (r9 == 0) goto L_0x0167
            return r10
        L_0x0167:
            r0 = 4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.fa.u(java.lang.String, java.lang.String, java.lang.String, java.lang.Object, android.os.Bundle, java.util.List, boolean, boolean):int");
    }

    private static boolean u0(Bundle bundle, int i2) {
        if (bundle == null || bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", (long) i2);
        return true;
    }

    public static long w(long j2, long j3) {
        return (j2 + (j3 * 60000)) / 86400000;
    }

    private final boolean w0(String str, String str2, int i2, Object obj) {
        int i3;
        if (obj instanceof Parcelable[]) {
            i3 = ((Parcelable[]) obj).length;
        } else {
            if (obj instanceof ArrayList) {
                i3 = ((ArrayList) obj).size();
            }
            return true;
        }
        if (i3 > i2) {
            i().J().d("Parameter array is too long; discarded. Value kind, name, array length", str, str2, Integer.valueOf(i3));
            return false;
        }
        return true;
    }

    static Bundle[] x0(Object obj) {
        if (obj instanceof Bundle) {
            return new Bundle[]{(Bundle) obj};
        } else if (obj instanceof Parcelable[]) {
            Parcelable[] parcelableArr = (Parcelable[]) obj;
            return (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
        } else if (!(obj instanceof ArrayList)) {
            return null;
        } else {
            ArrayList arrayList = (ArrayList) obj;
            return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
        }
    }

    public static long y(n nVar) {
        long j2 = 0;
        if (nVar == null) {
            return 0;
        }
        Iterator<String> it = nVar.iterator();
        while (it.hasNext()) {
            Object n2 = nVar.n(it.next());
            if (n2 instanceof Parcelable[]) {
                j2 += (long) ((Parcelable[]) n2).length;
            }
        }
        return j2;
    }

    static long z(byte[] bArr) {
        r.k(bArr);
        int i2 = 0;
        r.n(bArr.length > 0);
        long j2 = 0;
        int length = bArr.length - 1;
        while (length >= 0 && length >= bArr.length - 8) {
            j2 += (((long) bArr[length]) & 255) << i2;
            i2 += 8;
            length--;
        }
        return j2;
    }

    private final boolean z0(Context context, String str) {
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo d2 = c.a(context).d(str, 64);
            if (d2 == null || d2.signatures == null || d2.signatures.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(d2.signatures[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (CertificateException e2) {
            i().E().b("Error obtaining certificate", e2);
            return true;
        } catch (PackageManager.NameNotFoundException e3) {
            i().E().b("Package name not found", e3);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public final Bundle A(Uri uri) {
        String str;
        String str2;
        String str3;
        String str4;
        if (uri == null) {
            return null;
        }
        try {
            if (uri.isHierarchical()) {
                str4 = uri.getQueryParameter("utm_campaign");
                str3 = uri.getQueryParameter("utm_source");
                str2 = uri.getQueryParameter("utm_medium");
                str = uri.getQueryParameter("gclid");
            } else {
                str4 = null;
                str3 = null;
                str2 = null;
                str = null;
            }
            if (TextUtils.isEmpty(str4) && TextUtils.isEmpty(str3) && TextUtils.isEmpty(str2) && TextUtils.isEmpty(str)) {
                return null;
            }
            Bundle bundle = new Bundle();
            if (!TextUtils.isEmpty(str4)) {
                bundle.putString("campaign", str4);
            }
            if (!TextUtils.isEmpty(str3)) {
                bundle.putString("source", str3);
            }
            if (!TextUtils.isEmpty(str2)) {
                bundle.putString("medium", str2);
            }
            if (!TextUtils.isEmpty(str)) {
                bundle.putString("gclid", str);
            }
            String queryParameter = uri.getQueryParameter("utm_term");
            if (!TextUtils.isEmpty(queryParameter)) {
                bundle.putString("term", queryParameter);
            }
            String queryParameter2 = uri.getQueryParameter("utm_content");
            if (!TextUtils.isEmpty(queryParameter2)) {
                bundle.putString("content", queryParameter2);
            }
            String queryParameter3 = uri.getQueryParameter("aclid");
            if (!TextUtils.isEmpty(queryParameter3)) {
                bundle.putString("aclid", queryParameter3);
            }
            String queryParameter4 = uri.getQueryParameter("cp1");
            if (!TextUtils.isEmpty(queryParameter4)) {
                bundle.putString("cp1", queryParameter4);
            }
            String queryParameter5 = uri.getQueryParameter("anid");
            if (!TextUtils.isEmpty(queryParameter5)) {
                bundle.putString("anid", queryParameter5);
            }
            return bundle;
        } catch (UnsupportedOperationException e2) {
            i().H().b("Install referrer url isn't a hierarchical URI", e2);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean A0(String str) {
        c();
        if (c.a(j()).a(str) == 0) {
            return true;
        }
        i().L().b("Permission not granted", str);
        return false;
    }

    /* access modifiers changed from: package-private */
    public final Bundle B(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object G = G(str, bundle.get(str));
                if (G == null) {
                    i().J().b("Param value can't be null", e().y(str));
                } else {
                    N(bundle2, str, G);
                }
            }
        }
        return bundle2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: java.lang.String} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle C(java.lang.String r20, java.lang.String r21, android.os.Bundle r22, java.util.List<java.lang.String> r23, boolean r24, boolean r25) {
        /*
            r19 = this;
            r9 = r19
            r10 = r21
            r11 = r22
            r12 = r23
            boolean r0 = com.google.android.gms.internal.measurement.lb.a()
            if (r0 == 0) goto L_0x001d
            com.google.android.gms.measurement.internal.wa r0 = r19.l()
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r1 = com.google.android.gms.measurement.internal.u.C0
            boolean r0 = r0.s(r1)
            if (r0 == 0) goto L_0x001d
            r0 = 1
            r14 = 1
            goto L_0x001e
        L_0x001d:
            r14 = 0
        L_0x001e:
            if (r14 == 0) goto L_0x0028
            java.lang.String[] r0 = com.google.android.gms.measurement.internal.e6.f2809d
            boolean r0 = k0(r10, r0)
            r15 = r0
            goto L_0x002a
        L_0x0028:
            r15 = r25
        L_0x002a:
            r16 = 0
            if (r11 == 0) goto L_0x012c
            android.os.Bundle r8 = new android.os.Bundle
            r8.<init>(r11)
            com.google.android.gms.measurement.internal.wa r0 = r19.l()
            int r7 = r0.x()
            com.google.android.gms.measurement.internal.wa r0 = r19.l()
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r1 = com.google.android.gms.measurement.internal.u.a0
            r6 = r20
            boolean r0 = r0.C(r6, r1)
            if (r0 == 0) goto L_0x0053
            java.util.TreeSet r0 = new java.util.TreeSet
            java.util.Set r1 = r22.keySet()
            r0.<init>(r1)
            goto L_0x0057
        L_0x0053:
            java.util.Set r0 = r22.keySet()
        L_0x0057:
            java.util.Iterator r17 = r0.iterator()
            r18 = 0
        L_0x005d:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x0129
            java.lang.Object r0 = r17.next()
            r5 = r0
            java.lang.String r5 = (java.lang.String) r5
            if (r12 == 0) goto L_0x0075
            boolean r0 = r12.contains(r5)
            if (r0 != 0) goto L_0x0073
            goto L_0x0075
        L_0x0073:
            r0 = 0
            goto L_0x0083
        L_0x0075:
            if (r24 == 0) goto L_0x007c
            int r0 = r9.G0(r5)
            goto L_0x007d
        L_0x007c:
            r0 = 0
        L_0x007d:
            if (r0 != 0) goto L_0x0083
            int r0 = r9.I0(r5)
        L_0x0083:
            if (r0 == 0) goto L_0x0095
            r1 = 3
            if (r0 != r1) goto L_0x008a
            r1 = r5
            goto L_0x008c
        L_0x008a:
            r1 = r16
        L_0x008c:
            K(r8, r0, r5, r5, r1)
            r8.remove(r5)
            r9 = r7
            r12 = r8
            goto L_0x00d4
        L_0x0095:
            java.lang.Object r4 = r11.get(r5)
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r5
            r13 = r5
            r5 = r8
            r6 = r23
            r9 = r7
            r7 = r24
            r12 = r8
            r8 = r15
            int r0 = r0.u(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r14 == 0) goto L_0x00b9
            r1 = 17
            if (r0 != r1) goto L_0x00b9
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            K(r12, r0, r13, r13, r1)
            goto L_0x00dd
        L_0x00b9:
            if (r0 == 0) goto L_0x00dd
            java.lang.String r1 = "_ev"
            boolean r1 = r1.equals(r13)
            if (r1 != 0) goto L_0x00dd
            r1 = 21
            if (r0 != r1) goto L_0x00c9
            r5 = r10
            goto L_0x00ca
        L_0x00c9:
            r5 = r13
        L_0x00ca:
            java.lang.Object r1 = r11.get(r13)
            K(r12, r0, r5, r13, r1)
            r12.remove(r13)
        L_0x00d4:
            r6 = r20
        L_0x00d6:
            r7 = r9
            r8 = r12
            r9 = r19
            r12 = r23
            goto L_0x005d
        L_0x00dd:
            boolean r0 = d0(r13)
            if (r0 == 0) goto L_0x00d4
            int r0 = r18 + 1
            if (r0 <= r9) goto L_0x0126
            r1 = 48
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.lang.String r1 = "Event can't contain more than "
            r2.append(r1)
            r2.append(r9)
            java.lang.String r1 = " params"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.google.android.gms.measurement.internal.c4 r2 = r19.i()
            com.google.android.gms.measurement.internal.e4 r2 = r2.G()
            com.google.android.gms.measurement.internal.a4 r3 = r19.e()
            java.lang.String r3 = r3.v(r10)
            com.google.android.gms.measurement.internal.a4 r4 = r19.e()
            java.lang.String r4 = r4.t(r11)
            r2.c(r1, r3, r4)
            r1 = 5
            u0(r12, r1)
            r12.remove(r13)
            r6 = r20
            r18 = r0
            goto L_0x00d6
        L_0x0126:
            r18 = r0
            goto L_0x00d4
        L_0x0129:
            r12 = r8
            r16 = r12
        L_0x012c:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.fa.C(java.lang.String, java.lang.String, android.os.Bundle, java.util.List, boolean, boolean):android.os.Bundle");
    }

    /* access modifiers changed from: package-private */
    public final boolean D0(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return l().O().equals(str);
    }

    /* access modifiers changed from: package-private */
    public final s E(String str, String str2, Bundle bundle, String str3, long j2, boolean z, boolean z2, boolean z3) {
        String str4 = str2;
        Bundle bundle2 = bundle;
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (v(str2, z3) == 0) {
            Bundle bundle3 = bundle2 != null ? new Bundle(bundle) : new Bundle();
            String str5 = str3;
            bundle3.putString("_o", str3);
            return new s(str2, new n(B(C(str, str2, bundle3, f.c("_o"), false, false))), str3, j2);
        }
        i().E().b("Invalid conditional property event name", e().z(str2));
        throw new IllegalArgumentException();
    }

    public final long E0() {
        long andIncrement;
        long j2;
        if (this.f2846d.get() == 0) {
            synchronized (this.f2846d) {
                long nextLong = new Random(System.nanoTime() ^ f().b()).nextLong();
                int i2 = this.f2847e + 1;
                this.f2847e = i2;
                j2 = nextLong + ((long) i2);
            }
            return j2;
        }
        synchronized (this.f2846d) {
            this.f2846d.compareAndSet(-1, 1);
            andIncrement = this.f2846d.getAndIncrement();
        }
        return andIncrement;
    }

    /* access modifiers changed from: package-private */
    public final Object G(String str, Object obj) {
        int i2 = 256;
        if ("_ev".equals(str)) {
            return F(256, obj, true, true);
        }
        if (!C0(str)) {
            i2 = 100;
        }
        return F(i2, obj, false, true);
    }

    /* access modifiers changed from: package-private */
    public final SecureRandom H0() {
        c();
        if (this.c == null) {
            this.c = new SecureRandom();
        }
        return this.c;
    }

    public final URL I(long j2, String str, String str2, long j3) {
        try {
            r.g(str2);
            r.g(str);
            String format = String.format("https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s", new Object[]{String.format("v%s.%s", new Object[]{Long.valueOf(j2), Integer.valueOf(K0())}), str2, str, Long.valueOf(j3)});
            if (str.equals(l().P())) {
                format = format.concat("&ddl_test=1");
            }
            return new URL(format);
        } catch (IllegalArgumentException | MalformedURLException e2) {
            i().E().b("Failed to create BOW URL for Deferred Deep Link. exception", e2.getMessage());
            return null;
        }
    }

    public final void J(int i2, String str, String str2, int i3) {
        W((String) null, i2, str, str2, i3);
    }

    public final int K0() {
        if (this.f2848f == null) {
            this.f2848f = Integer.valueOf(com.google.android.gms.common.f.f().a(j()) / 1000);
        }
        return this.f2848f.intValue();
    }

    /* access modifiers changed from: package-private */
    public final void L(Bundle bundle, long j2) {
        long j3 = bundle.getLong("_et");
        if (j3 != 0) {
            i().H().b("Params already contained engagement", Long.valueOf(j3));
        }
        bundle.putLong("_et", j2 + j3);
    }

    /* access modifiers changed from: package-private */
    public final void M(Bundle bundle, Bundle bundle2) {
        if (bundle2 != null) {
            for (String str : bundle2.keySet()) {
                if (!bundle.containsKey(str)) {
                    g().N(bundle, str, bundle2.get(str));
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void N(Bundle bundle, String str, Object obj) {
        if (bundle != null) {
            if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof String) {
                bundle.putString(str, String.valueOf(obj));
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (lb.a() && l().s(u.B0) && l().s(u.A0) && (obj instanceof Bundle[])) {
                bundle.putParcelableArray(str, (Bundle[]) obj);
            } else if (str != null) {
                i().J().c("Not putting event parameter. Invalid value type. name, type", e().y(str), obj != null ? obj.getClass().getSimpleName() : null);
            }
        }
    }

    public final boolean N0() {
        try {
            j().getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public final void O(df dfVar, int i2) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i2);
        try {
            dfVar.f(bundle);
        } catch (RemoteException e2) {
            this.a.i().H().b("Error returning int value to wrapper", e2);
        }
    }

    public final void P(df dfVar, long j2) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j2);
        try {
            dfVar.f(bundle);
        } catch (RemoteException e2) {
            this.a.i().H().b("Error returning long value to wrapper", e2);
        }
    }

    public final void Q(df dfVar, Bundle bundle) {
        try {
            dfVar.f(bundle);
        } catch (RemoteException e2) {
            this.a.i().H().b("Error returning bundle value to wrapper", e2);
        }
    }

    public final void R(df dfVar, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            dfVar.f(bundle);
        } catch (RemoteException e2) {
            this.a.i().H().b("Error returning string value to wrapper", e2);
        }
    }

    public final void S(df dfVar, ArrayList<Bundle> arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            dfVar.f(bundle);
        } catch (RemoteException e2) {
            this.a.i().H().b("Error returning bundle list to wrapper", e2);
        }
    }

    public final void T(df dfVar, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z);
        try {
            dfVar.f(bundle);
        } catch (RemoteException e2) {
            this.a.i().H().b("Error returning boolean value to wrapper", e2);
        }
    }

    public final void U(df dfVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            dfVar.f(bundle);
        } catch (RemoteException e2) {
            this.a.i().H().b("Error returning byte array to wrapper", e2);
        }
    }

    /* access modifiers changed from: package-private */
    public final void V(h4 h4Var, int i2) {
        int i3 = 0;
        for (String str : new TreeSet(h4Var.f2867d.keySet())) {
            if (d0(str) && (i3 = i3 + 1) > i2) {
                StringBuilder sb = new StringBuilder(48);
                sb.append("Event can't contain more than ");
                sb.append(i2);
                sb.append(" params");
                i().G().c(sb.toString(), e().v(h4Var.a), e().t(h4Var.f2867d));
                u0(h4Var.f2867d, 5);
                h4Var.f2867d.remove(str);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void W(String str, int i2, String str2, String str3, int i3) {
        Bundle bundle = new Bundle();
        u0(bundle, i2);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i2 == 6 || i2 == 7 || i2 == 2) {
            bundle.putLong("_el", (long) i3);
        }
        this.a.F().X("auto", "_err", bundle);
    }

    /* access modifiers changed from: package-private */
    @SuppressLint({"ApplySharedPref"})
    public final boolean e0(String str, double d2) {
        try {
            SharedPreferences.Editor edit = j().getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
            edit.putString("deeplink", str);
            edit.putLong("timestamp", Double.doubleToRawLongBits(d2));
            return edit.commit();
        } catch (Exception e2) {
            i().E().b("Failed to persist Deferred Deep Link. exception", e2);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean f0(String str, int i2, String str2) {
        if (str2 == null) {
            i().G().b("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.codePointCount(0, str2.length()) <= i2) {
            return true;
        } else {
            i().G().d("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i2), str2);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean g0(String str, String str2) {
        if (str2 == null) {
            i().G().b("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            i().G().b("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (!Character.isLetter(codePointAt)) {
                i().G().c("Name must start with a letter. Type, name", str, str2);
                return false;
            }
            int length = str2.length();
            int charCount = Character.charCount(codePointAt);
            while (charCount < length) {
                int codePointAt2 = str2.codePointAt(charCount);
                if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                    charCount += Character.charCount(codePointAt2);
                } else {
                    i().G().c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                    return false;
                }
            }
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean h0(String str, String str2, int i2, Object obj) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            String valueOf = String.valueOf(obj);
            if (valueOf.codePointCount(0, valueOf.length()) > i2) {
                i().J().d("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(valueOf.length()));
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final boolean i0(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str)) {
            if (L0(str)) {
                return true;
            }
            if (this.a.J()) {
                i().G().b("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", c4.w(str));
            }
            return false;
        } else if (vc.a() && l().s(u.k0) && !TextUtils.isEmpty(str3)) {
            return true;
        } else {
            if (TextUtils.isEmpty(str2)) {
                if (this.a.J()) {
                    i().G().a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
                }
                return false;
            } else if (L0(str2)) {
                return true;
            } else {
                i().G().b("Invalid admob_app_id. Analytics disabled.", c4.w(str2));
                return false;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean l0(String str, String[] strArr, String str2) {
        return m0(str, strArr, (String[]) null, str2);
    }

    /* access modifiers changed from: protected */
    public final void m() {
        c();
        SecureRandom secureRandom = new SecureRandom();
        long nextLong = secureRandom.nextLong();
        if (nextLong == 0) {
            nextLong = secureRandom.nextLong();
            if (nextLong == 0) {
                i().H().a("Utils falling back to Random for random id");
            }
        }
        this.f2846d.set(nextLong);
    }

    /* access modifiers changed from: package-private */
    public final boolean m0(String str, String[] strArr, String[] strArr2, String str2) {
        boolean z;
        if (str2 == null) {
            i().G().b("Name is required and can't be null. Type", str);
            return false;
        }
        r.k(str2);
        String[] strArr3 = f2844g;
        int length = strArr3.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                z = false;
                break;
            } else if (str2.startsWith(strArr3[i2])) {
                z = true;
                break;
            } else {
                i2++;
            }
        }
        if (z) {
            i().G().c("Name starts with reserved prefix. Type, name", str, str2);
            return false;
        } else if (strArr == null || !k0(str2, strArr) || (strArr2 != null && k0(str2, strArr2))) {
            return true;
        } else {
            i().G().c("Name is reserved. Type, name", str, str2);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public final int p0(String str) {
        if (!v0("user property", str)) {
            return 6;
        }
        if (!l0("user property", h6.a, str)) {
            return 15;
        }
        if (!f0("user property", 24, str)) {
            return 6;
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    public final int q0(String str, Object obj) {
        boolean z;
        if ("_ldl".equals(str)) {
            z = h0("user property referrer", str, M0(str), obj);
        } else {
            z = h0("user property", str, M0(str), obj);
        }
        return z ? 0 : 7;
    }

    /* access modifiers changed from: protected */
    public final boolean r() {
        return true;
    }

    public final int t(int i2) {
        return com.google.android.gms.common.f.f().h(j(), h.a);
    }

    /* access modifiers changed from: package-private */
    public final int v(String str, boolean z) {
        if (!v0("event", str)) {
            return 2;
        }
        if (z) {
            if (!m0("event", e6.a, e6.b, str)) {
                return 13;
            }
        } else if (!l0("event", e6.a, str)) {
            return 13;
        }
        if (!f0("event", 40, str)) {
            return 2;
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    public final boolean v0(String str, String str2) {
        if (str2 == null) {
            i().G().b("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            i().G().b("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (Character.isLetter(codePointAt) || codePointAt == 95) {
                int length = str2.length();
                int charCount = Character.charCount(codePointAt);
                while (charCount < length) {
                    int codePointAt2 = str2.codePointAt(charCount);
                    if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                        charCount += Character.charCount(codePointAt2);
                    } else {
                        i().G().c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                        return false;
                    }
                }
                return true;
            }
            i().G().c("Name must start with a letter or _ (underscore). Type, name", str, str2);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public final long x(Context context, String str) {
        c();
        r.k(context);
        r.g(str);
        PackageManager packageManager = context.getPackageManager();
        MessageDigest J0 = J0();
        if (J0 == null) {
            i().E().a("Could not get MD5 instance");
            return -1;
        }
        if (packageManager != null) {
            try {
                if (!z0(context, str)) {
                    PackageInfo d2 = c.a(context).d(j().getPackageName(), 64);
                    if (d2.signatures != null && d2.signatures.length > 0) {
                        return z(J0.digest(d2.signatures[0].toByteArray()));
                    }
                    i().H().a("Could not get signatures");
                    return -1;
                }
            } catch (PackageManager.NameNotFoundException e2) {
                i().E().b("Package name not found", e2);
            }
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    public final Object y0(String str, Object obj) {
        if ("_ldl".equals(str)) {
            return F(M0(str), obj, true, false);
        }
        return F(M0(str), obj, false, false);
    }
}
