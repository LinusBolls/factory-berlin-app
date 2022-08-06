package com.sensorberg.smartworkspace.app.utils;

import androidx.navigation.p;
import com.sensorberg.smartworkspace.app.d;
import com.sensorberg.smartworkspace.app.h.a.d;
import com.sensorberg.smartworkspace.app.o.e;
import com.sensorberg.smartworkspace.app.o.f;
import com.sensorberg.smartworkspace.app.o.g;
import de.baimos.blueid.sdk.metrics.AndroidSdkMetrics;
import g.e.d.n;
import g.e.d.o;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.k;

/* compiled from: BuildConfigImpl.kt */
public final class c {

    /* compiled from: BuildConfigImpl.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: BuildConfigImpl.kt */
    public static final class b extends com.sensorberg.noiise.b {

        /* renamed from: d  reason: collision with root package name */
        private final p f8000d;

        b(c cVar) {
            this.f8000d = d.a.e(cVar.t(), cVar.d());
        }

        public p b() {
            return this.f8000d;
        }
    }

    static {
        new a((DefaultConstructorMarker) null);
    }

    public c() {
        B();
    }

    private final void B() {
        o.b.b();
        o.b.a(com.sensorberg.smartworkspace.app.o.a.f7255e);
        o.b.a(com.sensorberg.smartworkspace.app.o.b.f7257e);
        o.b.a(com.sensorberg.smartworkspace.app.o.c.f7259e);
        o.b.a(new b(this));
        o.b.a(com.sensorberg.smartworkspace.app.o.d.f7261e);
        o.b.a(e.f7263e);
        o.b.a(f.f7265e);
        o.b.a(g.a.f7267e);
        o.b.a(g.b.f7269e);
        o.b.a(g.c.f7271e);
    }

    public final boolean A() {
        List<n> v = v();
        if ((v instanceof Collection) && v.isEmpty()) {
            return false;
        }
        for (n nVar : v) {
            if (nVar instanceof com.sensorberg.smartworkspace.app.o.a) {
                return true;
            }
        }
        return false;
    }

    public final boolean C() {
        return (p.s(c()) ^ true) && !D();
    }

    public final boolean D() {
        return k.a("release", "debug");
    }

    public final boolean E() {
        return false;
    }

    public final boolean F() {
        return true;
    }

    public final boolean G() {
        return E();
    }

    public final boolean H() {
        return true;
    }

    public final boolean I() {
        if (!(!p.s(n())) || !(!p.s(o()))) {
            return false;
        }
        return true;
    }

    public final boolean J() {
        return false;
    }

    public final com.sensorberg.smartworkspace.app.h.a.d K() {
        return d.a.a;
    }

    public final int L() {
        return 4;
    }

    public final String M() {
        return "Door,Locker,Noise";
    }

    public final boolean a() {
        return false;
    }

    public final boolean b() {
        return false;
    }

    public final String c() {
        return "234fe2e9-7873-48b7-ae4d-a4e2f6961a9e";
    }

    public final String d() {
        return "https://factory.sensorberg.com";
    }

    public final String e() {
        return "sha256/YAYGGyah+cTWrBFIaK6I9fKsznX3mKPCzvNKUmJgjY4=";
    }

    public final String f() {
        String str = com.sensorberg.smartworkspace.app.b.a;
        return str != null ? str : "";
    }

    public final String g() {
        String str = com.sensorberg.smartworkspace.app.b.c;
        return str != null ? str : "";
    }

    public final String h() {
        String str = com.sensorberg.smartworkspace.app.b.f7072f;
        return str != null ? str : "";
    }

    public final String i() {
        String str = com.sensorberg.smartworkspace.app.b.f7070d;
        return str != null ? str : "";
    }

    public final String j() {
        String str = com.sensorberg.smartworkspace.app.b.f7073g;
        return str != null ? str : "";
    }

    public final String k() {
        String str = com.sensorberg.smartworkspace.app.b.f7071e;
        return str != null ? str : "";
    }

    public final String l() {
        String str = com.sensorberg.smartworkspace.app.b.f7074h;
        return str != null ? str : "";
    }

    public final String m() {
        return "SmartWorkspace";
    }

    public final String n() {
        String str = com.sensorberg.smartworkspace.app.b.b;
        return str != null ? str : "";
    }

    public final String o() {
        return "https://portal.sensorberg-cdn.com";
    }

    public final String p() {
        return d() + "/auth/" + t();
    }

    public final String q() {
        return "only_if_unprotected_device";
    }

    public final long r() {
        return 180000;
    }

    public final long s() {
        return 600000;
    }

    public final String t() {
        return "7a0b8c275f6e4b62d364bf677eb22640586a0a9a4ebb5de55e2fff6ff17b9949";
    }

    public final String u() {
        return "Door,Rooms,Locker";
    }

    public final List<n> v() {
        return o.b.c(q.n0(u(), new String[]{AndroidSdkMetrics.SEPARATOR}, false, 0, 6, (Object) null));
    }

    public final String w() {
        String str = com.sensorberg.smartworkspace.app.b.f7075i;
        return str != null ? str : "";
    }

    public final String x() {
        String str = com.sensorberg.smartworkspace.app.b.f7076j;
        return str != null ? str : "";
    }

    public final String y() {
        String str = com.sensorberg.smartworkspace.app.b.f7077k;
        return str != null ? str : "";
    }

    public final String z() {
        return "1.12.1-release-56c874c7";
    }
}
