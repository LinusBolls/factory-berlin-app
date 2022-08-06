package com.google.crypto.tink.shaded.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: UnmodifiableLazyStringList */
public class p1 extends AbstractList<String> implements f0, RandomAccess {
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final f0 f3779g;

    /* compiled from: UnmodifiableLazyStringList */
    class a implements ListIterator<String> {

        /* renamed from: g  reason: collision with root package name */
        ListIterator<String> f3780g = p1.this.f3779g.listIterator(this.f3781h);

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f3781h;

        a(int i2) {
            this.f3781h = i2;
        }

        public void a(String str) {
            throw new UnsupportedOperationException();
        }

        public /* bridge */ /* synthetic */ void add(Object obj) {
            a((String) obj);
            throw null;
        }

        /* renamed from: c */
        public String next() {
            return this.f3780g.next();
        }

        /* renamed from: d */
        public String previous() {
            return this.f3780g.previous();
        }

        public void e(String str) {
            throw new UnsupportedOperationException();
        }

        public boolean hasNext() {
            return this.f3780g.hasNext();
        }

        public boolean hasPrevious() {
            return this.f3780g.hasPrevious();
        }

        public int nextIndex() {
            return this.f3780g.nextIndex();
        }

        public int previousIndex() {
            return this.f3780g.previousIndex();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

        public /* bridge */ /* synthetic */ void set(Object obj) {
            e((String) obj);
            throw null;
        }
    }

    /* compiled from: UnmodifiableLazyStringList */
    class b implements Iterator<String> {

        /* renamed from: g  reason: collision with root package name */
        Iterator<String> f3783g = p1.this.f3779g.iterator();

        b() {
        }

        /* renamed from: a */
        public String next() {
            return this.f3783g.next();
        }

        public boolean hasNext() {
            return this.f3783g.hasNext();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public p1(f0 f0Var) {
        this.f3779g = f0Var;
    }

    public f0 A() {
        return this;
    }

    public Object C(int i2) {
        return this.f3779g.C(i2);
    }

    public List<?> I() {
        return this.f3779g.I();
    }

    /* renamed from: d */
    public String get(int i2) {
        return (String) this.f3779g.get(i2);
    }

    public Iterator<String> iterator() {
        return new b();
    }

    public ListIterator<String> listIterator(int i2) {
        return new a(i2);
    }

    public int size() {
        return this.f3779g.size();
    }

    public void x(i iVar) {
        throw new UnsupportedOperationException();
    }
}
