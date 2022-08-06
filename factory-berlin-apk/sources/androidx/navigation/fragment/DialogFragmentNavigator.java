package androidx.navigation.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.c;
import androidx.fragment.app.m;
import androidx.lifecycle.p;
import androidx.lifecycle.t;
import androidx.lifecycle.v;
import androidx.navigation.o;
import androidx.navigation.u;
import androidx.navigation.x;

@x.b("dialog")
public final class DialogFragmentNavigator extends x<a> {
    private final Context a;
    private final m b;
    private int c = 0;

    /* renamed from: d  reason: collision with root package name */
    private t f1061d = new t(this) {
        public void d(v vVar, p.a aVar) {
            if (aVar == p.a.ON_STOP) {
                c cVar = (c) vVar;
                if (!cVar.Y1().isShowing()) {
                    c.R1(cVar).v();
                }
            }
        }
    };

    public static class a extends o implements androidx.navigation.c {
        private String o;

        public a(x<? extends a> xVar) {
            super((x<? extends o>) xVar);
        }

        public final String E() {
            String str = this.o;
            if (str != null) {
                return str;
            }
            throw new IllegalStateException("DialogFragment class was not set");
        }

        public final a F(String str) {
            this.o = str;
            return this;
        }

        public void r(Context context, AttributeSet attributeSet) {
            super.r(context, attributeSet);
            TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, e.DialogFragmentNavigator);
            String string = obtainAttributes.getString(e.DialogFragmentNavigator_android_name);
            if (string != null) {
                F(string);
            }
            obtainAttributes.recycle();
        }
    }

    public DialogFragmentNavigator(Context context, m mVar) {
        this.a = context;
        this.b = mVar;
    }

    public void c(Bundle bundle) {
        if (bundle != null) {
            int i2 = 0;
            this.c = bundle.getInt("androidx-nav-dialogfragment:navigator:count", 0);
            while (i2 < this.c) {
                m mVar = this.b;
                c cVar = (c) mVar.X("androidx-nav-fragment:navigator:dialog:" + i2);
                if (cVar != null) {
                    cVar.a().a(this.f1061d);
                    i2++;
                } else {
                    throw new IllegalStateException("DialogFragment " + i2 + " doesn't exist in the FragmentManager");
                }
            }
        }
    }

    public Bundle d() {
        if (this.c == 0) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("androidx-nav-dialogfragment:navigator:count", this.c);
        return bundle;
    }

    public boolean e() {
        if (this.c == 0) {
            return false;
        }
        if (this.b.u0()) {
            Log.i("DialogFragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return false;
        }
        m mVar = this.b;
        StringBuilder sb = new StringBuilder();
        sb.append("androidx-nav-fragment:navigator:dialog:");
        int i2 = this.c - 1;
        this.c = i2;
        sb.append(i2);
        Fragment X = mVar.X(sb.toString());
        if (X != null) {
            X.a().c(this.f1061d);
            ((c) X).S1();
        }
        return true;
    }

    /* renamed from: f */
    public a a() {
        return new a(this);
    }

    /* renamed from: g */
    public o b(a aVar, Bundle bundle, u uVar, x.a aVar2) {
        if (this.b.u0()) {
            Log.i("DialogFragmentNavigator", "Ignoring navigate() call: FragmentManager has already saved its state");
            return null;
        }
        String E = aVar.E();
        if (E.charAt(0) == '.') {
            E = this.a.getPackageName() + E;
        }
        Fragment a2 = this.b.e0().a(this.a.getClassLoader(), E);
        if (c.class.isAssignableFrom(a2.getClass())) {
            c cVar = (c) a2;
            cVar.D1(bundle);
            cVar.a().a(this.f1061d);
            m mVar = this.b;
            StringBuilder sb = new StringBuilder();
            sb.append("androidx-nav-fragment:navigator:dialog:");
            int i2 = this.c;
            this.c = i2 + 1;
            sb.append(i2);
            cVar.d2(mVar, sb.toString());
            return aVar;
        }
        throw new IllegalArgumentException("Dialog destination " + aVar.E() + " is not an instance of DialogFragment");
    }
}
