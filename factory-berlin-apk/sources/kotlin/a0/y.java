package kotlin.a0;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.z.a;

/* compiled from: Maps.kt */
final class y implements Map, Serializable, a {

    /* renamed from: g  reason: collision with root package name */
    public static final y f10591g = new y();

    private y() {
    }

    public boolean a(Void voidR) {
        k.e(voidR, "value");
        return false;
    }

    public Void b(Object obj) {
        return null;
    }

    public Set<Map.Entry> c() {
        return z.f10592g;
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean containsKey(Object obj) {
        return false;
    }

    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof Void) {
            return a((Void) obj);
        }
        return false;
    }

    public Set<Object> d() {
        return z.f10592g;
    }

    public int e() {
        return 0;
    }

    public final /* bridge */ Set<Map.Entry> entrySet() {
        return c();
    }

    public boolean equals(Object obj) {
        return (obj instanceof Map) && ((Map) obj).isEmpty();
    }

    public Collection f() {
        return x.f10590g;
    }

    public final /* bridge */ Object get(Object obj) {
        return b(obj);
    }

    public int hashCode() {
        return 0;
    }

    public boolean isEmpty() {
        return true;
    }

    public final /* bridge */ Set<Object> keySet() {
        return d();
    }

    public /* synthetic */ Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return e();
    }

    public String toString() {
        return "{}";
    }

    public final /* bridge */ Collection values() {
        return f();
    }
}
