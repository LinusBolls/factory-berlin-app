package com.sensorberg.smartworkspace.app.activities.permission;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.appcompat.app.b;
import androidx.lifecycle.f0;
import androidx.lifecycle.v;
import com.sensorberg.factory.R;
import com.sensorberg.smartworkspace.app.activities.permission.b;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Set;
import kotlin.i;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;

@i(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 !2\u00020\u0001:\u0001!B\u0007¢\u0006\u0004\b \u0010\u0011J1\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\tH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0014\u001a\u00020\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0016\u0010\u0011R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001d\u0010\u001f\u001a\u00020\u001a8B@\u0002X\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\""}, d2 = {"Lcom/sensorberg/smartworkspace/app/activities/permission/PermissionActivity;", "Lcom/sensorberg/smartworkspace/app/n/a/a;", "", "resultCode", "Lcom/sensorberg/smartworkspace/app/activities/permission/PermissionResult;", "permissionResult", "", "Lcom/sensorberg/permissionbitte/Permission;", "permissions", "", "finishWithResult", "(ILcom/sensorberg/smartworkspace/app/activities/permission/PermissionResult;[Lcom/sensorberg/permissionbitte/Permission;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onDestroy", "()V", "Lcom/sensorberg/smartworkspace/app/activities/permission/PermissionState;", "permissionState", "onStateChanged", "(Lcom/sensorberg/smartworkspace/app/activities/permission/PermissionState;)V", "showRationalDeclinedDialog", "Landroidx/appcompat/app/AlertDialog;", "dialog", "Landroidx/appcompat/app/AlertDialog;", "Lcom/sensorberg/smartworkspace/app/activities/permission/PermissionViewModel;", "permissionViewModel$delegate", "Lkotlin/Lazy;", "getPermissionViewModel", "()Lcom/sensorberg/smartworkspace/app/activities/permission/PermissionViewModel;", "permissionViewModel", "<init>", "Companion", "app_appCenterRelease"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
/* compiled from: PermissionActivity.kt */
public final class PermissionActivity extends com.sensorberg.smartworkspace.app.n.a.a {
    public static final b B = new b((DefaultConstructorMarker) null);
    private androidx.appcompat.app.b A;
    private final kotlin.e z = g.a(new a(this, (m.a.c.j.a) null, new g(this)));

    /* compiled from: LifecycleOwnerExt.kt */
    public static final class a extends l implements kotlin.e0.c.a<c> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ v f7011h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f7012i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f7013j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(v vVar, m.a.c.j.a aVar, kotlin.e0.c.a aVar2) {
            super(0);
            this.f7011h = vVar;
            this.f7012i = aVar;
            this.f7013j = aVar2;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [com.sensorberg.smartworkspace.app.activities.permission.c, androidx.lifecycle.n0] */
        /* renamed from: a */
        public final c d() {
            return m.a.b.a.d.a.b.b(this.f7011h, kotlin.jvm.internal.v.b(c.class), this.f7012i, this.f7013j);
        }
    }

    /* compiled from: PermissionActivity.kt */
    public static final class b {
        private b() {
        }

        private final Intent a(Context context) {
            return new Intent(context, PermissionActivity.class);
        }

        public final Set<g.e.l.a> b(Intent intent) {
            if (intent == null) {
                return i0.b();
            }
            if (!intent.hasExtra("permissionArray")) {
                return i0.b();
            }
            Parcelable[] parcelableArrayExtra = intent.getParcelableArrayExtra("permissionArray");
            k.d(parcelableArrayExtra, "data.getParcelableArrayE…a(EXTRA_PERMISSION_ARRAY)");
            ArrayList arrayList = new ArrayList(parcelableArrayExtra.length);
            int length = parcelableArrayExtra.length;
            int i2 = 0;
            while (i2 < length) {
                Parcelable parcelable = parcelableArrayExtra[i2];
                if (parcelable != null) {
                    arrayList.add((g.e.l.a) parcelable);
                    i2++;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type com.sensorberg.permissionbitte.Permission");
                }
            }
            return v.V(arrayList);
        }

        public final a c(Intent intent) {
            Serializable serializableExtra = intent != null ? intent.getSerializableExtra("permissionResult") : null;
            if (serializableExtra != null) {
                return (a) serializableExtra;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.sensorberg.smartworkspace.app.activities.permission.PermissionResult");
        }

        public final void d(Activity activity) {
            k.e(activity, "activity");
            activity.startActivityForResult(a(activity), 1);
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: PermissionActivity.kt */
    static final class c<T> implements f0<b> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ PermissionActivity f7014g;

        c(PermissionActivity permissionActivity) {
            this.f7014g = permissionActivity;
        }

        /* renamed from: a */
        public final void k(b bVar) {
            this.f7014g.R(bVar);
        }
    }

    /* compiled from: PermissionActivity.kt */
    static final class d implements View.OnClickListener {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ PermissionActivity f7015g;

        d(PermissionActivity permissionActivity) {
            this.f7015g = permissionActivity;
        }

        public final void onClick(View view) {
            this.f7015g.Q().v();
        }
    }

    /* compiled from: PermissionActivity.kt */
    static final class e implements DialogInterface.OnClickListener {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ PermissionActivity f7016g;

        e(PermissionActivity permissionActivity) {
            this.f7016g = permissionActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            this.f7016g.Q().v();
        }
    }

    /* compiled from: PermissionActivity.kt */
    static final class f implements DialogInterface.OnClickListener {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ PermissionActivity f7017g;

        f(PermissionActivity permissionActivity) {
            this.f7017g = permissionActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            this.f7017g.Q().w();
        }
    }

    /* compiled from: PermissionActivity.kt */
    static final class g extends l implements kotlin.e0.c.a<m.a.c.i.a> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ PermissionActivity f7018h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(PermissionActivity permissionActivity) {
            super(0);
            this.f7018h = permissionActivity;
        }

        /* renamed from: a */
        public final m.a.c.i.a d() {
            return m.a.c.i.b.b(g.e.l.b.c(this.f7018h));
        }
    }

    private final void O(int i2, a aVar, g.e.l.a[] aVarArr) {
        Intent intent = new Intent();
        intent.putExtra("permissionResult", aVar);
        if (aVarArr != null) {
            intent.putExtra("permissionArray", aVarArr);
        }
        setResult(i2, intent);
        finish();
    }

    static /* synthetic */ void P(PermissionActivity permissionActivity, int i2, a aVar, g.e.l.a[] aVarArr, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            aVarArr = null;
        }
        permissionActivity.O(i2, aVar, aVarArr);
    }

    /* access modifiers changed from: private */
    public final c Q() {
        return (c) this.z.getValue();
    }

    /* access modifiers changed from: private */
    public final void R(b bVar) {
        n.a.a.a(String.valueOf(bVar), new Object[0]);
        if (bVar instanceof b.c) {
            g.e.l.b.a(this);
        } else if (bVar instanceof b.C0427b) {
            P(this, 0, a.DENIED, (g.e.l.a[]) null, 4, (Object) null);
        } else if (bVar instanceof b.e) {
            P(this, 0, a.DENIED, (g.e.l.a[]) null, 4, (Object) null);
        } else if (bVar instanceof b.a) {
            P(this, -1, a.ALLOWED, (g.e.l.a[]) null, 4, (Object) null);
        } else if (bVar instanceof b.f) {
            S();
        } else if (bVar instanceof b.d) {
            a aVar = a.BE_GRACEFUL;
            Object[] array = ((b.d) bVar).a().toArray(new g.e.l.a[0]);
            if (array != null) {
                O(-1, aVar, (g.e.l.a[]) array);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
    }

    private final void S() {
        androidx.appcompat.app.b bVar = this.A;
        if (bVar != null) {
            bVar.show();
        } else {
            k.q("dialog");
            throw null;
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawableResource(R.drawable.alternative_background);
        Intent intent = new Intent();
        intent.putExtra("permissionResult", a.CANCELED);
        setResult(0, intent);
        Q().t().o(this, new c(this));
        ((com.sensorberg.smartworkspace.app.k.f) L(R.layout.activity_permission)).v.setOnClickListener(new d(this));
        b.a aVar = new b.a(this);
        aVar.p(R.string.label_permission_rationale_title);
        aVar.h(R.string.label_permission_rationale_message);
        aVar.m(R.string.label_OK, new e(this));
        aVar.j(getString(R.string.label_NO), new f(this));
        aVar.d(false);
        androidx.appcompat.app.b a2 = aVar.a();
        k.d(a2, "AlertDialog.Builder(this…able(false)\n\t\t\t\t.create()");
        this.A = a2;
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        androidx.appcompat.app.b bVar = this.A;
        if (bVar != null) {
            bVar.dismiss();
        } else {
            k.q("dialog");
            throw null;
        }
    }
}
