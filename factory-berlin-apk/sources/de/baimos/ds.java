package de.baimos;

public class ds {
    private static Class a;

    static {
        try {
            Class<?> cls = Class.forName("android.util.Log");
            a = cls;
            cls.getMethod("isLoggable", new Class[]{String.class, Integer.TYPE}).invoke((Object) null, new Object[]{"test", 1});
            a = bf.class;
        } catch (Exception unused) {
            a = bi.class;
        }
    }

    public static dr a(Class cls) {
        try {
            return (dr) a.getDeclaredConstructor(new Class[]{Class.class}).newInstance(new Object[]{cls});
        } catch (Exception e2) {
            throw new RuntimeException("failed to initialize logger", e2);
        }
    }
}
