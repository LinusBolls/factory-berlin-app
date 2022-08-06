package com.google.firebase.crashlytics.d.s;

import android.content.Context;
import com.google.firebase.crashlytics.d.h.h;

/* compiled from: ResourceUnityVersionProvider */
public class a implements b {
    private final Context a;
    private boolean b = false;
    private String c;

    public a(Context context) {
        this.a = context;
    }

    public String a() {
        if (!this.b) {
            this.c = h.E(this.a);
            this.b = true;
        }
        String str = this.c;
        if (str != null) {
            return str;
        }
        return null;
    }
}
