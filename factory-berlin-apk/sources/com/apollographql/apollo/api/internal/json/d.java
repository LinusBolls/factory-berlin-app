package com.apollographql.apollo.api.internal.json;

import kotlin.jvm.internal.k;

/* compiled from: JsonScope.kt */
public final class d {
    public static final d a = new d();

    private d() {
    }

    public final String a(int i2, int[] iArr, String[] strArr, int[] iArr2) {
        k.f(iArr, "stack");
        k.f(strArr, "pathNames");
        k.f(iArr2, "pathIndices");
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = iArr[i3];
            if (i4 == 1 || i4 == 2) {
                sb.append('[');
                sb.append(iArr2[i3]);
                sb.append(']');
            } else if (i4 == 3 || i4 == 4 || i4 == 5) {
                sb.append('.');
                if (strArr[i3] != null) {
                    sb.append(strArr[i3]);
                }
            }
        }
        String sb2 = sb.toString();
        k.b(sb2, "result.toString()");
        return sb2;
    }
}
