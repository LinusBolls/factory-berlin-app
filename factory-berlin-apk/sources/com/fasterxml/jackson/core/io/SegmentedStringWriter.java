package com.fasterxml.jackson.core.io;

import com.fasterxml.jackson.core.util.BufferRecycler;
import com.fasterxml.jackson.core.util.TextBuffer;
import java.io.Writer;

public final class SegmentedStringWriter extends Writer {
    private final TextBuffer _buffer;

    public SegmentedStringWriter(BufferRecycler bufferRecycler) {
        this._buffer = new TextBuffer(bufferRecycler);
    }

    public void close() {
    }

    public void flush() {
    }

    public String getAndClear() {
        String contentsAsString = this._buffer.contentsAsString();
        this._buffer.releaseBuffers();
        return contentsAsString;
    }

    public void write(char[] cArr) {
        this._buffer.append(cArr, 0, cArr.length);
    }

    public void write(char[] cArr, int i2, int i3) {
        this._buffer.append(cArr, i2, i3);
    }

    public void write(int i2) {
        this._buffer.append((char) i2);
    }

    public Writer append(char c) {
        write((int) c);
        return this;
    }

    public void write(String str) {
        this._buffer.append(str, 0, str.length());
    }

    public Writer append(CharSequence charSequence) {
        String charSequence2 = charSequence.toString();
        this._buffer.append(charSequence2, 0, charSequence2.length());
        return this;
    }

    public void write(String str, int i2, int i3) {
        this._buffer.append(str, i2, i3);
    }

    public Writer append(CharSequence charSequence, int i2, int i3) {
        String charSequence2 = charSequence.subSequence(i2, i3).toString();
        this._buffer.append(charSequence2, 0, charSequence2.length());
        return this;
    }
}
