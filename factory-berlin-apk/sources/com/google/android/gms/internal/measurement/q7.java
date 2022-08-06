package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
public final class q7 extends n5<String> implements p7, RandomAccess {

    /* renamed from: i  reason: collision with root package name */
    private static final q7 f2499i;

    /* renamed from: h  reason: collision with root package name */
    private final List<Object> f2500h;

    static {
        q7 q7Var = new q7();
        f2499i = q7Var;
        q7Var.B();
    }

    public q7() {
        this(10);
    }

    private static String d(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof t5) {
            return ((t5) obj).o();
        }
        return b7.i((byte[]) obj);
    }

    public final /* synthetic */ void add(int i2, Object obj) {
        a();
        this.f2500h.add(i2, (String) obj);
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    public final List<?> c() {
        return Collections.unmodifiableList(this.f2500h);
    }

    public final void clear() {
        a();
        this.f2500h.clear();
        this.modCount++;
    }

    public final /* synthetic */ h7 f(int i2) {
        if (i2 >= size()) {
            ArrayList arrayList = new ArrayList(i2);
            arrayList.addAll(this.f2500h);
            return new q7((ArrayList<Object>) arrayList);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object get(int i2) {
        Object obj = this.f2500h.get(i2);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof t5) {
            t5 t5Var = (t5) obj;
            String o = t5Var.o();
            if (t5Var.r()) {
                this.f2500h.set(i2, o);
            }
            return o;
        }
        byte[] bArr = (byte[]) obj;
        String i3 = b7.i(bArr);
        if (b7.h(bArr)) {
            this.f2500h.set(i2, i3);
        }
        return i3;
    }

    public final Object h(int i2) {
        return this.f2500h.get(i2);
    }

    public final void p(t5 t5Var) {
        a();
        this.f2500h.add(t5Var);
        this.modCount++;
    }

    public final /* synthetic */ Object set(int i2, Object obj) {
        a();
        return d(this.f2500h.set(i2, (String) obj));
    }

    public final int size() {
        return this.f2500h.size();
    }

    public final p7 v() {
        return b() ? new u9(this) : this;
    }

    public q7(int i2) {
        this((ArrayList<Object>) new ArrayList(i2));
    }

    public final boolean addAll(int i2, Collection<? extends String> collection) {
        a();
        if (collection instanceof p7) {
            collection = ((p7) collection).c();
        }
        boolean addAll = this.f2500h.addAll(i2, collection);
        this.modCount++;
        return addAll;
    }

    public final /* synthetic */ Object remove(int i2) {
        a();
        Object remove = this.f2500h.remove(i2);
        this.modCount++;
        return d(remove);
    }

    private q7(ArrayList<Object> arrayList) {
        this.f2500h = arrayList;
    }
}
