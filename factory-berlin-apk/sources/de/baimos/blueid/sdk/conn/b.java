package de.baimos.blueid.sdk.conn;

import de.baimos.blueid.sdk.conn.protocols.Protocol;
import de.baimos.blueid.sdk.metrics.AndroidSdkMetrics;
import de.baimos.core.util.filter.ConnectionFilter;
import de.baimos.core.util.filter.ConnectionFilterChain;
import de.baimos.core.util.filter.ConnectionParameters;
import de.baimos.cq;
import de.baimos.dr;
import de.baimos.ds;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class b implements ConnectionFilter {
    private static final dr a = ds.a(b.class);
    private SdkClientFactory b;

    public b(SdkClientFactory sdkClientFactory) {
        this.b = sdkClientFactory;
    }

    private List<String> a() {
        String property = System.getProperty("de.baimos.blueid.sdk.protocols.enabled", (String) null);
        return property == null ? Collections.emptyList() : Arrays.asList(property.split(AndroidSdkMetrics.SEPARATOR));
    }

    public void doFilter(InputStream inputStream, OutputStream outputStream, ConnectionParameters connectionParameters, ConnectionFilterChain connectionFilterChain) {
        List<Protocol> a2 = this.b.a();
        for (Protocol name : a2) {
            dr drVar = a;
            drVar.d("preferring protocol " + name.getName());
        }
        Object parameter = connectionParameters.getParameter("parameter");
        List<String> a3 = a();
        dr drVar2 = a;
        drVar2.d("explicitly enabled " + a3);
        Iterator<Protocol> it = a2.iterator();
        while (it.hasNext()) {
            Protocol next = it.next();
            String name2 = next.getName();
            if (parameter != null && !next.isSupportsParameters()) {
                dr drVar3 = a;
                drVar3.c("removed protocol " + name2 + " because it does not support parameters");
            } else if (!a3.isEmpty() && !a3.contains(name2)) {
                dr drVar4 = a;
                drVar4.d("removed protocol " + name2 + " because it was disabled by system property");
            }
            it.remove();
        }
        if (a2.size() != 0) {
            cq.a(outputStream, a2.size());
            for (Protocol id : a2) {
                cq.b(outputStream, id.getId());
            }
            outputStream.flush();
            a.d("reading protocol");
            int b2 = cq.b(inputStream);
            Protocol a4 = this.b.a(b2);
            if (a4 != null) {
                dr drVar5 = a;
                drVar5.d("use protocol " + a4.getName());
                a4.doFilter(inputStream, outputStream, connectionParameters, connectionFilterChain);
                return;
            }
            throw new IOException("Protocol unknown: " + b2 + " .Make sure that the secured object is valid and your BlueID SDK is not outdated.");
        }
        throw new IOException("No valid protocols found! Make sure that your BlueID SDK is not outdated.");
    }
}
