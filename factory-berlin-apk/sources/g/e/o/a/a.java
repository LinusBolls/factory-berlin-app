package g.e.o.a;

import java.nio.charset.Charset;
import k.b0;
import k.c0;
import k.d0;
import k.w;
import k.x;
import l.f;

/* compiled from: CurlCommandLogger */
public class a implements w {
    private static final Charset b = Charset.forName("UTF-8");

    private void b(StringBuilder sb, String str, String str2) {
        sb.append("-H \"");
        sb.append(str);
        sb.append(": ");
        sb.append(str2);
        sb.append("\" ");
    }

    public d0 a(w.a aVar) {
        b0 j2 = aVar.j();
        StringBuilder sb = new StringBuilder("curl command:\n");
        sb.append("curl ");
        sb.append("-X ");
        sb.append(j2.h().toUpperCase());
        sb.append(" ");
        for (String next : j2.f().e()) {
            b(sb, next, j2.f().a(next));
        }
        c0 a = j2.a();
        if (j2.a() != null) {
            f fVar = new f();
            a.i(fVar);
            x b2 = a.b();
            if (b2 != null) {
                b(sb, "Content-Type", j2.a().b().toString());
                sb.append(" -d '");
                sb.append(fVar.C0(b2.c(b)));
                sb.append("'");
            }
        }
        sb.append(" \"");
        sb.append(j2.k().toString());
        sb.append("\"");
        sb.append(" -L");
        sb.append("\n");
        n.a.a.j(sb.toString(), new Object[0]);
        return aVar.a(j2);
    }
}
