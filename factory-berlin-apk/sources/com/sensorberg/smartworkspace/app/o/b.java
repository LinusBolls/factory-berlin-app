package com.sensorberg.smartworkspace.app.o;

import android.content.Context;
import androidx.navigation.p;
import com.sensorberg.factory.R;
import com.sensorberg.smartworkspace.app.d;
import g.e.d.n;
import kotlin.jvm.internal.k;

/* compiled from: DoorTab.kt */
public final class b implements n {
    private static final String a = "Door";
    private static final int b = 2131231054;
    private static final int c = 2131296408;

    /* renamed from: d  reason: collision with root package name */
    private static final p f7256d = d.a.b();

    /* renamed from: e  reason: collision with root package name */
    public static final b f7257e = new b();

    private b() {
    }

    public String a(Context context) {
        k.e(context, "context");
        String string = context.getString(R.string.label_doors);
        k.d(string, "context.getString(R.string.label_doors)");
        return string;
    }

    public p b() {
        return f7256d;
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
