package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.a;
import com.google.crypto.tink.shaded.protobuf.a0;
import com.google.crypto.tink.shaded.protobuf.e;
import com.google.crypto.tink.shaded.protobuf.q0;
import com.google.crypto.tink.shaded.protobuf.s1;
import com.google.crypto.tink.shaded.protobuf.u;
import com.google.crypto.tink.shaded.protobuf.y;
import com.google.crypto.tink.shaded.protobuf.y.a;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: GeneratedMessageLite */
public abstract class y<MessageType extends y<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends a<MessageType, BuilderType> {
    private static Map<Object, y<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    protected int memoizedSerializedSize = -1;
    protected n1 unknownFields = n1.e();

    /* compiled from: GeneratedMessageLite */
    public static abstract class a<MessageType extends y<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends a.C0082a<MessageType, BuilderType> {

        /* renamed from: g  reason: collision with root package name */
        private final MessageType f3842g;

        /* renamed from: h  reason: collision with root package name */
        protected MessageType f3843h;

        /* renamed from: i  reason: collision with root package name */
        protected boolean f3844i = false;

        protected a(MessageType messagetype) {
            this.f3842g = messagetype;
            this.f3843h = (y) messagetype.s(f.NEW_MUTABLE_INSTANCE);
        }

        private void C(MessageType messagetype, MessageType messagetype2) {
            c1.a().e(messagetype).a(messagetype, messagetype2);
        }

        /* access modifiers changed from: protected */
        public BuilderType A(MessageType messagetype) {
            B(messagetype);
            return this;
        }

        public BuilderType B(MessageType messagetype) {
            x();
            C(this.f3843h, messagetype);
            return this;
        }

        public final boolean isInitialized() {
            return y.z(this.f3843h, false);
        }

        /* access modifiers changed from: protected */
        public /* bridge */ /* synthetic */ a.C0082a r(a aVar) {
            A((y) aVar);
            return this;
        }

        /* renamed from: u */
        public final MessageType k() {
            MessageType v = L();
            if (v.isInitialized()) {
                return v;
            }
            throw a.C0082a.t(v);
        }

        /* renamed from: v */
        public MessageType L() {
            if (this.f3844i) {
                return this.f3843h;
            }
            this.f3843h.A();
            this.f3844i = true;
            return this.f3843h;
        }

        /* renamed from: w */
        public BuilderType clone() {
            BuilderType C = d().h();
            C.B(L());
            return C;
        }

        /* access modifiers changed from: protected */
        public final void x() {
            if (this.f3844i) {
                y();
                this.f3844i = false;
            }
        }

        /* access modifiers changed from: protected */
        public void y() {
            MessageType messagetype = (y) this.f3843h.s(f.NEW_MUTABLE_INSTANCE);
            C(messagetype, this.f3843h);
            this.f3843h = messagetype;
        }

        /* renamed from: z */
        public MessageType d() {
            return this.f3842g;
        }
    }

    /* compiled from: GeneratedMessageLite */
    protected static class b<T extends y<T, ?>> extends b<T> {
        private final T a;

        public b(T t) {
            this.a = t;
        }

        /* renamed from: g */
        public T b(j jVar, p pVar) {
            return y.H(this.a, jVar, pVar);
        }
    }

    /* compiled from: GeneratedMessageLite */
    public static abstract class c<MessageType extends c<MessageType, BuilderType>, BuilderType extends Object<MessageType, BuilderType>> extends y<MessageType, BuilderType> implements Object<MessageType, BuilderType> {
        protected u<d> extensions = u.g();

        /* access modifiers changed from: package-private */
        public u<d> M() {
            if (this.extensions.n()) {
                this.extensions = this.extensions.clone();
            }
            return this.extensions;
        }
    }

    /* compiled from: GeneratedMessageLite */
    static final class d implements u.b<d> {

        /* renamed from: g  reason: collision with root package name */
        final a0.d<?> f3845g;

        /* renamed from: h  reason: collision with root package name */
        final int f3846h;

        /* renamed from: i  reason: collision with root package name */
        final s1.b f3847i;

        /* renamed from: j  reason: collision with root package name */
        final boolean f3848j;

        /* renamed from: k  reason: collision with root package name */
        final boolean f3849k;

        public q0.a E(q0.a aVar, q0 q0Var) {
            a aVar2 = (a) aVar;
            aVar2.B((y) q0Var);
            return aVar2;
        }

        public s1.c H() {
            return this.f3847i.a();
        }

        public boolean J() {
            return this.f3849k;
        }

        /* renamed from: a */
        public int compareTo(d dVar) {
            return this.f3846h - dVar.f3846h;
        }

        public a0.d<?> f() {
            return this.f3845g;
        }

        public int m() {
            return this.f3846h;
        }

        public boolean s() {
            return this.f3848j;
        }

        public s1.b u() {
            return this.f3847i;
        }
    }

    /* compiled from: GeneratedMessageLite */
    public static class e<ContainingType extends q0, Type> extends n<ContainingType, Type> {
        final q0 a;
        final d b;

        public s1.b a() {
            return this.b.u();
        }

        public q0 b() {
            return this.a;
        }

        public int c() {
            return this.b.m();
        }

        public boolean d() {
            return this.b.f3848j;
        }
    }

    /* compiled from: GeneratedMessageLite */
    public enum f {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    protected static <E> a0.i<E> B(a0.i<E> iVar) {
        int size = iVar.size();
        return iVar.w(size == 0 ? 10 : size * 2);
    }

    protected static Object D(q0 q0Var, String str, Object[] objArr) {
        return new e1(q0Var, str, objArr);
    }

    protected static <T extends y<T, ?>> T E(T t, i iVar, p pVar) {
        T G = G(t, iVar, pVar);
        o(G);
        return G;
    }

    protected static <T extends y<T, ?>> T F(T t, byte[] bArr, p pVar) {
        T I = I(t, bArr, 0, bArr.length, pVar);
        o(I);
        return I;
    }

    private static <T extends y<T, ?>> T G(T t, i iVar, p pVar) {
        T H;
        try {
            j q = iVar.q();
            H = H(t, q, pVar);
            q.a(0);
            return H;
        } catch (InvalidProtocolBufferException e2) {
            e2.i(H);
            throw e2;
        } catch (InvalidProtocolBufferException e3) {
            throw e3;
        }
    }

    static <T extends y<T, ?>> T H(T t, j jVar, p pVar) {
        T t2 = (y) t.s(f.NEW_MUTABLE_INSTANCE);
        try {
            g1 e2 = c1.a().e(t2);
            e2.d(t2, k.S(jVar), pVar);
            e2.e(t2);
            return t2;
        } catch (IOException e3) {
            if (e3.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e3.getCause());
            }
            InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e3.getMessage());
            invalidProtocolBufferException.i(t2);
            throw invalidProtocolBufferException;
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e4.getCause());
            }
            throw e4;
        }
    }

    static <T extends y<T, ?>> T I(T t, byte[] bArr, int i2, int i3, p pVar) {
        T t2 = (y) t.s(f.NEW_MUTABLE_INSTANCE);
        try {
            g1 e2 = c1.a().e(t2);
            e2.b(t2, bArr, i2, i2 + i3, new e.b(pVar));
            e2.e(t2);
            if (t2.memoizedHashCode == 0) {
                return t2;
            }
            throw new RuntimeException();
        } catch (IOException e3) {
            if (e3.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e3.getCause());
            }
            InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e3.getMessage());
            invalidProtocolBufferException.i(t2);
            throw invalidProtocolBufferException;
        } catch (IndexOutOfBoundsException unused) {
            InvalidProtocolBufferException j2 = InvalidProtocolBufferException.j();
            j2.i(t2);
            throw j2;
        }
    }

    protected static <T extends y<?, ?>> void J(Class<T> cls, T t) {
        defaultInstanceMap.put(cls, t);
    }

    private static <T extends y<T, ?>> T o(T t) {
        if (t == null || t.isInitialized()) {
            return t;
        }
        InvalidProtocolBufferException a2 = t.j().a();
        a2.i(t);
        throw a2;
    }

    protected static <E> a0.i<E> v() {
        return d1.e();
    }

    static <T extends y<?, ?>> T w(Class<T> cls) {
        T t = (y) defaultInstanceMap.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (y) defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException("Class initialization cannot fail.", e2);
            }
        }
        if (t == null) {
            t = ((y) q1.i(cls)).d();
            if (t != null) {
                defaultInstanceMap.put(cls, t);
            } else {
                throw new IllegalStateException();
            }
        }
        return t;
    }

    static Object y(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e2);
        } catch (InvocationTargetException e3) {
            Throwable cause = e3.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    protected static final <T extends y<T, ?>> boolean z(T t, boolean z) {
        byte byteValue = ((Byte) t.s(f.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean f2 = c1.a().e(t).f(t);
        if (z) {
            t.t(f.SET_MEMOIZED_IS_INITIALIZED, f2 ? t : null);
        }
        return f2;
    }

    /* access modifiers changed from: protected */
    public void A() {
        c1.a().e(this).e(this);
    }

    /* renamed from: C */
    public final BuilderType h() {
        return (a) s(f.NEW_BUILDER);
    }

    /* renamed from: K */
    public final BuilderType e() {
        BuilderType buildertype = (a) s(f.NEW_BUILDER);
        buildertype.B(this);
        return buildertype;
    }

    /* access modifiers changed from: package-private */
    public int a() {
        return this.memoizedSerializedSize;
    }

    public int c() {
        if (this.memoizedSerializedSize == -1) {
            this.memoizedSerializedSize = c1.a().e(this).h(this);
        }
        return this.memoizedSerializedSize;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!d().getClass().isInstance(obj)) {
            return false;
        }
        return c1.a().e(this).g(this, (y) obj);
    }

    public void g(CodedOutputStream codedOutputStream) {
        c1.a().e(this).c(this, l.P(codedOutputStream));
    }

    public int hashCode() {
        int i2 = this.memoizedHashCode;
        if (i2 != 0) {
            return i2;
        }
        int j2 = c1.a().e(this).j(this);
        this.memoizedHashCode = j2;
        return j2;
    }

    public final boolean isInitialized() {
        return z(this, true);
    }

    /* access modifiers changed from: package-private */
    public void l(int i2) {
        this.memoizedSerializedSize = i2;
    }

    /* access modifiers changed from: package-private */
    public Object n() {
        return s(f.BUILD_MESSAGE_INFO);
    }

    public final z0<MessageType> p() {
        return (z0) s(f.GET_PARSER);
    }

    /* access modifiers changed from: protected */
    public final <MessageType extends y<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> BuilderType r() {
        return (a) s(f.NEW_BUILDER);
    }

    /* access modifiers changed from: protected */
    public Object s(f fVar) {
        return u(fVar, (Object) null, (Object) null);
    }

    /* access modifiers changed from: protected */
    public Object t(f fVar, Object obj) {
        return u(fVar, obj, (Object) null);
    }

    public String toString() {
        return s0.e(this, super.toString());
    }

    /* access modifiers changed from: protected */
    public abstract Object u(f fVar, Object obj, Object obj2);

    /* renamed from: x */
    public final MessageType d() {
        return (y) s(f.GET_DEFAULT_INSTANCE);
    }
}
