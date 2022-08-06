package androidx.work.impl;

import android.os.Build;
import androidx.room.l;
import androidx.room.n;
import androidx.room.x.c;
import androidx.room.x.f;
import androidx.work.impl.l.b;
import androidx.work.impl.l.e;
import androidx.work.impl.l.h;
import androidx.work.impl.l.i;
import androidx.work.impl.l.k;
import androidx.work.impl.l.n;
import androidx.work.impl.l.o;
import e.s.a.c;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public final class WorkDatabase_Impl extends WorkDatabase {

    /* renamed from: m  reason: collision with root package name */
    private volatile k f1592m;

    /* renamed from: n  reason: collision with root package name */
    private volatile b f1593n;
    private volatile n o;
    private volatile e p;
    private volatile h q;

    class a extends n.a {
        a(int i2) {
            super(i2);
        }

        public void a(e.s.a.b bVar) {
            bVar.execSQL("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            bVar.execSQL("CREATE  INDEX `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
            bVar.execSQL("CREATE  INDEX `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
            bVar.execSQL("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `required_network_type` INTEGER, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB, PRIMARY KEY(`id`))");
            bVar.execSQL("CREATE  INDEX `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
            bVar.execSQL("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            bVar.execSQL("CREATE  INDEX `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
            bVar.execSQL("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            bVar.execSQL("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            bVar.execSQL("CREATE  INDEX `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
            bVar.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            bVar.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c84d23ade98552f1cec71088c1f0794c')");
        }

        public void b(e.s.a.b bVar) {
            bVar.execSQL("DROP TABLE IF EXISTS `Dependency`");
            bVar.execSQL("DROP TABLE IF EXISTS `WorkSpec`");
            bVar.execSQL("DROP TABLE IF EXISTS `WorkTag`");
            bVar.execSQL("DROP TABLE IF EXISTS `SystemIdInfo`");
            bVar.execSQL("DROP TABLE IF EXISTS `WorkName`");
        }

        /* access modifiers changed from: protected */
        public void c(e.s.a.b bVar) {
            if (WorkDatabase_Impl.this.f1409h != null) {
                int size = WorkDatabase_Impl.this.f1409h.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((l.b) WorkDatabase_Impl.this.f1409h.get(i2)).a(bVar);
                }
            }
        }

        public void d(e.s.a.b bVar) {
            e.s.a.b unused = WorkDatabase_Impl.this.a = bVar;
            bVar.execSQL("PRAGMA foreign_keys = ON");
            WorkDatabase_Impl.this.r(bVar);
            if (WorkDatabase_Impl.this.f1409h != null) {
                int size = WorkDatabase_Impl.this.f1409h.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((l.b) WorkDatabase_Impl.this.f1409h.get(i2)).c(bVar);
                }
            }
        }

        public void e(e.s.a.b bVar) {
        }

        public void f(e.s.a.b bVar) {
            c.a(bVar);
        }

        /* access modifiers changed from: protected */
        public void h(e.s.a.b bVar) {
            e.s.a.b bVar2 = bVar;
            HashMap hashMap = new HashMap(2);
            hashMap.put("work_spec_id", new f.a("work_spec_id", "TEXT", true, 1));
            hashMap.put("prerequisite_id", new f.a("prerequisite_id", "TEXT", true, 2));
            HashSet hashSet = new HashSet(2);
            hashSet.add(new f.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
            hashSet.add(new f.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"prerequisite_id"}), Arrays.asList(new String[]{"id"})));
            HashSet hashSet2 = new HashSet(2);
            hashSet2.add(new f.d("index_Dependency_work_spec_id", false, Arrays.asList(new String[]{"work_spec_id"})));
            hashSet2.add(new f.d("index_Dependency_prerequisite_id", false, Arrays.asList(new String[]{"prerequisite_id"})));
            f fVar = new f("Dependency", hashMap, hashSet, hashSet2);
            f a = f.a(bVar2, "Dependency");
            if (fVar.equals(a)) {
                HashMap hashMap2 = new HashMap(23);
                hashMap2.put("id", new f.a("id", "TEXT", true, 1));
                hashMap2.put("state", new f.a("state", "INTEGER", true, 0));
                hashMap2.put("worker_class_name", new f.a("worker_class_name", "TEXT", true, 0));
                hashMap2.put("input_merger_class_name", new f.a("input_merger_class_name", "TEXT", false, 0));
                hashMap2.put("input", new f.a("input", "BLOB", true, 0));
                hashMap2.put("output", new f.a("output", "BLOB", true, 0));
                hashMap2.put("initial_delay", new f.a("initial_delay", "INTEGER", true, 0));
                hashMap2.put("interval_duration", new f.a("interval_duration", "INTEGER", true, 0));
                hashMap2.put("flex_duration", new f.a("flex_duration", "INTEGER", true, 0));
                hashMap2.put("run_attempt_count", new f.a("run_attempt_count", "INTEGER", true, 0));
                hashMap2.put("backoff_policy", new f.a("backoff_policy", "INTEGER", true, 0));
                hashMap2.put("backoff_delay_duration", new f.a("backoff_delay_duration", "INTEGER", true, 0));
                hashMap2.put("period_start_time", new f.a("period_start_time", "INTEGER", true, 0));
                hashMap2.put("minimum_retention_duration", new f.a("minimum_retention_duration", "INTEGER", true, 0));
                hashMap2.put("schedule_requested_at", new f.a("schedule_requested_at", "INTEGER", true, 0));
                hashMap2.put("required_network_type", new f.a("required_network_type", "INTEGER", false, 0));
                hashMap2.put("requires_charging", new f.a("requires_charging", "INTEGER", true, 0));
                hashMap2.put("requires_device_idle", new f.a("requires_device_idle", "INTEGER", true, 0));
                hashMap2.put("requires_battery_not_low", new f.a("requires_battery_not_low", "INTEGER", true, 0));
                hashMap2.put("requires_storage_not_low", new f.a("requires_storage_not_low", "INTEGER", true, 0));
                hashMap2.put("trigger_content_update_delay", new f.a("trigger_content_update_delay", "INTEGER", true, 0));
                hashMap2.put("trigger_max_content_delay", new f.a("trigger_max_content_delay", "INTEGER", true, 0));
                hashMap2.put("content_uri_triggers", new f.a("content_uri_triggers", "BLOB", false, 0));
                HashSet hashSet3 = new HashSet(0);
                HashSet hashSet4 = new HashSet(1);
                hashSet4.add(new f.d("index_WorkSpec_schedule_requested_at", false, Arrays.asList(new String[]{"schedule_requested_at"})));
                f fVar2 = new f("WorkSpec", hashMap2, hashSet3, hashSet4);
                f a2 = f.a(bVar2, "WorkSpec");
                if (fVar2.equals(a2)) {
                    HashMap hashMap3 = new HashMap(2);
                    hashMap3.put("tag", new f.a("tag", "TEXT", true, 1));
                    hashMap3.put("work_spec_id", new f.a("work_spec_id", "TEXT", true, 2));
                    HashSet hashSet5 = new HashSet(1);
                    hashSet5.add(new f.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
                    HashSet hashSet6 = new HashSet(1);
                    hashSet6.add(new f.d("index_WorkTag_work_spec_id", false, Arrays.asList(new String[]{"work_spec_id"})));
                    f fVar3 = new f("WorkTag", hashMap3, hashSet5, hashSet6);
                    f a3 = f.a(bVar2, "WorkTag");
                    if (fVar3.equals(a3)) {
                        HashMap hashMap4 = new HashMap(2);
                        hashMap4.put("work_spec_id", new f.a("work_spec_id", "TEXT", true, 1));
                        hashMap4.put("system_id", new f.a("system_id", "INTEGER", true, 0));
                        HashSet hashSet7 = new HashSet(1);
                        hashSet7.add(new f.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
                        f fVar4 = new f("SystemIdInfo", hashMap4, hashSet7, new HashSet(0));
                        f a4 = f.a(bVar2, "SystemIdInfo");
                        if (fVar4.equals(a4)) {
                            HashMap hashMap5 = new HashMap(2);
                            hashMap5.put("name", new f.a("name", "TEXT", true, 1));
                            hashMap5.put("work_spec_id", new f.a("work_spec_id", "TEXT", true, 2));
                            HashSet hashSet8 = new HashSet(1);
                            hashSet8.add(new f.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
                            HashSet hashSet9 = new HashSet(1);
                            hashSet9.add(new f.d("index_WorkName_work_spec_id", false, Arrays.asList(new String[]{"work_spec_id"})));
                            f fVar5 = new f("WorkName", hashMap5, hashSet8, hashSet9);
                            f a5 = f.a(bVar2, "WorkName");
                            if (!fVar5.equals(a5)) {
                                throw new IllegalStateException("Migration didn't properly handle WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + fVar5 + "\n Found:\n" + a5);
                            }
                            return;
                        }
                        throw new IllegalStateException("Migration didn't properly handle SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + fVar4 + "\n Found:\n" + a4);
                    }
                    throw new IllegalStateException("Migration didn't properly handle WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + fVar3 + "\n Found:\n" + a3);
                }
                throw new IllegalStateException("Migration didn't properly handle WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + fVar2 + "\n Found:\n" + a2);
            }
            throw new IllegalStateException("Migration didn't properly handle Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + fVar + "\n Found:\n" + a);
        }
    }

    public e D() {
        e eVar;
        if (this.p != null) {
            return this.p;
        }
        synchronized (this) {
            if (this.p == null) {
                this.p = new androidx.work.impl.l.f(this);
            }
            eVar = this.p;
        }
        return eVar;
    }

    public h E() {
        h hVar;
        if (this.q != null) {
            return this.q;
        }
        synchronized (this) {
            if (this.q == null) {
                this.q = new i(this);
            }
            hVar = this.q;
        }
        return hVar;
    }

    public k F() {
        k kVar;
        if (this.f1592m != null) {
            return this.f1592m;
        }
        synchronized (this) {
            if (this.f1592m == null) {
                this.f1592m = new androidx.work.impl.l.l(this);
            }
            kVar = this.f1592m;
        }
        return kVar;
    }

    public androidx.work.impl.l.n G() {
        androidx.work.impl.l.n nVar;
        if (this.o != null) {
            return this.o;
        }
        synchronized (this) {
            if (this.o == null) {
                this.o = new o(this);
            }
            nVar = this.o;
        }
        return nVar;
    }

    public void d() {
        super.a();
        e.s.a.b b = super.m().b();
        boolean z = Build.VERSION.SDK_INT >= 21;
        if (!z) {
            try {
                b.execSQL("PRAGMA foreign_keys = FALSE");
            } catch (Throwable th) {
                super.i();
                if (!z) {
                    b.execSQL("PRAGMA foreign_keys = TRUE");
                }
                b.x0("PRAGMA wal_checkpoint(FULL)").close();
                if (!b.inTransaction()) {
                    b.execSQL("VACUUM");
                }
                throw th;
            }
        }
        super.c();
        if (z) {
            b.execSQL("PRAGMA defer_foreign_keys = TRUE");
        }
        b.execSQL("DELETE FROM `Dependency`");
        b.execSQL("DELETE FROM `WorkSpec`");
        b.execSQL("DELETE FROM `WorkTag`");
        b.execSQL("DELETE FROM `SystemIdInfo`");
        b.execSQL("DELETE FROM `WorkName`");
        super.x();
        super.i();
        if (!z) {
            b.execSQL("PRAGMA foreign_keys = TRUE");
        }
        b.x0("PRAGMA wal_checkpoint(FULL)").close();
        if (!b.inTransaction()) {
            b.execSQL("VACUUM");
        }
    }

    /* access modifiers changed from: protected */
    public androidx.room.i g() {
        return new androidx.room.i(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName");
    }

    /* access modifiers changed from: protected */
    public e.s.a.c h(androidx.room.c cVar) {
        androidx.room.n nVar = new androidx.room.n(cVar, new a(6), "c84d23ade98552f1cec71088c1f0794c", "1db8206f0da6aa81bbdd2d99a82d9e14");
        c.b.a a2 = c.b.a(cVar.b);
        a2.c(cVar.c);
        a2.b(nVar);
        return cVar.a.a(a2.a());
    }

    public b z() {
        b bVar;
        if (this.f1593n != null) {
            return this.f1593n;
        }
        synchronized (this) {
            if (this.f1593n == null) {
                this.f1593n = new androidx.work.impl.l.c(this);
            }
            bVar = this.f1593n;
        }
        return bVar;
    }
}
