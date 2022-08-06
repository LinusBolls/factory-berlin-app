package androidx.navigation;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: NavDeepLink */
public final class l {

    /* renamed from: i  reason: collision with root package name */
    private static final Pattern f1079i = Pattern.compile("^[a-zA-Z]+[+\\w\\-.]*:");
    private final ArrayList<String> a = new ArrayList<>();
    private final Map<String, c> b = new HashMap();
    private Pattern c = null;

    /* renamed from: d  reason: collision with root package name */
    private boolean f1080d = false;

    /* renamed from: e  reason: collision with root package name */
    private boolean f1081e = false;

    /* renamed from: f  reason: collision with root package name */
    private final String f1082f;

    /* renamed from: g  reason: collision with root package name */
    private Pattern f1083g = null;

    /* renamed from: h  reason: collision with root package name */
    private final String f1084h;

    /* compiled from: NavDeepLink */
    public static final class a {
        private String a;
        private String b;
        private String c;

        a() {
        }

        public l a() {
            return new l(this.a, this.b, this.c);
        }

        public a b(String str) {
            if (!str.isEmpty()) {
                this.b = str;
                return this;
            }
            throw new IllegalArgumentException("The NavDeepLink cannot have an empty action.");
        }

        public a c(String str) {
            this.c = str;
            return this;
        }

        public a d(String str) {
            this.a = str;
            return this;
        }
    }

    /* compiled from: NavDeepLink */
    private static class b implements Comparable<b> {

        /* renamed from: g  reason: collision with root package name */
        String f1085g;

        /* renamed from: h  reason: collision with root package name */
        String f1086h;

        b(String str) {
            String[] split = str.split("/", -1);
            this.f1085g = split[0];
            this.f1086h = split[1];
        }

        /* renamed from: a */
        public int compareTo(b bVar) {
            int i2 = this.f1085g.equals(bVar.f1085g) ? 2 : 0;
            return this.f1086h.equals(bVar.f1086h) ? i2 + 1 : i2;
        }
    }

    /* compiled from: NavDeepLink */
    private static class c {
        private String a;
        private ArrayList<String> b = new ArrayList<>();

        c() {
        }

        /* access modifiers changed from: package-private */
        public void a(String str) {
            this.b.add(str);
        }

        /* access modifiers changed from: package-private */
        public String b(int i2) {
            return this.b.get(i2);
        }

        /* access modifiers changed from: package-private */
        public String c() {
            return this.a;
        }

        /* access modifiers changed from: package-private */
        public void d(String str) {
            this.a = str;
        }

        public int e() {
            return this.b.size();
        }
    }

    l(String str, String str2, String str3) {
        String str4 = str;
        String str5 = str3;
        this.f1082f = str2;
        this.f1084h = str5;
        if (str4 != null) {
            Uri parse = Uri.parse(str);
            this.f1081e = parse.getQuery() != null;
            StringBuilder sb = new StringBuilder("^");
            if (!f1079i.matcher(str4).find()) {
                sb.append("http[s]?://");
            }
            Pattern compile = Pattern.compile("\\{(.+?)\\}");
            if (this.f1081e) {
                Matcher matcher = Pattern.compile("(\\?)").matcher(str4);
                if (matcher.find()) {
                    a(str4.substring(0, matcher.start()), sb, compile);
                }
                this.f1080d = false;
                for (String next : parse.getQueryParameterNames()) {
                    StringBuilder sb2 = new StringBuilder();
                    String queryParameter = parse.getQueryParameter(next);
                    Matcher matcher2 = compile.matcher(queryParameter);
                    c cVar = new c();
                    int i2 = 0;
                    while (matcher2.find()) {
                        cVar.a(matcher2.group(1));
                        sb2.append(Pattern.quote(queryParameter.substring(i2, matcher2.start())));
                        sb2.append("(.+?)?");
                        i2 = matcher2.end();
                    }
                    if (i2 < queryParameter.length()) {
                        sb2.append(Pattern.quote(queryParameter.substring(i2)));
                    }
                    cVar.d(sb2.toString().replace(".*", "\\E.*\\Q"));
                    this.b.put(next, cVar);
                }
            } else {
                this.f1080d = a(str4, sb, compile);
            }
            this.c = Pattern.compile(sb.toString().replace(".*", "\\E.*\\Q"));
        }
        if (str5 == null) {
            return;
        }
        if (Pattern.compile("^[\\s\\S]+/[\\s\\S]+$").matcher(str5).matches()) {
            b bVar = new b(str5);
            this.f1083g = Pattern.compile(("^(" + bVar.f1085g + "|[*]+)/(" + bVar.f1086h + "|[*]+)$").replace("*|[*]", "[\\s\\S]"));
            return;
        }
        throw new IllegalArgumentException("The given mimeType " + str5 + " does not match to required \"type/subtype\" format");
    }

    private boolean a(String str, StringBuilder sb, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        boolean z = !str.contains(".*");
        int i2 = 0;
        while (matcher.find()) {
            this.a.add(matcher.group(1));
            sb.append(Pattern.quote(str.substring(i2, matcher.start())));
            sb.append("(.+?)");
            i2 = matcher.end();
            z = false;
        }
        if (i2 < str.length()) {
            sb.append(Pattern.quote(str.substring(i2)));
        }
        sb.append("($|(\\?(.)*))");
        return z;
    }

    private boolean f(Bundle bundle, String str, String str2, h hVar) {
        if (hVar != null) {
            try {
                hVar.b().g(bundle, str, str2);
                return false;
            } catch (IllegalArgumentException unused) {
                return true;
            }
        } else {
            bundle.putString(str, str2);
            return false;
        }
    }

    public String b() {
        return this.f1082f;
    }

    /* access modifiers changed from: package-private */
    public Bundle c(Uri uri, Map<String, h> map) {
        Matcher matcher;
        Matcher matcher2 = this.c.matcher(uri.toString());
        if (!matcher2.matches()) {
            return null;
        }
        Bundle bundle = new Bundle();
        int size = this.a.size();
        int i2 = 0;
        while (i2 < size) {
            String str = this.a.get(i2);
            i2++;
            if (f(bundle, str, Uri.decode(matcher2.group(i2)), map.get(str))) {
                return null;
            }
        }
        if (this.f1081e) {
            for (String next : this.b.keySet()) {
                c cVar = this.b.get(next);
                String queryParameter = uri.getQueryParameter(next);
                if (queryParameter != null) {
                    matcher = Pattern.compile(cVar.c()).matcher(queryParameter);
                    if (!matcher.matches()) {
                        return null;
                    }
                } else {
                    matcher = null;
                }
                int i3 = 0;
                while (true) {
                    if (i3 < cVar.e()) {
                        String decode = matcher != null ? Uri.decode(matcher.group(i3 + 1)) : null;
                        String b2 = cVar.b(i3);
                        h hVar = map.get(b2);
                        if (hVar != null && (decode == null || decode.replaceAll("[{}]", "").equals(b2))) {
                            if (hVar.a() != null) {
                                decode = hVar.a().toString();
                            } else if (hVar.d()) {
                                decode = null;
                            }
                        }
                        if (f(bundle, b2, decode, hVar)) {
                            return null;
                        }
                        i3++;
                    }
                }
            }
        }
        return bundle;
    }

    /* access modifiers changed from: package-private */
    public int d(String str) {
        if (this.f1084h == null || !this.f1083g.matcher(str).matches()) {
            return -1;
        }
        return new b(this.f1084h).compareTo(new b(str));
    }

    /* access modifiers changed from: package-private */
    public boolean e() {
        return this.f1080d;
    }
}
