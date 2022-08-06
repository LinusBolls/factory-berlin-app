package com.google.android.gms.internal.measurement;

import android.net.Uri;
import e.e.a;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
public final class i2 {
    private static final a<String, Uri> a = new a<>();

    public static synchronized Uri a(String str) {
        Uri uri;
        synchronized (i2.class) {
            uri = a.get(str);
            if (uri == null) {
                String valueOf = String.valueOf(Uri.encode(str));
                uri = Uri.parse(valueOf.length() != 0 ? "content://com.google.android.gms.phenotype/".concat(valueOf) : new String("content://com.google.android.gms.phenotype/"));
                a.put(str, uri);
            }
        }
        return uri;
    }
}
