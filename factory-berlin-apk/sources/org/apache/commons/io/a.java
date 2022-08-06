package org.apache.commons.io;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* compiled from: Charsets */
public class a {
    static {
        Charset charset = StandardCharsets.ISO_8859_1;
        Charset charset2 = StandardCharsets.US_ASCII;
        Charset charset3 = StandardCharsets.UTF_16;
        Charset charset4 = StandardCharsets.UTF_16BE;
        Charset charset5 = StandardCharsets.UTF_16LE;
        Charset charset6 = StandardCharsets.UTF_8;
    }

    public static Charset a(Charset charset) {
        return charset == null ? Charset.defaultCharset() : charset;
    }
}
