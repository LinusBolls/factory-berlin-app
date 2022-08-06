package com.google.gson.internal.bind;

import com.google.gson.i;
import com.google.gson.m;
import com.google.gson.n;
import com.google.gson.o;
import com.google.gson.stream.b;
import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* compiled from: JsonTreeReader */
public final class a extends com.google.gson.stream.a {
    private static final Object A = new Object();
    private Object[] w;
    private int x;
    private String[] y;
    private int[] z;

    /* renamed from: com.google.gson.internal.bind.a$a  reason: collision with other inner class name */
    /* compiled from: JsonTreeReader */
    class C0117a extends Reader {
        C0117a() {
        }

        public void close() {
            throw new AssertionError();
        }

        public int read(char[] cArr, int i2, int i3) {
            throw new AssertionError();
        }
    }

    static {
        new C0117a();
    }

    private void I0(b bVar) {
        if (Z() != bVar) {
            throw new IllegalStateException("Expected " + bVar + " but was " + Z() + y());
        }
    }

    private Object J0() {
        return this.w[this.x - 1];
    }

    private Object K0() {
        Object[] objArr = this.w;
        int i2 = this.x - 1;
        this.x = i2;
        Object obj = objArr[i2];
        objArr[i2] = null;
        return obj;
    }

    private void M0(Object obj) {
        int i2 = this.x;
        Object[] objArr = this.w;
        if (i2 == objArr.length) {
            int i3 = i2 * 2;
            this.w = Arrays.copyOf(objArr, i3);
            this.z = Arrays.copyOf(this.z, i3);
            this.y = (String[]) Arrays.copyOf(this.y, i3);
        }
        Object[] objArr2 = this.w;
        int i4 = this.x;
        this.x = i4 + 1;
        objArr2[i4] = obj;
    }

    private String y() {
        return " at path " + getPath();
    }

    public int D() {
        b Z = Z();
        if (Z == b.NUMBER || Z == b.STRING) {
            int n2 = ((o) J0()).n();
            K0();
            int i2 = this.x;
            if (i2 > 0) {
                int[] iArr = this.z;
                int i3 = i2 - 1;
                iArr[i3] = iArr[i3] + 1;
            }
            return n2;
        }
        throw new IllegalStateException("Expected " + b.NUMBER + " but was " + Z + y());
    }

    public long F() {
        b Z = Z();
        if (Z == b.NUMBER || Z == b.STRING) {
            long o = ((o) J0()).o();
            K0();
            int i2 = this.x;
            if (i2 > 0) {
                int[] iArr = this.z;
                int i3 = i2 - 1;
                iArr[i3] = iArr[i3] + 1;
            }
            return o;
        }
        throw new IllegalStateException("Expected " + b.NUMBER + " but was " + Z + y());
    }

    public void L() {
        I0(b.NULL);
        K0();
        int i2 = this.x;
        if (i2 > 0) {
            int[] iArr = this.z;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    public void L0() {
        I0(b.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) J0()).next();
        M0(entry.getValue());
        M0(new o((String) entry.getKey()));
    }

    public b Z() {
        if (this.x == 0) {
            return b.END_DOCUMENT;
        }
        Object J0 = J0();
        if (J0 instanceof Iterator) {
            boolean z2 = this.w[this.x - 2] instanceof n;
            Iterator it = (Iterator) J0;
            if (!it.hasNext()) {
                return z2 ? b.END_OBJECT : b.END_ARRAY;
            }
            if (z2) {
                return b.NAME;
            }
            M0(it.next());
            return Z();
        } else if (J0 instanceof n) {
            return b.BEGIN_OBJECT;
        } else {
            if (J0 instanceof i) {
                return b.BEGIN_ARRAY;
            }
            if (J0 instanceof o) {
                o oVar = (o) J0;
                if (oVar.z()) {
                    return b.STRING;
                }
                if (oVar.s()) {
                    return b.BOOLEAN;
                }
                if (oVar.y()) {
                    return b.NUMBER;
                }
                throw new AssertionError();
            } else if (J0 instanceof m) {
                return b.NULL;
            } else {
                if (J0 == A) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                throw new AssertionError();
            }
        }
    }

    public void a() {
        I0(b.BEGIN_ARRAY);
        M0(((i) J0()).iterator());
        this.z[this.x - 1] = 0;
    }

    public void b() {
        I0(b.BEGIN_OBJECT);
        M0(((n) J0()).m().iterator());
    }

    public void close() {
        this.w = new Object[]{A};
        this.x = 1;
    }

    public String getPath() {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i2 = 0;
        while (i2 < this.x) {
            Object[] objArr = this.w;
            if (objArr[i2] instanceof i) {
                i2++;
                if (objArr[i2] instanceof Iterator) {
                    sb.append('[');
                    sb.append(this.z[i2]);
                    sb.append(']');
                }
            } else if (objArr[i2] instanceof n) {
                i2++;
                if (objArr[i2] instanceof Iterator) {
                    sb.append('.');
                    String[] strArr = this.y;
                    if (strArr[i2] != null) {
                        sb.append(strArr[i2]);
                    }
                }
            }
            i2++;
        }
        return sb.toString();
    }

    public boolean hasNext() {
        b Z = Z();
        return (Z == b.END_OBJECT || Z == b.END_ARRAY) ? false : true;
    }

    public void k() {
        I0(b.END_ARRAY);
        K0();
        K0();
        int i2 = this.x;
        if (i2 > 0) {
            int[] iArr = this.z;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    public void l() {
        I0(b.END_OBJECT);
        K0();
        K0();
        int i2 = this.x;
        if (i2 > 0) {
            int[] iArr = this.z;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    public boolean nextBoolean() {
        I0(b.BOOLEAN);
        boolean l2 = ((o) K0()).l();
        int i2 = this.x;
        if (i2 > 0) {
            int[] iArr = this.z;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
        return l2;
    }

    public String nextName() {
        I0(b.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) J0()).next();
        String str = (String) entry.getKey();
        this.y[this.x - 1] = str;
        M0(entry.getValue());
        return str;
    }

    public String nextString() {
        b Z = Z();
        if (Z == b.STRING || Z == b.NUMBER) {
            String r = ((o) K0()).r();
            int i2 = this.x;
            if (i2 > 0) {
                int[] iArr = this.z;
                int i3 = i2 - 1;
                iArr[i3] = iArr[i3] + 1;
            }
            return r;
        }
        throw new IllegalStateException("Expected " + b.STRING + " but was " + Z + y());
    }

    public void skipValue() {
        if (Z() == b.NAME) {
            nextName();
            this.y[this.x - 2] = "null";
        } else {
            K0();
            int i2 = this.x;
            if (i2 > 0) {
                this.y[i2 - 1] = "null";
            }
        }
        int i3 = this.x;
        if (i3 > 0) {
            int[] iArr = this.z;
            int i4 = i3 - 1;
            iArr[i4] = iArr[i4] + 1;
        }
    }

    public String toString() {
        return a.class.getSimpleName();
    }

    public double z() {
        b Z = Z();
        if (Z == b.NUMBER || Z == b.STRING) {
            double m2 = ((o) J0()).m();
            if (o() || (!Double.isNaN(m2) && !Double.isInfinite(m2))) {
                K0();
                int i2 = this.x;
                if (i2 > 0) {
                    int[] iArr = this.z;
                    int i3 = i2 - 1;
                    iArr[i3] = iArr[i3] + 1;
                }
                return m2;
            }
            throw new NumberFormatException("JSON forbids NaN and infinities: " + m2);
        }
        throw new IllegalStateException("Expected " + b.NUMBER + " but was " + Z + y());
    }
}
