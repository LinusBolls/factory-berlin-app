package android.support.v4.media;

import android.os.Bundle;
import android.support.v4.media.session.MediaSessionCompat;
import android.util.Log;
import d.a.a.a.b;

class MediaBrowserCompat$CustomActionResultReceiver extends b {

    /* renamed from: i  reason: collision with root package name */
    private final String f1i;

    /* renamed from: j  reason: collision with root package name */
    private final Bundle f2j;

    /* renamed from: k  reason: collision with root package name */
    private final a f3k;

    /* access modifiers changed from: protected */
    public void a(int i2, Bundle bundle) {
        if (this.f3k != null) {
            MediaSessionCompat.a(bundle);
            if (i2 == -1) {
                this.f3k.a(this.f1i, this.f2j, bundle);
            } else if (i2 == 0) {
                this.f3k.c(this.f1i, this.f2j, bundle);
            } else if (i2 != 1) {
                Log.w("MediaBrowserCompat", "Unknown result code: " + i2 + " (extras=" + this.f2j + ", resultData=" + bundle + ")");
            } else {
                this.f3k.b(this.f1i, this.f2j, bundle);
            }
        }
    }
}
