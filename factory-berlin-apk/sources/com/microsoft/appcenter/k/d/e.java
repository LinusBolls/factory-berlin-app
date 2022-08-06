package com.microsoft.appcenter.k.d;

import java.util.List;

/* compiled from: LogContainer */
public class e {
    private List<d> a;

    public List<d> a() {
        return this.a;
    }

    public void b(List<d> list) {
        this.a = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        List<d> list = this.a;
        List<d> list2 = ((e) obj).a;
        if (list != null) {
            return list.equals(list2);
        }
        if (list2 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        List<d> list = this.a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }
}
