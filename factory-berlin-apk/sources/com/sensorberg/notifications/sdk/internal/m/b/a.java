package com.sensorberg.notifications.sdk.internal.m.b;

import com.sensorberg.notifications.sdk.internal.backend.backendsdkv2.model.HistoryBody;
import com.sensorberg.notifications.sdk.internal.backend.backendsdkv2.model.ResolveResponse;
import java.util.Map;
import retrofit2.b;
import retrofit2.x.e;
import retrofit2.x.i;
import retrofit2.x.l;
import retrofit2.x.p;
import retrofit2.x.r;

/* compiled from: BackendApi.kt */
public interface a {
    @l("/api/v2/sdk/gateways/{apiKey}/analytics.json")
    b<Void> a(@p("apiKey") String str, @retrofit2.x.a HistoryBody historyBody);

    @e("/api/v2/sdk/gateways/{apiKey}/interactions.json")
    @i({"Cache-Control: max-age=0"})
    b<ResolveResponse> b(@p("apiKey") String str, @r Map<String, String> map);
}
