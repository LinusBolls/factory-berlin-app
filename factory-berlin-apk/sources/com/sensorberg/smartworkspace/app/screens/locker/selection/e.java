package com.sensorberg.smartworkspace.app.screens.locker.selection;

import com.sensorberg.smartworkspace.app.screens.locker.LockerGroupSelection;
import g.e.h.b.b;
import kotlin.jvm.internal.k;

/* compiled from: LockerSelectionResult.kt */
public final class e {
    private final b a;
    private final LockerGroupSelection b;

    public e(b bVar, LockerGroupSelection lockerGroupSelection) {
        k.e(bVar, "selectedTime");
        k.e(lockerGroupSelection, "group");
        this.a = bVar;
        this.b = lockerGroupSelection;
    }

    public final LockerGroupSelection a() {
        return this.b;
    }

    public final b b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return k.a(this.a, eVar.a) && k.a(this.b, eVar.b);
    }

    public int hashCode() {
        b bVar = this.a;
        int i2 = 0;
        int hashCode = (bVar != null ? bVar.hashCode() : 0) * 31;
        LockerGroupSelection lockerGroupSelection = this.b;
        if (lockerGroupSelection != null) {
            i2 = lockerGroupSelection.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        return "LockerSelectionResult(selectedTime=" + this.a + ", group=" + this.b + ")";
    }
}
