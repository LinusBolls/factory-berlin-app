package com.sensorberg.encryptor;

import android.util.Base64;
import kotlin.jvm.internal.k;

/* compiled from: Storage.kt */
public final class c {
    private String a;
    private String b;
    private String c;

    public c() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    public c(String str, String str2, String str3) {
        k.f(str, "alias");
        k.f(str2, "data");
        k.f(str3, "iv");
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        byte[] decode = Base64.decode(this.b, 0);
        k.b(decode, "bytes");
        String encodeToString = Base64.encodeToString(i.h(decode, 0, decode.length - 16), 0);
        k.b(encodeToString, "Base64.encodeToString(text, Base64.DEFAULT)");
        return encodeToString;
    }

    public final String c() {
        return this.b;
    }

    public final String d() {
        return this.c;
    }

    public final String e() {
        byte[] decode = Base64.decode(this.b, 0);
        k.b(decode, "bytes");
        String encodeToString = Base64.encodeToString(i.h(decode, decode.length - 16, decode.length), 0);
        k.b(encodeToString, "Base64.encodeToString(tag, Base64.DEFAULT)");
        return encodeToString;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return k.a(this.a, cVar.a) && k.a(this.b, cVar.b) && k.a(this.c, cVar.c);
    }

    public int hashCode() {
        String str = this.a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.c;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return hashCode2 + i2;
    }

    public String toString() {
        return "EncryptedMessage(alias=" + this.a + ", data=" + this.b + ", iv=" + this.c + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(String str, String str2, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3);
    }
}
