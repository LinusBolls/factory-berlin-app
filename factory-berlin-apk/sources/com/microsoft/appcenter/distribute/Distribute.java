package com.microsoft.appcenter.distribute;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.widget.Toast;
import com.microsoft.appcenter.distribute.l.b;
import com.microsoft.appcenter.http.HttpException;
import com.microsoft.appcenter.http.d;
import com.microsoft.appcenter.utils.DeviceInfoHelper;
import com.microsoft.appcenter.utils.m.a;
import com.microsoft.appcenter.utils.n.e;
import java.lang.ref.WeakReference;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;

public class Distribute extends com.microsoft.appcenter.a {
    @SuppressLint({"StaticFieldLeak"})
    private static Distribute P;
    private Dialog A;
    private Dialog B;
    private Dialog C;
    private Dialog D;
    private WeakReference<Activity> E = new WeakReference<>((Object) null);
    private com.microsoft.appcenter.distribute.l.b F;
    private i G;
    private boolean H;
    private boolean I;
    private com.microsoft.appcenter.distribute.k.a J;
    private b K;
    private Boolean L;
    private boolean M;
    private boolean N;
    private boolean O;

    /* renamed from: i  reason: collision with root package name */
    private final Map<String, com.microsoft.appcenter.k.d.i.f> f4437i;

    /* renamed from: j  reason: collision with root package name */
    private String f4438j = "https://install.appcenter.ms";

    /* renamed from: k  reason: collision with root package name */
    private String f4439k = "https://api.appcenter.ms/v0.1";

    /* renamed from: l  reason: collision with root package name */
    private Context f4440l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public String f4441m;

    /* renamed from: n  reason: collision with root package name */
    private PackageInfo f4442n;
    private Activity o;
    private boolean p;
    private boolean q;
    private String r;
    private String s;
    private String t;
    private String u;
    private String v;
    private int w = 1;
    private Object x;
    private com.microsoft.appcenter.http.k y;
    private h z;

    class a implements DialogInterface.OnCancelListener {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ h f4443g;

        a(h hVar) {
            this.f4443g = hVar;
        }

        public void onCancel(DialogInterface dialogInterface) {
            Distribute.this.K(this.f4443g);
        }
    }

    class b implements DialogInterface.OnClickListener {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ h f4445g;

        b(h hVar) {
            this.f4445g = hVar;
        }

        public void onClick(DialogInterface dialogInterface, int i2) {
            Distribute.this.T(this.f4445g);
        }
    }

    class c implements DialogInterface.OnClickListener {
        c() {
        }

        public void onClick(DialogInterface dialogInterface, int i2) {
            Distribute.this.x0(dialogInterface);
        }
    }

    class d implements DialogInterface.OnClickListener {
        d() {
        }

        public void onClick(DialogInterface dialogInterface, int i2) {
            Distribute.this.W(dialogInterface);
        }
    }

    class e implements DialogInterface.OnClickListener {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ h f4449g;

        e(h hVar) {
            this.f4449g = hVar;
        }

        public void onClick(DialogInterface dialogInterface, int i2) {
            Distribute.this.X(this.f4449g);
        }
    }

    class f implements Runnable {
        f() {
        }

        public void run() {
            Distribute.this.f4411g.m(new com.microsoft.appcenter.distribute.m.a.a(), "group_distribute", 1);
        }
    }

    class g implements Runnable {
        g() {
        }

        public void run() {
            Distribute.this.f0();
        }
    }

    class h implements d.a {
        h() {
        }

        public void a(URL url, Map<String, String> map) {
            if (com.microsoft.appcenter.utils.a.d() <= 2) {
                String replaceAll = url.toString().replaceAll(Distribute.this.f4441m, com.microsoft.appcenter.http.j.f(Distribute.this.f4441m));
                com.microsoft.appcenter.utils.a.g("AppCenterDistribute", "Calling " + replaceAll + "...");
                HashMap hashMap = new HashMap(map);
                String str = (String) hashMap.get("x-api-token");
                if (str != null) {
                    hashMap.put("x-api-token", com.microsoft.appcenter.http.j.f(str));
                }
                com.microsoft.appcenter.utils.a.g("AppCenterDistribute", "Headers: " + hashMap);
            }
        }

        public String b() {
            return null;
        }
    }

    class i implements com.microsoft.appcenter.http.l {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ Object f4453g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ String f4454h;

        i(Object obj, String str) {
            this.f4453g = obj;
            this.f4454h = str;
        }

        public void a(com.microsoft.appcenter.http.i iVar) {
            try {
                String b = iVar.b();
                Distribute.this.V(this.f4453g, b, h.l(b), this.f4454h);
            } catch (JSONException e2) {
                b(e2);
            }
        }

        public void b(Exception exc) {
            Distribute.this.U(this.f4453g, exc);
        }
    }

    class j implements DialogInterface.OnClickListener {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ h f4456g;

        j(h hVar) {
            this.f4456g = hVar;
        }

        public void onClick(DialogInterface dialogInterface, int i2) {
            Distribute.this.N(this.f4456g);
        }
    }

    class k implements DialogInterface.OnClickListener {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ h f4458g;

        k(h hVar) {
            this.f4458g = hVar;
        }

        public void onClick(DialogInterface dialogInterface, int i2) {
            Distribute.this.c0(this.f4458g);
        }
    }

    class l implements DialogInterface.OnClickListener {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ h f4460g;

        l(h hVar) {
            this.f4460g = hVar;
        }

        public void onClick(DialogInterface dialogInterface, int i2) {
            Distribute.this.B0(this.f4460g);
        }
    }

    class m implements DialogInterface.OnClickListener {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ h f4462g;

        m(h hVar) {
            this.f4462g = hVar;
        }

        public void onClick(DialogInterface dialogInterface, int i2) {
            Distribute.this.K(this.f4462g);
        }
    }

    private Distribute() {
        HashMap hashMap = new HashMap();
        this.f4437i = hashMap;
        hashMap.put("distributionStartSession", new com.microsoft.appcenter.distribute.m.a.b.a());
    }

    private synchronized void A0(h hVar) {
        if (this.F != null) {
            if (hVar == null || hVar.c() != this.F.c().c()) {
                this.F.cancel();
            }
            this.F = null;
        } else if (hVar == null) {
            com.microsoft.appcenter.distribute.l.c.a(this.f4440l, (h) null, (b.a) null).cancel();
        }
        if (this.G != null) {
            this.G.g();
            this.G = null;
        }
        this.z = hVar;
        if (hVar != null) {
            i iVar = new i(this.f4440l, hVar);
            this.G = iVar;
            this.F = com.microsoft.appcenter.distribute.l.c.a(this.f4440l, this.z, iVar);
        }
    }

    /* access modifiers changed from: private */
    public void B0(h hVar) {
        try {
            this.o.startActivity(new Intent("android.intent.action.VIEW", hVar.g()));
        } catch (ActivityNotFoundException e2) {
            com.microsoft.appcenter.utils.a.c("AppCenterDistribute", "Failed to navigate to release notes.", e2);
        }
    }

    private boolean F(h hVar) {
        if (hVar.k()) {
            com.microsoft.appcenter.utils.a.a("AppCenterDistribute", "Release is mandatory, ignoring any postpone action.");
            return true;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long e2 = com.microsoft.appcenter.utils.o.d.e("Distribute.postpone_time", 0);
        if (currentTimeMillis < e2) {
            com.microsoft.appcenter.utils.a.a("AppCenterDistribute", "User clock has been changed in past, cleaning postpone state and showing dialog");
            com.microsoft.appcenter.utils.o.d.p("Distribute.postpone_time");
            return true;
        }
        long j2 = e2 + 86400000;
        if (currentTimeMillis >= j2) {
            return true;
        }
        com.microsoft.appcenter.utils.a.a("AppCenterDistribute", "Optional updates are postponed until " + new Date(j2));
        return false;
    }

    private synchronized void G() {
        if (c.c() == 3) {
            com.microsoft.appcenter.utils.a.a("AppCenterDistribute", "Delete notification");
            ((NotificationManager) this.f4440l.getSystemService("notification")).cancel(c.b());
        }
    }

    private synchronized void H() {
        if (this.y != null) {
            this.y.cancel();
            this.y = null;
        }
        this.x = null;
        this.A = null;
        this.B = null;
        this.C = null;
        this.D = null;
        this.E.clear();
        this.L = null;
        this.H = false;
        this.O = false;
        A0((h) null);
        com.microsoft.appcenter.utils.o.d.p("Distribute.release_details");
        com.microsoft.appcenter.utils.o.d.p("Distribute.download_state");
        com.microsoft.appcenter.utils.o.d.p("Distribute.download_time");
    }

    private void I() {
        String f2 = com.microsoft.appcenter.utils.o.d.f("Distribute.downloaded_release_hash");
        String f3 = com.microsoft.appcenter.utils.o.d.f("Distribute.downloaded_distribution_group_id");
        if (Z(f2) && !TextUtils.isEmpty(f3) && !f3.equals(com.microsoft.appcenter.utils.o.d.f("Distribute.distribution_group_id"))) {
            com.microsoft.appcenter.utils.a.a("AppCenterDistribute", "Current group ID doesn't match the group ID of downloaded release, updating current group id=" + f3);
            com.microsoft.appcenter.utils.o.d.n("Distribute.distribution_group_id", f3);
            com.microsoft.appcenter.utils.o.d.p("Distribute.downloaded_distribution_group_id");
        }
    }

    private void L(String str, String str2) {
        if (str != null) {
            e.c a2 = com.microsoft.appcenter.utils.n.e.e(this.f4440l).a(str);
            String b2 = a2.b();
            if (b2 != null) {
                com.microsoft.appcenter.utils.o.d.n("Distribute.update_token", b2);
            }
            str = a2.a();
        }
        Q(str2, str);
    }

    private synchronized void M() {
        a.C0130a c2 = com.microsoft.appcenter.utils.m.a.b().c(System.currentTimeMillis());
        if (c2 != null) {
            if (c2.b() != null) {
                s(new f());
                return;
            }
        }
        com.microsoft.appcenter.utils.a.a("AppCenterDistribute", "No sessions were logged before, ignore sending of the distribution start session log.");
    }

    private String O(String str) {
        return String.format(str, new Object[]{com.microsoft.appcenter.utils.b.a(this.f4440l), this.z.h(), Integer.valueOf(this.z.j())});
    }

    private String P() {
        return O(this.f4440l.getString(g.appcenter_distribute_install_ready_message));
    }

    private Notification.Builder R() {
        return new Notification.Builder(this.f4440l);
    }

    private String S(boolean z2, String str) {
        com.microsoft.appcenter.utils.a.a("AppCenterDistribute", "Check if we need to report release installation..");
        String f2 = com.microsoft.appcenter.utils.o.d.f("Distribute.downloaded_release_hash");
        String str2 = "";
        if (TextUtils.isEmpty(f2)) {
            com.microsoft.appcenter.utils.a.a("AppCenterDistribute", "Current release was already reported, skip reporting.");
            return str2;
        } else if (Z(f2)) {
            com.microsoft.appcenter.utils.a.a("AppCenterDistribute", "Current release was updated but not reported yet, reporting..");
            if (z2) {
                str2 = str2 + "&install_id=" + com.microsoft.appcenter.utils.g.a();
            }
            return (str2 + "&distribution_group_id=" + str) + "&downloaded_release_id=" + com.microsoft.appcenter.utils.o.d.b("Distribute.downloaded_release_id");
        } else {
            com.microsoft.appcenter.utils.a.a("AppCenterDistribute", "New release was downloaded but not installed yet, skip reporting.");
            return str2;
        }
    }

    /* access modifiers changed from: private */
    public synchronized void T(h hVar) {
        Intent intent;
        if (Build.VERSION.SDK_INT >= 26) {
            intent = new Intent("android.settings.MANAGE_UNKNOWN_APP_SOURCES");
            intent.setData(Uri.parse("package:" + this.o.getPackageName()));
        } else {
            intent = new Intent("android.settings.SECURITY_SETTINGS");
        }
        try {
            this.o.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            com.microsoft.appcenter.utils.a.i("AppCenterDistribute", "No way to navigate to secure settings on this device automatically");
            if (hVar == this.z) {
                J();
            }
        }
    }

    /* access modifiers changed from: private */
    public synchronized void U(Object obj, Exception exc) {
        if (this.x == obj) {
            J();
            if (!com.microsoft.appcenter.http.j.h(exc)) {
                if (exc instanceof HttpException) {
                    String str = null;
                    try {
                        str = d.b(((HttpException) exc).b().b()).a();
                    } catch (JSONException e2) {
                        com.microsoft.appcenter.utils.a.h("AppCenterDistribute", "Cannot read the error as JSON", e2);
                    }
                    if ("no_releases_for_user".equals(str)) {
                        com.microsoft.appcenter.utils.a.e("AppCenterDistribute", "No release available to the current user.");
                    } else {
                        com.microsoft.appcenter.utils.a.c("AppCenterDistribute", "Failed to check latest release (delete setup state)", exc);
                        com.microsoft.appcenter.utils.o.d.p("Distribute.distribution_group_id");
                        com.microsoft.appcenter.utils.o.d.p("Distribute.update_token");
                        com.microsoft.appcenter.utils.o.d.p("Distribute.postpone_time");
                        this.J.h();
                    }
                } else {
                    com.microsoft.appcenter.utils.a.c("AppCenterDistribute", "Failed to check latest release", exc);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a9, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00c1, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00cd, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void V(java.lang.Object r5, java.lang.String r6, com.microsoft.appcenter.distribute.h r7, java.lang.String r8) {
        /*
            r4 = this;
            monitor-enter(r4)
            java.lang.String r0 = "Distribute.downloaded_release_hash"
            java.lang.String r0 = com.microsoft.appcenter.utils.o.d.f(r0)     // Catch:{ all -> 0x00ce }
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x00ce }
            if (r1 != 0) goto L_0x0040
            boolean r1 = r4.Z(r0)     // Catch:{ all -> 0x00ce }
            if (r1 == 0) goto L_0x0039
            java.lang.String r1 = "AppCenterDistribute"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ce }
            r2.<init>()     // Catch:{ all -> 0x00ce }
            java.lang.String r3 = "Successfully reported app update for downloaded release hash ("
            r2.append(r3)     // Catch:{ all -> 0x00ce }
            r2.append(r0)     // Catch:{ all -> 0x00ce }
            java.lang.String r0 = "), removing from store.."
            r2.append(r0)     // Catch:{ all -> 0x00ce }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x00ce }
            com.microsoft.appcenter.utils.a.a(r1, r0)     // Catch:{ all -> 0x00ce }
            java.lang.String r0 = "Distribute.downloaded_release_hash"
            com.microsoft.appcenter.utils.o.d.p(r0)     // Catch:{ all -> 0x00ce }
            java.lang.String r0 = "Distribute.downloaded_release_id"
            com.microsoft.appcenter.utils.o.d.p(r0)     // Catch:{ all -> 0x00ce }
            goto L_0x0040
        L_0x0039:
            java.lang.String r0 = "AppCenterDistribute"
            java.lang.String r1 = "Stored release hash doesn't match current installation, probably downloaded but not installed yet, keep in store"
            com.microsoft.appcenter.utils.a.a(r0, r1)     // Catch:{ all -> 0x00ce }
        L_0x0040:
            java.lang.Object r0 = r4.x     // Catch:{ all -> 0x00ce }
            if (r0 != r5) goto L_0x00cc
            r5 = 0
            r4.y = r5     // Catch:{ all -> 0x00ce }
            if (r8 != 0) goto L_0x0050
            java.lang.String r5 = r7.a()     // Catch:{ all -> 0x00ce }
            r4.d0(r5)     // Catch:{ all -> 0x00ce }
        L_0x0050:
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x00ce }
            int r8 = r7.d()     // Catch:{ all -> 0x00ce }
            if (r5 < r8) goto L_0x00c2
            java.lang.String r5 = "AppCenterDistribute"
            java.lang.String r8 = "Check if latest release is more recent."
            com.microsoft.appcenter.utils.a.a(r5, r8)     // Catch:{ all -> 0x00ce }
            boolean r5 = r4.a0(r7)     // Catch:{ all -> 0x00ce }
            if (r5 == 0) goto L_0x00c9
            boolean r5 = r4.F(r7)     // Catch:{ all -> 0x00ce }
            if (r5 == 0) goto L_0x00c9
            com.microsoft.appcenter.distribute.h r5 = r4.z     // Catch:{ all -> 0x00ce }
            if (r5 != 0) goto L_0x0076
            com.microsoft.appcenter.distribute.h r5 = com.microsoft.appcenter.distribute.c.d()     // Catch:{ all -> 0x00ce }
            r4.A0(r5)     // Catch:{ all -> 0x00ce }
        L_0x0076:
            java.lang.String r5 = "Distribute.release_details"
            com.microsoft.appcenter.utils.o.d.n(r5, r6)     // Catch:{ all -> 0x00ce }
            com.microsoft.appcenter.distribute.h r5 = r4.z     // Catch:{ all -> 0x00ce }
            r6 = 1
            if (r5 == 0) goto L_0x00aa
            com.microsoft.appcenter.distribute.h r5 = r4.z     // Catch:{ all -> 0x00ce }
            boolean r5 = r5.k()     // Catch:{ all -> 0x00ce }
            if (r5 == 0) goto L_0x00aa
            com.microsoft.appcenter.distribute.h r5 = r4.z     // Catch:{ all -> 0x00ce }
            int r5 = r5.c()     // Catch:{ all -> 0x00ce }
            int r7 = r7.c()     // Catch:{ all -> 0x00ce }
            if (r5 == r7) goto L_0x00a1
            java.lang.String r5 = "AppCenterDistribute"
            java.lang.String r7 = "Latest release is more recent than the previous mandatory."
            com.microsoft.appcenter.utils.a.a(r5, r7)     // Catch:{ all -> 0x00ce }
            java.lang.String r5 = "Distribute.download_state"
            com.microsoft.appcenter.utils.o.d.l(r5, r6)     // Catch:{ all -> 0x00ce }
            goto L_0x00a8
        L_0x00a1:
            java.lang.String r5 = "AppCenterDistribute"
            java.lang.String r6 = "The latest release is mandatory and already being processed."
            com.microsoft.appcenter.utils.a.a(r5, r6)     // Catch:{ all -> 0x00ce }
        L_0x00a8:
            monitor-exit(r4)
            return
        L_0x00aa:
            r4.A0(r7)     // Catch:{ all -> 0x00ce }
            java.lang.String r5 = "AppCenterDistribute"
            java.lang.String r7 = "Latest release is more recent."
            com.microsoft.appcenter.utils.a.a(r5, r7)     // Catch:{ all -> 0x00ce }
            java.lang.String r5 = "Distribute.download_state"
            com.microsoft.appcenter.utils.o.d.l(r5, r6)     // Catch:{ all -> 0x00ce }
            android.app.Activity r5 = r4.o     // Catch:{ all -> 0x00ce }
            if (r5 == 0) goto L_0x00c0
            r4.s0()     // Catch:{ all -> 0x00ce }
        L_0x00c0:
            monitor-exit(r4)
            return
        L_0x00c2:
            java.lang.String r5 = "AppCenterDistribute"
            java.lang.String r6 = "This device is not compatible with the latest release."
            com.microsoft.appcenter.utils.a.e(r5, r6)     // Catch:{ all -> 0x00ce }
        L_0x00c9:
            r4.J()     // Catch:{ all -> 0x00ce }
        L_0x00cc:
            monitor-exit(r4)
            return
        L_0x00ce:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.microsoft.appcenter.distribute.Distribute.V(java.lang.Object, java.lang.String, com.microsoft.appcenter.distribute.h, java.lang.String):void");
    }

    /* access modifiers changed from: private */
    public synchronized void W(DialogInterface dialogInterface) {
        if (this.D == dialogInterface) {
            String str = this.f4438j;
            try {
                str = a.a(str, "update_setup_failed=true");
            } catch (URISyntaxException e2) {
                com.microsoft.appcenter.utils.a.c("AppCenterDistribute", "Could not append query parameter to url.", e2);
            }
            a.b(str, this.o);
            com.microsoft.appcenter.utils.o.d.p("Distribute.update_setup_failed_package_hash");
            com.microsoft.appcenter.utils.o.d.p("Distribute.tester_app_update_setup_failed_message");
        } else {
            o0();
        }
    }

    /* access modifiers changed from: private */
    public synchronized void X(h hVar) {
        if (hVar == this.z) {
            g0();
        } else {
            o0();
        }
    }

    private boolean Y() {
        try {
            this.f4440l.getPackageManager().getPackageInfo("com.microsoft.hockeyapp.testerapp", 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    private boolean Z(String str) {
        if (this.f4442n == null || TextUtils.isEmpty(str)) {
            return false;
        }
        return c.a(this.f4442n).equals(str);
    }

    private boolean a0(h hVar) {
        boolean z2;
        int c2 = DeviceInfoHelper.c(this.f4442n);
        boolean z3 = true;
        if (hVar.j() == c2) {
            z2 = !hVar.e().equals(c.a(this.f4442n));
        } else {
            if (hVar.j() <= c2) {
                z3 = false;
            }
            z2 = z3;
        }
        com.microsoft.appcenter.utils.a.a("AppCenterDistribute", "Latest release more recent=" + z2);
        return z2;
    }

    /* access modifiers changed from: private */
    public synchronized void c0(h hVar) {
        if (hVar == this.z) {
            com.microsoft.appcenter.utils.a.a("AppCenterDistribute", "Postpone updates for a day.");
            com.microsoft.appcenter.utils.o.d.m("Distribute.postpone_time", System.currentTimeMillis());
            J();
        } else {
            o0();
        }
    }

    private void d0(String str) {
        com.microsoft.appcenter.utils.o.d.n("Distribute.distribution_group_id", str);
        this.J.i(str);
        M();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x01ef, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x012b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void f0() {
        /*
            r11 = this;
            monitor-enter(r11)
            java.lang.String r0 = "AppCenterDistribute"
            java.lang.String r1 = "Resume distribute workflow..."
            com.microsoft.appcenter.utils.a.a(r0, r1)     // Catch:{ all -> 0x01f0 }
            android.content.pm.PackageInfo r0 = r11.f4442n     // Catch:{ all -> 0x01f0 }
            if (r0 == 0) goto L_0x01ee
            android.app.Activity r0 = r11.o     // Catch:{ all -> 0x01f0 }
            if (r0 == 0) goto L_0x01ee
            boolean r0 = r11.I     // Catch:{ all -> 0x01f0 }
            if (r0 != 0) goto L_0x01ee
            boolean r0 = r11.d()     // Catch:{ all -> 0x01f0 }
            if (r0 == 0) goto L_0x01ee
            android.content.Context r0 = r11.f4440l     // Catch:{ all -> 0x01f0 }
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo()     // Catch:{ all -> 0x01f0 }
            int r0 = r0.flags     // Catch:{ all -> 0x01f0 }
            r1 = 2
            r0 = r0 & r1
            r2 = 0
            r3 = 1
            if (r0 != r1) goto L_0x0039
            boolean r0 = r11.M     // Catch:{ all -> 0x01f0 }
            if (r0 != 0) goto L_0x0039
            java.lang.String r0 = "AppCenterDistribute"
            java.lang.String r1 = "Not checking for in-app updates in debuggable build."
            com.microsoft.appcenter.utils.a.e(r0, r1)     // Catch:{ all -> 0x01f0 }
            r11.I = r3     // Catch:{ all -> 0x01f0 }
            r11.O = r2     // Catch:{ all -> 0x01f0 }
            monitor-exit(r11)
            return
        L_0x0039:
            java.lang.String r0 = "AppCenterDistribute"
            android.content.Context r4 = r11.f4440l     // Catch:{ all -> 0x01f0 }
            boolean r0 = com.microsoft.appcenter.distribute.e.b(r0, r4)     // Catch:{ all -> 0x01f0 }
            if (r0 == 0) goto L_0x0050
            java.lang.String r0 = "AppCenterDistribute"
            java.lang.String r1 = "Not checking in app updates as installed from a store."
            com.microsoft.appcenter.utils.a.e(r0, r1)     // Catch:{ all -> 0x01f0 }
            r11.I = r3     // Catch:{ all -> 0x01f0 }
            r11.O = r2     // Catch:{ all -> 0x01f0 }
            monitor-exit(r11)
            return
        L_0x0050:
            int r0 = r11.w     // Catch:{ all -> 0x01f0 }
            if (r0 != r3) goto L_0x0056
            r0 = 1
            goto L_0x0057
        L_0x0056:
            r0 = 0
        L_0x0057:
            if (r0 != 0) goto L_0x008c
            java.lang.String r4 = "Distribute.update_setup_failed_package_hash"
            java.lang.String r4 = com.microsoft.appcenter.utils.o.d.f(r4)     // Catch:{ all -> 0x01f0 }
            if (r4 == 0) goto L_0x008c
            android.content.pm.PackageInfo r5 = r11.f4442n     // Catch:{ all -> 0x01f0 }
            java.lang.String r5 = com.microsoft.appcenter.distribute.c.a(r5)     // Catch:{ all -> 0x01f0 }
            boolean r4 = r5.equals(r4)     // Catch:{ all -> 0x01f0 }
            if (r4 == 0) goto L_0x0076
            java.lang.String r0 = "AppCenterDistribute"
            java.lang.String r1 = "Skipping in-app updates setup, because it already failed on this release before."
            com.microsoft.appcenter.utils.a.e(r0, r1)     // Catch:{ all -> 0x01f0 }
            monitor-exit(r11)
            return
        L_0x0076:
            java.lang.String r4 = "AppCenterDistribute"
            java.lang.String r5 = "Re-attempting in-app updates setup and cleaning up failure info from storage."
            com.microsoft.appcenter.utils.a.e(r4, r5)     // Catch:{ all -> 0x01f0 }
            java.lang.String r4 = "Distribute.update_setup_failed_package_hash"
            com.microsoft.appcenter.utils.o.d.p(r4)     // Catch:{ all -> 0x01f0 }
            java.lang.String r4 = "Distribute.update_setup_failed_message"
            com.microsoft.appcenter.utils.o.d.p(r4)     // Catch:{ all -> 0x01f0 }
            java.lang.String r4 = "Distribute.tester_app_update_setup_failed_message"
            com.microsoft.appcenter.utils.o.d.p(r4)     // Catch:{ all -> 0x01f0 }
        L_0x008c:
            java.lang.String r4 = r11.r     // Catch:{ all -> 0x01f0 }
            r5 = 0
            if (r4 == 0) goto L_0x00c8
            java.lang.String r0 = "AppCenterDistribute"
            java.lang.String r1 = "Processing redirection parameters we kept in memory before onStarted"
            com.microsoft.appcenter.utils.a.a(r0, r1)     // Catch:{ all -> 0x01f0 }
            java.lang.String r0 = r11.s     // Catch:{ all -> 0x01f0 }
            if (r0 == 0) goto L_0x00a6
            java.lang.String r0 = r11.r     // Catch:{ all -> 0x01f0 }
            java.lang.String r1 = r11.s     // Catch:{ all -> 0x01f0 }
            java.lang.String r2 = r11.t     // Catch:{ all -> 0x01f0 }
            r11.v0(r0, r1, r2)     // Catch:{ all -> 0x01f0 }
            goto L_0x00b1
        L_0x00a6:
            java.lang.String r0 = r11.u     // Catch:{ all -> 0x01f0 }
            if (r0 == 0) goto L_0x00b1
            java.lang.String r0 = r11.r     // Catch:{ all -> 0x01f0 }
            java.lang.String r1 = r11.u     // Catch:{ all -> 0x01f0 }
            r11.y0(r0, r1)     // Catch:{ all -> 0x01f0 }
        L_0x00b1:
            java.lang.String r0 = r11.v     // Catch:{ all -> 0x01f0 }
            if (r0 == 0) goto L_0x00bc
            java.lang.String r0 = r11.r     // Catch:{ all -> 0x01f0 }
            java.lang.String r1 = r11.v     // Catch:{ all -> 0x01f0 }
            r11.w0(r0, r1)     // Catch:{ all -> 0x01f0 }
        L_0x00bc:
            r11.r = r5     // Catch:{ all -> 0x01f0 }
            r11.s = r5     // Catch:{ all -> 0x01f0 }
            r11.t = r5     // Catch:{ all -> 0x01f0 }
            r11.u = r5     // Catch:{ all -> 0x01f0 }
            r11.v = r5     // Catch:{ all -> 0x01f0 }
            monitor-exit(r11)
            return
        L_0x00c8:
            int r4 = com.microsoft.appcenter.distribute.c.c()     // Catch:{ all -> 0x01f0 }
            com.microsoft.appcenter.distribute.h r6 = r11.z     // Catch:{ all -> 0x01f0 }
            if (r6 != 0) goto L_0x00f6
            if (r4 == 0) goto L_0x00f6
            com.microsoft.appcenter.distribute.h r6 = com.microsoft.appcenter.distribute.c.d()     // Catch:{ all -> 0x01f0 }
            r11.A0(r6)     // Catch:{ all -> 0x01f0 }
            com.microsoft.appcenter.distribute.h r6 = r11.z     // Catch:{ all -> 0x01f0 }
            if (r6 == 0) goto L_0x00f6
            com.microsoft.appcenter.distribute.h r6 = r11.z     // Catch:{ all -> 0x01f0 }
            boolean r6 = r6.k()     // Catch:{ all -> 0x01f0 }
            if (r6 != 0) goto L_0x00f6
            android.content.Context r6 = r11.f4440l     // Catch:{ all -> 0x01f0 }
            com.microsoft.appcenter.utils.i r6 = com.microsoft.appcenter.utils.i.k(r6)     // Catch:{ all -> 0x01f0 }
            boolean r6 = r6.o()     // Catch:{ all -> 0x01f0 }
            if (r6 == 0) goto L_0x00f6
            if (r4 != r3) goto L_0x00f6
            r11.H()     // Catch:{ all -> 0x01f0 }
        L_0x00f6:
            if (r4 == 0) goto L_0x012c
            if (r4 == r3) goto L_0x012c
            boolean r6 = r11.H     // Catch:{ all -> 0x01f0 }
            if (r6 != 0) goto L_0x012c
            android.content.pm.PackageInfo r6 = r11.f4442n     // Catch:{ all -> 0x01f0 }
            long r6 = r6.lastUpdateTime     // Catch:{ all -> 0x01f0 }
            java.lang.String r8 = "Distribute.download_time"
            long r8 = com.microsoft.appcenter.utils.o.d.d(r8)     // Catch:{ all -> 0x01f0 }
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 <= 0) goto L_0x0117
            java.lang.String r6 = "AppCenterDistribute"
            java.lang.String r7 = "Discarding previous download as application updated."
            com.microsoft.appcenter.utils.a.a(r6, r7)     // Catch:{ all -> 0x01f0 }
            r11.H()     // Catch:{ all -> 0x01f0 }
            goto L_0x012c
        L_0x0117:
            r11.H = r3     // Catch:{ all -> 0x01f0 }
            r11.g0()     // Catch:{ all -> 0x01f0 }
            com.microsoft.appcenter.distribute.h r6 = r11.z     // Catch:{ all -> 0x01f0 }
            if (r6 == 0) goto L_0x012a
            com.microsoft.appcenter.distribute.h r6 = r11.z     // Catch:{ all -> 0x01f0 }
            boolean r6 = r6.k()     // Catch:{ all -> 0x01f0 }
            if (r6 == 0) goto L_0x012a
            if (r4 == r1) goto L_0x012c
        L_0x012a:
            monitor-exit(r11)
            return
        L_0x012c:
            com.microsoft.appcenter.distribute.h r6 = r11.z     // Catch:{ all -> 0x01f0 }
            if (r6 == 0) goto L_0x015f
            r6 = 4
            if (r4 != r6) goto L_0x0137
            r11.q0()     // Catch:{ all -> 0x01f0 }
            goto L_0x0159
        L_0x0137:
            if (r4 != r1) goto L_0x0140
            r11.g0()     // Catch:{ all -> 0x01f0 }
            r11.p0()     // Catch:{ all -> 0x01f0 }
            goto L_0x0159
        L_0x0140:
            android.app.Dialog r1 = r11.B     // Catch:{ all -> 0x01f0 }
            if (r1 == 0) goto L_0x014a
            com.microsoft.appcenter.distribute.h r1 = r11.z     // Catch:{ all -> 0x01f0 }
            r11.N(r1)     // Catch:{ all -> 0x01f0 }
            goto L_0x0159
        L_0x014a:
            com.microsoft.appcenter.distribute.l.b r1 = r11.F     // Catch:{ all -> 0x01f0 }
            if (r1 == 0) goto L_0x0156
            com.microsoft.appcenter.distribute.l.b r1 = r11.F     // Catch:{ all -> 0x01f0 }
            boolean r1 = r1.b()     // Catch:{ all -> 0x01f0 }
            if (r1 != 0) goto L_0x0159
        L_0x0156:
            r11.s0()     // Catch:{ all -> 0x01f0 }
        L_0x0159:
            if (r4 == r3) goto L_0x015f
            if (r4 == r6) goto L_0x015f
            monitor-exit(r11)
            return
        L_0x015f:
            java.lang.String r1 = "Distribute.update_setup_failed_message"
            java.lang.String r1 = com.microsoft.appcenter.utils.o.d.f(r1)     // Catch:{ all -> 0x01f0 }
            if (r1 == 0) goto L_0x0173
            java.lang.String r0 = "AppCenterDistribute"
            java.lang.String r1 = "In-app updates setup failure detected."
            com.microsoft.appcenter.utils.a.a(r0, r1)     // Catch:{ all -> 0x01f0 }
            r11.t0()     // Catch:{ all -> 0x01f0 }
            monitor-exit(r11)
            return
        L_0x0173:
            java.lang.Object r1 = r11.x     // Catch:{ all -> 0x01f0 }
            if (r1 == 0) goto L_0x0180
            java.lang.String r0 = "AppCenterDistribute"
            java.lang.String r1 = "Already checking or checked latest release."
            com.microsoft.appcenter.utils.a.g(r0, r1)     // Catch:{ all -> 0x01f0 }
            monitor-exit(r11)
            return
        L_0x0180:
            boolean r1 = r11.N     // Catch:{ all -> 0x01f0 }
            if (r1 == 0) goto L_0x0191
            boolean r1 = r11.O     // Catch:{ all -> 0x01f0 }
            if (r1 != 0) goto L_0x0191
            java.lang.String r0 = "AppCenterDistribute"
            java.lang.String r1 = "Automatic check for update is disabled. The SDK will not check for update now."
            com.microsoft.appcenter.utils.a.a(r0, r1)     // Catch:{ all -> 0x01f0 }
            monitor-exit(r11)
            return
        L_0x0191:
            java.lang.String r1 = "Distribute.update_token"
            java.lang.String r1 = com.microsoft.appcenter.utils.o.d.f(r1)     // Catch:{ all -> 0x01f0 }
            java.lang.String r4 = "Distribute.distribution_group_id"
            java.lang.String r4 = com.microsoft.appcenter.utils.o.d.f(r4)     // Catch:{ all -> 0x01f0 }
            if (r0 != 0) goto L_0x01e5
            if (r1 == 0) goto L_0x01a2
            goto L_0x01e5
        L_0x01a2:
            java.lang.String r0 = "Distribute.tester_app_update_setup_failed_message"
            java.lang.String r0 = com.microsoft.appcenter.utils.o.d.f(r0)     // Catch:{ all -> 0x01f0 }
            boolean r1 = r11.Y()     // Catch:{ all -> 0x01f0 }
            if (r1 == 0) goto L_0x01c3
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x01f0 }
            if (r0 == 0) goto L_0x01c3
            android.content.Context r0 = r11.f4440l     // Catch:{ all -> 0x01f0 }
            java.lang.String r0 = r0.getPackageName()     // Catch:{ all -> 0x01f0 }
            java.lang.String r1 = "com.microsoft.hockeyapp.testerapp"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x01f0 }
            if (r0 != 0) goto L_0x01c3
            r2 = 1
        L_0x01c3:
            if (r2 == 0) goto L_0x01d3
            boolean r0 = r11.p     // Catch:{ all -> 0x01f0 }
            if (r0 != 0) goto L_0x01d3
            android.app.Activity r0 = r11.o     // Catch:{ all -> 0x01f0 }
            android.content.pm.PackageInfo r1 = r11.f4442n     // Catch:{ all -> 0x01f0 }
            com.microsoft.appcenter.distribute.c.f(r0, r1)     // Catch:{ all -> 0x01f0 }
            r11.p = r3     // Catch:{ all -> 0x01f0 }
            goto L_0x01ee
        L_0x01d3:
            boolean r0 = r11.q     // Catch:{ all -> 0x01f0 }
            if (r0 != 0) goto L_0x01ee
            android.app.Activity r0 = r11.o     // Catch:{ all -> 0x01f0 }
            java.lang.String r1 = r11.f4438j     // Catch:{ all -> 0x01f0 }
            java.lang.String r2 = r11.f4441m     // Catch:{ all -> 0x01f0 }
            android.content.pm.PackageInfo r4 = r11.f4442n     // Catch:{ all -> 0x01f0 }
            com.microsoft.appcenter.distribute.c.e(r0, r1, r2, r4)     // Catch:{ all -> 0x01f0 }
            r11.q = r3     // Catch:{ all -> 0x01f0 }
            goto L_0x01ee
        L_0x01e5:
            if (r0 == 0) goto L_0x01e8
            goto L_0x01e9
        L_0x01e8:
            r5 = r1
        L_0x01e9:
            r11.L(r5, r4)     // Catch:{ all -> 0x01f0 }
            monitor-exit(r11)
            return
        L_0x01ee:
            monitor-exit(r11)
            return
        L_0x01f0:
            r0 = move-exception
            monitor-exit(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.microsoft.appcenter.distribute.Distribute.f0():void");
    }

    public static synchronized Distribute getInstance() {
        Distribute distribute;
        synchronized (Distribute.class) {
            if (P == null) {
                P = new Distribute();
            }
            distribute = P;
        }
        return distribute;
    }

    private void h0() {
        if (this.o != null) {
            com.microsoft.appcenter.utils.e.b(new g());
        } else {
            com.microsoft.appcenter.utils.a.a("AppCenterDistribute", "Distribute workflow will be resumed on activity resume event.");
        }
    }

    public static void j0(boolean z2) {
        getInstance().l0(z2);
    }

    private synchronized void l0(boolean z2) {
        this.M = z2;
    }

    private boolean m0(Dialog dialog) {
        if (dialog == null || !dialog.isShowing()) {
            return true;
        }
        if (this.o == this.E.get()) {
            com.microsoft.appcenter.utils.a.a("AppCenterDistribute", "Previous dialog is still being shown in the same activity.");
            return false;
        }
        dialog.hide();
        return true;
    }

    private void n0(Dialog dialog) {
        dialog.show();
        this.E = new WeakReference<>(this.o);
    }

    private void o0() {
        Toast.makeText(this.f4440l, g.appcenter_distribute_dialog_actioned_on_disabled_toast, 0).show();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0022, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void p0() {
        /*
            r2 = this;
            monitor-enter(r2)
            android.app.Activity r0 = r2.o     // Catch:{ all -> 0x0023 }
            if (r0 != 0) goto L_0x000e
            java.lang.String r0 = "AppCenterDistribute"
            java.lang.String r1 = "Could not display progress dialog in the background."
            com.microsoft.appcenter.utils.a.i(r0, r1)     // Catch:{ all -> 0x0023 }
            monitor-exit(r2)
            return
        L_0x000e:
            com.microsoft.appcenter.distribute.i r0 = r2.G     // Catch:{ all -> 0x0023 }
            if (r0 != 0) goto L_0x0014
            monitor-exit(r2)
            return
        L_0x0014:
            com.microsoft.appcenter.distribute.i r0 = r2.G     // Catch:{ all -> 0x0023 }
            android.app.Activity r1 = r2.o     // Catch:{ all -> 0x0023 }
            android.app.ProgressDialog r0 = r0.h(r1)     // Catch:{ all -> 0x0023 }
            if (r0 == 0) goto L_0x0021
            r2.n0(r0)     // Catch:{ all -> 0x0023 }
        L_0x0021:
            monitor-exit(r2)
            return
        L_0x0023:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.microsoft.appcenter.distribute.Distribute.p0():void");
    }

    private synchronized void q0() {
        if (m0(this.C)) {
            h hVar = this.z;
            AlertDialog.Builder builder = new AlertDialog.Builder(this.o);
            builder.setCancelable(false);
            builder.setTitle(g.appcenter_distribute_install_ready_title);
            builder.setMessage(P());
            builder.setPositiveButton(g.appcenter_distribute_install, new e(hVar));
            AlertDialog create = builder.create();
            this.C = create;
            n0(create);
        }
    }

    private synchronized void r0() {
        if (m0(this.B)) {
            com.microsoft.appcenter.utils.a.a("AppCenterDistribute", "Show new unknown sources dialog.");
            AlertDialog.Builder builder = new AlertDialog.Builder(this.o);
            builder.setMessage(g.appcenter_distribute_unknown_sources_dialog_message);
            h hVar = this.z;
            if (hVar.k()) {
                builder.setCancelable(false);
            } else {
                builder.setNegativeButton(17039360, new m(hVar));
                builder.setOnCancelListener(new a(hVar));
            }
            builder.setPositiveButton(g.appcenter_distribute_unknown_sources_dialog_settings, new b(hVar));
            AlertDialog create = builder.create();
            this.B = create;
            n0(create);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c9, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void s0() {
        /*
            r5 = this;
            monitor-enter(r5)
            com.microsoft.appcenter.distribute.b r0 = r5.K     // Catch:{ all -> 0x00ca }
            if (r0 != 0) goto L_0x000d
            java.lang.Boolean r0 = r5.L     // Catch:{ all -> 0x00ca }
            if (r0 != 0) goto L_0x000d
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x00ca }
            r5.L = r0     // Catch:{ all -> 0x00ca }
        L_0x000d:
            com.microsoft.appcenter.distribute.b r0 = r5.K     // Catch:{ all -> 0x00ca }
            r1 = 0
            if (r0 == 0) goto L_0x0043
            android.app.Activity r0 = r5.o     // Catch:{ all -> 0x00ca }
            java.lang.ref.WeakReference<android.app.Activity> r2 = r5.E     // Catch:{ all -> 0x00ca }
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x00ca }
            if (r0 == r2) goto L_0x0043
            java.lang.String r0 = "AppCenterDistribute"
            java.lang.String r2 = "Calling listener.onReleaseAvailable."
            com.microsoft.appcenter.utils.a.a(r0, r2)     // Catch:{ all -> 0x00ca }
            com.microsoft.appcenter.distribute.b r0 = r5.K     // Catch:{ all -> 0x00ca }
            android.app.Activity r2 = r5.o     // Catch:{ all -> 0x00ca }
            com.microsoft.appcenter.distribute.h r3 = r5.z     // Catch:{ all -> 0x00ca }
            boolean r0 = r0.a(r2, r3)     // Catch:{ all -> 0x00ca }
            if (r0 == 0) goto L_0x0038
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x00ca }
            android.app.Activity r3 = r5.o     // Catch:{ all -> 0x00ca }
            r2.<init>(r3)     // Catch:{ all -> 0x00ca }
            r5.E = r2     // Catch:{ all -> 0x00ca }
        L_0x0038:
            if (r0 != 0) goto L_0x003c
            r0 = 1
            goto L_0x003d
        L_0x003c:
            r0 = 0
        L_0x003d:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x00ca }
            r5.L = r0     // Catch:{ all -> 0x00ca }
        L_0x0043:
            java.lang.Boolean r0 = r5.L     // Catch:{ all -> 0x00ca }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x00ca }
            if (r0 == 0) goto L_0x00c8
            android.app.Dialog r0 = r5.A     // Catch:{ all -> 0x00ca }
            boolean r0 = r5.m0(r0)     // Catch:{ all -> 0x00ca }
            if (r0 != 0) goto L_0x0055
            monitor-exit(r5)
            return
        L_0x0055:
            java.lang.String r0 = "AppCenterDistribute"
            java.lang.String r2 = "Show default update dialog."
            com.microsoft.appcenter.utils.a.a(r0, r2)     // Catch:{ all -> 0x00ca }
            android.app.AlertDialog$Builder r0 = new android.app.AlertDialog$Builder     // Catch:{ all -> 0x00ca }
            android.app.Activity r2 = r5.o     // Catch:{ all -> 0x00ca }
            r0.<init>(r2)     // Catch:{ all -> 0x00ca }
            int r2 = com.microsoft.appcenter.distribute.g.appcenter_distribute_update_dialog_title     // Catch:{ all -> 0x00ca }
            r0.setTitle(r2)     // Catch:{ all -> 0x00ca }
            com.microsoft.appcenter.distribute.h r2 = r5.z     // Catch:{ all -> 0x00ca }
            boolean r3 = r2.k()     // Catch:{ all -> 0x00ca }
            if (r3 == 0) goto L_0x0079
            android.content.Context r3 = r5.f4440l     // Catch:{ all -> 0x00ca }
            int r4 = com.microsoft.appcenter.distribute.g.appcenter_distribute_update_dialog_message_mandatory     // Catch:{ all -> 0x00ca }
            java.lang.String r3 = r3.getString(r4)     // Catch:{ all -> 0x00ca }
            goto L_0x0081
        L_0x0079:
            android.content.Context r3 = r5.f4440l     // Catch:{ all -> 0x00ca }
            int r4 = com.microsoft.appcenter.distribute.g.appcenter_distribute_update_dialog_message_optional     // Catch:{ all -> 0x00ca }
            java.lang.String r3 = r3.getString(r4)     // Catch:{ all -> 0x00ca }
        L_0x0081:
            java.lang.String r3 = r5.O(r3)     // Catch:{ all -> 0x00ca }
            r0.setMessage(r3)     // Catch:{ all -> 0x00ca }
            int r3 = com.microsoft.appcenter.distribute.g.appcenter_distribute_update_dialog_download     // Catch:{ all -> 0x00ca }
            com.microsoft.appcenter.distribute.Distribute$j r4 = new com.microsoft.appcenter.distribute.Distribute$j     // Catch:{ all -> 0x00ca }
            r4.<init>(r2)     // Catch:{ all -> 0x00ca }
            r0.setPositiveButton(r3, r4)     // Catch:{ all -> 0x00ca }
            r0.setCancelable(r1)     // Catch:{ all -> 0x00ca }
            boolean r1 = r2.k()     // Catch:{ all -> 0x00ca }
            if (r1 != 0) goto L_0x00a5
            int r1 = com.microsoft.appcenter.distribute.g.appcenter_distribute_update_dialog_postpone     // Catch:{ all -> 0x00ca }
            com.microsoft.appcenter.distribute.Distribute$k r3 = new com.microsoft.appcenter.distribute.Distribute$k     // Catch:{ all -> 0x00ca }
            r3.<init>(r2)     // Catch:{ all -> 0x00ca }
            r0.setNegativeButton(r1, r3)     // Catch:{ all -> 0x00ca }
        L_0x00a5:
            java.lang.String r1 = r2.f()     // Catch:{ all -> 0x00ca }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x00ca }
            if (r1 != 0) goto L_0x00bf
            android.net.Uri r1 = r2.g()     // Catch:{ all -> 0x00ca }
            if (r1 == 0) goto L_0x00bf
            int r1 = com.microsoft.appcenter.distribute.g.appcenter_distribute_update_dialog_view_release_notes     // Catch:{ all -> 0x00ca }
            com.microsoft.appcenter.distribute.Distribute$l r3 = new com.microsoft.appcenter.distribute.Distribute$l     // Catch:{ all -> 0x00ca }
            r3.<init>(r2)     // Catch:{ all -> 0x00ca }
            r0.setNeutralButton(r1, r3)     // Catch:{ all -> 0x00ca }
        L_0x00bf:
            android.app.AlertDialog r0 = r0.create()     // Catch:{ all -> 0x00ca }
            r5.A = r0     // Catch:{ all -> 0x00ca }
            r5.n0(r0)     // Catch:{ all -> 0x00ca }
        L_0x00c8:
            monitor-exit(r5)
            return
        L_0x00ca:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.microsoft.appcenter.distribute.Distribute.s0():void");
    }

    private synchronized void t0() {
        if (m0(this.D)) {
            com.microsoft.appcenter.utils.a.a("AppCenterDistribute", "Show update setup failed dialog.");
            AlertDialog.Builder builder = new AlertDialog.Builder(this.o);
            builder.setCancelable(false);
            builder.setTitle(g.appcenter_distribute_update_failed_dialog_title);
            builder.setMessage(g.appcenter_distribute_update_failed_dialog_message);
            builder.setPositiveButton(g.appcenter_distribute_update_failed_dialog_ignore, new c());
            builder.setNegativeButton(g.appcenter_distribute_update_failed_dialog_reinstall, new d());
            AlertDialog create = builder.create();
            this.D = create;
            n0(create);
            com.microsoft.appcenter.utils.o.d.p("Distribute.update_setup_failed_message");
        }
    }

    /* access modifiers changed from: private */
    public synchronized void x0(DialogInterface dialogInterface) {
        if (this.D == dialogInterface) {
            com.microsoft.appcenter.utils.o.d.n("Distribute.update_setup_failed_package_hash", c.a(this.f4442n));
        } else {
            o0();
        }
    }

    private boolean z0() {
        if (c.c() != 0 || this.x != null) {
            return false;
        }
        this.I = false;
        this.q = false;
        return true;
    }

    /* access modifiers changed from: package-private */
    public synchronized void J() {
        G();
        com.microsoft.appcenter.utils.o.d.p("Distribute.release_details");
        com.microsoft.appcenter.utils.o.d.p("Distribute.download_state");
        this.y = null;
        this.x = null;
        this.A = null;
        this.D = null;
        this.B = null;
        this.E.clear();
        this.z = null;
        if (this.G != null) {
            this.G.g();
        }
        this.I = true;
        this.O = false;
    }

    /* access modifiers changed from: package-private */
    public synchronized void K(h hVar) {
        if (hVar == this.z) {
            J();
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized void N(h hVar) {
        if (hVar != this.z) {
            o0();
        } else if (e.c(this.f4440l)) {
            com.microsoft.appcenter.utils.a.a("AppCenterDistribute", "Schedule download...");
            g0();
            p0();
            if (this.y != null) {
                this.y.cancel();
            }
        } else {
            r0();
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized void Q(String str, String str2) {
        String str3;
        com.microsoft.appcenter.utils.a.a("AppCenterDistribute", "Get latest release details...");
        com.microsoft.appcenter.http.d a2 = com.microsoft.appcenter.f.a();
        if (a2 == null) {
            a2 = com.microsoft.appcenter.http.j.a(this.f4440l);
        }
        String a3 = c.a(this.f4442n);
        String str4 = this.f4439k;
        if (str2 == null) {
            str3 = str4 + String.format("/public/sdk/apps/%s/releases/latest?release_hash=%s%s", new Object[]{this.f4441m, a3, S(true, str)});
        } else {
            str3 = str4 + String.format("/sdk/apps/%s/releases/private/latest?release_hash=%s%s", new Object[]{this.f4441m, a3, S(false, str)});
        }
        HashMap hashMap = new HashMap();
        if (str2 != null) {
            hashMap.put("x-api-token", str2);
        }
        Object obj = new Object();
        this.x = obj;
        this.y = a2.p0(str3, "GET", hashMap, new h(), new i(obj, str));
    }

    public String b() {
        return "Distribute";
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00b1, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean b0(com.microsoft.appcenter.distribute.h r8, android.content.Intent r9) {
        /*
            r7 = this;
            monitor-enter(r7)
            com.microsoft.appcenter.distribute.h r0 = r7.z     // Catch:{ all -> 0x00b2 }
            r1 = 1
            if (r8 == r0) goto L_0x0008
            monitor-exit(r7)
            return r1
        L_0x0008:
            android.app.Activity r8 = r7.o     // Catch:{ all -> 0x00b2 }
            r0 = 0
            if (r8 != 0) goto L_0x00b0
            int r8 = com.microsoft.appcenter.distribute.c.c()     // Catch:{ all -> 0x00b2 }
            r2 = 3
            if (r8 != r2) goto L_0x0016
            goto L_0x00b0
        L_0x0016:
            java.lang.String r8 = "AppCenterDistribute"
            java.lang.String r3 = "Post a notification as the download finished in background."
            com.microsoft.appcenter.utils.a.a(r8, r3)     // Catch:{ all -> 0x00b2 }
            android.content.Context r8 = r7.f4440l     // Catch:{ all -> 0x00b2 }
            java.lang.String r3 = "notification"
            java.lang.Object r8 = r8.getSystemService(r3)     // Catch:{ all -> 0x00b2 }
            android.app.NotificationManager r8 = (android.app.NotificationManager) r8     // Catch:{ all -> 0x00b2 }
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x00b2 }
            r4 = 26
            if (r3 < r4) goto L_0x0049
            android.app.NotificationChannel r3 = new android.app.NotificationChannel     // Catch:{ all -> 0x00b2 }
            java.lang.String r4 = "appcenter.distribute"
            android.content.Context r5 = r7.f4440l     // Catch:{ all -> 0x00b2 }
            int r6 = com.microsoft.appcenter.distribute.g.appcenter_distribute_notification_category     // Catch:{ all -> 0x00b2 }
            java.lang.String r5 = r5.getString(r6)     // Catch:{ all -> 0x00b2 }
            r3.<init>(r4, r5, r2)     // Catch:{ all -> 0x00b2 }
            r8.createNotificationChannel(r3)     // Catch:{ all -> 0x00b2 }
            android.app.Notification$Builder r3 = new android.app.Notification$Builder     // Catch:{ all -> 0x00b2 }
            android.content.Context r4 = r7.f4440l     // Catch:{ all -> 0x00b2 }
            java.lang.String r5 = "appcenter.distribute"
            r3.<init>(r4, r5)     // Catch:{ all -> 0x00b2 }
            goto L_0x004d
        L_0x0049:
            android.app.Notification$Builder r3 = r7.R()     // Catch:{ all -> 0x00b2 }
        L_0x004d:
            android.content.Context r4 = r7.f4440l     // Catch:{ all -> 0x00b2 }
            int r5 = com.microsoft.appcenter.distribute.g.appcenter_distribute_install_ready_title     // Catch:{ all -> 0x00b2 }
            java.lang.String r4 = r4.getString(r5)     // Catch:{ all -> 0x00b2 }
            android.app.Notification$Builder r4 = r3.setTicker(r4)     // Catch:{ all -> 0x00b2 }
            android.content.Context r5 = r7.f4440l     // Catch:{ all -> 0x00b2 }
            int r6 = com.microsoft.appcenter.distribute.g.appcenter_distribute_install_ready_title     // Catch:{ all -> 0x00b2 }
            java.lang.String r5 = r5.getString(r6)     // Catch:{ all -> 0x00b2 }
            android.app.Notification$Builder r4 = r4.setContentTitle(r5)     // Catch:{ all -> 0x00b2 }
            java.lang.String r5 = r7.P()     // Catch:{ all -> 0x00b2 }
            android.app.Notification$Builder r4 = r4.setContentText(r5)     // Catch:{ all -> 0x00b2 }
            android.content.Context r5 = r7.f4440l     // Catch:{ all -> 0x00b2 }
            android.content.pm.ApplicationInfo r5 = r5.getApplicationInfo()     // Catch:{ all -> 0x00b2 }
            int r5 = r5.icon     // Catch:{ all -> 0x00b2 }
            android.app.Notification$Builder r4 = r4.setSmallIcon(r5)     // Catch:{ all -> 0x00b2 }
            android.content.Context r5 = r7.f4440l     // Catch:{ all -> 0x00b2 }
            android.content.Intent[] r6 = new android.content.Intent[r1]     // Catch:{ all -> 0x00b2 }
            r6[r0] = r9     // Catch:{ all -> 0x00b2 }
            android.app.PendingIntent r9 = android.app.PendingIntent.getActivities(r5, r0, r6, r0)     // Catch:{ all -> 0x00b2 }
            r4.setContentIntent(r9)     // Catch:{ all -> 0x00b2 }
            android.app.Notification$BigTextStyle r9 = new android.app.Notification$BigTextStyle     // Catch:{ all -> 0x00b2 }
            r9.<init>()     // Catch:{ all -> 0x00b2 }
            java.lang.String r4 = r7.P()     // Catch:{ all -> 0x00b2 }
            android.app.Notification$BigTextStyle r9 = r9.bigText(r4)     // Catch:{ all -> 0x00b2 }
            r3.setStyle(r9)     // Catch:{ all -> 0x00b2 }
            android.app.Notification r9 = r3.build()     // Catch:{ all -> 0x00b2 }
            int r3 = r9.flags     // Catch:{ all -> 0x00b2 }
            r3 = r3 | 16
            r9.flags = r3     // Catch:{ all -> 0x00b2 }
            int r3 = com.microsoft.appcenter.distribute.c.b()     // Catch:{ all -> 0x00b2 }
            r8.notify(r3, r9)     // Catch:{ all -> 0x00b2 }
            java.lang.String r8 = "Distribute.download_state"
            com.microsoft.appcenter.utils.o.d.l(r8, r2)     // Catch:{ all -> 0x00b2 }
            r7.H = r0     // Catch:{ all -> 0x00b2 }
            monitor-exit(r7)
            return r1
        L_0x00b0:
            monitor-exit(r7)
            return r0
        L_0x00b2:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.microsoft.appcenter.distribute.Distribute.b0(com.microsoft.appcenter.distribute.h, android.content.Intent):boolean");
    }

    /* access modifiers changed from: package-private */
    public synchronized void e0(Context context) {
        if (this.o == null) {
            Intent intent = new Intent(context, DeepLinkActivity.class);
            intent.addFlags(268435456);
            context.startActivity(intent);
        }
    }

    public Map<String, com.microsoft.appcenter.k.d.i.f> f() {
        return this.f4437i;
    }

    public void g() {
        if (this.f4411g != null) {
            com.microsoft.appcenter.utils.a.a("AppCenterDistribute", "Resetting workflow on entering foreground.");
            z0();
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized void g0() {
        if (this.F != null) {
            this.F.a();
            this.H = true;
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized void i0(h hVar, long j2) {
        if (hVar == this.z) {
            com.microsoft.appcenter.utils.o.d.l("Distribute.download_state", 2);
            com.microsoft.appcenter.utils.o.d.m("Distribute.download_time", j2);
        }
    }

    public synchronized void j(Context context, com.microsoft.appcenter.j.b bVar, String str, String str2, boolean z2) {
        this.f4440l = context;
        this.f4441m = str;
        try {
            this.f4442n = context.getPackageManager().getPackageInfo(this.f4440l.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e2) {
            com.microsoft.appcenter.utils.a.c("AppCenterDistribute", "Could not get self package info.", e2);
        }
        super.j(context, bVar, str, str2, z2);
    }

    /* access modifiers changed from: protected */
    public synchronized void k(boolean z2) {
        if (z2) {
            I();
            com.microsoft.appcenter.distribute.k.a aVar = new com.microsoft.appcenter.distribute.k.a(com.microsoft.appcenter.utils.o.d.f("Distribute.distribution_group_id"));
            this.J = aVar;
            this.f4411g.k(aVar);
            h0();
        } else {
            this.p = false;
            this.q = false;
            this.I = false;
            H();
            com.microsoft.appcenter.utils.o.d.p("Distribute.request_id");
            com.microsoft.appcenter.utils.o.d.p("Distribute.postpone_time");
            com.microsoft.appcenter.utils.o.d.p("Distribute.update_setup_failed_package_hash");
            com.microsoft.appcenter.utils.o.d.p("Distribute.update_setup_failed_message");
            com.microsoft.appcenter.utils.o.d.p("Distribute.tester_app_update_setup_failed_message");
            this.f4411g.o(this.J);
            this.J = null;
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized void k0(h hVar) {
        if (hVar == this.z) {
            if (hVar.k()) {
                G();
                com.microsoft.appcenter.utils.o.d.l("Distribute.download_state", 4);
            } else {
                K(hVar);
            }
            String a2 = hVar.a();
            String e2 = hVar.e();
            int c2 = hVar.c();
            com.microsoft.appcenter.utils.a.a("AppCenterDistribute", "Stored release details: group id=" + a2 + " release hash=" + e2 + " release id=" + c2);
            com.microsoft.appcenter.utils.o.d.n("Distribute.downloaded_distribution_group_id", a2);
            com.microsoft.appcenter.utils.o.d.n("Distribute.downloaded_release_hash", e2);
            com.microsoft.appcenter.utils.o.d.l("Distribute.downloaded_release_id", c2);
        }
    }

    /* access modifiers changed from: protected */
    public String n() {
        return "group_distribute";
    }

    /* access modifiers changed from: protected */
    public String o() {
        return "AppCenterDistribute";
    }

    public synchronized void onActivityPaused(Activity activity) {
        this.o = null;
        if (this.G != null) {
            this.G.g();
        }
    }

    public synchronized void onActivityResumed(Activity activity) {
        this.o = activity;
        if (this.f4411g != null) {
            f0();
        }
    }

    /* access modifiers changed from: protected */
    public int p() {
        return 1;
    }

    /* access modifiers changed from: package-private */
    public synchronized void u0(Context context) {
        if (this.f4441m == null) {
            com.microsoft.appcenter.utils.a.a("AppCenterDistribute", "Called before onStart, init storage");
            this.f4440l = context;
            com.microsoft.appcenter.utils.o.d.j(context);
            A0(c.d());
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized void v0(String str, String str2, String str3) {
        if (this.f4440l == null) {
            com.microsoft.appcenter.utils.a.a("AppCenterDistribute", "Redirection parameters received before onStart, keep them in memory.");
            this.r = str;
            this.t = str3;
            this.s = str2;
        } else if (str.equals(com.microsoft.appcenter.utils.o.d.f("Distribute.request_id"))) {
            if (str3 != null) {
                com.microsoft.appcenter.utils.o.d.n("Distribute.update_token", com.microsoft.appcenter.utils.n.e.e(this.f4440l).b(str3));
            } else {
                com.microsoft.appcenter.utils.o.d.p("Distribute.update_token");
            }
            com.microsoft.appcenter.utils.o.d.p("Distribute.request_id");
            d0(str2);
            com.microsoft.appcenter.utils.a.a("AppCenterDistribute", "Stored redirection parameters.");
            H();
            Q(str2, str3);
        } else {
            com.microsoft.appcenter.utils.a.i("AppCenterDistribute", "Ignoring redirection parameters as requestId is invalid.");
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized void w0(String str, String str2) {
        if (this.f4440l == null) {
            com.microsoft.appcenter.utils.a.a("AppCenterDistribute", "Tester app update setup failed parameter received before onStart, keep it in memory.");
            this.r = str;
            this.v = str2;
        } else if (str.equals(com.microsoft.appcenter.utils.o.d.f("Distribute.request_id"))) {
            com.microsoft.appcenter.utils.a.a("AppCenterDistribute", "Stored tester app update setup failed parameter.");
            com.microsoft.appcenter.utils.o.d.n("Distribute.tester_app_update_setup_failed_message", str2);
        } else {
            com.microsoft.appcenter.utils.a.i("AppCenterDistribute", "Ignoring redirection parameters as requestId is invalid.");
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized void y0(String str, String str2) {
        if (this.f4440l == null) {
            com.microsoft.appcenter.utils.a.a("AppCenterDistribute", "Update setup failed parameter received before onStart, keep it in memory.");
            this.r = str;
            this.u = str2;
        } else if (str.equals(com.microsoft.appcenter.utils.o.d.f("Distribute.request_id"))) {
            com.microsoft.appcenter.utils.a.a("AppCenterDistribute", "Stored update setup failed parameter.");
            com.microsoft.appcenter.utils.o.d.n("Distribute.update_setup_failed_message", str2);
        } else {
            com.microsoft.appcenter.utils.a.i("AppCenterDistribute", "Ignoring redirection parameters as requestId is invalid.");
        }
    }
}
