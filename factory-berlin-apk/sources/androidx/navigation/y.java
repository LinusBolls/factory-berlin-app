package androidx.navigation;

import android.annotation.SuppressLint;
import androidx.navigation.x;
import java.util.HashMap;
import java.util.Map;

@SuppressLint({"TypeParameterUnusedInFormals"})
/* compiled from: NavigatorProvider */
public class y {
    private static final HashMap<Class<?>, String> b = new HashMap<>();
    private final HashMap<String, x<? extends o>> a = new HashMap<>();

    static String c(Class<? extends x> cls) {
        String str = b.get(cls);
        if (str == null) {
            x.b bVar = (x.b) cls.getAnnotation(x.b.class);
            str = bVar != null ? bVar.value() : null;
            if (f(str)) {
                b.put(cls, str);
            } else {
                throw new IllegalArgumentException("No @Navigator.Name annotation found for " + cls.getSimpleName());
            }
        }
        return str;
    }

    private static boolean f(String str) {
        return str != null && !str.isEmpty();
    }

    public final x<? extends o> a(x<? extends o> xVar) {
        return b(c(xVar.getClass()), xVar);
    }

    public x<? extends o> b(String str, x<? extends o> xVar) {
        if (f(str)) {
            return this.a.put(str, xVar);
        }
        throw new IllegalArgumentException("navigator name cannot be an empty string");
    }

    public <T extends x<?>> T d(String str) {
        if (f(str)) {
            T t = (x) this.a.get(str);
            if (t != null) {
                return t;
            }
            throw new IllegalStateException("Could not find Navigator with name \"" + str + "\". You must call NavController.addNavigator() for each navigation type.");
        }
        throw new IllegalArgumentException("navigator name cannot be an empty string");
    }

    /* access modifiers changed from: package-private */
    public Map<String, x<? extends o>> e() {
        return this.a;
    }
}
