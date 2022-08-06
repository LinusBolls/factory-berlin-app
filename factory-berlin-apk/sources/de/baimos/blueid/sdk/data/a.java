package de.baimos.blueid.sdk.data;

import de.baimos.blueid.sdk.api.CommandExecutionResponse;
import de.baimos.blueid.sdk.api.response.ResponseObject;
import de.baimos.blueid.sdk.api.response.c;

public class a implements CommandExecutionResponse {
    private int a;
    private int b;
    private boolean c = false;

    /* renamed from: d  reason: collision with root package name */
    private long f8227d;

    /* renamed from: e  reason: collision with root package name */
    private byte[] f8228e;

    /* renamed from: f  reason: collision with root package name */
    private ResponseObject f8229f = null;

    public void a(int i2) {
        this.a = i2;
    }

    public void a(long j2) {
        this.f8227d = j2;
    }

    public void a(boolean z) {
        this.c = z;
    }

    public void a(byte[] bArr) {
        this.f8228e = bArr;
    }

    public boolean a() {
        return this.c;
    }

    public int b() {
        return this.a;
    }

    public void b(int i2) {
        this.b = i2;
    }

    public long c() {
        return this.f8227d;
    }

    public byte[] d() {
        return this.f8228e;
    }

    public int getResponseCode() {
        return this.b;
    }

    public ResponseObject getResponseObject() {
        if (this.f8229f == null) {
            this.f8229f = c.a(d());
        }
        return this.f8229f;
    }
}
