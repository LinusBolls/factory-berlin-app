package com.sensorberg.booking.roomschedule;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.e;
import java.io.Serializable;
import kotlin.jvm.internal.k;
import org.threeten.bp.LocalDate;

/* compiled from: RoomScheduleFragmentArgs.kt */
public final class d implements e {

    /* renamed from: d  reason: collision with root package name */
    public static final a f4967d = new a((DefaultConstructorMarker) null);
    private final LocalDate a;
    private final String b;
    private final String c;

    /* compiled from: RoomScheduleFragmentArgs.kt */
    public static final class a {
        private a() {
        }

        public final d a(Bundle bundle) {
            k.e(bundle, "bundle");
            bundle.setClassLoader(d.class.getClassLoader());
            if (!bundle.containsKey("startDate")) {
                throw new IllegalArgumentException("Required argument \"startDate\" is missing and does not have an android:defaultValue");
            } else if (Parcelable.class.isAssignableFrom(LocalDate.class) || Serializable.class.isAssignableFrom(LocalDate.class)) {
                LocalDate localDate = (LocalDate) bundle.get("startDate");
                if (localDate == null) {
                    throw new IllegalArgumentException("Argument \"startDate\" is marked as non-null but was passed a null value.");
                } else if (bundle.containsKey("unitId")) {
                    String string = bundle.getString("unitId");
                    if (string == null) {
                        throw new IllegalArgumentException("Argument \"unitId\" is marked as non-null but was passed a null value.");
                    } else if (bundle.containsKey("unitName")) {
                        String string2 = bundle.getString("unitName");
                        if (string2 != null) {
                            return new d(localDate, string, string2);
                        }
                        throw new IllegalArgumentException("Argument \"unitName\" is marked as non-null but was passed a null value.");
                    } else {
                        throw new IllegalArgumentException("Required argument \"unitName\" is missing and does not have an android:defaultValue");
                    }
                } else {
                    throw new IllegalArgumentException("Required argument \"unitId\" is missing and does not have an android:defaultValue");
                }
            } else {
                throw new UnsupportedOperationException(LocalDate.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public d(LocalDate localDate, String str, String str2) {
        k.e(localDate, "startDate");
        k.e(str, "unitId");
        k.e(str2, "unitName");
        this.a = localDate;
        this.b = str;
        this.c = str2;
    }

    public static final d fromBundle(Bundle bundle) {
        return f4967d.a(bundle);
    }

    public final LocalDate a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return k.a(this.a, dVar.a) && k.a(this.b, dVar.b) && k.a(this.c, dVar.c);
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
        return "RoomScheduleFragmentArgs(startDate=" + this.a + ", unitId=" + this.b + ", unitName=" + this.c + ")";
    }
}
