package com.google.firebase.crashlytics.d.h;

/* compiled from: ResponseParser */
public class d0 {
    public static int a(int i2) {
        if (i2 >= 200 && i2 <= 299) {
            return 0;
        }
        if (i2 >= 300 && i2 <= 399) {
            return 1;
        }
        if (i2 >= 400 && i2 <= 499) {
            return 0;
        }
        if (i2 >= 500) {
        }
        return 1;
    }
}
