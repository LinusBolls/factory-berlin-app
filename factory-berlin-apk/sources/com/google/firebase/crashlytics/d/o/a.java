package com.google.firebase.crashlytics.d.o;

import com.google.firebase.crashlytics.d.o.b;
import com.google.firebase.crashlytics.d.o.c.c;
import com.google.firebase.crashlytics.d.o.c.d;
import java.io.File;
import java.util.LinkedList;
import java.util.List;

/* compiled from: ReportManager */
public class a {
    private final b.c a;

    public a(b.c cVar) {
        this.a = cVar;
    }

    public boolean a() {
        File[] b = this.a.b();
        File[] a2 = this.a.a();
        if (b != null && b.length > 0) {
            return true;
        }
        if (a2 == null || a2.length <= 0) {
            return false;
        }
        return true;
    }

    public void b(c cVar) {
        cVar.remove();
    }

    public void c(List<c> list) {
        for (c b : list) {
            b(b);
        }
    }

    public List<c> d() {
        com.google.firebase.crashlytics.d.b.f().b("Checking for crash reports...");
        File[] b = this.a.b();
        File[] a2 = this.a.a();
        LinkedList linkedList = new LinkedList();
        if (b != null) {
            for (File file : b) {
                com.google.firebase.crashlytics.d.b.f().b("Found crash report " + file.getPath());
                linkedList.add(new d(file));
            }
        }
        if (a2 != null) {
            for (File bVar : a2) {
                linkedList.add(new com.google.firebase.crashlytics.d.o.c.b(bVar));
            }
        }
        if (linkedList.isEmpty()) {
            com.google.firebase.crashlytics.d.b.f().b("No reports found.");
        }
        return linkedList;
    }
}
