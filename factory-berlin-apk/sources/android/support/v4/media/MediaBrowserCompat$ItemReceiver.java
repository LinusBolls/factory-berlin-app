package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;
import d.a.a.a.b;

class MediaBrowserCompat$ItemReceiver extends b {

    /* renamed from: i  reason: collision with root package name */
    private final String f4i;

    /* renamed from: j  reason: collision with root package name */
    private final b f5j;

    /* access modifiers changed from: protected */
    public void a(int i2, Bundle bundle) {
        MediaSessionCompat.a(bundle);
        if (i2 != 0 || bundle == null || !bundle.containsKey("media_item")) {
            this.f5j.a(this.f4i);
            return;
        }
        Parcelable parcelable = bundle.getParcelable("media_item");
        if (parcelable == null || (parcelable instanceof MediaBrowserCompat$MediaItem)) {
            this.f5j.b((MediaBrowserCompat$MediaItem) parcelable);
        } else {
            this.f5j.a(this.f4i);
        }
    }
}
