package g.e.g;

import android.annotation.TargetApi;
import android.app.KeyguardManager;
import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.os.Process;
import androidx.lifecycle.LiveData;
import kotlin.jvm.internal.k;

/* compiled from: LiveFingerprint.kt */
public final class a {
    public static final C0673a a = new C0673a((DefaultConstructorMarker) null);

    /* renamed from: g.e.g.a$a  reason: collision with other inner class name */
    /* compiled from: LiveFingerprint.kt */
    public static final class C0673a {
        private C0673a() {
        }

        @TargetApi(23)
        private final LiveData<b> b(Context context) {
            Object systemService = context.getSystemService("fingerprint");
            if (systemService != null) {
                return new c((FingerprintManager) systemService);
            }
            throw new NullPointerException("null cannot be cast to non-null type android.hardware.fingerprint.FingerprintManager");
        }

        @TargetApi(23)
        private final boolean d(Context context) {
            if (context.checkPermission("android.permission.USE_FINGERPRINT", Process.myPid(), Process.myUid()) != 0) {
                n.a.a.a("not fingerprint capable. noPermission", new Object[0]);
                return false;
            }
            FingerprintManager fingerprintManager = (FingerprintManager) context.getSystemService("fingerprint");
            if (fingerprintManager == null || !fingerprintManager.isHardwareDetected()) {
                n.a.a.a("not fingerprint capable. noHardware", new Object[0]);
                return false;
            } else if (!fingerprintManager.hasEnrolledFingerprints()) {
                n.a.a.a("not fingerprint capable. noEnrolledFingerprint", new Object[0]);
                return false;
            } else {
                Object systemService = context.getSystemService("keyguard");
                if (systemService != null) {
                    KeyguardManager keyguardManager = (KeyguardManager) systemService;
                    if (keyguardManager == null || keyguardManager.isKeyguardSecure()) {
                        n.a.a.f("Is fingerprint capable. All passed", new Object[0]);
                        return true;
                    }
                    n.a.a.a("not fingerprint capable. noKeyguard", new Object[0]);
                    return false;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.app.KeyguardManager");
            }
        }

        public final LiveData<b> a(Context context) {
            k.e(context, "context");
            if (c(context)) {
                return b(context);
            }
            return new b();
        }

        public final boolean c(Context context) {
            k.e(context, "context");
            if (Build.VERSION.SDK_INT >= 23) {
                return d(context);
            }
            n.a.a.a("not fingerprint capable. minSdkVersion", new Object[0]);
            return false;
        }

        public /* synthetic */ C0673a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: LiveFingerprint.kt */
    public enum b {
        FINGERPRINT_NOT_POSSIBLE,
        AWAITING_USER_INPUT,
        FINGERPRINT_NOT_RECOGNIZED,
        FINGERPRINT_SUCCESS
    }
}
