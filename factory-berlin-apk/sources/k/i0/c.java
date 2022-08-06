package k.i0;

import java.io.EOFException;
import kotlin.jvm.internal.k;
import l.f;

/* compiled from: utf8.kt */
public final class c {
    public static final boolean a(f fVar) {
        k.f(fVar, "$this$isProbablyUtf8");
        try {
            f fVar2 = new f();
            fVar.F(fVar2, 0, f.e(fVar.T0(), 64));
            for (int i2 = 0; i2 < 16; i2++) {
                if (fVar2.Q()) {
                    return true;
                }
                int R0 = fVar2.R0();
                if (Character.isISOControl(R0) && !Character.isWhitespace(R0)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
