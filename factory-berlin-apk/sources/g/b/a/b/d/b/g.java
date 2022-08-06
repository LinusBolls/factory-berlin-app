package g.b.a.b.d.b;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.internal.r;
import java.io.File;
import java.io.InputStream;

public class g {

    public static class a {
        private a(File file, ParcelFileDescriptor parcelFileDescriptor, long j2) {
        }

        public static a a(ParcelFileDescriptor parcelFileDescriptor) {
            r.l(parcelFileDescriptor, "Cannot create Payload.File from null ParcelFileDescriptor.");
            return new a((File) null, parcelFileDescriptor, parcelFileDescriptor.getStatSize());
        }

        public static a b(File file, long j2) {
            r.l(file, "Cannot create Payload.File from null java.io.File.");
            return new a(file, ParcelFileDescriptor.open(file, 268435456), j2);
        }
    }

    public static class b {
        private b(ParcelFileDescriptor parcelFileDescriptor, InputStream inputStream) {
        }

        public static b a(ParcelFileDescriptor parcelFileDescriptor) {
            r.l(parcelFileDescriptor, "Cannot create Payload.Stream from null ParcelFileDescriptor.");
            return new b(parcelFileDescriptor, (InputStream) null);
        }
    }

    private g(long j2, int i2, byte[] bArr, a aVar, b bVar) {
    }

    public static g a(a aVar, long j2) {
        return new g(j2, 2, (byte[]) null, aVar, (b) null);
    }

    public static g b(b bVar, long j2) {
        return new g(j2, 3, (byte[]) null, (a) null, bVar);
    }

    public static g c(byte[] bArr, long j2) {
        return new g(j2, 1, bArr, (a) null, (b) null);
    }
}
