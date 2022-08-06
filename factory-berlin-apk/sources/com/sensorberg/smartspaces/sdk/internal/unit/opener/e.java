package com.sensorberg.smartspaces.sdk.internal.unit.opener;

import kotlin.jvm.internal.k;

/* compiled from: Channel.kt */
public abstract class e {

    /* compiled from: Channel.kt */
    public static final class a extends e {
        private final long a;
        private final f b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(long j2, f fVar) {
            super((DefaultConstructorMarker) null);
            k.e(fVar, "channelStats");
            this.a = j2;
            this.b = fVar;
        }

        public final f a() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && k.a(this.b, aVar.b);
        }

        public int hashCode() {
            long j2 = this.a;
            int i2 = ((int) (j2 ^ (j2 >>> 32))) * 31;
            f fVar = this.b;
            return i2 + (fVar != null ? fVar.hashCode() : 0);
        }

        public String toString() {
            return "Approved(timestamp=" + this.a + ", channelStats=" + this.b + ")";
        }
    }

    /* compiled from: Channel.kt */
    public static abstract class b extends e {

        /* compiled from: Channel.kt */
        public static final class a extends b {
            private final long a;
            private final f b;
            private final Exception c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(long j2, f fVar, Exception exc) {
                super((DefaultConstructorMarker) null);
                k.e(fVar, "channelStats");
                k.e(exc, "exception");
                this.a = j2;
                this.b = fVar;
                this.c = exc;
            }

            public final f a() {
                return this.b;
            }

            public final Exception b() {
                return this.c;
            }

            public final long c() {
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
                return this.a == aVar.a && k.a(this.b, aVar.b) && k.a(this.c, aVar.c);
            }

            public int hashCode() {
                long j2 = this.a;
                int i2 = ((int) (j2 ^ (j2 >>> 32))) * 31;
                f fVar = this.b;
                int i3 = 0;
                int hashCode = (i2 + (fVar != null ? fVar.hashCode() : 0)) * 31;
                Exception exc = this.c;
                if (exc != null) {
                    i3 = exc.hashCode();
                }
                return hashCode + i3;
            }

            public String toString() {
                return "CommunicationFail(timestamp=" + this.a + ", channelStats=" + this.b + ", exception=" + this.c + ")";
            }
        }

        /* renamed from: com.sensorberg.smartspaces.sdk.internal.unit.opener.e$b$b  reason: collision with other inner class name */
        /* compiled from: Channel.kt */
        public static final class C0408b extends b {
            private final long a;
            private final f b;
            private final DeniedException c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0408b(long j2, f fVar, DeniedException deniedException) {
                super((DefaultConstructorMarker) null);
                k.e(fVar, "channelStats");
                k.e(deniedException, "exception");
                this.a = j2;
                this.b = fVar;
                this.c = deniedException;
            }

            public final f a() {
                return this.b;
            }

            public final DeniedException b() {
                return this.c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0408b)) {
                    return false;
                }
                C0408b bVar = (C0408b) obj;
                return this.a == bVar.a && k.a(this.b, bVar.b) && k.a(this.c, bVar.c);
            }

            public int hashCode() {
                long j2 = this.a;
                int i2 = ((int) (j2 ^ (j2 >>> 32))) * 31;
                f fVar = this.b;
                int i3 = 0;
                int hashCode = (i2 + (fVar != null ? fVar.hashCode() : 0)) * 31;
                DeniedException deniedException = this.c;
                if (deniedException != null) {
                    i3 = deniedException.hashCode();
                }
                return hashCode + i3;
            }

            public String toString() {
                return "Denied(timestamp=" + this.a + ", channelStats=" + this.b + ", exception=" + this.c + ")";
            }
        }

        /* compiled from: Channel.kt */
        public static final class c extends b {
            private final long a;
            private final f b;
            private final Exception c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public c(long j2, f fVar, Exception exc) {
                super((DefaultConstructorMarker) null);
                k.e(fVar, "channelStats");
                k.e(exc, "exception");
                this.a = j2;
                this.b = fVar;
                this.c = exc;
            }

            public final f a() {
                return this.b;
            }

            public final Exception b() {
                return this.c;
            }

            public final long c() {
                return this.a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return this.a == cVar.a && k.a(this.b, cVar.b) && k.a(this.c, cVar.c);
            }

            public int hashCode() {
                long j2 = this.a;
                int i2 = ((int) (j2 ^ (j2 >>> 32))) * 31;
                f fVar = this.b;
                int i3 = 0;
                int hashCode = (i2 + (fVar != null ? fVar.hashCode() : 0)) * 31;
                Exception exc = this.c;
                if (exc != null) {
                    i3 = exc.hashCode();
                }
                return hashCode + i3;
            }

            public String toString() {
                return "UserCancelled(timestamp=" + this.a + ", channelStats=" + this.b + ", exception=" + this.c + ")";
            }
        }

        private b() {
            super((DefaultConstructorMarker) null);
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private e() {
    }

    public /* synthetic */ e(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
