package com.sensorberg.smartspaces.myrenz.storage;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.e;
import androidx.room.l;
import androidx.room.o;
import e.s.a.f;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.x;

/* compiled from: MyRenzDao_Impl */
public final class b implements a {
    /* access modifiers changed from: private */
    public final l a;
    /* access modifiers changed from: private */
    public final e<c> b;

    /* compiled from: MyRenzDao_Impl */
    class a extends e<c> {
        a(b bVar, l lVar) {
            super(lVar);
        }

        public String d() {
            return "INSERT OR IGNORE INTO `pka_table` (`macAddress`,`pkaId`) VALUES (?,?)";
        }

        /* renamed from: l */
        public void g(f fVar, c cVar) {
            if (cVar.a() == null) {
                fVar.bindNull(1);
            } else {
                fVar.bindString(1, cVar.a());
            }
            if (cVar.b() == null) {
                fVar.bindNull(2);
            } else {
                fVar.bindString(2, cVar.b());
            }
        }
    }

    /* renamed from: com.sensorberg.smartspaces.myrenz.storage.b$b  reason: collision with other inner class name */
    /* compiled from: MyRenzDao_Impl */
    class C0355b implements Callable<x> {
        final /* synthetic */ c a;

        C0355b(c cVar) {
            this.a = cVar;
        }

        /* renamed from: a */
        public x call() {
            b.this.a.c();
            try {
                b.this.b.i(this.a);
                b.this.a.x();
                return x.a;
            } finally {
                b.this.a.i();
            }
        }
    }

    /* compiled from: MyRenzDao_Impl */
    class c implements Callable<List<c>> {
        final /* synthetic */ o a;

        c(o oVar) {
            this.a = oVar;
        }

        /* renamed from: a */
        public List<c> call() {
            Cursor c = androidx.room.x.c.c(b.this.a, this.a, false, (CancellationSignal) null);
            try {
                int b2 = androidx.room.x.b.b(c, "macAddress");
                int b3 = androidx.room.x.b.b(c, "pkaId");
                ArrayList arrayList = new ArrayList(c.getCount());
                while (c.moveToNext()) {
                    arrayList.add(new c(c.getString(b2), c.getString(b3)));
                }
                return arrayList;
            } finally {
                c.close();
                this.a.n();
            }
        }
    }

    /* compiled from: MyRenzDao_Impl */
    class d implements Callable<List<c>> {
        final /* synthetic */ o a;

        d(o oVar) {
            this.a = oVar;
        }

        /* renamed from: a */
        public List<c> call() {
            Cursor c = androidx.room.x.c.c(b.this.a, this.a, false, (CancellationSignal) null);
            try {
                int b2 = androidx.room.x.b.b(c, "macAddress");
                int b3 = androidx.room.x.b.b(c, "pkaId");
                ArrayList arrayList = new ArrayList(c.getCount());
                while (c.moveToNext()) {
                    arrayList.add(new c(c.getString(b2), c.getString(b3)));
                }
                return arrayList;
            } finally {
                c.close();
                this.a.n();
            }
        }
    }

    public b(l lVar) {
        this.a = lVar;
        this.b = new a(this, lVar);
    }

    public Object a(c cVar, kotlin.c0.d<? super x> dVar) {
        return androidx.room.a.a(this.a, true, new C0355b(cVar), dVar);
    }

    public Object b(String str, kotlin.c0.d<? super List<c>> dVar) {
        o h2 = o.h("SELECT * FROM pka_table WHERE macAddress = ?", 1);
        if (str == null) {
            h2.bindNull(1);
        } else {
            h2.bindString(1, str);
        }
        return androidx.room.a.a(this.a, false, new c(h2), dVar);
    }

    public Object c(String str, kotlin.c0.d<? super List<c>> dVar) {
        o h2 = o.h("SELECT * FROM pka_table WHERE pkaId = ?", 1);
        if (str == null) {
            h2.bindNull(1);
        } else {
            h2.bindString(1, str);
        }
        return androidx.room.a.a(this.a, false, new d(h2), dVar);
    }
}
