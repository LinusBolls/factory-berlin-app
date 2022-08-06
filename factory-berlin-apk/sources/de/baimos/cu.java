package de.baimos;

import java.io.InputStream;
import java.io.InterruptedIOException;

public class cu extends InputStream {
    private cz a;

    public cu(cz czVar) {
        this.a = czVar;
    }

    public int available() {
        return this.a.b();
    }

    public int read() {
        byte[] bArr = new byte[1];
        try {
            if (this.a.a(bArr, 0, 1) == -1) {
                return -1;
            }
            return bArr[0] & 255;
        } catch (InterruptedException e2) {
            throw new InterruptedIOException(e2.getMessage());
        }
    }

    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public int read(byte[] bArr, int i2, int i3) {
        try {
            return this.a.a(bArr, i2, i3);
        } catch (InterruptedException e2) {
            throw new InterruptedIOException(e2.getMessage());
        }
    }
}
