package com.sensorberg.smartworkspace.app.screens.info;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.lifecycle.LiveData;
import androidx.room.l;
import androidx.room.o;
import androidx.room.s;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: InfoDao_Impl */
public final class d implements c {
    /* access modifiers changed from: private */
    public final l a;
    private final androidx.room.e<a> b;
    private final androidx.room.d<a> c;

    /* renamed from: d  reason: collision with root package name */
    private final s f7514d;

    /* renamed from: e  reason: collision with root package name */
    private final s f7515e;

    /* compiled from: InfoDao_Impl */
    class a extends androidx.room.e<a> {
        a(d dVar, l lVar) {
            super(lVar);
        }

        public String d() {
            return "INSERT OR REPLACE INTO `Info` (`instance`,`action`,`title`,`body`,`uri`,`payload`,`ts`,`read`) VALUES (?,?,?,?,?,?,?,?)";
        }

        /* renamed from: l */
        public void g(e.s.a.f fVar, a aVar) {
            if (aVar.c() == null) {
                fVar.bindNull(1);
            } else {
                fVar.bindString(1, aVar.c());
            }
            if (aVar.a() == null) {
                fVar.bindNull(2);
            } else {
                fVar.bindString(2, aVar.a());
            }
            if (aVar.g() == null) {
                fVar.bindNull(3);
            } else {
                fVar.bindString(3, aVar.g());
            }
            if (aVar.b() == null) {
                fVar.bindNull(4);
            } else {
                fVar.bindString(4, aVar.b());
            }
            if (aVar.i() == null) {
                fVar.bindNull(5);
            } else {
                fVar.bindString(5, aVar.i());
            }
            if (aVar.e() == null) {
                fVar.bindNull(6);
            } else {
                fVar.bindString(6, aVar.e());
            }
            fVar.bindLong(7, aVar.h());
            fVar.bindLong(8, aVar.f() ? 1 : 0);
        }
    }

    /* compiled from: InfoDao_Impl */
    class b extends androidx.room.d<a> {
        b(d dVar, l lVar) {
            super(lVar);
        }

        public String d() {
            return "UPDATE OR ABORT `Info` SET `instance` = ?,`action` = ?,`title` = ?,`body` = ?,`uri` = ?,`payload` = ?,`ts` = ?,`read` = ? WHERE `instance` = ?";
        }

        /* renamed from: k */
        public void g(e.s.a.f fVar, a aVar) {
            if (aVar.c() == null) {
                fVar.bindNull(1);
            } else {
                fVar.bindString(1, aVar.c());
            }
            if (aVar.a() == null) {
                fVar.bindNull(2);
            } else {
                fVar.bindString(2, aVar.a());
            }
            if (aVar.g() == null) {
                fVar.bindNull(3);
            } else {
                fVar.bindString(3, aVar.g());
            }
            if (aVar.b() == null) {
                fVar.bindNull(4);
            } else {
                fVar.bindString(4, aVar.b());
            }
            if (aVar.i() == null) {
                fVar.bindNull(5);
            } else {
                fVar.bindString(5, aVar.i());
            }
            if (aVar.e() == null) {
                fVar.bindNull(6);
            } else {
                fVar.bindString(6, aVar.e());
            }
            fVar.bindLong(7, aVar.h());
            fVar.bindLong(8, aVar.f() ? 1 : 0);
            if (aVar.c() == null) {
                fVar.bindNull(9);
            } else {
                fVar.bindString(9, aVar.c());
            }
        }
    }

    /* compiled from: InfoDao_Impl */
    class c extends s {
        c(d dVar, l lVar) {
            super(lVar);
        }

        public String d() {
            return "UPDATE info SET read=1 WHERE instance=?";
        }
    }

    /* renamed from: com.sensorberg.smartworkspace.app.screens.info.d$d  reason: collision with other inner class name */
    /* compiled from: InfoDao_Impl */
    class C0494d extends s {
        C0494d(d dVar, l lVar) {
            super(lVar);
        }

        public String d() {
            return "UPDATE info SET read=1";
        }
    }

    /* compiled from: InfoDao_Impl */
    class e implements Callable<List<a>> {
        final /* synthetic */ o a;

        e(o oVar) {
            this.a = oVar;
        }

        /* renamed from: a */
        public List<a> call() {
            Cursor c = androidx.room.x.c.c(d.this.a, this.a, false, (CancellationSignal) null);
            try {
                int b2 = androidx.room.x.b.b(c, "instance");
                int b3 = androidx.room.x.b.b(c, "action");
                int b4 = androidx.room.x.b.b(c, "title");
                int b5 = androidx.room.x.b.b(c, "body");
                int b6 = androidx.room.x.b.b(c, "uri");
                int b7 = androidx.room.x.b.b(c, "payload");
                int b8 = androidx.room.x.b.b(c, "ts");
                int b9 = androidx.room.x.b.b(c, "read");
                ArrayList arrayList = new ArrayList(c.getCount());
                while (c.moveToNext()) {
                    arrayList.add(new a(c.getString(b2), c.getString(b3), c.getString(b4), c.getString(b5), c.getString(b6), c.getString(b7), c.getLong(b8), c.getInt(b9) != 0));
                }
                return arrayList;
            } finally {
                c.close();
            }
        }

        /* access modifiers changed from: protected */
        public void finalize() {
            this.a.n();
        }
    }

    /* compiled from: InfoDao_Impl */
    class f implements Callable<Integer> {
        final /* synthetic */ o a;

        f(o oVar) {
            this.a = oVar;
        }

        /* renamed from: a */
        public Integer call() {
            Integer num = null;
            Cursor c = androidx.room.x.c.c(d.this.a, this.a, false, (CancellationSignal) null);
            try {
                if (c.moveToFirst()) {
                    if (!c.isNull(0)) {
                        num = Integer.valueOf(c.getInt(0));
                    }
                }
                return num;
            } finally {
                c.close();
            }
        }

        /* access modifiers changed from: protected */
        public void finalize() {
            this.a.n();
        }
    }

    public d(l lVar) {
        this.a = lVar;
        this.b = new a(this, lVar);
        this.c = new b(this, lVar);
        this.f7514d = new c(this, lVar);
        this.f7515e = new C0494d(this, lVar);
    }

    public void a(a... aVarArr) {
        this.a.b();
        this.a.c();
        try {
            this.b.j(aVarArr);
            this.a.x();
        } finally {
            this.a.i();
        }
    }

    public void b(String str) {
        this.a.b();
        e.s.a.f a2 = this.f7514d.a();
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
            this.f7514d.f(a2);
        }
    }

    public void c(a... aVarArr) {
        this.a.b();
        this.a.c();
        try {
            this.c.j(aVarArr);
            this.a.x();
        } finally {
            this.a.i();
        }
    }

    public void d() {
        this.a.b();
        e.s.a.f a2 = this.f7515e.a();
        this.a.c();
        try {
            a2.executeUpdateDelete();
            this.a.x();
        } finally {
            this.a.i();
            this.f7515e.f(a2);
        }
    }

    public LiveData<Integer> e() {
        return this.a.l().d(new String[]{"info"}, false, new f(o.h("SELECT count(*) FROM info WHERE read=0", 0)));
    }

    public LiveData<List<a>> getAll() {
        return this.a.l().d(new String[]{"info"}, false, new e(o.h("SELECT * FROM info ORDER BY ts DESC", 0)));
    }
}
