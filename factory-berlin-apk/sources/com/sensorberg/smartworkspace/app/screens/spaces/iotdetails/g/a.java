package com.sensorberg.smartworkspace.app.screens.spaces.iotdetails.g;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.sensorberg.smartworkspace.app.screens.spaces.iotdetails.e;
import kotlin.jvm.internal.k;

/* compiled from: IotDeviceDetailsBaseHolder.kt */
public abstract class a extends RecyclerView.d0 {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(View view) {
        super(view);
        k.e(view, "itemView");
    }

    public abstract void M(e eVar);
}
