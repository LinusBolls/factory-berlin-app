package de.baimos.blueid.sdk.data;

import de.baimos.bd;
import de.baimos.blueid.sdk.api.Channel;
import de.baimos.blueid.sdk.api.Command;
import de.baimos.blueid.sdk.conn.SdkClientFactory;
import de.baimos.dr;
import de.baimos.ds;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class c extends JSONObject {
    private static final dr a = ds.a(c.class);
    private List<Command> b = new ArrayList();
    private List<Channel> c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    private b f8230d;

    public c(JSONObject jSONObject, b bVar, SdkClientFactory sdkClientFactory) {
        super(jSONObject.toString());
        this.f8230d = bVar;
        JSONArray optJSONArray = optJSONArray("commands");
        if (optJSONArray != null) {
            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                this.b.add(new CommandImpl(optJSONArray.optString(i2)));
            }
        }
        JSONArray optJSONArray2 = optJSONArray("channels");
        if (optJSONArray2 != null) {
            for (int i3 = 0; i3 < optJSONArray2.length(); i3++) {
                this.c.add(sdkClientFactory.a(optJSONArray2.optString(i3)));
            }
        }
    }

    public List<Command> a() {
        return this.b;
    }

    public List<Channel> b() {
        return this.c;
    }

    public long c() {
        return optLong("begin");
    }

    public long d() {
        return optLong("creation");
    }

    public byte[] e() {
        dr drVar = a;
        drVar.d("ticket = " + toString());
        String optString = optString("encodedTicket");
        if (optString != null && !optString.trim().equals("")) {
            return bd.a(optString);
        }
        throw new NullPointerException("encoded ticket is null or empty! complete ticket: " + toString());
    }

    public long f() {
        return optLong("end");
    }
}
