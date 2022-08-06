package com.google.crypto.tink.shaded.protobuf;

public class UninitializedMessageException extends RuntimeException {
    public UninitializedMessageException(q0 q0Var) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public InvalidProtocolBufferException a() {
        return new InvalidProtocolBufferException(getMessage());
    }
}
