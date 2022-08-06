package com.google.crypto.tink.shaded.protobuf;

/* compiled from: LazyFieldLite */
public class d0 {
    private i a;
    private p b;
    protected volatile q0 c;

    /* renamed from: d  reason: collision with root package name */
    private volatile i f3716d;

    static {
        p.b();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:14|15) */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r3.c = r4;
        r3.f3716d = com.google.crypto.tink.shaded.protobuf.i.f3733h;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x002c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.google.crypto.tink.shaded.protobuf.q0 r4) {
        /*
            r3 = this;
            com.google.crypto.tink.shaded.protobuf.q0 r0 = r3.c
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            monitor-enter(r3)
            com.google.crypto.tink.shaded.protobuf.q0 r0 = r3.c     // Catch:{ all -> 0x0034 }
            if (r0 == 0) goto L_0x000c
            monitor-exit(r3)     // Catch:{ all -> 0x0034 }
            return
        L_0x000c:
            com.google.crypto.tink.shaded.protobuf.i r0 = r3.a     // Catch:{ InvalidProtocolBufferException -> 0x002c }
            if (r0 == 0) goto L_0x0025
            com.google.crypto.tink.shaded.protobuf.z0 r0 = r4.p()     // Catch:{ InvalidProtocolBufferException -> 0x002c }
            com.google.crypto.tink.shaded.protobuf.i r1 = r3.a     // Catch:{ InvalidProtocolBufferException -> 0x002c }
            com.google.crypto.tink.shaded.protobuf.p r2 = r3.b     // Catch:{ InvalidProtocolBufferException -> 0x002c }
            java.lang.Object r0 = r0.a(r1, r2)     // Catch:{ InvalidProtocolBufferException -> 0x002c }
            com.google.crypto.tink.shaded.protobuf.q0 r0 = (com.google.crypto.tink.shaded.protobuf.q0) r0     // Catch:{ InvalidProtocolBufferException -> 0x002c }
            r3.c = r0     // Catch:{ InvalidProtocolBufferException -> 0x002c }
            com.google.crypto.tink.shaded.protobuf.i r0 = r3.a     // Catch:{ InvalidProtocolBufferException -> 0x002c }
            r3.f3716d = r0     // Catch:{ InvalidProtocolBufferException -> 0x002c }
            goto L_0x0032
        L_0x0025:
            r3.c = r4     // Catch:{ InvalidProtocolBufferException -> 0x002c }
            com.google.crypto.tink.shaded.protobuf.i r0 = com.google.crypto.tink.shaded.protobuf.i.f3733h     // Catch:{ InvalidProtocolBufferException -> 0x002c }
            r3.f3716d = r0     // Catch:{ InvalidProtocolBufferException -> 0x002c }
            goto L_0x0032
        L_0x002c:
            r3.c = r4     // Catch:{ all -> 0x0034 }
            com.google.crypto.tink.shaded.protobuf.i r4 = com.google.crypto.tink.shaded.protobuf.i.f3733h     // Catch:{ all -> 0x0034 }
            r3.f3716d = r4     // Catch:{ all -> 0x0034 }
        L_0x0032:
            monitor-exit(r3)     // Catch:{ all -> 0x0034 }
            return
        L_0x0034:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0034 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.d0.a(com.google.crypto.tink.shaded.protobuf.q0):void");
    }

    public int b() {
        if (this.f3716d != null) {
            return this.f3716d.size();
        }
        i iVar = this.a;
        if (iVar != null) {
            return iVar.size();
        }
        if (this.c != null) {
            return this.c.c();
        }
        return 0;
    }

    public q0 c(q0 q0Var) {
        a(q0Var);
        return this.c;
    }

    public q0 d(q0 q0Var) {
        q0 q0Var2 = this.c;
        this.a = null;
        this.f3716d = null;
        this.c = q0Var;
        return q0Var2;
    }

    public i e() {
        if (this.f3716d != null) {
            return this.f3716d;
        }
        i iVar = this.a;
        if (iVar != null) {
            return iVar;
        }
        synchronized (this) {
            if (this.f3716d != null) {
                i iVar2 = this.f3716d;
                return iVar2;
            }
            if (this.c == null) {
                this.f3716d = i.f3733h;
            } else {
                this.f3716d = this.c.m();
            }
            i iVar3 = this.f3716d;
            return iVar3;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        q0 q0Var = this.c;
        q0 q0Var2 = d0Var.c;
        if (q0Var == null && q0Var2 == null) {
            return e().equals(d0Var.e());
        }
        if (q0Var != null && q0Var2 != null) {
            return q0Var.equals(q0Var2);
        }
        if (q0Var != null) {
            return q0Var.equals(d0Var.c(q0Var.d()));
        }
        return c(q0Var2.d()).equals(q0Var2);
    }

    public int hashCode() {
        return 1;
    }
}
