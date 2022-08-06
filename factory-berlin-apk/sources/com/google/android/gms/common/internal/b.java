package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.api.Status;

public class b {
    public static ApiException a(Status status) {
        if (status.o()) {
            return new ResolvableApiException(status);
        }
        return new ApiException(status);
    }
}
