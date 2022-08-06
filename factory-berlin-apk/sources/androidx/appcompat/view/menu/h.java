package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.b;
import androidx.appcompat.view.menu.m;
import e.a.g;

/* compiled from: MenuDialogHelper */
class h implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, m.a {

    /* renamed from: g  reason: collision with root package name */
    private g f253g;

    /* renamed from: h  reason: collision with root package name */
    private b f254h;

    /* renamed from: i  reason: collision with root package name */
    e f255i;

    /* renamed from: j  reason: collision with root package name */
    private m.a f256j;

    public h(g gVar) {
        this.f253g = gVar;
    }

    public void a(g gVar, boolean z) {
        if (z || gVar == this.f253g) {
            c();
        }
        m.a aVar = this.f256j;
        if (aVar != null) {
            aVar.a(gVar, z);
        }
    }

    public boolean b(g gVar) {
        m.a aVar = this.f256j;
        if (aVar != null) {
            return aVar.b(gVar);
        }
        return false;
    }

    public void c() {
        b bVar = this.f254h;
        if (bVar != null) {
            bVar.dismiss();
        }
    }

    public void d(IBinder iBinder) {
        g gVar = this.f253g;
        b.a aVar = new b.a(gVar.w());
        e eVar = new e(aVar.b(), g.abc_list_menu_item_layout);
        this.f255i = eVar;
        eVar.m(this);
        this.f253g.b(this.f255i);
        aVar.c(this.f255i.c(), this);
        View A = gVar.A();
        if (A != null) {
            aVar.e(A);
        } else {
            aVar.f(gVar.y());
            aVar.q(gVar.z());
        }
        aVar.l(this);
        b a = aVar.a();
        this.f254h = a;
        a.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f254h.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f254h.show();
    }

    public void onClick(DialogInterface dialogInterface, int i2) {
        this.f253g.N((i) this.f255i.c().getItem(i2), 0);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        this.f255i.a(this.f253g, true);
    }

    public boolean onKey(DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i2 == 82 || i2 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f254h.getWindow();
                if (!(window2 == null || (decorView2 = window2.getDecorView()) == null || (keyDispatcherState2 = decorView2.getKeyDispatcherState()) == null)) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f254h.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f253g.e(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f253g.performShortcut(i2, keyEvent, 0);
    }
}
