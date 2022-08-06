package e.h.h;

import android.util.Base64;
import e.h.j.h;
import java.util.List;

/* compiled from: FontRequest */
public final class a {
    private final String a;
    private final String b;
    private final String c;

    /* renamed from: d  reason: collision with root package name */
    private final List<List<byte[]>> f8632d;

    /* renamed from: e  reason: collision with root package name */
    private final int f8633e = 0;

    /* renamed from: f  reason: collision with root package name */
    private final String f8634f = (this.a + "-" + this.b + "-" + this.c);

    public a(String str, String str2, String str3, List<List<byte[]>> list) {
        h.c(str);
        this.a = str;
        h.c(str2);
        this.b = str2;
        h.c(str3);
        this.c = str3;
        h.c(list);
        this.f8632d = list;
    }

    public List<List<byte[]>> a() {
        return this.f8632d;
    }

    public int b() {
        return this.f8633e;
    }

    public String c() {
        return this.f8634f;
    }

    public String d() {
        return this.a;
    }

    public String e() {
        return this.b;
    }

    public String f() {
        return this.c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.a + ", mProviderPackage: " + this.b + ", mQuery: " + this.c + ", mCertificates:");
        for (int i2 = 0; i2 < this.f8632d.size(); i2++) {
            sb.append(" [");
            List list = this.f8632d.get(i2);
            for (int i3 = 0; i3 < list.size(); i3++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list.get(i3), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: " + this.f8633e);
        return sb.toString();
    }
}
