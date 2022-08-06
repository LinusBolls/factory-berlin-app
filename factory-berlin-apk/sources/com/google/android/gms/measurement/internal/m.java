package com.google.android.gms.measurement.internal;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import androidx.core.content.a;
import java.io.IOException;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
public final class m extends d6 {
    private long c;

    /* renamed from: d  reason: collision with root package name */
    private String f2964d;

    /* renamed from: e  reason: collision with root package name */
    private Boolean f2965e;

    /* renamed from: f  reason: collision with root package name */
    private AccountManager f2966f;

    /* renamed from: g  reason: collision with root package name */
    private Boolean f2967g;

    /* renamed from: h  reason: collision with root package name */
    private long f2968h;

    m(h5 h5Var) {
        super(h5Var);
    }

    /* access modifiers changed from: protected */
    public final boolean r() {
        Calendar instance = Calendar.getInstance();
        this.c = TimeUnit.MINUTES.convert((long) (instance.get(15) + instance.get(16)), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String lowerCase = locale.getLanguage().toLowerCase(Locale.ENGLISH);
        String lowerCase2 = locale.getCountry().toLowerCase(Locale.ENGLISH);
        StringBuilder sb = new StringBuilder(String.valueOf(lowerCase).length() + 1 + String.valueOf(lowerCase2).length());
        sb.append(lowerCase);
        sb.append("-");
        sb.append(lowerCase2);
        this.f2964d = sb.toString();
        return false;
    }

    public final boolean t(Context context) {
        if (this.f2965e == null) {
            this.f2965e = Boolean.FALSE;
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null) {
                    packageManager.getPackageInfo("com.google.android.gms", 128);
                    this.f2965e = Boolean.TRUE;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return this.f2965e.booleanValue();
    }

    public final long u() {
        o();
        return this.c;
    }

    public final String v() {
        o();
        return this.f2964d;
    }

    /* access modifiers changed from: package-private */
    public final long w() {
        c();
        return this.f2968h;
    }

    /* access modifiers changed from: package-private */
    public final void x() {
        c();
        this.f2967g = null;
        this.f2968h = 0;
    }

    /* access modifiers changed from: package-private */
    public final boolean y() {
        c();
        long b = f().b();
        if (b - this.f2968h > 86400000) {
            this.f2967g = null;
        }
        Boolean bool = this.f2967g;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (a.a(j(), "android.permission.GET_ACCOUNTS") != 0) {
            i().I().a("Permission error checking for dasher/unicorn accounts");
            this.f2968h = b;
            this.f2967g = Boolean.FALSE;
            return false;
        }
        if (this.f2966f == null) {
            this.f2966f = AccountManager.get(j());
        }
        try {
            Account[] result = this.f2966f.getAccountsByTypeAndFeatures("com.google", new String[]{"service_HOSTED"}, (AccountManagerCallback) null, (Handler) null).getResult();
            if (result == null || result.length <= 0) {
                Account[] result2 = this.f2966f.getAccountsByTypeAndFeatures("com.google", new String[]{"service_uca"}, (AccountManagerCallback) null, (Handler) null).getResult();
                if (result2 != null && result2.length > 0) {
                    this.f2967g = Boolean.TRUE;
                    this.f2968h = b;
                    return true;
                }
                this.f2968h = b;
                this.f2967g = Boolean.FALSE;
                return false;
            }
            this.f2967g = Boolean.TRUE;
            this.f2968h = b;
            return true;
        } catch (AuthenticatorException | OperationCanceledException | IOException e2) {
            i().F().b("Exception checking account types", e2);
        }
    }
}
