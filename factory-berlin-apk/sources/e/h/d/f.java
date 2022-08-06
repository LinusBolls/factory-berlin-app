package e.h.d;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.core.content.c.c;
import e.e.g;
import e.h.h.b;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: TypefaceCompatApi24Impl */
class f extends j {
    private static final Class<?> b;
    private static final Constructor<?> c;

    /* renamed from: d  reason: collision with root package name */
    private static final Method f8623d;

    /* renamed from: e  reason: collision with root package name */
    private static final Method f8624e;

    static {
        Method method;
        Method method2;
        Class<?> cls;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            method = cls.getMethod("addFontWeightStyle", new Class[]{ByteBuffer.class, Integer.TYPE, List.class, Integer.TYPE, Boolean.TYPE});
            method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass()});
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi24Impl", e2.getClass().getName(), e2);
            cls = null;
            method2 = null;
            method = null;
        }
        c = constructor;
        b = cls;
        f8623d = method;
        f8624e = method2;
    }

    f() {
    }

    private static boolean k(Object obj, ByteBuffer byteBuffer, int i2, int i3, boolean z) {
        try {
            return ((Boolean) f8623d.invoke(obj, new Object[]{byteBuffer, Integer.valueOf(i2), null, Integer.valueOf(i3), Boolean.valueOf(z)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private static Typeface l(Object obj) {
        try {
            Object newInstance = Array.newInstance(b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f8624e.invoke((Object) null, new Object[]{newInstance});
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public static boolean m() {
        if (f8623d == null) {
            Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        return f8623d != null;
    }

    private static Object n() {
        try {
            return c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    public Typeface b(Context context, c.b bVar, Resources resources, int i2) {
        Object n2 = n();
        if (n2 == null) {
            return null;
        }
        for (c.C0014c cVar : bVar.a()) {
            ByteBuffer b2 = k.b(context, resources, cVar.b());
            if (b2 == null || !k(n2, b2, cVar.c(), cVar.e(), cVar.f())) {
                return null;
            }
        }
        return l(n2);
    }

    public Typeface c(Context context, CancellationSignal cancellationSignal, b.f[] fVarArr, int i2) {
        Object n2 = n();
        if (n2 == null) {
            return null;
        }
        g gVar = new g();
        for (b.f fVar : fVarArr) {
            Uri c2 = fVar.c();
            ByteBuffer byteBuffer = (ByteBuffer) gVar.get(c2);
            if (byteBuffer == null) {
                byteBuffer = k.f(context, cancellationSignal, c2);
                gVar.put(c2, byteBuffer);
            }
            if (byteBuffer == null || !k(n2, byteBuffer, fVar.b(), fVar.d(), fVar.e())) {
                return null;
            }
        }
        Typeface l2 = l(n2);
        if (l2 == null) {
            return null;
        }
        return Typeface.create(l2, i2);
    }
}
