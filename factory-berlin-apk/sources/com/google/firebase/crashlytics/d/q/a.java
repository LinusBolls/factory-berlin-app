package com.google.firebase.crashlytics.d.q;

import android.content.Context;
import com.google.firebase.crashlytics.d.b;
import com.google.firebase.crashlytics.d.h.h;
import com.google.firebase.crashlytics.d.m.i;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import org.json.JSONObject;

/* compiled from: CachedSettingsIo */
public class a {
    private final Context a;

    public a(Context context) {
        this.a = context;
    }

    private File a() {
        return new File(new i(this.a).b(), "com.crashlytics.settings.json");
    }

    public JSONObject b() {
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        b.f().b("Reading cached settings...");
        FileInputStream fileInputStream2 = null;
        try {
            File a2 = a();
            if (a2.exists()) {
                fileInputStream = new FileInputStream(a2);
                try {
                    jSONObject = new JSONObject(h.H(fileInputStream));
                    fileInputStream2 = fileInputStream;
                } catch (Exception e2) {
                    e = e2;
                    try {
                        b.f().e("Failed to fetch cached settings", e);
                        h.e(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    } catch (Throwable th) {
                        th = th;
                        h.e(fileInputStream, "Error while closing settings cache file.");
                        throw th;
                    }
                }
            } else {
                b.f().b("No cached settings found.");
                jSONObject = null;
            }
            h.e(fileInputStream2, "Error while closing settings cache file.");
            return jSONObject;
        } catch (Exception e3) {
            e = e3;
            fileInputStream = null;
            b.f().e("Failed to fetch cached settings", e);
            h.e(fileInputStream, "Error while closing settings cache file.");
            return null;
        } catch (Throwable th2) {
            fileInputStream = null;
            th = th2;
            h.e(fileInputStream, "Error while closing settings cache file.");
            throw th;
        }
    }

    public void c(long j2, JSONObject jSONObject) {
        b.f().b("Writing settings to cache file...");
        if (jSONObject != null) {
            FileWriter fileWriter = null;
            try {
                jSONObject.put("expires_at", j2);
                FileWriter fileWriter2 = new FileWriter(a());
                try {
                    fileWriter2.write(jSONObject.toString());
                    fileWriter2.flush();
                    h.e(fileWriter2, "Failed to close settings writer.");
                } catch (Exception e2) {
                    e = e2;
                    fileWriter = fileWriter2;
                    try {
                        b.f().e("Failed to cache settings", e);
                        h.e(fileWriter, "Failed to close settings writer.");
                    } catch (Throwable th) {
                        th = th;
                        h.e(fileWriter, "Failed to close settings writer.");
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileWriter = fileWriter2;
                    h.e(fileWriter, "Failed to close settings writer.");
                    throw th;
                }
            } catch (Exception e3) {
                e = e3;
                b.f().e("Failed to cache settings", e);
                h.e(fileWriter, "Failed to close settings writer.");
            }
        }
    }
}
