package com.google.gson.internal;

import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.l;
import com.google.gson.stream.c;
import java.io.Writer;

/* compiled from: Streams */
public final class k {
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001c, code lost:
        throw new com.google.gson.JsonIOException((java.lang.Throwable) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001d, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0023, code lost:
        throw new com.google.gson.JsonSyntaxException((java.lang.Throwable) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002a, code lost:
        return com.google.gson.m.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0030, code lost:
        throw new com.google.gson.JsonSyntaxException((java.lang.Throwable) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000d, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000f, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0015, code lost:
        throw new com.google.gson.JsonSyntaxException((java.lang.Throwable) r2);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0016 A[ExcHandler: IOException (r2v5 'e' java.io.IOException A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x001d A[ExcHandler: MalformedJsonException (r2v4 'e' com.google.gson.stream.MalformedJsonException A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x000f A[ExcHandler: NumberFormatException (r2v6 'e' java.lang.NumberFormatException A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.gson.l a(com.google.gson.stream.a r2) {
        /*
            r2.Z()     // Catch:{ EOFException -> 0x0024, MalformedJsonException -> 0x001d, IOException -> 0x0016, NumberFormatException -> 0x000f }
            r0 = 0
            com.google.gson.s<com.google.gson.l> r1 = com.google.gson.internal.bind.TypeAdapters.X     // Catch:{ EOFException -> 0x000d, MalformedJsonException -> 0x001d, IOException -> 0x0016, NumberFormatException -> 0x000f }
            java.lang.Object r2 = r1.b(r2)     // Catch:{ EOFException -> 0x000d, MalformedJsonException -> 0x001d, IOException -> 0x0016, NumberFormatException -> 0x000f }
            com.google.gson.l r2 = (com.google.gson.l) r2     // Catch:{ EOFException -> 0x000d, MalformedJsonException -> 0x001d, IOException -> 0x0016, NumberFormatException -> 0x000f }
            return r2
        L_0x000d:
            r2 = move-exception
            goto L_0x0026
        L_0x000f:
            r2 = move-exception
            com.google.gson.JsonSyntaxException r0 = new com.google.gson.JsonSyntaxException
            r0.<init>((java.lang.Throwable) r2)
            throw r0
        L_0x0016:
            r2 = move-exception
            com.google.gson.JsonIOException r0 = new com.google.gson.JsonIOException
            r0.<init>((java.lang.Throwable) r2)
            throw r0
        L_0x001d:
            r2 = move-exception
            com.google.gson.JsonSyntaxException r0 = new com.google.gson.JsonSyntaxException
            r0.<init>((java.lang.Throwable) r2)
            throw r0
        L_0x0024:
            r2 = move-exception
            r0 = 1
        L_0x0026:
            if (r0 == 0) goto L_0x002b
            com.google.gson.m r2 = com.google.gson.m.a
            return r2
        L_0x002b:
            com.google.gson.JsonSyntaxException r0 = new com.google.gson.JsonSyntaxException
            r0.<init>((java.lang.Throwable) r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.k.a(com.google.gson.stream.a):com.google.gson.l");
    }

    public static void b(l lVar, c cVar) {
        TypeAdapters.X.d(cVar, lVar);
    }

    public static Writer c(Appendable appendable) {
        return appendable instanceof Writer ? (Writer) appendable : new a(appendable);
    }

    /* compiled from: Streams */
    private static final class a extends Writer {

        /* renamed from: g  reason: collision with root package name */
        private final Appendable f4326g;

        /* renamed from: h  reason: collision with root package name */
        private final C0119a f4327h = new C0119a();

        /* renamed from: com.google.gson.internal.k$a$a  reason: collision with other inner class name */
        /* compiled from: Streams */
        static class C0119a implements CharSequence {

            /* renamed from: g  reason: collision with root package name */
            char[] f4328g;

            C0119a() {
            }

            public char charAt(int i2) {
                return this.f4328g[i2];
            }

            public int length() {
                return this.f4328g.length;
            }

            public CharSequence subSequence(int i2, int i3) {
                return new String(this.f4328g, i2, i3 - i2);
            }
        }

        a(Appendable appendable) {
            this.f4326g = appendable;
        }

        public void close() {
        }

        public void flush() {
        }

        public void write(char[] cArr, int i2, int i3) {
            C0119a aVar = this.f4327h;
            aVar.f4328g = cArr;
            this.f4326g.append(aVar, i2, i3 + i2);
        }

        public void write(int i2) {
            this.f4326g.append((char) i2);
        }
    }
}
