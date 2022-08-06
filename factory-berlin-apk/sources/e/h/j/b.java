package e.h.j;

import android.util.Log;
import java.io.Writer;

@Deprecated
/* compiled from: LogWriter */
public class b extends Writer {

    /* renamed from: g  reason: collision with root package name */
    private final String f8669g;

    /* renamed from: h  reason: collision with root package name */
    private StringBuilder f8670h = new StringBuilder(128);

    public b(String str) {
        this.f8669g = str;
    }

    private void a() {
        if (this.f8670h.length() > 0) {
            Log.d(this.f8669g, this.f8670h.toString());
            StringBuilder sb = this.f8670h;
            sb.delete(0, sb.length());
        }
    }

    public void close() {
        a();
    }

    public void flush() {
        a();
    }

    public void write(char[] cArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            char c = cArr[i2 + i4];
            if (c == 10) {
                a();
            } else {
                this.f8670h.append(c);
            }
        }
    }
}
