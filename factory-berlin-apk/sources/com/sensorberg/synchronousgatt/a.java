package com.sensorberg.synchronousgatt;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import com.sensorberg.synchronousgatt.GattException;
import com.sensorberg.synchronousgatt.b;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.k;

/* compiled from: GattCallback.kt */
public final class a extends BluetoothGattCallback {
    private final BlockingQueue<b> a = new LinkedBlockingQueue();
    private BluetoothGatt b;

    private final b a(long j2) {
        try {
            return this.a.poll(j2, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            throw new GattException.NoResult();
        }
    }

    public static /* synthetic */ b c(a aVar, Class cls, long j2, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        return aVar.b(cls, j2, z);
    }

    private final void d(b bVar) {
        BluetoothGatt bluetoothGatt = this.b;
        if (bluetoothGatt != null) {
            bVar.b(bluetoothGatt);
            this.a.offer(bVar);
            return;
        }
        k.q("bluetoothGatt");
        throw null;
    }

    public final <T extends b> T b(Class<T> cls, long j2, boolean z) {
        k.f(cls, "type");
        T a2 = a(j2);
        if (a2 == null) {
            throw new GattException.Timeout();
        } else if (!z && (a2 instanceof b.d) && ((b.d) a2).c() == 0) {
            throw new GattException.UnexpectedDisconnection();
        } else if (!(!k.a(a2.getClass(), cls))) {
            return a2;
        } else {
            throw new GattException.UnexpectedResult(cls, a2.getClass());
        }
    }

    public final void e(BluetoothGatt bluetoothGatt) {
        k.f(bluetoothGatt, "bluetoothGatt");
        this.b = bluetoothGatt;
    }

    public void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        k.f(bluetoothGatt, "gatt");
        k.f(bluetoothGattCharacteristic, "characteristic");
        n.a.a.a("onCharacteristicChanged(uuid:" + bluetoothGattCharacteristic.getUuid() + ')', new Object[0]);
        d(new b.a(bluetoothGattCharacteristic));
    }

    public void onCharacteristicRead(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i2) {
        k.f(bluetoothGatt, "gatt");
        k.f(bluetoothGattCharacteristic, "characteristic");
        n.a.a.a("onCharacteristicRead(status:" + i2 + "; uuid:" + bluetoothGattCharacteristic.getUuid() + ')', new Object[0]);
        d(new b.C0542b(bluetoothGattCharacteristic, i2));
    }

    public void onCharacteristicWrite(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i2) {
        k.f(bluetoothGatt, "gatt");
        k.f(bluetoothGattCharacteristic, "characteristic");
        n.a.a.a("onCharacteristicWrite(status:" + i2 + "; uuid:" + bluetoothGattCharacteristic.getUuid() + ')', new Object[0]);
        d(new b.c(bluetoothGattCharacteristic, i2));
    }

    public void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i2, int i3) {
        k.f(bluetoothGatt, "gatt");
        n.a.a.a("onConnectionStateChange(status:" + i2 + "; newState:" + i3 + ')', new Object[0]);
        d(new b.d(i2, i3));
    }

    public void onDescriptorRead(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i2) {
        k.f(bluetoothGatt, "gatt");
        k.f(bluetoothGattDescriptor, "descriptor");
        n.a.a.a("onDescriptorRead(status:" + i2 + ')', new Object[0]);
        d(new b.e(bluetoothGattDescriptor, i2));
    }

    public void onDescriptorWrite(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i2) {
        k.f(bluetoothGatt, "gatt");
        k.f(bluetoothGattDescriptor, "descriptor");
        n.a.a.a("onDescriptorWrite(status:" + i2 + "; descriptor:" + bluetoothGattDescriptor.getUuid() + ')', new Object[0]);
        d(new b.f(bluetoothGattDescriptor, i2));
    }

    public void onMtuChanged(BluetoothGatt bluetoothGatt, int i2, int i3) {
        k.f(bluetoothGatt, "gatt");
        n.a.a.a("onMtuChanged(status:" + i3 + "; mtu:" + i2 + ')', new Object[0]);
        d(new b.g(i2, i3));
    }

    public void onReadRemoteRssi(BluetoothGatt bluetoothGatt, int i2, int i3) {
        k.f(bluetoothGatt, "gatt");
        n.a.a.a("onReadRemoteRssi(status:" + i3 + "; rssi:" + i2 + ')', new Object[0]);
        d(new b.h(i2, i3));
    }

    public void onReliableWriteCompleted(BluetoothGatt bluetoothGatt, int i2) {
        k.f(bluetoothGatt, "gatt");
        n.a.a.a("onReliableWriteCompleted(status:" + i2 + ')', new Object[0]);
        d(new b.i(i2));
    }

    public void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i2) {
        k.f(bluetoothGatt, "gatt");
        n.a.a.a("onServicesDiscovered(status:" + i2 + ')', new Object[0]);
        List<BluetoothGattService> services = bluetoothGatt.getServices();
        k.b(services, "gatt.services");
        d(new b.j(i2, services));
    }
}
