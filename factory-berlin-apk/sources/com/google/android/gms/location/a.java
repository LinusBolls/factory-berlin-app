package com.google.android.gms.location;

import android.content.Context;
import android.location.Location;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.api.internal.l;
import com.google.android.gms.tasks.g;

public class a extends c<Object> {
    public a(Context context) {
        super(context, j.c, null, (l) new com.google.android.gms.common.api.internal.a());
    }

    public g<Location> o() {
        return c(new v(this));
    }
}
