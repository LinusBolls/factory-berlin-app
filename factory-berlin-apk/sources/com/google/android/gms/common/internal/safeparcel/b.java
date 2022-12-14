package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

public class b {
    public static int a(Parcel parcel) {
        return u(parcel, 20293);
    }

    public static void b(Parcel parcel, int i2) {
        w(parcel, i2);
    }

    public static void c(Parcel parcel, int i2, boolean z) {
        x(parcel, i2, 4);
        parcel.writeInt(z ? 1 : 0);
    }

    public static void d(Parcel parcel, int i2, Boolean bool, boolean z) {
        if (bool != null) {
            x(parcel, i2, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        } else if (z) {
            x(parcel, i2, 0);
        }
    }

    public static void e(Parcel parcel, int i2, Bundle bundle, boolean z) {
        if (bundle != null) {
            int u = u(parcel, i2);
            parcel.writeBundle(bundle);
            w(parcel, u);
        } else if (z) {
            x(parcel, i2, 0);
        }
    }

    public static void f(Parcel parcel, int i2, byte[] bArr, boolean z) {
        if (bArr != null) {
            int u = u(parcel, i2);
            parcel.writeByteArray(bArr);
            w(parcel, u);
        } else if (z) {
            x(parcel, i2, 0);
        }
    }

    public static void g(Parcel parcel, int i2, double d2) {
        x(parcel, i2, 8);
        parcel.writeDouble(d2);
    }

    public static void h(Parcel parcel, int i2, Double d2, boolean z) {
        if (d2 != null) {
            x(parcel, i2, 8);
            parcel.writeDouble(d2.doubleValue());
        } else if (z) {
            x(parcel, i2, 0);
        }
    }

    public static void i(Parcel parcel, int i2, float f2) {
        x(parcel, i2, 4);
        parcel.writeFloat(f2);
    }

    public static void j(Parcel parcel, int i2, Float f2, boolean z) {
        if (f2 != null) {
            x(parcel, i2, 4);
            parcel.writeFloat(f2.floatValue());
        } else if (z) {
            x(parcel, i2, 0);
        }
    }

    public static void k(Parcel parcel, int i2, IBinder iBinder, boolean z) {
        if (iBinder != null) {
            int u = u(parcel, i2);
            parcel.writeStrongBinder(iBinder);
            w(parcel, u);
        } else if (z) {
            x(parcel, i2, 0);
        }
    }

    public static void l(Parcel parcel, int i2, int i3) {
        x(parcel, i2, 4);
        parcel.writeInt(i3);
    }

    public static void m(Parcel parcel, int i2, long j2) {
        x(parcel, i2, 8);
        parcel.writeLong(j2);
    }

    public static void n(Parcel parcel, int i2, Long l2, boolean z) {
        if (l2 != null) {
            x(parcel, i2, 8);
            parcel.writeLong(l2.longValue());
        } else if (z) {
            x(parcel, i2, 0);
        }
    }

    public static void o(Parcel parcel, int i2, Parcelable parcelable, int i3, boolean z) {
        if (parcelable != null) {
            int u = u(parcel, i2);
            parcelable.writeToParcel(parcel, i3);
            w(parcel, u);
        } else if (z) {
            x(parcel, i2, 0);
        }
    }

    public static void p(Parcel parcel, int i2, short s) {
        x(parcel, i2, 4);
        parcel.writeInt(s);
    }

    public static void q(Parcel parcel, int i2, String str, boolean z) {
        if (str != null) {
            int u = u(parcel, i2);
            parcel.writeString(str);
            w(parcel, u);
        } else if (z) {
            x(parcel, i2, 0);
        }
    }

    public static void r(Parcel parcel, int i2, List<String> list, boolean z) {
        if (list != null) {
            int u = u(parcel, i2);
            parcel.writeStringList(list);
            w(parcel, u);
        } else if (z) {
            x(parcel, i2, 0);
        }
    }

    public static <T extends Parcelable> void s(Parcel parcel, int i2, T[] tArr, int i3, boolean z) {
        if (tArr != null) {
            int u = u(parcel, i2);
            parcel.writeInt(r7);
            for (T t : tArr) {
                if (t == null) {
                    parcel.writeInt(0);
                } else {
                    v(parcel, t, i3);
                }
            }
            w(parcel, u);
        } else if (z) {
            x(parcel, i2, 0);
        }
    }

    public static <T extends Parcelable> void t(Parcel parcel, int i2, List<T> list, boolean z) {
        if (list != null) {
            int u = u(parcel, i2);
            int size = list.size();
            parcel.writeInt(size);
            for (int i3 = 0; i3 < size; i3++) {
                Parcelable parcelable = (Parcelable) list.get(i3);
                if (parcelable == null) {
                    parcel.writeInt(0);
                } else {
                    v(parcel, parcelable, 0);
                }
            }
            w(parcel, u);
        } else if (z) {
            x(parcel, i2, 0);
        }
    }

    private static int u(Parcel parcel, int i2) {
        parcel.writeInt(i2 | -65536);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    private static <T extends Parcelable> void v(Parcel parcel, T t, int i2) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        t.writeToParcel(parcel, i2);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }

    private static void w(Parcel parcel, int i2) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i2 - 4);
        parcel.writeInt(dataPosition - i2);
        parcel.setDataPosition(dataPosition);
    }

    private static void x(Parcel parcel, int i2, int i3) {
        if (i3 >= 65535) {
            parcel.writeInt(i2 | -65536);
            parcel.writeInt(i3);
            return;
        }
        parcel.writeInt(i2 | (i3 << 16));
    }
}
