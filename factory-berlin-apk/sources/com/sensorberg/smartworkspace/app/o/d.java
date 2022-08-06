package com.sensorberg.smartworkspace.app.o;

import android.content.Context;
import androidx.navigation.p;
import com.sensorberg.factory.R;
import g.e.d.n;
import kotlin.jvm.internal.k;

/* compiled from: NotificationTab.kt */
public final class d implements n {
    private static final String a = "Notification";
    private static final int b = 2131231059;
    private static final int c = 2131296580;

    /* renamed from: d  reason: collision with root package name */
    private static final p f7260d = com.sensorberg.smartworkspace.app.d.a.f();

    /* renamed from: e  reason: collision with root package name */
    public static final d f7261e = new d();

    private d() {
    }

    public String a(Context context) {
        k.e(context, "context");
        String string = context.getString(R.string.label_info);
        k.d(string, "context.getString(R.string.label_info)");
        return string;
    }

    public p b() {
        return f7260d;
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
