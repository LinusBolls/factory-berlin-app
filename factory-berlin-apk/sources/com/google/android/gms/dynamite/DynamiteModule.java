package com.google.android.gms.dynamite;

import android.content.Context;
import android.database.Cursor;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.f;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.common.util.g;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public final class DynamiteModule {
    private static Boolean b = null;
    private static f c = null;

    /* renamed from: d  reason: collision with root package name */
    private static h f2181d = null;

    /* renamed from: e  reason: collision with root package name */
    private static String f2182e = null;

    /* renamed from: f  reason: collision with root package name */
    private static int f2183f = -1;

    /* renamed from: g  reason: collision with root package name */
    private static final ThreadLocal<b> f2184g = new ThreadLocal<>();

    /* renamed from: h  reason: collision with root package name */
    private static final a.C0067a f2185h = new a();

    /* renamed from: i  reason: collision with root package name */
    public static final a f2186i = new b();

    /* renamed from: j  reason: collision with root package name */
    public static final a f2187j = new c();

    /* renamed from: k  reason: collision with root package name */
    public static final a f2188k = new d();
    private final Context a;

    @DynamiteApi
    public static class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    public static class LoadingException extends Exception {
        private LoadingException(String str) {
            super(str);
        }

        private LoadingException(String str, Throwable th) {
            super(str, th);
        }

        /* synthetic */ LoadingException(String str, a aVar) {
            this(str);
        }

        /* synthetic */ LoadingException(String str, Throwable th, a aVar) {
            this(str, th);
        }
    }

    public interface a {

        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$a$a  reason: collision with other inner class name */
        public interface C0067a {
            int a(Context context, String str);

            int b(Context context, String str, boolean z);
        }

        public static class b {
            public int a = 0;
            public int b = 0;
            public int c = 0;
        }

        b a(Context context, String str, C0067a aVar);
    }

    private static class b {
        public Cursor a;

        private b() {
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    private static class c implements a.C0067a {
        private final int a;

        public c(int i2, int i3) {
            this.a = i2;
        }

        public final int a(Context context, String str) {
            return this.a;
        }

        public final int b(Context context, String str, boolean z) {
            return 0;
        }
    }

    private DynamiteModule(Context context) {
        r.k(context);
        this.a = context;
    }

    public static int a(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 61);
            sb.append("com.google.android.gms.dynamite.descriptors.");
            sb.append(str);
            sb.append(".ModuleDescriptor");
            Class<?> loadClass = classLoader.loadClass(sb.toString());
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (declaredField.get((Object) null).equals(str)) {
                return declaredField2.getInt((Object) null);
            }
            String valueOf = String.valueOf(declaredField.get((Object) null));
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 51 + String.valueOf(str).length());
            sb2.append("Module descriptor id '");
            sb2.append(valueOf);
            sb2.append("' didn't match expected id '");
            sb2.append(str);
            sb2.append("'");
            Log.e("DynamiteModule", sb2.toString());
            return 0;
        } catch (ClassNotFoundException unused) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 45);
            sb3.append("Local module descriptor class for ");
            sb3.append(str);
            sb3.append(" not found.");
            Log.w("DynamiteModule", sb3.toString());
            return 0;
        } catch (Exception e2) {
            String valueOf2 = String.valueOf(e2.getMessage());
            Log.e("DynamiteModule", valueOf2.length() != 0 ? "Failed to load module descriptor class: ".concat(valueOf2) : new String("Failed to load module descriptor class: "));
            return 0;
        }
    }

    public static int b(Context context, String str) {
        return e(context, str, false);
    }

    public static DynamiteModule d(Context context, a aVar, String str) {
        a.b a2;
        b bVar = f2184g.get();
        b bVar2 = new b((a) null);
        f2184g.set(bVar2);
        try {
            a2 = aVar.a(context, str, f2185h);
            int i2 = a2.a;
            int i3 = a2.b;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 68 + String.valueOf(str).length());
            sb.append("Considering local module ");
            sb.append(str);
            sb.append(":");
            sb.append(i2);
            sb.append(" and remote module ");
            sb.append(str);
            sb.append(":");
            sb.append(i3);
            Log.i("DynamiteModule", sb.toString());
            if (a2.c == 0 || ((a2.c == -1 && a2.a == 0) || (a2.c == 1 && a2.b == 0))) {
                int i4 = a2.a;
                int i5 = a2.b;
                StringBuilder sb2 = new StringBuilder(91);
                sb2.append("No acceptable module found. Local version is ");
                sb2.append(i4);
                sb2.append(" and remote version is ");
                sb2.append(i5);
                sb2.append(".");
                throw new LoadingException(sb2.toString(), (a) null);
            } else if (a2.c == -1) {
                DynamiteModule l2 = l(context, str);
                Cursor cursor = bVar2.a;
                if (cursor != null) {
                    cursor.close();
                }
                f2184g.set(bVar);
                return l2;
            } else if (a2.c == 1) {
                DynamiteModule f2 = f(context, str, a2.b);
                Cursor cursor2 = bVar2.a;
                if (cursor2 != null) {
                    cursor2.close();
                }
                f2184g.set(bVar);
                return f2;
            } else {
                int i6 = a2.c;
                StringBuilder sb3 = new StringBuilder(47);
                sb3.append("VersionPolicy returned invalid code:");
                sb3.append(i6);
                throw new LoadingException(sb3.toString(), (a) null);
            }
        } catch (LoadingException e2) {
            String valueOf = String.valueOf(e2.getMessage());
            Log.w("DynamiteModule", valueOf.length() != 0 ? "Failed to load remote module: ".concat(valueOf) : new String("Failed to load remote module: "));
            if (a2.a == 0 || aVar.a(context, str, new c(a2.a, 0)).c != -1) {
                throw new LoadingException("Remote load failed. No local fallback found.", e2, (a) null);
            }
            DynamiteModule l3 = l(context, str);
            Cursor cursor3 = bVar2.a;
            if (cursor3 != null) {
                cursor3.close();
            }
            f2184g.set(bVar);
            return l3;
        } catch (Throwable th) {
            Cursor cursor4 = bVar2.a;
            if (cursor4 != null) {
                cursor4.close();
            }
            f2184g.set(bVar);
            throw th;
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:23:0x0052=Splitter:B:23:0x0052, B:18:0x0035=Splitter:B:18:0x0035, B:35:0x007b=Splitter:B:35:0x007b} */
    public static int e(android.content.Context r8, java.lang.String r9, boolean r10) {
        /*
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r0 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r0)     // Catch:{ all -> 0x00f0 }
            java.lang.Boolean r1 = b     // Catch:{ all -> 0x00ed }
            if (r1 != 0) goto L_0x00ba
            android.content.Context r1 = r8.getApplicationContext()     // Catch:{ ClassNotFoundException -> 0x0091, IllegalAccessException -> 0x008f, NoSuchFieldException -> 0x008d }
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0091, IllegalAccessException -> 0x008f, NoSuchFieldException -> 0x008d }
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader> r2 = com.google.android.gms.dynamite.DynamiteModule.DynamiteLoaderClassLoader.class
            java.lang.String r2 = r2.getName()     // Catch:{ ClassNotFoundException -> 0x0091, IllegalAccessException -> 0x008f, NoSuchFieldException -> 0x008d }
            java.lang.Class r1 = r1.loadClass(r2)     // Catch:{ ClassNotFoundException -> 0x0091, IllegalAccessException -> 0x008f, NoSuchFieldException -> 0x008d }
            java.lang.String r2 = "sClassLoader"
            java.lang.reflect.Field r2 = r1.getDeclaredField(r2)     // Catch:{ ClassNotFoundException -> 0x0091, IllegalAccessException -> 0x008f, NoSuchFieldException -> 0x008d }
            monitor-enter(r1)     // Catch:{ ClassNotFoundException -> 0x0091, IllegalAccessException -> 0x008f, NoSuchFieldException -> 0x008d }
            r3 = 0
            java.lang.Object r4 = r2.get(r3)     // Catch:{ all -> 0x008a }
            java.lang.ClassLoader r4 = (java.lang.ClassLoader) r4     // Catch:{ all -> 0x008a }
            if (r4 == 0) goto L_0x0038
            java.lang.ClassLoader r2 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x008a }
            if (r4 != r2) goto L_0x0032
            java.lang.Boolean r2 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x008a }
            goto L_0x0087
        L_0x0032:
            g(r4)     // Catch:{ LoadingException -> 0x0035 }
        L_0x0035:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x008a }
            goto L_0x0087
        L_0x0038:
            java.lang.String r4 = "com.google.android.gms"
            android.content.Context r5 = r8.getApplicationContext()     // Catch:{ all -> 0x008a }
            java.lang.String r5 = r5.getPackageName()     // Catch:{ all -> 0x008a }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x008a }
            if (r4 == 0) goto L_0x0052
            java.lang.ClassLoader r4 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x008a }
            r2.set(r3, r4)     // Catch:{ all -> 0x008a }
            java.lang.Boolean r2 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x008a }
            goto L_0x0087
        L_0x0052:
            int r4 = k(r8, r9, r10)     // Catch:{ LoadingException -> 0x007e }
            java.lang.String r5 = f2182e     // Catch:{ LoadingException -> 0x007e }
            if (r5 == 0) goto L_0x007b
            java.lang.String r5 = f2182e     // Catch:{ LoadingException -> 0x007e }
            boolean r5 = r5.isEmpty()     // Catch:{ LoadingException -> 0x007e }
            if (r5 == 0) goto L_0x0063
            goto L_0x007b
        L_0x0063:
            com.google.android.gms.dynamite.e r5 = new com.google.android.gms.dynamite.e     // Catch:{ LoadingException -> 0x007e }
            java.lang.String r6 = f2182e     // Catch:{ LoadingException -> 0x007e }
            java.lang.ClassLoader r7 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ LoadingException -> 0x007e }
            r5.<init>(r6, r7)     // Catch:{ LoadingException -> 0x007e }
            g(r5)     // Catch:{ LoadingException -> 0x007e }
            r2.set(r3, r5)     // Catch:{ LoadingException -> 0x007e }
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch:{ LoadingException -> 0x007e }
            b = r5     // Catch:{ LoadingException -> 0x007e }
            monitor-exit(r1)     // Catch:{ all -> 0x008a }
            monitor-exit(r0)     // Catch:{ all -> 0x00ed }
            return r4
        L_0x007b:
            monitor-exit(r1)     // Catch:{ all -> 0x008a }
            monitor-exit(r0)     // Catch:{ all -> 0x00ed }
            return r4
        L_0x007e:
            java.lang.ClassLoader r4 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x008a }
            r2.set(r3, r4)     // Catch:{ all -> 0x008a }
            java.lang.Boolean r2 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x008a }
        L_0x0087:
            monitor-exit(r1)     // Catch:{ all -> 0x008a }
            r1 = r2
            goto L_0x00b8
        L_0x008a:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x008a }
            throw r2     // Catch:{ ClassNotFoundException -> 0x0091, IllegalAccessException -> 0x008f, NoSuchFieldException -> 0x008d }
        L_0x008d:
            r1 = move-exception
            goto L_0x0092
        L_0x008f:
            r1 = move-exception
            goto L_0x0092
        L_0x0091:
            r1 = move-exception
        L_0x0092:
            java.lang.String r2 = "DynamiteModule"
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x00ed }
            java.lang.String r3 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x00ed }
            int r3 = r3.length()     // Catch:{ all -> 0x00ed }
            int r3 = r3 + 30
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ed }
            r4.<init>(r3)     // Catch:{ all -> 0x00ed }
            java.lang.String r3 = "Failed to load module via V2: "
            r4.append(r3)     // Catch:{ all -> 0x00ed }
            r4.append(r1)     // Catch:{ all -> 0x00ed }
            java.lang.String r1 = r4.toString()     // Catch:{ all -> 0x00ed }
            android.util.Log.w(r2, r1)     // Catch:{ all -> 0x00ed }
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x00ed }
        L_0x00b8:
            b = r1     // Catch:{ all -> 0x00ed }
        L_0x00ba:
            monitor-exit(r0)     // Catch:{ all -> 0x00ed }
            boolean r0 = r1.booleanValue()     // Catch:{ all -> 0x00f0 }
            if (r0 == 0) goto L_0x00e8
            int r8 = k(r8, r9, r10)     // Catch:{ LoadingException -> 0x00c6 }
            return r8
        L_0x00c6:
            r9 = move-exception
            java.lang.String r10 = "DynamiteModule"
            java.lang.String r0 = "Failed to retrieve remote module version: "
            java.lang.String r9 = r9.getMessage()     // Catch:{ all -> 0x00f0 }
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x00f0 }
            int r1 = r9.length()     // Catch:{ all -> 0x00f0 }
            if (r1 == 0) goto L_0x00de
            java.lang.String r9 = r0.concat(r9)     // Catch:{ all -> 0x00f0 }
            goto L_0x00e3
        L_0x00de:
            java.lang.String r9 = new java.lang.String     // Catch:{ all -> 0x00f0 }
            r9.<init>(r0)     // Catch:{ all -> 0x00f0 }
        L_0x00e3:
            android.util.Log.w(r10, r9)     // Catch:{ all -> 0x00f0 }
            r8 = 0
            return r8
        L_0x00e8:
            int r8 = i(r8, r9, r10)     // Catch:{ all -> 0x00f0 }
            return r8
        L_0x00ed:
            r9 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00ed }
            throw r9     // Catch:{ all -> 0x00f0 }
        L_0x00f0:
            r9 = move-exception
            com.google.android.gms.common.util.g.a(r8, r9)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.e(android.content.Context, java.lang.String, boolean):int");
    }

    private static DynamiteModule f(Context context, String str, int i2) {
        Boolean bool;
        com.google.android.gms.dynamic.a aVar;
        try {
            synchronized (DynamiteModule.class) {
                bool = b;
            }
            if (bool == null) {
                throw new LoadingException("Failed to determine which loading route to use.", (a) null);
            } else if (bool.booleanValue()) {
                return j(context, str, i2);
            } else {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51);
                sb.append("Selected remote version of ");
                sb.append(str);
                sb.append(", version >= ");
                sb.append(i2);
                Log.i("DynamiteModule", sb.toString());
                f m2 = m(context);
                if (m2 != null) {
                    if (m2.s0() >= 2) {
                        aVar = m2.V(com.google.android.gms.dynamic.b.S0(context), str, i2);
                    } else {
                        Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                        aVar = m2.n0(com.google.android.gms.dynamic.b.S0(context), str, i2);
                    }
                    if (com.google.android.gms.dynamic.b.o(aVar) != null) {
                        return new DynamiteModule((Context) com.google.android.gms.dynamic.b.o(aVar));
                    }
                    throw new LoadingException("Failed to load remote module.", (a) null);
                }
                throw new LoadingException("Failed to create IDynamiteLoader.", (a) null);
            }
        } catch (RemoteException e2) {
            throw new LoadingException("Failed to load remote module.", e2, (a) null);
        } catch (LoadingException e3) {
            throw e3;
        } catch (Throwable th) {
            g.a(context, th);
            throw new LoadingException("Failed to load remote module.", th, (a) null);
        }
    }

    private static void g(ClassLoader classLoader) {
        h hVar;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                hVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                if (queryLocalInterface instanceof h) {
                    hVar = (h) queryLocalInterface;
                } else {
                    hVar = new i(iBinder);
                }
            }
            f2181d = hVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e2) {
            throw new LoadingException("Failed to instantiate dynamite loader", e2, (a) null);
        }
    }

    private static Boolean h() {
        Boolean valueOf;
        synchronized (DynamiteModule.class) {
            valueOf = Boolean.valueOf(f2183f >= 2);
        }
        return valueOf;
    }

    private static int i(Context context, String str, boolean z) {
        f m2 = m(context);
        if (m2 == null) {
            return 0;
        }
        try {
            if (m2.s0() >= 2) {
                return m2.p(com.google.android.gms.dynamic.b.S0(context), str, z);
            }
            Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
            return m2.L(com.google.android.gms.dynamic.b.S0(context), str, z);
        } catch (RemoteException e2) {
            String valueOf = String.valueOf(e2.getMessage());
            Log.w("DynamiteModule", valueOf.length() != 0 ? "Failed to retrieve remote module version: ".concat(valueOf) : new String("Failed to retrieve remote module version: "));
            return 0;
        }
    }

    private static DynamiteModule j(Context context, String str, int i2) {
        h hVar;
        com.google.android.gms.dynamic.a aVar;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51);
        sb.append("Selected remote version of ");
        sb.append(str);
        sb.append(", version >= ");
        sb.append(i2);
        Log.i("DynamiteModule", sb.toString());
        synchronized (DynamiteModule.class) {
            hVar = f2181d;
        }
        if (hVar != null) {
            b bVar = f2184g.get();
            if (bVar == null || bVar.a == null) {
                throw new LoadingException("No result cursor", (a) null);
            }
            Context applicationContext = context.getApplicationContext();
            Cursor cursor = bVar.a;
            com.google.android.gms.dynamic.b.S0(null);
            if (h().booleanValue()) {
                Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                aVar = hVar.I(com.google.android.gms.dynamic.b.S0(applicationContext), str, i2, com.google.android.gms.dynamic.b.S0(cursor));
            } else {
                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                aVar = hVar.H(com.google.android.gms.dynamic.b.S0(applicationContext), str, i2, com.google.android.gms.dynamic.b.S0(cursor));
            }
            Context context2 = (Context) com.google.android.gms.dynamic.b.o(aVar);
            if (context2 != null) {
                return new DynamiteModule(context2);
            }
            throw new LoadingException("Failed to get module context", (a) null);
        }
        throw new LoadingException("DynamiteLoaderV2 was not cached.", (a) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int k(android.content.Context r8, java.lang.String r9, boolean r10) {
        /*
            r0 = 0
            android.content.ContentResolver r1 = r8.getContentResolver()     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            if (r10 == 0) goto L_0x000a
            java.lang.String r8 = "api_force_staging"
            goto L_0x000c
        L_0x000a:
            java.lang.String r8 = "api"
        L_0x000c:
            int r10 = r8.length()     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            int r10 = r10 + 42
            java.lang.String r2 = java.lang.String.valueOf(r9)     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            int r2 = r2.length()     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            int r10 = r10 + r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            r2.<init>(r10)     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            java.lang.String r10 = "content://com.google.android.gms.chimera/"
            r2.append(r10)     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            r2.append(r8)     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            java.lang.String r8 = "/"
            r2.append(r8)     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            r2.append(r9)     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            java.lang.String r8 = r2.toString()     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            android.net.Uri r2 = android.net.Uri.parse(r8)     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            android.database.Cursor r8 = r1.query(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            if (r8 == 0) goto L_0x0083
            boolean r9 = r8.moveToFirst()     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
            if (r9 == 0) goto L_0x0083
            r9 = 0
            int r9 = r8.getInt(r9)     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
            if (r9 <= 0) goto L_0x007c
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r10 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r10)     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
            r1 = 2
            java.lang.String r1 = r8.getString(r1)     // Catch:{ all -> 0x0079 }
            f2182e = r1     // Catch:{ all -> 0x0079 }
            java.lang.String r1 = "loaderVersion"
            int r1 = r8.getColumnIndex(r1)     // Catch:{ all -> 0x0079 }
            if (r1 < 0) goto L_0x0067
            int r1 = r8.getInt(r1)     // Catch:{ all -> 0x0079 }
            f2183f = r1     // Catch:{ all -> 0x0079 }
        L_0x0067:
            monitor-exit(r10)     // Catch:{ all -> 0x0079 }
            java.lang.ThreadLocal<com.google.android.gms.dynamite.DynamiteModule$b> r10 = f2184g     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
            java.lang.Object r10 = r10.get()     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
            com.google.android.gms.dynamite.DynamiteModule$b r10 = (com.google.android.gms.dynamite.DynamiteModule.b) r10     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
            if (r10 == 0) goto L_0x007c
            android.database.Cursor r1 = r10.a     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
            if (r1 != 0) goto L_0x007c
            r10.a = r8     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
            goto L_0x007d
        L_0x0079:
            r9 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0079 }
            throw r9     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
        L_0x007c:
            r0 = r8
        L_0x007d:
            if (r0 == 0) goto L_0x0082
            r0.close()
        L_0x0082:
            return r9
        L_0x0083:
            java.lang.String r9 = "DynamiteModule"
            java.lang.String r10 = "Failed to retrieve remote module version."
            android.util.Log.w(r9, r10)     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r9 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
            java.lang.String r10 = "Failed to connect to dynamite module ContentResolver."
            r9.<init>((java.lang.String) r10, (com.google.android.gms.dynamite.a) r0)     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
            throw r9     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
        L_0x0092:
            r9 = move-exception
            r0 = r8
            r8 = r9
            goto L_0x00ae
        L_0x0096:
            r9 = move-exception
            r7 = r9
            r9 = r8
            r8 = r7
            goto L_0x009f
        L_0x009b:
            r8 = move-exception
            goto L_0x00ae
        L_0x009d:
            r8 = move-exception
            r9 = r0
        L_0x009f:
            boolean r10 = r8 instanceof com.google.android.gms.dynamite.DynamiteModule.LoadingException     // Catch:{ all -> 0x00ac }
            if (r10 == 0) goto L_0x00a4
            throw r8     // Catch:{ all -> 0x00ac }
        L_0x00a4:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r10 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ all -> 0x00ac }
            java.lang.String r1 = "V2 version check failed"
            r10.<init>(r1, r8, r0)     // Catch:{ all -> 0x00ac }
            throw r10     // Catch:{ all -> 0x00ac }
        L_0x00ac:
            r8 = move-exception
            r0 = r9
        L_0x00ae:
            if (r0 == 0) goto L_0x00b3
            r0.close()
        L_0x00b3:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.k(android.content.Context, java.lang.String, boolean):int");
    }

    private static DynamiteModule l(Context context, String str) {
        String valueOf = String.valueOf(str);
        Log.i("DynamiteModule", valueOf.length() != 0 ? "Selected local version of ".concat(valueOf) : new String("Selected local version of "));
        return new DynamiteModule(context.getApplicationContext());
    }

    private static f m(Context context) {
        f fVar;
        synchronized (DynamiteModule.class) {
            if (c != null) {
                f fVar2 = c;
                return fVar2;
            } else if (f.f().g(context) != 0) {
                return null;
            } else {
                try {
                    IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                    if (iBinder == null) {
                        fVar = null;
                    } else {
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                        if (queryLocalInterface instanceof f) {
                            fVar = (f) queryLocalInterface;
                        } else {
                            fVar = new g(iBinder);
                        }
                    }
                    if (fVar != null) {
                        c = fVar;
                        return fVar;
                    }
                } catch (Exception e2) {
                    String valueOf = String.valueOf(e2.getMessage());
                    Log.e("DynamiteModule", valueOf.length() != 0 ? "Failed to load IDynamiteLoader from GmsCore: ".concat(valueOf) : new String("Failed to load IDynamiteLoader from GmsCore: "));
                }
            }
        }
        return null;
    }

    public final IBinder c(String str) {
        try {
            return (IBinder) this.a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e2) {
            String valueOf = String.valueOf(str);
            throw new LoadingException(valueOf.length() != 0 ? "Failed to instantiate module class: ".concat(valueOf) : new String("Failed to instantiate module class: "), e2, (a) null);
        }
    }
}
