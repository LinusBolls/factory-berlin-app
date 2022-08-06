package com.firebase.jobdispatcher;

import android.text.TextUtils;
import java.util.List;

public class ValidationEnforcer implements u {
    private final u a;

    public static final class ValidationException extends RuntimeException {
        public ValidationException(String str, List<String> list) {
            super(str + ": " + TextUtils.join("\n  - ", list));
        }
    }

    public ValidationEnforcer(u uVar) {
        this.a = uVar;
    }

    private static void b(List<String> list) {
        if (list != null) {
            throw new ValidationException("JobParameters is invalid", list);
        }
    }

    public List<String> a(r rVar) {
        return this.a.a(rVar);
    }

    public final void c(r rVar) {
        b(a(rVar));
    }
}
