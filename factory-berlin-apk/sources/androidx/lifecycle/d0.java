package androidx.lifecycle;

import java.util.HashMap;
import java.util.Map;

/* compiled from: MethodCallsLogger */
public class d0 {
    private Map<String, Integer> a = new HashMap();

    public boolean a(String str, int i2) {
        Integer num = this.a.get(str);
        boolean z = false;
        int intValue = num != null ? num.intValue() : 0;
        if ((intValue & i2) != 0) {
            z = true;
        }
        this.a.put(str, Integer.valueOf(i2 | intValue));
        return !z;
    }
}
