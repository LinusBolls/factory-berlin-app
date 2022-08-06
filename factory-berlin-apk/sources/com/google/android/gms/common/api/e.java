package com.google.android.gms.common.api;

import com.google.android.gms.common.api.g;
import java.util.concurrent.TimeUnit;

public abstract class e<R extends g> {

    public interface a {
        void a(Status status);
    }

    public abstract void c(a aVar);

    public abstract R d(long j2, TimeUnit timeUnit);
}
