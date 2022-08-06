package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.a;
import com.google.crypto.tink.shaded.protobuf.a.C0082a;
import com.google.crypto.tink.shaded.protobuf.i;
import com.google.crypto.tink.shaded.protobuf.q0;
import java.io.IOException;

/* compiled from: AbstractMessageLite */
public abstract class a<MessageType extends a<MessageType, BuilderType>, BuilderType extends C0082a<MessageType, BuilderType>> implements q0 {
    protected int memoizedHashCode = 0;

    /* renamed from: com.google.crypto.tink.shaded.protobuf.a$a  reason: collision with other inner class name */
    /* compiled from: AbstractMessageLite */
    public static abstract class C0082a<MessageType extends a<MessageType, BuilderType>, BuilderType extends C0082a<MessageType, BuilderType>> implements q0.a {
        protected static UninitializedMessageException t(q0 q0Var) {
            return new UninitializedMessageException(q0Var);
        }

        public /* bridge */ /* synthetic */ q0.a q(q0 q0Var) {
            s(q0Var);
            return this;
        }

        /* access modifiers changed from: protected */
        public abstract BuilderType r(MessageType messagetype);

        public BuilderType s(q0 q0Var) {
            if (d().getClass().isInstance(q0Var)) {
                r((a) q0Var);
                return this;
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
    }

    private String i(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    /* access modifiers changed from: package-private */
    public int a() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public int b(g1 g1Var) {
        int a = a();
        if (a != -1) {
            return a;
        }
        int h2 = g1Var.h(this);
        l(h2);
        return h2;
    }

    public byte[] f() {
        try {
            byte[] bArr = new byte[c()];
            CodedOutputStream d0 = CodedOutputStream.d0(bArr);
            g(d0);
            d0.c();
            return bArr;
        } catch (IOException e2) {
            throw new RuntimeException(i("byte array"), e2);
        }
    }

    /* access modifiers changed from: package-private */
    public UninitializedMessageException j() {
        return new UninitializedMessageException(this);
    }

    /* access modifiers changed from: package-private */
    public void l(int i2) {
        throw new UnsupportedOperationException();
    }

    public i m() {
        try {
            i.g o = i.o(c());
            g(o.b());
            return o.a();
        } catch (IOException e2) {
            throw new RuntimeException(i("ByteString"), e2);
        }
    }
}
