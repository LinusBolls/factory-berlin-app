package de.baimos;

import android.os.Build;
import de.baimos.bh;
import de.baimos.blueid.sdk.api.Channel;
import de.baimos.blueid.sdk.api.Command;
import de.baimos.blueid.sdk.api.SdkInfo;
import de.baimos.blueid.sdk.api.SecuredObject;
import de.baimos.blueid.sdk.util.SdkUtils;
import org.json.JSONException;
import org.json.JSONObject;

public class bg implements bk {
    private JSONObject a = null;
    private JSONObject b = null;
    private boolean c = false;

    public bg() {
        bh.a((bk) this);
    }

    private JSONObject b(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Mobile", c());
            try {
                jSONObject.put("Mobile OS version", Build.VERSION.RELEASE);
            } catch (NoClassDefFoundError unused) {
                jSONObject.put("Mobile OS version", "n/a");
            }
            jSONObject.put("BlueID SDK version", SdkInfo.VERSION);
            jSONObject.put("MDID", str);
            if (str2 != null) {
                jSONObject.put("Trust center", str2);
            }
            return jSONObject;
        } catch (JSONException unused2) {
            return null;
        }
    }

    private static String c() {
        String str;
        try {
            StringBuilder sb = new StringBuilder();
            String str2 = "";
            if (Build.MANUFACTURER == null) {
                str = str2;
            } else {
                str = Build.MANUFACTURER.replaceAll(" ", "-").toUpperCase() + "_";
            }
            sb.append(str);
            if (Build.MODEL != null) {
                str2 = Build.MODEL.replaceAll(" ", "-").toUpperCase();
            }
            sb.append(str2);
            return sb.toString();
        } catch (NoClassDefFoundError unused) {
            return "TEST";
        }
    }

    public void a() {
        this.a = null;
        this.b = null;
        this.c = true;
    }

    public synchronized void a(bh.a aVar, String str, String str2) {
        if (this.c && this.a != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("Time", SdkUtils.getCurrentTimeISO8601());
                jSONObject.put("Severity", aVar);
                jSONObject.put("Module", str);
                jSONObject.put("Message", str2);
                this.a.accumulate("BlueIDLogs", jSONObject);
            } catch (JSONException unused) {
            }
        }
    }

    public void a(SecuredObject securedObject, String str, Command command, Channel channel) {
        try {
            JSONObject jSONObject = new JSONObject();
            this.a = jSONObject;
            jSONObject.put("Device Info", b(str, (String) null));
            JSONObject jSONObject2 = new JSONObject();
            this.b = jSONObject2;
            String str2 = "null";
            jSONObject2.put("SOID", securedObject != null ? securedObject.getId() : str2);
            this.b.put("CommandID", command != null ? command.getId() : str2);
            JSONObject jSONObject3 = this.b;
            if (channel != null) {
                str2 = channel.getId();
            }
            jSONObject3.put("Channel", str2);
        } catch (JSONException unused) {
        }
    }

    public void a(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            this.a = jSONObject;
            jSONObject.put("Device Info", b(str, str2));
            this.b = null;
        } catch (JSONException unused) {
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:2|(3:4|5|6)|7|8|9) */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001b, code lost:
        return r3.a.toString();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x000d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String b() {
        /*
            r3 = this;
            org.json.JSONObject r0 = r3.a
            if (r0 == 0) goto L_0x001c
            org.json.JSONObject r1 = r3.b
            if (r1 == 0) goto L_0x000d
            java.lang.String r2 = "Command"
            r0.put(r2, r1)     // Catch:{ JSONException -> 0x000d }
        L_0x000d:
            org.json.JSONObject r0 = r3.a     // Catch:{ JSONException -> 0x0015 }
            r1 = 2
            java.lang.String r0 = r0.toString(r1)     // Catch:{ JSONException -> 0x0015 }
            return r0
        L_0x0015:
            org.json.JSONObject r0 = r3.a
            java.lang.String r0 = r0.toString()
            return r0
        L_0x001c:
            java.lang.String r0 = ""
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: de.baimos.bg.b():java.lang.String");
    }
}
