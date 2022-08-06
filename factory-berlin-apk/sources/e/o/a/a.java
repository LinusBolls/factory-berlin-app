package e.o.a;

import androidx.lifecycle.s0;
import androidx.lifecycle.v;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: LoaderManager */
public abstract class a {
    public static <T extends v & s0> a b(T t) {
        return new b(t, ((s0) t).o());
    }

    @Deprecated
    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract void c();
}
