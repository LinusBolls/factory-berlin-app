package g.a.a.n;

/* compiled from: CallState */
enum b {
    IDLE,
    ACTIVE,
    TERMINATED,
    CANCELED;

    /* compiled from: CallState */
    static class a {
        private final b a;

        private a(b bVar) {
            this.a = bVar;
        }

        static a b(b bVar) {
            return new a(bVar);
        }

        /* access modifiers changed from: package-private */
        public String a(b... bVarArr) {
            StringBuilder sb = new StringBuilder("Found: " + this.a.name() + ", but expected [");
            int length = bVarArr.length;
            String str = "";
            int i2 = 0;
            while (i2 < length) {
                b bVar = bVarArr[i2];
                sb.append(str);
                sb.append(bVar.name());
                i2++;
                str = ", ";
            }
            sb.append("]");
            return sb.toString();
        }
    }
}
