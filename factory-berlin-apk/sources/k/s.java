package k;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import k.v;
import kotlin.jvm.internal.k;
import l.f;
import l.g;

/* compiled from: FormBody.kt */
public final class s extends c0 {

    /* renamed from: d  reason: collision with root package name */
    private static final x f10518d = x.f10543f.a("application/x-www-form-urlencoded");
    private final List<String> b;
    private final List<String> c;

    /* compiled from: FormBody.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new b((DefaultConstructorMarker) null);
    }

    public s(List<String> list, List<String> list2) {
        k.f(list, "encodedNames");
        k.f(list2, "encodedValues");
        this.b = k.h0.b.O(list);
        this.c = k.h0.b.O(list2);
    }

    private final long j(g gVar, boolean z) {
        f fVar;
        if (z) {
            fVar = new f();
        } else if (gVar != null) {
            fVar = gVar.d();
        } else {
            k.m();
            throw null;
        }
        int size = this.b.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (i2 > 0) {
                fVar.a1(38);
            }
            fVar.h1(this.b.get(i2));
            fVar.a1(61);
            fVar.h1(this.c.get(i2));
        }
        if (!z) {
            return 0;
        }
        long T0 = fVar.T0();
        fVar.h();
        return T0;
    }

    public long a() {
        return j((g) null, true);
    }

    public x b() {
        return f10518d;
    }

    public void i(g gVar) {
        k.f(gVar, "sink");
        j(gVar, false);
    }

    /* compiled from: FormBody.kt */
    public static final class a {
        private final List<String> a;
        private final List<String> b;
        private final Charset c;

        public a() {
            this((Charset) null, 1, (DefaultConstructorMarker) null);
        }

        public a(Charset charset) {
            this.c = charset;
            this.a = new ArrayList();
            this.b = new ArrayList();
        }

        public final a a(String str, String str2) {
            k.f(str, "name");
            k.f(str2, "value");
            this.a.add(v.b.b(v.f10527l, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, this.c, 91, (Object) null));
            this.b.add(v.b.b(v.f10527l, str2, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, this.c, 91, (Object) null));
            return this;
        }

        public final a b(String str, String str2) {
            k.f(str, "name");
            k.f(str2, "value");
            this.a.add(v.b.b(v.f10527l, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, false, this.c, 83, (Object) null));
            this.b.add(v.b.b(v.f10527l, str2, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, false, this.c, 83, (Object) null));
            return this;
        }

        public final s c() {
            return new s(this.a, this.b);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ a(Charset charset, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? null : charset);
        }
    }
}
