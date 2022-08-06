package d.a.a.a;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import d.a.a.a.a;

@SuppressLint({"BanParcelableUsage"})
/* compiled from: ResultReceiver */
public class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: g  reason: collision with root package name */
    final Handler f8164g = null;

    /* renamed from: h  reason: collision with root package name */
    a f8165h;

    /* compiled from: ResultReceiver */
    class a implements Parcelable.Creator<b> {
        a() {
        }

        /* renamed from: a */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        /* renamed from: b */
        public b[] newArray(int i2) {
            return new b[i2];
        }
    }

    /* renamed from: d.a.a.a.b$b  reason: collision with other inner class name */
    /* compiled from: ResultReceiver */
    class C0549b extends a.C0547a {
        C0549b() {
        }

        public void M0(int i2, Bundle bundle) {
            b bVar = b.this;
            Handler handler = bVar.f8164g;
            if (handler != null) {
                handler.post(new c(i2, bundle));
            } else {
                bVar.a(i2, bundle);
            }
        }
    }

    /* compiled from: ResultReceiver */
    class c implements Runnable {

        /* renamed from: g  reason: collision with root package name */
        final int f8166g;

        /* renamed from: h  reason: collision with root package name */
        final Bundle f8167h;

        c(int i2, Bundle bundle) {
            this.f8166g = i2;
            this.f8167h = bundle;
        }

        public void run() {
            b.this.a(this.f8166g, this.f8167h);
        }
    }

    b(Parcel parcel) {
        this.f8165h = a.C0547a.i(parcel.readStrongBinder());
    }

    /* access modifiers changed from: protected */
    public void a(int i2, Bundle bundle) {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        synchronized (this) {
            if (this.f8165h == null) {
                this.f8165h = new C0549b();
            }
            parcel.writeStrongBinder(this.f8165h.asBinder());
        }
    }
}
