package g.a.a.h;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.k;

/* compiled from: CustomTypeValue.kt */
public abstract class c<T> {
    public static final a b = new a((DefaultConstructorMarker) null);
    public final T a;

    /* compiled from: CustomTypeValue.kt */
    public static final class a {
        private a() {
        }

        public final c<?> a(Object obj) {
            k.f(obj, "value");
            if (obj instanceof Map) {
                return new d((Map) obj);
            }
            if (obj instanceof List) {
                return new C0596c((List) obj);
            }
            if (obj instanceof Boolean) {
                return new b(((Boolean) obj).booleanValue());
            }
            if (obj instanceof Number) {
                return new e((Number) obj);
            }
            return new f(obj.toString());
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: CustomTypeValue.kt */
    public static final class b extends c<Boolean> {
        public b(boolean z) {
            super(Boolean.valueOf(z), (DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && ((Boolean) this.a).booleanValue() == ((Boolean) ((b) obj).a).booleanValue();
        }

        public int hashCode() {
            return defpackage.b.a(((Boolean) this.a).booleanValue());
        }
    }

    /* renamed from: g.a.a.h.c$c  reason: collision with other inner class name */
    /* compiled from: CustomTypeValue.kt */
    public static final class C0596c extends c<List<? extends Object>> {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0596c(List<? extends Object> list) {
            super(list, (DefaultConstructorMarker) null);
            k.f(list, "value");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0596c) && !(k.a((List) this.a, (List) ((C0596c) obj).a) ^ true);
        }

        public int hashCode() {
            return this.a.hashCode();
        }
    }

    /* compiled from: CustomTypeValue.kt */
    public static final class d extends c<Map<String, ? extends Object>> {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(Map<String, ? extends Object> map) {
            super(map, (DefaultConstructorMarker) null);
            k.f(map, "value");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && !(k.a((Map) this.a, (Map) ((d) obj).a) ^ true);
        }

        public int hashCode() {
            return this.a.hashCode();
        }
    }

    /* compiled from: CustomTypeValue.kt */
    public static final class e extends c<Number> {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(Number number) {
            super(number, (DefaultConstructorMarker) null);
            k.f(number, "value");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && !(k.a((Number) this.a, (Number) ((e) obj).a) ^ true);
        }

        public int hashCode() {
            return ((Number) this.a).hashCode();
        }
    }

    /* compiled from: CustomTypeValue.kt */
    public static final class f extends c<String> {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(String str) {
            super(str, (DefaultConstructorMarker) null);
            k.f(str, "value");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && !(k.a((String) this.a, (String) ((f) obj).a) ^ true);
        }

        public int hashCode() {
            return ((String) this.a).hashCode();
        }
    }

    private c(T t) {
        this.a = t;
    }

    public /* synthetic */ c(Object obj, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj);
    }
}
