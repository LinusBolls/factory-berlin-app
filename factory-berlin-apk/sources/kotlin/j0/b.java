package kotlin.j0;

import kotlin.g0.c;

/* compiled from: CharJVM.kt */
class b {
    public static int a(int i2) {
        if (2 <= i2 && 36 >= i2) {
            return i2;
        }
        throw new IllegalArgumentException("radix " + i2 + " was not in valid range " + new c(2, 36));
    }

    public static final int b(char c, int i2) {
        return Character.digit(c, i2);
    }

    public static final boolean c(char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }
}
