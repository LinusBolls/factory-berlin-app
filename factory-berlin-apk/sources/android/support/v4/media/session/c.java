package android.support.v4.media.session;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.a;
import android.support.v4.media.session.e;
import java.lang.ref.WeakReference;
import java.util.List;

/* compiled from: MediaControllerCompat */
public abstract class c implements IBinder.DeathRecipient {
    final Object a;
    a b;
    a c;

    /* compiled from: MediaControllerCompat */
    private class a extends Handler {
    }

    /* compiled from: MediaControllerCompat */
    private static class b implements e.a {
        private final WeakReference<c> a;

        b(c cVar) {
            this.a = new WeakReference<>(cVar);
        }

        public void a(Object obj) {
            c cVar = (c) this.a.get();
            if (cVar != null) {
                cVar.c(MediaMetadataCompat.a(obj));
            }
        }

        public void b(int i2, int i3, int i4, int i5, int i6) {
            c cVar = (c) this.a.get();
            if (cVar != null) {
                cVar.a(new d(i2, i3, i4, i5, i6));
            }
        }

        public void c(Object obj) {
            c cVar = (c) this.a.get();
            if (cVar != null && cVar.c == null) {
                cVar.d(PlaybackStateCompat.a(obj));
            }
        }

        public void d(String str, Bundle bundle) {
            c cVar = (c) this.a.get();
            if (cVar == null) {
                return;
            }
            if (cVar.c == null || Build.VERSION.SDK_INT >= 23) {
                cVar.h(str, bundle);
            }
        }

        public void e(CharSequence charSequence) {
            c cVar = (c) this.a.get();
            if (cVar != null) {
                cVar.f(charSequence);
            }
        }

        public void g() {
            c cVar = (c) this.a.get();
            if (cVar != null) {
                cVar.g();
            }
        }

        public void j(Bundle bundle) {
            c cVar = (c) this.a.get();
            if (cVar != null) {
                cVar.b(bundle);
            }
        }

        public void k(List<?> list) {
            c cVar = (c) this.a.get();
            if (cVar != null) {
                cVar.e(MediaSessionCompat.QueueItem.b(list));
            }
        }
    }

    /* renamed from: android.support.v4.media.session.c$c  reason: collision with other inner class name */
    /* compiled from: MediaControllerCompat */
    private static class C0002c extends a.C0000a {
        private final WeakReference<c> a;

        C0002c(c cVar) {
            this.a = new WeakReference<>(cVar);
        }

        public void C(MediaMetadataCompat mediaMetadataCompat) {
            c cVar = (c) this.a.get();
            if (cVar != null) {
                cVar.i(3, mediaMetadataCompat, (Bundle) null);
            }
        }

        public void F(int i2) {
            c cVar = (c) this.a.get();
            if (cVar != null) {
                cVar.i(9, Integer.valueOf(i2), (Bundle) null);
            }
        }

        public void H0(PlaybackStateCompat playbackStateCompat) {
            c cVar = (c) this.a.get();
            if (cVar != null) {
                cVar.i(2, playbackStateCompat, (Bundle) null);
            }
        }

        public void R0(ParcelableVolumeInfo parcelableVolumeInfo) {
            c cVar = (c) this.a.get();
            if (cVar != null) {
                cVar.i(4, parcelableVolumeInfo != null ? new d(parcelableVolumeInfo.f37g, parcelableVolumeInfo.f38h, parcelableVolumeInfo.f39i, parcelableVolumeInfo.f40j, parcelableVolumeInfo.f41k) : null, (Bundle) null);
            }
        }

        public void X(int i2) {
            c cVar = (c) this.a.get();
            if (cVar != null) {
                cVar.i(12, Integer.valueOf(i2), (Bundle) null);
            }
        }

        public void Z() {
            c cVar = (c) this.a.get();
            if (cVar != null) {
                cVar.i(13, (Object) null, (Bundle) null);
            }
        }

        public void e(CharSequence charSequence) {
            c cVar = (c) this.a.get();
            if (cVar != null) {
                cVar.i(6, charSequence, (Bundle) null);
            }
        }

        public void g() {
            c cVar = (c) this.a.get();
            if (cVar != null) {
                cVar.i(8, (Object) null, (Bundle) null);
            }
        }

        public void j(Bundle bundle) {
            c cVar = (c) this.a.get();
            if (cVar != null) {
                cVar.i(7, bundle, (Bundle) null);
            }
        }

        public void k(List<MediaSessionCompat.QueueItem> list) {
            c cVar = (c) this.a.get();
            if (cVar != null) {
                cVar.i(5, list, (Bundle) null);
            }
        }

        public void n(String str, Bundle bundle) {
            c cVar = (c) this.a.get();
            if (cVar != null) {
                cVar.i(1, str, bundle);
            }
        }

        public void q(boolean z) {
        }

        public void v0(boolean z) {
            c cVar = (c) this.a.get();
            if (cVar != null) {
                cVar.i(11, Boolean.valueOf(z), (Bundle) null);
            }
        }
    }

    public c() {
        if (Build.VERSION.SDK_INT >= 21) {
            this.a = e.a(new b(this));
        } else {
            this.c = new C0002c(this);
        }
    }

    public void a(d dVar) {
    }

    public void b(Bundle bundle) {
    }

    public void binderDied() {
        i(8, (Object) null, (Bundle) null);
    }

    public void c(MediaMetadataCompat mediaMetadataCompat) {
    }

    public void d(PlaybackStateCompat playbackStateCompat) {
    }

    public void e(List<MediaSessionCompat.QueueItem> list) {
    }

    public void f(CharSequence charSequence) {
    }

    public void g() {
    }

    public void h(String str, Bundle bundle) {
    }

    /* access modifiers changed from: package-private */
    public void i(int i2, Object obj, Bundle bundle) {
        a aVar = this.b;
        if (aVar != null) {
            Message obtainMessage = aVar.obtainMessage(i2, obj);
            obtainMessage.setData(bundle);
            obtainMessage.sendToTarget();
        }
    }
}
