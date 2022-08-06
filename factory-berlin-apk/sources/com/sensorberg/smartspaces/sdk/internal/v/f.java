package com.sensorberg.smartspaces.sdk.internal.v;

import android.os.Handler;
import android.os.HandlerThread;
import kotlin.e;
import kotlin.jvm.internal.l;

/* compiled from: TapHandler.kt */
public final class f {
    /* access modifiers changed from: private */
    public static final HandlerThread a;
    private static final e b = g.a(a.f6840h);
    public static final f c = new f();

    /* compiled from: TapHandler.kt */
    static final class a extends l implements kotlin.e0.c.a<Handler> {

        /* renamed from: h  reason: collision with root package name */
        public static final a f6840h = new a();

        a() {
            super(0);
        }

        /* renamed from: a */
        public final Handler d() {
            return new Handler(f.a.getLooper());
        }
    }

    static {
        HandlerThread handlerThread = new HandlerThread("tap-manager", 1);
        handlerThread.start();
        a = handlerThread;
    }

    private f() {
    }

    public final Handler b() {
        return (Handler) b.getValue();
    }
}
