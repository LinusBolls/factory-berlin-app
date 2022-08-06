package com.sensorberg.encryptor;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.i;
import androidx.room.l;
import androidx.room.o;
import androidx.room.s;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: EncryptorDao_Impl */
public final class f implements e {
    /* access modifiers changed from: private */
    public final l a;
    private final androidx.room.e b;
    private final androidx.room.e c;

    /* renamed from: d  reason: collision with root package name */
    private final s f5079d;

    /* compiled from: EncryptorDao_Impl */
    class a extends androidx.room.e<c> {
        a(f fVar, l lVar) {
            super(lVar);
        }

        public String d() {
            return "INSERT OR REPLACE INTO `encrypted_messages`(`alias`,`data`,`iv`) VALUES (?,?,?)";
        }

        /* renamed from: l */
        public void g(e.s.a.f fVar, c cVar) {
            if (cVar.a() == null) {
                fVar.bindNull(1);
            } else {
                fVar.bindString(1, cVar.a());
            }
            if (cVar.c() == null) {
                fVar.bindNull(2);
            } else {
                fVar.bindString(2, cVar.c());
            }
            if (cVar.d() == null) {
                fVar.bindNull(3);
            } else {
                fVar.bindString(3, cVar.d());
            }
        }
    }

    /* compiled from: EncryptorDao_Impl */
    class b extends androidx.room.e<c> {
        b(f fVar, l lVar) {
            super(lVar);
        }

        public String d() {
            return "INSERT OR ABORT INTO `encrypted_messages`(`alias`,`data`,`iv`) VALUES (?,?,?)";
        }

        /* renamed from: l */
        public void g(e.s.a.f fVar, c cVar) {
            if (cVar.a() == null) {
                fVar.bindNull(1);
            } else {
                fVar.bindString(1, cVar.a());
            }
            if (cVar.c() == null) {
                fVar.bindNull(2);
            } else {
                fVar.bindString(2, cVar.c());
            }
            if (cVar.d() == null) {
                fVar.bindNull(3);
            } else {
                fVar.bindString(3, cVar.d());
            }
        }
    }

    /* compiled from: EncryptorDao_Impl */
    class c extends s {
        c(f fVar, l lVar) {
            super(lVar);
        }

        public String d() {
            return "DELETE FROM encrypted_messages WHERE alias = ?";
        }
    }

    /* compiled from: EncryptorDao_Impl */
    class d extends s {
        d(f fVar, l lVar) {
            super(lVar);
        }

        public String d() {
            return "DELETE FROM encrypted_messages WHERE alias != ?";
        }
    }

    /* compiled from: EncryptorDao_Impl */
    class e extends androidx.lifecycle.e<c> {

        /* renamed from: g  reason: collision with root package name */
        private i.c f5080g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ o f5081h;

        /* compiled from: EncryptorDao_Impl */
        class a extends i.c {
            a(String str, String... strArr) {
                super(str, strArr);
            }

            public void b(Set<String> set) {
                e.this.c();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(Executor executor, o oVar) {
            super(executor);
            this.f5081h = oVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public c a() {
            if (this.f5080g == null) {
                this.f5080g = new a("encrypted_messages", new String[0]);
                f.this.a.l().b(this.f5080g);
            }
            Cursor u = f.this.a.u(this.f5081h);
            try {
                return u.moveToFirst() ? new c(u.getString(u.getColumnIndexOrThrow("alias")), u.getString(u.getColumnIndexOrThrow("data")), u.getString(u.getColumnIndexOrThrow("iv"))) : null;
            } finally {
                u.close();
            }
        }

        /* access modifiers changed from: protected */
        public void finalize() {
            this.f5081h.n();
        }
    }

    public f(l lVar) {
        this.a = lVar;
        this.b = new a(this, lVar);
        this.c = new b(this, lVar);
        this.f5079d = new c(this, lVar);
        new d(this, lVar);
    }

    public c a(String str) {
        o h2 = o.h("SELECT * FROM encrypted_messages WHERE alias = ?", 1);
        if (str == null) {
            h2.bindNull(1);
        } else {
            h2.bindString(1, str);
        }
        Cursor u = this.a.u(h2);
        try {
            return u.moveToFirst() ? new c(u.getString(u.getColumnIndexOrThrow("alias")), u.getString(u.getColumnIndexOrThrow("data")), u.getString(u.getColumnIndexOrThrow("iv"))) : null;
        } finally {
            u.close();
            h2.n();
        }
    }

    public void b(c cVar) {
        this.a.c();
        try {
            this.b.i(cVar);
            this.a.x();
        } finally {
            this.a.i();
        }
    }

    public List<c> c() {
        o h2 = o.h("SELECT * from encrypted_messages", 0);
        Cursor u = this.a.u(h2);
        try {
            int columnIndexOrThrow = u.getColumnIndexOrThrow("alias");
            int columnIndexOrThrow2 = u.getColumnIndexOrThrow("data");
            int columnIndexOrThrow3 = u.getColumnIndexOrThrow("iv");
            ArrayList arrayList = new ArrayList(u.getCount());
            while (u.moveToNext()) {
                arrayList.add(new c(u.getString(columnIndexOrThrow), u.getString(columnIndexOrThrow2), u.getString(columnIndexOrThrow3)));
            }
            return arrayList;
        } finally {
            u.close();
            h2.n();
        }
    }

    public void d(List<c> list) {
        this.a.c();
        try {
            this.c.h(list);
            this.a.x();
        } finally {
            this.a.i();
        }
    }

    public LiveData<c> e(String str) {
        o h2 = o.h("SELECT * FROM encrypted_messages WHERE alias = ?", 1);
        if (str == null) {
            h2.bindNull(1);
        } else {
            h2.bindString(1, str);
        }
        return new e(this.a.n(), h2).b();
    }

    public void f(String str) {
        e.s.a.f a2 = this.f5079d.a();
        this.a.c();
        if (str == null) {
            try {
                a2.bindNull(1);
            } catch (Throwable th) {
                this.a.i();
                this.f5079d.f(a2);
                throw th;
            }
        } else {
            a2.bindString(1, str);
        }
        a2.executeUpdateDelete();
        this.a.x();
        this.a.i();
        this.f5079d.f(a2);
    }
}
