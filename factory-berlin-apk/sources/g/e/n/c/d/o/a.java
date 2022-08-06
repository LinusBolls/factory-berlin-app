package g.e.n.c.d.o;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Arrays;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.x;

/* compiled from: BleCalibrationImpl.kt */
public final class a implements g.e.n.c.d.a {
    public static final C0695a c = new C0695a((DefaultConstructorMarker) null);
    private float a;
    private final SharedPreferences b;

    /* renamed from: g.e.n.c.d.o.a$a  reason: collision with other inner class name */
    /* compiled from: BleCalibrationImpl.kt */
    public static final class C0695a {
        private C0695a() {
        }

        public final g.e.n.c.d.a a(Context context) {
            k.e(context, "context");
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.sensorberg.ble.scanner", 0);
            k.d(sharedPreferences, "context.getSharedPrefere…ES, Context.MODE_PRIVATE)");
            return new a(sharedPreferences, (DefaultConstructorMarker) null);
        }

        public /* synthetic */ C0695a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private a(SharedPreferences sharedPreferences) {
        this.b = sharedPreferences;
        this.a = -65.0f;
        this.a = sharedPreferences.getFloat("calibration.gateway_max_rssi_float", -65.0f);
    }

    private final void e(float f2) {
        StringBuilder sb = new StringBuilder();
        sb.append("Base threshold calibrated to ");
        x xVar = x.a;
        String format = String.format("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(f2)}, 1));
        k.d(format, "java.lang.String.format(format, *args)");
        sb.append(format);
        n.a.a.j(sb.toString(), new Object[0]);
        this.b.edit().putFloat("calibration.gateway_max_rssi_float", f2).apply();
        this.a = f2;
    }

    public float a() {
        return -65.0f;
    }

    public float b() {
        return this.a;
    }

    public float c() {
        float max = Math.max(this.a - 1.0f, -65.0f);
        e(max);
        return max;
    }

    public void d(int i2) {
        float f2 = (float) i2;
        float f3 = this.a;
        if (f2 > f3) {
            e(Math.min(f3 - ((f3 - f2) / ((float) 3)), -20.0f));
        }
    }

    public /* synthetic */ a(SharedPreferences sharedPreferences, DefaultConstructorMarker defaultConstructorMarker) {
        this(sharedPreferences);
    }
}
