package kotlin.a0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.e0.c.l;
import kotlin.i0.d;
import kotlin.jvm.internal.k;

/* compiled from: _Collections.kt */
class v extends u {

    /* compiled from: Sequences.kt */
    public static final class a implements d<T> {
        final /* synthetic */ Iterable a;

        public a(Iterable iterable) {
            this.a = iterable;
        }

        public Iterator<T> iterator() {
            return this.a.iterator();
        }
    }

    public static <T> T A(List<? extends T> list) {
        k.e(list, "$this$firstOrNull");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static <T> T B(List<? extends T> list, int i2) {
        k.e(list, "$this$getOrNull");
        if (i2 < 0 || i2 > n.h(list)) {
            return null;
        }
        return list.get(i2);
    }

    public static final <T, A extends Appendable> A C(Iterable<? extends T> iterable, A a2, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, l<? super T, ? extends CharSequence> lVar) {
        k.e(iterable, "$this$joinTo");
        k.e(a2, "buffer");
        k.e(charSequence, "separator");
        k.e(charSequence2, "prefix");
        k.e(charSequence3, "postfix");
        k.e(charSequence4, "truncated");
        a2.append(charSequence2);
        int i3 = 0;
        for (Object next : iterable) {
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

    public static /* synthetic */ Appendable D(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, l lVar, int i3, Object obj) {
        String str = (i3 & 2) != 0 ? ", " : charSequence;
        CharSequence charSequence5 = "";
        CharSequence charSequence6 = (i3 & 4) != 0 ? charSequence5 : charSequence2;
        if ((i3 & 8) == 0) {
            charSequence5 = charSequence3;
        }
        C(iterable, appendable, str, charSequence6, charSequence5, (i3 & 16) != 0 ? -1 : i2, (i3 & 32) != 0 ? "..." : charSequence4, (i3 & 64) != 0 ? null : lVar);
        return appendable;
    }

    public static final <T> String E(Iterable<? extends T> iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, l<? super T, ? extends CharSequence> lVar) {
        k.e(iterable, "$this$joinToString");
        k.e(charSequence, "separator");
        k.e(charSequence2, "prefix");
        k.e(charSequence3, "postfix");
        k.e(charSequence4, "truncated");
        StringBuilder sb = new StringBuilder();
        C(iterable, sb, charSequence, charSequence2, charSequence3, i2, charSequence4, lVar);
        String sb2 = sb.toString();
        k.d(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    public static /* synthetic */ String F(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, l lVar, int i3, Object obj) {
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
        return E(iterable, charSequence, charSequence6, charSequence5, i4, charSequence7, lVar);
    }

    public static <T> T G(List<? extends T> list) {
        k.e(list, "$this$last");
        if (!list.isEmpty()) {
            return list.get(n.h(list));
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static <T> T H(List<? extends T> list) {
        k.e(list, "$this$lastOrNull");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static <T extends Comparable<? super T>> T I(Iterable<? extends T> iterable) {
        k.e(iterable, "$this$minOrNull");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T t = (Comparable) it.next();
        while (it.hasNext()) {
            T t2 = (Comparable) it.next();
            if (t.compareTo(t2) > 0) {
                t = t2;
            }
        }
        return t;
    }

    public static <T> List<T> J(Collection<? extends T> collection, Iterable<? extends T> iterable) {
        k.e(collection, "$this$plus");
        k.e(iterable, "elements");
        if (iterable instanceof Collection) {
            Collection collection2 = (Collection) iterable;
            ArrayList arrayList = new ArrayList(collection.size() + collection2.size());
            arrayList.addAll(collection);
            arrayList.addAll(collection2);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(collection);
        boolean unused = s.s(arrayList2, iterable);
        return arrayList2;
    }

    public static <T> List<T> K(Collection<? extends T> collection, T t) {
        k.e(collection, "$this$plus");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(t);
        return arrayList;
    }

    public static <T> T L(Iterable<? extends T> iterable) {
        k.e(iterable, "$this$single");
        if (iterable instanceof List) {
            return M((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T next = it.next();
            if (!it.hasNext()) {
                return next;
            }
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static final <T> T M(List<? extends T> list) {
        k.e(list, "$this$single");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        } else if (size == 1) {
            return list.get(0);
        } else {
            throw new IllegalArgumentException("List has more than one element.");
        }
    }

    public static <T> List<T> N(Iterable<? extends T> iterable, Comparator<? super T> comparator) {
        k.e(iterable, "$this$sortedWith");
        k.e(comparator, "comparator");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                return R(iterable);
            }
            Object[] array = collection.toArray(new Object[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            } else if (array != null) {
                i.k(array, comparator);
                return i.c(array);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
        } else {
            List<T> S = S(iterable);
            r.r(S, comparator);
            return S;
        }
    }

    public static int O(Iterable<Integer> iterable) {
        k.e(iterable, "$this$sum");
        int i2 = 0;
        for (Integer intValue : iterable) {
            i2 += intValue.intValue();
        }
        return i2;
    }

    public static <T> List<T> P(Iterable<? extends T> iterable, int i2) {
        k.e(iterable, "$this$take");
        int i3 = 0;
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
        } else if (i2 == 0) {
            return n.g();
        } else {
            if (iterable instanceof Collection) {
                if (i2 >= ((Collection) iterable).size()) {
                    return R(iterable);
                }
                if (i2 == 1) {
                    return m.b(y(iterable));
                }
            }
            ArrayList arrayList = new ArrayList(i2);
            for (Object add : iterable) {
                arrayList.add(add);
                i3++;
                if (i3 == i2) {
                    break;
                }
            }
            return n.l(arrayList);
        }
    }

    public static final <T, C extends Collection<? super T>> C Q(Iterable<? extends T> iterable, C c) {
        k.e(iterable, "$this$toCollection");
        k.e(c, "destination");
        for (Object add : iterable) {
            c.add(add);
        }
        return c;
    }

    public static <T> List<T> R(Iterable<? extends T> iterable) {
        k.e(iterable, "$this$toList");
        if (!(iterable instanceof Collection)) {
            return n.l(S(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return n.g();
        }
        if (size != 1) {
            return T(collection);
        }
        return m.b(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    public static final <T> List<T> S(Iterable<? extends T> iterable) {
        k.e(iterable, "$this$toMutableList");
        if (iterable instanceof Collection) {
            return T((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        Q(iterable, arrayList);
        return arrayList;
    }

    public static <T> List<T> T(Collection<? extends T> collection) {
        k.e(collection, "$this$toMutableList");
        return new ArrayList(collection);
    }

    public static final <T> Set<T> U(Iterable<? extends T> iterable) {
        k.e(iterable, "$this$toMutableSet");
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Q(iterable, linkedHashSet);
        return linkedHashSet;
    }

    public static <T> Set<T> V(Iterable<? extends T> iterable) {
        k.e(iterable, "$this$toSet");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                return i0.b();
            }
            if (size != 1) {
                LinkedHashSet linkedHashSet = new LinkedHashSet(d0.a(collection.size()));
                Q(iterable, linkedHashSet);
                return linkedHashSet;
            }
            return h0.a(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        Q(iterable, linkedHashSet2);
        return i0.c(linkedHashSet2);
    }

    public static <T> Set<T> W(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        k.e(iterable, "$this$union");
        k.e(iterable2, "other");
        Set<T> U = U(iterable);
        boolean unused = s.s(U, iterable2);
        return U;
    }

    public static <T> d<T> u(Iterable<? extends T> iterable) {
        k.e(iterable, "$this$asSequence");
        return new a(iterable);
    }

    public static <T> List<T> v(List<? extends T> list, int i2) {
        k.e(list, "$this$dropLast");
        if (i2 >= 0) {
            return P(list, f.b(list.size() - i2, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
    }

    public static <T> List<T> w(Iterable<? extends T> iterable) {
        k.e(iterable, "$this$filterNotNull");
        ArrayList arrayList = new ArrayList();
        x(iterable, arrayList);
        return arrayList;
    }

    public static final <C extends Collection<? super T>, T> C x(Iterable<? extends T> iterable, C c) {
        k.e(iterable, "$this$filterNotNullTo");
        k.e(c, "destination");
        for (Object next : iterable) {
            if (next != null) {
                c.add(next);
            }
        }
        return c;
    }

    public static final <T> T y(Iterable<? extends T> iterable) {
        k.e(iterable, "$this$first");
        if (iterable instanceof List) {
            return z((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static <T> T z(List<? extends T> list) {
        k.e(list, "$this$first");
        if (!list.isEmpty()) {
            return list.get(0);
        }
        throw new NoSuchElementException("List is empty.");
    }
}
