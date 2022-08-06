package com.sensorberg.notifications.sdk.internal.model;

import com.squareup.moshi.e;
import java.util.UUID;
import kotlin.i;
import kotlin.jvm.internal.k;

@i(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000:\u0003\n\u000b\fB\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u0002\u001a\u00020\u0001H&¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0007\u001a\u00020\u00048&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0001\u0002\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/sensorberg/notifications/sdk/internal/model/Trigger;", "", "getTriggerId", "()Ljava/lang/String;", "Lcom/sensorberg/notifications/sdk/internal/model/Trigger$Type;", "getType", "()Lcom/sensorberg/notifications/sdk/internal/model/Trigger$Type;", "type", "<init>", "()V", "Beacon", "Geofence", "Type", "Lcom/sensorberg/notifications/sdk/internal/model/Trigger$Beacon;", "Lcom/sensorberg/notifications/sdk/internal/model/Trigger$Geofence;", "notifications_release"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
/* compiled from: Trigger.kt */
public abstract class Trigger {

    @e(generateAdapter = true)
    @i(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\b\u0018\u0000 '2\u00020\u0001:\u0001'B'\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b%\u0010&J\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\b\u0010\u0007J\u0010\u0010\n\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ8\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0019R\u0019\u0010\r\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u001e\u001a\u0004\b\u001f\u0010\u0007R\u0019\u0010\u000e\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001e\u001a\u0004\b \u0010\u0007R\u0019\u0010\f\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010!\u001a\u0004\b\"\u0010\u0004R\u001c\u0010\u000f\u001a\u00020\t8\u0016@\u0016X\u0004¢\u0006\f\n\u0004\b\u000f\u0010#\u001a\u0004\b$\u0010\u000b¨\u0006("}, d2 = {"Lcom/sensorberg/notifications/sdk/internal/model/Trigger$Beacon;", "Lcom/sensorberg/notifications/sdk/internal/model/Trigger;", "Ljava/util/UUID;", "component1", "()Ljava/util/UUID;", "", "component2", "()S", "component3", "Lcom/sensorberg/notifications/sdk/internal/model/Trigger$Type;", "component4", "()Lcom/sensorberg/notifications/sdk/internal/model/Trigger$Type;", "proximityUuid", "major", "minor", "type", "copy", "(Ljava/util/UUID;SSLcom/sensorberg/notifications/sdk/internal/model/Trigger$Type;)Lcom/sensorberg/notifications/sdk/internal/model/Trigger$Beacon;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "getTriggerId", "()Ljava/lang/String;", "", "hashCode", "()I", "toString", "S", "getMajor", "getMinor", "Ljava/util/UUID;", "getProximityUuid", "Lcom/sensorberg/notifications/sdk/internal/model/Trigger$Type;", "getType", "<init>", "(Ljava/util/UUID;SSLcom/sensorberg/notifications/sdk/internal/model/Trigger$Type;)V", "Companion", "notifications_release"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
    /* compiled from: Trigger.kt */
    public static final class Beacon extends Trigger {

        /* renamed from: e  reason: collision with root package name */
        public static final a f5240e = new a((DefaultConstructorMarker) null);
        private final UUID a;
        private final short b;
        private final short c;

        /* renamed from: d  reason: collision with root package name */
        private final b f5241d;

        /* compiled from: Trigger.kt */
        public static final class a {
            private a() {
            }

            public final String a(UUID uuid, short s, short s2, b bVar) {
                k.f(uuid, "proximityUuid");
                k.f(bVar, "type");
                return "beacon(" + uuid + ")(" + s + ")(" + s2 + ')';
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Beacon(UUID uuid, short s, short s2, b bVar) {
            super((DefaultConstructorMarker) null);
            k.f(uuid, "proximityUuid");
            k.f(bVar, "type");
            this.a = uuid;
            this.b = s;
            this.c = s2;
            this.f5241d = bVar;
        }

        public String a() {
            return f5240e.a(this.a, this.b, this.c, e());
        }

        public final short b() {
            return this.b;
        }

        public final short c() {
            return this.c;
        }

        public final UUID d() {
            return this.a;
        }

        public b e() {
            return this.f5241d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Beacon)) {
                return false;
            }
            Beacon beacon = (Beacon) obj;
            return k.a(this.a, beacon.a) && this.b == beacon.b && this.c == beacon.c && k.a(e(), beacon.e());
        }

        public int hashCode() {
            UUID uuid = this.a;
            int i2 = 0;
            int hashCode = (((((uuid != null ? uuid.hashCode() : 0) * 31) + this.b) * 31) + this.c) * 31;
            b e2 = e();
            if (e2 != null) {
                i2 = e2.hashCode();
            }
            return hashCode + i2;
        }

        public String toString() {
            return "Beacon(proximityUuid=" + this.a + ", major=" + this.b + ", minor=" + this.c + ", type=" + e() + ")";
        }
    }

    /* compiled from: Trigger.kt */
    public static final class a extends Trigger {

        /* renamed from: e  reason: collision with root package name */
        public static final C0171a f5242e = new C0171a((DefaultConstructorMarker) null);
        private final double a;
        private final double b;
        private final float c;

        /* renamed from: d  reason: collision with root package name */
        private final b f5243d;

        /* renamed from: com.sensorberg.notifications.sdk.internal.model.Trigger$a$a  reason: collision with other inner class name */
        /* compiled from: Trigger.kt */
        public static final class C0171a {
            private C0171a() {
            }

            public final String a(double d2, double d3, float f2, b bVar) {
                k.f(bVar, "type");
                return "geofence(" + Double.doubleToRawLongBits(d2) + ")(" + Double.doubleToRawLongBits(d3) + ")(" + Float.floatToRawIntBits(f2) + ")(" + bVar.name() + ')';
            }

            public /* synthetic */ C0171a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(double d2, double d3, float f2, b bVar) {
            super((DefaultConstructorMarker) null);
            k.f(bVar, "type");
            this.a = d2;
            this.b = d3;
            this.c = f2;
            this.f5243d = bVar;
        }

        public String a() {
            return f5242e.a(this.a, this.b, this.c, e());
        }

        public final double b() {
            return this.a;
        }

        public final double c() {
            return this.b;
        }

        public final float d() {
            return this.c;
        }

        public b e() {
            return this.f5243d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Double.compare(this.a, aVar.a) == 0 && Double.compare(this.b, aVar.b) == 0 && Float.compare(this.c, aVar.c) == 0 && k.a(e(), aVar.e());
        }

        public int hashCode() {
            long doubleToLongBits = Double.doubleToLongBits(this.a);
            long doubleToLongBits2 = Double.doubleToLongBits(this.b);
            int floatToIntBits = ((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + Float.floatToIntBits(this.c)) * 31;
            b e2 = e();
            return floatToIntBits + (e2 != null ? e2.hashCode() : 0);
        }

        public String toString() {
            return "Geofence(latitude=" + this.a + ", longitude=" + this.b + ", radius=" + this.c + ", type=" + e() + ")";
        }
    }

    /* compiled from: Trigger.kt */
    public enum b {
        Enter,
        Exit,
        EnterOrExit
    }

    private Trigger() {
    }

    public abstract String a();

    public /* synthetic */ Trigger(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
