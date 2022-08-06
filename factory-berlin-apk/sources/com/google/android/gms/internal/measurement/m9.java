package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
final class m9 {
    static String a(t5 t5Var) {
        p9 p9Var = new p9(t5Var);
        StringBuilder sb = new StringBuilder(p9Var.b());
        for (int i2 = 0; i2 < p9Var.b(); i2++) {
            byte f2 = p9Var.f(i2);
            if (f2 == 34) {
                sb.append("\\\"");
            } else if (f2 == 39) {
                sb.append("\\'");
            } else if (f2 != 92) {
                switch (f2) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (f2 >= 32 && f2 <= 126) {
                            sb.append((char) f2);
                            break;
                        } else {
                            sb.append('\\');
                            sb.append((char) (((f2 >>> 6) & 3) + 48));
                            sb.append((char) (((f2 >>> 3) & 7) + 48));
                            sb.append((char) ((f2 & 7) + 48));
                            break;
                        }
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }
}
