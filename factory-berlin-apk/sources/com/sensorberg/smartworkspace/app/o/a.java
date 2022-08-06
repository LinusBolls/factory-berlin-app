package com.sensorberg.smartworkspace.app.o;

import android.content.Context;
import androidx.navigation.p;
import com.sensorberg.factory.R;
import com.sensorberg.smartworkspace.app.d;
import g.e.d.n;
import kotlin.jvm.internal.k;

/* compiled from: AlarmTab.kt */
public final class a implements n {
    private static final String a = "Alarm";
    private static final int b = 2131231049;
    private static final int c = 2131296323;

    /* renamed from: d  reason: collision with root package name */
    private static final p f7254d = d.a.a((String) null);

    /* renamed from: e  reason: collision with root package name */
    public static final a f7255e = new a();

    private a() {
    }

    public String a(Context context) {
        k.e(context, "context");
        String string = context.getString(R.string.label_alarm);
        k.d(string, "context.getString(R.string.label_alarm)");
        return string;
    }

    public p b() {
        return f7254d;
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
