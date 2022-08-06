package com.google.firebase.crashlytics.d.k;

import com.google.firebase.crashlytics.d.b;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: ProcMapEntryParser */
final class d {
    private static final Pattern a = Pattern.compile("\\s*(\\p{XDigit}+)-\\s*(\\p{XDigit}+)\\s+(.{4})\\s+\\p{XDigit}+\\s+.+\\s+\\d+\\s+(.*)");

    static c a(String str) {
        Matcher matcher = a.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        try {
            long longValue = Long.valueOf(matcher.group(1), 16).longValue();
            return new c(longValue, Long.valueOf(matcher.group(2), 16).longValue() - longValue, matcher.group(3), matcher.group(4));
        } catch (Exception unused) {
            b f2 = b.f();
            f2.b("Could not parse map entry: " + str);
            return null;
        }
    }
}
