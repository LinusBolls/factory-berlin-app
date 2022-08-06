package k.h0.i;

import android.annotation.SuppressLint;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import k.a0;
import k.h0.i.i.b;
import k.h0.i.i.f;
import k.h0.i.i.g;
import k.h0.i.i.i;
import k.h0.i.i.j;
import k.h0.i.i.k;
import k.h0.k.c;

/* compiled from: Android10Platform.kt */
public final class a extends h {
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final boolean f10450e = (h.c.h() && Build.VERSION.SDK_INT >= 29);

    /* renamed from: f  reason: collision with root package name */
    public static final C0743a f10451f = new C0743a((DefaultConstructorMarker) null);

    /* renamed from: d  reason: collision with root package name */
    private final List<k> f10452d;

    /* renamed from: k.h0.i.a$a  reason: collision with other inner class name */
    /* compiled from: Android10Platform.kt */
    public static final class C0743a {
        private C0743a() {
        }

        public final h a() {
            if (b()) {
                return new a();
            }
            return null;
        }

        public final boolean b() {
            return a.f10450e;
        }

        public /* synthetic */ C0743a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public a() {
        List j2 = n.j(k.h0.i.i.a.a.a(), new j(f.f10476g.d()), new j(i.b.a()), new j(g.b.a()));
        ArrayList arrayList = new ArrayList();
        for (Object next : j2) {
            if (((k) next).c()) {
                arrayList.add(next);
            }
        }
        this.f10452d = arrayList;
    }

    public c c(X509TrustManager x509TrustManager) {
        kotlin.jvm.internal.k.f(x509TrustManager, "trustManager");
        b a = b.f10474d.a(x509TrustManager);
        return a != null ? a : super.c(x509TrustManager);
    }

    public void e(SSLSocket sSLSocket, String str, List<? extends a0> list) {
        T t;
        kotlin.jvm.internal.k.f(sSLSocket, "sslSocket");
        kotlin.jvm.internal.k.f(list, "protocols");
        Iterator<T> it = this.f10452d.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (((k) t).a(sSLSocket)) {
                break;
            }
        }
        k kVar = (k) t;
        if (kVar != null) {
            kVar.d(sSLSocket, str, list);
        }
    }

    public String h(SSLSocket sSLSocket) {
        T t;
        kotlin.jvm.internal.k.f(sSLSocket, "sslSocket");
        Iterator<T> it = this.f10452d.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (((k) t).a(sSLSocket)) {
                break;
            }
        }
        k kVar = (k) t;
        if (kVar != null) {
            return kVar.b(sSLSocket);
        }
        return null;
    }

    @SuppressLint({"NewApi"})
    public boolean j(String str) {
        kotlin.jvm.internal.k.f(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }
}
