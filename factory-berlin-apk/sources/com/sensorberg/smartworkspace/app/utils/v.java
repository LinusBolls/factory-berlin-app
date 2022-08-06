package com.sensorberg.smartworkspace.app.utils;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import androidx.lifecycle.n0;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.k;

/* compiled from: ViewModelResultFragment.kt */
public final class v extends n0 {

    /* renamed from: i  reason: collision with root package name */
    private final Map<String, e0<?>> f8021i = new LinkedHashMap();

    /* compiled from: ViewModelResultFragment.kt */
    private final class a<T> implements s<T> {
        private final String a;
        final /* synthetic */ v b;

        public a(v vVar, String str) {
            k.e(str, "key");
            this.b = vVar;
            this.a = str;
        }

        public LiveData<T> a() {
            return this.b.t(this.a);
        }

        public void clear() {
            this.b.t(this.a).u(null);
        }
    }

    /* access modifiers changed from: private */
    public final <T> e0<T> t(String str) {
        e0<T> e0Var = this.f8021i.get(str);
        if (e0Var != null) {
            return e0Var;
        }
        e0<T> e0Var2 = new e0<>();
        this.f8021i.put(str, e0Var2);
        return e0Var2;
    }

    public final <T> s<T> s(String str) {
        k.e(str, "key");
        return new a(this, str);
    }

    public final <T> void u(String str, T t) {
        k.e(str, "key");
        t(str).u(t);
    }
}
