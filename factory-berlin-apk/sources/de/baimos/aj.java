package de.baimos;

import de.baimos.blueid.sdk.api.Channel;
import de.baimos.blueid.sdk.api.Command;
import de.baimos.blueid.sdk.conn.protocols.Protocol;
import de.baimos.blueid.sdk.data.a;
import de.baimos.blueid.sdk.data.b;
import de.baimos.blueid.sdk.data.c;
import de.baimos.core.util.filter.ConnectionFilterChain;
import de.baimos.core.util.filter.ConnectionParameters;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class aj extends Protocol {
    public aj(int i2) {
        super(3, "NoSecurity1.0", i2, false);
    }

    public void doFilter(InputStream inputStream, OutputStream outputStream, ConnectionParameters connectionParameters, ConnectionFilterChain connectionFilterChain) {
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
        a aVar = (a) connectionParameters.getParameter("commandExecutionResponse");
        c a = ((b) connectionParameters.getParameter("securedObject")).a((Command) connectionParameters.getParameter("command"), (Channel) connectionParameters.getParameter("channel"));
        if (a != null) {
            bufferedOutputStream.write(a.e());
            bufferedOutputStream.write(a(connectionParameters));
            bufferedOutputStream.flush();
            byte[] bArr = new byte[2];
            cq.a(inputStream, bArr);
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            int c = cq.c(byteArrayInputStream);
            int c2 = cq.c(byteArrayInputStream);
            aVar.a(c);
            aVar.b(c2);
            return;
        }
        throw new RuntimeException("failed to get valid ticket for chosen command and channel");
    }
}
