package com.sensorberg.encryptor;

import androidx.lifecycle.c0;
import androidx.lifecycle.e0;
import androidx.lifecycle.f0;
import com.sensorberg.encryptor.d;
import kotlin.jvm.internal.k;

/* compiled from: LiveEncryptedObject.kt */
public final class i<T> extends c0<T> {
    private final e0<String> r;
    /* access modifiers changed from: private */
    public final d.c s;
    /* access modifiers changed from: private */
    public final Class<T> t;

    /* compiled from: LiveEncryptedObject.kt */
    static final class a<T> implements f0<S> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ i f5099g;

        a(i iVar) {
            this.f5099g = iVar;
        }

        /* renamed from: a */
        public final void k(String str) {
            Object obj;
            i iVar = this.f5099g;
            if (str == null) {
                obj = null;
            } else {
                obj = iVar.s.b(str, this.f5099g.t);
            }
            i.super.u(obj);
        }
    }

    public i(e0<String> e0Var, d.c cVar, Class<T> cls) {
        k.f(e0Var, "source");
        k.f(cVar, "objectSerializer");
        k.f(cls, "klazz");
        this.r = e0Var;
        this.s = cVar;
        this.t = cls;
        v(e0Var, new a(this));
    }

    public void u(T t2) {
        super.u(t2);
        if (t2 == null) {
            this.r.u(null);
        } else {
            this.r.u(this.s.a(t2, this.t));
        }
    }
}
