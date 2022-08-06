package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.s1;

/* compiled from: MapEntryLite */
public class j0<K, V> {
    private final a<K, V> a;

    /* compiled from: MapEntryLite */
    static class a<K, V> {
        public final s1.b a;
        public final K b;
        public final s1.b c;

        /* renamed from: d  reason: collision with root package name */
        public final V f3752d;
    }

    static <K, V> int b(a<K, V> aVar, K k2, V v) {
        return u.d(aVar.a, 1, k2) + u.d(aVar.c, 2, v);
    }

    static <K, V> void d(CodedOutputStream codedOutputStream, a<K, V> aVar, K k2, V v) {
        u.y(codedOutputStream, aVar.a, 1, k2);
        u.y(codedOutputStream, aVar.c, 2, v);
    }

    public int a(int i2, K k2, V v) {
        return CodedOutputStream.U(i2) + CodedOutputStream.C(b(this.a, k2, v));
    }

    /* access modifiers changed from: package-private */
    public a<K, V> c() {
        return this.a;
    }
}
