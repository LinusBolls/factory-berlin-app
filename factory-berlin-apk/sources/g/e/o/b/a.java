package g.e.o.b;

import n.a.a;

/* compiled from: DebugTree */
public class a extends a.b {
    private final String c;

    /* renamed from: d  reason: collision with root package name */
    private final ThreadLocal<StringBuilder> f10215d = new C0727a(this);

    /* renamed from: g.e.o.b.a$a  reason: collision with other inner class name */
    /* compiled from: DebugTree */
    class C0727a extends ThreadLocal<StringBuilder> {
        C0727a(a aVar) {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public StringBuilder initialValue() {
            return new StringBuilder();
        }
    }

    public a(String str) {
        this.c = str;
    }

    /* access modifiers changed from: protected */
    public void l(int i2, String str, String str2, Throwable th) {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        if (stackTrace.length > 5) {
            StackTraceElement stackTraceElement = stackTrace[5];
            StringBuilder sb = this.f10215d.get();
            sb.setLength(0);
            sb.append("[(");
            sb.append(stackTraceElement.getFileName());
            sb.append(':');
            sb.append(stackTraceElement.getLineNumber());
            sb.append(").");
            sb.append(stackTraceElement.getMethodName());
            sb.append("()] ");
            sb.append(str2);
            str2 = sb.toString();
        }
        super.l(i2, this.c, str2, th);
    }
}
