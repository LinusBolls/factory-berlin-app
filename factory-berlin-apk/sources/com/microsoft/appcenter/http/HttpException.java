package com.microsoft.appcenter.http;

import android.text.TextUtils;
import java.io.IOException;

public class HttpException extends IOException {

    /* renamed from: g  reason: collision with root package name */
    private final i f4486g;

    public HttpException(i iVar) {
        super(a(iVar.c(), iVar.b()));
        this.f4486g = iVar;
    }

    private static String a(int i2, String str) {
        if (TextUtils.isEmpty(str)) {
            return String.valueOf(i2);
        }
        return i2 + " - " + str;
    }

    public i b() {
        return this.f4486g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || HttpException.class != obj.getClass()) {
            return false;
        }
        return this.f4486g.equals(((HttpException) obj).f4486g);
    }

    public int hashCode() {
        return this.f4486g.hashCode();
    }
}
