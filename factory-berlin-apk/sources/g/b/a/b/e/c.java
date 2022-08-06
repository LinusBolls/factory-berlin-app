package g.b.a.b.e;

import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;

public final class c {
    private static final a.g<g.b.a.b.e.b.a> a = new a.g<>();
    private static final a.g<g.b.a.b.e.b.a> b = new a.g<>();
    public static final a.C0060a<g.b.a.b.e.b.a, a> c = new d();

    /* renamed from: d  reason: collision with root package name */
    private static final a.C0060a<g.b.a.b.e.b.a, Object> f9439d = new e();

    static {
        new Scope("profile");
        new Scope("email");
        new a("SignIn.API", c, a);
        new a("SignIn.INTERNAL_API", f9439d, b);
    }
}
