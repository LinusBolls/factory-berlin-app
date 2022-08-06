package g.e.i;

/* compiled from: MotionlessAverage */
public interface b {

    /* compiled from: MotionlessAverage */
    public static class a {
        public static b a(float f2, float f3, long j2, long j3) {
            if (j2 <= 0) {
                throw new IllegalArgumentException("minTimeMs must be greater than zero");
            } else if (j3 <= j2) {
                throw new IllegalArgumentException("maxTimeMs must be greater than minTimeMs");
            } else if (f2 < 1.0f) {
                throw new IllegalArgumentException("minFilter must be greater than one or equal");
            } else if (f3 > f2) {
                long j4 = j2 * 1000000;
                long j5 = j3 * 1000000;
                float f4 = (float) j5;
                float a = a.a((float) j4, f4, f2, f3);
                return new c(a, a.c(a, f4, f3), j4, j5);
            } else {
                throw new IllegalArgumentException("maxFilter must be greater than minFilter");
            }
        }
    }

    float a(float f2);
}
