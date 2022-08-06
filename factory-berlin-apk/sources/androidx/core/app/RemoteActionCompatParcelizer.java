package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.VersionedParcel;

public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(VersionedParcel versionedParcel) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.a = (IconCompat) versionedParcel.v(remoteActionCompat.a, 1);
        remoteActionCompat.b = versionedParcel.l(remoteActionCompat.b, 2);
        remoteActionCompat.c = versionedParcel.l(remoteActionCompat.c, 3);
        remoteActionCompat.f646d = (PendingIntent) versionedParcel.r(remoteActionCompat.f646d, 4);
        remoteActionCompat.f647e = versionedParcel.h(remoteActionCompat.f647e, 5);
        remoteActionCompat.f648f = versionedParcel.h(remoteActionCompat.f648f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, VersionedParcel versionedParcel) {
        versionedParcel.x(false, false);
        versionedParcel.M(remoteActionCompat.a, 1);
        versionedParcel.D(remoteActionCompat.b, 2);
        versionedParcel.D(remoteActionCompat.c, 3);
        versionedParcel.H(remoteActionCompat.f646d, 4);
        versionedParcel.z(remoteActionCompat.f647e, 5);
        versionedParcel.z(remoteActionCompat.f648f, 6);
    }
}
