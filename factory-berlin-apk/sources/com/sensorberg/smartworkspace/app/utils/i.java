package com.sensorberg.smartworkspace.app.utils;

import android.content.SharedPreferences;
import androidx.lifecycle.f0;
import androidx.lifecycle.v;
import g.e.n.g.s;
import g.e.n.g.y;
import kotlin.jvm.internal.k;

/* compiled from: LoginTracker.kt */
public class i {
    /* access modifiers changed from: private */
    public final c a;

    /* compiled from: LoginTracker.kt */
    static final class a<T> implements f0<y.a> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ i f8007g;

        a(i iVar) {
            this.f8007g = iVar;
        }

        /* renamed from: a */
        public final void k(y.a aVar) {
            if ((aVar instanceof y.a.d) && this.f8007g.b() == 0) {
                this.f8007g.a.a(g.e.h.b.c.b.c());
            } else if ((aVar instanceof y.a.b) || (aVar instanceof y.a.c)) {
                this.f8007g.a.a(0);
            }
        }
    }

    /* compiled from: LoginTracker.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: LoginTracker.kt */
    public interface c {
        void a(long j2);

        long get();
    }

    /* compiled from: LoginTracker.kt */
    public static final class d implements c {
        private final SharedPreferences a;

        public d(l lVar) {
            k.e(lVar, "sharedPreferenceProvider");
            this.a = lVar.a("login_tracker", false);
        }

        public void a(long j2) {
            this.a.edit().putLong("app.utils.LoginTracker.key", j2).apply();
        }

        public long get() {
            return this.a.getLong("app.utils.LoginTracker.key", 0);
        }
    }

    static {
        new b((DefaultConstructorMarker) null);
    }

    public i(s sVar, v vVar, c cVar) {
        k.e(sVar, "sdk");
        k.e(vVar, "lifecycleOwner");
        k.e(cVar, "loggedStorage");
        this.a = cVar;
        sVar.f().getStatusLiveData().o(vVar, new a(this));
    }

    public final long b() {
        return this.a.get();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public i(s sVar, v vVar, l lVar) {
        this(sVar, vVar, (c) new d(lVar));
        k.e(sVar, "sdk");
        k.e(vVar, "lifecycleOwner");
        k.e(lVar, "sharedPreferenceProvider");
    }
}
