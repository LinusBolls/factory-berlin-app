package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
public abstract class l4<E> extends c4<E> implements Set<E> {
    @NullableDecl

    /* renamed from: h  reason: collision with root package name */
    private transient b4<E> f2401h;

    l4() {
    }

    static int k(int i2) {
        int max = Math.max(i2, 2);
        boolean z = true;
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1) << 1;
            while (((double) highestOneBit) * 0.7d < ((double) max)) {
                highestOneBit <<= 1;
            }
            return highestOneBit;
        }
        if (max >= 1073741824) {
            z = false;
        }
        b3.f(z, "collection too large");
        return 1073741824;
    }

    /* access modifiers changed from: package-private */
    public boolean b() {
        return false;
    }

    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l4) || !b() || !((l4) obj).b() || hashCode() == obj.hashCode()) {
            return w4.b(this, obj);
        }
        return false;
    }

    public int hashCode() {
        return w4.a(this);
    }

    public /* synthetic */ Iterator iterator() {
        return iterator();
    }

    public b4<E> l() {
        b4<E> b4Var = this.f2401h;
        if (b4Var != null) {
            return b4Var;
        }
        b4<E> m2 = m();
        this.f2401h = m2;
        return m2;
    }

    /* access modifiers changed from: package-private */
    public b4<E> m() {
        return b4.m(toArray());
    }
}
