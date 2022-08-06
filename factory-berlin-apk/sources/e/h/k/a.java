package e.h.k;

import android.os.Build;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import e.h.b;
import e.h.k.d0.c;
import e.h.k.d0.d;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* compiled from: AccessibilityDelegateCompat */
public class a {
    private static final View.AccessibilityDelegate c = new View.AccessibilityDelegate();
    private final View.AccessibilityDelegate a;
    private final View.AccessibilityDelegate b;

    /* renamed from: e.h.k.a$a  reason: collision with other inner class name */
    /* compiled from: AccessibilityDelegateCompat */
    static final class C0562a extends View.AccessibilityDelegate {
        final a a;

        C0562a(a aVar) {
            this.a = aVar;
        }

        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.a.a(view, accessibilityEvent);
        }

        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            d b = this.a.b(view);
            if (b != null) {
                return (AccessibilityNodeProvider) b.d();
            }
            return null;
        }

        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.a.f(view, accessibilityEvent);
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            c t0 = c.t0(accessibilityNodeInfo);
            t0.m0(u.O(view));
            t0.g0(u.J(view));
            t0.j0(u.m(view));
            this.a.g(view, t0);
            t0.e(accessibilityNodeInfo.getText(), view);
            List<c.a> c = a.c(view);
            for (int i2 = 0; i2 < c.size(); i2++) {
                t0.b(c.get(i2));
            }
        }

        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.a.h(view, accessibilityEvent);
        }

        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.a.i(viewGroup, view, accessibilityEvent);
        }

        public boolean performAccessibilityAction(View view, int i2, Bundle bundle) {
            return this.a.j(view, i2, bundle);
        }

        public void sendAccessibilityEvent(View view, int i2) {
            this.a.l(view, i2);
        }

        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.a.m(view, accessibilityEvent);
        }
    }

    public a() {
        this(c);
    }

    static List<c.a> c(View view) {
        List<c.a> list = (List) view.getTag(b.tag_accessibility_actions);
        return list == null ? Collections.emptyList() : list;
    }

    private boolean e(ClickableSpan clickableSpan, View view) {
        if (clickableSpan != null) {
            ClickableSpan[] p = c.p(view.createAccessibilityNodeInfo().getText());
            int i2 = 0;
            while (p != null && i2 < p.length) {
                if (clickableSpan.equals(p[i2])) {
                    return true;
                }
                i2++;
            }
        }
        return false;
    }

    private boolean k(int i2, View view) {
        WeakReference weakReference;
        SparseArray sparseArray = (SparseArray) view.getTag(b.tag_accessibility_clickable_spans);
        if (sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i2)) == null) {
            return false;
        }
        ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
        if (!e(clickableSpan, view)) {
            return false;
        }
        clickableSpan.onClick(view);
        return true;
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public d b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider;
        if (Build.VERSION.SDK_INT < 16 || (accessibilityNodeProvider = this.a.getAccessibilityNodeProvider(view)) == null) {
            return null;
        }
        return new d(accessibilityNodeProvider);
    }

    /* access modifiers changed from: package-private */
    public View.AccessibilityDelegate d() {
        return this.b;
    }

    public void f(View view, AccessibilityEvent accessibilityEvent) {
        this.a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void g(View view, c cVar) {
        this.a.onInitializeAccessibilityNodeInfo(view, cVar.s0());
    }

    public void h(View view, AccessibilityEvent accessibilityEvent) {
        this.a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean j(View view, int i2, Bundle bundle) {
        List<c.a> c2 = c(view);
        boolean z = false;
        int i3 = 0;
        while (true) {
            if (i3 >= c2.size()) {
                break;
            }
            c.a aVar = c2.get(i3);
            if (aVar.b() == i2) {
                z = aVar.d(view, bundle);
                break;
            }
            i3++;
        }
        if (!z && Build.VERSION.SDK_INT >= 16) {
            z = this.a.performAccessibilityAction(view, i2, bundle);
        }
        return (z || i2 != b.accessibility_action_clickable_span) ? z : k(bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), view);
    }

    public void l(View view, int i2) {
        this.a.sendAccessibilityEvent(view, i2);
    }

    public void m(View view, AccessibilityEvent accessibilityEvent) {
        this.a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public a(View.AccessibilityDelegate accessibilityDelegate) {
        this.a = accessibilityDelegate;
        this.b = new C0562a(this);
    }
}
