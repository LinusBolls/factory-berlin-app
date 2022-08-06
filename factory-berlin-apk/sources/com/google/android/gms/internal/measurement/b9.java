package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
final class b9 extends d9<FieldDescriptorType, Object> {
    b9(int i2) {
        super(i2, (b9) null);
    }

    public final void e() {
        if (!i()) {
            for (int i2 = 0; i2 < j(); i2++) {
                Map.Entry h2 = h(i2);
                if (((u6) h2.getKey()).e()) {
                    h2.setValue(Collections.unmodifiableList((List) h2.getValue()));
                }
            }
            for (Map.Entry entry : m()) {
                if (((u6) entry.getKey()).e()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.e();
    }
}
