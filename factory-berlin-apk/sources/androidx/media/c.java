package androidx.media;

import java.util.Arrays;

/* compiled from: AudioAttributesImplBase */
class c implements a {
    int a = 0;
    int b = 0;
    int c = 0;

    /* renamed from: d  reason: collision with root package name */
    int f1045d = -1;

    c() {
    }

    public int a() {
        return this.b;
    }

    public int b() {
        int i2 = this.c;
        int c2 = c();
        if (c2 == 6) {
            i2 |= 4;
        } else if (c2 == 7) {
            i2 |= 1;
        }
        return i2 & 273;
    }

    public int c() {
        int i2 = this.f1045d;
        if (i2 != -1) {
            return i2;
        }
        return AudioAttributesCompat.a(false, this.c, this.a);
    }

    public int d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.b == cVar.a() && this.c == cVar.b() && this.a == cVar.d() && this.f1045d == cVar.f1045d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.a), Integer.valueOf(this.f1045d)});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.f1045d != -1) {
            sb.append(" stream=");
            sb.append(this.f1045d);
            sb.append(" derived");
        }
        sb.append(" usage=");
        sb.append(AudioAttributesCompat.b(this.a));
        sb.append(" content=");
        sb.append(this.b);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.c).toUpperCase());
        return sb.toString();
    }
}
