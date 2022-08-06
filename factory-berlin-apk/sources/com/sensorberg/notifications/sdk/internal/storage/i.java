package com.sensorberg.notifications.sdk.internal.storage;

import kotlin.e;
import kotlin.h0.f;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.v;

/* compiled from: DatabaseMigrations.kt */
public final class i {
    static final /* synthetic */ f[] a;
    private static final e b = g.a(b.f5398h);
    private static final e c = g.a(a.f5397h);

    /* renamed from: d  reason: collision with root package name */
    public static final i f5396d = new i();

    /* compiled from: DatabaseMigrations.kt */
    static final class a extends l implements kotlin.e0.c.a<C0175a> {

        /* renamed from: h  reason: collision with root package name */
        public static final a f5397h = new a();

        /* renamed from: com.sensorberg.notifications.sdk.internal.storage.i$a$a  reason: collision with other inner class name */
        /* compiled from: DatabaseMigrations.kt */
        public static final class C0175a extends androidx.room.v.a {
            C0175a(int i2, int i3) {
                super(i2, i3);
            }

            public void a(e.s.a.b bVar) {
                k.f(bVar, "database");
                bVar.execSQL("CREATE TABLE IF NOT EXISTS `table_beacons_registration` (`id` TEXT NOT NULL, `proximityUuid` TEXT NOT NULL, `major` INTEGER NOT NULL, `minor` INTEGER NOT NULL, `type` INTEGER NOT NULL, PRIMARY KEY(`id`))");
                bVar.execSQL("CREATE TABLE IF NOT EXISTS `table_delayed_actions` (`actionId` TEXT NOT NULL, `instanceId` TEXT NOT NULL, `subject` TEXT, `body` TEXT, `url` TEXT, `payload` TEXT, `backendMeta` TEXT, `triggerBackendMeta` TEXT, PRIMARY KEY(`instanceId`))");
            }
        }

        a() {
            super(0);
        }

        /* renamed from: a */
        public final C0175a d() {
            return new C0175a(1, 2);
        }
    }

    /* compiled from: DatabaseMigrations.kt */
    static final class b extends l implements kotlin.e0.c.a<androidx.room.v.a[]> {

        /* renamed from: h  reason: collision with root package name */
        public static final b f5398h = new b();

        b() {
            super(0);
        }

        /* renamed from: a */
        public final androidx.room.v.a[] d() {
            return new androidx.room.v.a[]{i.f5396d.a()};
        }
    }

    static {
        Class<i> cls = i.class;
        o oVar = new o(v.b(cls), "migrations", "getMigrations$notifications_release()[Landroidx/room/migration/Migration;");
        v.d(oVar);
        o oVar2 = new o(v.b(cls), "migration1to2", "getMigration1to2$notifications_release()Landroidx/room/migration/Migration;");
        v.d(oVar2);
        a = new f[]{oVar, oVar2};
    }

    private i() {
    }

    public final androidx.room.v.a a() {
        e eVar = c;
        f fVar = a[1];
        return (androidx.room.v.a) eVar.getValue();
    }

    public final androidx.room.v.a[] b() {
        e eVar = b;
        f fVar = a[0];
        return (androidx.room.v.a[]) eVar.getValue();
    }
}
