package com.sensorberg.smartworkspace.app.utils;

import android.content.SharedPreferences;
import java.util.HashSet;
import java.util.Set;
import kotlin.jvm.internal.k;

/* compiled from: FavoritesHelper.kt */
public final class e {
    private final SharedPreferences a;

    /* compiled from: FavoritesHelper.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new a((DefaultConstructorMarker) null);
    }

    public e(l lVar) {
        k.e(lVar, "sharedPreferenceProvider");
        this.a = lVar.a("favorites", false);
    }

    private final void a(String str, Set<String> set) {
        if (set.add(str)) {
            n.a.a.a("successfully added " + str + " to favorites", new Object[0]);
        } else {
            n.a.a.a("FAILED to add " + str + " to favorites", new Object[0]);
        }
        e(set);
    }

    private final void c(String str, Set<String> set) {
        n.a.a.a("remove " + str + " from favorites", new Object[0]);
        set.remove(str);
        e(set);
    }

    private final void e(Set<String> set) {
        SharedPreferences.Editor edit = this.a.edit();
        edit.putStringSet("favorite_list", new HashSet(set));
        edit.apply();
    }

    public final Set<String> b() {
        return new HashSet(this.a.getStringSet("favorite_list", new HashSet()));
    }

    public final void d(String str) {
        k.e(str, "id");
        Set<String> b = b();
        if (b.contains(str)) {
            c(str, b);
        } else {
            a(str, b);
        }
    }
}
