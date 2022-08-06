package de.baimos;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

public class cl extends ci {
    protected final byte[] a = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
    protected byte b = 61;
    protected final byte[] c = new byte[128];

    public cl() {
        a();
    }

    private int a(OutputStream outputStream, char c2, char c3, char c4, char c5) {
        byte b2 = this.b;
        if (c4 == b2) {
            byte[] bArr = this.c;
            outputStream.write((bArr[c2] << 2) | (bArr[c3] >> 4));
            return 1;
        } else if (c5 == b2) {
            byte[] bArr2 = this.c;
            byte b3 = bArr2[c2];
            byte b4 = bArr2[c3];
            byte b5 = bArr2[c4];
            outputStream.write((b3 << 2) | (b4 >> 4));
            outputStream.write((b4 << 4) | (b5 >> 2));
            return 2;
        } else {
            byte[] bArr3 = this.c;
            byte b6 = bArr3[c2];
            byte b7 = bArr3[c3];
            byte b8 = bArr3[c4];
            byte b9 = bArr3[c5];
            outputStream.write((b6 << 2) | (b7 >> 4));
            outputStream.write((b7 << 4) | (b8 >> 2));
            outputStream.write((b8 << 6) | b9);
            return 3;
        }
    }

    private int a(byte[] bArr, int i2, int i3) {
        while (i2 < i3 && a((char) bArr[i2])) {
            i2++;
        }
        return i2;
    }

    private boolean a(char c2) {
        return c2 == 10 || c2 == 13 || c2 == 9 || c2 == ' ';
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x00a4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int a(byte[] r10, int r11, int r12, java.io.OutputStream r13) {
        /*
            r9 = this;
            int r0 = r12 % 3
            int r12 = r12 - r0
            r1 = r11
        L_0x0004:
            int r2 = r11 + r12
            r3 = 4
            r4 = 2
            if (r1 >= r2) goto L_0x004c
            byte r2 = r10[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r5 = r1 + 1
            byte r5 = r10[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r6 = r1 + 2
            byte r6 = r10[r6]
            r6 = r6 & 255(0xff, float:3.57E-43)
            byte[] r7 = r9.a
            int r8 = r2 >>> 2
            r8 = r8 & 63
            byte r7 = r7[r8]
            r13.write(r7)
            byte[] r7 = r9.a
            int r2 = r2 << r3
            int r3 = r5 >>> 4
            r2 = r2 | r3
            r2 = r2 & 63
            byte r2 = r7[r2]
            r13.write(r2)
            byte[] r2 = r9.a
            int r3 = r5 << 2
            int r4 = r6 >>> 6
            r3 = r3 | r4
            r3 = r3 & 63
            byte r2 = r2[r3]
            r13.write(r2)
            byte[] r2 = r9.a
            r3 = r6 & 63
            byte r2 = r2[r3]
            r13.write(r2)
            int r1 = r1 + 3
            goto L_0x0004
        L_0x004c:
            r11 = 1
            if (r0 == r11) goto L_0x007b
            if (r0 == r4) goto L_0x0052
            goto L_0x009e
        L_0x0052:
            byte r1 = r10[r2]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r2 = r2 + r11
            byte r10 = r10[r2]
            r10 = r10 & 255(0xff, float:3.57E-43)
            int r11 = r1 >>> 2
            r11 = r11 & 63
            int r1 = r1 << r3
            int r2 = r10 >>> 4
            r1 = r1 | r2
            r1 = r1 & 63
            int r10 = r10 << r4
            r10 = r10 & 63
            byte[] r2 = r9.a
            byte r11 = r2[r11]
            r13.write(r11)
            byte[] r11 = r9.a
            byte r11 = r11[r1]
            r13.write(r11)
            byte[] r11 = r9.a
            byte r10 = r11[r10]
            goto L_0x0096
        L_0x007b:
            byte r10 = r10[r2]
            r10 = r10 & 255(0xff, float:3.57E-43)
            int r11 = r10 >>> 2
            r11 = r11 & 63
            int r10 = r10 << r3
            r10 = r10 & 63
            byte[] r1 = r9.a
            byte r11 = r1[r11]
            r13.write(r11)
            byte[] r11 = r9.a
            byte r10 = r11[r10]
            r13.write(r10)
            byte r10 = r9.b
        L_0x0096:
            r13.write(r10)
            byte r10 = r9.b
            r13.write(r10)
        L_0x009e:
            int r12 = r12 / 3
            int r12 = r12 * 4
            if (r0 != 0) goto L_0x00a5
            r3 = 0
        L_0x00a5:
            int r12 = r12 + r3
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: de.baimos.cl.a(byte[], int, int, java.io.OutputStream):int");
    }

    /* access modifiers changed from: protected */
    public void a() {
        int i2 = 0;
        while (true) {
            byte[] bArr = this.a;
            if (i2 < bArr.length) {
                this.c[bArr[i2]] = (byte) i2;
                i2++;
            } else {
                return;
            }
        }
    }

    public byte[] a(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(((bArr.length + 2) / 3) * 4);
            a(bArr, 0, bArr.length, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e2) {
            throw new ck("", e2);
        }
    }

    public int b(byte[] bArr, int i2, int i3, OutputStream outputStream) {
        int i4 = i3 + i2;
        while (i4 > i2 && a((char) bArr[i4 - 1])) {
            i4--;
        }
        int i5 = i4 - 4;
        int a2 = a(bArr, i2, i5);
        int i6 = 0;
        while (a2 < i5) {
            int i7 = a2 + 1;
            byte b2 = this.c[bArr[a2]];
            int a3 = a(bArr, i7, i5);
            int i8 = a3 + 1;
            byte b3 = this.c[bArr[a3]];
            int a4 = a(bArr, i8, i5);
            int i9 = a4 + 1;
            byte b4 = this.c[bArr[a4]];
            int a5 = a(bArr, i9, i5);
            int i10 = a5 + 1;
            byte b5 = this.c[bArr[a5]];
            outputStream.write((b2 << 2) | (b3 >> 4));
            outputStream.write((b3 << 4) | (b4 >> 2));
            outputStream.write((b4 << 6) | b5);
            i6 += 3;
            a2 = a(bArr, i10, i5);
        }
        return i6 + a(outputStream, (char) bArr[i5], (char) bArr[i4 - 3], (char) bArr[i4 - 2], (char) bArr[i4 - 1]);
    }

    public byte[] b(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((bArr.length / 4) * 3);
            b(bArr, 0, bArr.length, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e2) {
            throw new cj("" + e2);
        }
    }
}
