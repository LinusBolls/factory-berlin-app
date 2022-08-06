package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.google.android.gms.common.util.b;
import com.google.android.gms.measurement.internal.e6;
import com.google.android.gms.measurement.internal.h6;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-measurement-api@@17.5.0 */
public final class c {
    private static final Set<String> a = new HashSet(Arrays.asList(new String[]{"_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire"}));
    private static final List<String> b = Arrays.asList(new String[]{"_e", "_f", "_iap", "_s", "_au", "_ui", "_cd"});
    private static final List<String> c = Arrays.asList(new String[]{"auto", "app", "am"});

    /* renamed from: d  reason: collision with root package name */
    private static final List<String> f3863d = Arrays.asList(new String[]{"_r", "_dbg"});

    static {
        Arrays.asList((String[]) b.a(h6.a, h6.b));
        Arrays.asList(new String[]{"^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$"});
    }

    public static boolean a(String str) {
        return !c.contains(str);
    }

    public static boolean b(String str, Bundle bundle) {
        if (b.contains(str)) {
            return false;
        }
        if (bundle == null) {
            return true;
        }
        for (String containsKey : f3863d) {
            if (bundle.containsKey(containsKey)) {
                return false;
            }
        }
        return true;
    }

    public static boolean c(String str, String str2, Bundle bundle) {
        if (!"_cmp".equals(str2)) {
            return true;
        }
        if (!a(str) || bundle == null) {
            return false;
        }
        for (String containsKey : f3863d) {
            if (bundle.containsKey(containsKey)) {
                return false;
            }
        }
        char c2 = 65535;
        int hashCode = str.hashCode();
        if (hashCode != 101200) {
            if (hashCode != 101230) {
                if (hashCode == 3142703 && str.equals("fiam")) {
                    c2 = 2;
                }
            } else if (str.equals("fdl")) {
                c2 = 1;
            }
        } else if (str.equals("fcm")) {
            c2 = 0;
        }
        if (c2 == 0) {
            bundle.putString("_cis", "fcm_integration");
            return true;
        } else if (c2 == 1) {
            bundle.putString("_cis", "fdl_integration");
            return true;
        } else if (c2 != 2) {
            return false;
        } else {
            bundle.putString("_cis", "fiam_integration");
            return true;
        }
    }

    public static void d(String str, String str2, Bundle bundle) {
        if ("clx".equals(str) && "_ae".equals(str2)) {
            bundle.putLong("_r", 1);
        }
    }

    public static boolean e(String str) {
        return !a.contains(str);
    }

    public static String f(String str) {
        String a2 = e6.a(str);
        return a2 != null ? a2 : str;
    }
}
