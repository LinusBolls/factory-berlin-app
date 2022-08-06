package com.google.firebase.crashlytics.d.h;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.google.android.gms.tasks.g;
import com.google.firebase.crashlytics.d.b;
import com.google.firebase.installations.e;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;

/* compiled from: IdManager */
public class x implements y {

    /* renamed from: f  reason: collision with root package name */
    private static final Pattern f3985f = Pattern.compile("[^\\p{Alnum}]");

    /* renamed from: g  reason: collision with root package name */
    private static final String f3986g = Pattern.quote("/");
    private final z a;
    private final Context b;
    private final String c;

    /* renamed from: d  reason: collision with root package name */
    private final e f3987d;

    /* renamed from: e  reason: collision with root package name */
    private String f3988e;

    public x(Context context, String str, e eVar) {
        if (context == null) {
            throw new IllegalArgumentException("appContext must not be null");
        } else if (str != null) {
            this.b = context;
            this.c = str;
            this.f3987d = eVar;
            this.a = new z();
        } else {
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
    }

    private synchronized String b(String str, SharedPreferences sharedPreferences) {
        String c2;
        c2 = c(UUID.randomUUID().toString());
        b f2 = b.f();
        f2.b("Created new Crashlytics IID: " + c2);
        sharedPreferences.edit().putString("crashlytics.installation.id", c2).putString("firebase.installation.id", str).apply();
        return c2;
    }

    private static String c(String str) {
        if (str == null) {
            return null;
        }
        return f3985f.matcher(str).replaceAll("").toLowerCase(Locale.US);
    }

    private synchronized void i(String str, String str2, SharedPreferences sharedPreferences, SharedPreferences sharedPreferences2) {
        b f2 = b.f();
        f2.b("Migrating legacy Crashlytics IID: " + str);
        sharedPreferences.edit().putString("crashlytics.installation.id", str).putString("firebase.installation.id", str2).apply();
        sharedPreferences2.edit().remove("crashlytics.installation.id").remove("crashlytics.advertising.id").apply();
    }

    private String j(String str) {
        return str.replaceAll(f3986g, "");
    }

    public synchronized String a() {
        String str;
        if (this.f3988e != null) {
            return this.f3988e;
        }
        SharedPreferences t = h.t(this.b);
        g<String> id = this.f3987d.getId();
        String string = t.getString("firebase.installation.id", (String) null);
        try {
            str = (String) k0.a(id);
        } catch (Exception e2) {
            b.f().c("Failed to retrieve installation id", e2);
            str = string != null ? string : null;
        }
        if (string == null) {
            SharedPreferences o = h.o(this.b);
            String string2 = o.getString("crashlytics.installation.id", (String) null);
            b f2 = b.f();
            f2.b("No cached FID; legacy id is " + string2);
            if (string2 == null) {
                this.f3988e = b(str, t);
            } else {
                this.f3988e = string2;
                i(string2, str, t, o);
            }
            return this.f3988e;
        }
        if (string.equals(str)) {
            this.f3988e = t.getString("crashlytics.installation.id", (String) null);
            b f3 = b.f();
            f3.b("Found matching FID, using Crashlytics IID: " + this.f3988e);
            if (this.f3988e == null) {
                this.f3988e = b(str, t);
            }
        } else {
            this.f3988e = b(str, t);
        }
        return this.f3988e;
    }

    public String d() {
        return this.c;
    }

    public String e() {
        return this.a.a(this.b);
    }

    public String f() {
        return String.format(Locale.US, "%s/%s", new Object[]{j(Build.MANUFACTURER), j(Build.MODEL)});
    }

    public String g() {
        return j(Build.VERSION.INCREMENTAL);
    }

    public String h() {
        return j(Build.VERSION.RELEASE);
    }
}
