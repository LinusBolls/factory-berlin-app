package com.sensorberg.smartworkspace.app.screens.spaces;

import androidx.annotation.Keep;
import com.sensorberg.smartspaces.sdk.model.IotDevice;
import kotlin.i;
import kotlin.jvm.internal.k;

@i(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0001\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"Lcom/sensorberg/smartworkspace/app/screens/spaces/IotDeviceIdentifier;", "Ljava/lang/Enum;", "", "externalIdentifier", "Ljava/lang/String;", "getExternalIdentifier", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Companion", "AIR_CONDITION", "DOOR", "HEATER", "JALOUSIE", "LAMP", "PLUG", "SMOKE_DETECTOR", "TEMPERATURE", "MISC", "WINDOW", "MYRENZ_LETTER_BOX", "MYRENZ_PARCEL_BOX", "app_appCenterRelease"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
@Keep
/* compiled from: IotDeviceIdentifier.kt */
public enum IotDeviceIdentifier {
    AIR_CONDITION("cool_thermostat"),
    DOOR("door"),
    HEATER("heat_thermostat"),
    JALOUSIE("jalousie"),
    LAMP("light"),
    PLUG("power_socket"),
    SMOKE_DETECTOR("smoke_detector"),
    TEMPERATURE("temperature"),
    MISC("misc"),
    WINDOW("window"),
    MYRENZ_LETTER_BOX("my_renz_letter_box"),
    MYRENZ_PARCEL_BOX("my_renz_parcel_box");
    
    public static final a Companion = null;
    private final String externalIdentifier;

    /* compiled from: IotDeviceIdentifier.kt */
    public static final class a {
        private a() {
        }

        public final IotDeviceIdentifier a(IotDevice iotDevice) {
            k.e(iotDevice, "iotDevice");
            String externalIdentifier = iotDevice.getDeviceType().getExternalIdentifier();
            if (k.a(externalIdentifier, IotDeviceIdentifier.AIR_CONDITION.getExternalIdentifier())) {
                return IotDeviceIdentifier.AIR_CONDITION;
            }
            if (k.a(externalIdentifier, IotDeviceIdentifier.DOOR.getExternalIdentifier())) {
                return IotDeviceIdentifier.DOOR;
            }
            if (k.a(externalIdentifier, IotDeviceIdentifier.HEATER.getExternalIdentifier())) {
                return IotDeviceIdentifier.HEATER;
            }
            if (k.a(externalIdentifier, IotDeviceIdentifier.JALOUSIE.getExternalIdentifier())) {
                return IotDeviceIdentifier.JALOUSIE;
            }
            if (k.a(externalIdentifier, IotDeviceIdentifier.LAMP.getExternalIdentifier())) {
                return IotDeviceIdentifier.LAMP;
            }
            if (k.a(externalIdentifier, IotDeviceIdentifier.PLUG.getExternalIdentifier())) {
                return IotDeviceIdentifier.PLUG;
            }
            if (k.a(externalIdentifier, IotDeviceIdentifier.SMOKE_DETECTOR.getExternalIdentifier())) {
                return IotDeviceIdentifier.SMOKE_DETECTOR;
            }
            if (k.a(externalIdentifier, IotDeviceIdentifier.TEMPERATURE.getExternalIdentifier())) {
                return IotDeviceIdentifier.TEMPERATURE;
            }
            if (k.a(externalIdentifier, IotDeviceIdentifier.WINDOW.getExternalIdentifier())) {
                return IotDeviceIdentifier.WINDOW;
            }
            if (k.a(externalIdentifier, IotDeviceIdentifier.MYRENZ_LETTER_BOX.getExternalIdentifier())) {
                return IotDeviceIdentifier.MYRENZ_LETTER_BOX;
            }
            if (k.a(externalIdentifier, IotDeviceIdentifier.MYRENZ_PARCEL_BOX.getExternalIdentifier())) {
                return IotDeviceIdentifier.MYRENZ_PARCEL_BOX;
            }
            return IotDeviceIdentifier.MISC;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        Companion = new a((DefaultConstructorMarker) null);
    }

    private IotDeviceIdentifier(String str) {
        this.externalIdentifier = str;
    }

    public final String getExternalIdentifier() {
        return this.externalIdentifier;
    }
}
