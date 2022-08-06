package com.google.firebase.crashlytics.d.h;

import com.google.firebase.crashlytics.d.l.b;
import com.google.firebase.crashlytics.d.l.c;
import java.util.Collections;
import java.util.Map;
import java.util.regex.Pattern;

/* compiled from: AbstractSpiCall */
public abstract class a {

    /* renamed from: e  reason: collision with root package name */
    private static final Pattern f3901e = Pattern.compile("http(s?)://[^\\/]+", 2);
    private final String a;
    private final c b;
    private final com.google.firebase.crashlytics.d.l.a c;

    /* renamed from: d  reason: collision with root package name */
    private final String f3902d;

    public a(String str, String str2, c cVar, com.google.firebase.crashlytics.d.l.a aVar) {
        if (str2 == null) {
            throw new IllegalArgumentException("url must not be null.");
        } else if (cVar != null) {
            this.f3902d = str;
            this.a = f(str2);
            this.b = cVar;
            this.c = aVar;
        } else {
            throw new IllegalArgumentException("requestFactory must not be null.");
        }
    }

    private String f(String str) {
        return !h.C(this.f3902d) ? f3901e.matcher(str).replaceFirst(this.f3902d) : str;
    }

    /* access modifiers changed from: protected */
    public b c() {
        return d(Collections.emptyMap());
    }

    /* access modifiers changed from: protected */
    public b d(Map<String, String> map) {
        b a2 = this.b.a(this.c, e(), map);
        a2.d("User-Agent", "Crashlytics Android SDK/" + m.i());
        a2.d("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
        return a2;
    }

    /* access modifiers changed from: protected */
    public String e() {
        return this.a;
    }
}
