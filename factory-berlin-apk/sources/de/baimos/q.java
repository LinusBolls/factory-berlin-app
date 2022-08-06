package de.baimos;

import java.io.InputStream;
import java.io.InterruptedIOException;

public class q extends InputStream {
    private o a;
    private a b;

    interface a {
        void b();

        void c();
    }

    public q(o oVar, a aVar) {
        this.a = oVar;
        this.b = aVar;
    }

    public int read() {
        byte[] bArr = new byte[1];
        try {
            this.b.b();
            int a2 = this.a.a(bArr, 0, 1);
            this.b.c();
            if (a2 == -1) {
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
