package e.f.a;

import java.util.Arrays;

/* compiled from: SolverVariable */
public class i {

    /* renamed from: k  reason: collision with root package name */
    private static int f8534k = 1;
    private String a;
    public int b = -1;
    int c = -1;

    /* renamed from: d  reason: collision with root package name */
    public int f8535d = 0;

    /* renamed from: e  reason: collision with root package name */
    public float f8536e;

    /* renamed from: f  reason: collision with root package name */
    float[] f8537f = new float[7];

    /* renamed from: g  reason: collision with root package name */
    a f8538g;

    /* renamed from: h  reason: collision with root package name */
    b[] f8539h = new b[8];

    /* renamed from: i  reason: collision with root package name */
    int f8540i = 0;

    /* renamed from: j  reason: collision with root package name */
    public int f8541j = 0;

    /* compiled from: SolverVariable */
    public enum a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public i(a aVar, String str) {
        this.f8538g = aVar;
    }

    static void b() {
        f8534k++;
    }

    public final void a(b bVar) {
        int i2 = 0;
        while (true) {
            int i3 = this.f8540i;
            if (i2 >= i3) {
                b[] bVarArr = this.f8539h;
                if (i3 >= bVarArr.length) {
                    this.f8539h = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.f8539h;
                int i4 = this.f8540i;
                bVarArr2[i4] = bVar;
                this.f8540i = i4 + 1;
                return;
            } else if (this.f8539h[i2] != bVar) {
                i2++;
            } else {
                return;
            }
        }
    }

    public final void c(b bVar) {
        int i2 = this.f8540i;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.f8539h[i3] == bVar) {
                for (int i4 = 0; i4 < (i2 - i3) - 1; i4++) {
                    b[] bVarArr = this.f8539h;
                    int i5 = i3 + i4;
                    bVarArr[i5] = bVarArr[i5 + 1];
                }
                this.f8540i--;
                return;
            }
        }
    }

    public void d() {
        this.a = null;
        this.f8538g = a.UNKNOWN;
        this.f8535d = 0;
        this.b = -1;
        this.c = -1;
        this.f8536e = 0.0f;
        this.f8540i = 0;
        this.f8541j = 0;
    }

    public void e(a aVar, String str) {
        this.f8538g = aVar;
    }

    public final void f(b bVar) {
        int i2 = this.f8540i;
        for (int i3 = 0; i3 < i2; i3++) {
            b[] bVarArr = this.f8539h;
            bVarArr[i3].f8510d.n(bVarArr[i3], bVar, false);
        }
        this.f8540i = 0;
    }

    public String toString() {
        return "" + this.a;
    }
}
