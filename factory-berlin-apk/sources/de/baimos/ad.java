package de.baimos;

import java.io.InputStream;

public class ad extends InputStream {
    private aa a;

    public ad(aa aaVar) {
        this.a = aaVar;
    }

    public int available() {
        return this.a.a();
    }

    public void close() {
        this.a.b();
    }

    public int read() {
        byte[] bArr = new byte[1];
        if (this.a.a(bArr, 0, 1) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public int read(byte[] bArr, int i2, int i3) {
        return this.a.a(bArr, i2, i3);
    }
}
