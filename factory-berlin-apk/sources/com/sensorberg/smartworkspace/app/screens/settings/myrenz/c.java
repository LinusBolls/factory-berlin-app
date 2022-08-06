package com.sensorberg.smartworkspace.app.screens.settings.myrenz;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import androidx.lifecycle.n0;
import kotlin.jvm.internal.k;

/* compiled from: SetMyRenzCredentialsViewModel.kt */
public final class c extends n0 {

    /* renamed from: i  reason: collision with root package name */
    private final e0<String> f7778i;

    /* renamed from: j  reason: collision with root package name */
    private final LiveData<String> f7779j;

    /* renamed from: k  reason: collision with root package name */
    private final e0<String> f7780k;

    /* renamed from: l  reason: collision with root package name */
    private final LiveData<String> f7781l;

    /* renamed from: m  reason: collision with root package name */
    private final a f7782m;

    public c(a aVar) {
        k.e(aVar, "myRenzCredentialsRepository");
        this.f7782m = aVar;
        e0<String> e0Var = new e0<>(this.f7782m.b());
        this.f7778i = e0Var;
        this.f7779j = e0Var;
        e0<String> e0Var2 = new e0<>(this.f7782m.a());
        this.f7780k = e0Var2;
        this.f7781l = e0Var2;
    }

    public final LiveData<String> r() {
        return this.f7781l;
    }

    public final LiveData<String> s() {
        return this.f7779j;
    }

    public final void t(String str, String str2) {
        k.e(str, "username");
        k.e(str2, "password");
        this.f7782m.c(str, str2);
    }
}
