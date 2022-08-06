package androidx.work.impl;

import android.content.Context;
import android.os.Build;
import androidx.work.impl.utils.e;

/* compiled from: WorkDatabaseMigrations */
public class g {
    public static androidx.room.v.a a = new a(1, 2);
    public static androidx.room.v.a b = new b(3, 4);
    public static androidx.room.v.a c = new c(4, 5);

    /* compiled from: WorkDatabaseMigrations */
    static class a extends androidx.room.v.a {
        a(int i2, int i3) {
            super(i2, i3);
        }

        public void a(e.s.a.b bVar) {
            bVar.execSQL("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            bVar.execSQL("INSERT INTO SystemIdInfo(work_spec_id, system_id) SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo");
            bVar.execSQL("DROP TABLE IF EXISTS alarmInfo");
            bVar.execSQL("INSERT OR IGNORE INTO worktag(tag, work_spec_id) SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec");
        }
    }

    /* compiled from: WorkDatabaseMigrations */
    static class b extends androidx.room.v.a {
        b(int i2, int i3) {
            super(i2, i3);
        }

        public void a(e.s.a.b bVar) {
            if (Build.VERSION.SDK_INT >= 23) {
                bVar.execSQL("UPDATE workspec SET schedule_requested_at=0 WHERE state NOT IN (2, 3, 5) AND schedule_requested_at=-1 AND interval_duration<>0");
            }
        }
    }

    /* compiled from: WorkDatabaseMigrations */
    static class c extends androidx.room.v.a {
        c(int i2, int i3) {
            super(i2, i3);
        }

        public void a(e.s.a.b bVar) {
            bVar.execSQL("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
            bVar.execSQL("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
        }
    }

    /* compiled from: WorkDatabaseMigrations */
    public static class d extends androidx.room.v.a {
        final Context c;

        public d(Context context, int i2, int i3) {
            super(i2, i3);
            this.c = context;
        }

        public void a(e.s.a.b bVar) {
            new e(this.c).c(true);
        }
    }
}
