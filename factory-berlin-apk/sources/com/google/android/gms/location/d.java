package com.google.android.gms.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.e;
import java.util.List;

@Deprecated
public interface d {
    e<Status> a(com.google.android.gms.common.api.d dVar, g gVar, PendingIntent pendingIntent);

    e<Status> b(com.google.android.gms.common.api.d dVar, PendingIntent pendingIntent);

    e<Status> c(com.google.android.gms.common.api.d dVar, List<String> list);
}
