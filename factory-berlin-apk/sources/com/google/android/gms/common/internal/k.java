package com.google.android.gms.common.internal;

import android.content.Context;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.f;

public class k {
    private final SparseIntArray a = new SparseIntArray();
    private f b;

    public k(f fVar) {
        r.k(fVar);
        this.b = fVar;
    }

    public void a() {
        this.a.clear();
    }

    public int b(Context context, a.f fVar) {
        r.k(context);
        r.k(fVar);
        int i2 = 0;
        if (!fVar.f()) {
            return 0;
        }
        int g2 = fVar.g();
        int i3 = this.a.get(g2, -1);
        if (i3 != -1) {
            return i3;
        }
        int i4 = 0;
        while (true) {
            if (i4 >= this.a.size()) {
                i2 = i3;
                break;
            }
            int keyAt = this.a.keyAt(i4);
            if (keyAt > g2 && this.a.get(keyAt) == 0) {
                break;
            }
            i4++;
        }
        if (i2 == -1) {
            i2 = this.b.h(context, g2);
        }
        this.a.put(g2, i2);
        return i2;
    }
}
