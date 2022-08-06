package de.baimos;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.os.Handler;
import de.baimos.blueid.sdk.api.Channel;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class e implements Channel {
    private static final dr a = ds.a(e.class);
    private Context b;

    public e(Context context) {
        this.b = context;
    }

    private boolean a() {
        final AtomicReference atomicReference = new AtomicReference();
        new Handler(this.b.getMainLooper()).post(new Runnable() {
            public void run() {
                Boolean bool;
                AtomicReference atomicReference;
                BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
                if (defaultAdapter == null || !defaultAdapter.isEnabled()) {
                    atomicReference = atomicReference;
                    bool = Boolean.FALSE;
                } else {
                    atomicReference = atomicReference;
                    bool = Boolean.TRUE;
                }
                atomicReference.set(bool);
                synchronized (atomicReference) {
                    atomicReference.notifyAll();
                }
            }
        });
        synchronized (atomicReference) {
            while (atomicReference.get() == null) {
                try {
                    atomicReference.wait(1000);
                } catch (InterruptedException e2) {
                    a.a("failed to sleep", e2);
                }
            }
        }
        return ((Boolean) atomicReference.get()).booleanValue();
    }

    public String getActionToEnableChannel() {
        return null;
    }

    public Channel.ChannelStatus getChannelStatus() {
        boolean z = true;
        boolean z2 = this.b.checkCallingOrSelfPermission("android.permission.BLUETOOTH") == 0;
        if (this.b.checkCallingOrSelfPermission("android.permission.BLUETOOTH_ADMIN") != 0) {
            z = false;
        }
        return (!z2 || !z) ? Channel.ChannelStatus.NOT_AUTHORIZED : !a() ? Channel.ChannelStatus.NOT_ENABLED : Channel.ChannelStatus.ENABLED;
    }

    public String getId() {
        return Channel.BLUETOOTH_CHANNEL_ID;
    }

    public List<String> getRequiredPermissions() {
        return Arrays.asList(new String[]{"android.permission.BLUETOOTH", "android.permission.BLUETOOTH_ADMIN"});
    }

    public List<String> getUserDeactivatedPermissions() {
        return Collections.emptyList();
    }
}
