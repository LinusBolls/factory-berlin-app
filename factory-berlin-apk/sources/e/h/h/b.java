package e.h.h;

import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.core.content.c.f;
import e.h.d.k;
import e.h.h.c;
import e.h.j.h;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* compiled from: FontsContractCompat */
public class b {
    static final e.e.e<String, Typeface> a = new e.e.e<>(16);
    private static final c b = new c("fonts", 10, 10000);
    static final Object c = new Object();

    /* renamed from: d  reason: collision with root package name */
    static final e.e.g<String, ArrayList<c.d<g>>> f8635d = new e.e.g<>();

    /* renamed from: e  reason: collision with root package name */
    private static final Comparator<byte[]> f8636e = new d();

    /* compiled from: FontsContractCompat */
    class a implements Callable<g> {
        final /* synthetic */ Context a;
        final /* synthetic */ a b;
        final /* synthetic */ int c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f8637d;

        a(Context context, a aVar, int i2, String str) {
            this.a = context;
            this.b = aVar;
            this.c = i2;
            this.f8637d = str;
        }

        /* renamed from: a */
        public g call() {
            g f2 = b.f(this.a, this.b, this.c);
            Typeface typeface = f2.a;
            if (typeface != null) {
                b.a.d(this.f8637d, typeface);
            }
            return f2;
        }
    }

    /* renamed from: e.h.h.b$b  reason: collision with other inner class name */
    /* compiled from: FontsContractCompat */
    class C0557b implements c.d<g> {
        final /* synthetic */ f.a a;
        final /* synthetic */ Handler b;

        C0557b(f.a aVar, Handler handler) {
            this.a = aVar;
            this.b = handler;
        }

        /* renamed from: b */
        public void a(g gVar) {
            if (gVar == null) {
                this.a.a(1, this.b);
                return;
            }
            int i2 = gVar.b;
            if (i2 == 0) {
                this.a.b(gVar.a, this.b);
            } else {
                this.a.a(i2, this.b);
            }
        }
    }

    /* compiled from: FontsContractCompat */
    class c implements c.d<g> {
        final /* synthetic */ String a;

        c(String str) {
            this.a = str;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
            if (r0 >= r1.size()) goto L_0x002c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
            ((e.h.h.c.d) r1.get(r0)).a(r5);
            r0 = r0 + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0019, code lost:
            r0 = 0;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void a(e.h.h.b.g r5) {
            /*
                r4 = this;
                java.lang.Object r0 = e.h.h.b.c
                monitor-enter(r0)
                e.e.g<java.lang.String, java.util.ArrayList<e.h.h.c$d<e.h.h.b$g>>> r1 = e.h.h.b.f8635d     // Catch:{ all -> 0x002d }
                java.lang.String r2 = r4.a     // Catch:{ all -> 0x002d }
                java.lang.Object r1 = r1.get(r2)     // Catch:{ all -> 0x002d }
                java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch:{ all -> 0x002d }
                if (r1 != 0) goto L_0x0011
                monitor-exit(r0)     // Catch:{ all -> 0x002d }
                return
            L_0x0011:
                e.e.g<java.lang.String, java.util.ArrayList<e.h.h.c$d<e.h.h.b$g>>> r2 = e.h.h.b.f8635d     // Catch:{ all -> 0x002d }
                java.lang.String r3 = r4.a     // Catch:{ all -> 0x002d }
                r2.remove(r3)     // Catch:{ all -> 0x002d }
                monitor-exit(r0)     // Catch:{ all -> 0x002d }
                r0 = 0
            L_0x001a:
                int r2 = r1.size()
                if (r0 >= r2) goto L_0x002c
                java.lang.Object r2 = r1.get(r0)
                e.h.h.c$d r2 = (e.h.h.c.d) r2
                r2.a(r5)
                int r0 = r0 + 1
                goto L_0x001a
            L_0x002c:
                return
            L_0x002d:
                r5 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x002d }
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: e.h.h.b.c.a(e.h.h.b$g):void");
        }
    }

    /* compiled from: FontsContractCompat */
    class d implements Comparator<byte[]> {
        d() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: byte} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int compare(byte[] r5, byte[] r6) {
            /*
                r4 = this;
                int r0 = r5.length
                int r1 = r6.length
                if (r0 == r1) goto L_0x0008
                int r5 = r5.length
                int r6 = r6.length
            L_0x0006:
                int r5 = r5 - r6
                return r5
            L_0x0008:
                r0 = 0
                r1 = 0
            L_0x000a:
                int r2 = r5.length
                if (r1 >= r2) goto L_0x001b
                byte r2 = r5[r1]
                byte r3 = r6[r1]
                if (r2 == r3) goto L_0x0018
                byte r5 = r5[r1]
                byte r6 = r6[r1]
                goto L_0x0006
            L_0x0018:
                int r1 = r1 + 1
                goto L_0x000a
            L_0x001b:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: e.h.h.b.d.compare(byte[], byte[]):int");
        }
    }

    /* compiled from: FontsContractCompat */
    public static class e {
        private final int a;
        private final f[] b;

        public e(int i2, f[] fVarArr) {
            this.a = i2;
            this.b = fVarArr;
        }

        public f[] a() {
            return this.b;
        }

        public int b() {
            return this.a;
        }
    }

    /* compiled from: FontsContractCompat */
    public static class f {
        private final Uri a;
        private final int b;
        private final int c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f8638d;

        /* renamed from: e  reason: collision with root package name */
        private final int f8639e;

        public f(Uri uri, int i2, int i3, boolean z, int i4) {
            h.c(uri);
            this.a = uri;
            this.b = i2;
            this.c = i3;
            this.f8638d = z;
            this.f8639e = i4;
        }

        public int a() {
            return this.f8639e;
        }

        public int b() {
            return this.b;
        }

        public Uri c() {
            return this.a;
        }

        public int d() {
            return this.c;
        }

        public boolean e() {
            return this.f8638d;
        }
    }

    /* compiled from: FontsContractCompat */
    private static final class g {
        final Typeface a;
        final int b;

        g(Typeface typeface, int i2) {
            this.a = typeface;
            this.b = i2;
        }
    }

    private static List<byte[]> a(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature byteArray : signatureArr) {
            arrayList.add(byteArray.toByteArray());
        }
        return arrayList;
    }

    private static boolean b(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (!Arrays.equals(list.get(i2), list2.get(i2))) {
                return false;
            }
        }
        return true;
    }

    public static e c(Context context, CancellationSignal cancellationSignal, a aVar) {
        ProviderInfo h2 = h(context.getPackageManager(), aVar, context.getResources());
        if (h2 == null) {
            return new e(1, (f[]) null);
        }
        return new e(0, e(context, aVar, h2.authority, cancellationSignal));
    }

    private static List<List<byte[]>> d(a aVar, Resources resources) {
        if (aVar.a() != null) {
            return aVar.a();
        }
        return androidx.core.content.c.c.c(resources, aVar.b());
    }

    static f[] e(Context context, a aVar, String str, CancellationSignal cancellationSignal) {
        Uri uri;
        Cursor query;
        String str2 = str;
        ArrayList arrayList = new ArrayList();
        Uri build = new Uri.Builder().scheme("content").authority(str2).build();
        Uri build2 = new Uri.Builder().scheme("content").authority(str2).appendPath("file").build();
        Cursor cursor = null;
        try {
            if (Build.VERSION.SDK_INT > 16) {
                query = context.getContentResolver().query(build, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{aVar.f()}, (String) null, cancellationSignal);
            } else {
                query = context.getContentResolver().query(build, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{aVar.f()}, (String) null);
            }
            if (cursor != null && cursor.getCount() > 0) {
                int columnIndex = cursor.getColumnIndex("result_code");
                ArrayList arrayList2 = new ArrayList();
                int columnIndex2 = cursor.getColumnIndex("_id");
                int columnIndex3 = cursor.getColumnIndex("file_id");
                int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                int columnIndex5 = cursor.getColumnIndex("font_weight");
                int columnIndex6 = cursor.getColumnIndex("font_italic");
                while (cursor.moveToNext()) {
                    int i2 = columnIndex != -1 ? cursor.getInt(columnIndex) : 0;
                    int i3 = columnIndex4 != -1 ? cursor.getInt(columnIndex4) : 0;
                    if (columnIndex3 == -1) {
                        uri = ContentUris.withAppendedId(build, cursor.getLong(columnIndex2));
                    } else {
                        uri = ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3));
                    }
                    arrayList2.add(new f(uri, i3, columnIndex5 != -1 ? cursor.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursor.getInt(columnIndex6) == 1, i2));
                }
                arrayList = arrayList2;
            }
            return (f[]) arrayList.toArray(new f[0]);
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    static g f(Context context, a aVar, int i2) {
        try {
            e c2 = c(context, (CancellationSignal) null, aVar);
            int i3 = -3;
            if (c2.b() == 0) {
                Typeface b2 = e.h.d.d.b(context, (CancellationSignal) null, c2.a(), i2);
                if (b2 != null) {
                    i3 = 0;
                }
                return new g(b2, i3);
            }
            if (c2.b() == 1) {
                i3 = -2;
            }
            return new g((Typeface) null, i3);
        } catch (PackageManager.NameNotFoundException unused) {
            return new g((Typeface) null, -1);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0072, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0083, code lost:
        b.d(r1, new e.h.h.b.c(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008d, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Typeface g(android.content.Context r2, e.h.h.a r3, androidx.core.content.c.f.a r4, android.os.Handler r5, boolean r6, int r7, int r8) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r3.c()
            r0.append(r1)
            java.lang.String r1 = "-"
            r0.append(r1)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            e.e.e<java.lang.String, android.graphics.Typeface> r1 = a
            java.lang.Object r1 = r1.c(r0)
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            if (r1 == 0) goto L_0x0028
            if (r4 == 0) goto L_0x0027
            r4.d(r1)
        L_0x0027:
            return r1
        L_0x0028:
            if (r6 == 0) goto L_0x0043
            r1 = -1
            if (r7 != r1) goto L_0x0043
            e.h.h.b$g r2 = f(r2, r3, r8)
            if (r4 == 0) goto L_0x0040
            int r3 = r2.b
            if (r3 != 0) goto L_0x003d
            android.graphics.Typeface r3 = r2.a
            r4.b(r3, r5)
            goto L_0x0040
        L_0x003d:
            r4.a(r3, r5)
        L_0x0040:
            android.graphics.Typeface r2 = r2.a
            return r2
        L_0x0043:
            e.h.h.b$a r1 = new e.h.h.b$a
            r1.<init>(r2, r3, r8, r0)
            r2 = 0
            if (r6 == 0) goto L_0x0056
            e.h.h.c r3 = b     // Catch:{ InterruptedException -> 0x0055 }
            java.lang.Object r3 = r3.e(r1, r7)     // Catch:{ InterruptedException -> 0x0055 }
            e.h.h.b$g r3 = (e.h.h.b.g) r3     // Catch:{ InterruptedException -> 0x0055 }
            android.graphics.Typeface r2 = r3.a     // Catch:{ InterruptedException -> 0x0055 }
        L_0x0055:
            return r2
        L_0x0056:
            if (r4 != 0) goto L_0x005a
            r3 = r2
            goto L_0x005f
        L_0x005a:
            e.h.h.b$b r3 = new e.h.h.b$b
            r3.<init>(r4, r5)
        L_0x005f:
            java.lang.Object r4 = c
            monitor-enter(r4)
            e.e.g<java.lang.String, java.util.ArrayList<e.h.h.c$d<e.h.h.b$g>>> r5 = f8635d     // Catch:{ all -> 0x008e }
            java.lang.Object r5 = r5.get(r0)     // Catch:{ all -> 0x008e }
            java.util.ArrayList r5 = (java.util.ArrayList) r5     // Catch:{ all -> 0x008e }
            if (r5 == 0) goto L_0x0073
            if (r3 == 0) goto L_0x0071
            r5.add(r3)     // Catch:{ all -> 0x008e }
        L_0x0071:
            monitor-exit(r4)     // Catch:{ all -> 0x008e }
            return r2
        L_0x0073:
            if (r3 == 0) goto L_0x0082
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x008e }
            r5.<init>()     // Catch:{ all -> 0x008e }
            r5.add(r3)     // Catch:{ all -> 0x008e }
            e.e.g<java.lang.String, java.util.ArrayList<e.h.h.c$d<e.h.h.b$g>>> r3 = f8635d     // Catch:{ all -> 0x008e }
            r3.put(r0, r5)     // Catch:{ all -> 0x008e }
        L_0x0082:
            monitor-exit(r4)     // Catch:{ all -> 0x008e }
            e.h.h.c r3 = b
            e.h.h.b$c r4 = new e.h.h.b$c
            r4.<init>(r0)
            r3.d(r1, r4)
            return r2
        L_0x008e:
            r2 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x008e }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: e.h.h.b.g(android.content.Context, e.h.h.a, androidx.core.content.c.f$a, android.os.Handler, boolean, int, int):android.graphics.Typeface");
    }

    public static ProviderInfo h(PackageManager packageManager, a aVar, Resources resources) {
        String d2 = aVar.d();
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(d2, 0);
        if (resolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException("No package found for authority: " + d2);
        } else if (resolveContentProvider.packageName.equals(aVar.e())) {
            List<byte[]> a2 = a(packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures);
            Collections.sort(a2, f8636e);
            List<List<byte[]>> d3 = d(aVar, resources);
            for (int i2 = 0; i2 < d3.size(); i2++) {
                ArrayList arrayList = new ArrayList(d3.get(i2));
                Collections.sort(arrayList, f8636e);
                if (b(a2, arrayList)) {
                    return resolveContentProvider;
                }
            }
            return null;
        } else {
            throw new PackageManager.NameNotFoundException("Found content provider " + d2 + ", but package was not " + aVar.e());
        }
    }

    public static Map<Uri, ByteBuffer> i(Context context, f[] fVarArr, CancellationSignal cancellationSignal) {
        HashMap hashMap = new HashMap();
        for (f fVar : fVarArr) {
            if (fVar.a() == 0) {
                Uri c2 = fVar.c();
                if (!hashMap.containsKey(c2)) {
                    hashMap.put(c2, k.f(context, cancellationSignal, c2));
                }
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }
}
