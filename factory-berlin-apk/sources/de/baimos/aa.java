package de.baimos;

import java.io.InterruptedIOException;

public class aa {
    private byte[] a = new byte[2048];
    private int b = 0;
    private boolean c = false;

    public synchronized int a() {
        return this.b;
    }

    public synchronized int a(byte[] bArr, int i2, int i3) {
        while (this.b == 0 && !this.c) {
            try {
                wait();
            } catch (InterruptedException e2) {
                throw new InterruptedIOException(e2.getMessage());
            }
        }
        if (this.c) {
            return -1;
        }
        if (this.b < i3) {
            i3 = this.b;
        }
        System.arraycopy(this.a, 0, bArr, i2, i3);
        System.arraycopy(this.a, i3, this.a, 0, this.b - i3);
        this.b -= i3;
        notifyAll();
        return i3;
    }

    public synchronized void a(byte[] bArr) {
        while (this.b + bArr.length > this.a.length && !this.c) {
            try {
                wait();
            } catch (InterruptedException e2) {
                throw new InterruptedIOException(e2.getMessage());
            }
        }
        System.arraycopy(bArr, 0, this.a, this.b, bArr.length);
        this.b += bArr.length;
        notifyAll();
    }

    public synchronized void b() {
        this.c = true;
        notifyAll();
    }
}
