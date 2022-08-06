package com.sensorberg.smartworkspace.app.utils;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import kotlin.e;
import kotlin.jvm.internal.l;

/* compiled from: Threading.kt */
public final class p {
    private static final Handler a = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */
    public static final HandlerThread b;
    private static final e c = g.a(a.f8018h);

    /* renamed from: d  reason: collision with root package name */
    public static final p f8017d = new p();

    /* compiled from: Threading.kt */
    static final class a extends l implements kotlin.e0.c.a<Handler> {

        /* renamed from: h  reason: collision with root package name */
        public static final a f8018h = new a();

        a() {
            super(0);
        }

        /* renamed from: a */
        public final Handler d() {
            return new Handler(p.b.getLooper());
        }
    }

    static {
        HandlerThread handlerThread = new HandlerThread("background");
        b = handlerThread;
        handlerThread.start();
    }

    private p() {
    }

    public final Handler b() {
        return (Handler) c.getValue();
    }

    public final Handler c() {
        return a;
    }
}
