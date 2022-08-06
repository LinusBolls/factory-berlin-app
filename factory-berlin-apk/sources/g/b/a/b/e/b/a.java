package g.b.a.b.e.b;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.d;
import com.google.android.gms.common.h;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.e;
import com.google.android.gms.common.internal.i;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.s;
import g.b.a.b.e.f;

public class a extends i<g> implements f {
    private final Bundle A;
    private Integer B;
    private final boolean y;
    private final e z;

    private a(Context context, Looper looper, boolean z2, e eVar, Bundle bundle, d.a aVar, d.b bVar) {
        super(context, looper, 44, eVar, aVar, bVar);
        this.y = true;
        this.z = eVar;
        this.A = bundle;
        this.B = eVar.d();
    }

    public static Bundle k0(e eVar) {
        g.b.a.b.e.a h2 = eVar.h();
        Integer d2 = eVar.d();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", eVar.a());
        if (d2 != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", d2.intValue());
        }
        if (h2 != null) {
            bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", h2.i());
            bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", h2.g());
            bundle.putString("com.google.android.gms.signin.internal.serverClientId", h2.e());
            bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
            bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", h2.f());
            bundle.putString("com.google.android.gms.signin.internal.hostedDomain", h2.c());
            bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", h2.j());
            if (h2.b() != null) {
                bundle.putLong("com.google.android.gms.signin.internal.authApiSignInModuleVersion", h2.b().longValue());
            }
            if (h2.d() != null) {
                bundle.putLong("com.google.android.gms.signin.internal.realClientLibraryVersion", h2.d().longValue());
            }
        }
        return bundle;
    }

    /* access modifiers changed from: protected */
    public String c() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ IInterface e(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        if (queryLocalInterface instanceof g) {
            return (g) queryLocalInterface;
        }
        return new h(iBinder);
    }

    public int g() {
        return h.a;
    }

    public final void h(e eVar) {
        r.l(eVar, "Expecting a valid ISignInCallbacks");
        try {
            Account b = this.z.b();
            GoogleSignInAccount googleSignInAccount = null;
            if ("<<default account>>".equals(b.name)) {
                googleSignInAccount = com.google.android.gms.auth.api.signin.a.a.a(x()).b();
            }
            ((g) B()).x0(new i(new s(b, this.B.intValue(), googleSignInAccount)), eVar);
        } catch (RemoteException e2) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                eVar.G(new k(8));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e2);
            }
        }
    }

    public final void n() {
        l(new c.d());
    }

    public boolean o() {
        return this.y;
    }

    /* access modifiers changed from: protected */
    public String p() {
        return "com.google.android.gms.signin.service.START";
    }

    /* access modifiers changed from: protected */
    public Bundle y() {
        if (!x().getPackageName().equals(this.z.f())) {
            this.A.putString("com.google.android.gms.signin.internal.realClientPackageName", this.z.f());
        }
        return this.A;
    }

    public a(Context context, Looper looper, boolean z2, e eVar, g.b.a.b.e.a aVar, d.a aVar2, d.b bVar) {
        this(context, looper, true, eVar, k0(eVar), aVar2, bVar);
    }
}
