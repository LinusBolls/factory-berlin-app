package de.baimos.blueid.sdk.api.nfc;

import android.content.Intent;
import android.nfc.cardemulation.HostApduService;
import android.os.Bundle;
import de.baimos.blueid.sdk.internal.a;

public abstract class AbstractNfcService extends HostApduService {
    private a a;

    public AbstractNfcService() {
        try {
            this.a = (a) Class.forName("de.baimos.ae").getConstructor(new Class[]{AbstractNfcService.class}).newInstance(new Object[]{this});
        } catch (Exception e2) {
            throw new RuntimeException("failed to get NfcServiceBridge", e2);
        }
    }

    public abstract void incomingConnection(Intent intent);

    public final void onDeactivated(int i2) {
        this.a.a(i2);
    }

    public final byte[] processCommandApdu(byte[] bArr, Bundle bundle) {
        return this.a.a(bArr);
    }
}
