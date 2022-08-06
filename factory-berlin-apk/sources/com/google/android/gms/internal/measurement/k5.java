package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.k5;
import com.google.android.gms.internal.measurement.m5;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
public abstract class k5<MessageType extends k5<MessageType, BuilderType>, BuilderType extends m5<MessageType, BuilderType>> implements j8 {
    protected int zza = 0;

    protected static <T> void a(Iterable<T> iterable, List<? super T> list) {
        b7.d(iterable);
        if (iterable instanceof p7) {
            List<?> c = ((p7) iterable).c();
            p7 p7Var = (p7) list;
            int size = list.size();
            for (Object next : c) {
                if (next == null) {
                    StringBuilder sb = new StringBuilder(37);
                    sb.append("Element at index ");
                    sb.append(p7Var.size() - size);
                    sb.append(" is null.");
                    String sb2 = sb.toString();
                    for (int size2 = p7Var.size() - 1; size2 >= size; size2--) {
                        p7Var.remove(size2);
                    }
                    throw new NullPointerException(sb2);
                } else if (next instanceof t5) {
                    p7Var.p((t5) next);
                } else {
                    p7Var.add((String) next);
                }
            }
        } else if (iterable instanceof v8) {
            list.addAll((Collection) iterable);
        } else {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size3 = list.size();
            for (T next2 : iterable) {
                if (next2 == null) {
                    StringBuilder sb3 = new StringBuilder(37);
                    sb3.append("Element at index ");
                    sb3.append(list.size() - size3);
                    sb3.append(" is null.");
                    String sb4 = sb3.toString();
                    for (int size4 = list.size() - 1; size4 >= size3; size4--) {
                        list.remove(size4);
                    }
                    throw new NullPointerException(sb4);
                }
                list.add(next2);
            }
        }
    }

    public final t5 c() {
        try {
            a6 q = t5.q(d());
            f(q.b());
            return q.a();
        } catch (IOException e2) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 62 + "ByteString".length());
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ");
            sb.append("ByteString");
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e2);
        }
    }

    public final byte[] i() {
        try {
            byte[] bArr = new byte[d()];
            zzhf f2 = zzhf.f(bArr);
            f(f2);
            f2.N();
            return bArr;
        } catch (IOException e2) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 62 + "byte array".length());
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ");
            sb.append("byte array");
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e2);
        }
    }

    /* access modifiers changed from: package-private */
    public int j() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public void k(int i2) {
        throw new UnsupportedOperationException();
    }
}
