package androidx.work.impl.l;

import android.database.Cursor;
import androidx.room.o;
import androidx.room.s;
import androidx.work.impl.l.j;
import androidx.work.p;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WorkSpecDao_Impl */
public final class l implements k {
    private final androidx.room.l a;
    private final androidx.room.e b;
    private final s c;

    /* renamed from: d  reason: collision with root package name */
    private final s f1733d;

    /* renamed from: e  reason: collision with root package name */
    private final s f1734e;

    /* renamed from: f  reason: collision with root package name */
    private final s f1735f;

    /* renamed from: g  reason: collision with root package name */
    private final s f1736g;

    /* renamed from: h  reason: collision with root package name */
    private final s f1737h;

    /* renamed from: i  reason: collision with root package name */
    private final s f1738i;

    /* compiled from: WorkSpecDao_Impl */
    class a extends androidx.room.e<j> {
        a(l lVar, androidx.room.l lVar2) {
            super(lVar2);
        }

        public String d() {
            return "INSERT OR IGNORE INTO `WorkSpec`(`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        /* renamed from: l */
        public void g(e.s.a.f fVar, j jVar) {
            String str = jVar.a;
            if (str == null) {
                fVar.bindNull(1);
            } else {
                fVar.bindString(1, str);
            }
            fVar.bindLong(2, (long) p.h(jVar.b));
            String str2 = jVar.c;
            if (str2 == null) {
                fVar.bindNull(3);
            } else {
                fVar.bindString(3, str2);
            }
            String str3 = jVar.f1722d;
            if (str3 == null) {
                fVar.bindNull(4);
            } else {
                fVar.bindString(4, str3);
            }
            byte[] l2 = androidx.work.e.l(jVar.f1723e);
            if (l2 == null) {
                fVar.bindNull(5);
            } else {
                fVar.bindBlob(5, l2);
            }
            byte[] l3 = androidx.work.e.l(jVar.f1724f);
            if (l3 == null) {
                fVar.bindNull(6);
            } else {
                fVar.bindBlob(6, l3);
            }
            fVar.bindLong(7, jVar.f1725g);
            fVar.bindLong(8, jVar.f1726h);
            fVar.bindLong(9, jVar.f1727i);
            fVar.bindLong(10, (long) jVar.f1729k);
            fVar.bindLong(11, (long) p.a(jVar.f1730l));
            fVar.bindLong(12, jVar.f1731m);
            fVar.bindLong(13, jVar.f1732n);
            fVar.bindLong(14, jVar.o);
            fVar.bindLong(15, jVar.p);
            androidx.work.c cVar = jVar.f1728j;
            if (cVar != null) {
                fVar.bindLong(16, (long) p.g(cVar.b()));
                fVar.bindLong(17, cVar.g() ? 1 : 0);
                fVar.bindLong(18, cVar.h() ? 1 : 0);
                fVar.bindLong(19, cVar.f() ? 1 : 0);
                fVar.bindLong(20, cVar.i() ? 1 : 0);
                fVar.bindLong(21, cVar.c());
                fVar.bindLong(22, cVar.d());
                byte[] c = p.c(cVar.a());
                if (c == null) {
                    fVar.bindNull(23);
                } else {
                    fVar.bindBlob(23, c);
                }
            } else {
                fVar.bindNull(16);
                fVar.bindNull(17);
                fVar.bindNull(18);
                fVar.bindNull(19);
                fVar.bindNull(20);
                fVar.bindNull(21);
                fVar.bindNull(22);
                fVar.bindNull(23);
            }
        }
    }

    /* compiled from: WorkSpecDao_Impl */
    class b extends s {
        b(l lVar, androidx.room.l lVar2) {
            super(lVar2);
        }

        public String d() {
            return "DELETE FROM workspec WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl */
    class c extends s {
        c(l lVar, androidx.room.l lVar2) {
            super(lVar2);
        }

        public String d() {
            return "UPDATE workspec SET output=? WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl */
    class d extends s {
        d(l lVar, androidx.room.l lVar2) {
            super(lVar2);
        }

        public String d() {
            return "UPDATE workspec SET period_start_time=? WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl */
    class e extends s {
        e(l lVar, androidx.room.l lVar2) {
            super(lVar2);
        }

        public String d() {
            return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl */
    class f extends s {
        f(l lVar, androidx.room.l lVar2) {
            super(lVar2);
        }

        public String d() {
            return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl */
    class g extends s {
        g(l lVar, androidx.room.l lVar2) {
            super(lVar2);
        }

        public String d() {
            return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl */
    class h extends s {
        h(l lVar, androidx.room.l lVar2) {
            super(lVar2);
        }

        public String d() {
            return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
        }
    }

    /* compiled from: WorkSpecDao_Impl */
    class i extends s {
        i(l lVar, androidx.room.l lVar2) {
            super(lVar2);
        }

        public String d() {
            return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
        }
    }

    public l(androidx.room.l lVar) {
        this.a = lVar;
        this.b = new a(this, lVar);
        this.c = new b(this, lVar);
        this.f1733d = new c(this, lVar);
        this.f1734e = new d(this, lVar);
        this.f1735f = new e(this, lVar);
        this.f1736g = new f(this, lVar);
        this.f1737h = new g(this, lVar);
        this.f1738i = new h(this, lVar);
        new i(this, lVar);
    }

    public void a(String str) {
        this.a.b();
        e.s.a.f a2 = this.c.a();
        if (str == null) {
            a2.bindNull(1);
        } else {
            a2.bindString(1, str);
        }
        this.a.c();
        try {
            a2.executeUpdateDelete();
            this.a.x();
        } finally {
            this.a.i();
            this.c.f(a2);
        }
    }

    public int b(p pVar, String... strArr) {
        this.a.b();
        StringBuilder b2 = androidx.room.x.e.b();
        b2.append("UPDATE workspec SET state=");
        b2.append("?");
        b2.append(" WHERE id IN (");
        androidx.room.x.e.a(b2, strArr.length);
        b2.append(")");
        e.s.a.f f2 = this.a.f(b2.toString());
        f2.bindLong(1, (long) p.h(pVar));
        int i2 = 2;
        for (String str : strArr) {
            if (str == null) {
                f2.bindNull(i2);
            } else {
                f2.bindString(i2, str);
            }
            i2++;
        }
        this.a.c();
        try {
            int executeUpdateDelete = f2.executeUpdateDelete();
            this.a.x();
            return executeUpdateDelete;
        } finally {
            this.a.i();
        }
    }

    public List<j> c() {
        o oVar;
        o h2 = o.h("SELECT * FROM workspec WHERE state=1", 0);
        this.a.b();
        Cursor b2 = androidx.room.x.c.b(this.a, h2, false);
        try {
            int b3 = androidx.room.x.b.b(b2, "id");
            int b4 = androidx.room.x.b.b(b2, "state");
            int b5 = androidx.room.x.b.b(b2, "worker_class_name");
            int b6 = androidx.room.x.b.b(b2, "input_merger_class_name");
            int b7 = androidx.room.x.b.b(b2, "input");
            int b8 = androidx.room.x.b.b(b2, "output");
            int b9 = androidx.room.x.b.b(b2, "initial_delay");
            int b10 = androidx.room.x.b.b(b2, "interval_duration");
            int b11 = androidx.room.x.b.b(b2, "flex_duration");
            int b12 = androidx.room.x.b.b(b2, "run_attempt_count");
            int b13 = androidx.room.x.b.b(b2, "backoff_policy");
            int b14 = androidx.room.x.b.b(b2, "backoff_delay_duration");
            int b15 = androidx.room.x.b.b(b2, "period_start_time");
            int b16 = androidx.room.x.b.b(b2, "minimum_retention_duration");
            oVar = h2;
            try {
                int b17 = androidx.room.x.b.b(b2, "schedule_requested_at");
                int b18 = androidx.room.x.b.b(b2, "required_network_type");
                int i2 = b16;
                int b19 = androidx.room.x.b.b(b2, "requires_charging");
                int i3 = b15;
                int b20 = androidx.room.x.b.b(b2, "requires_device_idle");
                int i4 = b14;
                int b21 = androidx.room.x.b.b(b2, "requires_battery_not_low");
                int i5 = b13;
                int b22 = androidx.room.x.b.b(b2, "requires_storage_not_low");
                int i6 = b12;
                int b23 = androidx.room.x.b.b(b2, "trigger_content_update_delay");
                int i7 = b11;
                int b24 = androidx.room.x.b.b(b2, "trigger_max_content_delay");
                int i8 = b10;
                int b25 = androidx.room.x.b.b(b2, "content_uri_triggers");
                int i9 = b9;
                int i10 = b8;
                ArrayList arrayList = new ArrayList(b2.getCount());
                while (b2.moveToNext()) {
                    String string = b2.getString(b3);
                    int i11 = b3;
                    String string2 = b2.getString(b5);
                    int i12 = b5;
                    androidx.work.c cVar = new androidx.work.c();
                    int i13 = b18;
                    cVar.k(p.e(b2.getInt(b18)));
                    cVar.m(b2.getInt(b19) != 0);
                    cVar.n(b2.getInt(b20) != 0);
                    cVar.l(b2.getInt(b21) != 0);
                    cVar.o(b2.getInt(b22) != 0);
                    int i14 = b19;
                    int i15 = b20;
                    cVar.p(b2.getLong(b23));
                    cVar.q(b2.getLong(b24));
                    cVar.j(p.b(b2.getBlob(b25)));
                    j jVar = new j(string, string2);
                    jVar.b = p.f(b2.getInt(b4));
                    jVar.f1722d = b2.getString(b6);
                    jVar.f1723e = androidx.work.e.g(b2.getBlob(b7));
                    int i16 = i10;
                    jVar.f1724f = androidx.work.e.g(b2.getBlob(i16));
                    int i17 = b6;
                    int i18 = i9;
                    int i19 = b7;
                    jVar.f1725g = b2.getLong(i18);
                    int i20 = i14;
                    int i21 = i8;
                    int i22 = i18;
                    jVar.f1726h = b2.getLong(i21);
                    int i23 = i21;
                    int i24 = i7;
                    int i25 = i20;
                    jVar.f1727i = b2.getLong(i24);
                    int i26 = i6;
                    jVar.f1729k = b2.getInt(i26);
                    int i27 = i5;
                    i10 = i16;
                    jVar.f1730l = p.d(b2.getInt(i27));
                    int i28 = i23;
                    int i29 = i4;
                    int i30 = i24;
                    jVar.f1731m = b2.getLong(i29);
                    i6 = i26;
                    int i31 = i3;
                    jVar.f1732n = b2.getLong(i31);
                    i3 = i31;
                    int i32 = i2;
                    jVar.o = b2.getLong(i32);
                    i2 = i32;
                    int i33 = i27;
                    int i34 = b17;
                    jVar.p = b2.getLong(i34);
                    jVar.f1728j = cVar;
                    arrayList.add(jVar);
                    b17 = i34;
                    b6 = i17;
                    b19 = i25;
                    b7 = i19;
                    b5 = i12;
                    b20 = i15;
                    i7 = i30;
                    i9 = i22;
                    i4 = i29;
                    i8 = i28;
                    b3 = i11;
                    i5 = i33;
                    b18 = i13;
                }
                b2.close();
                oVar.n();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                b2.close();
                oVar.n();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            oVar = h2;
            b2.close();
            oVar.n();
            throw th;
        }
    }

    public List<String> d() {
        o h2 = o.h("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5)", 0);
        this.a.b();
        Cursor b2 = androidx.room.x.c.b(this.a, h2, false);
        try {
            ArrayList arrayList = new ArrayList(b2.getCount());
            while (b2.moveToNext()) {
                arrayList.add(b2.getString(0));
            }
            return arrayList;
        } finally {
            b2.close();
            h2.n();
        }
    }

    public int e(String str, long j2) {
        this.a.b();
        e.s.a.f a2 = this.f1737h.a();
        a2.bindLong(1, j2);
        if (str == null) {
            a2.bindNull(2);
        } else {
            a2.bindString(2, str);
        }
        this.a.c();
        try {
            int executeUpdateDelete = a2.executeUpdateDelete();
            this.a.x();
            return executeUpdateDelete;
        } finally {
            this.a.i();
            this.f1737h.f(a2);
        }
    }

    public List<String> f(String str) {
        o h2 = o.h("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            h2.bindNull(1);
        } else {
            h2.bindString(1, str);
        }
        this.a.b();
        Cursor b2 = androidx.room.x.c.b(this.a, h2, false);
        try {
            ArrayList arrayList = new ArrayList(b2.getCount());
            while (b2.moveToNext()) {
                arrayList.add(b2.getString(0));
            }
            return arrayList;
        } finally {
            b2.close();
            h2.n();
        }
    }

    public List<j.a> g(String str) {
        o h2 = o.h("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            h2.bindNull(1);
        } else {
            h2.bindString(1, str);
        }
        this.a.b();
        Cursor b2 = androidx.room.x.c.b(this.a, h2, false);
        try {
            int b3 = androidx.room.x.b.b(b2, "id");
            int b4 = androidx.room.x.b.b(b2, "state");
            ArrayList arrayList = new ArrayList(b2.getCount());
            while (b2.moveToNext()) {
                j.a aVar = new j.a();
                aVar.a = b2.getString(b3);
                aVar.b = p.f(b2.getInt(b4));
                arrayList.add(aVar);
            }
            return arrayList;
        } finally {
            b2.close();
            h2.n();
        }
    }

    public p h(String str) {
        o h2 = o.h("SELECT state FROM workspec WHERE id=?", 1);
        if (str == null) {
            h2.bindNull(1);
        } else {
            h2.bindString(1, str);
        }
        this.a.b();
        Cursor b2 = androidx.room.x.c.b(this.a, h2, false);
        try {
            return b2.moveToFirst() ? p.f(b2.getInt(0)) : null;
        } finally {
            b2.close();
            h2.n();
        }
    }

    public List<j> i(int i2) {
        o oVar;
        o h2 = o.h("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))", 1);
        h2.bindLong(1, (long) i2);
        this.a.b();
        Cursor b2 = androidx.room.x.c.b(this.a, h2, false);
        try {
            int b3 = androidx.room.x.b.b(b2, "id");
            int b4 = androidx.room.x.b.b(b2, "state");
            int b5 = androidx.room.x.b.b(b2, "worker_class_name");
            int b6 = androidx.room.x.b.b(b2, "input_merger_class_name");
            int b7 = androidx.room.x.b.b(b2, "input");
            int b8 = androidx.room.x.b.b(b2, "output");
            int b9 = androidx.room.x.b.b(b2, "initial_delay");
            int b10 = androidx.room.x.b.b(b2, "interval_duration");
            int b11 = androidx.room.x.b.b(b2, "flex_duration");
            int b12 = androidx.room.x.b.b(b2, "run_attempt_count");
            int b13 = androidx.room.x.b.b(b2, "backoff_policy");
            int b14 = androidx.room.x.b.b(b2, "backoff_delay_duration");
            int b15 = androidx.room.x.b.b(b2, "period_start_time");
            int b16 = androidx.room.x.b.b(b2, "minimum_retention_duration");
            oVar = h2;
            try {
                int b17 = androidx.room.x.b.b(b2, "schedule_requested_at");
                int b18 = androidx.room.x.b.b(b2, "required_network_type");
                int i3 = b16;
                int b19 = androidx.room.x.b.b(b2, "requires_charging");
                int i4 = b15;
                int b20 = androidx.room.x.b.b(b2, "requires_device_idle");
                int i5 = b14;
                int b21 = androidx.room.x.b.b(b2, "requires_battery_not_low");
                int i6 = b13;
                int b22 = androidx.room.x.b.b(b2, "requires_storage_not_low");
                int i7 = b12;
                int b23 = androidx.room.x.b.b(b2, "trigger_content_update_delay");
                int i8 = b11;
                int b24 = androidx.room.x.b.b(b2, "trigger_max_content_delay");
                int i9 = b10;
                int b25 = androidx.room.x.b.b(b2, "content_uri_triggers");
                int i10 = b9;
                int i11 = b8;
                ArrayList arrayList = new ArrayList(b2.getCount());
                while (b2.moveToNext()) {
                    String string = b2.getString(b3);
                    int i12 = b3;
                    String string2 = b2.getString(b5);
                    int i13 = b5;
                    androidx.work.c cVar = new androidx.work.c();
                    int i14 = b18;
                    cVar.k(p.e(b2.getInt(b18)));
                    cVar.m(b2.getInt(b19) != 0);
                    cVar.n(b2.getInt(b20) != 0);
                    cVar.l(b2.getInt(b21) != 0);
                    cVar.o(b2.getInt(b22) != 0);
                    int i15 = b19;
                    int i16 = b21;
                    cVar.p(b2.getLong(b23));
                    cVar.q(b2.getLong(b24));
                    cVar.j(p.b(b2.getBlob(b25)));
                    j jVar = new j(string, string2);
                    jVar.b = p.f(b2.getInt(b4));
                    jVar.f1722d = b2.getString(b6);
                    jVar.f1723e = androidx.work.e.g(b2.getBlob(b7));
                    int i17 = i11;
                    jVar.f1724f = androidx.work.e.g(b2.getBlob(i17));
                    int i18 = b20;
                    int i19 = i10;
                    int i20 = i15;
                    jVar.f1725g = b2.getLong(i19);
                    int i21 = b6;
                    int i22 = i9;
                    int i23 = b7;
                    jVar.f1726h = b2.getLong(i22);
                    int i24 = i19;
                    int i25 = i8;
                    int i26 = i22;
                    jVar.f1727i = b2.getLong(i25);
                    int i27 = i7;
                    jVar.f1729k = b2.getInt(i27);
                    int i28 = i6;
                    i11 = i17;
                    jVar.f1730l = p.d(b2.getInt(i28));
                    i7 = i27;
                    i6 = i28;
                    int i29 = i5;
                    jVar.f1731m = b2.getLong(i29);
                    int i30 = i4;
                    int i31 = i21;
                    jVar.f1732n = b2.getLong(i30);
                    int i32 = i25;
                    int i33 = i3;
                    int i34 = i24;
                    jVar.o = b2.getLong(i33);
                    int i35 = i30;
                    int i36 = b17;
                    int i37 = i33;
                    jVar.p = b2.getLong(i36);
                    jVar.f1728j = cVar;
                    arrayList.add(jVar);
                    i5 = i29;
                    b19 = i20;
                    b3 = i12;
                    b5 = i13;
                    b21 = i16;
                    b18 = i14;
                    i10 = i34;
                    i3 = i37;
                    b17 = i36;
                    b6 = i31;
                    i4 = i35;
                    b7 = i23;
                    i9 = i26;
                    i8 = i32;
                    b20 = i18;
                }
                b2.close();
                oVar.n();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                b2.close();
                oVar.n();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            oVar = h2;
            b2.close();
            oVar.n();
            throw th;
        }
    }

    public j j(String str) {
        o oVar;
        j jVar;
        String str2 = str;
        o h2 = o.h("SELECT * FROM workspec WHERE id=?", 1);
        if (str2 == null) {
            h2.bindNull(1);
        } else {
            h2.bindString(1, str2);
        }
        this.a.b();
        Cursor b2 = androidx.room.x.c.b(this.a, h2, false);
        try {
            int b3 = androidx.room.x.b.b(b2, "id");
            int b4 = androidx.room.x.b.b(b2, "state");
            int b5 = androidx.room.x.b.b(b2, "worker_class_name");
            int b6 = androidx.room.x.b.b(b2, "input_merger_class_name");
            int b7 = androidx.room.x.b.b(b2, "input");
            int b8 = androidx.room.x.b.b(b2, "output");
            int b9 = androidx.room.x.b.b(b2, "initial_delay");
            int b10 = androidx.room.x.b.b(b2, "interval_duration");
            int b11 = androidx.room.x.b.b(b2, "flex_duration");
            int b12 = androidx.room.x.b.b(b2, "run_attempt_count");
            int b13 = androidx.room.x.b.b(b2, "backoff_policy");
            int b14 = androidx.room.x.b.b(b2, "backoff_delay_duration");
            int b15 = androidx.room.x.b.b(b2, "period_start_time");
            int b16 = androidx.room.x.b.b(b2, "minimum_retention_duration");
            oVar = h2;
            try {
                int b17 = androidx.room.x.b.b(b2, "schedule_requested_at");
                int b18 = androidx.room.x.b.b(b2, "required_network_type");
                int i2 = b16;
                int b19 = androidx.room.x.b.b(b2, "requires_charging");
                int i3 = b15;
                int b20 = androidx.room.x.b.b(b2, "requires_device_idle");
                int i4 = b14;
                int b21 = androidx.room.x.b.b(b2, "requires_battery_not_low");
                int i5 = b13;
                int b22 = androidx.room.x.b.b(b2, "requires_storage_not_low");
                int i6 = b12;
                int b23 = androidx.room.x.b.b(b2, "trigger_content_update_delay");
                int i7 = b11;
                int b24 = androidx.room.x.b.b(b2, "trigger_max_content_delay");
                int i8 = b10;
                int b25 = androidx.room.x.b.b(b2, "content_uri_triggers");
                if (b2.moveToFirst()) {
                    String string = b2.getString(b3);
                    String string2 = b2.getString(b5);
                    int i9 = b9;
                    androidx.work.c cVar = new androidx.work.c();
                    cVar.k(p.e(b2.getInt(b18)));
                    cVar.m(b2.getInt(b19) != 0);
                    cVar.n(b2.getInt(b20) != 0);
                    cVar.l(b2.getInt(b21) != 0);
                    cVar.o(b2.getInt(b22) != 0);
                    cVar.p(b2.getLong(b23));
                    cVar.q(b2.getLong(b24));
                    cVar.j(p.b(b2.getBlob(b25)));
                    jVar = new j(string, string2);
                    jVar.b = p.f(b2.getInt(b4));
                    jVar.f1722d = b2.getString(b6);
                    jVar.f1723e = androidx.work.e.g(b2.getBlob(b7));
                    jVar.f1724f = androidx.work.e.g(b2.getBlob(b8));
                    jVar.f1725g = b2.getLong(i9);
                    jVar.f1726h = b2.getLong(i8);
                    jVar.f1727i = b2.getLong(i7);
                    jVar.f1729k = b2.getInt(i6);
                    jVar.f1730l = p.d(b2.getInt(i5));
                    jVar.f1731m = b2.getLong(i4);
                    jVar.f1732n = b2.getLong(i3);
                    jVar.o = b2.getLong(i2);
                    jVar.p = b2.getLong(b17);
                    jVar.f1728j = cVar;
                } else {
                    jVar = null;
                }
                b2.close();
                oVar.n();
                return jVar;
            } catch (Throwable th) {
                th = th;
                b2.close();
                oVar.n();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            oVar = h2;
            b2.close();
            oVar.n();
            throw th;
        }
    }

    public int k(String str) {
        this.a.b();
        e.s.a.f a2 = this.f1736g.a();
        if (str == null) {
            a2.bindNull(1);
        } else {
            a2.bindString(1, str);
        }
        this.a.c();
        try {
            int executeUpdateDelete = a2.executeUpdateDelete();
            this.a.x();
            return executeUpdateDelete;
        } finally {
            this.a.i();
            this.f1736g.f(a2);
        }
    }

    public void l(j jVar) {
        this.a.b();
        this.a.c();
        try {
            this.b.i(jVar);
            this.a.x();
        } finally {
            this.a.i();
        }
    }

    public List<String> m(String str) {
        o h2 = o.h("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if (str == null) {
            h2.bindNull(1);
        } else {
            h2.bindString(1, str);
        }
        this.a.b();
        Cursor b2 = androidx.room.x.c.b(this.a, h2, false);
        try {
            ArrayList arrayList = new ArrayList(b2.getCount());
            while (b2.moveToNext()) {
                arrayList.add(b2.getString(0));
            }
            return arrayList;
        } finally {
            b2.close();
            h2.n();
        }
    }

    public List<androidx.work.e> n(String str) {
        o h2 = o.h("SELECT output FROM workspec WHERE id IN (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
        if (str == null) {
            h2.bindNull(1);
        } else {
            h2.bindString(1, str);
        }
        this.a.b();
        Cursor b2 = androidx.room.x.c.b(this.a, h2, false);
        try {
            ArrayList arrayList = new ArrayList(b2.getCount());
            while (b2.moveToNext()) {
                arrayList.add(androidx.work.e.g(b2.getBlob(0)));
            }
            return arrayList;
        } finally {
            b2.close();
            h2.n();
        }
    }

    public int o(String str) {
        this.a.b();
        e.s.a.f a2 = this.f1735f.a();
        if (str == null) {
            a2.bindNull(1);
        } else {
            a2.bindString(1, str);
        }
        this.a.c();
        try {
            int executeUpdateDelete = a2.executeUpdateDelete();
            this.a.x();
            return executeUpdateDelete;
        } finally {
            this.a.i();
            this.f1735f.f(a2);
        }
    }

    public void p(String str, long j2) {
        this.a.b();
        e.s.a.f a2 = this.f1734e.a();
        a2.bindLong(1, j2);
        if (str == null) {
            a2.bindNull(2);
        } else {
            a2.bindString(2, str);
        }
        this.a.c();
        try {
            a2.executeUpdateDelete();
            this.a.x();
        } finally {
            this.a.i();
            this.f1734e.f(a2);
        }
    }

    public List<j> q() {
        o oVar;
        o h2 = o.h("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        this.a.b();
        Cursor b2 = androidx.room.x.c.b(this.a, h2, false);
        try {
            int b3 = androidx.room.x.b.b(b2, "id");
            int b4 = androidx.room.x.b.b(b2, "state");
            int b5 = androidx.room.x.b.b(b2, "worker_class_name");
            int b6 = androidx.room.x.b.b(b2, "input_merger_class_name");
            int b7 = androidx.room.x.b.b(b2, "input");
            int b8 = androidx.room.x.b.b(b2, "output");
            int b9 = androidx.room.x.b.b(b2, "initial_delay");
            int b10 = androidx.room.x.b.b(b2, "interval_duration");
            int b11 = androidx.room.x.b.b(b2, "flex_duration");
            int b12 = androidx.room.x.b.b(b2, "run_attempt_count");
            int b13 = androidx.room.x.b.b(b2, "backoff_policy");
            int b14 = androidx.room.x.b.b(b2, "backoff_delay_duration");
            int b15 = androidx.room.x.b.b(b2, "period_start_time");
            int b16 = androidx.room.x.b.b(b2, "minimum_retention_duration");
            oVar = h2;
            try {
                int b17 = androidx.room.x.b.b(b2, "schedule_requested_at");
                int b18 = androidx.room.x.b.b(b2, "required_network_type");
                int i2 = b16;
                int b19 = androidx.room.x.b.b(b2, "requires_charging");
                int i3 = b15;
                int b20 = androidx.room.x.b.b(b2, "requires_device_idle");
                int i4 = b14;
                int b21 = androidx.room.x.b.b(b2, "requires_battery_not_low");
                int i5 = b13;
                int b22 = androidx.room.x.b.b(b2, "requires_storage_not_low");
                int i6 = b12;
                int b23 = androidx.room.x.b.b(b2, "trigger_content_update_delay");
                int i7 = b11;
                int b24 = androidx.room.x.b.b(b2, "trigger_max_content_delay");
                int i8 = b10;
                int b25 = androidx.room.x.b.b(b2, "content_uri_triggers");
                int i9 = b9;
                int i10 = b8;
                ArrayList arrayList = new ArrayList(b2.getCount());
                while (b2.moveToNext()) {
                    String string = b2.getString(b3);
                    int i11 = b3;
                    String string2 = b2.getString(b5);
                    int i12 = b5;
                    androidx.work.c cVar = new androidx.work.c();
                    int i13 = b18;
                    cVar.k(p.e(b2.getInt(b18)));
                    cVar.m(b2.getInt(b19) != 0);
                    cVar.n(b2.getInt(b20) != 0);
                    cVar.l(b2.getInt(b21) != 0);
                    cVar.o(b2.getInt(b22) != 0);
                    int i14 = b19;
                    int i15 = b20;
                    cVar.p(b2.getLong(b23));
                    cVar.q(b2.getLong(b24));
                    cVar.j(p.b(b2.getBlob(b25)));
                    j jVar = new j(string, string2);
                    jVar.b = p.f(b2.getInt(b4));
                    jVar.f1722d = b2.getString(b6);
                    jVar.f1723e = androidx.work.e.g(b2.getBlob(b7));
                    int i16 = i10;
                    jVar.f1724f = androidx.work.e.g(b2.getBlob(i16));
                    int i17 = b6;
                    int i18 = i9;
                    int i19 = b7;
                    jVar.f1725g = b2.getLong(i18);
                    int i20 = i14;
                    int i21 = i8;
                    int i22 = i18;
                    jVar.f1726h = b2.getLong(i21);
                    int i23 = i21;
                    int i24 = i7;
                    int i25 = i20;
                    jVar.f1727i = b2.getLong(i24);
                    int i26 = i6;
                    jVar.f1729k = b2.getInt(i26);
                    int i27 = i5;
                    i10 = i16;
                    jVar.f1730l = p.d(b2.getInt(i27));
                    int i28 = i23;
                    int i29 = i4;
                    int i30 = i24;
                    jVar.f1731m = b2.getLong(i29);
                    i6 = i26;
                    int i31 = i3;
                    jVar.f1732n = b2.getLong(i31);
                    i3 = i31;
                    int i32 = i2;
                    jVar.o = b2.getLong(i32);
                    i2 = i32;
                    int i33 = i27;
                    int i34 = b17;
                    jVar.p = b2.getLong(i34);
                    jVar.f1728j = cVar;
                    arrayList.add(jVar);
                    b17 = i34;
                    b6 = i17;
                    b19 = i25;
                    b7 = i19;
                    b5 = i12;
                    b20 = i15;
                    i7 = i30;
                    i9 = i22;
                    i4 = i29;
                    i8 = i28;
                    b3 = i11;
                    i5 = i33;
                    b18 = i13;
                }
                b2.close();
                oVar.n();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                b2.close();
                oVar.n();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            oVar = h2;
            b2.close();
            oVar.n();
            throw th;
        }
    }

    public void r(String str, androidx.work.e eVar) {
        this.a.b();
        e.s.a.f a2 = this.f1733d.a();
        byte[] l2 = androidx.work.e.l(eVar);
        if (l2 == null) {
            a2.bindNull(1);
        } else {
            a2.bindBlob(1, l2);
        }
        if (str == null) {
            a2.bindNull(2);
        } else {
            a2.bindString(2, str);
        }
        this.a.c();
        try {
            a2.executeUpdateDelete();
            this.a.x();
        } finally {
            this.a.i();
            this.f1733d.f(a2);
        }
    }

    public int s() {
        this.a.b();
        e.s.a.f a2 = this.f1738i.a();
        this.a.c();
        try {
            int executeUpdateDelete = a2.executeUpdateDelete();
            this.a.x();
            return executeUpdateDelete;
        } finally {
            this.a.i();
            this.f1738i.f(a2);
        }
    }
}
