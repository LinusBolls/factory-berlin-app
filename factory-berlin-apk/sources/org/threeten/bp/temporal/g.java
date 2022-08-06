package org.threeten.bp.temporal;

import org.threeten.bp.t.d;

/* compiled from: TemporalAdjusters */
public final class g {

    /* compiled from: TemporalAdjusters */
    private static final class b implements f {

        /* renamed from: g  reason: collision with root package name */
        private final int f11726g;

        /* renamed from: h  reason: collision with root package name */
        private final int f11727h;

        public d A(d dVar) {
            int w = dVar.w(a.DAY_OF_WEEK);
            if (this.f11726g < 2 && w == this.f11727h) {
                return dVar;
            }
            if ((this.f11726g & 1) == 0) {
                int i2 = w - this.f11727h;
                return dVar.z((long) (i2 >= 0 ? 7 - i2 : -i2), b.DAYS);
            }
            int i3 = this.f11727h - w;
            return dVar.x((long) (i3 >= 0 ? 7 - i3 : -i3), b.DAYS);
        }

        private b(int i2, org.threeten.bp.b bVar) {
            d.i(bVar, "dayOfWeek");
            this.f11726g = i2;
            this.f11727h = bVar.getValue();
        }
    }

    public static f a(org.threeten.bp.b bVar) {
        return new b(0, bVar);
    }

    public static f b(org.threeten.bp.b bVar) {
        return new b(1, bVar);
    }
}
