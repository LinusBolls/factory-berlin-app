package com.google.android.gms.common.api;

import android.text.TextUtils;
import com.google.android.gms.common.api.internal.q0;
import com.google.android.gms.common.b;
import e.e.a;
import java.util.ArrayList;

public class AvailabilityException extends Exception {

    /* renamed from: g  reason: collision with root package name */
    private final a<q0<?>, b> f2021g;

    public AvailabilityException(a<q0<?>, b> aVar) {
        this.f2021g = aVar;
    }

    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        for (q0 next : this.f2021g.keySet()) {
            b bVar = this.f2021g.get(next);
            if (bVar.K()) {
                z = false;
            }
            String b = next.b();
            String valueOf = String.valueOf(bVar);
            StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 2 + String.valueOf(valueOf).length());
            sb.append(b);
            sb.append(": ");
            sb.append(valueOf);
            arrayList.add(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        if (z) {
            sb2.append("None of the queried APIs are available. ");
        } else {
            sb2.append("Some of the queried APIs are unavailable. ");
        }
        sb2.append(TextUtils.join("; ", arrayList));
        return sb2.toString();
    }
}
