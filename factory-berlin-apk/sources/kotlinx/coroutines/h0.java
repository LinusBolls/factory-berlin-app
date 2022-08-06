package kotlinx.coroutines;

import kotlin.c0.g;
import kotlin.jvm.internal.k;

/* compiled from: CoroutineName.kt */
public final class h0 extends kotlin.c0.a {

    /* renamed from: h  reason: collision with root package name */
    public static final a f10987h = new a((DefaultConstructorMarker) null);

    /* renamed from: g  reason: collision with root package name */
    private final String f10988g;

    /* compiled from: CoroutineName.kt */
    public static final class a implements g.c<h0> {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof h0) && k.a(this.f10988g, ((h0) obj).f10988g);
        }
        return true;
    }

    public int hashCode() {
        String str = this.f10988g;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String i0() {
        return this.f10988g;
    }

    public String toString() {
        return "CoroutineName(" + this.f10988g + ')';
    }
}
