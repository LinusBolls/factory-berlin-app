package com.sensorberg.smartworkspace.app.n.a;

import android.app.Dialog;
import android.bluetooth.BluetoothAdapter;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.b;
import androidx.fragment.app.m;
import com.sensorberg.factory.R;
import java.util.HashMap;
import kotlin.jvm.internal.k;

/* compiled from: BluetoothLocationDialog.kt */
public final class b extends androidx.fragment.app.c {
    public static final a u0 = new a((DefaultConstructorMarker) null);
    private final DialogInterface.OnClickListener r0 = new C0478b(this);
    private final DialogInterface.OnClickListener s0 = new c(this);
    private HashMap t0;

    /* compiled from: BluetoothLocationDialog.kt */
    public static final class a {
        private a() {
        }

        public final void a(boolean z, m mVar) {
            k.e(mVar, "fm");
            androidx.fragment.app.c cVar = (androidx.fragment.app.c) mVar.X(z ? "bt_tag" : "lc_tag");
            if (cVar != null) {
                cVar.T1();
            }
        }

        public final void b(boolean z, m mVar) {
            k.e(mVar, "fm");
            String str = "bt_tag";
            if (mVar.X(z ? str : "lc_tag") == null) {
                b bVar = new b();
                Bundle bundle = new Bundle();
                bVar.D1(bundle);
                bVar.Z1(false);
                bundle.putBoolean("isBt", z);
                if (!z) {
                    str = "lc_tag";
                }
                bVar.d2(mVar, str);
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.sensorberg.smartworkspace.app.n.a.b$b  reason: collision with other inner class name */
    /* compiled from: BluetoothLocationDialog.kt */
    static final class C0478b implements DialogInterface.OnClickListener {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ b f7252g;

        C0478b(b bVar) {
            this.f7252g = bVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            if (defaultAdapter != null) {
                defaultAdapter.enable();
            } else if (!g.e.c.c.b.b("BluetoothLocationDialog", 666)) {
                try {
                    this.f7252g.N1(new Intent("android.settings.BLUETOOTH_SETTINGS"));
                } catch (Exception unused) {
                }
            }
        }
    }

    /* compiled from: BluetoothLocationDialog.kt */
    static final class c implements DialogInterface.OnClickListener {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ b f7253g;

        c(b bVar) {
            this.f7253g = bVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            if (!g.e.c.c.b.b("BluetoothLocationDialog", 666)) {
                try {
                    this.f7253g.N1(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                } catch (Exception unused) {
                }
            }
        }
    }

    private final boolean g2() {
        return w1().getBoolean("isBt");
    }

    public /* synthetic */ void D0() {
        super.D0();
        f2();
    }

    public Dialog X1(Bundle bundle) {
        if (g2()) {
            b.a aVar = new b.a(x1());
            aVar.h(R.string.description_bluetooth_required);
            aVar.m(R.string.action_turn_on, this.r0);
            aVar.d(false);
            androidx.appcompat.app.b a2 = aVar.a();
            k.d(a2, "AlertDialog.Builder(requ…able(false)\n\t\t\t\t.create()");
            return a2;
        }
        b.a aVar2 = new b.a(x1());
        aVar2.h(R.string.description_location_required);
        aVar2.m(R.string.action_turn_on, this.s0);
        aVar2.d(false);
        androidx.appcompat.app.b a3 = aVar2.a();
        k.d(a3, "AlertDialog.Builder(requ…able(false)\n\t\t\t\t.create()");
        return a3;
    }

    public void f2() {
        HashMap hashMap = this.t0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }
}
