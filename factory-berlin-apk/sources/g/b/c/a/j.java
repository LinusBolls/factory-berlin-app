package g.b.c.a;

import com.google.crypto.tink.shaded.protobuf.i;
import com.google.crypto.tink.shaded.protobuf.q0;
import g.b.c.a.h0.v0;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: KeyTypeManager */
public abstract class j<KeyProtoT extends q0> {
    private final Class<KeyProtoT> a;
    private final Map<Class<?>, b<?, KeyProtoT>> b;
    private final Class<?> c;

    /* compiled from: KeyTypeManager */
    public static abstract class a<KeyFormatProtoT extends q0, KeyT> {
        private final Class<KeyFormatProtoT> a;

        public a(Class<KeyFormatProtoT> cls) {
            this.a = cls;
        }

        public abstract KeyT a(KeyFormatProtoT keyformatprotot);

        public final Class<KeyFormatProtoT> b() {
            return this.a;
        }

        public abstract KeyFormatProtoT c(i iVar);

        public abstract void d(KeyFormatProtoT keyformatprotot);
    }

    /* compiled from: KeyTypeManager */
    protected static abstract class b<PrimitiveT, KeyT> {
        private final Class<PrimitiveT> a;

        public b(Class<PrimitiveT> cls) {
            this.a = cls;
        }

        public abstract PrimitiveT a(KeyT keyt);

        /* access modifiers changed from: package-private */
        public final Class<PrimitiveT> b() {
            return this.a;
        }
    }

    @SafeVarargs
    protected j(Class<KeyProtoT> cls, b<?, KeyProtoT>... bVarArr) {
        this.a = cls;
        HashMap hashMap = new HashMap();
        int length = bVarArr.length;
        int i2 = 0;
        while (i2 < length) {
            b<?, KeyProtoT> bVar = bVarArr[i2];
            if (!hashMap.containsKey(bVar.b())) {
                hashMap.put(bVar.b(), bVar);
                i2++;
            } else {
                throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + bVar.b().getCanonicalName());
            }
        }
        if (bVarArr.length > 0) {
            this.c = bVarArr[0].b();
        } else {
            this.c = Void.class;
        }
        this.b = Collections.unmodifiableMap(hashMap);
    }

    /* access modifiers changed from: package-private */
    public final Class<?> a() {
        return this.c;
    }

    public final Class<KeyProtoT> b() {
        return this.a;
    }

    public abstract String c();

    public final <P> P d(KeyProtoT keyprotot, Class<P> cls) {
        b bVar = this.b.get(cls);
        if (bVar != null) {
            return bVar.a(keyprotot);
        }
        throw new IllegalArgumentException("Requested primitive class " + cls.getCanonicalName() + " not supported.");
    }

    public a<?, KeyProtoT> e() {
        throw new UnsupportedOperationException("Creating keys is not supported.");
    }

    public abstract v0.c f();

    public abstract KeyProtoT g(i iVar);

    public final Set<Class<?>> h() {
        return this.b.keySet();
    }

    public abstract void i(KeyProtoT keyprotot);
}
