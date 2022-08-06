package androidx.navigation;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import e.e.h;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: NavDestination */
public class o {

    /* renamed from: g  reason: collision with root package name */
    private final String f1089g;

    /* renamed from: h  reason: collision with root package name */
    private q f1090h;

    /* renamed from: i  reason: collision with root package name */
    private int f1091i;

    /* renamed from: j  reason: collision with root package name */
    private String f1092j;

    /* renamed from: k  reason: collision with root package name */
    private CharSequence f1093k;

    /* renamed from: l  reason: collision with root package name */
    private ArrayList<l> f1094l;

    /* renamed from: m  reason: collision with root package name */
    private h<d> f1095m;

    /* renamed from: n  reason: collision with root package name */
    private HashMap<String, h> f1096n;

    /* compiled from: NavDestination */
    static class a implements Comparable<a> {

        /* renamed from: g  reason: collision with root package name */
        private final o f1097g;

        /* renamed from: h  reason: collision with root package name */
        private final Bundle f1098h;

        /* renamed from: i  reason: collision with root package name */
        private final boolean f1099i;

        /* renamed from: j  reason: collision with root package name */
        private final boolean f1100j;

        /* renamed from: k  reason: collision with root package name */
        private final int f1101k;

        a(o oVar, Bundle bundle, boolean z, boolean z2, int i2) {
            this.f1097g = oVar;
            this.f1098h = bundle;
            this.f1099i = z;
            this.f1100j = z2;
            this.f1101k = i2;
        }

        /* renamed from: a */
        public int compareTo(a aVar) {
            if (this.f1099i && !aVar.f1099i) {
                return 1;
            }
            if (!this.f1099i && aVar.f1099i) {
                return -1;
            }
            if (this.f1098h != null && aVar.f1098h == null) {
                return 1;
            }
            if (this.f1098h == null && aVar.f1098h != null) {
                return -1;
            }
            Bundle bundle = this.f1098h;
            if (bundle != null) {
                int size = bundle.size() - aVar.f1098h.size();
                if (size > 0) {
                    return 1;
                }
                if (size < 0) {
                    return -1;
                }
            }
            if (this.f1100j && !aVar.f1100j) {
                return 1;
            }
            if (this.f1100j || !aVar.f1100j) {
                return this.f1101k - aVar.f1101k;
            }
            return -1;
        }

        /* access modifiers changed from: package-private */
        public o f() {
            return this.f1097g;
        }

        /* access modifiers changed from: package-private */
        public Bundle h() {
            return this.f1098h;
        }
    }

    static {
        new HashMap();
    }

    public o(x<? extends o> xVar) {
        this(y.c(xVar.getClass()));
    }

    static String l(Context context, int i2) {
        if (i2 <= 16777215) {
            return Integer.toString(i2);
        }
        try {
            return context.getResources().getResourceName(i2);
        } catch (Resources.NotFoundException unused) {
            return Integer.toString(i2);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean D() {
        return true;
    }

    public final void a(String str, h hVar) {
        if (this.f1096n == null) {
            this.f1096n = new HashMap<>();
        }
        this.f1096n.put(str, hVar);
    }

    public final void d(l lVar) {
        if (this.f1094l == null) {
            this.f1094l = new ArrayList<>();
        }
        this.f1094l.add(lVar);
    }

    /* access modifiers changed from: package-private */
    public Bundle e(Bundle bundle) {
        HashMap<String, h> hashMap;
        if (bundle == null && ((hashMap = this.f1096n) == null || hashMap.isEmpty())) {
            return null;
        }
        Bundle bundle2 = new Bundle();
        HashMap<String, h> hashMap2 = this.f1096n;
        if (hashMap2 != null) {
            for (Map.Entry next : hashMap2.entrySet()) {
                ((h) next.getValue()).e((String) next.getKey(), bundle2);
            }
        }
        if (bundle != null) {
            bundle2.putAll(bundle);
            HashMap<String, h> hashMap3 = this.f1096n;
            if (hashMap3 != null) {
                for (Map.Entry next2 : hashMap3.entrySet()) {
                    if (!((h) next2.getValue()).f((String) next2.getKey(), bundle)) {
                        throw new IllegalArgumentException("Wrong argument type for '" + ((String) next2.getKey()) + "' in argument bundle. " + ((h) next2.getValue()).b().c() + " expected.");
                    }
                }
            }
        }
        return bundle2;
    }

    /* access modifiers changed from: package-private */
    public int[] g() {
        ArrayDeque arrayDeque = new ArrayDeque();
        q qVar = this;
        while (true) {
            q o = qVar.o();
            if (o == null || o.K() != qVar.m()) {
                arrayDeque.addFirst(qVar);
            }
            if (o == null) {
                break;
            }
            qVar = o;
        }
        int[] iArr = new int[arrayDeque.size()];
        int i2 = 0;
        Iterator it = arrayDeque.iterator();
        while (it.hasNext()) {
            iArr[i2] = ((o) it.next()).m();
            i2++;
        }
        return iArr;
    }

    public final d i(int i2) {
        h<d> hVar = this.f1095m;
        d g2 = hVar == null ? null : hVar.g(i2);
        if (g2 != null) {
            return g2;
        }
        if (o() != null) {
            return o().i(i2);
        }
        return null;
    }

    public final Map<String, h> j() {
        HashMap<String, h> hashMap = this.f1096n;
        if (hashMap == null) {
            return Collections.emptyMap();
        }
        return Collections.unmodifiableMap(hashMap);
    }

    public String k() {
        if (this.f1092j == null) {
            this.f1092j = Integer.toString(this.f1091i);
        }
        return this.f1092j;
    }

    public final int m() {
        return this.f1091i;
    }

    public final String n() {
        return this.f1089g;
    }

    public final q o() {
        return this.f1090h;
    }

    /* access modifiers changed from: package-private */
    public a q(n nVar) {
        ArrayList<l> arrayList = this.f1094l;
        if (arrayList == null) {
            return null;
        }
        Iterator<l> it = arrayList.iterator();
        a aVar = null;
        while (it.hasNext()) {
            l next = it.next();
            Uri c = nVar.c();
            Bundle c2 = c != null ? next.c(c, j()) : null;
            String a2 = nVar.a();
            boolean z = a2 != null && a2.equals(next.b());
            String b = nVar.b();
            int d2 = b != null ? next.d(b) : -1;
            if (c2 != null || z || d2 > -1) {
                a aVar2 = new a(this, c2, next.e(), z, d2);
                if (aVar == null || aVar2.compareTo(aVar) > 0) {
                    aVar = aVar2;
                }
            }
        }
        return aVar;
    }

    public void r(Context context, AttributeSet attributeSet) {
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, androidx.navigation.b0.a.Navigator);
        u(obtainAttributes.getResourceId(androidx.navigation.b0.a.Navigator_android_id, 0));
        this.f1092j = l(context, this.f1091i);
        y(obtainAttributes.getText(androidx.navigation.b0.a.Navigator_android_label));
        obtainAttributes.recycle();
    }

    public final void s(int i2, d dVar) {
        if (!D()) {
            throw new UnsupportedOperationException("Cannot add action " + i2 + " to " + this + " as it does not support actions, indicating that it is a terminal destination in your navigation graph and will never trigger actions.");
        } else if (i2 != 0) {
            if (this.f1095m == null) {
                this.f1095m = new h<>();
            }
            this.f1095m.s(i2, dVar);
        } else {
            throw new IllegalArgumentException("Cannot have an action with actionId 0");
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(");
        String str = this.f1092j;
        if (str == null) {
            sb.append("0x");
            sb.append(Integer.toHexString(this.f1091i));
        } else {
            sb.append(str);
        }
        sb.append(")");
        if (this.f1093k != null) {
            sb.append(" label=");
            sb.append(this.f1093k);
        }
        return sb.toString();
    }

    public final void u(int i2) {
        this.f1091i = i2;
        this.f1092j = null;
    }

    public final void y(CharSequence charSequence) {
        this.f1093k = charSequence;
    }

    /* access modifiers changed from: package-private */
    public final void z(q qVar) {
        this.f1090h = qVar;
    }

    public o(String str) {
        this.f1089g = str;
    }
}
