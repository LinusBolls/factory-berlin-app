package com.squareup.moshi;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import l.f;
import l.h;
import l.i;
import l.s;

/* compiled from: JsonReader */
public abstract class g implements Closeable {

    /* renamed from: g  reason: collision with root package name */
    int f8107g;

    /* renamed from: h  reason: collision with root package name */
    int[] f8108h = new int[32];

    /* renamed from: i  reason: collision with root package name */
    String[] f8109i = new String[32];

    /* renamed from: j  reason: collision with root package name */
    int[] f8110j = new int[32];

    /* renamed from: k  reason: collision with root package name */
    boolean f8111k;

    /* renamed from: l  reason: collision with root package name */
    boolean f8112l;

    /* compiled from: JsonReader */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.squareup.moshi.g$c[] r0 = com.squareup.moshi.g.c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                com.squareup.moshi.g$c r1 = com.squareup.moshi.g.c.BEGIN_ARRAY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.squareup.moshi.g$c r1 = com.squareup.moshi.g.c.BEGIN_OBJECT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.squareup.moshi.g$c r1 = com.squareup.moshi.g.c.STRING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.squareup.moshi.g$c r1 = com.squareup.moshi.g.c.NUMBER     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.squareup.moshi.g$c r1 = com.squareup.moshi.g.c.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.squareup.moshi.g$c r1 = com.squareup.moshi.g.c.NULL     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.squareup.moshi.g.a.<clinit>():void");
        }
    }

    /* compiled from: JsonReader */
    public static final class b {
        final String[] a;
        final s b;

        private b(String[] strArr, s sVar) {
            this.a = strArr;
            this.b = sVar;
        }

        public static b a(String... strArr) {
            try {
                i[] iVarArr = new i[strArr.length];
                f fVar = new f();
                for (int i2 = 0; i2 < strArr.length; i2++) {
                    j.F0(fVar, strArr[i2]);
                    fVar.readByte();
                    iVarArr[i2] = fVar.K0();
                }
                return new b((String[]) strArr.clone(), s.l(iVarArr));
            } catch (IOException e2) {
                throw new AssertionError(e2);
            }
        }
    }

    /* compiled from: JsonReader */
    public enum c {
        BEGIN_ARRAY,
        END_ARRAY,
        BEGIN_OBJECT,
        END_OBJECT,
        NAME,
        STRING,
        NUMBER,
        BOOLEAN,
        NULL,
        END_DOCUMENT
    }

    g() {
    }

    public static g q(h hVar) {
        return new i(hVar);
    }

    public abstract <T> T B0();

    /* access modifiers changed from: package-private */
    public final void D(int i2) {
        int i3 = this.f8107g;
        int[] iArr = this.f8108h;
        if (i3 == iArr.length) {
            if (i3 != 256) {
                this.f8108h = Arrays.copyOf(iArr, iArr.length * 2);
                String[] strArr = this.f8109i;
                this.f8109i = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                int[] iArr2 = this.f8110j;
                this.f8110j = Arrays.copyOf(iArr2, iArr2.length * 2);
            } else {
                throw new JsonDataException("Nesting too deep at " + getPath());
            }
        }
        int[] iArr3 = this.f8108h;
        int i4 = this.f8107g;
        this.f8107g = i4 + 1;
        iArr3[i4] = i2;
    }

    public final Object F() {
        switch (a.a[y().ordinal()]) {
            case 1:
                ArrayList arrayList = new ArrayList();
                a();
                while (hasNext()) {
                    arrayList.add(F());
                }
                h();
                return arrayList;
            case 2:
                m mVar = new m();
                b();
                while (hasNext()) {
                    String nextName = nextName();
                    Object F = F();
                    Object put = mVar.put(nextName, F);
                    if (put != null) {
                        throw new JsonDataException("Map key '" + nextName + "' has multiple values at path " + getPath() + ": " + put + " and " + F);
                    }
                }
                i();
                return mVar;
            case 3:
                return nextString();
            case 4:
                return Double.valueOf(l());
            case 5:
                return Boolean.valueOf(nextBoolean());
            case 6:
                return B0();
            default:
                throw new IllegalStateException("Expected a value but was " + y() + " at path " + getPath());
        }
    }

    public abstract int K(b bVar);

    public abstract int L(b bVar);

    public final void M(boolean z) {
        this.f8112l = z;
    }

    public final void U(boolean z) {
        this.f8111k = z;
    }

    public abstract void Z();

    public abstract void a();

    public abstract void b();

    /* access modifiers changed from: package-private */
    public final JsonEncodingException b0(String str) {
        throw new JsonEncodingException(str + " at path " + getPath());
    }

    public final String getPath() {
        return h.a(this.f8107g, this.f8108h, this.f8109i, this.f8110j);
    }

    public abstract void h();

    public abstract boolean hasNext();

    public abstract void i();

    public final boolean j() {
        return this.f8112l;
    }

    public final boolean k() {
        return this.f8111k;
    }

    public abstract double l();

    public abstract int n();

    public abstract boolean nextBoolean();

    public abstract String nextName();

    public abstract String nextString();

    public abstract long o();

    public abstract void skipValue();

    public abstract c y();

    /* access modifiers changed from: package-private */
    public abstract void z();
}
