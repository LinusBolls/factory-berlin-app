package de.baimos;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class cp {
    public static byte[] a(File file) {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2 = null;
        try {
            fileInputStream = new FileInputStream(file);
            try {
                byte[] a = cq.a((InputStream) fileInputStream);
                cq.d(fileInputStream);
                return a;
            } catch (Exception unused) {
                cq.d(fileInputStream);
                return null;
            } catch (Throwable th) {
                th = th;
                fileInputStream2 = fileInputStream;
                cq.d(fileInputStream2);
                throw th;
            }
        } catch (Exception unused2) {
            fileInputStream = null;
            cq.d(fileInputStream);
            return null;
        } catch (Throwable th2) {
            th = th2;
            cq.d(fileInputStream2);
            throw th;
        }
    }

    public static byte[] a(String str) {
        return a(new File(str));
    }
}
