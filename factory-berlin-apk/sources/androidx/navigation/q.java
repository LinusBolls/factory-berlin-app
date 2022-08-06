package androidx.navigation;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.navigation.o;
import e.e.h;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: NavGraph */
public class q extends o implements Iterable<o> {
    final h<o> o = new h<>();
    private int p;
    private String q;

    /* compiled from: NavGraph */
    class a implements Iterator<o> {

        /* renamed from: g  reason: collision with root package name */
        private int f1102g = -1;

        /* renamed from: h  reason: collision with root package name */
        private boolean f1103h = false;

        a() {
        }

        /* renamed from: a */
        public o next() {
            if (hasNext()) {
                this.f1103h = true;
                h<o> hVar = q.this.o;
                int i2 = this.f1102g + 1;
                this.f1102g = i2;
                return hVar.w(i2);
            }
            throw new NoSuchElementException();
        }

        public boolean hasNext() {
            return this.f1102g + 1 < q.this.o.v();
        }

        public void remove() {
            if (this.f1103h) {
                q.this.o.w(this.f1102g).z((q) null);
                q.this.o.u(this.f1102g);
                this.f1102g--;
                this.f1103h = false;
                return;
            }
            throw new IllegalStateException("You must call next() before you can remove an element");
        }
    }

    public q(x<? extends q> xVar) {
        super((x<? extends o>) xVar);
    }

    public final void E(o oVar) {
        if (oVar.m() != 0) {
            o g2 = this.o.g(oVar.m());
            if (g2 != oVar) {
                if (oVar.o() == null) {
                    if (g2 != null) {
                        g2.z((q) null);
                    }
                    oVar.z(this);
                    this.o.s(oVar.m(), oVar);
                    return;
                }
                throw new IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
            }
            return;
        }
        throw new IllegalArgumentException("Destinations must have an id. Call setId() or include an android:id in your navigation XML.");
    }

    public final o F(int i2) {
        return H(i2, true);
    }

    /* access modifiers changed from: package-private */
    public final o H(int i2, boolean z) {
        o g2 = this.o.g(i2);
        if (g2 != null) {
            return g2;
        }
        if (!z || o() == null) {
            return null;
        }
        return o().F(i2);
    }

    /* access modifiers changed from: package-private */
    public String J() {
        if (this.q == null) {
            this.q = Integer.toString(this.p);
        }
        return this.q;
    }

    public final int K() {
        return this.p;
    }

    public final void L(int i2) {
        this.p = i2;
        this.q = null;
    }

    public final Iterator<o> iterator() {
        return new a();
    }

    public String k() {
        return m() != 0 ? super.k() : "the root navigation";
    }

    /* access modifiers changed from: package-private */
    public o.a q(n nVar) {
        o.a q2 = super.q(nVar);
        Iterator<o> it = iterator();
        while (it.hasNext()) {
            o.a q3 = it.next().q(nVar);
            if (q3 != null && (q2 == null || q3.compareTo(q2) > 0)) {
                q2 = q3;
            }
        }
        return q2;
    }

    public void r(Context context, AttributeSet attributeSet) {
        super.r(context, attributeSet);
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, androidx.navigation.b0.a.NavGraphNavigator);
        L(obtainAttributes.getResourceId(androidx.navigation.b0.a.NavGraphNavigator_startDestination, 0));
        this.q = o.l(context, this.p);
        obtainAttributes.recycle();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" startDestination=");
        o F = F(K());
        if (F == null) {
            String str = this.q;
            if (str == null) {
                sb.append("0x");
                sb.append(Integer.toHexString(this.p));
            } else {
                sb.append(str);
            }
        } else {
            sb.append("{");
            sb.append(F.toString());
            sb.append("}");
        }
        return sb.toString();
    }
}
