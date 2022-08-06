package g.a.a.i.b.j;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import l.b0;
import l.p;
import l.z;

/* compiled from: FileSystem */
public interface c {
    public static final c a = new a();

    /* compiled from: FileSystem */
    class a implements c {
        a() {
        }

        public void a(File file) {
            if (!file.delete() && file.exists()) {
                throw new IOException("failed to delete " + file);
            }
        }

        public b0 b(File file) {
            return p.k(file);
        }

        public z c(File file) {
            try {
                return p.f(file);
            } catch (FileNotFoundException unused) {
                file.getParentFile().mkdirs();
                return p.f(file);
            }
        }

        public void d(File file) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                int length = listFiles.length;
                int i2 = 0;
                while (i2 < length) {
                    File file2 = listFiles[i2];
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
            try {
                return p.a(file);
            } catch (FileNotFoundException unused) {
                file.getParentFile().mkdirs();
                return p.a(file);
            }
        }

        public boolean f(File file) {
            return file.exists();
        }

        public void g(File file, File file2) {
            a(file2);
            if (!file.renameTo(file2)) {
                throw new IOException("failed to rename " + file + " to " + file2);
            }
        }

        public long h(File file) {
            return file.length();
        }
    }

    void a(File file);

    b0 b(File file);

    z c(File file);

    void d(File file);

    z e(File file);

    boolean f(File file);

    void g(File file, File file2);

    long h(File file);
}
