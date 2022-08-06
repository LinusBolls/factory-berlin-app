package com.google.android.datatransport.cct.b;

import android.util.SparseArray;
import com.google.android.datatransport.cct.b.i;
import com.google.auto.value.AutoValue;

@AutoValue
public abstract class o {

    @AutoValue.Builder
    public static abstract class a {
        public abstract a a(b bVar);

        public abstract a b(c cVar);

        public abstract o c();
    }

    public enum b {
        UNKNOWN_MOBILE_SUBTYPE(0),
        GPRS(1),
        EDGE(2),
        UMTS(3),
        CDMA(4),
        EVDO_0(5),
        EVDO_A(6),
        RTT(7),
        HSDPA(8),
        HSUPA(9),
        HSPA(10),
        IDEN(11),
        EVDO_B(12),
        LTE(13),
        EHRPD(14),
        HSPAP(15),
        GSM(16),
        TD_SCDMA(17),
        IWLAN(18),
        LTE_CA(19),
        COMBINED(100);
        
        private static final SparseArray<b> C = null;

        /* renamed from: g  reason: collision with root package name */
        private final int f1961g;

        static {
            UNKNOWN_MOBILE_SUBTYPE = new b("UNKNOWN_MOBILE_SUBTYPE", 0, 0);
            GPRS = new b("GPRS", 1, 1);
            EDGE = new b("EDGE", 2, 2);
            UMTS = new b("UMTS", 3, 3);
            CDMA = new b("CDMA", 4, 4);
            EVDO_0 = new b("EVDO_0", 5, 5);
            EVDO_A = new b("EVDO_A", 6, 6);
            RTT = new b("RTT", 7, 7);
            HSDPA = new b("HSDPA", 8, 8);
            HSUPA = new b("HSUPA", 9, 9);
            HSPA = new b("HSPA", 10, 10);
            IDEN = new b("IDEN", 11, 11);
            EVDO_B = new b("EVDO_B", 12, 12);
            LTE = new b("LTE", 13, 13);
            EHRPD = new b("EHRPD", 14, 14);
            HSPAP = new b("HSPAP", 15, 15);
            GSM = new b("GSM", 16, 16);
            TD_SCDMA = new b("TD_SCDMA", 17, 17);
            IWLAN = new b("IWLAN", 18, 18);
            LTE_CA = new b("LTE_CA", 19, 19);
            COMBINED = new b("COMBINED", 20, 100);
            SparseArray<b> sparseArray = new SparseArray<>();
            C = sparseArray;
            sparseArray.put(0, UNKNOWN_MOBILE_SUBTYPE);
            C.put(1, GPRS);
            C.put(2, EDGE);
            C.put(3, UMTS);
            C.put(4, CDMA);
            C.put(5, EVDO_0);
            C.put(6, EVDO_A);
            C.put(7, RTT);
            C.put(8, HSDPA);
            C.put(9, HSUPA);
            C.put(10, HSPA);
            C.put(11, IDEN);
            C.put(12, EVDO_B);
            C.put(13, LTE);
            C.put(14, EHRPD);
            C.put(15, HSPAP);
            C.put(16, GSM);
            C.put(17, TD_SCDMA);
            C.put(18, IWLAN);
            C.put(19, LTE_CA);
        }

        private b(int i2) {
            this.f1961g = i2;
        }

        public static b a(int i2) {
            return C.get(i2);
        }

        public int b() {
            return this.f1961g;
        }
    }

    public enum c {
        MOBILE(0),
        WIFI(1),
        MOBILE_MMS(2),
        MOBILE_SUPL(3),
        MOBILE_DUN(4),
        MOBILE_HIPRI(5),
        WIMAX(6),
        BLUETOOTH(7),
        DUMMY(8),
        ETHERNET(9),
        MOBILE_FOTA(10),
        MOBILE_IMS(11),
        MOBILE_CBS(12),
        WIFI_P2P(13),
        MOBILE_IA(14),
        MOBILE_EMERGENCY(15),
        PROXY(16),
        VPN(17),
        NONE(-1);
        
        private static final SparseArray<c> A = null;

        /* renamed from: g  reason: collision with root package name */
        private final int f1969g;

        static {
            MOBILE = new c("MOBILE", 0, 0);
            WIFI = new c("WIFI", 1, 1);
            MOBILE_MMS = new c("MOBILE_MMS", 2, 2);
            MOBILE_SUPL = new c("MOBILE_SUPL", 3, 3);
            MOBILE_DUN = new c("MOBILE_DUN", 4, 4);
            MOBILE_HIPRI = new c("MOBILE_HIPRI", 5, 5);
            WIMAX = new c("WIMAX", 6, 6);
            BLUETOOTH = new c("BLUETOOTH", 7, 7);
            DUMMY = new c("DUMMY", 8, 8);
            ETHERNET = new c("ETHERNET", 9, 9);
            MOBILE_FOTA = new c("MOBILE_FOTA", 10, 10);
            MOBILE_IMS = new c("MOBILE_IMS", 11, 11);
            MOBILE_CBS = new c("MOBILE_CBS", 12, 12);
            WIFI_P2P = new c("WIFI_P2P", 13, 13);
            MOBILE_IA = new c("MOBILE_IA", 14, 14);
            MOBILE_EMERGENCY = new c("MOBILE_EMERGENCY", 15, 15);
            PROXY = new c("PROXY", 16, 16);
            VPN = new c("VPN", 17, 17);
            NONE = new c("NONE", 18, -1);
            SparseArray<c> sparseArray = new SparseArray<>();
            A = sparseArray;
            sparseArray.put(0, MOBILE);
            A.put(1, WIFI);
            A.put(2, MOBILE_MMS);
            A.put(3, MOBILE_SUPL);
            A.put(4, MOBILE_DUN);
            A.put(5, MOBILE_HIPRI);
            A.put(6, WIMAX);
            A.put(7, BLUETOOTH);
            A.put(8, DUMMY);
            A.put(9, ETHERNET);
            A.put(10, MOBILE_FOTA);
            A.put(11, MOBILE_IMS);
            A.put(12, MOBILE_CBS);
            A.put(13, WIFI_P2P);
            A.put(14, MOBILE_IA);
            A.put(15, MOBILE_EMERGENCY);
            A.put(16, PROXY);
            A.put(17, VPN);
            A.put(-1, NONE);
        }

        private c(int i2) {
            this.f1969g = i2;
        }

        public static c a(int i2) {
            return A.get(i2);
        }

        public int b() {
            return this.f1969g;
        }
    }

    public static a a() {
        return new i.b();
    }

    public abstract b b();

    public abstract c c();
}
