package com.sensorberg.smartspaces.sdk.internal.p;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import de.baimos.blueid.sdk.api.BlueIDMobileDevice;
import de.baimos.blueid.sdk.api.Channel;
import de.baimos.blueid.sdk.api.Command;
import de.baimos.blueid.sdk.api.CommandExecutionResponse;
import de.baimos.blueid.sdk.api.SecuredObject;
import de.baimos.blueid.sdk.api.response.LockServerBatteryState;
import de.baimos.blueid.sdk.api.response.LockServerVersion;
import de.baimos.blueid.sdk.api.response.ResponseObject;
import de.baimos.blueid.sdk.api.response.UserSpecifiedData;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.e0.c.p;
import kotlin.e0.c.q;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import kotlin.x;

/* compiled from: BlueId.kt */
public final class a implements e {
    /* access modifiers changed from: private */
    public final g.e.k.d<i> a;
    /* access modifiers changed from: private */
    public final g.e.k.d<List<String>> b;
    /* access modifiers changed from: private */
    public final g.e.k.d<String> c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final AtomicBoolean f6470d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final BlueIDMobileDevice f6471e;

    /* renamed from: f  reason: collision with root package name */
    private final SharedPreferences f6472f;

    /* renamed from: com.sensorberg.smartspaces.sdk.internal.p.a$a  reason: collision with other inner class name */
    /* compiled from: BlueId.kt */
    static final class C0387a extends l implements kotlin.e0.c.a<x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ a f6473h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0387a(a aVar) {
            super(0);
            this.f6473h = aVar;
        }

        public final void a() {
            i iVar = i.Inactive;
            if (this.f6473h.r()) {
                this.f6473h.c.w(this.f6473h.f6471e.getDeviceId());
                if (this.f6473h.s()) {
                    List i2 = this.f6473h.p();
                    if (!i2.isEmpty()) {
                        this.f6473h.b.w(i2);
                    }
                    iVar = i.Ready;
                }
            }
            this.f6473h.a.w(iVar);
        }

        public /* bridge */ /* synthetic */ Object d() {
            a();
            return x.a;
        }
    }

    /* compiled from: BlueId.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: BlueId.kt */
    static final class c extends l implements kotlin.e0.c.a<x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ a f6474h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ g f6475i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a aVar, g gVar) {
            super(0);
            this.f6474h = aVar;
            this.f6475i = gVar;
        }

        public final void a() {
            this.f6475i.run();
            this.f6474h.a.w(i.Ready);
        }

        public /* bridge */ /* synthetic */ Object d() {
            a();
            return x.a;
        }
    }

    /* compiled from: BlueId.kt */
    static final class d extends l implements kotlin.e0.c.a<x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ a f6476h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(a aVar) {
            super(0);
            this.f6476h = aVar;
        }

        public final void a() {
            if (!this.f6476h.f6470d.getAndSet(true)) {
                try {
                    n.a.a.a("Synchronizing BlueId", new Object[0]);
                    this.f6476h.f6471e.synchronize();
                    this.f6476h.b.w(this.f6476h.p());
                    if (((i) this.f6476h.a.n()) != i.Ready) {
                        this.f6476h.a.w(i.Ready);
                    }
                } catch (Exception e2) {
                    n.a.a.m(e2, "BlueId failed to synchronize", new Object[0]);
                } catch (Throwable th) {
                    this.f6476h.f6470d.set(false);
                    throw th;
                }
                this.f6476h.f6470d.set(false);
            }
        }

        public /* bridge */ /* synthetic */ Object d() {
            a();
            return x.a;
        }
    }

    /* compiled from: BlueId.kt */
    static final class e extends l implements kotlin.e0.c.a<x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ a f6477h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ String f6478i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ String f6479j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(a aVar, String str, String str2) {
            super(0);
            this.f6477h = aVar;
            this.f6478i = str;
            this.f6479j = str2;
        }

        public final void a() {
            if (!this.f6477h.r()) {
                try {
                    n.a.a.f("Setting BlueId parameters", new Object[0]);
                    this.f6477h.c.w(this.f6477h.f6471e.initialize().withApiKey(this.f6478i).onTrustCenter(this.f6479j).now());
                } catch (Exception e2) {
                    n.a.a.m(e2, "BlueId initialisation failed", new Object[0]);
                }
            }
        }

        public /* bridge */ /* synthetic */ Object d() {
            a();
            return x.a;
        }
    }

    static {
        new b((DefaultConstructorMarker) null);
    }

    public a(BlueIDMobileDevice blueIDMobileDevice, SharedPreferences sharedPreferences) {
        k.e(blueIDMobileDevice, "blueIdSdk");
        k.e(sharedPreferences, "prefs");
        this.f6471e = blueIDMobileDevice;
        this.f6472f = sharedPreferences;
        this.a = new g.e.k.d<>();
        this.b = new g.e.k.d<>();
        this.c = new g.e.k.d<>();
        this.f6470d = new AtomicBoolean(false);
        n.a.a.f("Initializing BlueId wrapper", new Object[0]);
        g.e.e.a aVar = g.e.e.a.f9778f;
        aVar.j(aVar.c(), new C0387a(this));
    }

    /* access modifiers changed from: private */
    public final List<String> p() {
        if (!r()) {
            return n.g();
        }
        try {
            List<SecuredObject> securedObjects = this.f6471e.getSecuredObjects();
            k.d(securedObjects, "blueIdSdk.securedObjects");
            ArrayList arrayList = new ArrayList(o.p(securedObjects, 10));
            for (SecuredObject securedObject : securedObjects) {
                k.d(securedObject, "it");
                arrayList.add(securedObject.getId());
            }
            return arrayList;
        } catch (Exception e2) {
            n.a.a.m(e2, "Failed to get blueIdSdk.securedObjects", new Object[0]);
            return n.g();
        }
    }

    private final <T> T q(String str, q<? super String, ? super String, ? super Integer, ? extends T> qVar) {
        Channel channelForCommand;
        this.f6471e.synchronize();
        SecuredObject securedObjectById = this.f6471e.getSecuredObjectById(str);
        String str2 = null;
        String str3 = null;
        int i2 = -1;
        for (d dVar : n.c(d.GetHardwareRevision, d.GetBatteryState, d.GetVersion)) {
            Thread.sleep(3000);
            n.a.a.a("BlueId device details executing " + dVar.name(), new Object[0]);
            Command commandById = securedObjectById.getCommandById(dVar.a());
            if (!(commandById == null || (channelForCommand = securedObjectById.getChannelForCommand(Channel.BLUETOOTH_SMART_CHANNEL_ID, commandById)) == null)) {
                CommandExecutionResponse executeCommand = this.f6471e.executeCommand(securedObjectById, channelForCommand, commandById);
                k.d(executeCommand, "blueIdSdk.executeCommand…Object, channel, command)");
                n.a.a.a("BlueId device details parsing response for " + dVar.name(), new Object[0]);
                int i3 = b.a[dVar.ordinal()];
                if (i3 == 1) {
                    ResponseObject responseObject = executeCommand.getResponseObject();
                    if (responseObject instanceof UserSpecifiedData) {
                        i2 = ((UserSpecifiedData) responseObject).getData().get();
                    } else if (responseObject instanceof LockServerBatteryState) {
                        i2 = ((LockServerBatteryState) responseObject).getValue();
                    }
                } else if (i3 == 2) {
                    ResponseObject responseObject2 = executeCommand.getResponseObject();
                    if (responseObject2 != null) {
                        str3 = ((LockServerVersion) responseObject2).getVersion();
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type de.baimos.blueid.sdk.api.response.LockServerVersion");
                    }
                } else if (i3 == 3) {
                    ResponseObject responseObject3 = executeCommand.getResponseObject();
                    if (responseObject3 != null) {
                        ByteBuffer data = ((UserSpecifiedData) responseObject3).getData();
                        k.d(data, "(response.responseObject…s UserSpecifiedData).data");
                        str2 = t(data);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type de.baimos.blueid.sdk.api.response.UserSpecifiedData");
                    }
                } else {
                    throw new IllegalArgumentException("Oh Kotlin");
                }
            }
        }
        return qVar.k(str2, str3, Integer.valueOf(i2));
    }

    /* access modifiers changed from: private */
    public final boolean r() {
        try {
            return this.f6471e.isInitialized();
        } catch (Exception e2) {
            n.a.a.m(e2, "Failed to check blueIdSdk.isInitialized", new Object[0]);
            return false;
        }
    }

    /* access modifiers changed from: private */
    public final boolean s() {
        return this.f6472f.getBoolean("sync_enabled", false);
    }

    private final String t(ByteBuffer byteBuffer) {
        int i2 = 11;
        byte[] bArr = new byte[11];
        byte[] bArr2 = new byte[1];
        byteBuffer.get(bArr, 0, 11);
        int u = j.u(bArr, (byte) 0);
        if (u != -1) {
            i2 = u;
        }
        String str = new String(bArr, 0, i2, kotlin.j0.d.b);
        byteBuffer.get(bArr2, 0, 1);
        return str + '#' + bArr2[0];
    }

    public g.e.k.e<i> a() {
        return this.a;
    }

    public void b() {
        g.e.e.a aVar = g.e.e.a.f9778f;
        aVar.j(aVar.c(), new d(this));
    }

    public <T> T c(String str, q<? super String, ? super String, ? super Integer, ? extends T> qVar) {
        k.e(str, "secureObjectId");
        k.e(qVar, "mapper");
        this.a.w(i.Busy);
        try {
            return q(str, qVar);
        } finally {
            this.a.w(i.Ready);
        }
    }

    public g.e.k.e<List<String>> d() {
        return this.b;
    }

    @SuppressLint({"ApplySharedPref"})
    public void destroy() {
        try {
            this.f6471e.destroy();
        } catch (Exception e2) {
            n.a.a.m(e2, "BlueId failed to destroy", new Object[0]);
        }
        this.f6472f.edit().clear().commit();
    }

    public void e() {
        if (!r()) {
            throw new IllegalStateException("Blue-id must be initialized before enabling sync");
        } else if (!s()) {
            n.a.a.f("Enabling BlueId synchronization", new Object[0]);
            SharedPreferences.Editor edit = this.f6472f.edit();
            k.b(edit, "editor");
            edit.putBoolean("sync_enabled", true);
            edit.apply();
        }
    }

    public void f(String str, String str2) {
        k.e(str, "apiKey");
        k.e(str2, "trustCenterHostName");
        g.e.e.a aVar = g.e.e.a.f9778f;
        aVar.j(aVar.c(), new e(this, str, str2));
    }

    public g.e.k.e<g.e.m.a<Void, h>> g(String str, kotlin.e0.c.a<x> aVar, kotlin.e0.c.a<x> aVar2, p<? super String, ? super Integer, x> pVar) {
        k.e(str, "secureObjectId");
        k.e(aVar, "enableTime");
        k.e(aVar2, "disableTime");
        k.e(pVar, "onBlueIdDeviceDetails");
        i n2 = this.a.n();
        i iVar = i.Busy;
        if (n2 != iVar) {
            this.a.w(iVar);
            g gVar = new g(this.f6471e, str, aVar, aVar2, pVar);
            g.e.e.a aVar3 = g.e.e.a.f9778f;
            aVar3.j(aVar3.c(), new c(this, gVar));
            return gVar;
        }
        throw new IllegalStateException("BlueId is already executing another command");
    }

    public g.e.k.e<String> getDeviceId() {
        return this.c;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a(android.content.Context r4) {
        /*
            r3 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.k.e(r4, r0)
            de.baimos.blueid.sdk.api.BlueIDMobileDevice r0 = de.baimos.blueid.sdk.api.SdkForAndroid.getInstance(r4)
            java.lang.String r1 = "SdkForAndroid.getInstance(context)"
            kotlin.jvm.internal.k.d(r0, r1)
            java.lang.String r1 = "blueId"
            r2 = 0
            android.content.SharedPreferences r4 = r4.getSharedPreferences(r1, r2)
            java.lang.String r1 = "context.getSharedPrefere…d\", Context.MODE_PRIVATE)"
            kotlin.jvm.internal.k.d(r4, r1)
            r3.<init>(r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sensorberg.smartspaces.sdk.internal.p.a.<init>(android.content.Context):void");
    }
}
