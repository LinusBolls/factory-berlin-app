package retrofit2;

import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.Map;
import k.c0;
import k.u;
import k.y;

/* compiled from: ParameterHandler */
abstract class m<T> {

    /* compiled from: ParameterHandler */
    class a extends m<Iterable<T>> {
        a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void a(o oVar, Iterable<T> iterable) {
            if (iterable != null) {
                for (T a2 : iterable) {
                    m.this.a(oVar, a2);
                }
            }
        }
    }

    /* compiled from: ParameterHandler */
    class b extends m<Object> {
        b() {
        }

        /* access modifiers changed from: package-private */
        public void a(o oVar, Object obj) {
            if (obj != null) {
                int length = Array.getLength(obj);
                for (int i2 = 0; i2 < length; i2++) {
                    m.this.a(oVar, Array.get(obj, i2));
                }
            }
        }
    }

    /* compiled from: ParameterHandler */
    static final class c<T> extends m<T> {
        private final Method a;
        private final int b;
        private final f<T, c0> c;

        c(Method method, int i2, f<T, c0> fVar) {
            this.a = method;
            this.b = i2;
            this.c = fVar;
        }

        /* access modifiers changed from: package-private */
        public void a(o oVar, T t) {
            if (t != null) {
                try {
                    oVar.j(this.c.convert(t));
                } catch (IOException e2) {
                    Method method = this.a;
                    int i2 = this.b;
                    throw v.q(method, e2, i2, "Unable to convert " + t + " to RequestBody", new Object[0]);
                }
            } else {
                throw v.p(this.a, this.b, "Body parameter value must not be null.", new Object[0]);
            }
        }
    }

    /* compiled from: ParameterHandler */
    static final class d<T> extends m<T> {
        private final String a;
        private final f<T, String> b;
        private final boolean c;

        d(String str, f<T, String> fVar, boolean z) {
            v.b(str, "name == null");
            this.a = str;
            this.b = fVar;
            this.c = z;
        }

        /* access modifiers changed from: package-private */
        public void a(o oVar, T t) {
            String convert;
            if (t != null && (convert = this.b.convert(t)) != null) {
                oVar.a(this.a, convert, this.c);
            }
        }
    }

    /* compiled from: ParameterHandler */
    static final class e<T> extends m<Map<String, T>> {
        private final Method a;
        private final int b;
        private final f<T, String> c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f11810d;

        e(Method method, int i2, f<T, String> fVar, boolean z) {
            this.a = method;
            this.b = i2;
            this.c = fVar;
            this.f11810d = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void a(o oVar, Map<String, T> map) {
            if (map != null) {
                for (Map.Entry next : map.entrySet()) {
                    String str = (String) next.getKey();
                    if (str != null) {
                        Object value = next.getValue();
                        if (value != null) {
                            String convert = this.c.convert(value);
                            if (convert != null) {
                                oVar.a(str, convert, this.f11810d);
                            } else {
                                Method method = this.a;
                                int i2 = this.b;
                                throw v.p(method, i2, "Field map value '" + value + "' converted to null by " + this.c.getClass().getName() + " for key '" + str + "'.", new Object[0]);
                            }
                        } else {
                            Method method2 = this.a;
                            int i3 = this.b;
                            throw v.p(method2, i3, "Field map contained null value for key '" + str + "'.", new Object[0]);
                        }
                    } else {
                        throw v.p(this.a, this.b, "Field map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw v.p(this.a, this.b, "Field map was null.", new Object[0]);
        }
    }

    /* compiled from: ParameterHandler */
    static final class f<T> extends m<T> {
        private final String a;
        private final f<T, String> b;

        f(String str, f<T, String> fVar) {
            v.b(str, "name == null");
            this.a = str;
            this.b = fVar;
        }

        /* access modifiers changed from: package-private */
        public void a(o oVar, T t) {
            String convert;
            if (t != null && (convert = this.b.convert(t)) != null) {
                oVar.b(this.a, convert);
            }
        }
    }

    /* compiled from: ParameterHandler */
    static final class g<T> extends m<T> {
        private final Method a;
        private final int b;
        private final u c;

        /* renamed from: d  reason: collision with root package name */
        private final f<T, c0> f11811d;

        g(Method method, int i2, u uVar, f<T, c0> fVar) {
            this.a = method;
            this.b = i2;
            this.c = uVar;
            this.f11811d = fVar;
        }

        /* access modifiers changed from: package-private */
        public void a(o oVar, T t) {
            if (t != null) {
                try {
                    oVar.c(this.c, this.f11811d.convert(t));
                } catch (IOException e2) {
                    Method method = this.a;
                    int i2 = this.b;
                    throw v.p(method, i2, "Unable to convert " + t + " to RequestBody", e2);
                }
            }
        }
    }

    /* compiled from: ParameterHandler */
    static final class h<T> extends m<Map<String, T>> {
        private final Method a;
        private final int b;
        private final f<T, c0> c;

        /* renamed from: d  reason: collision with root package name */
        private final String f11812d;

        h(Method method, int i2, f<T, c0> fVar, String str) {
            this.a = method;
            this.b = i2;
            this.c = fVar;
            this.f11812d = str;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void a(o oVar, Map<String, T> map) {
            if (map != null) {
                for (Map.Entry next : map.entrySet()) {
                    String str = (String) next.getKey();
                    if (str != null) {
                        Object value = next.getValue();
                        if (value != null) {
                            oVar.c(u.i("Content-Disposition", "form-data; name=\"" + str + "\"", "Content-Transfer-Encoding", this.f11812d), this.c.convert(value));
                        } else {
                            Method method = this.a;
                            int i2 = this.b;
                            throw v.p(method, i2, "Part map contained null value for key '" + str + "'.", new Object[0]);
                        }
                    } else {
                        throw v.p(this.a, this.b, "Part map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw v.p(this.a, this.b, "Part map was null.", new Object[0]);
        }
    }

    /* compiled from: ParameterHandler */
    static final class i<T> extends m<T> {
        private final Method a;
        private final int b;
        private final String c;

        /* renamed from: d  reason: collision with root package name */
        private final f<T, String> f11813d;

        /* renamed from: e  reason: collision with root package name */
        private final boolean f11814e;

        i(Method method, int i2, String str, f<T, String> fVar, boolean z) {
            this.a = method;
            this.b = i2;
            v.b(str, "name == null");
            this.c = str;
            this.f11813d = fVar;
            this.f11814e = z;
        }

        /* access modifiers changed from: package-private */
        public void a(o oVar, T t) {
            if (t != null) {
                oVar.e(this.c, this.f11813d.convert(t), this.f11814e);
                return;
            }
            Method method = this.a;
            int i2 = this.b;
            throw v.p(method, i2, "Path parameter \"" + this.c + "\" value must not be null.", new Object[0]);
        }
    }

    /* compiled from: ParameterHandler */
    static final class j<T> extends m<T> {
        private final String a;
        private final f<T, String> b;
        private final boolean c;

        j(String str, f<T, String> fVar, boolean z) {
            v.b(str, "name == null");
            this.a = str;
            this.b = fVar;
            this.c = z;
        }

        /* access modifiers changed from: package-private */
        public void a(o oVar, T t) {
            String convert;
            if (t != null && (convert = this.b.convert(t)) != null) {
                oVar.f(this.a, convert, this.c);
            }
        }
    }

    /* compiled from: ParameterHandler */
    static final class k<T> extends m<Map<String, T>> {
        private final Method a;
        private final int b;
        private final f<T, String> c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f11815d;

        k(Method method, int i2, f<T, String> fVar, boolean z) {
            this.a = method;
            this.b = i2;
            this.c = fVar;
            this.f11815d = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void a(o oVar, Map<String, T> map) {
            if (map != null) {
                for (Map.Entry next : map.entrySet()) {
                    String str = (String) next.getKey();
                    if (str != null) {
                        Object value = next.getValue();
                        if (value != null) {
                            String convert = this.c.convert(value);
                            if (convert != null) {
                                oVar.f(str, convert, this.f11815d);
                            } else {
                                Method method = this.a;
                                int i2 = this.b;
                                throw v.p(method, i2, "Query map value '" + value + "' converted to null by " + this.c.getClass().getName() + " for key '" + str + "'.", new Object[0]);
                            }
                        } else {
                            Method method2 = this.a;
                            int i3 = this.b;
                            throw v.p(method2, i3, "Query map contained null value for key '" + str + "'.", new Object[0]);
                        }
                    } else {
                        throw v.p(this.a, this.b, "Query map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw v.p(this.a, this.b, "Query map was null", new Object[0]);
        }
    }

    /* compiled from: ParameterHandler */
    static final class l<T> extends m<T> {
        private final f<T, String> a;
        private final boolean b;

        l(f<T, String> fVar, boolean z) {
            this.a = fVar;
            this.b = z;
        }

        /* access modifiers changed from: package-private */
        public void a(o oVar, T t) {
            if (t != null) {
                oVar.f(this.a.convert(t), (String) null, this.b);
            }
        }
    }

    /* renamed from: retrofit2.m$m  reason: collision with other inner class name */
    /* compiled from: ParameterHandler */
    static final class C0809m extends m<y.c> {
        static final C0809m a = new C0809m();

        private C0809m() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void a(o oVar, y.c cVar) {
            if (cVar != null) {
                oVar.d(cVar);
            }
        }
    }

    m() {
    }

    /* access modifiers changed from: package-private */
    public abstract void a(o oVar, T t);

    /* access modifiers changed from: package-private */
    public final m<Object> b() {
        return new b();
    }

    /* access modifiers changed from: package-private */
    public final m<Iterable<T>> c() {
        return new a();
    }
}
