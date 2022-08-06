package l;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* compiled from: BufferedSource.kt */
public interface h extends b0, ReadableByteChannel {
    long A0();

    boolean C(long j2);

    String C0(Charset charset);

    InputStream D0();

    int E0(s sVar);

    String N();

    long P(i iVar);

    boolean Q();

    byte[] S(long j2);

    long c0(i iVar);

    f d();

    long e0();

    String h0(long j2);

    long j0(z zVar);

    byte readByte();

    int readInt();

    short readShort();

    void s0(long j2);

    i w(long j2);

    void x(long j2);

    boolean y0(long j2, i iVar);
}
