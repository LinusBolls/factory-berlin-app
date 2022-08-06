package com.sensorberg.smartworkspace.app.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.u;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.f0;
import com.sensorberg.factory.R;
import java.util.Map;
import kotlin.jvm.internal.k;

/* compiled from: ContainerFragment.kt */
public abstract class a<T> extends com.sensorberg.smartworkspace.app.a {
    /* access modifiers changed from: private */
    public final Map<T, Class<? extends com.sensorberg.smartworkspace.app.a>> e0;

    /* renamed from: com.sensorberg.smartworkspace.app.ui.a$a  reason: collision with other inner class name */
    /* compiled from: ContainerFragment.kt */
    public static final class C0537a {
        private C0537a() {
        }

        public /* synthetic */ C0537a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: ContainerFragment.kt */
    static final class b<T> implements f0<T> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ a f7996g;

        b(a aVar) {
            this.f7996g = aVar;
        }

        public final void k(T t) {
            Class cls = (Class) this.f7996g.e0.get(t);
            if (cls != null) {
                this.f7996g.V1(cls);
            }
        }
    }

    static {
        new C0537a((DefaultConstructorMarker) null);
    }

    public a(Map<T, ? extends Class<? extends com.sensorberg.smartworkspace.app.a>> map) {
        k.e(map, "map");
        this.e0 = map;
    }

    /* access modifiers changed from: private */
    public final void V1(Class<? extends Fragment> cls) {
        Fragment X = B().X("active_fragment");
        if (X == null || !k.a(X.getClass(), cls)) {
            u i2 = B().i();
            if (X != null) {
                i2.q(X);
            }
            i2.s(R.id.container_content, (Fragment) cls.newInstance(), "active_fragment");
            i2.l();
        }
    }

    public View A0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        k.e(layoutInflater, "inflater");
        X1().o(a0(), new b(this));
        return layoutInflater.inflate(W1(), viewGroup, false);
    }

    public /* synthetic */ void D0() {
        super.D0();
        Q1();
    }

    public abstract int W1();

    public abstract LiveData<T> X1();
}
