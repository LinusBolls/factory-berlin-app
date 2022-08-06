package androidx.databinding.k.b;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.c;
import androidx.databinding.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: DataBinderMapperImpl */
public class a extends c {
    private static final SparseIntArray a = new SparseIntArray(0);

    /* renamed from: androidx.databinding.k.b.a$a  reason: collision with other inner class name */
    /* compiled from: DataBinderMapperImpl */
    private static class C0019a {
        static final HashMap<String, Integer> a = new HashMap<>(0);
    }

    public List<c> a() {
        return new ArrayList(0);
    }

    public ViewDataBinding b(e eVar, View view, int i2) {
        if (a.get(i2) <= 0 || view.getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    public ViewDataBinding c(e eVar, View[] viewArr, int i2) {
        if (viewArr == null || viewArr.length == 0 || a.get(i2) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    public int d(String str) {
        Integer num;
        if (str == null || (num = C0019a.a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }
}
