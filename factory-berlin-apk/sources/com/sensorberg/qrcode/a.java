package com.sensorberg.qrcode;

import android.graphics.Bitmap;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.n0;
import kotlin.c0.g;
import kotlin.jvm.internal.k;
import kotlin.x;
import kotlinx.coroutines.e3.c;
import kotlinx.coroutines.e3.d;

/* compiled from: QrCodeViewModel.kt */
public final class a extends n0 {

    /* renamed from: i  reason: collision with root package name */
    private final LiveData<Bitmap> f5543i;

    /* renamed from: com.sensorberg.qrcode.a$a  reason: collision with other inner class name */
    /* compiled from: SafeCollector.common.kt */
    public static final class C0180a implements c<Bitmap> {
        final /* synthetic */ c a;

        /* renamed from: com.sensorberg.qrcode.a$a$a  reason: collision with other inner class name */
        /* compiled from: Collect.kt */
        public static final class C0181a implements d<g.e.n.c.c.a> {

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ d f5544g;

            public C0181a(d dVar, C0180a aVar) {
                this.f5544g = dVar;
            }

            public Object a(Object obj, kotlin.c0.d dVar) {
                d dVar2 = this.f5544g;
                Bitmap a = ((g.e.n.c.c.a) obj).a();
                if (a == null) {
                    return a == d.c() ? a : x.a;
                }
                Object a2 = dVar2.a(a, dVar);
                return a2 == d.c() ? a2 : x.a;
            }
        }

        public C0180a(c cVar) {
            this.a = cVar;
        }

        public Object a(d dVar, kotlin.c0.d dVar2) {
            Object a2 = this.a.a(new C0181a(dVar, this), dVar2);
            if (a2 == d.c()) {
                return a2;
            }
            return x.a;
        }
    }

    public a(g.e.n.g.a aVar) {
        k.e(aVar, "authenticationController");
        this.f5543i = androidx.lifecycle.k.c(new C0180a(aVar.z()), (g) null, 0, 3, (Object) null);
    }

    public final LiveData<Bitmap> r() {
        return this.f5543i;
    }
}
