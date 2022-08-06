package de.baimos;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.concurrent.ConcurrentLinkedQueue;

public class r extends OutputStream {
    private static final dr a = ds.a(r.class);
    private a b;
    private int c;

    /* renamed from: d  reason: collision with root package name */
    private ConcurrentLinkedQueue<Byte> f8353d = new ConcurrentLinkedQueue<>();

    /* renamed from: e  reason: collision with root package name */
    private ByteArrayOutputStream f8354e = new ByteArrayOutputStream();

    public interface a {
        boolean a(byte[] bArr);
    }

    r(a aVar, int i2) {
        this.b = aVar;
        this.c = i2;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        dr drVar = a;
        drVar.d("baos: " + be.a(this.f8354e.toByteArray()));
    }

    public void flush() {
        boolean z;
        byte[] bArr;
        a.d("flush called");
        byte[] bArr2 = null;
        while (true) {
            boolean z2 = false;
            while (true) {
                if (this.f8353d.size() > 0 || bArr2 != null) {
                    if (bArr2 == null) {
                        int min = Math.min(this.c, this.f8353d.size());
                        byte[] bArr3 = new byte[min];
                        for (int i2 = 0; i2 < min; i2++) {
                            bArr3[i2] = this.f8353d.poll().byteValue();
                        }
                        z = z2;
                        bArr = bArr2;
                        bArr2 = bArr3;
                    } else {
                        a.d("retransmitting packet " + be.a(bArr2));
                        bArr = null;
                        z = true;
                    }
                    a.d("delivering packet " + be.a(bArr2));
                    if (!this.b.a(bArr2)) {
                        break;
                    } else if (!z) {
                        z2 = z;
                    } else {
                        throw new IOException("failed to write packet");
                    }
                } else {
                    a.d("flush finished");
                    return;
                }
            }
            bArr2 = bArr;
        }
    }

    public void write(int i2) {
        this.f8354e.write(i2);
        this.f8353d.add(Byte.valueOf((byte) i2));
    }
}
