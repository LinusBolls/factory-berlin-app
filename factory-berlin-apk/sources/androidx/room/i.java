package androidx.room;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import androidx.lifecycle.LiveData;
import e.s.a.f;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;

/* compiled from: InvalidationTracker */
public class i {

    /* renamed from: m  reason: collision with root package name */
    private static final String[] f1376m = {"UPDATE", "DELETE", "INSERT"};
    final HashMap<String, Integer> a;
    final String[] b;
    private Map<String, Set<String>> c;

    /* renamed from: d  reason: collision with root package name */
    final l f1377d;

    /* renamed from: e  reason: collision with root package name */
    AtomicBoolean f1378e;

    /* renamed from: f  reason: collision with root package name */
    private volatile boolean f1379f;

    /* renamed from: g  reason: collision with root package name */
    volatile f f1380g;

    /* renamed from: h  reason: collision with root package name */
    private b f1381h;

    /* renamed from: i  reason: collision with root package name */
    private final h f1382i;
    @SuppressLint({"RestrictedApi"})

    /* renamed from: j  reason: collision with root package name */
    final e.b.a.b.b<c, d> f1383j;

    /* renamed from: k  reason: collision with root package name */
    private j f1384k;

    /* renamed from: l  reason: collision with root package name */
    Runnable f1385l;

    /* compiled from: InvalidationTracker */
    class a implements Runnable {
        a() {
        }

        /* JADX INFO: finally extract failed */
        private Set<Integer> a() {
            HashSet hashSet = new HashSet();
            Cursor u = i.this.f1377d.u(new e.s.a.a("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"));
            while (u.moveToNext()) {
                try {
                    hashSet.add(Integer.valueOf(u.getInt(0)));
                } catch (Throwable th) {
                    u.close();
                    throw th;
                }
            }
            u.close();
            if (!hashSet.isEmpty()) {
                i.this.f1380g.executeUpdateDelete();
            }
            return hashSet;
        }

        public void run() {
            e.s.a.b b;
            Lock k2 = i.this.f1377d.k();
            Set<Integer> set = null;
            try {
                k2.lock();
                if (!i.this.e()) {
                    k2.unlock();
                } else if (!i.this.f1378e.compareAndSet(true, false)) {
                    k2.unlock();
                } else if (i.this.f1377d.p()) {
                    k2.unlock();
                } else {
                    if (i.this.f1377d.f1408g) {
                        b = i.this.f1377d.m().b();
                        b.beginTransaction();
                        set = a();
                        b.setTransactionSuccessful();
                        b.endTransaction();
                    } else {
                        set = a();
                    }
                    k2.unlock();
                    if (set != null && !set.isEmpty()) {
                        synchronized (i.this.f1383j) {
                            Iterator<Map.Entry<c, d>> it = i.this.f1383j.iterator();
                            while (it.hasNext()) {
                                ((d) it.next().getValue()).a(set);
                            }
                        }
                    }
                }
            } catch (SQLiteException | IllegalStateException e2) {
                try {
                    Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e2);
                } catch (Throwable th) {
                    k2.unlock();
                    throw th;
                }
            } catch (Throwable th2) {
                b.endTransaction();
                throw th2;
            }
        }
    }

    /* compiled from: InvalidationTracker */
    static class b {
        final long[] a;
        final boolean[] b;
        final int[] c;

        /* renamed from: d  reason: collision with root package name */
        boolean f1387d;

        /* renamed from: e  reason: collision with root package name */
        boolean f1388e;

        b(int i2) {
            long[] jArr = new long[i2];
            this.a = jArr;
            this.b = new boolean[i2];
            this.c = new int[i2];
            Arrays.fill(jArr, 0);
            Arrays.fill(this.b, false);
        }

        /* access modifiers changed from: package-private */
        public int[] a() {
            synchronized (this) {
                if (this.f1387d) {
                    if (!this.f1388e) {
                        int length = this.a.length;
                        int i2 = 0;
                        while (true) {
                            int i3 = 1;
                            if (i2 < length) {
                                boolean z = this.a[i2] > 0;
                                if (z != this.b[i2]) {
                                    int[] iArr = this.c;
                                    if (!z) {
                                        i3 = 2;
                                    }
                                    iArr[i2] = i3;
                                } else {
                                    this.c[i2] = 0;
                                }
                                this.b[i2] = z;
                                i2++;
                            } else {
                                this.f1388e = true;
                                this.f1387d = false;
                                int[] iArr2 = this.c;
                                return iArr2;
                            }
                        }
                    }
                }
                return null;
            }
        }

        /* access modifiers changed from: package-private */
        public boolean b(int... iArr) {
            boolean z;
            synchronized (this) {
                z = false;
                for (int i2 : iArr) {
                    long j2 = this.a[i2];
                    this.a[i2] = 1 + j2;
                    if (j2 == 0) {
                        this.f1387d = true;
                        z = true;
                    }
                }
            }
            return z;
        }

        /* access modifiers changed from: package-private */
        public boolean c(int... iArr) {
            boolean z;
            synchronized (this) {
                z = false;
                for (int i2 : iArr) {
                    long j2 = this.a[i2];
                    this.a[i2] = j2 - 1;
                    if (j2 == 1) {
                        this.f1387d = true;
                        z = true;
                    }
                }
            }
            return z;
        }

        /* access modifiers changed from: package-private */
        public void d() {
            synchronized (this) {
                this.f1388e = false;
            }
        }
    }

    /* compiled from: InvalidationTracker */
    static class d {
        final int[] a;
        private final String[] b;
        final c c;

        /* renamed from: d  reason: collision with root package name */
        private final Set<String> f1389d;

        d(c cVar, int[] iArr, String[] strArr) {
            this.c = cVar;
            this.a = iArr;
            this.b = strArr;
            if (iArr.length == 1) {
                HashSet hashSet = new HashSet();
                hashSet.add(this.b[0]);
                this.f1389d = Collections.unmodifiableSet(hashSet);
                return;
            }
            this.f1389d = null;
        }

        /* access modifiers changed from: package-private */
        public void a(Set<Integer> set) {
            int length = this.a.length;
            Set set2 = null;
            for (int i2 = 0; i2 < length; i2++) {
                if (set.contains(Integer.valueOf(this.a[i2]))) {
                    if (length == 1) {
                        set2 = this.f1389d;
                    } else {
                        if (set2 == null) {
                            set2 = new HashSet(length);
                        }
                        set2.add(this.b[i2]);
                    }
                }
            }
            if (set2 != null) {
                this.c.b(set2);
            }
        }

        /* access modifiers changed from: package-private */
        public void b(String[] strArr) {
            Set<String> set = null;
            if (this.b.length == 1) {
                int length = strArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    } else if (strArr[i2].equalsIgnoreCase(this.b[0])) {
                        set = this.f1389d;
                        break;
                    } else {
                        i2++;
                    }
                }
            } else {
                HashSet hashSet = new HashSet();
                for (String str : strArr) {
                    String[] strArr2 = this.b;
                    int length2 = strArr2.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length2) {
                            break;
                        }
                        String str2 = strArr2[i3];
                        if (str2.equalsIgnoreCase(str)) {
                            hashSet.add(str2);
                            break;
                        }
                        i3++;
                    }
                }
                if (hashSet.size() > 0) {
                    set = hashSet;
                }
            }
            if (set != null) {
                this.c.b(set);
            }
        }
    }

    /* compiled from: InvalidationTracker */
    static class e extends c {
        final i b;
        final WeakReference<c> c;

        e(i iVar, c cVar) {
            super(cVar.a);
            this.b = iVar;
            this.c = new WeakReference<>(cVar);
        }

        public void b(Set<String> set) {
            c cVar = (c) this.c.get();
            if (cVar == null) {
                this.b.j(this);
            } else {
                cVar.b(set);
            }
        }
    }

    public i(l lVar, String... strArr) {
        this(lVar, new HashMap(), Collections.emptyMap(), strArr);
    }

    private static void c(StringBuilder sb, String str, String str2) {
        sb.append("`");
        sb.append("room_table_modification_trigger_");
        sb.append(str);
        sb.append("_");
        sb.append(str2);
        sb.append("`");
    }

    private String[] k(String[] strArr) {
        HashSet hashSet = new HashSet();
        for (String str : strArr) {
            String lowerCase = str.toLowerCase(Locale.US);
            if (this.c.containsKey(lowerCase)) {
                hashSet.addAll(this.c.get(lowerCase));
            } else {
                hashSet.add(str);
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    private void m(e.s.a.b bVar, int i2) {
        bVar.execSQL("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i2 + ", 0)");
        String str = this.b[i2];
        StringBuilder sb = new StringBuilder();
        for (String str2 : f1376m) {
            sb.setLength(0);
            sb.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
            c(sb, str, str2);
            sb.append(" AFTER ");
            sb.append(str2);
            sb.append(" ON `");
            sb.append(str);
            sb.append("` BEGIN UPDATE ");
            sb.append("room_table_modification_log");
            sb.append(" SET ");
            sb.append("invalidated");
            sb.append(" = 1");
            sb.append(" WHERE ");
            sb.append("table_id");
            sb.append(" = ");
            sb.append(i2);
            sb.append(" AND ");
            sb.append("invalidated");
            sb.append(" = 0");
            sb.append("; END");
            bVar.execSQL(sb.toString());
        }
    }

    private void o(e.s.a.b bVar, int i2) {
        String str = this.b[i2];
        StringBuilder sb = new StringBuilder();
        for (String c2 : f1376m) {
            sb.setLength(0);
            sb.append("DROP TRIGGER IF EXISTS ");
            c(sb, str, c2);
            bVar.execSQL(sb.toString());
        }
    }

    private String[] r(String[] strArr) {
        String[] k2 = k(strArr);
        int length = k2.length;
        int i2 = 0;
        while (i2 < length) {
            String str = k2[i2];
            if (this.a.containsKey(str.toLowerCase(Locale.US))) {
                i2++;
            } else {
                throw new IllegalArgumentException("There is no table with name " + str);
            }
        }
        return k2;
    }

    @SuppressLint({"RestrictedApi"})
    public void a(c cVar) {
        d k2;
        String[] k3 = k(cVar.a);
        int[] iArr = new int[k3.length];
        int length = k3.length;
        int i2 = 0;
        while (i2 < length) {
            Integer num = this.a.get(k3[i2].toLowerCase(Locale.US));
            if (num != null) {
                iArr[i2] = num.intValue();
                i2++;
            } else {
                throw new IllegalArgumentException("There is no table with name " + k3[i2]);
            }
        }
        d dVar = new d(cVar, iArr, k3);
        synchronized (this.f1383j) {
            k2 = this.f1383j.k(cVar, dVar);
        }
        if (k2 == null && this.f1381h.b(iArr)) {
            p();
        }
    }

    public void b(c cVar) {
        a(new e(this, cVar));
    }

    public <T> LiveData<T> d(String[] strArr, boolean z, Callable<T> callable) {
        return this.f1382i.a(r(strArr), z, callable);
    }

    /* access modifiers changed from: package-private */
    public boolean e() {
        if (!this.f1377d.t()) {
            return false;
        }
        if (!this.f1379f) {
            this.f1377d.m().b();
        }
        if (this.f1379f) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    /* access modifiers changed from: package-private */
    public void f(e.s.a.b bVar) {
        synchronized (this) {
            if (this.f1379f) {
                Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                return;
            }
            bVar.execSQL("PRAGMA temp_store = MEMORY;");
            bVar.execSQL("PRAGMA recursive_triggers='ON';");
            bVar.execSQL("CREATE TEMP TABLE room_table_modification_log(table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            q(bVar);
            this.f1380g = bVar.G("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1 ");
            this.f1379f = true;
        }
    }

    public void g(String... strArr) {
        synchronized (this.f1383j) {
            Iterator<Map.Entry<c, d>> it = this.f1383j.iterator();
            while (it.hasNext()) {
                Map.Entry next = it.next();
                if (!((c) next.getKey()).a()) {
                    ((d) next.getValue()).b(strArr);
                }
            }
        }
    }

    public void h() {
        if (this.f1378e.compareAndSet(false, true)) {
            this.f1377d.n().execute(this.f1385l);
        }
    }

    public void i() {
        p();
        this.f1385l.run();
    }

    @SuppressLint({"RestrictedApi"})
    public void j(c cVar) {
        d l2;
        synchronized (this.f1383j) {
            l2 = this.f1383j.l(cVar);
        }
        if (l2 != null && this.f1381h.c(l2.a)) {
            p();
        }
    }

    /* access modifiers changed from: package-private */
    public void l(Context context, String str) {
        this.f1384k = new j(context, str, this, this.f1377d.n());
    }

    /* access modifiers changed from: package-private */
    public void n() {
        j jVar = this.f1384k;
        if (jVar != null) {
            jVar.a();
            this.f1384k = null;
        }
    }

    /* access modifiers changed from: package-private */
    public void p() {
        if (this.f1377d.t()) {
            q(this.f1377d.m().b());
        }
    }

    /* access modifiers changed from: package-private */
    public void q(e.s.a.b bVar) {
        if (!bVar.inTransaction()) {
            while (true) {
                try {
                    Lock k2 = this.f1377d.k();
                    k2.lock();
                    try {
                        int[] a2 = this.f1381h.a();
                        if (a2 == null) {
                            k2.unlock();
                            return;
                        }
                        int length = a2.length;
                        bVar.beginTransaction();
                        for (int i2 = 0; i2 < length; i2++) {
                            int i3 = a2[i2];
                            if (i3 == 1) {
                                m(bVar, i2);
                            } else if (i3 == 2) {
                                o(bVar, i2);
                            }
                        }
                        bVar.setTransactionSuccessful();
                        bVar.endTransaction();
                        this.f1381h.d();
                        k2.unlock();
                    } catch (Throwable th) {
                        k2.unlock();
                        throw th;
                    }
                } catch (SQLiteException | IllegalStateException e2) {
                    Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e2);
                    return;
                }
            }
        }
    }

    public i(l lVar, Map<String, String> map, Map<String, Set<String>> map2, String... strArr) {
        this.f1378e = new AtomicBoolean(false);
        this.f1379f = false;
        this.f1383j = new e.b.a.b.b<>();
        this.f1385l = new a();
        this.f1377d = lVar;
        this.f1381h = new b(strArr.length);
        this.a = new HashMap<>();
        this.c = map2;
        this.f1382i = new h(this.f1377d);
        int length = strArr.length;
        this.b = new String[length];
        for (int i2 = 0; i2 < length; i2++) {
            String lowerCase = strArr[i2].toLowerCase(Locale.US);
            this.a.put(lowerCase, Integer.valueOf(i2));
            String str = map.get(strArr[i2]);
            if (str != null) {
                this.b[i2] = str.toLowerCase(Locale.US);
            } else {
                this.b[i2] = lowerCase;
            }
        }
        for (Map.Entry next : map.entrySet()) {
            String lowerCase2 = ((String) next.getValue()).toLowerCase(Locale.US);
            if (this.a.containsKey(lowerCase2)) {
                String lowerCase3 = ((String) next.getKey()).toLowerCase(Locale.US);
                HashMap<String, Integer> hashMap = this.a;
                hashMap.put(lowerCase3, hashMap.get(lowerCase2));
            }
        }
    }

    /* compiled from: InvalidationTracker */
    public static abstract class c {
        final String[] a;

        protected c(String str, String... strArr) {
            String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length + 1);
            this.a = strArr2;
            strArr2[strArr.length] = str;
        }

        /* access modifiers changed from: package-private */
        public boolean a() {
            return false;
        }

        public abstract void b(Set<String> set);

        public c(String[] strArr) {
            this.a = (String[]) Arrays.copyOf(strArr, strArr.length);
        }
    }
}
