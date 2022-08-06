package com.sensorberg.smartspaces.backend.j.f;

import g.a.a.h.i;
import g.a.a.h.s.f;
import g.a.a.h.s.g;
import kotlin.jvm.internal.k;

/* compiled from: IotDeviceStateInput.kt */
public final class b implements i {
    private final String a;
    private final String b;

    /* compiled from: InputFieldMarshaller.kt */
    public static final class a implements f {
        final /* synthetic */ b b;

        public a(b bVar) {
            this.b = bVar;
        }

        public void a(g gVar) {
            k.f(gVar, "writer");
            gVar.e("action", this.b.b());
            gVar.e("value", this.b.c());
        }
    }

    public b(String str, String str2) {
        k.e(str, "action");
        k.e(str2, "value");
        this.a = str;
        this.b = str2;
    }

    public f a() {
        f.a aVar = f.a;
        return new a(this);
    }

    public final String b() {
        return this.a;
    }

    public final String c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return k.a(this.a, bVar.a) && k.a(this.b, bVar.b);
    }

    public int hashCode() {
        String str = this.a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        return "IotDeviceStateInput(action=" + this.a + ", value=" + this.b + ")";
    }
}
