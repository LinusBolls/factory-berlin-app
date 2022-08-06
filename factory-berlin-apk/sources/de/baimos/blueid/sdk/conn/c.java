package de.baimos.blueid.sdk.conn;

import de.baimos.blueid.sdk.metrics.AndroidSdkMetrics;
import de.baimos.core.util.filter.ConnectionFilter;
import de.baimos.core.util.filter.ConnectionFilterChain;
import de.baimos.core.util.filter.ConnectionParameters;
import de.baimos.dr;
import de.baimos.ds;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class c implements ConnectionFilter {
    private static final dr a = ds.a(c.class);
    /* access modifiers changed from: private */
    public ByteArrayOutputStream b = new ByteArrayOutputStream();
    /* access modifiers changed from: private */
    public ByteArrayOutputStream c = new ByteArrayOutputStream();

    private String a(byte[] bArr, int i2) {
        StringBuilder sb = new StringBuilder("{");
        for (int i3 = 0; i3 < i2; i3++) {
            sb.append("0x");
            sb.append(String.format("%02X", new Object[]{Byte.valueOf(bArr[i3])}));
            sb.append(", ");
        }
        sb.delete(sb.length() - 2, sb.length());
        sb.append("};");
        return sb.toString();
    }

    private void a(String str, String str2, byte[] bArr, AndroidSdkMetrics androidSdkMetrics) {
        dr drVar = a;
        drVar.c("sniffed " + str + " bytes: " + bArr.length);
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        byte[] bArr2 = new byte[10];
        int i2 = 0;
        int i3 = 0;
        while (i2 > -1) {
            try {
                i2 = byteArrayInputStream.read(bArr2);
                if (i2 > 0) {
                    dr drVar2 = a;
                    StringBuilder sb = new StringBuilder();
                    sb.append(str2);
                    sb.append(" bytes ");
                    sb.append(i3);
                    sb.append(" to ");
                    i3 += i2;
                    sb.append(i3 - 1);
                    sb.append(": ");
                    sb.append(a(bArr2, i2));
                    drVar2.c(sb.toString());
                }
            } catch (IOException e2) {
                a.a("failed to read data", e2);
                androidSdkMetrics.addMessage(e2.toString());
            }
        }
        a.c("--");
    }

    public void a(AndroidSdkMetrics androidSdkMetrics) {
        a("incoming", "in", this.b.toByteArray(), androidSdkMetrics);
        a("outgoing", "out", this.c.toByteArray(), androidSdkMetrics);
    }

    public void doFilter(final InputStream inputStream, final OutputStream outputStream, ConnectionParameters connectionParameters, ConnectionFilterChain connectionFilterChain) {
        a.c("sniffing data activated");
        connectionFilterChain.doFilter(new InputStream() {
            public int available() {
                return inputStream.available();
            }

            public void close() {
                inputStream.close();
                c.this.b.close();
            }

            public int read() {
                int read = inputStream.read();
                if (read > -1) {
                    c.this.b.write(read);
                }
                return read;
            }

            public int read(byte[] bArr) {
                int read = inputStream.read(bArr);
                if (read > 0) {
                    c.this.b.write(bArr, 0, read);
                }
                return read;
            }

            public int read(byte[] bArr, int i2, int i3) {
                int read = inputStream.read(bArr, i2, i3);
                if (read > 0) {
                    c.this.b.write(bArr, i2, read);
                }
                return read;
            }
        }, new OutputStream() {
            public void close() {
                c.this.c.close();
                outputStream.close();
            }

            public void flush() {
                c.this.c.flush();
                outputStream.flush();
            }

            public void write(int i2) {
                c.this.c.write(i2);
                outputStream.write(i2);
            }

            public void write(byte[] bArr) {
                c.this.c.write(bArr);
                outputStream.write(bArr);
            }

            public void write(byte[] bArr, int i2, int i3) {
                c.this.c.write(bArr, i2, i3);
                outputStream.write(bArr, i2, i3);
            }
        }, connectionParameters);
    }
}
