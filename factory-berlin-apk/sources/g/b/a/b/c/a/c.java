package g.b.a.b.c.a;

import android.os.Parcel;

public class c {
    static {
        c.class.getClassLoader();
    }

    private c() {
    }

    public static void a(Parcel parcel, boolean z) {
        parcel.writeInt(1);
    }

    public static boolean b(Parcel parcel) {
        return parcel.readInt() != 0;
    }
}
