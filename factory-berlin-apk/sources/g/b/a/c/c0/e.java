package g.b.a.c.c0;

/* compiled from: CutCornerTreatment */
public class e extends d {
    float a = -1.0f;

    public void a(m mVar, float f2, float f3, float f4) {
        mVar.n(0.0f, f4 * f3, 180.0f, 180.0f - f2);
        double d2 = (double) f4;
        double d3 = (double) f3;
        mVar.l((float) (Math.sin(Math.toRadians((double) f2)) * d2 * d3), (float) (Math.sin(Math.toRadians((double) (90.0f - f2))) * d2 * d3));
    }
}
