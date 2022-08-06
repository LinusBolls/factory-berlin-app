package com.google.firebase;

import com.google.android.gms.common.internal.r;

public class FirebaseException extends Exception {
    @Deprecated
    protected FirebaseException() {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FirebaseException(String str) {
        super(str);
        r.h(str, "Detail message must not be empty");
    }
}
