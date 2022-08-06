package com.sensorberg.smartworkspace.app.screens.door.d;

import com.sensorberg.factory.R;
import kotlin.jvm.internal.k;

/* compiled from: FavoriteListItemModel.kt */
public final class f extends c {
    private final String b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(String str) {
        super(2, R.layout.item_favorite_unit, (DefaultConstructorMarker) null);
        k.e(str, "title");
        this.b = str;
    }

    public final String b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!k.a(f.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj != null) {
            return !(k.a(this.b, ((f) obj).b) ^ true);
        }
        throw new NullPointerException("null cannot be cast to non-null type com.sensorberg.smartworkspace.app.screens.door.favorites.FavoritesHeader");
    }

    public int hashCode() {
        return this.b.hashCode();
    }
}
