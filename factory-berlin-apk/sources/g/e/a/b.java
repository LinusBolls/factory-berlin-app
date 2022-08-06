package g.e.a;

import android.content.Context;
import kotlin.jvm.internal.k;

/* compiled from: AlarmScheduler.kt */
public interface b {

    /* compiled from: AlarmScheduler.kt */
    public static final class a {
        public static /* synthetic */ void a(b bVar, String str, long j2, String str2, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 4) != 0) {
                    str2 = "";
                }
                bVar.b(str, j2, str2);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: schedule");
        }
    }

    /* renamed from: g.e.a.b$b  reason: collision with other inner class name */
    /* compiled from: AlarmScheduler.kt */
    public static final class C0654b {
        public static final C0654b a = new C0654b();

        private C0654b() {
        }

        public final b a(Context context, int i2, a aVar) {
            k.e(context, "context");
            k.e(aVar, "listener");
            return com.sensorberg.alarms.internal.b.f4815i.b(context, i2, aVar);
        }
    }

    void a(String str);

    void b(String str, long j2, String str2);
}
