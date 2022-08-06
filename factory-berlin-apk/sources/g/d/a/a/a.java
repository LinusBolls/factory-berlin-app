package g.d.a.a;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class a {
    public static byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[(bArr.length + bArr2.length)];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return bArr3;
    }

    public static int b(byte[] bArr) {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.put(bArr[0]);
        allocate.put(bArr[1]);
        allocate.put(bArr[2]);
        allocate.put(bArr[3]);
        return allocate.getInt(0);
    }

    public static short c(byte[] bArr) {
        ByteBuffer allocate = ByteBuffer.allocate(2);
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.put(bArr[0]);
        allocate.put(bArr[1]);
        return allocate.getShort(0);
    }

    public static byte[] d(String str) {
        int length = str.length();
        byte[] bArr = new byte[(length / 2)];
        for (int i2 = 0; i2 < length; i2 += 2) {
            bArr[i2 / 2] = (byte) ((Character.digit(str.charAt(i2), 16) << 4) + Character.digit(str.charAt(i2 + 1), 16));
        }
        return bArr;
    }

    public static byte[] e(int i2) {
        return new byte[]{(byte) ((i2 >> 24) & 255), (byte) ((i2 >> 16) & 255), (byte) ((i2 >> 8) & 255), (byte) (i2 & 255)};
    }

    public static byte[] f(short s) {
        return new byte[]{(byte) ((s >> 8) & 255), (byte) (s & 255)};
    }
}
