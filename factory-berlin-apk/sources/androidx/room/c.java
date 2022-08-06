package androidx.room;

import android.content.Context;
import androidx.room.l;
import e.s.a.c;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: DatabaseConfiguration */
public class c {
    public final c.C0584c a;
    public final Context b;
    public final String c;

    /* renamed from: d  reason: collision with root package name */
    public final l.d f1366d;

    /* renamed from: e  reason: collision with root package name */
    public final List<l.b> f1367e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f1368f;

    /* renamed from: g  reason: collision with root package name */
    public final l.c f1369g;

    /* renamed from: h  reason: collision with root package name */
    public final Executor f1370h;

    /* renamed from: i  reason: collision with root package name */
    public final Executor f1371i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f1372j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f1373k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f1374l;

    /* renamed from: m  reason: collision with root package name */
    private final Set<Integer> f1375m;

    public c(Context context, String str, c.C0584c cVar, l.d dVar, List<l.b> list, boolean z, l.c cVar2, Executor executor, Executor executor2, boolean z2, boolean z3, boolean z4, Set<Integer> set, String str2, File file) {
        this.a = cVar;
        this.b = context;
        this.c = str;
        this.f1366d = dVar;
        this.f1367e = list;
        this.f1368f = z;
        this.f1369g = cVar2;
        this.f1370h = executor;
        this.f1371i = executor2;
        this.f1372j = z2;
        this.f1373k = z3;
        this.f1374l = z4;
        this.f1375m = set;
    }

    public boolean a(int i2, int i3) {
        Set<Integer> set;
        if ((!(i2 > i3) || !this.f1374l) && this.f1373k && ((set = this.f1375m) == null || !set.contains(Integer.valueOf(i2)))) {
            return true;
        }
        return false;
    }
}
