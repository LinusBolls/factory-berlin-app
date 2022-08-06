package kotlin.a0;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.k;

/* compiled from: _ArraysJvm.kt */
class i extends h {
    public static <T> List<T> c(T[] tArr) {
        k.e(tArr, "$this$asList");
        List<T> a = k.a(tArr);
        k.d(a, "ArraysUtilJVM.asList(this)");
        return a;
    }

    public static byte[] d(byte[] bArr, byte[] bArr2, int i2, int i3, int i4) {
        k.e(bArr, "$this$copyInto");
        k.e(bArr2, "destination");
        System.arraycopy(bArr, i3, bArr2, i2, i4 - i3);
        return bArr2;
    }

    public static final <T> T[] e(T[] tArr, T[] tArr2, int i2, int i3, int i4) {
        k.e(tArr, "$this$copyInto");
        k.e(tArr2, "destination");
        System.arraycopy(tArr, i3, tArr2, i2, i4 - i3);
        return tArr2;
    }

    public static /* synthetic */ byte[] f(byte[] bArr, byte[] bArr2, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i2 = 0;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = bArr.length;
        }
        byte[] unused = d(bArr, bArr2, i2, i3, i4);
        return bArr2;
    }

    public static /* synthetic */ Object[] g(Object[] objArr, Object[] objArr2, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i2 = 0;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = objArr.length;
        }
        e(objArr, objArr2, i2, i3, i4);
        return objArr2;
    }

    public static byte[] h(byte[] bArr, int i2, int i3) {
        k.e(bArr, "$this$copyOfRangeImpl");
        g.a(i3, bArr.length);
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i2, i3);
        k.d(copyOfRange, "java.util.Arrays.copyOfR…this, fromIndex, toIndex)");
        return copyOfRange;
    }

    public static <T> void i(T[] tArr, T t, int i2, int i3) {
        k.e(tArr, "$this$fill");
        Arrays.fill(tArr, i2, i3, t);
    }

    public static /* synthetic */ void j(Object[] objArr, Object obj, int i2, int i3, int i4, Object obj2) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = objArr.length;
        }
        i(objArr, obj, i2, i3);
    }

    public static final <T> void k(T[] tArr, Comparator<? super T> comparator) {
        k.e(tArr, "$this$sortWith");
        k.e(comparator, "comparator");
        if (tArr.length > 1) {
            Arrays.sort(tArr, comparator);
        }
    }
}
