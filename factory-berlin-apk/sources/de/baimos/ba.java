package de.baimos;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public enum ba {
    SHA1withRSA(0),
    SHA256withRSA(1),
    SHA256withECDSA(2);
    

    /* renamed from: d  reason: collision with root package name */
    private static final Map<Integer, ba> f8208d = null;

    /* renamed from: e  reason: collision with root package name */
    private final int f8210e;

    static {
        f8208d = new HashMap();
        Iterator it = EnumSet.allOf(ba.class).iterator();
        while (it.hasNext()) {
            ba baVar = (ba) it.next();
            f8208d.put(Integer.valueOf(baVar.a()), baVar);
        }
    }

    private ba(int i2) {
        this.f8210e = i2;
    }

    public static ba a(int i2) {
        return f8208d.get(Integer.valueOf(i2));
    }

    public int a() {
        return this.f8210e;
    }
}
