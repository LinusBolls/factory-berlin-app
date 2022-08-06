package com.sensorberg.smartworkspace.app.l;

import android.app.Application;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Vibrator;
import androidx.lifecycle.LiveData;
import com.sensorberg.encryptor.d;
import com.sensorberg.smartspaces.sdk.model.IotUnit;
import com.sensorberg.smartspaces.sdk.model.Openable;
import com.sensorberg.smartworkspace.app.activities.main.b;
import com.sensorberg.smartworkspace.app.activities.pin.c;
import com.sensorberg.smartworkspace.app.i.a;
import com.sensorberg.smartworkspace.app.screens.info.InfoDatabase;
import com.sensorberg.smartworkspace.app.screens.locker.LockerGroupSelection;
import com.sensorberg.smartworkspace.app.screens.locker.error.LockerErrorFragment;
import com.sensorberg.smartworkspace.app.screens.spaces.IotDeviceIdentifier;
import com.sensorberg.smartworkspace.app.utils.LockedState;
import e.p.h;
import g.e.a.b;
import g.e.j.a.d;

/* compiled from: AppModule.kt */
public final class b {
    public static final b a = new b();

    /* compiled from: AppModule.kt */
    static final class a extends kotlin.jvm.internal.l implements kotlin.e0.c.l<m.a.c.h.a, kotlin.x> {

        /* renamed from: h  reason: collision with root package name */
        public static final a f7174h = new a();

        /* renamed from: com.sensorberg.smartworkspace.app.l.b$a$a  reason: collision with other inner class name */
        /* compiled from: AppModule.kt */
        static final class C0474a extends kotlin.jvm.internal.l implements kotlin.e0.c.p<m.a.c.l.a, m.a.c.i.a, g.e.n.g.g> {

            /* renamed from: h  reason: collision with root package name */
            public static final C0474a f7175h = new C0474a();

            C0474a() {
                super(2);
            }

            /* renamed from: a */
            public final g.e.n.g.g l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                kotlin.jvm.internal.k.e(aVar, "$receiver");
                kotlin.jvm.internal.k.e(aVar2, "it");
                return ((g.e.n.g.s) aVar.e(kotlin.jvm.internal.v.b(g.e.n.g.s.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null)).e();
            }
        }

        /* compiled from: AppModule.kt */
        static final class a0 extends kotlin.jvm.internal.l implements kotlin.e0.c.p<m.a.c.l.a, m.a.c.i.a, com.sensorberg.smartworkspace.app.screens.alarm.b> {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ com.sensorberg.smartworkspace.app.utils.c f7176h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a0(com.sensorberg.smartworkspace.app.utils.c cVar) {
                super(2);
                this.f7176h = cVar;
            }

            /* renamed from: a */
            public final com.sensorberg.smartworkspace.app.screens.alarm.b l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                kotlin.jvm.internal.k.e(aVar, "$receiver");
                kotlin.jvm.internal.k.e(aVar2, "it");
                return new com.sensorberg.smartworkspace.app.screens.alarm.c(this.f7176h, (g.e.n.g.y) aVar.e(kotlin.jvm.internal.v.b(g.e.n.g.y.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null), (g.e.n.g.f) aVar.e(kotlin.jvm.internal.v.b(g.e.n.g.f.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null)).a();
            }
        }

        /* compiled from: AppModule.kt */
        static final class a1 extends kotlin.jvm.internal.l implements kotlin.e0.c.p<m.a.c.l.a, m.a.c.i.a, com.sensorberg.smartworkspace.app.screens.locker.opening.e> {

            /* renamed from: h  reason: collision with root package name */
            public static final a1 f7177h = new a1();

            a1() {
                super(2);
            }

            /* renamed from: a */
            public final com.sensorberg.smartworkspace.app.screens.locker.opening.e l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                kotlin.jvm.internal.k.e(aVar, "$receiver");
                kotlin.jvm.internal.k.e(aVar2, "<name for destructuring parameter 0>");
                return new com.sensorberg.smartworkspace.app.screens.locker.opening.e((IotUnit) aVar2.a(), (g.e.n.g.x) aVar.e(kotlin.jvm.internal.v.b(g.e.n.g.x.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null));
            }
        }

        /* renamed from: com.sensorberg.smartworkspace.app.l.b$a$b  reason: collision with other inner class name */
        /* compiled from: AppModule.kt */
        static final class C0475b extends kotlin.jvm.internal.l implements kotlin.e0.c.p<m.a.c.l.a, m.a.c.i.a, g.e.n.g.f> {

            /* renamed from: h  reason: collision with root package name */
            public static final C0475b f7178h = new C0475b();

            C0475b() {
                super(2);
            }

            /* renamed from: a */
            public final g.e.n.g.f l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                kotlin.jvm.internal.k.e(aVar, "$receiver");
                kotlin.jvm.internal.k.e(aVar2, "it");
                return ((g.e.n.g.s) aVar.e(kotlin.jvm.internal.v.b(g.e.n.g.s.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null)).k();
            }
        }

        /* compiled from: AppModule.kt */
        static final class b0 extends kotlin.jvm.internal.l implements kotlin.e0.c.p<m.a.c.l.a, m.a.c.i.a, com.sensorberg.smartworkspace.app.screens.alarm.j> {

            /* renamed from: h  reason: collision with root package name */
            public static final b0 f7179h = new b0();

            b0() {
                super(2);
            }

            /* renamed from: a */
            public final com.sensorberg.smartworkspace.app.screens.alarm.j l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                kotlin.jvm.internal.k.e(aVar, "$receiver");
                kotlin.jvm.internal.k.e(aVar2, "it");
                LiveData<a.d> a = ((com.sensorberg.smartworkspace.app.screens.alarm.b) aVar.e(kotlin.jvm.internal.v.b(com.sensorberg.smartworkspace.app.screens.alarm.b.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null)).a();
                androidx.lifecycle.v k2 = androidx.lifecycle.h0.k();
                kotlin.jvm.internal.k.d(k2, "ProcessLifecycleOwner.get()");
                return new com.sensorberg.smartworkspace.app.screens.alarm.j(a, k2, (com.sensorberg.smartworkspace.app.utils.c) aVar.e(kotlin.jvm.internal.v.b(com.sensorberg.smartworkspace.app.utils.c.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null), (g.e.a.b) aVar.e(kotlin.jvm.internal.v.b(g.e.a.b.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null));
            }
        }

        /* compiled from: AppModule.kt */
        static final class b1 extends kotlin.jvm.internal.l implements kotlin.e0.c.p<m.a.c.l.a, m.a.c.i.a, com.sensorberg.smartworkspace.app.screens.locker.error.d> {

            /* renamed from: h  reason: collision with root package name */
            public static final b1 f7180h = new b1();

            b1() {
                super(2);
            }

            /* renamed from: a */
            public final com.sensorberg.smartworkspace.app.screens.locker.error.d l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                kotlin.jvm.internal.k.e(aVar, "$receiver");
                kotlin.jvm.internal.k.e(aVar2, "<name for destructuring parameter 0>");
                return new com.sensorberg.smartworkspace.app.screens.locker.error.d((LockerErrorFragment.Arguments) aVar2.a(), (g.e.n.g.x) aVar.e(kotlin.jvm.internal.v.b(g.e.n.g.x.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null));
            }
        }

        /* compiled from: AppModule.kt */
        static final class c extends kotlin.jvm.internal.l implements kotlin.e0.c.p<m.a.c.l.a, m.a.c.i.a, g.e.n.g.v> {

            /* renamed from: h  reason: collision with root package name */
            public static final c f7181h = new c();

            c() {
                super(2);
            }

            /* renamed from: a */
            public final g.e.n.g.v l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                kotlin.jvm.internal.k.e(aVar, "$receiver");
                kotlin.jvm.internal.k.e(aVar2, "it");
                return ((g.e.n.g.s) aVar.e(kotlin.jvm.internal.v.b(g.e.n.g.s.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null)).j();
            }
        }

        /* compiled from: AppModule.kt */
        static final class c0 extends kotlin.jvm.internal.l implements kotlin.e0.c.p<m.a.c.l.a, m.a.c.i.a, com.sensorberg.smartworkspace.app.screens.spaces.iotdetails.f.c> {

            /* renamed from: h  reason: collision with root package name */
            public static final c0 f7182h = new c0();

            c0() {
                super(2);
            }

            /* renamed from: a */
            public final com.sensorberg.smartworkspace.app.screens.spaces.iotdetails.f.c l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                kotlin.jvm.internal.k.e(aVar, "$receiver");
                kotlin.jvm.internal.k.e(aVar2, "it");
                return new com.sensorberg.smartworkspace.app.screens.spaces.iotdetails.f.c((Resources) aVar.e(kotlin.jvm.internal.v.b(Resources.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null), (com.sensorberg.smartworkspace.app.utils.r) aVar.e(kotlin.jvm.internal.v.b(com.sensorberg.smartworkspace.app.utils.r.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null));
            }
        }

        /* compiled from: AppModule.kt */
        static final class c1 extends kotlin.jvm.internal.l implements kotlin.e0.c.p<m.a.c.l.a, m.a.c.i.a, com.sensorberg.encryptor.d> {

            /* renamed from: h  reason: collision with root package name */
            public static final c1 f7183h = new c1();

            c1() {
                super(2);
            }

            /* renamed from: a */
            public final com.sensorberg.encryptor.d l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                kotlin.jvm.internal.k.e(aVar, "$receiver");
                kotlin.jvm.internal.k.e(aVar2, "it");
                return d.a.b(com.sensorberg.encryptor.d.a, "sw-app", (Context) aVar.e(kotlin.jvm.internal.v.b(Context.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null), (d.c) null, 4, (Object) null);
            }
        }

        /* compiled from: AppModule.kt */
        static final class d extends kotlin.jvm.internal.l implements kotlin.e0.c.p<m.a.c.l.a, m.a.c.i.a, g.e.n.g.a> {

            /* renamed from: h  reason: collision with root package name */
            public static final d f7184h = new d();

            d() {
                super(2);
            }

            /* renamed from: a */
            public final g.e.n.g.a l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                kotlin.jvm.internal.k.e(aVar, "$receiver");
                kotlin.jvm.internal.k.e(aVar2, "it");
                return ((g.e.n.g.s) aVar.e(kotlin.jvm.internal.v.b(g.e.n.g.s.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null)).h();
            }
        }

        /* compiled from: AppModule.kt */
        static final class d0 extends kotlin.jvm.internal.l implements kotlin.e0.c.p<m.a.c.l.a, m.a.c.i.a, com.sensorberg.smartworkspace.app.screens.spaces.iotdetails.f.f> {

            /* renamed from: h  reason: collision with root package name */
            public static final d0 f7185h = new d0();

            d0() {
                super(2);
            }

            /* renamed from: a */
            public final com.sensorberg.smartworkspace.app.screens.spaces.iotdetails.f.f l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                kotlin.jvm.internal.k.e(aVar, "$receiver");
                kotlin.jvm.internal.k.e(aVar2, "it");
                return new com.sensorberg.smartworkspace.app.screens.spaces.iotdetails.f.f((com.sensorberg.smartworkspace.app.screens.spaces.l) aVar.e(kotlin.jvm.internal.v.b(com.sensorberg.smartworkspace.app.screens.spaces.l.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null), (com.sensorberg.smartworkspace.app.screens.spaces.iotdetails.f.c) aVar.e(kotlin.jvm.internal.v.b(com.sensorberg.smartworkspace.app.screens.spaces.iotdetails.f.c.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null));
            }
        }

        /* compiled from: AppModule.kt */
        static final class d1 extends kotlin.jvm.internal.l implements kotlin.e0.c.p<m.a.c.l.a, m.a.c.i.a, com.sensorberg.smartworkspace.app.screens.spaces.detail.l> {

            /* renamed from: h  reason: collision with root package name */
            public static final d1 f7186h = new d1();

            d1() {
                super(2);
            }

            /* renamed from: a */
            public final com.sensorberg.smartworkspace.app.screens.spaces.detail.l l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                m.a.c.l.a aVar3 = aVar;
                Class<com.sensorberg.smartworkspace.app.screens.spaces.l> cls = com.sensorberg.smartworkspace.app.screens.spaces.l.class;
                kotlin.jvm.internal.k.e(aVar3, "$receiver");
                kotlin.jvm.internal.k.e(aVar2, "<name for destructuring parameter 0>");
                return new com.sensorberg.smartworkspace.app.screens.spaces.detail.l((String) aVar2.a(), (String) aVar2.b(), (g.e.n.g.g) aVar3.e(kotlin.jvm.internal.v.b(g.e.n.g.g.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null), new com.sensorberg.smartworkspace.app.screens.spaces.detail.g((com.sensorberg.smartworkspace.app.screens.spaces.detail.f) aVar3.e(kotlin.jvm.internal.v.b(com.sensorberg.smartworkspace.app.screens.spaces.detail.f.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null), (com.sensorberg.smartworkspace.app.screens.spaces.detail.o) aVar3.e(kotlin.jvm.internal.v.b(com.sensorberg.smartworkspace.app.screens.spaces.detail.o.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null), (com.sensorberg.smartworkspace.app.screens.spaces.l) aVar3.e(kotlin.jvm.internal.v.b(cls), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null), (Resources) aVar3.e(kotlin.jvm.internal.v.b(Resources.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null)), new com.sensorberg.smartworkspace.app.screens.spaces.detail.c((Resources) aVar3.e(kotlin.jvm.internal.v.b(Resources.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null), (com.sensorberg.smartworkspace.app.screens.spaces.l) aVar3.e(kotlin.jvm.internal.v.b(cls), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null)), new Handler(Looper.getMainLooper()), (g.e.n.g.j) aVar3.e(kotlin.jvm.internal.v.b(g.e.n.g.j.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null), (Application) aVar3.e(kotlin.jvm.internal.v.b(Application.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null), (com.sensorberg.smartworkspace.app.screens.settings.myrenz.a) aVar3.e(kotlin.jvm.internal.v.b(com.sensorberg.smartworkspace.app.screens.settings.myrenz.a.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null), (kotlinx.coroutines.d0) null, 512, (DefaultConstructorMarker) null);
            }
        }

        /* compiled from: AppModule.kt */
        static final class e extends kotlin.jvm.internal.l implements kotlin.e0.c.p<m.a.c.l.a, m.a.c.i.a, g.e.n.g.j> {

            /* renamed from: h  reason: collision with root package name */
            public static final e f7187h = new e();

            e() {
                super(2);
            }

            /* renamed from: a */
            public final g.e.n.g.j l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                kotlin.jvm.internal.k.e(aVar, "$receiver");
                kotlin.jvm.internal.k.e(aVar2, "it");
                return ((g.e.n.g.s) aVar.e(kotlin.jvm.internal.v.b(g.e.n.g.s.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null)).g();
            }
        }

        /* compiled from: AppModule.kt */
        static final class e0 extends kotlin.jvm.internal.l implements kotlin.e0.c.p<m.a.c.l.a, m.a.c.i.a, com.sensorberg.smartworkspace.app.screens.spaces.iotdetails.f.e> {

            /* renamed from: h  reason: collision with root package name */
            public static final e0 f7188h = new e0();

            e0() {
                super(2);
            }

            /* renamed from: a */
            public final com.sensorberg.smartworkspace.app.screens.spaces.iotdetails.f.e l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                kotlin.jvm.internal.k.e(aVar, "$receiver");
                kotlin.jvm.internal.k.e(aVar2, "it");
                return new com.sensorberg.smartworkspace.app.screens.spaces.iotdetails.f.e((com.sensorberg.smartworkspace.app.screens.spaces.l) aVar.e(kotlin.jvm.internal.v.b(com.sensorberg.smartworkspace.app.screens.spaces.l.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null), (Resources) aVar.e(kotlin.jvm.internal.v.b(Resources.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null), (com.sensorberg.smartworkspace.app.screens.spaces.iotdetails.f.c) aVar.e(kotlin.jvm.internal.v.b(com.sensorberg.smartworkspace.app.screens.spaces.iotdetails.f.c.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null));
            }
        }

        /* compiled from: AppModule.kt */
        static final class e1 extends kotlin.jvm.internal.l implements kotlin.e0.c.p<m.a.c.l.a, m.a.c.i.a, com.sensorberg.smartworkspace.app.screens.spaces.overview.h> {

            /* renamed from: h  reason: collision with root package name */
            public static final e1 f7189h = new e1();

            e1() {
                super(2);
            }

            /* renamed from: a */
            public final com.sensorberg.smartworkspace.app.screens.spaces.overview.h l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                kotlin.jvm.internal.k.e(aVar, "$receiver");
                kotlin.jvm.internal.k.e(aVar2, "it");
                return new com.sensorberg.smartworkspace.app.screens.spaces.overview.h((com.sensorberg.smartworkspace.app.screens.spaces.overview.d) aVar.e(kotlin.jvm.internal.v.b(com.sensorberg.smartworkspace.app.screens.spaces.overview.d.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null), (kotlinx.coroutines.d0) null, 2, (DefaultConstructorMarker) null);
            }
        }

        /* compiled from: AppModule.kt */
        static final class f extends kotlin.jvm.internal.l implements kotlin.e0.c.p<m.a.c.l.a, m.a.c.i.a, com.sensorberg.smartworkspace.app.utils.j> {

            /* renamed from: h  reason: collision with root package name */
            public static final f f7190h = new f();

            f() {
                super(2);
            }

            /* renamed from: a */
            public final com.sensorberg.smartworkspace.app.utils.j l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                kotlin.jvm.internal.k.e(aVar, "$receiver");
                kotlin.jvm.internal.k.e(aVar2, "it");
                return new com.sensorberg.smartworkspace.app.utils.j((Context) aVar.e(kotlin.jvm.internal.v.b(Context.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null), (com.sensorberg.smartworkspace.app.utils.c) aVar.e(kotlin.jvm.internal.v.b(com.sensorberg.smartworkspace.app.utils.c.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null), (com.sensorberg.encryptor.d) aVar.e(kotlin.jvm.internal.v.b(com.sensorberg.encryptor.d.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null));
            }
        }

        /* compiled from: AppModule.kt */
        static final class f0 extends kotlin.jvm.internal.l implements kotlin.e0.c.p<m.a.c.l.a, m.a.c.i.a, com.sensorberg.smartworkspace.app.screens.spaces.iotdetails.f.a> {

            /* renamed from: h  reason: collision with root package name */
            public static final f0 f7191h = new f0();

            f0() {
                super(2);
            }

            /* renamed from: a */
            public final com.sensorberg.smartworkspace.app.screens.spaces.iotdetails.f.a l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                kotlin.jvm.internal.k.e(aVar, "$receiver");
                kotlin.jvm.internal.k.e(aVar2, "it");
                return new com.sensorberg.smartworkspace.app.screens.spaces.iotdetails.f.a((com.sensorberg.smartworkspace.app.screens.spaces.l) aVar.e(kotlin.jvm.internal.v.b(com.sensorberg.smartworkspace.app.screens.spaces.l.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null), (com.sensorberg.smartworkspace.app.screens.spaces.iotdetails.f.c) aVar.e(kotlin.jvm.internal.v.b(com.sensorberg.smartworkspace.app.screens.spaces.iotdetails.f.c.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null));
            }
        }

        /* compiled from: AppModule.kt */
        static final class f1 extends kotlin.jvm.internal.l implements kotlin.e0.c.p<m.a.c.l.a, m.a.c.i.a, com.sensorberg.smartworkspace.app.screens.spaces.iotdetails.d> {

            /* renamed from: h  reason: collision with root package name */
            public static final f1 f7192h = new f1();

            f1() {
                super(2);
            }

            /* renamed from: a */
            public final com.sensorberg.smartworkspace.app.screens.spaces.iotdetails.d l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                com.sensorberg.smartworkspace.app.screens.spaces.iotdetails.f.d dVar;
                kotlin.jvm.internal.k.e(aVar, "$receiver");
                kotlin.jvm.internal.k.e(aVar2, "<name for destructuring parameter 0>");
                String str = (String) aVar2.a();
                String str2 = (String) aVar2.b();
                int i2 = a.a[((IotDeviceIdentifier) aVar2.c()).ordinal()];
                if (i2 == 1) {
                    dVar = (com.sensorberg.smartworkspace.app.screens.spaces.iotdetails.f.d) aVar.e(kotlin.jvm.internal.v.b(com.sensorberg.smartworkspace.app.screens.spaces.iotdetails.f.f.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null);
                } else if (i2 == 2) {
                    dVar = (com.sensorberg.smartworkspace.app.screens.spaces.iotdetails.f.d) aVar.e(kotlin.jvm.internal.v.b(com.sensorberg.smartworkspace.app.screens.spaces.iotdetails.f.e.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null);
                } else if (i2 != 3) {
                    dVar = (com.sensorberg.smartworkspace.app.screens.spaces.iotdetails.f.d) aVar.e(kotlin.jvm.internal.v.b(com.sensorberg.smartworkspace.app.screens.spaces.iotdetails.f.b.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null);
                } else {
                    dVar = (com.sensorberg.smartworkspace.app.screens.spaces.iotdetails.f.d) aVar.e(kotlin.jvm.internal.v.b(com.sensorberg.smartworkspace.app.screens.spaces.iotdetails.f.a.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null);
                }
                return new com.sensorberg.smartworkspace.app.screens.spaces.iotdetails.d(str, str2, (Resources) aVar.e(kotlin.jvm.internal.v.b(Resources.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null), (g.e.n.g.g) aVar.e(kotlin.jvm.internal.v.b(g.e.n.g.g.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null), dVar, new Handler(Looper.getMainLooper()), (kotlinx.coroutines.d0) null, 64, (DefaultConstructorMarker) null);
            }
        }

        /* compiled from: AppModule.kt */
        static final class g extends kotlin.jvm.internal.l implements kotlin.e0.c.p<m.a.c.l.a, m.a.c.i.a, com.sensorberg.smartworkspace.app.screens.info.c> {

            /* renamed from: h  reason: collision with root package name */
            public static final g f7193h = new g();

            g() {
                super(2);
            }

            /* renamed from: a */
            public final com.sensorberg.smartworkspace.app.screens.info.c l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                kotlin.jvm.internal.k.e(aVar, "$receiver");
                kotlin.jvm.internal.k.e(aVar2, "it");
                return androidx.room.k.a((Context) aVar.e(kotlin.jvm.internal.v.b(Context.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null), InfoDatabase.class, "action-database").d().y();
            }
        }

        /* compiled from: AppModule.kt */
        static final class g0 extends kotlin.jvm.internal.l implements kotlin.e0.c.p<m.a.c.l.a, m.a.c.i.a, g.e.c.a> {

            /* renamed from: h  reason: collision with root package name */
            public static final g0 f7194h = new g0();

            g0() {
                super(2);
            }

            /* renamed from: a */
            public final g.e.c.a l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                kotlin.jvm.internal.k.e(aVar, "$receiver");
                kotlin.jvm.internal.k.e(aVar2, "it");
                return new g.e.c.a((Context) aVar.e(kotlin.jvm.internal.v.b(Context.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null));
            }
        }

        /* compiled from: AppModule.kt */
        static final class g1 extends kotlin.jvm.internal.l implements kotlin.e0.c.p<m.a.c.l.a, m.a.c.i.a, com.sensorberg.smartworkspace.app.screens.password.a> {

            /* renamed from: h  reason: collision with root package name */
            public static final g1 f7195h = new g1();

            g1() {
                super(2);
            }

            /* renamed from: a */
            public final com.sensorberg.smartworkspace.app.screens.password.a l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                kotlin.jvm.internal.k.e(aVar, "$receiver");
                kotlin.jvm.internal.k.e(aVar2, "it");
                return new com.sensorberg.smartworkspace.app.screens.password.a((g.e.n.g.s) aVar.e(kotlin.jvm.internal.v.b(g.e.n.g.s.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null), (Resources) aVar.e(kotlin.jvm.internal.v.b(Resources.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null));
            }
        }

        /* compiled from: AppModule.kt */
        static final class h extends kotlin.jvm.internal.l implements kotlin.e0.c.p<m.a.c.l.a, m.a.c.i.a, g.e.p.c.a> {

            /* renamed from: h  reason: collision with root package name */
            public static final h f7196h = new h();

            /* renamed from: com.sensorberg.smartworkspace.app.l.b$a$h$a  reason: collision with other inner class name */
            /* compiled from: AppModule.kt */
            public static final class C0476a implements g.e.p.c.a {
                C0476a() {
                }

                public int a() {
                    return Build.VERSION.SDK_INT;
                }
            }

            h() {
                super(2);
            }

            /* renamed from: a */
            public final g.e.p.c.a l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                kotlin.jvm.internal.k.e(aVar, "$receiver");
                kotlin.jvm.internal.k.e(aVar2, "it");
                return new C0476a();
            }
        }

        /* compiled from: AppModule.kt */
        static final class h0 extends kotlin.jvm.internal.l implements kotlin.e0.c.p<m.a.c.l.a, m.a.c.i.a, com.sensorberg.smartworkspace.app.screens.spaces.iotdetails.f.b> {

            /* renamed from: h  reason: collision with root package name */
            public static final h0 f7197h = new h0();

            h0() {
                super(2);
            }

            /* renamed from: a */
            public final com.sensorberg.smartworkspace.app.screens.spaces.iotdetails.f.b l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                kotlin.jvm.internal.k.e(aVar, "$receiver");
                kotlin.jvm.internal.k.e(aVar2, "it");
                return new com.sensorberg.smartworkspace.app.screens.spaces.iotdetails.f.b((com.sensorberg.smartworkspace.app.screens.spaces.l) aVar.e(kotlin.jvm.internal.v.b(com.sensorberg.smartworkspace.app.screens.spaces.l.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null), (Resources) aVar.e(kotlin.jvm.internal.v.b(Resources.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null), (com.sensorberg.smartworkspace.app.screens.spaces.iotdetails.f.c) aVar.e(kotlin.jvm.internal.v.b(com.sensorberg.smartworkspace.app.screens.spaces.iotdetails.f.c.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null));
            }
        }

        /* compiled from: AppModule.kt */
        static final class h1 extends kotlin.jvm.internal.l implements kotlin.e0.c.p<m.a.c.l.a, m.a.c.i.a, com.sensorberg.smartworkspace.app.screens.door.c> {

            /* renamed from: h  reason: collision with root package name */
            public static final h1 f7198h = new h1();

            h1() {
                super(2);
            }

            /* renamed from: a */
            public final com.sensorberg.smartworkspace.app.screens.door.c l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                kotlin.jvm.internal.k.e(aVar, "$receiver");
                kotlin.jvm.internal.k.e(aVar2, "it");
                return new com.sensorberg.smartworkspace.app.screens.door.c((g.e.n.g.x) aVar.e(kotlin.jvm.internal.v.b(g.e.n.g.x.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null));
            }
        }

        /* compiled from: AppModule.kt */
        static final class i extends kotlin.jvm.internal.l implements kotlin.e0.c.p<m.a.c.l.a, m.a.c.i.a, com.sensorberg.smartworkspace.app.utils.l> {

            /* renamed from: h  reason: collision with root package name */
            public static final i f7199h = new i();

            i() {
                super(2);
            }

            /* renamed from: a */
            public final com.sensorberg.smartworkspace.app.utils.l l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                kotlin.jvm.internal.k.e(aVar, "$receiver");
                kotlin.jvm.internal.k.e(aVar2, "it");
                return new com.sensorberg.smartworkspace.app.utils.m((Context) aVar.e(kotlin.jvm.internal.v.b(Context.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null), (g.e.p.c.a) aVar.e(kotlin.jvm.internal.v.b(g.e.p.c.a.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null));
            }
        }

        /* compiled from: AppModule.kt */
        static final class i0 extends kotlin.jvm.internal.l implements kotlin.e0.c.p<m.a.c.l.a, m.a.c.i.a, b.e> {

            /* renamed from: h  reason: collision with root package name */
            public static final i0 f7200h = new i0();

            i0() {
                super(2);
            }

            /* renamed from: a */
            public final b.e l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                kotlin.jvm.internal.k.e(aVar, "$receiver");
                kotlin.jvm.internal.k.e(aVar2, "it");
                return new b.e((g.e.n.g.x) aVar.e(kotlin.jvm.internal.v.b(g.e.n.g.x.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null), (g.e.n.g.c) aVar.e(kotlin.jvm.internal.v.b(g.e.n.g.c.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null), (g.e.n.g.y) aVar.e(kotlin.jvm.internal.v.b(g.e.n.g.y.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null), (com.sensorberg.smartworkspace.app.screens.info.c) aVar.e(kotlin.jvm.internal.v.b(com.sensorberg.smartworkspace.app.screens.info.c.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null), (com.sensorberg.smartworkspace.app.utils.c) aVar.e(kotlin.jvm.internal.v.b(com.sensorberg.smartworkspace.app.utils.c.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null), ((com.sensorberg.smartworkspace.app.screens.alarm.b) aVar.e(kotlin.jvm.internal.v.b(com.sensorberg.smartworkspace.app.screens.alarm.b.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null)).a());
            }
        }

        /* compiled from: AppModule.kt */
        static final class i1 extends kotlin.jvm.internal.l implements kotlin.e0.c.p<m.a.c.l.a, m.a.c.i.a, com.sensorberg.smartworkspace.app.screens.door.opening.e> {

            /* renamed from: h  reason: collision with root package name */
            public static final i1 f7201h = new i1();

            i1() {
                super(2);
            }

            /* renamed from: a */
            public final com.sensorberg.smartworkspace.app.screens.door.opening.e l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                kotlin.jvm.internal.k.e(aVar, "$receiver");
                kotlin.jvm.internal.k.e(aVar2, "<name for destructuring parameter 0>");
                return new com.sensorberg.smartworkspace.app.screens.door.opening.e((g.e.n.g.x) aVar.e(kotlin.jvm.internal.v.b(g.e.n.g.x.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null), (Openable) aVar2.a(), (String) aVar2.b(), new Handler(Looper.getMainLooper()));
            }
        }

        /* compiled from: AppModule.kt */
        static final class j extends kotlin.jvm.internal.l implements kotlin.e0.c.p<m.a.c.l.a, m.a.c.i.a, com.sensorberg.smartworkspace.app.utils.e> {

            /* renamed from: h  reason: collision with root package name */
            public static final j f7202h = new j();

            j() {
                super(2);
            }

            /* renamed from: a */
            public final com.sensorberg.smartworkspace.app.utils.e l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                kotlin.jvm.internal.k.e(aVar, "$receiver");
                kotlin.jvm.internal.k.e(aVar2, "it");
                return new com.sensorberg.smartworkspace.app.utils.e((com.sensorberg.smartworkspace.app.utils.l) aVar.e(kotlin.jvm.internal.v.b(com.sensorberg.smartworkspace.app.utils.l.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null));
            }
        }

        /* compiled from: AppModule.kt */
        static final class j0 extends kotlin.jvm.internal.l implements kotlin.e0.c.p<m.a.c.l.a, m.a.c.i.a, com.sensorberg.smartworkspace.app.screens.alarm.p> {

            /* renamed from: h  reason: collision with root package name */
            public static final j0 f7203h = new j0();

            j0() {
                super(2);
            }

            /* renamed from: a */
            public final com.sensorberg.smartworkspace.app.screens.alarm.p l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                kotlin.jvm.internal.k.e(aVar, "$receiver");
                kotlin.jvm.internal.k.e(aVar2, "it");
                Object systemService = ((Application) aVar.e(kotlin.jvm.internal.v.b(Application.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null)).getSystemService("notification");
                if (systemService != null) {
                    return new com.sensorberg.smartworkspace.app.screens.alarm.p((Context) aVar.e(kotlin.jvm.internal.v.b(Application.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null), (NotificationManager) systemService);
                }
                throw new NullPointerException("null cannot be cast to non-null type android.app.NotificationManager");
            }
        }

        /* compiled from: AppModule.kt */
        static final class j1 extends kotlin.jvm.internal.l implements kotlin.e0.c.p<m.a.c.l.a, m.a.c.i.a, g.e.d.t.a.a> {

            /* renamed from: h  reason: collision with root package name */
            public static final j1 f7204h = new j1();

            j1() {
                super(2);
            }

            /* renamed from: a */
            public final g.e.d.t.a.a l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                kotlin.jvm.internal.k.e(aVar, "$receiver");
                kotlin.jvm.internal.k.e(aVar2, "it");
                return new g.e.d.t.a.a();
            }
        }

        /* compiled from: AppModule.kt */
        static final class k extends kotlin.jvm.internal.l implements kotlin.e0.c.p<m.a.c.l.a, m.a.c.i.a, com.sensorberg.smartworkspace.app.utils.c> {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ com.sensorberg.smartworkspace.app.utils.c f7205h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            k(com.sensorberg.smartworkspace.app.utils.c cVar) {
                super(2);
                this.f7205h = cVar;
            }

            /* renamed from: a */
            public final com.sensorberg.smartworkspace.app.utils.c l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                kotlin.jvm.internal.k.e(aVar, "$receiver");
                kotlin.jvm.internal.k.e(aVar2, "it");
                return this.f7205h;
            }
        }

        /* compiled from: AppModule.kt */
        static final class k0 extends kotlin.jvm.internal.l implements kotlin.e0.c.p<m.a.c.l.a, m.a.c.i.a, com.sensorberg.smartworkspace.app.screens.spaces.overview.d> {

            /* renamed from: h  reason: collision with root package name */
            public static final k0 f7206h = new k0();

            k0() {
                super(2);
            }

            /* renamed from: a */
            public final com.sensorberg.smartworkspace.app.screens.spaces.overview.d l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                kotlin.jvm.internal.k.e(aVar, "$receiver");
                kotlin.jvm.internal.k.e(aVar2, "it");
                return new com.sensorberg.smartworkspace.app.screens.spaces.overview.d((g.e.n.g.f) aVar.e(kotlin.jvm.internal.v.b(g.e.n.g.f.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null), (String) null, 2, (DefaultConstructorMarker) null);
            }
        }

        /* compiled from: AppModule.kt */
        static final class k1 extends kotlin.jvm.internal.l implements kotlin.e0.c.p<m.a.c.l.a, m.a.c.i.a, com.sensorberg.smartworkspace.app.screens.locker.e.b> {

            /* renamed from: h  reason: collision with root package name */
            public static final k1 f7207h = new k1();

            k1() {
                super(2);
            }

            /* renamed from: a */
            public final com.sensorberg.smartworkspace.app.screens.locker.e.b l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                kotlin.jvm.internal.k.e(aVar, "$receiver");
                kotlin.jvm.internal.k.e(aVar2, "it");
                return new com.sensorberg.smartworkspace.app.screens.locker.e.b((g.e.n.g.c) aVar.e(kotlin.jvm.internal.v.b(g.e.n.g.c.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null));
            }
        }

        /* compiled from: AppModule.kt */
        static final class l extends kotlin.jvm.internal.l implements kotlin.e0.c.p<m.a.c.l.a, m.a.c.i.a, com.sensorberg.smartworkspace.app.utils.f> {

            /* renamed from: h  reason: collision with root package name */
            public static final l f7208h = new l();

            l() {
                super(2);
            }

            /* renamed from: a */
            public final com.sensorberg.smartworkspace.app.utils.f l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                kotlin.jvm.internal.k.e(aVar, "$receiver");
                kotlin.jvm.internal.k.e(aVar2, "it");
                return new com.sensorberg.smartworkspace.app.utils.f((Vibrator) aVar.e(kotlin.jvm.internal.v.b(Vibrator.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null));
            }
        }

        /* compiled from: AppModule.kt */
        static final class l0 extends kotlin.jvm.internal.l implements kotlin.e0.c.p<m.a.c.l.a, m.a.c.i.a, com.sensorberg.smartworkspace.app.activities.main.d> {

            /* renamed from: h  reason: collision with root package name */
            public static final l0 f7209h = new l0();

            l0() {
                super(2);
            }

            /* renamed from: a */
            public final com.sensorberg.smartworkspace.app.activities.main.d l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                kotlin.jvm.internal.k.e(aVar, "$receiver");
                kotlin.jvm.internal.k.e(aVar2, "<name for destructuring parameter 0>");
                return new com.sensorberg.smartworkspace.app.activities.main.d((g.e.n.g.y) aVar.e(kotlin.jvm.internal.v.b(g.e.n.g.y.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null), (g.e.n.g.v) aVar.e(kotlin.jvm.internal.v.b(g.e.n.g.v.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null), (LockedState) aVar.e(kotlin.jvm.internal.v.b(LockedState.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null), (com.sensorberg.smartworkspace.app.utils.j) aVar.e(kotlin.jvm.internal.v.b(com.sensorberg.smartworkspace.app.utils.j.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null), (com.sensorberg.smartworkspace.app.utils.c) aVar.e(kotlin.jvm.internal.v.b(com.sensorberg.smartworkspace.app.utils.c.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null), (b.e) aVar.e(kotlin.jvm.internal.v.b(b.e.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null), (g.e.c.a) aVar.e(kotlin.jvm.internal.v.b(g.e.c.a.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null), (g.e.c.f) aVar.e(kotlin.jvm.internal.v.b(g.e.c.f.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null), (com.sensorberg.smartworkspace.app.screens.info.i) aVar.e(kotlin.jvm.internal.v.b(com.sensorberg.smartworkspace.app.screens.info.i.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null), (LiveData) aVar2.a());
            }
        }

        /* compiled from: AppModule.kt */
        static final class l1 extends kotlin.jvm.internal.l implements kotlin.e0.c.p<m.a.c.l.a, m.a.c.i.a, com.sensorberg.smartworkspace.app.screens.locker.delete.b> {

            /* renamed from: h  reason: collision with root package name */
            public static final l1 f7210h = new l1();

            l1() {
                super(2);
            }

            /* renamed from: a */
            public final com.sensorberg.smartworkspace.app.screens.locker.delete.b l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                kotlin.jvm.internal.k.e(aVar, "$receiver");
                kotlin.jvm.internal.k.e(aVar2, "it");
                return new com.sensorberg.smartworkspace.app.screens.locker.delete.b((g.e.n.g.c) aVar.e(kotlin.jvm.internal.v.b(g.e.n.g.c.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null));
            }
        }

        /* compiled from: AppModule.kt */
        static final class m extends kotlin.jvm.internal.l implements kotlin.e0.c.p<m.a.c.l.a, m.a.c.i.a, LockedState> {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ com.sensorberg.smartworkspace.app.utils.c f7211h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            m(com.sensorberg.smartworkspace.app.utils.c cVar) {
                super(2);
                this.f7211h = cVar;
            }

            /* renamed from: a */
            public final LockedState l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                kotlin.jvm.internal.k.e(aVar, "$receiver");
                kotlin.jvm.internal.k.e(aVar2, "it");
                long r = this.f7211h.r();
                androidx.lifecycle.v k2 = androidx.lifecycle.h0.k();
                kotlin.jvm.internal.k.d(k2, "ProcessLifecycleOwner.get()");
                return new LockedState(r, k2);
            }
        }

        /* compiled from: AppModule.kt */
        static final class m0 extends kotlin.jvm.internal.l implements kotlin.e0.c.p<m.a.c.l.a, m.a.c.i.a, com.sensorberg.smartworkspace.app.activities.permission.c> {

            /* renamed from: h  reason: collision with root package name */
            public static final m0 f7212h = new m0();

            m0() {
                super(2);
            }

            /* renamed from: a */
            public final com.sensorberg.smartworkspace.app.activities.permission.c l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                kotlin.jvm.internal.k.e(aVar, "$receiver");
                kotlin.jvm.internal.k.e(aVar2, "<name for destructuring parameter 0>");
                return new com.sensorberg.smartworkspace.app.activities.permission.c((g.e.n.g.y) aVar.e(kotlin.jvm.internal.v.b(g.e.n.g.y.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null), (LiveData) aVar2.a());
            }
        }

        /* compiled from: AppModule.kt */
        static final class m1 extends kotlin.jvm.internal.l implements kotlin.e0.c.p<m.a.c.l.a, m.a.c.i.a, com.sensorberg.smartworkspace.app.screens.alarm.l> {

            /* renamed from: h  reason: collision with root package name */
            public static final m1 f7213h = new m1();

            m1() {
                super(2);
            }

            /* renamed from: a */
            public final com.sensorberg.smartworkspace.app.screens.alarm.l l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                kotlin.jvm.internal.k.e(aVar, "$receiver");
                kotlin.jvm.internal.k.e(aVar2, "<name for destructuring parameter 0>");
                return new com.sensorberg.smartworkspace.app.screens.alarm.l((String) aVar2.a(), (g.e.n.g.f) aVar.e(kotlin.jvm.internal.v.b(g.e.n.g.f.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null), (com.sensorberg.smartworkspace.app.screens.alarm.b) aVar.e(kotlin.jvm.internal.v.b(com.sensorberg.smartworkspace.app.screens.alarm.b.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null), (g.e.a.b) aVar.e(kotlin.jvm.internal.v.b(g.e.a.b.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null), (com.sensorberg.smartworkspace.app.utils.c) aVar.e(kotlin.jvm.internal.v.b(com.sensorberg.smartworkspace.app.utils.c.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null));
            }
        }

        /* compiled from: AppModule.kt */
        static final class n extends kotlin.jvm.internal.l implements kotlin.e0.c.p<m.a.c.l.a, m.a.c.i.a, Vibrator> {

            /* renamed from: h  reason: collision with root package name */
            public static final n f7214h = new n();

            n() {
                super(2);
            }

            /* renamed from: a */
            public final Vibrator l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                kotlin.jvm.internal.k.e(aVar, "$receiver");
                kotlin.jvm.internal.k.e(aVar2, "it");
                Object systemService = ((Application) aVar.e(kotlin.jvm.internal.v.b(Application.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null)).getSystemService("vibrator");
                if (systemService != null) {
                    return (Vibrator) systemService;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.os.Vibrator");
            }
        }

        /* compiled from: AppModule.kt */
        static final class n0 extends kotlin.jvm.internal.l implements kotlin.e0.c.p<m.a.c.l.a, m.a.c.i.a, com.sensorberg.smartworkspace.app.activities.login.internal.a> {

            /* renamed from: h  reason: collision with root package name */
            public static final n0 f7215h = new n0();

            n0() {
                super(2);
            }

            /* renamed from: a */
            public final com.sensorberg.smartworkspace.app.activities.login.internal.a l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                kotlin.jvm.internal.k.e(aVar, "$receiver");
                kotlin.jvm.internal.k.e(aVar2, "it");
                return new com.sensorberg.smartworkspace.app.activities.login.internal.a((g.e.n.g.y) aVar.e(kotlin.jvm.internal.v.b(g.e.n.g.y.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null), (g.e.d.s.a) aVar.e(kotlin.jvm.internal.v.b(g.e.d.s.a.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null));
            }
        }

        /* compiled from: AppModule.kt */
        static final class n1 extends kotlin.jvm.internal.l implements kotlin.e0.c.p<m.a.c.l.a, m.a.c.i.a, g.e.n.g.s> {

            /* renamed from: h  reason: collision with root package name */
            public static final n1 f7216h = new n1();

            n1() {
                super(2);
            }

            /* renamed from: a */
            public final g.e.n.g.s l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                kotlin.jvm.internal.k.e(aVar, "$receiver");
                kotlin.jvm.internal.k.e(aVar2, "it");
                return com.sensorberg.smartworkspace.app.utils.o.a.a((Context) aVar.e(kotlin.jvm.internal.v.b(Context.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null), (com.sensorberg.smartworkspace.app.utils.c) aVar.e(kotlin.jvm.internal.v.b(com.sensorberg.smartworkspace.app.utils.c.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null));
            }
        }

        /* compiled from: AppModule.kt */
        static final class o extends kotlin.jvm.internal.l implements kotlin.e0.c.p<m.a.c.l.a, m.a.c.i.a, PackageManager> {

            /* renamed from: h  reason: collision with root package name */
            public static final o f7217h = new o();

            o() {
                super(2);
            }

            /* renamed from: a */
            public final PackageManager l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                kotlin.jvm.internal.k.e(aVar, "$receiver");
                kotlin.jvm.internal.k.e(aVar2, "it");
                return ((Application) aVar.e(kotlin.jvm.internal.v.b(Application.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null)).getPackageManager();
            }
        }

        /* compiled from: AppModule.kt */
        static final class o0 extends kotlin.jvm.internal.l implements kotlin.e0.c.p<m.a.c.l.a, m.a.c.i.a, com.sensorberg.smartworkspace.app.activities.login.external.a> {

            /* renamed from: h  reason: collision with root package name */
            public static final o0 f7218h = new o0();

            o0() {
                super(2);
            }

            /* renamed from: a */
            public final com.sensorberg.smartworkspace.app.activities.login.external.a l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                kotlin.jvm.internal.k.e(aVar, "$receiver");
                kotlin.jvm.internal.k.e(aVar2, "it");
                return new com.sensorberg.smartworkspace.app.activities.login.external.a((g.e.n.g.y) aVar.e(kotlin.jvm.internal.v.b(g.e.n.g.y.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null), (Resources) aVar.e(kotlin.jvm.internal.v.b(Resources.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null));
            }
        }

        /* compiled from: AppModule.kt */
        static final class o1 extends kotlin.jvm.internal.l implements kotlin.e0.c.p<m.a.c.l.a, m.a.c.i.a, com.sensorberg.smartworkspace.app.screens.settings.myrenz.c> {

            /* renamed from: h  reason: collision with root package name */
            public static final o1 f7219h = new o1();

            o1() {
                super(2);
            }

            /* renamed from: a */
            public final com.sensorberg.smartworkspace.app.screens.settings.myrenz.c l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                kotlin.jvm.internal.k.e(aVar, "$receiver");
                kotlin.jvm.internal.k.e(aVar2, "it");
                return new com.sensorberg.smartworkspace.app.screens.settings.myrenz.c((com.sensorberg.smartworkspace.app.screens.settings.myrenz.a) aVar.e(kotlin.jvm.internal.v.b(com.sensorberg.smartworkspace.app.screens.settings.myrenz.a.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null));
            }
        }

        /* compiled from: AppModule.kt */
        static final class p extends kotlin.jvm.internal.l implements kotlin.e0.c.p<m.a.c.l.a, m.a.c.i.a, com.sensorberg.smartworkspace.app.utils.n> {

            /* renamed from: h  reason: collision with root package name */
            public static final p f7220h = new p();

            p() {
                super(2);
            }

            /* renamed from: a */
            public final com.sensorberg.smartworkspace.app.utils.n l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                kotlin.jvm.internal.k.e(aVar, "$receiver");
                kotlin.jvm.internal.k.e(aVar2, "it");
                return new com.sensorberg.smartworkspace.app.utils.n();
            }
        }

        /* compiled from: AppModule.kt */
        static final class p0 extends kotlin.jvm.internal.l implements kotlin.e0.c.p<m.a.c.l.a, m.a.c.i.a, com.sensorberg.smartworkspace.app.activities.login.externalidentifier.a> {

            /* renamed from: h  reason: collision with root package name */
            public static final p0 f7221h = new p0();

            p0() {
                super(2);
            }

            /* renamed from: a */
            public final com.sensorberg.smartworkspace.app.activities.login.externalidentifier.a l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                kotlin.jvm.internal.k.e(aVar, "$receiver");
                kotlin.jvm.internal.k.e(aVar2, "it");
                return new com.sensorberg.smartworkspace.app.activities.login.externalidentifier.a((g.e.n.g.y) aVar.e(kotlin.jvm.internal.v.b(g.e.n.g.y.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null), (g.e.d.s.a) aVar.e(kotlin.jvm.internal.v.b(g.e.d.s.a.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null));
            }
        }

        /* compiled from: AppModule.kt */
        static final class p1 extends kotlin.jvm.internal.l implements kotlin.e0.c.p<m.a.c.l.a, m.a.c.i.a, com.sensorberg.smartworkspace.app.g> {

            /* renamed from: h  reason: collision with root package name */
            public static final p1 f7222h = new p1();

            p1() {
                super(2);
            }

            /* renamed from: a */
            public final com.sensorberg.smartworkspace.app.g l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                kotlin.jvm.internal.k.e(aVar, "$receiver");
                kotlin.jvm.internal.k.e(aVar2, "it");
                return new com.sensorberg.smartworkspace.app.f((g.e.n.g.s) aVar.e(kotlin.jvm.internal.v.b(g.e.n.g.s.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null));
            }
        }

        /* compiled from: AppModule.kt */
        static final class q extends kotlin.jvm.internal.l implements kotlin.e0.c.p<m.a.c.l.a, m.a.c.i.a, com.sensorberg.smartworkspace.app.screens.info.i> {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ com.sensorberg.smartworkspace.app.utils.c f7223h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            q(com.sensorberg.smartworkspace.app.utils.c cVar) {
                super(2);
                this.f7223h = cVar;
            }

            /* renamed from: a */
            public final com.sensorberg.smartworkspace.app.screens.info.i l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                g.e.j.a.d dVar;
                kotlin.jvm.internal.k.e(aVar, "$receiver");
                kotlin.jvm.internal.k.e(aVar2, "it");
                d.a a = g.e.j.a.d.b.a((Context) aVar.e(kotlin.jvm.internal.v.b(Context.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null));
                if (this.f7223h.I()) {
                    if (this.f7223h.E()) {
                        a.d();
                    }
                    a.f(this.f7223h.o());
                    a.e(this.f7223h.n());
                    dVar = a.b();
                } else {
                    dVar = a.c();
                }
                return new com.sensorberg.smartworkspace.app.screens.info.i((Context) aVar.e(kotlin.jvm.internal.v.b(Context.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null), (com.sensorberg.smartworkspace.app.screens.info.c) aVar.e(kotlin.jvm.internal.v.b(com.sensorberg.smartworkspace.app.screens.info.c.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null), dVar, (com.sensorberg.smartworkspace.app.utils.c) aVar.e(kotlin.jvm.internal.v.b(com.sensorberg.smartworkspace.app.utils.c.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null));
            }
        }

        /* compiled from: AppModule.kt */
        static final class q0 extends kotlin.jvm.internal.l implements kotlin.e0.c.p<m.a.c.l.a, m.a.c.i.a, com.sensorberg.smartworkspace.app.activities.pin.c> {

            /* renamed from: h  reason: collision with root package name */
            public static final q0 f7224h = new q0();

            q0() {
                super(2);
            }

            /* renamed from: a */
            public final com.sensorberg.smartworkspace.app.activities.pin.c l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                kotlin.jvm.internal.k.e(aVar, "$receiver");
                kotlin.jvm.internal.k.e(aVar2, "<name for destructuring parameter 0>");
                return new com.sensorberg.smartworkspace.app.activities.pin.c((com.sensorberg.smartworkspace.app.utils.j) aVar.e(kotlin.jvm.internal.v.b(com.sensorberg.smartworkspace.app.utils.j.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null), (Application) aVar.e(kotlin.jvm.internal.v.b(Application.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null), (g.e.n.g.y) aVar.e(kotlin.jvm.internal.v.b(g.e.n.g.y.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null), (LockedState) aVar.e(kotlin.jvm.internal.v.b(LockedState.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null), (c.a) aVar2.a());
            }
        }

        /* compiled from: AppModule.kt */
        static final class q1 extends kotlin.jvm.internal.l implements kotlin.e0.c.p<m.a.c.l.a, m.a.c.i.a, com.sensorberg.smartworkspace.app.screens.settings.myrenz.a> {

            /* renamed from: h  reason: collision with root package name */
            public static final q1 f7225h = new q1();

            q1() {
                super(2);
            }

            /* renamed from: a */
            public final com.sensorberg.smartworkspace.app.screens.settings.myrenz.a l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                kotlin.jvm.internal.k.e(aVar, "$receiver");
                kotlin.jvm.internal.k.e(aVar2, "it");
                return new com.sensorberg.smartworkspace.app.screens.settings.myrenz.b((com.sensorberg.smartworkspace.app.utils.l) aVar.e(kotlin.jvm.internal.v.b(com.sensorberg.smartworkspace.app.utils.l.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null));
            }
        }

        /* compiled from: AppModule.kt */
        static final class r extends kotlin.jvm.internal.l implements kotlin.e0.c.p<m.a.c.l.a, m.a.c.i.a, com.sensorberg.smartworkspace.app.screens.spaces.l> {

            /* renamed from: h  reason: collision with root package name */
            public static final r f7226h = new r();

            r() {
                super(2);
            }

            /* renamed from: a */
            public final com.sensorberg.smartworkspace.app.screens.spaces.l l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                kotlin.jvm.internal.k.e(aVar, "$receiver");
                kotlin.jvm.internal.k.e(aVar2, "it");
                return new com.sensorberg.smartworkspace.app.screens.spaces.l();
            }
        }

        /* compiled from: AppModule.kt */
        static final class r0 extends kotlin.jvm.internal.l implements kotlin.e0.c.p<m.a.c.l.a, m.a.c.i.a, g.e.c.f> {

            /* renamed from: h  reason: collision with root package name */
            public static final r0 f7227h = new r0();

            r0() {
                super(2);
            }

            /* renamed from: a */
            public final g.e.c.f l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                kotlin.jvm.internal.k.e(aVar, "$receiver");
                kotlin.jvm.internal.k.e(aVar2, "it");
                return new g.e.c.f((Context) aVar.e(kotlin.jvm.internal.v.b(Context.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null));
            }
        }

        /* compiled from: AppModule.kt */
        static final class r1 extends kotlin.jvm.internal.l implements kotlin.e0.c.p<m.a.c.l.a, m.a.c.i.a, h.f> {

            /* renamed from: h  reason: collision with root package name */
            public static final r1 f7228h = new r1();

            r1() {
                super(2);
            }

            /* renamed from: a */
            public final h.f l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                kotlin.jvm.internal.k.e(aVar, "$receiver");
                kotlin.jvm.internal.k.e(aVar2, "it");
                h.f.a aVar3 = new h.f.a();
                aVar3.b(false);
                aVar3.e(100);
                h.f a = aVar3.a();
                kotlin.jvm.internal.k.d(a, "PagedList.Config.Builder….PAGE_SIZE)\n\t\t\t\t\t.build()");
                return a;
            }
        }

        /* compiled from: AppModule.kt */
        static final class s extends kotlin.jvm.internal.l implements kotlin.e0.c.p<m.a.c.l.a, m.a.c.i.a, com.sensorberg.smartworkspace.app.screens.spaces.detail.o> {

            /* renamed from: h  reason: collision with root package name */
            public static final s f7229h = new s();

            s() {
                super(2);
            }

            /* renamed from: a */
            public final com.sensorberg.smartworkspace.app.screens.spaces.detail.o l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                kotlin.jvm.internal.k.e(aVar, "$receiver");
                kotlin.jvm.internal.k.e(aVar2, "it");
                return new com.sensorberg.smartworkspace.app.screens.spaces.detail.o((Resources) aVar.e(kotlin.jvm.internal.v.b(Resources.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null), (com.sensorberg.smartworkspace.app.screens.spaces.l) aVar.e(kotlin.jvm.internal.v.b(com.sensorberg.smartworkspace.app.screens.spaces.l.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null));
            }
        }

        /* compiled from: AppModule.kt */
        static final class s0 extends kotlin.jvm.internal.l implements kotlin.e0.c.p<m.a.c.l.a, m.a.c.i.a, com.sensorberg.smartworkspace.app.screens.door.e.b> {

            /* renamed from: h  reason: collision with root package name */
            public static final s0 f7230h = new s0();

            s0() {
                super(2);
            }

            /* renamed from: a */
            public final com.sensorberg.smartworkspace.app.screens.door.e.b l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                kotlin.jvm.internal.k.e(aVar, "$receiver");
                kotlin.jvm.internal.k.e(aVar2, "it");
                return new com.sensorberg.smartworkspace.app.screens.door.e.b((g.e.n.g.s) aVar.e(kotlin.jvm.internal.v.b(g.e.n.g.s.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null), new Handler(Looper.getMainLooper()));
            }
        }

        /* compiled from: AppModule.kt */
        static final class s1 extends kotlin.jvm.internal.l implements kotlin.e0.c.p<m.a.c.l.a, m.a.c.i.a, g.e.d.g> {

            /* renamed from: h  reason: collision with root package name */
            public static final s1 f7231h = new s1();

            s1() {
                super(2);
            }

            /* renamed from: a */
            public final g.e.d.g l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                kotlin.jvm.internal.k.e(aVar, "$receiver");
                kotlin.jvm.internal.k.e(aVar2, "it");
                return new com.sensorberg.smartworkspace.app.e();
            }
        }

        /* compiled from: AppModule.kt */
        static final class t extends kotlin.jvm.internal.l implements kotlin.e0.c.p<m.a.c.l.a, m.a.c.i.a, com.sensorberg.smartworkspace.app.screens.spaces.detail.f> {

            /* renamed from: h  reason: collision with root package name */
            public static final t f7232h = new t();

            t() {
                super(2);
            }

            /* renamed from: a */
            public final com.sensorberg.smartworkspace.app.screens.spaces.detail.f l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                kotlin.jvm.internal.k.e(aVar, "$receiver");
                kotlin.jvm.internal.k.e(aVar2, "it");
                return new com.sensorberg.smartworkspace.app.screens.spaces.detail.f((Resources) aVar.e(kotlin.jvm.internal.v.b(Resources.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null));
            }
        }

        /* compiled from: AppModule.kt */
        static final class t0 extends kotlin.jvm.internal.l implements kotlin.e0.c.p<m.a.c.l.a, m.a.c.i.a, com.sensorberg.smartworkspace.app.screens.door.d.e> {

            /* renamed from: h  reason: collision with root package name */
            public static final t0 f7233h = new t0();

            t0() {
                super(2);
            }

            /* renamed from: a */
            public final com.sensorberg.smartworkspace.app.screens.door.d.e l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                kotlin.jvm.internal.k.e(aVar, "$receiver");
                kotlin.jvm.internal.k.e(aVar2, "it");
                return new com.sensorberg.smartworkspace.app.screens.door.d.e((com.sensorberg.smartworkspace.app.utils.e) aVar.e(kotlin.jvm.internal.v.b(com.sensorberg.smartworkspace.app.utils.e.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null), (g.e.n.g.x) aVar.e(kotlin.jvm.internal.v.b(g.e.n.g.x.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null));
            }
        }

        /* compiled from: AppModule.kt */
        static final class t1 extends kotlin.jvm.internal.l implements kotlin.e0.c.p<m.a.c.l.a, m.a.c.i.a, g.e.d.r.a> {

            /* renamed from: h  reason: collision with root package name */
            public static final t1 f7234h = new t1();

            t1() {
                super(2);
            }

            /* renamed from: a */
            public final g.e.d.r.a l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                kotlin.jvm.internal.k.e(aVar, "$receiver");
                kotlin.jvm.internal.k.e(aVar2, "it");
                return new g.e.d.r.b();
            }
        }

        /* compiled from: AppModule.kt */
        static final class u extends kotlin.jvm.internal.l implements kotlin.e0.c.p<m.a.c.l.a, m.a.c.i.a, com.sensorberg.smartworkspace.app.utils.i> {

            /* renamed from: h  reason: collision with root package name */
            public static final u f7235h = new u();

            u() {
                super(2);
            }

            /* renamed from: a */
            public final com.sensorberg.smartworkspace.app.utils.i l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                kotlin.jvm.internal.k.e(aVar, "$receiver");
                kotlin.jvm.internal.k.e(aVar2, "it");
                androidx.lifecycle.v k2 = androidx.lifecycle.h0.k();
                kotlin.jvm.internal.k.d(k2, "ProcessLifecycleOwner.get()");
                return new com.sensorberg.smartworkspace.app.utils.i((g.e.n.g.s) aVar.e(kotlin.jvm.internal.v.b(g.e.n.g.s.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null), k2, (com.sensorberg.smartworkspace.app.utils.l) aVar.e(kotlin.jvm.internal.v.b(com.sensorberg.smartworkspace.app.utils.l.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null));
            }
        }

        /* compiled from: AppModule.kt */
        static final class u0 extends kotlin.jvm.internal.l implements kotlin.e0.c.p<m.a.c.l.a, m.a.c.i.a, com.sensorberg.smartworkspace.app.screens.info.h> {

            /* renamed from: h  reason: collision with root package name */
            public static final u0 f7236h = new u0();

            u0() {
                super(2);
            }

            /* renamed from: a */
            public final com.sensorberg.smartworkspace.app.screens.info.h l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                kotlin.jvm.internal.k.e(aVar, "$receiver");
                kotlin.jvm.internal.k.e(aVar2, "it");
                return new com.sensorberg.smartworkspace.app.screens.info.h((Resources) aVar.e(kotlin.jvm.internal.v.b(Resources.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null), (com.sensorberg.smartworkspace.app.utils.i) aVar.e(kotlin.jvm.internal.v.b(com.sensorberg.smartworkspace.app.utils.i.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null), (com.sensorberg.smartworkspace.app.screens.info.c) aVar.e(kotlin.jvm.internal.v.b(com.sensorberg.smartworkspace.app.screens.info.c.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null));
            }
        }

        /* compiled from: AppModule.kt */
        static final class u1 extends kotlin.jvm.internal.l implements kotlin.e0.c.p<m.a.c.l.a, m.a.c.i.a, g.e.n.g.c> {

            /* renamed from: h  reason: collision with root package name */
            public static final u1 f7237h = new u1();

            u1() {
                super(2);
            }

            /* renamed from: a */
            public final g.e.n.g.c l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                kotlin.jvm.internal.k.e(aVar, "$receiver");
                kotlin.jvm.internal.k.e(aVar2, "it");
                return ((g.e.n.g.s) aVar.e(kotlin.jvm.internal.v.b(g.e.n.g.s.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null)).l();
            }
        }

        /* compiled from: AppModule.kt */
        static final class v extends kotlin.jvm.internal.l implements kotlin.e0.c.p<m.a.c.l.a, m.a.c.i.a, Resources> {

            /* renamed from: h  reason: collision with root package name */
            public static final v f7238h = new v();

            v() {
                super(2);
            }

            /* renamed from: a */
            public final Resources l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                kotlin.jvm.internal.k.e(aVar, "$receiver");
                kotlin.jvm.internal.k.e(aVar2, "it");
                return ((Application) aVar.e(kotlin.jvm.internal.v.b(Application.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null)).getResources();
            }
        }

        /* compiled from: AppModule.kt */
        static final class v0 extends kotlin.jvm.internal.l implements kotlin.e0.c.p<m.a.c.l.a, m.a.c.i.a, com.sensorberg.smartworkspace.app.screens.settings.c> {

            /* renamed from: h  reason: collision with root package name */
            public static final v0 f7239h = new v0();

            v0() {
                super(2);
            }

            /* renamed from: a */
            public final com.sensorberg.smartworkspace.app.screens.settings.c l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                kotlin.jvm.internal.k.e(aVar, "$receiver");
                kotlin.jvm.internal.k.e(aVar2, "it");
                return new com.sensorberg.smartworkspace.app.screens.settings.c((com.sensorberg.smartworkspace.app.utils.j) aVar.e(kotlin.jvm.internal.v.b(com.sensorberg.smartworkspace.app.utils.j.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null), (com.sensorberg.smartworkspace.app.utils.c) aVar.e(kotlin.jvm.internal.v.b(com.sensorberg.smartworkspace.app.utils.c.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null), (g.e.n.g.y) aVar.e(kotlin.jvm.internal.v.b(g.e.n.g.y.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null), (com.sensorberg.smartworkspace.app.utils.l) aVar.e(kotlin.jvm.internal.v.b(com.sensorberg.smartworkspace.app.utils.l.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null));
            }
        }

        /* compiled from: AppModule.kt */
        static final class v1 extends kotlin.jvm.internal.l implements kotlin.e0.c.p<m.a.c.l.a, m.a.c.i.a, g.e.n.g.x> {

            /* renamed from: h  reason: collision with root package name */
            public static final v1 f7240h = new v1();

            v1() {
                super(2);
            }

            /* renamed from: a */
            public final g.e.n.g.x l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                kotlin.jvm.internal.k.e(aVar, "$receiver");
                kotlin.jvm.internal.k.e(aVar2, "it");
                return ((g.e.n.g.s) aVar.e(kotlin.jvm.internal.v.b(g.e.n.g.s.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null)).i();
            }
        }

        /* compiled from: AppModule.kt */
        static final class w extends kotlin.jvm.internal.l implements kotlin.e0.c.p<m.a.c.l.a, m.a.c.i.a, com.sensorberg.smartworkspace.app.utils.g> {

            /* renamed from: h  reason: collision with root package name */
            public static final w f7241h = new w();

            w() {
                super(2);
            }

            /* renamed from: a */
            public final com.sensorberg.smartworkspace.app.utils.g l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                kotlin.jvm.internal.k.e(aVar, "$receiver");
                kotlin.jvm.internal.k.e(aVar2, "it");
                return new com.sensorberg.smartworkspace.app.utils.g((kotlin.e0.c.a) null, 1, (DefaultConstructorMarker) null);
            }
        }

        /* compiled from: AppModule.kt */
        static final class w0 extends kotlin.jvm.internal.l implements kotlin.e0.c.p<m.a.c.l.a, m.a.c.i.a, com.sensorberg.smartworkspace.app.screens.locker.c> {

            /* renamed from: h  reason: collision with root package name */
            public static final w0 f7242h = new w0();

            w0() {
                super(2);
            }

            /* renamed from: a */
            public final com.sensorberg.smartworkspace.app.screens.locker.c l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                kotlin.jvm.internal.k.e(aVar, "$receiver");
                kotlin.jvm.internal.k.e(aVar2, "it");
                return new com.sensorberg.smartworkspace.app.screens.locker.c((g.e.n.g.s) aVar.e(kotlin.jvm.internal.v.b(g.e.n.g.s.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null), com.sensorberg.smartworkspace.app.utils.b.a.a((g.e.n.g.x) aVar.e(kotlin.jvm.internal.v.b(g.e.n.g.x.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null)), new Handler(Looper.getMainLooper()));
            }
        }

        /* compiled from: AppModule.kt */
        static final class w1 extends kotlin.jvm.internal.l implements kotlin.e0.c.p<m.a.c.l.a, m.a.c.i.a, g.e.n.g.y> {

            /* renamed from: h  reason: collision with root package name */
            public static final w1 f7243h = new w1();

            w1() {
                super(2);
            }

            /* renamed from: a */
            public final g.e.n.g.y l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                kotlin.jvm.internal.k.e(aVar, "$receiver");
                kotlin.jvm.internal.k.e(aVar2, "it");
                return ((g.e.n.g.s) aVar.e(kotlin.jvm.internal.v.b(g.e.n.g.s.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null)).f();
            }
        }

        /* compiled from: AppModule.kt */
        static final class x extends kotlin.jvm.internal.l implements kotlin.e0.c.p<m.a.c.l.a, m.a.c.i.a, Handler> {

            /* renamed from: h  reason: collision with root package name */
            public static final x f7244h = new x();

            x() {
                super(2);
            }

            /* renamed from: a */
            public final Handler l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                kotlin.jvm.internal.k.e(aVar, "$receiver");
                kotlin.jvm.internal.k.e(aVar2, "<name for destructuring parameter 0>");
                return ((com.sensorberg.smartworkspace.app.utils.g) aVar.e(kotlin.jvm.internal.v.b(com.sensorberg.smartworkspace.app.utils.g.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null)).a((androidx.lifecycle.v) aVar2.a());
            }
        }

        /* compiled from: AppModule.kt */
        static final class x0 extends kotlin.jvm.internal.l implements kotlin.e0.c.p<m.a.c.l.a, m.a.c.i.a, com.sensorberg.smartworkspace.app.screens.locker.selection.f> {

            /* renamed from: h  reason: collision with root package name */
            public static final x0 f7245h = new x0();

            x0() {
                super(2);
            }

            /* renamed from: a */
            public final com.sensorberg.smartworkspace.app.screens.locker.selection.f l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                kotlin.jvm.internal.k.e(aVar, "$receiver");
                kotlin.jvm.internal.k.e(aVar2, "<name for destructuring parameter 0>");
                return new com.sensorberg.smartworkspace.app.screens.locker.selection.f((com.sensorberg.smartworkspace.app.utils.s) aVar2.a(), (g.e.n.g.x) aVar.e(kotlin.jvm.internal.v.b(g.e.n.g.x.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null), (g.e.n.g.c) aVar.e(kotlin.jvm.internal.v.b(g.e.n.g.c.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null));
            }
        }

        /* compiled from: AppModule.kt */
        static final class y extends kotlin.jvm.internal.l implements kotlin.e0.c.p<m.a.c.l.a, m.a.c.i.a, com.sensorberg.smartworkspace.app.utils.r> {

            /* renamed from: h  reason: collision with root package name */
            public static final y f7246h = new y();

            y() {
                super(2);
            }

            /* renamed from: a */
            public final com.sensorberg.smartworkspace.app.utils.r l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                kotlin.jvm.internal.k.e(aVar, "$receiver");
                kotlin.jvm.internal.k.e(aVar2, "it");
                return new com.sensorberg.smartworkspace.app.utils.r();
            }
        }

        /* compiled from: AppModule.kt */
        static final class y0 extends kotlin.jvm.internal.l implements kotlin.e0.c.p<m.a.c.l.a, m.a.c.i.a, com.sensorberg.smartworkspace.app.screens.locker.selection.b> {

            /* renamed from: h  reason: collision with root package name */
            public static final y0 f7247h = new y0();

            y0() {
                super(2);
            }

            /* renamed from: a */
            public final com.sensorberg.smartworkspace.app.screens.locker.selection.b l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                kotlin.jvm.internal.k.e(aVar, "$receiver");
                kotlin.jvm.internal.k.e(aVar2, "it");
                return new com.sensorberg.smartworkspace.app.screens.locker.selection.b((g.e.n.g.s) aVar.e(kotlin.jvm.internal.v.b(g.e.n.g.s.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null), com.sensorberg.smartworkspace.app.utils.b.a.a((g.e.n.g.x) aVar.e(kotlin.jvm.internal.v.b(g.e.n.g.x.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null)));
            }
        }

        /* compiled from: AppModule.kt */
        static final class z extends kotlin.jvm.internal.l implements kotlin.e0.c.p<m.a.c.l.a, m.a.c.i.a, g.e.a.b> {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ com.sensorberg.smartworkspace.app.utils.c f7248h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            z(com.sensorberg.smartworkspace.app.utils.c cVar) {
                super(2);
                this.f7248h = cVar;
            }

            /* renamed from: a */
            public final g.e.a.b l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                kotlin.jvm.internal.k.e(aVar, "$receiver");
                kotlin.jvm.internal.k.e(aVar2, "it");
                return new com.sensorberg.smartworkspace.app.screens.alarm.k((Context) aVar.e(kotlin.jvm.internal.v.b(Application.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null), new com.sensorberg.smartworkspace.app.screens.alarm.i((Resources) aVar.e(kotlin.jvm.internal.v.b(Resources.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null), (com.sensorberg.smartworkspace.app.screens.alarm.p) aVar.e(kotlin.jvm.internal.v.b(com.sensorberg.smartworkspace.app.screens.alarm.p.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null)), b.C0654b.a, this.f7248h).a();
            }
        }

        /* compiled from: AppModule.kt */
        static final class z0 extends kotlin.jvm.internal.l implements kotlin.e0.c.p<m.a.c.l.a, m.a.c.i.a, com.sensorberg.smartworkspace.app.screens.locker.create.c> {

            /* renamed from: h  reason: collision with root package name */
            public static final z0 f7249h = new z0();

            z0() {
                super(2);
            }

            /* renamed from: a */
            public final com.sensorberg.smartworkspace.app.screens.locker.create.c l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                kotlin.jvm.internal.k.e(aVar, "$receiver");
                kotlin.jvm.internal.k.e(aVar2, "<name for destructuring parameter 0>");
                return new com.sensorberg.smartworkspace.app.screens.locker.create.c((LockerGroupSelection) aVar2.a(), (g.e.n.g.c) aVar.e(kotlin.jvm.internal.v.b(g.e.n.g.c.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null), (IotUnit) aVar2.b());
            }
        }

        a() {
            super(1);
        }

        public final void a(m.a.c.h.a aVar) {
            kotlin.jvm.internal.k.e(aVar, "$receiver");
            com.sensorberg.smartworkspace.app.utils.c cVar = new com.sensorberg.smartworkspace.app.utils.c();
            k kVar = new k(cVar);
            m.a.c.e.c cVar2 = m.a.c.e.c.a;
            m.a.c.e.d dVar = m.a.c.e.d.Single;
            m.a.c.e.b bVar = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, kotlin.jvm.internal.v.b(com.sensorberg.smartworkspace.app.utils.c.class));
            bVar.n(kVar);
            bVar.o(dVar);
            aVar.a(bVar, new m.a.c.e.e(false, false));
            v vVar = v.f7238h;
            m.a.c.e.c cVar3 = m.a.c.e.c.a;
            m.a.c.e.d dVar2 = m.a.c.e.d.Single;
            m.a.c.e.b bVar2 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, kotlin.jvm.internal.v.b(Resources.class));
            bVar2.n(vVar);
            bVar2.o(dVar2);
            aVar.a(bVar2, new m.a.c.e.e(false, false));
            g0 g0Var = g0.f7194h;
            m.a.c.e.c cVar4 = m.a.c.e.c.a;
            m.a.c.e.d dVar3 = m.a.c.e.d.Single;
            m.a.c.e.b bVar3 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, kotlin.jvm.internal.v.b(g.e.c.a.class));
            bVar3.n(g0Var);
            bVar3.o(dVar3);
            aVar.a(bVar3, new m.a.c.e.e(false, false));
            r0 r0Var = r0.f7227h;
            m.a.c.e.c cVar5 = m.a.c.e.c.a;
            m.a.c.e.d dVar4 = m.a.c.e.d.Single;
            m.a.c.e.b bVar4 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, kotlin.jvm.internal.v.b(g.e.c.f.class));
            bVar4.n(r0Var);
            bVar4.o(dVar4);
            aVar.a(bVar4, new m.a.c.e.e(false, false));
            c1 c1Var = c1.f7183h;
            m.a.c.e.c cVar6 = m.a.c.e.c.a;
            m.a.c.e.d dVar5 = m.a.c.e.d.Single;
            m.a.c.e.b bVar5 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, kotlin.jvm.internal.v.b(com.sensorberg.encryptor.d.class));
            bVar5.n(c1Var);
            bVar5.o(dVar5);
            aVar.a(bVar5, new m.a.c.e.e(false, false));
            n1 n1Var = n1.f7216h;
            m.a.c.e.c cVar7 = m.a.c.e.c.a;
            m.a.c.e.d dVar6 = m.a.c.e.d.Single;
            m.a.c.e.b bVar6 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, kotlin.jvm.internal.v.b(g.e.n.g.s.class));
            bVar6.n(n1Var);
            bVar6.o(dVar6);
            aVar.a(bVar6, new m.a.c.e.e(false, false));
            u1 u1Var = u1.f7237h;
            m.a.c.e.c cVar8 = m.a.c.e.c.a;
            m.a.c.e.d dVar7 = m.a.c.e.d.Factory;
            m.a.c.e.b bVar7 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, kotlin.jvm.internal.v.b(g.e.n.g.c.class));
            bVar7.n(u1Var);
            bVar7.o(dVar7);
            aVar.a(bVar7, new m.a.c.e.e(false, false, 1, (DefaultConstructorMarker) null));
            v1 v1Var = v1.f7240h;
            m.a.c.e.c cVar9 = m.a.c.e.c.a;
            m.a.c.e.d dVar8 = m.a.c.e.d.Factory;
            m.a.c.e.b bVar8 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, kotlin.jvm.internal.v.b(g.e.n.g.x.class));
            bVar8.n(v1Var);
            bVar8.o(dVar8);
            aVar.a(bVar8, new m.a.c.e.e(false, false, 1, (DefaultConstructorMarker) null));
            w1 w1Var = w1.f7243h;
            m.a.c.e.c cVar10 = m.a.c.e.c.a;
            m.a.c.e.d dVar9 = m.a.c.e.d.Factory;
            m.a.c.e.b bVar9 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, kotlin.jvm.internal.v.b(g.e.n.g.y.class));
            bVar9.n(w1Var);
            bVar9.o(dVar9);
            aVar.a(bVar9, new m.a.c.e.e(false, false, 1, (DefaultConstructorMarker) null));
            C0474a aVar2 = C0474a.f7175h;
            m.a.c.e.c cVar11 = m.a.c.e.c.a;
            m.a.c.e.d dVar10 = m.a.c.e.d.Factory;
            m.a.c.e.b bVar10 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, kotlin.jvm.internal.v.b(g.e.n.g.g.class));
            bVar10.n(aVar2);
            bVar10.o(dVar10);
            aVar.a(bVar10, new m.a.c.e.e(false, false, 1, (DefaultConstructorMarker) null));
            C0475b bVar11 = C0475b.f7178h;
            m.a.c.e.c cVar12 = m.a.c.e.c.a;
            m.a.c.e.d dVar11 = m.a.c.e.d.Factory;
            m.a.c.e.b bVar12 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, kotlin.jvm.internal.v.b(g.e.n.g.f.class));
            bVar12.n(bVar11);
            bVar12.o(dVar11);
            aVar.a(bVar12, new m.a.c.e.e(false, false, 1, (DefaultConstructorMarker) null));
            c cVar13 = c.f7181h;
            m.a.c.e.c cVar14 = m.a.c.e.c.a;
            m.a.c.e.d dVar12 = m.a.c.e.d.Factory;
            m.a.c.e.b bVar13 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, kotlin.jvm.internal.v.b(g.e.n.g.v.class));
            bVar13.n(cVar13);
            bVar13.o(dVar12);
            aVar.a(bVar13, new m.a.c.e.e(false, false, 1, (DefaultConstructorMarker) null));
            d dVar13 = d.f7184h;
            m.a.c.e.c cVar15 = m.a.c.e.c.a;
            m.a.c.e.d dVar14 = m.a.c.e.d.Factory;
            m.a.c.e.b bVar14 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, kotlin.jvm.internal.v.b(g.e.n.g.a.class));
            bVar14.n(dVar13);
            bVar14.o(dVar14);
            aVar.a(bVar14, new m.a.c.e.e(false, false, 1, (DefaultConstructorMarker) null));
            e eVar = e.f7187h;
            m.a.c.e.c cVar16 = m.a.c.e.c.a;
            m.a.c.e.d dVar15 = m.a.c.e.d.Factory;
            m.a.c.e.b bVar15 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, kotlin.jvm.internal.v.b(g.e.n.g.j.class));
            bVar15.n(eVar);
            bVar15.o(dVar15);
            aVar.a(bVar15, new m.a.c.e.e(false, false, 1, (DefaultConstructorMarker) null));
            f fVar = f.f7190h;
            m.a.c.e.c cVar17 = m.a.c.e.c.a;
            m.a.c.e.d dVar16 = m.a.c.e.d.Single;
            m.a.c.e.b bVar16 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, kotlin.jvm.internal.v.b(com.sensorberg.smartworkspace.app.utils.j.class));
            bVar16.n(fVar);
            bVar16.o(dVar16);
            aVar.a(bVar16, new m.a.c.e.e(false, false));
            g gVar = g.f7193h;
            m.a.c.e.c cVar18 = m.a.c.e.c.a;
            m.a.c.e.d dVar17 = m.a.c.e.d.Single;
            m.a.c.e.b bVar17 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, kotlin.jvm.internal.v.b(com.sensorberg.smartworkspace.app.screens.info.c.class));
            bVar17.n(gVar);
            bVar17.o(dVar17);
            aVar.a(bVar17, new m.a.c.e.e(false, false));
            h hVar = h.f7196h;
            m.a.c.e.c cVar19 = m.a.c.e.c.a;
            m.a.c.e.d dVar18 = m.a.c.e.d.Single;
            m.a.c.e.b bVar18 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, kotlin.jvm.internal.v.b(g.e.p.c.a.class));
            bVar18.n(hVar);
            bVar18.o(dVar18);
            aVar.a(bVar18, new m.a.c.e.e(false, false));
            i iVar = i.f7199h;
            m.a.c.e.c cVar20 = m.a.c.e.c.a;
            m.a.c.e.d dVar19 = m.a.c.e.d.Single;
            m.a.c.e.b bVar19 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, kotlin.jvm.internal.v.b(com.sensorberg.smartworkspace.app.utils.l.class));
            bVar19.n(iVar);
            bVar19.o(dVar19);
            aVar.a(bVar19, new m.a.c.e.e(false, false));
            j jVar = j.f7202h;
            m.a.c.e.c cVar21 = m.a.c.e.c.a;
            m.a.c.e.d dVar20 = m.a.c.e.d.Single;
            m.a.c.e.b bVar20 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, kotlin.jvm.internal.v.b(com.sensorberg.smartworkspace.app.utils.e.class));
            bVar20.n(jVar);
            bVar20.o(dVar20);
            aVar.a(bVar20, new m.a.c.e.e(false, false));
            l lVar = l.f7208h;
            m.a.c.e.c cVar22 = m.a.c.e.c.a;
            m.a.c.e.d dVar21 = m.a.c.e.d.Single;
            m.a.c.e.b bVar21 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, kotlin.jvm.internal.v.b(com.sensorberg.smartworkspace.app.utils.f.class));
            bVar21.n(lVar);
            bVar21.o(dVar21);
            aVar.a(bVar21, new m.a.c.e.e(false, false));
            m mVar = new m(cVar);
            m.a.c.e.c cVar23 = m.a.c.e.c.a;
            m.a.c.e.d dVar22 = m.a.c.e.d.Single;
            m.a.c.e.b bVar22 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, kotlin.jvm.internal.v.b(LockedState.class));
            bVar22.n(mVar);
            bVar22.o(dVar22);
            aVar.a(bVar22, new m.a.c.e.e(false, false));
            n nVar = n.f7214h;
            m.a.c.e.c cVar24 = m.a.c.e.c.a;
            m.a.c.e.d dVar23 = m.a.c.e.d.Single;
            m.a.c.e.b bVar23 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, kotlin.jvm.internal.v.b(Vibrator.class));
            bVar23.n(nVar);
            bVar23.o(dVar23);
            aVar.a(bVar23, new m.a.c.e.e(false, false));
            o oVar = o.f7217h;
            m.a.c.e.c cVar25 = m.a.c.e.c.a;
            m.a.c.e.d dVar24 = m.a.c.e.d.Single;
            m.a.c.e.b bVar24 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, kotlin.jvm.internal.v.b(PackageManager.class));
            bVar24.n(oVar);
            bVar24.o(dVar24);
            aVar.a(bVar24, new m.a.c.e.e(false, false));
            p pVar = p.f7220h;
            m.a.c.e.c cVar26 = m.a.c.e.c.a;
            m.a.c.e.d dVar25 = m.a.c.e.d.Single;
            m.a.c.e.b bVar25 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, kotlin.jvm.internal.v.b(com.sensorberg.smartworkspace.app.utils.n.class));
            bVar25.n(pVar);
            bVar25.o(dVar25);
            aVar.a(bVar25, new m.a.c.e.e(false, false));
            q qVar = new q(cVar);
            m.a.c.e.c cVar27 = m.a.c.e.c.a;
            m.a.c.e.d dVar26 = m.a.c.e.d.Single;
            m.a.c.e.b bVar26 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, kotlin.jvm.internal.v.b(com.sensorberg.smartworkspace.app.screens.info.i.class));
            bVar26.n(qVar);
            bVar26.o(dVar26);
            aVar.a(bVar26, new m.a.c.e.e(false, false));
            r rVar = r.f7226h;
            m.a.c.e.c cVar28 = m.a.c.e.c.a;
            m.a.c.e.d dVar27 = m.a.c.e.d.Single;
            m.a.c.e.b bVar27 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, kotlin.jvm.internal.v.b(com.sensorberg.smartworkspace.app.screens.spaces.l.class));
            bVar27.n(rVar);
            bVar27.o(dVar27);
            aVar.a(bVar27, new m.a.c.e.e(false, false));
            s sVar = s.f7229h;
            m.a.c.e.c cVar29 = m.a.c.e.c.a;
            m.a.c.e.d dVar28 = m.a.c.e.d.Single;
            m.a.c.e.b bVar28 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, kotlin.jvm.internal.v.b(com.sensorberg.smartworkspace.app.screens.spaces.detail.o.class));
            bVar28.n(sVar);
            bVar28.o(dVar28);
            aVar.a(bVar28, new m.a.c.e.e(false, false));
            t tVar = t.f7232h;
            m.a.c.e.c cVar30 = m.a.c.e.c.a;
            m.a.c.e.d dVar29 = m.a.c.e.d.Single;
            m.a.c.e.b bVar29 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, kotlin.jvm.internal.v.b(com.sensorberg.smartworkspace.app.screens.spaces.detail.f.class));
            bVar29.n(tVar);
            bVar29.o(dVar29);
            aVar.a(bVar29, new m.a.c.e.e(false, false));
            u uVar = u.f7235h;
            m.a.c.e.c cVar31 = m.a.c.e.c.a;
            m.a.c.e.d dVar30 = m.a.c.e.d.Single;
            m.a.c.e.b bVar30 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, kotlin.jvm.internal.v.b(com.sensorberg.smartworkspace.app.utils.i.class));
            bVar30.n(uVar);
            bVar30.o(dVar30);
            aVar.a(bVar30, new m.a.c.e.e(false, false));
            w wVar = w.f7241h;
            m.a.c.e.c cVar32 = m.a.c.e.c.a;
            m.a.c.e.d dVar31 = m.a.c.e.d.Single;
            m.a.c.e.b bVar31 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, kotlin.jvm.internal.v.b(com.sensorberg.smartworkspace.app.utils.g.class));
            bVar31.n(wVar);
            bVar31.o(dVar31);
            aVar.a(bVar31, new m.a.c.e.e(false, false));
            x xVar = x.f7244h;
            m.a.c.e.c cVar33 = m.a.c.e.c.a;
            m.a.c.e.d dVar32 = m.a.c.e.d.Factory;
            m.a.c.e.b bVar32 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, kotlin.jvm.internal.v.b(Handler.class));
            bVar32.n(xVar);
            bVar32.o(dVar32);
            aVar.a(bVar32, new m.a.c.e.e(false, false, 1, (DefaultConstructorMarker) null));
            y yVar = y.f7246h;
            m.a.c.e.c cVar34 = m.a.c.e.c.a;
            m.a.c.e.d dVar33 = m.a.c.e.d.Factory;
            m.a.c.e.b bVar33 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, kotlin.jvm.internal.v.b(com.sensorberg.smartworkspace.app.utils.r.class));
            bVar33.n(yVar);
            bVar33.o(dVar33);
            aVar.a(bVar33, new m.a.c.e.e(false, false, 1, (DefaultConstructorMarker) null));
            z zVar = new z(cVar);
            m.a.c.e.c cVar35 = m.a.c.e.c.a;
            m.a.c.e.d dVar34 = m.a.c.e.d.Single;
            m.a.c.e.b bVar34 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, kotlin.jvm.internal.v.b(g.e.a.b.class));
            bVar34.n(zVar);
            bVar34.o(dVar34);
            aVar.a(bVar34, new m.a.c.e.e(false, false));
            a0 a0Var = new a0(cVar);
            m.a.c.e.c cVar36 = m.a.c.e.c.a;
            m.a.c.e.d dVar35 = m.a.c.e.d.Single;
            m.a.c.e.b bVar35 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, kotlin.jvm.internal.v.b(com.sensorberg.smartworkspace.app.screens.alarm.b.class));
            bVar35.n(a0Var);
            bVar35.o(dVar35);
            aVar.a(bVar35, new m.a.c.e.e(false, false));
            b0 b0Var = b0.f7179h;
            m.a.c.e.c cVar37 = m.a.c.e.c.a;
            m.a.c.e.d dVar36 = m.a.c.e.d.Single;
            m.a.c.e.b bVar36 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, kotlin.jvm.internal.v.b(com.sensorberg.smartworkspace.app.screens.alarm.j.class));
            bVar36.n(b0Var);
            bVar36.o(dVar36);
            aVar.a(bVar36, new m.a.c.e.e(false, false));
            c0 c0Var = c0.f7182h;
            m.a.c.e.c cVar38 = m.a.c.e.c.a;
            m.a.c.e.d dVar37 = m.a.c.e.d.Factory;
            m.a.c.e.b bVar37 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, kotlin.jvm.internal.v.b(com.sensorberg.smartworkspace.app.screens.spaces.iotdetails.f.c.class));
            bVar37.n(c0Var);
            bVar37.o(dVar37);
            aVar.a(bVar37, new m.a.c.e.e(false, false, 1, (DefaultConstructorMarker) null));
            d0 d0Var = d0.f7185h;
            m.a.c.e.c cVar39 = m.a.c.e.c.a;
            m.a.c.e.d dVar38 = m.a.c.e.d.Factory;
            m.a.c.e.b bVar38 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, kotlin.jvm.internal.v.b(com.sensorberg.smartworkspace.app.screens.spaces.iotdetails.f.f.class));
            bVar38.n(d0Var);
            bVar38.o(dVar38);
            aVar.a(bVar38, new m.a.c.e.e(false, false, 1, (DefaultConstructorMarker) null));
            e0 e0Var = e0.f7188h;
            m.a.c.e.c cVar40 = m.a.c.e.c.a;
            m.a.c.e.d dVar39 = m.a.c.e.d.Factory;
            m.a.c.e.b bVar39 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, kotlin.jvm.internal.v.b(com.sensorberg.smartworkspace.app.screens.spaces.iotdetails.f.e.class));
            bVar39.n(e0Var);
            bVar39.o(dVar39);
            aVar.a(bVar39, new m.a.c.e.e(false, false, 1, (DefaultConstructorMarker) null));
            f0 f0Var = f0.f7191h;
            m.a.c.e.c cVar41 = m.a.c.e.c.a;
            m.a.c.e.d dVar40 = m.a.c.e.d.Factory;
            m.a.c.e.b bVar40 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, kotlin.jvm.internal.v.b(com.sensorberg.smartworkspace.app.screens.spaces.iotdetails.f.a.class));
            bVar40.n(f0Var);
            bVar40.o(dVar40);
            aVar.a(bVar40, new m.a.c.e.e(false, false, 1, (DefaultConstructorMarker) null));
            h0 h0Var = h0.f7197h;
            m.a.c.e.c cVar42 = m.a.c.e.c.a;
            m.a.c.e.d dVar41 = m.a.c.e.d.Factory;
            m.a.c.e.b bVar41 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, kotlin.jvm.internal.v.b(com.sensorberg.smartworkspace.app.screens.spaces.iotdetails.f.b.class));
            bVar41.n(h0Var);
            bVar41.o(dVar41);
            aVar.a(bVar41, new m.a.c.e.e(false, false, 1, (DefaultConstructorMarker) null));
            i0 i0Var = i0.f7200h;
            m.a.c.e.c cVar43 = m.a.c.e.c.a;
            m.a.c.e.d dVar42 = m.a.c.e.d.Factory;
            m.a.c.e.b bVar42 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, kotlin.jvm.internal.v.b(b.e.class));
            bVar42.n(i0Var);
            bVar42.o(dVar42);
            aVar.a(bVar42, new m.a.c.e.e(false, false, 1, (DefaultConstructorMarker) null));
            j0 j0Var = j0.f7203h;
            m.a.c.e.c cVar44 = m.a.c.e.c.a;
            m.a.c.e.d dVar43 = m.a.c.e.d.Single;
            m.a.c.e.b bVar43 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, kotlin.jvm.internal.v.b(com.sensorberg.smartworkspace.app.screens.alarm.p.class));
            bVar43.n(j0Var);
            bVar43.o(dVar43);
            aVar.a(bVar43, new m.a.c.e.e(false, false));
            k0 k0Var = k0.f7206h;
            m.a.c.e.c cVar45 = m.a.c.e.c.a;
            m.a.c.e.d dVar44 = m.a.c.e.d.Factory;
            m.a.c.e.b bVar44 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, kotlin.jvm.internal.v.b(com.sensorberg.smartworkspace.app.screens.spaces.overview.d.class));
            bVar44.n(k0Var);
            bVar44.o(dVar44);
            aVar.a(bVar44, new m.a.c.e.e(false, false, 1, (DefaultConstructorMarker) null));
            l0 l0Var = l0.f7209h;
            m.a.c.e.c cVar46 = m.a.c.e.c.a;
            m.a.c.e.d dVar45 = m.a.c.e.d.Factory;
            m.a.c.e.b bVar45 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, kotlin.jvm.internal.v.b(com.sensorberg.smartworkspace.app.activities.main.d.class));
            bVar45.n(l0Var);
            bVar45.o(dVar45);
            aVar.a(bVar45, new m.a.c.e.e(false, false, 1, (DefaultConstructorMarker) null));
            m.a.b.a.c.a.a(bVar45);
            m0 m0Var = m0.f7212h;
            m.a.c.e.c cVar47 = m.a.c.e.c.a;
            m.a.c.e.d dVar46 = m.a.c.e.d.Factory;
            m.a.c.e.b bVar46 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, kotlin.jvm.internal.v.b(com.sensorberg.smartworkspace.app.activities.permission.c.class));
            bVar46.n(m0Var);
            bVar46.o(dVar46);
            aVar.a(bVar46, new m.a.c.e.e(false, false, 1, (DefaultConstructorMarker) null));
            m.a.b.a.c.a.a(bVar46);
            n0 n0Var = n0.f7215h;
            m.a.c.e.c cVar48 = m.a.c.e.c.a;
            m.a.c.e.d dVar47 = m.a.c.e.d.Factory;
            m.a.c.e.b bVar47 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, kotlin.jvm.internal.v.b(com.sensorberg.smartworkspace.app.activities.login.internal.a.class));
            bVar47.n(n0Var);
            bVar47.o(dVar47);
            aVar.a(bVar47, new m.a.c.e.e(false, false, 1, (DefaultConstructorMarker) null));
            m.a.b.a.c.a.a(bVar47);
            o0 o0Var = o0.f7218h;
            m.a.c.e.c cVar49 = m.a.c.e.c.a;
            m.a.c.e.d dVar48 = m.a.c.e.d.Factory;
            m.a.c.e.b bVar48 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, kotlin.jvm.internal.v.b(com.sensorberg.smartworkspace.app.activities.login.external.a.class));
            bVar48.n(o0Var);
            bVar48.o(dVar48);
            aVar.a(bVar48, new m.a.c.e.e(false, false, 1, (DefaultConstructorMarker) null));
            m.a.b.a.c.a.a(bVar48);
            p0 p0Var = p0.f7221h;
            m.a.c.e.c cVar50 = m.a.c.e.c.a;
            m.a.c.e.d dVar49 = m.a.c.e.d.Factory;
            m.a.c.e.b bVar49 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, kotlin.jvm.internal.v.b(com.sensorberg.smartworkspace.app.activities.login.externalidentifier.a.class));
            bVar49.n(p0Var);
            bVar49.o(dVar49);
            aVar.a(bVar49, new m.a.c.e.e(false, false, 1, (DefaultConstructorMarker) null));
            m.a.b.a.c.a.a(bVar49);
            q0 q0Var = q0.f7224h;
            m.a.c.e.c cVar51 = m.a.c.e.c.a;
            m.a.c.e.d dVar50 = m.a.c.e.d.Factory;
            m.a.c.e.b bVar50 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, kotlin.jvm.internal.v.b(com.sensorberg.smartworkspace.app.activities.pin.c.class));
            bVar50.n(q0Var);
            bVar50.o(dVar50);
            aVar.a(bVar50, new m.a.c.e.e(false, false, 1, (DefaultConstructorMarker) null));
            m.a.b.a.c.a.a(bVar50);
            s0 s0Var = s0.f7230h;
            m.a.c.e.c cVar52 = m.a.c.e.c.a;
            m.a.c.e.d dVar51 = m.a.c.e.d.Factory;
            m.a.c.e.b bVar51 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, kotlin.jvm.internal.v.b(com.sensorberg.smartworkspace.app.screens.door.e.b.class));
            bVar51.n(s0Var);
            bVar51.o(dVar51);
            aVar.a(bVar51, new m.a.c.e.e(false, false, 1, (DefaultConstructorMarker) null));
            m.a.b.a.c.a.a(bVar51);
            t0 t0Var = t0.f7233h;
            m.a.c.e.c cVar53 = m.a.c.e.c.a;
            m.a.c.e.d dVar52 = m.a.c.e.d.Factory;
            m.a.c.e.b bVar52 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, kotlin.jvm.internal.v.b(com.sensorberg.smartworkspace.app.screens.door.d.e.class));
            bVar52.n(t0Var);
            bVar52.o(dVar52);
            aVar.a(bVar52, new m.a.c.e.e(false, false, 1, (DefaultConstructorMarker) null));
            m.a.b.a.c.a.a(bVar52);
            u0 u0Var = u0.f7236h;
            m.a.c.e.c cVar54 = m.a.c.e.c.a;
            m.a.c.e.d dVar53 = m.a.c.e.d.Factory;
            m.a.c.e.b bVar53 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, kotlin.jvm.internal.v.b(com.sensorberg.smartworkspace.app.screens.info.h.class));
            bVar53.n(u0Var);
            bVar53.o(dVar53);
            aVar.a(bVar53, new m.a.c.e.e(false, false, 1, (DefaultConstructorMarker) null));
            m.a.b.a.c.a.a(bVar53);
            v0 v0Var = v0.f7239h;
            m.a.c.e.c cVar55 = m.a.c.e.c.a;
            m.a.c.e.d dVar54 = m.a.c.e.d.Factory;
            m.a.c.e.b bVar54 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, kotlin.jvm.internal.v.b(com.sensorberg.smartworkspace.app.screens.settings.c.class));
            bVar54.n(v0Var);
            bVar54.o(dVar54);
            aVar.a(bVar54, new m.a.c.e.e(false, false, 1, (DefaultConstructorMarker) null));
            m.a.b.a.c.a.a(bVar54);
            w0 w0Var = w0.f7242h;
            m.a.c.e.c cVar56 = m.a.c.e.c.a;
            m.a.c.e.d dVar55 = m.a.c.e.d.Factory;
            m.a.c.e.b bVar55 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, kotlin.jvm.internal.v.b(com.sensorberg.smartworkspace.app.screens.locker.c.class));
            bVar55.n(w0Var);
            bVar55.o(dVar55);
            aVar.a(bVar55, new m.a.c.e.e(false, false, 1, (DefaultConstructorMarker) null));
            m.a.b.a.c.a.a(bVar55);
            x0 x0Var = x0.f7245h;
            m.a.c.e.c cVar57 = m.a.c.e.c.a;
            m.a.c.e.d dVar56 = m.a.c.e.d.Factory;
            m.a.c.e.b bVar56 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, kotlin.jvm.internal.v.b(com.sensorberg.smartworkspace.app.screens.locker.selection.f.class));
            bVar56.n(x0Var);
            bVar56.o(dVar56);
            aVar.a(bVar56, new m.a.c.e.e(false, false, 1, (DefaultConstructorMarker) null));
            m.a.b.a.c.a.a(bVar56);
            y0 y0Var = y0.f7247h;
            m.a.c.e.c cVar58 = m.a.c.e.c.a;
            m.a.c.e.d dVar57 = m.a.c.e.d.Factory;
            m.a.c.e.b bVar57 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, kotlin.jvm.internal.v.b(com.sensorberg.smartworkspace.app.screens.locker.selection.b.class));
            bVar57.n(y0Var);
            bVar57.o(dVar57);
            aVar.a(bVar57, new m.a.c.e.e(false, false, 1, (DefaultConstructorMarker) null));
            m.a.b.a.c.a.a(bVar57);
            z0 z0Var = z0.f7249h;
            m.a.c.e.c cVar59 = m.a.c.e.c.a;
            m.a.c.e.d dVar58 = m.a.c.e.d.Factory;
            m.a.c.e.b bVar58 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, kotlin.jvm.internal.v.b(com.sensorberg.smartworkspace.app.screens.locker.create.c.class));
            bVar58.n(z0Var);
            bVar58.o(dVar58);
            aVar.a(bVar58, new m.a.c.e.e(false, false, 1, (DefaultConstructorMarker) null));
            m.a.b.a.c.a.a(bVar58);
            a1 a1Var = a1.f7177h;
            m.a.c.e.c cVar60 = m.a.c.e.c.a;
            m.a.c.e.d dVar59 = m.a.c.e.d.Factory;
            m.a.c.e.b bVar59 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, kotlin.jvm.internal.v.b(com.sensorberg.smartworkspace.app.screens.locker.opening.e.class));
            bVar59.n(a1Var);
            bVar59.o(dVar59);
            aVar.a(bVar59, new m.a.c.e.e(false, false, 1, (DefaultConstructorMarker) null));
            m.a.b.a.c.a.a(bVar59);
            b1 b1Var = b1.f7180h;
            m.a.c.e.c cVar61 = m.a.c.e.c.a;
            m.a.c.e.d dVar60 = m.a.c.e.d.Factory;
            m.a.c.e.b bVar60 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, kotlin.jvm.internal.v.b(com.sensorberg.smartworkspace.app.screens.locker.error.d.class));
            bVar60.n(b1Var);
            bVar60.o(dVar60);
            aVar.a(bVar60, new m.a.c.e.e(false, false, 1, (DefaultConstructorMarker) null));
            m.a.b.a.c.a.a(bVar60);
            d1 d1Var = d1.f7186h;
            m.a.c.e.c cVar62 = m.a.c.e.c.a;
            m.a.c.e.d dVar61 = m.a.c.e.d.Factory;
            m.a.c.e.b bVar61 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, kotlin.jvm.internal.v.b(com.sensorberg.smartworkspace.app.screens.spaces.detail.l.class));
            bVar61.n(d1Var);
            bVar61.o(dVar61);
            aVar.a(bVar61, new m.a.c.e.e(false, false, 1, (DefaultConstructorMarker) null));
            m.a.b.a.c.a.a(bVar61);
            e1 e1Var = e1.f7189h;
            m.a.c.e.c cVar63 = m.a.c.e.c.a;
            m.a.c.e.d dVar62 = m.a.c.e.d.Factory;
            m.a.c.e.b bVar62 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, kotlin.jvm.internal.v.b(com.sensorberg.smartworkspace.app.screens.spaces.overview.h.class));
            bVar62.n(e1Var);
            bVar62.o(dVar62);
            aVar.a(bVar62, new m.a.c.e.e(false, false, 1, (DefaultConstructorMarker) null));
            m.a.b.a.c.a.a(bVar62);
            f1 f1Var = f1.f7192h;
            m.a.c.e.c cVar64 = m.a.c.e.c.a;
            m.a.c.e.d dVar63 = m.a.c.e.d.Factory;
            m.a.c.e.b bVar63 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, kotlin.jvm.internal.v.b(com.sensorberg.smartworkspace.app.screens.spaces.iotdetails.d.class));
            bVar63.n(f1Var);
            bVar63.o(dVar63);
            aVar.a(bVar63, new m.a.c.e.e(false, false, 1, (DefaultConstructorMarker) null));
            m.a.b.a.c.a.a(bVar63);
            g1 g1Var = g1.f7195h;
            m.a.c.e.c cVar65 = m.a.c.e.c.a;
            m.a.c.e.d dVar64 = m.a.c.e.d.Factory;
            m.a.c.e.b bVar64 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, kotlin.jvm.internal.v.b(com.sensorberg.smartworkspace.app.screens.password.a.class));
            bVar64.n(g1Var);
            bVar64.o(dVar64);
            aVar.a(bVar64, new m.a.c.e.e(false, false, 1, (DefaultConstructorMarker) null));
            m.a.b.a.c.a.a(bVar64);
            h1 h1Var = h1.f7198h;
            m.a.c.e.c cVar66 = m.a.c.e.c.a;
            m.a.c.e.d dVar65 = m.a.c.e.d.Factory;
            m.a.c.e.b bVar65 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, kotlin.jvm.internal.v.b(com.sensorberg.smartworkspace.app.screens.door.c.class));
            bVar65.n(h1Var);
            bVar65.o(dVar65);
            aVar.a(bVar65, new m.a.c.e.e(false, false, 1, (DefaultConstructorMarker) null));
            m.a.b.a.c.a.a(bVar65);
            i1 i1Var = i1.f7201h;
            m.a.c.e.c cVar67 = m.a.c.e.c.a;
            m.a.c.e.d dVar66 = m.a.c.e.d.Factory;
            m.a.c.e.b bVar66 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, kotlin.jvm.internal.v.b(com.sensorberg.smartworkspace.app.screens.door.opening.e.class));
            bVar66.n(i1Var);
            bVar66.o(dVar66);
            aVar.a(bVar66, new m.a.c.e.e(false, false, 1, (DefaultConstructorMarker) null));
            m.a.b.a.c.a.a(bVar66);
            j1 j1Var = j1.f7204h;
            m.a.c.e.c cVar68 = m.a.c.e.c.a;
            m.a.c.e.d dVar67 = m.a.c.e.d.Factory;
            m.a.c.e.b bVar67 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, kotlin.jvm.internal.v.b(g.e.d.t.a.a.class));
            bVar67.n(j1Var);
            bVar67.o(dVar67);
            aVar.a(bVar67, new m.a.c.e.e(false, false, 1, (DefaultConstructorMarker) null));
            m.a.b.a.c.a.a(bVar67);
            k1 k1Var = k1.f7207h;
            m.a.c.e.c cVar69 = m.a.c.e.c.a;
            m.a.c.e.d dVar68 = m.a.c.e.d.Factory;
            m.a.c.e.b bVar68 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, kotlin.jvm.internal.v.b(com.sensorberg.smartworkspace.app.screens.locker.e.b.class));
            bVar68.n(k1Var);
            bVar68.o(dVar68);
            aVar.a(bVar68, new m.a.c.e.e(false, false, 1, (DefaultConstructorMarker) null));
            m.a.b.a.c.a.a(bVar68);
            l1 l1Var = l1.f7210h;
            m.a.c.e.c cVar70 = m.a.c.e.c.a;
            m.a.c.e.d dVar69 = m.a.c.e.d.Factory;
            m.a.c.e.b bVar69 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, kotlin.jvm.internal.v.b(com.sensorberg.smartworkspace.app.screens.locker.delete.b.class));
            bVar69.n(l1Var);
            bVar69.o(dVar69);
            aVar.a(bVar69, new m.a.c.e.e(false, false, 1, (DefaultConstructorMarker) null));
            m.a.b.a.c.a.a(bVar69);
            m1 m1Var = m1.f7213h;
            m.a.c.e.c cVar71 = m.a.c.e.c.a;
            m.a.c.e.d dVar70 = m.a.c.e.d.Factory;
            m.a.c.e.b bVar70 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, kotlin.jvm.internal.v.b(com.sensorberg.smartworkspace.app.screens.alarm.l.class));
            bVar70.n(m1Var);
            bVar70.o(dVar70);
            aVar.a(bVar70, new m.a.c.e.e(false, false, 1, (DefaultConstructorMarker) null));
            m.a.b.a.c.a.a(bVar70);
            o1 o1Var = o1.f7219h;
            m.a.c.e.c cVar72 = m.a.c.e.c.a;
            m.a.c.e.d dVar71 = m.a.c.e.d.Factory;
            m.a.c.e.b bVar71 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, kotlin.jvm.internal.v.b(com.sensorberg.smartworkspace.app.screens.settings.myrenz.c.class));
            bVar71.n(o1Var);
            bVar71.o(dVar71);
            aVar.a(bVar71, new m.a.c.e.e(false, false, 1, (DefaultConstructorMarker) null));
            m.a.b.a.c.a.a(bVar71);
            p1 p1Var = p1.f7222h;
            m.a.c.e.c cVar73 = m.a.c.e.c.a;
            m.a.c.e.d dVar72 = m.a.c.e.d.Single;
            m.a.c.e.b bVar72 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, kotlin.jvm.internal.v.b(com.sensorberg.smartworkspace.app.g.class));
            bVar72.n(p1Var);
            bVar72.o(dVar72);
            aVar.a(bVar72, new m.a.c.e.e(false, false));
            q1 q1Var = q1.f7225h;
            m.a.c.e.c cVar74 = m.a.c.e.c.a;
            m.a.c.e.d dVar73 = m.a.c.e.d.Factory;
            m.a.c.e.b bVar73 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, kotlin.jvm.internal.v.b(com.sensorberg.smartworkspace.app.screens.settings.myrenz.a.class));
            bVar73.n(q1Var);
            bVar73.o(dVar73);
            aVar.a(bVar73, new m.a.c.e.e(false, false, 1, (DefaultConstructorMarker) null));
            r1 r1Var = r1.f7228h;
            m.a.c.e.c cVar75 = m.a.c.e.c.a;
            m.a.c.e.d dVar74 = m.a.c.e.d.Single;
            m.a.c.e.b bVar74 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, kotlin.jvm.internal.v.b(h.f.class));
            bVar74.n(r1Var);
            bVar74.o(dVar74);
            aVar.a(bVar74, new m.a.c.e.e(false, false));
            s1 s1Var = s1.f7231h;
            m.a.c.e.c cVar76 = m.a.c.e.c.a;
            m.a.c.e.d dVar75 = m.a.c.e.d.Single;
            m.a.c.e.b bVar75 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, kotlin.jvm.internal.v.b(g.e.d.g.class));
            bVar75.n(s1Var);
            bVar75.o(dVar75);
            aVar.a(bVar75, new m.a.c.e.e(false, false));
            t1 t1Var = t1.f7234h;
            m.a.c.e.c cVar77 = m.a.c.e.c.a;
            m.a.c.e.d dVar76 = m.a.c.e.d.Single;
            m.a.c.e.b bVar76 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, kotlin.jvm.internal.v.b(g.e.d.r.a.class));
            bVar76.n(t1Var);
            bVar76.o(dVar76);
            aVar.a(bVar76, new m.a.c.e.e(false, false));
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            a((m.a.c.h.a) obj);
            return kotlin.x.a;
        }
    }

    private b() {
    }

    public final m.a.c.h.a a() {
        return m.a.d.b.b(false, false, a.f7174h, 3, (Object) null);
    }
}
