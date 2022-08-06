package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import e.a.j;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: AppCompatTextViewAutoSizeHelper */
class a0 {

    /* renamed from: k  reason: collision with root package name */
    private static final RectF f379k = new RectF();

    /* renamed from: l  reason: collision with root package name */
    private static ConcurrentHashMap<String, Method> f380l = new ConcurrentHashMap<>();

    /* renamed from: m  reason: collision with root package name */
    private static ConcurrentHashMap<String, Field> f381m = new ConcurrentHashMap<>();
    private int a = 0;
    private boolean b = false;
    private float c = -1.0f;

    /* renamed from: d  reason: collision with root package name */
    private float f382d = -1.0f;

    /* renamed from: e  reason: collision with root package name */
    private float f383e = -1.0f;

    /* renamed from: f  reason: collision with root package name */
    private int[] f384f = new int[0];

    /* renamed from: g  reason: collision with root package name */
    private boolean f385g = false;

    /* renamed from: h  reason: collision with root package name */
    private TextPaint f386h;

    /* renamed from: i  reason: collision with root package name */
    private final TextView f387i;

    /* renamed from: j  reason: collision with root package name */
    private final Context f388j;

    a0(TextView textView) {
        this.f387i = textView;
        this.f388j = textView.getContext();
    }

    private void A(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i2 = 0; i2 < length; i2++) {
                iArr[i2] = typedArray.getDimensionPixelSize(i2, -1);
            }
            this.f384f = c(iArr);
            B();
        }
    }

    private boolean B() {
        int length = this.f384f.length;
        boolean z = length > 0;
        this.f385g = z;
        if (z) {
            this.a = 1;
            int[] iArr = this.f384f;
            this.f382d = (float) iArr[0];
            this.f383e = (float) iArr[length - 1];
            this.c = -1.0f;
        }
        return this.f385g;
    }

    private boolean C(int i2, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.f387i.getText();
        TransformationMethod transformationMethod = this.f387i.getTransformationMethod();
        if (!(transformationMethod == null || (transformation = transformationMethod.getTransformation(text, this.f387i)) == null)) {
            text = transformation;
        }
        int maxLines = Build.VERSION.SDK_INT >= 16 ? this.f387i.getMaxLines() : -1;
        q(i2);
        StaticLayout e2 = e(text, (Layout.Alignment) r(this.f387i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines);
        return (maxLines == -1 || (e2.getLineCount() <= maxLines && e2.getLineEnd(e2.getLineCount() - 1) == text.length())) && ((float) e2.getHeight()) <= rectF.bottom;
    }

    private boolean D() {
        return !(this.f387i instanceof k);
    }

    private void E(float f2, float f3, float f4) {
        if (f2 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f2 + "px) is less or equal to (0px)");
        } else if (f3 <= f2) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f3 + "px) is less or equal to minimum auto-size text size (" + f2 + "px)");
        } else if (f4 > 0.0f) {
            this.a = 1;
            this.f382d = f2;
            this.f383e = f3;
            this.c = f4;
            this.f385g = false;
        } else {
            throw new IllegalArgumentException("The auto-size step granularity (" + f4 + "px) is less or equal to (0px)");
        }
    }

    private static <T> T a(Object obj, String str, T t) {
        try {
            Field o = o(str);
            if (o == null) {
                return t;
            }
            return o.get(obj);
        } catch (IllegalAccessException e2) {
            Log.w("ACTVAutoSizeHelper", "Failed to access TextView#" + str + " member", e2);
            return t;
        }
    }

    private int[] c(int[] iArr) {
        if (r0 == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i2 : iArr) {
            if (i2 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i2)) < 0) {
                arrayList.add(Integer.valueOf(i2));
            }
        }
        if (r0 == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i3 = 0; i3 < size; i3++) {
            iArr2[i3] = ((Integer) arrayList.get(i3)).intValue();
        }
        return iArr2;
    }

    private void d() {
        this.a = 0;
        this.f382d = -1.0f;
        this.f383e = -1.0f;
        this.c = -1.0f;
        this.f384f = new int[0];
        this.b = false;
    }

    private StaticLayout f(CharSequence charSequence, Layout.Alignment alignment, int i2, int i3) {
        TextDirectionHeuristic textDirectionHeuristic;
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f386h, i2);
        StaticLayout.Builder hyphenationFrequency = obtain.setAlignment(alignment).setLineSpacing(this.f387i.getLineSpacingExtra(), this.f387i.getLineSpacingMultiplier()).setIncludePad(this.f387i.getIncludeFontPadding()).setBreakStrategy(this.f387i.getBreakStrategy()).setHyphenationFrequency(this.f387i.getHyphenationFrequency());
        if (i3 == -1) {
            i3 = Integer.MAX_VALUE;
        }
        hyphenationFrequency.setMaxLines(i3);
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                textDirectionHeuristic = this.f387i.getTextDirectionHeuristic();
            } else {
                textDirectionHeuristic = (TextDirectionHeuristic) r(this.f387i, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR);
            }
            obtain.setTextDirection(textDirectionHeuristic);
        } catch (ClassCastException unused) {
            Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
        }
        return obtain.build();
    }

    private StaticLayout g(CharSequence charSequence, Layout.Alignment alignment, int i2) {
        return new StaticLayout(charSequence, this.f386h, i2, alignment, ((Float) a(this.f387i, "mSpacingMult", Float.valueOf(1.0f))).floatValue(), ((Float) a(this.f387i, "mSpacingAdd", Float.valueOf(0.0f))).floatValue(), ((Boolean) a(this.f387i, "mIncludePad", Boolean.TRUE)).booleanValue());
    }

    private StaticLayout h(CharSequence charSequence, Layout.Alignment alignment, int i2) {
        return new StaticLayout(charSequence, this.f386h, i2, alignment, this.f387i.getLineSpacingMultiplier(), this.f387i.getLineSpacingExtra(), this.f387i.getIncludeFontPadding());
    }

    private int i(RectF rectF) {
        int length = this.f384f.length;
        if (length != 0) {
            int i2 = length - 1;
            int i3 = 1;
            int i4 = 0;
            while (i3 <= i2) {
                int i5 = (i3 + i2) / 2;
                if (C(this.f384f[i5], rectF)) {
                    int i6 = i5 + 1;
                    i4 = i3;
                    i3 = i6;
                } else {
                    i4 = i5 - 1;
                    i2 = i4;
                }
            }
            return this.f384f[i4];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    private static Field o(String str) {
        try {
            Field field = f381m.get(str);
            if (field == null && (field = TextView.class.getDeclaredField(str)) != null) {
                field.setAccessible(true);
                f381m.put(str, field);
            }
            return field;
        } catch (NoSuchFieldException e2) {
            Log.w("ACTVAutoSizeHelper", "Failed to access TextView#" + str + " member", e2);
            return null;
        }
    }

    private static Method p(String str) {
        try {
            Method method = f380l.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                f380l.put(str, method);
            }
            return method;
        } catch (Exception e2) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e2);
            return null;
        }
    }

    private static <T> T r(Object obj, String str, T t) {
        try {
            return p(str).invoke(obj, new Object[0]);
        } catch (Exception e2) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e2);
            return t;
        }
    }

    private void x(float f2) {
        if (f2 != this.f387i.getPaint().getTextSize()) {
            this.f387i.getPaint().setTextSize(f2);
            boolean isInLayout = Build.VERSION.SDK_INT >= 18 ? this.f387i.isInLayout() : false;
            if (this.f387i.getLayout() != null) {
                this.b = false;
                try {
                    Method p = p("nullLayouts");
                    if (p != null) {
                        p.invoke(this.f387i, new Object[0]);
                    }
                } catch (Exception e2) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e2);
                }
                if (!isInLayout) {
                    this.f387i.requestLayout();
                } else {
                    this.f387i.forceLayout();
                }
                this.f387i.invalidate();
            }
        }
    }

    private boolean z() {
        if (!D() || this.a != 1) {
            this.b = false;
        } else {
            if (!this.f385g || this.f384f.length == 0) {
                int floor = ((int) Math.floor((double) ((this.f383e - this.f382d) / this.c))) + 1;
                int[] iArr = new int[floor];
                for (int i2 = 0; i2 < floor; i2++) {
                    iArr[i2] = Math.round(this.f382d + (((float) i2) * this.c));
                }
                this.f384f = c(iArr);
            }
            this.b = true;
        }
        return this.b;
    }

    /* access modifiers changed from: package-private */
    public void b() {
        boolean z;
        int i2;
        if (s()) {
            if (this.b) {
                if (this.f387i.getMeasuredHeight() > 0 && this.f387i.getMeasuredWidth() > 0) {
                    if (Build.VERSION.SDK_INT >= 29) {
                        z = this.f387i.isHorizontallyScrollable();
                    } else {
                        z = ((Boolean) r(this.f387i, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
                    }
                    if (z) {
                        i2 = 1048576;
                    } else {
                        i2 = (this.f387i.getMeasuredWidth() - this.f387i.getTotalPaddingLeft()) - this.f387i.getTotalPaddingRight();
                    }
                    int height = (this.f387i.getHeight() - this.f387i.getCompoundPaddingBottom()) - this.f387i.getCompoundPaddingTop();
                    if (i2 > 0 && height > 0) {
                        synchronized (f379k) {
                            f379k.setEmpty();
                            f379k.right = (float) i2;
                            f379k.bottom = (float) height;
                            float i3 = (float) i(f379k);
                            if (i3 != this.f387i.getTextSize()) {
                                y(0, i3);
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.b = true;
        }
    }

    /* access modifiers changed from: package-private */
    public StaticLayout e(CharSequence charSequence, Layout.Alignment alignment, int i2, int i3) {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 23) {
            return f(charSequence, alignment, i2, i3);
        }
        if (i4 >= 16) {
            return h(charSequence, alignment, i2);
        }
        return g(charSequence, alignment, i2);
    }

    /* access modifiers changed from: package-private */
    public int j() {
        return Math.round(this.f383e);
    }

    /* access modifiers changed from: package-private */
    public int k() {
        return Math.round(this.f382d);
    }

    /* access modifiers changed from: package-private */
    public int l() {
        return Math.round(this.c);
    }

    /* access modifiers changed from: package-private */
    public int[] m() {
        return this.f384f;
    }

    /* access modifiers changed from: package-private */
    public int n() {
        return this.a;
    }

    /* access modifiers changed from: package-private */
    public void q(int i2) {
        TextPaint textPaint = this.f386h;
        if (textPaint == null) {
            this.f386h = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f386h.set(this.f387i.getPaint());
        this.f386h.setTextSize((float) i2);
    }

    /* access modifiers changed from: package-private */
    public boolean s() {
        return D() && this.a != 0;
    }

    /* access modifiers changed from: package-private */
    public void t(AttributeSet attributeSet, int i2) {
        int resourceId;
        TypedArray obtainStyledAttributes = this.f388j.obtainStyledAttributes(attributeSet, j.AppCompatTextView, i2, 0);
        if (obtainStyledAttributes.hasValue(j.AppCompatTextView_autoSizeTextType)) {
            this.a = obtainStyledAttributes.getInt(j.AppCompatTextView_autoSizeTextType, 0);
        }
        float dimension = obtainStyledAttributes.hasValue(j.AppCompatTextView_autoSizeStepGranularity) ? obtainStyledAttributes.getDimension(j.AppCompatTextView_autoSizeStepGranularity, -1.0f) : -1.0f;
        float dimension2 = obtainStyledAttributes.hasValue(j.AppCompatTextView_autoSizeMinTextSize) ? obtainStyledAttributes.getDimension(j.AppCompatTextView_autoSizeMinTextSize, -1.0f) : -1.0f;
        float dimension3 = obtainStyledAttributes.hasValue(j.AppCompatTextView_autoSizeMaxTextSize) ? obtainStyledAttributes.getDimension(j.AppCompatTextView_autoSizeMaxTextSize, -1.0f) : -1.0f;
        if (obtainStyledAttributes.hasValue(j.AppCompatTextView_autoSizePresetSizes) && (resourceId = obtainStyledAttributes.getResourceId(j.AppCompatTextView_autoSizePresetSizes, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            A(obtainTypedArray);
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (!D()) {
            this.a = 0;
        } else if (this.a == 1) {
            if (!this.f385g) {
                DisplayMetrics displayMetrics = this.f388j.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                E(dimension2, dimension3, dimension);
            }
            z();
        }
    }

    /* access modifiers changed from: package-private */
    public void u(int i2, int i3, int i4, int i5) {
        if (D()) {
            DisplayMetrics displayMetrics = this.f388j.getResources().getDisplayMetrics();
            E(TypedValue.applyDimension(i5, (float) i2, displayMetrics), TypedValue.applyDimension(i5, (float) i3, displayMetrics), TypedValue.applyDimension(i5, (float) i4, displayMetrics));
            if (z()) {
                b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void v(int[] iArr, int i2) {
        if (D()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i2 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f388j.getResources().getDisplayMetrics();
                    for (int i3 = 0; i3 < length; i3++) {
                        iArr2[i3] = Math.round(TypedValue.applyDimension(i2, (float) iArr[i3], displayMetrics));
                    }
                }
                this.f384f = c(iArr2);
                if (!B()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f385g = false;
            }
            if (z()) {
                b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void w(int i2) {
        if (!D()) {
            return;
        }
        if (i2 == 0) {
            d();
        } else if (i2 == 1) {
            DisplayMetrics displayMetrics = this.f388j.getResources().getDisplayMetrics();
            E(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (z()) {
                b();
            }
        } else {
            throw new IllegalArgumentException("Unknown auto-size text type: " + i2);
        }
    }

    /* access modifiers changed from: package-private */
    public void y(int i2, float f2) {
        Resources resources;
        Context context = this.f388j;
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        x(TypedValue.applyDimension(i2, f2, resources.getDisplayMetrics()));
    }
}
