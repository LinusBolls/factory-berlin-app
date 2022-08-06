package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.z6;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
public class m6 {
    private static volatile m6 b;
    private static volatile m6 c;

    /* renamed from: d  reason: collision with root package name */
    private static final m6 f2415d = new m6(true);
    private final Map<a, z6.f<?, ?>> a;

    /* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
    static final class a {
        private final Object a;
        private final int b;

        a(Object obj, int i2) {
            this.a = obj;
            this.b = i2;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.a == aVar.a && this.b == aVar.b) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.a) * 65535) + this.b;
        }
    }

    m6() {
        this.a = new HashMap();
    }

    public static m6 a() {
        m6 m6Var = b;
        if (m6Var == null) {
            synchronized (m6.class) {
                m6Var = b;
                if (m6Var == null) {
                    m6Var = f2415d;
                    b = m6Var;
                }
            }
        }
        return m6Var;
    }

    public static m6 c() {
        Class<m6> cls = m6.class;
        m6 m6Var = c;
        if (m6Var != null) {
            return m6Var;
        }
        synchronized (cls) {
            m6 m6Var2 = c;
            if (m6Var2 != null) {
                return m6Var2;
            }
            m6 b2 = x6.b(cls);
            c = b2;
            return b2;
        }
    }

    public final <ContainingType extends j8> z6.f<ContainingType, ?> b(ContainingType containingtype, int i2) {
        return this.a.get(new a(containingtype, i2));
    }

    private m6(boolean z) {
        this.a = Collections.emptyMap();
    }
}
