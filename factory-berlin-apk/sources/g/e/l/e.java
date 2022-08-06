package g.e.l;

import e.h.j.h;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: Permissions */
public class e {
    private final Map<String, d> a;

    e(Map<String, d> map) {
        h.c(map);
        this.a = map;
    }

    private boolean e(d dVar) {
        return this.a.containsValue(dVar);
    }

    public boolean a() {
        for (d dVar : this.a.values()) {
            if (dVar != d.GRANTED) {
                return false;
            }
        }
        return true;
    }

    public boolean b() {
        return e(d.DENIED);
    }

    public Set<a> c(d dVar) {
        HashSet hashSet = new HashSet();
        for (String next : this.a.keySet()) {
            if (this.a.get(next) == dVar) {
                hashSet.add(new a(next, this.a.get(next)));
            }
        }
        return hashSet;
    }

    public Set<a> d() {
        HashSet hashSet = new HashSet();
        for (String next : this.a.keySet()) {
            hashSet.add(new a(next, this.a.get(next)));
        }
        return hashSet;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((e) obj).a);
    }

    public boolean f() {
        return e(d.REQUEST_PERMISSION);
    }

    public boolean g() {
        return e(d.SHOW_RATIONALE);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Permissions{\n");
        for (String next : this.a.keySet()) {
            sb.append("  ");
            sb.append(next);
            sb.append(" : ");
            sb.append(this.a.get(next));
            sb.append("\n");
        }
        sb.append('}');
        return sb.toString();
    }
}
