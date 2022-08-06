package androidx.core.app;

import android.app.Notification;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import androidx.core.app.j;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* compiled from: NotificationCompatJellybean */
class l {
    private static final Object a = new Object();
    private static Field b;
    private static boolean c;

    public static SparseArray<Bundle> a(List<Bundle> list) {
        int size = list.size();
        SparseArray<Bundle> sparseArray = null;
        for (int i2 = 0; i2 < size; i2++) {
            Bundle bundle = list.get(i2);
            if (bundle != null) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                sparseArray.put(i2, bundle);
            }
        }
        return sparseArray;
    }

    static Bundle b(j.a aVar) {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        IconCompat e2 = aVar.e();
        bundle2.putInt("icon", e2 != null ? e2.c() : 0);
        bundle2.putCharSequence("title", aVar.i());
        bundle2.putParcelable("actionIntent", aVar.a());
        if (aVar.d() != null) {
            bundle = new Bundle(aVar.d());
        } else {
            bundle = new Bundle();
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        bundle2.putBundle("extras", bundle);
        bundle2.putParcelableArray("remoteInputs", e(aVar.f()));
        bundle2.putBoolean("showsUserInterface", aVar.h());
        bundle2.putInt("semanticAction", aVar.g());
        return bundle2;
    }

    public static Bundle c(Notification notification) {
        synchronized (a) {
            if (c) {
                return null;
            }
            try {
                if (b == null) {
                    Field declaredField = Notification.class.getDeclaredField("extras");
                    if (!Bundle.class.isAssignableFrom(declaredField.getType())) {
                        Log.e("NotificationCompat", "Notification.extras field is not of type Bundle");
                        c = true;
                        return null;
                    }
                    declaredField.setAccessible(true);
                    b = declaredField;
                }
                Bundle bundle = (Bundle) b.get(notification);
                if (bundle == null) {
                    bundle = new Bundle();
                    b.set(notification, bundle);
                }
                return bundle;
            } catch (IllegalAccessException e2) {
                Log.e("NotificationCompat", "Unable to access notification extras", e2);
                c = true;
                return null;
            } catch (NoSuchFieldException e3) {
                Log.e("NotificationCompat", "Unable to access notification extras", e3);
                c = true;
                return null;
            }
        }
    }

    private static Bundle d(n nVar) {
        Bundle bundle = new Bundle();
        bundle.putString("resultKey", nVar.i());
        bundle.putCharSequence("label", nVar.h());
        bundle.putCharSequenceArray("choices", nVar.e());
        bundle.putBoolean("allowFreeFormInput", nVar.c());
        bundle.putBundle("extras", nVar.g());
        Set<String> d2 = nVar.d();
        if (d2 != null && !d2.isEmpty()) {
            ArrayList arrayList = new ArrayList(d2.size());
            for (String add : d2) {
                arrayList.add(add);
            }
            bundle.putStringArrayList("allowedDataTypes", arrayList);
        }
        return bundle;
    }

    private static Bundle[] e(n[] nVarArr) {
        if (nVarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[nVarArr.length];
        for (int i2 = 0; i2 < nVarArr.length; i2++) {
            bundleArr[i2] = d(nVarArr[i2]);
        }
        return bundleArr;
    }

    public static Bundle f(Notification.Builder builder, j.a aVar) {
        IconCompat e2 = aVar.e();
        builder.addAction(e2 != null ? e2.c() : 0, aVar.i(), aVar.a());
        Bundle bundle = new Bundle(aVar.d());
        if (aVar.f() != null) {
            bundle.putParcelableArray("android.support.remoteInputs", e(aVar.f()));
        }
        if (aVar.c() != null) {
            bundle.putParcelableArray("android.support.dataRemoteInputs", e(aVar.c()));
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        return bundle;
    }
}
