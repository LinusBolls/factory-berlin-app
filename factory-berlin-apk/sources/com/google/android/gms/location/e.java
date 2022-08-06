package com.google.android.gms.location;

import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.api.internal.a;
import com.google.android.gms.common.api.internal.l;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.tasks.g;
import java.util.List;

public class e extends c<Object> {
    public e(Context context) {
        super(context, j.c, null, (l) new a());
    }

    public g<Void> o(g gVar, PendingIntent pendingIntent) {
        return q.b(j.f2687d.a(a(), gVar, pendingIntent));
    }

    public g<Void> p(PendingIntent pendingIntent) {
        return q.b(j.f2687d.b(a(), pendingIntent));
    }

    public g<Void> q(List<String> list) {
        return q.b(j.f2687d.c(a(), list));
    }
}
