package de.baimos;

import java.io.InputStream;
import java.io.OutputStream;

public class ag {
    private final int a;
    private final int b;

    public ag(int i2, int i3) {
        this.a = i2;
        this.b = i3;
    }

    public static ag a(InputStream inputStream) {
        return new ag(cq.b(inputStream), cq.b(inputStream));
    }

    public int a() {
        return this.a;
    }

    public void a(OutputStream outputStream) {
        cq.b(outputStream, this.a);
        cq.b(outputStream, this.b);
    }

    public int b() {
        return this.b;
    }

    public String toString() {
        return "ExtensionDescriptor{type=" + this.a + ", size=" + this.b + '}';
    }
}
