package com.google.firebase.crashlytics.d.n;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;

/* compiled from: ClsFileOutputStream */
public class b extends FileOutputStream {

    /* renamed from: j  reason: collision with root package name */
    public static final FilenameFilter f4094j = new a();

    /* renamed from: g  reason: collision with root package name */
    private final String f4095g;

    /* renamed from: h  reason: collision with root package name */
    private File f4096h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f4097i = false;

    /* compiled from: ClsFileOutputStream */
    class a implements FilenameFilter {
        a() {
        }

        public boolean accept(File file, String str) {
            return str.endsWith(".cls_temp");
        }
    }

    public b(File file, String str) {
        super(new File(file, str + ".cls_temp"));
        this.f4095g = file + File.separator + str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f4095g);
        sb.append(".cls_temp");
        this.f4096h = new File(sb.toString());
    }

    public void a() {
        if (!this.f4097i) {
            this.f4097i = true;
            super.flush();
            super.close();
        }
    }

    public synchronized void close() {
        if (!this.f4097i) {
            this.f4097i = true;
            super.flush();
            super.close();
            File file = new File(this.f4095g + ".cls");
            if (this.f4096h.renameTo(file)) {
                this.f4096h = null;
                return;
            }
            String str = "";
            if (file.exists()) {
                str = " (target already exists)";
            } else if (!this.f4096h.exists()) {
                str = " (source does not exist)";
            }
            throw new IOException("Could not rename temp file: " + this.f4096h + " -> " + file + str);
        }
    }
}
