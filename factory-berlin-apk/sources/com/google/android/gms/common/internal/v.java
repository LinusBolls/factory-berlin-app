package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.gms.common.j;

public class v {
    private final Resources a;
    private final String b;

    public v(Context context) {
        r.k(context);
        Resources resources = context.getResources();
        this.a = resources;
        this.b = resources.getResourcePackageName(j.common_google_play_services_unknown_issue);
    }

    public String a(String str) {
        int identifier = this.a.getIdentifier(str, "string", this.b);
        if (identifier == 0) {
            return null;
        }
        return this.a.getString(identifier);
    }
}
