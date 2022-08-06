package androidx.navigation;

import android.os.Bundle;
import androidx.navigation.o;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: Navigator */
public abstract class x<D extends o> {

    /* compiled from: Navigator */
    public interface a {
    }

    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    /* compiled from: Navigator */
    public @interface b {
        String value();
    }

    public abstract D a();

    public abstract o b(D d2, Bundle bundle, u uVar, a aVar);

    public void c(Bundle bundle) {
    }

    public Bundle d() {
        return null;
    }

    public abstract boolean e();
}
