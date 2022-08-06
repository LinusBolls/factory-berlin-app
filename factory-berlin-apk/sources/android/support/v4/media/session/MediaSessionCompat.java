package android.support.v4.media.session;

import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;
import java.util.ArrayList;
import java.util.List;

public class MediaSessionCompat {

    public static final class ResultReceiverWrapper implements Parcelable {
        public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new a();

        /* renamed from: g  reason: collision with root package name */
        ResultReceiver f34g;

        static class a implements Parcelable.Creator<ResultReceiverWrapper> {
            a() {
            }

            /* renamed from: a */
            public ResultReceiverWrapper createFromParcel(Parcel parcel) {
                return new ResultReceiverWrapper(parcel);
            }

            /* renamed from: b */
            public ResultReceiverWrapper[] newArray(int i2) {
                return new ResultReceiverWrapper[i2];
            }
        }

        ResultReceiverWrapper(Parcel parcel) {
            this.f34g = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i2) {
            this.f34g.writeToParcel(parcel, i2);
        }
    }

    public static final class Token implements Parcelable {
        public static final Parcelable.Creator<Token> CREATOR = new a();

        /* renamed from: g  reason: collision with root package name */
        private final Object f35g;

        /* renamed from: h  reason: collision with root package name */
        private b f36h;

        static class a implements Parcelable.Creator<Token> {
            a() {
            }

            /* renamed from: a */
            public Token createFromParcel(Parcel parcel) {
                Object obj;
                if (Build.VERSION.SDK_INT >= 21) {
                    obj = parcel.readParcelable((ClassLoader) null);
                } else {
                    obj = parcel.readStrongBinder();
                }
                return new Token(obj);
            }

            /* renamed from: b */
            public Token[] newArray(int i2) {
                return new Token[i2];
            }
        }

        Token(Object obj) {
            this(obj, (b) null, (Bundle) null);
        }

        public b a() {
            return this.f36h;
        }

        public void b(b bVar) {
            this.f36h = bVar;
        }

        public void c(Bundle bundle) {
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Token)) {
                return false;
            }
            Token token = (Token) obj;
            Object obj2 = this.f35g;
            if (obj2 != null) {
                Object obj3 = token.f35g;
                if (obj3 == null) {
                    return false;
                }
                return obj2.equals(obj3);
            } else if (token.f35g == null) {
                return true;
            } else {
                return false;
            }
        }

        public int hashCode() {
            Object obj = this.f35g;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public void writeToParcel(Parcel parcel, int i2) {
            if (Build.VERSION.SDK_INT >= 21) {
                parcel.writeParcelable((Parcelable) this.f35g, i2);
            } else {
                parcel.writeStrongBinder((IBinder) this.f35g);
            }
        }

        Token(Object obj, b bVar, Bundle bundle) {
            this.f35g = obj;
            this.f36h = bVar;
        }
    }

    public static void a(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
        }
    }

    public static final class QueueItem implements Parcelable {
        public static final Parcelable.Creator<QueueItem> CREATOR = new a();

        /* renamed from: g  reason: collision with root package name */
        private final MediaDescriptionCompat f31g;

        /* renamed from: h  reason: collision with root package name */
        private final long f32h;

        /* renamed from: i  reason: collision with root package name */
        private Object f33i;

        static class a implements Parcelable.Creator<QueueItem> {
            a() {
            }

            /* renamed from: a */
            public QueueItem createFromParcel(Parcel parcel) {
                return new QueueItem(parcel);
            }

            /* renamed from: b */
            public QueueItem[] newArray(int i2) {
                return new QueueItem[i2];
            }
        }

        private QueueItem(Object obj, MediaDescriptionCompat mediaDescriptionCompat, long j2) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("Description cannot be null.");
            } else if (j2 != -1) {
                this.f31g = mediaDescriptionCompat;
                this.f32h = j2;
                this.f33i = obj;
            } else {
                throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
            }
        }

        public static QueueItem a(Object obj) {
            if (obj == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            return new QueueItem(obj, MediaDescriptionCompat.a(f.a(obj)), f.b(obj));
        }

        public static List<QueueItem> b(List<?> list) {
            if (list == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Object a2 : list) {
                arrayList.add(a(a2));
            }
            return arrayList;
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "MediaSession.QueueItem {Description=" + this.f31g + ", Id=" + this.f32h + " }";
        }

        public void writeToParcel(Parcel parcel, int i2) {
            this.f31g.writeToParcel(parcel, i2);
            parcel.writeLong(this.f32h);
        }

        QueueItem(Parcel parcel) {
            this.f31g = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.f32h = parcel.readLong();
        }
    }
}
