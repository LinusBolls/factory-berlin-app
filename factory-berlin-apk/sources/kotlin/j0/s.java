package kotlin.j0;

import kotlin.jvm.internal.k;

/* compiled from: _Strings.kt */
class s extends r {
    public static final String G0(String str, int i2) {
        k.e(str, "$this$drop");
        if (i2 >= 0) {
            String substring = str.substring(f.d(i2, str.length()));
            k.d(substring, "(this as java.lang.String).substring(startIndex)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i2 + " is less than zero.").toString());
    }

    public static String H0(String str, int i2) {
        k.e(str, "$this$take");
        if (i2 >= 0) {
            String substring = str.substring(0, f.d(i2, str.length()));
            k.d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i2 + " is less than zero.").toString());
    }
}
