package de.baimos;

import android.content.Context;
import android.nfc.NfcAdapter;
import com.sensorberg.smartspaces.backend.model.Statistics;
import de.baimos.blueid.sdk.api.Channel;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ac implements c {
    private static final dr c = ds.a(ac.class);
    private Context a;
    private Object b;

    public ac(Context context) {
        this.a = context;
    }

    private boolean b() {
        return NfcAdapter.getDefaultAdapter(this.a).isEnabled();
    }

    private boolean c() {
        try {
            Class.forName("android.nfc.cardemulation.CardEmulation");
            return this.a.getPackageManager().hasSystemFeature("android.hardware.nfc.hce");
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public Object a() {
        return this.b;
    }

    public void a(Object obj) {
        this.b = obj;
    }

    public String getActionToEnableChannel() {
        return null;
    }

    public Channel.ChannelStatus getChannelStatus() {
        boolean z = this.a.checkCallingOrSelfPermission("android.permission.NFC") == 0;
        if (!c()) {
            c.a("NFC HCE is not supported on this smartphone. At least Android 4.4 is needed to use this channel.");
            return Channel.ChannelStatus.NOT_SUPPORTED;
        } else if (!z) {
            c.a("To use NFC, your app must request this permission: android.permission.NFC");
            return Channel.ChannelStatus.NOT_AUTHORIZED;
        } else if (b()) {
            return Channel.ChannelStatus.ENABLED;
        } else {
            c.a("NFC is currently deactivated and needs to get activated.");
            return Channel.ChannelStatus.NOT_ENABLED;
        }
    }

    public String getId() {
        return Statistics.TRIGGER_NFC;
    }

    public List<String> getRequiredPermissions() {
        return Arrays.asList(new String[]{"android.permission.NFC"});
    }

    public List<String> getUserDeactivatedPermissions() {
        return Collections.emptyList();
    }
}
