package g.e.f;

import android.content.SharedPreferences;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.k;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: PreferencesEditor.kt */
public final class c implements SharedPreferences.Editor {
    private final Set<String> a = new LinkedHashSet();
    private final b b;
    private JSONObject c;

    public c(b bVar, JSONObject jSONObject) {
        k.f(bVar, "preferences");
        k.f(jSONObject, "data");
        this.b = bVar;
        this.c = jSONObject;
    }

    public void apply() {
        this.b.e(this.c, this.a);
    }

    public SharedPreferences.Editor clear() {
        this.c = new JSONObject();
        return this;
    }

    public boolean commit() {
        return this.b.f(this.c, this.a);
    }

    public SharedPreferences.Editor putBoolean(String str, boolean z) {
        k.f(str, "key");
        this.a.add(str);
        this.c.put(str, z);
        return this;
    }

    public SharedPreferences.Editor putFloat(String str, float f2) {
        k.f(str, "key");
        this.a.add(str);
        this.c.put(str, (double) f2);
        return this;
    }

    public SharedPreferences.Editor putInt(String str, int i2) {
        k.f(str, "key");
        this.a.add(str);
        this.c.put(str, i2);
        return this;
    }

    public SharedPreferences.Editor putLong(String str, long j2) {
        k.f(str, "key");
        this.a.add(str);
        this.c.put(str, j2);
        return this;
    }

    public SharedPreferences.Editor putString(String str, String str2) {
        k.f(str, "key");
        this.a.add(str);
        if (str2 == null) {
            this.c.remove(str);
        } else {
            this.c.put(str, str2);
        }
        return this;
    }

    public SharedPreferences.Editor putStringSet(String str, Set<String> set) {
        k.f(str, "key");
        this.a.add(str);
        if (set == null) {
            this.c.remove(str);
        } else {
            JSONArray jSONArray = new JSONArray();
            for (String put : set) {
                jSONArray.put(put);
            }
            this.c.put(str, jSONArray);
        }
        return this;
    }

    public SharedPreferences.Editor remove(String str) {
        k.f(str, "key");
        this.a.add(str);
        this.c.remove(str);
        return this;
    }
}
