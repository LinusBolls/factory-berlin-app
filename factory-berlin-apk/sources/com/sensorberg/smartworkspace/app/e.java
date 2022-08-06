package com.sensorberg.smartworkspace.app;

import androidx.navigation.NavController;
import com.sensorberg.booking.mybookings.h;
import com.sensorberg.smartspaces.sdk.model.Openable;
import g.e.d.g;
import kotlin.jvm.internal.k;
import org.threeten.bp.LocalDate;

/* compiled from: NavigatorImpl.kt */
public final class e implements g {
    public void a(NavController navController) {
        k.e(navController, "navController");
        navController.s(h.a.b());
    }

    public void b(NavController navController) {
        k.e(navController, "navController");
        navController.s(d.a.i());
    }

    public void c(NavController navController, String str, String str2, LocalDate localDate) {
        k.e(navController, "navController");
        k.e(str, "unitId");
        k.e(str2, "unitName");
        k.e(localDate, "startDate");
        navController.s(h.a.a(localDate, str, str2));
    }

    public void d(NavController navController, String str) {
        k.e(navController, "navController");
        k.e(str, "unitId");
        navController.s(d.a.g((Openable) null, str));
    }
}
