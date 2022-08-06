package g.d.a.c;

import android.bluetooth.BluetoothDevice;
import g.d.a.d;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class a {
    private Boolean a = Boolean.FALSE;
    private String b;
    private String c;

    /* renamed from: d  reason: collision with root package name */
    private b f9701d;

    public a(String str, String str2, b bVar, BluetoothDevice bluetoothDevice) {
        if (!str2.contains("_")) {
            str2 = str2.substring(0, 7) + "_" + str2.substring(7, 10) + "_" + str2.substring(10, 12);
        }
        this.c = str2;
        this.b = str;
        this.f9701d = bVar;
        try {
            JSONArray jSONArray = new JSONArray((String) d.d().getAll().get("pkas"));
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i2);
                if (optJSONObject.getString("id").equals(this.c)) {
                    this.a = Boolean.TRUE;
                    String[] split = optJSONObject.getString("name").split(", ");
                    String str3 = split[0];
                    String str4 = split[1];
                }
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    public String a() {
        return this.b;
    }

    public String b() {
        return this.c;
    }

    public b c() {
        return this.f9701d;
    }

    public Boolean d() {
        return this.a;
    }

    public void e(b bVar) {
        this.f9701d = bVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            String str = this.c;
            String str2 = ((a) obj).c;
            if (str != null) {
                return str.equals(str2);
            }
            if (str2 == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.c;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }
}
