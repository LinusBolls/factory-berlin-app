package com.google.android.datatransport.cct.b;

import com.google.android.datatransport.cct.b.e;
import com.google.auto.value.AutoValue;

@AutoValue
public abstract class k {

    @AutoValue.Builder
    public static abstract class a {
        public abstract a a(a aVar);

        public abstract a b(b bVar);

        public abstract k c();
    }

    public enum b {
        UNKNOWN(0),
        ANDROID_FIREBASE(23);

        static {
            UNKNOWN = new b("UNKNOWN", 0, 0);
            ANDROID_FIREBASE = new b("ANDROID_FIREBASE", 1, 23);
        }

        private b(int i2) {
        }
    }

    public static a a() {
        return new e.b();
    }

    public abstract a b();

    public abstract b c();
}
