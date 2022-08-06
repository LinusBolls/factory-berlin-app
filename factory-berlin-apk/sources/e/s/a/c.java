package e.s.a;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.util.Log;
import java.io.File;

/* compiled from: SupportSQLiteOpenHelper */
public interface c {

    /* compiled from: SupportSQLiteOpenHelper */
    public static abstract class a {
        public final int a;

        public a(int i2) {
            this.a = i2;
        }

        private void a(String str) {
            if (!str.equalsIgnoreCase(":memory:") && str.trim().length() != 0) {
                Log.w("SupportSQLite", "deleting the database file: " + str);
                try {
                    if (Build.VERSION.SDK_INT >= 16) {
                        SQLiteDatabase.deleteDatabase(new File(str));
                        return;
                    }
                    try {
                        if (!new File(str).delete()) {
                            Log.e("SupportSQLite", "Could not delete the database file " + str);
                        }
                    } catch (Exception e2) {
                        Log.e("SupportSQLite", "error while deleting corrupted database file", e2);
                    }
                } catch (Exception e3) {
                    Log.w("SupportSQLite", "delete failed: ", e3);
                }
            }
        }

        public void b(b bVar) {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0034, code lost:
            if (r0 != null) goto L_0x0036;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0036, code lost:
            r3 = r0.iterator();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x003e, code lost:
            if (r3.hasNext() != false) goto L_0x0040;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0040, code lost:
            a((java.lang.String) r3.next().second);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x004e, code lost:
            a(r3.getPath());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0055, code lost:
            throw r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:7:0x002e, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0030 */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0059  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0071  */
        /* JADX WARNING: Removed duplicated region for block: B:7:0x002e A[ExcHandler: all (r1v3 'th' java.lang.Throwable A[CUSTOM_DECLARE]), PHI: r0 
          PHI: (r0v10 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>) = (r0v3 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>), (r0v4 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>), (r0v4 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>) binds: [B:5:0x0029, B:8:0x0030, B:9:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:5:0x0029] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void c(e.s.a.b r3) {
            /*
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Corruption reported by sqlite on database: "
                r0.append(r1)
                java.lang.String r1 = r3.getPath()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "SupportSQLite"
                android.util.Log.e(r1, r0)
                boolean r0 = r3.isOpen()
                if (r0 != 0) goto L_0x0028
                java.lang.String r3 = r3.getPath()
                r2.a(r3)
                return
            L_0x0028:
                r0 = 0
                java.util.List r0 = r3.getAttachedDbs()     // Catch:{ SQLiteException -> 0x0030, all -> 0x002e }
                goto L_0x0030
            L_0x002e:
                r1 = move-exception
                goto L_0x0034
            L_0x0030:
                r3.close()     // Catch:{ IOException -> 0x0056, all -> 0x002e }
                goto L_0x0057
            L_0x0034:
                if (r0 == 0) goto L_0x004e
                java.util.Iterator r3 = r0.iterator()
            L_0x003a:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L_0x0055
                java.lang.Object r0 = r3.next()
                android.util.Pair r0 = (android.util.Pair) r0
                java.lang.Object r0 = r0.second
                java.lang.String r0 = (java.lang.String) r0
                r2.a(r0)
                goto L_0x003a
            L_0x004e:
                java.lang.String r3 = r3.getPath()
                r2.a(r3)
            L_0x0055:
                throw r1
            L_0x0056:
            L_0x0057:
                if (r0 == 0) goto L_0x0071
                java.util.Iterator r3 = r0.iterator()
            L_0x005d:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L_0x0078
                java.lang.Object r0 = r3.next()
                android.util.Pair r0 = (android.util.Pair) r0
                java.lang.Object r0 = r0.second
                java.lang.String r0 = (java.lang.String) r0
                r2.a(r0)
                goto L_0x005d
            L_0x0071:
                java.lang.String r3 = r3.getPath()
                r2.a(r3)
            L_0x0078:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: e.s.a.c.a.c(e.s.a.b):void");
        }

        public abstract void d(b bVar);

        public abstract void e(b bVar, int i2, int i3);

        public void f(b bVar) {
        }

        public abstract void g(b bVar, int i2, int i3);
    }

    /* compiled from: SupportSQLiteOpenHelper */
    public static class b {
        public final Context a;
        public final String b;
        public final a c;

        /* compiled from: SupportSQLiteOpenHelper */
        public static class a {
            Context a;
            String b;
            a c;

            a(Context context) {
                this.a = context;
            }

            public b a() {
                a aVar = this.c;
                if (aVar != null) {
                    Context context = this.a;
                    if (context != null) {
                        return new b(context, this.b, aVar);
                    }
                    throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
                }
                throw new IllegalArgumentException("Must set a callback to create the configuration.");
            }

            public a b(a aVar) {
                this.c = aVar;
                return this;
            }

            public a c(String str) {
                this.b = str;
                return this;
            }
        }

        b(Context context, String str, a aVar) {
            this.a = context;
            this.b = str;
            this.c = aVar;
        }

        public static a a(Context context) {
            return new a(context);
        }
    }

    /* renamed from: e.s.a.c$c  reason: collision with other inner class name */
    /* compiled from: SupportSQLiteOpenHelper */
    public interface C0584c {
        c a(b bVar);
    }

    void a(boolean z);

    b b();

    String c();

    void close();
}
