package org.threeten.bp;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.Externalizable;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;

/* compiled from: Ser */
final class l implements Externalizable {

    /* renamed from: g  reason: collision with root package name */
    private byte f11622g;

    /* renamed from: h  reason: collision with root package name */
    private Object f11623h;

    public l() {
    }

    static Object a(DataInput dataInput) {
        return b(dataInput.readByte(), dataInput);
    }

    private static Object b(byte b, DataInput dataInput) {
        if (b == 64) {
            return h.I(dataInput);
        }
        switch (b) {
            case 1:
                return c.v(dataInput);
            case 2:
                return d.c0(dataInput);
            case 3:
                return LocalDate.J0(dataInput);
            case 4:
                return e.D0(dataInput);
            case 5:
                return f.k0(dataInput);
            case 6:
                return r.k0(dataInput);
            case 7:
                return q.I(dataInput);
            case 8:
                return p.R(dataInput);
            default:
                switch (b) {
                    case 66:
                        return j.O(dataInput);
                    case 67:
                        return m.Q(dataInput);
                    case 68:
                        return n.S(dataInput);
                    case 69:
                        return i.S(dataInput);
                    default:
                        throw new StreamCorruptedException("Unknown serialized type");
                }
        }
    }

    static void c(byte b, Object obj, DataOutput dataOutput) {
        dataOutput.writeByte(b);
        if (b != 64) {
            switch (b) {
                case 1:
                    ((c) obj).w(dataOutput);
                    return;
                case 2:
                    ((d) obj).h0(dataOutput);
                    return;
                case 3:
                    ((LocalDate) obj).R0(dataOutput);
                    return;
                case 4:
                    ((e) obj).L0(dataOutput);
                    return;
                case 5:
                    ((f) obj).w0(dataOutput);
                    return;
                case 6:
                    ((r) obj).y0(dataOutput);
                    return;
                case 7:
                    ((q) obj).K(dataOutput);
                    return;
                case 8:
                    ((p) obj).U(dataOutput);
                    return;
                default:
                    switch (b) {
                        case 66:
                            ((j) obj).U(dataOutput);
                            return;
                        case 67:
                            ((m) obj).T(dataOutput);
                            return;
                        case 68:
                            ((n) obj).Y(dataOutput);
                            return;
                        case 69:
                            ((i) obj).c0(dataOutput);
                            return;
                        default:
                            throw new InvalidClassException("Unknown serialized type");
                    }
            }
        } else {
            ((h) obj).M(dataOutput);
        }
    }

    private Object readResolve() {
        return this.f11623h;
    }

    public void readExternal(ObjectInput objectInput) {
        byte readByte = objectInput.readByte();
        this.f11622g = readByte;
        this.f11623h = b(readByte, objectInput);
    }

    public void writeExternal(ObjectOutput objectOutput) {
        c(this.f11622g, this.f11623h, objectOutput);
    }

    l(byte b, Object obj) {
        this.f11622g = b;
        this.f11623h = obj;
    }
}
