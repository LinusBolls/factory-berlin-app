package com.sensorberg.synchronousgatt;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import java.util.List;
import kotlin.jvm.internal.k;

/* compiled from: GattResult.kt */
public abstract class b {
    public BluetoothGatt a;

    /* compiled from: GattResult.kt */
    public static final class a extends b {
        private final BluetoothGattCharacteristic b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            super((DefaultConstructorMarker) null);
            k.f(bluetoothGattCharacteristic, "characteristic");
            this.b = bluetoothGattCharacteristic;
        }

        public final BluetoothGattCharacteristic c() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof a) && k.a(this.b, ((a) obj).b);
            }
            return true;
        }

        public int hashCode() {
            BluetoothGattCharacteristic bluetoothGattCharacteristic = this.b;
            if (bluetoothGattCharacteristic != null) {
                return bluetoothGattCharacteristic.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "OnCharacteristicChanged(characteristic=" + this.b + ")";
        }
    }

    /* renamed from: com.sensorberg.synchronousgatt.b$b  reason: collision with other inner class name */
    /* compiled from: GattResult.kt */
    public static final class C0542b extends b {
        private final BluetoothGattCharacteristic b;
        private final int c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0542b(BluetoothGattCharacteristic bluetoothGattCharacteristic, int i2) {
            super((DefaultConstructorMarker) null);
            k.f(bluetoothGattCharacteristic, "characteristic");
            this.b = bluetoothGattCharacteristic;
            this.c = i2;
        }

        public final BluetoothGattCharacteristic c() {
            return this.b;
        }

        public final int d() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0542b)) {
                return false;
            }
            C0542b bVar = (C0542b) obj;
            return k.a(this.b, bVar.b) && this.c == bVar.c;
        }

        public int hashCode() {
            BluetoothGattCharacteristic bluetoothGattCharacteristic = this.b;
            return ((bluetoothGattCharacteristic != null ? bluetoothGattCharacteristic.hashCode() : 0) * 31) + this.c;
        }

        public String toString() {
            return "OnCharacteristicRead(characteristic=" + this.b + ", status=" + this.c + ")";
        }
    }

    /* compiled from: GattResult.kt */
    public static final class c extends b {
        private final BluetoothGattCharacteristic b;
        private final int c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(BluetoothGattCharacteristic bluetoothGattCharacteristic, int i2) {
            super((DefaultConstructorMarker) null);
            k.f(bluetoothGattCharacteristic, "characteristic");
            this.b = bluetoothGattCharacteristic;
            this.c = i2;
        }

        public final int c() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return k.a(this.b, cVar.b) && this.c == cVar.c;
        }

        public int hashCode() {
            BluetoothGattCharacteristic bluetoothGattCharacteristic = this.b;
            return ((bluetoothGattCharacteristic != null ? bluetoothGattCharacteristic.hashCode() : 0) * 31) + this.c;
        }

        public String toString() {
            return "OnCharacteristicWrite(characteristic=" + this.b + ", status=" + this.c + ")";
        }
    }

    /* compiled from: GattResult.kt */
    public static final class d extends b {
        private final int b;
        private final int c;

        public d(int i2, int i3) {
            super((DefaultConstructorMarker) null);
            this.b = i2;
            this.c = i3;
        }

        public final int c() {
            return this.c;
        }

        public final int d() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.b == dVar.b && this.c == dVar.c;
        }

        public int hashCode() {
            return (this.b * 31) + this.c;
        }

        public String toString() {
            return "OnConnectionStateChange(status=" + this.b + ", newState=" + this.c + ")";
        }
    }

    /* compiled from: GattResult.kt */
    public static final class e extends b {
        private final BluetoothGattDescriptor b;
        private final int c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(BluetoothGattDescriptor bluetoothGattDescriptor, int i2) {
            super((DefaultConstructorMarker) null);
            k.f(bluetoothGattDescriptor, "descriptor");
            this.b = bluetoothGattDescriptor;
            this.c = i2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return k.a(this.b, eVar.b) && this.c == eVar.c;
        }

        public int hashCode() {
            BluetoothGattDescriptor bluetoothGattDescriptor = this.b;
            return ((bluetoothGattDescriptor != null ? bluetoothGattDescriptor.hashCode() : 0) * 31) + this.c;
        }

        public String toString() {
            return "OnDescriptorRead(descriptor=" + this.b + ", status=" + this.c + ")";
        }
    }

    /* compiled from: GattResult.kt */
    public static final class f extends b {
        private final BluetoothGattDescriptor b;
        private final int c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(BluetoothGattDescriptor bluetoothGattDescriptor, int i2) {
            super((DefaultConstructorMarker) null);
            k.f(bluetoothGattDescriptor, "descriptor");
            this.b = bluetoothGattDescriptor;
            this.c = i2;
        }

        public final int c() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return k.a(this.b, fVar.b) && this.c == fVar.c;
        }

        public int hashCode() {
            BluetoothGattDescriptor bluetoothGattDescriptor = this.b;
            return ((bluetoothGattDescriptor != null ? bluetoothGattDescriptor.hashCode() : 0) * 31) + this.c;
        }

        public String toString() {
            return "OnDescriptorWrite(descriptor=" + this.b + ", status=" + this.c + ")";
        }
    }

    /* compiled from: GattResult.kt */
    public static final class g extends b {
        private final int b;
        private final int c;

        public g(int i2, int i3) {
            super((DefaultConstructorMarker) null);
            this.b = i2;
            this.c = i3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return this.b == gVar.b && this.c == gVar.c;
        }

        public int hashCode() {
            return (this.b * 31) + this.c;
        }

        public String toString() {
            return "OnMtuChanged(mtu=" + this.b + ", status=" + this.c + ")";
        }
    }

    /* compiled from: GattResult.kt */
    public static final class h extends b {
        private final int b;
        private final int c;

        public h(int i2, int i3) {
            super((DefaultConstructorMarker) null);
            this.b = i2;
            this.c = i3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return this.b == hVar.b && this.c == hVar.c;
        }

        public int hashCode() {
            return (this.b * 31) + this.c;
        }

        public String toString() {
            return "OnReadRemoteRssi(rssi=" + this.b + ", status=" + this.c + ")";
        }
    }

    /* compiled from: GattResult.kt */
    public static final class i extends b {
        private final int b;

        public i(int i2) {
            super((DefaultConstructorMarker) null);
            this.b = i2;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof i) && this.b == ((i) obj).b;
            }
            return true;
        }

        public int hashCode() {
            return this.b;
        }

        public String toString() {
            return "OnReliableWriteCompleted(status=" + this.b + ")";
        }
    }

    /* compiled from: GattResult.kt */
    public static final class j extends b {
        private final int b;
        private final List<BluetoothGattService> c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public j(int i2, List<? extends BluetoothGattService> list) {
            super((DefaultConstructorMarker) null);
            k.f(list, "services");
            this.b = i2;
            this.c = list;
        }

        public final List<BluetoothGattService> c() {
            return this.c;
        }

        public final int d() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return this.b == jVar.b && k.a(this.c, jVar.c);
        }

        public int hashCode() {
            int i2 = this.b * 31;
            List<BluetoothGattService> list = this.c;
            return i2 + (list != null ? list.hashCode() : 0);
        }

        public String toString() {
            return "OnServicesDiscovered(status=" + this.b + ", services=" + this.c + ")";
        }
    }

    private b() {
    }

    public final BluetoothGatt a() {
        BluetoothGatt bluetoothGatt = this.a;
        if (bluetoothGatt != null) {
            return bluetoothGatt;
        }
        k.q("gatt");
        throw null;
    }

    public final void b(BluetoothGatt bluetoothGatt) {
        k.f(bluetoothGatt, "<set-?>");
        this.a = bluetoothGatt;
    }

    public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
