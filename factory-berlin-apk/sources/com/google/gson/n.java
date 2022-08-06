package com.google.gson;

import com.google.gson.internal.g;
import java.util.Map;
import java.util.Set;

/* compiled from: JsonObject */
public final class n extends l {
    private final g<String, l> a = new g<>();

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof n) && ((n) obj).a.equals(this.a));
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public void l(String str, l lVar) {
        g<String, l> gVar = this.a;
        if (lVar == null) {
            lVar = m.a;
        }
        gVar.put(str, lVar);
    }

    public Set<Map.Entry<String, l>> m() {
        return this.a.entrySet();
    }
}
