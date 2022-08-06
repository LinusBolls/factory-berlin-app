package g.e.f;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import androidx.core.content.a;
import java.io.File;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.io.c;
import kotlin.io.e;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.y;

/* compiled from: PreferencesMigration.kt */
public final class d {
    public static final d a = new d();

    private d() {
    }

    @TargetApi(24)
    private final void a(Context context, String str) {
        context.deleteSharedPreferences(str);
    }

    public final File b(Context context, String str) {
        k.f(context, "context");
        k.f(str, "name");
        File c = c(context, str);
        return c != null ? c : d(context, str);
    }

    public final File c(Context context, String str) {
        k.f(context, "context");
        k.f(str, "name");
        File file = new File(a.e(context), "shared_prefs/");
        File file2 = new File(file, str + ".xml");
        if (file2.exists()) {
            return file2;
        }
        return null;
    }

    public final File d(Context context, String str) {
        c<File> a2;
        k.f(context, "context");
        k.f(str, "name");
        File e2 = a.e(context);
        if (e2 == null || (a2 = i.a(e2, e.TOP_DOWN)) == null) {
            return null;
        }
        for (File file : a2) {
            String name = file.getName();
            if (k.a(name, str + ".xml")) {
                return file;
            }
        }
        return null;
    }

    public final boolean e(Context context, String str, SharedPreferences sharedPreferences) {
        k.f(context, "context");
        k.f(str, "name");
        k.f(sharedPreferences, "destination");
        File b = b(context, str);
        if (b == null || !b.exists()) {
            return false;
        }
        SharedPreferences sharedPreferences2 = context.getSharedPreferences(str, 0);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        k.b(edit, "editor");
        k.b(sharedPreferences2, "oldPrefs");
        boolean z = false;
        for (Map.Entry next : sharedPreferences2.getAll().entrySet()) {
            String str2 = (String) next.getKey();
            Object value = next.getValue();
            n.a.a.a("Migrating " + str2 + " from " + str + " preferences", new Object[0]);
            if (value instanceof String) {
                edit.putString(str2, (String) value);
            } else if (value instanceof Boolean) {
                edit.putBoolean(str2, ((Boolean) value).booleanValue());
            } else if (value instanceof Long) {
                edit.putLong(str2, ((Number) value).longValue());
            } else if (value instanceof Float) {
                edit.putFloat(str2, ((Number) value).floatValue());
            } else if (value instanceof Integer) {
                edit.putInt(str2, ((Number) value).intValue());
            } else if (y.j(value)) {
                if (value != null) {
                    edit.putStringSet(str2, y.c(value));
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableSet<kotlin.String>");
                }
            } else if (value == null) {
                throw new IllegalArgumentException("Value should never be null");
            } else {
                throw new IllegalArgumentException("Unexpected type " + value.getClass().getSimpleName());
            }
            z = true;
        }
        edit.apply();
        sharedPreferences2.edit().clear().commit();
        if (Build.VERSION.SDK_INT >= 24) {
            a(context, str);
        }
        b.delete();
        return z;
    }
}
