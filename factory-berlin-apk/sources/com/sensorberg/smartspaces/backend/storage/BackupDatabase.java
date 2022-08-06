package com.sensorberg.smartspaces.backend.storage;

import androidx.room.l;
import kotlin.i;
import kotlin.jvm.internal.k;

@i(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/sensorberg/smartspaces/backend/storage/BackupDatabase;", "Landroidx/room/l;", "Lcom/sensorberg/smartspaces/backend/storage/ActuatorRequestDao;", "actuatorRequestDao", "()Lcom/sensorberg/smartspaces/backend/storage/ActuatorRequestDao;", "Lcom/sensorberg/smartspaces/backend/storage/StatisticsDao;", "userDeviceStatisticsDao", "()Lcom/sensorberg/smartspaces/backend/storage/StatisticsDao;", "<init>", "()V", "Companion", "backend_release"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
/* compiled from: BackupDatabase.kt */
public abstract class BackupDatabase extends l {
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public static final androidx.room.v.a f6153l = new a(1, 2);

    /* renamed from: m  reason: collision with root package name */
    public static final b f6154m = new b((DefaultConstructorMarker) null);

    /* compiled from: BackupDatabase.kt */
    public static final class a extends androidx.room.v.a {
        a(int i2, int i3) {
            super(i2, i3);
        }

        public void a(e.s.a.b bVar) {
            k.e(bVar, "database");
            bVar.execSQL("CREATE TABLE IF NOT EXISTS `statistics` (`id` TEXT, `finished` INTEGER NOT NULL, `started` INTEGER NOT NULL, `requestId` TEXT NOT NULL, `triggerStart` TEXT NOT NULL, `connectionType` TEXT, `triggerFound` TEXT, `retryNumber` INTEGER NOT NULL, `timeSearching` INTEGER, `timeConnecting` INTEGER NOT NULL, `timeWriting` INTEGER, `timeWaiting` INTEGER NOT NULL, `calibratedThreshold` REAL, PRIMARY KEY(`requestId`))");
        }
    }

    /* compiled from: BackupDatabase.kt */
    public static final class b {
        private b() {
        }

        public final androidx.room.v.a a() {
            return BackupDatabase.f6153l;
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public abstract c A();

    public abstract a z();
}
