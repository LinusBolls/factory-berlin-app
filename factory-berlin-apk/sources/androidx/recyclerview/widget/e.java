package androidx.recyclerview.widget;

/* compiled from: BatchingListUpdateCallback */
public class e implements r {
    final r a;
    int b = 0;
    int c = -1;

    /* renamed from: d  reason: collision with root package name */
    int f1255d = -1;

    /* renamed from: e  reason: collision with root package name */
    Object f1256e = null;

    public e(r rVar) {
        this.a = rVar;
    }

    public void a(int i2, int i3) {
        int i4;
        if (this.b != 2 || (i4 = this.c) < i2 || i4 > i2 + i3) {
            e();
            this.c = i2;
            this.f1255d = i3;
            this.b = 2;
            return;
        }
        this.f1255d += i3;
        this.c = i2;
    }

    public void b(int i2, int i3) {
        e();
        this.a.b(i2, i3);
    }

    public void c(int i2, int i3) {
        int i4;
        if (this.b == 1 && i2 >= (i4 = this.c)) {
            int i5 = this.f1255d;
            if (i2 <= i4 + i5) {
                this.f1255d = i5 + i3;
                this.c = Math.min(i2, i4);
                return;
            }
        }
        e();
        this.c = i2;
        this.f1255d = i3;
        this.b = 1;
    }

    public void d(int i2, int i3, Object obj) {
        int i4;
        if (this.b == 3) {
            int i5 = this.c;
            int i6 = this.f1255d;
            if (i2 <= i5 + i6 && (i4 = i2 + i3) >= i5 && this.f1256e == obj) {
                this.c = Math.min(i2, i5);
                this.f1255d = Math.max(i6 + i5, i4) - this.c;
                return;
            }
        }
        e();
        this.c = i2;
        this.f1255d = i3;
        this.f1256e = obj;
        this.b = 3;
    }

    public void e() {
        int i2 = this.b;
        if (i2 != 0) {
            if (i2 == 1) {
                this.a.c(this.c, this.f1255d);
            } else if (i2 == 2) {
                this.a.a(this.c, this.f1255d);
            } else if (i2 == 3) {
                this.a.d(this.c, this.f1255d, this.f1256e);
            }
            this.f1256e = null;
            this.b = 0;
        }
    }
}
