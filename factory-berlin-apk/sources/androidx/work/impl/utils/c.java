package androidx.work.impl.utils;

import android.content.Context;
import android.content.SharedPreferences;

/* compiled from: IdGenerator */
public class c {
    private final Context a;
    private SharedPreferences b;
    private boolean c;

    public c(Context context) {
        this.a = context;
    }

    private void a() {
        if (!this.c) {
            this.b = this.a.getSharedPreferences("androidx.work.util.id", 0);
            this.c = true;
        }
    }

    private int c(String str) {
        int i2 = 0;
        int i3 = this.b.getInt(str, 0);
        if (i3 != Integer.MAX_VALUE) {
            i2 = i3 + 1;
        }
        e(str, i2);
        return i3;
    }

    private void e(String str, int i2) {
        this.b.edit().putInt(str, i2).apply();
    }

    public int b() {
        int c2;
        synchronized (c.class) {
            a();
            c2 = c("next_alarm_manager_id");
        }
        return c2;
    }

    public int d(int i2, int i3) {
        synchronized (c.class) {
            a();
            int c2 = c("next_job_scheduler_id");
            if (c2 >= i2) {
                if (c2 <= i3) {
                    i2 = c2;
                }
            }
            e("next_job_scheduler_id", i2 + 1);
        }
        return i2;
    }
}
