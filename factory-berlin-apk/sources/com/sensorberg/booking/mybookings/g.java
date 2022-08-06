package com.sensorberg.booking.mybookings;

import android.content.Context;
import android.graphics.drawable.Drawable;
import g.e.b.d;
import kotlin.jvm.internal.k;

/* compiled from: SwipeToDeleteCallback.kt */
abstract class g {

    /* compiled from: SwipeToDeleteCallback.kt */
    public static final class a extends g {
        private final Drawable a;
        private final int b;
        private final int c = b().getIntrinsicWidth();

        /* renamed from: d  reason: collision with root package name */
        private final int f4861d = b().getIntrinsicHeight();

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Context context) {
            super((DefaultConstructorMarker) null);
            k.e(context, "context");
            Drawable f2 = androidx.core.content.a.f(context, d.icon_finish);
            k.c(f2);
            this.a = f2;
            this.b = androidx.core.content.a.c(context, g.e.b.b.interaction);
        }

        public int a() {
            return this.b;
        }

        public Drawable b() {
            return this.a;
        }

        public int c() {
            return this.f4861d;
        }

        public int d() {
            return this.c;
        }
    }

    /* compiled from: SwipeToDeleteCallback.kt */
    public static final class b extends g {
        private final Drawable a;
        private final int b;
        private final int c = b().getIntrinsicWidth();

        /* renamed from: d  reason: collision with root package name */
        private final int f4862d = b().getIntrinsicHeight();

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(Context context) {
            super((DefaultConstructorMarker) null);
            k.e(context, "context");
            Drawable f2 = androidx.core.content.a.f(context, d.icon_trash);
            k.c(f2);
            this.a = f2;
            this.b = androidx.core.content.a.c(context, g.e.b.b.error);
        }

        public int a() {
            return this.b;
        }

        public Drawable b() {
            return this.a;
        }

        public int c() {
            return this.f4862d;
        }

        public int d() {
            return this.c;
        }
    }

    private g() {
    }

    public abstract int a();

    public abstract Drawable b();

    public abstract int c();

    public abstract int d();

    public /* synthetic */ g(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
