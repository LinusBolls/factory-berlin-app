package com.sensorberg.alarms.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import com.sensorberg.alarms.internal.a;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.e;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import kotlin.x;

/* compiled from: AlarmSharedPrefStorage.kt */
public final class c {
    private final e a;

    /* compiled from: AlarmSharedPrefStorage.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: AlarmSharedPrefStorage.kt */
    static final class b extends l implements kotlin.e0.c.a<x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ c f4821h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ String f4822i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ long f4823j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ String f4824k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.l f4825l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(c cVar, String str, long j2, String str2, kotlin.e0.c.l lVar) {
            super(0);
            this.f4821h = cVar;
            this.f4822i = str;
            this.f4823j = j2;
            this.f4824k = str2;
            this.f4825l = lVar;
        }

        public final void a() {
            a a = this.f4821h.j(this.f4822i, this.f4823j, this.f4824k);
            if (a != null) {
                this.f4825l.o(a);
            }
        }

        public /* bridge */ /* synthetic */ Object d() {
            a();
            return x.a;
        }
    }

    /* renamed from: com.sensorberg.alarms.internal.c$c  reason: collision with other inner class name */
    /* compiled from: AlarmSharedPrefStorage.kt */
    static final class C0141c extends l implements kotlin.e0.c.a<SharedPreferences> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Context f4826h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0141c(Context context) {
            super(0);
            this.f4826h = context;
        }

        /* renamed from: a */
        public final SharedPreferences d() {
            return this.f4826h.getSharedPreferences("alarms_prefs", 0);
        }
    }

    static {
        new a((DefaultConstructorMarker) null);
    }

    public c(Context context) {
        k.e(context, "context");
        this.a = g.a(new C0141c(context));
    }

    private final List<String> c() {
        Set<String> keySet = g().getAll().keySet();
        ArrayList arrayList = new ArrayList();
        for (T next : keySet) {
            if (!k.a((String) next, "sensorberg.alarms_prefs.index_tracker")) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    private final SharedPreferences g() {
        return (SharedPreferences) this.a.getValue();
    }

    private final int i(SharedPreferences.Editor editor) {
        int i2 = 0;
        int i3 = g().getInt("sensorberg.alarms_prefs.index_tracker", 0);
        int i4 = i3 + 1;
        if (i4 <= 3000) {
            i2 = i4;
        }
        editor.putInt("sensorberg.alarms_prefs.index_tracker", i2);
        return i3;
    }

    /* access modifiers changed from: private */
    @SuppressLint({"ApplySharedPref"})
    public final a j(String str, long j2, String str2) {
        String string = g().getString(str, (String) null);
        a a2 = string != null ? a.f4810e.a(string) : null;
        if (a2 == null) {
            SharedPreferences.Editor edit = g().edit();
            k.d(edit, "editor");
            a aVar = new a(i(edit), str, j2, str2);
            edit.putString(str, aVar.e());
            edit.commit();
            return aVar;
        }
        a aVar2 = new a(a2.c(), str, j2, str2);
        if (!(!k.a(a2, aVar2))) {
            return null;
        }
        SharedPreferences.Editor edit2 = g().edit();
        k.b(edit2, "editor");
        edit2.putString(str, aVar2.e());
        edit2.commit();
        return aVar2;
    }

    public final void b(String str, long j2, String str2, kotlin.e0.c.l<? super a, x> lVar) {
        k.e(str, "id");
        k.e(str2, "data");
        k.e(lVar, "callback");
        g.e.e.a aVar = g.e.e.a.f9778f;
        aVar.j(aVar.d(), new b(this, str, j2, str2, lVar));
    }

    public final void d(String str) {
        k.e(str, "id");
        SharedPreferences.Editor edit = g().edit();
        k.b(edit, "editor");
        edit.remove(str);
        edit.apply();
    }

    public final a e(String str) {
        k.e(str, "id");
        String string = g().getString(str, (String) null);
        if (string == null) {
            return null;
        }
        a.C0139a aVar = a.f4810e;
        k.d(string, "it");
        return aVar.a(string);
    }

    public final List<a> f() {
        ArrayList arrayList = new ArrayList();
        for (String string : c()) {
            String string2 = g().getString(string, (String) null);
            if (string2 != null) {
                a.C0139a aVar = a.f4810e;
                k.d(string2, "it");
                arrayList.add(aVar.a(string2));
            }
        }
        return arrayList;
    }

    public final boolean h() {
        return c().isEmpty();
    }
}
