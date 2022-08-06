package com.google.android.gms.internal.measurement;

import android.net.Uri;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
public final class c2 {
    private final Map<String, Map<String, String>> a;

    c2(Map<String, Map<String, String>> map) {
        this.a = map;
    }

    public final String a(Uri uri, String str, String str2, String str3) {
        Map map;
        if (uri == null || (map = this.a.get(uri.toString())) == null) {
            return null;
        }
        if (str2 != null) {
            String valueOf = String.valueOf(str2);
            String valueOf2 = String.valueOf(str3);
            str3 = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
        }
        return (String) map.get(str3);
    }
}
