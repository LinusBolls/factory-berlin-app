package androidx.coordinatorlayout.widget;

import e.e.g;
import e.h.j.e;
import e.h.j.f;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* compiled from: DirectedAcyclicGraph */
public final class a<T> {
    private final e<ArrayList<T>> a = new f(10);
    private final g<T, ArrayList<T>> b = new g<>();
    private final ArrayList<T> c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    private final HashSet<T> f645d = new HashSet<>();

    private void e(T t, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (!arrayList.contains(t)) {
            if (!hashSet.contains(t)) {
                hashSet.add(t);
                ArrayList arrayList2 = this.b.get(t);
                if (arrayList2 != null) {
                    int size = arrayList2.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        e(arrayList2.get(i2), arrayList, hashSet);
                    }
                }
                hashSet.remove(t);
                arrayList.add(t);
                return;
            }
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
    }

    private ArrayList<T> f() {
        ArrayList<T> b2 = this.a.b();
        return b2 == null ? new ArrayList<>() : b2;
    }

    private void k(ArrayList<T> arrayList) {
        arrayList.clear();
        this.a.a(arrayList);
    }

    public void a(T t, T t2) {
        if (!this.b.containsKey(t) || !this.b.containsKey(t2)) {
            throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
        }
        ArrayList arrayList = this.b.get(t);
        if (arrayList == null) {
            arrayList = f();
            this.b.put(t, arrayList);
        }
        arrayList.add(t2);
    }

    public void b(T t) {
        if (!this.b.containsKey(t)) {
            this.b.put(t, null);
        }
    }

    public void c() {
        int size = this.b.size();
        for (int i2 = 0; i2 < size; i2++) {
            ArrayList m2 = this.b.m(i2);
            if (m2 != null) {
                k(m2);
            }
        }
        this.b.clear();
    }

    public boolean d(T t) {
        return this.b.containsKey(t);
    }

    public List g(T t) {
        return this.b.get(t);
    }

    public List<T> h(T t) {
        int size = this.b.size();
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < size; i2++) {
            ArrayList m2 = this.b.m(i2);
            if (m2 != null && m2.contains(t)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.b.i(i2));
            }
        }
        return arrayList;
    }

    public ArrayList<T> i() {
        this.c.clear();
        this.f645d.clear();
        int size = this.b.size();
        for (int i2 = 0; i2 < size; i2++) {
            e(this.b.i(i2), this.c, this.f645d);
        }
        return this.c;
    }

    public boolean j(T t) {
        int size = this.b.size();
        for (int i2 = 0; i2 < size; i2++) {
            ArrayList m2 = this.b.m(i2);
            if (m2 != null && m2.contains(t)) {
                return true;
            }
        }
        return false;
    }
}
