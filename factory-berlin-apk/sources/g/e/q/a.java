package g.e.q;

import android.annotation.TargetApi;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.PointF;
import android.view.View;
import android.view.ViewOutlineProvider;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@TargetApi(21)
/* compiled from: InternalProvider */
class a extends ViewOutlineProvider {
    private final float a;
    private final float b;
    private final PointF[] c;

    /* renamed from: d  reason: collision with root package name */
    private final Path f10249d = new Path();

    /* renamed from: e  reason: collision with root package name */
    private float f10250e = Float.NaN;

    /* renamed from: f  reason: collision with root package name */
    private float f10251f = Float.NaN;

    a(String str, float f2, float f3) {
        this.a = f2;
        this.b = f3;
        Matcher matcher = Pattern.compile("[mhlvMLHV][-0-9., ]*").matcher(str);
        ArrayList arrayList = new ArrayList();
        while (matcher.find()) {
            String[] split = matcher.group().substring(1).trim().split("[, ]");
            if (split.length >= 2) {
                arrayList.add(new PointF(Float.parseFloat(split[0].trim()), Float.parseFloat(split[1].trim())));
            }
        }
        this.c = (PointF[]) arrayList.toArray(new PointF[arrayList.size()]);
    }

    public void getOutline(View view, Outline outline) {
        float width = ((float) view.getWidth()) / this.a;
        float height = ((float) view.getHeight()) / this.b;
        if (width != 0.0f && height != 0.0f) {
            if (!(width == this.f10250e && height == this.f10251f)) {
                this.f10250e = width;
                this.f10251f = height;
                this.f10249d.reset();
                int i2 = 0;
                while (true) {
                    PointF[] pointFArr = this.c;
                    if (i2 >= pointFArr.length) {
                        break;
                    }
                    PointF pointF = pointFArr[i2];
                    if (i2 == 0) {
                        this.f10249d.moveTo(pointF.x * width, pointF.y * height);
                    } else {
                        this.f10249d.lineTo(pointF.x * width, pointF.y * height);
                    }
                    i2++;
                }
                this.f10249d.close();
            }
            outline.setConvexPath(this.f10249d);
        }
    }
}
