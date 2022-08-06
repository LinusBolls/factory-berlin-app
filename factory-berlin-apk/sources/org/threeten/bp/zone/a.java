package org.threeten.bp.zone;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.Externalizable;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;
import org.threeten.bp.p;

/* compiled from: Ser */
final class a implements Externalizable {

    /* renamed from: g  reason: collision with root package name */
    private byte f11751g;

    /* renamed from: h  reason: collision with root package name */
    private Object f11752h;

    public a() {
    }

    static Object a(DataInput dataInput) {
        return c(dataInput.readByte(), dataInput);
    }

    static long b(DataInput dataInput) {
        byte readByte = dataInput.readByte() & 255;
        if (readByte == 255) {
            return dataInput.readLong();
        }
        return (((long) (((readByte << 16) + ((dataInput.readByte() & 255) << 8)) + (dataInput.readByte() & 255))) * 900) - 4575744000L;
    }

    private static Object c(byte b, DataInput dataInput) {
        if (b == 1) {
            return b.m(dataInput);
        }
        if (b == 2) {
            return d.q(dataInput);
        }
        if (b == 3) {
            return e.c(dataInput);
        }
        throw new StreamCorruptedException("Unknown serialized type");
    }

    static p d(DataInput dataInput) {
        byte readByte = dataInput.readByte();
        return readByte == Byte.MAX_VALUE ? p.O(dataInput.readInt()) : p.O(readByte * 900);
    }

    static void e(long j2, DataOutput dataOutput) {
        if (j2 < -4575744000L || j2 >= 10413792000L || j2 % 900 != 0) {
            dataOutput.writeByte(255);
            dataOutput.writeLong(j2);
            return;
        }
        int i2 = (int) ((j2 + 4575744000L) / 900);
        dataOutput.writeByte((i2 >>> 16) & 255);
        dataOutput.writeByte((i2 >>> 8) & 255);
        dataOutput.writeByte(i2 & 255);
    }

    private static void f(byte b, Object obj, DataOutput dataOutput) {
        dataOutput.writeByte(b);
        if (b == 1) {
            ((b) obj).n(dataOutput);
        } else if (b == 2) {
            ((d) obj).v(dataOutput);
        } else if (b == 3) {
            ((e) obj).d(dataOutput);
        } else {
            throw new InvalidClassException("Unknown serialized type");
        }
    }

    static void g(p pVar, DataOutput dataOutput) {
        int K = pVar.K();
        int i2 = K % 900 == 0 ? K / 900 : 127;
        dataOutput.writeByte(i2);
        if (i2 == 127) {
            dataOutput.writeInt(K);
        }
    }

    private Object readResolve() {
        return this.f11752h;
    }

    public void readExternal(ObjectInput objectInput) {
        byte readByte = objectInput.readByte();
        this.f11751g = readByte;
        this.f11752h = c(readByte, objectInput);
    }

    public void writeExternal(ObjectOutput objectOutput) {
        f(this.f11751g, this.f11752h, objectOutput);
    }

    a(byte b, Object obj) {
        this.f11751g = b;
        this.f11752h = obj;
    }
}
