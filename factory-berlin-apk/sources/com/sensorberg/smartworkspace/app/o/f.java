package com.sensorberg.smartworkspace.app.o;

import android.content.Context;
import androidx.navigation.p;
import com.sensorberg.factory.R;
import com.sensorberg.smartworkspace.app.d;
import g.e.d.n;
import kotlin.jvm.internal.k;

/* compiled from: SpacesTab.kt */
public final class f implements n {
    private static final String a = "Spaces";
    private static final int b = 2131231077;
    private static final int c = 2131296719;

    /* renamed from: d  reason: collision with root package name */
    private static final p f7264d = d.a.j();

    /* renamed from: e  reason: collision with root package name */
    public static final f f7265e = new f();

    private f() {
    }

    public String a(Context context) {
        k.e(context, "context");
        String string = context.getString(R.string.tab_label_spaces);
        k.d(string, "context.getString(R.string.tab_label_spaces)");
        return string;
    }

    public p b() {
        return f7264d;
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
