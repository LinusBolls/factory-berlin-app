package kotlin.d0;

import kotlin.jvm.internal.k;

/* compiled from: PlatformImplementations.kt */
public final class b {
    public static final a a;

    static {
        a aVar;
        Object newInstance;
        Object newInstance2;
        Class<a> cls = a.class;
        int a2 = a();
        if (a2 >= 65544) {
            try {
                newInstance2 = Class.forName("kotlin.internal.jdk8.JDK8PlatformImplementations").newInstance();
                k.d(newInstance2, "Class.forName(\"kotlin.in…entations\").newInstance()");
                if (newInstance2 != null) {
                    aVar = (a) newInstance2;
                    a = aVar;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
            } catch (ClassCastException e2) {
                ClassLoader classLoader = newInstance2.getClass().getClassLoader();
                ClassLoader classLoader2 = cls.getClassLoader();
                Throwable initCause = new ClassCastException("Instance classloader: " + classLoader + ", base type classloader: " + classLoader2).initCause(e2);
                k.d(initCause, "ClassCastException(\"Inst…baseTypeCL\").initCause(e)");
                throw initCause;
            } catch (ClassNotFoundException unused) {
                try {
                    Object newInstance3 = Class.forName("kotlin.internal.JRE8PlatformImplementations").newInstance();
                    k.d(newInstance3, "Class.forName(\"kotlin.in…entations\").newInstance()");
                    if (newInstance3 != null) {
                        try {
                            aVar = (a) newInstance3;
                        } catch (ClassCastException e3) {
                            ClassLoader classLoader3 = newInstance3.getClass().getClassLoader();
                            ClassLoader classLoader4 = cls.getClassLoader();
                            Throwable initCause2 = new ClassCastException("Instance classloader: " + classLoader3 + ", base type classloader: " + classLoader4).initCause(e3);
                            k.d(initCause2, "ClassCastException(\"Inst…baseTypeCL\").initCause(e)");
                            throw initCause2;
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                    }
                } catch (ClassNotFoundException unused2) {
                }
            }
        }
        if (a2 >= 65543) {
            try {
                newInstance = Class.forName("kotlin.d0.d.a").newInstance();
                k.d(newInstance, "Class.forName(\"kotlin.in…entations\").newInstance()");
                if (newInstance != null) {
                    aVar = (a) newInstance;
                    a = aVar;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
            } catch (ClassCastException e4) {
                ClassLoader classLoader5 = newInstance.getClass().getClassLoader();
                ClassLoader classLoader6 = cls.getClassLoader();
                Throwable initCause3 = new ClassCastException("Instance classloader: " + classLoader5 + ", base type classloader: " + classLoader6).initCause(e4);
                k.d(initCause3, "ClassCastException(\"Inst…baseTypeCL\").initCause(e)");
                throw initCause3;
            } catch (ClassNotFoundException unused3) {
                try {
                    Object newInstance4 = Class.forName("kotlin.internal.JRE7PlatformImplementations").newInstance();
                    k.d(newInstance4, "Class.forName(\"kotlin.in…entations\").newInstance()");
                    if (newInstance4 != null) {
                        try {
                            aVar = (a) newInstance4;
                        } catch (ClassCastException e5) {
                            ClassLoader classLoader7 = newInstance4.getClass().getClassLoader();
                            ClassLoader classLoader8 = cls.getClassLoader();
                            Throwable initCause4 = new ClassCastException("Instance classloader: " + classLoader7 + ", base type classloader: " + classLoader8).initCause(e5);
                            k.d(initCause4, "ClassCastException(\"Inst…baseTypeCL\").initCause(e)");
                            throw initCause4;
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                    }
                } catch (ClassNotFoundException unused4) {
                }
            }
        }
        aVar = new a();
        a = aVar;
    }

    private static final int a() {
        String property = System.getProperty("java.specification.version");
        if (property == null) {
            return 65542;
        }
        int S = q.S(property, '.', 0, false, 6, (Object) null);
        if (S < 0) {
            try {
                return Integer.parseInt(property) * 65536;
            } catch (NumberFormatException unused) {
                return 65542;
            }
        } else {
            int i2 = S + 1;
            int S2 = q.S(property, '.', i2, false, 4, (Object) null);
            if (S2 < 0) {
                S2 = property.length();
            }
            if (property != null) {
                String substring = property.substring(0, S);
                k.d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                if (property != null) {
                    String substring2 = property.substring(i2, S2);
                    k.d(substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    try {
                        return (Integer.parseInt(substring) * 65536) + Integer.parseInt(substring2);
                    } catch (NumberFormatException unused2) {
                        return 65542;
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
        }
    }
}
