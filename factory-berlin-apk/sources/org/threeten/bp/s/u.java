package org.threeten.bp.s;

import java.io.Externalizable;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;

/* compiled from: Ser */
final class u implements Externalizable {

    /* renamed from: g  reason: collision with root package name */
    private byte f11689g;

    /* renamed from: h  reason: collision with root package name */
    private Object f11690h;

    public u() {
    }

    private static Object a(byte b, ObjectInput objectInput) {
        switch (b) {
            case 1:
                return p.o0(objectInput);
            case 2:
                return q.I(objectInput);
            case 3:
                return k.R0(objectInput);
            case 4:
                return l.j(objectInput);
            case 5:
                return s.o0(objectInput);
            case 6:
                return t.i(objectInput);
            case 7:
                return w.o0(objectInput);
            case 8:
                return x.i(objectInput);
            case 11:
                return h.w(objectInput);
            case 12:
                return d.h0(objectInput);
            case 13:
                return g.c0(objectInput);
            default:
                throw new StreamCorruptedException("Unknown serialized type");
        }
    }

    private static void b(byte b, Object obj, ObjectOutput objectOutput) {
        objectOutput.writeByte(b);
        switch (b) {
            case 1:
                ((p) obj).v0(objectOutput);
                return;
            case 2:
                ((q) obj).Q(objectOutput);
                return;
            case 3:
                ((k) obj).V0(objectOutput);
                return;
            case 4:
                ((l) obj).k(objectOutput);
                return;
            case 5:
                ((s) obj).s0(objectOutput);
                return;
            case 6:
                ((t) obj).j(objectOutput);
                return;
            case 7:
                ((w) obj).s0(objectOutput);
                return;
            case 8:
                ((x) obj).j(objectOutput);
                return;
            case 11:
                ((h) obj).z(objectOutput);
                return;
            case 12:
                ((d) obj).writeExternal(objectOutput);
                return;
            case 13:
                ((g) obj).writeExternal(objectOutput);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type");
        }
    }

    private Object readResolve() {
        return this.f11690h;
    }

    public void readExternal(ObjectInput objectInput) {
        byte readByte = objectInput.readByte();
        this.f11689g = readByte;
        this.f11690h = a(readByte, objectInput);
    }

    public void writeExternal(ObjectOutput objectOutput) {
        b(this.f11689g, this.f11690h, objectOutput);
    }

    u(byte b, Object obj) {
        this.f11689g = b;
        this.f11690h = obj;
    }
}
