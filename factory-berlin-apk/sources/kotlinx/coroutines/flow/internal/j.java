package kotlinx.coroutines.flow.internal;

import kotlin.c0.g;
import kotlin.c0.h;
import kotlinx.coroutines.e3.c;

/* compiled from: ChannelFlow.kt */
public interface j<T> extends c<T> {

    /* compiled from: ChannelFlow.kt */
    public static final class a {
        public static /* synthetic */ j a(j jVar, g gVar, int i2, int i3, Object obj) {
            if (obj == null) {
                if ((i3 & 1) != 0) {
                    gVar = h.f10600g;
                }
                if ((i3 & 2) != 0) {
                    i2 = -3;
                }
                return jVar.b(gVar, i2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fuse");
        }
    }

    j<T> b(g gVar, int i2);
}
