package com.sensorberg.smartworkspace.app.screens.door.opening;

import com.sensorberg.core.view.IotUnitImageView;
import com.sensorberg.smartspaces.sdk.model.IotUnit;
import com.sensorberg.smartworkspace.app.screens.door.opening.e;
import g.e.m.a;
import g.e.n.g.i;

public final /* synthetic */ class f {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ int[] f7462d;

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ int[] f7463e;

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ int[] f7464f;

    /* renamed from: g  reason: collision with root package name */
    public static final /* synthetic */ int[] f7465g;

    static {
        int[] iArr = new int[e.a.values().length];
        a = iArr;
        iArr[e.a.OPENING.ordinal()] = 1;
        a[e.a.LOADING.ordinal()] = 2;
        a[e.a.OPENING_SUCCESS.ordinal()] = 3;
        a[e.a.OPENING_FAILED.ordinal()] = 4;
        int[] iArr2 = new int[a.b.values().length];
        b = iArr2;
        iArr2[a.b.SUCCESS.ordinal()] = 1;
        b[a.b.FAIL.ordinal()] = 2;
        b[a.b.EXECUTING.ordinal()] = 3;
        int[] iArr3 = new int[e.a.values().length];
        c = iArr3;
        iArr3[e.a.OPENING_SUCCESS.ordinal()] = 1;
        c[e.a.OPENING_FAILED.ordinal()] = 2;
        int[] iArr4 = new int[IotUnitImageView.b.values().length];
        f7462d = iArr4;
        iArr4[IotUnitImageView.b.Default.ordinal()] = 1;
        f7462d[IotUnitImageView.b.Success.ordinal()] = 2;
        f7462d[IotUnitImageView.b.Fail.ordinal()] = 3;
        int[] iArr5 = new int[IotUnit.HardwareType.values().length];
        f7463e = iArr5;
        iArr5[IotUnit.HardwareType.SB_GATEWAY.ordinal()] = 1;
        f7463e[IotUnit.HardwareType.BLUE_ID.ordinal()] = 2;
        int[] iArr6 = new int[a.b.values().length];
        f7464f = iArr6;
        iArr6[a.b.SUCCESS.ordinal()] = 1;
        f7464f[a.b.FAIL.ordinal()] = 2;
        int[] iArr7 = new int[i.values().length];
        f7465g = iArr7;
        iArr7[i.SearchingNearby.ordinal()] = 1;
        f7465g[i.SearchingUnit.ordinal()] = 2;
        f7465g[i.Connecting.ordinal()] = 3;
    }
}
