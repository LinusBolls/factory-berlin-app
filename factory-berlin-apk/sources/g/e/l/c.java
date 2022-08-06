package g.e.l;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.u;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: PermissionBitteFragment */
public class c extends Fragment {
    private final e0<e> d0;
    final LiveData<e> e0;
    private boolean f0 = false;

    public c() {
        e0<e> e0Var = new e0<>();
        this.d0 = e0Var;
        this.e0 = e0Var;
        J1(true);
    }

    @TargetApi(16)
    private Map<String, d> R1(Context context) {
        PackageInfo packageInfo;
        String str;
        PackageManager packageManager = context.getPackageManager();
        try {
            packageInfo = packageManager.getPackageInfo(context.getPackageName(), 4096);
        } catch (PackageManager.NameNotFoundException unused) {
            packageInfo = null;
        }
        HashMap hashMap = new HashMap();
        if (packageInfo != null && packageInfo.requestedPermissions != null && packageInfo.requestedPermissionsFlags != null) {
            int i2 = 0;
            while (true) {
                String[] strArr = packageInfo.requestedPermissions;
                if (i2 >= strArr.length) {
                    break;
                }
                int i3 = packageInfo.requestedPermissionsFlags[i2];
                try {
                    str = packageManager.getPermissionInfo(strArr[i2], 0).group;
                } catch (PackageManager.NameNotFoundException unused2) {
                    str = null;
                }
                String str2 = packageInfo.requestedPermissions[i2];
                if (str != null) {
                    if ((i3 & 2) != 0) {
                        hashMap.put(str2, d.GRANTED);
                    } else if (M1(str2)) {
                        hashMap.put(str2, d.SHOW_RATIONALE);
                    } else {
                        hashMap.put(str2, d.REQUEST_PERMISSION);
                    }
                }
                i2++;
            }
        }
        return hashMap;
    }

    private void S1(e eVar, boolean z) {
        if (z) {
            this.d0.u(eVar);
        } else if (!eVar.equals(this.d0.l())) {
            this.d0.u(eVar);
        }
    }

    private void T1() {
        Map<String, d> R1 = R1(v());
        e l2 = this.d0.l();
        if (l2 != null) {
            for (a a : l2.c(d.DENIED)) {
                String a2 = a.a();
                d dVar = R1.get(a2);
                if (!(dVar == null || dVar == d.GRANTED)) {
                    R1.put(a2, d.DENIED);
                }
            }
        }
        S1(new e(R1), false);
    }

    public void Q0(int i2, String[] strArr, int[] iArr) {
        if (i2 == 23 && strArr.length > 0) {
            HashMap hashMap = new HashMap();
            for (int i3 = 0; i3 < strArr.length; i3++) {
                String str = strArr[i3];
                if (iArr[i3] != -1) {
                    hashMap.put(str, d.GRANTED);
                } else if (M1(str)) {
                    hashMap.put(str, d.SHOW_RATIONALE);
                } else {
                    hashMap.put(str, d.DENIED);
                }
            }
            S1(new e(hashMap), true);
        }
    }

    /* access modifiers changed from: package-private */
    public void Q1() {
        if (!m0()) {
            this.f0 = true;
            return;
        }
        Map<String, d> R1 = R1(v());
        if (R1.isEmpty()) {
            u i2 = H().i();
            i2.q(this);
            i2.k();
            return;
        }
        Set<String> keySet = R1.keySet();
        if (!keySet.isEmpty()) {
            u1((String[]) keySet.toArray(new String[0]), 23);
        }
    }

    public void R0() {
        super.R0();
        if (this.f0) {
            this.f0 = false;
            Q1();
            return;
        }
        T1();
    }
}
