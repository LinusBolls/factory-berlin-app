package com.sensorberg.notifications.sdk.internal.model;

import com.sensorberg.notifications.sdk.internal.model.Trigger;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.g;
import com.squareup.moshi.internal.a;
import com.squareup.moshi.l;
import com.squareup.moshi.n;
import java.util.UUID;
import kotlin.i;
import kotlin.jvm.internal.k;

@i(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u001c\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0015¨\u0006\u001e"}, d2 = {"Lcom/sensorberg/notifications/sdk/internal/model/Trigger_BeaconJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/squareup/moshi/JsonReader;", "reader", "Lcom/sensorberg/notifications/sdk/internal/model/Trigger$Beacon;", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lcom/sensorberg/notifications/sdk/internal/model/Trigger$Beacon;", "Lcom/squareup/moshi/JsonWriter;", "writer", "value", "", "toJson", "(Lcom/squareup/moshi/JsonWriter;Lcom/sensorberg/notifications/sdk/internal/model/Trigger$Beacon;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "shortAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/sensorberg/notifications/sdk/internal/model/Trigger$Type;", "typeAdapter", "Ljava/util/UUID;", "uUIDAdapter", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "notifications_release"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
/* compiled from: Trigger_BeaconJsonAdapter.kt */
public final class Trigger_BeaconJsonAdapter extends JsonAdapter<Trigger.Beacon> {
    private final g.b options;
    private final JsonAdapter<Short> shortAdapter;
    private final JsonAdapter<Trigger.b> typeAdapter;
    private final JsonAdapter<UUID> uUIDAdapter;

    public Trigger_BeaconJsonAdapter(n nVar) {
        k.f(nVar, "moshi");
        g.b a = g.b.a("proximityUuid", "major", "minor", "type");
        k.b(a, "JsonReader.Options.of(\"p…\", \"minor\",\n      \"type\")");
        this.options = a;
        JsonAdapter<UUID> f2 = nVar.f(UUID.class, i0.b(), "proximityUuid");
        k.b(f2, "moshi.adapter(UUID::clas…),\n      \"proximityUuid\")");
        this.uUIDAdapter = f2;
        JsonAdapter<Short> f3 = nVar.f(Short.TYPE, i0.b(), "major");
        k.b(f3, "moshi.adapter(Short::cla…mptySet(),\n      \"major\")");
        this.shortAdapter = f3;
        JsonAdapter<Trigger.b> f4 = nVar.f(Trigger.b.class, i0.b(), "type");
        k.b(f4, "moshi.adapter(Trigger.Ty…      emptySet(), \"type\")");
        this.typeAdapter = f4;
    }

    /* renamed from: i */
    public Trigger.Beacon b(g gVar) {
        k.f(gVar, "reader");
        gVar.b();
        UUID uuid = null;
        Short sh = null;
        Short sh2 = null;
        Trigger.b bVar = null;
        while (gVar.hasNext()) {
            int K = gVar.K(this.options);
            if (K == -1) {
                gVar.Z();
                gVar.skipValue();
            } else if (K == 0) {
                uuid = this.uUIDAdapter.b(gVar);
                if (uuid == null) {
                    JsonDataException u = a.u("proximityUuid", "proximityUuid", gVar);
                    k.b(u, "Util.unexpectedNull(\"pro… \"proximityUuid\", reader)");
                    throw u;
                }
            } else if (K == 1) {
                Short b = this.shortAdapter.b(gVar);
                if (b != null) {
                    sh = Short.valueOf(b.shortValue());
                } else {
                    JsonDataException u2 = a.u("major", "major", gVar);
                    k.b(u2, "Util.unexpectedNull(\"maj…jor\",\n            reader)");
                    throw u2;
                }
            } else if (K == 2) {
                Short b2 = this.shortAdapter.b(gVar);
                if (b2 != null) {
                    sh2 = Short.valueOf(b2.shortValue());
                } else {
                    JsonDataException u3 = a.u("minor", "minor", gVar);
                    k.b(u3, "Util.unexpectedNull(\"min…nor\",\n            reader)");
                    throw u3;
                }
            } else if (K == 3 && (bVar = this.typeAdapter.b(gVar)) == null) {
                JsonDataException u4 = a.u("type", "type", gVar);
                k.b(u4, "Util.unexpectedNull(\"typ…ype\",\n            reader)");
                throw u4;
            }
        }
        gVar.i();
        if (uuid == null) {
            JsonDataException m2 = a.m("proximityUuid", "proximityUuid", gVar);
            k.b(m2, "Util.missingProperty(\"pr… \"proximityUuid\", reader)");
            throw m2;
        } else if (sh != null) {
            short shortValue = sh.shortValue();
            if (sh2 != null) {
                short shortValue2 = sh2.shortValue();
                if (bVar != null) {
                    return new Trigger.Beacon(uuid, shortValue, shortValue2, bVar);
                }
                JsonDataException m3 = a.m("type", "type", gVar);
                k.b(m3, "Util.missingProperty(\"type\", \"type\", reader)");
                throw m3;
            }
            JsonDataException m4 = a.m("minor", "minor", gVar);
            k.b(m4, "Util.missingProperty(\"minor\", \"minor\", reader)");
            throw m4;
        } else {
            JsonDataException m5 = a.m("major", "major", gVar);
            k.b(m5, "Util.missingProperty(\"major\", \"major\", reader)");
            throw m5;
        }
    }

    /* renamed from: j */
    public void h(l lVar, Trigger.Beacon beacon) {
        k.f(lVar, "writer");
        if (beacon != null) {
            lVar.b();
            lVar.n("proximityUuid");
            this.uUIDAdapter.h(lVar, beacon.d());
            lVar.n("major");
            this.shortAdapter.h(lVar, Short.valueOf(beacon.b()));
            lVar.n("minor");
            this.shortAdapter.h(lVar, Short.valueOf(beacon.c()));
            lVar.n("type");
            this.typeAdapter.h(lVar, beacon.e());
            lVar.j();
            return;
        }
        throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(36);
        sb.append("GeneratedJsonAdapter(");
        sb.append("Trigger.Beacon");
        sb.append(')');
        String sb2 = sb.toString();
        k.b(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }
}
