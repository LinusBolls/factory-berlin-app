package g.b.a.c.z;

import android.graphics.Typeface;

/* compiled from: CancelableFontCallback */
public final class a extends f {
    private final Typeface a;
    private final C0639a b;
    private boolean c;

    /* renamed from: g.b.a.c.z.a$a  reason: collision with other inner class name */
    /* compiled from: CancelableFontCallback */
    public interface C0639a {
        void a(Typeface typeface);
    }

    public a(C0639a aVar, Typeface typeface) {
        this.a = typeface;
        this.b = aVar;
    }

    private void d(Typeface typeface) {
        if (!this.c) {
            this.b.a(typeface);
        }
    }

    public void a(int i2) {
        d(this.a);
    }

    public void b(Typeface typeface, boolean z) {
        d(typeface);
    }

    public void c() {
        this.c = true;
    }
}
