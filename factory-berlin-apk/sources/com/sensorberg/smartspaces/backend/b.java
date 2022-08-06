package com.sensorberg.smartspaces.backend;

import com.sensorberg.smartspaces.backend.model.BeBooking;
import g.e.k.e;
import g.e.m.a;

/* compiled from: BackendBookingsInterface.kt */
public interface b {
    e<a<Void, Void>> a(String str);

    e<a<BeBooking, Void>> b(String str, String str2, String str3, String str4, String str5);

    e<a<BeBooking, Void>> c(String str, String str2);
}
