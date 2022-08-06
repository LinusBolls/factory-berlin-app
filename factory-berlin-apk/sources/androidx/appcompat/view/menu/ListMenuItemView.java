package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.w0;
import e.a.a;
import e.a.f;
import e.a.g;
import e.a.j;
import e.h.k.u;

public class ListMenuItemView extends LinearLayout implements n.a, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: g  reason: collision with root package name */
    private i f185g;

    /* renamed from: h  reason: collision with root package name */
    private ImageView f186h;

    /* renamed from: i  reason: collision with root package name */
    private RadioButton f187i;

    /* renamed from: j  reason: collision with root package name */
    private TextView f188j;

    /* renamed from: k  reason: collision with root package name */
    private CheckBox f189k;

    /* renamed from: l  reason: collision with root package name */
    private TextView f190l;

    /* renamed from: m  reason: collision with root package name */
    private ImageView f191m;

    /* renamed from: n  reason: collision with root package name */
    private ImageView f192n;
    private LinearLayout o;
    private Drawable p;
    private int q;
    private Context r;
    private boolean s;
    private Drawable t;
    private boolean u;
    private LayoutInflater v;
    private boolean w;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.listMenuViewStyle);
    }

    private void a(View view) {
        b(view, -1);
    }

    private void b(View view, int i2) {
        LinearLayout linearLayout = this.o;
        if (linearLayout != null) {
            linearLayout.addView(view, i2);
        } else {
            addView(view, i2);
        }
    }

    private void c() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(g.abc_list_menu_item_checkbox, this, false);
        this.f189k = checkBox;
        a(checkBox);
    }

    private void f() {
        ImageView imageView = (ImageView) getInflater().inflate(g.abc_list_menu_item_icon, this, false);
        this.f186h = imageView;
        b(imageView, 0);
    }

    private void g() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(g.abc_list_menu_item_radio, this, false);
        this.f187i = radioButton;
        a(radioButton);
    }

    private LayoutInflater getInflater() {
        if (this.v == null) {
            this.v = LayoutInflater.from(getContext());
        }
        return this.v;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.f191m;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f192n;
        if (imageView != null && imageView.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f192n.getLayoutParams();
            rect.top += this.f192n.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
        }
    }

    public boolean d() {
        return false;
    }

    public void e(i iVar, int i2) {
        this.f185g = iVar;
        setVisibility(iVar.isVisible() ? 0 : 8);
        setTitle(iVar.i(this));
        setCheckable(iVar.isCheckable());
        h(iVar.A(), iVar.g());
        setIcon(iVar.getIcon());
        setEnabled(iVar.isEnabled());
        setSubMenuArrowVisible(iVar.hasSubMenu());
        setContentDescription(iVar.getContentDescription());
    }

    public i getItemData() {
        return this.f185g;
    }

    public void h(boolean z, char c) {
        int i2 = (!z || !this.f185g.A()) ? 8 : 0;
        if (i2 == 0) {
            this.f190l.setText(this.f185g.h());
        }
        if (this.f190l.getVisibility() != i2) {
            this.f190l.setVisibility(i2);
        }
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        u.h0(this, this.p);
        TextView textView = (TextView) findViewById(f.title);
        this.f188j = textView;
        int i2 = this.q;
        if (i2 != -1) {
            textView.setTextAppearance(this.r, i2);
        }
        this.f190l = (TextView) findViewById(f.shortcut);
        ImageView imageView = (ImageView) findViewById(f.submenuarrow);
        this.f191m = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.t);
        }
        this.f192n = (ImageView) findViewById(f.group_divider);
        this.o = (LinearLayout) findViewById(f.content);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        if (this.f186h != null && this.s) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f186h.getLayoutParams();
            int i4 = layoutParams.height;
            if (i4 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i4;
            }
        }
        super.onMeasure(i2, i3);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        if (z || this.f187i != null || this.f189k != null) {
            if (this.f185g.m()) {
                if (this.f187i == null) {
                    g();
                }
                compoundButton2 = this.f187i;
                compoundButton = this.f189k;
            } else {
                if (this.f189k == null) {
                    c();
                }
                compoundButton2 = this.f189k;
                compoundButton = this.f187i;
            }
            if (z) {
                compoundButton2.setChecked(this.f185g.isChecked());
                if (compoundButton2.getVisibility() != 0) {
                    compoundButton2.setVisibility(0);
                }
                if (compoundButton != null && compoundButton.getVisibility() != 8) {
                    compoundButton.setVisibility(8);
                    return;
                }
                return;
            }
            CheckBox checkBox = this.f189k;
            if (checkBox != null) {
                checkBox.setVisibility(8);
            }
            RadioButton radioButton = this.f187i;
            if (radioButton != null) {
                radioButton.setVisibility(8);
            }
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if (this.f185g.m()) {
            if (this.f187i == null) {
                g();
            }
            compoundButton = this.f187i;
        } else {
            if (this.f189k == null) {
                c();
            }
            compoundButton = this.f189k;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.w = z;
        this.s = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.f192n;
        if (imageView != null) {
            imageView.setVisibility((this.u || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z = this.f185g.z() || this.w;
        if (!z && !this.s) {
            return;
        }
        if (this.f186h != null || drawable != null || this.s) {
            if (this.f186h == null) {
                f();
            }
            if (drawable != null || this.s) {
                ImageView imageView = this.f186h;
                if (!z) {
                    drawable = null;
                }
                imageView.setImageDrawable(drawable);
                if (this.f186h.getVisibility() != 0) {
                    this.f186h.setVisibility(0);
                    return;
                }
                return;
            }
            this.f186h.setVisibility(8);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence != null) {
            this.f188j.setText(charSequence);
            if (this.f188j.getVisibility() != 0) {
                this.f188j.setVisibility(0);
            }
        } else if (this.f188j.getVisibility() != 8) {
            this.f188j.setVisibility(8);
        }
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet);
        w0 u2 = w0.u(getContext(), attributeSet, j.MenuView, i2, 0);
        this.p = u2.g(j.MenuView_android_itemBackground);
        this.q = u2.n(j.MenuView_android_itemTextAppearance, -1);
        this.s = u2.a(j.MenuView_preserveIconSpacing, false);
        this.r = context;
        this.t = u2.g(j.MenuView_subMenuArrow);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes((AttributeSet) null, new int[]{16843049}, a.dropDownListViewStyle, 0);
        this.u = obtainStyledAttributes.hasValue(0);
        u2.v();
        obtainStyledAttributes.recycle();
    }
}
