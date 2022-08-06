package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

public class SafeParcelReader {

    public static class ParseException extends RuntimeException {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public ParseException(java.lang.String r4, android.os.Parcel r5) {
            /*
                r3 = this;
                int r0 = r5.dataPosition()
                int r5 = r5.dataSize()
                java.lang.String r1 = java.lang.String.valueOf(r4)
                int r1 = r1.length()
                int r1 = r1 + 41
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>(r1)
                r2.append(r4)
                java.lang.String r4 = " Parcel: pos="
                r2.append(r4)
                r2.append(r0)
                java.lang.String r4 = " size="
                r2.append(r4)
                r2.append(r5)
                java.lang.String r4 = r2.toString()
                r3.<init>(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException.<init>(java.lang.String, android.os.Parcel):void");
        }
    }

    public static Bundle a(Parcel parcel, int i2) {
        int v = v(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (v == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + v);
        return readBundle;
    }

    public static byte[] b(Parcel parcel, int i2) {
        int v = v(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (v == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + v);
        return createByteArray;
    }

    public static <T extends Parcelable> T c(Parcel parcel, int i2, Parcelable.Creator<T> creator) {
        int v = v(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (v == 0) {
            return null;
        }
        T t = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + v);
        return t;
    }

    public static String d(Parcel parcel, int i2) {
        int v = v(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (v == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + v);
        return readString;
    }

    public static ArrayList<String> e(Parcel parcel, int i2) {
        int v = v(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (v == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + v);
        return createStringArrayList;
    }

    public static <T> T[] f(Parcel parcel, int i2, Parcelable.Creator<T> creator) {
        int v = v(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (v == 0) {
            return null;
        }
        T[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + v);
        return createTypedArray;
    }

    public static <T> ArrayList<T> g(Parcel parcel, int i2, Parcelable.Creator<T> creator) {
        int v = v(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (v == 0) {
            return null;
        }
        ArrayList<T> createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + v);
        return createTypedArrayList;
    }

    public static void h(Parcel parcel, int i2) {
        if (parcel.dataPosition() != i2) {
            StringBuilder sb = new StringBuilder(37);
            sb.append("Overread allowed size end=");
            sb.append(i2);
            throw new ParseException(sb.toString(), parcel);
        }
    }

    public static int i(int i2) {
        return i2 & 65535;
    }

    public static boolean j(Parcel parcel, int i2) {
        y(parcel, i2, 4);
        return parcel.readInt() != 0;
    }

    public static Boolean k(Parcel parcel, int i2) {
        int v = v(parcel, i2);
        if (v == 0) {
            return null;
        }
        z(parcel, i2, v, 4);
        return Boolean.valueOf(parcel.readInt() != 0);
    }

    public static double l(Parcel parcel, int i2) {
        y(parcel, i2, 8);
        return parcel.readDouble();
    }

    public static Double m(Parcel parcel, int i2) {
        int v = v(parcel, i2);
        if (v == 0) {
            return null;
        }
        z(parcel, i2, v, 8);
        return Double.valueOf(parcel.readDouble());
    }

    public static float n(Parcel parcel, int i2) {
        y(parcel, i2, 4);
        return parcel.readFloat();
    }

    public static Float o(Parcel parcel, int i2) {
        int v = v(parcel, i2);
        if (v == 0) {
            return null;
        }
        z(parcel, i2, v, 4);
        return Float.valueOf(parcel.readFloat());
    }

    public static int p(Parcel parcel) {
        return parcel.readInt();
    }

    public static IBinder q(Parcel parcel, int i2) {
        int v = v(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (v == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + v);
        return readStrongBinder;
    }

    public static int r(Parcel parcel, int i2) {
        y(parcel, i2, 4);
        return parcel.readInt();
    }

    public static long s(Parcel parcel, int i2) {
        y(parcel, i2, 8);
        return parcel.readLong();
    }

    public static Long t(Parcel parcel, int i2) {
        int v = v(parcel, i2);
        if (v == 0) {
            return null;
        }
        z(parcel, i2, v, 8);
        return Long.valueOf(parcel.readLong());
    }

    public static short u(Parcel parcel, int i2) {
        y(parcel, i2, 4);
        return (short) parcel.readInt();
    }

    public static int v(Parcel parcel, int i2) {
        return (i2 & -65536) != -65536 ? (i2 >> 16) & 65535 : parcel.readInt();
    }

    public static void w(Parcel parcel, int i2) {
        parcel.setDataPosition(parcel.dataPosition() + v(parcel, i2));
    }

    public static int x(Parcel parcel) {
        int p = p(parcel);
        int v = v(parcel, p);
        int dataPosition = parcel.dataPosition();
        if (i(p) != 20293) {
            String valueOf = String.valueOf(Integer.toHexString(p));
            throw new ParseException(valueOf.length() != 0 ? "Expected object header. Got 0x".concat(valueOf) : new String("Expected object header. Got 0x"), parcel);
        }
        int i2 = v + dataPosition;
        if (i2 >= dataPosition && i2 <= parcel.dataSize()) {
            return i2;
        }
        StringBuilder sb = new StringBuilder(54);
        sb.append("Size read is invalid start=");
        sb.append(dataPosition);
        sb.append(" end=");
        sb.append(i2);
        throw new ParseException(sb.toString(), parcel);
    }

    private static void y(Parcel parcel, int i2, int i3) {
        int v = v(parcel, i2);
        if (v != i3) {
            String hexString = Integer.toHexString(v);
            StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 46);
            sb.append("Expected size ");
            sb.append(i3);
            sb.append(" got ");
            sb.append(v);
            sb.append(" (0x");
            sb.append(hexString);
            sb.append(")");
            throw new ParseException(sb.toString(), parcel);
        }
    }

    private static void z(Parcel parcel, int i2, int i3, int i4) {
        if (i3 != i4) {
            String hexString = Integer.toHexString(i3);
            StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 46);
            sb.append("Expected size ");
            sb.append(i4);
            sb.append(" got ");
            sb.append(i3);
            sb.append(" (0x");
            sb.append(hexString);
            sb.append(")");
            throw new ParseException(sb.toString(), parcel);
        }
    }
}
