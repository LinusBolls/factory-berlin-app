package org.apache.commons.io;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.Charset;

/* compiled from: IOUtils */
public class b {
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001c, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0021, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r2.addSuppressed(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0025, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0028, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x002d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x002e, code lost:
        r1.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0031, code lost:
        throw r2;
     */
    static {
        /*
            char r0 = java.io.File.separatorChar
            org.apache.commons.io.c.a r0 = new org.apache.commons.io.c.a
            r1 = 4
            r0.<init>(r1)
            java.io.PrintWriter r1 = new java.io.PrintWriter     // Catch:{ all -> 0x0026 }
            r1.<init>(r0)     // Catch:{ all -> 0x0026 }
            r1.println()     // Catch:{ all -> 0x001a }
            r0.toString()     // Catch:{ all -> 0x001a }
            r1.close()     // Catch:{ all -> 0x0026 }
            r0.close()
            return
        L_0x001a:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x001c }
        L_0x001c:
            r3 = move-exception
            r1.close()     // Catch:{ all -> 0x0021 }
            goto L_0x0025
        L_0x0021:
            r1 = move-exception
            r2.addSuppressed(r1)     // Catch:{ all -> 0x0026 }
        L_0x0025:
            throw r3     // Catch:{ all -> 0x0026 }
        L_0x0026:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0028 }
        L_0x0028:
            r2 = move-exception
            r0.close()     // Catch:{ all -> 0x002d }
            goto L_0x0031
        L_0x002d:
            r0 = move-exception
            r1.addSuppressed(r0)
        L_0x0031:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.io.b.<clinit>():void");
    }

    public static int a(Reader reader, Writer writer) {
        long d2 = d(reader, writer);
        if (d2 > 2147483647L) {
            return -1;
        }
        return (int) d2;
    }

    @Deprecated
    public static void b(InputStream inputStream, Writer writer) {
        c(inputStream, writer, Charset.defaultCharset());
    }

    public static void c(InputStream inputStream, Writer writer, Charset charset) {
        a(new InputStreamReader(inputStream, a.a(charset)), writer);
    }

    public static long d(Reader reader, Writer writer) {
        return e(reader, writer, new char[4096]);
    }

    public static long e(Reader reader, Writer writer, char[] cArr) {
        long j2 = 0;
        while (true) {
            int read = reader.read(cArr);
            if (-1 == read) {
                return j2;
            }
            writer.write(cArr, 0, read);
            j2 += (long) read;
        }
    }
}
