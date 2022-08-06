package com.fasterxml.jackson.databind.cfg;

import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.util.VersionUtil;

public final class PackageVersion {
    public static final Version VERSION = VersionUtil.parseVersion("2.9.10.1", "com.fasterxml.jackson.core", "jackson-databind");
}
