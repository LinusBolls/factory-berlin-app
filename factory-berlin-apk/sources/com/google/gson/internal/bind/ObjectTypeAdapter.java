package com.google.gson.internal.bind;

import com.google.gson.f;
import com.google.gson.internal.g;
import com.google.gson.s;
import com.google.gson.stream.c;
import com.google.gson.t;
import java.util.ArrayList;

public final class ObjectTypeAdapter extends s<Object> {
    public static final t b = new t() {
        public <T> s<T> c(f fVar, com.google.gson.u.a<T> aVar) {
            if (aVar.c() == Object.class) {
                return new ObjectTypeAdapter(fVar);
            }
            return null;
        }
    };
    private final f a;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.gson.stream.b[] r0 = com.google.gson.stream.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                com.google.gson.stream.b r1 = com.google.gson.stream.b.BEGIN_ARRAY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.gson.stream.b r1 = com.google.gson.stream.b.BEGIN_OBJECT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.gson.stream.b r1 = com.google.gson.stream.b.STRING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.gson.stream.b r1 = com.google.gson.stream.b.NUMBER     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.gson.stream.b r1 = com.google.gson.stream.b.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.gson.stream.b r1 = com.google.gson.stream.b.NULL     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.ObjectTypeAdapter.a.<clinit>():void");
        }
    }

    ObjectTypeAdapter(f fVar) {
        this.a = fVar;
    }

    public Object b(com.google.gson.stream.a aVar) {
        switch (a.a[aVar.Z().ordinal()]) {
            case 1:
                ArrayList arrayList = new ArrayList();
                aVar.a();
                while (aVar.hasNext()) {
                    arrayList.add(b(aVar));
                }
                aVar.k();
                return arrayList;
            case 2:
                g gVar = new g();
                aVar.b();
                while (aVar.hasNext()) {
                    gVar.put(aVar.nextName(), b(aVar));
                }
                aVar.l();
                return gVar;
            case 3:
                return aVar.nextString();
            case 4:
                return Double.valueOf(aVar.z());
            case 5:
                return Boolean.valueOf(aVar.nextBoolean());
            case 6:
                aVar.L();
                return null;
            default:
                throw new IllegalStateException();
        }
    }

    public void d(c cVar, Object obj) {
        if (obj == null) {
            cVar.D();
            return;
        }
        s<?> l2 = this.a.l(obj.getClass());
        if (l2 instanceof ObjectTypeAdapter) {
            cVar.i();
            cVar.l();
            return;
        }
        l2.d(cVar, obj);
    }
}
