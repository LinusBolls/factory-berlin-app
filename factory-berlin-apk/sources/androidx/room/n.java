package androidx.room;

import android.database.Cursor;
import e.s.a.c;
import java.util.List;

/* compiled from: RoomOpenHelper */
public class n extends c.a {
    private c b;
    private final a c;

    /* renamed from: d  reason: collision with root package name */
    private final String f1428d;

    /* renamed from: e  reason: collision with root package name */
    private final String f1429e;

    /* compiled from: RoomOpenHelper */
    public static abstract class a {
        public final int a;

        public a(int i2) {
            this.a = i2;
        }

        /* access modifiers changed from: protected */
        public abstract void a(e.s.a.b bVar);

        /* access modifiers changed from: protected */
        public abstract void b(e.s.a.b bVar);

        /* access modifiers changed from: protected */
        public abstract void c(e.s.a.b bVar);

        /* access modifiers changed from: protected */
        public abstract void d(e.s.a.b bVar);

        /* access modifiers changed from: protected */
        public void e(e.s.a.b bVar) {
        }

        /* access modifiers changed from: protected */
        public void f(e.s.a.b bVar) {
        }

        /* access modifiers changed from: protected */
        public b g(e.s.a.b bVar) {
            h(bVar);
            return new b(true, (String) null);
        }

        /* access modifiers changed from: protected */
        @Deprecated
        public void h(e.s.a.b bVar) {
            throw new UnsupportedOperationException("validateMigration is deprecated");
        }
    }

    /* compiled from: RoomOpenHelper */
    public static class b {
        public final boolean a;
        public final String b;

        public b(boolean z, String str) {
            this.a = z;
            this.b = str;
        }
    }

    public n(c cVar, a aVar, String str, String str2) {
        super(aVar.a);
        this.b = cVar;
        this.c = aVar;
        this.f1428d = str;
        this.f1429e = str2;
    }

    /* JADX INFO: finally extract failed */
    private void h(e.s.a.b bVar) {
        if (k(bVar)) {
            String str = null;
            Cursor J = bVar.J(new e.s.a.a("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
            try {
                if (J.moveToFirst()) {
                    str = J.getString(0);
                }
                J.close();
                if (!this.f1428d.equals(str) && !this.f1429e.equals(str)) {
                    throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number.");
                }
            } catch (Throwable th) {
                J.close();
                throw th;
            }
        } else {
            b g2 = this.c.g(bVar);
            if (g2.a) {
                this.c.e(bVar);
                l(bVar);
                return;
            }
            throw new IllegalStateException("Pre-packaged database has an invalid schema: " + g2.b);
        }
    }

    private void i(e.s.a.b bVar) {
        bVar.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
    }

    private static boolean j(e.s.a.b bVar) {
        Cursor x0 = bVar.x0("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z = false;
            if (x0.moveToFirst() && x0.getInt(0) == 0) {
                z = true;
            }
            return z;
        } finally {
            x0.close();
        }
    }

    private static boolean k(e.s.a.b bVar) {
        Cursor x0 = bVar.x0("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
        try {
            boolean z = false;
            if (x0.moveToFirst() && x0.getInt(0) != 0) {
                z = true;
            }
            return z;
        } finally {
            x0.close();
        }
    }

    private void l(e.s.a.b bVar) {
        i(bVar);
        bVar.execSQL(m.a(this.f1428d));
    }

    public void b(e.s.a.b bVar) {
        super.b(bVar);
    }

    public void d(e.s.a.b bVar) {
        boolean j2 = j(bVar);
        this.c.a(bVar);
        if (!j2) {
            b g2 = this.c.g(bVar);
            if (!g2.a) {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + g2.b);
            }
        }
        l(bVar);
        this.c.c(bVar);
    }

    public void e(e.s.a.b bVar, int i2, int i3) {
        g(bVar, i2, i3);
    }

    public void f(e.s.a.b bVar) {
        super.f(bVar);
        h(bVar);
        this.c.d(bVar);
        this.b = null;
    }

    public void g(e.s.a.b bVar, int i2, int i3) {
        boolean z;
        List<androidx.room.v.a> c2;
        c cVar = this.b;
        if (cVar == null || (c2 = cVar.f1366d.c(i2, i3)) == null) {
            z = false;
        } else {
            this.c.f(bVar);
            for (androidx.room.v.a a2 : c2) {
                a2.a(bVar);
            }
            b g2 = this.c.g(bVar);
            if (g2.a) {
                this.c.e(bVar);
                l(bVar);
                z = true;
            } else {
                throw new IllegalStateException("Migration didn't properly handle: " + g2.b);
            }
        }
        if (!z) {
            c cVar2 = this.b;
            if (cVar2 == null || cVar2.a(i2, i3)) {
                throw new IllegalStateException("A migration from " + i2 + " to " + i3 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
            }
            this.c.b(bVar);
            this.c.a(bVar);
        }
    }
}
