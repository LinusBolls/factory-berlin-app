package com.sensorberg.smartworkspace.app.screens.door.d;

import com.sensorberg.factory.R;
import com.sensorberg.smartspaces.sdk.model.IotUnit;
import kotlin.jvm.internal.k;

/* compiled from: FavoriteListItemModel.kt */
public final class i extends c {
    private final float b;
    private final int c;

    /* renamed from: d  reason: collision with root package name */
    private final IotUnit f7386d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f7387e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(IotUnit iotUnit, boolean z) {
        super(1, R.layout.item_favorite_unit, (DefaultConstructorMarker) null);
        k.e(iotUnit, "unit");
        this.f7386d = iotUnit;
        this.f7387e = z;
        this.b = iotUnit.isNearby() ? 1.0f : 0.5f;
        this.c = this.f7387e ? R.drawable.ic_favorite_nonempty : R.drawable.ic_favorite_empty;
    }

    public final float b() {
        return this.b;
    }

    public final int c() {
        return this.c;
    }

    public final IotUnit d() {
        return this.f7386d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!k.a(i.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj != null) {
            i iVar = (i) obj;
            return !(k.a(this.f7386d.getId(), iVar.f7386d.getId()) ^ true) && !(k.a(this.f7386d.getDisplayName(), iVar.f7386d.getDisplayName()) ^ true) && this.f7386d.isNearby() == iVar.f7386d.isNearby() && this.f7387e == iVar.f7387e;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.sensorberg.smartworkspace.app.screens.door.favorites.FavoritesUnit");
    }

    public int hashCode() {
        return (this.f7386d.hashCode() * 31) + b.a(this.f7387e);
    }
}
