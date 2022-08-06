package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
public final class u9 extends AbstractList<String> implements p7, RandomAccess {
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final p7 f2567g;

    public u9(p7 p7Var) {
        this.f2567g = p7Var;
    }

    public final List<?> c() {
        return this.f2567g.c();
    }

    public final /* synthetic */ Object get(int i2) {
        return (String) this.f2567g.get(i2);
    }

    public final Object h(int i2) {
        return this.f2567g.h(i2);
    }

    public final Iterator<String> iterator() {
        return new w9(this);
    }

    public final ListIterator<String> listIterator(int i2) {
        return new t9(this, i2);
    }

    public final void p(t5 t5Var) {
        throw new UnsupportedOperationException();
    }

    public final int size() {
        return this.f2567g.size();
    }

    public final p7 v() {
        return this;
    }
}
