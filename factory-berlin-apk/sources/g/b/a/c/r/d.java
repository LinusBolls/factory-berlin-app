package g.b.a.c.r;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;

/* compiled from: CircularRevealWidget */
public interface d {

    /* compiled from: CircularRevealWidget */
    public static class b implements TypeEvaluator<e> {
        public static final TypeEvaluator<e> b = new b();
        private final e a = new e();

        /* renamed from: a */
        public e evaluate(float f2, e eVar, e eVar2) {
            this.a.a(g.b.a.c.x.a.c(eVar.a, eVar2.a, f2), g.b.a.c.x.a.c(eVar.b, eVar2.b, f2), g.b.a.c.x.a.c(eVar.c, eVar2.c, f2));
            return this.a;
        }
    }

    /* compiled from: CircularRevealWidget */
    public static class c extends Property<d, e> {
        public static final Property<d, e> a = new c("circularReveal");

        private c(String str) {
            super(e.class, str);
        }

        /* renamed from: a */
        public e get(d dVar) {
            return dVar.getRevealInfo();
        }

        /* renamed from: b */
        public void set(d dVar, e eVar) {
            dVar.setRevealInfo(eVar);
        }
    }

    /* renamed from: g.b.a.c.r.d$d  reason: collision with other inner class name */
    /* compiled from: CircularRevealWidget */
    public static class C0638d extends Property<d, Integer> {
        public static final Property<d, Integer> a = new C0638d("circularRevealScrimColor");

        private C0638d(String str) {
            super(Integer.class, str);
        }

        /* renamed from: a */
        public Integer get(d dVar) {
            return Integer.valueOf(dVar.getCircularRevealScrimColor());
        }

        /* renamed from: b */
        public void set(d dVar, Integer num) {
            dVar.setCircularRevealScrimColor(num.intValue());
        }
    }

    /* compiled from: CircularRevealWidget */
    public static class e {
        public float a;
        public float b;
        public float c;

        public void a(float f2, float f3, float f4) {
            this.a = f2;
            this.b = f3;
            this.c = f4;
        }

        private e() {
        }

        public e(float f2, float f3, float f4) {
            this.a = f2;
            this.b = f3;
            this.c = f4;
        }
    }

    void a();

    void b();

    int getCircularRevealScrimColor();

    e getRevealInfo();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i2);

    void setRevealInfo(e eVar);
}
