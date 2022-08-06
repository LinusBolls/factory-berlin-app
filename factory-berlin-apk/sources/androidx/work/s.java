package androidx.work;

import android.content.Context;

/* compiled from: WorkerFactory */
public abstract class s {
    private static final String a = i.f("WorkerFactory");

    /* compiled from: WorkerFactory */
    static class a extends s {
        a() {
        }

        public ListenableWorker a(Context context, String str, WorkerParameters workerParameters) {
            return null;
        }
    }

    public static s c() {
        return new a();
    }

    public abstract ListenableWorker a(Context context, String str, WorkerParameters workerParameters);

    public final ListenableWorker b(Context context, String str, WorkerParameters workerParameters) {
        ListenableWorker a2 = a(context, str, workerParameters);
        if (a2 != null) {
            return a2;
        }
        try {
            try {
                return (ListenableWorker) Class.forName(str).asSubclass(ListenableWorker.class).getDeclaredConstructor(new Class[]{Context.class, WorkerParameters.class}).newInstance(new Object[]{context, workerParameters});
            } catch (Exception e2) {
                i c = i.c();
                String str2 = a;
                c.b(str2, "Could not instantiate " + str, e2);
                return null;
            }
        } catch (ClassNotFoundException unused) {
            i c2 = i.c();
            String str3 = a;
            c2.b(str3, "Class not found: " + str, new Throwable[0]);
            return null;
        }
    }
}
