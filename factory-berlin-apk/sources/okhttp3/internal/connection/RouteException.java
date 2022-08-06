package okhttp3.internal.connection;

import java.io.IOException;
import kotlin.i;
import kotlin.jvm.internal.k;

@i(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u0006J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR$\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00028\u0006@BX\u000e¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\n¨\u0006\u000f"}, d2 = {"Lokhttp3/internal/connection/RouteException;", "Ljava/lang/RuntimeException;", "Ljava/io/IOException;", "e", "", "addConnectException", "(Ljava/io/IOException;)V", "firstConnectException", "Ljava/io/IOException;", "getFirstConnectException", "()Ljava/io/IOException;", "<set-?>", "lastConnectException", "getLastConnectException", "<init>", "okhttp"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
/* compiled from: RouteException.kt */
public final class RouteException extends RuntimeException {

    /* renamed from: g  reason: collision with root package name */
    private IOException f11264g;

    /* renamed from: h  reason: collision with root package name */
    private final IOException f11265h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RouteException(IOException iOException) {
        super(iOException);
        k.f(iOException, "firstConnectException");
        this.f11265h = iOException;
        this.f11264g = iOException;
    }

    public final void a(IOException iOException) {
        k.f(iOException, "e");
        this.f11265h.addSuppressed(iOException);
        this.f11264g = iOException;
    }

    public final IOException b() {
        return this.f11265h;
    }

    public final IOException c() {
        return this.f11264g;
    }
}
