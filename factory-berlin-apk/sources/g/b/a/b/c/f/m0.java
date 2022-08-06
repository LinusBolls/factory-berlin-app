package g.b.a.b.c.f;

import android.bluetooth.BluetoothDevice;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class m0 implements Parcelable.Creator<l0> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int x = SafeParcelReader.x(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        BluetoothDevice bluetoothDevice = null;
        while (parcel.dataPosition() < x) {
            int p = SafeParcelReader.p(parcel);
            int i2 = SafeParcelReader.i(p);
            if (i2 == 1) {
                str = SafeParcelReader.d(parcel, p);
            } else if (i2 == 2) {
                str2 = SafeParcelReader.d(parcel, p);
            } else if (i2 == 3) {
                str3 = SafeParcelReader.d(parcel, p);
            } else if (i2 != 4) {
                SafeParcelReader.w(parcel, p);
            } else {
                bluetoothDevice = (BluetoothDevice) SafeParcelReader.c(parcel, p, BluetoothDevice.CREATOR);
            }
        }
        SafeParcelReader.h(parcel, x);
        return new l0(str, str2, str3, bluetoothDevice);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new l0[i2];
    }
}
