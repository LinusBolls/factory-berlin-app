package com.google.android.gms.measurement.internal;

import android.net.Uri;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
final class m7 implements Runnable {

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ boolean f2979g;

    /* renamed from: h  reason: collision with root package name */
    private final /* synthetic */ Uri f2980h;

    /* renamed from: i  reason: collision with root package name */
    private final /* synthetic */ String f2981i;

    /* renamed from: j  reason: collision with root package name */
    private final /* synthetic */ String f2982j;

    /* renamed from: k  reason: collision with root package name */
    private final /* synthetic */ j7 f2983k;

    m7(j7 j7Var, boolean z, Uri uri, String str, String str2) {
        this.f2983k = j7Var;
        this.f2979g = z;
        this.f2980h = uri;
        this.f2981i = str;
        this.f2982j = str2;
    }

    public final void run() {
        this.f2983k.i(this.f2979g, this.f2980h, this.f2981i, this.f2982j);
    }
}
