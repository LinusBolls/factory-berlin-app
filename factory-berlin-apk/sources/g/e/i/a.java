package g.e.i;

/* compiled from: MathHelpers */
class a {
    static float a(float f2, float f3, float f4, float f5) {
        return (f5 - f4) / (f3 - f2);
    }

    static float b(float f2, float f3, float f4) {
        return f2 - ((f2 - f3) / f4);
    }

    static float c(float f2, float f3, float f4) {
        return f4 - (f2 * f3);
    }

    static long d(long j2, long j3, long j4, long j5) {
        return Math.min(Math.max(j2 - j3, j4), j5);
    }

    static float e(float f2, float f3, float f4) {
        return (f2 * f4) + f3;
    }
}
