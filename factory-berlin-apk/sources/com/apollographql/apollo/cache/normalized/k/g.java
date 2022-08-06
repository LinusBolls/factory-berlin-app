package com.apollographql.apollo.cache.normalized.k;

import com.apollographql.apollo.cache.normalized.e;
import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.v;
import l.d0.d;

/* compiled from: RecordWeigher.kt */
public final class g {
    public static final g a = new g();

    private g() {
    }

    public static final int a(Object obj, Object obj2) {
        return a.b(obj) - a.b(obj2);
    }

    private final int b(Object obj) {
        if (obj == null) {
            return 4;
        }
        if (obj instanceof String) {
            return d.a((String) obj).length;
        }
        if (obj instanceof Boolean) {
            return 16;
        }
        if (obj instanceof BigDecimal) {
            return 32;
        }
        if (obj instanceof List) {
            int i2 = 0;
            for (Object b : (Iterable) obj) {
                i2 += a.b(b);
            }
            return 16 + i2;
        } else if (obj instanceof e) {
            return d.a(((e) obj).a()).length;
        } else {
            throw new IllegalStateException(("Unknown field type in Record. " + v.b(obj.getClass()).a()).toString());
        }
    }
}
