package com.microsoft.appcenter.utils;

import com.microsoft.appcenter.utils.o.d;
import java.util.UUID;

/* compiled from: IdHelper */
public class g {
    public static UUID a() {
        try {
            return UUID.fromString(d.g("installId", ""));
        } catch (Exception unused) {
            a.i("AppCenter", "Unable to get installID from Shared Preferences");
            UUID randomUUID = UUID.randomUUID();
            d.n("installId", randomUUID.toString());
            return randomUUID;
        }
    }
}
