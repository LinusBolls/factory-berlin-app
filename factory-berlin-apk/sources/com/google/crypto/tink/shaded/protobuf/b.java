package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.q0;

/* compiled from: AbstractParser */
public abstract class b<MessageType extends q0> implements z0<MessageType> {
    static {
        p.b();
    }

    private MessageType c(MessageType messagetype) {
        if (messagetype == null || messagetype.isInitialized()) {
            return messagetype;
        }
        InvalidProtocolBufferException a = d(messagetype).a();
        a.i(messagetype);
        throw a;
    }

    private UninitializedMessageException d(MessageType messagetype) {
        if (messagetype instanceof a) {
            return ((a) messagetype).j();
        }
        return new UninitializedMessageException(messagetype);
    }

    /* renamed from: e */
    public MessageType a(i iVar, p pVar) {
        MessageType f2 = f(iVar, pVar);
        c(f2);
        return f2;
    }

    public MessageType f(i iVar, p pVar) {
        MessageType messagetype;
        try {
            j q = iVar.q();
            messagetype = (q0) b(q, pVar);
            q.a(0);
            return messagetype;
        } catch (InvalidProtocolBufferException e2) {
            e2.i(messagetype);
            throw e2;
        } catch (InvalidProtocolBufferException e3) {
            throw e3;
        }
    }
}
