package kotlin.g0;

import java.util.NoSuchElementException;
import kotlin.a0.a0;

/* compiled from: ProgressionIterators.kt */
public final class b extends a0 {

    /* renamed from: g  reason: collision with root package name */
    private final int f10623g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f10624h;

    /* renamed from: i  reason: collision with root package name */
    private int f10625i;

    /* renamed from: j  reason: collision with root package name */
    private final int f10626j;

    public b(int i2, int i3, int i4) {
        this.f10626j = i4;
        this.f10623g = i3;
        boolean z = true;
        if (i4 <= 0 ? i2 < i3 : i2 > i3) {
            z = false;
        }
        this.f10624h = z;
        this.f10625i = !z ? this.f10623g : i2;
    }

    public int c() {
        int i2 = this.f10625i;
        if (i2 != this.f10623g) {
            this.f10625i = this.f10626j + i2;
        } else if (this.f10624h) {
            this.f10624h = false;
        } else {
            throw new NoSuchElementException();
        }
        return i2;
    }

    public boolean hasNext() {
        return this.f10624h;
    }
}
