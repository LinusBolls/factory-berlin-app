package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import e.h.k.v;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: MenuBuilder */
public class g implements e.h.e.a.a {
    private static final int[] A = {1, 4, 5, 3, 2, 0};
    private final Context a;
    private final Resources b;
    private boolean c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f242d;

    /* renamed from: e  reason: collision with root package name */
    private a f243e;

    /* renamed from: f  reason: collision with root package name */
    private ArrayList<i> f244f;

    /* renamed from: g  reason: collision with root package name */
    private ArrayList<i> f245g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f246h;

    /* renamed from: i  reason: collision with root package name */
    private ArrayList<i> f247i;

    /* renamed from: j  reason: collision with root package name */
    private ArrayList<i> f248j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f249k;

    /* renamed from: l  reason: collision with root package name */
    private int f250l = 0;

    /* renamed from: m  reason: collision with root package name */
    private ContextMenu.ContextMenuInfo f251m;

    /* renamed from: n  reason: collision with root package name */
    CharSequence f252n;
    Drawable o;
    View p;
    private boolean q = false;
    private boolean r = false;
    private boolean s = false;
    private boolean t = false;
    private boolean u = false;
    private ArrayList<i> v = new ArrayList<>();
    private CopyOnWriteArrayList<WeakReference<m>> w = new CopyOnWriteArrayList<>();
    private i x;
    private boolean y = false;
    private boolean z;

    /* compiled from: MenuBuilder */
    public interface a {
        boolean a(g gVar, MenuItem menuItem);

        void b(g gVar);
    }

    /* compiled from: MenuBuilder */
    public interface b {
        boolean a(i iVar);
    }

    public g(Context context) {
        this.a = context;
        this.b = context.getResources();
        this.f244f = new ArrayList<>();
        this.f245g = new ArrayList<>();
        this.f246h = true;
        this.f247i = new ArrayList<>();
        this.f248j = new ArrayList<>();
        this.f249k = true;
        f0(true);
    }

    private static int D(int i2) {
        int i3 = (-65536 & i2) >> 16;
        if (i3 >= 0) {
            int[] iArr = A;
            if (i3 < iArr.length) {
                return (i2 & 65535) | (iArr[i3] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    private void P(int i2, boolean z2) {
        if (i2 >= 0 && i2 < this.f244f.size()) {
            this.f244f.remove(i2);
            if (z2) {
                M(true);
            }
        }
    }

    private void a0(int i2, CharSequence charSequence, int i3, Drawable drawable, View view) {
        Resources E = E();
        if (view != null) {
            this.p = view;
            this.f252n = null;
            this.o = null;
        } else {
            if (i2 > 0) {
                this.f252n = E.getText(i2);
            } else if (charSequence != null) {
                this.f252n = charSequence;
            }
            if (i3 > 0) {
                this.o = androidx.core.content.a.f(w(), i3);
            } else if (drawable != null) {
                this.o = drawable;
            }
            this.p = null;
        }
        M(false);
    }

    private void f0(boolean z2) {
        boolean z3 = true;
        if (!z2 || this.b.getConfiguration().keyboard == 1 || !v.e(ViewConfiguration.get(this.a), this.a)) {
            z3 = false;
        }
        this.f242d = z3;
    }

    private i g(int i2, int i3, int i4, int i5, CharSequence charSequence, int i6) {
        return new i(this, i2, i3, i4, i5, charSequence, i6);
    }

    private void i(boolean z2) {
        if (!this.w.isEmpty()) {
            h0();
            Iterator<WeakReference<m>> it = this.w.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                m mVar = (m) next.get();
                if (mVar == null) {
                    this.w.remove(next);
                } else {
                    mVar.g(z2);
                }
            }
            g0();
        }
    }

    private void j(Bundle bundle) {
        Parcelable parcelable;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray != null && !this.w.isEmpty()) {
            Iterator<WeakReference<m>> it = this.w.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                m mVar = (m) next.get();
                if (mVar == null) {
                    this.w.remove(next);
                } else {
                    int id = mVar.getId();
                    if (id > 0 && (parcelable = (Parcelable) sparseParcelableArray.get(id)) != null) {
                        mVar.d(parcelable);
                    }
                }
            }
        }
    }

    private void k(Bundle bundle) {
        Parcelable j2;
        if (!this.w.isEmpty()) {
            SparseArray sparseArray = new SparseArray();
            Iterator<WeakReference<m>> it = this.w.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                m mVar = (m) next.get();
                if (mVar == null) {
                    this.w.remove(next);
                } else {
                    int id = mVar.getId();
                    if (id > 0 && (j2 = mVar.j()) != null) {
                        sparseArray.put(id, j2);
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
        }
    }

    private boolean l(r rVar, m mVar) {
        boolean z2 = false;
        if (this.w.isEmpty()) {
            return false;
        }
        if (mVar != null) {
            z2 = mVar.f(rVar);
        }
        Iterator<WeakReference<m>> it = this.w.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            m mVar2 = (m) next.get();
            if (mVar2 == null) {
                this.w.remove(next);
            } else if (!z2) {
                z2 = mVar2.f(rVar);
            }
        }
        return z2;
    }

    private static int p(ArrayList<i> arrayList, int i2) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).f() <= i2) {
                return size + 1;
            }
        }
        return 0;
    }

    public View A() {
        return this.p;
    }

    public ArrayList<i> B() {
        t();
        return this.f248j;
    }

    /* access modifiers changed from: package-private */
    public boolean C() {
        return this.t;
    }

    /* access modifiers changed from: package-private */
    public Resources E() {
        return this.b;
    }

    public g F() {
        return this;
    }

    public ArrayList<i> G() {
        if (!this.f246h) {
            return this.f245g;
        }
        this.f245g.clear();
        int size = this.f244f.size();
        for (int i2 = 0; i2 < size; i2++) {
            i iVar = this.f244f.get(i2);
            if (iVar.isVisible()) {
                this.f245g.add(iVar);
            }
        }
        this.f246h = false;
        this.f249k = true;
        return this.f245g;
    }

    public boolean H() {
        return this.y;
    }

    /* access modifiers changed from: package-private */
    public boolean I() {
        return this.c;
    }

    public boolean J() {
        return this.f242d;
    }

    /* access modifiers changed from: package-private */
    public void K(i iVar) {
        this.f249k = true;
        M(true);
    }

    /* access modifiers changed from: package-private */
    public void L(i iVar) {
        this.f246h = true;
        M(true);
    }

    public void M(boolean z2) {
        if (!this.q) {
            if (z2) {
                this.f246h = true;
                this.f249k = true;
            }
            i(z2);
            return;
        }
        this.r = true;
        if (z2) {
            this.s = true;
        }
    }

    public boolean N(MenuItem menuItem, int i2) {
        return O(menuItem, (m) null, i2);
    }

    public boolean O(MenuItem menuItem, m mVar, int i2) {
        i iVar = (i) menuItem;
        if (iVar == null || !iVar.isEnabled()) {
            return false;
        }
        boolean k2 = iVar.k();
        e.h.k.b b2 = iVar.b();
        boolean z2 = b2 != null && b2.a();
        if (iVar.j()) {
            k2 |= iVar.expandActionView();
            if (k2) {
                e(true);
            }
        } else if (iVar.hasSubMenu() || z2) {
            if ((i2 & 4) == 0) {
                e(false);
            }
            if (!iVar.hasSubMenu()) {
                iVar.x(new r(w(), this, iVar));
            }
            r rVar = (r) iVar.getSubMenu();
            if (z2) {
                b2.f(rVar);
            }
            k2 |= l(rVar, mVar);
            if (!k2) {
                e(true);
            }
        } else if ((i2 & 1) == 0) {
            e(true);
        }
        return k2;
    }

    public void Q(m mVar) {
        Iterator<WeakReference<m>> it = this.w.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            m mVar2 = (m) next.get();
            if (mVar2 == null || mVar2 == mVar) {
                this.w.remove(next);
            }
        }
    }

    public void R(Bundle bundle) {
        MenuItem findItem;
        if (bundle != null) {
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(v());
            int size = size();
            for (int i2 = 0; i2 < size; i2++) {
                MenuItem item = getItem(i2);
                View actionView = item.getActionView();
                if (!(actionView == null || actionView.getId() == -1)) {
                    actionView.restoreHierarchyState(sparseParcelableArray);
                }
                if (item.hasSubMenu()) {
                    ((r) item.getSubMenu()).R(bundle);
                }
            }
            int i3 = bundle.getInt("android:menu:expandedactionview");
            if (i3 > 0 && (findItem = findItem(i3)) != null) {
                findItem.expandActionView();
            }
        }
    }

    public void S(Bundle bundle) {
        j(bundle);
    }

    public void T(Bundle bundle) {
        int size = size();
        SparseArray sparseArray = null;
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = getItem(i2);
            View actionView = item.getActionView();
            if (!(actionView == null || actionView.getId() == -1)) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((r) item.getSubMenu()).T(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(v(), sparseArray);
        }
    }

    public void U(Bundle bundle) {
        k(bundle);
    }

    public void V(a aVar) {
        this.f243e = aVar;
    }

    public g W(int i2) {
        this.f250l = i2;
        return this;
    }

    /* access modifiers changed from: package-private */
    public void X(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f244f.size();
        h0();
        for (int i2 = 0; i2 < size; i2++) {
            i iVar = this.f244f.get(i2);
            if (iVar.getGroupId() == groupId && iVar.m() && iVar.isCheckable()) {
                iVar.s(iVar == menuItem);
            }
        }
        g0();
    }

    /* access modifiers changed from: protected */
    public g Y(int i2) {
        a0(0, (CharSequence) null, i2, (Drawable) null, (View) null);
        return this;
    }

    /* access modifiers changed from: protected */
    public g Z(Drawable drawable) {
        a0(0, (CharSequence) null, 0, drawable, (View) null);
        return this;
    }

    /* access modifiers changed from: protected */
    public MenuItem a(int i2, int i3, int i4, CharSequence charSequence) {
        int D = D(i4);
        i g2 = g(i2, i3, i4, D, charSequence, this.f250l);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.f251m;
        if (contextMenuInfo != null) {
            g2.v(contextMenuInfo);
        }
        ArrayList<i> arrayList = this.f244f;
        arrayList.add(p(arrayList, D), g2);
        M(true);
        return g2;
    }

    public MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    public int addIntentOptions(int i2, int i3, int i4, ComponentName componentName, Intent[] intentArr, Intent intent, int i5, MenuItem[] menuItemArr) {
        int i6;
        PackageManager packageManager = this.a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i5 & 1) == 0) {
            removeGroup(i2);
        }
        for (int i7 = 0; i7 < size; i7++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i7);
            int i8 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i8 < 0 ? intent : intentArr[i8]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = add(i2, i3, i4, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i6 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i6] = intent3;
            }
        }
        return size;
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public void b(m mVar) {
        c(mVar, this.a);
    }

    /* access modifiers changed from: protected */
    public g b0(int i2) {
        a0(i2, (CharSequence) null, 0, (Drawable) null, (View) null);
        return this;
    }

    public void c(m mVar, Context context) {
        this.w.add(new WeakReference(mVar));
        mVar.b(context, this);
        this.f249k = true;
    }

    /* access modifiers changed from: protected */
    public g c0(CharSequence charSequence) {
        a0(0, charSequence, 0, (Drawable) null, (View) null);
        return this;
    }

    public void clear() {
        i iVar = this.x;
        if (iVar != null) {
            f(iVar);
        }
        this.f244f.clear();
        M(true);
    }

    public void clearHeader() {
        this.o = null;
        this.f252n = null;
        this.p = null;
        M(false);
    }

    public void close() {
        e(true);
    }

    public void d() {
        a aVar = this.f243e;
        if (aVar != null) {
            aVar.b(this);
        }
    }

    /* access modifiers changed from: protected */
    public g d0(View view) {
        a0(0, (CharSequence) null, 0, (Drawable) null, view);
        return this;
    }

    public final void e(boolean z2) {
        if (!this.u) {
            this.u = true;
            Iterator<WeakReference<m>> it = this.w.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                m mVar = (m) next.get();
                if (mVar == null) {
                    this.w.remove(next);
                } else {
                    mVar.a(this, z2);
                }
            }
            this.u = false;
        }
    }

    public void e0(boolean z2) {
        this.z = z2;
    }

    public boolean f(i iVar) {
        boolean z2 = false;
        if (!this.w.isEmpty() && this.x == iVar) {
            h0();
            Iterator<WeakReference<m>> it = this.w.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                m mVar = (m) next.get();
                if (mVar == null) {
                    this.w.remove(next);
                } else {
                    z2 = mVar.k(this, iVar);
                    if (z2) {
                        break;
                    }
                }
            }
            g0();
            if (z2) {
                this.x = null;
            }
        }
        return z2;
    }

    public MenuItem findItem(int i2) {
        MenuItem findItem;
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            i iVar = this.f244f.get(i3);
            if (iVar.getItemId() == i2) {
                return iVar;
            }
            if (iVar.hasSubMenu() && (findItem = iVar.getSubMenu().findItem(i2)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public void g0() {
        this.q = false;
        if (this.r) {
            this.r = false;
            M(this.s);
        }
    }

    public MenuItem getItem(int i2) {
        return this.f244f.get(i2);
    }

    /* access modifiers changed from: package-private */
    public boolean h(g gVar, MenuItem menuItem) {
        a aVar = this.f243e;
        return aVar != null && aVar.a(gVar, menuItem);
    }

    public void h0() {
        if (!this.q) {
            this.q = true;
            this.r = false;
            this.s = false;
        }
    }

    public boolean hasVisibleItems() {
        if (this.z) {
            return true;
        }
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f244f.get(i2).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public boolean isShortcutKey(int i2, KeyEvent keyEvent) {
        return r(i2, keyEvent) != null;
    }

    public boolean m(i iVar) {
        boolean z2 = false;
        if (this.w.isEmpty()) {
            return false;
        }
        h0();
        Iterator<WeakReference<m>> it = this.w.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            m mVar = (m) next.get();
            if (mVar == null) {
                this.w.remove(next);
            } else {
                z2 = mVar.l(this, iVar);
                if (z2) {
                    break;
                }
            }
        }
        g0();
        if (z2) {
            this.x = iVar;
        }
        return z2;
    }

    public int n(int i2) {
        return o(i2, 0);
    }

    public int o(int i2, int i3) {
        int size = size();
        if (i3 < 0) {
            i3 = 0;
        }
        while (i3 < size) {
            if (this.f244f.get(i3).getGroupId() == i2) {
                return i3;
            }
            i3++;
        }
        return -1;
    }

    public boolean performIdentifierAction(int i2, int i3) {
        return N(findItem(i2), i3);
    }

    public boolean performShortcut(int i2, KeyEvent keyEvent, int i3) {
        i r2 = r(i2, keyEvent);
        boolean N = r2 != null ? N(r2, i3) : false;
        if ((i3 & 2) != 0) {
            e(true);
        }
        return N;
    }

    public int q(int i2) {
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            if (this.f244f.get(i3).getItemId() == i2) {
                return i3;
            }
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public i r(int i2, KeyEvent keyEvent) {
        char c2;
        ArrayList<i> arrayList = this.v;
        arrayList.clear();
        s(arrayList, i2, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean I = I();
        for (int i3 = 0; i3 < size; i3++) {
            i iVar = arrayList.get(i3);
            if (I) {
                c2 = iVar.getAlphabeticShortcut();
            } else {
                c2 = iVar.getNumericShortcut();
            }
            if ((c2 == keyData.meta[0] && (metaState & 2) == 0) || ((c2 == keyData.meta[2] && (metaState & 2) != 0) || (I && c2 == 8 && i2 == 67))) {
                return iVar;
            }
        }
        return null;
    }

    public void removeGroup(int i2) {
        int n2 = n(i2);
        if (n2 >= 0) {
            int size = this.f244f.size() - n2;
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                if (i3 >= size || this.f244f.get(n2).getGroupId() != i2) {
                    M(true);
                } else {
                    P(n2, false);
                    i3 = i4;
                }
            }
            M(true);
        }
    }

    public void removeItem(int i2) {
        P(q(i2), true);
    }

    /* access modifiers changed from: package-private */
    public void s(List<i> list, int i2, KeyEvent keyEvent) {
        boolean I = I();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i2 == 67) {
            int size = this.f244f.size();
            for (int i3 = 0; i3 < size; i3++) {
                i iVar = this.f244f.get(i3);
                if (iVar.hasSubMenu()) {
                    ((g) iVar.getSubMenu()).s(list, i2, keyEvent);
                }
                char alphabeticShortcut = I ? iVar.getAlphabeticShortcut() : iVar.getNumericShortcut();
                if (((modifiers & 69647) == ((I ? iVar.getAlphabeticModifiers() : iVar.getNumericModifiers()) & 69647)) && alphabeticShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((alphabeticShortcut == cArr[0] || alphabeticShortcut == cArr[2] || (I && alphabeticShortcut == 8 && i2 == 67)) && iVar.isEnabled()) {
                        list.add(iVar);
                    }
                }
            }
        }
    }

    public void setGroupCheckable(int i2, boolean z2, boolean z3) {
        int size = this.f244f.size();
        for (int i3 = 0; i3 < size; i3++) {
            i iVar = this.f244f.get(i3);
            if (iVar.getGroupId() == i2) {
                iVar.t(z3);
                iVar.setCheckable(z2);
            }
        }
    }

    public void setGroupDividerEnabled(boolean z2) {
        this.y = z2;
    }

    public void setGroupEnabled(int i2, boolean z2) {
        int size = this.f244f.size();
        for (int i3 = 0; i3 < size; i3++) {
            i iVar = this.f244f.get(i3);
            if (iVar.getGroupId() == i2) {
                iVar.setEnabled(z2);
            }
        }
    }

    public void setGroupVisible(int i2, boolean z2) {
        int size = this.f244f.size();
        boolean z3 = false;
        for (int i3 = 0; i3 < size; i3++) {
            i iVar = this.f244f.get(i3);
            if (iVar.getGroupId() == i2 && iVar.y(z2)) {
                z3 = true;
            }
        }
        if (z3) {
            M(true);
        }
    }

    public void setQwertyMode(boolean z2) {
        this.c = z2;
        M(false);
    }

    public int size() {
        return this.f244f.size();
    }

    public void t() {
        ArrayList<i> G = G();
        if (this.f249k) {
            Iterator<WeakReference<m>> it = this.w.iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                WeakReference next = it.next();
                m mVar = (m) next.get();
                if (mVar == null) {
                    this.w.remove(next);
                } else {
                    z2 |= mVar.i();
                }
            }
            if (z2) {
                this.f247i.clear();
                this.f248j.clear();
                int size = G.size();
                for (int i2 = 0; i2 < size; i2++) {
                    i iVar = G.get(i2);
                    if (iVar.l()) {
                        this.f247i.add(iVar);
                    } else {
                        this.f248j.add(iVar);
                    }
                }
            } else {
                this.f247i.clear();
                this.f248j.clear();
                this.f248j.addAll(G());
            }
            this.f249k = false;
        }
    }

    public ArrayList<i> u() {
        t();
        return this.f247i;
    }

    /* access modifiers changed from: protected */
    public String v() {
        return "android:menu:actionviewstates";
    }

    public Context w() {
        return this.a;
    }

    public i x() {
        return this.x;
    }

    public Drawable y() {
        return this.o;
    }

    public CharSequence z() {
        return this.f252n;
    }

    public MenuItem add(int i2) {
        return a(0, 0, 0, this.b.getString(i2));
    }

    public SubMenu addSubMenu(int i2) {
        return addSubMenu(0, 0, 0, (CharSequence) this.b.getString(i2));
    }

    public MenuItem add(int i2, int i3, int i4, CharSequence charSequence) {
        return a(i2, i3, i4, charSequence);
    }

    public SubMenu addSubMenu(int i2, int i3, int i4, CharSequence charSequence) {
        i iVar = (i) a(i2, i3, i4, charSequence);
        r rVar = new r(this.a, this, iVar);
        iVar.x(rVar);
        return rVar;
    }

    public MenuItem add(int i2, int i3, int i4, int i5) {
        return a(i2, i3, i4, this.b.getString(i5));
    }

    public SubMenu addSubMenu(int i2, int i3, int i4, int i5) {
        return addSubMenu(i2, i3, i4, (CharSequence) this.b.getString(i5));
    }
}
