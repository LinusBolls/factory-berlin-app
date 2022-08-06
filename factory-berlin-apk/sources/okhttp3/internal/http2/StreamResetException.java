package okhttp3.internal.http2;

import java.io.IOException;
import kotlin.i;
import kotlin.jvm.internal.k;

@i(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lokhttp3/internal/http2/StreamResetException;", "Ljava/io/IOException;", "Lokhttp3/internal/http2/ErrorCode;", "errorCode", "Lokhttp3/internal/http2/ErrorCode;", "<init>", "(Lokhttp3/internal/http2/ErrorCode;)V", "okhttp"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
/* compiled from: StreamResetException.kt */
public final class StreamResetException extends IOException {

    /* renamed from: g  reason: collision with root package name */
    public final a f11327g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StreamResetException(a aVar) {
        super("stream was reset: " + aVar);
        k.f(aVar, "errorCode");
        this.f11327g = aVar;
    }
}
