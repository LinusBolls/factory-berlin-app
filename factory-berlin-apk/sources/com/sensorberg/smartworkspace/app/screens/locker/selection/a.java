package com.sensorberg.smartworkspace.app.screens.locker.selection;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.h;
import androidx.recyclerview.widget.q;
import com.sensorberg.factory.R;
import com.sensorberg.smartworkspace.app.screens.locker.LockerGroupSelection;
import kotlin.e0.c.l;
import kotlin.jvm.internal.k;
import kotlin.x;

/* compiled from: LockerGroupSelectionAdapter.kt */
public final class a extends q<LockerGroupSelection, c> {

    /* renamed from: l  reason: collision with root package name */
    private static final h.d<LockerGroupSelection> f7652l = new C0514a();

    /* renamed from: k  reason: collision with root package name */
    private final l<LockerGroupSelection, x> f7653k;

    /* renamed from: com.sensorberg.smartworkspace.app.screens.locker.selection.a$a  reason: collision with other inner class name */
    /* compiled from: LockerGroupSelectionAdapter.kt */
    public static final class C0514a extends h.d<LockerGroupSelection> {
        C0514a() {
        }

        @SuppressLint({"DiffUtilEquals"})
        /* renamed from: d */
        public boolean a(LockerGroupSelection lockerGroupSelection, LockerGroupSelection lockerGroupSelection2) {
            k.e(lockerGroupSelection, "oldItem");
            k.e(lockerGroupSelection2, "newItem");
            return k.a(lockerGroupSelection, lockerGroupSelection2);
        }

        /* renamed from: e */
        public boolean b(LockerGroupSelection lockerGroupSelection, LockerGroupSelection lockerGroupSelection2) {
            k.e(lockerGroupSelection, "oldItem");
            k.e(lockerGroupSelection2, "newItem");
            return k.a(lockerGroupSelection.getId(), lockerGroupSelection2.getId());
        }
    }

    /* compiled from: LockerGroupSelectionAdapter.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: LockerGroupSelectionAdapter.kt */
    public static final class c extends g.e.d.c {
        private final TextView u;
        private LockerGroupSelection v;

        /* renamed from: com.sensorberg.smartworkspace.app.screens.locker.selection.a$c$a  reason: collision with other inner class name */
        /* compiled from: LockerGroupSelectionAdapter.kt */
        static final class C0515a implements View.OnClickListener {

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ c f7654g;

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ l f7655h;

            C0515a(c cVar, l lVar) {
                this.f7654g = cVar;
                this.f7655h = lVar;
            }

            public final void onClick(View view) {
                this.f7655h.o(c.M(this.f7654g));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(ViewGroup viewGroup, l<? super LockerGroupSelection, x> lVar) {
            super(R.layout.viewholder_locker_group_selection, viewGroup);
            k.e(viewGroup, "viewGroup");
            k.e(lVar, "onTap");
            View findViewById = this.a.findViewById(R.id.viewholder_locker_group_selection_name);
            k.d(findViewById, "itemView.findViewById(R.…ker_group_selection_name)");
            this.u = (TextView) findViewById;
            this.a.setOnClickListener(new C0515a(this, lVar));
        }

        public static final /* synthetic */ LockerGroupSelection M(c cVar) {
            LockerGroupSelection lockerGroupSelection = cVar.v;
            if (lockerGroupSelection != null) {
                return lockerGroupSelection;
            }
            k.q("group");
            throw null;
        }

        public final void N(LockerGroupSelection lockerGroupSelection) {
            k.e(lockerGroupSelection, "group");
            this.v = lockerGroupSelection;
            this.u.setText(lockerGroupSelection.getDisplayName());
        }
    }

    static {
        new b((DefaultConstructorMarker) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(l<? super LockerGroupSelection, x> lVar) {
        super(f7652l);
        k.e(lVar, "onTap");
        this.f7653k = lVar;
    }

    /* renamed from: L */
    public void x(c cVar, int i2) {
        k.e(cVar, "holder");
        Object I = I(i2);
        k.d(I, "getItem(position)");
        cVar.N((LockerGroupSelection) I);
    }

    /* renamed from: M */
    public c z(ViewGroup viewGroup, int i2) {
        k.e(viewGroup, "parent");
        return new c(viewGroup, this.f7653k);
    }
}
