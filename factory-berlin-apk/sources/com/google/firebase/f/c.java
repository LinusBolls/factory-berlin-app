package com.google.firebase.f;

/* compiled from: HeartBeatInfo */
public interface c {

    /* compiled from: HeartBeatInfo */
    public enum a {
        NONE(0),
        SDK(1),
        GLOBAL(2),
        COMBINED(3);
        

        /* renamed from: g  reason: collision with root package name */
        private final int f4168g;

        private a(int i2) {
            this.f4168g = i2;
        }

        public int a() {
            return this.f4168g;
        }
    }

    a a(String str);
}
