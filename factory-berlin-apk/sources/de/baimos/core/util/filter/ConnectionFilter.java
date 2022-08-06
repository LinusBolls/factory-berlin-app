package de.baimos.core.util.filter;

import java.io.InputStream;
import java.io.OutputStream;

public interface ConnectionFilter {
    void doFilter(InputStream inputStream, OutputStream outputStream, ConnectionParameters connectionParameters, ConnectionFilterChain connectionFilterChain);
}
