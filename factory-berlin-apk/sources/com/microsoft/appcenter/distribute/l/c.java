package com.microsoft.appcenter.distribute.l;

import android.content.Context;
import android.os.Build;
import com.microsoft.appcenter.distribute.h;
import com.microsoft.appcenter.distribute.l.b;
import com.microsoft.appcenter.distribute.l.e.a;

/* compiled from: ReleaseDownloaderFactory */
public class c {
    public static b a(Context context, h hVar, b.a aVar) {
        if (Build.VERSION.SDK_INT < 21) {
            return new com.microsoft.appcenter.distribute.l.d.c(context, hVar, aVar);
        }
        return new a(context, hVar, aVar);
    }
}
