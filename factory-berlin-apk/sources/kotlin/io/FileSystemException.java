package kotlin.io;

import java.io.File;
import java.io.IOException;
import kotlin.i;
import kotlin.jvm.internal.k;

@i(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u001b\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lkotlin/io/FileSystemException;", "Ljava/io/IOException;", "Ljava/io/File;", "file", "Ljava/io/File;", "getFile", "()Ljava/io/File;", "other", "getOther", "", "reason", "Ljava/lang/String;", "getReason", "()Ljava/lang/String;", "<init>", "(Ljava/io/File;Ljava/io/File;Ljava/lang/String;)V", "kotlin-stdlib"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
/* compiled from: Exceptions.kt */
public class FileSystemException extends IOException {
    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FileSystemException(File file, File file2, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, (i2 & 2) != 0 ? null : file2, (i2 & 4) != 0 ? null : str);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FileSystemException(File file, File file2, String str) {
        super(b.a(file, file2, str));
        k.e(file, "file");
    }
}
