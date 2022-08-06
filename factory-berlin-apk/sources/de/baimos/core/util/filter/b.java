package de.baimos.core.util.filter;

import de.baimos.cm;
import de.baimos.cq;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Vector;

public class b implements cm {
    private final cm a;
    /* access modifiers changed from: private */
    public final Vector b;
    private final String c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public InputStream f8312d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public OutputStream f8313e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public ConnectionParameters f8314f = new ConnectionParameters();

    /* renamed from: g  reason: collision with root package name */
    private volatile boolean f8315g = false;

    public b(cm cmVar, Vector vector, boolean z) {
        this.a = cmVar;
        this.b = vector;
        String c2 = cmVar.c();
        this.c = c2;
        if (c2 != null) {
            this.f8314f.setRemoteAddress(c2);
        }
        this.f8314f.setIsServerSide(z);
    }

    public InputStream a() {
        if (this.f8312d == null) {
            e();
        }
        return this.f8312d;
    }

    public void a(String str, Object obj) {
        this.f8314f.setParameter(str, obj);
    }

    public OutputStream b() {
        if (this.f8313e == null) {
            e();
        }
        return this.f8313e;
    }

    public String c() {
        return this.c;
    }

    public void d() {
        this.f8315g = true;
        if (this.f8314f.isServerSide()) {
            a.a();
        }
        cq.a(this.f8313e);
        cq.d(this.f8312d);
        cm cmVar = this.a;
        if (cmVar != null) {
            cmVar.d();
        }
    }

    public void e() {
        if (this.f8314f.isServerSide()) {
            a.a();
        }
        new ConnectionFilterChain() {
            private int b = 0;

            public void abort(InputStream inputStream, OutputStream outputStream, ConnectionParameters connectionParameters) {
                InputStream unused = b.this.f8312d = inputStream;
                OutputStream unused2 = b.this.f8313e = outputStream;
                ConnectionParameters unused3 = b.this.f8314f = connectionParameters;
            }

            public void doFilter(InputStream inputStream, OutputStream outputStream, ConnectionParameters connectionParameters) {
                if (b.this.b == null || this.b >= b.this.b.size()) {
                    InputStream unused = b.this.f8312d = inputStream;
                    OutputStream unused2 = b.this.f8313e = outputStream;
                    ConnectionParameters unused3 = b.this.f8314f = connectionParameters;
                    return;
                }
                this.b++;
                ((ConnectionFilter) b.this.b.elementAt(this.b)).doFilter(inputStream, outputStream, connectionParameters, this);
            }
        }.doFilter(this.a.a(), this.a.b(), this.f8314f);
        if (this.f8314f.isServerSide()) {
            a.a(this.f8314f);
        }
    }

    public boolean f() {
        return this.f8315g;
    }
}
