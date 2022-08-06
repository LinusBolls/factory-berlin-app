package com.sensorberg.smartworkspace.app.o;

import android.content.Context;
import androidx.navigation.p;
import com.sensorberg.factory.R;
import com.sensorberg.smartworkspace.app.d;
import g.e.d.n;
import kotlin.jvm.internal.k;

/* compiled from: RoomsTab.kt */
public final class e implements n {
    private static final String a = "Rooms";
    private static final int b = 2131231072;
    private static final int c = 2131296630;

    /* renamed from: d  reason: collision with root package name */
    private static final p f7262d = d.a.h();

    /* renamed from: e  reason: collision with root package name */
    public static final e f7263e = new e();

    private e() {
    }

    public String a(Context context) {
        k.e(context, "context");
        String string = context.getString(R.string.label_rooms);
        k.d(string, "context.getString(R.string.label_rooms)");
        return string;
    }

    public p b() {
        return f7262d;
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
