package kotlinx.coroutines;

import kotlin.c0.g;
import kotlin.i;

@i(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u0000 \n2\u00020\u00012\u00020\u0002:\u0001\nJ\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lkotlinx/coroutines/CoroutineExceptionHandler;", "kotlin/c0/g$b", "Lkotlin/Any;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "exception", "", "handleException", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Throwable;)V", "Key", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
/* compiled from: CoroutineExceptionHandler.kt */
public interface CoroutineExceptionHandler extends g.b {

    /* renamed from: d  reason: collision with root package name */
    public static final a f10709d = a.a;

    /* compiled from: CoroutineExceptionHandler.kt */
    public static final class a implements g.c<CoroutineExceptionHandler> {
        static final /* synthetic */ a a = new a();

        private a() {
        }
    }

    void handleException(g gVar, Throwable th);
}
