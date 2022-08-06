package g.d.a;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import g.d.a.a.c;
import g.d.a.e.b;

public class d {
    private static Context a;
    private static SharedPreferences b;
    private static String c;

    /* renamed from: d  reason: collision with root package name */
    private static c f9707d;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                g.d.a.e.b[] r0 = g.d.a.e.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                g.d.a.e.b r1 = g.d.a.e.b.PortalEnvironmentMYRENZCOM     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001d }
                g.d.a.e.b r1 = g.d.a.e.b.PortalEnvironmentDEMOMYRENZCOM     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0028 }
                g.d.a.e.b r1 = g.d.a.e.b.PortalEnvironmentSHOWMYRENZCOM     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0033 }
                g.d.a.e.b r1 = g.d.a.e.b.PortalEnvironmentHOTMYRENZCOM     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x003e }
                g.d.a.e.b r1 = g.d.a.e.b.PortalEnvironmentOWN     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: g.d.a.d.a.<clinit>():void");
        }
    }

    public static c a() {
        return f9707d;
    }

    public static Context b() {
        return a;
    }

    public static String c() {
        return c;
    }

    public static SharedPreferences d() {
        return b;
    }

    public static void e(Application application, String str) {
        String str2;
        a = application.getApplicationContext();
        h(b.PortalEnvironmentMYRENZCOM, (String) null);
        f9707d = new c(str);
        try {
            str2 = g.d.a.a.d.a.a(application, application.getApplicationContext().getPackageName()).b();
        } catch (Exception unused) {
            str2 = str.replace("-", "");
        }
        g.d.a.a.d.b bVar = new g.d.a.a.d.b();
        bVar.d(application);
        bVar.c(true);
        bVar.b(true);
        bVar.f("PKAPreferences");
        bVar.e(str2);
        SharedPreferences a2 = bVar.a();
        b = a2;
        try {
            a2.getAll().get("token");
        } catch (RuntimeException e2) {
            if (e2.getMessage().contains("javax.crypto.BadPaddingException")) {
                SharedPreferences.Editor edit = d().edit();
                edit.clear();
                edit.apply();
            }
        }
    }

    public static void f() {
        SharedPreferences.Editor edit = b.edit();
        edit.clear();
        edit.apply();
    }

    public static boolean g() {
        String str = (String) b.getAll().get("token");
        String str2 = (String) b.getAll().get("password");
        String str3 = (String) b.getAll().get("username");
        return str != null && !str.isEmpty() && str2 != null && !str2.isEmpty() && str3 != null && !str3.isEmpty();
    }

    public static void h(b bVar, String str) {
        String str2;
        int i2 = a.a[bVar.ordinal()];
        if (i2 == 1) {
            str2 = "https://rest.myrenz.com";
        } else if (i2 == 2) {
            str2 = "https://rest.demo.myrenz.com:443";
        } else if (i2 == 3) {
            str2 = "https://rest.show.myrenz.com:443";
        } else if (i2 == 4) {
            str2 = "https://rest.hot.myrenz.com:443";
        } else if (i2 == 5) {
            c = str;
            return;
        } else {
            return;
        }
        c = str2;
    }
}
