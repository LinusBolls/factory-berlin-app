package de.baimos;

import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public final class cq {
    private static final dr a = ds.a(cq.class);

    private cq() {
    }

    public static void a(InputStream inputStream, byte[] bArr) {
        a(inputStream, bArr, 0, bArr.length);
    }

    public static void a(InputStream inputStream, byte[] bArr, int i2, int i3) {
        if (i3 >= 0) {
            while (i3 > 0) {
                int read = inputStream.read(bArr, i2, i3);
                if (read >= 0) {
                    i3 -= read;
                    i2 += read;
                } else {
                    throw new EOFException();
                }
            }
            return;
        }
        throw new IndexOutOfBoundsException("Negative length: " + i3);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:1|2|3|4|9) */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0009, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        a.b("failed to close connection", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0005 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(java.io.OutputStream r2) {
        /*
            if (r2 == 0) goto L_0x0011
            r2.flush()     // Catch:{ IOException -> 0x0005 }
        L_0x0005:
            r2.close()     // Catch:{ IOException -> 0x0009 }
            goto L_0x0011
        L_0x0009:
            r2 = move-exception
            de.baimos.dr r0 = a
            java.lang.String r1 = "failed to close connection"
            r0.b(r1, r2)
        L_0x0011:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: de.baimos.cq.a(java.io.OutputStream):void");
    }

    public static void a(OutputStream outputStream, int i2) {
        outputStream.write(i2);
    }

    public static void a(String str, OutputStream outputStream) {
        a(str.getBytes("UTF-8"), outputStream);
    }

    public static void a(byte[] bArr, OutputStream outputStream) {
        if (bArr.length <= 65535) {
            b(outputStream, bArr.length);
            outputStream.write(bArr);
            return;
        }
        throw new IOException("exceeded max message size (64kb)!");
    }

    public static byte[] a(InputStream inputStream) {
        byte[] bArr = new byte[1024];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    public static int b(InputStream inputStream) {
        return c(inputStream) | (c(inputStream) << 8);
    }

    public static void b(OutputStream outputStream, int i2) {
        if ((i2 >> 16) == 0) {
            outputStream.write((i2 >> 8) & 255);
            outputStream.write(i2 & 255);
            return;
        }
        throw new IllegalArgumentException("value is not a unsigned short: " + i2);
    }

    public static int c(InputStream inputStream) {
        int read = inputStream.read();
        if (read >= 0) {
            return read & 255;
        }
        throw new EOFException();
    }

    public static void d(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e2) {
                a.b("failed to close connection", e2);
            }
        }
    }
}
