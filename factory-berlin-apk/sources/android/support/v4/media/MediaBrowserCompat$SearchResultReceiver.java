package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;
import d.a.a.a.b;
import java.util.ArrayList;

class MediaBrowserCompat$SearchResultReceiver extends b {

    /* renamed from: i  reason: collision with root package name */
    private final String f8i;

    /* renamed from: j  reason: collision with root package name */
    private final Bundle f9j;

    /* renamed from: k  reason: collision with root package name */
    private final c f10k;

    /* access modifiers changed from: protected */
    public void a(int i2, Bundle bundle) {
        MediaSessionCompat.a(bundle);
        if (i2 != 0 || bundle == null || !bundle.containsKey("search_results")) {
            this.f10k.a(this.f8i, this.f9j);
            return;
        }
        Parcelable[] parcelableArray = bundle.getParcelableArray("search_results");
        ArrayList arrayList = null;
        if (parcelableArray != null) {
            arrayList = new ArrayList();
            for (Parcelable parcelable : parcelableArray) {
                arrayList.add((MediaBrowserCompat$MediaItem) parcelable);
            }
        }
        this.f10k.b(this.f8i, this.f9j, arrayList);
    }
}
