package com.sensorberg.smartspaces.backend.storage;

import androidx.room.l;
import androidx.room.s;

/* compiled from: StatisticsDao_Impl */
public final class d implements c {

    /* compiled from: StatisticsDao_Impl */
    class a extends s {
        a(d dVar, l lVar) {
            super(lVar);
        }

        public String d() {
            return "UPDATE statistics SET finished = 1 WHERE finished = 0 AND started <= ?";
        }
    }

    public d(l lVar) {
        new a(this, lVar);
    }
}
