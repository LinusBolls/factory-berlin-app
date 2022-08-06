package com.sensorberg.encryptor;

import java.security.PrivateKey;
import java.security.PublicKey;
import javax.crypto.SecretKey;
import n.a.a;

/* compiled from: MasterKey.kt */
public final class k {
    private final String a;
    private final String b;
    private final e c;

    public k(String str, String str2, e eVar) {
        kotlin.jvm.internal.k.f(str, "alias");
        kotlin.jvm.internal.k.f(str2, "keyAlias");
        kotlin.jvm.internal.k.f(eVar, "dao");
        this.a = str;
        this.b = str2;
        this.c = eVar;
    }

    public final SecretKey a(PublicKey publicKey) {
        kotlin.jvm.internal.k.f(publicKey, "publicKey");
        a.j(this.a + ". Generating new master key", new Object[0]);
        if (this.c.a(this.b) == null) {
            SecretKey c2 = m.f5112i.c();
            this.c.b(new c(this.b, m.f5112i.g(c2, publicKey), "not_used"));
            a.a(this.a + ". Successfully generated MasterKey", new Object[0]);
            return c2;
        }
        throw new IllegalStateException("Database already contains a MasterKey");
    }

    public final SecretKey b(PrivateKey privateKey) {
        kotlin.jvm.internal.k.f(privateKey, "privateKey");
        a.j(this.a + ". Restoring master key", new Object[0]);
        c a2 = this.c.a(this.b);
        if (a2 != null) {
            SecretKey f2 = m.f5112i.f(a2.c(), privateKey);
            a.a(this.a + ". Successfully restored MasterKey", new Object[0]);
            return f2;
        }
        throw new IllegalStateException("Database does not contain a MasterKey");
    }
}
