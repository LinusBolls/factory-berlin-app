package com.sensorberg.smartworkspace.app.screens.alarm.q;

import android.view.ViewGroup;
import android.widget.TextView;
import com.sensorberg.factory.R;
import com.sensorberg.smartworkspace.app.screens.alarm.m;
import g.e.d.c;
import kotlin.jvm.internal.k;

/* compiled from: AlarmInfoViewHolder.kt */
public final class a extends c {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(ViewGroup viewGroup) {
        super(R.layout.alarm_info_viewholder, viewGroup);
        k.e(viewGroup, "viewGroup");
    }

    public final void M(m.a aVar) {
        k.e(aVar, "widget");
        ((TextView) this.a.findViewById(R.id.alarm_info_textview)).setText(aVar.b());
    }
}
