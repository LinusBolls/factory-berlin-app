package com.google.android.gms.common;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.m0;
import com.google.android.gms.common.internal.n0;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.dynamic.b;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

abstract class s extends n0 {
    private int a;

    protected s(byte[] bArr) {
        r.a(bArr.length == 25);
        this.a = Arrays.hashCode(bArr);
    }

    protected static byte[] S0(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e2) {
            throw new AssertionError(e2);
        }
    }

    public final a c() {
        return b.S0(o());
    }

    public final int d() {
        return hashCode();
    }

    public boolean equals(Object obj) {
        a c;
        if (obj != null && (obj instanceof m0)) {
            try {
                m0 m0Var = (m0) obj;
                if (m0Var.d() != hashCode() || (c = m0Var.c()) == null) {
                    return false;
                }
                return Arrays.equals(o(), (byte[]) b.o(c));
            } catch (RemoteException e2) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
            }
        }
        return false;
    }

    public int hashCode() {
        return this.a;
    }

    /* access modifiers changed from: package-private */
    public abstract byte[] o();
}
