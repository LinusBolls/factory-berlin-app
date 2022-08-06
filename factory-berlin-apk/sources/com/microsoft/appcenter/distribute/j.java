package com.microsoft.appcenter.distribute;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.AsyncTask;
import com.microsoft.appcenter.utils.a;
import com.microsoft.appcenter.utils.o.d;

/* compiled from: ResumeFromBackgroundTask */
class j extends AsyncTask<Void, Void, Void> {
    @SuppressLint({"StaticFieldLeak"})
    private final Context a;
    private final long b;

    j(Context context, long j2) {
        this.a = context;
        this.b = j2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Void doInBackground(Void... voidArr) {
        Distribute instance = Distribute.getInstance();
        instance.u0(this.a);
        a.a("AppCenterDistribute", "Check download id=" + this.b);
        long e2 = d.e("Distribute.download_id", -1);
        if (e2 == -1 || e2 != this.b) {
            a.a("AppCenterDistribute", "Ignoring download identifier we didn't expect, id=" + this.b);
            return null;
        }
        instance.g0();
        return null;
    }
}
