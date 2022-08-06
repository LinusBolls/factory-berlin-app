package com.sensorberg.booking.mybookings.storage.db;

import android.database.Cursor;
import androidx.room.l;
import androidx.room.o;
import androidx.room.s;
import e.p.d;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.x;

/* compiled from: BookingDao_Impl */
public final class d implements c {
    /* access modifiers changed from: private */
    public final l a;
    /* access modifiers changed from: private */
    public final androidx.room.e<com.sensorberg.booking.mybookings.d> b;
    /* access modifiers changed from: private */
    public final androidx.room.d<com.sensorberg.booking.mybookings.d> c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final s f4918d;

    /* compiled from: BookingDao_Impl */
    class a extends androidx.room.e<com.sensorberg.booking.mybookings.d> {
        a(d dVar, l lVar) {
            super(lVar);
        }

        public String d() {
            return "INSERT OR REPLACE INTO `bookings` (`id`,`room`,`displayTime`,`startTimeInMillis`,`unitId`,`nextPageKey`) VALUES (?,?,?,?,?,?)";
        }

        /* renamed from: l */
        public void g(e.s.a.f fVar, com.sensorberg.booking.mybookings.d dVar) {
            if (dVar.b() == null) {
                fVar.bindNull(1);
            } else {
                fVar.bindString(1, dVar.b());
            }
            if (dVar.d() == null) {
                fVar.bindNull(2);
            } else {
                fVar.bindString(2, dVar.d());
            }
            if (dVar.a() == null) {
                fVar.bindNull(3);
            } else {
                fVar.bindString(3, dVar.a());
            }
            fVar.bindLong(4, dVar.e());
            if (dVar.f() == null) {
                fVar.bindNull(5);
            } else {
                fVar.bindString(5, dVar.f());
            }
            if (dVar.c() == null) {
                fVar.bindNull(6);
            } else {
                fVar.bindString(6, dVar.c());
            }
        }
    }

    /* compiled from: BookingDao_Impl */
    class b extends androidx.room.d<com.sensorberg.booking.mybookings.d> {
        b(d dVar, l lVar) {
            super(lVar);
        }

        public String d() {
            return "DELETE FROM `bookings` WHERE `id` = ?";
        }

        /* renamed from: k */
        public void g(e.s.a.f fVar, com.sensorberg.booking.mybookings.d dVar) {
            if (dVar.b() == null) {
                fVar.bindNull(1);
            } else {
                fVar.bindString(1, dVar.b());
            }
        }
    }

    /* compiled from: BookingDao_Impl */
    class c extends s {
        c(d dVar, l lVar) {
            super(lVar);
        }

        public String d() {
            return "DELETE FROM bookings";
        }
    }

    /* renamed from: com.sensorberg.booking.mybookings.storage.db.d$d  reason: collision with other inner class name */
    /* compiled from: BookingDao_Impl */
    class C0147d implements Callable<x> {
        final /* synthetic */ List a;

        C0147d(List list) {
            this.a = list;
        }

        /* renamed from: a */
        public x call() {
            d.this.a.c();
            try {
                d.this.b.h(this.a);
                d.this.a.x();
                return x.a;
            } finally {
                d.this.a.i();
            }
        }
    }

    /* compiled from: BookingDao_Impl */
    class e implements Callable<x> {
        final /* synthetic */ com.sensorberg.booking.mybookings.d a;

        e(com.sensorberg.booking.mybookings.d dVar) {
            this.a = dVar;
        }

        /* renamed from: a */
        public x call() {
            d.this.a.c();
            try {
                d.this.b.i(this.a);
                d.this.a.x();
                return x.a;
            } finally {
                d.this.a.i();
            }
        }
    }

    /* compiled from: BookingDao_Impl */
    class f implements Callable<x> {
        final /* synthetic */ com.sensorberg.booking.mybookings.d a;

        f(com.sensorberg.booking.mybookings.d dVar) {
            this.a = dVar;
        }

        /* renamed from: a */
        public x call() {
            d.this.a.c();
            try {
                d.this.c.h(this.a);
                d.this.a.x();
                return x.a;
            } finally {
                d.this.a.i();
            }
        }
    }

    /* compiled from: BookingDao_Impl */
    class g implements Callable<x> {
        g() {
        }

        /* renamed from: a */
        public x call() {
            e.s.a.f a2 = d.this.f4918d.a();
            d.this.a.c();
            try {
                a2.executeUpdateDelete();
                d.this.a.x();
                return x.a;
            } finally {
                d.this.a.i();
                d.this.f4918d.f(a2);
            }
        }
    }

    /* compiled from: BookingDao_Impl */
    class h extends d.a<Integer, com.sensorberg.booking.mybookings.d> {
        final /* synthetic */ o a;

        /* compiled from: BookingDao_Impl */
        class a extends androidx.room.w.a<com.sensorberg.booking.mybookings.d> {
            a(h hVar, l lVar, o oVar, boolean z, String... strArr) {
                super(lVar, oVar, z, strArr);
            }

            /* access modifiers changed from: protected */
            public List<com.sensorberg.booking.mybookings.d> n(Cursor cursor) {
                Cursor cursor2 = cursor;
                int b = androidx.room.x.b.b(cursor2, "id");
                int b2 = androidx.room.x.b.b(cursor2, "room");
                int b3 = androidx.room.x.b.b(cursor2, "displayTime");
                int b4 = androidx.room.x.b.b(cursor2, "startTimeInMillis");
                int b5 = androidx.room.x.b.b(cursor2, "unitId");
                int b6 = androidx.room.x.b.b(cursor2, "nextPageKey");
                ArrayList arrayList = new ArrayList(cursor.getCount());
                while (cursor.moveToNext()) {
                    arrayList.add(new com.sensorberg.booking.mybookings.d(cursor2.getString(b), cursor2.getString(b2), cursor2.getString(b3), cursor2.getLong(b4), cursor2.getString(b5), cursor2.getString(b6)));
                }
                return arrayList;
            }
        }

        h(o oVar) {
            this.a = oVar;
        }

        /* renamed from: b */
        public androidx.room.w.a<com.sensorberg.booking.mybookings.d> a() {
            return new a(this, d.this.a, this.a, false, "bookings");
        }
    }

    public d(l lVar) {
        this.a = lVar;
        this.b = new a(this, lVar);
        this.c = new b(this, lVar);
        this.f4918d = new c(this, lVar);
    }

    public Object a(List<com.sensorberg.booking.mybookings.d> list, kotlin.c0.d<? super x> dVar) {
        return androidx.room.a.a(this.a, true, new C0147d(list), dVar);
    }

    public Object b(com.sensorberg.booking.mybookings.d dVar, kotlin.c0.d<? super x> dVar2) {
        return androidx.room.a.a(this.a, true, new f(dVar), dVar2);
    }

    public Object c(kotlin.c0.d<? super x> dVar) {
        return androidx.room.a.a(this.a, true, new g(), dVar);
    }

    public Object d(com.sensorberg.booking.mybookings.d dVar, kotlin.c0.d<? super x> dVar2) {
        return androidx.room.a.a(this.a, true, new e(dVar), dVar2);
    }

    public d.a<Integer, com.sensorberg.booking.mybookings.d> getAll() {
        return new h(o.h("SELECT * FROM bookings", 0));
    }
}
