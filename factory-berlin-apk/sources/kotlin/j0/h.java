package kotlin.j0;

import kotlin.e0.c.l;
import kotlin.jvm.internal.k;

/* compiled from: Appendable.kt */
class h {
    public static <T> void a(Appendable appendable, T t, l<? super T, ? extends CharSequence> lVar) {
        k.e(appendable, "$this$appendElement");
        if (lVar != null) {
            appendable.append((CharSequence) lVar.o(t));
            return;
        }
        if (t != null ? t instanceof CharSequence : true) {
            appendable.append((CharSequence) t);
        } else if (t instanceof Character) {
            appendable.append(((Character) t).charValue());
        } else {
            appendable.append(String.valueOf(t));
        }
    }
}
