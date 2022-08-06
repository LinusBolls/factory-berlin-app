package de.baimos;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.security.Signature;
import java.security.SignatureException;

public class bb extends FilterOutputStream {
    private Signature a;

    public bb(OutputStream outputStream, Signature signature) {
        super(outputStream);
        this.a = signature;
    }

    public void write(int i2) {
        write(new byte[]{(byte) i2});
    }

    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    public void write(byte[] bArr, int i2, int i3) {
        this.out.write(bArr, i2, i3);
        try {
            this.a.update(bArr, i2, i3);
        } catch (SignatureException e2) {
            throw new IOException(e2);
        }
    }
}
