package com.sensorberg.smartworkspace.app.screens.spaces.overview;

import android.os.Bundle;
import androidx.navigation.p;
import com.sensorberg.factory.R;
import kotlin.jvm.internal.k;

/* compiled from: SpacesOverviewFragmentDirections.kt */
public final class f {
    public static final a a = new a((DefaultConstructorMarker) null);

    /* compiled from: SpacesOverviewFragmentDirections.kt */
    public static final class a {
        private a() {
        }

        public final p a(String str, String str2) {
            k.e(str, "id");
            return new b(str, str2);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: SpacesOverviewFragmentDirections.kt */
    private static final class b implements p {
        private final String a;
        private final String b;

        public b(String str, String str2) {
            k.e(str, "id");
            this.a = str;
            this.b = str2;
        }

        public Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putString("id", this.a);
            bundle.putString("name", this.b);
            return bundle;
        }

        public int b() {
            return R.id.toSpaceDetailFragment;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return k.a(this.a, bVar.a) && k.a(this.b, bVar.b);
        }

        public int hashCode() {
            String str = this.a;
            int i2 = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.b;
            if (str2 != null) {
                i2 = str2.hashCode();
            }
            return hashCode + i2;
        }

        public String toString() {
            return "ToSpaceDetailFragment(id=" + this.a + ", name=" + this.b + ")";
        }
    }
}
