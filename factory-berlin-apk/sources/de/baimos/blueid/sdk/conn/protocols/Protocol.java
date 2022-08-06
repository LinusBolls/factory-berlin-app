package de.baimos.blueid.sdk.conn.protocols;

import de.baimos.af;
import de.baimos.aj;
import de.baimos.blueid.sdk.api.Command;
import de.baimos.core.util.filter.ConnectionFilter;
import de.baimos.core.util.filter.ConnectionFilterChain;
import de.baimos.core.util.filter.ConnectionParameters;
import de.baimos.cs;
import java.io.InputStream;
import java.io.OutputStream;

public class Protocol implements ConnectionFilter {
    public static final Protocol MICRO_1_0 = new af(1);
    public static final Protocol NOSECURITY_1_0 = new aj(1000);
    private final int a;
    private final String b;
    private final int c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f8226d;

    public Protocol(int i2, String str, int i3, boolean z) {
        this.a = i2;
        this.b = str;
        this.c = i3;
        this.f8226d = z;
    }

    /* access modifiers changed from: protected */
    public byte[] a(ConnectionParameters connectionParameters) {
        byte[] b2 = cs.b(((Command) connectionParameters.getParameter("command")).getId());
        if (b2.length == 4) {
            return b2;
        }
        throw new IllegalArgumentException("command must be 4 bytes but is " + b2.length);
    }

    public void doFilter(InputStream inputStream, OutputStream outputStream, ConnectionParameters connectionParameters, ConnectionFilterChain connectionFilterChain) {
        throw new RuntimeException("implement this!");
    }

    public int getId() {
        return this.a;
    }

    public String getName() {
        return this.b;
    }

    public int getPriority() {
        return this.c;
    }

    public boolean isSupportsParameters() {
        return this.f8226d;
    }
}
