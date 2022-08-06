package com.sensorberg.smartspaces.backend.model;

import com.google.gson.annotations.b;
import java.util.List;

public class IotDevice {

    public static class State {
        @b("type")
        public String type;
        @b("value")
        public String value;

        public State() {
        }

        public State(String str, String str2) {
            this.type = str;
            this.value = str2;
        }
    }

    public static class StateQuery {
        @b("iot-device-ids")
        public final List<String> iotDeviceIds;

        public StateQuery(List<String> list) {
            this.iotDeviceIds = list;
        }
    }

    public static class StateQueryResult {
        @b("current-state")
        public List<State> currentState;
        @b("iot-device-id")
        public String iotDeviceId;
    }

    public static class StateRequest {
        @b("iot-device-id")
        public final String iotDeviceId;
        @b("target-state-attributes")
        public final List<State> iotDeviceStates;

        public static class RequestList {
            @b("target-states")
            public final List<StateRequest> targetStateAttributes;

            public RequestList(List<StateRequest> list) {
                this.targetStateAttributes = list;
            }
        }

        public StateRequest(String str, List<State> list) {
            this.iotDeviceId = str;
            this.iotDeviceStates = list;
        }
    }
}
