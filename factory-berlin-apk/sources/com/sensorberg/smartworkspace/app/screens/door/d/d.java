package com.sensorberg.smartworkspace.app.screens.door.d;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.f;
import androidx.recyclerview.widget.RecyclerView;
import com.sensorberg.factory.R;
import com.sensorberg.smartspaces.sdk.model.IotUnit;
import com.sensorberg.smartworkspace.app.k.k1;
import com.sensorberg.smartworkspace.app.k.m1;
import com.sensorberg.smartworkspace.app.screens.door.d.c;
import kotlin.e0.c.l;
import kotlin.jvm.internal.k;
import kotlin.x;

/* compiled from: FavoriteListViewHolder.kt */
public abstract class d<T extends c, B extends ViewDataBinding> extends RecyclerView.d0 {
    public static final a t = new a((DefaultConstructorMarker) null);

    /* compiled from: FavoriteListViewHolder.kt */
    public static final class a {
        private a() {
        }

        public final d<c, ViewDataBinding> a(ViewGroup viewGroup, int i2, l<? super IotUnit, x> lVar, l<? super IotUnit, x> lVar2) {
            k.e(viewGroup, "parent");
            if (i2 == 1) {
                ViewDataBinding g2 = f.g(LayoutInflater.from(viewGroup.getContext()), R.layout.item_favorite_unit, (ViewGroup) null, false);
                k.d(g2, "DataBindingUtil.inflate(…vorite_unit, null, false)");
                return new h(viewGroup, (m1) g2, lVar, lVar2);
            } else if (i2 == 2) {
                ViewDataBinding g3 = f.g(LayoutInflater.from(viewGroup.getContext()), R.layout.item_favorite_header, (ViewGroup) null, false);
                k.d(g3, "DataBindingUtil.inflate(…rite_header, null, false)");
                return new g(viewGroup, (k1) g3);
            } else {
                throw new IllegalArgumentException("unknown view type");
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private d(View view) {
        super(view);
    }

    public abstract void M(T t2);

    public /* synthetic */ d(View view, DefaultConstructorMarker defaultConstructorMarker) {
        this(view);
    }
}
