package com.github.jasminb.jsonapi;

import java.util.HashSet;
import java.util.Set;

/* compiled from: SerializationFeature */
public enum m {
    INCLUDE_RELATIONSHIP_ATTRIBUTES(false),
    INCLUDE_META(true),
    INCLUDE_LINKS(true);
    

    /* renamed from: g  reason: collision with root package name */
    final boolean f1916g;

    private m(boolean z) {
        this.f1916g = z;
    }

    public static Set<m> a() {
        HashSet hashSet = new HashSet();
        for (m mVar : values()) {
            if (mVar.f1916g) {
                hashSet.add(mVar);
            }
        }
        return hashSet;
    }
}
