package com.sensorberg.notifications.sdk.internal.model;

import com.google.android.gms.nearby.messages.c;
import com.sensorberg.notifications.sdk.internal.model.Trigger;
import java.util.UUID;
import kotlin.jvm.internal.k;

/* compiled from: BeaconProcessingModel.kt */
public final class f {

    /* renamed from: g  reason: collision with root package name */
    public static final a f5279g = new a((DefaultConstructorMarker) null);
    private final String a;
    private final long b;
    private final UUID c;

    /* renamed from: d  reason: collision with root package name */
    private final short f5280d;

    /* renamed from: e  reason: collision with root package name */
    private final short f5281e;

    /* renamed from: f  reason: collision with root package name */
    private final Trigger.b f5282f;

    /* compiled from: BeaconProcessingModel.kt */
    public static final class a {
        private a() {
        }

        public final f a(c cVar, long j2, Trigger.b bVar) {
            k.f(cVar, "b");
            k.f(bVar, "type");
            String b = f.f5279g.b(cVar);
            UUID d2 = cVar.d();
            k.b(d2, "b.proximityUuid");
            return new f(b, j2, d2, cVar.b(), cVar.c(), bVar);
        }

        public final String b(c cVar) {
            k.f(cVar, "b");
            return '(' + cVar.d() + ")(" + cVar.b() + ")(" + cVar.c() + ')';
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public f(String str, long j2, UUID uuid, short s, short s2, Trigger.b bVar) {
        k.f(str, "beaconKey");
        k.f(uuid, "proximityUuid");
        k.f(bVar, "type");
        this.a = str;
        this.b = j2;
        this.c = uuid;
        this.f5280d = s;
        this.f5281e = s2;
        this.f5282f = bVar;
    }

    public static /* synthetic */ f b(f fVar, String str, long j2, UUID uuid, short s, short s2, Trigger.b bVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = fVar.a;
        }
        if ((i2 & 2) != 0) {
            j2 = fVar.b;
        }
        long j3 = j2;
        if ((i2 & 4) != 0) {
            uuid = fVar.c;
        }
        UUID uuid2 = uuid;
        if ((i2 & 8) != 0) {
            s = fVar.f5280d;
        }
        short s3 = s;
        if ((i2 & 16) != 0) {
            s2 = fVar.f5281e;
        }
        short s4 = s2;
        if ((i2 & 32) != 0) {
            bVar = fVar.f5282f;
        }
        return fVar.a(str, j3, uuid2, s3, s4, bVar);
    }

    public final f a(String str, long j2, UUID uuid, short s, short s2, Trigger.b bVar) {
        k.f(str, "beaconKey");
        k.f(uuid, "proximityUuid");
        Trigger.b bVar2 = bVar;
        k.f(bVar2, "type");
        return new f(str, j2, uuid, s, s2, bVar2);
    }

    public final String c() {
        return this.a;
    }

    public final short d() {
        return this.f5280d;
    }

    public final short e() {
        return this.f5281e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return k.a(this.a, fVar.a) && this.b == fVar.b && k.a(this.c, fVar.c) && this.f5280d == fVar.f5280d && this.f5281e == fVar.f5281e && k.a(this.f5282f, fVar.f5282f);
    }

    public final UUID f() {
        return this.c;
    }

    public final long g() {
        return this.b;
    }

    public final Trigger.b h() {
        return this.f5282f;
    }

    public int hashCode() {
        String str = this.a;
        int i2 = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        long j2 = this.b;
        int i3 = ((hashCode * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        UUID uuid = this.c;
        int hashCode2 = (((((i3 + (uuid != null ? uuid.hashCode() : 0)) * 31) + this.f5280d) * 31) + this.f5281e) * 31;
        Trigger.b bVar = this.f5282f;
        if (bVar != null) {
            i2 = bVar.hashCode();
        }
        return hashCode2 + i2;
    }

    public String toString() {
        return "BeaconEvent(beaconKey=" + this.a + ", timestamp=" + this.b + ", proximityUuid=" + this.c + ", major=" + this.f5280d + ", minor=" + this.f5281e + ", type=" + this.f5282f + ")";
    }
}
