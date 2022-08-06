package com.google.firebase.installations;

import android.text.TextUtils;
import com.google.firebase.installations.k.d;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* compiled from: Utils */
class j {
    public static final long a = TimeUnit.HOURS.toSeconds(1);
    private static final Pattern b = Pattern.compile("\\AA[\\w-]{38}\\z");

    j() {
    }

    static boolean c(String str) {
        return b.matcher(str).matches();
    }

    static boolean d(String str) {
        return str.contains(":");
    }

    public long a() {
        return TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
    }

    public boolean b(d dVar) {
        if (!TextUtils.isEmpty(dVar.b()) && dVar.h() + dVar.c() >= a() + a) {
            return false;
        }
        return true;
    }
}
