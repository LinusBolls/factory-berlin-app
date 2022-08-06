package g.b.c.a.e0.a;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import g.b.c.a.e0.a.c;
import g.b.c.a.i;
import g.b.c.a.k;
import g.b.c.a.l;
import g.b.c.a.m;
import g.b.c.a.n;
import java.io.FileNotFoundException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.ProviderException;

/* compiled from: AndroidKeysetManager */
public final class a {
    /* access modifiers changed from: private */
    public static final String b = "a";
    private l a;

    /* compiled from: AndroidKeysetManager */
    public static final class b {
        private m a = null;
        /* access modifiers changed from: private */
        public n b = null;
        private String c = null;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public g.b.c.a.a f9560d = null;

        /* renamed from: e  reason: collision with root package name */
        private boolean f9561e = true;

        /* renamed from: f  reason: collision with root package name */
        private i f9562f = null;

        /* renamed from: g  reason: collision with root package name */
        private KeyStore f9563g = null;
        /* access modifiers changed from: private */

        /* renamed from: h  reason: collision with root package name */
        public l f9564h;

        private l e() {
            g.b.c.a.a aVar = this.f9560d;
            if (aVar != null) {
                try {
                    return l.j(k.i(this.a, aVar));
                } catch (InvalidProtocolBufferException | GeneralSecurityException e2) {
                    Log.w(a.b, "cannot decrypt keyset: ", e2);
                }
            }
            return l.j(g.b.c.a.b.a(this.a));
        }

        private l f() {
            try {
                return e();
            } catch (FileNotFoundException e2) {
                Log.w(a.b, "keyset not found, will generate a new one", e2);
                if (this.f9562f != null) {
                    l i2 = l.i();
                    i2.a(this.f9562f);
                    i2.h(i2.c().g().R(0).R());
                    if (this.f9560d != null) {
                        i2.c().j(this.b, this.f9560d);
                    } else {
                        g.b.c.a.b.b(i2.c(), this.b);
                    }
                    return i2;
                }
                throw new GeneralSecurityException("cannot read or generate keyset");
            }
        }

        private g.b.c.a.a g() {
            c cVar;
            if (!a.d()) {
                Log.w(a.b, "Android Keystore requires at least Android M");
                return null;
            }
            if (this.f9563g != null) {
                c.b bVar = new c.b();
                bVar.b(this.f9563g);
                cVar = bVar.a();
            } else {
                cVar = new c();
            }
            boolean e2 = cVar.e(this.c);
            if (!e2) {
                try {
                    c.d(this.c);
                } catch (GeneralSecurityException e3) {
                    Log.w(a.b, "cannot use Android Keystore, it'll be disabled", e3);
                    return null;
                }
            }
            try {
                return cVar.b(this.c);
            } catch (GeneralSecurityException | ProviderException e4) {
                if (!e2) {
                    Log.w(a.b, "cannot use Android Keystore, it'll be disabled", e4);
                    return null;
                }
                throw new KeyStoreException(String.format("the master key %s exists but is unusable", new Object[]{this.c}), e4);
            }
        }

        public synchronized a d() {
            if (this.c != null) {
                this.f9560d = g();
            }
            this.f9564h = f();
            return new a(this);
        }

        public b h(i iVar) {
            this.f9562f = iVar;
            return this;
        }

        public b i(String str) {
            if (!str.startsWith("android-keystore://")) {
                throw new IllegalArgumentException("key URI must start with android-keystore://");
            } else if (this.f9561e) {
                this.c = str;
                return this;
            } else {
                throw new IllegalArgumentException("cannot call withMasterKeyUri() after calling doNotUseKeystore()");
            }
        }

        public b j(Context context, String str, String str2) {
            if (context == null) {
                throw new IllegalArgumentException("need an Android context");
            } else if (str != null) {
                this.a = new d(context, str, str2);
                this.b = new e(context, str, str2);
                return this;
            } else {
                throw new IllegalArgumentException("need a keyset name");
            }
        }
    }

    /* access modifiers changed from: private */
    public static boolean d() {
        return Build.VERSION.SDK_INT >= 23;
    }

    public synchronized k c() {
        return this.a.c();
    }

    private a(b bVar) {
        n unused = bVar.b;
        g.b.c.a.a unused2 = bVar.f9560d;
        this.a = bVar.f9564h;
    }
}
