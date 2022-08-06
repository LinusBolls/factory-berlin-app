package androidx.work.impl.utils;

import androidx.work.WorkerParameters;
import androidx.work.impl.h;

/* compiled from: StartWorkRunnable */
public class g implements Runnable {

    /* renamed from: g  reason: collision with root package name */
    private h f1758g;

    /* renamed from: h  reason: collision with root package name */
    private String f1759h;

    /* renamed from: i  reason: collision with root package name */
    private WorkerParameters.a f1760i;

    public g(h hVar, String str, WorkerParameters.a aVar) {
        this.f1758g = hVar;
        this.f1759h = str;
        this.f1760i = aVar;
    }

    public void run() {
        this.f1758g.s().g(this.f1759h, this.f1760i);
    }
}
