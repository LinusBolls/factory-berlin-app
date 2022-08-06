package de.baimos;

import java.util.Hashtable;

public final class cr {
    private final String a;
    private final String b;
    private final String c;

    /* renamed from: d  reason: collision with root package name */
    private final int f8316d;

    /* renamed from: e  reason: collision with root package name */
    private final String f8317e;

    /* renamed from: f  reason: collision with root package name */
    private final Hashtable f8318f = new Hashtable();

    public cr(String str) {
        int i2;
        int i3;
        this.c = str;
        int indexOf = str.indexOf("://");
        if (indexOf <= 0) {
            indexOf = str.indexOf(":");
            if (indexOf > 0) {
                i2 = 1;
            } else {
                throw new RuntimeException("url is not valid (" + str + ")");
            }
        } else {
            i2 = 3;
        }
        this.a = str.substring(0, indexOf);
        int i4 = indexOf + i2;
        String substring = a(str, "://") > 1 ? str.substring(0, str.indexOf("://", i4)) : str;
        int a2 = cs.a(substring, ":", i4);
        if (a2 < 0) {
            int a3 = a(this.a);
            int indexOf2 = substring.indexOf("/", i4);
            if (indexOf2 >= 0 || (indexOf2 = substring.indexOf("?", i4)) >= 0) {
                i3 = a3;
                a2 = indexOf2;
            } else {
                int i5 = a3;
                a2 = substring.length();
                i3 = i5;
            }
        } else {
            i3 = -1;
        }
        this.b = str.substring(i4, a2);
        if (i3 == -1) {
            int i6 = a2 + 1;
            int indexOf3 = str.indexOf("/", a2);
            indexOf3 = indexOf3 < 0 ? str.indexOf(";", a2) : indexOf3;
            indexOf3 = indexOf3 < 0 ? str.indexOf("?", a2) : indexOf3;
            i3 = Integer.parseInt(str.substring(i6, indexOf3 < 0 ? str.length() : indexOf3));
        }
        int indexOf4 = str.indexOf("/", a2);
        int indexOf5 = str.indexOf("?");
        this.f8317e = indexOf4 != -1 ? str.substring(indexOf4 + 1, indexOf5 == -1 ? str.length() : indexOf5) : "";
        int indexOf6 = str.indexOf("?");
        if (indexOf6 != -1) {
            String[] a4 = cs.a(str.substring(indexOf6 + 1), "&");
            for (String a5 : a4) {
                String[] a6 = cs.a(a5, "=");
                if (a6.length == 2) {
                    this.f8318f.put(a6[0], a6[1]);
                }
            }
        }
        this.f8316d = i3;
    }

    private int a(String str) {
        if ("http".equals(str)) {
            return 80;
        }
        return "https".equals(str) ? 443 : 0;
    }

    private int a(String str, String str2) {
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i2 = str.indexOf(str2, i2 + 1);
            if (i2 <= -1) {
                return i3;
            }
            i3++;
        }
    }

    public String c() {
        return this.b;
    }

    public int d() {
        return this.f8316d;
    }

    public String toString() {
        return this.c;
    }
}
