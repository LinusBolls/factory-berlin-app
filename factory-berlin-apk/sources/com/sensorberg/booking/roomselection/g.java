package com.sensorberg.booking.roomselection;

import kotlin.jvm.internal.k;

/* compiled from: RoomSelectionItem.kt */
public abstract class g {

    /* compiled from: RoomSelectionItem.kt */
    public static final class a extends g {
        private final String a;
        private final String b;
        private final String c;

        /* renamed from: d  reason: collision with root package name */
        private final int f5036d;

        /* renamed from: e  reason: collision with root package name */
        private final int f5037e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, String str3, int i2, int i3) {
            super((DefaultConstructorMarker) null);
            k.e(str, "unitId");
            k.e(str2, "name");
            k.e(str3, "schedule");
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.f5036d = i2;
            this.f5037e = i3;
        }

        public final int a() {
            return this.f5037e;
        }

        public final int b() {
            return this.f5036d;
        }

        public final String c() {
            return this.b;
        }

        public final String d() {
            return this.c;
        }

        public String e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return k.a(e(), aVar.e()) && k.a(this.b, aVar.b) && k.a(this.c, aVar.c) && this.f5036d == aVar.f5036d && this.f5037e == aVar.f5037e;
        }

        public int hashCode() {
            String e2 = e();
            int i2 = 0;
            int hashCode = (e2 != null ? e2.hashCode() : 0) * 31;
            String str = this.b;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.c;
            if (str2 != null) {
                i2 = str2.hashCode();
            }
            return ((((hashCode2 + i2) * 31) + this.f5036d) * 31) + this.f5037e;
        }

        public String toString() {
            return "Unit(unitId=" + e() + ", name=" + this.b + ", schedule=" + this.c + ", icon=" + this.f5036d + ", badge=" + this.f5037e + ")";
        }
    }

    private g() {
    }

    public /* synthetic */ g(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
