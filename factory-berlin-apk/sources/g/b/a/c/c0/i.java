package g.b.a.c.c0;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: RelativeCornerSize */
public final class i implements c {
    private final float a;

    public i(float f2) {
        this.a = f2;
    }

    public float a(RectF rectF) {
        return this.a * rectF.height();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof i) && this.a == ((i) obj).a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a)});
    }
}
