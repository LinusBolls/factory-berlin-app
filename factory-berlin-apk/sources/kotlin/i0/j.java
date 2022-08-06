package kotlin.i0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.e0.c.l;
import kotlin.jvm.internal.k;

/* compiled from: _Sequences.kt */
class j extends i {

    /* compiled from: Iterables.kt */
    public static final class a implements Iterable<T>, kotlin.jvm.internal.z.a {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ d f10631g;

        public a(d dVar) {
            this.f10631g = dVar;
        }

        public Iterator<T> iterator() {
            return this.f10631g.iterator();
        }
    }

    public static <T> Iterable<T> c(d<? extends T> dVar) {
        k.e(dVar, "$this$asIterable");
        return new a(dVar);
    }

    public static <T> d<T> d(d<? extends T> dVar, int i2) {
        k.e(dVar, "$this$drop");
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
        } else if (i2 == 0) {
            return dVar;
        } else {
            if (dVar instanceof c) {
                return ((c) dVar).a(i2);
            }
            return new b(dVar, i2);
        }
    }

    public static final <T, A extends Appendable> A e(d<? extends T> dVar, A a2, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, l<? super T, ? extends CharSequence> lVar) {
        k.e(dVar, "$this$joinTo");
        k.e(a2, "buffer");
        k.e(charSequence, "separator");
        k.e(charSequence2, "prefix");
        k.e(charSequence3, "postfix");
        k.e(charSequence4, "truncated");
        a2.append(charSequence2);
        int i3 = 0;
        for (Object next : dVar) {
            i3++;
            if (i3 > 1) {
                a2.append(charSequence);
            }
            if (i2 >= 0 && i3 > i2) {
                break;
            }
            h.a(a2, next, lVar);
        }
        if (i2 >= 0 && i3 > i2) {
            a2.append(charSequence4);
        }
        a2.append(charSequence3);
        return a2;
    }

    public static final <T> String f(d<? extends T> dVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, l<? super T, ? extends CharSequence> lVar) {
        k.e(dVar, "$this$joinToString");
        k.e(charSequence, "separator");
        k.e(charSequence2, "prefix");
        k.e(charSequence3, "postfix");
        k.e(charSequence4, "truncated");
        StringBuilder sb = new StringBuilder();
        e(dVar, sb, charSequence, charSequence2, charSequence3, i2, charSequence4, lVar);
        String sb2 = sb.toString();
        k.d(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    public static /* synthetic */ String g(d dVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, l lVar, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = "";
        CharSequence charSequence6 = (i3 & 2) != 0 ? charSequence5 : charSequence2;
        if ((i3 & 4) == 0) {
            charSequence5 = charSequence3;
        }
        int i4 = (i3 & 8) != 0 ? -1 : i2;
        if ((i3 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i3 & 32) != 0) {
            lVar = null;
        }
        return f(dVar, charSequence, charSequence6, charSequence5, i4, charSequence7, lVar);
    }

    public static <T, R> d<R> h(d<? extends T> dVar, l<? super T, ? extends R> lVar) {
        k.e(dVar, "$this$map");
        k.e(lVar, "transform");
        return new k(dVar, lVar);
    }

    public static final <T, C extends Collection<? super T>> C i(d<? extends T> dVar, C c) {
        k.e(dVar, "$this$toCollection");
        k.e(c, "destination");
        for (Object add : dVar) {
            c.add(add);
        }
        return c;
    }

    public static <T> List<T> j(d<? extends T> dVar) {
        k.e(dVar, "$this$toList");
        return n.l(k(dVar));
    }

    public static final <T> List<T> k(d<? extends T> dVar) {
        k.e(dVar, "$this$toMutableList");
        ArrayList arrayList = new ArrayList();
        i(dVar, arrayList);
        return arrayList;
    }
}
