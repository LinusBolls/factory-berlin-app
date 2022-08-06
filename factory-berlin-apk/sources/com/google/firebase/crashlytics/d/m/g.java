package com.google.firebase.crashlytics.d.m;

import com.google.firebase.crashlytics.d.b;
import com.google.firebase.crashlytics.d.h.p;
import com.google.firebase.crashlytics.d.j.v;
import com.google.firebase.crashlytics.d.j.w;
import com.google.firebase.crashlytics.d.j.x.h;
import com.google.firebase.crashlytics.d.q.e;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: CrashlyticsReportPersistence */
public class g {

    /* renamed from: g  reason: collision with root package name */
    private static final Charset f4086g = Charset.forName("UTF-8");

    /* renamed from: h  reason: collision with root package name */
    private static final int f4087h = 15;

    /* renamed from: i  reason: collision with root package name */
    private static final h f4088i = new h();

    /* renamed from: j  reason: collision with root package name */
    private static final Comparator<? super File> f4089j = e.a();

    /* renamed from: k  reason: collision with root package name */
    private static final FilenameFilter f4090k = f.a();
    private final AtomicInteger a = new AtomicInteger(0);
    private final File b;
    private final File c;

    /* renamed from: d  reason: collision with root package name */
    private final File f4091d;

    /* renamed from: e  reason: collision with root package name */
    private final File f4092e;

    /* renamed from: f  reason: collision with root package name */
    private final e f4093f;

    public g(File file, e eVar) {
        File file2 = new File(file, "report-persistence");
        this.b = new File(file2, "sessions");
        this.c = new File(file2, "priority-reports");
        this.f4091d = new File(file2, "reports");
        this.f4092e = new File(file2, "native-reports");
        this.f4093f = eVar;
    }

    private static File C(File file) {
        if (y(file)) {
            return file;
        }
        throw new IOException("Could not create directory " + file);
    }

    private static String D(File file) {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int read = fileInputStream.read(bArr);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    String str = new String(byteArrayOutputStream.toByteArray(), f4086g);
                    fileInputStream.close();
                    return str;
                }
            } catch (Throwable unused) {
            }
        }
        throw th;
    }

    private static void E(File file) {
        if (file != null) {
            if (file.isDirectory()) {
                for (File E : file.listFiles()) {
                    E(E);
                }
            }
            file.delete();
        }
    }

    private static List<File> F(List<File>... listArr) {
        for (List<File> sort : listArr) {
            Collections.sort(sort, f4089j);
        }
        return f(listArr);
    }

    private static void G(File file, File file2, v.c cVar, String str) {
        try {
            v n2 = f4088i.D(D(file)).n(cVar);
            C(file2);
            K(new File(file2, str), f4088i.E(n2));
        } catch (IOException e2) {
            b f2 = b.f();
            f2.c("Could not synthesize final native report file for " + file, e2);
        }
    }

    private void H(File file, long j2) {
        boolean z;
        List<File> p = p(file, f4090k);
        if (!p.isEmpty()) {
            Collections.sort(p);
            ArrayList arrayList = new ArrayList();
            Iterator<File> it = p.iterator();
            loop0:
            while (true) {
                z = false;
                while (true) {
                    if (!it.hasNext()) {
                        break loop0;
                    }
                    File next = it.next();
                    try {
                        arrayList.add(f4088i.h(D(next)));
                        if (z || r(next.getName())) {
                            z = true;
                        }
                    } catch (IOException e2) {
                        b f2 = b.f();
                        f2.c("Could not add event to report for " + next, e2);
                    }
                }
            }
            String str = null;
            File file2 = new File(file, "user");
            if (file2.isFile()) {
                try {
                    str = D(file2);
                } catch (IOException e3) {
                    b f3 = b.f();
                    f3.c("Could not read user ID file in " + file.getName(), e3);
                }
            }
            I(new File(file, "report"), z ? this.c : this.f4091d, arrayList, j2, z, str);
        }
    }

    private static void I(File file, File file2, List<v.d.C0096d> list, long j2, boolean z, String str) {
        try {
            v m2 = f4088i.D(D(file)).o(j2, z, str).m(w.a(list));
            v.d j3 = m2.j();
            if (j3 != null) {
                C(file2);
                K(new File(file2, j3.h()), f4088i.E(m2));
            }
        } catch (IOException e2) {
            b f2 = b.f();
            f2.c("Could not synthesize final report file for " + file, e2);
        }
    }

    private static int J(File file, int i2) {
        List<File> p = p(file, c.a());
        Collections.sort(p, d.a());
        return d(p, i2);
    }

    private static void K(File file, String str) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f4086g);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
            return;
        } catch (Throwable unused) {
        }
        throw th;
    }

    private List<File> c(String str) {
        List<File> o = o(this.b, b.a(str));
        Collections.sort(o, f4089j);
        if (o.size() <= 8) {
            return o;
        }
        for (File E : o.subList(8, o.size())) {
            E(E);
        }
        return o.subList(0, 8);
    }

    private static int d(List<File> list, int i2) {
        int size = list.size();
        for (File next : list) {
            if (size <= i2) {
                return size;
            }
            E(next);
            size--;
        }
        return size;
    }

    private void e() {
        int i2 = this.f4093f.b().a().b;
        List<File> m2 = m();
        int size = m2.size();
        if (size > i2) {
            for (File delete : m2.subList(i2, size)) {
                delete.delete();
            }
        }
    }

    private static List<File> f(List<File>... listArr) {
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        for (List<File> size : listArr) {
            i2 += size.size();
        }
        arrayList.ensureCapacity(i2);
        for (List<File> addAll : listArr) {
            arrayList.addAll(addAll);
        }
        return arrayList;
    }

    private static String k(int i2, boolean z) {
        String format = String.format(Locale.US, "%010d", new Object[]{Integer.valueOf(i2)});
        String str = z ? "_" : "";
        return "event" + format + str;
    }

    private static List<File> l(File file) {
        return o(file, (FileFilter) null);
    }

    private List<File> m() {
        return F(f(l(this.c), l(this.f4092e)), l(this.f4091d));
    }

    private static String n(String str) {
        return str.substring(0, f4087h);
    }

    private static List<File> o(File file, FileFilter fileFilter) {
        if (!file.isDirectory()) {
            return Collections.emptyList();
        }
        File[] listFiles = fileFilter == null ? file.listFiles() : file.listFiles(fileFilter);
        return listFiles != null ? Arrays.asList(listFiles) : Collections.emptyList();
    }

    private static List<File> p(File file, FilenameFilter filenameFilter) {
        if (!file.isDirectory()) {
            return Collections.emptyList();
        }
        File[] listFiles = filenameFilter == null ? file.listFiles() : file.listFiles(filenameFilter);
        return listFiles != null ? Arrays.asList(listFiles) : Collections.emptyList();
    }

    private File q(String str) {
        return new File(this.b, str);
    }

    private static boolean r(String str) {
        return str.startsWith("event") && str.endsWith("_");
    }

    /* access modifiers changed from: private */
    public static boolean s(File file, String str) {
        return str.startsWith("event") && !str.endsWith("_");
    }

    static /* synthetic */ boolean t(String str, File file) {
        return file.isDirectory() && !file.getName().equals(str);
    }

    private static boolean y(File file) {
        return file.exists() || file.mkdirs();
    }

    /* access modifiers changed from: private */
    public static int z(File file, File file2) {
        return n(file.getName()).compareTo(n(file2.getName()));
    }

    public void A(v.d.C0096d dVar, String str, boolean z) {
        int i2 = this.f4093f.b().a().a;
        File q = q(str);
        try {
            K(new File(q, k(this.a.getAndIncrement(), z)), f4088i.i(dVar));
        } catch (IOException e2) {
            b f2 = b.f();
            f2.c("Could not persist event for session " + str, e2);
        }
        J(q, i2);
    }

    public void B(v vVar) {
        v.d j2 = vVar.j();
        if (j2 == null) {
            b.f().b("Could not get session for report");
            return;
        }
        String h2 = j2.h();
        try {
            File q = q(h2);
            C(q);
            K(new File(q, "report"), f4088i.E(vVar));
        } catch (IOException e2) {
            b f2 = b.f();
            f2.c("Could not persist report for session " + h2, e2);
        }
    }

    public void g() {
        for (File delete : m()) {
            delete.delete();
        }
    }

    public void h(String str) {
        FilenameFilter a2 = a.a(str);
        for (File delete : f(p(this.c, a2), p(this.f4092e, a2), p(this.f4091d, a2))) {
            delete.delete();
        }
    }

    public void i(String str, long j2) {
        for (File next : c(str)) {
            H(next, j2);
            E(next);
        }
        e();
    }

    public void j(String str, v.c cVar) {
        G(new File(q(str), "report"), this.f4092e, cVar, str);
    }

    public List<p> x() {
        List<File> m2 = m();
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(m2.size());
        for (File next : m()) {
            try {
                arrayList.add(p.a(f4088i.D(D(next)), next.getName()));
            } catch (IOException e2) {
                b f2 = b.f();
                f2.c("Could not load report file " + next + "; deleting", e2);
                next.delete();
            }
        }
        return arrayList;
    }
}
