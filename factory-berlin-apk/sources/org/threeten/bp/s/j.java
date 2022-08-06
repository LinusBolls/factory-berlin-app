package org.threeten.bp.s;

import java.io.Serializable;
import java.util.HashMap;
import org.threeten.bp.DateTimeException;
import org.threeten.bp.d;
import org.threeten.bp.o;
import org.threeten.bp.temporal.a;
import org.threeten.bp.temporal.e;
import org.threeten.bp.temporal.m;

/* compiled from: HijrahChronology */
public final class j extends h implements Serializable {

    /* renamed from: i  reason: collision with root package name */
    public static final j f11648i = new j();

    /* renamed from: j  reason: collision with root package name */
    private static final HashMap<String, String[]> f11649j = new HashMap<>();

    /* renamed from: k  reason: collision with root package name */
    private static final HashMap<String, String[]> f11650k = new HashMap<>();

    /* renamed from: l  reason: collision with root package name */
    private static final HashMap<String, String[]> f11651l = new HashMap<>();

    static {
        f11649j.put("en", new String[]{"BH", "HE"});
        f11650k.put("en", new String[]{"B.H.", "H.E."});
        f11651l.put("en", new String[]{"Before Hijrah", "Hijrah Era"});
    }

    private j() {
    }

    private Object readResolve() {
        return f11648i;
    }

    public f<k> A(d dVar, o oVar) {
        return super.A(dVar, oVar);
    }

    public f<k> B(e eVar) {
        return super.B(eVar);
    }

    /* renamed from: C */
    public k f(int i2, int i3, int i4) {
        return k.H0(i2, i3, i4);
    }

    /* renamed from: D */
    public k h(e eVar) {
        if (eVar instanceof k) {
            return (k) eVar;
        }
        return k.J0(eVar.y(a.EPOCH_DAY));
    }

    /* renamed from: F */
    public l l(int i2) {
        if (i2 == 0) {
            return l.BEFORE_AH;
        }
        if (i2 == 1) {
            return l.AH;
        }
        throw new DateTimeException("invalid Hijrah era");
    }

    public m G(a aVar) {
        return aVar.n();
    }

    public String o() {
        return "islamic-umalqura";
    }

    public String p() {
        return "Hijrah-umalqura";
    }

    public c<k> t(e eVar) {
        return super.t(eVar);
    }
}
