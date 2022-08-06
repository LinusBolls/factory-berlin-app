package com.fasterxml.jackson.core;

public interface SerializableString {
    int appendQuotedUTF8(byte[] bArr, int i2);

    char[] asQuotedChars();

    byte[] asQuotedUTF8();

    byte[] asUnquotedUTF8();

    String getValue();
}
