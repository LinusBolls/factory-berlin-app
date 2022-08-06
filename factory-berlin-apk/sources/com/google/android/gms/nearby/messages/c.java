package com.google.android.gms.nearby.messages;

import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.nearby.messages.internal.g0;
import java.util.UUID;

public class c {
    private final g0 a;

    private c(byte[] bArr) {
        r.b(bArr.length == 20, "iBeacon ID must be a UUID, a major, and a minor (20 total bytes).");
        this.a = new g0(bArr);
    }

    public static c a(Message message) {
        boolean q = message.q("__i_beacon_id");
        String o = message.o();
        StringBuilder sb = new StringBuilder(String.valueOf(o).length() + 55);
        sb.append("Message type '");
        sb.append(o);
        sb.append("' is not Message.MESSAGE_TYPE_I_BEACON_ID");
        r.b(q, sb.toString());
        return new c(message.l());
    }

    public short b() {
        return this.a.d().shortValue();
    }

    public short c() {
        return this.a.e().shortValue();
    }

    public UUID d() {
        return this.a.c();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        return p.a(this.a, ((c) obj).a);
    }

    public int hashCode() {
        return p.b(this.a);
    }

    public String toString() {
        String valueOf = String.valueOf(d());
        short b = b();
        short c = c();
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 53);
        sb.append("IBeaconId{proximityUuid=");
        sb.append(valueOf);
        sb.append(", major=");
        sb.append(b);
        sb.append(", minor=");
        sb.append(c);
        sb.append('}');
        return sb.toString();
    }
}
