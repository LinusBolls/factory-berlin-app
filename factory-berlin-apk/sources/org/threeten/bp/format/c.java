package org.threeten.bp.format;

import java.io.IOException;
import java.text.ParsePosition;
import java.util.HashMap;
import java.util.Locale;
import java.util.Set;
import org.threeten.bp.DateTimeException;
import org.threeten.bp.format.d;
import org.threeten.bp.format.e;
import org.threeten.bp.o;
import org.threeten.bp.s.h;
import org.threeten.bp.s.m;
import org.threeten.bp.temporal.a;
import org.threeten.bp.temporal.i;
import org.threeten.bp.temporal.k;

/* compiled from: DateTimeFormatter */
public final class c {

    /* renamed from: h  reason: collision with root package name */
    public static final c f11504h;

    /* renamed from: i  reason: collision with root package name */
    public static final c f11505i;

    /* renamed from: j  reason: collision with root package name */
    public static final c f11506j;

    /* renamed from: k  reason: collision with root package name */
    public static final c f11507k;

    /* renamed from: l  reason: collision with root package name */
    public static final c f11508l;

    /* renamed from: m  reason: collision with root package name */
    public static final c f11509m;
    private final d.f a;
    private final Locale b;
    private final h c;

    /* renamed from: d  reason: collision with root package name */
    private final j f11510d;

    /* renamed from: e  reason: collision with root package name */
    private final Set<i> f11511e;

    /* renamed from: f  reason: collision with root package name */
    private final h f11512f;

    /* renamed from: g  reason: collision with root package name */
    private final o f11513g;

    static {
        d dVar = new d();
        dVar.q(a.YEAR, 4, 10, k.EXCEEDS_PAD);
        dVar.e('-');
        dVar.p(a.MONTH_OF_YEAR, 2);
        dVar.e('-');
        dVar.p(a.DAY_OF_MONTH, 2);
        f11504h = dVar.G(j.STRICT).p(m.f11663i);
        d dVar2 = new d();
        dVar2.z();
        dVar2.a(f11504h);
        dVar2.j();
        dVar2.G(j.STRICT).p(m.f11663i);
        d dVar3 = new d();
        dVar3.z();
        dVar3.a(f11504h);
        dVar3.w();
        dVar3.j();
        dVar3.G(j.STRICT).p(m.f11663i);
        d dVar4 = new d();
        dVar4.p(a.HOUR_OF_DAY, 2);
        dVar4.e(':');
        dVar4.p(a.MINUTE_OF_HOUR, 2);
        dVar4.w();
        dVar4.e(':');
        dVar4.p(a.SECOND_OF_MINUTE, 2);
        dVar4.w();
        dVar4.b(a.NANO_OF_SECOND, 0, 9, true);
        f11505i = dVar4.G(j.STRICT);
        d dVar5 = new d();
        dVar5.z();
        dVar5.a(f11505i);
        dVar5.j();
        dVar5.G(j.STRICT);
        d dVar6 = new d();
        dVar6.z();
        dVar6.a(f11505i);
        dVar6.w();
        dVar6.j();
        dVar6.G(j.STRICT);
        d dVar7 = new d();
        dVar7.z();
        dVar7.a(f11504h);
        dVar7.e('T');
        dVar7.a(f11505i);
        f11506j = dVar7.G(j.STRICT).p(m.f11663i);
        d dVar8 = new d();
        dVar8.z();
        dVar8.a(f11506j);
        dVar8.j();
        f11507k = dVar8.G(j.STRICT).p(m.f11663i);
        d dVar9 = new d();
        dVar9.a(f11507k);
        dVar9.w();
        dVar9.e('[');
        dVar9.A();
        dVar9.t();
        dVar9.e(']');
        dVar9.G(j.STRICT).p(m.f11663i);
        d dVar10 = new d();
        dVar10.a(f11506j);
        dVar10.w();
        dVar10.j();
        dVar10.w();
        dVar10.e('[');
        dVar10.A();
        dVar10.t();
        dVar10.e(']');
        dVar10.G(j.STRICT).p(m.f11663i);
        d dVar11 = new d();
        dVar11.z();
        dVar11.q(a.YEAR, 4, 10, k.EXCEEDS_PAD);
        dVar11.e('-');
        dVar11.p(a.DAY_OF_YEAR, 3);
        dVar11.w();
        dVar11.j();
        dVar11.G(j.STRICT).p(m.f11663i);
        d dVar12 = new d();
        dVar12.z();
        dVar12.q(org.threeten.bp.temporal.c.c, 4, 10, k.EXCEEDS_PAD);
        dVar12.f("-W");
        dVar12.p(org.threeten.bp.temporal.c.b, 2);
        dVar12.e('-');
        dVar12.p(a.DAY_OF_WEEK, 1);
        dVar12.w();
        dVar12.j();
        dVar12.G(j.STRICT).p(m.f11663i);
        d dVar13 = new d();
        dVar13.z();
        dVar13.c();
        f11508l = dVar13.G(j.STRICT);
        d dVar14 = new d();
        dVar14.z();
        dVar14.p(a.YEAR, 4);
        dVar14.p(a.MONTH_OF_YEAR, 2);
        dVar14.p(a.DAY_OF_MONTH, 2);
        dVar14.w();
        dVar14.i("+HHMMss", "Z");
        dVar14.G(j.STRICT).p(m.f11663i);
        HashMap hashMap = new HashMap();
        hashMap.put(1L, "Mon");
        hashMap.put(2L, "Tue");
        hashMap.put(3L, "Wed");
        hashMap.put(4L, "Thu");
        hashMap.put(5L, "Fri");
        hashMap.put(6L, "Sat");
        hashMap.put(7L, "Sun");
        HashMap hashMap2 = new HashMap();
        hashMap2.put(1L, "Jan");
        hashMap2.put(2L, "Feb");
        hashMap2.put(3L, "Mar");
        hashMap2.put(4L, "Apr");
        hashMap2.put(5L, "May");
        hashMap2.put(6L, "Jun");
        hashMap2.put(7L, "Jul");
        hashMap2.put(8L, "Aug");
        hashMap2.put(9L, "Sep");
        hashMap2.put(10L, "Oct");
        hashMap2.put(11L, "Nov");
        hashMap2.put(12L, "Dec");
        d dVar15 = new d();
        dVar15.z();
        dVar15.C();
        dVar15.w();
        dVar15.l(a.DAY_OF_WEEK, hashMap);
        dVar15.f(", ");
        dVar15.v();
        dVar15.q(a.DAY_OF_MONTH, 1, 2, k.NOT_NEGATIVE);
        dVar15.e(' ');
        dVar15.l(a.MONTH_OF_YEAR, hashMap2);
        dVar15.e(' ');
        dVar15.p(a.YEAR, 4);
        dVar15.e(' ');
        dVar15.p(a.HOUR_OF_DAY, 2);
        dVar15.e(':');
        dVar15.p(a.MINUTE_OF_HOUR, 2);
        dVar15.w();
        dVar15.e(':');
        dVar15.p(a.SECOND_OF_MINUTE, 2);
        dVar15.v();
        dVar15.e(' ');
        dVar15.i("+HHMM", "GMT");
        f11509m = dVar15.G(j.SMART).p(m.f11663i);
    }

    c(d.f fVar, Locale locale, h hVar, j jVar, Set<i> set, h hVar2, o oVar) {
        org.threeten.bp.t.d.i(fVar, "printerParser");
        this.a = fVar;
        org.threeten.bp.t.d.i(locale, "locale");
        this.b = locale;
        org.threeten.bp.t.d.i(hVar, "decimalStyle");
        this.c = hVar;
        org.threeten.bp.t.d.i(jVar, "resolverStyle");
        this.f11510d = jVar;
        this.f11511e = set;
        this.f11512f = hVar2;
        this.f11513g = oVar;
    }

    private DateTimeParseException a(CharSequence charSequence, RuntimeException runtimeException) {
        String str;
        if (charSequence.length() > 64) {
            str = charSequence.subSequence(0, 64).toString() + "...";
        } else {
            str = charSequence.toString();
        }
        return new DateTimeParseException("Text '" + str + "' could not be parsed: " + runtimeException.getMessage(), charSequence, 0, runtimeException);
    }

    public static c h(i iVar) {
        org.threeten.bp.t.d.i(iVar, "timeStyle");
        d dVar = new d();
        dVar.g((i) null, iVar);
        return dVar.E().p(m.f11663i);
    }

    public static c i(String str) {
        d dVar = new d();
        dVar.k(str);
        return dVar.E();
    }

    public static c j(String str, Locale locale) {
        d dVar = new d();
        dVar.k(str);
        return dVar.F(locale);
    }

    private a m(CharSequence charSequence, ParsePosition parsePosition) {
        String str;
        ParsePosition parsePosition2 = parsePosition != null ? parsePosition : new ParsePosition(0);
        e.b n2 = n(charSequence, parsePosition2);
        if (n2 != null && parsePosition2.getErrorIndex() < 0 && (parsePosition != null || parsePosition2.getIndex() >= charSequence.length())) {
            return n2.D();
        }
        if (charSequence.length() > 64) {
            str = charSequence.subSequence(0, 64).toString() + "...";
        } else {
            str = charSequence.toString();
        }
        if (parsePosition2.getErrorIndex() >= 0) {
            throw new DateTimeParseException("Text '" + str + "' could not be parsed at index " + parsePosition2.getErrorIndex(), charSequence, parsePosition2.getErrorIndex());
        }
        throw new DateTimeParseException("Text '" + str + "' could not be parsed, unparsed text found at index " + parsePosition2.getIndex(), charSequence, parsePosition2.getIndex());
    }

    private e.b n(CharSequence charSequence, ParsePosition parsePosition) {
        org.threeten.bp.t.d.i(charSequence, "text");
        org.threeten.bp.t.d.i(parsePosition, "position");
        e eVar = new e(this);
        int f2 = this.a.f(eVar, charSequence, parsePosition.getIndex());
        if (f2 < 0) {
            parsePosition.setErrorIndex(~f2);
            return null;
        }
        parsePosition.setIndex(f2);
        return eVar.u();
    }

    public String b(org.threeten.bp.temporal.e eVar) {
        StringBuilder sb = new StringBuilder(32);
        c(eVar, sb);
        return sb.toString();
    }

    public void c(org.threeten.bp.temporal.e eVar, Appendable appendable) {
        org.threeten.bp.t.d.i(eVar, "temporal");
        org.threeten.bp.t.d.i(appendable, "appendable");
        try {
            f fVar = new f(eVar, this);
            if (appendable instanceof StringBuilder) {
                this.a.a(fVar, (StringBuilder) appendable);
                return;
            }
            StringBuilder sb = new StringBuilder(32);
            this.a.a(fVar, sb);
            appendable.append(sb);
        } catch (IOException e2) {
            throw new DateTimeException(e2.getMessage(), e2);
        }
    }

    public h d() {
        return this.f11512f;
    }

    public h e() {
        return this.c;
    }

    public Locale f() {
        return this.b;
    }

    public o g() {
        return this.f11513g;
    }

    public <T> T k(CharSequence charSequence, k<T> kVar) {
        org.threeten.bp.t.d.i(charSequence, "text");
        org.threeten.bp.t.d.i(kVar, "type");
        try {
            a m2 = m(charSequence, (ParsePosition) null);
            m2.W(this.f11510d, this.f11511e);
            return m2.G(kVar);
        } catch (DateTimeParseException e2) {
            throw e2;
        } catch (RuntimeException e3) {
            throw a(charSequence, e3);
        }
    }

    public org.threeten.bp.temporal.e l(CharSequence charSequence) {
        org.threeten.bp.t.d.i(charSequence, "text");
        try {
            a m2 = m(charSequence, (ParsePosition) null);
            m2.W(this.f11510d, this.f11511e);
            return m2;
        } catch (DateTimeParseException e2) {
            throw e2;
        } catch (RuntimeException e3) {
            throw a(charSequence, e3);
        }
    }

    /* access modifiers changed from: package-private */
    public d.f o(boolean z) {
        return this.a.b(z);
    }

    public c p(h hVar) {
        if (org.threeten.bp.t.d.c(this.f11512f, hVar)) {
            return this;
        }
        return new c(this.a, this.b, this.c, this.f11510d, this.f11511e, hVar, this.f11513g);
    }

    public c q(j jVar) {
        org.threeten.bp.t.d.i(jVar, "resolverStyle");
        if (org.threeten.bp.t.d.c(this.f11510d, jVar)) {
            return this;
        }
        return new c(this.a, this.b, this.c, jVar, this.f11511e, this.f11512f, this.f11513g);
    }

    public String toString() {
        String fVar = this.a.toString();
        return fVar.startsWith("[") ? fVar : fVar.substring(1, fVar.length() - 1);
    }
}
