package kotlin.j0;

import java.io.Serializable;
import java.util.regex.Pattern;
import kotlin.jvm.internal.k;

/* compiled from: Regex.kt */
public final class f implements Serializable {

    /* renamed from: g  reason: collision with root package name */
    private final Pattern f10658g;

    /* compiled from: Regex.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new a((DefaultConstructorMarker) null);
    }

    public f(Pattern pattern) {
        k.e(pattern, "nativePattern");
        this.f10658g = pattern;
    }

    public final boolean a(CharSequence charSequence) {
        k.e(charSequence, "input");
        return this.f10658g.matcher(charSequence).matches();
    }

    public final String b(CharSequence charSequence, String str) {
        k.e(charSequence, "input");
        k.e(str, "replacement");
        String replaceAll = this.f10658g.matcher(charSequence).replaceAll(str);
        k.d(replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
        return replaceAll;
    }

    public String toString() {
        String pattern = this.f10658g.toString();
        k.d(pattern, "nativePattern.toString()");
        return pattern;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public f(java.lang.String r2) {
        /*
            r1 = this;
            java.lang.String r0 = "pattern"
            kotlin.jvm.internal.k.e(r2, r0)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)
            java.lang.String r0 = "Pattern.compile(pattern)"
            kotlin.jvm.internal.k.d(r2, r0)
            r1.<init>((java.util.regex.Pattern) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.j0.f.<init>(java.lang.String):void");
    }
}
