package l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;
import kotlin.TypeCastException;
import kotlin.a0.d;
import kotlin.jvm.internal.k;

/* compiled from: Options.kt */
public final class s extends d<i> implements RandomAccess {

    /* renamed from: j  reason: collision with root package name */
    public static final a f11122j = new a((DefaultConstructorMarker) null);

    /* renamed from: h  reason: collision with root package name */
    private final i[] f11123h;

    /* renamed from: i  reason: collision with root package name */
    private final int[] f11124i;

    /* compiled from: Options.kt */
    public static final class a {
        private a() {
        }

        private final void a(long j2, f fVar, int i2, List<? extends i> list, int i3, int i4, List<Integer> list2) {
            int i5;
            int i6;
            int i7;
            int i8;
            f fVar2;
            f fVar3 = fVar;
            int i9 = i2;
            List<? extends i> list3 = list;
            int i10 = i3;
            int i11 = i4;
            List<Integer> list4 = list2;
            if (i10 < i11) {
                int i12 = i10;
                while (i12 < i11) {
                    if (((i) list3.get(i12)).G() >= i9) {
                        i12++;
                    } else {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                }
                i iVar = (i) list.get(i3);
                i iVar2 = (i) list3.get(i11 - 1);
                if (i9 == iVar.G()) {
                    int intValue = list4.get(i10).intValue();
                    int i13 = i10 + 1;
                    i5 = i13;
                    i6 = intValue;
                    iVar = (i) list3.get(i13);
                } else {
                    i5 = i10;
                    i6 = -1;
                }
                if (iVar.l(i9) != iVar2.l(i9)) {
                    int i14 = 1;
                    for (int i15 = i5 + 1; i15 < i11; i15++) {
                        if (((i) list3.get(i15 - 1)).l(i9) != ((i) list3.get(i15)).l(i9)) {
                            i14++;
                        }
                    }
                    long c = j2 + c(fVar3) + ((long) 2) + ((long) (i14 * 2));
                    fVar3.d1(i14);
                    fVar3.d1(i6);
                    for (int i16 = i5; i16 < i11; i16++) {
                        byte l2 = ((i) list3.get(i16)).l(i9);
                        if (i16 == i5 || l2 != ((i) list3.get(i16 - 1)).l(i9)) {
                            fVar3.d1(l2 & 255);
                        }
                    }
                    f fVar4 = new f();
                    while (i5 < i11) {
                        byte l3 = ((i) list3.get(i5)).l(i9);
                        int i17 = i5 + 1;
                        int i18 = i17;
                        while (true) {
                            if (i18 >= i11) {
                                i7 = i11;
                                break;
                            } else if (l3 != ((i) list3.get(i18)).l(i9)) {
                                i7 = i18;
                                break;
                            } else {
                                i18++;
                            }
                        }
                        if (i17 == i7 && i9 + 1 == ((i) list3.get(i5)).G()) {
                            fVar3.d1(list4.get(i5).intValue());
                            i8 = i7;
                            fVar2 = fVar4;
                        } else {
                            fVar3.d1(((int) (c + c(fVar4))) * -1);
                            i8 = i7;
                            fVar2 = fVar4;
                            a(c, fVar4, i9 + 1, list, i5, i7, list2);
                        }
                        fVar4 = fVar2;
                        i5 = i8;
                    }
                    fVar3.t(fVar4);
                    return;
                }
                int min = Math.min(iVar.G(), iVar2.G());
                int i19 = i9;
                int i20 = 0;
                while (i19 < min && iVar.l(i19) == iVar2.l(i19)) {
                    i20++;
                    i19++;
                }
                long c2 = j2 + c(fVar3) + ((long) 2) + ((long) i20) + 1;
                fVar3.d1(-i20);
                fVar3.d1(i6);
                int i21 = i9 + i20;
                while (i9 < i21) {
                    fVar3.d1(iVar.l(i9) & 255);
                    i9++;
                }
                if (i5 + 1 == i11) {
                    if (i21 == ((i) list3.get(i5)).G()) {
                        fVar3.d1(list4.get(i5).intValue());
                        return;
                    }
                    throw new IllegalStateException("Check failed.".toString());
                }
                f fVar5 = new f();
                fVar3.d1(((int) (c(fVar5) + c2)) * -1);
                a(c2, fVar5, i21, list, i5, i4, list2);
                fVar3.t(fVar5);
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        static /* synthetic */ void b(a aVar, long j2, f fVar, int i2, List list, int i3, int i4, List list2, int i5, Object obj) {
            aVar.a((i5 & 1) != 0 ? 0 : j2, fVar, (i5 & 4) != 0 ? 0 : i2, list, (i5 & 16) != 0 ? 0 : i3, (i5 & 32) != 0 ? list.size() : i4, list2);
        }

        private final long c(f fVar) {
            return fVar.T0() / ((long) 4);
        }

        public final s d(i... iVarArr) {
            i[] iVarArr2 = iVarArr;
            k.f(iVarArr2, "byteStrings");
            int i2 = 0;
            if (iVarArr2.length == 0) {
                return new s(new i[0], new int[]{0, -1}, (DefaultConstructorMarker) null);
            }
            List G = j.G(iVarArr);
            r.q(G);
            ArrayList arrayList = new ArrayList(iVarArr2.length);
            for (i iVar : iVarArr2) {
                arrayList.add(-1);
            }
            Object[] array = arrayList.toArray(new Integer[0]);
            if (array != null) {
                Integer[] numArr = (Integer[]) array;
                List k2 = n.k((Integer[]) Arrays.copyOf(numArr, numArr.length));
                int length = iVarArr2.length;
                int i3 = 0;
                int i4 = 0;
                while (i3 < length) {
                    k2.set(n.f(G, iVarArr2[i3], 0, 0, 6, (Object) null), Integer.valueOf(i4));
                    i3++;
                    i4++;
                }
                if (((i) G.get(0)).G() > 0) {
                    int i5 = 0;
                    while (i5 < G.size()) {
                        i iVar2 = (i) G.get(i5);
                        int i6 = i5 + 1;
                        int i7 = i6;
                        while (i7 < G.size()) {
                            i iVar3 = (i) G.get(i7);
                            if (!iVar3.I(iVar2)) {
                                continue;
                                break;
                            }
                            if (!(iVar3.G() != iVar2.G())) {
                                throw new IllegalArgumentException(("duplicate option: " + iVar3).toString());
                            } else if (((Number) k2.get(i7)).intValue() > ((Number) k2.get(i5)).intValue()) {
                                G.remove(i7);
                                k2.remove(i7);
                            } else {
                                i7++;
                            }
                        }
                        i5 = i6;
                    }
                    f fVar = new f();
                    b(this, 0, fVar, 0, G, 0, 0, k2, 53, (Object) null);
                    int[] iArr = new int[((int) c(fVar))];
                    while (!fVar.Q()) {
                        iArr[i2] = fVar.readInt();
                        i2++;
                    }
                    Object[] copyOf = Arrays.copyOf(iVarArr2, iVarArr2.length);
                    k.b(copyOf, "java.util.Arrays.copyOf(this, size)");
                    return new s((i[]) copyOf, iArr, (DefaultConstructorMarker) null);
                }
                throw new IllegalArgumentException("the empty byte string is not a supported option".toString());
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ s(i[] iVarArr, int[] iArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(iVarArr, iArr);
    }

    public static final s l(i... iVarArr) {
        return f11122j.d(iVarArr);
    }

    public int a() {
        return this.f11123h.length;
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof i) {
            return d((i) obj);
        }
        return false;
    }

    public /* bridge */ boolean d(i iVar) {
        return super.contains(iVar);
    }

    /* renamed from: e */
    public i get(int i2) {
        return this.f11123h[i2];
    }

    public final i[] g() {
        return this.f11123h;
    }

    public final int[] i() {
        return this.f11124i;
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof i) {
            return j((i) obj);
        }
        return -1;
    }

    public /* bridge */ int j(i iVar) {
        return super.indexOf(iVar);
    }

    public /* bridge */ int k(i iVar) {
        return super.lastIndexOf(iVar);
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof i) {
            return k((i) obj);
        }
        return -1;
    }

    private s(i[] iVarArr, int[] iArr) {
        this.f11123h = iVarArr;
        this.f11124i = iArr;
    }
}
