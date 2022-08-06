package com.sensorberg.smartspaces.sdk.internal.u;

import com.sensorberg.smartspaces.sdk.model.StateChangeRequest;
import g.e.n.g.g;
import java.util.Iterator;
import kotlin.jvm.internal.k;

/* compiled from: IotDeviceRequestValidation.kt */
public final class f {
    public static final f a = new f();

    private f() {
    }

    public final Exception a(StateChangeRequest stateChangeRequest, g.b bVar) {
        T t;
        k.e(stateChangeRequest, "request");
        if (stateChangeRequest.getStates$sdk_release().isEmpty()) {
            return new IllegalArgumentException("StateChangeRequest must have at least 1 state. To add states call `addState(Property, Value)` on the builder");
        }
        Iterator<T> it = stateChangeRequest.getStates$sdk_release().iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (!((StateChangeRequest.StateRequest) t).getProperty().getWritable()) {
                break;
            }
        }
        StateChangeRequest.StateRequest stateRequest = (StateChangeRequest.StateRequest) t;
        if (stateRequest != null) {
            return new IllegalArgumentException("Property " + stateRequest.getProperty().getKind() + " is not writable");
        } else if (bVar == null || k.a(bVar, g.b.C0724b.a)) {
            return new IllegalStateException("Smartspaces SDK is not ready.");
        } else {
            return null;
        }
    }
}
