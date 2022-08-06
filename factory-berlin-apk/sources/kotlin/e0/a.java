package kotlin.e0;

import kotlin.h0.b;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.v;

/* compiled from: JvmClassMapping.kt */
public final class a {
    public static final <T> Class<T> a(b<T> bVar) {
        k.e(bVar, "$this$java");
        Class<?> b = ((d) bVar).b();
        if (b != null) {
            return b;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.Class<T>");
    }

    public static final <T> Class<T> b(b<T> bVar) {
        k.e(bVar, "$this$javaObjectType");
        Class b = ((d) bVar).b();
        if (b.isPrimitive()) {
            String name = b.getName();
            if (name != null) {
                switch (name.hashCode()) {
                    case -1325958191:
                        if (name.equals("double")) {
                            b = Double.class;
                            break;
                        }
                        break;
                    case 104431:
                        if (name.equals("int")) {
                            b = Integer.class;
                            break;
                        }
                        break;
                    case 3039496:
                        if (name.equals("byte")) {
                            b = Byte.class;
                            break;
                        }
                        break;
                    case 3052374:
                        if (name.equals("char")) {
                            b = Character.class;
                            break;
                        }
                        break;
                    case 3327612:
                        if (name.equals("long")) {
                            b = Long.class;
                            break;
                        }
                        break;
                    case 3625364:
                        if (name.equals("void")) {
                            b = Void.class;
                            break;
                        }
                        break;
                    case 64711720:
                        if (name.equals("boolean")) {
                            b = Boolean.class;
                            break;
                        }
                        break;
                    case 97526364:
                        if (name.equals("float")) {
                            b = Float.class;
                            break;
                        }
                        break;
                    case 109413500:
                        if (name.equals("short")) {
                            b = Short.class;
                            break;
                        }
                        break;
                }
            }
            if (b != null) {
                return b;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.Class<T>");
        } else if (b != null) {
            return b;
        } else {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.Class<T>");
        }
    }

    public static final <T> b<T> c(Class<T> cls) {
        k.e(cls, "$this$kotlin");
        return v.b(cls);
    }
}
