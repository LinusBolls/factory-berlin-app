package com.sensorberg.smartworkspace.app.o;

import android.content.Context;
import androidx.navigation.p;
import com.sensorberg.factory.R;
import com.sensorberg.smartworkspace.app.d;
import g.e.d.n;
import kotlin.jvm.internal.k;

/* compiled from: LockerTab.kt */
public final class c implements n {
    private static final String a = "Locker";
    private static final int b = 2131231064;
    private static final int c = 2131296497;

    /* renamed from: d  reason: collision with root package name */
    private static final p f7258d = d.a.d();

    /* renamed from: e  reason: collision with root package name */
    public static final c f7259e = new c();

    private c() {
    }

    public String a(Context context) {
        k.e(context, "context");
        String string = context.getString(R.string.label_lockers);
        k.d(string, "context.getString(R.string.label_lockers)");
        return string;
    }

    public p b() {
        return f7258d;
    }

    public int c() {
        return b;
    }

    public int d() {
        return c;
    }

    public String getType() {
        return a;
    }
}
