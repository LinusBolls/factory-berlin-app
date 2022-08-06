package androidx.databinding;

/* compiled from: BaseObservable */
public class a {
    private transient i a;

    public void b(int i2) {
        synchronized (this) {
            if (this.a != null) {
                this.a.c(this, i2, null);
            }
        }
    }
}
