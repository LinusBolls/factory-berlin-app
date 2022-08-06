package com.sensorberg.smartspaces.nfc;

import android.annotation.SuppressLint;
import android.nfc.cardemulation.HostApduService;
import android.os.Bundle;
import com.sensorberg.smartspaces.nfc.b.b;
import g.e.n.e.c;
import java.nio.charset.Charset;
import java.util.Arrays;
import kotlin.i;
import kotlin.j0.d;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.v;

@SuppressLint({"Registered"})
@i(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00152\u00020\u00012\u00020\u0002:\u0001\u0015B\u0007¢\u0006\u0004\b\u0014\u0010\u0005J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\n\u0010\u0005J#\u0010\u000f\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/sensorberg/smartspaces/nfc/SmartCardService;", "Lcom/sensorberg/smartspaces/nfc/b/b;", "Landroid/nfc/cardemulation/HostApduService;", "", "onCreate", "()V", "", "reason", "onDeactivated", "(I)V", "onDestroy", "", "command", "Landroid/os/Bundle;", "extras", "processCommandApdu", "([BLandroid/os/Bundle;)[B", "Lcom/sensorberg/smartspaces/payload/PayloadDataSource;", "payloadDataSource", "Lcom/sensorberg/smartspaces/payload/PayloadDataSource;", "<init>", "Companion", "nfc_release"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
/* compiled from: SmartCardService.kt */
public final class SmartCardService extends HostApduService implements b {

    /* renamed from: h  reason: collision with root package name */
    private static final byte[] f6169h;

    /* renamed from: i  reason: collision with root package name */
    private static final byte[] f6170i;

    /* renamed from: g  reason: collision with root package name */
    private c f6171g;

    /* compiled from: SmartCardService.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new a((DefaultConstructorMarker) null);
        byte b = (byte) 1;
        byte b2 = (byte) 3;
        byte b3 = (byte) 7;
        f6169h = new byte[]{b, b2, b2, b3};
        byte b4 = (byte) 0;
        f6170i = new byte[]{b4, (byte) 164, (byte) 4, b4, b3, (byte) 160, b4, b4, (byte) 8, (byte) 52, b4, b, b4};
    }

    public m.a.c.a n() {
        return b.a.a(this);
    }

    public void onCreate() {
        super.onCreate();
        n.a.a.a("create SmartCardService", new Object[0]);
        com.sensorberg.smartspaces.nfc.b.c.b(this);
        this.f6171g = (c) n().d().e(v.b(c.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null);
    }

    public void onDeactivated(int i2) {
    }

    public void onDestroy() {
        super.onDestroy();
        com.sensorberg.smartspaces.nfc.b.c.a();
    }

    public byte[] processCommandApdu(byte[] bArr, Bundle bundle) {
        if (bArr != null) {
            n.a.a.a("Received: %s", a.b.b(bArr));
            if (Arrays.equals(f6170i, bArr)) {
                n.a.a.a("ADPU successfully selected", new Object[0]);
                return a.b.a("9000");
            } else if (Arrays.equals(f6169h, bArr)) {
                n.a.a.a("GET UUID COMMAND received", new Object[0]);
                try {
                    c cVar = this.f6171g;
                    if (cVar != null) {
                        String a2 = cVar.a();
                        Charset charset = d.a;
                        if (a2 != null) {
                            byte[] bytes = a2.getBytes(charset);
                            k.d(bytes, "(this as java.lang.String).getBytes(charset)");
                            return bytes;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                    k.q("payloadDataSource");
                    throw null;
                } catch (IllegalStateException e2) {
                    n.a.a.d(e2);
                }
            }
        }
        n.a.a.a("proccessCommandAdpu failed", new Object[0]);
        return a.b.a("6F00");
    }
}
