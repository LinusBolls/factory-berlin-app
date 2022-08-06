package de.baimos;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import de.baimos.blueid.sdk.api.nfc.AbstractNfcService;
import de.baimos.blueid.sdk.internal.a;
import java.util.concurrent.atomic.AtomicBoolean;

public class ae implements a {
    private static final byte[] a = {0, -92};
    private static final byte[] b = {-70, -50};
    private static final byte[] c = {-70, -34};

    /* renamed from: d  reason: collision with root package name */
    private static final byte[] f8171d = {-112, 0};

    /* renamed from: e  reason: collision with root package name */
    private static final byte[] f8172e = {106, Byte.MIN_VALUE};
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final byte[] f8173f = {111, 0};

    /* renamed from: l  reason: collision with root package name */
    private static final String f8174l = "BlueIDNFC";

    /* renamed from: m  reason: collision with root package name */
    private static final int f8175m = 255;

    /* renamed from: n  reason: collision with root package name */
    private static final int f8176n = 4;
    private static final int o = 10;
    private static final int p = 2;
    private static final int q = 5;
    private static final int r = 1;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final AbstractNfcService f8177g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public aa f8178h;

    /* renamed from: i  reason: collision with root package name */
    private final Messenger f8179i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public Messenger f8180j = null;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public final AtomicBoolean f8181k = new AtomicBoolean(false);

    public ae(AbstractNfcService abstractNfcService) {
        this.f8177g = abstractNfcService;
        Log.d(f8174l, "new instance created!");
        this.f8179i = new Messenger(new Handler() {
            public void handleMessage(Message message) {
                try {
                    Bundle data = message.getData();
                    int i2 = message.what;
                    if (i2 == 1) {
                        Log.d(ae.f8174l, "prolog");
                        Messenger unused = ae.this.f8180j = (Messenger) data.getParcelable("messenger");
                        synchronized (ae.this.f8181k) {
                            ae.this.f8181k.notifyAll();
                        }
                    } else if (i2 == 2) {
                        Log.d(ae.f8174l, "data");
                        ae.this.f8178h.a(data.getByteArray("data"));
                    } else if (i2 == 3) {
                        Log.d(ae.f8174l, "epilog");
                        ae.this.b();
                    }
                } catch (Exception e2) {
                    Log.e(ae.f8174l, "failed to handle message from client", e2);
                    ae.this.b();
                    ae.this.f8177g.sendResponseApdu(ae.f8173f);
                }
            }
        });
    }

    private static boolean a(byte[] bArr, byte[] bArr2) {
        return bArr.length >= 2 && bArr[0] == bArr2[0] && bArr[1] == bArr2[1];
    }

    private Message b(int i2) {
        Message obtain = Message.obtain();
        obtain.what = i2;
        Bundle bundle = new Bundle();
        bundle.putParcelable("messenger", this.f8179i);
        obtain.setData(bundle);
        return obtain;
    }

    /* access modifiers changed from: private */
    public void b() {
        Messenger messenger = this.f8180j;
        if (messenger != null) {
            try {
                messenger.send(b(3));
            } catch (Exception e2) {
                Log.e(f8174l, "failed to handle epilog", e2);
            }
        }
        this.f8180j = null;
        this.f8181k.set(false);
        this.f8178h = null;
    }

    private void b(byte[] bArr) {
        Message b2 = b(2);
        b2.getData().putByteArray("data", bArr);
        this.f8180j.send(b2);
    }

    /* access modifiers changed from: private */
    public static byte[] b(byte[] bArr, int i2) {
        int i3 = i2 + 2;
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, 0, bArr2, 0, i2);
        System.arraycopy(f8171d, 0, bArr2, i3 - 2, 2);
        return bArr2;
    }

    private static boolean c(byte[] bArr) {
        return bArr.length >= 20 && a(bArr, b) && bArr[4] == 15;
    }

    public void a(int i2) {
        Log.i(f8174l, "deactivated (reason: " + i2 + ")");
        b();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:21|22|23) */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0094, code lost:
        return f8173f;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x008f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] a(byte[] r8) {
        /*
            r7 = this;
            java.lang.String r0 = "BlueIDNFC"
            byte[] r1 = a     // Catch:{ Exception -> 0x00aa }
            boolean r1 = a((byte[]) r8, (byte[]) r1)     // Catch:{ Exception -> 0x00aa }
            if (r1 == 0) goto L_0x0012
            java.lang.String r8 = "BlueIDHostApduService selected"
            android.util.Log.i(r0, r8)     // Catch:{ Exception -> 0x00aa }
            byte[] r8 = f8171d     // Catch:{ Exception -> 0x00aa }
            return r8
        L_0x0012:
            boolean r1 = c((byte[]) r8)     // Catch:{ Exception -> 0x00aa }
            r2 = 1
            r3 = 4
            r4 = 5
            if (r1 == 0) goto L_0x0061
            java.lang.String r1 = new java.lang.String     // Catch:{ Exception -> 0x00aa }
            r5 = 10
            r1.<init>(r8, r4, r5)     // Catch:{ Exception -> 0x00aa }
            java.lang.String r4 = new java.lang.String     // Catch:{ Exception -> 0x00aa }
            r5 = 16
            r4.<init>(r8, r5, r3)     // Catch:{ Exception -> 0x00aa }
            de.baimos.aa r8 = new de.baimos.aa     // Catch:{ Exception -> 0x00aa }
            r8.<init>()     // Catch:{ Exception -> 0x00aa }
            r7.f8178h = r8     // Catch:{ Exception -> 0x00aa }
            android.content.Intent r8 = new android.content.Intent     // Catch:{ Exception -> 0x00aa }
            r8.<init>()     // Catch:{ Exception -> 0x00aa }
            android.os.Bundle r3 = new android.os.Bundle     // Catch:{ Exception -> 0x00aa }
            r3.<init>()     // Catch:{ Exception -> 0x00aa }
            java.lang.String r5 = "securedObjectId"
            r3.putString(r5, r1)     // Catch:{ Exception -> 0x00aa }
            java.lang.String r1 = "channelId"
            java.lang.String r5 = "nfc"
            r3.putString(r1, r5)     // Catch:{ Exception -> 0x00aa }
            java.lang.String r1 = "commandId"
            r3.putString(r1, r4)     // Catch:{ Exception -> 0x00aa }
            java.lang.String r1 = "channelParameter"
            android.os.Message r2 = r7.b((int) r2)     // Catch:{ Exception -> 0x00aa }
            r3.putParcelable(r1, r2)     // Catch:{ Exception -> 0x00aa }
            java.lang.String r1 = "BlueIDSDKNFCParameters"
            r8.putExtra(r1, r3)     // Catch:{ Exception -> 0x00aa }
            de.baimos.blueid.sdk.api.nfc.AbstractNfcService r1 = r7.f8177g     // Catch:{ Exception -> 0x00aa }
            r1.incomingConnection(r8)     // Catch:{ Exception -> 0x00aa }
            byte[] r8 = f8171d     // Catch:{ Exception -> 0x00aa }
            return r8
        L_0x0061:
            byte[] r1 = c     // Catch:{ Exception -> 0x00aa }
            boolean r1 = a((byte[]) r8, (byte[]) r1)     // Catch:{ Exception -> 0x00aa }
            if (r1 == 0) goto L_0x00a7
            int r1 = r8.length     // Catch:{ Exception -> 0x00aa }
            r5 = 0
            r6 = 255(0xff, float:3.57E-43)
            if (r1 <= r4) goto L_0x007a
            byte r1 = r8[r3]     // Catch:{ Exception -> 0x00aa }
            r1 = r1 & r6
            byte[] r3 = new byte[r1]     // Catch:{ Exception -> 0x00aa }
            java.lang.System.arraycopy(r8, r4, r3, r5, r1)     // Catch:{ Exception -> 0x00aa }
            r7.b((byte[]) r3)     // Catch:{ Exception -> 0x00aa }
        L_0x007a:
            de.baimos.aa r1 = r7.f8178h     // Catch:{ Exception -> 0x00aa }
            int r1 = r1.a()     // Catch:{ Exception -> 0x00aa }
            if (r1 <= 0) goto L_0x0095
            byte[] r8 = new byte[r6]     // Catch:{ Exception -> 0x00aa }
            de.baimos.aa r1 = r7.f8178h     // Catch:{ InterruptedIOException -> 0x008f }
            int r1 = r1.a(r8, r5, r6)     // Catch:{ InterruptedIOException -> 0x008f }
            byte[] r8 = b(r8, r1)     // Catch:{ InterruptedIOException -> 0x008f }
            return r8
        L_0x008f:
            r7.b()     // Catch:{ Exception -> 0x00aa }
            byte[] r8 = f8173f     // Catch:{ Exception -> 0x00aa }
            return r8
        L_0x0095:
            r1 = 2
            byte r8 = r8[r1]     // Catch:{ Exception -> 0x00aa }
            if (r8 != r2) goto L_0x00a4
            de.baimos.ae$2 r8 = new de.baimos.ae$2     // Catch:{ Exception -> 0x00aa }
            r8.<init>()     // Catch:{ Exception -> 0x00aa }
            r8.start()     // Catch:{ Exception -> 0x00aa }
            r8 = 0
            return r8
        L_0x00a4:
            byte[] r8 = f8171d     // Catch:{ Exception -> 0x00aa }
            return r8
        L_0x00a7:
            byte[] r8 = f8172e     // Catch:{ Exception -> 0x00aa }
            return r8
        L_0x00aa:
            r8 = move-exception
            java.lang.String r1 = "unable to execute NFC command"
            android.util.Log.e(r0, r1, r8)
            r7.b()
            byte[] r8 = f8173f
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: de.baimos.ae.a(byte[]):byte[]");
    }
}
