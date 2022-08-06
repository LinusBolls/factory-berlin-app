package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
public class zzig extends IOException {
    public zzig(String str) {
        super(str);
    }

    static zzig a() {
        return new zzig("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static zzig b() {
        return new zzig("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static zzig c() {
        return new zzig("Protocol message contained an invalid tag (zero).");
    }

    static zzif d() {
        return new zzif("Protocol message tag had invalid wire type.");
    }

    static zzig e() {
        return new zzig("Failed to parse the message.");
    }

    static zzig f() {
        return new zzig("Protocol message had invalid UTF-8.");
    }
}
