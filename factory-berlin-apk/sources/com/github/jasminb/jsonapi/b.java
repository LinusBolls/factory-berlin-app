package com.github.jasminb.jsonapi;

import java.util.HashSet;
import java.util.Set;

/* compiled from: DeserializationFeature */
public enum b {
    REQUIRE_RESOURCE_ID(true),
    ALLOW_UNKNOWN_INCLUSIONS(false),
    ALLOW_UNKNOWN_TYPE_IN_RELATIONSHIP(false);
    

    /* renamed from: g  reason: collision with root package name */
    private final boolean f1897g;

    private b(boolean z) {
        this.f1897g = z;
    }

    public static Set<b> a() {
        HashSet hashSet = new HashSet();
        for (b bVar : values()) {
            if (bVar.f1897g) {
                hashSet.add(bVar);
            }
        }
        return hashSet;
    }
}
