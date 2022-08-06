package g.b.a.b.c.e;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.d;
import com.google.android.gms.common.internal.e;
import com.google.android.gms.common.internal.i;

public class e0 extends i<j> {
    private final String y;
    protected final c0<j> z = new f0(this);

    public e0(Context context, Looper looper, d.a aVar, d.b bVar, String str, e eVar) {
        super(context, looper, 23, eVar, aVar, bVar);
        this.y = str;
    }

    /* access modifiers changed from: protected */
    public String c() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ IInterface e(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        return queryLocalInterface instanceof j ? (j) queryLocalInterface : new k(iBinder);
    }

    public int g() {
        return 11925000;
    }

    /* access modifiers changed from: protected */
    public String p() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    /* access modifiers changed from: protected */
    public Bundle y() {
        Bundle bundle = new Bundle();
        bundle.putString("client_name", this.y);
        return bundle;
    }
}
