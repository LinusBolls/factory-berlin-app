package com.sensorberg.synchronousgatt;

import kotlin.i;
import kotlin.jvm.internal.k;

@i(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0006\u0007\b\tB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0001\u0004\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/sensorberg/synchronousgatt/GattException;", "Ljava/lang/Exception;", "", "message", "<init>", "(Ljava/lang/String;)V", "NoResult", "Timeout", "UnexpectedDisconnection", "UnexpectedResult", "Lcom/sensorberg/synchronousgatt/GattException$NoResult;", "Lcom/sensorberg/synchronousgatt/GattException$UnexpectedDisconnection;", "Lcom/sensorberg/synchronousgatt/GattException$UnexpectedResult;", "Lcom/sensorberg/synchronousgatt/GattException$Timeout;", "synchronousgatt_release"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
/* compiled from: GattException.kt */
public abstract class GattException extends Exception {

    @i(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sensorberg/synchronousgatt/GattException$NoResult;", "Lcom/sensorberg/synchronousgatt/GattException;", "<init>", "()V", "synchronousgatt_release"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
    /* compiled from: GattException.kt */
    public static final class NoResult extends GattException {
        public NoResult() {
            super("Gatt: No Result found", (DefaultConstructorMarker) null);
        }
    }

    @i(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sensorberg/synchronousgatt/GattException$Timeout;", "Lcom/sensorberg/synchronousgatt/GattException;", "<init>", "()V", "synchronousgatt_release"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
    /* compiled from: GattException.kt */
    public static final class Timeout extends GattException {
        public Timeout() {
            super("Gatt: Operation has timed-out", (DefaultConstructorMarker) null);
        }
    }

    @i(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sensorberg/synchronousgatt/GattException$UnexpectedDisconnection;", "Lcom/sensorberg/synchronousgatt/GattException;", "<init>", "()V", "synchronousgatt_release"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
    /* compiled from: GattException.kt */
    public static final class UnexpectedDisconnection extends GattException {
        public UnexpectedDisconnection() {
            super("Gatt: disconnected unexpectedly", (DefaultConstructorMarker) null);
        }
    }

    @i(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B%\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/sensorberg/synchronousgatt/GattException$UnexpectedResult;", "Lcom/sensorberg/synchronousgatt/GattException;", "Ljava/lang/Class;", "Lcom/sensorberg/synchronousgatt/GattResult;", "expected", "received", "<init>", "(Ljava/lang/Class;Ljava/lang/Class;)V", "synchronousgatt_release"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
    /* compiled from: GattException.kt */
    public static final class UnexpectedResult extends GattException {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public UnexpectedResult(Class<? extends b> cls, Class<b> cls2) {
            super("Gatt: Expected result was " + cls.getSimpleName() + ", but received " + cls2.getSimpleName(), (DefaultConstructorMarker) null);
            k.f(cls, "expected");
            k.f(cls2, "received");
        }
    }

    private GattException(String str) {
        super(str);
    }

    public /* synthetic */ GattException(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
