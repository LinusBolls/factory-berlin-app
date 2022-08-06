package org.threeten.bp.s;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.text.ParseException;
import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import org.threeten.bp.DateTimeException;
import org.threeten.bp.b;
import org.threeten.bp.f;
import org.threeten.bp.t.d;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;
import org.threeten.bp.temporal.h;
import org.threeten.bp.temporal.i;
import org.threeten.bp.temporal.l;
import org.threeten.bp.temporal.m;

/* compiled from: HijrahDate */
public final class k extends a<k> implements Serializable {
    private static final HashMap<Integer, Integer[]> A = new HashMap<>();
    private static final Long[] B = new Long[334];
    private static final Integer[] C = new Integer[r.length];
    private static final Integer[] D = new Integer[s.length];
    private static final Integer[] E = new Integer[t.length];
    private static final Integer[] F = new Integer[f11652n.length];
    private static final Integer[] G = new Integer[o.length];
    private static final Integer[] H = new Integer[p.length];
    private static final Integer[] I = new Integer[q.length];
    private static final Integer[] J = new Integer[u.length];

    /* renamed from: n  reason: collision with root package name */
    private static final int[] f11652n = {0, 30, 59, 89, 118, 148, 177, 207, 236, 266, 295, 325};
    private static final int[] o = {0, 30, 59, 89, 118, 148, 177, 207, 236, 266, 295, 325};
    private static final int[] p = {30, 29, 30, 29, 30, 29, 30, 29, 30, 29, 30, 29};
    private static final int[] q = {30, 29, 30, 29, 30, 29, 30, 29, 30, 29, 30, 30};
    private static final int[] r = {0, 1, 0, 1, 0, 1, 1};
    private static final int[] s = {1, 9999, 11, 51, 5, 29, 354};
    private static final int[] t = {1, 9999, 11, 52, 6, 30, 355};
    private static final int[] u = {0, 354, 709, 1063, 1417, 1772, 2126, 2481, 2835, 3189, 3544, 3898, 4252, 4607, 4961, 5315, 5670, 6024, 6379, 6733, 7087, 7442, 7796, 8150, 8505, 8859, 9214, 9568, 9922, 10277};
    private static final char v = File.separatorChar;
    private static final String w = File.pathSeparator;
    private static final String x = ("org" + v + "threeten" + v + "bp" + v + "chrono");
    private static final HashMap<Integer, Integer[]> y = new HashMap<>();
    private static final HashMap<Integer, Integer[]> z = new HashMap<>();

    /* renamed from: g  reason: collision with root package name */
    private final transient l f11653g;

    /* renamed from: h  reason: collision with root package name */
    private final transient int f11654h;

    /* renamed from: i  reason: collision with root package name */
    private final transient int f11655i;

    /* renamed from: j  reason: collision with root package name */
    private final transient int f11656j;

    /* renamed from: k  reason: collision with root package name */
    private final transient int f11657k;

    /* renamed from: l  reason: collision with root package name */
    private final transient b f11658l;

    /* renamed from: m  reason: collision with root package name */
    private final long f11659m;

    /* compiled from: HijrahDate */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|26) */
        /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                org.threeten.bp.temporal.a[] r0 = org.threeten.bp.temporal.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                org.threeten.bp.temporal.a r1 = org.threeten.bp.temporal.a.DAY_OF_MONTH     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001d }
                org.threeten.bp.temporal.a r1 = org.threeten.bp.temporal.a.DAY_OF_YEAR     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0028 }
                org.threeten.bp.temporal.a r1 = org.threeten.bp.temporal.a.ALIGNED_WEEK_OF_MONTH     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0033 }
                org.threeten.bp.temporal.a r1 = org.threeten.bp.temporal.a.YEAR_OF_ERA     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x003e }
                org.threeten.bp.temporal.a r1 = org.threeten.bp.temporal.a.DAY_OF_WEEK     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0049 }
                org.threeten.bp.temporal.a r1 = org.threeten.bp.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0054 }
                org.threeten.bp.temporal.a r1 = org.threeten.bp.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0060 }
                org.threeten.bp.temporal.a r1 = org.threeten.bp.temporal.a.EPOCH_DAY     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x006c }
                org.threeten.bp.temporal.a r1 = org.threeten.bp.temporal.a.ALIGNED_WEEK_OF_YEAR     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0078 }
                org.threeten.bp.temporal.a r1 = org.threeten.bp.temporal.a.MONTH_OF_YEAR     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0084 }
                org.threeten.bp.temporal.a r1 = org.threeten.bp.temporal.a.YEAR     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0090 }
                org.threeten.bp.temporal.a r1 = org.threeten.bp.temporal.a.ERA     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.threeten.bp.s.k.a.<clinit>():void");
        }
    }

    static {
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int[] iArr = f11652n;
            if (i3 >= iArr.length) {
                break;
            }
            F[i3] = Integer.valueOf(iArr[i3]);
            i3++;
        }
        int i4 = 0;
        while (true) {
            int[] iArr2 = o;
            if (i4 >= iArr2.length) {
                break;
            }
            G[i4] = Integer.valueOf(iArr2[i4]);
            i4++;
        }
        int i5 = 0;
        while (true) {
            int[] iArr3 = p;
            if (i5 >= iArr3.length) {
                break;
            }
            H[i5] = Integer.valueOf(iArr3[i5]);
            i5++;
        }
        int i6 = 0;
        while (true) {
            int[] iArr4 = q;
            if (i6 >= iArr4.length) {
                break;
            }
            I[i6] = Integer.valueOf(iArr4[i6]);
            i6++;
        }
        int i7 = 0;
        while (true) {
            int[] iArr5 = u;
            if (i7 >= iArr5.length) {
                break;
            }
            J[i7] = Integer.valueOf(iArr5[i7]);
            i7++;
        }
        int i8 = 0;
        while (true) {
            Long[] lArr = B;
            if (i8 >= lArr.length) {
                break;
            }
            lArr[i8] = Long.valueOf((long) (i8 * 10631));
            i8++;
        }
        int i9 = 0;
        while (true) {
            int[] iArr6 = r;
            if (i9 >= iArr6.length) {
                break;
            }
            C[i9] = Integer.valueOf(iArr6[i9]);
            i9++;
        }
        int i10 = 0;
        while (true) {
            int[] iArr7 = s;
            if (i10 >= iArr7.length) {
                break;
            }
            D[i10] = Integer.valueOf(iArr7[i10]);
            i10++;
        }
        while (true) {
            int[] iArr8 = t;
            if (i2 < iArr8.length) {
                E[i2] = Integer.valueOf(iArr8[i2]);
                i2++;
            } else {
                try {
                    Q0();
                    return;
                } catch (IOException | ParseException unused) {
                    return;
                }
            }
        }
    }

    private k(long j2) {
        int[] v0 = v0(j2);
        f0(v0[1]);
        e0(v0[2]);
        c0(v0[3]);
        d0(v0[4]);
        this.f11653g = l.a(v0[0]);
        this.f11654h = v0[1];
        this.f11655i = v0[2];
        this.f11656j = v0[3];
        this.f11657k = v0[4];
        this.f11658l = b.a(v0[5]);
        this.f11659m = j2;
        D0((long) this.f11654h);
    }

    private static int A0(int i2, int i3) {
        Integer[] h0 = h0(i3);
        int i4 = 0;
        if (i2 >= 0) {
            while (i4 < h0.length) {
                if (i2 < h0[i4].intValue()) {
                    return i4 - 1;
                }
                i4++;
            }
            return 11;
        }
        int i5 = D0((long) i3) ? i2 + 355 : i2 + 354;
        while (i4 < h0.length) {
            if (i5 < h0[i4].intValue()) {
                return i4 - 1;
            }
            i4++;
        }
        return 11;
    }

    private static int B0(int i2, long j2) {
        Integer[] g0 = g0(i2);
        int i3 = 0;
        int i4 = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
        if (i4 == 0) {
            return 0;
        }
        if (i4 > 0) {
            while (i3 < g0.length) {
                if (j2 < ((long) g0[i3].intValue())) {
                    return i3 - 1;
                }
                i3++;
            }
            return 29;
        }
        long j3 = -j2;
        while (i3 < g0.length) {
            if (j3 <= ((long) g0[i3].intValue())) {
                return i3 - 1;
            }
            i3++;
        }
        return 29;
    }

    static int C0(int i2) {
        Integer[] numArr;
        int intValue;
        int intValue2;
        int i3 = i2 - 1;
        int i4 = i3 / 30;
        try {
            numArr = A.get(Integer.valueOf(i4));
        } catch (ArrayIndexOutOfBoundsException unused) {
            numArr = null;
        }
        if (numArr == null) {
            return D0((long) i2) ? 355 : 354;
        }
        int i5 = i3 % 30;
        if (i5 == 29) {
            intValue = B[i4 + 1].intValue() - B[i4].intValue();
            intValue2 = numArr[i5].intValue();
        } else {
            intValue = numArr[i5 + 1].intValue();
            intValue2 = numArr[i5].intValue();
        }
        return intValue - intValue2;
    }

    static boolean D0(long j2) {
        if (j2 <= 0) {
            j2 = -j2;
        }
        return ((j2 * 11) + 14) % 30 < 11;
    }

    public static k H0(int i2, int i3, int i4) {
        if (i2 >= 1) {
            return I0(l.AH, i2, i3, i4);
        }
        return I0(l.BEFORE_AH, 1 - i2, i3, i4);
    }

    static k I0(l lVar, int i2, int i3, int i4) {
        d.i(lVar, "era");
        f0(i2);
        e0(i3);
        c0(i4);
        return new k(u0(lVar.i(i2), i3, i4));
    }

    static k J0(long j2) {
        return new k(j2);
    }

    private static void K0(String str, int i2) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, ";");
        while (stringTokenizer.hasMoreTokens()) {
            String nextToken = stringTokenizer.nextToken();
            int indexOf = nextToken.indexOf(58);
            if (indexOf != -1) {
                try {
                    int parseInt = Integer.parseInt(nextToken.substring(indexOf + 1, nextToken.length()));
                    int indexOf2 = nextToken.indexOf(45);
                    if (indexOf2 != -1) {
                        String substring = nextToken.substring(0, indexOf2);
                        String substring2 = nextToken.substring(indexOf2 + 1, indexOf);
                        int indexOf3 = substring.indexOf(47);
                        int indexOf4 = substring2.indexOf(47);
                        if (indexOf3 != -1) {
                            String substring3 = substring.substring(0, indexOf3);
                            String substring4 = substring.substring(indexOf3 + 1, substring.length());
                            try {
                                int parseInt2 = Integer.parseInt(substring3);
                                try {
                                    int parseInt3 = Integer.parseInt(substring4);
                                    if (indexOf4 != -1) {
                                        String substring5 = substring2.substring(0, indexOf4);
                                        String substring6 = substring2.substring(indexOf4 + 1, substring2.length());
                                        try {
                                            int parseInt4 = Integer.parseInt(substring5);
                                            try {
                                                int parseInt5 = Integer.parseInt(substring6);
                                                if (parseInt2 == -1 || parseInt3 == -1 || parseInt4 == -1 || parseInt5 == -1) {
                                                    throw new ParseException("Unknown error at line " + i2 + ".", i2);
                                                }
                                                b0(parseInt2, parseInt3, parseInt4, parseInt5, parseInt);
                                            } catch (NumberFormatException unused) {
                                                throw new ParseException("End month is not properly set at line " + i2 + ".", i2);
                                            }
                                        } catch (NumberFormatException unused2) {
                                            throw new ParseException("End year is not properly set at line " + i2 + ".", i2);
                                        }
                                    } else {
                                        throw new ParseException("End year/month has incorrect format at line " + i2 + ".", i2);
                                    }
                                } catch (NumberFormatException unused3) {
                                    throw new ParseException("Start month is not properly set at line " + i2 + ".", i2);
                                }
                            } catch (NumberFormatException unused4) {
                                throw new ParseException("Start year is not properly set at line " + i2 + ".", i2);
                            }
                        } else {
                            throw new ParseException("Start year/month has incorrect format at line " + i2 + ".", i2);
                        }
                    } else {
                        throw new ParseException("Start and end year/month has incorrect format at line " + i2 + ".", i2);
                    }
                } catch (NumberFormatException unused5) {
                    throw new ParseException("Offset is not properly set at line " + i2 + ".", i2);
                }
            } else {
                throw new ParseException("Offset has incorrect format at line " + i2 + ".", i2);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void Q0() {
        /*
            java.io.InputStream r0 = m0()
            if (r0 == 0) goto L_0x0030
            r1 = 0
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ all -> 0x0029 }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ all -> 0x0029 }
            r3.<init>(r0)     // Catch:{ all -> 0x0029 }
            r2.<init>(r3)     // Catch:{ all -> 0x0029 }
            r0 = 0
        L_0x0012:
            java.lang.String r1 = r2.readLine()     // Catch:{ all -> 0x0026 }
            if (r1 == 0) goto L_0x0022
            int r0 = r0 + 1
            java.lang.String r1 = r1.trim()     // Catch:{ all -> 0x0026 }
            K0(r1, r0)     // Catch:{ all -> 0x0026 }
            goto L_0x0012
        L_0x0022:
            r2.close()
            goto L_0x0030
        L_0x0026:
            r0 = move-exception
            r1 = r2
            goto L_0x002a
        L_0x0029:
            r0 = move-exception
        L_0x002a:
            if (r1 == 0) goto L_0x002f
            r1.close()
        L_0x002f:
            throw r0
        L_0x0030:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.threeten.bp.s.k.Q0():void");
    }

    static b R0(DataInput dataInput) {
        return j.f11648i.f(dataInput.readInt(), dataInput.readByte(), dataInput.readByte());
    }

    private static k S0(int i2, int i3, int i4) {
        int y0 = y0(i3 - 1, i2);
        if (i4 > y0) {
            i4 = y0;
        }
        return H0(i2, i3, i4);
    }

    private static long W0(int i2) {
        Long l2;
        int i3 = i2 - 1;
        int i4 = i3 / 30;
        int i5 = i3 % 30;
        int intValue = g0(i4)[Math.abs(i5)].intValue();
        if (i5 < 0) {
            intValue = -intValue;
        }
        try {
            l2 = B[i4];
        } catch (ArrayIndexOutOfBoundsException unused) {
            l2 = null;
        }
        if (l2 == null) {
            l2 = Long.valueOf((long) (i4 * 10631));
        }
        return ((l2.longValue() + ((long) intValue)) - 492148) - 1;
    }

    private static void b0(int i2, int i3, int i4, int i5, int i6) {
        int i7 = i2;
        int i8 = i3;
        int i9 = i4;
        int i10 = i5;
        int i11 = i6;
        if (i7 < 1) {
            throw new IllegalArgumentException("startYear < 1");
        } else if (i9 < 1) {
            throw new IllegalArgumentException("endYear < 1");
        } else if (i8 < 0 || i8 > 11) {
            throw new IllegalArgumentException("startMonth < 0 || startMonth > 11");
        } else if (i10 < 0 || i10 > 11) {
            throw new IllegalArgumentException("endMonth < 0 || endMonth > 11");
        } else if (i9 > 9999) {
            throw new IllegalArgumentException("endYear > 9999");
        } else if (i9 < i7) {
            throw new IllegalArgumentException("startYear > endYear");
        } else if (i9 != i7 || i10 >= i8) {
            boolean D0 = D0((long) i7);
            Integer[] numArr = y.get(Integer.valueOf(i2));
            if (numArr == null) {
                if (!D0) {
                    numArr = new Integer[f11652n.length];
                    int i12 = 0;
                    while (true) {
                        int[] iArr = f11652n;
                        if (i12 >= iArr.length) {
                            break;
                        }
                        numArr[i12] = Integer.valueOf(iArr[i12]);
                        i12++;
                    }
                } else {
                    numArr = new Integer[o.length];
                    int i13 = 0;
                    while (true) {
                        int[] iArr2 = o;
                        if (i13 >= iArr2.length) {
                            break;
                        }
                        numArr[i13] = Integer.valueOf(iArr2[i13]);
                        i13++;
                    }
                }
            }
            Integer[] numArr2 = new Integer[numArr.length];
            for (int i14 = 0; i14 < 12; i14++) {
                if (i14 > i8) {
                    numArr2[i14] = Integer.valueOf(numArr[i14].intValue() - i11);
                } else {
                    numArr2[i14] = Integer.valueOf(numArr[i14].intValue());
                }
            }
            y.put(Integer.valueOf(i2), numArr2);
            Integer[] numArr3 = z.get(Integer.valueOf(i2));
            if (numArr3 == null) {
                if (!D0) {
                    numArr3 = new Integer[p.length];
                    int i15 = 0;
                    while (true) {
                        int[] iArr3 = p;
                        if (i15 >= iArr3.length) {
                            break;
                        }
                        numArr3[i15] = Integer.valueOf(iArr3[i15]);
                        i15++;
                    }
                } else {
                    numArr3 = new Integer[q.length];
                    int i16 = 0;
                    while (true) {
                        int[] iArr4 = q;
                        if (i16 >= iArr4.length) {
                            break;
                        }
                        numArr3[i16] = Integer.valueOf(iArr4[i16]);
                        i16++;
                    }
                }
            }
            Integer[] numArr4 = new Integer[numArr3.length];
            for (int i17 = 0; i17 < 12; i17++) {
                if (i17 == i8) {
                    numArr4[i17] = Integer.valueOf(numArr3[i17].intValue() - i11);
                } else {
                    numArr4[i17] = Integer.valueOf(numArr3[i17].intValue());
                }
            }
            z.put(Integer.valueOf(i2), numArr4);
            if (i7 != i9) {
                int i18 = i7 - 1;
                int i19 = i18 / 30;
                int i20 = i18 % 30;
                Integer[] numArr5 = A.get(Integer.valueOf(i19));
                if (numArr5 == null) {
                    int length = u.length;
                    Integer[] numArr6 = new Integer[length];
                    for (int i21 = 0; i21 < length; i21++) {
                        numArr6[i21] = Integer.valueOf(u[i21]);
                    }
                    numArr5 = numArr6;
                }
                for (int i22 = i20 + 1; i22 < u.length; i22++) {
                    numArr5[i22] = Integer.valueOf(numArr5[i22].intValue() - i11);
                }
                A.put(Integer.valueOf(i19), numArr5);
                int i23 = i9 - 1;
                int i24 = i23 / 30;
                if (i19 != i24) {
                    int i25 = i19 + 1;
                    while (true) {
                        Long[] lArr = B;
                        if (i25 >= lArr.length) {
                            break;
                        }
                        lArr[i25] = Long.valueOf(lArr[i25].longValue() - ((long) i11));
                        i25++;
                    }
                    int i26 = i24 + 1;
                    while (true) {
                        Long[] lArr2 = B;
                        if (i26 >= lArr2.length) {
                            break;
                        }
                        lArr2[i26] = Long.valueOf(lArr2[i26].longValue() + ((long) i11));
                        i26++;
                        i24 = i24;
                    }
                }
                int i27 = i24;
                int i28 = i23 % 30;
                Integer[] numArr7 = A.get(Integer.valueOf(i27));
                if (numArr7 == null) {
                    int length2 = u.length;
                    Integer[] numArr8 = new Integer[length2];
                    for (int i29 = 0; i29 < length2; i29++) {
                        numArr8[i29] = Integer.valueOf(u[i29]);
                    }
                    numArr7 = numArr8;
                }
                for (int i30 = i28 + 1; i30 < u.length; i30++) {
                    numArr7[i30] = Integer.valueOf(numArr7[i30].intValue() + i11);
                }
                A.put(Integer.valueOf(i27), numArr7);
            }
            boolean D02 = D0((long) i9);
            Integer[] numArr9 = y.get(Integer.valueOf(i4));
            if (numArr9 == null) {
                if (!D02) {
                    numArr9 = new Integer[f11652n.length];
                    int i31 = 0;
                    while (true) {
                        int[] iArr5 = f11652n;
                        if (i31 >= iArr5.length) {
                            break;
                        }
                        numArr9[i31] = Integer.valueOf(iArr5[i31]);
                        i31++;
                    }
                } else {
                    numArr9 = new Integer[o.length];
                    int i32 = 0;
                    while (true) {
                        int[] iArr6 = o;
                        if (i32 >= iArr6.length) {
                            break;
                        }
                        numArr9[i32] = Integer.valueOf(iArr6[i32]);
                        i32++;
                    }
                }
            }
            Integer[] numArr10 = new Integer[numArr9.length];
            for (int i33 = 0; i33 < 12; i33++) {
                if (i33 > i10) {
                    numArr10[i33] = Integer.valueOf(numArr9[i33].intValue() + i11);
                } else {
                    numArr10[i33] = Integer.valueOf(numArr9[i33].intValue());
                }
            }
            y.put(Integer.valueOf(i4), numArr10);
            Integer[] numArr11 = z.get(Integer.valueOf(i4));
            if (numArr11 == null) {
                if (!D02) {
                    numArr11 = new Integer[p.length];
                    int i34 = 0;
                    while (true) {
                        int[] iArr7 = p;
                        if (i34 >= iArr7.length) {
                            break;
                        }
                        numArr11[i34] = Integer.valueOf(iArr7[i34]);
                        i34++;
                    }
                } else {
                    numArr11 = new Integer[q.length];
                    int i35 = 0;
                    while (true) {
                        int[] iArr8 = q;
                        if (i35 >= iArr8.length) {
                            break;
                        }
                        numArr11[i35] = Integer.valueOf(iArr8[i35]);
                        i35++;
                    }
                }
            }
            Integer[] numArr12 = new Integer[numArr11.length];
            for (int i36 = 0; i36 < 12; i36++) {
                if (i36 == i10) {
                    numArr12[i36] = Integer.valueOf(numArr11[i36].intValue() + i11);
                } else {
                    numArr12[i36] = Integer.valueOf(numArr11[i36].intValue());
                }
            }
            z.put(Integer.valueOf(i4), numArr12);
            Integer[] numArr13 = z.get(Integer.valueOf(i2));
            Integer[] numArr14 = z.get(Integer.valueOf(i4));
            int intValue = numArr13[i8].intValue();
            int intValue2 = numArr14[i10].intValue();
            int intValue3 = y.get(Integer.valueOf(i2))[11].intValue() + numArr13[11].intValue();
            int intValue4 = y.get(Integer.valueOf(i4))[11].intValue() + numArr14[11].intValue();
            int intValue5 = E[5].intValue();
            int intValue6 = D[5].intValue();
            if (intValue5 < intValue) {
                intValue5 = intValue;
            }
            if (intValue5 < intValue2) {
                intValue5 = intValue2;
            }
            E[5] = Integer.valueOf(intValue5);
            if (intValue6 <= intValue) {
                intValue = intValue6;
            }
            if (intValue <= intValue2) {
                intValue2 = intValue;
            }
            D[5] = Integer.valueOf(intValue2);
            int intValue7 = E[6].intValue();
            int intValue8 = D[6].intValue();
            if (intValue7 < intValue3) {
                intValue7 = intValue3;
            }
            if (intValue7 < intValue4) {
                intValue7 = intValue4;
            }
            E[6] = Integer.valueOf(intValue7);
            if (intValue8 <= intValue3) {
                intValue3 = intValue8;
            }
            if (intValue3 <= intValue4) {
                intValue4 = intValue3;
            }
            D[6] = Integer.valueOf(intValue4);
        } else {
            throw new IllegalArgumentException("startYear == endYear && endMonth < startMonth");
        }
    }

    private static void c0(int i2) {
        if (i2 < 1 || i2 > w0()) {
            throw new DateTimeException("Invalid day of month of Hijrah date, day " + i2 + " greater than " + w0() + " or less than 1");
        }
    }

    private static void d0(int i2) {
        if (i2 < 1 || i2 > x0()) {
            throw new DateTimeException("Invalid day of year of Hijrah date");
        }
    }

    private static void e0(int i2) {
        if (i2 < 1 || i2 > 12) {
            throw new DateTimeException("Invalid month of Hijrah date");
        }
    }

    private static void f0(int i2) {
        if (i2 < 1 || i2 > 9999) {
            throw new DateTimeException("Invalid year of Hijrah Era");
        }
    }

    private static Integer[] g0(int i2) {
        Integer[] numArr;
        try {
            numArr = A.get(Integer.valueOf(i2));
        } catch (ArrayIndexOutOfBoundsException unused) {
            numArr = null;
        }
        return numArr == null ? J : numArr;
    }

    private static Integer[] h0(int i2) {
        Integer[] numArr;
        try {
            numArr = y.get(Integer.valueOf(i2));
        } catch (ArrayIndexOutOfBoundsException unused) {
            numArr = null;
        }
        if (numArr != null) {
            return numArr;
        }
        if (D0((long) i2)) {
            return G;
        }
        return F;
    }

    private static Integer[] j0(int i2) {
        Integer[] numArr;
        try {
            numArr = z.get(Integer.valueOf(i2));
        } catch (ArrayIndexOutOfBoundsException unused) {
            numArr = null;
        }
        if (numArr != null) {
            return numArr;
        }
        if (D0((long) i2)) {
            return I;
        }
        return H;
    }

    private static InputStream m0() {
        ZipFile zipFile;
        String property = System.getProperty("org.threeten.bp.i18n.HijrahDate.deviationConfigFile");
        if (property == null) {
            property = "hijrah_deviation.cfg";
        }
        String property2 = System.getProperty("org.threeten.bp.i18n.HijrahDate.deviationConfigDir");
        if (property2 != null) {
            if (property2.length() != 0 || !property2.endsWith(System.getProperty("file.separator"))) {
                property2 = property2 + System.getProperty("file.separator");
            }
            File file = new File(property2 + v + property);
            if (!file.exists()) {
                return null;
            }
            try {
                return new FileInputStream(file);
            } catch (IOException e2) {
                throw e2;
            }
        } else {
            StringTokenizer stringTokenizer = new StringTokenizer(System.getProperty("java.class.path"), w);
            while (stringTokenizer.hasMoreTokens()) {
                String nextToken = stringTokenizer.nextToken();
                File file2 = new File(nextToken);
                if (file2.exists()) {
                    if (file2.isDirectory()) {
                        if (new File(nextToken + v + x, property).exists()) {
                            try {
                                return new FileInputStream(nextToken + v + x + v + property);
                            } catch (IOException e3) {
                                throw e3;
                            }
                        }
                    } else {
                        try {
                            zipFile = new ZipFile(file2);
                        } catch (IOException unused) {
                            zipFile = null;
                        }
                        if (zipFile != null) {
                            String str = x + v + property;
                            ZipEntry entry = zipFile.getEntry(str);
                            if (entry == null) {
                                char c = v;
                                if (c == '/') {
                                    str = str.replace('/', '\\');
                                } else if (c == '\\') {
                                    str = str.replace('\\', '/');
                                }
                                entry = zipFile.getEntry(str);
                            }
                            if (entry != null) {
                                try {
                                    return zipFile.getInputStream(entry);
                                } catch (IOException e4) {
                                    throw e4;
                                }
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            return null;
        }
    }

    private static int o0(long j2) {
        Long[] lArr = B;
        int i2 = 0;
        while (i2 < lArr.length) {
            try {
                if (j2 < lArr[i2].longValue()) {
                    return i2 - 1;
                }
                i2++;
            } catch (ArrayIndexOutOfBoundsException unused) {
                return ((int) j2) / 10631;
            }
        }
        return ((int) j2) / 10631;
    }

    private static int p0(long j2, int i2) {
        Long l2;
        try {
            l2 = B[i2];
        } catch (ArrayIndexOutOfBoundsException unused) {
            l2 = null;
        }
        if (l2 == null) {
            l2 = Long.valueOf((long) (i2 * 10631));
        }
        return (int) (j2 - l2.longValue());
    }

    private static int q0(int i2, int i3, int i4) {
        int intValue;
        Integer[] h0 = h0(i4);
        if (i2 < 0) {
            i2 = D0((long) i4) ? i2 + 355 : i2 + 354;
            if (i3 <= 0) {
                return i2;
            }
            intValue = h0[i3].intValue();
        } else if (i3 <= 0) {
            return i2;
        } else {
            intValue = h0[i3].intValue();
        }
        return i2 - intValue;
    }

    private static int r0(int i2, int i3, int i4) {
        Integer[] g0 = g0(i2);
        if (i3 > 0) {
            return i3 - g0[i4].intValue();
        }
        return g0[i4].intValue() + i3;
    }

    private Object readResolve() {
        return new k(this.f11659m);
    }

    private static long u0(int i2, int i3, int i4) {
        return W0(i2) + ((long) y0(i3 - 1, i2)) + ((long) i4);
    }

    private static int[] v0(long j2) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        long j3 = j2 - -492148;
        if (j3 >= 0) {
            int o0 = o0(j3);
            int p0 = p0(j3, o0);
            int B0 = B0(o0, (long) p0);
            i5 = r0(o0, p0, B0);
            i6 = (o0 * 30) + B0 + 1;
            i4 = A0(i5, i6);
            i3 = q0(i5, i4, i6) + 1;
            i2 = l.AH.getValue();
        } else {
            int i7 = (int) j3;
            int i8 = i7 / 10631;
            int i9 = i7 % 10631;
            if (i9 == 0) {
                i9 = -10631;
                i8++;
            }
            int B02 = B0(i8, (long) i9);
            int r0 = r0(i8, i9, B02);
            int i10 = 1 - ((i8 * 30) - B02);
            int i11 = D0((long) i10) ? r0 + 355 : r0 + 354;
            i4 = A0(i11, i10);
            i3 = q0(i11, i4, i10) + 1;
            i2 = l.BEFORE_AH.getValue();
            int i12 = i10;
            i5 = i11;
            i6 = i12;
        }
        int i13 = (int) ((j3 + 5) % 7);
        return new int[]{i2, i6, i4 + 1, i3, i5 + 1, i13 + (i13 <= 0 ? 7 : 0)};
    }

    static int w0() {
        return E[5].intValue();
    }

    private Object writeReplace() {
        return new u((byte) 3, this);
    }

    static int x0() {
        return E[6].intValue();
    }

    private static int y0(int i2, int i3) {
        return h0(i3)[i2].intValue();
    }

    static int z0(int i2, int i3) {
        return j0(i3)[i2].intValue();
    }

    public final c<k> D(f fVar) {
        return super.D(fVar);
    }

    public int E0() {
        return z0(this.f11655i - 1, this.f11654h);
    }

    public int F0() {
        return C0(this.f11654h);
    }

    /* renamed from: G0 */
    public k x(long j2, l lVar) {
        return (k) super.x(j2, lVar);
    }

    /* renamed from: L0 */
    public k z(long j2, l lVar) {
        return (k) super.z(j2, lVar);
    }

    /* renamed from: M0 */
    public k S(h hVar) {
        return (k) super.S(hVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N0 */
    public k X(long j2) {
        return new k(this.f11659m + j2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O0 */
    public k Y(long j2) {
        if (j2 == 0) {
            return this;
        }
        int i2 = (this.f11655i - 1) + ((int) j2);
        int i3 = i2 / 12;
        int i4 = i2 % 12;
        while (i4 < 0) {
            i4 += 12;
            i3 = d.n(i3, 1);
        }
        return I0(this.f11653g, d.j(this.f11654h, i3), i4 + 1, this.f11656j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P0 */
    public k a0(long j2) {
        if (j2 == 0) {
            return this;
        }
        return I0(this.f11653g, d.j(this.f11654h, (int) j2), this.f11655i, this.f11656j);
    }

    public long T() {
        return u0(this.f11654h, this.f11655i, this.f11656j);
    }

    /* renamed from: T0 */
    public k p(org.threeten.bp.temporal.f fVar) {
        return (k) super.p(fVar);
    }

    /* renamed from: U0 */
    public k v(i iVar, long j2) {
        if (!(iVar instanceof org.threeten.bp.temporal.a)) {
            return (k) iVar.h(this, j2);
        }
        org.threeten.bp.temporal.a aVar = (org.threeten.bp.temporal.a) iVar;
        aVar.p(j2);
        int i2 = (int) j2;
        switch (a.a[aVar.ordinal()]) {
            case 1:
                return S0(this.f11654h, this.f11655i, i2);
            case 2:
                int i3 = i2 - 1;
                return S0(this.f11654h, (i3 / 30) + 1, (i3 % 30) + 1);
            case 3:
                return X((j2 - y(org.threeten.bp.temporal.a.ALIGNED_WEEK_OF_MONTH)) * 7);
            case 4:
                if (this.f11654h < 1) {
                    i2 = 1 - i2;
                }
                return S0(i2, this.f11655i, this.f11656j);
            case 5:
                return X(j2 - ((long) this.f11658l.getValue()));
            case 6:
                return X(j2 - y(org.threeten.bp.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 7:
                return X(j2 - y(org.threeten.bp.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 8:
                return new k((long) i2);
            case 9:
                return X((j2 - y(org.threeten.bp.temporal.a.ALIGNED_WEEK_OF_YEAR)) * 7);
            case 10:
                return S0(this.f11654h, i2, this.f11656j);
            case 11:
                return S0(i2, this.f11655i, this.f11656j);
            case 12:
                return S0(1 - this.f11654h, this.f11655i, this.f11656j);
            default:
                throw new UnsupportedTemporalTypeException("Unsupported field: " + iVar);
        }
    }

    /* access modifiers changed from: package-private */
    public void V0(DataOutput dataOutput) {
        dataOutput.writeInt(w(org.threeten.bp.temporal.a.YEAR));
        dataOutput.writeByte(w(org.threeten.bp.temporal.a.MONTH_OF_YEAR));
        dataOutput.writeByte(w(org.threeten.bp.temporal.a.DAY_OF_MONTH));
    }

    public m f(i iVar) {
        if (!(iVar instanceof org.threeten.bp.temporal.a)) {
            return iVar.k(this);
        }
        if (t(iVar)) {
            org.threeten.bp.temporal.a aVar = (org.threeten.bp.temporal.a) iVar;
            int i2 = a.a[aVar.ordinal()];
            if (i2 == 1) {
                return m.i(1, (long) E0());
            }
            if (i2 == 2) {
                return m.i(1, (long) F0());
            }
            if (i2 == 3) {
                return m.i(1, 5);
            }
            if (i2 != 4) {
                return G().G(aVar);
            }
            return m.i(1, 1000);
        }
        throw new UnsupportedTemporalTypeException("Unsupported field: " + iVar);
    }

    /* renamed from: k0 */
    public j G() {
        return j.f11648i;
    }

    /* renamed from: s0 */
    public l I() {
        return this.f11653g;
    }

    public long y(i iVar) {
        int i2;
        int i3;
        if (!(iVar instanceof org.threeten.bp.temporal.a)) {
            return iVar.i(this);
        }
        switch (a.a[((org.threeten.bp.temporal.a) iVar).ordinal()]) {
            case 1:
                i2 = this.f11656j;
                break;
            case 2:
                i2 = this.f11657k;
                break;
            case 3:
                i3 = (this.f11656j - 1) / 7;
                break;
            case 4:
                i2 = this.f11654h;
                break;
            case 5:
                i2 = this.f11658l.getValue();
                break;
            case 6:
                i3 = (this.f11656j - 1) % 7;
                break;
            case 7:
                i3 = (this.f11657k - 1) % 7;
                break;
            case 8:
                return T();
            case 9:
                i3 = (this.f11657k - 1) / 7;
                break;
            case 10:
                i2 = this.f11655i;
                break;
            case 11:
                i2 = this.f11654h;
                break;
            case 12:
                i2 = this.f11653g.getValue();
                break;
            default:
                throw new UnsupportedTemporalTypeException("Unsupported field: " + iVar);
        }
        i2 = i3 + 1;
        return (long) i2;
    }
}
