package com.microsoft.appcenter.k.d.j;

import java.util.regex.Pattern;

/* compiled from: PartAUtils */
public class j {
    static {
        Pattern.compile("^[a-zA-Z0-9]((\\.(?!(\\.|$)))|[_a-zA-Z0-9]){3,99}$");
    }

    public static String a(String str) {
        return str.split("-")[0];
    }
}
