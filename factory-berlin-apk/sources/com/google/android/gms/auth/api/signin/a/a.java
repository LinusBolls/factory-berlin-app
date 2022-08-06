package com.google.android.gms.auth.api.signin.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.r;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

public class a {
    private static final Lock c = new ReentrantLock();

    /* renamed from: d  reason: collision with root package name */
    private static a f2019d;
    private final Lock a = new ReentrantLock();
    private final SharedPreferences b;

    private a(Context context) {
        this.b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static a a(Context context) {
        r.k(context);
        c.lock();
        try {
            if (f2019d == null) {
                f2019d = new a(context.getApplicationContext());
            }
            return f2019d;
        } finally {
            c.unlock();
        }
    }

    private static String c(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        return sb.toString();
    }

    private final GoogleSignInAccount d(String str) {
        String e2;
        if (!TextUtils.isEmpty(str) && (e2 = e(c("googleSignInAccount", str))) != null) {
            try {
                return GoogleSignInAccount.V(e2);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    private final String e(String str) {
        this.a.lock();
        try {
            return this.b.getString(str, (String) null);
        } finally {
            this.a.unlock();
        }
    }

    public GoogleSignInAccount b() {
        return d(e("defaultGoogleSignInAccount"));
    }
}
