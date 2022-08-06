package de.baimos;

import de.baimos.blueid.sdk.api.SdkInfo;
import de.baimos.blueid.sdk.api.exceptions.ClientAlreadyInitializedException;
import de.baimos.blueid.sdk.api.exceptions.LicenseException;
import de.baimos.blueid.sdk.api.exceptions.MarshalException;
import de.baimos.blueid.sdk.conn.SdkClientFactory;
import de.baimos.blueid.sdk.metrics.AndroidSdkMetrics;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class at {
    private static final dr a = ds.a(at.class);
    private an b;
    private al c;

    /* renamed from: d  reason: collision with root package name */
    private SdkClientFactory f8198d;

    /* renamed from: e  reason: collision with root package name */
    private AndroidSdkMetrics f8199e;

    public at(an anVar, al alVar, SdkClientFactory sdkClientFactory, AndroidSdkMetrics androidSdkMetrics) {
        this.c = alVar;
        this.b = anVar;
        this.f8198d = sdkClientFactory;
        this.f8199e = androidSdkMetrics;
    }

    public String a(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        String a2 = bm.a(str4, (al) null);
        if (!a()) {
            try {
                JSONObject jSONObject = new JSONObject(new String(bm.a(a2 + "/mobiledevices/initInfo?apiKey=" + str3 + "&apiVersion=" + SdkInfo.getUrlEncodedVersion(), "GET", "application/json", (String) null, (byte[]) null, (Map<String, String>) null, this.f8198d, this.f8199e).b(), "UTF-8")).getJSONObject("securedObjectAuthKey");
                String string = jSONObject.getString("algorithm");
                String string2 = jSONObject.getString("spec");
                dr drVar = a;
                drVar.d("key algorithm=" + string + ", spec=" + string2);
                byte[] encoded = this.b.a(string, string2).getPublic().getEncoded();
                JSONObject jSONObject2 = new JSONObject(new String(bm.a(a2 + "/mobiledevices/createMobileFromKey?apiKey=" + str3 + "&apiVersion=" + SdkInfo.getUrlEncodedVersion(), "POST", "application/json", "application/octet-stream", encoded, (Map<String, String>) null, this.f8198d, this.f8199e).b(), "UTF-8"));
                String string3 = jSONObject2.getString("id");
                dr drVar2 = a;
                drVar2.c("device id = " + string3);
                AndroidSdkMetrics androidSdkMetrics = this.f8199e;
                androidSdkMetrics.addMessage("initialized with device id " + string3);
                this.c.a("DEVICE_ID", string3);
                this.c.a("CLIENT_SECRET", jSONObject2.getString("clientSecret"));
                this.c.a("HOST", str4);
                return string3;
            } catch (ar e2) {
                ar arVar = e2;
                if (arVar.b() == 403) {
                    a.d("invalid api key used", arVar);
                    throw new LicenseException("invalid api key used");
                }
                throw arVar;
            } catch (UnsupportedEncodingException e3) {
                e = e3;
                throw new MarshalException(e);
            } catch (JSONException e4) {
                e = e4;
                throw new MarshalException(e);
            } catch (NoSuchAlgorithmException e5) {
                e = e5;
                throw new ax(e);
            } catch (NoSuchProviderException e6) {
                e = e6;
                throw new ax(e);
            } catch (InvalidAlgorithmParameterException e7) {
                e = e7;
                throw new ax(e);
            }
        } else {
            throw new ClientAlreadyInitializedException();
        }
    }

    public boolean a() {
        dr drVar;
        String str;
        if (cs.a(this.c.b("DEVICE_ID"))) {
            drVar = a;
            str = "Client is not initialized, device id not set. Please initialize.";
        } else if (cs.a(this.c.b("CLIENT_SECRET"))) {
            drVar = a;
            str = "Client is not initialized, client secret not set. Please initialize.";
        } else if (!cs.a(this.c.b("HOST"))) {
            return true;
        } else {
            drVar = a;
            str = "Client is not initialized, host not set. Please initialize.";
        }
        drVar.c(str);
        return false;
    }
}
