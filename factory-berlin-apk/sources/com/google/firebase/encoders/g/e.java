package com.google.firebase.encoders.g;

import android.util.Base64;
import android.util.JsonWriter;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.b;
import com.google.firebase.encoders.c;
import com.google.firebase.encoders.d;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Map;

/* compiled from: com.google.firebase:firebase-encoders-json@@16.1.0 */
final class e implements c, com.google.firebase.encoders.e {
    private e a = null;
    private boolean b = true;
    private final JsonWriter c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<Class<?>, b<?>> f4159d;

    /* renamed from: e  reason: collision with root package name */
    private final Map<Class<?>, d<?>> f4160e;

    /* renamed from: f  reason: collision with root package name */
    private final b<Object> f4161f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f4162g;

    e(Writer writer, Map<Class<?>, b<?>> map, Map<Class<?>, d<?>> map2, b<Object> bVar, boolean z) {
        this.c = new JsonWriter(writer);
        this.f4159d = map;
        this.f4160e = map2;
        this.f4161f = bVar;
        this.f4162g = z;
    }

    private boolean q(Object obj) {
        return obj == null || obj.getClass().isArray() || (obj instanceof Collection) || (obj instanceof Date) || (obj instanceof Enum) || (obj instanceof Number);
    }

    private e t(String str, Object obj) {
        v();
        this.c.name(str);
        if (obj == null) {
            this.c.nullValue();
            return this;
        }
        i(obj, false);
        return this;
    }

    private e u(String str, Object obj) {
        if (obj == null) {
            return this;
        }
        v();
        this.c.name(str);
        i(obj, false);
        return this;
    }

    private void v() {
        if (this.b) {
            e eVar = this.a;
            if (eVar != null) {
                eVar.v();
                this.a.b = false;
                this.a = null;
                this.c.endObject();
                return;
            }
            return;
        }
        throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
    }

    public /* bridge */ /* synthetic */ c a(String str, boolean z) {
        n(str, z);
        return this;
    }

    public /* bridge */ /* synthetic */ c b(String str, long j2) {
        l(str, j2);
        return this;
    }

    public /* bridge */ /* synthetic */ c c(String str, int i2) {
        k(str, i2);
        return this;
    }

    public /* bridge */ /* synthetic */ com.google.firebase.encoders.e d(String str) {
        j(str);
        return this;
    }

    public /* bridge */ /* synthetic */ com.google.firebase.encoders.e e(boolean z) {
        o(z);
        return this;
    }

    public /* bridge */ /* synthetic */ c f(String str, Object obj) {
        m(str, obj);
        return this;
    }

    public e g(int i2) {
        v();
        this.c.value((long) i2);
        return this;
    }

    public e h(long j2) {
        v();
        this.c.value(j2);
        return this;
    }

    /* access modifiers changed from: package-private */
    public e i(Object obj, boolean z) {
        Class<?> cls;
        int i2 = 0;
        if (z && q(obj)) {
            Object[] objArr = new Object[1];
            if (obj == null) {
                cls = null;
            } else {
                cls = obj.getClass();
            }
            objArr[0] = cls;
            throw new EncodingException(String.format("%s cannot be encoded inline", objArr));
        } else if (obj == null) {
            this.c.nullValue();
            return this;
        } else if (obj instanceof Number) {
            this.c.value((Number) obj);
            return this;
        } else if (obj.getClass().isArray()) {
            if (obj instanceof byte[]) {
                p((byte[]) obj);
                return this;
            }
            this.c.beginArray();
            if (obj instanceof int[]) {
                int[] iArr = (int[]) obj;
                int length = iArr.length;
                while (i2 < length) {
                    this.c.value((long) iArr[i2]);
                    i2++;
                }
            } else if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                int length2 = jArr.length;
                while (i2 < length2) {
                    h(jArr[i2]);
                    i2++;
                }
            } else if (obj instanceof double[]) {
                double[] dArr = (double[]) obj;
                int length3 = dArr.length;
                while (i2 < length3) {
                    this.c.value(dArr[i2]);
                    i2++;
                }
            } else if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                int length4 = zArr.length;
                while (i2 < length4) {
                    this.c.value(zArr[i2]);
                    i2++;
                }
            } else if (obj instanceof Number[]) {
                for (Number i3 : (Number[]) obj) {
                    i(i3, false);
                }
            } else {
                for (Object i4 : (Object[]) obj) {
                    i(i4, false);
                }
            }
            this.c.endArray();
            return this;
        } else if (obj instanceof Collection) {
            this.c.beginArray();
            for (Object i5 : (Collection) obj) {
                i(i5, false);
            }
            this.c.endArray();
            return this;
        } else if (obj instanceof Map) {
            this.c.beginObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                try {
                    m((String) key, entry.getValue());
                } catch (ClassCastException e2) {
                    throw new EncodingException(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", new Object[]{key, key.getClass()}), e2);
                }
            }
            this.c.endObject();
            return this;
        } else {
            b bVar = this.f4159d.get(obj.getClass());
            if (bVar != null) {
                s(bVar, obj, z);
                return this;
            }
            d dVar = this.f4160e.get(obj.getClass());
            if (dVar != null) {
                dVar.a(obj, this);
                return this;
            } else if (obj instanceof Enum) {
                j(((Enum) obj).name());
                return this;
            } else {
                s(this.f4161f, obj, z);
                return this;
            }
        }
    }

    public e j(String str) {
        v();
        this.c.value(str);
        return this;
    }

    public e k(String str, int i2) {
        v();
        this.c.name(str);
        g(i2);
        return this;
    }

    public e l(String str, long j2) {
        v();
        this.c.name(str);
        h(j2);
        return this;
    }

    public e m(String str, Object obj) {
        if (this.f4162g) {
            u(str, obj);
            return this;
        }
        t(str, obj);
        return this;
    }

    public e n(String str, boolean z) {
        v();
        this.c.name(str);
        o(z);
        return this;
    }

    public e o(boolean z) {
        v();
        this.c.value(z);
        return this;
    }

    public e p(byte[] bArr) {
        v();
        if (bArr == null) {
            this.c.nullValue();
        } else {
            this.c.value(Base64.encodeToString(bArr, 2));
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    public void r() {
        v();
        this.c.flush();
    }

    /* access modifiers changed from: package-private */
    public e s(b<Object> bVar, Object obj, boolean z) {
        if (!z) {
            this.c.beginObject();
        }
        bVar.a(obj, this);
        if (!z) {
            this.c.endObject();
        }
        return this;
    }
}
