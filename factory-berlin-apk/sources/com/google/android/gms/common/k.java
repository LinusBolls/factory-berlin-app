package com.google.android.gms.common;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.c;
import androidx.fragment.app.m;
import com.google.android.gms.common.internal.r;

public class k extends c {
    private Dialog r0 = null;
    private DialogInterface.OnCancelListener s0 = null;

    public static k f2(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        k kVar = new k();
        r.l(dialog, "Cannot display null dialog");
        Dialog dialog2 = dialog;
        dialog2.setOnCancelListener((DialogInterface.OnCancelListener) null);
        dialog2.setOnDismissListener((DialogInterface.OnDismissListener) null);
        kVar.r0 = dialog2;
        if (onCancelListener != null) {
            kVar.s0 = onCancelListener;
        }
        return kVar;
    }

    public Dialog X1(Bundle bundle) {
        if (this.r0 == null) {
            a2(false);
        }
        return this.r0;
    }

    public void d2(m mVar, String str) {
        super.d2(mVar, str);
    }

    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.s0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
