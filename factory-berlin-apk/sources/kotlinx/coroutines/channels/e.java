package kotlinx.coroutines.channels;

import kotlinx.coroutines.internal.y;

/* compiled from: Channel.kt */
public interface e<E> extends v<E>, r<E> {

    /* renamed from: f  reason: collision with root package name */
    public static final a f10752f = a.b;

    /* compiled from: Channel.kt */
    public static final class a {
        private static final int a = y.b("kotlinx.coroutines.channels.defaultBuffer", 64, 1, 2147483646);
        static final /* synthetic */ a b = new a();

        private a() {
        }

        public final int a() {
            return a;
        }
    }
}
