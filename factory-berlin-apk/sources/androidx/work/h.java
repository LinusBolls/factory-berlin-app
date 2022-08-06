package androidx.work;

import java.util.List;

/* compiled from: InputMerger */
public abstract class h {
    private static final String a = i.f("InputMerger");

    public static h a(String str) {
        try {
            return (h) Class.forName(str).newInstance();
        } catch (Exception e2) {
            i c = i.c();
            String str2 = a;
            c.b(str2, "Trouble instantiating + " + str, e2);
            return null;
        }
    }

    public abstract e b(List<e> list);
}
