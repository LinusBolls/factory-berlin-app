package g.b.a.b.c.f;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.d;
import com.google.android.gms.common.api.internal.i;
import com.google.android.gms.nearby.messages.internal.l0;

public final class j1 extends l0 {
    private final i<d<Status>> a;
    private boolean b = false;

    public j1(i<d<Status>> iVar) {
        this.a = iVar;
    }

    public final synchronized void P(Status status) {
        if (!this.b) {
            this.a.a(new k1(this, status));
            this.b = true;
            return;
        }
        String valueOf = String.valueOf(status);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28);
        sb.append("Received multiple statuses: ");
        sb.append(valueOf);
        Log.wtf("NearbyMessagesCallbackWrapper", sb.toString(), new Exception());
    }
}
