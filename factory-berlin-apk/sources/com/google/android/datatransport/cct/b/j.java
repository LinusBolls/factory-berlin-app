package com.google.android.datatransport.cct.b;

import com.google.auto.value.AutoValue;
import java.util.List;

@AutoValue
public abstract class j {
    public static j a(List<m> list) {
        return new d(list);
    }

    public abstract List<m> b();
}
