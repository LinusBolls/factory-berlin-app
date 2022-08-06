package com.google.android.gms.internal.measurement;

import java.util.ListIterator;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
final class t9 implements ListIterator<String> {

    /* renamed from: g  reason: collision with root package name */
    private ListIterator<String> f2556g = this.f2558i.f2567g.listIterator(this.f2557h);

    /* renamed from: h  reason: collision with root package name */
    private final /* synthetic */ int f2557h;

    /* renamed from: i  reason: collision with root package name */
    private final /* synthetic */ u9 f2558i;

    t9(u9 u9Var, int i2) {
        this.f2558i = u9Var;
        this.f2557h = i2;
    }

    public final /* synthetic */ void add(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }

    public final boolean hasNext() {
        return this.f2556g.hasNext();
    }

    public final boolean hasPrevious() {
        return this.f2556g.hasPrevious();
    }

    public final /* synthetic */ Object next() {
        return this.f2556g.next();
    }

    public final int nextIndex() {
        return this.f2556g.nextIndex();
    }

    public final /* synthetic */ Object previous() {
        return this.f2556g.previous();
    }

    public final int previousIndex() {
        return this.f2556g.previousIndex();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ void set(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }
}
