package e.h.i;

import android.icu.util.ULocale;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

/* compiled from: ICUCompat */
public final class b {
    private static Method a;
    private static Method b;

    static {
        Class<String> cls = String.class;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 21) {
            try {
                Class<?> cls2 = Class.forName("libcore.icu.ICU");
                if (cls2 != null) {
                    a = cls2.getMethod("getScript", new Class[]{cls});
                    b = cls2.getMethod("addLikelySubtags", new Class[]{cls});
                }
            } catch (Exception e2) {
                a = null;
                b = null;
                Log.w("ICUCompat", e2);
            }
        } else if (i2 < 24) {
            try {
                b = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", new Class[]{Locale.class});
            } catch (Exception e3) {
                throw new IllegalStateException(e3);
            }
        }
    }

    private static String a(Locale locale) {
        String locale2 = locale.toString();
        try {
            if (b != null) {
                return (String) b.invoke((Object) null, new Object[]{locale2});
            }
        } catch (IllegalAccessException e2) {
            Log.w("ICUCompat", e2);
        } catch (InvocationTargetException e3) {
            Log.w("ICUCompat", e3);
        }
        return locale2;
    }

    private static String b(String str) {
        try {
            if (a != null) {
                return (String) a.invoke((Object) null, new Object[]{str});
            }
        } catch (IllegalAccessException e2) {
            Log.w("ICUCompat", e2);
        } catch (InvocationTargetException e3) {
            Log.w("ICUCompat", e3);
        }
        return null;
    }

    public static String c(Locale locale) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 24) {
            return ULocale.addLikelySubtags(ULocale.forLocale(locale)).getScript();
        }
        if (i2 >= 21) {
            try {
                return ((Locale) b.invoke((Object) null, new Object[]{locale})).getScript();
            } catch (InvocationTargetException e2) {
                Log.w("ICUCompat", e2);
                return locale.getScript();
            } catch (IllegalAccessException e3) {
                Log.w("ICUCompat", e3);
                return locale.getScript();
            }
        } else {
            String a2 = a(locale);
            if (a2 != null) {
                return b(a2);
            }
            return null;
        }
    }
}
