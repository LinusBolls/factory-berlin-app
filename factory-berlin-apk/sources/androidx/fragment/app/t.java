package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: FragmentStore */
class t {
    private final ArrayList<Fragment> a = new ArrayList<>();
    private final HashMap<String, s> b = new HashMap<>();

    t() {
    }

    /* access modifiers changed from: package-private */
    public void a(Fragment fragment) {
        if (!this.a.contains(fragment)) {
            synchronized (this.a) {
                this.a.add(fragment);
            }
            fragment.q = true;
            return;
        }
        throw new IllegalStateException("Fragment already added: " + fragment);
    }

    /* access modifiers changed from: package-private */
    public void b() {
        this.b.values().removeAll(Collections.singleton((Object) null));
    }

    /* access modifiers changed from: package-private */
    public boolean c(String str) {
        return this.b.containsKey(str);
    }

    /* access modifiers changed from: package-private */
    public void d(int i2) {
        Iterator<Fragment> it = this.a.iterator();
        while (it.hasNext()) {
            s sVar = this.b.get(it.next().f779k);
            if (sVar != null) {
                sVar.q(i2);
            }
        }
        for (s next : this.b.values()) {
            if (next != null) {
                next.q(i2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2 = str + "    ";
        if (!this.b.isEmpty()) {
            printWriter.print(str);
            printWriter.print("Active Fragments:");
            for (s next : this.b.values()) {
                printWriter.print(str);
                if (next != null) {
                    Fragment i2 = next.i();
                    printWriter.println(i2);
                    i2.s(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size = this.a.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i3 = 0; i3 < size; i3++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(this.a.get(i3).toString());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public Fragment f(String str) {
        s sVar = this.b.get(str);
        if (sVar != null) {
            return sVar.i();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public Fragment g(int i2) {
        for (int size = this.a.size() - 1; size >= 0; size--) {
            Fragment fragment = this.a.get(size);
            if (fragment != null && fragment.B == i2) {
                return fragment;
            }
        }
        for (s next : this.b.values()) {
            if (next != null) {
                Fragment i3 = next.i();
                if (i3.B == i2) {
                    return i3;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public Fragment h(String str) {
        if (str != null) {
            for (int size = this.a.size() - 1; size >= 0; size--) {
                Fragment fragment = this.a.get(size);
                if (fragment != null && str.equals(fragment.D)) {
                    return fragment;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (s next : this.b.values()) {
            if (next != null) {
                Fragment i2 = next.i();
                if (str.equals(i2.D)) {
                    return i2;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public Fragment i(String str) {
        Fragment u;
        for (s next : this.b.values()) {
            if (next != null && (u = next.i().u(str)) != null) {
                return u;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public Fragment j(Fragment fragment) {
        ViewGroup viewGroup = fragment.L;
        View view = fragment.M;
        if (!(viewGroup == null || view == null)) {
            for (int indexOf = this.a.indexOf(fragment) - 1; indexOf >= 0; indexOf--) {
                Fragment fragment2 = this.a.get(indexOf);
                if (fragment2.L == viewGroup && fragment2.M != null) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public List<Fragment> k() {
        ArrayList arrayList = new ArrayList();
        for (s next : this.b.values()) {
            if (next != null) {
                arrayList.add(next.i());
            } else {
                arrayList.add((Object) null);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public s l(String str) {
        return this.b.get(str);
    }

    /* access modifiers changed from: package-private */
    public List<Fragment> m() {
        ArrayList arrayList;
        if (this.a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.a) {
            arrayList = new ArrayList(this.a);
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public void n(s sVar) {
        this.b.put(sVar.i().f779k, sVar);
    }

    /* access modifiers changed from: package-private */
    public void o(s sVar) {
        Fragment i2 = sVar.i();
        for (s next : this.b.values()) {
            if (next != null) {
                Fragment i3 = next.i();
                if (i2.f779k.equals(i3.f782n)) {
                    i3.f781m = i2;
                    i3.f782n = null;
                }
            }
        }
        this.b.put(i2.f779k, (Object) null);
        String str = i2.f782n;
        if (str != null) {
            i2.f781m = f(str);
        }
    }

    /* access modifiers changed from: package-private */
    public void p(Fragment fragment) {
        synchronized (this.a) {
            this.a.remove(fragment);
        }
        fragment.q = false;
    }

    /* access modifiers changed from: package-private */
    public void q() {
        this.b.clear();
    }

    /* access modifiers changed from: package-private */
    public void r(List<String> list) {
        this.a.clear();
        if (list != null) {
            for (String next : list) {
                Fragment f2 = f(next);
                if (f2 != null) {
                    if (m.p0(2)) {
                        Log.v("FragmentManager", "restoreSaveState: added (" + next + "): " + f2);
                    }
                    a(f2);
                } else {
                    throw new IllegalStateException("No instantiated fragment for (" + next + ")");
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public ArrayList<r> s() {
        ArrayList<r> arrayList = new ArrayList<>(this.b.size());
        for (s next : this.b.values()) {
            if (next != null) {
                Fragment i2 = next.i();
                r o = next.o();
                arrayList.add(o);
                if (m.p0(2)) {
                    Log.v("FragmentManager", "Saved state of " + i2 + ": " + o.s);
                }
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public ArrayList<String> t() {
        synchronized (this.a) {
            if (this.a.isEmpty()) {
                return null;
            }
            ArrayList<String> arrayList = new ArrayList<>(this.a.size());
            Iterator<Fragment> it = this.a.iterator();
            while (it.hasNext()) {
                Fragment next = it.next();
                arrayList.add(next.f779k);
                if (m.p0(2)) {
                    Log.v("FragmentManager", "saveAllState: adding fragment (" + next.f779k + "): " + next);
                }
            }
            return arrayList;
        }
    }
}
