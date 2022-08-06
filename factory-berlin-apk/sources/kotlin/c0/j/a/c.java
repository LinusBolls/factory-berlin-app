package kotlin.c0.j.a;

import kotlin.c0.d;
import kotlin.c0.g;

/* compiled from: ContinuationImpl.kt */
public final class c implements d<Object> {

    /* renamed from: g  reason: collision with root package name */
    public static final c f10610g = new c();

    private c() {
    }

    public g c() {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    public void m(Object obj) {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    public String toString() {
        return "This continuation is already complete";
    }
}
