package com.sensorberg.notifications.sdk.internal.m.b;

import com.sensorberg.notifications.sdk.internal.backend.backendsdkv2.model.Content;
import com.sensorberg.notifications.sdk.internal.backend.backendsdkv2.model.ResolveAction;
import com.sensorberg.notifications.sdk.internal.backend.backendsdkv2.model.ResolveResponse;
import com.sensorberg.notifications.sdk.internal.backend.backendsdkv2.model.Timeframe;
import com.sensorberg.notifications.sdk.internal.m.a;
import com.sensorberg.notifications.sdk.internal.model.Trigger;
import com.sensorberg.notifications.sdk.internal.model.l;
import com.sensorberg.notifications.sdk.internal.model.m;
import f.a.a.b;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.TypeCastException;
import kotlin.jvm.internal.k;
import org.json.JSONObject;
import org.threeten.bp.format.c;
import retrofit2.q;

/* compiled from: TriggerMapper.kt */
public final class d implements retrofit2.d<ResolveResponse> {
    /* access modifiers changed from: private */
    public static final c b = c.f11508l;
    public static final a c = new a((DefaultConstructorMarker) null);
    private final a.C0169a a;

    /* compiled from: TriggerMapper.kt */
    public static final class a {
        private a() {
        }

        private final long d(String str) {
            return d.b.l(str).y(org.threeten.bp.temporal.a.INSTANT_SECONDS) * ((long) 1000);
        }

        private final String e(JSONObject jSONObject, ResolveAction resolveAction) {
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            jSONObject.put("com.sensorberg.notifications.sdk.backend.v2.meta.action_type", resolveAction.m());
            jSONObject.put("com.sensorberg.notifications.sdk.backend.v2.meta.action_trigger", resolveAction.k());
            String jSONObject2 = jSONObject.toString();
            k.b(jSONObject2, "json.toString()");
            return jSONObject2;
        }

        public final short a(String str) {
            k.f(str, "triggerId");
            String substring = str.substring(32, 37);
            k.b(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return g(substring);
        }

        public final short b(String str) {
            k.f(str, "triggerId");
            String substring = str.substring(37, 42);
            k.b(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return g(substring);
        }

        public final UUID c(String str) {
            k.f(str, "triggerId");
            StringBuilder sb = new StringBuilder();
            String substring = str.substring(0, 8);
            k.b(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            sb.append(substring);
            sb.append("-");
            String substring2 = str.substring(8, 12);
            k.b(substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            sb.append(substring2);
            sb.append("-");
            String substring3 = str.substring(12, 16);
            k.b(substring3, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            sb.append(substring3);
            sb.append("-");
            String substring4 = str.substring(16, 20);
            k.b(substring4, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            sb.append(substring4);
            sb.append("-");
            String substring5 = str.substring(20, 32);
            k.b(substring5, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            sb.append(substring5);
            UUID fromString = UUID.fromString(sb.toString());
            k.b(fromString, "UUID.fromString(\n\t\t\t\t\ttr…ggerId.substring(20, 32))");
            return fromString;
        }

        public final com.sensorberg.notifications.sdk.internal.model.d f(ResolveAction resolveAction, List<l> list) {
            a aVar;
            JSONObject jSONObject;
            l lVar;
            ResolveAction resolveAction2 = resolveAction;
            k.f(resolveAction2, "action");
            k.f(list, "timePeriods");
            String e2 = resolveAction.e();
            Content b = resolveAction.b();
            String c = b != null ? b.c() : null;
            Content b2 = resolveAction.b();
            String a = b2 != null ? b2.a() : null;
            Content b3 = resolveAction.b();
            String d2 = b3 != null ? b3.d() : null;
            Content b4 = resolveAction.b();
            if (b4 != null) {
                jSONObject = b4.b();
                aVar = this;
            } else {
                aVar = this;
                jSONObject = null;
            }
            String e3 = aVar.e(jSONObject, resolveAction2);
            boolean a2 = k.a(resolveAction.g(), Boolean.TRUE);
            long longValue = resolveAction.c() == null ? 0 : resolveAction.c().longValue() * ((long) 1000);
            Long d3 = resolveAction.d();
            com.sensorberg.notifications.sdk.internal.model.d dVar = new com.sensorberg.notifications.sdk.internal.model.d(e2, (String) null, c, a, d2, e3, a2, longValue, d3 != null ? d3.longValue() : 0, resolveAction.i() == null ? 0 : resolveAction.i().longValue() * ((long) 1000), k.a(resolveAction.h(), Boolean.TRUE) ? 1 : 0, resolveAction.m() == 4);
            if (resolveAction.j() == null || resolveAction.j().isEmpty()) {
                list.add(new l(0, resolveAction.e(), 0, Long.MAX_VALUE, 1, (DefaultConstructorMarker) null));
            } else {
                List<Timeframe> j2 = resolveAction.j();
                ArrayList arrayList = new ArrayList();
                for (Timeframe timeframe : j2) {
                    if (timeframe.b() == null || timeframe.a() == null) {
                        lVar = null;
                    } else {
                        String e4 = resolveAction.e();
                        a aVar2 = d.c;
                        String b5 = timeframe.b();
                        if (b5 != null) {
                            long d4 = aVar2.d(b5);
                            a aVar3 = d.c;
                            String a3 = timeframe.a();
                            if (a3 != null) {
                                lVar = new l(0, e4, d4, aVar3.d(a3), 1, (DefaultConstructorMarker) null);
                            } else {
                                k.m();
                                throw null;
                            }
                        } else {
                            k.m();
                            throw null;
                        }
                    }
                    if (lVar != null) {
                        arrayList.add(lVar);
                    }
                }
                list.addAll(arrayList);
            }
            return dVar;
        }

        public final short g(String str) {
            k.f(str, "value");
            return (short) ((char) Integer.parseInt(str));
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public d(a.C0169a aVar) {
        k.f(aVar, "callback");
        this.a = aVar;
    }

    private final void d(ResolveResponse resolveResponse, a.C0169a aVar) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        List<ResolveAction> a2 = resolveResponse.a();
        if (a2 != null) {
            for (ResolveAction resolveAction : a2) {
                com.sensorberg.notifications.sdk.internal.model.d f2 = c.f(resolveAction, arrayList2);
                arrayList3.add(f2);
                for (String str : resolveAction.a()) {
                    Trigger g2 = g(str, resolveAction, f2);
                    if (g2 != null) {
                        arrayList.add(g2);
                        m mVar = r9;
                        m mVar2 = new m(0, g2.a(), resolveAction.l(), f2.e(), str, 1, (DefaultConstructorMarker) null);
                        arrayList4.add(mVar);
                    }
                }
            }
        }
        aVar.b(arrayList, arrayList2, arrayList3, arrayList4);
    }

    private final Trigger.Beacon e(String str, Trigger.b bVar) {
        return new Trigger.Beacon(c.c(str), c.a(str), c.b(str), bVar);
    }

    private final Trigger.a f(String str, Trigger.b bVar) {
        if (str != null) {
            String substring = str.substring(0, 8);
            k.b(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            b j2 = b.j(substring);
            k.b(j2, "GeoHash.fromGeohashStrin…riggerId.substring(0, 8))");
            f.a.a.c k2 = j2.k();
            if (str != null) {
                String substring2 = str.substring(8, 14);
                k.b(substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                float parseFloat = Float.parseFloat(substring2);
                k.b(k2, "point");
                return new Trigger.a(k2.a(), k2.b(), parseFloat, bVar);
            }
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    private final Trigger g(String str, ResolveAction resolveAction, com.sensorberg.notifications.sdk.internal.model.d dVar) {
        int length = str.length();
        if (length == 14) {
            return f(str, resolveAction.l());
        }
        if (length == 42) {
            return e(str, resolveAction.l());
        }
        n.a.a.k("Invalid trigger ID: " + str, new Object[0]);
        return null;
    }

    public void a(retrofit2.b<ResolveResponse> bVar, q<ResolveResponse> qVar) {
        k.f(bVar, "call");
        k.f(qVar, "response");
        if (qVar.e()) {
            ResolveResponse a2 = qVar.a();
            if (a2 != null) {
                k.b(a2, "response.body()!!");
                d(a2, this.a);
                return;
            }
            k.m();
            throw null;
        }
        n.a.a.c("getNotificationTriggers failed with code " + qVar.b(), new Object[0]);
        this.a.a();
    }

    public void b(retrofit2.b<ResolveResponse> bVar, Throwable th) {
        k.f(bVar, "call");
        k.f(th, "t");
        n.a.a.e(th, "getNotificationTriggers failed", new Object[0]);
        this.a.a();
    }
}
