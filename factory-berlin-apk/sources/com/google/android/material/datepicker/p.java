package com.google.android.material.datepicker;

import androidx.fragment.app.Fragment;
import java.util.LinkedHashSet;

/* compiled from: PickerFragment */
abstract class p<S> extends Fragment {
    protected final LinkedHashSet<o<S>> d0 = new LinkedHashSet<>();

    p() {
    }

    /* access modifiers changed from: package-private */
    public boolean Q1(o<S> oVar) {
        return this.d0.add(oVar);
    }

    /* access modifiers changed from: package-private */
    public void R1() {
        this.d0.clear();
    }
}
