package androidx.core.content.c;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import e.h.c;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: GradientColorInflaterCompat */
final class d {
    private static a a(a aVar, int i2, int i3, boolean z, int i4) {
        if (aVar != null) {
            return aVar;
        }
        if (z) {
            return new a(i2, i4, i3);
        }
        return new a(i2, i3);
    }

    static Shader b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        XmlPullParser xmlPullParser2 = xmlPullParser;
        String name = xmlPullParser.getName();
        if (name.equals("gradient")) {
            Resources.Theme theme2 = theme;
            TypedArray k2 = g.k(resources, theme2, attributeSet, c.GradientColor);
            float f2 = g.f(k2, xmlPullParser2, "startX", c.GradientColor_android_startX, 0.0f);
            float f3 = g.f(k2, xmlPullParser2, "startY", c.GradientColor_android_startY, 0.0f);
            float f4 = g.f(k2, xmlPullParser2, "endX", c.GradientColor_android_endX, 0.0f);
            float f5 = g.f(k2, xmlPullParser2, "endY", c.GradientColor_android_endY, 0.0f);
            float f6 = g.f(k2, xmlPullParser2, "centerX", c.GradientColor_android_centerX, 0.0f);
            float f7 = g.f(k2, xmlPullParser2, "centerY", c.GradientColor_android_centerY, 0.0f);
            int g2 = g.g(k2, xmlPullParser2, "type", c.GradientColor_android_type, 0);
            int b = g.b(k2, xmlPullParser2, "startColor", c.GradientColor_android_startColor, 0);
            boolean j2 = g.j(xmlPullParser2, "centerColor");
            int b2 = g.b(k2, xmlPullParser2, "centerColor", c.GradientColor_android_centerColor, 0);
            int b3 = g.b(k2, xmlPullParser2, "endColor", c.GradientColor_android_endColor, 0);
            int g3 = g.g(k2, xmlPullParser2, "tileMode", c.GradientColor_android_tileMode, 0);
            float f8 = f6;
            float f9 = g.f(k2, xmlPullParser2, "gradientRadius", c.GradientColor_android_gradientRadius, 0.0f);
            k2.recycle();
            a a2 = a(c(resources, xmlPullParser, attributeSet, theme), b, b3, j2, b2);
            if (g2 == 1) {
                float f10 = f8;
                if (f9 > 0.0f) {
                    int[] iArr = a2.a;
                    return new RadialGradient(f10, f7, f9, iArr, a2.b, d(g3));
                }
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            } else if (g2 != 2) {
                return new LinearGradient(f2, f3, f4, f5, a2.a, a2.b, d(g3));
            } else {
                return new SweepGradient(f8, f7, a2.a, a2.b);
            }
        } else {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid gradient color tag " + name);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0084, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(r9.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static androidx.core.content.c.d.a c(android.content.res.Resources r8, org.xmlpull.v1.XmlPullParser r9, android.util.AttributeSet r10, android.content.res.Resources.Theme r11) {
        /*
            int r0 = r9.getDepth()
            r1 = 1
            int r0 = r0 + r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 20
            r2.<init>(r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
        L_0x0012:
            int r3 = r9.next()
            if (r3 == r1) goto L_0x0085
            int r5 = r9.getDepth()
            if (r5 >= r0) goto L_0x0021
            r6 = 3
            if (r3 == r6) goto L_0x0085
        L_0x0021:
            r6 = 2
            if (r3 == r6) goto L_0x0025
            goto L_0x0012
        L_0x0025:
            if (r5 > r0) goto L_0x0012
            java.lang.String r3 = r9.getName()
            java.lang.String r5 = "item"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x0034
            goto L_0x0012
        L_0x0034:
            int[] r3 = e.h.c.GradientColorItem
            android.content.res.TypedArray r3 = androidx.core.content.c.g.k(r8, r11, r10, r3)
            int r5 = e.h.c.GradientColorItem_android_color
            boolean r5 = r3.hasValue(r5)
            int r6 = e.h.c.GradientColorItem_android_offset
            boolean r6 = r3.hasValue(r6)
            if (r5 == 0) goto L_0x006a
            if (r6 == 0) goto L_0x006a
            int r5 = e.h.c.GradientColorItem_android_color
            r6 = 0
            int r5 = r3.getColor(r5, r6)
            int r6 = e.h.c.GradientColorItem_android_offset
            r7 = 0
            float r6 = r3.getFloat(r6, r7)
            r3.recycle()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r4.add(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r6)
            r2.add(r3)
            goto L_0x0012
        L_0x006a:
            org.xmlpull.v1.XmlPullParserException r8 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r9 = r9.getPositionDescription()
            r10.append(r9)
            java.lang.String r9 = ": <item> tag requires a 'color' attribute and a 'offset' attribute!"
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            r8.<init>(r9)
            throw r8
        L_0x0085:
            int r8 = r4.size()
            if (r8 <= 0) goto L_0x0091
            androidx.core.content.c.d$a r8 = new androidx.core.content.c.d$a
            r8.<init>((java.util.List<java.lang.Integer>) r4, (java.util.List<java.lang.Float>) r2)
            return r8
        L_0x0091:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.c.d.c(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):androidx.core.content.c.d$a");
    }

    private static Shader.TileMode d(int i2) {
        if (i2 == 1) {
            return Shader.TileMode.REPEAT;
        }
        if (i2 != 2) {
            return Shader.TileMode.CLAMP;
        }
        return Shader.TileMode.MIRROR;
    }

    /* compiled from: GradientColorInflaterCompat */
    static final class a {
        final int[] a;
        final float[] b;

        a(List<Integer> list, List<Float> list2) {
            int size = list.size();
            this.a = new int[size];
            this.b = new float[size];
            for (int i2 = 0; i2 < size; i2++) {
                this.a[i2] = list.get(i2).intValue();
                this.b[i2] = list2.get(i2).floatValue();
            }
        }

        a(int i2, int i3) {
            this.a = new int[]{i2, i3};
            this.b = new float[]{0.0f, 1.0f};
        }

        a(int i2, int i3, int i4) {
            this.a = new int[]{i2, i3, i4};
            this.b = new float[]{0.0f, 0.5f, 1.0f};
        }
    }
}
