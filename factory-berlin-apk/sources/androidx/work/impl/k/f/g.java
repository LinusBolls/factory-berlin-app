package androidx.work.impl.k.f;

import android.content.Context;
import androidx.work.impl.utils.k.a;

/* compiled from: Trackers */
public class g {

    /* renamed from: e  reason: collision with root package name */
    private static g f1720e;
    private a a;
    private b b;
    private e c;

    /* renamed from: d  reason: collision with root package name */
    private f f1721d;

    private g(Context context, a aVar) {
        Context applicationContext = context.getApplicationContext();
        this.a = new a(applicationContext, aVar);
        this.b = new b(applicationContext, aVar);
        this.c = new e(applicationContext, aVar);
        this.f1721d = new f(applicationContext, aVar);
    }

    public static synchronized g c(Context context, a aVar) {
        g gVar;
        synchronized (g.class) {
            if (f1720e == null) {
                f1720e = new g(context, aVar);
            }
            gVar = f1720e;
        }
        return gVar;
    }

    public a a() {
        return this.a;
    }

    public b b() {
        return this.b;
    }

    public e d() {
        return this.c;
    }

    public f e() {
        return this.f1721d;
    }
}
