package g.e.n.c.g;

import kotlin.jvm.internal.k;

/* compiled from: PostBox.kt */
public abstract class d {

    /* compiled from: PostBox.kt */
    public static final class a extends d {
        private final String a;
        private final e b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(String str, e eVar) {
            super((DefaultConstructorMarker) null);
            k.e(str, "pkaId");
            k.e(eVar, "postBoxCredentials");
            this.a = str;
            this.b = eVar;
        }

        public String a() {
            return this.a;
        }

        public e b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return k.a(a(), aVar.a()) && k.a(b(), aVar.b());
        }

        public int hashCode() {
            String a2 = a();
            int i2 = 0;
            int hashCode = (a2 != null ? a2.hashCode() : 0) * 31;
            e b2 = b();
            if (b2 != null) {
                i2 = b2.hashCode();
            }
            return hashCode + i2;
        }

        public String toString() {
            return "LetterPostBox(pkaId=" + a() + ", postBoxCredentials=" + b() + ")";
        }
    }

    /* compiled from: PostBox.kt */
    public static final class b extends d {
        private final String a;
        private final e b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(String str, e eVar) {
            super((DefaultConstructorMarker) null);
            k.e(str, "pkaId");
            this.a = str;
            this.b = eVar;
        }

        public static /* synthetic */ b d(b bVar, String str, e eVar, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = bVar.a();
            }
            if ((i2 & 2) != 0) {
                eVar = bVar.b();
            }
            return bVar.c(str, eVar);
        }

        public String a() {
            return this.a;
        }

        public e b() {
            return this.b;
        }

        public final b c(String str, e eVar) {
            k.e(str, "pkaId");
            return new b(str, eVar);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return k.a(a(), bVar.a()) && k.a(b(), bVar.b());
        }

        public int hashCode() {
            String a2 = a();
            int i2 = 0;
            int hashCode = (a2 != null ? a2.hashCode() : 0) * 31;
            e b2 = b();
            if (b2 != null) {
                i2 = b2.hashCode();
            }
            return hashCode + i2;
        }

        public String toString() {
            return "ParcelPostBox(pkaId=" + a() + ", postBoxCredentials=" + b() + ")";
        }
    }

    private d() {
    }

    public abstract String a();

    public abstract e b();

    public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
