package com.google.firebase.crashlytics.d.j.x;

import android.util.Base64;
import android.util.JsonReader;
import com.google.firebase.crashlytics.d.j.v;
import com.google.firebase.crashlytics.d.j.w;
import com.google.firebase.encoders.g.d;
import java.util.ArrayList;

/* compiled from: CrashlyticsReportJsonTransform */
public class h {
    private static final com.google.firebase.encoders.a a;

    /* compiled from: CrashlyticsReportJsonTransform */
    private interface a<T> {
        T a(JsonReader jsonReader);
    }

    static {
        d dVar = new d();
        dVar.g(com.google.firebase.crashlytics.d.j.a.a);
        dVar.h(true);
        a = dVar.f();
    }

    private static v A(JsonReader jsonReader) {
        v.a b = v.b();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -2118372775:
                    if (nextName.equals("ndkPayload")) {
                        c = 7;
                        break;
                    }
                    break;
                case -1962630338:
                    if (nextName.equals("sdkVersion")) {
                        c = 0;
                        break;
                    }
                    break;
                case -911706486:
                    if (nextName.equals("buildVersion")) {
                        c = 4;
                        break;
                    }
                    break;
                case 344431858:
                    if (nextName.equals("gmpAppId")) {
                        c = 1;
                        break;
                    }
                    break;
                case 719853845:
                    if (nextName.equals("installationUuid")) {
                        c = 3;
                        break;
                    }
                    break;
                case 1874684019:
                    if (nextName.equals("platform")) {
                        c = 2;
                        break;
                    }
                    break;
                case 1975623094:
                    if (nextName.equals("displayVersion")) {
                        c = 5;
                        break;
                    }
                    break;
                case 1984987798:
                    if (nextName.equals("session")) {
                        c = 6;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    b.h(jsonReader.nextString());
                    break;
                case 1:
                    b.d(jsonReader.nextString());
                    break;
                case 2:
                    b.g(jsonReader.nextInt());
                    break;
                case 3:
                    b.e(jsonReader.nextString());
                    break;
                case 4:
                    b.b(jsonReader.nextString());
                    break;
                case 5:
                    b.c(jsonReader.nextString());
                    break;
                case 6:
                    b.i(B(jsonReader));
                    break;
                case 7:
                    b.f(y(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return b.a();
    }

    private static v.d B(JsonReader jsonReader) {
        v.d.b a2 = v.d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -2128794476:
                    if (nextName.equals("startedAt")) {
                        c = 2;
                        break;
                    }
                    break;
                case -1618432855:
                    if (nextName.equals("identifier")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1606742899:
                    if (nextName.equals("endedAt")) {
                        c = 3;
                        break;
                    }
                    break;
                case -1335157162:
                    if (nextName.equals("device")) {
                        c = 8;
                        break;
                    }
                    break;
                case -1291329255:
                    if (nextName.equals("events")) {
                        c = 9;
                        break;
                    }
                    break;
                case 3556:
                    if (nextName.equals("os")) {
                        c = 7;
                        break;
                    }
                    break;
                case 96801:
                    if (nextName.equals("app")) {
                        c = 6;
                        break;
                    }
                    break;
                case 3599307:
                    if (nextName.equals("user")) {
                        c = 5;
                        break;
                    }
                    break;
                case 286956243:
                    if (nextName.equals("generator")) {
                        c = 0;
                        break;
                    }
                    break;
                case 1025385094:
                    if (nextName.equals("crashed")) {
                        c = 4;
                        break;
                    }
                    break;
                case 2047016109:
                    if (nextName.equals("generatorType")) {
                        c = 10;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a2.g(jsonReader.nextString());
                    break;
                case 1:
                    a2.j(Base64.decode(jsonReader.nextString(), 2));
                    break;
                case 2:
                    a2.l(jsonReader.nextLong());
                    break;
                case 3:
                    a2.e(Long.valueOf(jsonReader.nextLong()));
                    break;
                case 4:
                    a2.c(jsonReader.nextBoolean());
                    break;
                case 5:
                    a2.m(C(jsonReader));
                    break;
                case 6:
                    a2.b(j(jsonReader));
                    break;
                case 7:
                    a2.k(z(jsonReader));
                    break;
                case 8:
                    a2.d(m(jsonReader));
                    break;
                case 9:
                    a2.f(k(jsonReader, a.b()));
                    break;
                case 10:
                    a2.h(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a2.a();
    }

    private static v.d.f C(JsonReader jsonReader) {
        v.d.f.a a2 = v.d.f.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            if (nextName.hashCode() == -1618432855 && nextName.equals("identifier")) {
                c = 0;
            }
            if (c != 0) {
                jsonReader.skipValue();
            } else {
                a2.b(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return a2.a();
    }

    private static v.d.a j(JsonReader jsonReader) {
        v.d.a.C0095a a2 = v.d.a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1618432855:
                    if (nextName.equals("identifier")) {
                        c = 0;
                        break;
                    }
                    break;
                case 351608024:
                    if (nextName.equals("version")) {
                        c = 1;
                        break;
                    }
                    break;
                case 719853845:
                    if (nextName.equals("installationUuid")) {
                        c = 3;
                        break;
                    }
                    break;
                case 1975623094:
                    if (nextName.equals("displayVersion")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                a2.c(jsonReader.nextString());
            } else if (c == 1) {
                a2.e(jsonReader.nextString());
            } else if (c == 2) {
                a2.b(jsonReader.nextString());
            } else if (c != 3) {
                jsonReader.skipValue();
            } else {
                a2.d(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return a2.a();
    }

    private static <T> w<T> k(JsonReader jsonReader, a<T> aVar) {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(aVar.a(jsonReader));
        }
        jsonReader.endArray();
        return w.a(arrayList);
    }

    /* access modifiers changed from: private */
    public static v.b l(JsonReader jsonReader) {
        v.b.a a2 = v.b.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            int hashCode = nextName.hashCode();
            if (hashCode != 106079) {
                if (hashCode == 111972721 && nextName.equals("value")) {
                    c = 1;
                }
            } else if (nextName.equals("key")) {
                c = 0;
            }
            if (c == 0) {
                a2.b(jsonReader.nextString());
            } else if (c != 1) {
                jsonReader.skipValue();
            } else {
                a2.c(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return a2.a();
    }

    private static v.d.c m(JsonReader jsonReader) {
        v.d.c.a a2 = v.d.c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1981332476:
                    if (nextName.equals("simulator")) {
                        c = 5;
                        break;
                    }
                    break;
                case -1969347631:
                    if (nextName.equals("manufacturer")) {
                        c = 7;
                        break;
                    }
                    break;
                case 112670:
                    if (nextName.equals("ram")) {
                        c = 3;
                        break;
                    }
                    break;
                case 3002454:
                    if (nextName.equals("arch")) {
                        c = 0;
                        break;
                    }
                    break;
                case 81784169:
                    if (nextName.equals("diskSpace")) {
                        c = 4;
                        break;
                    }
                    break;
                case 94848180:
                    if (nextName.equals("cores")) {
                        c = 2;
                        break;
                    }
                    break;
                case 104069929:
                    if (nextName.equals("model")) {
                        c = 1;
                        break;
                    }
                    break;
                case 109757585:
                    if (nextName.equals("state")) {
                        c = 6;
                        break;
                    }
                    break;
                case 2078953423:
                    if (nextName.equals("modelClass")) {
                        c = 8;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a2.b(jsonReader.nextInt());
                    break;
                case 1:
                    a2.f(jsonReader.nextString());
                    break;
                case 2:
                    a2.c(jsonReader.nextInt());
                    break;
                case 3:
                    a2.h(jsonReader.nextLong());
                    break;
                case 4:
                    a2.d(jsonReader.nextLong());
                    break;
                case 5:
                    a2.i(jsonReader.nextBoolean());
                    break;
                case 6:
                    a2.j(jsonReader.nextInt());
                    break;
                case 7:
                    a2.e(jsonReader.nextString());
                    break;
                case 8:
                    a2.g(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a2.a();
    }

    /* access modifiers changed from: private */
    public static v.d.C0096d n(JsonReader jsonReader) {
        v.d.C0096d.b a2 = v.d.C0096d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1335157162:
                    if (nextName.equals("device")) {
                        c = 3;
                        break;
                    }
                    break;
                case 96801:
                    if (nextName.equals("app")) {
                        c = 2;
                        break;
                    }
                    break;
                case 107332:
                    if (nextName.equals("log")) {
                        c = 4;
                        break;
                    }
                    break;
                case 3575610:
                    if (nextName.equals("type")) {
                        c = 1;
                        break;
                    }
                    break;
                case 55126294:
                    if (nextName.equals("timestamp")) {
                        c = 0;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                a2.e(jsonReader.nextLong());
            } else if (c == 1) {
                a2.f(jsonReader.nextString());
            } else if (c == 2) {
                a2.b(o(jsonReader));
            } else if (c == 3) {
                a2.c(q(jsonReader));
            } else if (c != 4) {
                jsonReader.skipValue();
            } else {
                a2.d(u(jsonReader));
            }
        }
        jsonReader.endObject();
        return a2.a();
    }

    private static v.d.C0096d.a o(JsonReader jsonReader) {
        v.d.C0096d.a.C0097a a2 = v.d.C0096d.a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1332194002:
                    if (nextName.equals("background")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1090974952:
                    if (nextName.equals("execution")) {
                        c = 2;
                        break;
                    }
                    break;
                case 555169704:
                    if (nextName.equals("customAttributes")) {
                        c = 3;
                        break;
                    }
                    break;
                case 928737948:
                    if (nextName.equals("uiOrientation")) {
                        c = 1;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                a2.b(Boolean.valueOf(jsonReader.nextBoolean()));
            } else if (c == 1) {
                a2.e(jsonReader.nextInt());
            } else if (c == 2) {
                a2.d(r(jsonReader));
            } else if (c != 3) {
                jsonReader.skipValue();
            } else {
                a2.c(k(jsonReader, c.b()));
            }
        }
        jsonReader.endObject();
        return a2.a();
    }

    /* access modifiers changed from: private */
    public static v.d.C0096d.a.b.C0098a p(JsonReader jsonReader) {
        v.d.C0096d.a.b.C0098a.C0099a a2 = v.d.C0096d.a.b.C0098a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            switch (nextName.hashCode()) {
                case 3373707:
                    if (nextName.equals("name")) {
                        c = 0;
                        break;
                    }
                    break;
                case 3530753:
                    if (nextName.equals("size")) {
                        c = 2;
                        break;
                    }
                    break;
                case 3601339:
                    if (nextName.equals("uuid")) {
                        c = 3;
                        break;
                    }
                    break;
                case 1153765347:
                    if (nextName.equals("baseAddress")) {
                        c = 1;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                a2.c(jsonReader.nextString());
            } else if (c == 1) {
                a2.b(jsonReader.nextLong());
            } else if (c == 2) {
                a2.d(jsonReader.nextLong());
            } else if (c != 3) {
                jsonReader.skipValue();
            } else {
                a2.f(Base64.decode(jsonReader.nextString(), 2));
            }
        }
        jsonReader.endObject();
        return a2.a();
    }

    private static v.d.C0096d.c q(JsonReader jsonReader) {
        v.d.C0096d.c.a a2 = v.d.C0096d.c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1708606089:
                    if (nextName.equals("batteryLevel")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1455558134:
                    if (nextName.equals("batteryVelocity")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1439500848:
                    if (nextName.equals("orientation")) {
                        c = 4;
                        break;
                    }
                    break;
                case 279795450:
                    if (nextName.equals("diskUsed")) {
                        c = 2;
                        break;
                    }
                    break;
                case 976541947:
                    if (nextName.equals("ramUsed")) {
                        c = 5;
                        break;
                    }
                    break;
                case 1516795582:
                    if (nextName.equals("proximityOn")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                a2.b(Double.valueOf(jsonReader.nextDouble()));
            } else if (c == 1) {
                a2.c(jsonReader.nextInt());
            } else if (c == 2) {
                a2.d(jsonReader.nextLong());
            } else if (c == 3) {
                a2.f(jsonReader.nextBoolean());
            } else if (c == 4) {
                a2.e(jsonReader.nextInt());
            } else if (c != 5) {
                jsonReader.skipValue();
            } else {
                a2.g(jsonReader.nextLong());
            }
        }
        jsonReader.endObject();
        return a2.a();
    }

    private static v.d.C0096d.a.b r(JsonReader jsonReader) {
        v.d.C0096d.a.b.C0100b a2 = v.d.C0096d.a.b.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1337936983:
                    if (nextName.equals("threads")) {
                        c = 0;
                        break;
                    }
                    break;
                case -902467928:
                    if (nextName.equals("signal")) {
                        c = 2;
                        break;
                    }
                    break;
                case 937615455:
                    if (nextName.equals("binaries")) {
                        c = 3;
                        break;
                    }
                    break;
                case 1481625679:
                    if (nextName.equals("exception")) {
                        c = 1;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                a2.e(k(jsonReader, d.b()));
            } else if (c == 1) {
                a2.c(s(jsonReader));
            } else if (c == 2) {
                a2.d(v(jsonReader));
            } else if (c != 3) {
                jsonReader.skipValue();
            } else {
                a2.b(k(jsonReader, e.b()));
            }
        }
        jsonReader.endObject();
        return a2.a();
    }

    private static v.d.C0096d.a.b.c s(JsonReader jsonReader) {
        v.d.C0096d.a.b.c.C0101a a2 = v.d.C0096d.a.b.c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1266514778:
                    if (nextName.equals("frames")) {
                        c = 1;
                        break;
                    }
                    break;
                case -934964668:
                    if (nextName.equals("reason")) {
                        c = 4;
                        break;
                    }
                    break;
                case 3575610:
                    if (nextName.equals("type")) {
                        c = 3;
                        break;
                    }
                    break;
                case 91997906:
                    if (nextName.equals("causedBy")) {
                        c = 0;
                        break;
                    }
                    break;
                case 581754413:
                    if (nextName.equals("overflowCount")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                a2.b(s(jsonReader));
            } else if (c == 1) {
                a2.c(k(jsonReader, f.b()));
            } else if (c == 2) {
                a2.d(jsonReader.nextInt());
            } else if (c == 3) {
                a2.f(jsonReader.nextString());
            } else if (c != 4) {
                jsonReader.skipValue();
            } else {
                a2.e(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return a2.a();
    }

    /* access modifiers changed from: private */
    public static v.d.C0096d.a.b.e.C0105b t(JsonReader jsonReader) {
        v.d.C0096d.a.b.e.C0105b.C0106a a2 = v.d.C0096d.a.b.e.C0105b.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1019779949:
                    if (nextName.equals("offset")) {
                        c = 2;
                        break;
                    }
                    break;
                case -887523944:
                    if (nextName.equals("symbol")) {
                        c = 4;
                        break;
                    }
                    break;
                case 3571:
                    if (nextName.equals("pc")) {
                        c = 3;
                        break;
                    }
                    break;
                case 3143036:
                    if (nextName.equals("file")) {
                        c = 1;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c = 0;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                a2.c(jsonReader.nextInt());
            } else if (c == 1) {
                a2.b(jsonReader.nextString());
            } else if (c == 2) {
                a2.d(jsonReader.nextLong());
            } else if (c == 3) {
                a2.e(jsonReader.nextLong());
            } else if (c != 4) {
                jsonReader.skipValue();
            } else {
                a2.f(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return a2.a();
    }

    private static v.d.C0096d.C0107d u(JsonReader jsonReader) {
        v.d.C0096d.C0107d.a a2 = v.d.C0096d.C0107d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            if (nextName.hashCode() == 951530617 && nextName.equals("content")) {
                c = 0;
            }
            if (c != 0) {
                jsonReader.skipValue();
            } else {
                a2.b(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return a2.a();
    }

    private static v.d.C0096d.a.b.C0102d v(JsonReader jsonReader) {
        v.d.C0096d.a.b.C0102d.C0103a a2 = v.d.C0096d.a.b.C0102d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            int hashCode = nextName.hashCode();
            if (hashCode != -1147692044) {
                if (hashCode != 3059181) {
                    if (hashCode == 3373707 && nextName.equals("name")) {
                        c = 0;
                    }
                } else if (nextName.equals("code")) {
                    c = 1;
                }
            } else if (nextName.equals("address")) {
                c = 2;
            }
            if (c == 0) {
                a2.d(jsonReader.nextString());
            } else if (c == 1) {
                a2.c(jsonReader.nextString());
            } else if (c != 2) {
                jsonReader.skipValue();
            } else {
                a2.b(jsonReader.nextLong());
            }
        }
        jsonReader.endObject();
        return a2.a();
    }

    /* access modifiers changed from: private */
    public static v.d.C0096d.a.b.e w(JsonReader jsonReader) {
        v.d.C0096d.a.b.e.C0104a a2 = v.d.C0096d.a.b.e.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            int hashCode = nextName.hashCode();
            if (hashCode != -1266514778) {
                if (hashCode != 3373707) {
                    if (hashCode == 2125650548 && nextName.equals("importance")) {
                        c = 0;
                    }
                } else if (nextName.equals("name")) {
                    c = 1;
                }
            } else if (nextName.equals("frames")) {
                c = 2;
            }
            if (c == 0) {
                a2.c(jsonReader.nextInt());
            } else if (c == 1) {
                a2.d(jsonReader.nextString());
            } else if (c != 2) {
                jsonReader.skipValue();
            } else {
                a2.b(k(jsonReader, g.b()));
            }
        }
        jsonReader.endObject();
        return a2.a();
    }

    /* access modifiers changed from: private */
    public static v.c.b x(JsonReader jsonReader) {
        v.c.b.a a2 = v.c.b.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            int hashCode = nextName.hashCode();
            if (hashCode != -734768633) {
                if (hashCode == -567321830 && nextName.equals("contents")) {
                    c = 1;
                }
            } else if (nextName.equals("filename")) {
                c = 0;
            }
            if (c == 0) {
                a2.c(jsonReader.nextString());
            } else if (c != 1) {
                jsonReader.skipValue();
            } else {
                a2.b(Base64.decode(jsonReader.nextString(), 2));
            }
        }
        jsonReader.endObject();
        return a2.a();
    }

    private static v.c y(JsonReader jsonReader) {
        v.c.a a2 = v.c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            int hashCode = nextName.hashCode();
            if (hashCode != 97434231) {
                if (hashCode == 106008351 && nextName.equals("orgId")) {
                    c = 1;
                }
            } else if (nextName.equals("files")) {
                c = 0;
            }
            if (c == 0) {
                a2.b(k(jsonReader, b.b()));
            } else if (c != 1) {
                jsonReader.skipValue();
            } else {
                a2.c(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return a2.a();
    }

    private static v.d.e z(JsonReader jsonReader) {
        v.d.e.a a2 = v.d.e.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -911706486:
                    if (nextName.equals("buildVersion")) {
                        c = 2;
                        break;
                    }
                    break;
                case -293026577:
                    if (nextName.equals("jailbroken")) {
                        c = 3;
                        break;
                    }
                    break;
                case 351608024:
                    if (nextName.equals("version")) {
                        c = 1;
                        break;
                    }
                    break;
                case 1874684019:
                    if (nextName.equals("platform")) {
                        c = 0;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                a2.d(jsonReader.nextInt());
            } else if (c == 1) {
                a2.e(jsonReader.nextString());
            } else if (c == 2) {
                a2.b(jsonReader.nextString());
            } else if (c != 3) {
                jsonReader.skipValue();
            } else {
                a2.c(jsonReader.nextBoolean());
            }
        }
        jsonReader.endObject();
        return a2.a();
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0016 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.firebase.crashlytics.d.j.v D(java.lang.String r3) {
        /*
            r2 = this;
            android.util.JsonReader r0 = new android.util.JsonReader     // Catch:{ IllegalStateException -> 0x0017 }
            java.io.StringReader r1 = new java.io.StringReader     // Catch:{ IllegalStateException -> 0x0017 }
            r1.<init>(r3)     // Catch:{ IllegalStateException -> 0x0017 }
            r0.<init>(r1)     // Catch:{ IllegalStateException -> 0x0017 }
            com.google.firebase.crashlytics.d.j.v r3 = A(r0)     // Catch:{ all -> 0x0012 }
            r0.close()     // Catch:{ IllegalStateException -> 0x0017 }
            return r3
        L_0x0012:
            r3 = move-exception
            r0.close()     // Catch:{ all -> 0x0016 }
        L_0x0016:
            throw r3     // Catch:{ IllegalStateException -> 0x0017 }
        L_0x0017:
            r3 = move-exception
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.d.j.x.h.D(java.lang.String):com.google.firebase.crashlytics.d.j.v");
    }

    public String E(v vVar) {
        return a.a(vVar);
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0016 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.firebase.crashlytics.d.j.v.d.C0096d h(java.lang.String r3) {
        /*
            r2 = this;
            android.util.JsonReader r0 = new android.util.JsonReader     // Catch:{ IllegalStateException -> 0x0017 }
            java.io.StringReader r1 = new java.io.StringReader     // Catch:{ IllegalStateException -> 0x0017 }
            r1.<init>(r3)     // Catch:{ IllegalStateException -> 0x0017 }
            r0.<init>(r1)     // Catch:{ IllegalStateException -> 0x0017 }
            com.google.firebase.crashlytics.d.j.v$d$d r3 = n(r0)     // Catch:{ all -> 0x0012 }
            r0.close()     // Catch:{ IllegalStateException -> 0x0017 }
            return r3
        L_0x0012:
            r3 = move-exception
            r0.close()     // Catch:{ all -> 0x0016 }
        L_0x0016:
            throw r3     // Catch:{ IllegalStateException -> 0x0017 }
        L_0x0017:
            r3 = move-exception
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.d.j.x.h.h(java.lang.String):com.google.firebase.crashlytics.d.j.v$d$d");
    }

    public String i(v.d.C0096d dVar) {
        return a.a(dVar);
    }
}
