package de.baimos.blueid.sdk.conn;

import de.baimos.core.util.filter.ConnectionFilter;
import de.baimos.core.util.filter.ConnectionFilterChain;
import de.baimos.core.util.filter.ConnectionParameters;
import java.io.InputStream;
import java.io.OutputStream;

public class a implements ConnectionFilter {
    private de.baimos.blueid.sdk.data.a a;

    public a(de.baimos.blueid.sdk.data.a aVar) {
        this.a = aVar;
    }

    public void doFilter(InputStream inputStream, OutputStream outputStream, ConnectionParameters connectionParameters, ConnectionFilterChain connectionFilterChain) {
        this.a.a(true);
        connectionFilterChain.doFilter(inputStream, outputStream, connectionParameters);
    }
}
