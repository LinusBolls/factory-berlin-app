package androidx.lifecycle;

import androidx.lifecycle.p;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
/* compiled from: OnLifecycleEvent */
public @interface g0 {
    p.a value();
}
