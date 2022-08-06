package com.sensorberg.smartworkspace.app.utils;

import android.os.Vibrator;
import kotlin.jvm.internal.k;

/* compiled from: Feedback.kt */
public final class f {
    private final Vibrator a;

    /* compiled from: Feedback.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new a((DefaultConstructorMarker) null);
    }

    public f(Vibrator vibrator) {
        k.e(vibrator, "vibrator");
        this.a = vibrator;
    }

    private final void b(long[] jArr) {
        if (this.a.hasVibrator()) {
            this.a.vibrate(jArr, -1);
        }
    }

    public final void a(long j2) {
        b(new long[]{0, j2});
    }
}
