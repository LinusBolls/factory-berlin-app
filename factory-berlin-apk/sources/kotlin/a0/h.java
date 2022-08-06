package kotlin.a0;

import java.util.Arrays;
import kotlin.jvm.internal.k;
import kotlin.p;
import kotlin.r;
import kotlin.t;
import kotlin.w;

/* compiled from: Arrays.kt */
class h extends g {
    public static <T> boolean b(T[] tArr, T[] tArr2) {
        if (tArr == tArr2) {
            return true;
        }
        if (tArr == null || tArr2 == null || tArr.length != tArr2.length) {
            return false;
        }
        int length = tArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            T t = tArr[i2];
            T t2 = tArr2[i2];
            if (t != t2) {
                if (t == null || t2 == null) {
                    return false;
                }
                if (!(t instanceof Object[]) || !(t2 instanceof Object[])) {
                    if (!(t instanceof byte[]) || !(t2 instanceof byte[])) {
                        if (!(t instanceof short[]) || !(t2 instanceof short[])) {
                            if (!(t instanceof int[]) || !(t2 instanceof int[])) {
                                if (!(t instanceof long[]) || !(t2 instanceof long[])) {
                                    if (!(t instanceof float[]) || !(t2 instanceof float[])) {
                                        if (!(t instanceof double[]) || !(t2 instanceof double[])) {
                                            if (!(t instanceof char[]) || !(t2 instanceof char[])) {
                                                if (!(t instanceof boolean[]) || !(t2 instanceof boolean[])) {
                                                    if (!(t instanceof p) || !(t2 instanceof p)) {
                                                        if (!(t instanceof w) || !(t2 instanceof w)) {
                                                            if (!(t instanceof r) || !(t2 instanceof r)) {
                                                                if (!(t instanceof t) || !(t2 instanceof t)) {
                                                                    if (!k.a(t, t2)) {
                                                                        return false;
                                                                    }
                                                                } else if (!c.d(((t) t).q(), ((t) t2).q())) {
                                                                    return false;
                                                                }
                                                            } else if (!c.b(((r) t).q(), ((r) t2).q())) {
                                                                return false;
                                                            }
                                                        } else if (!c.a(((w) t).q(), ((w) t2).q())) {
                                                            return false;
                                                        }
                                                    } else if (!c.c(((p) t).q(), ((p) t2).q())) {
                                                        return false;
                                                    }
                                                } else if (!Arrays.equals((boolean[]) t, (boolean[]) t2)) {
                                                    return false;
                                                }
                                            } else if (!Arrays.equals((char[]) t, (char[]) t2)) {
                                                return false;
                                            }
                                        } else if (!Arrays.equals((double[]) t, (double[]) t2)) {
                                            return false;
                                        }
                                    } else if (!Arrays.equals((float[]) t, (float[]) t2)) {
                                        return false;
                                    }
                                } else if (!Arrays.equals((long[]) t, (long[]) t2)) {
                                    return false;
                                }
                            } else if (!Arrays.equals((int[]) t, (int[]) t2)) {
                                return false;
                            }
                        } else if (!Arrays.equals((short[]) t, (short[]) t2)) {
                            return false;
                        }
                    } else if (!Arrays.equals((byte[]) t, (byte[]) t2)) {
                        return false;
                    }
                } else if (!b((Object[]) t, (Object[]) t2)) {
                    return false;
                }
            }
        }
        return true;
    }
}
