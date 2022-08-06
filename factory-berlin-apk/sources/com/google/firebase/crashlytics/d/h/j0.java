package com.google.firebase.crashlytics.d.h;

import com.google.android.gms.tasks.a;
import com.google.android.gms.tasks.g;
import java.util.concurrent.CountDownLatch;

/* compiled from: Utils */
final /* synthetic */ class j0 implements a {
    private final CountDownLatch a;

    private j0(CountDownLatch countDownLatch) {
        this.a = countDownLatch;
    }

    public static a b(CountDownLatch countDownLatch) {
        return new j0(countDownLatch);
    }

    public Object a(g gVar) {
        return this.a.countDown();
    }
}
