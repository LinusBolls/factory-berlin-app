package g.b.a.a.i.x;

import android.util.SparseArray;
import g.b.a.a.d;
import java.util.EnumMap;

/* compiled from: PriorityMapping */
public final class a {
    private static SparseArray<d> a = new SparseArray<>();
    private static EnumMap<d, Integer> b;

    static {
        EnumMap<d, Integer> enumMap = new EnumMap<>(d.class);
        b = enumMap;
        enumMap.put(d.DEFAULT, 0);
        b.put(d.VERY_LOW, 1);
        b.put(d.HIGHEST, 2);
        for (d next : b.keySet()) {
            a.append(b.get(next).intValue(), next);
        }
    }

    public static int a(d dVar) {
        Integer num = b.get(dVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + dVar);
    }

    public static d b(int i2) {
        d dVar = a.get(i2);
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException("Unknown Priority for value " + i2);
    }
}
