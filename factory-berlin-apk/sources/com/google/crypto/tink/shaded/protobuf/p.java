package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.y;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: ExtensionRegistryLite */
public class p {
    private static boolean b = true;
    private static volatile p c;

    /* renamed from: d  reason: collision with root package name */
    static final p f3778d = new p(true);
    private final Map<a, y.e<?, ?>> a;

    /* compiled from: ExtensionRegistryLite */
    private static final class a {
        private final Object a;
        private final int b;

        a(Object obj, int i2) {
            this.a = obj;
            this.b = i2;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.a == aVar.a && this.b == aVar.b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (System.identityHashCode(this.a) * 65535) + this.b;
        }
    }

    p() {
        this.a = new HashMap();
    }

    public static p b() {
        p pVar = c;
        if (pVar == null) {
            synchronized (p.class) {
                pVar = c;
                if (pVar == null) {
                    if (b) {
                        pVar = o.a();
                    } else {
                        pVar = f3778d;
                    }
                    c = pVar;
                }
            }
        }
        return pVar;
    }

    public <ContainingType extends q0> y.e<ContainingType, ?> a(ContainingType containingtype, int i2) {
        return this.a.get(new a(containingtype, i2));
    }

    p(boolean z) {
        this.a = Collections.emptyMap();
    }
}
