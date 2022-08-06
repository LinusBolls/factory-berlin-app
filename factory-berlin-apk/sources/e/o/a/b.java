package e.o.a;

import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.e0;
import androidx.lifecycle.f0;
import androidx.lifecycle.n0;
import androidx.lifecycle.p0;
import androidx.lifecycle.r0;
import androidx.lifecycle.v;
import e.e.h;
import e.o.b.a;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: LoaderManagerImpl */
class b extends a {
    static boolean c = false;
    private final v a;
    private final c b;

    /* compiled from: LoaderManagerImpl */
    public static class a<D> extends e0<D> implements a.C0576a<D> {
        private final int q;
        private final Bundle r;
        private final e.o.b.a<D> s;
        private v t;
        private C0575b<D> u;
        private e.o.b.a<D> v;

        /* access modifiers changed from: protected */
        public void q() {
            if (b.c) {
                Log.v("LoaderManager", "  Starting: " + this);
            }
            this.s.f();
            throw null;
        }

        /* access modifiers changed from: protected */
        public void r() {
            if (b.c) {
                Log.v("LoaderManager", "  Stopping: " + this);
            }
            this.s.g();
        }

        public void t(f0<? super D> f0Var) {
            super.t(f0Var);
            this.t = null;
            this.u = null;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.q);
            sb.append(" : ");
            e.h.j.a.a(this.s, sb);
            sb.append("}}");
            return sb.toString();
        }

        public void u(D d2) {
            super.u(d2);
            e.o.b.a<D> aVar = this.v;
            if (aVar != null) {
                aVar.e();
                this.v = null;
            }
        }

        /* access modifiers changed from: package-private */
        public e.o.b.a<D> v(boolean z) {
            if (b.c) {
                Log.v("LoaderManager", "  Destroying: " + this);
            }
            this.s.b();
            this.s.a();
            C0575b<D> bVar = this.u;
            if (bVar != null) {
                t(bVar);
                if (z) {
                    bVar.c();
                }
            }
            this.s.h(this);
            if ((bVar == null || bVar.b()) && !z) {
                return this.s;
            }
            this.s.e();
            return this.v;
        }

        public void w(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.q);
            printWriter.print(" mArgs=");
            printWriter.println(this.r);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.s);
            e.o.b.a<D> aVar = this.s;
            aVar.d(str + "  ", fileDescriptor, printWriter, strArr);
            if (this.u != null) {
                printWriter.print(str);
                printWriter.print("mCallbacks=");
                printWriter.println(this.u);
                C0575b<D> bVar = this.u;
                bVar.a(str + "  ", printWriter);
            }
            printWriter.print(str);
            printWriter.print("mData=");
            printWriter.println(x().c(l()));
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.println(n());
        }

        /* access modifiers changed from: package-private */
        public e.o.b.a<D> x() {
            return this.s;
        }

        /* access modifiers changed from: package-private */
        public void y() {
            v vVar = this.t;
            C0575b<D> bVar = this.u;
            if (vVar != null && bVar != null) {
                super.t(bVar);
                o(vVar, bVar);
            }
        }
    }

    /* renamed from: e.o.a.b$b  reason: collision with other inner class name */
    /* compiled from: LoaderManagerImpl */
    static class C0575b<D> implements f0<D> {
        public abstract void a(String str, PrintWriter printWriter);

        /* access modifiers changed from: package-private */
        public abstract boolean b();

        /* access modifiers changed from: package-private */
        public abstract void c();
    }

    /* compiled from: LoaderManagerImpl */
    static class c extends n0 {

        /* renamed from: j  reason: collision with root package name */
        private static final p0.b f8777j = new a();

        /* renamed from: i  reason: collision with root package name */
        private h<a> f8778i = new h<>();

        /* compiled from: LoaderManagerImpl */
        static class a implements p0.b {
            a() {
            }

            public <T extends n0> T a(Class<T> cls) {
                return new c();
            }
        }

        c() {
        }

        static c s(r0 r0Var) {
            return (c) new p0(r0Var, f8777j).a(c.class);
        }

        /* access modifiers changed from: protected */
        public void l() {
            super.l();
            int v = this.f8778i.v();
            for (int i2 = 0; i2 < v; i2++) {
                this.f8778i.w(i2).v(true);
            }
            this.f8778i.d();
        }

        public void r(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f8778i.v() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                for (int i2 = 0; i2 < this.f8778i.v(); i2++) {
                    a w = this.f8778i.w(i2);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f8778i.r(i2));
                    printWriter.print(": ");
                    printWriter.println(w.toString());
                    w.w(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void t() {
            int v = this.f8778i.v();
            for (int i2 = 0; i2 < v; i2++) {
                this.f8778i.w(i2).y();
            }
        }
    }

    b(v vVar, r0 r0Var) {
        this.a = vVar;
        this.b = c.s(r0Var);
    }

    @Deprecated
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.b.r(str, fileDescriptor, printWriter, strArr);
    }

    public void c() {
        this.b.t();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        e.h.j.a.a(this.a, sb);
        sb.append("}}");
        return sb.toString();
    }
}
