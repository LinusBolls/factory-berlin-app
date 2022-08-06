package com.sensorberg.notifications.sdk.internal.storage;

import com.sensorberg.notifications.sdk.internal.model.Trigger;
import g.e.j.a.c;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.k;

/* compiled from: DatabaseConverters.kt */
public final class h {
    public final int a(c cVar) {
        k.f(cVar, "conversion");
        int i2 = g.b[cVar.ordinal()];
        if (i2 == 1) {
            return 1;
        }
        if (i2 == 2) {
            return 2;
        }
        if (i2 == 3) {
            return 3;
        }
        if (i2 == 4) {
            return 4;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final int b(Trigger.b bVar) {
        k.f(bVar, "type");
        int i2 = g.a[bVar.ordinal()];
        if (i2 == 1) {
            return 1;
        }
        if (i2 == 2) {
            return 2;
        }
        if (i2 == 3) {
            return 3;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final String c(UUID uuid) {
        k.f(uuid, "uuid");
        String uuid2 = uuid.toString();
        k.b(uuid2, "uuid.toString()");
        return uuid2;
    }

    public final c d(int i2) {
        if (i2 == 1) {
            return c.NotificationDisabled;
        }
        if (i2 == 2) {
            return c.Suppressed;
        }
        if (i2 == 3) {
            return c.Ignored;
        }
        if (i2 == 4) {
            return c.Success;
        }
        throw new IllegalArgumentException("Conversion code can't be " + i2);
    }

    public final Trigger.b e(int i2) {
        if (i2 == 1) {
            return Trigger.b.Enter;
        }
        if (i2 == 2) {
            return Trigger.b.Exit;
        }
        if (i2 == 3) {
            return Trigger.b.EnterOrExit;
        }
        throw new IllegalArgumentException("Trigger.Type code can't be " + i2);
    }

    public final UUID f(String str) {
        k.f(str, "value");
        UUID fromString = UUID.fromString(str);
        k.b(fromString, "UUID.fromString(value)");
        return fromString;
    }
}
