package g.e.g;

import android.annotation.TargetApi;
import android.hardware.fingerprint.FingerprintManager;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.lifecycle.LiveData;
import g.e.g.a;
import kotlin.jvm.internal.k;

@TargetApi(23)
/* compiled from: LiveFingerprintImpl.kt */
public final class c extends LiveData<a.b> {
    private CancellationSignal q = new CancellationSignal();
    private final FingerprintManager r;

    /* compiled from: LiveFingerprintImpl.kt */
    private final class a extends FingerprintManager.AuthenticationCallback {
        public a() {
        }

        public void onAuthenticationError(int i2, CharSequence charSequence) {
            k.e(charSequence, "errString");
            if (i2 != 5) {
                n.a.a.c("onFingerprintAuthenticationError. Code " + i2 + ". " + charSequence, new Object[0]);
                if (i2 != 3) {
                    c.this.u(a.b.FINGERPRINT_NOT_RECOGNIZED);
                } else if (c.this.n()) {
                    c.this.x();
                }
            }
        }

        public void onAuthenticationFailed() {
            n.a.a.k("onFingerprintAuthenticationFailed", new Object[0]);
            c.this.u(a.b.FINGERPRINT_NOT_RECOGNIZED);
        }

        public void onAuthenticationHelp(int i2, CharSequence charSequence) {
            k.e(charSequence, "helpString");
            n.a.a.k("onFingerprintAuthenticationHelp", new Object[0]);
            c.this.u(a.b.FINGERPRINT_NOT_RECOGNIZED);
        }

        public void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
            k.e(authenticationResult, "result");
            n.a.a.f("onFingerprintAuthenticationSucceeded", new Object[0]);
            c.this.u(a.b.FINGERPRINT_SUCCESS);
        }
    }

    public c(FingerprintManager fingerprintManager) {
        k.e(fingerprintManager, "fingerprintManager");
        this.r = fingerprintManager;
    }

    /* access modifiers changed from: private */
    public final void x() {
        n.a.a.f("Starting fingerprint authentication", new Object[0]);
        u(a.b.AWAITING_USER_INPUT);
        CancellationSignal cancellationSignal = new CancellationSignal();
        this.q = cancellationSignal;
        this.r.authenticate((FingerprintManager.CryptoObject) null, cancellationSignal, 0, new a(), (Handler) null);
    }

    /* access modifiers changed from: protected */
    public void q() {
        super.q();
        if (l() == null || ((a.b) l()) == a.b.AWAITING_USER_INPUT || ((a.b) l()) == a.b.FINGERPRINT_NOT_RECOGNIZED) {
            x();
        }
    }

    /* access modifiers changed from: protected */
    public void r() {
        super.r();
        this.q.cancel();
    }
}
