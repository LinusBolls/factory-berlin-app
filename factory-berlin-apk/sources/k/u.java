package k;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import kotlin.TypeCastException;
import kotlin.j;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.x;
import kotlin.n;

/* compiled from: Headers.kt */
public final class u implements Iterable<j<? extends String, ? extends String>>, kotlin.jvm.internal.z.a {

    /* renamed from: h  reason: collision with root package name */
    public static final b f10524h = new b((DefaultConstructorMarker) null);

    /* renamed from: g  reason: collision with root package name */
    private final String[] f10525g;

    /* compiled from: Headers.kt */
    public static final class a {
        private final List<String> a = new ArrayList(20);

        public final a a(String str, String str2) {
            k.f(str, "name");
            k.f(str2, "value");
            u.f10524h.d(str);
            u.f10524h.e(str2, str);
            c(str, str2);
            return this;
        }

        public final a b(String str) {
            k.f(str, "line");
            int S = q.S(str, ':', 1, false, 4, (Object) null);
            if (S != -1) {
                String substring = str.substring(0, S);
                k.b(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                String substring2 = str.substring(S + 1);
                k.b(substring2, "(this as java.lang.String).substring(startIndex)");
                c(substring, substring2);
            } else if (str.charAt(0) == ':') {
                String substring3 = str.substring(1);
                k.b(substring3, "(this as java.lang.String).substring(startIndex)");
                c("", substring3);
            } else {
                c("", str);
            }
            return this;
        }

        public final a c(String str, String str2) {
            k.f(str, "name");
            k.f(str2, "value");
            this.a.add(str);
            this.a.add(q.F0(str2).toString());
            return this;
        }

        public final a d(String str, String str2) {
            k.f(str, "name");
            k.f(str2, "value");
            u.f10524h.d(str);
            c(str, str2);
            return this;
        }

        public final u e() {
            Object[] array = this.a.toArray(new String[0]);
            if (array != null) {
                return new u((String[]) array, (DefaultConstructorMarker) null);
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        }

        public final String f(String str) {
            k.f(str, "name");
            kotlin.g0.a h2 = f.h(f.g(this.a.size() - 2, 0), 2);
            int a2 = h2.a();
            int d2 = h2.d();
            int e2 = h2.e();
            if (e2 >= 0) {
                if (a2 > d2) {
                    return null;
                }
            } else if (a2 < d2) {
                return null;
            }
            while (!p.q(str, this.a.get(a2), true)) {
                if (a2 == d2) {
                    return null;
                }
                a2 += e2;
            }
            return this.a.get(a2 + 1);
        }

        public final List<String> g() {
            return this.a;
        }

        public final a h(String str) {
            k.f(str, "name");
            int i2 = 0;
            while (i2 < this.a.size()) {
                if (p.q(str, this.a.get(i2), true)) {
                    this.a.remove(i2);
                    this.a.remove(i2);
                    i2 -= 2;
                }
                i2 += 2;
            }
            return this;
        }

        public final a i(String str, String str2) {
            k.f(str, "name");
            k.f(str2, "value");
            u.f10524h.d(str);
            u.f10524h.e(str2, str);
            h(str);
            c(str, str2);
            return this;
        }
    }

    /* compiled from: Headers.kt */
    public static final class b {
        private b() {
        }

        /* access modifiers changed from: private */
        public final void d(String str) {
            if (str.length() > 0) {
                int length = str.length();
                int i2 = 0;
                while (i2 < length) {
                    char charAt = str.charAt(i2);
                    if ('!' <= charAt && '~' >= charAt) {
                        i2++;
                    } else {
                        throw new IllegalArgumentException(k.h0.b.q("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i2), str).toString());
                    }
                }
                return;
            }
            throw new IllegalArgumentException("name is empty".toString());
        }

        /* access modifiers changed from: private */
        public final void e(String str, String str2) {
            int length = str.length();
            int i2 = 0;
            while (i2 < length) {
                char charAt = str.charAt(i2);
                if (charAt == 9 || (' ' <= charAt && '~' >= charAt)) {
                    i2++;
                } else {
                    throw new IllegalArgumentException(k.h0.b.q("Unexpected char %#04x at %d in %s value: %s", Integer.valueOf(charAt), Integer.valueOf(i2), str2, str).toString());
                }
            }
        }

        /* access modifiers changed from: private */
        public final String f(String[] strArr, String str) {
            kotlin.g0.a h2 = f.h(f.g(strArr.length - 2, 0), 2);
            int a = h2.a();
            int d2 = h2.d();
            int e2 = h2.e();
            if (e2 >= 0) {
                if (a > d2) {
                    return null;
                }
            } else if (a < d2) {
                return null;
            }
            while (!p.q(str, strArr[a], true)) {
                if (a == d2) {
                    return null;
                }
                a += e2;
            }
            return strArr[a + 1];
        }

        public final u g(String... strArr) {
            k.f(strArr, "namesAndValues");
            if (strArr.length % 2 == 0) {
                Object clone = strArr.clone();
                if (clone != null) {
                    String[] strArr2 = (String[]) clone;
                    int length = strArr2.length;
                    int i2 = 0;
                    while (i2 < length) {
                        if (strArr2[i2] != null) {
                            String str = strArr2[i2];
                            if (str != null) {
                                strArr2[i2] = q.F0(str).toString();
                                i2++;
                            } else {
                                throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
                            }
                        } else {
                            throw new IllegalArgumentException("Headers cannot be null".toString());
                        }
                    }
                    kotlin.g0.a h2 = f.h(f.i(0, strArr2.length), 2);
                    int a = h2.a();
                    int d2 = h2.d();
                    int e2 = h2.e();
                    if (e2 < 0 ? a >= d2 : a <= d2) {
                        while (true) {
                            String str2 = strArr2[a];
                            String str3 = strArr2[a + 1];
                            d(str2);
                            e(str3, str2);
                            if (a == d2) {
                                break;
                            }
                            a += e2;
                        }
                    }
                    return new u(strArr2, (DefaultConstructorMarker) null);
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<kotlin.String>");
            }
            throw new IllegalArgumentException("Expected alternating header names and values".toString());
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private u(String[] strArr) {
        this.f10525g = strArr;
    }

    public static final u i(String... strArr) {
        return f10524h.g(strArr);
    }

    public final String a(String str) {
        k.f(str, "name");
        return f10524h.f(this.f10525g, str);
    }

    public final String d(int i2) {
        return this.f10525g[i2 * 2];
    }

    public final Set<String> e() {
        TreeSet treeSet = new TreeSet(p.r(x.a));
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            treeSet.add(d(i2));
        }
        Set<String> unmodifiableSet = Collections.unmodifiableSet(treeSet);
        k.b(unmodifiableSet, "Collections.unmodifiableSet(result)");
        return unmodifiableSet;
    }

    public boolean equals(Object obj) {
        return (obj instanceof u) && Arrays.equals(this.f10525g, ((u) obj).f10525g);
    }

    public final a g() {
        a aVar = new a();
        boolean unused = s.t(aVar.g(), this.f10525g);
        return aVar;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f10525g);
    }

    public Iterator<j<String, String>> iterator() {
        int size = size();
        j[] jVarArr = new j[size];
        for (int i2 = 0; i2 < size; i2++) {
            jVarArr[i2] = n.a(d(i2), j(i2));
        }
        return kotlin.jvm.internal.b.a(jVarArr);
    }

    public final String j(int i2) {
        return this.f10525g[(i2 * 2) + 1];
    }

    public final List<String> k(String str) {
        k.f(str, "name");
        int size = size();
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < size; i2++) {
            if (p.q(str, d(i2), true)) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(j(i2));
            }
        }
        if (arrayList == null) {
            return n.g();
        }
        List<String> unmodifiableList = Collections.unmodifiableList(arrayList);
        k.b(unmodifiableList, "Collections.unmodifiableList(result)");
        return unmodifiableList;
    }

    public final int size() {
        return this.f10525g.length / 2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            sb.append(d(i2));
            sb.append(": ");
            sb.append(j(i2));
            sb.append("\n");
        }
        String sb2 = sb.toString();
        k.b(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public /* synthetic */ u(String[] strArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(strArr);
    }
}
