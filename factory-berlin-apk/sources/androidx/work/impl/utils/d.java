package androidx.work.impl.utils;

import android.content.ComponentName;
import android.content.Context;
import androidx.work.i;

/* compiled from: PackageManagerHelper */
public class d {
    private static final String a = i.f("PackageManagerHelper");

    public static void a(Context context, Class<?> cls, boolean z) {
        String str;
        String str2 = "enabled";
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z ? 1 : 2, 1);
            i c = i.c();
            String str3 = a;
            Object[] objArr = new Object[2];
            objArr[0] = cls.getName();
            if (z) {
                str = str2;
            } else {
                str = "disabled";
            }
            objArr[1] = str;
            c.a(str3, String.format("%s %s", objArr), new Throwable[0]);
        } catch (Exception e2) {
            i c2 = i.c();
            String str4 = a;
            Object[] objArr2 = new Object[2];
            objArr2[0] = cls.getName();
            if (!z) {
                str2 = "disabled";
            }
            objArr2[1] = str2;
            c2.a(str4, String.format("%s could not be %s", objArr2), e2);
        }
    }
}
