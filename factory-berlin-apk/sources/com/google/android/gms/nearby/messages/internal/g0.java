package com.google.android.gms.nearby.messages.internal;

import com.google.android.gms.common.internal.r;
import java.nio.ByteBuffer;
import java.util.UUID;

public final class g0 extends w {
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public g0(java.util.UUID r5, java.lang.Short r6, java.lang.Short r7) {
        /*
            r4 = this;
            r0 = 0
            r1 = 2
            if (r6 != 0) goto L_0x0006
            r2 = 0
            goto L_0x0007
        L_0x0006:
            r2 = 2
        L_0x0007:
            int r2 = r2 + 16
            if (r7 != 0) goto L_0x000c
            goto L_0x000d
        L_0x000c:
            r0 = 2
        L_0x000d:
            int r2 = r2 + r0
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r2)
            long r1 = r5.getMostSignificantBits()
            java.nio.ByteBuffer r1 = r0.putLong(r1)
            long r2 = r5.getLeastSignificantBits()
            r1.putLong(r2)
            if (r6 == 0) goto L_0x002a
            short r5 = r6.shortValue()
            r0.putShort(r5)
        L_0x002a:
            if (r7 == 0) goto L_0x0033
            short r5 = r7.shortValue()
            r0.putShort(r5)
        L_0x0033:
            byte[] r5 = r0.array()
            r4.<init>(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.nearby.messages.internal.g0.<init>(java.util.UUID, java.lang.Short, java.lang.Short):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g0(byte[] bArr) {
        super(bArr);
        r.b(bArr.length == 16 || bArr.length == 18 || bArr.length == 20, "Prefix must be a UUID, a UUID and a major, or a UUID, a major, and a minor.");
    }

    public final UUID c() {
        ByteBuffer wrap = ByteBuffer.wrap(a());
        return new UUID(wrap.getLong(), wrap.getLong());
    }

    public final Short d() {
        byte[] a = a();
        if (a.length >= 18) {
            return Short.valueOf(ByteBuffer.wrap(a).getShort(16));
        }
        return null;
    }

    public final Short e() {
        byte[] a = a();
        if (a.length == 20) {
            return Short.valueOf(ByteBuffer.wrap(a).getShort(18));
        }
        return null;
    }

    public final String toString() {
        String valueOf = String.valueOf(c());
        String valueOf2 = String.valueOf(d());
        String valueOf3 = String.valueOf(e());
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("IBeaconIdPrefix{proximityUuid=");
        sb.append(valueOf);
        sb.append(", major=");
        sb.append(valueOf2);
        sb.append(", minor=");
        sb.append(valueOf3);
        sb.append('}');
        return sb.toString();
    }
}
