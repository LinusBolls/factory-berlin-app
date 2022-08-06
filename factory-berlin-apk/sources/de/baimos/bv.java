package de.baimos;

import java.util.Arrays;

class bv {
    static int a(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    static String a(Object obj) {
        return obj == null ? "null" : obj.toString();
    }

    static boolean a(Object obj, Object obj2) {
        return (obj == null || obj2 == null) ? obj == obj2 : (!(obj instanceof Object[]) || !(obj2 instanceof Object[])) ? (!(obj instanceof boolean[]) || !(obj2 instanceof boolean[])) ? (!(obj instanceof byte[]) || !(obj2 instanceof byte[])) ? (!(obj instanceof char[]) || !(obj2 instanceof char[])) ? (!(obj instanceof double[]) || !(obj2 instanceof double[])) ? (!(obj instanceof float[]) || !(obj2 instanceof float[])) ? (!(obj instanceof int[]) || !(obj2 instanceof int[])) ? (!(obj instanceof long[]) || !(obj2 instanceof long[])) ? (!(obj instanceof short[]) || !(obj2 instanceof short[])) ? obj.equals(obj2) : Arrays.equals((short[]) obj, (short[]) obj2) : Arrays.equals((long[]) obj, (long[]) obj2) : Arrays.equals((int[]) obj, (int[]) obj2) : Arrays.equals((float[]) obj, (float[]) obj2) : Arrays.equals((double[]) obj, (double[]) obj2) : Arrays.equals((char[]) obj, (char[]) obj2) : Arrays.equals((byte[]) obj, (byte[]) obj2) : Arrays.equals((boolean[]) obj, (boolean[]) obj2) : Arrays.deepEquals((Object[]) obj, (Object[]) obj2);
    }

    static boolean b(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }
}
