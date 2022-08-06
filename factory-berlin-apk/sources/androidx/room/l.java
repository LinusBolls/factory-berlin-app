package androidx.room;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Looper;
import android.util.Log;
import e.s.a.c;
import e.s.a.e;
import e.s.a.f;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: RoomDatabase */
public abstract class l {
    @Deprecated
    protected volatile e.s.a.b a;
    private Executor b;
    private Executor c;

    /* renamed from: d  reason: collision with root package name */
    private e.s.a.c f1405d;

    /* renamed from: e  reason: collision with root package name */
    private final i f1406e = g();

    /* renamed from: f  reason: collision with root package name */
    private boolean f1407f;

    /* renamed from: g  reason: collision with root package name */
    boolean f1408g;
    @Deprecated

    /* renamed from: h  reason: collision with root package name */
    protected List<b> f1409h;

    /* renamed from: i  reason: collision with root package name */
    private final ReentrantReadWriteLock f1410i = new ReentrantReadWriteLock();

    /* renamed from: j  reason: collision with root package name */
    private final ThreadLocal<Integer> f1411j = new ThreadLocal<>();

    /* renamed from: k  reason: collision with root package name */
    private final Map<String, Object> f1412k = new ConcurrentHashMap();

    /* compiled from: RoomDatabase */
    public static class a<T extends l> {
        private final Class<T> a;
        private final String b;
        private final Context c;

        /* renamed from: d  reason: collision with root package name */
        private ArrayList<b> f1413d;

        /* renamed from: e  reason: collision with root package name */
        private Executor f1414e;

        /* renamed from: f  reason: collision with root package name */
        private Executor f1415f;

        /* renamed from: g  reason: collision with root package name */
        private c.C0584c f1416g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f1417h;

        /* renamed from: i  reason: collision with root package name */
        private c f1418i = c.AUTOMATIC;

        /* renamed from: j  reason: collision with root package name */
        private boolean f1419j;

        /* renamed from: k  reason: collision with root package name */
        private boolean f1420k = true;

        /* renamed from: l  reason: collision with root package name */
        private boolean f1421l;

        /* renamed from: m  reason: collision with root package name */
        private final d f1422m = new d();

        /* renamed from: n  reason: collision with root package name */
        private Set<Integer> f1423n;
        private Set<Integer> o;
        private String p;
        private File q;

        a(Context context, Class<T> cls, String str) {
            this.c = context;
            this.a = cls;
            this.b = str;
        }

        public a<T> a(b bVar) {
            if (this.f1413d == null) {
                this.f1413d = new ArrayList<>();
            }
            this.f1413d.add(bVar);
            return this;
        }

        public a<T> b(androidx.room.v.a... aVarArr) {
            if (this.o == null) {
                this.o = new HashSet();
            }
            for (androidx.room.v.a aVar : aVarArr) {
                this.o.add(Integer.valueOf(aVar.a));
                this.o.add(Integer.valueOf(aVar.b));
            }
            this.f1422m.b(aVarArr);
            return this;
        }

        public a<T> c() {
            this.f1417h = true;
            return this;
        }

        @SuppressLint({"RestrictedApi"})
        public T d() {
            Executor executor;
            if (this.c == null) {
                throw new IllegalArgumentException("Cannot provide null context for the database.");
            } else if (this.a != null) {
                if (this.f1414e == null && this.f1415f == null) {
                    Executor e2 = e.b.a.a.a.e();
                    this.f1415f = e2;
                    this.f1414e = e2;
                } else {
                    Executor executor2 = this.f1414e;
                    if (executor2 != null && this.f1415f == null) {
                        this.f1415f = executor2;
                    } else if (this.f1414e == null && (executor = this.f1415f) != null) {
                        this.f1414e = executor;
                    }
                }
                Set<Integer> set = this.o;
                if (!(set == null || this.f1423n == null)) {
                    for (Integer next : set) {
                        if (this.f1423n.contains(next)) {
                            throw new IllegalArgumentException("Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: " + next);
                        }
                    }
                }
                if (this.f1416g == null) {
                    this.f1416g = new e.s.a.g.c();
                }
                if (!(this.p == null && this.q == null)) {
                    if (this.b == null) {
                        throw new IllegalArgumentException("Cannot create from asset or file for an in-memory database.");
                    } else if (this.p == null || this.q == null) {
                        this.f1416g = new r(this.p, this.q, this.f1416g);
                    } else {
                        throw new IllegalArgumentException("Both createFromAsset() and createFromFile() was called on this Builder but the database can only be created using one of the two configurations.");
                    }
                }
                Context context = this.c;
                String str = this.b;
                c.C0584c cVar = this.f1416g;
                d dVar = this.f1422m;
                ArrayList<b> arrayList = this.f1413d;
                boolean z = this.f1417h;
                c f2 = this.f1418i.f(context);
                Executor executor3 = this.f1414e;
                Executor executor4 = this.f1415f;
                boolean z2 = this.f1419j;
                boolean z3 = this.f1420k;
                boolean z4 = this.f1421l;
                boolean z5 = z3;
                boolean z6 = z4;
                c cVar2 = new c(context, str, cVar, dVar, arrayList, z, f2, executor3, executor4, z2, z5, z6, this.f1423n, this.p, this.q);
                T t = (l) k.b(this.a, "_Impl");
                t.q(cVar2);
                return t;
            } else {
                throw new IllegalArgumentException("Must provide an abstract class that extends RoomDatabase");
            }
        }

        public a<T> e() {
            this.f1420k = false;
            this.f1421l = true;
            return this;
        }

        public a<T> f(Executor executor) {
            this.f1414e = executor;
            return this;
        }
    }

    /* compiled from: RoomDatabase */
    public static abstract class b {
        public void a(e.s.a.b bVar) {
        }

        public void b(e.s.a.b bVar) {
        }

        public void c(e.s.a.b bVar) {
        }
    }

    /* compiled from: RoomDatabase */
    public enum c {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING;

        private static boolean a(ActivityManager activityManager) {
            if (Build.VERSION.SDK_INT >= 19) {
                return activityManager.isLowRamDevice();
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        @SuppressLint({"NewApi"})
        public c f(Context context) {
            ActivityManager activityManager;
            if (this != AUTOMATIC) {
                return this;
            }
            if (Build.VERSION.SDK_INT < 16 || (activityManager = (ActivityManager) context.getSystemService("activity")) == null || a(activityManager)) {
                return TRUNCATE;
            }
            return WRITE_AHEAD_LOGGING;
        }
    }

    /* compiled from: RoomDatabase */
    public static class d {
        private HashMap<Integer, TreeMap<Integer, androidx.room.v.a>> a = new HashMap<>();

        private void a(androidx.room.v.a aVar) {
            int i2 = aVar.a;
            int i3 = aVar.b;
            TreeMap treeMap = this.a.get(Integer.valueOf(i2));
            if (treeMap == null) {
                treeMap = new TreeMap();
                this.a.put(Integer.valueOf(i2), treeMap);
            }
            androidx.room.v.a aVar2 = (androidx.room.v.a) treeMap.get(Integer.valueOf(i3));
            if (aVar2 != null) {
                Log.w("ROOM", "Overriding migration " + aVar2 + " with " + aVar);
            }
            treeMap.put(Integer.valueOf(i3), aVar);
        }

        private List<androidx.room.v.a> d(List<androidx.room.v.a> list, boolean z, int i2, int i3) {
            Set set;
            boolean z2;
            do {
                if (z) {
                    if (i2 >= i3) {
                        return list;
                    }
                } else if (i2 <= i3) {
                    return list;
                }
                TreeMap treeMap = this.a.get(Integer.valueOf(i2));
                if (treeMap != null) {
                    if (z) {
                        set = treeMap.descendingKeySet();
                    } else {
                        set = treeMap.keySet();
                    }
                    Iterator it = set.iterator();
                    while (true) {
                        z2 = true;
                        boolean z3 = false;
                        if (!it.hasNext()) {
                            z2 = false;
                            continue;
                            break;
                        }
                        int intValue = ((Integer) it.next()).intValue();
                        if (!z ? !(intValue < i3 || intValue >= i2) : !(intValue > i3 || intValue <= i2)) {
                            z3 = true;
                            continue;
                        }
                        if (z3) {
                            list.add(treeMap.get(Integer.valueOf(intValue)));
                            i2 = intValue;
                            continue;
                            break;
                        }
                    }
                } else {
                    return null;
                }
            } while (z2);
            return null;
        }

        public void b(androidx.room.v.a... aVarArr) {
            for (androidx.room.v.a a2 : aVarArr) {
                a(a2);
            }
        }

        public List<androidx.room.v.a> c(int i2, int i3) {
            if (i2 == i3) {
                return Collections.emptyList();
            }
            return d(new ArrayList(), i3 > i2, i2, i3);
        }
    }

    private static boolean s() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public void a() {
        if (!this.f1407f && s()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public void b() {
        if (!p() && this.f1411j.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    @Deprecated
    public void c() {
        a();
        e.s.a.b b2 = this.f1405d.b();
        this.f1406e.q(b2);
        b2.beginTransaction();
    }

    public abstract void d();

    public void e() {
        if (t()) {
            ReentrantReadWriteLock.WriteLock writeLock = this.f1410i.writeLock();
            try {
                writeLock.lock();
                this.f1406e.n();
                this.f1405d.close();
            } finally {
                writeLock.unlock();
            }
        }
    }

    public f f(String str) {
        a();
        b();
        return this.f1405d.b().G(str);
    }

    /* access modifiers changed from: protected */
    public abstract i g();

    /* access modifiers changed from: protected */
    public abstract e.s.a.c h(c cVar);

    @Deprecated
    public void i() {
        this.f1405d.b().endTransaction();
        if (!p()) {
            this.f1406e.h();
        }
    }

    /* access modifiers changed from: package-private */
    public Map<String, Object> j() {
        return this.f1412k;
    }

    /* access modifiers changed from: package-private */
    public Lock k() {
        return this.f1410i.readLock();
    }

    public i l() {
        return this.f1406e;
    }

    public e.s.a.c m() {
        return this.f1405d;
    }

    public Executor n() {
        return this.b;
    }

    public Executor o() {
        return this.c;
    }

    public boolean p() {
        return this.f1405d.b().inTransaction();
    }

    public void q(c cVar) {
        e.s.a.c h2 = h(cVar);
        this.f1405d = h2;
        if (h2 instanceof q) {
            ((q) h2).e(cVar);
        }
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 16) {
            if (cVar.f1369g == c.WRITE_AHEAD_LOGGING) {
                z = true;
            }
            this.f1405d.a(z);
        }
        this.f1409h = cVar.f1367e;
        this.b = cVar.f1370h;
        this.c = new u(cVar.f1371i);
        this.f1407f = cVar.f1368f;
        this.f1408g = z;
        if (cVar.f1372j) {
            this.f1406e.l(cVar.b, cVar.c);
        }
    }

    /* access modifiers changed from: protected */
    public void r(e.s.a.b bVar) {
        this.f1406e.f(bVar);
    }

    public boolean t() {
        e.s.a.b bVar = this.a;
        return bVar != null && bVar.isOpen();
    }

    public Cursor u(e eVar) {
        return v(eVar, (CancellationSignal) null);
    }

    public Cursor v(e eVar, CancellationSignal cancellationSignal) {
        a();
        b();
        if (cancellationSignal == null || Build.VERSION.SDK_INT < 16) {
            return this.f1405d.b().J(eVar);
        }
        return this.f1405d.b().T(eVar, cancellationSignal);
    }

    public void w(Runnable runnable) {
        c();
        try {
            runnable.run();
            x();
        } finally {
            i();
        }
    }

    @Deprecated
    public void x() {
        this.f1405d.b().setTransactionSuccessful();
    }
}
