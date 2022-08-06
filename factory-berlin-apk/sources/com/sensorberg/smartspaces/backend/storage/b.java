package com.sensorberg.smartspaces.backend.storage;

import androidx.room.l;
import androidx.room.s;
import com.sensorberg.smartspaces.backend.model.ActuatorRequest;
import e.s.a.f;

/* compiled from: ActuatorRequestDao_Impl */
public final class b implements a {

    /* compiled from: ActuatorRequestDao_Impl */
    class a extends androidx.room.e<ActuatorRequest> {
        a(b bVar, l lVar) {
            super(lVar);
        }

        public String d() {
            return "INSERT OR FAIL INTO `actuator_requests` (`id`,`requestId`,`unitId`,`connectorId`,`actuatorId`,`action`,`connectorType`,`actuatorType`,`createdAt`,`userDeviceId`,`state`,`errorDetails`,`finished`,`timestamp`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        /* renamed from: l */
        public void g(f fVar, ActuatorRequest actuatorRequest) {
            String str = actuatorRequest.id;
            if (str == null) {
                fVar.bindNull(1);
            } else {
                fVar.bindString(1, str);
            }
            String str2 = actuatorRequest.requestId;
            if (str2 == null) {
                fVar.bindNull(2);
            } else {
                fVar.bindString(2, str2);
            }
            String str3 = actuatorRequest.unitId;
            if (str3 == null) {
                fVar.bindNull(3);
            } else {
                fVar.bindString(3, str3);
            }
            String str4 = actuatorRequest.connectorId;
            if (str4 == null) {
                fVar.bindNull(4);
            } else {
                fVar.bindString(4, str4);
            }
            String str5 = actuatorRequest.actuatorId;
            if (str5 == null) {
                fVar.bindNull(5);
            } else {
                fVar.bindString(5, str5);
            }
            String str6 = actuatorRequest.action;
            if (str6 == null) {
                fVar.bindNull(6);
            } else {
                fVar.bindString(6, str6);
            }
            String str7 = actuatorRequest.connectorType;
            if (str7 == null) {
                fVar.bindNull(7);
            } else {
                fVar.bindString(7, str7);
            }
            String str8 = actuatorRequest.actuatorType;
            if (str8 == null) {
                fVar.bindNull(8);
            } else {
                fVar.bindString(8, str8);
            }
            String str9 = actuatorRequest.createdAt;
            if (str9 == null) {
                fVar.bindNull(9);
            } else {
                fVar.bindString(9, str9);
            }
            String str10 = actuatorRequest.userDeviceId;
            if (str10 == null) {
                fVar.bindNull(10);
            } else {
                fVar.bindString(10, str10);
            }
            String str11 = actuatorRequest.state;
            if (str11 == null) {
                fVar.bindNull(11);
            } else {
                fVar.bindString(11, str11);
            }
            String str12 = actuatorRequest.errorDetails;
            if (str12 == null) {
                fVar.bindNull(12);
            } else {
                fVar.bindString(12, str12);
            }
            Boolean bool = actuatorRequest.finished;
            Integer valueOf = bool == null ? null : Integer.valueOf(bool.booleanValue() ? 1 : 0);
            if (valueOf == null) {
                fVar.bindNull(13);
            } else {
                fVar.bindLong(13, (long) valueOf.intValue());
            }
            Long l2 = actuatorRequest.timestamp;
            if (l2 == null) {
                fVar.bindNull(14);
            } else {
                fVar.bindLong(14, l2.longValue());
            }
        }
    }

    /* renamed from: com.sensorberg.smartspaces.backend.storage.b$b  reason: collision with other inner class name */
    /* compiled from: ActuatorRequestDao_Impl */
    class C0354b extends s {
        C0354b(b bVar, l lVar) {
            super(lVar);
        }

        public String d() {
            return "UPDATE actuator_requests SET finished = 1 WHERE requestId = ?";
        }
    }

    /* compiled from: ActuatorRequestDao_Impl */
    class c extends s {
        c(b bVar, l lVar) {
            super(lVar);
        }

        public String d() {
            return "UPDATE actuator_requests SET state = ? WHERE requestId = ?";
        }
    }

    /* compiled from: ActuatorRequestDao_Impl */
    class d extends s {
        d(b bVar, l lVar) {
            super(lVar);
        }

        public String d() {
            return "UPDATE actuator_requests SET errorDetails = ? WHERE requestId = ?";
        }
    }

    /* compiled from: ActuatorRequestDao_Impl */
    class e extends s {
        e(b bVar, l lVar) {
            super(lVar);
        }

        public String d() {
            return "UPDATE actuator_requests SET finished = 1 WHERE finished = 0 AND timestamp <= ?";
        }
    }

    public b(l lVar) {
        new a(this, lVar);
        new C0354b(this, lVar);
        new c(this, lVar);
        new d(this, lVar);
        new e(this, lVar);
    }
}
