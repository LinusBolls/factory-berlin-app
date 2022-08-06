package k.h0.f;

import k.e0;
import k.x;
import kotlin.jvm.internal.k;

/* compiled from: RealResponseBody.kt */
public final class h extends e0 {

    /* renamed from: i  reason: collision with root package name */
    private final String f10426i;

    /* renamed from: j  reason: collision with root package name */
    private final long f10427j;

    /* renamed from: k  reason: collision with root package name */
    private final l.h f10428k;

    public h(String str, long j2, l.h hVar) {
        k.f(hVar, "source");
        this.f10426i = str;
        this.f10427j = j2;
        this.f10428k = hVar;
    }

    public long i() {
        return this.f10427j;
    }

    public x j() {
        String str = this.f10426i;
        if (str != null) {
            return x.f10543f.b(str);
        }
        return null;
    }

    public l.h n() {
        return this.f10428k;
    }
}
