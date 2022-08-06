package com.google.gson;

import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.TypeAdapters;
import java.lang.reflect.Type;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: GsonBuilder */
public final class g {
    private Excluder a = Excluder.f4239m;
    private r b = r.DEFAULT;
    private e c = d.IDENTITY;

    /* renamed from: d  reason: collision with root package name */
    private final Map<Type, h<?>> f4227d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    private final List<t> f4228e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    private final List<t> f4229f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    private boolean f4230g = false;

    /* renamed from: h  reason: collision with root package name */
    private String f4231h;

    /* renamed from: i  reason: collision with root package name */
    private int f4232i = 2;

    /* renamed from: j  reason: collision with root package name */
    private int f4233j = 2;

    /* renamed from: k  reason: collision with root package name */
    private boolean f4234k = false;

    /* renamed from: l  reason: collision with root package name */
    private boolean f4235l = false;

    /* renamed from: m  reason: collision with root package name */
    private boolean f4236m = true;

    /* renamed from: n  reason: collision with root package name */
    private boolean f4237n = false;
    private boolean o = false;
    private boolean p = false;

    private void a(String str, int i2, int i3, List<t> list) {
        a aVar;
        a aVar2;
        a aVar3;
        if (str != null && !"".equals(str.trim())) {
            aVar2 = new a(Date.class, str);
            aVar = new a(Timestamp.class, str);
            aVar3 = new a(java.sql.Date.class, str);
        } else if (i2 != 2 && i3 != 2) {
            a aVar4 = new a(Date.class, i2, i3);
            a aVar5 = new a(Timestamp.class, i2, i3);
            a aVar6 = new a(java.sql.Date.class, i2, i3);
            aVar2 = aVar4;
            aVar = aVar5;
            aVar3 = aVar6;
        } else {
            return;
        }
        list.add(TypeAdapters.a(Date.class, aVar2));
        list.add(TypeAdapters.a(Timestamp.class, aVar));
        list.add(TypeAdapters.a(java.sql.Date.class, aVar3));
    }

    public f b() {
        ArrayList arrayList = r1;
        ArrayList arrayList2 = new ArrayList(this.f4228e.size() + this.f4229f.size() + 3);
        arrayList2.addAll(this.f4228e);
        Collections.reverse(arrayList2);
        ArrayList arrayList3 = new ArrayList(this.f4229f);
        Collections.reverse(arrayList3);
        arrayList2.addAll(arrayList3);
        a(this.f4231h, this.f4232i, this.f4233j, arrayList2);
        return new f(this.a, this.c, this.f4227d, this.f4230g, this.f4234k, this.o, this.f4236m, this.f4237n, this.p, this.f4235l, this.b, this.f4231h, this.f4232i, this.f4233j, this.f4228e, this.f4229f, arrayList);
    }
}
