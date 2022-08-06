package androidx.room;

import e.s.a.c;
import java.io.File;

/* compiled from: SQLiteCopyOpenHelperFactory */
class r implements c.C0584c {
    private final String a;
    private final File b;
    private final c.C0584c c;

    r(String str, File file, c.C0584c cVar) {
        this.a = str;
        this.b = file;
        this.c = cVar;
    }

    public c a(c.b bVar) {
        return new q(bVar.a, this.a, this.b, bVar.c.a, this.c.a(bVar));
    }
}
