package g.b.c.a;

import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.i;
import com.google.crypto.tink.shaded.protobuf.q0;
import g.b.c.a.h0.v0;
import g.b.c.a.j;
import java.security.GeneralSecurityException;

/* compiled from: KeyManagerImpl */
public class h<PrimitiveT, KeyProtoT extends q0> implements g<PrimitiveT> {
    private final j<KeyProtoT> a;
    private final Class<PrimitiveT> b;

    /* compiled from: KeyManagerImpl */
    private static class a<KeyFormatProtoT extends q0, KeyProtoT extends q0> {
        final j.a<KeyFormatProtoT, KeyProtoT> a;

        a(j.a<KeyFormatProtoT, KeyProtoT> aVar) {
            this.a = aVar;
        }

        private KeyProtoT b(KeyFormatProtoT keyformatprotot) {
            this.a.d(keyformatprotot);
            return (q0) this.a.a(keyformatprotot);
        }

        /* access modifiers changed from: package-private */
        public KeyProtoT a(i iVar) {
            return b(this.a.c(iVar));
        }
    }

    public h(j<KeyProtoT> jVar, Class<PrimitiveT> cls) {
        if (jVar.h().contains(cls) || Void.class.equals(cls)) {
            this.a = jVar;
            this.b = cls;
            return;
        }
        throw new IllegalArgumentException(String.format("Given internalKeyMananger %s does not support primitive class %s", new Object[]{jVar.toString(), cls.getName()}));
    }

    private a<?, KeyProtoT> f() {
        return new a<>(this.a.e());
    }

    private PrimitiveT g(KeyProtoT keyprotot) {
        if (!Void.class.equals(this.b)) {
            this.a.i(keyprotot);
            return this.a.d(keyprotot, this.b);
        }
        throw new GeneralSecurityException("Cannot create a primitive for Void");
    }

    public final boolean a(String str) {
        return str.equals(e());
    }

    public final PrimitiveT b(i iVar) {
        try {
            return g(this.a.g(iVar));
        } catch (InvalidProtocolBufferException e2) {
            throw new GeneralSecurityException("Failures parsing proto of type " + this.a.b().getName(), e2);
        }
    }

    public final q0 c(i iVar) {
        try {
            return f().a(iVar);
        } catch (InvalidProtocolBufferException e2) {
            throw new GeneralSecurityException("Failures parsing proto of type " + this.a.e().b().getName(), e2);
        }
    }

    public final v0 d(i iVar) {
        try {
            q0 a2 = f().a(iVar);
            v0.b U = v0.U();
            U.E(e());
            U.F(a2.m());
            U.D(this.a.f());
            return (v0) U.k();
        } catch (InvalidProtocolBufferException e2) {
            throw new GeneralSecurityException("Unexpected proto", e2);
        }
    }

    public final String e() {
        return this.a.c();
    }
}
