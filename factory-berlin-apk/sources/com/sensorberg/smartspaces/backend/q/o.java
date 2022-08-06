package com.sensorberg.smartspaces.backend.q;

import android.content.Context;
import android.os.Build;
import k.b0;
import k.d0;
import k.w;
import kotlin.jvm.internal.k;

/* compiled from: UserAgentInterceptor.kt */
public final class o implements w {
    public static String b;
    public static final a c = new a((DefaultConstructorMarker) null);

    /* compiled from: UserAgentInterceptor.kt */
    public static final class a {
        private a() {
        }

        public final o a(Context context) {
            k.e(context, "context");
            b(context.getPackageName() + '/' + context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName + "(AndroidVersion " + Build.VERSION.RELEASE + "; " + "API-" + Build.VERSION.SDK_INT + "; " + Build.MANUFACTURER + '-' + Build.BRAND + '-' + Build.MODEL + ')');
            return new o((DefaultConstructorMarker) null);
        }

        public final void b(String str) {
            k.e(str, "<set-?>");
            o.b = str;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private o() {
        StringBuilder sb = new StringBuilder();
        sb.append("User-Agent: ");
        String str = b;
        if (str != null) {
            sb.append(str);
            n.a.a.f(sb.toString(), new Object[0]);
            return;
        }
        k.q("USER_AGENT");
        throw null;
    }

    public d0 a(w.a aVar) {
        k.e(aVar, "chain");
        b0.a i2 = aVar.j().i();
        i2.i("User-Agent");
        String str = b;
        if (str != null) {
            i2.a("User-Agent", str);
            return aVar.a(i2.b());
        }
        k.q("USER_AGENT");
        throw null;
    }

    public /* synthetic */ o(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
