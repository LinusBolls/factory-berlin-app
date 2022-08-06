package com.google.android.material.datepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.datepicker.a;
import com.google.android.material.internal.CheckableImageButton;
import e.h.k.u;
import g.b.a.c.c0.g;
import g.b.a.c.e;
import g.b.a.c.f;
import g.b.a.c.h;
import g.b.a.c.j;
import g.b.a.c.k;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: MaterialDatePicker */
public final class i<S> extends androidx.fragment.app.c {
    static final Object H0 = "CONFIRM_BUTTON_TAG";
    static final Object I0 = "CANCEL_BUTTON_TAG";
    static final Object J0 = "TOGGLE_BUTTON_TAG";
    private int A0;
    private CharSequence B0;
    private boolean C0;
    private TextView D0;
    /* access modifiers changed from: private */
    public CheckableImageButton E0;
    private g F0;
    /* access modifiers changed from: private */
    public Button G0;
    /* access modifiers changed from: private */
    public final LinkedHashSet<j<? super S>> r0 = new LinkedHashSet<>();
    /* access modifiers changed from: private */
    public final LinkedHashSet<View.OnClickListener> s0 = new LinkedHashSet<>();
    private final LinkedHashSet<DialogInterface.OnCancelListener> t0 = new LinkedHashSet<>();
    private final LinkedHashSet<DialogInterface.OnDismissListener> u0 = new LinkedHashSet<>();
    private int v0;
    /* access modifiers changed from: private */
    public d<S> w0;
    private p<S> x0;
    private a y0;
    private h<S> z0;

    /* compiled from: MaterialDatePicker */
    class a implements View.OnClickListener {
        a() {
        }

        public void onClick(View view) {
            Iterator it = i.this.r0.iterator();
            while (it.hasNext()) {
                ((j) it.next()).a(i.this.r2());
            }
            i.this.S1();
        }
    }

    /* compiled from: MaterialDatePicker */
    class b implements View.OnClickListener {
        b() {
        }

        public void onClick(View view) {
            Iterator it = i.this.s0.iterator();
            while (it.hasNext()) {
                ((View.OnClickListener) it.next()).onClick(view);
            }
            i.this.S1();
        }
    }

    /* compiled from: MaterialDatePicker */
    class c implements o<S> {
        c() {
        }

        public void a(S s) {
            i.this.x2();
            if (i.this.w0.M()) {
                i.this.G0.setEnabled(true);
            } else {
                i.this.G0.setEnabled(false);
            }
        }
    }

    /* compiled from: MaterialDatePicker */
    class d implements View.OnClickListener {
        d() {
        }

        public void onClick(View view) {
            i.this.E0.toggle();
            i iVar = i.this;
            iVar.y2(iVar.E0);
            i.this.v2();
        }
    }

    private static Drawable n2(Context context) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842912}, e.a.k.a.a.d(context, e.ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], e.a.k.a.a.d(context, e.ic_edit_black_24dp));
        return stateListDrawable;
    }

    private static int o2(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(g.b.a.c.d.mtrl_calendar_navigation_height) + resources.getDimensionPixelOffset(g.b.a.c.d.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelOffset(g.b.a.c.d.mtrl_calendar_navigation_bottom_padding);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(g.b.a.c.d.mtrl_calendar_days_of_week_height);
        return dimensionPixelSize + dimensionPixelSize2 + (m.f3535k * resources.getDimensionPixelSize(g.b.a.c.d.mtrl_calendar_day_height)) + ((m.f3535k - 1) * resources.getDimensionPixelOffset(g.b.a.c.d.mtrl_calendar_month_vertical_padding)) + resources.getDimensionPixelOffset(g.b.a.c.d.mtrl_calendar_bottom_padding);
    }

    private static int q2(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(g.b.a.c.d.mtrl_calendar_content_padding);
        int i2 = l.p().f3532k;
        return (dimensionPixelOffset * 2) + (resources.getDimensionPixelSize(g.b.a.c.d.mtrl_calendar_day_width) * i2) + ((i2 - 1) * resources.getDimensionPixelOffset(g.b.a.c.d.mtrl_calendar_month_horizontal_padding));
    }

    private int s2(Context context) {
        int i2 = this.v0;
        if (i2 != 0) {
            return i2;
        }
        return this.w0.z(context);
    }

    private void t2(Context context) {
        this.E0.setTag(J0);
        this.E0.setImageDrawable(n2(context));
        u.e0(this.E0, (e.h.k.a) null);
        y2(this.E0);
        this.E0.setOnClickListener(new d());
    }

    static boolean u2(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(g.b.a.c.z.b.c(context, g.b.a.c.b.materialCalendarStyle, h.class.getCanonicalName()), new int[]{16843277});
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z;
    }

    /* access modifiers changed from: private */
    public void v2() {
        this.z0 = h.h2(this.w0, s2(x1()), this.y0);
        this.x0 = this.E0.isChecked() ? k.S1(this.w0, this.y0) : this.z0;
        x2();
        androidx.fragment.app.u i2 = B().i();
        i2.r(f.mtrl_calendar_frame, this.x0);
        i2.l();
        this.x0.Q1(new c());
    }

    public static long w2() {
        return l.p().f3534m;
    }

    /* access modifiers changed from: private */
    public void x2() {
        String p2 = p2();
        this.D0.setContentDescription(String.format(X(j.mtrl_picker_announce_current_selection), new Object[]{p2}));
        this.D0.setText(p2);
    }

    /* access modifiers changed from: private */
    public void y2(CheckableImageButton checkableImageButton) {
        String str;
        if (this.E0.isChecked()) {
            str = checkableImageButton.getContext().getString(j.mtrl_picker_toggle_to_calendar_input_mode);
        } else {
            str = checkableImageButton.getContext().getString(j.mtrl_picker_toggle_to_text_input_mode);
        }
        this.E0.setContentDescription(str);
    }

    public final View A0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(this.C0 ? h.mtrl_picker_fullscreen : h.mtrl_picker_dialog, viewGroup);
        Context context = inflate.getContext();
        if (this.C0) {
            inflate.findViewById(f.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(q2(context), -2));
        } else {
            View findViewById = inflate.findViewById(f.mtrl_calendar_main_pane);
            View findViewById2 = inflate.findViewById(f.mtrl_calendar_frame);
            findViewById.setLayoutParams(new LinearLayout.LayoutParams(q2(context), -1));
            findViewById2.setMinimumHeight(o2(x1()));
        }
        TextView textView = (TextView) inflate.findViewById(f.mtrl_picker_header_selection_text);
        this.D0 = textView;
        u.g0(textView, 1);
        this.E0 = (CheckableImageButton) inflate.findViewById(f.mtrl_picker_header_toggle);
        TextView textView2 = (TextView) inflate.findViewById(f.mtrl_picker_title_text);
        CharSequence charSequence = this.B0;
        if (charSequence != null) {
            textView2.setText(charSequence);
        } else {
            textView2.setText(this.A0);
        }
        t2(context);
        this.G0 = (Button) inflate.findViewById(f.confirm_button);
        if (this.w0.M()) {
            this.G0.setEnabled(true);
        } else {
            this.G0.setEnabled(false);
        }
        this.G0.setTag(H0);
        this.G0.setOnClickListener(new a());
        Button button = (Button) inflate.findViewById(f.cancel_button);
        button.setTag(I0);
        button.setOnClickListener(new b());
        return inflate;
    }

    public final void S0(Bundle bundle) {
        super.S0(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.v0);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.w0);
        a.b bVar = new a.b(this.y0);
        if (this.z0.d2() != null) {
            bVar.b(this.z0.d2().f3534m);
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar.a());
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.A0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.B0);
    }

    public void T0() {
        super.T0();
        Window window = Y1().getWindow();
        if (this.C0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.F0);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = R().getDimensionPixelOffset(g.b.a.c.d.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable(this.F0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new g.b.a.c.t.a(Y1(), rect));
        }
        v2();
    }

    public void U0() {
        this.x0.R1();
        super.U0();
    }

    public final Dialog X1(Bundle bundle) {
        Dialog dialog = new Dialog(x1(), s2(x1()));
        Context context = dialog.getContext();
        this.C0 = u2(context);
        int c2 = g.b.a.c.z.b.c(context, g.b.a.c.b.colorSurface, i.class.getCanonicalName());
        g gVar = new g(context, (AttributeSet) null, g.b.a.c.b.materialCalendarStyle, k.Widget_MaterialComponents_MaterialCalendar);
        this.F0 = gVar;
        gVar.L(context);
        this.F0.U(ColorStateList.valueOf(c2));
        this.F0.T(u.s(dialog.getWindow().getDecorView()));
        return dialog;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.t0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.u0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) Z();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    public String p2() {
        return this.w0.y(C());
    }

    public final S r2() {
        return this.w0.b0();
    }

    public final void w0(Bundle bundle) {
        super.w0(bundle);
        if (bundle == null) {
            bundle = A();
        }
        this.v0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.w0 = (d) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.y0 = (a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.A0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.B0 = bundle.getCharSequence("TITLE_TEXT_KEY");
    }
}
