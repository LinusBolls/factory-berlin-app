package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* compiled from: MaterialTextInputPicker */
public final class k<S> extends p<S> {
    private d<S> e0;
    private a f0;

    /* compiled from: MaterialTextInputPicker */
    class a implements o<S> {
        a() {
        }

        public void a(S s) {
            Iterator it = k.this.d0.iterator();
            while (it.hasNext()) {
                ((o) it.next()).a(s);
            }
        }
    }

    static <T> k<T> S1(d<T> dVar, a aVar) {
        k<T> kVar = new k<>();
        Bundle bundle = new Bundle();
        bundle.putParcelable("DATE_SELECTOR_KEY", dVar);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar);
        kVar.D1(bundle);
        return kVar;
    }

    public View A0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.e0.w0(layoutInflater, viewGroup, bundle, this.f0, new a());
    }

    public void S0(Bundle bundle) {
        super.S0(bundle);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.e0);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f0);
    }

    public void w0(Bundle bundle) {
        super.w0(bundle);
        if (bundle == null) {
            bundle = A();
        }
        this.e0 = (d) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f0 = (a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }
}
