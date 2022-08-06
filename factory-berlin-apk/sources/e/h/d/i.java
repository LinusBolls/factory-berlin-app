package e.h.d;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import androidx.core.content.c.c;
import e.h.h.b;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: TypefaceCompatApi29Impl */
public class i extends j {
    public Typeface b(Context context, c.b bVar, Resources resources, int i2) {
        c.C0014c[] a = bVar.a();
        int length = a.length;
        int i3 = 0;
        FontFamily.Builder builder = null;
        int i4 = 0;
        while (true) {
            int i5 = 1;
            if (i4 >= length) {
                break;
            }
            c.C0014c cVar = a[i4];
            try {
                Font.Builder weight = new Font.Builder(resources, cVar.b()).setWeight(cVar.e());
                if (!cVar.f()) {
                    i5 = 0;
                }
                Font build = weight.setSlant(i5).setTtcIndex(cVar.c()).setFontVariationSettings(cVar.d()).build();
                if (builder == null) {
                    builder = new FontFamily.Builder(build);
                } else {
                    builder.addFont(build);
                }
            } catch (IOException unused) {
            }
            i4++;
        }
        if (builder == null) {
            return null;
        }
        int i6 = (i2 & 1) != 0 ? 700 : 400;
        if ((i2 & 2) != 0) {
            i3 = 1;
        }
        return new Typeface.CustomFallbackBuilder(builder.build()).setStyle(new FontStyle(i6, i3)).build();
    }

    public Typeface c(Context context, CancellationSignal cancellationSignal, b.f[] fVarArr, int i2) {
        ParcelFileDescriptor openFileDescriptor;
        ContentResolver contentResolver = context.getContentResolver();
        int length = fVarArr.length;
        int i3 = 0;
        FontFamily.Builder builder = null;
        int i4 = 0;
        while (true) {
            int i5 = 1;
            if (i4 < length) {
                b.f fVar = fVarArr[i4];
                try {
                    openFileDescriptor = contentResolver.openFileDescriptor(fVar.c(), "r", cancellationSignal);
                    if (openFileDescriptor != null) {
                        Font.Builder weight = new Font.Builder(openFileDescriptor).setWeight(fVar.d());
                        if (!fVar.e()) {
                            i5 = 0;
                        }
                        Font build = weight.setSlant(i5).setTtcIndex(fVar.b()).build();
                        if (builder == null) {
                            builder = new FontFamily.Builder(build);
                        } else {
                            builder.addFont(build);
                        }
                        if (openFileDescriptor == null) {
                            i4++;
                        }
                    } else if (openFileDescriptor == null) {
                        i4++;
                    }
                    openFileDescriptor.close();
                } catch (IOException unused) {
                } catch (Throwable th) {
                    th.addSuppressed(th);
                    break;
                }
                i4++;
            } else if (builder == null) {
                return null;
            } else {
                int i6 = (i2 & 1) != 0 ? 700 : 400;
                if ((i2 & 2) != 0) {
                    i3 = 1;
                }
                return new Typeface.CustomFallbackBuilder(builder.build()).setStyle(new FontStyle(i6, i3)).build();
            }
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public Typeface d(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    public Typeface e(Context context, Resources resources, int i2, String str, int i3) {
        try {
            Font build = new Font.Builder(resources, i2).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (IOException unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public b.f h(b.f[] fVarArr, int i2) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
