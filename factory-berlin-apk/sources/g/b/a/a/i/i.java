package g.b.a.a.i;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* compiled from: ExecutionModule */
abstract class i {
    static Executor a() {
        return new k(Executors.newSingleThreadExecutor());
    }
}
