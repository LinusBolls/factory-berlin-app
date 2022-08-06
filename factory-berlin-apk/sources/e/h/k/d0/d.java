package e.h.k.d0;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;

/* compiled from: AccessibilityNodeProviderCompat */
public class d {
    private final Object a;

    /* compiled from: AccessibilityNodeProviderCompat */
    static class a extends AccessibilityNodeProvider {
        final d a;

        a(d dVar) {
            this.a = dVar;
        }

        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i2) {
            c a2 = this.a.a(i2);
            if (a2 == null) {
                return null;
            }
            return a2.s0();
        }

        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i2) {
            List<c> b = this.a.b(str, i2);
            if (b == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = b.size();
            for (int i3 = 0; i3 < size; i3++) {
                arrayList.add(b.get(i3).s0());
            }
            return arrayList;
        }

        public boolean performAction(int i2, int i3, Bundle bundle) {
            return this.a.e(i2, i3, bundle);
        }
    }

    /* compiled from: AccessibilityNodeProviderCompat */
    static class b extends a {
        b(d dVar) {
            super(dVar);
        }

        public AccessibilityNodeInfo findFocus(int i2) {
            c c = this.a.c(i2);
            if (c == null) {
                return null;
            }
            return c.s0();
        }
    }

    public d() {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 19) {
            this.a = new b(this);
        } else if (i2 >= 16) {
            this.a = new a(this);
        } else {
            this.a = null;
        }
    }

    public c a(int i2) {
        return null;
    }

    public List<c> b(String str, int i2) {
        return null;
    }

    public c c(int i2) {
        return null;
    }

    public Object d() {
        return this.a;
    }

    public boolean e(int i2, int i3, Bundle bundle) {
        return false;
    }

    public d(Object obj) {
        this.a = obj;
    }
}
