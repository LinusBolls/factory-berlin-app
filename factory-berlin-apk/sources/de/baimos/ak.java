package de.baimos;

import de.baimos.ak;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class ak<T extends ak> {
    private static final dr c = ds.a(ak.class);

    /* renamed from: d  reason: collision with root package name */
    private static final Charset f8187d = Charset.forName("UTF-8");
    protected File a;
    protected Map<String, JSONObject> b;

    /* renamed from: e  reason: collision with root package name */
    private String f8188e;

    /* renamed from: f  reason: collision with root package name */
    private String f8189f;

    /* renamed from: g  reason: collision with root package name */
    private Key f8190g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f8191h = false;

    public ak(String str, String str2, String str3, String str4, Key key) {
        this.f8189f = str2;
        this.f8188e = str4;
        this.f8190g = key;
        new File(str).mkdirs();
        this.a = new File(str + File.separator + str3);
    }

    /* JADX INFO: finally extract failed */
    private void a(byte[] bArr) {
        File file = new File(this.a.getAbsolutePath() + ".tmp");
        OutputStream a2 = a(file);
        int length = bArr.length;
        try {
            if (this.f8190g != null) {
                length = az.a(this.f8190g, bArr, a2);
            } else {
                a2.write(bArr);
            }
            a2.flush();
            a2.close();
            if (file.length() == ((long) length)) {
                if (this.a.exists() && !this.a.delete()) {
                    dr drVar = c;
                    drVar.b("failed to delete " + this.a.getName());
                }
                if (!file.renameTo(this.a)) {
                    if (!file.delete()) {
                        dr drVar2 = c;
                        drVar2.b("failed to delete " + file.getName());
                    }
                    throw new IOException("failed to rename temporary file " + file.getAbsolutePath() + " to productive file " + this.a.getAbsolutePath());
                }
                return;
            }
            throw new IOException("file size mismatch! expected " + length + " but is " + file.length());
        } catch (Throwable th) {
            a2.close();
            throw th;
        }
    }

    private JSONObject f() {
        return new JSONObject().put("###BLUEID_SDK_VERSION###", this.f8189f);
    }

    public T a() {
        Map<String, JSONObject> map;
        String string;
        if (!this.f8191h) {
            this.b = new HashMap();
            if (this.a.exists()) {
                String str = null;
                try {
                    if (this.a.length() > 0) {
                        FileInputStream fileInputStream = new FileInputStream(this.a);
                        byte[] a2 = this.f8190g != null ? az.a(this.f8190g, (InputStream) fileInputStream) : cq.a((InputStream) fileInputStream);
                        cq.d(fileInputStream);
                        JSONArray jSONArray = new JSONArray(new String(a2, f8187d));
                        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                            JSONObject jSONObject = jSONArray.getJSONObject(i2);
                            if (i2 != 0 || !jSONObject.has("###BLUEID_SDK_VERSION###")) {
                                if (this.f8188e == null) {
                                    map = this.b;
                                    string = Integer.toString(i2);
                                } else {
                                    map = this.b;
                                    string = jSONObject.getString(this.f8188e);
                                }
                                map.put(string, jSONObject);
                            } else {
                                str = jSONObject.getString("###BLUEID_SDK_VERSION###");
                            }
                        }
                    }
                    if (str != null && !str.equals(this.f8189f)) {
                        a(str);
                    }
                } catch (IOException | JSONException e2) {
                    throw new RuntimeException(e2);
                } catch (ax e3) {
                    c.b("failed to decrypt existing data, probably caused by an upgrade of the SDK from an older incompatible version. Reinitialization required!");
                    throw e3;
                }
            }
            this.f8191h = true;
            return this;
        }
        throw new RuntimeException("database was already initialized!");
    }

    /* access modifiers changed from: protected */
    public OutputStream a(File file) {
        return new FileOutputStream(file);
    }

    /* access modifiers changed from: protected */
    public void a(String str) {
    }

    /* access modifiers changed from: protected */
    public void b() {
    }

    /* access modifiers changed from: protected */
    public void c() {
        if (!this.f8191h) {
            throw new am();
        }
    }

    public synchronized void d() {
        if (this.a.exists() && !this.a.delete()) {
            dr drVar = c;
            drVar.b("failed to delete " + this.a.getName());
        }
        if (this.b != null) {
            this.b.clear();
        }
        b();
        this.f8191h = false;
    }

    public synchronized void e() {
        c();
        JSONArray jSONArray = new JSONArray();
        try {
            jSONArray.put(f());
            for (JSONObject put : this.b.values()) {
                jSONArray.put(put);
            }
            a(jSONArray.toString().getBytes(f8187d));
        } catch (JSONException e2) {
            throw new RuntimeException(e2);
        }
    }
}
