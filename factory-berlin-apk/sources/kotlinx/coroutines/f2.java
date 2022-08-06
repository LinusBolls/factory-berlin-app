package kotlinx.coroutines;

import kotlinx.coroutines.internal.x;

/* compiled from: JobSupport.kt */
public final class f2 {
    /* access modifiers changed from: private */
    public static final x a = new x("COMPLETING_ALREADY");
    public static final x b = new x("COMPLETING_WAITING_CHILDREN");
    /* access modifiers changed from: private */
    public static final x c = new x("COMPLETING_RETRY");
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final x f10855d = new x("TOO_LATE_TO_CANCEL");
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final x f10856e = new x("SEALED");
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final f1 f10857f = new f1(false);
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final f1 f10858g = new f1(true);

    public static final Object g(Object obj) {
        return obj instanceof s1 ? new t1((s1) obj) : obj;
    }

    public static final Object h(Object obj) {
        s1 s1Var;
        t1 t1Var = (t1) (!(obj instanceof t1) ? null : obj);
        return (t1Var == null || (s1Var = t1Var.a) == null) ? obj : s1Var;
    }
}
