package l;

import java.io.Closeable;
import java.io.Flushable;

/* compiled from: Sink.kt */
public interface z extends Closeable, Flushable {
    void close();

    c0 e();

    void flush();

    void p(f fVar, long j2);
}
