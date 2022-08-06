package androidx.work;

import androidx.work.e;
import java.util.HashMap;
import java.util.List;

public final class OverwritingInputMerger extends h {
    public e b(List<e> list) {
        e.a aVar = new e.a();
        HashMap hashMap = new HashMap();
        for (e i2 : list) {
            hashMap.putAll(i2.i());
        }
        aVar.d(hashMap);
        return aVar.a();
    }
}
