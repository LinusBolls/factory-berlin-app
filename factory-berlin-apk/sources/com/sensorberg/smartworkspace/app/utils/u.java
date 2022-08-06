package com.sensorberg.smartworkspace.app.utils;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.n0;
import androidx.lifecycle.q0;
import kotlin.e;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;

/* compiled from: ViewModelResultFragment.kt */
public final class u {

    /* compiled from: ViewModelResultFragment.kt */
    static final class a extends l implements kotlin.e0.c.a<s<T>> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ t f8019h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ String f8020i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(t tVar, String str) {
            super(0);
            this.f8019h = tVar;
            this.f8020i = str;
        }

        /* renamed from: a */
        public final s<T> d() {
            return u.a(this.f8019h, this.f8020i);
        }
    }

    public static final <T> s<T> a(t tVar, String str) {
        k.e(tVar, "$this$getResult");
        k.e(str, "key");
        return b(tVar).s(str);
    }

    private static final v b(Object obj) {
        if (obj instanceof Fragment) {
            n0 a2 = q0.c(((Fragment) obj).v1()).a(v.class);
            k.d(a2, "ViewModelProviders.of(re…ResultHolder::class.java)");
            return (v) a2;
        }
        throw new IllegalStateException("ViewModelResultFragment should only be applied to Fragments".toString());
    }

    public static final <T> e<s<T>> c(t tVar, String str) {
        k.e(tVar, "$this$lazyResult");
        k.e(str, "key");
        return g.a(new a(tVar, str));
    }

    public static final <T> void d(t tVar, String str, T t) {
        k.e(tVar, "$this$setResult");
        k.e(str, "key");
        b(tVar).u(str, t);
    }
}
