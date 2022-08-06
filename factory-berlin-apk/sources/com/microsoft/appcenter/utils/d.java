package com.microsoft.appcenter.utils;

import android.os.AsyncTask;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: AsyncTaskUtils */
public class d {
    @SafeVarargs
    public static <Params, Type extends AsyncTask<Params, ?, ?>> Type a(String str, Type type, Params... paramsArr) {
        try {
            return type.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, paramsArr);
        } catch (RejectedExecutionException e2) {
            a.j(str, "THREAD_POOL_EXECUTOR saturated, fall back on SERIAL_EXECUTOR which has an unbounded queue", e2);
            return type.executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, paramsArr);
        }
    }
}
