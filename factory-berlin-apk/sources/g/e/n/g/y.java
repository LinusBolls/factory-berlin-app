package g.e.n.g;

import androidx.lifecycle.LiveData;
import com.sensorberg.smartspaces.sdk.model.User;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.k;

/* compiled from: UserManager.kt */
public interface y {

    /* compiled from: UserManager.kt */
    public static abstract class a {

        /* renamed from: g.e.n.g.y$a$a  reason: collision with other inner class name */
        /* compiled from: UserManager.kt */
        public static final class C0726a extends a {
            public static final C0726a a = new C0726a();

            private C0726a() {
                super((DefaultConstructorMarker) null);
            }

            public String toString() {
                return "Initialising";
            }
        }

        /* compiled from: UserManager.kt */
        public static final class b extends a {
            private final e a;
            private final String b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public b(e eVar, String str) {
                super((DefaultConstructorMarker) null);
                k.e(eVar, "reason");
                k.e(str, "message");
                this.a = eVar;
                this.b = str;
            }

            public final String a() {
                return this.b;
            }

            public final e b() {
                return this.a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return k.a(this.a, bVar.a) && k.a(this.b, bVar.b);
            }

            public int hashCode() {
                e eVar = this.a;
                int i2 = 0;
                int hashCode = (eVar != null ? eVar.hashCode() : 0) * 31;
                String str = this.b;
                if (str != null) {
                    i2 = str.hashCode();
                }
                return hashCode + i2;
            }

            public String toString() {
                return "Logging out. " + this.a + " - " + this.b;
            }
        }

        /* compiled from: UserManager.kt */
        public static final class c extends a {
            private final e a;
            private final String b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public c(e eVar, String str) {
                super((DefaultConstructorMarker) null);
                k.e(eVar, "reason");
                k.e(str, "message");
                this.a = eVar;
                this.b = str;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return k.a(this.a, cVar.a) && k.a(this.b, cVar.b);
            }

            public int hashCode() {
                e eVar = this.a;
                int i2 = 0;
                int hashCode = (eVar != null ? eVar.hashCode() : 0) * 31;
                String str = this.b;
                if (str != null) {
                    i2 = str.hashCode();
                }
                return hashCode + i2;
            }

            public String toString() {
                return "Not logged in. " + this.a + " - " + this.b;
            }
        }

        /* compiled from: UserManager.kt */
        public static final class d extends a {
            public static final d a = new d();

            private d() {
                super((DefaultConstructorMarker) null);
            }

            public String toString() {
                return "Ready";
            }
        }

        /* compiled from: UserManager.kt */
        public enum e {
            NotLoggedIn,
            ClientApplicationRequestedLogout,
            UserNotAuthorised,
            EncryptionFailure;

            public String toString() {
                int i2 = z.a[ordinal()];
                if (i2 == 1) {
                    return "NotLoggedIn";
                }
                if (i2 == 2) {
                    return "ClientApplicationRequestedLogout";
                }
                if (i2 == 3) {
                    return "UserNotAuthorised";
                }
                if (i2 == 4) {
                    return "EncryptionFailure";
                }
                throw new NoWhenBranchMatchedException();
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    LiveData<g.e.m.a<Void, Void>> A(String str);

    void g();

    LiveData<a> getStatusLiveData();

    LiveData<g.e.m.a<User, Void>> h();

    LiveData<g.e.m.a<Void, Void>> i(String str, String str2);

    LiveData<g.e.m.a<Void, Void>> w(String str, String str2, String str3);

    LiveData<g.e.m.a<Void, Void>> y(String str);
}
