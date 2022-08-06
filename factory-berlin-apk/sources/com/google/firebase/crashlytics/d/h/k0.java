package com.google.firebase.crashlytics.d.h;

import android.os.Looper;
import com.google.android.gms.tasks.g;
import com.google.android.gms.tasks.h;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: Utils */
public final class k0 {
    private static final FilenameFilter a = new a();
    private static final ExecutorService b = v.c("awaitEvenIfOnMainThread task continuation executor");

    /* compiled from: Utils */
    class a implements FilenameFilter {
        a() {
        }

        public boolean accept(File file, String str) {
            return true;
        }
    }

    /* compiled from: Utils */
    class b implements com.google.android.gms.tasks.a<T, Void> {
        final /* synthetic */ h a;

        b(h hVar) {
            this.a = hVar;
        }

        /* renamed from: b */
        public Void a(g<T> gVar) {
            if (gVar.l()) {
                this.a.e(gVar.i());
                return null;
            }
            this.a.d(gVar.h());
            return null;
        }
    }

    /* compiled from: Utils */
    class c implements Runnable {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ Callable f3948g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ h f3949h;

        /* compiled from: Utils */
        class a implements com.google.android.gms.tasks.a<T, Void> {
            a() {
            }

            /* renamed from: b */
            public Void a(g<T> gVar) {
                if (gVar.l()) {
                    c.this.f3949h.c(gVar.i());
                    return null;
                }
                c.this.f3949h.b(gVar.h());
                return null;
            }
        }

        c(Callable callable, h hVar) {
            this.f3948g = callable;
            this.f3949h = hVar;
        }

        public void run() {
            try {
                ((g) this.f3948g.call()).e(new a());
            } catch (Exception e2) {
                this.f3949h.b(e2);
            }
        }
    }

    public static <T> T a(g<T> gVar) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        gVar.f(b, j0.b(countDownLatch));
        if (Looper.getMainLooper() == Looper.myLooper()) {
            countDownLatch.await(4, TimeUnit.SECONDS);
        } else {
            countDownLatch.await();
        }
        if (gVar.l()) {
            return gVar.i();
        }
        if (gVar.j()) {
            throw new CancellationException("Task is already canceled");
        } else if (gVar.k()) {
            throw new IllegalStateException(gVar.h());
        } else {
            throw new TimeoutException();
        }
    }

    public static <T> g<T> b(Executor executor, Callable<g<T>> callable) {
        h hVar = new h();
        executor.execute(new c(callable, hVar));
        return hVar.a();
    }

    static int c(File file, int i2, Comparator<File> comparator) {
        return d(file, a, i2, comparator);
    }

    static int d(File file, FilenameFilter filenameFilter, int i2, Comparator<File> comparator) {
        File[] listFiles = file.listFiles(filenameFilter);
        if (listFiles == null) {
            return 0;
        }
        return e(Arrays.asList(listFiles), i2, comparator);
    }

    static int e(List<File> list, int i2, Comparator<File> comparator) {
        int size = list.size();
        Collections.sort(list, comparator);
        for (File next : list) {
            if (size <= i2) {
                return size;
            }
            i(next);
            size--;
        }
        return size;
    }

    static int f(File file, File file2, int i2, Comparator<File> comparator) {
        ArrayList arrayList = new ArrayList();
        File[] listFiles = file.listFiles();
        File[] listFiles2 = file2.listFiles(a);
        if (listFiles == null) {
            listFiles = new File[0];
        }
        if (listFiles2 == null) {
            listFiles2 = new File[0];
        }
        arrayList.addAll(Arrays.asList(listFiles));
        arrayList.addAll(Arrays.asList(listFiles2));
        return e(arrayList, i2, comparator);
    }

    public static <T> g<T> h(g<T> gVar, g<T> gVar2) {
        h hVar = new h();
        b bVar = new b(hVar);
        gVar.e(bVar);
        gVar2.e(bVar);
        return hVar.a();
    }

    private static void i(File file) {
        if (file.isDirectory()) {
            for (File i2 : file.listFiles()) {
                i(i2);
            }
        }
        file.delete();
    }
}
