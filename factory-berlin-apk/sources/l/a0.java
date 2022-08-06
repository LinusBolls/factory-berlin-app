package l;

import de.baimos.blueid.sdk.api.Channel;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.k;

/* compiled from: JvmOkio.kt */
final class a0 extends d {

    /* renamed from: l  reason: collision with root package name */
    private final Logger f11085l = Logger.getLogger("okio.Okio");

    /* renamed from: m  reason: collision with root package name */
    private final Socket f11086m;

    public a0(Socket socket) {
        k.f(socket, Channel.SOCKET_CHANNEL_ID);
        this.f11086m = socket;
    }

    /* access modifiers changed from: protected */
    public IOException t(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    /* access modifiers changed from: protected */
    public void x() {
        try {
            this.f11086m.close();
        } catch (Exception e2) {
            Logger logger = this.f11085l;
            Level level = Level.WARNING;
            logger.log(level, "Failed to close timed out socket " + this.f11086m, e2);
        } catch (AssertionError e3) {
            if (p.e(e3)) {
                Logger logger2 = this.f11085l;
                Level level2 = Level.WARNING;
                logger2.log(level2, "Failed to close timed out socket " + this.f11086m, e3);
                return;
            }
            throw e3;
        }
    }
}
