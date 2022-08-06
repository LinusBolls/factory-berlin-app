package k.h0.h;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import kotlin.jvm.internal.k;
import l.b0;
import l.p;
import l.z;

/* compiled from: FileSystem.kt */
public final class a$a implements b {
    a$a() {
    }

    public void a(File file) {
        k.f(file, "file");
        if (!file.delete() && file.exists()) {
            throw new IOException("failed to delete " + file);
        }
    }

    public b0 b(File file) {
        k.f(file, "file");
        return p.k(file);
    }

    public z c(File file) {
        k.f(file, "file");
        try {
            return q.f(file, false, 1, (Object) null);
        } catch (FileNotFoundException unused) {
            file.getParentFile().mkdirs();
            return q.f(file, false, 1, (Object) null);
        }
    }

    public void d(File file) {
        k.f(file, "directory");
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            int length = listFiles.length;
            int i2 = 0;
            while (i2 < length) {
                File file2 = listFiles[i2];
                k.b(file2, "file");
                if (file2.isDirectory()) {
                    d(file2);
                }
                if (file2.delete()) {
                    i2++;
                } else {
                    throw new IOException("failed to delete " + file2);
                }
            }
            return;
        }
        throw new IOException("not a readable directory: " + file);
    }

    public z e(File file) {
        k.f(file, "file");
        try {
            return p.a(file);
        } catch (FileNotFoundException unused) {
            file.getParentFile().mkdirs();
            return p.a(file);
        }
    }

    public boolean f(File file) {
        k.f(file, "file");
        return file.exists();
    }

    public void g(File file, File file2) {
        k.f(file, "from");
        k.f(file2, "to");
        a(file2);
        if (!file.renameTo(file2)) {
            throw new IOException("failed to rename " + file + " to " + file2);
        }
    }

    public long h(File file) {
        k.f(file, "file");
        return file.length();
    }

    public String toString() {
        return "FileSystem.SYSTEM";
    }
}
