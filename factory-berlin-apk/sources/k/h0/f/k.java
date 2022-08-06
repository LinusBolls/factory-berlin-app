package k.h0.f;

import java.net.ProtocolException;
import k.a0;

/* compiled from: StatusLine.kt */
public final class k {

    /* renamed from: d  reason: collision with root package name */
    public static final a f10429d = new a((DefaultConstructorMarker) null);
    public final a0 a;
    public final int b;
    public final String c;

    /* compiled from: StatusLine.kt */
    public static final class a {
        private a() {
        }

        public final k a(String str) {
            a0 a0Var;
            String str2;
            kotlin.jvm.internal.k.f(str, "statusLine");
            int i2 = 9;
            if (p.D(str, "HTTP/1.", false, 2, (Object) null)) {
                if (str.length() < 9 || str.charAt(8) != ' ') {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
                int charAt = str.charAt(7) - '0';
                if (charAt == 0) {
                    a0Var = a0.HTTP_1_0;
                } else if (charAt == 1) {
                    a0Var = a0.HTTP_1_1;
                } else {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
            } else if (p.D(str, "ICY ", false, 2, (Object) null)) {
                a0Var = a0.HTTP_1_0;
                i2 = 4;
            } else {
                throw new ProtocolException("Unexpected status line: " + str);
            }
            int i3 = i2 + 3;
            if (str.length() >= i3) {
                try {
                    String substring = str.substring(i2, i3);
                    kotlin.jvm.internal.k.b(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    int parseInt = Integer.parseInt(substring);
                    if (str.length() <= i3) {
                        str2 = "";
                    } else if (str.charAt(i3) == ' ') {
                        str2 = str.substring(i2 + 4);
                        kotlin.jvm.internal.k.b(str2, "(this as java.lang.String).substring(startIndex)");
                    } else {
                        throw new ProtocolException("Unexpected status line: " + str);
                    }
                    return new k(a0Var, parseInt, str2);
                } catch (NumberFormatException unused) {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
            } else {
                throw new ProtocolException("Unexpected status line: " + str);
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public k(a0 a0Var, int i2, String str) {
        kotlin.jvm.internal.k.f(a0Var, "protocol");
        kotlin.jvm.internal.k.f(str, "message");
        this.a = a0Var;
        this.b = i2;
        this.c = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.a == a0.HTTP_1_0) {
            sb.append("HTTP/1.0");
        } else {
            sb.append("HTTP/1.1");
        }
        sb.append(' ');
        sb.append(this.b);
        sb.append(' ');
        sb.append(this.c);
        String sb2 = sb.toString();
        kotlin.jvm.internal.k.b(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
