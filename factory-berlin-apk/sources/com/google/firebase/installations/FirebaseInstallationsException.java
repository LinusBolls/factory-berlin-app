package com.google.firebase.installations;

import com.google.firebase.FirebaseException;

public class FirebaseInstallationsException extends FirebaseException {

    public enum a {
        BAD_CONFIG,
        UNAVAILABLE
    }

    public FirebaseInstallationsException(a aVar) {
    }

    public FirebaseInstallationsException(String str, a aVar) {
        super(str);
    }
}
