package com.google.crypto.tink.shaded.protobuf;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: LazyStringArrayList */
public class e0 extends c<String> implements f0, RandomAccess {

    /* renamed from: i  reason: collision with root package name */
    private static final e0 f3721i;

    /* renamed from: h  reason: collision with root package name */
    private final List<Object> f3722h;

    static {
        e0 e0Var = new e0();
        f3721i = e0Var;
        e0Var.t();
    }

    public e0() {
        this(10);
    }

    private static String e(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof i) {
            return ((i) obj).E();
        }
        return a0.j((byte[]) obj);
    }

    public f0 A() {
        return O() ? new p1(this) : this;
    }

    public Object C(int i2) {
        return this.f3722h.get(i2);
    }

    public List<?> I() {
        return Collections.unmodifiableList(this.f3722h);
    }

    public boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    public void clear() {
        a();
        this.f3722h.clear();
        this.modCount++;
    }

    /* renamed from: d */
    public void add(int i2, String str) {
        a();
        this.f3722h.add(i2, str);
        this.modCount++;
    }

    /* renamed from: g */
    public String get(int i2) {
        Object obj = this.f3722h.get(i2);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            String E = iVar.E();
            if (iVar.m()) {
                this.f3722h.set(i2, E);
            }
            return E;
        }
        byte[] bArr = (byte[]) obj;
        String j2 = a0.j(bArr);
        if (a0.g(bArr)) {
            this.f3722h.set(i2, j2);
        }
        return j2;
    }

    /* renamed from: i */
    public e0 w(int i2) {
        if (i2 >= size()) {
            ArrayList arrayList = new ArrayList(i2);
            arrayList.addAll(this.f3722h);
            return new e0((ArrayList<Object>) arrayList);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: j */
    public String remove(int i2) {
        a();
        Object remove = this.f3722h.remove(i2);
        this.modCount++;
        return e(remove);
    }

    /* renamed from: k */
    public String set(int i2, String str) {
        a();
        return e(this.f3722h.set(i2, str));
    }

    public int size() {
        return this.f3722h.size();
    }

    public void x(i iVar) {
        a();
        this.f3722h.add(iVar);
        this.modCount++;
    }

    public e0(int i2) {
        this((ArrayList<Object>) new ArrayList(i2));
    }

    public boolean addAll(int i2, Collection<? extends String> collection) {
        a();
        if (collection instanceof f0) {
            collection = ((f0) collection).I();
        }
        boolean addAll = this.f3722h.addAll(i2, collection);
        this.modCount++;
        return addAll;
    }

    private e0(ArrayList<Object> arrayList) {
        this.f3722h = arrayList;
    }
}
