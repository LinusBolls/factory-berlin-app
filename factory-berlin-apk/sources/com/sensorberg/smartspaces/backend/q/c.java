package com.sensorberg.smartspaces.backend.q;

import com.github.jasminb.jsonapi.d;
import com.sensorberg.smartspaces.backend.model.ActuatorRequest;
import com.sensorberg.smartspaces.backend.model.AuthToken;
import com.sensorberg.smartspaces.backend.model.BeBooking;
import com.sensorberg.smartspaces.backend.model.BeBookingInCluster;
import com.sensorberg.smartspaces.backend.model.BlueIdDeviceDetails;
import com.sensorberg.smartspaces.backend.model.ChangeUserPassword;
import com.sensorberg.smartspaces.backend.model.ExternalToken;
import com.sensorberg.smartspaces.backend.model.LoginData;
import com.sensorberg.smartspaces.backend.model.RefreshToken;
import com.sensorberg.smartspaces.backend.model.Statistics;
import com.sensorberg.smartspaces.backend.model.User;
import com.sensorberg.smartspaces.backend.model.UserDevice;
import com.sensorberg.smartspaces.backend.model.units.BeUnit;
import java.util.List;
import retrofit2.b;
import retrofit2.x.a;
import retrofit2.x.e;
import retrofit2.x.i;
import retrofit2.x.l;
import retrofit2.x.m;
import retrofit2.x.p;
import retrofit2.x.q;

/* compiled from: BackendApi */
public interface c {
    @i({"accept: application/vnd.api+json"})
    @m("/api/mobile-sdk/v1/unit_bookings/{id}/end_now")
    b<d<BeBooking>> a(@p("id") String str);

    @e("/api/mobile-sdk/v1/unit_bookings/current")
    @i({"accept: application/vnd.api+json", "Cache-Control: max-age=0"})
    b<d<List<BeBooking>>> b();

    @i({"accept: application/vnd.api+json"})
    @m("/api/mobile-sdk/v1/actuator_blueid_locks/{id}")
    b<Void> c(@p("id") String str, @a BlueIdDeviceDetails blueIdDeviceDetails);

    @i({"accept: application/vnd.api+json"})
    @l("/api/mobile-sdk/v1/actuator_acting_requests")
    b<d<ActuatorRequest>> d(@a ActuatorRequest actuatorRequest);

    @i({"accept: application/vnd.api+json"})
    @l("/api/mobile-sdk/v1/user_devices")
    b<d<UserDevice>> e(@a UserDevice userDevice);

    @e("/api/mobile-sdk/v1/units")
    @i({"accept: application/vnd.api+json", "x-sw-app-cache-network: x-sw-app-force-cache"})
    b<d<List<BeUnit>>> f();

    @i({"accept: application/json"})
    @l("/oauth/token?type=login")
    b<AuthToken> g(@a LoginData loginData);

    @i({"accept: application/vnd.api+json"})
    @l("/api/mobile-sdk/v1/unit_bookings/book_actuator")
    b<d<BeBooking>> h(@a BeBookingInCluster beBookingInCluster);

    @i({"accept: application/vnd.api+json"})
    @l("/api/mobile-sdk/v1/user_devices/{id}/disable_admin_mode/{blueid_secure_object_id}")
    b<Void> i(@p("id") String str, @p("blueid_secure_object_id") String str2);

    @e("/api/mobile-sdk/v1/unit_bookings")
    @i({"accept: application/vnd.api+json", "Cache-Control: max-age=0"})
    b<d<List<BeBooking>>> j(@q("starts-at") String str, @q("ends-at") String str2, @q("unit-ids") String str3);

    @e("/api/mobile-sdk/v1/unit_bookings")
    @i({"accept: application/vnd.api+json", "Cache-Control: max-age=0"})
    b<d<List<BeBooking>>> k(@q("starts-at") String str, @q("ends-at") String str2);

    @i({"accept: application/json"})
    @l("/oauth/token?type=exchange")
    b<AuthToken> l(@a RefreshToken refreshToken);

    @e("/api/mobile-sdk/v1/users/me")
    @i({"accept: application/vnd.api+json"})
    b<d<User>> m();

    @i({"accept: application/vnd.api+json"})
    @l("/api/mobile-sdk/v1/user_devices/{id}/enable_admin_mode/{blueid_secure_object_id}")
    b<Void> n(@p("id") String str, @p("blueid_secure_object_id") String str2);

    @e("/api/mobile-sdk/v1/units")
    @i({"accept: application/vnd.api+json", "Cache-Control: no-cache", "x-sw-app-cache-network: x-sw-app-force-network"})
    b<d<List<BeUnit>>> o();

    @i({"accept: application/vnd.api+json", "x-alioli-http-valid-until: 1209600000"})
    @l("/api/mobile-sdk/v1/actuator_acting_requests")
    b<d<ActuatorRequest>> p(@a ActuatorRequest actuatorRequest);

    @i({"accept: application/json"})
    @l("/oauth/token?type=token")
    b<AuthToken> q(@a ExternalToken externalToken);

    @i({"accept: application/vnd.api+json"})
    @l("/api/mobile-sdk/v1/unit_bookings")
    b<d<BeBooking>> r(@a BeBooking beBooking);

    @i({"accept: application/vnd.api+json"})
    @m("/api/mobile-sdk/v1/users/me/change_password")
    b<d<User>> s(@a ChangeUserPassword changeUserPassword);

    @i({"accept: application/vnd.api+json", "x-alioli-http-valid-until: 1209600000"})
    @l("/api/mobile-sdk/v1/user_devices/{id}/user_device_statistics")
    b<d<Statistics>> t(@p("id") String str, @a Statistics statistics);
}
