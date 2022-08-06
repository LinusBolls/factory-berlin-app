package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;
import kotlin.c0.d;
import kotlinx.coroutines.h3.c;

/* compiled from: Channel.kt */
public interface r<E> {
    void a(CancellationException cancellationException);

    Object d(d<? super x<? extends E>> dVar);

    g<E> iterator();

    c<E> p();
}
