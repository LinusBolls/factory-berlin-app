package de.baimos;

import de.baimos.blueid.sdk.api.SecuredObject;
import de.baimos.blueid.sdk.conn.SdkClientFactory;
import de.baimos.blueid.sdk.data.b;
import de.baimos.blueid.sdk.metrics.AndroidSdkMetrics;
import java.security.Key;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ap extends ak<ap> {
    private static final dr c = ds.a(ap.class);

    /* renamed from: d  reason: collision with root package name */
    private List<b> f8192d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    private SdkClientFactory f8193e;

    /* renamed from: f  reason: collision with root package name */
    private AndroidSdkMetrics f8194f;

    public ap(String str, String str2, Key key, SdkClientFactory sdkClientFactory, AndroidSdkMetrics androidSdkMetrics) {
        super(str, str2, "securedObjects", "id", key);
        this.f8193e = sdkClientFactory;
        this.f8194f = androidSdkMetrics;
    }

    private void h() {
        this.f8192d.clear();
        for (JSONObject bVar : this.b.values()) {
            this.f8192d.add(new b(bVar, this.f8193e));
        }
    }

    public synchronized void a(JSONArray jSONArray) {
        this.f8192d.clear();
        this.b.clear();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i2);
            b bVar = new b(jSONObject, this.f8193e);
            this.f8192d.add(bVar);
            this.b.put(bVar.getId(), jSONObject);
        }
        e();
    }

    /* access modifiers changed from: protected */
    public synchronized void b() {
        this.f8192d.clear();
    }

    /* renamed from: f */
    public synchronized ap a() {
        super.a();
        try {
            h();
        } catch (JSONException e2) {
            c.a("Failed to initially import database. Make sure the BlueID Mobile Device is properly initialized.", e2);
            this.f8194f.addMessage("Failed to initially import database. Make sure the BlueID Mobile Device is properly initialized.", e2);
        }
        return this;
    }

    public synchronized List<SecuredObject> g() {
        ArrayList arrayList;
        c();
        dr drVar = c;
        drVar.d("all securedObjects: " + this.f8192d);
        dr drVar2 = c;
        drVar2.d("removing all secured objects whose tickets have expired, timestamp=" + System.currentTimeMillis());
        arrayList = new ArrayList();
        for (b next : this.f8192d) {
            if (!next.b().isEmpty()) {
                arrayList.add(next);
            } else {
                dr drVar3 = c;
                drVar3.d("skipping securedobject because its tickets have expired: " + next);
            }
        }
        return arrayList;
    }
}
