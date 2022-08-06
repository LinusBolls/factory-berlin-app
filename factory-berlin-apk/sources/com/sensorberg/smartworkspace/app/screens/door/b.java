package com.sensorberg.smartworkspace.app.screens.door;

import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.m;
import androidx.fragment.app.q;
import com.sensorberg.smartworkspace.app.screens.door.e.a;
import kotlin.jvm.internal.k;

/* compiled from: NearbyContainerPagerAdapter.kt */
public final class b extends q {

    /* renamed from: f  reason: collision with root package name */
    private final Resources f7355f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(Resources resources, m mVar) {
        super(mVar);
        k.e(resources, "resources");
        k.e(mVar, "fragmentManager");
        this.f7355f = resources;
    }

    public int c() {
        return a.values().length;
    }

    public CharSequence e(int i2) {
        a aVar;
        Resources resources = this.f7355f;
        a[] values = a.values();
        int length = values.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                aVar = null;
                break;
            }
            aVar = values[i3];
            if (aVar.a() == i2) {
                break;
            }
            i3++;
        }
        k.c(aVar);
        return resources.getString(aVar.f());
    }

    public Fragment n(int i2) {
        if (i2 == a.Nearby.a()) {
            return new a();
        }
        if (i2 == a.Favorites.a()) {
            return new com.sensorberg.smartworkspace.app.screens.door.d.b();
        }
        throw new IllegalStateException("unknown position of page for nearby container view pager");
    }
}
