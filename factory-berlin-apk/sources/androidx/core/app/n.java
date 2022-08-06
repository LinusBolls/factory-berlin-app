package androidx.core.app;

import android.app.RemoteInput;
import android.os.Build;
import android.os.Bundle;
import java.util.Set;

/* compiled from: RemoteInput */
public final class n {
    static RemoteInput a(n nVar) {
        RemoteInput.Builder addExtras = new RemoteInput.Builder(nVar.i()).setLabel(nVar.h()).setChoices(nVar.e()).setAllowFreeFormInput(nVar.c()).addExtras(nVar.g());
        if (Build.VERSION.SDK_INT >= 29) {
            addExtras.setEditChoicesBeforeSending(nVar.f());
        }
        return addExtras.build();
    }

    static RemoteInput[] b(n[] nVarArr) {
        if (nVarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[nVarArr.length];
        for (int i2 = 0; i2 < nVarArr.length; i2++) {
            remoteInputArr[i2] = a(nVarArr[i2]);
        }
        return remoteInputArr;
    }

    public abstract boolean c();

    public abstract Set<String> d();

    public abstract CharSequence[] e();

    public abstract int f();

    public abstract Bundle g();

    public abstract CharSequence h();

    public abstract String i();
}
