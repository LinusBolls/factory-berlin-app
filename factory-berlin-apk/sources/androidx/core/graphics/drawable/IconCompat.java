package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;

public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: j  reason: collision with root package name */
    static final PorterDuff.Mode f708j = PorterDuff.Mode.SRC_IN;
    public int a = -1;
    Object b;
    public byte[] c = null;

    /* renamed from: d  reason: collision with root package name */
    public Parcelable f709d = null;

    /* renamed from: e  reason: collision with root package name */
    public int f710e = 0;

    /* renamed from: f  reason: collision with root package name */
    public int f711f = 0;

    /* renamed from: g  reason: collision with root package name */
    public ColorStateList f712g = null;

    /* renamed from: h  reason: collision with root package name */
    PorterDuff.Mode f713h = f708j;

    /* renamed from: i  reason: collision with root package name */
    public String f714i = null;

    public IconCompat() {
    }

    static Bitmap a(Bitmap bitmap, boolean z) {
        int min = (int) (((float) Math.min(bitmap.getWidth(), bitmap.getHeight())) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f2 = (float) min;
        float f3 = 0.5f * f2;
        float f4 = 0.9166667f * f3;
        if (z) {
            float f5 = 0.010416667f * f2;
            paint.setColor(0);
            paint.setShadowLayer(f5, 0.0f, f2 * 0.020833334f, 1023410176);
            canvas.drawCircle(f3, f3, f4, paint);
            paint.setShadowLayer(f5, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f3, f3, f4, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((float) ((-(bitmap.getWidth() - min)) / 2), (float) ((-(bitmap.getHeight() - min)) / 2));
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f3, f3, f4, paint);
        canvas.setBitmap((Bitmap) null);
        return createBitmap;
    }

    public static IconCompat b(Resources resources, String str, int i2) {
        if (str == null) {
            throw new IllegalArgumentException("Package must not be null.");
        } else if (i2 != 0) {
            IconCompat iconCompat = new IconCompat(2);
            iconCompat.f710e = i2;
            if (resources != null) {
                try {
                    iconCompat.b = resources.getResourceName(i2);
                } catch (Resources.NotFoundException unused) {
                    throw new IllegalArgumentException("Icon resource cannot be found");
                }
            } else {
                iconCompat.b = str;
            }
            return iconCompat;
        } else {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
    }

    private static int d(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getResId();
        }
        try {
            return ((Integer) icon.getClass().getMethod("getResId", new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException e2) {
            Log.e("IconCompat", "Unable to get icon resource", e2);
            return 0;
        } catch (InvocationTargetException e3) {
            Log.e("IconCompat", "Unable to get icon resource", e3);
            return 0;
        } catch (NoSuchMethodException e4) {
            Log.e("IconCompat", "Unable to get icon resource", e4);
            return 0;
        }
    }

    private static String f(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getResPackage();
        }
        try {
            return (String) icon.getClass().getMethod("getResPackage", new Class[0]).invoke(icon, new Object[0]);
        } catch (IllegalAccessException e2) {
            Log.e("IconCompat", "Unable to get icon package", e2);
            return null;
        } catch (InvocationTargetException e3) {
            Log.e("IconCompat", "Unable to get icon package", e3);
            return null;
        } catch (NoSuchMethodException e4) {
            Log.e("IconCompat", "Unable to get icon package", e4);
            return null;
        }
    }

    private static int h(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getType();
        }
        try {
            return ((Integer) icon.getClass().getMethod("getType", new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException e2) {
            Log.e("IconCompat", "Unable to get icon type " + icon, e2);
            return -1;
        } catch (InvocationTargetException e3) {
            Log.e("IconCompat", "Unable to get icon type " + icon, e3);
            return -1;
        } catch (NoSuchMethodException e4) {
            Log.e("IconCompat", "Unable to get icon type " + icon, e4);
            return -1;
        }
    }

    private static Uri j(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getUri();
        }
        try {
            return (Uri) icon.getClass().getMethod("getUri", new Class[0]).invoke(icon, new Object[0]);
        } catch (IllegalAccessException e2) {
            Log.e("IconCompat", "Unable to get icon uri", e2);
            return null;
        } catch (InvocationTargetException e3) {
            Log.e("IconCompat", "Unable to get icon uri", e3);
            return null;
        } catch (NoSuchMethodException e4) {
            Log.e("IconCompat", "Unable to get icon uri", e4);
            return null;
        }
    }

    private InputStream k(Context context) {
        Uri i2 = i();
        String scheme = i2.getScheme();
        if ("content".equals(scheme) || "file".equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(i2);
            } catch (Exception e2) {
                Log.w("IconCompat", "Unable to load image from URI: " + i2, e2);
                return null;
            }
        } else {
            try {
                return new FileInputStream(new File((String) this.b));
            } catch (FileNotFoundException e3) {
                Log.w("IconCompat", "Unable to load image from path: " + i2, e3);
                return null;
            }
        }
    }

    private static String p(int i2) {
        switch (i2) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return "URI";
            case 5:
                return "BITMAP_MASKABLE";
            case 6:
                return "URI_MASKABLE";
            default:
                return "UNKNOWN";
        }
    }

    public int c() {
        if (this.a == -1 && Build.VERSION.SDK_INT >= 23) {
            return d((Icon) this.b);
        }
        if (this.a == 2) {
            return this.f710e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    public String e() {
        if (this.a == -1 && Build.VERSION.SDK_INT >= 23) {
            return f((Icon) this.b);
        }
        if (this.a == 2) {
            return ((String) this.b).split(":", -1)[0];
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    public int g() {
        if (this.a != -1 || Build.VERSION.SDK_INT < 23) {
            return this.a;
        }
        return h((Icon) this.b);
    }

    public Uri i() {
        if (this.a == -1 && Build.VERSION.SDK_INT >= 23) {
            return j((Icon) this.b);
        }
        int i2 = this.a;
        if (i2 == 4 || i2 == 6) {
            return Uri.parse((String) this.b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    public void l() {
        this.f713h = PorterDuff.Mode.valueOf(this.f714i);
        switch (this.a) {
            case -1:
                Parcelable parcelable = this.f709d;
                if (parcelable != null) {
                    this.b = parcelable;
                    return;
                }
                throw new IllegalArgumentException("Invalid icon");
            case 1:
            case 5:
                Parcelable parcelable2 = this.f709d;
                if (parcelable2 != null) {
                    this.b = parcelable2;
                    return;
                }
                byte[] bArr = this.c;
                this.b = bArr;
                this.a = 3;
                this.f710e = 0;
                this.f711f = bArr.length;
                return;
            case 2:
            case 4:
            case 6:
                this.b = new String(this.c, Charset.forName("UTF-16"));
                return;
            case 3:
                this.b = this.c;
                return;
            default:
                return;
        }
    }

    public void m(boolean z) {
        this.f714i = this.f713h.name();
        switch (this.a) {
            case -1:
                if (!z) {
                    this.f709d = (Parcelable) this.b;
                    return;
                }
                throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
            case 1:
            case 5:
                if (z) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    ((Bitmap) this.b).compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                    this.c = byteArrayOutputStream.toByteArray();
                    return;
                }
                this.f709d = (Parcelable) this.b;
                return;
            case 2:
                this.c = ((String) this.b).getBytes(Charset.forName("UTF-16"));
                return;
            case 3:
                this.c = (byte[]) this.b;
                return;
            case 4:
            case 6:
                this.c = this.b.toString().getBytes(Charset.forName("UTF-16"));
                return;
            default:
                return;
        }
    }

    @Deprecated
    public Icon n() {
        return o((Context) null);
    }

    public Icon o(Context context) {
        Icon icon;
        switch (this.a) {
            case -1:
                return (Icon) this.b;
            case 1:
                icon = Icon.createWithBitmap((Bitmap) this.b);
                break;
            case 2:
                icon = Icon.createWithResource(e(), this.f710e);
                break;
            case 3:
                icon = Icon.createWithData((byte[]) this.b, this.f710e, this.f711f);
                break;
            case 4:
                icon = Icon.createWithContentUri((String) this.b);
                break;
            case 5:
                if (Build.VERSION.SDK_INT < 26) {
                    icon = Icon.createWithBitmap(a((Bitmap) this.b, false));
                    break;
                } else {
                    icon = Icon.createWithAdaptiveBitmap((Bitmap) this.b);
                    break;
                }
            case 6:
                if (context != null) {
                    InputStream k2 = k(context);
                    if (k2 != null) {
                        if (Build.VERSION.SDK_INT < 26) {
                            icon = Icon.createWithBitmap(a(BitmapFactory.decodeStream(k2), false));
                            break;
                        } else {
                            icon = Icon.createWithAdaptiveBitmap(BitmapFactory.decodeStream(k2));
                            break;
                        }
                    } else {
                        throw new IllegalStateException("Cannot load adaptive icon from uri: " + i());
                    }
                } else {
                    throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + i());
                }
            default:
                throw new IllegalArgumentException("Unknown type");
        }
        ColorStateList colorStateList = this.f712g;
        if (colorStateList != null) {
            icon.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = this.f713h;
        if (mode != f708j) {
            icon.setTintMode(mode);
        }
        return icon;
    }

    public String toString() {
        if (this.a == -1) {
            return String.valueOf(this.b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        sb.append(p(this.a));
        switch (this.a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(e());
                sb.append(" id=");
                sb.append(String.format("0x%08x", new Object[]{Integer.valueOf(c())}));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f710e);
                if (this.f711f != 0) {
                    sb.append(" off=");
                    sb.append(this.f711f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.b);
                break;
        }
        if (this.f712g != null) {
            sb.append(" tint=");
            sb.append(this.f712g);
        }
        if (this.f713h != f708j) {
            sb.append(" mode=");
            sb.append(this.f713h);
        }
        sb.append(")");
        return sb.toString();
    }

    private IconCompat(int i2) {
        this.a = i2;
    }
}
