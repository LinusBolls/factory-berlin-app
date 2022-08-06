package com.google.crypto.tink.shaded.protobuf;

/* compiled from: TextFormatEscaper */
final class l1 {

    /* compiled from: TextFormatEscaper */
    class a implements b {
        final /* synthetic */ i a;

        a(i iVar) {
            this.a = iVar;
        }

        public byte a(int i2) {
            return this.a.a(i2);
        }

        public int size() {
            return this.a.size();
        }
    }

    /* compiled from: TextFormatEscaper */
    private interface b {
        byte a(int i2);

        int size();
    }

    static String a(i iVar) {
        return b(new a(iVar));
    }

    static String b(b bVar) {
        StringBuilder sb = new StringBuilder(bVar.size());
        for (int i2 = 0; i2 < bVar.size(); i2++) {
            byte a2 = bVar.a(i2);
            if (a2 == 34) {
                sb.append("\\\"");
            } else if (a2 == 39) {
                sb.append("\\'");
            } else if (a2 != 92) {
                switch (a2) {
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
                        if (a2 >= 32 && a2 <= 126) {
                            sb.append((char) a2);
                            break;
                        } else {
                            sb.append('\\');
                            sb.append((char) (((a2 >>> 6) & 3) + 48));
                            sb.append((char) (((a2 >>> 3) & 7) + 48));
                            sb.append((char) ((a2 & 7) + 48));
                            break;
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    static String c(String str) {
        return a(i.j(str));
    }
}
