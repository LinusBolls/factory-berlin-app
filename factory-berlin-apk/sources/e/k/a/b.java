package e.k.a;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import e.k.a.a;
import e.k.a.b;
import java.util.ArrayList;

/* compiled from: DynamicAnimation */
public abstract class b<T extends b<T>> implements a.b {
    float a = 0.0f;
    float b = Float.MAX_VALUE;
    boolean c = false;

    /* renamed from: d  reason: collision with root package name */
    final Object f8757d = null;

    /* renamed from: e  reason: collision with root package name */
    final c f8758e;

    /* renamed from: f  reason: collision with root package name */
    boolean f8759f = false;

    /* renamed from: g  reason: collision with root package name */
    float f8760g = Float.MAX_VALUE;

    /* renamed from: h  reason: collision with root package name */
    float f8761h = (-Float.MAX_VALUE);

    /* renamed from: i  reason: collision with root package name */
    private long f8762i = 0;

    /* renamed from: j  reason: collision with root package name */
    private float f8763j;

    /* renamed from: k  reason: collision with root package name */
    private final ArrayList<c> f8764k = new ArrayList<>();

    /* renamed from: l  reason: collision with root package name */
    private final ArrayList<d> f8765l = new ArrayList<>();

    /* compiled from: DynamicAnimation */
    class a extends c {
        final /* synthetic */ d a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar, String str, d dVar) {
            super(str);
            this.a = dVar;
        }

        public float a(Object obj) {
            return this.a.a();
        }

        public void b(Object obj, float f2) {
            this.a.b(f2);
        }
    }

    /* renamed from: e.k.a.b$b  reason: collision with other inner class name */
    /* compiled from: DynamicAnimation */
    static class C0574b {
        float a;
        float b;

        C0574b() {
        }
    }

    /* compiled from: DynamicAnimation */
    public interface c {
        void a(b bVar, boolean z, float f2, float f3);
    }

    /* compiled from: DynamicAnimation */
    public interface d {
        void a(b bVar, float f2, float f3);
    }

    b(d dVar) {
        this.f8758e = new a(this, "FloatValueHolder", dVar);
        this.f8763j = 1.0f;
    }

    private void c(boolean z) {
        this.f8759f = false;
        a.d().g(this);
        this.f8762i = 0;
        this.c = false;
        for (int i2 = 0; i2 < this.f8764k.size(); i2++) {
            if (this.f8764k.get(i2) != null) {
                this.f8764k.get(i2).a(this, z, this.b, this.a);
            }
        }
        g(this.f8764k);
    }

    private float d() {
        return this.f8758e.a(this.f8757d);
    }

    private static <T> void g(ArrayList<T> arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    private void j() {
        if (!this.f8759f) {
            this.f8759f = true;
            if (!this.c) {
                this.b = d();
            }
            float f2 = this.b;
            if (f2 > this.f8760g || f2 < this.f8761h) {
                throw new IllegalArgumentException("Starting value need to be in between min value and max value");
            }
            a.d().a(this, 0);
        }
    }

    public boolean a(long j2) {
        long j3 = this.f8762i;
        if (j3 == 0) {
            this.f8762i = j2;
            h(this.b);
            return false;
        }
        this.f8762i = j2;
        boolean k2 = k(j2 - j3);
        float min = Math.min(this.b, this.f8760g);
        this.b = min;
        float max = Math.max(min, this.f8761h);
        this.b = max;
        h(max);
        if (k2) {
            c(false);
        }
        return k2;
    }

    public T b(d dVar) {
        if (!f()) {
            if (!this.f8765l.contains(dVar)) {
                this.f8765l.add(dVar);
            }
            return this;
        }
        throw new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
    }

    /* access modifiers changed from: package-private */
    public float e() {
        return this.f8763j * 0.75f;
    }

    public boolean f() {
        return this.f8759f;
    }

    /* access modifiers changed from: package-private */
    public void h(float f2) {
        this.f8758e.b(this.f8757d, f2);
        for (int i2 = 0; i2 < this.f8765l.size(); i2++) {
            if (this.f8765l.get(i2) != null) {
                this.f8765l.get(i2).a(this, this.b, this.a);
            }
        }
        g(this.f8765l);
    }

    public void i() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        } else if (!this.f8759f) {
            j();
        }
    }

    /* access modifiers changed from: package-private */
    public abstract boolean k(long j2);
}
