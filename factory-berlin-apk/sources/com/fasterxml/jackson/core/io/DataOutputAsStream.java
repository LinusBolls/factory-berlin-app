package com.fasterxml.jackson.core.io;

import java.io.DataOutput;
import java.io.OutputStream;

public class DataOutputAsStream extends OutputStream {
    protected final DataOutput _output;

    public DataOutputAsStream(DataOutput dataOutput) {
        this._output = dataOutput;
    }

    public void write(int i2) {
        this._output.write(i2);
    }

    public void write(byte[] bArr) {
        this._output.write(bArr, 0, bArr.length);
    }

    public void write(byte[] bArr, int i2, int i3) {
        this._output.write(bArr, i2, i3);
    }
}
