package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.ListMenuItemView;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.i;
import java.lang.reflect.Method;

/* compiled from: MenuPopupWindow */
public class l0 extends j0 implements k0 {
    private static Method P;
    private k0 O;

    /* compiled from: MenuPopupWindow */
    public static class a extends f0 {
        final int u;
        final int v;
        private k0 w;
        private MenuItem x;

        public a(Context context, boolean z) {
            super(context, z);
            Configuration configuration = context.getResources().getConfiguration();
            if (Build.VERSION.SDK_INT < 17 || 1 != configuration.getLayoutDirection()) {
                this.u = 22;
                this.v = 21;
                return;
            }
            this.u = 21;
            this.v = 22;
        }

        public boolean onHoverEvent(MotionEvent motionEvent) {
            int i2;
            f fVar;
            int pointToPosition;
            int i3;
            if (this.w != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i2 = headerViewListAdapter.getHeadersCount();
                    fVar = (f) headerViewListAdapter.getWrappedAdapter();
                } else {
                    i2 = 0;
                    fVar = (f) adapter;
                }
                i iVar = null;
                if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i3 = pointToPosition - i2) >= 0 && i3 < fVar.getCount()) {
                    iVar = fVar.getItem(i3);
                }
                MenuItem menuItem = this.x;
                if (menuItem != iVar) {
                    g b = fVar.b();
                    if (menuItem != null) {
                        this.w.f(b, menuItem);
                    }
                    this.x = iVar;
                    if (iVar != null) {
                        this.w.a(b, iVar);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        public boolean onKeyDown(int i2, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i2 == this.u) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            } else if (listMenuItemView == null || i2 != this.v) {
                return super.onKeyDown(i2, keyEvent);
            } else {
                setSelection(-1);
                ((f) getAdapter()).b().e(false);
                return true;
            }
        }

        public void setHoverListener(k0 k0Var) {
            this.w = k0Var;
        }

        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                P = PopupWindow.class.getDeclaredMethod("setTouchModal", new Class[]{Boolean.TYPE});
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public l0(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
    }

    public void N(Object obj) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.K.setEnterTransition((Transition) obj);
        }
    }

    public void O(Object obj) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.K.setExitTransition((Transition) obj);
        }
    }

    public void P(k0 k0Var) {
        this.O = k0Var;
    }

    public void Q(boolean z) {
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = P;
            if (method != null) {
                try {
                    method.invoke(this.K, new Object[]{Boolean.valueOf(z)});
                } catch (Exception unused) {
                    Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                }
            }
        } else {
            this.K.setTouchModal(z);
        }
    }

    public void a(g gVar, MenuItem menuItem) {
        k0 k0Var = this.O;
        if (k0Var != null) {
            k0Var.a(gVar, menuItem);
        }
    }

    public void f(g gVar, MenuItem menuItem) {
        k0 k0Var = this.O;
        if (k0Var != null) {
            k0Var.f(gVar, menuItem);
        }
    }

    /* access modifiers changed from: package-private */
    public f0 s(Context context, boolean z) {
        a aVar = new a(context, z);
        aVar.setHoverListener(this);
        return aVar;
    }
}
