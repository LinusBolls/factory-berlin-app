package com.google.android.gms.common.api;

import com.google.android.gms.common.d;

public final class UnsupportedApiCallException extends UnsupportedOperationException {

    /* renamed from: g  reason: collision with root package name */
    private final d f2033g;

    public UnsupportedApiCallException(d dVar) {
        this.f2033g = dVar;
    }

    public final String getMessage() {
        String valueOf = String.valueOf(this.f2033g);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 8);
        sb.append("Missing ");
        sb.append(valueOf);
        return sb.toString();
    }
}
