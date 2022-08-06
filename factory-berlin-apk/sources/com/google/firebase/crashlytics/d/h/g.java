package com.google.firebase.crashlytics.d.h;

import android.os.Process;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: CLSUUID */
class g {
    private static final AtomicLong a = new AtomicLong(0);
    private static String b;

    g(x xVar) {
        byte[] bArr = new byte[10];
        e(bArr);
        d(bArr);
        c(bArr);
        String G = h.G(xVar.a());
        String z = h.z(bArr);
        b = String.format(Locale.US, "%s-%s-%s-%s", new Object[]{z.substring(0, 12), z.substring(12, 16), z.subSequence(16, 20), G.substring(0, 12)}).toUpperCase(Locale.US);
    }

    private static byte[] a(long j2) {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt((int) j2);
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        return allocate.array();
    }

    private static byte[] b(long j2) {
        ByteBuffer allocate = ByteBuffer.allocate(2);
        allocate.putShort((short) ((int) j2));
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        return allocate.array();
    }

    private void c(byte[] bArr) {
        byte[] b2 = b((long) Integer.valueOf(Process.myPid()).shortValue());
        bArr[8] = b2[0];
        bArr[9] = b2[1];
    }

    private void d(byte[] bArr) {
        byte[] b2 = b(a.incrementAndGet());
        bArr[6] = b2[0];
        bArr[7] = b2[1];
    }

    private void e(byte[] bArr) {
        long time = new Date().getTime();
        byte[] a2 = a(time / 1000);
        bArr[0] = a2[0];
        bArr[1] = a2[1];
        bArr[2] = a2[2];
        bArr[3] = a2[3];
        byte[] b2 = b(time % 1000);
        bArr[4] = b2[0];
        bArr[5] = b2[1];
    }

    public String toString() {
        return b;
    }
}
