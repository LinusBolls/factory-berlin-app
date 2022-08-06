package com.sensorberg.smartspaces.backend;

import com.sensorberg.smartspaces.backend.a;
import com.sensorberg.smartspaces.backend.l.a;
import com.sensorberg.smartspaces.backend.model.ActuatorRequest;
import com.sensorberg.smartspaces.backend.model.AuthToken;
import com.sensorberg.smartspaces.backend.model.BeBooking;
import com.sensorberg.smartspaces.backend.model.BeBookingInCluster;
import com.sensorberg.smartspaces.backend.model.BlueIdDeviceDetails;
import com.sensorberg.smartspaces.backend.model.ChangeUserPassword;
import com.sensorberg.smartspaces.backend.model.Statistics;
import com.sensorberg.smartspaces.backend.model.User;
import com.sensorberg.smartspaces.backend.model.UserDevice;
import com.sensorberg.smartspaces.sdk.exception.BackendException;
import java.security.MessageDigest;
import java.util.List;
import java.util.UUID;
import org.threeten.bp.LocalDate;

/* compiled from: MessagesFactory.kt */
public final class h implements com.sensorberg.smartspaces.backend.l.a {
    /* access modifiers changed from: private */
    public static final char[] q;
    public static final j r = new j((DefaultConstructorMarker) null);

    /* renamed from: g  reason: collision with root package name */
    private final kotlin.e f5603g = g.a(new a(n().d(), (m.a.c.j.a) null, (kotlin.e0.c.a) null));

    /* renamed from: h  reason: collision with root package name */
    private final kotlin.e f5604h = g.a(new b(n().d(), (m.a.c.j.a) null, (kotlin.e0.c.a) null));

    /* renamed from: i  reason: collision with root package name */
    private final kotlin.e f5605i = g.a(new c(n().d(), (m.a.c.j.a) null, (kotlin.e0.c.a) null));

    /* renamed from: j  reason: collision with root package name */
    private final kotlin.e f5606j = g.a(new d(n().d(), (m.a.c.j.a) null, (kotlin.e0.c.a) null));

    /* renamed from: k  reason: collision with root package name */
    private final kotlin.e f5607k = g.a(new e(n().d(), (m.a.c.j.a) null, (kotlin.e0.c.a) null));

    /* renamed from: l  reason: collision with root package name */
    private final kotlin.e f5608l = g.a(new f(n().d(), (m.a.c.j.a) null, (kotlin.e0.c.a) null));

    /* renamed from: m  reason: collision with root package name */
    private final kotlin.e f5609m = g.a(new g(n().d(), (m.a.c.j.a) null, (kotlin.e0.c.a) null));

    /* renamed from: n  reason: collision with root package name */
    private final kotlin.e f5610n = g.a(new C0186h(n().d(), (m.a.c.j.a) null, (kotlin.e0.c.a) null));
    private final kotlin.e o = g.a(new i(n().d(), (m.a.c.j.a) null, (kotlin.e0.c.a) null));
    private final com.sensorberg.smartspaces.backend.q.k p;

    /* compiled from: Scope.kt */
    public static final class a extends kotlin.jvm.internal.l implements kotlin.e0.c.a<com.sensorberg.smartspaces.backend.q.l> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ m.a.c.l.a f5611h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f5612i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f5613j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(m.a.c.l.a aVar, m.a.c.j.a aVar2, kotlin.e0.c.a aVar3) {
            super(0);
            this.f5611h = aVar;
            this.f5612i = aVar2;
            this.f5613j = aVar3;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, com.sensorberg.smartspaces.backend.q.l] */
        public final com.sensorberg.smartspaces.backend.q.l d() {
            return this.f5611h.e(kotlin.jvm.internal.v.b(com.sensorberg.smartspaces.backend.q.l.class), this.f5612i, this.f5613j);
        }
    }

    /* compiled from: Scope.kt */
    public static final class b extends kotlin.jvm.internal.l implements kotlin.e0.c.a<com.sensorberg.smartspaces.backend.m.i> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ m.a.c.l.a f5614h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f5615i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f5616j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(m.a.c.l.a aVar, m.a.c.j.a aVar2, kotlin.e0.c.a aVar3) {
            super(0);
            this.f5614h = aVar;
            this.f5615i = aVar2;
            this.f5616j = aVar3;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [com.sensorberg.smartspaces.backend.m.i, java.lang.Object] */
        public final com.sensorberg.smartspaces.backend.m.i d() {
            return this.f5614h.e(kotlin.jvm.internal.v.b(com.sensorberg.smartspaces.backend.m.i.class), this.f5615i, this.f5616j);
        }
    }

    /* compiled from: Scope.kt */
    public static final class c extends kotlin.jvm.internal.l implements kotlin.e0.c.a<com.sensorberg.smartspaces.backend.m.h> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ m.a.c.l.a f5617h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f5618i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f5619j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(m.a.c.l.a aVar, m.a.c.j.a aVar2, kotlin.e0.c.a aVar3) {
            super(0);
            this.f5617h = aVar;
            this.f5618i = aVar2;
            this.f5619j = aVar3;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [com.sensorberg.smartspaces.backend.m.h, java.lang.Object] */
        public final com.sensorberg.smartspaces.backend.m.h d() {
            return this.f5617h.e(kotlin.jvm.internal.v.b(com.sensorberg.smartspaces.backend.m.h.class), this.f5618i, this.f5619j);
        }
    }

    /* compiled from: Scope.kt */
    public static final class d extends kotlin.jvm.internal.l implements kotlin.e0.c.a<com.sensorberg.smartspaces.backend.m.d> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ m.a.c.l.a f5620h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f5621i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f5622j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(m.a.c.l.a aVar, m.a.c.j.a aVar2, kotlin.e0.c.a aVar3) {
            super(0);
            this.f5620h = aVar;
            this.f5621i = aVar2;
            this.f5622j = aVar3;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, com.sensorberg.smartspaces.backend.m.d] */
        public final com.sensorberg.smartspaces.backend.m.d d() {
            return this.f5620h.e(kotlin.jvm.internal.v.b(com.sensorberg.smartspaces.backend.m.d.class), this.f5621i, this.f5622j);
        }
    }

    /* compiled from: Scope.kt */
    public static final class e extends kotlin.jvm.internal.l implements kotlin.e0.c.a<com.sensorberg.smartspaces.backend.q.c> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ m.a.c.l.a f5623h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f5624i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f5625j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(m.a.c.l.a aVar, m.a.c.j.a aVar2, kotlin.e0.c.a aVar3) {
            super(0);
            this.f5623h = aVar;
            this.f5624i = aVar2;
            this.f5625j = aVar3;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [com.sensorberg.smartspaces.backend.q.c, java.lang.Object] */
        public final com.sensorberg.smartspaces.backend.q.c d() {
            return this.f5623h.e(kotlin.jvm.internal.v.b(com.sensorberg.smartspaces.backend.q.c.class), this.f5624i, this.f5625j);
        }
    }

    /* compiled from: Scope.kt */
    public static final class f extends kotlin.jvm.internal.l implements kotlin.e0.c.a<com.sensorberg.smartspaces.backend.m.a> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ m.a.c.l.a f5626h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f5627i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f5628j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(m.a.c.l.a aVar, m.a.c.j.a aVar2, kotlin.e0.c.a aVar3) {
            super(0);
            this.f5626h = aVar;
            this.f5627i = aVar2;
            this.f5628j = aVar3;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [com.sensorberg.smartspaces.backend.m.a, java.lang.Object] */
        public final com.sensorberg.smartspaces.backend.m.a d() {
            return this.f5626h.e(kotlin.jvm.internal.v.b(com.sensorberg.smartspaces.backend.m.a.class), this.f5627i, this.f5628j);
        }
    }

    /* compiled from: Scope.kt */
    public static final class g extends kotlin.jvm.internal.l implements kotlin.e0.c.a<com.sensorberg.smartspaces.backend.q.h> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ m.a.c.l.a f5629h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f5630i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f5631j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(m.a.c.l.a aVar, m.a.c.j.a aVar2, kotlin.e0.c.a aVar3) {
            super(0);
            this.f5629h = aVar;
            this.f5630i = aVar2;
            this.f5631j = aVar3;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, com.sensorberg.smartspaces.backend.q.h] */
        public final com.sensorberg.smartspaces.backend.q.h d() {
            return this.f5629h.e(kotlin.jvm.internal.v.b(com.sensorberg.smartspaces.backend.q.h.class), this.f5630i, this.f5631j);
        }
    }

    /* renamed from: com.sensorberg.smartspaces.backend.h$h  reason: collision with other inner class name */
    /* compiled from: Scope.kt */
    public static final class C0186h extends kotlin.jvm.internal.l implements kotlin.e0.c.a<g.e.k.a> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ m.a.c.l.a f5632h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f5633i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f5634j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0186h(m.a.c.l.a aVar, m.a.c.j.a aVar2, kotlin.e0.c.a aVar3) {
            super(0);
            this.f5632h = aVar;
            this.f5633i = aVar2;
            this.f5634j = aVar3;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [g.e.k.a, java.lang.Object] */
        public final g.e.k.a d() {
            return this.f5632h.e(kotlin.jvm.internal.v.b(g.e.k.a.class), this.f5633i, this.f5634j);
        }
    }

    /* compiled from: Scope.kt */
    public static final class i extends kotlin.jvm.internal.l implements kotlin.e0.c.a<com.google.gson.f> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ m.a.c.l.a f5635h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f5636i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f5637j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public i(m.a.c.l.a aVar, m.a.c.j.a aVar2, kotlin.e0.c.a aVar3) {
            super(0);
            this.f5635h = aVar;
            this.f5636i = aVar2;
            this.f5637j = aVar3;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [com.google.gson.f, java.lang.Object] */
        public final com.google.gson.f d() {
            return this.f5635h.e(kotlin.jvm.internal.v.b(com.google.gson.f.class), this.f5636i, this.f5637j);
        }
    }

    /* compiled from: MessagesFactory.kt */
    public static final class j {
        private j() {
        }

        public final String a(byte[] bArr) {
            kotlin.jvm.internal.k.e(bArr, "bytes");
            char[] cArr = new char[(bArr.length * 2)];
            int length = bArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                byte b = bArr[i2] & 255;
                int i3 = i2 * 2;
                cArr[i3] = h.q[b >>> 4];
                cArr[i3 + 1] = h.q[b & 15];
            }
            return new String(cArr);
        }

        public final String b(String str) {
            kotlin.jvm.internal.k.e(str, "value");
            MessageDigest instance = MessageDigest.getInstance("MD5");
            byte[] bytes = str.getBytes(kotlin.j0.d.a);
            kotlin.jvm.internal.k.d(bytes, "(this as java.lang.String).getBytes(charset)");
            instance.update(bytes);
            byte[] digest = instance.digest();
            kotlin.jvm.internal.k.d(digest, "md.digest()");
            return a(digest);
        }

        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: MessagesFactory.kt */
    static final class k extends kotlin.jvm.internal.l implements kotlin.e0.c.l<AuthToken, g.e.k.e<g.e.m.a<Void, Void>>> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ h f5638h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ ChangeUserPassword f5639i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(h hVar, ChangeUserPassword changeUserPassword) {
            super(1);
            this.f5638h = hVar;
            this.f5639i = changeUserPassword;
        }

        /* renamed from: a */
        public final g.e.k.e<g.e.m.a<Void, Void>> o(AuthToken authToken) {
            kotlin.jvm.internal.k.e(authToken, "it");
            com.sensorberg.smartspaces.backend.q.h c = this.f5638h.u();
            retrofit2.b<com.github.jasminb.jsonapi.d<User>> s = this.f5638h.s().s(this.f5639i);
            kotlin.jvm.internal.k.d(s, "backendApi.changePassword(changeUserPassword)");
            return com.sensorberg.smartspaces.backend.q.j.b(c.b(s));
        }
    }

    /* compiled from: MessagesFactory.kt */
    static final class l extends kotlin.jvm.internal.l implements kotlin.e0.c.l<AuthToken, g.e.k.e<g.e.m.a<BeBooking, Void>>> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ h f5640h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ String f5641i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ String f5642j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ String f5643k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ String f5644l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ String f5645m;

        /* compiled from: MessagesFactory.kt */
        static final class a extends kotlin.jvm.internal.l implements kotlin.e0.c.l<User, g.e.k.e<g.e.m.a<BeBooking, Void>>> {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ l f5646h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(l lVar) {
                super(1);
                this.f5646h = lVar;
            }

            /* renamed from: a */
            public final g.e.k.e<g.e.m.a<BeBooking, Void>> o(User user) {
                kotlin.jvm.internal.k.e(user, "user");
                BeBooking beBooking = new BeBooking();
                l lVar = this.f5646h;
                beBooking.unitId = lVar.f5641i;
                beBooking.userId = user.id;
                beBooking.actuatorId = lVar.f5642j;
                beBooking.actuatorType = lVar.f5643k;
                beBooking.startsAt = lVar.f5644l;
                beBooking.endsAt = lVar.f5645m;
                beBooking.requestId = UUID.randomUUID().toString();
                com.sensorberg.smartspaces.backend.q.h c = this.f5646h.f5640h.u();
                retrofit2.b<com.github.jasminb.jsonapi.d<BeBooking>> r = this.f5646h.f5640h.s().r(beBooking);
                kotlin.jvm.internal.k.d(r, "backendApi.createBooking(booking)");
                return com.sensorberg.smartspaces.backend.q.j.c(c.b(r));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(h hVar, String str, String str2, String str3, String str4, String str5) {
            super(1);
            this.f5640h = hVar;
            this.f5641i = str;
            this.f5642j = str2;
            this.f5643k = str3;
            this.f5644l = str4;
            this.f5645m = str5;
        }

        /* renamed from: a */
        public final g.e.k.e<g.e.m.a<BeBooking, Void>> o(AuthToken authToken) {
            kotlin.jvm.internal.k.e(authToken, "it");
            return this.f5640h.w().r(new a(this));
        }
    }

    /* compiled from: MessagesFactory.kt */
    static final class m extends kotlin.jvm.internal.l implements kotlin.e0.c.l<AuthToken, g.e.k.e<g.e.m.a<BeBooking, Void>>> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ h f5647h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ String f5648i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ String f5649j;

        /* compiled from: MessagesFactory.kt */
        static final class a extends kotlin.jvm.internal.l implements kotlin.e0.c.l<User, g.e.k.e<g.e.m.a<BeBooking, Void>>> {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ m f5650h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(m mVar) {
                super(1);
                this.f5650h = mVar;
            }

            /* renamed from: a */
            public final g.e.k.e<g.e.m.a<BeBooking, Void>> o(User user) {
                kotlin.jvm.internal.k.e(user, "it");
                BeBookingInCluster beBookingInCluster = new BeBookingInCluster();
                m mVar = this.f5650h;
                beBookingInCluster.unitId = mVar.f5648i;
                beBookingInCluster.startsAt = mVar.f5649j;
                beBookingInCluster.requestId = UUID.randomUUID().toString();
                com.sensorberg.smartspaces.backend.q.h c = this.f5650h.f5647h.u();
                retrofit2.b<com.github.jasminb.jsonapi.d<BeBooking>> h2 = this.f5650h.f5647h.s().h(beBookingInCluster);
                kotlin.jvm.internal.k.d(h2, "backendApi.createBookingInCluster(booking)");
                return com.sensorberg.smartspaces.backend.q.j.c(c.b(h2));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(h hVar, String str, String str2) {
            super(1);
            this.f5647h = hVar;
            this.f5648i = str;
            this.f5649j = str2;
        }

        /* renamed from: a */
        public final g.e.k.e<g.e.m.a<BeBooking, Void>> o(AuthToken authToken) {
            kotlin.jvm.internal.k.e(authToken, "it");
            return this.f5647h.w().r(new a(this));
        }
    }

    /* compiled from: MessagesFactory.kt */
    static final class n extends kotlin.jvm.internal.l implements kotlin.e0.c.l<AuthToken, g.e.k.e<g.e.m.a<Void, Void>>> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ h f5651h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ String f5652i;

        /* compiled from: MessagesFactory.kt */
        static final class a extends kotlin.jvm.internal.l implements kotlin.e0.c.l<UserDevice, g.e.k.e<g.e.m.a<Void, Void>>> {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ n f5653h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(n nVar) {
                super(1);
                this.f5653h = nVar;
            }

            /* renamed from: a */
            public final g.e.k.e<g.e.m.a<Void, Void>> o(UserDevice userDevice) {
                kotlin.jvm.internal.k.e(userDevice, "device");
                com.sensorberg.smartspaces.backend.q.h c = this.f5653h.f5651h.u();
                retrofit2.b<Void> i2 = this.f5653h.f5651h.s().i(userDevice.id, this.f5653h.f5652i);
                kotlin.jvm.internal.k.d(i2, "backendApi.disableBlueId…evice.id, blueIdSecureId)");
                com.sensorberg.smartspaces.backend.q.g<Void> b = c.b(i2);
                g.e.m.e.b.b(b, "Disable blue-id admin mode");
                return b;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(h hVar, String str) {
            super(1);
            this.f5651h = hVar;
            this.f5652i = str;
        }

        /* renamed from: a */
        public final g.e.k.e<g.e.m.a<Void, Void>> o(AuthToken authToken) {
            kotlin.jvm.internal.k.e(authToken, "it");
            return this.f5651h.A().f(new a(this));
        }
    }

    /* compiled from: MessagesFactory.kt */
    static final class o extends kotlin.jvm.internal.l implements kotlin.e0.c.l<AuthToken, g.e.k.e<g.e.m.a<Void, Void>>> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ h f5654h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ String f5655i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(h hVar, String str) {
            super(1);
            this.f5654h = hVar;
            this.f5655i = str;
        }

        /* renamed from: a */
        public final g.e.k.e<g.e.m.a<Void, Void>> o(AuthToken authToken) {
            kotlin.jvm.internal.k.e(authToken, "it");
            com.sensorberg.smartspaces.backend.q.h c = this.f5654h.u();
            retrofit2.b<com.github.jasminb.jsonapi.d<BeBooking>> a = this.f5654h.s().a(this.f5655i);
            kotlin.jvm.internal.k.d(a, "backendApi.endBookingNow(id)");
            return com.sensorberg.smartspaces.backend.q.j.b(c.b(a));
        }
    }

    /* compiled from: MessagesFactory.kt */
    static final class p extends kotlin.jvm.internal.l implements kotlin.e0.c.l<UserDevice, ActuatorRequest> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ h f5656h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ String f5657i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ String f5658j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ String f5659k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ String f5660l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ String f5661m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ String f5662n;
        final /* synthetic */ String o;
        final /* synthetic */ String p;
        final /* synthetic */ String q;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(h hVar, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
            super(1);
            this.f5656h = hVar;
            this.f5657i = str;
            this.f5658j = str2;
            this.f5659k = str3;
            this.f5660l = str4;
            this.f5661m = str5;
            this.f5662n = str6;
            this.o = str7;
            this.p = str8;
            this.q = str9;
        }

        /* renamed from: a */
        public final ActuatorRequest o(UserDevice userDevice) {
            kotlin.jvm.internal.k.e(userDevice, "device");
            ActuatorRequest actuatorRequest = new ActuatorRequest();
            long d2 = this.f5656h.z().d();
            actuatorRequest.unitId = this.f5657i;
            actuatorRequest.connectorId = this.f5658j;
            actuatorRequest.actuatorId = this.f5659k;
            actuatorRequest.requestId = this.f5660l;
            actuatorRequest.connectorType = this.f5661m;
            actuatorRequest.actuatorType = this.f5662n;
            actuatorRequest.action = this.o;
            actuatorRequest.createdAt = com.sensorberg.smartspaces.backend.q.n.b(d2);
            actuatorRequest.userDeviceId = userDevice.id;
            actuatorRequest.state = this.p;
            actuatorRequest.errorDetails = this.q;
            actuatorRequest.timestamp = Long.valueOf(d2);
            return actuatorRequest;
        }
    }

    /* compiled from: MessagesFactory.kt */
    static final class q extends kotlin.jvm.internal.l implements kotlin.e0.c.l<ActuatorRequest, g.e.k.e<String>> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ h f5663h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        q(h hVar) {
            super(1);
            this.f5663h = hVar;
        }

        /* renamed from: a */
        public final g.e.k.e<String> o(ActuatorRequest actuatorRequest) {
            kotlin.jvm.internal.k.e(actuatorRequest, "request");
            com.sensorberg.smartspaces.backend.m.h f2 = this.f5663h.y();
            String r = this.f5663h.x().r(actuatorRequest);
            kotlin.jvm.internal.k.d(r, "gson.toJson(request)");
            String str = actuatorRequest.userDeviceId;
            kotlin.jvm.internal.k.d(str, "request.userDeviceId");
            return f2.i(r, str);
        }
    }

    /* compiled from: MessagesFactory.kt */
    static final class r extends kotlin.jvm.internal.l implements kotlin.e0.c.l<ActuatorRequest, g.e.k.e<g.e.m.a<ActuatorRequest, Void>>> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ h f5664h;

        /* compiled from: MessagesFactory.kt */
        static final class a extends kotlin.jvm.internal.l implements kotlin.e0.c.l<AuthToken, g.e.k.e<g.e.m.a<ActuatorRequest, Void>>> {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ r f5665h;

            /* renamed from: i  reason: collision with root package name */
            final /* synthetic */ ActuatorRequest f5666i;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(r rVar, ActuatorRequest actuatorRequest) {
                super(1);
                this.f5665h = rVar;
                this.f5666i = actuatorRequest;
            }

            /* renamed from: a */
            public final g.e.k.e<g.e.m.a<ActuatorRequest, Void>> o(AuthToken authToken) {
                kotlin.jvm.internal.k.e(authToken, "it");
                com.sensorberg.smartspaces.backend.q.h c = this.f5665h.f5664h.u();
                retrofit2.b<com.github.jasminb.jsonapi.d<ActuatorRequest>> d2 = this.f5665h.f5664h.s().d(this.f5666i);
                kotlin.jvm.internal.k.d(d2, "backendApi.postGatewayActuatorRequest(request)");
                return com.sensorberg.smartspaces.backend.q.j.c(c.b(d2));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        r(h hVar) {
            super(1);
            this.f5664h = hVar;
        }

        /* renamed from: a */
        public final g.e.k.e<g.e.m.a<ActuatorRequest, Void>> o(ActuatorRequest actuatorRequest) {
            kotlin.jvm.internal.k.e(actuatorRequest, "request");
            return this.f5664h.r().e(new a(this, actuatorRequest));
        }
    }

    /* compiled from: MessagesFactory.kt */
    static final class s extends kotlin.jvm.internal.l implements kotlin.e0.c.l<AuthToken, g.e.k.e<g.e.m.a<List<? extends BeBooking>, Void>>> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ h f5667h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ String f5668i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ String f5669j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ String f5670k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        s(h hVar, String str, String str2, String str3) {
            super(1);
            this.f5667h = hVar;
            this.f5668i = str;
            this.f5669j = str2;
            this.f5670k = str3;
        }

        /* renamed from: a */
        public final g.e.k.e<g.e.m.a<List<BeBooking>, Void>> o(AuthToken authToken) {
            retrofit2.b<com.github.jasminb.jsonapi.d<List<BeBooking>>> bVar;
            kotlin.jvm.internal.k.e(authToken, "it");
            if (this.f5668i == null) {
                bVar = this.f5667h.s().k(this.f5669j, this.f5670k);
            } else {
                bVar = this.f5667h.s().j(this.f5669j, this.f5670k, this.f5668i);
            }
            com.sensorberg.smartspaces.backend.q.h c = this.f5667h.u();
            kotlin.jvm.internal.k.d(bVar, "call");
            return com.sensorberg.smartspaces.backend.q.j.c(c.a(bVar));
        }
    }

    /* compiled from: MessagesFactory.kt */
    static final class t extends kotlin.jvm.internal.l implements kotlin.e0.c.l<AuthToken, g.e.k.e<g.e.m.a<Void, Void>>> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ h f5671h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ BlueIdDeviceDetails f5672i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        t(h hVar, BlueIdDeviceDetails blueIdDeviceDetails) {
            super(1);
            this.f5671h = hVar;
            this.f5672i = blueIdDeviceDetails;
        }

        /* renamed from: a */
        public final g.e.k.e<g.e.m.a<Void, Void>> o(AuthToken authToken) {
            kotlin.jvm.internal.k.e(authToken, "it");
            com.sensorberg.smartspaces.backend.q.h c = this.f5671h.u();
            com.sensorberg.smartspaces.backend.q.c b = this.f5671h.s();
            BlueIdDeviceDetails blueIdDeviceDetails = this.f5672i;
            retrofit2.b<Void> c2 = b.c(blueIdDeviceDetails.id, blueIdDeviceDetails);
            kotlin.jvm.internal.k.d(c2, "backendApi.postBlueIdDev…ails(details.id, details)");
            return c.b(c2);
        }
    }

    /* compiled from: MessagesFactory.kt */
    static final class u extends kotlin.jvm.internal.l implements kotlin.e0.c.l<AuthToken, g.e.k.e<g.e.m.a<Void, Void>>> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ h f5673h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ Statistics f5674i;

        /* compiled from: MessagesFactory.kt */
        static final class a extends kotlin.jvm.internal.l implements kotlin.e0.c.l<UserDevice, g.e.k.e<g.e.m.a<Void, Void>>> {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ u f5675h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(u uVar) {
                super(1);
                this.f5675h = uVar;
            }

            /* renamed from: a */
            public final g.e.k.e<g.e.m.a<Void, Void>> o(UserDevice userDevice) {
                kotlin.jvm.internal.k.e(userDevice, "device");
                com.sensorberg.smartspaces.backend.q.h c = this.f5675h.f5673h.u();
                retrofit2.b<com.github.jasminb.jsonapi.d<Statistics>> t = this.f5675h.f5673h.s().t(userDevice.id, this.f5675h.f5674i);
                kotlin.jvm.internal.k.d(t, "backendApi.postStatistics(device.id, stats)");
                return com.sensorberg.smartspaces.backend.q.j.b(c.b(t));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        u(h hVar, Statistics statistics) {
            super(1);
            this.f5673h = hVar;
            this.f5674i = statistics;
        }

        /* renamed from: a */
        public final g.e.k.e<g.e.m.a<Void, Void>> o(AuthToken authToken) {
            kotlin.jvm.internal.k.e(authToken, "it");
            return this.f5673h.A().f(new a(this));
        }
    }

    /* compiled from: MessagesFactory.kt */
    static final class v extends kotlin.jvm.internal.l implements kotlin.e0.c.l<ActuatorRequest, g.e.k.e<g.e.m.a<Void, Void>>> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ h f5676h;

        /* compiled from: MessagesFactory.kt */
        static final class a extends kotlin.jvm.internal.l implements kotlin.e0.c.l<AuthToken, g.e.k.e<g.e.m.a<Void, Void>>> {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ v f5677h;

            /* renamed from: i  reason: collision with root package name */
            final /* synthetic */ ActuatorRequest f5678i;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(v vVar, ActuatorRequest actuatorRequest) {
                super(1);
                this.f5677h = vVar;
                this.f5678i = actuatorRequest;
            }

            /* renamed from: a */
            public final g.e.k.e<g.e.m.a<Void, Void>> o(AuthToken authToken) {
                kotlin.jvm.internal.k.e(authToken, "it");
                com.sensorberg.smartspaces.backend.q.h c = this.f5677h.f5676h.u();
                retrofit2.b<com.github.jasminb.jsonapi.d<ActuatorRequest>> p = this.f5677h.f5676h.s().p(this.f5678i);
                kotlin.jvm.internal.k.d(p, "backendApi.postBlueIdActuatorRequest(request)");
                return com.sensorberg.smartspaces.backend.q.j.b(c.b(p));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        v(h hVar) {
            super(1);
            this.f5676h = hVar;
        }

        /* renamed from: a */
        public final g.e.k.e<g.e.m.a<Void, Void>> o(ActuatorRequest actuatorRequest) {
            kotlin.jvm.internal.k.e(actuatorRequest, "request");
            return this.f5676h.r().e(new a(this, actuatorRequest));
        }
    }

    static {
        char[] charArray = "0123456789abcdef".toCharArray();
        kotlin.jvm.internal.k.d(charArray, "(this as java.lang.String).toCharArray()");
        q = charArray;
    }

    public h(com.sensorberg.smartspaces.backend.q.k kVar) {
        kotlin.jvm.internal.k.e(kVar, "responseErrorHandler");
        this.p = kVar;
        u().toString();
        z().toString();
        A().toString();
        y().toString();
        r().toString();
        w().toString();
        x().toString();
        s().toString();
    }

    /* access modifiers changed from: private */
    public final com.sensorberg.smartspaces.backend.m.i A() {
        return (com.sensorberg.smartspaces.backend.m.i) this.f5604h.getValue();
    }

    private final g.e.k.e<ActuatorRequest> p(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        return A().c(new p(this, str4, str5, str6, str, str8, str9, str7, str2, str3));
    }

    /* access modifiers changed from: private */
    public final com.sensorberg.smartspaces.backend.m.d r() {
        return (com.sensorberg.smartspaces.backend.m.d) this.f5606j.getValue();
    }

    /* access modifiers changed from: private */
    public final com.sensorberg.smartspaces.backend.q.c s() {
        return (com.sensorberg.smartspaces.backend.q.c) this.f5607k.getValue();
    }

    /* access modifiers changed from: private */
    public final com.sensorberg.smartspaces.backend.q.h u() {
        return (com.sensorberg.smartspaces.backend.q.h) this.f5609m.getValue();
    }

    private final g.e.k.a v() {
        return (g.e.k.a) this.f5610n.getValue();
    }

    /* access modifiers changed from: private */
    public final com.sensorberg.smartspaces.backend.m.a w() {
        return (com.sensorberg.smartspaces.backend.m.a) this.f5608l.getValue();
    }

    /* access modifiers changed from: private */
    public final com.sensorberg.smartspaces.backend.m.h y() {
        return (com.sensorberg.smartspaces.backend.m.h) this.f5605i.getValue();
    }

    /* access modifiers changed from: private */
    public final com.sensorberg.smartspaces.backend.q.l z() {
        return (com.sensorberg.smartspaces.backend.q.l) this.f5603g.getValue();
    }

    public final g.e.k.e<g.e.m.a<Void, Void>> B(BlueIdDeviceDetails blueIdDeviceDetails) {
        kotlin.jvm.internal.k.e(blueIdDeviceDetails, "details");
        return r().e(new t(this, blueIdDeviceDetails));
    }

    public final g.e.k.e<g.e.m.a<Void, Void>> C(Statistics statistics) {
        kotlin.jvm.internal.k.e(statistics, "stats");
        return r().e(new u(this, statistics));
    }

    public final g.e.k.e<g.e.m.a<Void, Void>> D(String str, String str2, String str3, String str4, String str5, String str6, String str7, a.j jVar, a.h hVar) {
        kotlin.jvm.internal.k.e(str, "requestId");
        kotlin.jvm.internal.k.e(str2, "state");
        kotlin.jvm.internal.k.e(str4, "unitId");
        String str8 = str5;
        kotlin.jvm.internal.k.e(str8, "connectableId");
        String str9 = str6;
        kotlin.jvm.internal.k.e(str9, "actuatorId");
        String str10 = str7;
        kotlin.jvm.internal.k.e(str10, "action");
        kotlin.jvm.internal.k.e(jVar, "connectorType");
        kotlin.jvm.internal.k.e(hVar, "actuatorType");
        return g.e.k.h.a.n(p(str, str2, str3, str4, str8, str9, str10, jVar.a(), hVar.a()), v(), new v(this));
    }

    public final g.e.k.e<g.e.m.a<Void, Void>> i(String str, String str2, String str3) {
        kotlin.jvm.internal.k.e(str, "currentPassword");
        kotlin.jvm.internal.k.e(str2, "newPassword");
        kotlin.jvm.internal.k.e(str3, "newPasswordConfirmation");
        ChangeUserPassword changeUserPassword = new ChangeUserPassword();
        changeUserPassword.currentPassword = str;
        changeUserPassword.newPassword = str2;
        changeUserPassword.newPasswordConfirmation = str3;
        return r().e(new k(this, changeUserPassword));
    }

    public final g.e.k.e<g.e.m.a<BeBooking, Void>> j(String str, String str2, String str3, String str4, String str5) {
        kotlin.jvm.internal.k.e(str, "unitId");
        kotlin.jvm.internal.k.e(str4, "startsAt");
        return r().e(new l(this, str, str2, str3, str4, str5));
    }

    public final g.e.k.e<g.e.m.a<BeBooking, Void>> k(String str, String str2) {
        kotlin.jvm.internal.k.e(str, "unitOrClusterId");
        kotlin.jvm.internal.k.e(str2, "startsAt");
        return r().e(new m(this, str, str2));
    }

    public final g.e.k.e<g.e.m.a<Void, Void>> l(String str) {
        kotlin.jvm.internal.k.e(str, "blueIdSecureId");
        return r().e(new n(this, str));
    }

    public final void m(String str) {
        kotlin.jvm.internal.k.e(str, "blueIdSecureId");
        if (r().a()) {
            String b2 = A().b();
            if (b2 != null) {
                retrofit2.b<Void> n2 = s().n(b2, str);
                n.a.a.a("Executing enable blue-id admin mode", new Object[0]);
                retrofit2.q<Void> a2 = n2.a();
                kotlin.jvm.internal.k.d(a2, "response");
                if (a2.e()) {
                    n.a.a.a("Enable blue-id admin mode successful", new Object[0]);
                    return;
                }
                com.sensorberg.smartspaces.backend.q.k kVar = this.p;
                kotlin.jvm.internal.k.d(n2, "call");
                BackendException a3 = kVar.a(n2, a2);
                n.a.a.k("Enable blue-id admin mode not successful. " + a3.getMessage(), new Object[0]);
                throw a3;
            }
            throw new IllegalStateException("Backend device not available");
        }
        throw new IllegalStateException("Backend token not available");
    }

    public m.a.c.a n() {
        return a.C0333a.a(this);
    }

    public final g.e.k.e<g.e.m.a<Void, Void>> o(String str) {
        kotlin.jvm.internal.k.e(str, "id");
        return r().e(new o(this, str));
    }

    public final kotlin.j<g.e.k.e<String>, g.e.k.e<g.e.m.a<ActuatorRequest, Void>>> q(String str, String str2, String str3, String str4, String str5, List<String> list) {
        List<String> list2 = list;
        String str6 = str;
        kotlin.jvm.internal.k.e(str, "unitId");
        kotlin.jvm.internal.k.e(str2, "connectableId");
        kotlin.jvm.internal.k.e(str3, "actuatorId");
        kotlin.jvm.internal.k.e(str4, "action");
        kotlin.jvm.internal.k.e(str5, "requestId");
        kotlin.jvm.internal.k.e(list2, "commChannels");
        boolean contains = list2.contains("bluetooth");
        boolean contains2 = list2.contains(Statistics.CHANNEL_IP);
        if (contains || contains2) {
            g.e.k.e<ActuatorRequest> p2 = p(str5, (String) null, (String) null, str, str2, str3, str4, a.j.SENSORBERG.a(), a.h.SENSORBERG.a());
            g.e.k.e<O> eVar = null;
            g.e.k.e<O> n2 = contains ? g.e.k.h.a.n(p2, v(), new q(this)) : null;
            if (contains2) {
                eVar = g.e.k.h.a.n(p2, v(), new r(this));
            }
            return new kotlin.j<>(n2, eVar);
        }
        throw new IllegalArgumentException("Cannot generate gateway message for channels: " + list2);
    }

    public final g.e.k.e<g.e.m.a<List<BeBooking>, Void>> t(LocalDate localDate, LocalDate localDate2, String str) {
        kotlin.jvm.internal.k.e(localDate, "from");
        kotlin.jvm.internal.k.e(localDate2, "to");
        return r().e(new s(this, str, com.sensorberg.smartspaces.backend.q.m.c.f().b(localDate), com.sensorberg.smartspaces.backend.q.m.c.f().b(localDate2)));
    }

    public final com.google.gson.f x() {
        return (com.google.gson.f) this.o.getValue();
    }
}
