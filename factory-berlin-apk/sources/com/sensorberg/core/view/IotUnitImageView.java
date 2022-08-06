package com.sensorberg.core.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.o;
import com.sensorberg.smartspaces.sdk.model.IotUnit;
import g.e.d.h;
import kotlin.NoWhenBranchMatchedException;
import kotlin.i;
import kotlin.jvm.internal.k;

@i(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 $2\u00020\u0001:\u0002$%B\u001b\b\u0016\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001f\u0010 B\u0011\b\u0016\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001f\u0010!B!\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\u0006\u0010\"\u001a\u00020\u0017¢\u0006\u0004\b\u001f\u0010#J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u001a¨\u0006&"}, d2 = {"Lcom/sensorberg/core/view/IotUnitImageView;", "Landroidx/appcompat/widget/o;", "", "onDataChanged", "()V", "Lcom/sensorberg/smartspaces/sdk/model/IotUnit;", "iotUnit", "setIotUnit", "(Lcom/sensorberg/smartspaces/sdk/model/IotUnit;)V", "Lcom/sensorberg/core/view/IotUnitImageView$State;", "state", "setState", "(Lcom/sensorberg/core/view/IotUnitImageView$State;)V", "Landroid/graphics/drawable/Drawable;", "defaultDrawable", "Landroid/graphics/drawable/Drawable;", "Lcom/sensorberg/smartspaces/sdk/model/IotUnit$HardwareType;", "hardwareType", "Lcom/sensorberg/smartspaces/sdk/model/IotUnit$HardwareType;", "Lcom/sensorberg/core/view/Size;", "imageSize", "Lcom/sensorberg/core/view/Size;", "Lcom/sensorberg/smartspaces/sdk/model/IotUnit;", "", "sourceDrawable", "I", "Lcom/sensorberg/core/view/IotUnitImageView$State;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "State", "core_release"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
/* compiled from: IotUnitImageView.kt */
public final class IotUnitImageView extends o {
    private static final int[] o = {g.e.d.i.gateway, g.e.d.i.gateway_small, g.e.d.i.gateway_success, g.e.d.i.gateway_fail};
    private static final int[] p = {g.e.d.i.cylinder, g.e.d.i.cylinder_small, g.e.d.i.cylinder_success, g.e.d.i.cylinder_fail};

    /* renamed from: i  reason: collision with root package name */
    private final Drawable f5051i;

    /* renamed from: j  reason: collision with root package name */
    private final c f5052j;

    /* renamed from: k  reason: collision with root package name */
    private b f5053k;

    /* renamed from: l  reason: collision with root package name */
    private IotUnit f5054l;

    /* renamed from: m  reason: collision with root package name */
    private int f5055m;

    /* renamed from: n  reason: collision with root package name */
    private IotUnit.HardwareType f5056n;

    /* compiled from: IotUnitImageView.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: IotUnitImageView.kt */
    public enum b {
        Default(0),
        Success(2),
        Fail(3);
        

        /* renamed from: g  reason: collision with root package name */
        private final int f5061g;

        private b(int i2) {
            this.f5061g = i2;
        }

        public final int a() {
            return this.f5061g;
        }
    }

    static {
        new a((DefaultConstructorMarker) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IotUnitImageView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        float f2;
        k.e(context, "context");
        this.f5053k = b.Default;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, g.e.d.k.IotUnitImageView, 0, 0);
        try {
            int i3 = obtainStyledAttributes.getInt(g.e.d.k.IotUnitImageView_iotUnit_size, 0);
            this.f5052j = i3 == 1 ? new e(context) : new a(context);
            if (i3 == 1) {
                f2 = 0.0f;
            } else {
                f2 = obtainStyledAttributes.getDimension(g.e.d.k.IotUnitImageView_android_elevation, context.getResources().getDimension(h.iotUnitElevation));
            }
            setElevation(f2);
            this.f5051i = obtainStyledAttributes.getDrawable(g.e.d.k.IotUnitImageView_iotUnit_defaultSrc);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private final void c() {
        int i2;
        IotUnit iotUnit = this.f5054l;
        if (iotUnit == null) {
            this.f5055m = 0;
            setImageDrawable(this.f5051i);
            return;
        }
        int i3 = b.a[iotUnit.getHardwareType().ordinal()];
        if (i3 == 1) {
            i2 = o[this.f5053k.a()];
        } else if (i3 == 2) {
            i2 = p[this.f5053k.a()];
        } else {
            throw new NoWhenBranchMatchedException();
        }
        if (i2 != this.f5055m) {
            this.f5055m = i2;
            setImageResource(i2);
        }
        if (iotUnit.getHardwareType() != this.f5056n) {
            this.f5056n = iotUnit.getHardwareType();
            setOutlineProvider(this.f5052j.d(iotUnit.getHardwareType()));
        }
    }

    public final void setIotUnit(IotUnit iotUnit) {
        this.f5054l = iotUnit;
        c();
    }

    public final void setState(b bVar) {
        k.e(bVar, "state");
        if (!(this.f5052j instanceof e)) {
            this.f5053k = bVar;
            c();
            return;
        }
        throw new IllegalStateException("Small unit cannot have state");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public IotUnitImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        k.e(context, "context");
    }
}
