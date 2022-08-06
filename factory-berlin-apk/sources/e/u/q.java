package e.u;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import e.u.m;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: TransitionSet */
public class q extends m {
    private ArrayList<m> P = new ArrayList<>();
    private boolean Q = true;
    int R;
    boolean S = false;
    private int T = 0;

    /* compiled from: TransitionSet */
    class a extends n {
        final /* synthetic */ m a;

        a(q qVar, m mVar) {
            this.a = mVar;
        }

        public void e(m mVar) {
            this.a.e0();
            mVar.a0(this);
        }
    }

    /* compiled from: TransitionSet */
    static class b extends n {
        q a;

        b(q qVar) {
            this.a = qVar;
        }

        public void a(m mVar) {
            q qVar = this.a;
            if (!qVar.S) {
                qVar.o0();
                this.a.S = true;
            }
        }

        public void e(m mVar) {
            q qVar = this.a;
            int i2 = qVar.R - 1;
            qVar.R = i2;
            if (i2 == 0) {
                qVar.S = false;
                qVar.x();
            }
            mVar.a0(this);
        }
    }

    private void D0() {
        b bVar = new b(this);
        Iterator<m> it = this.P.iterator();
        while (it.hasNext()) {
            it.next().c(bVar);
        }
        this.R = this.P.size();
    }

    private void u0(m mVar) {
        this.P.add(mVar);
        mVar.x = this;
    }

    /* renamed from: A0 */
    public q h0(TimeInterpolator timeInterpolator) {
        this.T |= 1;
        ArrayList<m> arrayList = this.P;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.P.get(i2).h0(timeInterpolator);
            }
        }
        super.h0(timeInterpolator);
        return this;
    }

    public q B0(int i2) {
        if (i2 == 0) {
            this.Q = true;
        } else if (i2 == 1) {
            this.Q = false;
        } else {
            throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i2);
        }
        return this;
    }

    /* renamed from: C0 */
    public q m0(long j2) {
        super.m0(j2);
        return this;
    }

    public void X(View view) {
        super.X(view);
        int size = this.P.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.P.get(i2).X(view);
        }
    }

    public void c0(View view) {
        super.c0(view);
        int size = this.P.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.P.get(i2).c0(view);
        }
    }

    /* access modifiers changed from: protected */
    public void cancel() {
        super.cancel();
        int size = this.P.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.P.get(i2).cancel();
        }
    }

    /* access modifiers changed from: protected */
    public void e0() {
        if (this.P.isEmpty()) {
            o0();
            x();
            return;
        }
        D0();
        if (!this.Q) {
            for (int i2 = 1; i2 < this.P.size(); i2++) {
                this.P.get(i2 - 1).c(new a(this, this.P.get(i2)));
            }
            m mVar = this.P.get(0);
            if (mVar != null) {
                mVar.e0();
                return;
            }
            return;
        }
        Iterator<m> it = this.P.iterator();
        while (it.hasNext()) {
            it.next().e0();
        }
    }

    public /* bridge */ /* synthetic */ m f0(long j2) {
        z0(j2);
        return this;
    }

    public void g0(m.e eVar) {
        super.g0(eVar);
        this.T |= 8;
        int size = this.P.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.P.get(i2).g0(eVar);
        }
    }

    public void h(s sVar) {
        if (Q(sVar.b)) {
            Iterator<m> it = this.P.iterator();
            while (it.hasNext()) {
                m next = it.next();
                if (next.Q(sVar.b)) {
                    next.h(sVar);
                    sVar.c.add(next);
                }
            }
        }
    }

    public void j0(g gVar) {
        super.j0(gVar);
        this.T |= 4;
        if (this.P != null) {
            for (int i2 = 0; i2 < this.P.size(); i2++) {
                this.P.get(i2).j0(gVar);
            }
        }
    }

    public void k0(p pVar) {
        super.k0(pVar);
        this.T |= 2;
        int size = this.P.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.P.get(i2).k0(pVar);
        }
    }

    /* access modifiers changed from: package-private */
    public void p(s sVar) {
        super.p(sVar);
        int size = this.P.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.P.get(i2).p(sVar);
        }
    }

    /* access modifiers changed from: package-private */
    public String p0(String str) {
        String p0 = super.p0(str);
        for (int i2 = 0; i2 < this.P.size(); i2++) {
            StringBuilder sb = new StringBuilder();
            sb.append(p0);
            sb.append("\n");
            sb.append(this.P.get(i2).p0(str + "  "));
            p0 = sb.toString();
        }
        return p0;
    }

    /* renamed from: q0 */
    public q c(m.f fVar) {
        super.c(fVar);
        return this;
    }

    public void r(s sVar) {
        if (Q(sVar.b)) {
            Iterator<m> it = this.P.iterator();
            while (it.hasNext()) {
                m next = it.next();
                if (next.Q(sVar.b)) {
                    next.r(sVar);
                    sVar.c.add(next);
                }
            }
        }
    }

    /* renamed from: r0 */
    public q d(View view) {
        for (int i2 = 0; i2 < this.P.size(); i2++) {
            this.P.get(i2).d(view);
        }
        super.d(view);
        return this;
    }

    public q s0(m mVar) {
        u0(mVar);
        long j2 = this.f8921i;
        if (j2 >= 0) {
            mVar.f0(j2);
        }
        if ((this.T & 1) != 0) {
            mVar.h0(A());
        }
        if ((this.T & 2) != 0) {
            mVar.k0(E());
        }
        if ((this.T & 4) != 0) {
            mVar.j0(D());
        }
        if ((this.T & 8) != 0) {
            mVar.g0(z());
        }
        return this;
    }

    /* renamed from: u */
    public m clone() {
        q qVar = (q) super.clone();
        qVar.P = new ArrayList<>();
        int size = this.P.size();
        for (int i2 = 0; i2 < size; i2++) {
            qVar.u0(this.P.get(i2).clone());
        }
        return qVar;
    }

    public m v0(int i2) {
        if (i2 < 0 || i2 >= this.P.size()) {
            return null;
        }
        return this.P.get(i2);
    }

    /* access modifiers changed from: protected */
    public void w(ViewGroup viewGroup, t tVar, t tVar2, ArrayList<s> arrayList, ArrayList<s> arrayList2) {
        long G = G();
        int size = this.P.size();
        for (int i2 = 0; i2 < size; i2++) {
            m mVar = this.P.get(i2);
            if (G > 0 && (this.Q || i2 == 0)) {
                long G2 = mVar.G();
                if (G2 > 0) {
                    mVar.m0(G2 + G);
                } else {
                    mVar.m0(G);
                }
            }
            mVar.w(viewGroup, tVar, tVar2, arrayList, arrayList2);
        }
    }

    public int w0() {
        return this.P.size();
    }

    /* renamed from: x0 */
    public q a0(m.f fVar) {
        super.a0(fVar);
        return this;
    }

    /* renamed from: y0 */
    public q b0(View view) {
        for (int i2 = 0; i2 < this.P.size(); i2++) {
            this.P.get(i2).b0(view);
        }
        super.b0(view);
        return this;
    }

    public q z0(long j2) {
        ArrayList<m> arrayList;
        super.f0(j2);
        if (this.f8921i >= 0 && (arrayList = this.P) != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.P.get(i2).f0(j2);
            }
        }
        return this;
    }
}
