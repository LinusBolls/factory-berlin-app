package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.b;
import androidx.appcompat.view.menu.p;
import e.h.k.t;
import e.h.k.u;

/* compiled from: AppCompatSpinner */
public class w extends Spinner implements t {
    private static final int[] o = {16843505};

    /* renamed from: g  reason: collision with root package name */
    private final e f520g;

    /* renamed from: h  reason: collision with root package name */
    private final Context f521h;

    /* renamed from: i  reason: collision with root package name */
    private h0 f522i;

    /* renamed from: j  reason: collision with root package name */
    private SpinnerAdapter f523j;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f524k;

    /* renamed from: l  reason: collision with root package name */
    private g f525l;

    /* renamed from: m  reason: collision with root package name */
    int f526m;

    /* renamed from: n  reason: collision with root package name */
    final Rect f527n;

    /* compiled from: AppCompatSpinner */
    class a extends h0 {
        final /* synthetic */ e p;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(View view, e eVar) {
            super(view);
            this.p = eVar;
        }

        public p b() {
            return this.p;
        }

        @SuppressLint({"SyntheticAccessor"})
        public boolean c() {
            if (w.this.getInternalPopup().c()) {
                return true;
            }
            w.this.b();
            return true;
        }
    }

    /* compiled from: AppCompatSpinner */
    class b implements ViewTreeObserver.OnGlobalLayoutListener {
        b() {
        }

        public void onGlobalLayout() {
            if (!w.this.getInternalPopup().c()) {
                w.this.b();
            }
            ViewTreeObserver viewTreeObserver = w.this.getViewTreeObserver();
            if (viewTreeObserver == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 16) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            } else {
                viewTreeObserver.removeGlobalOnLayoutListener(this);
            }
        }
    }

    /* compiled from: AppCompatSpinner */
    class c implements g, DialogInterface.OnClickListener {

        /* renamed from: g  reason: collision with root package name */
        androidx.appcompat.app.b f529g;

        /* renamed from: h  reason: collision with root package name */
        private ListAdapter f530h;

        /* renamed from: i  reason: collision with root package name */
        private CharSequence f531i;

        c() {
        }

        public void b(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        public boolean c() {
            androidx.appcompat.app.b bVar = this.f529g;
            if (bVar != null) {
                return bVar.isShowing();
            }
            return false;
        }

        public int d() {
            return 0;
        }

        public void dismiss() {
            androidx.appcompat.app.b bVar = this.f529g;
            if (bVar != null) {
                bVar.dismiss();
                this.f529g = null;
            }
        }

        public Drawable g() {
            return null;
        }

        public void i(CharSequence charSequence) {
            this.f531i = charSequence;
        }

        public void j(int i2) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        public void k(int i2) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        public void l(int i2) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        public void m(int i2, int i3) {
            if (this.f530h != null) {
                b.a aVar = new b.a(w.this.getPopupContext());
                CharSequence charSequence = this.f531i;
                if (charSequence != null) {
                    aVar.q(charSequence);
                }
                aVar.o(this.f530h, w.this.getSelectedItemPosition(), this);
                androidx.appcompat.app.b a = aVar.a();
                this.f529g = a;
                ListView e2 = a.e();
                if (Build.VERSION.SDK_INT >= 17) {
                    e2.setTextDirection(i2);
                    e2.setTextAlignment(i3);
                }
                this.f529g.show();
            }
        }

        public int n() {
            return 0;
        }

        public CharSequence o() {
            return this.f531i;
        }

        public void onClick(DialogInterface dialogInterface, int i2) {
            w.this.setSelection(i2);
            if (w.this.getOnItemClickListener() != null) {
                w.this.performItemClick((View) null, i2, this.f530h.getItemId(i2));
            }
            dismiss();
        }

        public void p(ListAdapter listAdapter) {
            this.f530h = listAdapter;
        }
    }

    /* compiled from: AppCompatSpinner */
    private static class d implements ListAdapter, SpinnerAdapter {

        /* renamed from: g  reason: collision with root package name */
        private SpinnerAdapter f533g;

        /* renamed from: h  reason: collision with root package name */
        private ListAdapter f534h;

        public d(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f533g = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f534h = (ListAdapter) spinnerAdapter;
            }
            if (theme == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 23 && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                    themedSpinnerAdapter.setDropDownViewTheme(theme);
                }
            } else if (spinnerAdapter instanceof s0) {
                s0 s0Var = (s0) spinnerAdapter;
                if (s0Var.getDropDownViewTheme() == null) {
                    s0Var.setDropDownViewTheme(theme);
                }
            }
        }

        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f534h;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f533g;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        public View getDropDownView(int i2, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f533g;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i2, view, viewGroup);
        }

        public Object getItem(int i2) {
            SpinnerAdapter spinnerAdapter = this.f533g;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i2);
        }

        public long getItemId(int i2) {
            SpinnerAdapter spinnerAdapter = this.f533g;
            if (spinnerAdapter == null) {
                return -1;
            }
            return spinnerAdapter.getItemId(i2);
        }

        public int getItemViewType(int i2) {
            return 0;
        }

        public View getView(int i2, View view, ViewGroup viewGroup) {
            return getDropDownView(i2, view, viewGroup);
        }

        public int getViewTypeCount() {
            return 1;
        }

        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f533g;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        public boolean isEmpty() {
            return getCount() == 0;
        }

        public boolean isEnabled(int i2) {
            ListAdapter listAdapter = this.f534h;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i2);
            }
            return true;
        }

        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f533g;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f533g;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    /* compiled from: AppCompatSpinner */
    class e extends j0 implements g {
        private CharSequence O;
        ListAdapter P;
        private final Rect Q = new Rect();
        private int R;

        /* compiled from: AppCompatSpinner */
        class a implements AdapterView.OnItemClickListener {
            a(w wVar) {
            }

            public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
                w.this.setSelection(i2);
                if (w.this.getOnItemClickListener() != null) {
                    e eVar = e.this;
                    w.this.performItemClick(view, i2, eVar.P.getItemId(i2));
                }
                e.this.dismiss();
            }
        }

        /* compiled from: AppCompatSpinner */
        class b implements ViewTreeObserver.OnGlobalLayoutListener {
            b() {
            }

            public void onGlobalLayout() {
                e eVar = e.this;
                if (!eVar.Q(w.this)) {
                    e.this.dismiss();
                    return;
                }
                e.this.O();
                e.super.e();
            }
        }

        /* compiled from: AppCompatSpinner */
        class c implements PopupWindow.OnDismissListener {

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f537g;

            c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f537g = onGlobalLayoutListener;
            }

            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = w.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f537g);
                }
            }
        }

        public e(Context context, AttributeSet attributeSet, int i2) {
            super(context, attributeSet, i2);
            z(w.this);
            F(true);
            K(0);
            H(new a(w.this));
        }

        /* access modifiers changed from: package-private */
        public void O() {
            int i2;
            Drawable g2 = g();
            int i3 = 0;
            if (g2 != null) {
                g2.getPadding(w.this.f527n);
                i3 = c1.b(w.this) ? w.this.f527n.right : -w.this.f527n.left;
            } else {
                Rect rect = w.this.f527n;
                rect.right = 0;
                rect.left = 0;
            }
            int paddingLeft = w.this.getPaddingLeft();
            int paddingRight = w.this.getPaddingRight();
            int width = w.this.getWidth();
            w wVar = w.this;
            int i4 = wVar.f526m;
            if (i4 == -2) {
                int a2 = wVar.a((SpinnerAdapter) this.P, g());
                int i5 = w.this.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = w.this.f527n;
                int i6 = (i5 - rect2.left) - rect2.right;
                if (a2 > i6) {
                    a2 = i6;
                }
                B(Math.max(a2, (width - paddingLeft) - paddingRight));
            } else if (i4 == -1) {
                B((width - paddingLeft) - paddingRight);
            } else {
                B(i4);
            }
            if (c1.b(w.this)) {
                i2 = i3 + (((width - paddingRight) - v()) - P());
            } else {
                i2 = i3 + paddingLeft + P();
            }
            l(i2);
        }

        public int P() {
            return this.R;
        }

        /* access modifiers changed from: package-private */
        public boolean Q(View view) {
            return u.K(view) && view.getGlobalVisibleRect(this.Q);
        }

        public void i(CharSequence charSequence) {
            this.O = charSequence;
        }

        public void k(int i2) {
            this.R = i2;
        }

        public void m(int i2, int i3) {
            ViewTreeObserver viewTreeObserver;
            boolean c2 = c();
            O();
            E(2);
            super.e();
            ListView h2 = h();
            h2.setChoiceMode(1);
            if (Build.VERSION.SDK_INT >= 17) {
                h2.setTextDirection(i2);
                h2.setTextAlignment(i3);
            }
            L(w.this.getSelectedItemPosition());
            if (!c2 && (viewTreeObserver = w.this.getViewTreeObserver()) != null) {
                b bVar = new b();
                viewTreeObserver.addOnGlobalLayoutListener(bVar);
                G(new c(bVar));
            }
        }

        public CharSequence o() {
            return this.O;
        }

        public void p(ListAdapter listAdapter) {
            super.p(listAdapter);
            this.P = listAdapter;
        }
    }

    /* compiled from: AppCompatSpinner */
    static class f extends View.BaseSavedState {
        public static final Parcelable.Creator<f> CREATOR = new a();

        /* renamed from: g  reason: collision with root package name */
        boolean f539g;

        /* compiled from: AppCompatSpinner */
        static class a implements Parcelable.Creator<f> {
            a() {
            }

            /* renamed from: a */
            public f createFromParcel(Parcel parcel) {
                return new f(parcel);
            }

            /* renamed from: b */
            public f[] newArray(int i2) {
                return new f[i2];
            }
        }

        f(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeByte(this.f539g ? (byte) 1 : 0);
        }

        f(Parcel parcel) {
            super(parcel);
            this.f539g = parcel.readByte() != 0;
        }
    }

    /* compiled from: AppCompatSpinner */
    interface g {
        void b(Drawable drawable);

        boolean c();

        int d();

        void dismiss();

        Drawable g();

        void i(CharSequence charSequence);

        void j(int i2);

        void k(int i2);

        void l(int i2);

        void m(int i2, int i3);

        int n();

        CharSequence o();

        void p(ListAdapter listAdapter);
    }

    public w(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, e.a.a.spinnerStyle);
    }

    /* access modifiers changed from: package-private */
    public int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i2 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i3 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i2) {
                view = null;
                i2 = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i3 = Math.max(i3, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i3;
        }
        drawable.getPadding(this.f527n);
        Rect rect = this.f527n;
        return i3 + rect.left + rect.right;
    }

    /* access modifiers changed from: package-private */
    public void b() {
        if (Build.VERSION.SDK_INT >= 17) {
            this.f525l.m(getTextDirection(), getTextAlignment());
        } else {
            this.f525l.m(-1, -1);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f520g;
        if (eVar != null) {
            eVar.b();
        }
    }

    public int getDropDownHorizontalOffset() {
        g gVar = this.f525l;
        if (gVar != null) {
            return gVar.d();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownHorizontalOffset();
        }
        return 0;
    }

    public int getDropDownVerticalOffset() {
        g gVar = this.f525l;
        if (gVar != null) {
            return gVar.n();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownVerticalOffset();
        }
        return 0;
    }

    public int getDropDownWidth() {
        if (this.f525l != null) {
            return this.f526m;
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownWidth();
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    public final g getInternalPopup() {
        return this.f525l;
    }

    public Drawable getPopupBackground() {
        g gVar = this.f525l;
        if (gVar != null) {
            return gVar.g();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getPopupBackground();
        }
        return null;
    }

    public Context getPopupContext() {
        return this.f521h;
    }

    public CharSequence getPrompt() {
        g gVar = this.f525l;
        return gVar != null ? gVar.o() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f520g;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f520g;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g gVar = this.f525l;
        if (gVar != null && gVar.c()) {
            this.f525l.dismiss();
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.f525l != null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i2)), getMeasuredHeight());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        f fVar = (f) parcelable;
        super.onRestoreInstanceState(fVar.getSuperState());
        if (fVar.f539g && (viewTreeObserver = getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new b());
        }
    }

    public Parcelable onSaveInstanceState() {
        f fVar = new f(super.onSaveInstanceState());
        g gVar = this.f525l;
        fVar.f539g = gVar != null && gVar.c();
        return fVar;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        h0 h0Var = this.f522i;
        if (h0Var == null || !h0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public boolean performClick() {
        g gVar = this.f525l;
        if (gVar == null) {
            return super.performClick();
        }
        if (gVar.c()) {
            return true;
        }
        b();
        return true;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f520g;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        e eVar = this.f520g;
        if (eVar != null) {
            eVar.g(i2);
        }
    }

    public void setDropDownHorizontalOffset(int i2) {
        g gVar = this.f525l;
        if (gVar != null) {
            gVar.k(i2);
            this.f525l.l(i2);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownHorizontalOffset(i2);
        }
    }

    public void setDropDownVerticalOffset(int i2) {
        g gVar = this.f525l;
        if (gVar != null) {
            gVar.j(i2);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownVerticalOffset(i2);
        }
    }

    public void setDropDownWidth(int i2) {
        if (this.f525l != null) {
            this.f526m = i2;
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownWidth(i2);
        }
    }

    public void setPopupBackgroundDrawable(Drawable drawable) {
        g gVar = this.f525l;
        if (gVar != null) {
            gVar.b(drawable);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    public void setPopupBackgroundResource(int i2) {
        setPopupBackgroundDrawable(e.a.k.a.a.d(getPopupContext(), i2));
    }

    public void setPrompt(CharSequence charSequence) {
        g gVar = this.f525l;
        if (gVar != null) {
            gVar.i(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f520g;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f520g;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    public w(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, -1);
    }

    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f524k) {
            this.f523j = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f525l != null) {
            Context context = this.f521h;
            if (context == null) {
                context = getContext();
            }
            this.f525l.p(new d(spinnerAdapter, context.getTheme()));
        }
    }

    public w(Context context, AttributeSet attributeSet, int i2, int i3) {
        this(context, attributeSet, i2, i3, (Resources.Theme) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0048, code lost:
        if (r11 != null) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004a, code lost:
        r11.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005b, code lost:
        if (r11 != null) goto L_0x004a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0062  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public w(android.content.Context r7, android.util.AttributeSet r8, int r9, int r10, android.content.res.Resources.Theme r11) {
        /*
            r6 = this;
            r6.<init>(r7, r8, r9)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r6.f527n = r0
            int[] r0 = e.a.j.Spinner
            r1 = 0
            androidx.appcompat.widget.w0 r0 = androidx.appcompat.widget.w0.u(r7, r8, r0, r9, r1)
            androidx.appcompat.widget.e r2 = new androidx.appcompat.widget.e
            r2.<init>(r6)
            r6.f520g = r2
            if (r11 == 0) goto L_0x0022
            e.a.n.d r2 = new e.a.n.d
            r2.<init>((android.content.Context) r7, (android.content.res.Resources.Theme) r11)
            r6.f521h = r2
            goto L_0x0034
        L_0x0022:
            int r11 = e.a.j.Spinner_popupTheme
            int r11 = r0.n(r11, r1)
            if (r11 == 0) goto L_0x0032
            e.a.n.d r2 = new e.a.n.d
            r2.<init>((android.content.Context) r7, (int) r11)
            r6.f521h = r2
            goto L_0x0034
        L_0x0032:
            r6.f521h = r7
        L_0x0034:
            r11 = -1
            r2 = 0
            if (r10 != r11) goto L_0x0066
            int[] r11 = o     // Catch:{ Exception -> 0x0052, all -> 0x0050 }
            android.content.res.TypedArray r11 = r7.obtainStyledAttributes(r8, r11, r9, r1)     // Catch:{ Exception -> 0x0052, all -> 0x0050 }
            boolean r3 = r11.hasValue(r1)     // Catch:{ Exception -> 0x004e }
            if (r3 == 0) goto L_0x0048
            int r10 = r11.getInt(r1, r1)     // Catch:{ Exception -> 0x004e }
        L_0x0048:
            if (r11 == 0) goto L_0x0066
        L_0x004a:
            r11.recycle()
            goto L_0x0066
        L_0x004e:
            r3 = move-exception
            goto L_0x0054
        L_0x0050:
            r7 = move-exception
            goto L_0x0060
        L_0x0052:
            r3 = move-exception
            r11 = r2
        L_0x0054:
            java.lang.String r4 = "AppCompatSpinner"
            java.lang.String r5 = "Could not read android:spinnerMode"
            android.util.Log.i(r4, r5, r3)     // Catch:{ all -> 0x005e }
            if (r11 == 0) goto L_0x0066
            goto L_0x004a
        L_0x005e:
            r7 = move-exception
            r2 = r11
        L_0x0060:
            if (r2 == 0) goto L_0x0065
            r2.recycle()
        L_0x0065:
            throw r7
        L_0x0066:
            r11 = 1
            if (r10 == 0) goto L_0x00a3
            if (r10 == r11) goto L_0x006c
            goto L_0x00b3
        L_0x006c:
            androidx.appcompat.widget.w$e r10 = new androidx.appcompat.widget.w$e
            android.content.Context r3 = r6.f521h
            r10.<init>(r3, r8, r9)
            android.content.Context r3 = r6.f521h
            int[] r4 = e.a.j.Spinner
            androidx.appcompat.widget.w0 r1 = androidx.appcompat.widget.w0.u(r3, r8, r4, r9, r1)
            int r3 = e.a.j.Spinner_android_dropDownWidth
            r4 = -2
            int r3 = r1.m(r3, r4)
            r6.f526m = r3
            int r3 = e.a.j.Spinner_android_popupBackground
            android.graphics.drawable.Drawable r3 = r1.g(r3)
            r10.b(r3)
            int r3 = e.a.j.Spinner_android_prompt
            java.lang.String r3 = r0.o(r3)
            r10.i(r3)
            r1.v()
            r6.f525l = r10
            androidx.appcompat.widget.w$a r1 = new androidx.appcompat.widget.w$a
            r1.<init>(r6, r10)
            r6.f522i = r1
            goto L_0x00b3
        L_0x00a3:
            androidx.appcompat.widget.w$c r10 = new androidx.appcompat.widget.w$c
            r10.<init>()
            r6.f525l = r10
            int r1 = e.a.j.Spinner_android_prompt
            java.lang.String r1 = r0.o(r1)
            r10.i(r1)
        L_0x00b3:
            int r10 = e.a.j.Spinner_android_entries
            java.lang.CharSequence[] r10 = r0.q(r10)
            if (r10 == 0) goto L_0x00cb
            android.widget.ArrayAdapter r1 = new android.widget.ArrayAdapter
            r3 = 17367048(0x1090008, float:2.5162948E-38)
            r1.<init>(r7, r3, r10)
            int r7 = e.a.g.support_simple_spinner_dropdown_item
            r1.setDropDownViewResource(r7)
            r6.setAdapter((android.widget.SpinnerAdapter) r1)
        L_0x00cb:
            r0.v()
            r6.f524k = r11
            android.widget.SpinnerAdapter r7 = r6.f523j
            if (r7 == 0) goto L_0x00d9
            r6.setAdapter((android.widget.SpinnerAdapter) r7)
            r6.f523j = r2
        L_0x00d9:
            androidx.appcompat.widget.e r7 = r6.f520g
            r7.e(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.w.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }
}
