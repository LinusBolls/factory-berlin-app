package de.baimos;

import de.baimos.bh;
import de.baimos.blueid.sdk.api.SdkInfo;
import java.io.PrintStream;

public class bi extends bh implements dr {
    public bi(Class cls) {
        this.a = cls.getSimpleName();
    }

    public void a(bh.a aVar, String str) {
        if (!bh.a.DEBUG.equals(aVar) || d()) {
            String substring = aVar.toString().substring(0, 1);
            PrintStream printStream = System.out;
            printStream.println(substring + "/" + this.a + ": " + str);
        }
    }

    public void a(bh.a aVar, String str, Throwable th) {
        if (!bh.a.DEBUG.equals(aVar) || d()) {
            a(aVar, str);
            th.printStackTrace();
        }
    }

    public /* bridge */ /* synthetic */ void a(String str) {
        super.a(str);
    }

    public /* bridge */ /* synthetic */ void a(String str, Throwable th) {
        super.a(str, th);
    }

    public /* bridge */ /* synthetic */ boolean a() {
        return super.a();
    }

    public /* bridge */ /* synthetic */ void b(String str) {
        super.b(str);
    }

    public /* bridge */ /* synthetic */ void b(String str, Throwable th) {
        super.b(str, th);
    }

    public /* bridge */ /* synthetic */ boolean b() {
        return super.b();
    }

    public /* bridge */ /* synthetic */ void c(String str) {
        super.c(str);
    }

    public /* bridge */ /* synthetic */ void c(String str, Throwable th) {
        super.c(str, th);
    }

    public /* bridge */ /* synthetic */ boolean c() {
        return super.c();
    }

    public /* bridge */ /* synthetic */ void d(String str) {
        super.d(str);
    }

    public /* bridge */ /* synthetic */ void d(String str, Throwable th) {
        super.d(str, th);
    }

    public boolean d() {
        return SdkInfo.DEBUG_LOG_CONSOLE;
    }
}
