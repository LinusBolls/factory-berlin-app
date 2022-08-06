package g.e.b;

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
    private static final SparseIntArray a;

    /* renamed from: g.e.b.a$a  reason: collision with other inner class name */
    /* compiled from: DataBinderMapperImpl */
    private static class C0655a {
        static final HashMap<String, Integer> a;

        static {
            HashMap<String, Integer> hashMap = new HashMap<>(2);
            a = hashMap;
            hashMap.put("layout/frag_room_schedule_day_division_0", Integer.valueOf(f.frag_room_schedule_day_division));
            a.put("layout/frag_room_schedule_item_0", Integer.valueOf(f.frag_room_schedule_item));
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(2);
        a = sparseIntArray;
        sparseIntArray.put(f.frag_room_schedule_day_division, 1);
        a.put(f.frag_room_schedule_item, 2);
    }

    public List<c> a() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new androidx.databinding.k.b.a());
        return arrayList;
    }

    public ViewDataBinding b(e eVar, View view, int i2) {
        int i3 = a.get(i2);
        if (i3 <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag == null) {
            throw new RuntimeException("view must have a tag");
        } else if (i3 != 1) {
            if (i3 != 2) {
                return null;
            }
            if ("layout/frag_room_schedule_item_0".equals(tag)) {
                return new g.e.b.i.e(eVar, view);
            }
            throw new IllegalArgumentException("The tag for frag_room_schedule_item is invalid. Received: " + tag);
        } else if ("layout/frag_room_schedule_day_division_0".equals(tag)) {
            return new g.e.b.i.c(eVar, view);
        } else {
            throw new IllegalArgumentException("The tag for frag_room_schedule_day_division is invalid. Received: " + tag);
        }
    }

    public ViewDataBinding c(e eVar, View[] viewArr, int i2) {
        if (viewArr == null || viewArr.length == 0 || a.get(i2) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    public int d(String str) {
        Integer num;
        if (str == null || (num = C0655a.a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }
}
