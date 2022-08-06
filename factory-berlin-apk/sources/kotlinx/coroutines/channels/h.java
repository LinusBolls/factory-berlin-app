package kotlinx.coroutines.channels;

/* compiled from: Channel.kt */
public final class h {
    public static final <E> e<E> a(int i2) {
        if (i2 == -2) {
            return new d(e.f10752f.a());
        }
        if (i2 == -1) {
            return new l();
        }
        if (i2 == 0) {
            return new t();
        }
        if (i2 != Integer.MAX_VALUE) {
            return new d(i2);
        }
        return new m();
    }
}
