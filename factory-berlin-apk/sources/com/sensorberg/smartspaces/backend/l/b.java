package com.sensorberg.smartspaces.backend.l;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.room.l;
import com.sensorberg.smartspaces.backend.storage.BackupDatabase;
import g.a.a.h.p;
import java.io.File;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import k.g;
import k.v;
import kotlin.jvm.internal.k;

/* compiled from: BackendKoinComponent.kt */
public final class b {

    /* compiled from: BackendKoinComponent.kt */
    static final class a extends kotlin.jvm.internal.l implements kotlin.e0.c.l<m.a.c.h.a, kotlin.x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Context f5974h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ String f5975i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ k.v f5976j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ k.g f5977k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ Map f5978l;

        /* renamed from: com.sensorberg.smartspaces.backend.l.b$a$a  reason: collision with other inner class name */
        /* compiled from: BackendKoinComponent.kt */
        static final class C0334a extends kotlin.jvm.internal.l implements kotlin.e0.c.p<m.a.c.l.a, m.a.c.i.a, com.sensorberg.smartspaces.backend.m.a> {

            /* renamed from: h  reason: collision with root package name */
            public static final C0334a f5979h = new C0334a();

            C0334a() {
                super(2);
            }

            /* renamed from: a */
            public final com.sensorberg.smartspaces.backend.m.a l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                kotlin.jvm.internal.k.e(aVar, "$receiver");
                kotlin.jvm.internal.k.e(aVar2, "it");
                return new com.sensorberg.smartspaces.backend.m.a((com.sensorberg.smartspaces.backend.m.d) aVar.e(kotlin.jvm.internal.v.b(com.sensorberg.smartspaces.backend.m.d.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null), (com.sensorberg.smartspaces.backend.q.c) aVar.e(kotlin.jvm.internal.v.b(com.sensorberg.smartspaces.backend.q.c.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null), (com.sensorberg.smartspaces.backend.q.h) aVar.e(kotlin.jvm.internal.v.b(com.sensorberg.smartspaces.backend.q.h.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null), (com.sensorberg.encryptor.d) aVar.e(kotlin.jvm.internal.v.b(com.sensorberg.encryptor.d.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null), (g.e.k.a) aVar.e(kotlin.jvm.internal.v.b(g.e.k.a.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null));
            }
        }

        /* compiled from: BackendKoinComponent.kt */
        static final class a0 extends kotlin.jvm.internal.l implements kotlin.e0.c.p<m.a.c.l.a, m.a.c.i.a, com.sensorberg.smartspaces.backend.storage.a> {

            /* renamed from: h  reason: collision with root package name */
            public static final a0 f5980h = new a0();

            a0() {
                super(2);
            }

            /* renamed from: a */
            public final com.sensorberg.smartspaces.backend.storage.a l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                kotlin.jvm.internal.k.e(aVar, "$receiver");
                kotlin.jvm.internal.k.e(aVar2, "it");
                return ((BackupDatabase) aVar.e(kotlin.jvm.internal.v.b(BackupDatabase.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null)).z();
            }
        }

        /* renamed from: com.sensorberg.smartspaces.backend.l.b$a$b  reason: collision with other inner class name */
        /* compiled from: BackendKoinComponent.kt */
        static final class C0335b extends kotlin.jvm.internal.l implements kotlin.e0.c.p<m.a.c.l.a, m.a.c.i.a, com.sensorberg.smartspaces.backend.m.g> {

            /* renamed from: h  reason: collision with root package name */
            public static final C0335b f5981h = new C0335b();

            C0335b() {
                super(2);
            }

            /* renamed from: a */
            public final com.sensorberg.smartspaces.backend.m.g l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                kotlin.jvm.internal.k.e(aVar, "$receiver");
                kotlin.jvm.internal.k.e(aVar2, "it");
                return new com.sensorberg.smartspaces.backend.m.g((com.sensorberg.smartspaces.backend.m.d) aVar.e(kotlin.jvm.internal.v.b(com.sensorberg.smartspaces.backend.m.d.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null), (com.sensorberg.smartspaces.backend.q.p.e) aVar.e(kotlin.jvm.internal.v.b(com.sensorberg.smartspaces.backend.q.p.e.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null));
            }
        }

        /* compiled from: BackendKoinComponent.kt */
        static final class b0 extends kotlin.jvm.internal.l implements kotlin.e0.c.p<m.a.c.l.a, m.a.c.i.a, com.sensorberg.smartspaces.backend.storage.c> {

            /* renamed from: h  reason: collision with root package name */
            public static final b0 f5982h = new b0();

            b0() {
                super(2);
            }

            /* renamed from: a */
            public final com.sensorberg.smartspaces.backend.storage.c l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                kotlin.jvm.internal.k.e(aVar, "$receiver");
                kotlin.jvm.internal.k.e(aVar2, "it");
                return ((BackupDatabase) aVar.e(kotlin.jvm.internal.v.b(BackupDatabase.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null)).A();
            }
        }

        /* compiled from: BackendKoinComponent.kt */
        static final class c extends kotlin.jvm.internal.l implements kotlin.e0.c.p<m.a.c.l.a, m.a.c.i.a, com.sensorberg.smartspaces.backend.m.i> {

            /* renamed from: h  reason: collision with root package name */
            public static final c f5983h = new c();

            c() {
                super(2);
            }

            /* renamed from: a */
            public final com.sensorberg.smartspaces.backend.m.i l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                kotlin.jvm.internal.k.e(aVar, "$receiver");
                kotlin.jvm.internal.k.e(aVar2, "it");
                return new com.sensorberg.smartspaces.backend.m.i((g.e.k.a) aVar.e(kotlin.jvm.internal.v.b(g.e.k.a.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null), (com.sensorberg.encryptor.d) aVar.e(kotlin.jvm.internal.v.b(com.sensorberg.encryptor.d.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null));
            }
        }

        /* compiled from: BackendKoinComponent.kt */
        static final class c0 extends kotlin.jvm.internal.l implements kotlin.e0.c.p<m.a.c.l.a, m.a.c.i.a, com.google.gson.f> {

            /* renamed from: h  reason: collision with root package name */
            public static final c0 f5984h = new c0();

            c0() {
                super(2);
            }

            /* renamed from: a */
            public final com.google.gson.f l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                kotlin.jvm.internal.k.e(aVar, "$receiver");
                kotlin.jvm.internal.k.e(aVar2, "it");
                return new com.google.gson.g().b();
            }
        }

        /* compiled from: BackendKoinComponent.kt */
        static final class d extends kotlin.jvm.internal.l implements kotlin.e0.c.p<m.a.c.l.a, m.a.c.i.a, com.sensorberg.smartspaces.backend.q.k> {

            /* renamed from: h  reason: collision with root package name */
            public static final d f5985h = new d();

            d() {
                super(2);
            }

            /* renamed from: a */
            public final com.sensorberg.smartspaces.backend.q.k l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                kotlin.jvm.internal.k.e(aVar, "$receiver");
                kotlin.jvm.internal.k.e(aVar2, "it");
                return new com.sensorberg.smartspaces.backend.q.k((com.google.gson.f) aVar.e(kotlin.jvm.internal.v.b(com.google.gson.f.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null));
            }
        }

        /* compiled from: BackendKoinComponent.kt */
        static final class d0 extends kotlin.jvm.internal.l implements kotlin.e0.c.p<m.a.c.l.a, m.a.c.i.a, com.sensorberg.smartspaces.backend.q.l> {

            /* renamed from: h  reason: collision with root package name */
            public static final d0 f5986h = new d0();

            d0() {
                super(2);
            }

            /* renamed from: a */
            public final com.sensorberg.smartspaces.backend.q.l l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                kotlin.jvm.internal.k.e(aVar, "$receiver");
                kotlin.jvm.internal.k.e(aVar2, "it");
                return new com.sensorberg.smartspaces.backend.q.l((SharedPreferences) aVar.e(kotlin.jvm.internal.v.b(SharedPreferences.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null));
            }
        }

        /* compiled from: BackendKoinComponent.kt */
        static final class e extends kotlin.jvm.internal.l implements kotlin.e0.c.p<m.a.c.l.a, m.a.c.i.a, com.sensorberg.smartspaces.backend.q.h> {

            /* renamed from: h  reason: collision with root package name */
            public static final e f5987h = new e();

            e() {
                super(2);
            }

            /* renamed from: a */
            public final com.sensorberg.smartspaces.backend.q.h l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                kotlin.jvm.internal.k.e(aVar, "$receiver");
                kotlin.jvm.internal.k.e(aVar2, "it");
                return new com.sensorberg.smartspaces.backend.q.h((com.sensorberg.smartspaces.backend.q.c) aVar.e(kotlin.jvm.internal.v.b(com.sensorberg.smartspaces.backend.q.c.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null), (g.e.k.a) aVar.e(kotlin.jvm.internal.v.b(g.e.k.a.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null), (com.sensorberg.smartspaces.backend.q.k) aVar.e(kotlin.jvm.internal.v.b(com.sensorberg.smartspaces.backend.q.k.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null));
            }
        }

        /* compiled from: BackendKoinComponent.kt */
        static final class e0 extends kotlin.jvm.internal.l implements kotlin.e0.c.p<m.a.c.l.a, m.a.c.i.a, com.sensorberg.encryptor.d> {

            /* renamed from: h  reason: collision with root package name */
            public static final e0 f5988h = new e0();

            e0() {
                super(2);
            }

            /* renamed from: a */
            public final com.sensorberg.encryptor.d l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                kotlin.jvm.internal.k.e(aVar, "$receiver");
                kotlin.jvm.internal.k.e(aVar2, "it");
                return com.sensorberg.encryptor.d.a.a("sw-backend-encryptor", (Context) aVar.e(kotlin.jvm.internal.v.b(Context.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null), com.sensorberg.encryptor.p.a.a.b.a((com.google.gson.f) aVar.e(kotlin.jvm.internal.v.b(com.google.gson.f.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null)));
            }
        }

        /* compiled from: BackendKoinComponent.kt */
        static final class f extends kotlin.jvm.internal.l implements kotlin.e0.c.p<m.a.c.l.a, m.a.c.i.a, com.sensorberg.smartspaces.backend.m.d> {

            /* renamed from: h  reason: collision with root package name */
            public static final f f5989h = new f();

            f() {
                super(2);
            }

            /* renamed from: a */
            public final com.sensorberg.smartspaces.backend.m.d l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                kotlin.jvm.internal.k.e(aVar, "$receiver");
                kotlin.jvm.internal.k.e(aVar2, "it");
                return new com.sensorberg.smartspaces.backend.m.d((g.e.k.a) aVar.e(kotlin.jvm.internal.v.b(g.e.k.a.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null), (com.sensorberg.encryptor.d) aVar.e(kotlin.jvm.internal.v.b(com.sensorberg.encryptor.d.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null));
            }
        }

        /* compiled from: BackendKoinComponent.kt */
        static final class f0 extends kotlin.jvm.internal.l implements kotlin.e0.c.p<m.a.c.l.a, m.a.c.i.a, g.e.k.a> {

            /* renamed from: h  reason: collision with root package name */
            public static final f0 f5990h = new f0();

            f0() {
                super(2);
            }

            /* renamed from: a */
            public final g.e.k.a l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                kotlin.jvm.internal.k.e(aVar, "$receiver");
                kotlin.jvm.internal.k.e(aVar2, "it");
                return new g.e.k.a();
            }
        }

        /* compiled from: BackendKoinComponent.kt */
        static final class g extends kotlin.jvm.internal.l implements kotlin.e0.c.p<m.a.c.l.a, m.a.c.i.a, com.sensorberg.smartspaces.backend.m.e> {

            /* renamed from: h  reason: collision with root package name */
            public static final g f5991h = new g();

            g() {
                super(2);
            }

            /* renamed from: a */
            public final com.sensorberg.smartspaces.backend.m.e l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                kotlin.jvm.internal.k.e(aVar, "$receiver");
                kotlin.jvm.internal.k.e(aVar2, "it");
                return new com.sensorberg.smartspaces.backend.m.e((SharedPreferences) aVar.e(kotlin.jvm.internal.v.b(SharedPreferences.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null), (com.sensorberg.encryptor.d) aVar.e(kotlin.jvm.internal.v.b(com.sensorberg.encryptor.d.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null), (com.sensorberg.smartspaces.backend.m.d) aVar.e(kotlin.jvm.internal.v.b(com.sensorberg.smartspaces.backend.m.d.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null), (com.sensorberg.smartspaces.backend.m.i) aVar.e(kotlin.jvm.internal.v.b(com.sensorberg.smartspaces.backend.m.i.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null), (com.sensorberg.smartspaces.backend.m.a) aVar.e(kotlin.jvm.internal.v.b(com.sensorberg.smartspaces.backend.m.a.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null));
            }
        }

        /* compiled from: BackendKoinComponent.kt */
        static final class h extends kotlin.jvm.internal.l implements kotlin.e0.c.p<m.a.c.l.a, m.a.c.i.a, com.sensorberg.smartspaces.backend.m.h> {

            /* renamed from: h  reason: collision with root package name */
            public static final h f5992h = new h();

            h() {
                super(2);
            }

            /* renamed from: a */
            public final com.sensorberg.smartspaces.backend.m.h l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                kotlin.jvm.internal.k.e(aVar, "$receiver");
                kotlin.jvm.internal.k.e(aVar2, "it");
                return new com.sensorberg.smartspaces.backend.m.h((g.e.k.a) aVar.e(kotlin.jvm.internal.v.b(g.e.k.a.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null), (com.sensorberg.encryptor.d) aVar.e(kotlin.jvm.internal.v.b(com.sensorberg.encryptor.d.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null));
            }
        }

        /* compiled from: BackendKoinComponent.kt */
        static final class i extends kotlin.jvm.internal.l implements kotlin.e0.c.p<m.a.c.l.a, m.a.c.i.a, com.sensorberg.smartspaces.backend.h> {

            /* renamed from: h  reason: collision with root package name */
            public static final i f5993h = new i();

            i() {
                super(2);
            }

            /* renamed from: a */
            public final com.sensorberg.smartspaces.backend.h l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                kotlin.jvm.internal.k.e(aVar, "$receiver");
                kotlin.jvm.internal.k.e(aVar2, "it");
                return new com.sensorberg.smartspaces.backend.h((com.sensorberg.smartspaces.backend.q.k) aVar.e(kotlin.jvm.internal.v.b(com.sensorberg.smartspaces.backend.q.k.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null));
            }
        }

        /* compiled from: BackendKoinComponent.kt */
        static final class j extends kotlin.jvm.internal.l implements kotlin.e0.c.p<m.a.c.l.a, m.a.c.i.a, com.sensorberg.smartspaces.backend.i> {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ a f5994h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            j(a aVar) {
                super(2);
                this.f5994h = aVar;
            }

            /* renamed from: a */
            public final com.sensorberg.smartspaces.backend.i l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                kotlin.jvm.internal.k.e(aVar, "$receiver");
                kotlin.jvm.internal.k.e(aVar2, "it");
                return new com.sensorberg.smartspaces.backend.i(this.f5994h.f5975i, (com.sensorberg.smartspaces.backend.m.h) aVar.e(kotlin.jvm.internal.v.b(com.sensorberg.smartspaces.backend.m.h.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null), (Context) aVar.e(kotlin.jvm.internal.v.b(Context.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null), (com.sensorberg.smartspaces.backend.m.d) aVar.e(kotlin.jvm.internal.v.b(com.sensorberg.smartspaces.backend.m.d.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null), (com.sensorberg.smartspaces.backend.m.i) aVar.e(kotlin.jvm.internal.v.b(com.sensorberg.smartspaces.backend.m.i.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null), (g.e.k.a) aVar.e(kotlin.jvm.internal.v.b(g.e.k.a.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null), (com.sensorberg.smartspaces.backend.q.c) aVar.e(kotlin.jvm.internal.v.b(com.sensorberg.smartspaces.backend.q.c.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null), (com.sensorberg.smartspaces.backend.q.h) aVar.e(kotlin.jvm.internal.v.b(com.sensorberg.smartspaces.backend.q.h.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null), (com.sensorberg.smartspaces.backend.m.e) aVar.e(kotlin.jvm.internal.v.b(com.sensorberg.smartspaces.backend.m.e.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null), (com.sensorberg.encryptor.d) aVar.e(kotlin.jvm.internal.v.b(com.sensorberg.encryptor.d.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null));
            }
        }

        /* compiled from: BackendKoinComponent.kt */
        static final class k extends kotlin.jvm.internal.l implements kotlin.e0.c.p<m.a.c.l.a, m.a.c.i.a, Context> {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ a f5995h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            k(a aVar) {
                super(2);
                this.f5995h = aVar;
            }

            /* renamed from: a */
            public final Context l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                kotlin.jvm.internal.k.e(aVar, "$receiver");
                kotlin.jvm.internal.k.e(aVar2, "it");
                return this.f5995h.f5974h;
            }
        }

        /* compiled from: BackendKoinComponent.kt */
        static final class l extends kotlin.jvm.internal.l implements kotlin.e0.c.p<m.a.c.l.a, m.a.c.i.a, com.sensorberg.smartspaces.backend.q.c> {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ a f5996h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            l(a aVar) {
                super(2);
                this.f5996h = aVar;
            }

            /* renamed from: a */
            public final com.sensorberg.smartspaces.backend.q.c l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                kotlin.jvm.internal.k.e(aVar, "$receiver");
                kotlin.jvm.internal.k.e(aVar2, "it");
                return com.sensorberg.smartspaces.backend.q.m.c.e((com.google.gson.f) aVar.e(kotlin.jvm.internal.v.b(com.google.gson.f.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null), this.f5996h.f5976j, (k.z) aVar.e(kotlin.jvm.internal.v.b(k.z.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null));
            }
        }

        /* compiled from: BackendKoinComponent.kt */
        static final class m extends kotlin.jvm.internal.l implements kotlin.e0.c.p<m.a.c.l.a, m.a.c.i.a, ScheduledExecutorService> {

            /* renamed from: h  reason: collision with root package name */
            public static final m f5997h = new m();

            m() {
                super(2);
            }

            /* renamed from: a */
            public final ScheduledExecutorService l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                kotlin.jvm.internal.k.e(aVar, "$receiver");
                kotlin.jvm.internal.k.e(aVar2, "it");
                return Executors.newSingleThreadScheduledExecutor();
            }
        }

        /* compiled from: BackendKoinComponent.kt */
        static final class n extends kotlin.jvm.internal.l implements kotlin.e0.c.p<m.a.c.l.a, m.a.c.i.a, k.z> {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ a f5998h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            n(a aVar) {
                super(2);
                this.f5998h = aVar;
            }

            /* renamed from: a */
            public final k.z l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                kotlin.jvm.internal.k.e(aVar, "$receiver");
                kotlin.jvm.internal.k.e(aVar2, "it");
                com.sensorberg.smartspaces.backend.q.f fVar = new com.sensorberg.smartspaces.backend.q.f((SharedPreferences) aVar.e(kotlin.jvm.internal.v.b(SharedPreferences.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null));
                com.sensorberg.smartspaces.backend.q.m mVar = com.sensorberg.smartspaces.backend.q.m.c;
                a aVar3 = this.f5998h;
                return mVar.c(aVar3.f5974h, aVar3.f5977k, n.i(fVar.b(), new com.sensorberg.smartspaces.backend.q.b((com.sensorberg.smartspaces.backend.m.d) aVar.e(kotlin.jvm.internal.v.b(com.sensorberg.smartspaces.backend.m.d.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null)), com.sensorberg.smartspaces.backend.q.o.c.a(this.f5998h.f5974h), com.sensorberg.aliolihttp.c.a.a(this.f5998h.f5974h)), n.i(fVar.c(), (k.w) aVar.e(kotlin.jvm.internal.v.b(com.sensorberg.smartspaces.backend.q.l.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null)));
            }
        }

        /* compiled from: BackendKoinComponent.kt */
        static final class o extends kotlin.jvm.internal.l implements kotlin.e0.c.p<m.a.c.l.a, m.a.c.i.a, g.a.a.b> {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ a f5999h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            o(a aVar) {
                super(2);
                this.f5999h = aVar;
            }

            /* renamed from: a */
            public final g.a.a.b l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                kotlin.jvm.internal.k.e(aVar, "$receiver");
                kotlin.jvm.internal.k.e(aVar2, "it");
                a aVar3 = this.f5999h;
                return com.sensorberg.smartspaces.backend.q.m.c.a((Context) aVar.e(kotlin.jvm.internal.v.b(Context.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null), (k.z) aVar.e(kotlin.jvm.internal.v.b(k.z.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null), aVar3.f5976j, aVar3.f5978l);
            }
        }

        /* compiled from: BackendKoinComponent.kt */
        static final class p extends kotlin.jvm.internal.l implements kotlin.e0.c.p<m.a.c.l.a, m.a.c.i.a, com.sensorberg.smartspaces.backend.q.p.e> {

            /* renamed from: h  reason: collision with root package name */
            public static final p f6000h = new p();

            p() {
                super(2);
            }

            /* renamed from: a */
            public final com.sensorberg.smartspaces.backend.q.p.e l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                kotlin.jvm.internal.k.e(aVar, "$receiver");
                kotlin.jvm.internal.k.e(aVar2, "it");
                return new com.sensorberg.smartspaces.backend.q.p.e((g.a.a.b) aVar.e(kotlin.jvm.internal.v.b(g.a.a.b.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null), (com.sensorberg.smartspaces.backend.q.k) aVar.e(kotlin.jvm.internal.v.b(com.sensorberg.smartspaces.backend.q.k.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null), (ScheduledExecutorService) aVar.e(kotlin.jvm.internal.v.b(ScheduledExecutorService.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null));
            }
        }

        /* compiled from: BackendKoinComponent.kt */
        static final class q extends kotlin.jvm.internal.l implements kotlin.e0.c.p<m.a.c.l.a, m.a.c.i.a, com.sensorberg.smartspaces.backend.q.p.b> {

            /* renamed from: h  reason: collision with root package name */
            public static final q f6001h = new q();

            q() {
                super(2);
            }

            /* renamed from: a */
            public final com.sensorberg.smartspaces.backend.q.p.b l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                kotlin.jvm.internal.k.e(aVar, "$receiver");
                kotlin.jvm.internal.k.e(aVar2, "it");
                return new com.sensorberg.smartspaces.backend.q.p.c((g.a.a.b) aVar.e(kotlin.jvm.internal.v.b(g.a.a.b.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null), (com.sensorberg.smartspaces.backend.m.d) aVar.e(kotlin.jvm.internal.v.b(com.sensorberg.smartspaces.backend.m.d.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null), (kotlinx.coroutines.d0) null, 4, (DefaultConstructorMarker) null);
            }
        }

        /* compiled from: BackendKoinComponent.kt */
        static final class r extends kotlin.jvm.internal.l implements kotlin.e0.c.p<m.a.c.l.a, m.a.c.i.a, g.e.n.c.e.d.a> {

            /* renamed from: h  reason: collision with root package name */
            public static final r f6002h = new r();

            r() {
                super(2);
            }

            /* renamed from: a */
            public final g.e.n.c.e.d.a l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                kotlin.jvm.internal.k.e(aVar, "$receiver");
                kotlin.jvm.internal.k.e(aVar2, "it");
                return new com.sensorberg.smartspaces.backend.k.b((com.sensorberg.smartspaces.backend.q.p.b) aVar.e(kotlin.jvm.internal.v.b(com.sensorberg.smartspaces.backend.q.p.b.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null));
            }
        }

        /* compiled from: BackendKoinComponent.kt */
        static final class s extends kotlin.jvm.internal.l implements kotlin.e0.c.p<m.a.c.l.a, m.a.c.i.a, g.e.n.c.j.b.e> {

            /* renamed from: h  reason: collision with root package name */
            public static final s f6003h = new s();

            s() {
                super(2);
            }

            /* renamed from: a */
            public final g.e.n.c.j.b.e l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                kotlin.jvm.internal.k.e(aVar, "$receiver");
                kotlin.jvm.internal.k.e(aVar2, "it");
                return new com.sensorberg.smartspaces.backend.r.b((com.sensorberg.smartspaces.backend.q.p.b) aVar.e(kotlin.jvm.internal.v.b(com.sensorberg.smartspaces.backend.q.p.b.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null));
            }
        }

        /* compiled from: BackendKoinComponent.kt */
        static final class t extends kotlin.jvm.internal.l implements kotlin.e0.c.p<m.a.c.l.a, m.a.c.i.a, g.e.n.c.h.b.f> {

            /* renamed from: h  reason: collision with root package name */
            public static final t f6004h = new t();

            t() {
                super(2);
            }

            /* renamed from: a */
            public final g.e.n.c.h.b.f l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                kotlin.jvm.internal.k.e(aVar, "$receiver");
                kotlin.jvm.internal.k.e(aVar2, "it");
                return new com.sensorberg.smartspaces.backend.p.b((com.sensorberg.smartspaces.backend.q.p.b) aVar.e(kotlin.jvm.internal.v.b(com.sensorberg.smartspaces.backend.q.p.b.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null));
            }
        }

        /* compiled from: BackendKoinComponent.kt */
        static final class u extends kotlin.jvm.internal.l implements kotlin.e0.c.p<m.a.c.l.a, m.a.c.i.a, g.e.n.c.k.b.a> {

            /* renamed from: h  reason: collision with root package name */
            public static final u f6005h = new u();

            u() {
                super(2);
            }

            /* renamed from: a */
            public final g.e.n.c.k.b.a l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                kotlin.jvm.internal.k.e(aVar, "$receiver");
                kotlin.jvm.internal.k.e(aVar2, "it");
                return new com.sensorberg.smartspaces.backend.s.b((com.sensorberg.smartspaces.backend.q.p.b) aVar.e(kotlin.jvm.internal.v.b(com.sensorberg.smartspaces.backend.q.p.b.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null), (g.e.k.a) aVar.e(kotlin.jvm.internal.v.b(g.e.k.a.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null));
            }
        }

        /* compiled from: BackendKoinComponent.kt */
        static final class v extends kotlin.jvm.internal.l implements kotlin.e0.c.p<m.a.c.l.a, m.a.c.i.a, SharedPreferences> {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ a f6006h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            v(a aVar) {
                super(2);
                this.f6006h = aVar;
            }

            /* renamed from: a */
            public final SharedPreferences l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                kotlin.jvm.internal.k.e(aVar, "$receiver");
                kotlin.jvm.internal.k.e(aVar2, "it");
                SharedPreferences a = g.e.f.b.f9799i.a(new File(this.f6006h.f5974h.getNoBackupFilesDir(), "sw-backend-prefs.json"));
                g.e.f.b.f9799i.b(this.f6006h.f5974h, "sw-backend-prefs", a);
                return a;
            }
        }

        /* compiled from: BackendKoinComponent.kt */
        static final class w extends kotlin.jvm.internal.l implements kotlin.e0.c.p<m.a.c.l.a, m.a.c.i.a, g.e.n.c.g.f.c> {

            /* renamed from: h  reason: collision with root package name */
            public static final w f6007h = new w();

            w() {
                super(2);
            }

            /* renamed from: a */
            public final g.e.n.c.g.f.c l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                kotlin.jvm.internal.k.e(aVar, "$receiver");
                kotlin.jvm.internal.k.e(aVar2, "it");
                return new com.sensorberg.smartspaces.backend.o.a((com.sensorberg.smartspaces.backend.q.p.b) aVar.e(kotlin.jvm.internal.v.b(com.sensorberg.smartspaces.backend.q.p.b.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null), (kotlinx.coroutines.d0) null, 2, (DefaultConstructorMarker) null);
            }
        }

        /* compiled from: BackendKoinComponent.kt */
        static final class x extends kotlin.jvm.internal.l implements kotlin.e0.c.p<m.a.c.l.a, m.a.c.i.a, com.sensorberg.smartspaces.backend.q.p.g> {

            /* renamed from: h  reason: collision with root package name */
            public static final x f6008h = new x();

            x() {
                super(2);
            }

            /* renamed from: a */
            public final com.sensorberg.smartspaces.backend.q.p.g l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                kotlin.jvm.internal.k.e(aVar, "$receiver");
                kotlin.jvm.internal.k.e(aVar2, "it");
                return new com.sensorberg.smartspaces.backend.q.p.g((com.sensorberg.smartspaces.backend.q.p.b) aVar.e(kotlin.jvm.internal.v.b(com.sensorberg.smartspaces.backend.q.p.b.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null));
            }
        }

        /* compiled from: BackendKoinComponent.kt */
        static final class y extends kotlin.jvm.internal.l implements kotlin.e0.c.p<m.a.c.l.a, m.a.c.i.a, com.sensorberg.smartspaces.backend.q.p.d> {

            /* renamed from: h  reason: collision with root package name */
            public static final y f6009h = new y();

            y() {
                super(2);
            }

            /* renamed from: a */
            public final com.sensorberg.smartspaces.backend.q.p.d l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                kotlin.jvm.internal.k.e(aVar, "$receiver");
                kotlin.jvm.internal.k.e(aVar2, "it");
                return new com.sensorberg.smartspaces.backend.q.p.d((com.sensorberg.smartspaces.backend.q.p.b) aVar.e(kotlin.jvm.internal.v.b(com.sensorberg.smartspaces.backend.q.p.b.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null));
            }
        }

        /* compiled from: BackendKoinComponent.kt */
        static final class z extends kotlin.jvm.internal.l implements kotlin.e0.c.p<m.a.c.l.a, m.a.c.i.a, BackupDatabase> {

            /* renamed from: h  reason: collision with root package name */
            public static final z f6010h = new z();

            z() {
                super(2);
            }

            /* renamed from: a */
            public final BackupDatabase l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                kotlin.jvm.internal.k.e(aVar, "$receiver");
                kotlin.jvm.internal.k.e(aVar2, "it");
                l.a<BackupDatabase> a = androidx.room.k.a((Context) aVar.e(kotlin.jvm.internal.v.b(Context.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null), BackupDatabase.class, "backend-backup-database");
                a.b(BackupDatabase.f6154m.a());
                BackupDatabase d2 = a.d();
                kotlin.jvm.internal.k.d(d2, "Room.databaseBuilder(get…RATION_1_2)\n\t\t\t\t\t.build()");
                return d2;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(Context context, String str, k.v vVar, k.g gVar, Map map) {
            super(1);
            this.f5974h = context;
            this.f5975i = str;
            this.f5976j = vVar;
            this.f5977k = gVar;
            this.f5978l = map;
        }

        public final void a(m.a.c.h.a aVar) {
            kotlin.jvm.internal.k.e(aVar, "$receiver");
            k kVar = new k(this);
            m.a.c.e.c cVar = m.a.c.e.c.a;
            m.a.c.e.d dVar = m.a.c.e.d.Single;
            m.a.c.e.b bVar = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, kotlin.jvm.internal.v.b(Context.class));
            bVar.n(kVar);
            bVar.o(dVar);
            aVar.a(bVar, new m.a.c.e.e(false, false));
            v vVar = new v(this);
            m.a.c.e.c cVar2 = m.a.c.e.c.a;
            m.a.c.e.d dVar2 = m.a.c.e.d.Single;
            m.a.c.e.b bVar2 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, kotlin.jvm.internal.v.b(SharedPreferences.class));
            bVar2.n(vVar);
            bVar2.o(dVar2);
            aVar.a(bVar2, new m.a.c.e.e(false, false));
            z zVar = z.f6010h;
            m.a.c.e.c cVar3 = m.a.c.e.c.a;
            m.a.c.e.d dVar3 = m.a.c.e.d.Single;
            m.a.c.e.b bVar3 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, kotlin.jvm.internal.v.b(BackupDatabase.class));
            bVar3.n(zVar);
            bVar3.o(dVar3);
            aVar.a(bVar3, new m.a.c.e.e(false, false));
            a0 a0Var = a0.f5980h;
            m.a.c.e.c cVar4 = m.a.c.e.c.a;
            m.a.c.e.d dVar4 = m.a.c.e.d.Single;
            m.a.c.e.b bVar4 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, kotlin.jvm.internal.v.b(com.sensorberg.smartspaces.backend.storage.a.class));
            bVar4.n(a0Var);
            bVar4.o(dVar4);
            aVar.a(bVar4, new m.a.c.e.e(false, false));
            b0 b0Var = b0.f5982h;
            m.a.c.e.c cVar5 = m.a.c.e.c.a;
            m.a.c.e.d dVar5 = m.a.c.e.d.Single;
            m.a.c.e.b bVar5 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, kotlin.jvm.internal.v.b(com.sensorberg.smartspaces.backend.storage.c.class));
            bVar5.n(b0Var);
            bVar5.o(dVar5);
            aVar.a(bVar5, new m.a.c.e.e(false, false));
            c0 c0Var = c0.f5984h;
            m.a.c.e.c cVar6 = m.a.c.e.c.a;
            m.a.c.e.d dVar6 = m.a.c.e.d.Single;
            m.a.c.e.b bVar6 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, kotlin.jvm.internal.v.b(com.google.gson.f.class));
            bVar6.n(c0Var);
            bVar6.o(dVar6);
            aVar.a(bVar6, new m.a.c.e.e(false, false));
            d0 d0Var = d0.f5986h;
            m.a.c.e.c cVar7 = m.a.c.e.c.a;
            m.a.c.e.d dVar7 = m.a.c.e.d.Single;
            m.a.c.e.b bVar7 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, kotlin.jvm.internal.v.b(com.sensorberg.smartspaces.backend.q.l.class));
            bVar7.n(d0Var);
            bVar7.o(dVar7);
            aVar.a(bVar7, new m.a.c.e.e(false, false));
            e0 e0Var = e0.f5988h;
            m.a.c.e.c cVar8 = m.a.c.e.c.a;
            m.a.c.e.d dVar8 = m.a.c.e.d.Single;
            m.a.c.e.b bVar8 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, kotlin.jvm.internal.v.b(com.sensorberg.encryptor.d.class));
            bVar8.n(e0Var);
            bVar8.o(dVar8);
            aVar.a(bVar8, new m.a.c.e.e(false, false));
            f0 f0Var = f0.f5990h;
            m.a.c.e.c cVar9 = m.a.c.e.c.a;
            m.a.c.e.d dVar9 = m.a.c.e.d.Single;
            m.a.c.e.b bVar9 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, kotlin.jvm.internal.v.b(g.e.k.a.class));
            bVar9.n(f0Var);
            bVar9.o(dVar9);
            aVar.a(bVar9, new m.a.c.e.e(false, false));
            C0334a aVar2 = C0334a.f5979h;
            m.a.c.e.c cVar10 = m.a.c.e.c.a;
            m.a.c.e.d dVar10 = m.a.c.e.d.Single;
            m.a.c.e.b bVar10 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, kotlin.jvm.internal.v.b(com.sensorberg.smartspaces.backend.m.a.class));
            bVar10.n(aVar2);
            bVar10.o(dVar10);
            aVar.a(bVar10, new m.a.c.e.e(false, false));
            C0335b bVar11 = C0335b.f5981h;
            m.a.c.e.c cVar11 = m.a.c.e.c.a;
            m.a.c.e.d dVar11 = m.a.c.e.d.Single;
            m.a.c.e.b bVar12 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, kotlin.jvm.internal.v.b(com.sensorberg.smartspaces.backend.m.g.class));
            bVar12.n(bVar11);
            bVar12.o(dVar11);
            aVar.a(bVar12, new m.a.c.e.e(false, false));
            c cVar12 = c.f5983h;
            m.a.c.e.c cVar13 = m.a.c.e.c.a;
            m.a.c.e.d dVar12 = m.a.c.e.d.Single;
            m.a.c.e.b bVar13 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, kotlin.jvm.internal.v.b(com.sensorberg.smartspaces.backend.m.i.class));
            bVar13.n(cVar12);
            bVar13.o(dVar12);
            aVar.a(bVar13, new m.a.c.e.e(false, false));
            d dVar13 = d.f5985h;
            m.a.c.e.c cVar14 = m.a.c.e.c.a;
            m.a.c.e.d dVar14 = m.a.c.e.d.Single;
            m.a.c.e.b bVar14 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, kotlin.jvm.internal.v.b(com.sensorberg.smartspaces.backend.q.k.class));
            bVar14.n(dVar13);
            bVar14.o(dVar14);
            aVar.a(bVar14, new m.a.c.e.e(false, false));
            e eVar = e.f5987h;
            m.a.c.e.c cVar15 = m.a.c.e.c.a;
            m.a.c.e.d dVar15 = m.a.c.e.d.Single;
            m.a.c.e.b bVar15 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, kotlin.jvm.internal.v.b(com.sensorberg.smartspaces.backend.q.h.class));
            bVar15.n(eVar);
            bVar15.o(dVar15);
            aVar.a(bVar15, new m.a.c.e.e(false, false));
            f fVar = f.f5989h;
            m.a.c.e.c cVar16 = m.a.c.e.c.a;
            m.a.c.e.d dVar16 = m.a.c.e.d.Single;
            m.a.c.e.b bVar16 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, kotlin.jvm.internal.v.b(com.sensorberg.smartspaces.backend.m.d.class));
            bVar16.n(fVar);
            bVar16.o(dVar16);
            aVar.a(bVar16, new m.a.c.e.e(false, false));
            g gVar = g.f5991h;
            m.a.c.e.c cVar17 = m.a.c.e.c.a;
            m.a.c.e.d dVar17 = m.a.c.e.d.Single;
            m.a.c.e.b bVar17 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, kotlin.jvm.internal.v.b(com.sensorberg.smartspaces.backend.m.e.class));
            bVar17.n(gVar);
            bVar17.o(dVar17);
            aVar.a(bVar17, new m.a.c.e.e(false, false));
            h hVar = h.f5992h;
            m.a.c.e.c cVar18 = m.a.c.e.c.a;
            m.a.c.e.d dVar18 = m.a.c.e.d.Single;
            m.a.c.e.b bVar18 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, kotlin.jvm.internal.v.b(com.sensorberg.smartspaces.backend.m.h.class));
            bVar18.n(hVar);
            bVar18.o(dVar18);
            aVar.a(bVar18, new m.a.c.e.e(false, false));
            i iVar = i.f5993h;
            m.a.c.e.c cVar19 = m.a.c.e.c.a;
            m.a.c.e.d dVar19 = m.a.c.e.d.Single;
            m.a.c.e.b bVar19 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, kotlin.jvm.internal.v.b(com.sensorberg.smartspaces.backend.h.class));
            bVar19.n(iVar);
            bVar19.o(dVar19);
            aVar.a(bVar19, new m.a.c.e.e(false, false));
            j jVar = new j(this);
            m.a.c.e.c cVar20 = m.a.c.e.c.a;
            m.a.c.e.d dVar20 = m.a.c.e.d.Single;
            m.a.c.e.b bVar20 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, kotlin.jvm.internal.v.b(com.sensorberg.smartspaces.backend.i.class));
            bVar20.n(jVar);
            bVar20.o(dVar20);
            aVar.a(bVar20, new m.a.c.e.e(false, false));
            l lVar = new l(this);
            m.a.c.e.c cVar21 = m.a.c.e.c.a;
            m.a.c.e.d dVar21 = m.a.c.e.d.Single;
            m.a.c.e.b bVar21 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, kotlin.jvm.internal.v.b(com.sensorberg.smartspaces.backend.q.c.class));
            bVar21.n(lVar);
            bVar21.o(dVar21);
            aVar.a(bVar21, new m.a.c.e.e(false, false));
            m mVar = m.f5997h;
            m.a.c.e.c cVar22 = m.a.c.e.c.a;
            m.a.c.e.d dVar22 = m.a.c.e.d.Single;
            m.a.c.e.b bVar22 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, kotlin.jvm.internal.v.b(ScheduledExecutorService.class));
            bVar22.n(mVar);
            bVar22.o(dVar22);
            aVar.a(bVar22, new m.a.c.e.e(false, false));
            n nVar = new n(this);
            m.a.c.e.c cVar23 = m.a.c.e.c.a;
            m.a.c.e.d dVar23 = m.a.c.e.d.Single;
            m.a.c.e.b bVar23 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, kotlin.jvm.internal.v.b(k.z.class));
            bVar23.n(nVar);
            bVar23.o(dVar23);
            aVar.a(bVar23, new m.a.c.e.e(false, false));
            o oVar = new o(this);
            m.a.c.e.c cVar24 = m.a.c.e.c.a;
            m.a.c.e.d dVar24 = m.a.c.e.d.Single;
            m.a.c.e.b bVar24 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, kotlin.jvm.internal.v.b(g.a.a.b.class));
            bVar24.n(oVar);
            bVar24.o(dVar24);
            aVar.a(bVar24, new m.a.c.e.e(false, false));
            p pVar = p.f6000h;
            m.a.c.e.c cVar25 = m.a.c.e.c.a;
            m.a.c.e.d dVar25 = m.a.c.e.d.Single;
            m.a.c.e.b bVar25 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, kotlin.jvm.internal.v.b(com.sensorberg.smartspaces.backend.q.p.e.class));
            bVar25.n(pVar);
            bVar25.o(dVar25);
            aVar.a(bVar25, new m.a.c.e.e(false, false));
            q qVar = q.f6001h;
            m.a.c.e.c cVar26 = m.a.c.e.c.a;
            m.a.c.e.d dVar26 = m.a.c.e.d.Single;
            m.a.c.e.b bVar26 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, kotlin.jvm.internal.v.b(com.sensorberg.smartspaces.backend.q.p.b.class));
            bVar26.n(qVar);
            bVar26.o(dVar26);
            aVar.a(bVar26, new m.a.c.e.e(false, false));
            r rVar = r.f6002h;
            m.a.c.e.c cVar27 = m.a.c.e.c.a;
            m.a.c.e.d dVar27 = m.a.c.e.d.Single;
            m.a.c.e.b bVar27 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, kotlin.jvm.internal.v.b(g.e.n.c.e.d.a.class));
            bVar27.n(rVar);
            bVar27.o(dVar27);
            aVar.a(bVar27, new m.a.c.e.e(false, false));
            s sVar = s.f6003h;
            m.a.c.e.c cVar28 = m.a.c.e.c.a;
            m.a.c.e.d dVar28 = m.a.c.e.d.Single;
            m.a.c.e.b bVar28 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, kotlin.jvm.internal.v.b(g.e.n.c.j.b.e.class));
            bVar28.n(sVar);
            bVar28.o(dVar28);
            aVar.a(bVar28, new m.a.c.e.e(false, false));
            t tVar = t.f6004h;
            m.a.c.e.c cVar29 = m.a.c.e.c.a;
            m.a.c.e.d dVar29 = m.a.c.e.d.Single;
            m.a.c.e.b bVar29 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, kotlin.jvm.internal.v.b(g.e.n.c.h.b.f.class));
            bVar29.n(tVar);
            bVar29.o(dVar29);
            aVar.a(bVar29, new m.a.c.e.e(false, false));
            u uVar = u.f6005h;
            m.a.c.e.c cVar30 = m.a.c.e.c.a;
            m.a.c.e.d dVar30 = m.a.c.e.d.Single;
            m.a.c.e.b bVar30 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, kotlin.jvm.internal.v.b(g.e.n.c.k.b.a.class));
            bVar30.n(uVar);
            bVar30.o(dVar30);
            aVar.a(bVar30, new m.a.c.e.e(false, false));
            w wVar = w.f6007h;
            m.a.c.e.c cVar31 = m.a.c.e.c.a;
            m.a.c.e.d dVar31 = m.a.c.e.d.Single;
            m.a.c.e.b bVar31 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, kotlin.jvm.internal.v.b(g.e.n.c.g.f.c.class));
            bVar31.n(wVar);
            bVar31.o(dVar31);
            aVar.a(bVar31, new m.a.c.e.e(false, false));
            x xVar = x.f6008h;
            m.a.c.e.c cVar32 = m.a.c.e.c.a;
            m.a.c.e.d dVar32 = m.a.c.e.d.Single;
            m.a.c.e.b bVar32 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, kotlin.jvm.internal.v.b(com.sensorberg.smartspaces.backend.q.p.g.class));
            bVar32.n(xVar);
            bVar32.o(dVar32);
            aVar.a(bVar32, new m.a.c.e.e(false, false));
            y yVar = y.f6009h;
            m.a.c.e.c cVar33 = m.a.c.e.c.a;
            m.a.c.e.d dVar33 = m.a.c.e.d.Single;
            m.a.c.e.b bVar33 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, kotlin.jvm.internal.v.b(com.sensorberg.smartspaces.backend.q.p.d.class));
            bVar33.n(yVar);
            bVar33.o(dVar33);
            aVar.a(bVar33, new m.a.c.e.e(false, false));
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            a((m.a.c.h.a) obj);
            return kotlin.x.a;
        }
    }

    private static final m.a.c.h.a a(Context context, v vVar, String str, g gVar, Map<p, ? extends g.a.a.h.b<? extends Object>> map) {
        return m.a.d.b.b(false, false, new a(context, str, vVar, gVar, map), 3, (Object) null);
    }

    public static final void b() {
        c.b.a();
    }

    public static final void c(Context context, v vVar, String str, g gVar, Map<p, ? extends g.a.a.h.b<? extends Object>> map) {
        k.e(context, "context");
        k.e(vVar, "baseHttpUrl");
        k.e(str, "oauthId");
        k.e(gVar, "certificatePinner");
        k.e(map, "apolloTypeAdapters");
        c.b.c(a(context, vVar, str, gVar, map));
    }
}
