package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import com.google.auto.value.AutoValue;
import g.b.a.a.i.w.a;

@AutoValue
/* compiled from: CreationContext */
public abstract class h {
    public static h a(Context context, a aVar, a aVar2, String str) {
        return new c(context, aVar, aVar2, str);
    }

    public abstract Context b();

    public abstract String c();

    public abstract a d();

    public abstract a e();
}
