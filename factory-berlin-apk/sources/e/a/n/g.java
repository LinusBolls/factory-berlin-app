package e.a.n;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.e0;
import androidx.appcompat.widget.w0;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: SupportMenuInflater */
public class g extends MenuInflater {

    /* renamed from: e  reason: collision with root package name */
    static final Class<?>[] f8395e;

    /* renamed from: f  reason: collision with root package name */
    static final Class<?>[] f8396f;
    final Object[] a;
    final Object[] b;
    Context c;

    /* renamed from: d  reason: collision with root package name */
    private Object f8397d;

    /* compiled from: SupportMenuInflater */
    private static class a implements MenuItem.OnMenuItemClickListener {
        private static final Class<?>[] c = {MenuItem.class};
        private Object a;
        private Method b;

        public a(Object obj, String str) {
            this.a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.b = cls.getMethod(str, c);
            } catch (Exception e2) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e2);
                throw inflateException;
            }
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.b.invoke(this.a, new Object[]{menuItem})).booleanValue();
                }
                this.b.invoke(this.a, new Object[]{menuItem});
                return true;
            } catch (Exception e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    /* compiled from: SupportMenuInflater */
    private class b {
        e.h.k.b A;
        private CharSequence B;
        private CharSequence C;
        private ColorStateList D = null;
        private PorterDuff.Mode E = null;
        private Menu a;
        private int b;
        private int c;

        /* renamed from: d  reason: collision with root package name */
        private int f8398d;

        /* renamed from: e  reason: collision with root package name */
        private int f8399e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f8400f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f8401g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f8402h;

        /* renamed from: i  reason: collision with root package name */
        private int f8403i;

        /* renamed from: j  reason: collision with root package name */
        private int f8404j;

        /* renamed from: k  reason: collision with root package name */
        private CharSequence f8405k;

        /* renamed from: l  reason: collision with root package name */
        private CharSequence f8406l;

        /* renamed from: m  reason: collision with root package name */
        private int f8407m;

        /* renamed from: n  reason: collision with root package name */
        private char f8408n;
        private int o;
        private char p;
        private int q;
        private int r;
        private boolean s;
        private boolean t;
        private boolean u;
        private int v;
        private int w;
        private String x;
        private String y;
        private String z;

        public b(Menu menu) {
            this.a = menu;
            h();
        }

        private char c(String str) {
            if (str == null) {
                return 0;
            }
            return str.charAt(0);
        }

        private <T> T e(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, g.this.c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return constructor.newInstance(objArr);
            } catch (Exception e2) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e2);
                return null;
            }
        }

        private void i(MenuItem menuItem) {
            boolean z2 = false;
            menuItem.setChecked(this.s).setVisible(this.t).setEnabled(this.u).setCheckable(this.r >= 1).setTitleCondensed(this.f8406l).setIcon(this.f8407m);
            int i2 = this.v;
            if (i2 >= 0) {
                menuItem.setShowAsAction(i2);
            }
            if (this.z != null) {
                if (!g.this.c.isRestricted()) {
                    menuItem.setOnMenuItemClickListener(new a(g.this.b(), this.z));
                } else {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
            }
            boolean z3 = menuItem instanceof i;
            if (z3) {
                i iVar = (i) menuItem;
            }
            if (this.r >= 2) {
                if (z3) {
                    ((i) menuItem).t(true);
                } else if (menuItem instanceof j) {
                    ((j) menuItem).h(true);
                }
            }
            String str = this.x;
            if (str != null) {
                menuItem.setActionView((View) e(str, g.f8395e, g.this.a));
                z2 = true;
            }
            int i3 = this.w;
            if (i3 > 0) {
                if (!z2) {
                    menuItem.setActionView(i3);
                } else {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                }
            }
            e.h.k.b bVar = this.A;
            if (bVar != null) {
                e.h.k.i.a(menuItem, bVar);
            }
            e.h.k.i.c(menuItem, this.B);
            e.h.k.i.g(menuItem, this.C);
            e.h.k.i.b(menuItem, this.f8408n, this.o);
            e.h.k.i.f(menuItem, this.p, this.q);
            PorterDuff.Mode mode = this.E;
            if (mode != null) {
                e.h.k.i.e(menuItem, mode);
            }
            ColorStateList colorStateList = this.D;
            if (colorStateList != null) {
                e.h.k.i.d(menuItem, colorStateList);
            }
        }

        public void a() {
            this.f8402h = true;
            i(this.a.add(this.b, this.f8403i, this.f8404j, this.f8405k));
        }

        public SubMenu b() {
            this.f8402h = true;
            SubMenu addSubMenu = this.a.addSubMenu(this.b, this.f8403i, this.f8404j, this.f8405k);
            i(addSubMenu.getItem());
            return addSubMenu;
        }

        public boolean d() {
            return this.f8402h;
        }

        public void f(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = g.this.c.obtainStyledAttributes(attributeSet, e.a.j.MenuGroup);
            this.b = obtainStyledAttributes.getResourceId(e.a.j.MenuGroup_android_id, 0);
            this.c = obtainStyledAttributes.getInt(e.a.j.MenuGroup_android_menuCategory, 0);
            this.f8398d = obtainStyledAttributes.getInt(e.a.j.MenuGroup_android_orderInCategory, 0);
            this.f8399e = obtainStyledAttributes.getInt(e.a.j.MenuGroup_android_checkableBehavior, 0);
            this.f8400f = obtainStyledAttributes.getBoolean(e.a.j.MenuGroup_android_visible, true);
            this.f8401g = obtainStyledAttributes.getBoolean(e.a.j.MenuGroup_android_enabled, true);
            obtainStyledAttributes.recycle();
        }

        public void g(AttributeSet attributeSet) {
            w0 t2 = w0.t(g.this.c, attributeSet, e.a.j.MenuItem);
            this.f8403i = t2.n(e.a.j.MenuItem_android_id, 0);
            this.f8404j = (t2.k(e.a.j.MenuItem_android_menuCategory, this.c) & -65536) | (t2.k(e.a.j.MenuItem_android_orderInCategory, this.f8398d) & 65535);
            this.f8405k = t2.p(e.a.j.MenuItem_android_title);
            this.f8406l = t2.p(e.a.j.MenuItem_android_titleCondensed);
            this.f8407m = t2.n(e.a.j.MenuItem_android_icon, 0);
            this.f8408n = c(t2.o(e.a.j.MenuItem_android_alphabeticShortcut));
            this.o = t2.k(e.a.j.MenuItem_alphabeticModifiers, 4096);
            this.p = c(t2.o(e.a.j.MenuItem_android_numericShortcut));
            this.q = t2.k(e.a.j.MenuItem_numericModifiers, 4096);
            if (t2.r(e.a.j.MenuItem_android_checkable)) {
                this.r = t2.a(e.a.j.MenuItem_android_checkable, false) ? 1 : 0;
            } else {
                this.r = this.f8399e;
            }
            this.s = t2.a(e.a.j.MenuItem_android_checked, false);
            this.t = t2.a(e.a.j.MenuItem_android_visible, this.f8400f);
            this.u = t2.a(e.a.j.MenuItem_android_enabled, this.f8401g);
            this.v = t2.k(e.a.j.MenuItem_showAsAction, -1);
            this.z = t2.o(e.a.j.MenuItem_android_onClick);
            this.w = t2.n(e.a.j.MenuItem_actionLayout, 0);
            this.x = t2.o(e.a.j.MenuItem_actionViewClass);
            String o2 = t2.o(e.a.j.MenuItem_actionProviderClass);
            this.y = o2;
            boolean z2 = o2 != null;
            if (z2 && this.w == 0 && this.x == null) {
                this.A = (e.h.k.b) e(this.y, g.f8396f, g.this.b);
            } else {
                if (z2) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.A = null;
            }
            this.B = t2.p(e.a.j.MenuItem_contentDescription);
            this.C = t2.p(e.a.j.MenuItem_tooltipText);
            if (t2.r(e.a.j.MenuItem_iconTintMode)) {
                this.E = e0.d(t2.k(e.a.j.MenuItem_iconTintMode, -1), this.E);
            } else {
                this.E = null;
            }
            if (t2.r(e.a.j.MenuItem_iconTint)) {
                this.D = t2.c(e.a.j.MenuItem_iconTint);
            } else {
                this.D = null;
            }
            t2.v();
            this.f8402h = false;
        }

        public void h() {
            this.b = 0;
            this.c = 0;
            this.f8398d = 0;
            this.f8399e = 0;
            this.f8400f = true;
            this.f8401g = true;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            r0 = 1
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r0[r1] = r2
            f8395e = r0
            f8396f = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.n.g.<clinit>():void");
    }

    public g(Context context) {
        super(context);
        this.c = context;
        Object[] objArr = {context};
        this.a = objArr;
        this.b = objArr;
    }

    private Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    private void c(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) {
        b bVar = new b(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType != 2) {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            } else {
                String name = xmlPullParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlPullParser.next();
                } else {
                    throw new RuntimeException("Expecting menu, got " + name);
                }
            }
        }
        String str = null;
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            if (eventType != 1) {
                if (eventType != 2) {
                    if (eventType == 3) {
                        String name2 = xmlPullParser.getName();
                        if (z2 && name2.equals(str)) {
                            str = null;
                            z2 = false;
                        } else if (name2.equals("group")) {
                            bVar.h();
                        } else if (name2.equals("item")) {
                            if (!bVar.d()) {
                                e.h.k.b bVar2 = bVar.A;
                                if (bVar2 == null || !bVar2.a()) {
                                    bVar.a();
                                } else {
                                    bVar.b();
                                }
                            }
                        } else if (name2.equals("menu")) {
                            z = true;
                        }
                    }
                } else if (!z2) {
                    String name3 = xmlPullParser.getName();
                    if (name3.equals("group")) {
                        bVar.f(attributeSet);
                    } else if (name3.equals("item")) {
                        bVar.g(attributeSet);
                    } else if (name3.equals("menu")) {
                        c(xmlPullParser, attributeSet, bVar.b());
                    } else {
                        str = name3;
                        z2 = true;
                    }
                }
                eventType = xmlPullParser.next();
            } else {
                throw new RuntimeException("Unexpected end of document");
            }
        }
    }

    /* access modifiers changed from: package-private */
    public Object b() {
        if (this.f8397d == null) {
            this.f8397d = a(this.c);
        }
        return this.f8397d;
    }

    public void inflate(int i2, Menu menu) {
        if (!(menu instanceof e.h.e.a.a)) {
            super.inflate(i2, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            xmlResourceParser = this.c.getResources().getLayout(i2);
            c(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        } catch (XmlPullParserException e2) {
            throw new InflateException("Error inflating menu XML", e2);
        } catch (IOException e3) {
            throw new InflateException("Error inflating menu XML", e3);
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
