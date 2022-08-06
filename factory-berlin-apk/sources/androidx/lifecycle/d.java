package androidx.lifecycle;

import java.io.Closeable;
import java.util.concurrent.CancellationException;
import kotlin.c0.g;
import kotlin.jvm.internal.k;
import kotlinx.coroutines.i0;

/* compiled from: ViewModel.kt */
public final class d implements Closeable, i0 {

    /* renamed from: g  reason: collision with root package name */
    private final g f973g;

    public d(g gVar) {
        k.f(gVar, "context");
        this.f973g = gVar;
    }

    public void close() {
        c2.f(k(), (CancellationException) null, 1, (Object) null);
    }

    public g k() {
        return this.f973g;
    }
}
