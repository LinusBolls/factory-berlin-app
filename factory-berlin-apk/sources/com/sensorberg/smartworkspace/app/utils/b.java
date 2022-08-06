package com.sensorberg.smartworkspace.app.utils;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.m0;
import g.e.n.g.x;
import kotlin.jvm.internal.k;

/* compiled from: BluetoothErrorLiveDataFactory.kt */
public final class b {
    public static final b a = new b();

    /* compiled from: BluetoothErrorLiveDataFactory.kt */
    static final class a<I, O> implements e.b.a.c.a<x.a, Boolean> {
        public static final a a = new a();

        a() {
        }

        /* renamed from: b */
        public final Boolean a(x.a aVar) {
            return Boolean.valueOf(aVar instanceof x.a.C0725a);
        }
    }

    private b() {
    }

    public final LiveData<Boolean> a(x xVar) {
        k.e(xVar, "unitController");
        LiveData<Boolean> b = m0.b(xVar.getStatusLiveData(), a.a);
        k.d(b, "Transformations.map(unit…r.Status.BluetoothError }");
        return b;
    }
}
