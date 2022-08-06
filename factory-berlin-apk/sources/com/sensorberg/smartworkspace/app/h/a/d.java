package com.sensorberg.smartworkspace.app.h.a;

import kotlin.jvm.internal.k;

/* compiled from: LoginType.kt */
public abstract class d {

    /* compiled from: LoginType.kt */
    public static final class a extends d {
        public static final a a = new a();

        private a() {
            super((DefaultConstructorMarker) null);
        }
    }

    /* compiled from: LoginType.kt */
    public static final class b extends d {
        private final String a;

        public final String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof b) && k.a(this.a, ((b) obj).a);
            }
            return true;
        }

        public int hashCode() {
            String str = this.a;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "Unknown(value=" + this.a + ")";
        }
    }

    private d() {
    }

    public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
