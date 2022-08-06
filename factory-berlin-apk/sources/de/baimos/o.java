package de.baimos;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class o {
    private static final dr a = ds.a(o.class);
    private LinkedBlockingQueue<Byte> b = new LinkedBlockingQueue<>();
    private boolean c = false;

    public int a(byte[] bArr, int i2, int i3) {
        dr drVar = a;
        drVar.d("get at max " + i3 + " bytes from queue");
        int i4 = 0;
        do {
            Byte poll = this.b.poll(50, TimeUnit.MILLISECONDS);
            if (this.c) {
                return -1;
            }
            if (poll != null) {
                bArr[i2 + i4] = poll.byteValue();
                i4++;
                continue;
            } else if (i4 >= 1) {
                break;
            }
        } while (i4 < i3);
        dr drVar2 = a;
        drVar2.d("got " + i4 + " bytes from queue: " + be.a(bArr));
        return i4;
    }

    public synchronized void a() {
        this.c = true;
    }

    public void a(byte[] bArr) {
        a.d("put " + bArr.length + " bytes into queue: " + be.a(bArr));
        for (byte valueOf : bArr) {
            this.b.put(Byte.valueOf(valueOf));
        }
        a.d("queue size after put: " + this.b.size());
    }
}
