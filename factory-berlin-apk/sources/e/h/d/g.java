package e.h.d;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.core.content.c.c;
import e.h.h.b;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;

/* compiled from: TypefaceCompatApi26Impl */
public class g extends e {

    /* renamed from: g  reason: collision with root package name */
    protected final Class<?> f8625g;

    /* renamed from: h  reason: collision with root package name */
    protected final Constructor<?> f8626h;

    /* renamed from: i  reason: collision with root package name */
    protected final Method f8627i;

    /* renamed from: j  reason: collision with root package name */
    protected final Method f8628j;

    /* renamed from: k  reason: collision with root package name */
    protected final Method f8629k;

    /* renamed from: l  reason: collision with root package name */
    protected final Method f8630l;

    /* renamed from: m  reason: collision with root package name */
    protected final Method f8631m;

    public g() {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Constructor<?> constructor;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> y = y();
            constructor = z(y);
            method4 = v(y);
            method3 = w(y);
            method2 = A(y);
            method = u(y);
            Class<?> cls2 = y;
            method5 = x(y);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class " + e2.getClass().getName(), e2);
            method5 = null;
            constructor = null;
            method4 = null;
            method3 = null;
            method2 = null;
            method = null;
        }
        this.f8625g = cls;
        this.f8626h = constructor;
        this.f8627i = method4;
        this.f8628j = method3;
        this.f8629k = method2;
        this.f8630l = method;
        this.f8631m = method5;
    }

    private Object o() {
        try {
            return this.f8626h.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    private void p(Object obj) {
        try {
            this.f8630l.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    private boolean q(Context context, Object obj, String str, int i2, int i3, int i4, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f8627i.invoke(obj, new Object[]{context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), fontVariationAxisArr})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean r(Object obj, ByteBuffer byteBuffer, int i2, int i3, int i4) {
        try {
            return ((Boolean) this.f8628j.invoke(obj, new Object[]{byteBuffer, Integer.valueOf(i2), null, Integer.valueOf(i3), Integer.valueOf(i4)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean s(Object obj) {
        try {
            return ((Boolean) this.f8629k.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean t() {
        if (this.f8627i == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.f8627i != null;
    }

    /* access modifiers changed from: protected */
    public Method A(Class<?> cls) {
        return cls.getMethod("freeze", new Class[0]);
    }

    public Typeface b(Context context, c.b bVar, Resources resources, int i2) {
        if (!t()) {
            return super.b(context, bVar, resources, i2);
        }
        Object o = o();
        if (o == null) {
            return null;
        }
        for (c.C0014c cVar : bVar.a()) {
            if (!q(context, o, cVar.a(), cVar.c(), cVar.e(), cVar.f() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(cVar.d()))) {
                p(o);
                return null;
            }
        }
        if (!s(o)) {
            return null;
        }
        return l(o);
    }

    public Typeface c(Context context, CancellationSignal cancellationSignal, b.f[] fVarArr, int i2) {
        Typeface l2;
        ParcelFileDescriptor openFileDescriptor;
        if (fVarArr.length < 1) {
            return null;
        }
        if (!t()) {
            b.f h2 = h(fVarArr, i2);
            try {
                openFileDescriptor = context.getContentResolver().openFileDescriptor(h2.c(), "r", cancellationSignal);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(h2.d()).setItalic(h2.e()).build();
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return build;
            } catch (IOException unused) {
                return null;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        } else {
            Map<Uri, ByteBuffer> i3 = b.i(context, fVarArr, cancellationSignal);
            Object o = o();
            if (o == null) {
                return null;
            }
            boolean z = false;
            for (b.f fVar : fVarArr) {
                ByteBuffer byteBuffer = i3.get(fVar.c());
                if (byteBuffer != null) {
                    if (!r(o, byteBuffer, fVar.b(), fVar.d(), fVar.e() ? 1 : 0)) {
                        p(o);
                        return null;
                    }
                    z = true;
                }
            }
            if (!z) {
                p(o);
                return null;
            } else if (s(o) && (l2 = l(o)) != null) {
                return Typeface.create(l2, i2);
            } else {
                return null;
            }
        }
        throw th;
    }

    public Typeface e(Context context, Resources resources, int i2, String str, int i3) {
        if (!t()) {
            return super.e(context, resources, i2, str, i3);
        }
        Object o = o();
        if (o == null) {
            return null;
        }
        if (!q(context, o, str, 0, -1, -1, (FontVariationAxis[]) null)) {
            p(o);
            return null;
        } else if (!s(o)) {
            return null;
        } else {
            return l(o);
        }
    }

    /* access modifiers changed from: protected */
    public Typeface l(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f8625g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f8631m.invoke((Object) null, new Object[]{newInstance, -1, -1});
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public Method u(Class<?> cls) {
        return cls.getMethod("abortCreation", new Class[0]);
    }

    /* access modifiers changed from: protected */
    public Method v(Class<?> cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", new Class[]{AssetManager.class, String.class, Integer.TYPE, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class});
    }

    /* access modifiers changed from: protected */
    public Method w(Class<?> cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", new Class[]{ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2});
    }

    /* access modifiers changed from: protected */
    public Method x(Class<?> cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass(), cls2, cls2});
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    /* access modifiers changed from: protected */
    public Class<?> y() {
        return Class.forName("android.graphics.FontFamily");
    }

    /* access modifiers changed from: protected */
    public Constructor<?> z(Class<?> cls) {
        return cls.getConstructor(new Class[0]);
    }
}
