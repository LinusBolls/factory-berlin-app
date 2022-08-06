package androidx.fragment.app;

import androidx.fragment.app.Fragment;
import e.e.g;

/* compiled from: FragmentFactory */
public class i {
    private static final g<String, Class<?>> a = new g<>();

    static boolean b(ClassLoader classLoader, String str) {
        try {
            return Fragment.class.isAssignableFrom(c(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    private static Class<?> c(ClassLoader classLoader, String str) {
        Class<?> cls = a.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        a.put(str, cls2);
        return cls2;
    }

    public static Class<? extends Fragment> d(ClassLoader classLoader, String str) {
        try {
            return c(classLoader, str);
        } catch (ClassNotFoundException e2) {
            throw new Fragment.InstantiationException("Unable to instantiate fragment " + str + ": make sure class name exists", e2);
        } catch (ClassCastException e3) {
            throw new Fragment.InstantiationException("Unable to instantiate fragment " + str + ": make sure class is a valid subclass of Fragment", e3);
        }
    }

    public abstract Fragment a(ClassLoader classLoader, String str);
}
