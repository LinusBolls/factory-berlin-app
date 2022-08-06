package k;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.jvm.internal.k;

/* compiled from: Challenge.kt */
public final class h {
    private final Map<String, String> a;
    private final String b;

    public h(String str, Map<String, String> map) {
        String str2;
        k.f(str, "scheme");
        k.f(map, "authParams");
        this.b = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry next : map.entrySet()) {
            String str3 = (String) next.getKey();
            String str4 = (String) next.getValue();
            if (str3 != null) {
                Locale locale = Locale.US;
                k.b(locale, "US");
                if (str3 != null) {
                    str2 = str3.toLowerCase(locale);
                    k.b(str2, "(this as java.lang.String).toLowerCase(locale)");
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                }
            } else {
                str2 = null;
            }
            linkedHashMap.put(str2, str4);
        }
        Map<String, String> unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        k.b(unmodifiableMap, "unmodifiableMap<String?, String>(newAuthParams)");
        this.a = unmodifiableMap;
    }

    public final Charset a() {
        String str = this.a.get("charset");
        if (str != null) {
            try {
                Charset forName = Charset.forName(str);
                k.b(forName, "Charset.forName(charset)");
                return forName;
            } catch (Exception unused) {
            }
        }
        Charset charset = StandardCharsets.ISO_8859_1;
        k.b(charset, "ISO_8859_1");
        return charset;
    }

    public final String b() {
        return this.a.get("realm");
    }

    public final String c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof h) {
            h hVar = (h) obj;
            return k.a(hVar.b, this.b) && k.a(hVar.a, this.a);
        }
    }

    public int hashCode() {
        return ((899 + this.b.hashCode()) * 31) + this.a.hashCode();
    }

    public String toString() {
        return this.b + " authParams=" + this.a;
    }
}
