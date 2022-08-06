package e.h.k.d0;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import e.h.k.d0.f;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: AccessibilityNodeInfoCompat */
public class c {

    /* renamed from: d  reason: collision with root package name */
    private static int f8689d;
    private final AccessibilityNodeInfo a;
    public int b = -1;
    private int c = -1;

    /* compiled from: AccessibilityNodeInfoCompat */
    public static class a {

        /* renamed from: e  reason: collision with root package name */
        public static final a f8690e = new a(16, (CharSequence) null);

        /* renamed from: f  reason: collision with root package name */
        public static final a f8691f = new a(4096, (CharSequence) null);

        /* renamed from: g  reason: collision with root package name */
        public static final a f8692g = new a(8192, (CharSequence) null);

        /* renamed from: h  reason: collision with root package name */
        public static final a f8693h = new a(262144, (CharSequence) null);

        /* renamed from: i  reason: collision with root package name */
        public static final a f8694i = new a(524288, (CharSequence) null);

        /* renamed from: j  reason: collision with root package name */
        public static final a f8695j = new a(1048576, (CharSequence) null);

        /* renamed from: k  reason: collision with root package name */
        public static final a f8696k = new a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP : null, 16908344, (CharSequence) null, (f) null, (Class<? extends f.a>) null);

        /* renamed from: l  reason: collision with root package name */
        public static final a f8697l = new a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN : null, 16908346, (CharSequence) null, (f) null, (Class<? extends f.a>) null);
        final Object a;
        private final int b;
        private final Class<? extends f.a> c;

        /* renamed from: d  reason: collision with root package name */
        protected final f f8698d;

        static {
            Class<f.c> cls = f.c.class;
            Class<f.b> cls2 = f.b.class;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction = null;
            new a(1, (CharSequence) null);
            new a(2, (CharSequence) null);
            new a(4, (CharSequence) null);
            new a(8, (CharSequence) null);
            new a(32, (CharSequence) null);
            new a(64, (CharSequence) null);
            new a(128, (CharSequence) null);
            new a(256, (CharSequence) null, cls2);
            new a(512, (CharSequence) null, cls2);
            new a(1024, (CharSequence) null, cls);
            new a(2048, (CharSequence) null, cls);
            new a(16384, (CharSequence) null);
            new a(32768, (CharSequence) null);
            new a(65536, (CharSequence) null);
            new a(131072, (CharSequence) null, f.g.class);
            new a(2097152, (CharSequence) null, f.h.class);
            new a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN : null, 16908342, (CharSequence) null, (f) null, (Class<? extends f.a>) null);
            new a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION : null, 16908343, (CharSequence) null, (f) null, f.e.class);
            new a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT : null, 16908345, (CharSequence) null, (f) null, (Class<? extends f.a>) null);
            new a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT : null, 16908347, (CharSequence) null, (f) null, (Class<? extends f.a>) null);
            new a(Build.VERSION.SDK_INT >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, 16908358, (CharSequence) null, (f) null, (Class<? extends f.a>) null);
            new a(Build.VERSION.SDK_INT >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, 16908359, (CharSequence) null, (f) null, (Class<? extends f.a>) null);
            new a(Build.VERSION.SDK_INT >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, 16908360, (CharSequence) null, (f) null, (Class<? extends f.a>) null);
            new a(Build.VERSION.SDK_INT >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, 16908361, (CharSequence) null, (f) null, (Class<? extends f.a>) null);
            new a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK : null, 16908348, (CharSequence) null, (f) null, (Class<? extends f.a>) null);
            new a(Build.VERSION.SDK_INT >= 24 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS : null, 16908349, (CharSequence) null, (f) null, f.C0565f.class);
            new a(Build.VERSION.SDK_INT >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, 16908354, (CharSequence) null, (f) null, f.d.class);
            new a(Build.VERSION.SDK_INT >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, 16908356, (CharSequence) null, (f) null, (Class<? extends f.a>) null);
            if (Build.VERSION.SDK_INT >= 28) {
                accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
            }
            new a(accessibilityAction, 16908357, (CharSequence) null, (f) null, (Class<? extends f.a>) null);
        }

        public a(int i2, CharSequence charSequence) {
            this((Object) null, i2, charSequence, (f) null, (Class<? extends f.a>) null);
        }

        public a a(CharSequence charSequence, f fVar) {
            return new a((Object) null, this.b, charSequence, fVar, this.c);
        }

        public int b() {
            if (Build.VERSION.SDK_INT >= 21) {
                return ((AccessibilityNodeInfo.AccessibilityAction) this.a).getId();
            }
            return 0;
        }

        public CharSequence c() {
            if (Build.VERSION.SDK_INT >= 21) {
                return ((AccessibilityNodeInfo.AccessibilityAction) this.a).getLabel();
            }
            return null;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0025  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0028  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean d(android.view.View r5, android.os.Bundle r6) {
            /*
                r4 = this;
                e.h.k.d0.f r0 = r4.f8698d
                r1 = 0
                if (r0 == 0) goto L_0x0049
                r0 = 0
                java.lang.Class<? extends e.h.k.d0.f$a> r2 = r4.c
                if (r2 == 0) goto L_0x0042
                java.lang.Class[] r3 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x0020 }
                java.lang.reflect.Constructor r2 = r2.getDeclaredConstructor(r3)     // Catch:{ Exception -> 0x0020 }
                java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0020 }
                java.lang.Object r1 = r2.newInstance(r1)     // Catch:{ Exception -> 0x0020 }
                e.h.k.d0.f$a r1 = (e.h.k.d0.f.a) r1     // Catch:{ Exception -> 0x0020 }
                r1.a(r6)     // Catch:{ Exception -> 0x001d }
                r0 = r1
                goto L_0x0042
            L_0x001d:
                r6 = move-exception
                r0 = r1
                goto L_0x0021
            L_0x0020:
                r6 = move-exception
            L_0x0021:
                java.lang.Class<? extends e.h.k.d0.f$a> r1 = r4.c
                if (r1 != 0) goto L_0x0028
                java.lang.String r1 = "null"
                goto L_0x002c
            L_0x0028:
                java.lang.String r1 = r1.getName()
            L_0x002c:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Failed to execute command with argument class ViewCommandArgument: "
                r2.append(r3)
                r2.append(r1)
                java.lang.String r1 = r2.toString()
                java.lang.String r2 = "A11yActionCompat"
                android.util.Log.e(r2, r1, r6)
            L_0x0042:
                e.h.k.d0.f r6 = r4.f8698d
                boolean r5 = r6.a(r5, r0)
                return r5
            L_0x0049:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: e.h.k.d0.c.a.d(android.view.View, android.os.Bundle):boolean");
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            Object obj2 = this.a;
            if (obj2 == null) {
                if (aVar.a != null) {
                    return false;
                }
                return true;
            } else if (!obj2.equals(aVar.a)) {
                return false;
            } else {
                return true;
            }
        }

        public int hashCode() {
            Object obj = this.a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        a(Object obj) {
            this(obj, 0, (CharSequence) null, (f) null, (Class<? extends f.a>) null);
        }

        private a(int i2, CharSequence charSequence, Class<? extends f.a> cls) {
            this((Object) null, i2, charSequence, (f) null, cls);
        }

        a(Object obj, int i2, CharSequence charSequence, f fVar, Class<? extends f.a> cls) {
            this.b = i2;
            this.f8698d = fVar;
            if (Build.VERSION.SDK_INT < 21 || obj != null) {
                this.a = obj;
            } else {
                this.a = new AccessibilityNodeInfo.AccessibilityAction(i2, charSequence);
            }
            this.c = cls;
        }
    }

    /* compiled from: AccessibilityNodeInfoCompat */
    public static class b {
        final Object a;

        b(Object obj) {
            this.a = obj;
        }

        public static b a(int i2, int i3, boolean z, int i4) {
            int i5 = Build.VERSION.SDK_INT;
            if (i5 >= 21) {
                return new b(AccessibilityNodeInfo.CollectionInfo.obtain(i2, i3, z, i4));
            }
            if (i5 >= 19) {
                return new b(AccessibilityNodeInfo.CollectionInfo.obtain(i2, i3, z));
            }
            return new b((Object) null);
        }
    }

    /* renamed from: e.h.k.d0.c$c  reason: collision with other inner class name */
    /* compiled from: AccessibilityNodeInfoCompat */
    public static class C0564c {
        final Object a;

        C0564c(Object obj) {
            this.a = obj;
        }

        public static C0564c a(int i2, int i3, int i4, int i5, boolean z, boolean z2) {
            int i6 = Build.VERSION.SDK_INT;
            if (i6 >= 21) {
                return new C0564c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i2, i3, i4, i5, z, z2));
            }
            if (i6 >= 19) {
                return new C0564c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i2, i3, i4, i5, z));
            }
            return new C0564c((Object) null);
        }
    }

    private c(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.a = accessibilityNodeInfo;
    }

    public static c K() {
        return t0(AccessibilityNodeInfo.obtain());
    }

    public static c L(View view) {
        return t0(AccessibilityNodeInfo.obtain(view));
    }

    public static c M(c cVar) {
        return t0(AccessibilityNodeInfo.obtain(cVar.a));
    }

    private void P(View view) {
        SparseArray<WeakReference<ClickableSpan>> u = u(view);
        if (u != null) {
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < u.size(); i2++) {
                if (u.valueAt(i2).get() == null) {
                    arrayList.add(Integer.valueOf(i2));
                }
            }
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                u.remove(((Integer) arrayList.get(i3)).intValue());
            }
        }
    }

    private void R(int i2, boolean z) {
        Bundle r = r();
        if (r != null) {
            int i3 = r.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i2);
            if (!z) {
                i2 = 0;
            }
            r.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i2 | i3);
        }
    }

    private void d(ClickableSpan clickableSpan, Spanned spanned, int i2) {
        g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i2));
    }

    private void f() {
        if (Build.VERSION.SDK_INT >= 19) {
            this.a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            this.a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            this.a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            this.a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        }
    }

    private List<Integer> g(String str) {
        if (Build.VERSION.SDK_INT < 19) {
            return new ArrayList();
        }
        ArrayList<Integer> integerArrayList = this.a.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList arrayList = new ArrayList();
        this.a.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    private static String i(int i2) {
        if (i2 == 1) {
            return "ACTION_FOCUS";
        }
        if (i2 == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i2) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case 16908354:
                return "ACTION_MOVE_WINDOW";
            default:
                switch (i2) {
                    case 16908342:
                        return "ACTION_SHOW_ON_SCREEN";
                    case 16908343:
                        return "ACTION_SCROLL_TO_POSITION";
                    case 16908344:
                        return "ACTION_SCROLL_UP";
                    case 16908345:
                        return "ACTION_SCROLL_LEFT";
                    case 16908346:
                        return "ACTION_SCROLL_DOWN";
                    case 16908347:
                        return "ACTION_SCROLL_RIGHT";
                    case 16908348:
                        return "ACTION_CONTEXT_CLICK";
                    case 16908349:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i2) {
                            case 16908356:
                                return "ACTION_SHOW_TOOLTIP";
                            case 16908357:
                                return "ACTION_HIDE_TOOLTIP";
                            case 16908358:
                                return "ACTION_PAGE_UP";
                            case 16908359:
                                return "ACTION_PAGE_DOWN";
                            case 16908360:
                                return "ACTION_PAGE_LEFT";
                            case 16908361:
                                return "ACTION_PAGE_RIGHT";
                            default:
                                return "ACTION_UNKNOWN";
                        }
                }
        }
    }

    private boolean k(int i2) {
        Bundle r = r();
        if (r != null && (r.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i2) == i2) {
            return true;
        }
        return false;
    }

    public static ClickableSpan[] p(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    private SparseArray<WeakReference<ClickableSpan>> s(View view) {
        SparseArray<WeakReference<ClickableSpan>> u = u(view);
        if (u != null) {
            return u;
        }
        SparseArray<WeakReference<ClickableSpan>> sparseArray = new SparseArray<>();
        view.setTag(e.h.b.tag_accessibility_clickable_spans, sparseArray);
        return sparseArray;
    }

    public static c t0(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new c(accessibilityNodeInfo);
    }

    private SparseArray<WeakReference<ClickableSpan>> u(View view) {
        return (SparseArray) view.getTag(e.h.b.tag_accessibility_clickable_spans);
    }

    private boolean x() {
        return !g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    private int y(ClickableSpan clickableSpan, SparseArray<WeakReference<ClickableSpan>> sparseArray) {
        if (sparseArray != null) {
            for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                if (clickableSpan.equals((ClickableSpan) sparseArray.valueAt(i2).get())) {
                    return sparseArray.keyAt(i2);
                }
            }
        }
        int i3 = f8689d;
        f8689d = i3 + 1;
        return i3;
    }

    public boolean A() {
        return this.a.isChecked();
    }

    public boolean B() {
        return this.a.isClickable();
    }

    public boolean C() {
        return this.a.isEnabled();
    }

    public boolean D() {
        return this.a.isFocusable();
    }

    public boolean E() {
        return this.a.isFocused();
    }

    public boolean F() {
        return this.a.isLongClickable();
    }

    public boolean G() {
        return this.a.isPassword();
    }

    public boolean H() {
        return this.a.isScrollable();
    }

    public boolean I() {
        return this.a.isSelected();
    }

    public boolean J() {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.a.isShowingHintText();
        }
        return k(4);
    }

    public boolean N(int i2, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            return this.a.performAction(i2, bundle);
        }
        return false;
    }

    public void O() {
        this.a.recycle();
    }

    public void Q(boolean z) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.a.setAccessibilityFocused(z);
        }
    }

    @Deprecated
    public void S(Rect rect) {
        this.a.setBoundsInParent(rect);
    }

    public void T(Rect rect) {
        this.a.setBoundsInScreen(rect);
    }

    public void U(boolean z) {
        this.a.setCheckable(z);
    }

    public void V(boolean z) {
        this.a.setChecked(z);
    }

    public void W(CharSequence charSequence) {
        this.a.setClassName(charSequence);
    }

    public void X(boolean z) {
        this.a.setClickable(z);
    }

    public void Y(Object obj) {
        AccessibilityNodeInfo.CollectionInfo collectionInfo;
        if (Build.VERSION.SDK_INT >= 19) {
            AccessibilityNodeInfo accessibilityNodeInfo = this.a;
            if (obj == null) {
                collectionInfo = null;
            } else {
                collectionInfo = (AccessibilityNodeInfo.CollectionInfo) ((b) obj).a;
            }
            accessibilityNodeInfo.setCollectionInfo(collectionInfo);
        }
    }

    public void Z(Object obj) {
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo;
        if (Build.VERSION.SDK_INT >= 19) {
            AccessibilityNodeInfo accessibilityNodeInfo = this.a;
            if (obj == null) {
                collectionItemInfo = null;
            } else {
                collectionItemInfo = (AccessibilityNodeInfo.CollectionItemInfo) ((C0564c) obj).a;
            }
            accessibilityNodeInfo.setCollectionItemInfo(collectionItemInfo);
        }
    }

    public void a(int i2) {
        this.a.addAction(i2);
    }

    public void a0(CharSequence charSequence) {
        this.a.setContentDescription(charSequence);
    }

    public void b(a aVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.a);
        }
    }

    public void b0(boolean z) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.a.setContentInvalid(z);
        }
    }

    public void c(View view, int i2) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.a.addChild(view, i2);
        }
    }

    public void c0(boolean z) {
        this.a.setEnabled(z);
    }

    public void d0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.a.setError(charSequence);
        }
    }

    public void e(CharSequence charSequence, View view) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 19 && i2 < 26) {
            f();
            P(view);
            ClickableSpan[] p = p(charSequence);
            if (p != null && p.length > 0) {
                r().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", e.h.b.accessibility_action_clickable_span);
                SparseArray<WeakReference<ClickableSpan>> s = s(view);
                int i3 = 0;
                while (p != null && i3 < p.length) {
                    int y = y(p[i3], s);
                    s.put(y, new WeakReference(p[i3]));
                    d(p[i3], (Spanned) charSequence, y);
                    i3++;
                }
            }
        }
    }

    public void e0(boolean z) {
        this.a.setFocusable(z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.a;
        if (accessibilityNodeInfo == null) {
            if (cVar.a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(cVar.a)) {
            return false;
        }
        return this.c == cVar.c && this.b == cVar.b;
    }

    public void f0(boolean z) {
        this.a.setFocused(z);
    }

    public void g0(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.a.setHeading(z);
        } else {
            R(2, z);
        }
    }

    public List<a> h() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = Build.VERSION.SDK_INT >= 21 ? this.a.getActionList() : null;
        if (actionList == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new a(actionList.get(i2)));
        }
        return arrayList;
    }

    public void h0(CharSequence charSequence) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26) {
            this.a.setHintText(charSequence);
        } else if (i2 >= 19) {
            this.a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
        }
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public void i0(CharSequence charSequence) {
        this.a.setPackageName(charSequence);
    }

    public int j() {
        return this.a.getActions();
    }

    public void j0(CharSequence charSequence) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            this.a.setPaneTitle(charSequence);
        } else if (i2 >= 19) {
            this.a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    public void k0(View view) {
        this.b = -1;
        this.a.setParent(view);
    }

    @Deprecated
    public void l(Rect rect) {
        this.a.getBoundsInParent(rect);
    }

    public void l0(View view, int i2) {
        this.b = i2;
        if (Build.VERSION.SDK_INT >= 16) {
            this.a.setParent(view, i2);
        }
    }

    public void m(Rect rect) {
        this.a.getBoundsInScreen(rect);
    }

    public void m0(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.a.setScreenReaderFocusable(z);
        } else {
            R(1, z);
        }
    }

    public int n() {
        return this.a.getChildCount();
    }

    public void n0(boolean z) {
        this.a.setScrollable(z);
    }

    public CharSequence o() {
        return this.a.getClassName();
    }

    public void o0(boolean z) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.a.setShowingHintText(z);
        } else {
            R(4, z);
        }
    }

    public void p0(View view, int i2) {
        this.c = i2;
        if (Build.VERSION.SDK_INT >= 16) {
            this.a.setSource(view, i2);
        }
    }

    public CharSequence q() {
        return this.a.getContentDescription();
    }

    public void q0(CharSequence charSequence) {
        this.a.setText(charSequence);
    }

    public Bundle r() {
        if (Build.VERSION.SDK_INT >= 19) {
            return this.a.getExtras();
        }
        return new Bundle();
    }

    public void r0(boolean z) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.a.setVisibleToUser(z);
        }
    }

    public AccessibilityNodeInfo s0() {
        return this.a;
    }

    public CharSequence t() {
        return this.a.getPackageName();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        l(rect);
        sb.append("; boundsInParent: " + rect);
        m(rect);
        sb.append("; boundsInScreen: " + rect);
        sb.append("; packageName: ");
        sb.append(t());
        sb.append("; className: ");
        sb.append(o());
        sb.append("; text: ");
        sb.append(v());
        sb.append("; contentDescription: ");
        sb.append(q());
        sb.append("; viewId: ");
        sb.append(w());
        sb.append("; checkable: ");
        sb.append(z());
        sb.append("; checked: ");
        sb.append(A());
        sb.append("; focusable: ");
        sb.append(D());
        sb.append("; focused: ");
        sb.append(E());
        sb.append("; selected: ");
        sb.append(I());
        sb.append("; clickable: ");
        sb.append(B());
        sb.append("; longClickable: ");
        sb.append(F());
        sb.append("; enabled: ");
        sb.append(C());
        sb.append("; password: ");
        sb.append(G());
        sb.append("; scrollable: " + H());
        sb.append("; [");
        if (Build.VERSION.SDK_INT >= 21) {
            List<a> h2 = h();
            for (int i2 = 0; i2 < h2.size(); i2++) {
                a aVar = h2.get(i2);
                String i3 = i(aVar.b());
                if (i3.equals("ACTION_UNKNOWN") && aVar.c() != null) {
                    i3 = aVar.c().toString();
                }
                sb.append(i3);
                if (i2 != h2.size() - 1) {
                    sb.append(", ");
                }
            }
        } else {
            int j2 = j();
            while (j2 != 0) {
                int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(j2);
                j2 &= ~numberOfTrailingZeros;
                sb.append(i(numberOfTrailingZeros));
                if (j2 != 0) {
                    sb.append(", ");
                }
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public CharSequence v() {
        if (!x()) {
            return this.a.getText();
        }
        List<Integer> g2 = g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List<Integer> g3 = g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List<Integer> g4 = g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List<Integer> g5 = g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.a.getText(), 0, this.a.getText().length()));
        for (int i2 = 0; i2 < g2.size(); i2++) {
            spannableString.setSpan(new a(g5.get(i2).intValue(), this, r().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), g2.get(i2).intValue(), g3.get(i2).intValue(), g4.get(i2).intValue());
        }
        return spannableString;
    }

    public String w() {
        if (Build.VERSION.SDK_INT >= 18) {
            return this.a.getViewIdResourceName();
        }
        return null;
    }

    public boolean z() {
        return this.a.isCheckable();
    }
}
