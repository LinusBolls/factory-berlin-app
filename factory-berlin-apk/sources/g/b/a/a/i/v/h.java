package g.b.a.a.i.v;

import android.content.Context;
import android.os.Build;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.e;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.g;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.s;
import g.b.a.a.i.v.j.c;
import g.b.a.a.i.w.a;

/* compiled from: SchedulingModule */
public abstract class h {
    static s a(Context context, c cVar, g gVar, a aVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            return new e(context, cVar, gVar);
        }
        return new com.google.android.datatransport.runtime.scheduling.jobscheduling.a(context, cVar, aVar, gVar);
    }
}
