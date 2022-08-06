package l;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import kotlin.jvm.internal.k;

/* compiled from: JvmOkio.kt */
final /* synthetic */ class q {
    public static final z a(File file) {
        k.f(file, "$this$appendingSink");
        return p.h(new FileOutputStream(file, true));
    }

    public static final boolean b(AssertionError assertionError) {
        k.f(assertionError, "$this$isAndroidGetsocknameError");
        if (assertionError.getCause() == null) {
            return false;
        }
        String message = assertionError.getMessage();
        return message != null ? q.I(message, "getsockname failed", false, 2, (Object) null) : false;
    }

    public static final z c(File file, boolean z) {
        k.f(file, "$this$sink");
        return p.h(new FileOutputStream(file, z));
    }

    public static final z d(OutputStream outputStream) {
        k.f(outputStream, "$this$sink");
        return new t(outputStream, new c0());
    }

    public static final z e(Socket socket) {
        k.f(socket, "$this$sink");
        a0 a0Var = new a0(socket);
        OutputStream outputStream = socket.getOutputStream();
        k.b(outputStream, "getOutputStream()");
        return a0Var.v(new t(outputStream, a0Var));
    }

    public static /* synthetic */ z f(File file, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        return p.g(file, z);
    }

    public static final b0 g(File file) {
        k.f(file, "$this$source");
        return p.l(new FileInputStream(file));
    }

    public static final b0 h(InputStream inputStream) {
        k.f(inputStream, "$this$source");
        return new o(inputStream, new c0());
    }

    public static final b0 i(Socket socket) {
        k.f(socket, "$this$source");
        a0 a0Var = new a0(socket);
        InputStream inputStream = socket.getInputStream();
        k.b(inputStream, "getInputStream()");
        return a0Var.w(new o(inputStream, a0Var));
    }
}
