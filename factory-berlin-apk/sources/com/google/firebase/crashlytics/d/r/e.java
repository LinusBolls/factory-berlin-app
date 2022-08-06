package com.google.firebase.crashlytics.d.r;

/* compiled from: TrimmedThrowableData */
public class e {
    public final String a;
    public final String b;
    public final StackTraceElement[] c;

    /* renamed from: d  reason: collision with root package name */
    public final e f4149d;

    public e(Throwable th, d dVar) {
        this.a = th.getLocalizedMessage();
        this.b = th.getClass().getName();
        this.c = dVar.a(th.getStackTrace());
        Throwable cause = th.getCause();
        this.f4149d = cause != null ? new e(cause, dVar) : null;
    }
}
