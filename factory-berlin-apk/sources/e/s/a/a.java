package e.s.a;

/* compiled from: SimpleSQLiteQuery */
public final class a implements e {

    /* renamed from: g  reason: collision with root package name */
    private final String f8881g;

    /* renamed from: h  reason: collision with root package name */
    private final Object[] f8882h;

    public a(String str, Object[] objArr) {
        this.f8881g = str;
        this.f8882h = objArr;
    }

    private static void c(d dVar, int i2, Object obj) {
        if (obj == null) {
            dVar.bindNull(i2);
        } else if (obj instanceof byte[]) {
            dVar.bindBlob(i2, (byte[]) obj);
        } else if (obj instanceof Float) {
            dVar.bindDouble(i2, (double) ((Float) obj).floatValue());
        } else if (obj instanceof Double) {
            dVar.bindDouble(i2, ((Double) obj).doubleValue());
        } else if (obj instanceof Long) {
            dVar.bindLong(i2, ((Long) obj).longValue());
        } else if (obj instanceof Integer) {
            dVar.bindLong(i2, (long) ((Integer) obj).intValue());
        } else if (obj instanceof Short) {
            dVar.bindLong(i2, (long) ((Short) obj).shortValue());
        } else if (obj instanceof Byte) {
            dVar.bindLong(i2, (long) ((Byte) obj).byteValue());
        } else if (obj instanceof String) {
            dVar.bindString(i2, (String) obj);
        } else if (obj instanceof Boolean) {
            dVar.bindLong(i2, ((Boolean) obj).booleanValue() ? 1 : 0);
        } else {
            throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i2 + " Supported types: null, byte[], float, double, long, int, short, byte," + " string");
        }
    }

    public static void d(d dVar, Object[] objArr) {
        if (objArr != null) {
            int length = objArr.length;
            int i2 = 0;
            while (i2 < length) {
                Object obj = objArr[i2];
                i2++;
                c(dVar, i2, obj);
            }
        }
    }

    public String a() {
        return this.f8881g;
    }

    public void b(d dVar) {
        d(dVar, this.f8882h);
    }

    public a(String str) {
        this(str, (Object[]) null);
    }
}
