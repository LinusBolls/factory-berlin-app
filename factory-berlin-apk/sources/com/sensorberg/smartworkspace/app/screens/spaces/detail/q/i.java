package com.sensorberg.smartworkspace.app.screens.spaces.detail.q;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.sensorberg.factory.R;
import com.sensorberg.smartworkspace.app.screens.spaces.detail.p;
import com.sensorberg.smartworkspace.app.widgets.CaptionedSeekBar;
import com.sensorberg.smartworkspace.app.widgets.IotDeviceDetailsSeekBar;
import g.e.d.c;
import kotlin.jvm.internal.k;
import kotlin.x;

/* compiled from: SeekbarViewHolder.kt */
public final class i extends c {
    private final IotDeviceDetailsSeekBar u;
    private p.f v;

    /* compiled from: SeekbarViewHolder.kt */
    public static final class a implements CaptionedSeekBar.c {
        final /* synthetic */ IotDeviceDetailsSeekBar a;
        final /* synthetic */ i b;
        final /* synthetic */ p.f.a c;

        a(IotDeviceDetailsSeekBar iotDeviceDetailsSeekBar, i iVar, ValueAnimator valueAnimator, p.f.a aVar) {
            this.a = iotDeviceDetailsSeekBar;
            this.b = iVar;
            this.c = aVar;
        }

        public void a(int i2) {
            this.c.q(i.M(this.b), i2);
            this.a.setIsLoading(true);
        }
    }

    /* compiled from: SeekbarViewHolder.kt */
    public static final class b implements CaptionedSeekBar.d {
        final /* synthetic */ p.f a;

        b(p.f fVar) {
            this.a = fVar;
        }

        public String a(int i2) {
            String h2 = this.a.h();
            return ((int) this.a.f().b(i2)) + h2;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(ViewGroup viewGroup, ValueAnimator valueAnimator, p.f.a aVar) {
        super(R.layout.viewholder_seekbar, viewGroup);
        k.e(viewGroup, "viewGroup");
        k.e(valueAnimator, "animator");
        k.e(aVar, "seekBarProgressChangeListener");
        View findViewById = this.a.findViewById(R.id.viewholder_seekbar);
        IotDeviceDetailsSeekBar iotDeviceDetailsSeekBar = (IotDeviceDetailsSeekBar) findViewById;
        iotDeviceDetailsSeekBar.setValueAnimator(valueAnimator);
        iotDeviceDetailsSeekBar.a(new a(iotDeviceDetailsSeekBar, this, valueAnimator, aVar));
        x xVar = x.a;
        k.d(findViewById, "itemView.findViewById<Io…oading(true)\n\t\t\t}\n\t\t})\n\t}");
        this.u = iotDeviceDetailsSeekBar;
        View view = this.a;
        k.d(view, "itemView");
        com.sensorberg.smartworkspace.app.screens.spaces.a aVar2 = com.sensorberg.smartworkspace.app.screens.spaces.a.a;
        Context context = viewGroup.getContext();
        k.d(context, "viewGroup.context");
        view.setBackground(aVar2.b(context, R.color.surface));
    }

    public static final /* synthetic */ p.f M(i iVar) {
        p.f fVar = iVar.v;
        if (fVar != null) {
            return fVar;
        }
        k.q("seekBarRow");
        throw null;
    }

    public final void N(p.f fVar) {
        k.e(fVar, "item");
        this.v = fVar;
        IotDeviceDetailsSeekBar iotDeviceDetailsSeekBar = this.u;
        iotDeviceDetailsSeekBar.setTitle(fVar.g());
        iotDeviceDetailsSeekBar.setProgress((int) fVar.e().getValue());
        iotDeviceDetailsSeekBar.setIsLoading(fVar.i());
        iotDeviceDetailsSeekBar.setFormatter(new b(fVar));
    }
}
