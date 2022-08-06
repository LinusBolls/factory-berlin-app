package com.google.android.gms.dynamic;

import android.os.IBinder;
import android.os.IInterface;
import g.b.a.b.c.c.b;

public interface a extends IInterface {

    /* renamed from: com.google.android.gms.dynamic.a$a  reason: collision with other inner class name */
    public static abstract class C0065a extends b implements a {

        /* renamed from: com.google.android.gms.dynamic.a$a$a  reason: collision with other inner class name */
        public static class C0066a extends g.b.a.b.c.c.a implements a {
            C0066a(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.dynamic.IObjectWrapper");
            }
        }

        public C0065a() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
        }

        public static a l(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            if (queryLocalInterface instanceof a) {
                return (a) queryLocalInterface;
            }
            return new C0066a(iBinder);
        }
    }
}
