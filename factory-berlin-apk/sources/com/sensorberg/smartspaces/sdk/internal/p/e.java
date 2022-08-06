package com.sensorberg.smartspaces.sdk.internal.p;

import g.e.m.a;
import java.util.List;
import kotlin.e0.c.p;
import kotlin.e0.c.q;
import kotlin.x;

/* compiled from: BlueIdInterface.kt */
public interface e {
    g.e.k.e<i> a();

    void b();

    <T> T c(String str, q<? super String, ? super String, ? super Integer, ? extends T> qVar);

    g.e.k.e<List<String>> d();

    void destroy();

    void e();

    void f(String str, String str2);

    g.e.k.e<a<Void, h>> g(String str, kotlin.e0.c.a<x> aVar, kotlin.e0.c.a<x> aVar2, p<? super String, ? super Integer, x> pVar);

    g.e.k.e<String> getDeviceId();
}
