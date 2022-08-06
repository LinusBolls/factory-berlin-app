package g.b.c.a;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: KmsClients */
public final class p {
    private static final CopyOnWriteArrayList<o> a = new CopyOnWriteArrayList<>();

    public static o a(String str) {
        Iterator<o> it = a.iterator();
        while (it.hasNext()) {
            o next = it.next();
            if (next.a(str)) {
                return next;
            }
        }
        throw new GeneralSecurityException("No KMS client does support: " + str);
    }
}
