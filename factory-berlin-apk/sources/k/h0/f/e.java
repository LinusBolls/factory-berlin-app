package k.h0.f;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k.d0;
import k.h;
import k.h0.b;
import k.m;
import k.n;
import k.u;
import k.v;
import kotlin.jvm.internal.k;
import l.f;
import l.i;

/* compiled from: HttpHeaders.kt */
public final class e {
    private static final i a = i.f11104k.d("\"\\");
    private static final i b = i.f11104k.d("\t ,=");

    public static final List<h> a(u uVar, String str) {
        k.f(uVar, "$this$parseChallenges");
        k.f(str, "headerName");
        ArrayList arrayList = new ArrayList();
        int size = uVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (p.q(str, uVar.d(i2), true)) {
                f fVar = new f();
                fVar.h1(uVar.j(i2));
                try {
                    c(fVar, arrayList);
                } catch (EOFException e2) {
                    k.h0.i.h.c.g().k("Unable to parse challenge", 5, e2);
                }
            }
        }
        return arrayList;
    }

    public static final boolean b(d0 d0Var) {
        k.f(d0Var, "$this$promisesBody");
        if (k.a(d0Var.Z().h(), "HEAD")) {
            return false;
        }
        int j2 = d0Var.j();
        if (((j2 >= 100 && j2 < 200) || j2 == 204 || j2 == 304) && b.s(d0Var) == -1 && !p.q("chunked", d0.q(d0Var, "Transfer-Encoding", (String) null, 2, (Object) null), true)) {
            return false;
        }
        return true;
    }

    private static final void c(f fVar, List<h> list) {
        String e2;
        int H;
        String str;
        while (true) {
            String str2 = null;
            while (true) {
                if (str2 == null) {
                    g(fVar);
                    str2 = e(fVar);
                    if (str2 == null) {
                        return;
                    }
                }
                boolean g2 = g(fVar);
                e2 = e(fVar);
                if (e2 != null) {
                    byte b2 = (byte) 61;
                    H = b.H(fVar, b2);
                    boolean g3 = g(fVar);
                    if (g2 || (!g3 && !fVar.Q())) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        int H2 = H + b.H(fVar, b2);
                        while (true) {
                            if (e2 == null) {
                                e2 = e(fVar);
                                if (g(fVar)) {
                                    continue;
                                    break;
                                }
                                H2 = b.H(fVar, b2);
                            }
                            if (H2 == 0) {
                                continue;
                                break;
                            } else if (H2 <= 1 && !g(fVar)) {
                                if (h(fVar, (byte) 34)) {
                                    str = d(fVar);
                                } else {
                                    str = e(fVar);
                                }
                                if (str != null && ((String) linkedHashMap.put(e2, str)) == null) {
                                    if (g(fVar) || fVar.Q()) {
                                        e2 = null;
                                    } else {
                                        return;
                                    }
                                } else {
                                    return;
                                }
                            } else {
                                return;
                            }
                        }
                        list.add(new h(str2, linkedHashMap));
                        str2 = e2;
                    }
                } else if (fVar.Q()) {
                    list.add(new h(str2, e0.e()));
                    return;
                } else {
                    return;
                }
            }
            Map singletonMap = Collections.singletonMap((Object) null, e2 + p.v("=", H));
            k.b(singletonMap, "Collections.singletonMap…ek + \"=\".repeat(eqCount))");
            list.add(new h(str2, singletonMap));
        }
    }

    private static final String d(f fVar) {
        byte b2 = (byte) 34;
        if (fVar.readByte() == b2) {
            f fVar2 = new f();
            while (true) {
                long c0 = fVar.c0(a);
                if (c0 == -1) {
                    return null;
                }
                if (fVar.b0(c0) == b2) {
                    fVar2.p(fVar, c0);
                    fVar.readByte();
                    return fVar2.P0();
                } else if (fVar.T0() == c0 + 1) {
                    return null;
                } else {
                    fVar2.p(fVar, c0);
                    fVar.readByte();
                    fVar2.p(fVar, 1);
                }
            }
        } else {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    private static final String e(f fVar) {
        long c0 = fVar.c0(b);
        if (c0 == -1) {
            c0 = fVar.T0();
        }
        if (c0 != 0) {
            return fVar.Q0(c0);
        }
        return null;
    }

    public static final void f(n nVar, v vVar, u uVar) {
        k.f(nVar, "$this$receiveHeaders");
        k.f(vVar, "url");
        k.f(uVar, "headers");
        if (nVar != n.a) {
            List<m> e2 = m.f10507n.e(vVar, uVar);
            if (!e2.isEmpty()) {
                nVar.b(vVar, e2);
            }
        }
    }

    private static final boolean g(f fVar) {
        boolean z = false;
        while (!fVar.Q()) {
            byte b0 = fVar.b0(0);
            if (b0 == 9 || b0 == 32) {
                fVar.readByte();
            } else if (b0 != 44) {
                break;
            } else {
                fVar.readByte();
                z = true;
            }
        }
        return z;
    }

    private static final boolean h(f fVar, byte b2) {
        return !fVar.Q() && fVar.b0(0) == b2;
    }
}
