package kotlin.io;

import java.io.File;
import kotlin.jvm.internal.k;

/* compiled from: Utils.kt */
class j extends i {
    public static String b(File file) {
        k.e(file, "$this$nameWithoutExtension");
        String name = file.getName();
        k.d(name, "name");
        return q.E0(name, ".", (String) null, 2, (Object) null);
    }
}
