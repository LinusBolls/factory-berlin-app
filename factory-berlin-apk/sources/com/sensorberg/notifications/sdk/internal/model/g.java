package com.sensorberg.notifications.sdk.internal.model;

import com.sensorberg.notifications.sdk.internal.model.Trigger;
import java.util.UUID;
import kotlin.jvm.internal.k;

/* compiled from: BeaconProcessingModel.kt */
public final class g {

    /* renamed from: f  reason: collision with root package name */
    public static final a f5283f = new a((DefaultConstructorMarker) null);
    private final String a;
    private final UUID b;
    private final short c;

    /* renamed from: d  reason: collision with root package name */
    private final short f5284d;

    /* renamed from: e  reason: collision with root package name */
    private final Trigger.b f5285e;

    /* compiled from: BeaconProcessingModel.kt */
    public static final class a {
        private a() {
        }

        public final g a(Trigger.Beacon beacon) {
            k.f(beacon, "beacon");
            return new g(beacon.a(), beacon.d(), beacon.b(), beacon.c(), beacon.e());
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public g(String str, UUID uuid, short s, short s2, Trigger.b bVar) {
        k.f(str, "id");
        k.f(uuid, "proximityUuid");
        k.f(bVar, "type");
        this.a = str;
        this.b = uuid;
        this.c = s;
        this.f5284d = s2;
        this.f5285e = bVar;
    }

    public final String a() {
        return this.a;
    }

    public final short b() {
        return this.c;
    }

    public final short c() {
        return this.f5284d;
    }

    public final UUID d() {
        return this.b;
    }

    public final Trigger.b e() {
        return this.f5285e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return k.a(this.a, gVar.a) && k.a(this.b, gVar.b) && this.c == gVar.c && this.f5284d == gVar.f5284d && k.a(this.f5285e, gVar.f5285e);
    }

    public int hashCode() {
        String str = this.a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        UUID uuid = this.b;
        int hashCode2 = (((((hashCode + (uuid != null ? uuid.hashCode() : 0)) * 31) + this.c) * 31) + this.f5284d) * 31;
        Trigger.b bVar = this.f5285e;
        if (bVar != null) {
            i2 = bVar.hashCode();
        }
        return hashCode2 + i2;
    }

    public String toString() {
        return "BeaconStorage(id=" + this.a + ", proximityUuid=" + this.b + ", major=" + this.c + ", minor=" + this.f5284d + ", type=" + this.f5285e + ")";
    }
}
