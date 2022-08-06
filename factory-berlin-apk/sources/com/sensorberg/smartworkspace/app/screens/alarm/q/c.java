package com.sensorberg.smartworkspace.app.screens.alarm.q;

import android.view.ViewGroup;
import android.widget.TextView;
import com.sensorberg.factory.R;
import com.sensorberg.smartworkspace.app.screens.alarm.m;
import kotlin.jvm.internal.k;

/* compiled from: AlarmTitleViewHolder.kt */
public final class c extends g.e.d.c {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(ViewGroup viewGroup) {
        super(R.layout.alarm_title_viewholder, viewGroup);
        k.e(viewGroup, "viewGroup");
    }

    public final void M(m.c cVar) {
        k.e(cVar, "widget");
        ((TextView) this.a.findViewById(R.id.alarm_title_textview)).setText(cVar.b());
    }
}
