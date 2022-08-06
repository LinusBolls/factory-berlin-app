package com.microsoft.appcenter.persistence;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQueryBuilder;
import com.microsoft.appcenter.k.d.d;
import com.microsoft.appcenter.utils.n.e;
import com.microsoft.appcenter.utils.o.a;
import com.microsoft.appcenter.utils.o.b;
import com.microsoft.appcenter.utils.o.c;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.json.JSONException;

/* compiled from: DatabasePersistence */
public class a extends Persistence {

    /* renamed from: m  reason: collision with root package name */
    static final ContentValues f4589m = y("", "", "", "", "", 0);

    /* renamed from: h  reason: collision with root package name */
    final com.microsoft.appcenter.utils.o.a f4590h;

    /* renamed from: i  reason: collision with root package name */
    final Map<String, List<Long>> f4591i;

    /* renamed from: j  reason: collision with root package name */
    final Set<Long> f4592j;

    /* renamed from: k  reason: collision with root package name */
    private final Context f4593k;

    /* renamed from: l  reason: collision with root package name */
    private final File f4594l;

    /* renamed from: com.microsoft.appcenter.persistence.a$a  reason: collision with other inner class name */
    /* compiled from: DatabasePersistence */
    class C0129a implements a.b {
        C0129a(a aVar) {
        }

        public void a(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
            sQLiteDatabase.execSQL("DROP TABLE `logs`");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `logs`(`oid` INTEGER PRIMARY KEY AUTOINCREMENT,`target_token` TEXT,`type` TEXT,`priority` INTEGER,`log` TEXT,`persistence_group` TEXT,`target_key` TEXT);");
            sQLiteDatabase.execSQL("CREATE INDEX `ix_logs_priority` ON logs (`priority`)");
        }

        public void b(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL("CREATE INDEX `ix_logs_priority` ON logs (`priority`)");
        }
    }

    public a(Context context) {
        this(context, 6, f4589m);
    }

    private List<Long> F(SQLiteQueryBuilder sQLiteQueryBuilder, String[] strArr) {
        Cursor l2;
        ArrayList arrayList = new ArrayList();
        try {
            l2 = this.f4590h.l(sQLiteQueryBuilder, com.microsoft.appcenter.utils.o.a.f4614m, strArr, (String) null);
            while (l2.moveToNext()) {
                arrayList.add(this.f4590h.b(l2).getAsLong("oid"));
            }
            l2.close();
        } catch (RuntimeException e2) {
            com.microsoft.appcenter.utils.a.c("AppCenter", "Failed to get corrupted ids: ", e2);
        } catch (Throwable th) {
            l2.close();
            throw th;
        }
        return arrayList;
    }

    private void q(File file, long j2) {
        z(file, j2).delete();
        this.f4590h.k(j2);
    }

    private static ContentValues y(String str, String str2, String str3, String str4, String str5, int i2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("persistence_group", str);
        contentValues.put("log", str2);
        contentValues.put("target_token", str3);
        contentValues.put("type", str4);
        contentValues.put("target_key", str5);
        contentValues.put("priority", Integer.valueOf(i2));
        return contentValues;
    }

    /* access modifiers changed from: package-private */
    public File D(String str) {
        return new File(this.f4594l, str);
    }

    public void a() {
        this.f4592j.clear();
        this.f4591i.clear();
        com.microsoft.appcenter.utils.a.a("AppCenter", "Cleared pending log states");
    }

    public int b(String str) {
        Cursor l2;
        SQLiteQueryBuilder a = c.a();
        a.appendWhere("persistence_group = ?");
        int i2 = 0;
        try {
            l2 = this.f4590h.l(a, new String[]{"COUNT(*)"}, new String[]{str}, (String) null);
            l2.moveToNext();
            i2 = l2.getInt(0);
            l2.close();
        } catch (RuntimeException e2) {
            com.microsoft.appcenter.utils.a.c("AppCenter", "Failed to get logs count: ", e2);
        } catch (Throwable th) {
            l2.close();
            throw th;
        }
        return i2;
    }

    public void close() {
        this.f4590h.close();
    }

    public void h(String str) {
        com.microsoft.appcenter.utils.a.a("AppCenter", "Deleting all logs from the Persistence database for " + str);
        File D = D(str);
        File[] listFiles = D.listFiles();
        if (listFiles != null) {
            for (File delete : listFiles) {
                delete.delete();
            }
        }
        D.delete();
        com.microsoft.appcenter.utils.a.a("AppCenter", "Deleted " + this.f4590h.i("persistence_group", str) + " logs.");
        Iterator<String> it = this.f4591i.keySet().iterator();
        while (it.hasNext()) {
            if (it.next().startsWith(str)) {
                it.remove();
            }
        }
    }

    public void i(String str, String str2) {
        com.microsoft.appcenter.utils.a.a("AppCenter", "Deleting logs from the Persistence database for " + str + " with " + str2);
        com.microsoft.appcenter.utils.a.a("AppCenter", "The IDs for deleting log(s) is/are:");
        Map<String, List<Long>> map = this.f4591i;
        List<Long> remove = map.remove(str + str2);
        File D = D(str);
        if (remove != null) {
            for (Long l2 : remove) {
                com.microsoft.appcenter.utils.a.a("AppCenter", "\t" + l2);
                q(D, l2.longValue());
                this.f4592j.remove(l2);
            }
        }
    }

    public String k(String str, Collection<String> collection, int i2, List<d> list) {
        Cursor cursor;
        String str2 = str;
        int i3 = i2;
        com.microsoft.appcenter.utils.a.a("AppCenter", "Trying to get " + i3 + " logs from the Persistence database for " + str2);
        SQLiteQueryBuilder a = c.a();
        a.appendWhere("persistence_group = ?");
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        if (!collection.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            for (int i4 = 0; i4 < collection.size(); i4++) {
                sb.append("?,");
            }
            sb.deleteCharAt(sb.length() - 1);
            a.appendWhere(" AND ");
            a.appendWhere("target_key NOT IN (" + sb.toString() + ")");
            arrayList.addAll(collection);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList<Long> arrayList2 = new ArrayList<>();
        File D = D(str);
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        try {
            cursor = this.f4590h.l(a, (String[]) null, strArr, "priority DESC, oid");
        } catch (RuntimeException e2) {
            com.microsoft.appcenter.utils.a.c("AppCenter", "Failed to get logs: ", e2);
            cursor = null;
        }
        int i5 = 0;
        while (cursor != null) {
            ContentValues y = this.f4590h.y(cursor);
            if (y == null || i5 >= i3) {
                break;
            }
            Long asLong = y.getAsLong("oid");
            if (asLong == null) {
                com.microsoft.appcenter.utils.a.b("AppCenter", "Empty database record, probably content was larger than 2MB, need to delete as it's now corrupted.");
                Iterator<Long> it = F(a, strArr).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Long next = it.next();
                    if (!this.f4592j.contains(next) && !linkedHashMap.containsKey(next)) {
                        q(D, next.longValue());
                        com.microsoft.appcenter.utils.a.b("AppCenter", "Empty database corrupted empty record deleted, id=" + next);
                        break;
                    }
                }
            } else if (!this.f4592j.contains(asLong)) {
                try {
                    String asString = y.getAsString("log");
                    if (asString == null) {
                        File z = z(D, asLong.longValue());
                        com.microsoft.appcenter.utils.a.a("AppCenter", "Read payload file " + z);
                        asString = b.b(z);
                        if (asString == null) {
                            throw new JSONException("Log payload is null and not stored as a file.");
                        }
                    }
                    d c = j().c(asString, y.getAsString("type"));
                    String asString2 = y.getAsString("target_token");
                    if (asString2 != null) {
                        c.e(e.e(this.f4593k).a(asString2).a());
                    }
                    linkedHashMap.put(asLong, c);
                    i5++;
                } catch (JSONException e3) {
                    com.microsoft.appcenter.utils.a.c("AppCenter", "Cannot deserialize a log in the database", e3);
                    arrayList2.add(asLong);
                }
            }
        }
        if (cursor != null) {
            try {
                cursor.close();
            } catch (RuntimeException unused) {
            }
        }
        if (arrayList2.size() > 0) {
            for (Long longValue : arrayList2) {
                q(D, longValue.longValue());
            }
            com.microsoft.appcenter.utils.a.i("AppCenter", "Deleted logs that cannot be deserialized");
        }
        if (linkedHashMap.size() <= 0) {
            com.microsoft.appcenter.utils.a.a("AppCenter", "No logs found in the Persistence database at the moment");
            return null;
        }
        String uuid = UUID.randomUUID().toString();
        com.microsoft.appcenter.utils.a.a("AppCenter", "Returning " + linkedHashMap.size() + " log(s) with an ID, " + uuid);
        com.microsoft.appcenter.utils.a.a("AppCenter", "The SID/ID pairs for returning log(s) is/are:");
        ArrayList arrayList3 = new ArrayList();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Long l2 = (Long) entry.getKey();
            this.f4592j.add(l2);
            arrayList3.add(l2);
            list.add(entry.getValue());
            com.microsoft.appcenter.utils.a.a("AppCenter", "\t" + ((d) entry.getValue()).c() + " / " + l2);
        }
        this.f4591i.put(str2 + uuid, arrayList3);
        return uuid;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x014a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x015b, code lost:
        throw new com.microsoft.appcenter.persistence.Persistence.PersistenceException("Cannot convert to JSON string.", r0);
     */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x014a A[ExcHandler: JSONException (r0v1 'e' org.json.JSONException A[CUSTOM_DECLARE]), Splitter:B:1:0x0008] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long l(com.microsoft.appcenter.k.d.d r17, java.lang.String r18, int r19) {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            r2 = r19
            java.lang.String r3 = "AppCenter"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x014a, IOException -> 0x0148 }
            r4.<init>()     // Catch:{ JSONException -> 0x014a, IOException -> 0x0148 }
            java.lang.String r5 = "Storing a log to the Persistence database for log type "
            r4.append(r5)     // Catch:{ JSONException -> 0x014a, IOException -> 0x0148 }
            java.lang.String r5 = r17.getType()     // Catch:{ JSONException -> 0x014a, IOException -> 0x0148 }
            r4.append(r5)     // Catch:{ JSONException -> 0x014a, IOException -> 0x0148 }
            java.lang.String r5 = " with flags="
            r4.append(r5)     // Catch:{ JSONException -> 0x014a, IOException -> 0x0148 }
            r4.append(r2)     // Catch:{ JSONException -> 0x014a, IOException -> 0x0148 }
            java.lang.String r4 = r4.toString()     // Catch:{ JSONException -> 0x014a, IOException -> 0x0148 }
            com.microsoft.appcenter.utils.a.a(r3, r4)     // Catch:{ JSONException -> 0x014a, IOException -> 0x0148 }
            com.microsoft.appcenter.k.d.i.g r4 = r16.j()     // Catch:{ JSONException -> 0x014a, IOException -> 0x0148 }
            java.lang.String r4 = r4.d(r0)     // Catch:{ JSONException -> 0x014a, IOException -> 0x0148 }
            java.lang.String r5 = "UTF-8"
            byte[] r5 = r4.getBytes(r5)     // Catch:{ JSONException -> 0x014a, IOException -> 0x0148 }
            int r5 = r5.length     // Catch:{ JSONException -> 0x014a, IOException -> 0x0148 }
            r6 = 1992294(0x1e6666, float:2.791799E-39)
            r7 = 0
            if (r5 < r6) goto L_0x003f
            r6 = 1
            goto L_0x0040
        L_0x003f:
            r6 = 0
        L_0x0040:
            boolean r8 = r0 instanceof com.microsoft.appcenter.k.d.j.b     // Catch:{ JSONException -> 0x014a, IOException -> 0x0148 }
            r9 = 0
            if (r8 == 0) goto L_0x006e
            if (r6 != 0) goto L_0x0066
            java.util.Set r8 = r17.f()     // Catch:{ JSONException -> 0x014a, IOException -> 0x0148 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ JSONException -> 0x014a, IOException -> 0x0148 }
            java.lang.Object r8 = r8.next()     // Catch:{ JSONException -> 0x014a, IOException -> 0x0148 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ JSONException -> 0x014a, IOException -> 0x0148 }
            java.lang.String r10 = com.microsoft.appcenter.k.d.j.j.a(r8)     // Catch:{ JSONException -> 0x014a, IOException -> 0x0148 }
            android.content.Context r11 = r1.f4593k     // Catch:{ JSONException -> 0x014a, IOException -> 0x0148 }
            com.microsoft.appcenter.utils.n.e r11 = com.microsoft.appcenter.utils.n.e.e(r11)     // Catch:{ JSONException -> 0x014a, IOException -> 0x0148 }
            java.lang.String r8 = r11.b(r8)     // Catch:{ JSONException -> 0x014a, IOException -> 0x0148 }
            r11 = r10
            r10 = r8
            goto L_0x0070
        L_0x0066:
            com.microsoft.appcenter.persistence.Persistence$PersistenceException r0 = new com.microsoft.appcenter.persistence.Persistence$PersistenceException     // Catch:{ JSONException -> 0x014a, IOException -> 0x0148 }
            java.lang.String r2 = "Log is larger than 1992294 bytes, cannot send to OneCollector."
            r0.<init>(r2)     // Catch:{ JSONException -> 0x014a, IOException -> 0x0148 }
            throw r0     // Catch:{ JSONException -> 0x014a, IOException -> 0x0148 }
        L_0x006e:
            r10 = r9
            r11 = r10
        L_0x0070:
            com.microsoft.appcenter.utils.o.a r8 = r1.f4590h     // Catch:{ JSONException -> 0x014a, IOException -> 0x0148 }
            long r12 = r8.q()     // Catch:{ JSONException -> 0x014a, IOException -> 0x0148 }
            r14 = -1
            int r8 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r8 == 0) goto L_0x0140
            if (r6 != 0) goto L_0x00a8
            long r14 = (long) r5     // Catch:{ JSONException -> 0x014a, IOException -> 0x0148 }
            int r8 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r8 <= 0) goto L_0x0084
            goto L_0x00a8
        L_0x0084:
            com.microsoft.appcenter.persistence.Persistence$PersistenceException r0 = new com.microsoft.appcenter.persistence.Persistence$PersistenceException     // Catch:{ JSONException -> 0x014a, IOException -> 0x0148 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x014a, IOException -> 0x0148 }
            r2.<init>()     // Catch:{ JSONException -> 0x014a, IOException -> 0x0148 }
            java.lang.String r3 = "Log is too large ("
            r2.append(r3)     // Catch:{ JSONException -> 0x014a, IOException -> 0x0148 }
            r2.append(r5)     // Catch:{ JSONException -> 0x014a, IOException -> 0x0148 }
            java.lang.String r3 = " bytes) to store in database. Current maximum database size is "
            r2.append(r3)     // Catch:{ JSONException -> 0x014a, IOException -> 0x0148 }
            r2.append(r12)     // Catch:{ JSONException -> 0x014a, IOException -> 0x0148 }
            java.lang.String r3 = " bytes."
            r2.append(r3)     // Catch:{ JSONException -> 0x014a, IOException -> 0x0148 }
            java.lang.String r2 = r2.toString()     // Catch:{ JSONException -> 0x014a, IOException -> 0x0148 }
            r0.<init>(r2)     // Catch:{ JSONException -> 0x014a, IOException -> 0x0148 }
            throw r0     // Catch:{ JSONException -> 0x014a, IOException -> 0x0148 }
        L_0x00a8:
            if (r6 == 0) goto L_0x00ac
            r8 = r9
            goto L_0x00ad
        L_0x00ac:
            r8 = r4
        L_0x00ad:
            java.lang.String r5 = r17.getType()     // Catch:{ JSONException -> 0x014a, IOException -> 0x0148 }
            int r12 = com.microsoft.appcenter.g.a(r2, r7)     // Catch:{ JSONException -> 0x014a, IOException -> 0x0148 }
            r7 = r18
            r9 = r10
            r10 = r5
            android.content.ContentValues r2 = y(r7, r8, r9, r10, r11, r12)     // Catch:{ JSONException -> 0x014a, IOException -> 0x0148 }
            com.microsoft.appcenter.utils.o.a r5 = r1.f4590h     // Catch:{ JSONException -> 0x014a, IOException -> 0x0148 }
            java.lang.String r7 = "priority"
            long r7 = r5.z(r2, r7)     // Catch:{ JSONException -> 0x014a, IOException -> 0x0148 }
            r9 = -1
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 == 0) goto L_0x0120
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x014a, IOException -> 0x0148 }
            r2.<init>()     // Catch:{ JSONException -> 0x014a, IOException -> 0x0148 }
            java.lang.String r5 = "Stored a log to the Persistence database for log type "
            r2.append(r5)     // Catch:{ JSONException -> 0x014a, IOException -> 0x0148 }
            java.lang.String r0 = r17.getType()     // Catch:{ JSONException -> 0x014a, IOException -> 0x0148 }
            r2.append(r0)     // Catch:{ JSONException -> 0x014a, IOException -> 0x0148 }
            java.lang.String r0 = " with databaseId="
            r2.append(r0)     // Catch:{ JSONException -> 0x014a, IOException -> 0x0148 }
            r2.append(r7)     // Catch:{ JSONException -> 0x014a, IOException -> 0x0148 }
            java.lang.String r0 = r2.toString()     // Catch:{ JSONException -> 0x014a, IOException -> 0x0148 }
            com.microsoft.appcenter.utils.a.a(r3, r0)     // Catch:{ JSONException -> 0x014a, IOException -> 0x0148 }
            if (r6 == 0) goto L_0x011f
            java.lang.String r0 = "Payload is larger than what SQLite supports, storing payload in a separate file."
            com.microsoft.appcenter.utils.a.a(r3, r0)     // Catch:{ JSONException -> 0x014a, IOException -> 0x0148 }
            r0 = r18
            java.io.File r0 = r1.D(r0)     // Catch:{ JSONException -> 0x014a, IOException -> 0x0148 }
            r0.mkdir()     // Catch:{ JSONException -> 0x014a, IOException -> 0x0148 }
            java.io.File r0 = r1.z(r0, r7)     // Catch:{ JSONException -> 0x014a, IOException -> 0x0148 }
            com.microsoft.appcenter.utils.o.b.c(r0, r4)     // Catch:{ IOException -> 0x0117, JSONException -> 0x014a }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x014a, IOException -> 0x0148 }
            r2.<init>()     // Catch:{ JSONException -> 0x014a, IOException -> 0x0148 }
            java.lang.String r4 = "Payload written to "
            r2.append(r4)     // Catch:{ JSONException -> 0x014a, IOException -> 0x0148 }
            r2.append(r0)     // Catch:{ JSONException -> 0x014a, IOException -> 0x0148 }
            java.lang.String r0 = r2.toString()     // Catch:{ JSONException -> 0x014a, IOException -> 0x0148 }
            com.microsoft.appcenter.utils.a.a(r3, r0)     // Catch:{ JSONException -> 0x014a, IOException -> 0x0148 }
            goto L_0x011f
        L_0x0117:
            r0 = move-exception
            r2 = r0
            com.microsoft.appcenter.utils.o.a r0 = r1.f4590h     // Catch:{ JSONException -> 0x014a, IOException -> 0x0148 }
            r0.k(r7)     // Catch:{ JSONException -> 0x014a, IOException -> 0x0148 }
            throw r2     // Catch:{ JSONException -> 0x014a, IOException -> 0x0148 }
        L_0x011f:
            return r7
        L_0x0120:
            com.microsoft.appcenter.persistence.Persistence$PersistenceException r2 = new com.microsoft.appcenter.persistence.Persistence$PersistenceException     // Catch:{ JSONException -> 0x014a, IOException -> 0x0148 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x014a, IOException -> 0x0148 }
            r3.<init>()     // Catch:{ JSONException -> 0x014a, IOException -> 0x0148 }
            java.lang.String r4 = "Failed to store a log to the Persistence database for log type "
            r3.append(r4)     // Catch:{ JSONException -> 0x014a, IOException -> 0x0148 }
            java.lang.String r0 = r17.getType()     // Catch:{ JSONException -> 0x014a, IOException -> 0x0148 }
            r3.append(r0)     // Catch:{ JSONException -> 0x014a, IOException -> 0x0148 }
            java.lang.String r0 = "."
            r3.append(r0)     // Catch:{ JSONException -> 0x014a, IOException -> 0x0148 }
            java.lang.String r0 = r3.toString()     // Catch:{ JSONException -> 0x014a, IOException -> 0x0148 }
            r2.<init>(r0)     // Catch:{ JSONException -> 0x014a, IOException -> 0x0148 }
            throw r2     // Catch:{ JSONException -> 0x014a, IOException -> 0x0148 }
        L_0x0140:
            com.microsoft.appcenter.persistence.Persistence$PersistenceException r0 = new com.microsoft.appcenter.persistence.Persistence$PersistenceException     // Catch:{ JSONException -> 0x014a, IOException -> 0x0148 }
            java.lang.String r2 = "Failed to store a log to the Persistence database."
            r0.<init>(r2)     // Catch:{ JSONException -> 0x014a, IOException -> 0x0148 }
            throw r0     // Catch:{ JSONException -> 0x014a, IOException -> 0x0148 }
        L_0x0148:
            r0 = move-exception
            goto L_0x014c
        L_0x014a:
            r0 = move-exception
            goto L_0x0154
        L_0x014c:
            com.microsoft.appcenter.persistence.Persistence$PersistenceException r2 = new com.microsoft.appcenter.persistence.Persistence$PersistenceException
            java.lang.String r3 = "Cannot save large payload in a file."
            r2.<init>(r3, r0)
            throw r2
        L_0x0154:
            com.microsoft.appcenter.persistence.Persistence$PersistenceException r2 = new com.microsoft.appcenter.persistence.Persistence$PersistenceException
            java.lang.String r3 = "Cannot convert to JSON string."
            r2.<init>(r3, r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.microsoft.appcenter.persistence.a.l(com.microsoft.appcenter.k.d.d, java.lang.String, int):long");
    }

    public boolean o(long j2) {
        return this.f4590h.D(j2);
    }

    /* access modifiers changed from: package-private */
    public File z(File file, long j2) {
        return new File(file, j2 + ".json");
    }

    a(Context context, int i2, ContentValues contentValues) {
        this.f4593k = context;
        this.f4591i = new HashMap();
        this.f4592j = new HashSet();
        this.f4590h = new com.microsoft.appcenter.utils.o.a(context, "com.microsoft.appcenter.persistence", "logs", i2, contentValues, "CREATE TABLE IF NOT EXISTS `logs`(`oid` INTEGER PRIMARY KEY AUTOINCREMENT,`target_token` TEXT,`type` TEXT,`priority` INTEGER,`log` TEXT,`persistence_group` TEXT,`target_key` TEXT);", new C0129a(this));
        File file = new File(com.microsoft.appcenter.e.a + "/appcenter/database_large_payloads");
        this.f4594l = file;
        file.mkdirs();
    }
}
