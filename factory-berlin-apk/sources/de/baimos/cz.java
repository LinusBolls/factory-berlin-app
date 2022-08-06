package de.baimos;

public class cz {
    private byte[] a = new byte[2048];
    private int b = 0;
    private boolean c = false;

    /* renamed from: d  reason: collision with root package name */
    private boolean f8319d = false;

    public synchronized int a(byte[] bArr, int i2, int i3) {
        while (this.b == 0 && !this.c) {
            try {
                wait();
            } catch (InterruptedException e2) {
                throw e2;
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

    public synchronized void a() {
        this.c = true;
        notifyAll();
    }

    public synchronized void a(byte[] bArr) {
        while (this.b + bArr.length > this.a.length) {
            try {
                wait();
            } catch (InterruptedException e2) {
                throw e2;
            }
        }
        if (this.f8319d) {
            System.arraycopy(bArr, 2, this.a, this.b, bArr.length - 2);
            this.b += bArr.length - 2;
        } else {
            System.arraycopy(bArr, 0, this.a, this.b, bArr.length);
            this.b += bArr.length;
        }
        notifyAll();
    }

    public synchronized int b() {
        return this.b;
    }
}
