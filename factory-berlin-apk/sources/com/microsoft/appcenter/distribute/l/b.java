package com.microsoft.appcenter.distribute.l;

import android.net.Uri;
import com.microsoft.appcenter.distribute.h;

/* compiled from: ReleaseDownloader */
public interface b {

    /* compiled from: ReleaseDownloader */
    public interface a {
        boolean a(long j2, long j3);

        boolean b(Uri uri);

        void c(long j2);

        void d(String str);
    }

    void a();

    boolean b();

    h c();

    void cancel();
}
