package com.sensorberg.smartworkspace.app.screens.info;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.core.app.j;
import androidx.core.app.m;
import com.sensorberg.factory.R;
import com.sensorberg.smartworkspace.app.activities.main.SingleActivity;
import com.sensorberg.smartworkspace.app.utils.n;
import kotlin.i;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.v;
import kotlin.x;
import m.a.c.c;

@i(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 /2\u00020\u00012\u00020\u0002:\u0001/B\u0007¢\u0006\u0004\b.\u0010\fJ!\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0018\u001a\u00020\u00138B@\u0002X\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u000e\u001a\u00020\r8B@\u0002X\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010 \u001a\u00020\u001c8B@\u0002X\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0015\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\"\u001a\u00020!8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001d\u0010(\u001a\u00020$8B@\u0002X\u0002¢\u0006\f\n\u0004\b%\u0010\u0015\u001a\u0004\b&\u0010'R\u001d\u0010-\u001a\u00020)8B@\u0002X\u0002¢\u0006\f\n\u0004\b*\u0010\u0015\u001a\u0004\b+\u0010,¨\u00060"}, d2 = {"Lcom/sensorberg/smartworkspace/app/screens/info/ActionReceiver;", "Lm/a/c/c;", "Lg/e/j/a/a;", "Landroid/app/PendingIntent;", "pending", "Lcom/sensorberg/notifications/sdk/Action;", "action", "Landroid/app/Notification;", "createNotification", "(Landroid/app/PendingIntent;Lcom/sensorberg/notifications/sdk/Action;)Landroid/app/Notification;", "", "initChannels", "()V", "Landroid/content/Context;", "context", "onAction", "(Landroid/content/Context;Lcom/sensorberg/notifications/sdk/Action;)V", "showNotification", "(Lcom/sensorberg/notifications/sdk/Action;)V", "Lcom/sensorberg/smartworkspace/app/utils/BuildConfigImpl;", "buildConfig$delegate", "Lkotlin/Lazy;", "getBuildConfig", "()Lcom/sensorberg/smartworkspace/app/utils/BuildConfigImpl;", "buildConfig", "context$delegate", "getContext", "()Landroid/content/Context;", "Lcom/sensorberg/smartworkspace/app/screens/info/InfoDao;", "dao$delegate", "getDao", "()Lcom/sensorberg/smartworkspace/app/screens/info/InfoDao;", "dao", "Landroid/app/NotificationManager;", "manager", "Landroid/app/NotificationManager;", "Lcom/sensorberg/smartworkspace/app/screens/info/NotificationSdkHelper;", "notificationSdkHelper$delegate", "getNotificationSdkHelper", "()Lcom/sensorberg/smartworkspace/app/screens/info/NotificationSdkHelper;", "notificationSdkHelper", "Lcom/sensorberg/smartworkspace/app/utils/ShowNotificationFlag;", "showNotificationFlag$delegate", "getShowNotificationFlag", "()Lcom/sensorberg/smartworkspace/app/utils/ShowNotificationFlag;", "showNotificationFlag", "<init>", "Companion", "app_appCenterRelease"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
/* compiled from: ActionReceiver.kt */
public final class ActionReceiver extends g.e.j.a.a implements m.a.c.c {

    /* renamed from: g  reason: collision with root package name */
    private final kotlin.e f7466g = g.a(new a(n().d(), (m.a.c.j.a) null, (kotlin.e0.c.a) null));

    /* renamed from: h  reason: collision with root package name */
    private final kotlin.e f7467h = g.a(new b(n().d(), (m.a.c.j.a) null, (kotlin.e0.c.a) null));

    /* renamed from: i  reason: collision with root package name */
    private final kotlin.e f7468i = g.a(new c(n().d(), (m.a.c.j.a) null, (kotlin.e0.c.a) null));

    /* renamed from: j  reason: collision with root package name */
    private final kotlin.e f7469j = g.a(new d(n().d(), (m.a.c.j.a) null, (kotlin.e0.c.a) null));

    /* renamed from: k  reason: collision with root package name */
    private final kotlin.e f7470k = g.a(new e(n().d(), (m.a.c.j.a) null, (kotlin.e0.c.a) null));

    /* renamed from: l  reason: collision with root package name */
    private final NotificationManager f7471l;

    /* compiled from: Scope.kt */
    public static final class a extends l implements kotlin.e0.c.a<Context> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ m.a.c.l.a f7472h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f7473i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f7474j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(m.a.c.l.a aVar, m.a.c.j.a aVar2, kotlin.e0.c.a aVar3) {
            super(0);
            this.f7472h = aVar;
            this.f7473i = aVar2;
            this.f7474j = aVar3;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [android.content.Context, java.lang.Object] */
        public final Context d() {
            return this.f7472h.e(v.b(Context.class), this.f7473i, this.f7474j);
        }
    }

    /* compiled from: Scope.kt */
    public static final class b extends l implements kotlin.e0.c.a<c> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ m.a.c.l.a f7475h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f7476i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f7477j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(m.a.c.l.a aVar, m.a.c.j.a aVar2, kotlin.e0.c.a aVar3) {
            super(0);
            this.f7475h = aVar;
            this.f7476i = aVar2;
            this.f7477j = aVar3;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, com.sensorberg.smartworkspace.app.screens.info.c] */
        public final c d() {
            return this.f7475h.e(v.b(c.class), this.f7476i, this.f7477j);
        }
    }

    /* compiled from: Scope.kt */
    public static final class c extends l implements kotlin.e0.c.a<com.sensorberg.smartworkspace.app.utils.c> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ m.a.c.l.a f7478h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f7479i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f7480j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(m.a.c.l.a aVar, m.a.c.j.a aVar2, kotlin.e0.c.a aVar3) {
            super(0);
            this.f7478h = aVar;
            this.f7479i = aVar2;
            this.f7480j = aVar3;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, com.sensorberg.smartworkspace.app.utils.c] */
        public final com.sensorberg.smartworkspace.app.utils.c d() {
            return this.f7478h.e(v.b(com.sensorberg.smartworkspace.app.utils.c.class), this.f7479i, this.f7480j);
        }
    }

    /* compiled from: Scope.kt */
    public static final class d extends l implements kotlin.e0.c.a<n> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ m.a.c.l.a f7481h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f7482i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f7483j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(m.a.c.l.a aVar, m.a.c.j.a aVar2, kotlin.e0.c.a aVar3) {
            super(0);
            this.f7481h = aVar;
            this.f7482i = aVar2;
            this.f7483j = aVar3;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, com.sensorberg.smartworkspace.app.utils.n] */
        public final n d() {
            return this.f7481h.e(v.b(n.class), this.f7482i, this.f7483j);
        }
    }

    /* compiled from: Scope.kt */
    public static final class e extends l implements kotlin.e0.c.a<i> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ m.a.c.l.a f7484h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f7485i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f7486j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(m.a.c.l.a aVar, m.a.c.j.a aVar2, kotlin.e0.c.a aVar3) {
            super(0);
            this.f7484h = aVar;
            this.f7485i = aVar2;
            this.f7486j = aVar3;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [com.sensorberg.smartworkspace.app.screens.info.i, java.lang.Object] */
        public final i d() {
            return this.f7484h.e(v.b(i.class), this.f7485i, this.f7486j);
        }
    }

    /* compiled from: ActionReceiver.kt */
    public static final class f {
        private f() {
        }

        public /* synthetic */ f(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: ActionReceiver.kt */
    static final class g extends l implements kotlin.e0.c.a<x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ ActionReceiver f7487h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ a f7488i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(ActionReceiver actionReceiver, a aVar) {
            super(0);
            this.f7487h = actionReceiver;
            this.f7488i = aVar;
        }

        public final void a() {
            this.f7487h.f().a(this.f7488i);
        }

        public /* bridge */ /* synthetic */ Object d() {
            a();
            return x.a;
        }
    }

    static {
        new f((DefaultConstructorMarker) null);
    }

    public ActionReceiver() {
        Object systemService = e().getSystemService("notification");
        if (systemService != null) {
            this.f7471l = (NotificationManager) systemService;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.app.NotificationManager");
    }

    private final Notification c(PendingIntent pendingIntent, g.e.j.a.b bVar) {
        i();
        j.d dVar = new j.d(e(), "NotificationChannelIdFromSensorberg");
        dVar.l(1);
        dVar.g(pendingIntent);
        dVar.i(bVar.f());
        dVar.h(bVar.c());
        dVar.n(R.drawable.ic_notification);
        dVar.f("NotificationChannelIdFromSensorberg");
        dVar.e(true);
        dVar.m(true);
        return dVar.b();
    }

    private final com.sensorberg.smartworkspace.app.utils.c d() {
        return (com.sensorberg.smartworkspace.app.utils.c) this.f7468i.getValue();
    }

    private final Context e() {
        return (Context) this.f7466g.getValue();
    }

    /* access modifiers changed from: private */
    public final c f() {
        return (c) this.f7467h.getValue();
    }

    private final i g() {
        return (i) this.f7470k.getValue();
    }

    private final n h() {
        return (n) this.f7469j.getValue();
    }

    @TargetApi(26)
    private final void i() {
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel = new NotificationChannel("NotificationChannelIdFromSensorberg", "Location Based Notifications", 4);
            notificationChannel.setDescription("Get here the latest location based information");
            this.f7471l.createNotificationChannel(notificationChannel);
        }
    }

    private final void j(g.e.j.a.b bVar) {
        Intent intent = new Intent(e(), SingleActivity.class);
        intent.setAction("com.sensorberg.smartworkspace.info.ACTION_NOTIFICATION_CLICKED");
        intent.putExtra("com.sensorberg.smartworkspace.info.EXTRA_ACTION", bVar);
        PendingIntent activity = PendingIntent.getActivity(e(), 1, intent, 134217728);
        Object systemService = e().getSystemService("notification");
        if (systemService != null) {
            k.d(activity, "pending");
            ((NotificationManager) systemService).notify(bVar.a().hashCode(), c(activity, bVar));
            g().a(bVar, g.e.j.a.c.Ignored);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.app.NotificationManager");
    }

    public void a(Context context, g.e.j.a.b bVar) {
        k.e(context, "context");
        k.e(bVar, "action");
        if (d().I()) {
            n.a.a.a("onAction received ()" + bVar.f() + ", saving Info object of action into DB", new Object[0]);
            a b2 = a.f7497j.b(bVar);
            g.e.e.a aVar = g.e.e.a.f9778f;
            aVar.j(aVar.d(), new g(this, b2));
            if (!h().v()) {
                n.a.a.a("onAction does not show Notification - flag is set to false", new Object[0]);
            } else if (m.b(context).a()) {
                n.a.a.a("show notification for action " + bVar.f(), new Object[0]);
                j(bVar);
            } else {
                g().a(bVar, g.e.j.a.c.NotificationDisabled);
            }
        }
    }

    public m.a.c.a n() {
        return c.a.a(this);
    }
}
