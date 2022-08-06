package com.sensorberg.booking.mybookings;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.p;
import g.e.b.e;
import java.io.Serializable;
import kotlin.jvm.internal.k;
import org.threeten.bp.LocalDate;

/* compiled from: MyBookingsFragmentDirections.kt */
public final class h {
    public static final a a = new a((DefaultConstructorMarker) null);

    /* compiled from: MyBookingsFragmentDirections.kt */
    public static final class a {
        private a() {
        }

        public final p a(LocalDate localDate, String str, String str2) {
            k.e(localDate, "startDate");
            k.e(str, "unitId");
            k.e(str2, "unitName");
            return new b(localDate, str, str2);
        }

        public final p b() {
            return new androidx.navigation.a(e.to_roomSelectionFragment);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: MyBookingsFragmentDirections.kt */
    private static final class b implements p {
        private final LocalDate a;
        private final String b;
        private final String c;

        public b(LocalDate localDate, String str, String str2) {
            k.e(localDate, "startDate");
            k.e(str, "unitId");
            k.e(str2, "unitName");
            this.a = localDate;
            this.b = str;
            this.c = str2;
        }

        public Bundle a() {
            Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(LocalDate.class)) {
                LocalDate localDate = this.a;
                if (localDate != null) {
                    bundle.putParcelable("startDate", (Parcelable) localDate);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.os.Parcelable");
                }
            } else if (Serializable.class.isAssignableFrom(LocalDate.class)) {
                LocalDate localDate2 = this.a;
                if (localDate2 != null) {
                    bundle.putSerializable("startDate", localDate2);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type java.io.Serializable");
                }
            } else {
                throw new UnsupportedOperationException(LocalDate.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
            }
            bundle.putString("unitId", this.b);
            bundle.putString("unitName", this.c);
            return bundle;
        }

        public int b() {
            return e.to_roomScheduleFragment;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return k.a(this.a, bVar.a) && k.a(this.b, bVar.b) && k.a(this.c, bVar.c);
        }

        public int hashCode() {
            LocalDate localDate = this.a;
            int i2 = 0;
            int hashCode = (localDate != null ? localDate.hashCode() : 0) * 31;
            String str = this.b;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.c;
            if (str2 != null) {
                i2 = str2.hashCode();
            }
            return hashCode2 + i2;
        }

        public String toString() {
            return "ToRoomScheduleFragment(startDate=" + this.a + ", unitId=" + this.b + ", unitName=" + this.c + ")";
        }
    }
}
