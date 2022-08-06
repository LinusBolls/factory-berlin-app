package kotlin;

import java.util.Arrays;
import java.util.Collection;
import java.util.NoSuchElementException;
import kotlin.a0.l0;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.k;

/* compiled from: UByteArray.kt */
public final class p implements Collection<o>, kotlin.jvm.internal.z.a {

    /* renamed from: g  reason: collision with root package name */
    private final byte[] f10694g;

    /* compiled from: UByteArray.kt */
    private static final class a extends l0 {

        /* renamed from: g  reason: collision with root package name */
        private int f10695g;

        /* renamed from: h  reason: collision with root package name */
        private final byte[] f10696h;

        public a(byte[] bArr) {
            k.e(bArr, "array");
            this.f10696h = bArr;
        }

        public byte c() {
            int i2 = this.f10695g;
            byte[] bArr = this.f10696h;
            if (i2 < bArr.length) {
                this.f10695g = i2 + 1;
                byte b = bArr[i2];
                o.i(b);
                return b;
            }
            throw new NoSuchElementException(String.valueOf(this.f10695g));
        }

        public boolean hasNext() {
            return this.f10695g < this.f10696h.length;
        }
    }

    private /* synthetic */ p(byte[] bArr) {
        k.e(bArr, "storage");
        this.f10694g = bArr;
    }

    public static boolean d(byte[] bArr, byte b) {
        return j.l(bArr, b);
    }

    public static boolean e(byte[] bArr, Collection<o> collection) {
        boolean z;
        k.e(collection, "elements");
        if (!collection.isEmpty()) {
            for (T next : collection) {
                if (!(next instanceof o) || !j.l(bArr, ((o) next).n())) {
                    z = false;
                    continue;
                } else {
                    z = true;
                    continue;
                }
                if (!z) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean g(byte[] bArr, Object obj) {
        return (obj instanceof p) && k.a(bArr, ((p) obj).q());
    }

    public static int j(byte[] bArr) {
        return bArr.length;
    }

    public static int k(byte[] bArr) {
        if (bArr != null) {
            return Arrays.hashCode(bArr);
        }
        return 0;
    }

    public static boolean l(byte[] bArr) {
        return bArr.length == 0;
    }

    public static l0 n(byte[] bArr) {
        return new a(bArr);
    }

    public static String o(byte[] bArr) {
        return "UByteArray(storage=" + Arrays.toString(bArr) + ")";
    }

    public boolean a(byte b) {
        return d(this.f10694g, b);
    }

    public /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection<? extends o> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof o) {
            return a(((o) obj).n());
        }
        return false;
    }

    public boolean containsAll(Collection<? extends Object> collection) {
        return e(this.f10694g, collection);
    }

    public boolean equals(Object obj) {
        return g(this.f10694g, obj);
    }

    public int hashCode() {
        return k(this.f10694g);
    }

    public int i() {
        return j(this.f10694g);
    }

    public boolean isEmpty() {
        return l(this.f10694g);
    }

    /* renamed from: m */
    public l0 iterator() {
        return n(this.f10694g);
    }

    public final /* synthetic */ byte[] q() {
        return this.f10694g;
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return i();
    }

    public Object[] toArray() {
        return f.a(this);
    }

    public <T> T[] toArray(T[] tArr) {
        return f.b(this, tArr);
    }

    public String toString() {
        return o(this.f10694g);
    }
}
