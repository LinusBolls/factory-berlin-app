package j.a.a.a;

import android.graphics.Bitmap;

/* compiled from: MatrixToImageWriter */
public class b {
    public static Bitmap a(com.google.zxing.d.b bVar, a aVar) {
        int c = aVar.c();
        int b = aVar.b();
        int g2 = bVar.g();
        int f2 = bVar.f();
        int[] iArr = new int[(g2 * f2)];
        for (int i2 = 0; i2 < f2; i2++) {
            int i3 = i2 * g2;
            for (int i4 = 0; i4 < g2; i4++) {
                iArr[i3 + i4] = bVar.e(i4, i2) ? c : b;
            }
        }
        Bitmap createBitmap = Bitmap.createBitmap(g2, f2, aVar.a());
        createBitmap.setPixels(iArr, 0, g2, 0, 0, g2, f2);
        return createBitmap;
    }
}
