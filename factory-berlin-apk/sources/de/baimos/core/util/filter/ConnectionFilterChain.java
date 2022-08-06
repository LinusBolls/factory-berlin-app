package de.baimos.core.util.filter;

import java.io.InputStream;
import java.io.OutputStream;

public interface ConnectionFilterChain {
    void abort(InputStream inputStream, OutputStream outputStream, ConnectionParameters connectionParameters);

    void doFilter(InputStream inputStream, OutputStream outputStream, ConnectionParameters connectionParameters);
}
