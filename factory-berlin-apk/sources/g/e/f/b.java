package g.e.f;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.v;
import kotlin.x;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: FilePreferences.kt */
public final class b implements SharedPreferences {

    /* renamed from: e  reason: collision with root package name */
    static final /* synthetic */ kotlin.h0.f[] f9795e;

    /* renamed from: f  reason: collision with root package name */
    private static final Executor f9796f = g.e.e.a.f9778f.h();

    /* renamed from: g  reason: collision with root package name */
    private static final C0672b f9797g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static d f9798h;

    /* renamed from: i  reason: collision with root package name */
    public static final c f9799i = new c((DefaultConstructorMarker) null);
    private AtomicInteger a;
    /* access modifiers changed from: private */
    public final Set<SharedPreferences.OnSharedPreferenceChangeListener> b;
    private final kotlin.e c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final a f9800d;

    /* compiled from: FilePreferences.kt */
    static final class a extends l implements kotlin.e0.c.a<x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ b f9801h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar) {
            super(0);
            this.f9801h = bVar;
        }

        public final void a() {
            n.a.a.a("Loading " + this.f9801h.g().hashCode() + " from " + this.f9801h.f9800d, new Object[0]);
        }

        public /* bridge */ /* synthetic */ Object d() {
            a();
            return x.a;
        }
    }

    /* renamed from: g.e.f.b$b  reason: collision with other inner class name */
    /* compiled from: FilePreferences.kt */
    public static final class C0672b implements d {
        private final Map<File, SharedPreferences> a = new LinkedHashMap();

        C0672b() {
        }

        public SharedPreferences a(File file) {
            k.f(file, "file");
            SharedPreferences sharedPreferences = this.a.get(file);
            if (sharedPreferences != null) {
                return sharedPreferences;
            }
            b bVar = new b(new e(file), (DefaultConstructorMarker) null);
            this.a.put(file, bVar);
            return bVar;
        }
    }

    /* compiled from: FilePreferences.kt */
    public static final class c {
        private c() {
        }

        public final SharedPreferences a(File file) {
            k.f(file, "file");
            return b.f9798h.a(file);
        }

        public final boolean b(Context context, String str, SharedPreferences sharedPreferences) {
            k.f(context, "context");
            k.f(str, "name");
            k.f(sharedPreferences, "destination");
            return d.a.e(context, str, sharedPreferences);
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: FilePreferences.kt */
    public interface d {
        SharedPreferences a(File file);
    }

    /* compiled from: FilePreferences.kt */
    static final class e extends l implements kotlin.e0.c.a<JSONObject> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ b f9802h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(b bVar) {
            super(0);
            this.f9802h = bVar;
        }

        /* renamed from: a */
        public final JSONObject d() {
            String b = this.f9802h.f9800d.b();
            if (b != null) {
                return new JSONObject(b);
            }
            return new JSONObject();
        }
    }

    /* compiled from: FilePreferences.kt */
    static final class f<V> implements Callable<V> {
        final /* synthetic */ b a;
        final /* synthetic */ JSONObject b;

        f(b bVar, JSONObject jSONObject) {
            this.a = bVar;
            this.b = jSONObject;
        }

        public final boolean a() {
            try {
                String jSONObject = this.b.toString();
                k.b(jSONObject, "jsonObject.toString()");
                this.a.f9800d.a(jSONObject);
                AtomicInteger h2 = this.a.h();
                if (h2 != null) {
                    h2.decrementAndGet();
                }
                return true;
            } catch (Exception e2) {
                n.a.a.e(e2, "Failed to write shared preferences on " + this.a.f9800d, new Object[0]);
                return false;
            }
        }

        public /* bridge */ /* synthetic */ Object call() {
            return Boolean.valueOf(a());
        }
    }

    /* compiled from: FilePreferences.kt */
    static final class g extends l implements kotlin.e0.c.a<x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ b f9803h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ Set f9804i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(b bVar, Set set) {
            super(0);
            this.f9803h = bVar;
            this.f9804i = set;
        }

        public final void a() {
            synchronized (this.f9803h.b) {
                for (SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener : this.f9803h.b) {
                    for (String onSharedPreferenceChanged : this.f9804i) {
                        onSharedPreferenceChangeListener.onSharedPreferenceChanged(this.f9803h, onSharedPreferenceChanged);
                    }
                }
                x xVar = x.a;
            }
        }

        public /* bridge */ /* synthetic */ Object d() {
            a();
            return x.a;
        }
    }

    static {
        o oVar = new o(v.b(b.class), "data", "getData()Lorg/json/JSONObject;");
        v.d(oVar);
        f9795e = new kotlin.h0.f[]{oVar};
        C0672b bVar = new C0672b();
        f9797g = bVar;
        f9798h = bVar;
    }

    private b(a aVar) {
        this.f9800d = aVar;
        this.b = new LinkedHashSet();
        this.c = g.a(new e(this));
        g.e.e.a aVar2 = g.e.e.a.f9778f;
        aVar2.j(aVar2.c(), new a(this));
    }

    /* access modifiers changed from: private */
    public final JSONObject g() {
        kotlin.e eVar = this.c;
        kotlin.h0.f fVar = f9795e[0];
        return (JSONObject) eVar.getValue();
    }

    private final FutureTask<Boolean> i(JSONObject jSONObject) {
        FutureTask<Boolean> futureTask = new FutureTask<>(new f(this, jSONObject));
        AtomicInteger atomicInteger = this.a;
        if (atomicInteger != null) {
            atomicInteger.incrementAndGet();
        }
        g.e.e.a.f9778f.i(f9796f, futureTask);
        return futureTask;
    }

    private final void j(JSONObject jSONObject) {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        Iterator<String> keys = g().keys();
        k.b(keys, "data.keys()");
        while (keys.hasNext()) {
            String next = keys.next();
            if (!jSONObject.has(next)) {
                k.b(next, "it");
                linkedHashSet.add(next);
            }
        }
        Iterator<String> keys2 = jSONObject.keys();
        k.b(keys2, "newData.keys()");
        while (keys2.hasNext()) {
            String next2 = keys2.next();
            g().put(next2, jSONObject.get(next2));
        }
        for (String remove : linkedHashSet) {
            g().remove(remove);
        }
    }

    private final void k(Set<String> set) {
        g.e.e.a aVar = g.e.e.a.f9778f;
        aVar.j(aVar.e(), new g(this, set));
    }

    public boolean contains(String str) {
        k.f(str, "key");
        return g().has(str);
    }

    public final void e(JSONObject jSONObject, Set<String> set) {
        k.f(jSONObject, "jsonObject");
        k.f(set, "changedKeys");
        j(jSONObject);
        i(jSONObject);
        k(set);
    }

    public SharedPreferences.Editor edit() {
        return new c(this, new JSONObject(g().toString()));
    }

    public final boolean f(JSONObject jSONObject, Set<String> set) {
        k.f(jSONObject, "jsonObject");
        k.f(set, "changedKeys");
        j(jSONObject);
        FutureTask<Boolean> i2 = i(jSONObject);
        k(set);
        Boolean bool = i2.get();
        k.b(bool, "future.get()");
        return bool.booleanValue();
    }

    public Map<String, ?> getAll() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> keys = g().keys();
        k.b(keys, "data.keys()");
        while (keys.hasNext()) {
            String next = keys.next();
            k.b(next, "it");
            Object obj = g().get(next);
            k.b(obj, "data.get(it)");
            linkedHashMap.put(next, obj);
        }
        return linkedHashMap;
    }

    public boolean getBoolean(String str, boolean z) {
        k.f(str, "key");
        return g().optBoolean(str, z);
    }

    public float getFloat(String str, float f2) {
        k.f(str, "key");
        return (float) g().optDouble(str, (double) f2);
    }

    public int getInt(String str, int i2) {
        k.f(str, "key");
        return g().optInt(str, i2);
    }

    public long getLong(String str, long j2) {
        k.f(str, "key");
        return g().optLong(str, j2);
    }

    public String getString(String str, String str2) {
        k.f(str, "key");
        if (g().has(str)) {
            return g().optString(str);
        }
        if (str2 == null) {
            return null;
        }
        return g().optString(str, str2);
    }

    public Set<String> getStringSet(String str, Set<String> set) {
        k.f(str, "key");
        if (g().has(str)) {
            JSONArray optJSONArray = g().optJSONArray(str);
            set = new LinkedHashSet<>();
            int length = optJSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                String string = optJSONArray.getString(i2);
                k.b(string, "array.getString(i)");
                set.add(string);
            }
        }
        return set;
    }

    public final AtomicInteger h() {
        return this.a;
    }

    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        k.f(onSharedPreferenceChangeListener, "listener");
        synchronized (this.b) {
            this.b.add(onSharedPreferenceChangeListener);
        }
    }

    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        k.f(onSharedPreferenceChangeListener, "listener");
        synchronized (this.b) {
            this.b.remove(onSharedPreferenceChangeListener);
        }
    }

    public /* synthetic */ b(a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }
}
