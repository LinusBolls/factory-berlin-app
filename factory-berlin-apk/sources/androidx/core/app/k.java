package androidx.core.app;

import android.app.Notification;
import android.app.RemoteInput;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.widget.RemoteViews;
import androidx.core.app.j;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: NotificationCompatBuilder */
class k implements i {
    private final Notification.Builder a;
    private final j.d b;
    private RemoteViews c;

    /* renamed from: d  reason: collision with root package name */
    private RemoteViews f690d;

    /* renamed from: e  reason: collision with root package name */
    private final List<Bundle> f691e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    private final Bundle f692f = new Bundle();

    /* renamed from: g  reason: collision with root package name */
    private int f693g;

    /* renamed from: h  reason: collision with root package name */
    private RemoteViews f694h;

    k(j.d dVar) {
        ArrayList<String> arrayList;
        this.b = dVar;
        if (Build.VERSION.SDK_INT >= 26) {
            this.a = new Notification.Builder(dVar.a, dVar.I);
        } else {
            this.a = new Notification.Builder(dVar.a);
        }
        Notification notification = dVar.P;
        this.a.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, dVar.f682h).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(dVar.f678d).setContentText(dVar.f679e).setContentInfo(dVar.f684j).setContentIntent(dVar.f680f).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(dVar.f681g, (notification.flags & 128) != 0).setLargeIcon(dVar.f683i).setNumber(dVar.f685k).setProgress(dVar.r, dVar.s, dVar.t);
        if (Build.VERSION.SDK_INT < 21) {
            this.a.setSound(notification.sound, notification.audioStreamType);
        }
        if (Build.VERSION.SDK_INT >= 16) {
            this.a.setSubText(dVar.p).setUsesChronometer(dVar.f688n).setPriority(dVar.f686l);
            Iterator<j.a> it = dVar.b.iterator();
            while (it.hasNext()) {
                b(it.next());
            }
            Bundle bundle = dVar.B;
            if (bundle != null) {
                this.f692f.putAll(bundle);
            }
            if (Build.VERSION.SDK_INT < 20) {
                if (dVar.x) {
                    this.f692f.putBoolean("android.support.localOnly", true);
                }
                String str = dVar.u;
                if (str != null) {
                    this.f692f.putString("android.support.groupKey", str);
                    if (dVar.v) {
                        this.f692f.putBoolean("android.support.isGroupSummary", true);
                    } else {
                        this.f692f.putBoolean("android.support.useSideChannel", true);
                    }
                }
                String str2 = dVar.w;
                if (str2 != null) {
                    this.f692f.putString("android.support.sortKey", str2);
                }
            }
            this.c = dVar.F;
            this.f690d = dVar.G;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            this.a.setShowWhen(dVar.f687m);
            if (Build.VERSION.SDK_INT < 21 && (arrayList = dVar.R) != null && !arrayList.isEmpty()) {
                Bundle bundle2 = this.f692f;
                ArrayList<String> arrayList2 = dVar.R;
                bundle2.putStringArray("android.people", (String[]) arrayList2.toArray(new String[arrayList2.size()]));
            }
        }
        if (Build.VERSION.SDK_INT >= 20) {
            this.a.setLocalOnly(dVar.x).setGroup(dVar.u).setGroupSummary(dVar.v).setSortKey(dVar.w);
            this.f693g = dVar.M;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            this.a.setCategory(dVar.A).setColor(dVar.C).setVisibility(dVar.D).setPublicVersion(dVar.E).setSound(notification.sound, notification.audioAttributes);
            Iterator<String> it2 = dVar.R.iterator();
            while (it2.hasNext()) {
                this.a.addPerson(it2.next());
            }
            this.f694h = dVar.H;
            if (dVar.c.size() > 0) {
                Bundle bundle3 = dVar.c().getBundle("android.car.EXTENSIONS");
                bundle3 = bundle3 == null ? new Bundle() : bundle3;
                Bundle bundle4 = new Bundle();
                for (int i2 = 0; i2 < dVar.c.size(); i2++) {
                    bundle4.putBundle(Integer.toString(i2), l.b(dVar.c.get(i2)));
                }
                bundle3.putBundle("invisible_actions", bundle4);
                dVar.c().putBundle("android.car.EXTENSIONS", bundle3);
                this.f692f.putBundle("android.car.EXTENSIONS", bundle3);
            }
        }
        if (Build.VERSION.SDK_INT >= 24) {
            this.a.setExtras(dVar.B).setRemoteInputHistory(dVar.q);
            RemoteViews remoteViews = dVar.F;
            if (remoteViews != null) {
                this.a.setCustomContentView(remoteViews);
            }
            RemoteViews remoteViews2 = dVar.G;
            if (remoteViews2 != null) {
                this.a.setCustomBigContentView(remoteViews2);
            }
            RemoteViews remoteViews3 = dVar.H;
            if (remoteViews3 != null) {
                this.a.setCustomHeadsUpContentView(remoteViews3);
            }
        }
        if (Build.VERSION.SDK_INT >= 26) {
            this.a.setBadgeIconType(dVar.J).setShortcutId(dVar.K).setTimeoutAfter(dVar.L).setGroupAlertBehavior(dVar.M);
            if (dVar.z) {
                this.a.setColorized(dVar.y);
            }
            if (!TextUtils.isEmpty(dVar.I)) {
                this.a.setSound((Uri) null).setDefaults(0).setLights(0, 0, 0).setVibrate((long[]) null);
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.a.setAllowSystemGeneratedContextualActions(dVar.N);
            this.a.setBubbleMetadata(j.c.h(dVar.O));
        }
        if (dVar.Q) {
            if (this.b.v) {
                this.f693g = 2;
            } else {
                this.f693g = 1;
            }
            this.a.setVibrate((long[]) null);
            this.a.setSound((Uri) null);
            int i3 = notification.defaults & -2;
            notification.defaults = i3;
            int i4 = i3 & -3;
            notification.defaults = i4;
            this.a.setDefaults(i4);
            if (Build.VERSION.SDK_INT >= 26) {
                if (TextUtils.isEmpty(this.b.u)) {
                    this.a.setGroup("silent");
                }
                this.a.setGroupAlertBehavior(this.f693g);
            }
        }
    }

    private void b(j.a aVar) {
        Notification.Action.Builder builder;
        Bundle bundle;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 20) {
            IconCompat e2 = aVar.e();
            if (Build.VERSION.SDK_INT >= 23) {
                builder = new Notification.Action.Builder(e2 != null ? e2.n() : null, aVar.i(), aVar.a());
            } else {
                builder = new Notification.Action.Builder(e2 != null ? e2.c() : 0, aVar.i(), aVar.a());
            }
            if (aVar.f() != null) {
                for (RemoteInput addRemoteInput : n.b(aVar.f())) {
                    builder.addRemoteInput(addRemoteInput);
                }
            }
            if (aVar.d() != null) {
                bundle = new Bundle(aVar.d());
            } else {
                bundle = new Bundle();
            }
            bundle.putBoolean("android.support.allowGeneratedReplies", aVar.b());
            if (Build.VERSION.SDK_INT >= 24) {
                builder.setAllowGeneratedReplies(aVar.b());
            }
            bundle.putInt("android.support.action.semanticAction", aVar.g());
            if (Build.VERSION.SDK_INT >= 28) {
                builder.setSemanticAction(aVar.g());
            }
            if (Build.VERSION.SDK_INT >= 29) {
                builder.setContextual(aVar.j());
            }
            bundle.putBoolean("android.support.action.showsUserInterface", aVar.h());
            builder.addExtras(bundle);
            this.a.addAction(builder.build());
        } else if (i2 >= 16) {
            this.f691e.add(l.f(this.a, aVar));
        }
    }

    private void e(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        int i2 = notification.defaults & -2;
        notification.defaults = i2;
        notification.defaults = i2 & -3;
    }

    public Notification.Builder a() {
        return this.a;
    }

    public Notification c() {
        Bundle a2;
        RemoteViews e2;
        RemoteViews c2;
        j.e eVar = this.b.o;
        if (eVar != null) {
            eVar.b(this);
        }
        RemoteViews d2 = eVar != null ? eVar.d(this) : null;
        Notification d3 = d();
        if (d2 != null) {
            d3.contentView = d2;
        } else {
            RemoteViews remoteViews = this.b.F;
            if (remoteViews != null) {
                d3.contentView = remoteViews;
            }
        }
        if (!(Build.VERSION.SDK_INT < 16 || eVar == null || (c2 = eVar.c(this)) == null)) {
            d3.bigContentView = c2;
        }
        if (!(Build.VERSION.SDK_INT < 21 || eVar == null || (e2 = this.b.o.e(this)) == null)) {
            d3.headsUpContentView = e2;
        }
        if (!(Build.VERSION.SDK_INT < 16 || eVar == null || (a2 = j.a(d3)) == null)) {
            eVar.a(a2);
        }
        return d3;
    }

    /* access modifiers changed from: protected */
    public Notification d() {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26) {
            return this.a.build();
        }
        if (i2 >= 24) {
            Notification build = this.a.build();
            if (this.f693g != 0) {
                if (!(build.getGroup() == null || (build.flags & 512) == 0 || this.f693g != 2)) {
                    e(build);
                }
                if (build.getGroup() != null && (build.flags & 512) == 0 && this.f693g == 1) {
                    e(build);
                }
            }
            return build;
        } else if (i2 >= 21) {
            this.a.setExtras(this.f692f);
            Notification build2 = this.a.build();
            RemoteViews remoteViews = this.c;
            if (remoteViews != null) {
                build2.contentView = remoteViews;
            }
            RemoteViews remoteViews2 = this.f690d;
            if (remoteViews2 != null) {
                build2.bigContentView = remoteViews2;
            }
            RemoteViews remoteViews3 = this.f694h;
            if (remoteViews3 != null) {
                build2.headsUpContentView = remoteViews3;
            }
            if (this.f693g != 0) {
                if (!(build2.getGroup() == null || (build2.flags & 512) == 0 || this.f693g != 2)) {
                    e(build2);
                }
                if (build2.getGroup() != null && (build2.flags & 512) == 0 && this.f693g == 1) {
                    e(build2);
                }
            }
            return build2;
        } else if (i2 >= 20) {
            this.a.setExtras(this.f692f);
            Notification build3 = this.a.build();
            RemoteViews remoteViews4 = this.c;
            if (remoteViews4 != null) {
                build3.contentView = remoteViews4;
            }
            RemoteViews remoteViews5 = this.f690d;
            if (remoteViews5 != null) {
                build3.bigContentView = remoteViews5;
            }
            if (this.f693g != 0) {
                if (!(build3.getGroup() == null || (build3.flags & 512) == 0 || this.f693g != 2)) {
                    e(build3);
                }
                if (build3.getGroup() != null && (build3.flags & 512) == 0 && this.f693g == 1) {
                    e(build3);
                }
            }
            return build3;
        } else if (i2 >= 19) {
            SparseArray<Bundle> a2 = l.a(this.f691e);
            if (a2 != null) {
                this.f692f.putSparseParcelableArray("android.support.actionExtras", a2);
            }
            this.a.setExtras(this.f692f);
            Notification build4 = this.a.build();
            RemoteViews remoteViews6 = this.c;
            if (remoteViews6 != null) {
                build4.contentView = remoteViews6;
            }
            RemoteViews remoteViews7 = this.f690d;
            if (remoteViews7 != null) {
                build4.bigContentView = remoteViews7;
            }
            return build4;
        } else if (i2 < 16) {
            return this.a.getNotification();
        } else {
            Notification build5 = this.a.build();
            Bundle a3 = j.a(build5);
            Bundle bundle = new Bundle(this.f692f);
            for (String str : this.f692f.keySet()) {
                if (a3.containsKey(str)) {
                    bundle.remove(str);
                }
            }
            a3.putAll(bundle);
            SparseArray<Bundle> a4 = l.a(this.f691e);
            if (a4 != null) {
                j.a(build5).putSparseParcelableArray("android.support.actionExtras", a4);
            }
            RemoteViews remoteViews8 = this.c;
            if (remoteViews8 != null) {
                build5.contentView = remoteViews8;
            }
            RemoteViews remoteViews9 = this.f690d;
            if (remoteViews9 != null) {
                build5.bigContentView = remoteViews9;
            }
            return build5;
        }
    }
}
