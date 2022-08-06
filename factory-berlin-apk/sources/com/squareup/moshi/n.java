package com.squareup.moshi;

import com.squareup.moshi.JsonAdapter;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: Moshi */
public final class n {

    /* renamed from: d  reason: collision with root package name */
    static final List<JsonAdapter.d> f8161d;
    private final List<JsonAdapter.d> a;
    /* access modifiers changed from: private */
    public final ThreadLocal<c> b = new ThreadLocal<>();
    /* access modifiers changed from: private */
    public final Map<Object, JsonAdapter<?>> c = new LinkedHashMap();

    /* compiled from: Moshi */
    public static final class a {
        final List<JsonAdapter.d> a = new ArrayList();

        public a a(JsonAdapter.d dVar) {
            if (dVar != null) {
                this.a.add(dVar);
                return this;
            }
            throw new IllegalArgumentException("factory == null");
        }

        public a b(Object obj) {
            if (obj != null) {
                a(a.d(obj));
                return this;
            }
            throw new IllegalArgumentException("adapter == null");
        }

        public n c() {
            return new n(this);
        }
    }

    /* compiled from: Moshi */
    static final class b<T> extends JsonAdapter<T> {
        final Type a;
        final String b;
        final Object c;

        /* renamed from: d  reason: collision with root package name */
        JsonAdapter<T> f8162d;

        b(Type type, String str, Object obj) {
            this.a = type;
            this.b = str;
            this.c = obj;
        }

        public T b(g gVar) {
            JsonAdapter<T> jsonAdapter = this.f8162d;
            if (jsonAdapter != null) {
                return jsonAdapter.b(gVar);
            }
            throw new IllegalStateException("JsonAdapter isn't ready");
        }

        public void h(l lVar, T t) {
            JsonAdapter<T> jsonAdapter = this.f8162d;
            if (jsonAdapter != null) {
                jsonAdapter.h(lVar, t);
                return;
            }
            throw new IllegalStateException("JsonAdapter isn't ready");
        }

        public String toString() {
            JsonAdapter<T> jsonAdapter = this.f8162d;
            return jsonAdapter != null ? jsonAdapter.toString() : super.toString();
        }
    }

    /* compiled from: Moshi */
    final class c {
        final List<b<?>> a = new ArrayList();
        final Deque<b<?>> b = new ArrayDeque();
        boolean c;

        c() {
        }

        /* access modifiers changed from: package-private */
        public <T> void a(JsonAdapter<T> jsonAdapter) {
            this.b.getLast().f8162d = jsonAdapter;
        }

        /* access modifiers changed from: package-private */
        public IllegalArgumentException b(IllegalArgumentException illegalArgumentException) {
            if (this.c) {
                return illegalArgumentException;
            }
            this.c = true;
            if (this.b.size() == 1 && this.b.getFirst().b == null) {
                return illegalArgumentException;
            }
            StringBuilder sb = new StringBuilder(illegalArgumentException.getMessage());
            Iterator<b<?>> descendingIterator = this.b.descendingIterator();
            while (descendingIterator.hasNext()) {
                b next = descendingIterator.next();
                sb.append("\nfor ");
                sb.append(next.a);
                if (next.b != null) {
                    sb.append(' ');
                    sb.append(next.b);
                }
            }
            return new IllegalArgumentException(sb.toString(), illegalArgumentException);
        }

        /* access modifiers changed from: package-private */
        public void c(boolean z) {
            this.b.removeLast();
            if (this.b.isEmpty()) {
                n.this.b.remove();
                if (z) {
                    synchronized (n.this.c) {
                        int size = this.a.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            b bVar = this.a.get(i2);
                            JsonAdapter<T> jsonAdapter = (JsonAdapter) n.this.c.put(bVar.c, bVar.f8162d);
                            if (jsonAdapter != null) {
                                bVar.f8162d = jsonAdapter;
                                n.this.c.put(bVar.c, jsonAdapter);
                            }
                        }
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        public <T> JsonAdapter<T> d(Type type, String str, Object obj) {
            int size = this.a.size();
            for (int i2 = 0; i2 < size; i2++) {
                b bVar = this.a.get(i2);
                if (bVar.c.equals(obj)) {
                    this.b.add(bVar);
                    JsonAdapter<T> jsonAdapter = bVar.f8162d;
                    return jsonAdapter != null ? jsonAdapter : bVar;
                }
            }
            b bVar2 = new b(type, str, obj);
            this.a.add(bVar2);
            this.b.add(bVar2);
            return null;
        }
    }

    static {
        ArrayList arrayList = new ArrayList(5);
        f8161d = arrayList;
        arrayList.add(StandardJsonAdapters.a);
        f8161d.add(CollectionJsonAdapter.FACTORY);
        f8161d.add(MapJsonAdapter.FACTORY);
        f8161d.add(ArrayJsonAdapter.FACTORY);
        f8161d.add(ClassJsonAdapter.FACTORY);
    }

    n(a aVar) {
        ArrayList arrayList = new ArrayList(aVar.a.size() + f8161d.size());
        arrayList.addAll(aVar.a);
        arrayList.addAll(f8161d);
        this.a = Collections.unmodifiableList(arrayList);
    }

    private Object g(Type type, Set<? extends Annotation> set) {
        if (set.isEmpty()) {
            return type;
        }
        return Arrays.asList(new Object[]{type, set});
    }

    public <T> JsonAdapter<T> c(Class<T> cls) {
        return e(cls, com.squareup.moshi.internal.a.a);
    }

    public <T> JsonAdapter<T> d(Type type) {
        return e(type, com.squareup.moshi.internal.a.a);
    }

    public <T> JsonAdapter<T> e(Type type, Set<? extends Annotation> set) {
        return f(type, set, (String) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0020, code lost:
        r1 = r4.b.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
        if (r1 != null) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002a, code lost:
        r1 = new com.squareup.moshi.n.c(r4);
        r4.b.set(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0034, code lost:
        r7 = r1.d(r5, r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0039, code lost:
        if (r7 == null) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003b, code lost:
        r1.c(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003e, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r7 = r4.a.size();
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0046, code lost:
        if (r2 >= r7) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0048, code lost:
        r3 = r4.a.get(r2).a(r5, r6, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0054, code lost:
        if (r3 != null) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0056, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0059, code lost:
        r1.a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005c, code lost:
        r1.c(true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0060, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007b, code lost:
        throw new java.lang.IllegalArgumentException("No JsonAdapter for " + com.squareup.moshi.internal.a.s(r5, r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007c, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007e, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0083, code lost:
        throw r1.b(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0084, code lost:
        r1.c(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0087, code lost:
        throw r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T> com.squareup.moshi.JsonAdapter<T> f(java.lang.reflect.Type r5, java.util.Set<? extends java.lang.annotation.Annotation> r6, java.lang.String r7) {
        /*
            r4 = this;
            if (r5 == 0) goto L_0x0093
            if (r6 == 0) goto L_0x008b
            java.lang.reflect.Type r5 = com.squareup.moshi.internal.a.a(r5)
            java.lang.reflect.Type r5 = com.squareup.moshi.internal.a.n(r5)
            java.lang.Object r0 = r4.g(r5, r6)
            java.util.Map<java.lang.Object, com.squareup.moshi.JsonAdapter<?>> r1 = r4.c
            monitor-enter(r1)
            java.util.Map<java.lang.Object, com.squareup.moshi.JsonAdapter<?>> r2 = r4.c     // Catch:{ all -> 0x0088 }
            java.lang.Object r2 = r2.get(r0)     // Catch:{ all -> 0x0088 }
            com.squareup.moshi.JsonAdapter r2 = (com.squareup.moshi.JsonAdapter) r2     // Catch:{ all -> 0x0088 }
            if (r2 == 0) goto L_0x001f
            monitor-exit(r1)     // Catch:{ all -> 0x0088 }
            return r2
        L_0x001f:
            monitor-exit(r1)     // Catch:{ all -> 0x0088 }
            java.lang.ThreadLocal<com.squareup.moshi.n$c> r1 = r4.b
            java.lang.Object r1 = r1.get()
            com.squareup.moshi.n$c r1 = (com.squareup.moshi.n.c) r1
            if (r1 != 0) goto L_0x0034
            com.squareup.moshi.n$c r1 = new com.squareup.moshi.n$c
            r1.<init>()
            java.lang.ThreadLocal<com.squareup.moshi.n$c> r2 = r4.b
            r2.set(r1)
        L_0x0034:
            com.squareup.moshi.JsonAdapter r7 = r1.d(r5, r7, r0)
            r0 = 0
            if (r7 == 0) goto L_0x003f
            r1.c(r0)
            return r7
        L_0x003f:
            java.util.List<com.squareup.moshi.JsonAdapter$d> r7 = r4.a     // Catch:{ IllegalArgumentException -> 0x007e }
            int r7 = r7.size()     // Catch:{ IllegalArgumentException -> 0x007e }
            r2 = 0
        L_0x0046:
            if (r2 >= r7) goto L_0x0061
            java.util.List<com.squareup.moshi.JsonAdapter$d> r3 = r4.a     // Catch:{ IllegalArgumentException -> 0x007e }
            java.lang.Object r3 = r3.get(r2)     // Catch:{ IllegalArgumentException -> 0x007e }
            com.squareup.moshi.JsonAdapter$d r3 = (com.squareup.moshi.JsonAdapter.d) r3     // Catch:{ IllegalArgumentException -> 0x007e }
            com.squareup.moshi.JsonAdapter r3 = r3.a(r5, r6, r4)     // Catch:{ IllegalArgumentException -> 0x007e }
            if (r3 != 0) goto L_0x0059
            int r2 = r2 + 1
            goto L_0x0046
        L_0x0059:
            r1.a(r3)     // Catch:{ IllegalArgumentException -> 0x007e }
            r5 = 1
            r1.c(r5)
            return r3
        L_0x0061:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x007e }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IllegalArgumentException -> 0x007e }
            r2.<init>()     // Catch:{ IllegalArgumentException -> 0x007e }
            java.lang.String r3 = "No JsonAdapter for "
            r2.append(r3)     // Catch:{ IllegalArgumentException -> 0x007e }
            java.lang.String r5 = com.squareup.moshi.internal.a.s(r5, r6)     // Catch:{ IllegalArgumentException -> 0x007e }
            r2.append(r5)     // Catch:{ IllegalArgumentException -> 0x007e }
            java.lang.String r5 = r2.toString()     // Catch:{ IllegalArgumentException -> 0x007e }
            r7.<init>(r5)     // Catch:{ IllegalArgumentException -> 0x007e }
            throw r7     // Catch:{ IllegalArgumentException -> 0x007e }
        L_0x007c:
            r5 = move-exception
            goto L_0x0084
        L_0x007e:
            r5 = move-exception
            java.lang.IllegalArgumentException r5 = r1.b(r5)     // Catch:{ all -> 0x007c }
            throw r5     // Catch:{ all -> 0x007c }
        L_0x0084:
            r1.c(r0)
            throw r5
        L_0x0088:
            r5 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0088 }
            throw r5
        L_0x008b:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r6 = "annotations == null"
            r5.<init>(r6)
            throw r5
        L_0x0093:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r6 = "type == null"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.moshi.n.f(java.lang.reflect.Type, java.util.Set, java.lang.String):com.squareup.moshi.JsonAdapter");
    }

    public <T> JsonAdapter<T> h(JsonAdapter.d dVar, Type type, Set<? extends Annotation> set) {
        if (set != null) {
            Type n2 = com.squareup.moshi.internal.a.n(com.squareup.moshi.internal.a.a(type));
            int indexOf = this.a.indexOf(dVar);
            if (indexOf != -1) {
                int size = this.a.size();
                for (int i2 = indexOf + 1; i2 < size; i2++) {
                    JsonAdapter<?> a2 = this.a.get(i2).a(n2, set, this);
                    if (a2 != null) {
                        return a2;
                    }
                }
                throw new IllegalArgumentException("No next JsonAdapter for " + com.squareup.moshi.internal.a.s(n2, set));
            }
            throw new IllegalArgumentException("Unable to skip past unknown factory " + dVar);
        }
        throw new NullPointerException("annotations == null");
    }
}
