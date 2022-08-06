package g.b.a.a.i.v.j;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import com.google.android.datatransport.runtime.synchronization.a;
import g.b.a.a.i.g;
import g.b.a.a.i.h;
import g.b.a.a.i.m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

/* compiled from: SQLiteEventStore */
public class b0 implements c, com.google.android.datatransport.runtime.synchronization.a {

    /* renamed from: k  reason: collision with root package name */
    private static final g.b.a.a.b f9303k = g.b.a.a.b.b("proto");

    /* renamed from: g  reason: collision with root package name */
    private final h0 f9304g;

    /* renamed from: h  reason: collision with root package name */
    private final g.b.a.a.i.w.a f9305h;

    /* renamed from: i  reason: collision with root package name */
    private final g.b.a.a.i.w.a f9306i;

    /* renamed from: j  reason: collision with root package name */
    private final d f9307j;

    /* compiled from: SQLiteEventStore */
    interface b<T, U> {
        U a(T t);
    }

    /* compiled from: SQLiteEventStore */
    private static class c {
        final String a;
        final String b;

        private c(String str, String str2) {
            this.a = str;
            this.b = str2;
        }
    }

    /* compiled from: SQLiteEventStore */
    interface d<T> {
        T a();
    }

    b0(g.b.a.a.i.w.a aVar, g.b.a.a.i.w.a aVar2, d dVar, h0 h0Var) {
        this.f9304g = h0Var;
        this.f9305h = aVar;
        this.f9306i = aVar2;
        this.f9307j = dVar;
    }

    static /* synthetic */ Object D(Throwable th) {
        throw new SynchronizationException("Timed out while trying to acquire the lock.", th);
    }

    static /* synthetic */ SQLiteDatabase F(Throwable th) {
        throw new SynchronizationException("Timed out while trying to open db.", th);
    }

    private List<i> F0(SQLiteDatabase sQLiteDatabase, m mVar) {
        ArrayList arrayList = new ArrayList();
        Long l2 = l(sQLiteDatabase, mVar);
        if (l2 == null) {
            return arrayList;
        }
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        M0(sQLiteDatabase2.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{l2.toString()}, (String) null, (String) null, (String) null, String.valueOf(this.f9307j.d())), n.b(this, arrayList, mVar));
        return arrayList;
    }

    private Map<Long, Set<c>> G0(SQLiteDatabase sQLiteDatabase, List<i> list) {
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i2 = 0; i2 < list.size(); i2++) {
            sb.append(list.get(i2).c());
            if (i2 < list.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        M0(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), (String[]) null, (String) null, (String) null, (String) null), p.b(hashMap));
        return hashMap;
    }

    private static byte[] H0(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    private byte[] I0(long j2) {
        return (byte[]) M0(i().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j2)}, (String) null, (String) null, "sequence_num"), o.b());
    }

    private <T> T J0(d<T> dVar, b<Throwable, T> bVar) {
        long a2 = this.f9306i.a();
        while (true) {
            try {
                return dVar.a();
            } catch (SQLiteDatabaseLockedException e2) {
                if (this.f9306i.a() >= ((long) this.f9307j.b()) + a2) {
                    return bVar.a(e2);
                }
                SystemClock.sleep(50);
            }
        }
    }

    static /* synthetic */ Long K(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return 0L;
    }

    private static g.b.a.a.b K0(String str) {
        if (str == null) {
            return f9303k;
        }
        return g.b.a.a.b.b(str);
    }

    static /* synthetic */ Long L(Cursor cursor) {
        if (!cursor.moveToNext()) {
            return null;
        }
        return Long.valueOf(cursor.getLong(0));
    }

    private static String L0(Iterable<i> iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator<i> it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(it.next().c());
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    static /* synthetic */ Boolean M(b0 b0Var, m mVar, SQLiteDatabase sQLiteDatabase) {
        Long l2 = b0Var.l(sQLiteDatabase, mVar);
        if (l2 == null) {
            return Boolean.FALSE;
        }
        return (Boolean) M0(b0Var.i().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{l2.toString()}), u.b());
    }

    private static <T> T M0(Cursor cursor, b<Cursor, T> bVar) {
        try {
            return bVar.a(cursor);
        } finally {
            cursor.close();
        }
    }

    static /* synthetic */ List U(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            m.a a2 = m.a();
            a2.b(cursor.getString(1));
            a2.d(g.b.a.a.i.x.a.b(cursor.getInt(2)));
            a2.c(H0(cursor.getString(3)));
            arrayList.add(a2.a());
        }
        return arrayList;
    }

    static /* synthetic */ List Z(SQLiteDatabase sQLiteDatabase) {
        return (List) M0(sQLiteDatabase.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), t.b());
    }

    private void b(SQLiteDatabase sQLiteDatabase) {
        J0(q.b(sQLiteDatabase), r.b());
    }

    static /* synthetic */ List b0(b0 b0Var, m mVar, SQLiteDatabase sQLiteDatabase) {
        List<i> F0 = b0Var.F0(sQLiteDatabase, mVar);
        b0Var.q(F0, b0Var.G0(sQLiteDatabase, F0));
        return F0;
    }

    private long h(SQLiteDatabase sQLiteDatabase, m mVar) {
        Long l2 = l(sQLiteDatabase, mVar);
        if (l2 != null) {
            return l2.longValue();
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("backend_name", mVar.b());
        contentValues.put("priority", Integer.valueOf(g.b.a.a.i.x.a.a(mVar.d())));
        contentValues.put("next_request_ms", 0);
        if (mVar.c() != null) {
            contentValues.put("extras", Base64.encodeToString(mVar.c(), 0));
        }
        return sQLiteDatabase.insert("transport_contexts", (String) null, contentValues);
    }

    static /* synthetic */ Object i0(b0 b0Var, List list, m mVar, Cursor cursor) {
        while (cursor.moveToNext()) {
            boolean z = false;
            long j2 = cursor.getLong(0);
            if (cursor.getInt(7) != 0) {
                z = true;
            }
            h.a a2 = h.a();
            a2.j(cursor.getString(1));
            a2.i(cursor.getLong(2));
            a2.k(cursor.getLong(3));
            if (z) {
                a2.h(new g(K0(cursor.getString(4)), cursor.getBlob(5)));
            } else {
                a2.h(new g(K0(cursor.getString(4)), b0Var.I0(j2)));
            }
            if (!cursor.isNull(6)) {
                a2.g(Integer.valueOf(cursor.getInt(6)));
            }
            list.add(i.a(j2, mVar, a2.d()));
        }
        return null;
    }

    private long j() {
        return i().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }

    private long k() {
        return i().compileStatement("PRAGMA page_size").simpleQueryForLong();
    }

    private Long l(SQLiteDatabase sQLiteDatabase, m mVar) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(new String[]{mVar.b(), String.valueOf(g.b.a.a.i.x.a.a(mVar.d()))}));
        if (mVar.c() != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(mVar.c(), 0));
        }
        return (Long) M0(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), (String) null, (String) null, (String) null), x.b());
    }

    static /* synthetic */ Object l0(Map map, Cursor cursor) {
        while (cursor.moveToNext()) {
            long j2 = cursor.getLong(0);
            Set set = (Set) map.get(Long.valueOf(j2));
            if (set == null) {
                set = new HashSet();
                map.put(Long.valueOf(j2), set);
            }
            set.add(new c(cursor.getString(1), cursor.getString(2)));
        }
        return null;
    }

    private <T> T n(b<SQLiteDatabase, T> bVar) {
        SQLiteDatabase i2 = i();
        i2.beginTransaction();
        try {
            T a2 = bVar.a(i2);
            i2.setTransactionSuccessful();
            return a2;
        } finally {
            i2.endTransaction();
        }
    }

    static /* synthetic */ Long n0(b0 b0Var, m mVar, h hVar, SQLiteDatabase sQLiteDatabase) {
        if (b0Var.o()) {
            return -1L;
        }
        long h2 = b0Var.h(sQLiteDatabase, mVar);
        int e2 = b0Var.f9307j.e();
        byte[] a2 = hVar.e().a();
        boolean z = a2.length <= e2;
        ContentValues contentValues = new ContentValues();
        contentValues.put("context_id", Long.valueOf(h2));
        contentValues.put("transport_name", hVar.j());
        contentValues.put("timestamp_ms", Long.valueOf(hVar.f()));
        contentValues.put("uptime_ms", Long.valueOf(hVar.k()));
        contentValues.put("payload_encoding", hVar.e().b().a());
        contentValues.put("code", hVar.d());
        contentValues.put("num_attempts", 0);
        contentValues.put("inline", Boolean.valueOf(z));
        contentValues.put("payload", z ? a2 : new byte[0]);
        long insert = sQLiteDatabase.insert("events", (String) null, contentValues);
        if (!z) {
            int ceil = (int) Math.ceil(((double) a2.length) / ((double) e2));
            for (int i2 = 1; i2 <= ceil; i2++) {
                byte[] copyOfRange = Arrays.copyOfRange(a2, (i2 - 1) * e2, Math.min(i2 * e2, a2.length));
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("event_id", Long.valueOf(insert));
                contentValues2.put("sequence_num", Integer.valueOf(i2));
                contentValues2.put("bytes", copyOfRange);
                sQLiteDatabase.insert("event_payloads", (String) null, contentValues2);
            }
        }
        for (Map.Entry next : hVar.i().entrySet()) {
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("event_id", Long.valueOf(insert));
            contentValues3.put("name", (String) next.getKey());
            contentValues3.put("value", (String) next.getValue());
            sQLiteDatabase.insert("event_metadata", (String) null, contentValues3);
        }
        return Long.valueOf(insert);
    }

    private boolean o() {
        return j() * k() >= this.f9307j.f();
    }

    private List<i> q(List<i> list, Map<Long, Set<c>> map) {
        ListIterator<i> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            i next = listIterator.next();
            if (map.containsKey(Long.valueOf(next.c()))) {
                h.a l2 = next.b().l();
                for (c cVar : map.get(Long.valueOf(next.c()))) {
                    l2.c(cVar.a, cVar.b);
                }
                listIterator.set(i.a(next.c(), next.d(), l2.d()));
            }
        }
        return list;
    }

    static /* synthetic */ byte[] r0(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (cursor.moveToNext()) {
            byte[] blob = cursor.getBlob(0);
            arrayList.add(blob);
            i2 += blob.length;
        }
        byte[] bArr = new byte[i2];
        int i3 = 0;
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            byte[] bArr2 = (byte[]) arrayList.get(i4);
            System.arraycopy(bArr2, 0, bArr, i3, bArr2.length);
            i3 += bArr2.length;
        }
        return bArr;
    }

    static /* synthetic */ Object t0(String str, SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement(str).execute();
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
        return null;
    }

    static /* synthetic */ Object w0(long j2, m mVar, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j2));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{mVar.b(), String.valueOf(g.b.a.a.i.x.a.a(mVar.d()))}) < 1) {
            contentValues.put("backend_name", mVar.b());
            contentValues.put("priority", Integer.valueOf(g.b.a.a.i.x.a.a(mVar.d())));
            sQLiteDatabase.insert("transport_contexts", (String) null, contentValues);
        }
        return null;
    }

    public Iterable<i> I(m mVar) {
        return (Iterable) n(k.b(this, mVar));
    }

    public void O(m mVar, long j2) {
        n(j.b(j2, mVar));
    }

    public i V(m mVar, h hVar) {
        g.b.a.a.i.t.a.b("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", mVar.d(), hVar.j(), mVar.b());
        long longValue = ((Long) n(w.b(this, mVar, hVar))).longValue();
        if (longValue < 1) {
            return null;
        }
        return i.a(longValue, mVar, hVar);
    }

    public Iterable<m> W() {
        return (Iterable) n(l.b());
    }

    public <T> T a(a.C0059a<T> aVar) {
        SQLiteDatabase i2 = i();
        b(i2);
        try {
            T a2 = aVar.a();
            i2.setTransactionSuccessful();
            return a2;
        } finally {
            i2.endTransaction();
        }
    }

    public void close() {
        this.f9304g.close();
    }

    public long f0(m mVar) {
        return ((Long) M0(i().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{mVar.b(), String.valueOf(g.b.a.a.i.x.a.a(mVar.d()))}), z.b())).longValue();
    }

    /* access modifiers changed from: package-private */
    public SQLiteDatabase i() {
        h0 h0Var = this.f9304g;
        h0Var.getClass();
        return (SQLiteDatabase) J0(s.b(h0Var), v.b());
    }

    public int m() {
        return ((Integer) n(m.b(this.f9305h.a() - this.f9307j.c()))).intValue();
    }

    public boolean m0(m mVar) {
        return ((Boolean) n(a0.b(this, mVar))).booleanValue();
    }

    public void q0(Iterable<i> iterable) {
        if (iterable.iterator().hasNext()) {
            n(y.b("UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + L0(iterable)));
        }
    }

    public void r(Iterable<i> iterable) {
        if (iterable.iterator().hasNext()) {
            i().compileStatement("DELETE FROM events WHERE _id in " + L0(iterable)).execute();
        }
    }
}
