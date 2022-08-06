package de.baimos;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ConcurrentLinkedQueue;

public class h extends OutputStream {
    private cw a;
    private int b;
    private ConcurrentLinkedQueue<Byte> c = new ConcurrentLinkedQueue<>();

    public h(cw cwVar, int i2) {
        this.a = cwVar;
        this.b = i2;
    }

    public synchronized void flush() {
        ArrayList arrayList = new ArrayList();
        while (this.c.size() > 0) {
            int min = Math.min(this.b, this.c.size());
            byte[] bArr = new byte[min];
            for (int i2 = 0; i2 < min; i2++) {
                bArr[i2] = this.c.poll().byteValue();
            }
            arrayList.add(bArr);
        }
        this.a.a(arrayList);
    }

    public synchronized void write(int i2) {
        this.c.add(Byte.valueOf((byte) i2));
        if (this.c.size() >= this.b) {
            byte[] bArr = new byte[this.b];
            for (int i3 = 0; i3 < this.b; i3++) {
                bArr[i3] = this.c.poll().byteValue();
            }
            this.a.a(Collections.singletonList(bArr));
        }
    }
}
