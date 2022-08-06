package com.google.firebase.crashlytics.d.r;

/* compiled from: MiddleOutFallbackStrategy */
public class a implements d {
    private final int a;
    private final d[] b;
    private final b c;

    public a(int i2, d... dVarArr) {
        this.a = i2;
        this.b = dVarArr;
        this.c = new b(i2);
    }

    public StackTraceElement[] a(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= this.a) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (d dVar : this.b) {
            if (stackTraceElementArr2.length <= this.a) {
                break;
            }
            stackTraceElementArr2 = dVar.a(stackTraceElementArr);
        }
        return stackTraceElementArr2.length > this.a ? this.c.a(stackTraceElementArr2) : stackTraceElementArr2;
    }
}
