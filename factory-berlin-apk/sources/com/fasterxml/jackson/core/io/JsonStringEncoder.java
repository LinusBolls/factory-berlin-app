package com.fasterxml.jackson.core.io;

import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.core.util.TextBuffer;

public final class JsonStringEncoder {
    private static final byte[] HB = CharTypes.copyHexBytes();
    private static final char[] HC = CharTypes.copyHexChars();
    protected ByteArrayBuilder _bytes;
    protected final char[] _qbuf;
    protected TextBuffer _text;

    public JsonStringEncoder() {
        char[] cArr = new char[6];
        this._qbuf = cArr;
        cArr[0] = '\\';
        cArr[2] = '0';
        cArr[3] = '0';
    }

    private int _appendByte(int i2, int i3, ByteArrayBuilder byteArrayBuilder, int i4) {
        byteArrayBuilder.setCurrentSegmentLength(i4);
        byteArrayBuilder.append(92);
        if (i3 < 0) {
            byteArrayBuilder.append(117);
            if (i2 > 255) {
                int i5 = i2 >> 8;
                byteArrayBuilder.append(HB[i5 >> 4]);
                byteArrayBuilder.append(HB[i5 & 15]);
                i2 &= 255;
            } else {
                byteArrayBuilder.append(48);
                byteArrayBuilder.append(48);
            }
            byteArrayBuilder.append(HB[i2 >> 4]);
            byteArrayBuilder.append(HB[i2 & 15]);
        } else {
            byteArrayBuilder.append((byte) i3);
        }
        return byteArrayBuilder.getCurrentSegmentLength();
    }

    private int _appendNamed(int i2, char[] cArr) {
        cArr[1] = (char) i2;
        return 2;
    }

    private int _appendNumeric(int i2, char[] cArr) {
        cArr[1] = 'u';
        char[] cArr2 = HC;
        cArr[4] = cArr2[i2 >> 4];
        cArr[5] = cArr2[i2 & 15];
        return 6;
    }

    private static int _convert(int i2, int i3) {
        if (i3 >= 56320 && i3 <= 57343) {
            return ((i2 - 55296) << 10) + 65536 + (i3 - 56320);
        }
        throw new IllegalArgumentException("Broken surrogate pair: first char 0x" + Integer.toHexString(i2) + ", second 0x" + Integer.toHexString(i3) + "; illegal combination");
    }

    private static void _illegal(int i2) {
        throw new IllegalArgumentException(UTF8Writer.illegalSurrogateDesc(i2));
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00e0 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] encodeAsUTF8(java.lang.String r12) {
        /*
            r11 = this;
            com.fasterxml.jackson.core.util.ByteArrayBuilder r0 = r11._bytes
            r1 = 0
            if (r0 != 0) goto L_0x000c
            com.fasterxml.jackson.core.util.ByteArrayBuilder r0 = new com.fasterxml.jackson.core.util.ByteArrayBuilder
            r0.<init>((com.fasterxml.jackson.core.util.BufferRecycler) r1)
            r11._bytes = r0
        L_0x000c:
            int r2 = r12.length()
            byte[] r3 = r0.resetAndGetFirstSegment()
            int r4 = r3.length
            r5 = 0
            r6 = 0
            r7 = 0
        L_0x0018:
            if (r6 >= r2) goto L_0x00ec
            int r8 = r6 + 1
            char r6 = r12.charAt(r6)
        L_0x0020:
            r9 = 127(0x7f, float:1.78E-43)
            if (r6 > r9) goto L_0x0040
            if (r7 < r4) goto L_0x002c
            byte[] r3 = r0.finishCurrentSegment()
            int r4 = r3.length
            r7 = 0
        L_0x002c:
            int r9 = r7 + 1
            byte r6 = (byte) r6
            r3[r7] = r6
            if (r8 < r2) goto L_0x0036
            r7 = r9
            goto L_0x00ec
        L_0x0036:
            int r6 = r8 + 1
            char r7 = r12.charAt(r8)
            r8 = r6
            r6 = r7
            r7 = r9
            goto L_0x0020
        L_0x0040:
            if (r7 < r4) goto L_0x0048
            byte[] r3 = r0.finishCurrentSegment()
            int r4 = r3.length
            r7 = 0
        L_0x0048:
            r9 = 2048(0x800, float:2.87E-42)
            if (r6 >= r9) goto L_0x0059
            int r9 = r7 + 1
            int r10 = r6 >> 6
            r10 = r10 | 192(0xc0, float:2.69E-43)
            byte r10 = (byte) r10
            r3[r7] = r10
        L_0x0055:
            r7 = r6
            r6 = r8
            goto L_0x00d8
        L_0x0059:
            r9 = 55296(0xd800, float:7.7486E-41)
            if (r6 < r9) goto L_0x00b9
            r9 = 57343(0xdfff, float:8.0355E-41)
            if (r6 <= r9) goto L_0x0064
            goto L_0x00b9
        L_0x0064:
            r9 = 56319(0xdbff, float:7.892E-41)
            if (r6 > r9) goto L_0x00b5
            if (r8 >= r2) goto L_0x00b1
            int r9 = r8 + 1
            char r8 = r12.charAt(r8)
            int r6 = _convert(r6, r8)
            r8 = 1114111(0x10ffff, float:1.561202E-39)
            if (r6 > r8) goto L_0x00ad
            int r8 = r7 + 1
            int r10 = r6 >> 18
            r10 = r10 | 240(0xf0, float:3.36E-43)
            byte r10 = (byte) r10
            r3[r7] = r10
            if (r8 < r4) goto L_0x008b
            byte[] r3 = r0.finishCurrentSegment()
            int r4 = r3.length
            r8 = 0
        L_0x008b:
            int r7 = r8 + 1
            int r10 = r6 >> 12
            r10 = r10 & 63
            r10 = r10 | 128(0x80, float:1.794E-43)
            byte r10 = (byte) r10
            r3[r8] = r10
            if (r7 < r4) goto L_0x009e
            byte[] r3 = r0.finishCurrentSegment()
            int r4 = r3.length
            r7 = 0
        L_0x009e:
            int r8 = r7 + 1
            int r10 = r6 >> 6
            r10 = r10 & 63
            r10 = r10 | 128(0x80, float:1.794E-43)
            byte r10 = (byte) r10
            r3[r7] = r10
            r7 = r6
            r6 = r9
            r9 = r8
            goto L_0x00d8
        L_0x00ad:
            _illegal(r6)
            throw r1
        L_0x00b1:
            _illegal(r6)
            throw r1
        L_0x00b5:
            _illegal(r6)
            throw r1
        L_0x00b9:
            int r9 = r7 + 1
            int r10 = r6 >> 12
            r10 = r10 | 224(0xe0, float:3.14E-43)
            byte r10 = (byte) r10
            r3[r7] = r10
            if (r9 < r4) goto L_0x00ca
            byte[] r3 = r0.finishCurrentSegment()
            int r4 = r3.length
            r9 = 0
        L_0x00ca:
            int r7 = r9 + 1
            int r10 = r6 >> 6
            r10 = r10 & 63
            r10 = r10 | 128(0x80, float:1.794E-43)
            byte r10 = (byte) r10
            r3[r9] = r10
            r9 = r7
            goto L_0x0055
        L_0x00d8:
            if (r9 < r4) goto L_0x00e0
            byte[] r3 = r0.finishCurrentSegment()
            int r4 = r3.length
            r9 = 0
        L_0x00e0:
            int r8 = r9 + 1
            r7 = r7 & 63
            r7 = r7 | 128(0x80, float:1.794E-43)
            byte r7 = (byte) r7
            r3[r9] = r7
            r7 = r8
            goto L_0x0018
        L_0x00ec:
            com.fasterxml.jackson.core.util.ByteArrayBuilder r12 = r11._bytes
            byte[] r12 = r12.completeAndCoalesce(r7)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.io.JsonStringEncoder.encodeAsUTF8(java.lang.String):byte[]");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0030, code lost:
        if (r9 >= 0) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0032, code lost:
        r6 = _appendNumeric(r6, r11._qbuf);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0039, code lost:
        r6 = _appendNamed(r9, r11._qbuf);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003f, code lost:
        r9 = r7 + r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0042, code lost:
        if (r9 <= r1.length) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0044, code lost:
        r9 = r1.length - r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0046, code lost:
        if (r9 <= 0) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0048, code lost:
        java.lang.System.arraycopy(r11._qbuf, 0, r1, r7, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004d, code lost:
        r1 = r0.finishCurrentSegment();
        r6 = r6 - r9;
        java.lang.System.arraycopy(r11._qbuf, r9, r1, 0, r6);
        r7 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0059, code lost:
        java.lang.System.arraycopy(r11._qbuf, 0, r1, r7, r6);
        r7 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0028, code lost:
        r8 = r6 + 1;
        r6 = r12.charAt(r6);
        r9 = r2[r6];
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public char[] quoteAsString(java.lang.String r12) {
        /*
            r11 = this;
            com.fasterxml.jackson.core.util.TextBuffer r0 = r11._text
            if (r0 != 0) goto L_0x000c
            com.fasterxml.jackson.core.util.TextBuffer r0 = new com.fasterxml.jackson.core.util.TextBuffer
            r1 = 0
            r0.<init>(r1)
            r11._text = r0
        L_0x000c:
            char[] r1 = r0.emptyAndGetCurrentSegment()
            int[] r2 = com.fasterxml.jackson.core.io.CharTypes.get7BitOutputEscapes()
            int r3 = r2.length
            int r4 = r12.length()
            r5 = 0
            r6 = 0
            r7 = 0
        L_0x001c:
            if (r6 >= r4) goto L_0x0075
        L_0x001e:
            char r8 = r12.charAt(r6)
            if (r8 >= r3) goto L_0x0061
            r9 = r2[r8]
            if (r9 == 0) goto L_0x0061
            int r8 = r6 + 1
            char r6 = r12.charAt(r6)
            r9 = r2[r6]
            if (r9 >= 0) goto L_0x0039
            char[] r9 = r11._qbuf
            int r6 = r11._appendNumeric(r6, r9)
            goto L_0x003f
        L_0x0039:
            char[] r6 = r11._qbuf
            int r6 = r11._appendNamed(r9, r6)
        L_0x003f:
            int r9 = r7 + r6
            int r10 = r1.length
            if (r9 <= r10) goto L_0x0059
            int r9 = r1.length
            int r9 = r9 - r7
            if (r9 <= 0) goto L_0x004d
            char[] r10 = r11._qbuf
            java.lang.System.arraycopy(r10, r5, r1, r7, r9)
        L_0x004d:
            char[] r1 = r0.finishCurrentSegment()
            int r6 = r6 - r9
            char[] r7 = r11._qbuf
            java.lang.System.arraycopy(r7, r9, r1, r5, r6)
            r7 = r6
            goto L_0x005f
        L_0x0059:
            char[] r10 = r11._qbuf
            java.lang.System.arraycopy(r10, r5, r1, r7, r6)
            r7 = r9
        L_0x005f:
            r6 = r8
            goto L_0x001c
        L_0x0061:
            int r9 = r1.length
            if (r7 < r9) goto L_0x0069
            char[] r1 = r0.finishCurrentSegment()
            r7 = 0
        L_0x0069:
            int r9 = r7 + 1
            r1[r7] = r8
            int r6 = r6 + 1
            if (r6 < r4) goto L_0x0073
            r7 = r9
            goto L_0x0075
        L_0x0073:
            r7 = r9
            goto L_0x001e
        L_0x0075:
            r0.setCurrentLength(r7)
            char[] r12 = r0.contentsAsArray()
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.io.JsonStringEncoder.quoteAsString(java.lang.String):char[]");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0041, code lost:
        if (r6 < r3.length) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0043, code lost:
        r3 = r0.finishCurrentSegment();
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0048, code lost:
        r8 = r5 + 1;
        r5 = r12.charAt(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004e, code lost:
        if (r5 > 127) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0050, code lost:
        r6 = _appendByte(r5, r7[r5], r0, r6);
        r3 = r0.getCurrentSegment();
        r5 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005e, code lost:
        if (r5 > 2047) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0060, code lost:
        r7 = r6 + 1;
        r3[r6] = (byte) ((r5 >> 6) | 192);
        r5 = (r5 & '?') | 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006d, code lost:
        r6 = r5;
        r5 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0074, code lost:
        if (r5 < 55296) goto L_0x00d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0079, code lost:
        if (r5 <= 57343) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x007f, code lost:
        if (r5 > 56319) goto L_0x00d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0081, code lost:
        if (r8 >= r2) goto L_0x00cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0083, code lost:
        r7 = r8 + 1;
        r5 = _convert(r5, r12.charAt(r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0090, code lost:
        if (r5 > 1114111) goto L_0x00c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0092, code lost:
        r8 = r6 + 1;
        r3[r6] = (byte) ((r5 >> 18) | 240);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x009c, code lost:
        if (r8 < r3.length) goto L_0x00a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x009e, code lost:
        r3 = r0.finishCurrentSegment();
        r8 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a3, code lost:
        r6 = r8 + 1;
        r3[r8] = (byte) (((r5 >> 12) & 63) | 128);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00af, code lost:
        if (r6 < r3.length) goto L_0x00b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00b1, code lost:
        r3 = r0.finishCurrentSegment();
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00b6, code lost:
        r8 = r6 + 1;
        r3[r6] = (byte) (((r5 >> 6) & 63) | 128);
        r6 = (r5 & '?') | 128;
        r5 = r7;
        r7 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00c9, code lost:
        _illegal(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00cc, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00cd, code lost:
        _illegal(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00d0, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00d1, code lost:
        _illegal(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00d4, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00d5, code lost:
        r7 = r6 + 1;
        r3[r6] = (byte) ((r5 >> 12) | 224);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00df, code lost:
        if (r7 < r3.length) goto L_0x00e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00e1, code lost:
        r3 = r0.finishCurrentSegment();
        r7 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00e6, code lost:
        r3[r7] = (byte) (((r5 >> 6) & 63) | 128);
        r5 = (r5 & '?') | 128;
        r7 = r7 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00f9, code lost:
        if (r7 < r3.length) goto L_0x0100;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00fb, code lost:
        r3 = r0.finishCurrentSegment();
        r7 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0100, code lost:
        r3[r7] = (byte) r6;
        r6 = r7 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] quoteAsUTF8(java.lang.String r12) {
        /*
            r11 = this;
            com.fasterxml.jackson.core.util.ByteArrayBuilder r0 = r11._bytes
            r1 = 0
            if (r0 != 0) goto L_0x000c
            com.fasterxml.jackson.core.util.ByteArrayBuilder r0 = new com.fasterxml.jackson.core.util.ByteArrayBuilder
            r0.<init>((com.fasterxml.jackson.core.util.BufferRecycler) r1)
            r11._bytes = r0
        L_0x000c:
            int r2 = r12.length()
            byte[] r3 = r0.resetAndGetFirstSegment()
            r4 = 0
            r5 = 0
            r6 = 0
        L_0x0017:
            if (r5 >= r2) goto L_0x0108
            int[] r7 = com.fasterxml.jackson.core.io.CharTypes.get7BitOutputEscapes()
        L_0x001d:
            char r8 = r12.charAt(r5)
            r9 = 127(0x7f, float:1.78E-43)
            if (r8 > r9) goto L_0x0040
            r10 = r7[r8]
            if (r10 == 0) goto L_0x002a
            goto L_0x0040
        L_0x002a:
            int r9 = r3.length
            if (r6 < r9) goto L_0x0032
            byte[] r3 = r0.finishCurrentSegment()
            r6 = 0
        L_0x0032:
            int r9 = r6 + 1
            byte r8 = (byte) r8
            r3[r6] = r8
            int r5 = r5 + 1
            if (r5 < r2) goto L_0x003e
            r6 = r9
            goto L_0x0108
        L_0x003e:
            r6 = r9
            goto L_0x001d
        L_0x0040:
            int r8 = r3.length
            if (r6 < r8) goto L_0x0048
            byte[] r3 = r0.finishCurrentSegment()
            r6 = 0
        L_0x0048:
            int r8 = r5 + 1
            char r5 = r12.charAt(r5)
            if (r5 > r9) goto L_0x005c
            r3 = r7[r5]
            int r6 = r11._appendByte(r5, r3, r0, r6)
            byte[] r3 = r0.getCurrentSegment()
            r5 = r8
            goto L_0x0017
        L_0x005c:
            r7 = 2047(0x7ff, float:2.868E-42)
            if (r5 > r7) goto L_0x0071
            int r7 = r6 + 1
            int r9 = r5 >> 6
            r9 = r9 | 192(0xc0, float:2.69E-43)
            byte r9 = (byte) r9
            r3[r6] = r9
            r5 = r5 & 63
            r5 = r5 | 128(0x80, float:1.794E-43)
        L_0x006d:
            r6 = r5
            r5 = r8
            goto L_0x00f8
        L_0x0071:
            r7 = 55296(0xd800, float:7.7486E-41)
            if (r5 < r7) goto L_0x00d5
            r7 = 57343(0xdfff, float:8.0355E-41)
            if (r5 <= r7) goto L_0x007c
            goto L_0x00d5
        L_0x007c:
            r7 = 56319(0xdbff, float:7.892E-41)
            if (r5 > r7) goto L_0x00d1
            if (r8 >= r2) goto L_0x00cd
            int r7 = r8 + 1
            char r8 = r12.charAt(r8)
            int r5 = _convert(r5, r8)
            r8 = 1114111(0x10ffff, float:1.561202E-39)
            if (r5 > r8) goto L_0x00c9
            int r8 = r6 + 1
            int r9 = r5 >> 18
            r9 = r9 | 240(0xf0, float:3.36E-43)
            byte r9 = (byte) r9
            r3[r6] = r9
            int r6 = r3.length
            if (r8 < r6) goto L_0x00a3
            byte[] r3 = r0.finishCurrentSegment()
            r8 = 0
        L_0x00a3:
            int r6 = r8 + 1
            int r9 = r5 >> 12
            r9 = r9 & 63
            r9 = r9 | 128(0x80, float:1.794E-43)
            byte r9 = (byte) r9
            r3[r8] = r9
            int r8 = r3.length
            if (r6 < r8) goto L_0x00b6
            byte[] r3 = r0.finishCurrentSegment()
            r6 = 0
        L_0x00b6:
            int r8 = r6 + 1
            int r9 = r5 >> 6
            r9 = r9 & 63
            r9 = r9 | 128(0x80, float:1.794E-43)
            byte r9 = (byte) r9
            r3[r6] = r9
            r5 = r5 & 63
            r5 = r5 | 128(0x80, float:1.794E-43)
            r6 = r5
            r5 = r7
            r7 = r8
            goto L_0x00f8
        L_0x00c9:
            _illegal(r5)
            throw r1
        L_0x00cd:
            _illegal(r5)
            throw r1
        L_0x00d1:
            _illegal(r5)
            throw r1
        L_0x00d5:
            int r7 = r6 + 1
            int r9 = r5 >> 12
            r9 = r9 | 224(0xe0, float:3.14E-43)
            byte r9 = (byte) r9
            r3[r6] = r9
            int r6 = r3.length
            if (r7 < r6) goto L_0x00e6
            byte[] r3 = r0.finishCurrentSegment()
            r7 = 0
        L_0x00e6:
            int r6 = r7 + 1
            int r9 = r5 >> 6
            r9 = r9 & 63
            r9 = r9 | 128(0x80, float:1.794E-43)
            byte r9 = (byte) r9
            r3[r7] = r9
            r5 = r5 & 63
            r5 = r5 | 128(0x80, float:1.794E-43)
            r7 = r6
            goto L_0x006d
        L_0x00f8:
            int r8 = r3.length
            if (r7 < r8) goto L_0x0100
            byte[] r3 = r0.finishCurrentSegment()
            r7 = 0
        L_0x0100:
            int r8 = r7 + 1
            byte r6 = (byte) r6
            r3[r7] = r6
            r6 = r8
            goto L_0x0017
        L_0x0108:
            com.fasterxml.jackson.core.util.ByteArrayBuilder r12 = r11._bytes
            byte[] r12 = r12.completeAndCoalesce(r6)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.io.JsonStringEncoder.quoteAsUTF8(java.lang.String):byte[]");
    }
}
