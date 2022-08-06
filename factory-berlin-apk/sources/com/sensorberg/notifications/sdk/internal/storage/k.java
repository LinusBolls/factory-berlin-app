package com.sensorberg.notifications.sdk.internal.storage;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.d;
import androidx.room.e;
import androidx.room.l;
import androidx.room.o;
import androidx.room.x.c;
import com.sensorberg.notifications.sdk.internal.model.h;
import e.s.a.f;

/* compiled from: DelayedActionDao_Impl */
public final class k extends j {
    private final l a;
    private final e<h> b;
    private final d<h> c;

    /* compiled from: DelayedActionDao_Impl */
    class a extends e<h> {
        a(k kVar, l lVar) {
            super(lVar);
        }

        public String d() {
            return "INSERT OR REPLACE INTO `table_delayed_actions` (`actionId`,`instanceId`,`subject`,`body`,`url`,`payload`,`backendMeta`,`triggerBackendMeta`) VALUES (?,?,?,?,?,?,?,?)";
        }

        /* renamed from: l */
        public void g(f fVar, h hVar) {
            if (hVar.a() == null) {
                fVar.bindNull(1);
            } else {
                fVar.bindString(1, hVar.a());
            }
            if (hVar.d() == null) {
                fVar.bindNull(2);
            } else {
                fVar.bindString(2, hVar.d());
            }
            if (hVar.f() == null) {
                fVar.bindNull(3);
            } else {
                fVar.bindString(3, hVar.f());
            }
            if (hVar.c() == null) {
                fVar.bindNull(4);
            } else {
                fVar.bindString(4, hVar.c());
            }
            if (hVar.h() == null) {
                fVar.bindNull(5);
            } else {
                fVar.bindString(5, hVar.h());
            }
            if (hVar.e() == null) {
                fVar.bindNull(6);
            } else {
                fVar.bindString(6, hVar.e());
            }
            if (hVar.b() == null) {
                fVar.bindNull(7);
            } else {
                fVar.bindString(7, hVar.b());
            }
            if (hVar.g() == null) {
                fVar.bindNull(8);
            } else {
                fVar.bindString(8, hVar.g());
            }
        }
    }

    /* compiled from: DelayedActionDao_Impl */
    class b extends d<h> {
        b(k kVar, l lVar) {
            super(lVar);
        }

        public String d() {
            return "DELETE FROM `table_delayed_actions` WHERE `instanceId` = ?";
        }

        /* renamed from: k */
        public void g(f fVar, h hVar) {
            if (hVar.d() == null) {
                fVar.bindNull(1);
            } else {
                fVar.bindString(1, hVar.d());
            }
        }
    }

    public k(l lVar) {
        this.a = lVar;
        this.b = new a(this, lVar);
        this.c = new b(this, lVar);
    }

    public void a(h hVar) {
        this.a.b();
        this.a.c();
        try {
            this.c.h(hVar);
            this.a.x();
        } finally {
            this.a.i();
        }
    }

    public h b(String str) {
        String str2 = str;
        o h2 = o.h("SELECT * FROM table_delayed_actions WHERE instanceId = ?", 1);
        if (str2 == null) {
            h2.bindNull(1);
        } else {
            h2.bindString(1, str2);
        }
        this.a.b();
        h hVar = null;
        Cursor c2 = c.c(this.a, h2, false, (CancellationSignal) null);
        try {
            int b2 = androidx.room.x.b.b(c2, "actionId");
            int b3 = androidx.room.x.b.b(c2, "instanceId");
            int b4 = androidx.room.x.b.b(c2, "subject");
            int b5 = androidx.room.x.b.b(c2, "body");
            int b6 = androidx.room.x.b.b(c2, "url");
            int b7 = androidx.room.x.b.b(c2, "payload");
            int b8 = androidx.room.x.b.b(c2, "backendMeta");
            int b9 = androidx.room.x.b.b(c2, "triggerBackendMeta");
            if (c2.moveToFirst()) {
                hVar = new h(c2.getString(b2), c2.getString(b3), c2.getString(b4), c2.getString(b5), c2.getString(b6), c2.getString(b7), c2.getString(b8), c2.getString(b9));
            }
            return hVar;
        } finally {
            c2.close();
            h2.n();
        }
    }

    public void c(h hVar) {
        this.a.b();
        this.a.c();
        try {
            this.b.i(hVar);
            this.a.x();
        } finally {
            this.a.i();
        }
    }
}
