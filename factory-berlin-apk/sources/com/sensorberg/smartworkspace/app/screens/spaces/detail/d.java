package com.sensorberg.smartworkspace.app.screens.spaces.detail;

import com.sensorberg.smartspaces.sdk.model.Property;
import kotlin.jvm.internal.k;

/* compiled from: QuickActionFactory.kt */
public abstract class d {

    /* compiled from: QuickActionFactory.kt */
    public static final class a extends d {
        private final String a;
        private final Property.Binary b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(String str, Property.Binary binary) {
            super((DefaultConstructorMarker) null);
            k.e(str, "label");
            k.e(binary, "binaryProperty");
            this.a = str;
            this.b = binary;
        }

        public final Property.Binary a() {
            return this.b;
        }

        public final String b() {
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
            return k.a(this.a, aVar.a) && k.a(this.b, aVar.b);
        }

        public int hashCode() {
            String str = this.a;
            int i2 = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            Property.Binary binary = this.b;
            if (binary != null) {
                i2 = binary.hashCode();
            }
            return hashCode + i2;
        }

        public String toString() {
            return "Button(label=" + this.a + ", binaryProperty=" + this.b + ")";
        }
    }

    /* compiled from: QuickActionFactory.kt */
    public static final class b extends d {
        private final Property.Binary a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(Property.Binary binary) {
            super((DefaultConstructorMarker) null);
            k.e(binary, "binaryProperty");
            this.a = binary;
        }

        public final Property.Binary a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof b) && k.a(this.a, ((b) obj).a);
            }
            return true;
        }

        public int hashCode() {
            Property.Binary binary = this.a;
            if (binary != null) {
                return binary.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "Switch(binaryProperty=" + this.a + ")";
        }
    }

    private d() {
    }

    public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
