package com.google.android.gms.gcm;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.r;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;

public class Task implements ReflectedParcelable {

    /* renamed from: g  reason: collision with root package name */
    private final String f2192g;

    /* renamed from: h  reason: collision with root package name */
    private final String f2193h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f2194i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f2195j;

    /* renamed from: k  reason: collision with root package name */
    private final int f2196k;

    /* renamed from: l  reason: collision with root package name */
    private final Set<Uri> f2197l;

    /* renamed from: m  reason: collision with root package name */
    private final boolean f2198m;

    /* renamed from: n  reason: collision with root package name */
    private final j f2199n;
    private final Bundle o;

    public static abstract class a {
        protected int a;
        protected String b;
        protected String c;

        /* renamed from: d  reason: collision with root package name */
        protected boolean f2200d;

        /* renamed from: e  reason: collision with root package name */
        protected boolean f2201e;

        /* renamed from: f  reason: collision with root package name */
        protected boolean f2202f;

        /* renamed from: g  reason: collision with root package name */
        protected Set<Uri> f2203g = Collections.emptySet();

        /* renamed from: h  reason: collision with root package name */
        protected j f2204h = j.f2220d;

        /* renamed from: i  reason: collision with root package name */
        protected Bundle f2205i;

        /* access modifiers changed from: protected */
        public void a() {
            r.b(this.b != null, "Must provide an endpoint for this task by calling setService(ComponentName).");
            a.d(this.c);
            j jVar = this.f2204h;
            if (jVar != null) {
                int b2 = jVar.b();
                if (b2 == 1 || b2 == 0) {
                    int c2 = jVar.c();
                    int d2 = jVar.d();
                    if (b2 == 0 && c2 < 0) {
                        StringBuilder sb = new StringBuilder(52);
                        sb.append("InitialBackoffSeconds can't be negative: ");
                        sb.append(c2);
                        throw new IllegalArgumentException(sb.toString());
                    } else if (b2 == 1 && c2 < 10) {
                        throw new IllegalArgumentException("RETRY_POLICY_LINEAR must have an initial backoff at least 10 seconds.");
                    } else if (d2 < c2) {
                        int d3 = jVar.d();
                        StringBuilder sb2 = new StringBuilder(77);
                        sb2.append("MaximumBackoffSeconds must be greater than InitialBackoffSeconds: ");
                        sb2.append(d3);
                        throw new IllegalArgumentException(sb2.toString());
                    }
                } else {
                    StringBuilder sb3 = new StringBuilder(45);
                    sb3.append("Must provide a valid RetryPolicy: ");
                    sb3.append(b2);
                    throw new IllegalArgumentException(sb3.toString());
                }
            }
            if (this.f2201e) {
                Task.f(this.f2205i);
            }
            if (this.f2203g.isEmpty() || this.a != 2) {
                for (Uri e2 : this.f2203g) {
                    Task.d(e2);
                }
                return;
            }
            throw new IllegalArgumentException("Required URIs may not be used with NETWORK_STATE_ANY");
        }

        public abstract a b(int i2);

        public abstract a c(boolean z);
    }

    Task(a aVar) {
        this.f2192g = aVar.b;
        this.f2193h = aVar.c;
        this.f2194i = aVar.f2200d;
        this.f2195j = aVar.f2201e;
        this.f2196k = aVar.a;
        this.f2197l = aVar.f2203g;
        this.f2198m = aVar.f2202f;
        this.o = aVar.f2205i;
        j jVar = aVar.f2204h;
        this.f2199n = jVar == null ? j.f2220d : jVar;
    }

    /* access modifiers changed from: private */
    public static void d(Uri uri) {
        if (uri != null) {
            String scheme = uri.getScheme();
            String host = uri.getHost();
            if (TextUtils.isEmpty(host) || "null".equals(host)) {
                throw new IllegalArgumentException("URI hostname is required");
            }
            try {
                int port = uri.getPort();
                if ("tcp".equals(scheme)) {
                    if (port <= 0 || port > 65535) {
                        int port2 = uri.getPort();
                        StringBuilder sb = new StringBuilder(38);
                        sb.append("Invalid required URI port: ");
                        sb.append(port2);
                        throw new IllegalArgumentException(sb.toString());
                    }
                } else if (!"ping".equals(scheme)) {
                    String valueOf = String.valueOf(scheme);
                    throw new IllegalArgumentException(valueOf.length() != 0 ? "Unsupported required URI scheme: ".concat(valueOf) : new String("Unsupported required URI scheme: "));
                } else if (port != -1) {
                    throw new IllegalArgumentException("Ping does not support port numbers");
                }
            } catch (NumberFormatException e2) {
                String valueOf2 = String.valueOf(e2.getMessage());
                throw new IllegalArgumentException(valueOf2.length() != 0 ? "Invalid port number: ".concat(valueOf2) : new String("Invalid port number: "));
            }
        } else {
            throw new IllegalArgumentException("Null URI");
        }
    }

    public static void f(Bundle bundle) {
        if (bundle != null) {
            Parcel obtain = Parcel.obtain();
            bundle.writeToParcel(obtain, 0);
            int dataSize = obtain.dataSize();
            obtain.recycle();
            if (dataSize <= 10240) {
                for (String str : bundle.keySet()) {
                    Object obj = bundle.get(str);
                    if (!((obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Double) || (obj instanceof String) || (obj instanceof Boolean))) {
                        if (obj instanceof Bundle) {
                            f((Bundle) obj);
                        } else {
                            throw new IllegalArgumentException("Only the following extra parameter types are supported: Integer, Long, Double, String, Boolean, and nested Bundles with the same restrictions.");
                        }
                    }
                }
                return;
            }
            StringBuilder sb = new StringBuilder(55);
            sb.append("Extras exceeding maximum size(10240 bytes): ");
            sb.append(dataSize);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public String a() {
        return this.f2192g;
    }

    public String b() {
        return this.f2193h;
    }

    public void c(Bundle bundle) {
        bundle.putString("tag", this.f2193h);
        bundle.putBoolean("update_current", this.f2194i);
        bundle.putBoolean("persisted", this.f2195j);
        bundle.putString("service", this.f2192g);
        bundle.putInt("requiredNetwork", this.f2196k);
        if (!this.f2197l.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (Uri uri : this.f2197l) {
                arrayList.add(uri.toString());
            }
            bundle.putStringArrayList("reachabilityUris", arrayList);
        }
        bundle.putBoolean("requiresCharging", this.f2198m);
        bundle.putBoolean("requiresIdle", false);
        j jVar = this.f2199n;
        Bundle bundle2 = new Bundle();
        jVar.a(bundle2);
        bundle.putBundle("retryStrategy", bundle2);
        bundle.putBundle("extras", this.o);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f2192g);
        parcel.writeString(this.f2193h);
        parcel.writeInt(this.f2194i ? 1 : 0);
        parcel.writeInt(this.f2195j ? 1 : 0);
    }

    @Deprecated
    Task(Parcel parcel) {
        Log.e("Task", "Constructing a Task object using a parcel.");
        this.f2192g = parcel.readString();
        this.f2193h = parcel.readString();
        boolean z = true;
        this.f2194i = parcel.readInt() == 1;
        this.f2195j = parcel.readInt() != 1 ? false : z;
        this.f2196k = 2;
        this.f2197l = Collections.emptySet();
        this.f2198m = false;
        this.f2199n = j.f2220d;
        this.o = null;
    }
}
