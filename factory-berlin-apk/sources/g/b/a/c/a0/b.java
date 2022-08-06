package g.b.a.c.a0;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;
import android.util.StateSet;
import e.h.d.a;

/* compiled from: RippleUtils */
public class b {
    public static final boolean a = (Build.VERSION.SDK_INT >= 21);
    private static final int[] b = {16842919};
    private static final int[] c = {16843623, 16842908};

    /* renamed from: d  reason: collision with root package name */
    private static final int[] f9441d = {16842908};

    /* renamed from: e  reason: collision with root package name */
    private static final int[] f9442e = {16843623};

    /* renamed from: f  reason: collision with root package name */
    private static final int[] f9443f = {16842913, 16842919};

    /* renamed from: g  reason: collision with root package name */
    private static final int[] f9444g = {16842913, 16843623, 16842908};

    /* renamed from: h  reason: collision with root package name */
    private static final int[] f9445h = {16842913, 16842908};

    /* renamed from: i  reason: collision with root package name */
    private static final int[] f9446i = {16842913, 16843623};

    /* renamed from: j  reason: collision with root package name */
    private static final int[] f9447j = {16842913};

    /* renamed from: k  reason: collision with root package name */
    private static final int[] f9448k = {16842910, 16842919};

    /* renamed from: l  reason: collision with root package name */
    static final String f9449l = b.class.getSimpleName();

    private b() {
    }

    public static ColorStateList a(ColorStateList colorStateList) {
        if (a) {
            return new ColorStateList(new int[][]{f9447j, StateSet.NOTHING}, new int[]{c(colorStateList, f9443f), c(colorStateList, b)});
        }
        int[] iArr = f9443f;
        int[] iArr2 = f9444g;
        int[] iArr3 = f9445h;
        int[] iArr4 = f9446i;
        int[] iArr5 = b;
        int[] iArr6 = c;
        int[] iArr7 = f9441d;
        int[] iArr8 = f9442e;
        return new ColorStateList(new int[][]{iArr, iArr2, iArr3, iArr4, f9447j, iArr5, iArr6, iArr7, iArr8, StateSet.NOTHING}, new int[]{c(colorStateList, iArr), c(colorStateList, iArr2), c(colorStateList, iArr3), c(colorStateList, iArr4), 0, c(colorStateList, iArr5), c(colorStateList, iArr6), c(colorStateList, iArr7), c(colorStateList, iArr8), 0});
    }

    @TargetApi(21)
    private static int b(int i2) {
        return a.d(i2, Math.min(Color.alpha(i2) * 2, 255));
    }

    private static int c(ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        return a ? b(colorForState) : colorForState;
    }

    public static ColorStateList d(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 22 && i2 <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f9448k, 0)) != 0) {
            Log.w(f9449l, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
        }
        return colorStateList;
    }

    public static boolean e(int[] iArr) {
        boolean z = false;
        boolean z2 = false;
        for (int i2 : iArr) {
            if (i2 == 16842910) {
                z = true;
            } else if (i2 == 16842908 || i2 == 16842919 || i2 == 16843623) {
                z2 = true;
            }
        }
        return z && z2;
    }
}
