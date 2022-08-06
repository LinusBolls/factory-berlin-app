package kotlinx.coroutines.g3;

import kotlinx.coroutines.o0;

/* compiled from: Tasks.kt */
public final class k extends i {

    /* renamed from: i  reason: collision with root package name */
    public final Runnable f10982i;

    public k(Runnable runnable, long j2, j jVar) {
        super(j2, jVar);
        this.f10982i = runnable;
    }

    public void run() {
        try {
            this.f10982i.run();
        } finally {
            this.f10981h.k();
        }
    }

    public String toString() {
        return "Task[" + o0.a(this.f10982i) + '@' + o0.b(this.f10982i) + ", " + this.f10980g + ", " + this.f10981h + ']';
    }
}
