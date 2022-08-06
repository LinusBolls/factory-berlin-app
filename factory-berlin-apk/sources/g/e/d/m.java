package g.e.d;

import android.content.Context;
import g.e.n.c.i.b;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.k;
import org.threeten.bp.LocalDate;

/* compiled from: RelativeDay.kt */
public enum m {
    Past,
    Today,
    Tomorrow,
    Future;
    

    /* renamed from: l  reason: collision with root package name */
    public static final a f9758l = null;

    /* compiled from: RelativeDay.kt */
    public static final class a {
        private a() {
        }

        public final m a(long j2) {
            long millis = TimeUnit.DAYS.toMillis(1);
            LocalDate u0 = LocalDate.x0().u0(1);
            k.d(u0, "LocalDate.now().minusDays(1)");
            long d2 = b.d(u0);
            long j3 = d2 + millis + millis;
            long j4 = millis + j3;
            if (j2 < d2) {
                return m.Past;
            }
            if (j2 < j3) {
                return m.Today;
            }
            if (j2 < j4) {
                return m.Tomorrow;
            }
            return m.Future;
        }

        public final String b(Context context, LocalDate localDate) {
            k.e(context, "context");
            k.e(localDate, "date");
            int i2 = l.a[f.d(localDate).ordinal()];
            if (i2 == 1 || i2 == 2) {
                String string = context.getString(j.label_schedule_today);
                k.d(string, "context.getString(R.string.label_schedule_today)");
                return string;
            } else if (i2 == 3) {
                String string2 = context.getString(j.label_schedule_tomorrow);
                k.d(string2, "context.getString(R.stri….label_schedule_tomorrow)");
                return string2;
            } else if (i2 == 4) {
                String b = d.f9748d.a().b(localDate);
                k.d(b, "DateFormatter.dayMonth.format(date)");
                return b;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        f9758l = new a((DefaultConstructorMarker) null);
    }
}
