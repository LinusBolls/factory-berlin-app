package com.sensorberg.notifications.sdk.internal;

import android.app.Application;
import android.content.SharedPreferences;
import androidx.work.q;
import com.sensorberg.notifications.sdk.internal.model.Trigger;
import com.sensorberg.notifications.sdk.internal.storage.SdkDatabase;
import com.sensorberg.notifications.sdk.internal.work.WorkUtils;
import com.squareup.moshi.c;
import com.squareup.moshi.n;
import com.squareup.moshi.o;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import kotlin.e0.c.p;
import kotlin.i;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.v;
import kotlin.x;
import m.a.d.b;

@i(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000:\u0002\u0012\u0013B'\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0007\u001a\u00020\u0001\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0002\u001a\u00020\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0007\u001a\u00020\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0003R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0019\u0010\f\u001a\u00020\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, d2 = {"Lcom/sensorberg/notifications/sdk/internal/InjectionModule;", "", "apiKey", "Ljava/lang/String;", "Landroid/app/Application;", "app", "Landroid/app/Application;", "baseUrl", "", "log", "Z", "Lorg/koin/core/module/Module;", "module", "Lorg/koin/core/module/Module;", "getModule", "()Lorg/koin/core/module/Module;", "<init>", "(Landroid/app/Application;Ljava/lang/String;Ljava/lang/String;Z)V", "TriggerTypeObjectAdapter", "UuidObjectAdapter", "notifications_release"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
/* compiled from: InjectionModule.kt */
public final class InjectionModule {
    private final m.a.c.h.a a = b.b(false, false, new a(this), 3, (Object) null);
    /* access modifiers changed from: private */
    public final Application b;
    /* access modifiers changed from: private */
    public final String c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final String f5134d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final boolean f5135e;

    @i(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\bÂ\u0002\u0018\u0000B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/sensorberg/notifications/sdk/internal/InjectionModule$TriggerTypeObjectAdapter;", "Lcom/sensorberg/notifications/sdk/internal/model/Trigger$Type;", "value", "", "fromTriggerType", "(Lcom/sensorberg/notifications/sdk/internal/model/Trigger$Type;)I", "toTriggerType", "(I)Lcom/sensorberg/notifications/sdk/internal/model/Trigger$Type;", "<init>", "()V", "notifications_release"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
    /* compiled from: InjectionModule.kt */
    private static final class TriggerTypeObjectAdapter {
        public static final TriggerTypeObjectAdapter a = new TriggerTypeObjectAdapter();

        private TriggerTypeObjectAdapter() {
        }

        @o
        public final int fromTriggerType(Trigger.b bVar) {
            k.f(bVar, "value");
            int i2 = e.a[bVar.ordinal()];
            if (i2 == 1) {
                return 0;
            }
            if (i2 == 2) {
                return 1;
            }
            if (i2 == 3) {
                return 2;
            }
            throw new NoWhenBranchMatchedException();
        }

        @c
        public final Trigger.b toTriggerType(int i2) {
            if (i2 == 0) {
                return Trigger.b.Enter;
            }
            if (i2 == 1) {
                return Trigger.b.Exit;
            }
            if (i2 == 2) {
                return Trigger.b.EnterOrExit;
            }
            throw new IllegalArgumentException("Trigger.Type cannot be " + i2);
        }
    }

    @i(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\bÂ\u0002\u0018\u0000B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/sensorberg/notifications/sdk/internal/InjectionModule$UuidObjectAdapter;", "Ljava/util/UUID;", "value", "", "fromUUID", "(Ljava/util/UUID;)Ljava/lang/String;", "toUUID", "(Ljava/lang/String;)Ljava/util/UUID;", "<init>", "()V", "notifications_release"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
    /* compiled from: InjectionModule.kt */
    private static final class UuidObjectAdapter {
        public static final UuidObjectAdapter a = new UuidObjectAdapter();

        private UuidObjectAdapter() {
        }

        @o
        public final String fromUUID(UUID uuid) {
            k.f(uuid, "value");
            String uuid2 = uuid.toString();
            k.b(uuid2, "value.toString()");
            return uuid2;
        }

        @c
        public final UUID toUUID(String str) {
            k.f(str, "value");
            UUID fromString = UUID.fromString(str);
            k.b(fromString, "UUID.fromString(value)");
            return fromString;
        }
    }

    /* compiled from: InjectionModule.kt */
    static final class a extends kotlin.jvm.internal.l implements kotlin.e0.c.l<m.a.c.h.a, x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ InjectionModule f5136h;

        /* renamed from: com.sensorberg.notifications.sdk.internal.InjectionModule$a$a  reason: collision with other inner class name */
        /* compiled from: InjectionModule.kt */
        static final class C0166a extends kotlin.jvm.internal.l implements p<m.a.c.l.a, m.a.c.i.a, l> {

            /* renamed from: h  reason: collision with root package name */
            public static final C0166a f5137h = new C0166a();

            C0166a() {
                super(2);
            }

            /* renamed from: a */
            public final l l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                kotlin.jvm.internal.k.f(aVar, "$receiver");
                kotlin.jvm.internal.k.f(aVar2, "it");
                return l.b.a((SharedPreferences) aVar.e(v.b(SharedPreferences.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null), "2.7.17");
            }
        }

        /* compiled from: InjectionModule.kt */
        static final class b extends kotlin.jvm.internal.l implements p<m.a.c.l.a, m.a.c.i.a, j> {

            /* renamed from: h  reason: collision with root package name */
            public static final b f5138h = new b();

            b() {
                super(2);
            }

            /* renamed from: a */
            public final j l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                kotlin.jvm.internal.k.f(aVar, "$receiver");
                kotlin.jvm.internal.k.f(aVar2, "it");
                return new j();
            }
        }

        /* compiled from: InjectionModule.kt */
        static final class c extends kotlin.jvm.internal.l implements p<m.a.c.l.a, m.a.c.i.a, com.google.android.gms.common.e> {

            /* renamed from: h  reason: collision with root package name */
            public static final c f5139h = new c();

            c() {
                super(2);
            }

            /* renamed from: a */
            public final com.google.android.gms.common.e l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                kotlin.jvm.internal.k.f(aVar, "$receiver");
                kotlin.jvm.internal.k.f(aVar2, "it");
                return com.google.android.gms.common.e.n();
            }
        }

        /* compiled from: InjectionModule.kt */
        static final class d extends kotlin.jvm.internal.l implements p<m.a.c.l.a, m.a.c.i.a, WorkUtils> {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ a f5140h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            d(a aVar) {
                super(2);
                this.f5140h = aVar;
            }

            /* renamed from: a */
            public final WorkUtils l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                kotlin.jvm.internal.k.f(aVar, "$receiver");
                kotlin.jvm.internal.k.f(aVar2, "it");
                q j2 = q.j();
                kotlin.jvm.internal.k.b(j2, "WorkManager.getInstance()");
                return new WorkUtils(j2, this.f5140h.f5136h.b, (SdkDatabase) aVar.e(v.b(SdkDatabase.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null));
            }
        }

        /* compiled from: InjectionModule.kt */
        static final class e extends kotlin.jvm.internal.l implements p<m.a.c.l.a, m.a.c.i.a, com.squareup.moshi.n> {

            /* renamed from: h  reason: collision with root package name */
            public static final e f5141h = new e();

            e() {
                super(2);
            }

            /* renamed from: a */
            public final com.squareup.moshi.n l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                kotlin.jvm.internal.k.f(aVar, "$receiver");
                kotlin.jvm.internal.k.f(aVar2, "it");
                n.a aVar3 = new n.a();
                aVar3.b(UuidObjectAdapter.a);
                aVar3.b(TriggerTypeObjectAdapter.a);
                return aVar3.c();
            }
        }

        /* compiled from: InjectionModule.kt */
        static final class f extends kotlin.jvm.internal.l implements p<m.a.c.l.a, m.a.c.i.a, com.sensorberg.notifications.sdk.internal.m.a> {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ a f5142h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            f(a aVar) {
                super(2);
                this.f5142h = aVar;
            }

            /* renamed from: a */
            public final com.sensorberg.notifications.sdk.internal.m.a l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                kotlin.jvm.internal.k.f(aVar, "$receiver");
                kotlin.jvm.internal.k.f(aVar2, "it");
                SharedPreferences sharedPreferences = (SharedPreferences) aVar.e(v.b(SharedPreferences.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null);
                String string = sharedPreferences.getString("installation_id", (String) null);
                if (string == null) {
                    String uuid = UUID.randomUUID().toString();
                    kotlin.jvm.internal.k.b(uuid, "UUID.randomUUID().toString()");
                    String z = p.z(uuid, "-", "", false, 4, (Object) null);
                    if (z != null) {
                        string = z.toLowerCase();
                        kotlin.jvm.internal.k.b(string, "(this as java.lang.String).toLowerCase()");
                        sharedPreferences.edit().putString("installation_id", string).apply();
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                    }
                }
                return new com.sensorberg.notifications.sdk.internal.m.b.b(this.f5142h.f5136h.b, this.f5142h.f5136h.f5134d, this.f5142h.f5136h.c, string, this.f5142h.f5136h.f5135e);
            }
        }

        /* compiled from: InjectionModule.kt */
        static final class g extends kotlin.jvm.internal.l implements p<m.a.c.l.a, m.a.c.i.a, Application> {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ a f5143h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            g(a aVar) {
                super(2);
                this.f5143h = aVar;
            }

            /* renamed from: a */
            public final Application l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                kotlin.jvm.internal.k.f(aVar, "$receiver");
                kotlin.jvm.internal.k.f(aVar2, "it");
                return this.f5143h.f5136h.b;
            }
        }

        /* compiled from: InjectionModule.kt */
        static final class h extends kotlin.jvm.internal.l implements p<m.a.c.l.a, m.a.c.i.a, Executor> {

            /* renamed from: h  reason: collision with root package name */
            public static final h f5144h = new h();

            h() {
                super(2);
            }

            /* renamed from: a */
            public final Executor l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                kotlin.jvm.internal.k.f(aVar, "$receiver");
                kotlin.jvm.internal.k.f(aVar2, "it");
                ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(3);
                if (newFixedThreadPool != null) {
                    return newFixedThreadPool;
                }
                throw new TypeCastException("null cannot be cast to non-null type java.util.concurrent.Executor");
            }
        }

        /* compiled from: InjectionModule.kt */
        static final class i extends kotlin.jvm.internal.l implements p<m.a.c.l.a, m.a.c.i.a, SdkDatabase> {

            /* renamed from: h  reason: collision with root package name */
            public static final i f5145h = new i();

            i() {
                super(2);
            }

            /* renamed from: a */
            public final SdkDatabase l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                kotlin.jvm.internal.k.f(aVar, "$receiver");
                kotlin.jvm.internal.k.f(aVar2, "it");
                return SdkDatabase.f5369l.a((Application) aVar.e(v.b(Application.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null));
            }
        }

        /* compiled from: InjectionModule.kt */
        static final class j extends kotlin.jvm.internal.l implements p<m.a.c.l.a, m.a.c.i.a, com.sensorberg.notifications.sdk.internal.storage.a> {

            /* renamed from: h  reason: collision with root package name */
            public static final j f5146h = new j();

            j() {
                super(2);
            }

            /* renamed from: a */
            public final com.sensorberg.notifications.sdk.internal.storage.a l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                kotlin.jvm.internal.k.f(aVar, "$receiver");
                kotlin.jvm.internal.k.f(aVar2, "it");
                return ((SdkDatabase) aVar.e(v.b(SdkDatabase.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null)).y();
            }
        }

        /* compiled from: InjectionModule.kt */
        static final class k extends kotlin.jvm.internal.l implements p<m.a.c.l.a, m.a.c.i.a, com.sensorberg.notifications.sdk.internal.storage.l> {

            /* renamed from: h  reason: collision with root package name */
            public static final k f5147h = new k();

            k() {
                super(2);
            }

            /* renamed from: a */
            public final com.sensorberg.notifications.sdk.internal.storage.l l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                kotlin.jvm.internal.k.f(aVar, "$receiver");
                kotlin.jvm.internal.k.f(aVar2, "it");
                return ((SdkDatabase) aVar.e(v.b(SdkDatabase.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null)).C();
            }
        }

        /* compiled from: InjectionModule.kt */
        static final class l extends kotlin.jvm.internal.l implements p<m.a.c.l.a, m.a.c.i.a, com.sensorberg.notifications.sdk.internal.storage.c> {

            /* renamed from: h  reason: collision with root package name */
            public static final l f5148h = new l();

            l() {
                super(2);
            }

            /* renamed from: a */
            public final com.sensorberg.notifications.sdk.internal.storage.c l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                kotlin.jvm.internal.k.f(aVar, "$receiver");
                kotlin.jvm.internal.k.f(aVar2, "it");
                return ((SdkDatabase) aVar.e(v.b(SdkDatabase.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null)).z();
            }
        }

        /* compiled from: InjectionModule.kt */
        static final class m extends kotlin.jvm.internal.l implements p<m.a.c.l.a, m.a.c.i.a, SharedPreferences> {

            /* renamed from: h  reason: collision with root package name */
            public static final m f5149h = new m();

            m() {
                super(2);
            }

            /* renamed from: a */
            public final SharedPreferences l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                kotlin.jvm.internal.k.f(aVar, "$receiver");
                kotlin.jvm.internal.k.f(aVar2, "it");
                return ((Application) aVar.e(v.b(Application.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null)).getSharedPreferences("notifications-sdk", 0);
            }
        }

        /* compiled from: InjectionModule.kt */
        static final class n extends kotlin.jvm.internal.l implements p<m.a.c.l.a, m.a.c.i.a, k> {

            /* renamed from: h  reason: collision with root package name */
            public static final n f5150h = new n();

            n() {
                super(2);
            }

            /* renamed from: a */
            public final k l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                kotlin.jvm.internal.k.f(aVar, "$receiver");
                kotlin.jvm.internal.k.f(aVar2, "it");
                return new k((com.sensorberg.notifications.sdk.internal.storage.a) aVar.e(v.b(com.sensorberg.notifications.sdk.internal.storage.a.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null), (WorkUtils) aVar.e(v.b(WorkUtils.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null), (a) aVar.e(v.b(a.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null), (Application) aVar.e(v.b(Application.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null));
            }
        }

        /* compiled from: InjectionModule.kt */
        static final class o extends kotlin.jvm.internal.l implements p<m.a.c.l.a, m.a.c.i.a, a> {

            /* renamed from: h  reason: collision with root package name */
            public static final o f5151h = new o();

            o() {
                super(2);
            }

            /* renamed from: a */
            public final a l(m.a.c.l.a aVar, m.a.c.i.a aVar2) {
                kotlin.jvm.internal.k.f(aVar, "$receiver");
                kotlin.jvm.internal.k.f(aVar2, "it");
                return new a((Application) aVar.e(v.b(Application.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null), (com.sensorberg.notifications.sdk.internal.storage.a) aVar.e(v.b(com.sensorberg.notifications.sdk.internal.storage.a.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null), (SharedPreferences) aVar.e(v.b(SharedPreferences.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(InjectionModule injectionModule) {
            super(1);
            this.f5136h = injectionModule;
        }

        public final void a(m.a.c.h.a aVar) {
            kotlin.jvm.internal.k.f(aVar, "$receiver");
            g gVar = new g(this);
            m.a.c.e.c cVar = m.a.c.e.c.a;
            m.a.c.e.d dVar = m.a.c.e.d.Single;
            m.a.c.e.b bVar = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, v.b(Application.class));
            bVar.n(gVar);
            bVar.o(dVar);
            aVar.a(bVar, new m.a.c.e.e(false, false));
            h hVar = h.f5144h;
            m.a.c.e.c cVar2 = m.a.c.e.c.a;
            m.a.c.e.d dVar2 = m.a.c.e.d.Single;
            m.a.c.e.b bVar2 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, v.b(Executor.class));
            bVar2.n(hVar);
            bVar2.o(dVar2);
            aVar.a(bVar2, new m.a.c.e.e(false, false));
            i iVar = i.f5145h;
            m.a.c.e.c cVar3 = m.a.c.e.c.a;
            m.a.c.e.d dVar3 = m.a.c.e.d.Single;
            m.a.c.e.b bVar3 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, v.b(SdkDatabase.class));
            bVar3.n(iVar);
            bVar3.o(dVar3);
            aVar.a(bVar3, new m.a.c.e.e(false, false));
            j jVar = j.f5146h;
            m.a.c.e.c cVar4 = m.a.c.e.c.a;
            m.a.c.e.d dVar4 = m.a.c.e.d.Single;
            m.a.c.e.b bVar4 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, v.b(com.sensorberg.notifications.sdk.internal.storage.a.class));
            bVar4.n(jVar);
            bVar4.o(dVar4);
            aVar.a(bVar4, new m.a.c.e.e(false, false));
            k kVar = k.f5147h;
            m.a.c.e.c cVar5 = m.a.c.e.c.a;
            m.a.c.e.d dVar5 = m.a.c.e.d.Single;
            m.a.c.e.b bVar5 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, v.b(com.sensorberg.notifications.sdk.internal.storage.l.class));
            bVar5.n(kVar);
            bVar5.o(dVar5);
            aVar.a(bVar5, new m.a.c.e.e(false, false));
            l lVar = l.f5148h;
            m.a.c.e.c cVar6 = m.a.c.e.c.a;
            m.a.c.e.d dVar6 = m.a.c.e.d.Single;
            m.a.c.e.b bVar6 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, v.b(com.sensorberg.notifications.sdk.internal.storage.c.class));
            bVar6.n(lVar);
            bVar6.o(dVar6);
            aVar.a(bVar6, new m.a.c.e.e(false, false));
            m mVar = m.f5149h;
            m.a.c.e.c cVar7 = m.a.c.e.c.a;
            m.a.c.e.d dVar7 = m.a.c.e.d.Single;
            m.a.c.e.b bVar7 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, v.b(SharedPreferences.class));
            bVar7.n(mVar);
            bVar7.o(dVar7);
            aVar.a(bVar7, new m.a.c.e.e(false, false));
            n nVar = n.f5150h;
            m.a.c.e.c cVar8 = m.a.c.e.c.a;
            m.a.c.e.d dVar8 = m.a.c.e.d.Single;
            m.a.c.e.b bVar8 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, v.b(k.class));
            bVar8.n(nVar);
            bVar8.o(dVar8);
            aVar.a(bVar8, new m.a.c.e.e(false, false));
            o oVar = o.f5151h;
            m.a.c.e.c cVar9 = m.a.c.e.c.a;
            m.a.c.e.d dVar9 = m.a.c.e.d.Single;
            m.a.c.e.b bVar9 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, v.b(a.class));
            bVar9.n(oVar);
            bVar9.o(dVar9);
            aVar.a(bVar9, new m.a.c.e.e(false, false));
            C0166a aVar2 = C0166a.f5137h;
            m.a.c.e.c cVar10 = m.a.c.e.c.a;
            m.a.c.e.d dVar10 = m.a.c.e.d.Single;
            m.a.c.e.b bVar10 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, v.b(l.class));
            bVar10.n(aVar2);
            bVar10.o(dVar10);
            aVar.a(bVar10, new m.a.c.e.e(false, false));
            b bVar11 = b.f5138h;
            m.a.c.e.c cVar11 = m.a.c.e.c.a;
            m.a.c.e.d dVar11 = m.a.c.e.d.Single;
            m.a.c.e.b bVar12 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, v.b(j.class));
            bVar12.n(bVar11);
            bVar12.o(dVar11);
            aVar.a(bVar12, new m.a.c.e.e(false, false));
            c cVar12 = c.f5139h;
            m.a.c.e.c cVar13 = m.a.c.e.c.a;
            m.a.c.e.d dVar12 = m.a.c.e.d.Single;
            m.a.c.e.b bVar13 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, v.b(com.google.android.gms.common.e.class));
            bVar13.n(cVar12);
            bVar13.o(dVar12);
            aVar.a(bVar13, new m.a.c.e.e(false, false));
            d dVar13 = new d(this);
            m.a.c.e.c cVar14 = m.a.c.e.c.a;
            m.a.c.e.d dVar14 = m.a.c.e.d.Single;
            m.a.c.e.b bVar14 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, v.b(WorkUtils.class));
            bVar14.n(dVar13);
            bVar14.o(dVar14);
            aVar.a(bVar14, new m.a.c.e.e(false, false));
            e eVar = e.f5141h;
            m.a.c.e.c cVar15 = m.a.c.e.c.a;
            m.a.c.e.d dVar15 = m.a.c.e.d.Single;
            m.a.c.e.b bVar15 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, v.b(com.squareup.moshi.n.class));
            bVar15.n(eVar);
            bVar15.o(dVar15);
            aVar.a(bVar15, new m.a.c.e.e(false, false));
            f fVar = new f(this);
            m.a.c.e.c cVar16 = m.a.c.e.c.a;
            m.a.c.e.d dVar16 = m.a.c.e.d.Single;
            m.a.c.e.b bVar16 = new m.a.c.e.b((m.a.c.j.a) null, (m.a.c.j.a) null, v.b(com.sensorberg.notifications.sdk.internal.m.a.class));
            bVar16.n(fVar);
            bVar16.o(dVar16);
            aVar.a(bVar16, new m.a.c.e.e(false, false));
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            a((m.a.c.h.a) obj);
            return x.a;
        }
    }

    public InjectionModule(Application application, String str, String str2, boolean z) {
        k.f(application, "app");
        k.f(str, "apiKey");
        k.f(str2, "baseUrl");
        this.b = application;
        this.c = str;
        this.f5134d = str2;
        this.f5135e = z;
    }

    public final m.a.c.h.a e() {
        return this.a;
    }
}
