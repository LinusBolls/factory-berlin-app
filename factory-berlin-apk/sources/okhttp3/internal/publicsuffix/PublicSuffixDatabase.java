package okhttp3.internal.publicsuffix;

import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import k.h0.b;
import kotlin.e0.c.l;
import kotlin.i;
import kotlin.jvm.internal.k;

@i(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001c:\u0001\u001cB\u0007¢\u0006\u0004\b\u001b\u0010\u000bJ#\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u000f\u001a\u00020\r8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u000f\u0010\u0017R\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u000e\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "", "", "domainLabels", "findMatchingRule", "(Ljava/util/List;)Ljava/util/List;", "domain", "getEffectiveTldPlusOne", "(Ljava/lang/String;)Ljava/lang/String;", "", "readTheList", "()V", "readTheListUninterruptibly", "", "publicSuffixListBytes", "publicSuffixExceptionListBytes", "setListBytes", "([B[B)V", "splitDomain", "(Ljava/lang/String;)Ljava/util/List;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "listRead", "Ljava/util/concurrent/atomic/AtomicBoolean;", "[B", "Ljava/util/concurrent/CountDownLatch;", "readCompleteLatch", "Ljava/util/concurrent/CountDownLatch;", "<init>", "Companion", "okhttp"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
/* compiled from: PublicSuffixDatabase.kt */
public final class PublicSuffixDatabase {

    /* renamed from: e  reason: collision with root package name */
    private static final byte[] f11455e = {(byte) 42};

    /* renamed from: f  reason: collision with root package name */
    private static final List<String> f11456f = m.b("*");
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final PublicSuffixDatabase f11457g = new PublicSuffixDatabase();

    /* renamed from: h  reason: collision with root package name */
    public static final a f11458h = new a((DefaultConstructorMarker) null);
    private final AtomicBoolean a = new AtomicBoolean(false);
    private final CountDownLatch b = new CountDownLatch(1);
    private byte[] c;

    /* renamed from: d  reason: collision with root package name */
    private byte[] f11459d;

    /* compiled from: PublicSuffixDatabase.kt */
    public static final class a {
        private a() {
        }

        /* access modifiers changed from: private */
        public final String b(byte[] bArr, byte[][] bArr2, int i2) {
            int i3;
            boolean z;
            int i4;
            int b;
            byte[] bArr3 = bArr;
            byte[][] bArr4 = bArr2;
            int length = bArr3.length;
            int i5 = 0;
            while (i5 < length) {
                int i6 = (i5 + length) / 2;
                while (i6 > -1 && bArr3[i6] != ((byte) 10)) {
                    i6--;
                }
                int i7 = i6 + 1;
                int i8 = 1;
                while (true) {
                    i3 = i7 + i8;
                    if (bArr3[i3] == ((byte) 10)) {
                        break;
                    }
                    i8++;
                }
                int i9 = i3 - i7;
                int i10 = i2;
                boolean z2 = false;
                int i11 = 0;
                int i12 = 0;
                while (true) {
                    if (z2) {
                        i4 = 46;
                        z = false;
                    } else {
                        z = z2;
                        i4 = b.b(bArr4[i10][i11], 255);
                    }
                    b = i4 - b.b(bArr3[i7 + i12], 255);
                    if (b == 0) {
                        i12++;
                        i11++;
                        if (i12 == i9) {
                            break;
                        } else if (bArr4[i10].length != i11) {
                            z2 = z;
                        } else if (i10 == bArr4.length - 1) {
                            break;
                        } else {
                            i10++;
                            z2 = true;
                            i11 = -1;
                        }
                    } else {
                        break;
                    }
                }
                if (b >= 0) {
                    if (b <= 0) {
                        int i13 = i9 - i12;
                        int length2 = bArr4[i10].length - i11;
                        int length3 = bArr4.length;
                        for (int i14 = i10 + 1; i14 < length3; i14++) {
                            length2 += bArr4[i14].length;
                        }
                        if (length2 >= i13) {
                            if (length2 <= i13) {
                                Charset charset = StandardCharsets.UTF_8;
                                k.b(charset, "UTF_8");
                                return new String(bArr3, i7, i9, charset);
                            }
                        }
                    }
                    i5 = i3 + 1;
                }
                length = i7 - 1;
            }
            return null;
        }

        public final PublicSuffixDatabase c() {
            return PublicSuffixDatabase.f11457g;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00df  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.List<java.lang.String> b(java.util.List<java.lang.String> r18) {
        /*
            r17 = this;
            r0 = r17
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.a
            boolean r1 = r1.get()
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L_0x0018
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.a
            boolean r1 = r1.compareAndSet(r2, r3)
            if (r1 == 0) goto L_0x0018
            r17.e()
            goto L_0x0025
        L_0x0018:
            java.util.concurrent.CountDownLatch r1 = r0.b     // Catch:{ InterruptedException -> 0x001e }
            r1.await()     // Catch:{ InterruptedException -> 0x001e }
            goto L_0x0025
        L_0x001e:
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
        L_0x0025:
            byte[] r1 = r0.c
            if (r1 == 0) goto L_0x002b
            r1 = 1
            goto L_0x002c
        L_0x002b:
            r1 = 0
        L_0x002c:
            if (r1 == 0) goto L_0x0121
            int r1 = r18.size()
            byte[][] r4 = new byte[r1][]
            r5 = 0
        L_0x0035:
            if (r5 >= r1) goto L_0x005e
            r6 = r18
            java.lang.Object r7 = r6.get(r5)
            java.lang.String r7 = (java.lang.String) r7
            java.nio.charset.Charset r8 = java.nio.charset.StandardCharsets.UTF_8
            java.lang.String r9 = "UTF_8"
            kotlin.jvm.internal.k.b(r8, r9)
            if (r7 == 0) goto L_0x0056
            byte[] r7 = r7.getBytes(r8)
            java.lang.String r8 = "(this as java.lang.String).getBytes(charset)"
            kotlin.jvm.internal.k.b(r7, r8)
            r4[r5] = r7
            int r5 = r5 + 1
            goto L_0x0035
        L_0x0056:
            kotlin.TypeCastException r1 = new kotlin.TypeCastException
            java.lang.String r2 = "null cannot be cast to non-null type java.lang.String"
            r1.<init>(r2)
            throw r1
        L_0x005e:
            r5 = 0
        L_0x005f:
            java.lang.String r6 = "publicSuffixListBytes"
            r7 = 0
            if (r5 >= r1) goto L_0x0078
            okhttp3.internal.publicsuffix.PublicSuffixDatabase$a r8 = f11458h
            byte[] r9 = r0.c
            if (r9 == 0) goto L_0x0074
            java.lang.String r8 = r8.b(r9, r4, r5)
            if (r8 == 0) goto L_0x0071
            goto L_0x0079
        L_0x0071:
            int r5 = r5 + 1
            goto L_0x005f
        L_0x0074:
            kotlin.jvm.internal.k.q(r6)
            throw r7
        L_0x0078:
            r8 = r7
        L_0x0079:
            if (r1 <= r3) goto L_0x009f
            java.lang.Object r5 = r4.clone()
            byte[][] r5 = (byte[][]) r5
            int r9 = r5.length
            int r9 = r9 - r3
            r10 = 0
        L_0x0084:
            if (r10 >= r9) goto L_0x009f
            byte[] r11 = f11455e
            r5[r10] = r11
            okhttp3.internal.publicsuffix.PublicSuffixDatabase$a r11 = f11458h
            byte[] r12 = r0.c
            if (r12 == 0) goto L_0x009b
            java.lang.String r11 = r11.b(r12, r5, r10)
            if (r11 == 0) goto L_0x0098
            r5 = r11
            goto L_0x00a0
        L_0x0098:
            int r10 = r10 + 1
            goto L_0x0084
        L_0x009b:
            kotlin.jvm.internal.k.q(r6)
            throw r7
        L_0x009f:
            r5 = r7
        L_0x00a0:
            if (r5 == 0) goto L_0x00bd
            int r1 = r1 - r3
            r6 = 0
        L_0x00a4:
            if (r6 >= r1) goto L_0x00bd
            okhttp3.internal.publicsuffix.PublicSuffixDatabase$a r9 = f11458h
            byte[] r10 = r0.f11459d
            if (r10 == 0) goto L_0x00b7
            java.lang.String r9 = r9.b(r10, r4, r6)
            if (r9 == 0) goto L_0x00b4
            r7 = r9
            goto L_0x00bd
        L_0x00b4:
            int r6 = r6 + 1
            goto L_0x00a4
        L_0x00b7:
            java.lang.String r1 = "publicSuffixExceptionListBytes"
            kotlin.jvm.internal.k.q(r1)
            throw r7
        L_0x00bd:
            r1 = 46
            if (r7 == 0) goto L_0x00df
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r5 = 33
            r4.append(r5)
            r4.append(r7)
            java.lang.String r8 = r4.toString()
            char[] r9 = new char[r3]
            r9[r2] = r1
            r10 = 0
            r11 = 0
            r12 = 6
            r13 = 0
            java.util.List r1 = kotlin.j0.q.m0(r8, r9, r10, r11, r12, r13)
            return r1
        L_0x00df:
            if (r8 != 0) goto L_0x00e6
            if (r5 != 0) goto L_0x00e6
            java.util.List<java.lang.String> r1 = f11456f
            return r1
        L_0x00e6:
            if (r8 == 0) goto L_0x00f9
            char[] r7 = new char[r3]
            r7[r2] = r1
            r4 = 0
            r9 = 0
            r10 = 6
            r11 = 0
            r6 = r8
            r8 = r4
            java.util.List r4 = kotlin.j0.q.m0(r6, r7, r8, r9, r10, r11)
            if (r4 == 0) goto L_0x00f9
            goto L_0x00fd
        L_0x00f9:
            java.util.List r4 = kotlin.a0.n.g()
        L_0x00fd:
            if (r5 == 0) goto L_0x0110
            char[] r12 = new char[r3]
            r12[r2] = r1
            r13 = 0
            r14 = 0
            r15 = 6
            r16 = 0
            r11 = r5
            java.util.List r1 = kotlin.j0.q.m0(r11, r12, r13, r14, r15, r16)
            if (r1 == 0) goto L_0x0110
            goto L_0x0114
        L_0x0110:
            java.util.List r1 = kotlin.a0.n.g()
        L_0x0114:
            int r2 = r4.size()
            int r3 = r1.size()
            if (r2 <= r3) goto L_0x011f
            goto L_0x0120
        L_0x011f:
            r4 = r1
        L_0x0120:
            return r4
        L_0x0121:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Unable to load publicsuffixes.gz resource from the classpath."
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.publicsuffix.PublicSuffixDatabase.b(java.util.List):java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004f, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0050, code lost:
        kotlin.io.a.a(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0053, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void d() {
        /*
            r4 = this;
            java.lang.Class<okhttp3.internal.publicsuffix.PublicSuffixDatabase> r0 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.class
            java.lang.String r1 = "publicsuffixes.gz"
            java.io.InputStream r0 = r0.getResourceAsStream(r1)
            if (r0 == 0) goto L_0x0054
            l.m r1 = new l.m
            l.b0 r0 = l.p.l(r0)
            r1.<init>(r0)
            l.h r0 = l.p.d(r1)
            int r1 = r0.readInt()     // Catch:{ all -> 0x004d }
            long r1 = (long) r1     // Catch:{ all -> 0x004d }
            byte[] r1 = r0.S(r1)     // Catch:{ all -> 0x004d }
            int r2 = r0.readInt()     // Catch:{ all -> 0x004d }
            long r2 = (long) r2     // Catch:{ all -> 0x004d }
            byte[] r2 = r0.S(r2)     // Catch:{ all -> 0x004d }
            kotlin.x r3 = kotlin.x.a     // Catch:{ all -> 0x004d }
            r3 = 0
            kotlin.io.a.a(r0, r3)
            monitor-enter(r4)
            if (r1 == 0) goto L_0x0047
            r4.c = r1     // Catch:{ all -> 0x0045 }
            if (r2 == 0) goto L_0x0041
            r4.f11459d = r2     // Catch:{ all -> 0x0045 }
            kotlin.x r0 = kotlin.x.a     // Catch:{ all -> 0x0045 }
            monitor-exit(r4)
            java.util.concurrent.CountDownLatch r0 = r4.b
            r0.countDown()
            return
        L_0x0041:
            kotlin.jvm.internal.k.m()     // Catch:{ all -> 0x0045 }
            throw r3
        L_0x0045:
            r0 = move-exception
            goto L_0x004b
        L_0x0047:
            kotlin.jvm.internal.k.m()     // Catch:{ all -> 0x0045 }
            throw r3
        L_0x004b:
            monitor-exit(r4)
            throw r0
        L_0x004d:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x004f }
        L_0x004f:
            r2 = move-exception
            kotlin.io.a.a(r0, r1)
            throw r2
        L_0x0054:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.publicsuffix.PublicSuffixDatabase.d():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0027 */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void e() {
        /*
            r5 = this;
            r0 = 0
        L_0x0001:
            r5.d()     // Catch:{  }
            if (r0 == 0) goto L_0x000d
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch:{ InterruptedIOException -> 0x0027, IOException -> 0x0010 }
            r1.interrupt()     // Catch:{ InterruptedIOException -> 0x0027, IOException -> 0x0010 }
        L_0x000d:
            return
        L_0x000e:
            r1 = move-exception
            goto L_0x002c
        L_0x0010:
            r1 = move-exception
            k.h0.i.h$a r2 = k.h0.i.h.c     // Catch:{ all -> 0x000e }
            k.h0.i.h r2 = r2.g()     // Catch:{ all -> 0x000e }
            java.lang.String r3 = "Failed to read public suffix list"
            r4 = 5
            r2.k(r3, r4, r1)     // Catch:{ all -> 0x000e }
            if (r0 == 0) goto L_0x0026
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x0026:
            return
        L_0x0027:
            java.lang.Thread.interrupted()     // Catch:{ all -> 0x000e }
            r0 = 1
            goto L_0x0001
        L_0x002c:
            if (r0 == 0) goto L_0x0035
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x0035:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.publicsuffix.PublicSuffixDatabase.e():void");
    }

    private final List<String> f(String str) {
        List<String> m0 = q.m0(str, new char[]{'.'}, false, 0, 6, (Object) null);
        return k.a((String) v.G(m0), "") ? v.v(m0, 1) : m0;
    }

    public final String c(String str) {
        int i2;
        int i3;
        k.f(str, "domain");
        String unicode = IDN.toUnicode(str);
        k.b(unicode, "unicodeDomain");
        List<String> f2 = f(unicode);
        List<String> b2 = b(f2);
        if (f2.size() == b2.size() && b2.get(0).charAt(0) != '!') {
            return null;
        }
        if (b2.get(0).charAt(0) == '!') {
            i3 = f2.size();
            i2 = b2.size();
        } else {
            i3 = f2.size();
            i2 = b2.size() + 1;
        }
        return j.g(j.d(v.u(f(str)), i3 - i2), ".", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 62, (Object) null);
    }
}
