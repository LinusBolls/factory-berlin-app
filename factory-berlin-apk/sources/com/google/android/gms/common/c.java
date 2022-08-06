package com.google.android.gms.common;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.gms.common.internal.r;

public class c extends DialogFragment {

    /* renamed from: g  reason: collision with root package name */
    private Dialog f2103g = null;

    /* renamed from: h  reason: collision with root package name */
    private DialogInterface.OnCancelListener f2104h = null;

    public static c a(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        c cVar = new c();
        r.l(dialog, "Cannot display null dialog");
        Dialog dialog2 = dialog;
        dialog2.setOnCancelListener((DialogInterface.OnCancelListener) null);
        dialog2.setOnDismissListener((DialogInterface.OnDismissListener) null);
        cVar.f2103g = dialog2;
        if (onCancelListener != null) {
            cVar.f2104h = onCancelListener;
        }
        return cVar;
    }

    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f2104h;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        if (this.f2103g == null) {
            setShowsDialog(false);
        }
        return this.f2103g;
    }

    public void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
