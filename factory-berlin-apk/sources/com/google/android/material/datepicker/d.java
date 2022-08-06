package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Collection;

/* compiled from: DateSelector */
public interface d<S> extends Parcelable {
    Collection<e.h.j.d<Long, Long>> D();

    boolean M();

    Collection<Long> U();

    S b0();

    void r0(long j2);

    View w0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, a aVar, o<S> oVar);

    String y(Context context);

    int z(Context context);
}
