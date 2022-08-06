package androidx.work.impl.j.a;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.i;
import androidx.work.impl.d;
import androidx.work.impl.h;
import androidx.work.impl.k.c;
import androidx.work.impl.l.j;
import androidx.work.p;
import de.baimos.blueid.sdk.metrics.AndroidSdkMetrics;
import java.util.ArrayList;
import java.util.List;

/* compiled from: GreedyScheduler */
public class a implements d, c, androidx.work.impl.a {

    /* renamed from: l  reason: collision with root package name */
    private static final String f1695l = i.f("GreedyScheduler");

    /* renamed from: g  reason: collision with root package name */
    private h f1696g;

    /* renamed from: h  reason: collision with root package name */
    private androidx.work.impl.k.d f1697h;

    /* renamed from: i  reason: collision with root package name */
    private List<j> f1698i = new ArrayList();

    /* renamed from: j  reason: collision with root package name */
    private boolean f1699j;

    /* renamed from: k  reason: collision with root package name */
    private final Object f1700k;

    public a(Context context, androidx.work.impl.utils.k.a aVar, h hVar) {
        this.f1696g = hVar;
        this.f1697h = new androidx.work.impl.k.d(context, aVar, this);
        this.f1700k = new Object();
    }

    private void b() {
        if (!this.f1699j) {
            this.f1696g.s().b(this);
            this.f1699j = true;
        }
    }

    private void e(String str) {
        synchronized (this.f1700k) {
            int size = this.f1698i.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                } else if (this.f1698i.get(i2).a.equals(str)) {
                    i.c().a(f1695l, String.format("Stopping tracking for %s", new Object[]{str}), new Throwable[0]);
                    this.f1698i.remove(i2);
                    this.f1697h.d(this.f1698i);
                    break;
                } else {
                    i2++;
                }
            }
        }
    }

    public void a(String str, boolean z) {
        e(str);
    }

    public void c(List<String> list) {
        for (String next : list) {
            i.c().a(f1695l, String.format("Constraints not met: Cancelling work ID %s", new Object[]{next}), new Throwable[0]);
            this.f1696g.C(next);
        }
    }

    public void cancel(String str) {
        b();
        i.c().a(f1695l, String.format("Cancelling work ID %s", new Object[]{str}), new Throwable[0]);
        this.f1696g.C(str);
    }

    public void d(List<String> list) {
        for (String next : list) {
            i.c().a(f1695l, String.format("Constraints met: Scheduling work ID %s", new Object[]{next}), new Throwable[0]);
            this.f1696g.A(next);
        }
    }

    public void schedule(j... jVarArr) {
        b();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (j jVar : jVarArr) {
            if (jVar.b == p.ENQUEUED && !jVar.d() && jVar.f1725g == 0 && !jVar.c()) {
                if (!jVar.b()) {
                    i.c().a(f1695l, String.format("Starting work for %s", new Object[]{jVar.a}), new Throwable[0]);
                    this.f1696g.A(jVar.a);
                } else if (Build.VERSION.SDK_INT < 24 || !jVar.f1728j.e()) {
                    arrayList.add(jVar);
                    arrayList2.add(jVar.a);
                }
            }
        }
        synchronized (this.f1700k) {
            if (!arrayList.isEmpty()) {
                i.c().a(f1695l, String.format("Starting tracking for [%s]", new Object[]{TextUtils.join(AndroidSdkMetrics.SEPARATOR, arrayList2)}), new Throwable[0]);
                this.f1698i.addAll(arrayList);
                this.f1697h.d(this.f1698i);
            }
        }
    }
}
