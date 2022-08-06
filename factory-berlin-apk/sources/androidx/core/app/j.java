package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;

/* compiled from: NotificationCompat */
public class j {

    /* compiled from: NotificationCompat */
    public static class a {
        final Bundle a;
        private IconCompat b;
        private final n[] c;

        /* renamed from: d  reason: collision with root package name */
        private final n[] f669d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f670e;

        /* renamed from: f  reason: collision with root package name */
        boolean f671f;

        /* renamed from: g  reason: collision with root package name */
        private final int f672g;

        /* renamed from: h  reason: collision with root package name */
        private final boolean f673h;
        @Deprecated

        /* renamed from: i  reason: collision with root package name */
        public int f674i;

        /* renamed from: j  reason: collision with root package name */
        public CharSequence f675j;

        /* renamed from: k  reason: collision with root package name */
        public PendingIntent f676k;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public a(int i2, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i2 != 0 ? IconCompat.b((Resources) null, "", i2) : null, charSequence, pendingIntent);
        }

        public PendingIntent a() {
            return this.f676k;
        }

        public boolean b() {
            return this.f670e;
        }

        public n[] c() {
            return this.f669d;
        }

        public Bundle d() {
            return this.a;
        }

        public IconCompat e() {
            int i2;
            if (this.b == null && (i2 = this.f674i) != 0) {
                this.b = IconCompat.b((Resources) null, "", i2);
            }
            return this.b;
        }

        public n[] f() {
            return this.c;
        }

        public int g() {
            return this.f672g;
        }

        public boolean h() {
            return this.f671f;
        }

        public CharSequence i() {
            return this.f675j;
        }

        public boolean j() {
            return this.f673h;
        }

        public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), (n[]) null, (n[]) null, true, 0, true, false);
        }

        a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, n[] nVarArr, n[] nVarArr2, boolean z, int i2, boolean z2, boolean z3) {
            this.f671f = true;
            this.b = iconCompat;
            if (iconCompat != null && iconCompat.g() == 2) {
                this.f674i = iconCompat.c();
            }
            this.f675j = d.d(charSequence);
            this.f676k = pendingIntent;
            this.a = bundle == null ? new Bundle() : bundle;
            this.c = nVarArr;
            this.f669d = nVarArr2;
            this.f670e = z;
            this.f672g = i2;
            this.f671f = z2;
            this.f673h = z3;
        }
    }

    /* compiled from: NotificationCompat */
    public static class b extends e {

        /* renamed from: e  reason: collision with root package name */
        private CharSequence f677e;

        public void b(i iVar) {
            if (Build.VERSION.SDK_INT >= 16) {
                Notification.BigTextStyle bigText = new Notification.BigTextStyle(iVar.a()).setBigContentTitle(this.b).bigText(this.f677e);
                if (this.f689d) {
                    bigText.setSummaryText(this.c);
                }
            }
        }

        public b g(CharSequence charSequence) {
            this.f677e = d.d(charSequence);
            return this;
        }
    }

    /* compiled from: NotificationCompat */
    public static final class c {
        public static Notification.BubbleMetadata h(c cVar) {
            if (cVar == null) {
                return null;
            }
            Notification.BubbleMetadata.Builder suppressNotification = new Notification.BubbleMetadata.Builder().setAutoExpandBubble(cVar.a()).setDeleteIntent(cVar.b()).setIcon(cVar.e().n()).setIntent(cVar.f()).setSuppressNotification(cVar.g());
            if (cVar.c() != 0) {
                suppressNotification.setDesiredHeight(cVar.c());
            }
            if (cVar.d() != 0) {
                suppressNotification.setDesiredHeightResId(cVar.d());
            }
            return suppressNotification.build();
        }

        public abstract boolean a();

        public abstract PendingIntent b();

        public abstract int c();

        public abstract int d();

        public abstract IconCompat e();

        public abstract PendingIntent f();

        public abstract boolean g();
    }

    /* compiled from: NotificationCompat */
    public static abstract class e {
        protected d a;
        CharSequence b;
        CharSequence c;

        /* renamed from: d  reason: collision with root package name */
        boolean f689d = false;

        public void a(Bundle bundle) {
        }

        public abstract void b(i iVar);

        public RemoteViews c(i iVar) {
            return null;
        }

        public RemoteViews d(i iVar) {
            return null;
        }

        public RemoteViews e(i iVar) {
            return null;
        }

        public void f(d dVar) {
            if (this.a != dVar) {
                this.a = dVar;
                if (dVar != null) {
                    dVar.o(this);
                }
            }
        }
    }

    public static Bundle a(Notification notification) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 19) {
            return notification.extras;
        }
        if (i2 >= 16) {
            return l.c(notification);
        }
        return null;
    }

    /* compiled from: NotificationCompat */
    public static class d {
        String A;
        Bundle B;
        int C;
        int D;
        Notification E;
        RemoteViews F;
        RemoteViews G;
        RemoteViews H;
        String I;
        int J;
        String K;
        long L;
        int M;
        boolean N;
        c O;
        Notification P;
        boolean Q;
        @Deprecated
        public ArrayList<String> R;
        public Context a;
        public ArrayList<a> b;
        ArrayList<a> c;

        /* renamed from: d  reason: collision with root package name */
        CharSequence f678d;

        /* renamed from: e  reason: collision with root package name */
        CharSequence f679e;

        /* renamed from: f  reason: collision with root package name */
        PendingIntent f680f;

        /* renamed from: g  reason: collision with root package name */
        PendingIntent f681g;

        /* renamed from: h  reason: collision with root package name */
        RemoteViews f682h;

        /* renamed from: i  reason: collision with root package name */
        Bitmap f683i;

        /* renamed from: j  reason: collision with root package name */
        CharSequence f684j;

        /* renamed from: k  reason: collision with root package name */
        int f685k;

        /* renamed from: l  reason: collision with root package name */
        int f686l;

        /* renamed from: m  reason: collision with root package name */
        boolean f687m;

        /* renamed from: n  reason: collision with root package name */
        boolean f688n;
        e o;
        CharSequence p;
        CharSequence[] q;
        int r;
        int s;
        boolean t;
        String u;
        boolean v;
        String w;
        boolean x;
        boolean y;
        boolean z;

        public d(Context context, String str) {
            this.b = new ArrayList<>();
            this.c = new ArrayList<>();
            this.f687m = true;
            this.x = false;
            this.C = 0;
            this.D = 0;
            this.J = 0;
            this.M = 0;
            Notification notification = new Notification();
            this.P = notification;
            this.a = context;
            this.I = str;
            notification.when = System.currentTimeMillis();
            this.P.audioStreamType = -1;
            this.f686l = 0;
            this.R = new ArrayList<>();
            this.N = true;
        }

        protected static CharSequence d(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        private void j(int i2, boolean z2) {
            if (z2) {
                Notification notification = this.P;
                notification.flags = i2 | notification.flags;
                return;
            }
            Notification notification2 = this.P;
            notification2.flags = (~i2) & notification2.flags;
        }

        public d a(int i2, CharSequence charSequence, PendingIntent pendingIntent) {
            this.b.add(new a(i2, charSequence, pendingIntent));
            return this;
        }

        public Notification b() {
            return new k(this).c();
        }

        public Bundle c() {
            if (this.B == null) {
                this.B = new Bundle();
            }
            return this.B;
        }

        public d e(boolean z2) {
            j(16, z2);
            return this;
        }

        public d f(String str) {
            this.I = str;
            return this;
        }

        public d g(PendingIntent pendingIntent) {
            this.f680f = pendingIntent;
            return this;
        }

        public d h(CharSequence charSequence) {
            this.f679e = d(charSequence);
            return this;
        }

        public d i(CharSequence charSequence) {
            this.f678d = d(charSequence);
            return this;
        }

        public d k(boolean z2) {
            this.x = z2;
            return this;
        }

        public d l(int i2) {
            this.f686l = i2;
            return this;
        }

        public d m(boolean z2) {
            this.f687m = z2;
            return this;
        }

        public d n(int i2) {
            this.P.icon = i2;
            return this;
        }

        public d o(e eVar) {
            if (this.o != eVar) {
                this.o = eVar;
                if (eVar != null) {
                    eVar.f(this);
                }
            }
            return this;
        }

        public d p(CharSequence charSequence) {
            this.P.tickerText = d(charSequence);
            return this;
        }

        public d q(long j2) {
            this.P.when = j2;
            return this;
        }

        @Deprecated
        public d(Context context) {
            this(context, (String) null);
        }
    }
}
