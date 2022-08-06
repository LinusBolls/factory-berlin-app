package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.m.c;
import com.google.android.gms.common.util.e;
import com.google.android.gms.internal.measurement.a1;
import com.google.android.gms.internal.measurement.c1;
import com.google.android.gms.internal.measurement.dc;
import com.google.android.gms.internal.measurement.e1;
import com.google.android.gms.internal.measurement.f;
import com.google.android.gms.internal.measurement.fb;
import com.google.android.gms.internal.measurement.i1;
import com.google.android.gms.internal.measurement.ma;
import com.google.android.gms.internal.measurement.u0;
import com.google.android.gms.internal.measurement.vc;
import com.google.android.gms.internal.measurement.wc;
import com.google.android.gms.internal.measurement.z6;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
public class x9 implements c6 {
    private static volatile x9 z;
    private b5 a;
    private g4 b;
    private d c;

    /* renamed from: d  reason: collision with root package name */
    private n4 f3217d;

    /* renamed from: e  reason: collision with root package name */
    private t9 f3218e;

    /* renamed from: f  reason: collision with root package name */
    private ma f3219f;

    /* renamed from: g  reason: collision with root package name */
    private final ba f3220g;

    /* renamed from: h  reason: collision with root package name */
    private s7 f3221h;

    /* renamed from: i  reason: collision with root package name */
    private c9 f3222i;

    /* renamed from: j  reason: collision with root package name */
    private final h5 f3223j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f3224k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f3225l;

    /* renamed from: m  reason: collision with root package name */
    private long f3226m;

    /* renamed from: n  reason: collision with root package name */
    private List<Runnable> f3227n;
    private int o;
    private int p;
    private boolean q;
    private boolean r;
    private boolean s;
    private FileLock t;
    private FileChannel u;
    private List<Long> v;
    private List<Long> w;
    private long x;
    private final Map<String, e> y;

    /* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
    class a implements f {
        e1 a;
        List<Long> b;
        List<a1> c;

        /* renamed from: d  reason: collision with root package name */
        private long f3228d;

        private a(x9 x9Var) {
        }

        private static long c(a1 a1Var) {
            return ((a1Var.V() / 1000) / 60) / 60;
        }

        public final boolean a(long j2, a1 a1Var) {
            r.k(a1Var);
            if (this.c == null) {
                this.c = new ArrayList();
            }
            if (this.b == null) {
                this.b = new ArrayList();
            }
            if (this.c.size() > 0 && c(this.c.get(0)) != c(a1Var)) {
                return false;
            }
            long d2 = this.f3228d + ((long) a1Var.d());
            if (d2 >= ((long) Math.max(0, u.f3138i.a(null).intValue()))) {
                return false;
            }
            this.f3228d = d2;
            this.c.add(a1Var);
            this.b.add(Long.valueOf(j2));
            if (this.c.size() >= Math.max(1, u.f3139j.a(null).intValue())) {
                return false;
            }
            return true;
        }

        public final void b(e1 e1Var) {
            r.k(e1Var);
            this.a = e1Var;
        }

        /* synthetic */ a(x9 x9Var, w9 w9Var) {
            this(x9Var);
        }
    }

    private x9(ca caVar) {
        this(caVar, (h5) null);
    }

    private final boolean D(int i2, FileChannel fileChannel) {
        n0();
        if (fileChannel == null || !fileChannel.isOpen()) {
            this.f3223j.i().E().a("Bad channel to read from");
            return false;
        }
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt(i2);
        allocate.flip();
        try {
            fileChannel.truncate(0);
            if (this.f3223j.c().s(u.u0) && Build.VERSION.SDK_INT <= 19) {
                fileChannel.position(0);
            }
            fileChannel.write(allocate);
            fileChannel.force(true);
            if (fileChannel.size() != 4) {
                this.f3223j.i().E().b("Error writing to channel. Bytes written", Long.valueOf(fileChannel.size()));
            }
            return true;
        } catch (IOException e2) {
            this.f3223j.i().E().b("Failed to write to channel", e2);
            return false;
        }
    }

    private final boolean E(a1.a aVar, a1.a aVar2) {
        String str;
        r.a("_e".equals(aVar.O()));
        d0();
        c1 y2 = ba.y((a1) ((z6) aVar.l()), "_sc");
        String str2 = null;
        if (y2 == null) {
            str = null;
        } else {
            str = y2.S();
        }
        d0();
        c1 y3 = ba.y((a1) ((z6) aVar2.l()), "_pc");
        if (y3 != null) {
            str2 = y3.S();
        }
        if (str2 == null || !str2.equals(str)) {
            return false;
        }
        N(aVar, aVar2);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0253, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0254, code lost:
        r5 = r1;
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0259, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x025a, code lost:
        r25 = "";
        r4 = r0;
        r6 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0253 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:4:0x0029] */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0272 A[SYNTHETIC, Splitter:B:133:0x0272] */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0279 A[Catch:{ IOException -> 0x022b, all -> 0x101c }] */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0287 A[Catch:{ IOException -> 0x022b, all -> 0x101c }] */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x045a A[Catch:{ IOException -> 0x022b, all -> 0x101c }] */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x045c A[Catch:{ IOException -> 0x022b, all -> 0x101c }] */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x045f A[Catch:{ IOException -> 0x022b, all -> 0x101c }] */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x0460 A[Catch:{ IOException -> 0x022b, all -> 0x101c }] */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x047f A[SYNTHETIC, Splitter:B:221:0x047f] */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x0519 A[Catch:{ IOException -> 0x022b, all -> 0x101c }] */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x0579 A[Catch:{ IOException -> 0x022b, all -> 0x101c }] */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x057d A[Catch:{ IOException -> 0x022b, all -> 0x101c }] */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x05e3 A[Catch:{ IOException -> 0x022b, all -> 0x101c }] */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x0613 A[Catch:{ IOException -> 0x022b, all -> 0x101c }] */
    /* JADX WARNING: Removed duplicated region for block: B:261:0x0630 A[Catch:{ IOException -> 0x022b, all -> 0x101c }] */
    /* JADX WARNING: Removed duplicated region for block: B:302:0x0724 A[Catch:{ IOException -> 0x022b, all -> 0x101c }] */
    /* JADX WARNING: Removed duplicated region for block: B:352:0x08bb A[Catch:{ IOException -> 0x022b, all -> 0x101c }] */
    /* JADX WARNING: Removed duplicated region for block: B:359:0x08d4 A[Catch:{ IOException -> 0x022b, all -> 0x101c }] */
    /* JADX WARNING: Removed duplicated region for block: B:360:0x08ee A[Catch:{ IOException -> 0x022b, all -> 0x101c }] */
    /* JADX WARNING: Removed duplicated region for block: B:493:0x0c6f A[Catch:{ IOException -> 0x022b, all -> 0x101c }] */
    /* JADX WARNING: Removed duplicated region for block: B:494:0x0c82 A[Catch:{ IOException -> 0x022b, all -> 0x101c }] */
    /* JADX WARNING: Removed duplicated region for block: B:496:0x0c85 A[Catch:{ IOException -> 0x022b, all -> 0x101c }] */
    /* JADX WARNING: Removed duplicated region for block: B:497:0x0cac A[SYNTHETIC, Splitter:B:497:0x0cac] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0118 A[Catch:{ SQLiteException -> 0x0249 }] */
    /* JADX WARNING: Removed duplicated region for block: B:608:0x0fff  */
    /* JADX WARNING: Removed duplicated region for block: B:616:0x1016 A[SYNTHETIC, Splitter:B:616:0x1016] */
    /* JADX WARNING: Removed duplicated region for block: B:634:0x04e0 A[EDGE_INSN: B:634:0x04e0->B:230:0x04e0 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x012f A[SYNTHETIC, Splitter:B:63:0x012f] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean F(java.lang.String r43, long r44) {
        /*
            r42 = this;
            r1 = r42
            java.lang.String r2 = "_npa"
            java.lang.String r3 = "_ai"
            java.lang.String r4 = ""
            com.google.android.gms.measurement.internal.d r5 = r42.Z()
            r5.t0()
            com.google.android.gms.measurement.internal.x9$a r5 = new com.google.android.gms.measurement.internal.x9$a     // Catch:{ all -> 0x101c }
            r6 = 0
            r5.<init>(r1, r6)     // Catch:{ all -> 0x101c }
            com.google.android.gms.measurement.internal.d r7 = r42.Z()     // Catch:{ all -> 0x101c }
            long r8 = r1.x     // Catch:{ all -> 0x101c }
            com.google.android.gms.common.internal.r.k(r5)     // Catch:{ all -> 0x101c }
            r7.c()     // Catch:{ all -> 0x101c }
            r7.r()     // Catch:{ all -> 0x101c }
            r11 = -1
            r13 = 2
            r14 = 0
            r15 = 1
            android.database.sqlite.SQLiteDatabase r10 = r7.v()     // Catch:{ SQLiteException -> 0x0259, all -> 0x0253 }
            boolean r16 = android.text.TextUtils.isEmpty(r6)     // Catch:{ SQLiteException -> 0x0259, all -> 0x0253 }
            if (r16 == 0) goto L_0x0095
            int r16 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r16 == 0) goto L_0x0046
            java.lang.String[] r6 = new java.lang.String[r13]     // Catch:{ SQLiteException -> 0x00a6, all -> 0x0253 }
            java.lang.String r17 = java.lang.String.valueOf(r8)     // Catch:{ SQLiteException -> 0x00a6, all -> 0x0253 }
            r6[r14] = r17     // Catch:{ SQLiteException -> 0x00a6, all -> 0x0253 }
            java.lang.String r17 = java.lang.String.valueOf(r44)     // Catch:{ SQLiteException -> 0x00a6, all -> 0x0253 }
            r6[r15] = r17     // Catch:{ SQLiteException -> 0x00a6, all -> 0x0253 }
            goto L_0x004e
        L_0x0046:
            java.lang.String[] r6 = new java.lang.String[r15]     // Catch:{ SQLiteException -> 0x00a6, all -> 0x0253 }
            java.lang.String r17 = java.lang.String.valueOf(r44)     // Catch:{ SQLiteException -> 0x00a6, all -> 0x0253 }
            r6[r14] = r17     // Catch:{ SQLiteException -> 0x00a6, all -> 0x0253 }
        L_0x004e:
            if (r16 == 0) goto L_0x0055
            java.lang.String r16 = "rowid <= ? and "
            r44 = r16
            goto L_0x0057
        L_0x0055:
            r44 = r4
        L_0x0057:
            int r13 = r44.length()     // Catch:{ SQLiteException -> 0x00a6, all -> 0x0253 }
            int r13 = r13 + 148
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x00a6, all -> 0x0253 }
            r11.<init>(r13)     // Catch:{ SQLiteException -> 0x00a6, all -> 0x0253 }
            java.lang.String r12 = "select app_id, metadata_fingerprint from raw_events where "
            r11.append(r12)     // Catch:{ SQLiteException -> 0x00a6, all -> 0x0253 }
            r12 = r44
            r11.append(r12)     // Catch:{ SQLiteException -> 0x00a6, all -> 0x0253 }
            java.lang.String r12 = "app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;"
            r11.append(r12)     // Catch:{ SQLiteException -> 0x00a6, all -> 0x0253 }
            java.lang.String r11 = r11.toString()     // Catch:{ SQLiteException -> 0x00a6, all -> 0x0253 }
            android.database.Cursor r6 = r10.rawQuery(r11, r6)     // Catch:{ SQLiteException -> 0x00a6, all -> 0x0253 }
            boolean r11 = r6.moveToFirst()     // Catch:{ SQLiteException -> 0x0091 }
            if (r11 != 0) goto L_0x0085
            if (r6 == 0) goto L_0x00e4
            r6.close()     // Catch:{ all -> 0x101c }
            goto L_0x00e4
        L_0x0085:
            java.lang.String r11 = r6.getString(r14)     // Catch:{ SQLiteException -> 0x0091 }
            java.lang.String r12 = r6.getString(r15)     // Catch:{ SQLiteException -> 0x0249 }
            r6.close()     // Catch:{ SQLiteException -> 0x0249 }
            goto L_0x00f0
        L_0x0091:
            r0 = move-exception
            r25 = r4
            goto L_0x00aa
        L_0x0095:
            int r6 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r6 == 0) goto L_0x00ae
            r11 = 2
            java.lang.String[] r12 = new java.lang.String[r11]     // Catch:{ SQLiteException -> 0x00a6, all -> 0x0253 }
            r11 = 0
            r12[r14] = r11     // Catch:{ SQLiteException -> 0x00a6, all -> 0x0253 }
            java.lang.String r11 = java.lang.String.valueOf(r8)     // Catch:{ SQLiteException -> 0x00a6, all -> 0x0253 }
            r12[r15] = r11     // Catch:{ SQLiteException -> 0x00a6, all -> 0x0253 }
            goto L_0x00b3
        L_0x00a6:
            r0 = move-exception
            r25 = r4
            r6 = 0
        L_0x00aa:
            r11 = 0
        L_0x00ab:
            r4 = r0
            goto L_0x025f
        L_0x00ae:
            r11 = 0
            java.lang.String[] r12 = new java.lang.String[]{r11}     // Catch:{ SQLiteException -> 0x0259, all -> 0x0253 }
        L_0x00b3:
            if (r6 == 0) goto L_0x00b8
            java.lang.String r6 = " and rowid <= ?"
            goto L_0x00b9
        L_0x00b8:
            r6 = r4
        L_0x00b9:
            int r11 = r6.length()     // Catch:{ SQLiteException -> 0x0259, all -> 0x0253 }
            int r11 = r11 + 84
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0259, all -> 0x0253 }
            r13.<init>(r11)     // Catch:{ SQLiteException -> 0x0259, all -> 0x0253 }
            java.lang.String r11 = "select metadata_fingerprint from raw_events where app_id = ?"
            r13.append(r11)     // Catch:{ SQLiteException -> 0x0259, all -> 0x0253 }
            r13.append(r6)     // Catch:{ SQLiteException -> 0x0259, all -> 0x0253 }
            java.lang.String r6 = " order by rowid limit 1;"
            r13.append(r6)     // Catch:{ SQLiteException -> 0x0259, all -> 0x0253 }
            java.lang.String r6 = r13.toString()     // Catch:{ SQLiteException -> 0x0259, all -> 0x0253 }
            android.database.Cursor r6 = r10.rawQuery(r6, r12)     // Catch:{ SQLiteException -> 0x0259, all -> 0x0253 }
            boolean r11 = r6.moveToFirst()     // Catch:{ SQLiteException -> 0x024e }
            if (r11 != 0) goto L_0x00e8
            if (r6 == 0) goto L_0x00e4
            r6.close()     // Catch:{ all -> 0x101c }
        L_0x00e4:
            r25 = r4
            goto L_0x0275
        L_0x00e8:
            java.lang.String r12 = r6.getString(r14)     // Catch:{ SQLiteException -> 0x024e }
            r6.close()     // Catch:{ SQLiteException -> 0x024e }
            r11 = 0
        L_0x00f0:
            java.lang.String r17 = "raw_events_metadata"
            java.lang.String r13 = "metadata"
            java.lang.String[] r18 = new java.lang.String[]{r13}     // Catch:{ SQLiteException -> 0x0249 }
            java.lang.String r19 = "app_id = ? and metadata_fingerprint = ?"
            r13 = 2
            java.lang.String[] r15 = new java.lang.String[r13]     // Catch:{ SQLiteException -> 0x0249 }
            r15[r14] = r11     // Catch:{ SQLiteException -> 0x0249 }
            r13 = 1
            r15[r13] = r12     // Catch:{ SQLiteException -> 0x0249 }
            r21 = 0
            r22 = 0
            java.lang.String r23 = "rowid"
            java.lang.String r24 = "2"
            r16 = r10
            r20 = r15
            android.database.Cursor r6 = r16.query(r17, r18, r19, r20, r21, r22, r23, r24)     // Catch:{ SQLiteException -> 0x0249 }
            boolean r13 = r6.moveToFirst()     // Catch:{ SQLiteException -> 0x0249 }
            if (r13 != 0) goto L_0x012f
            com.google.android.gms.measurement.internal.c4 r8 = r7.i()     // Catch:{ SQLiteException -> 0x0249 }
            com.google.android.gms.measurement.internal.e4 r8 = r8.E()     // Catch:{ SQLiteException -> 0x0249 }
            java.lang.String r9 = "Raw event metadata record is missing. appId"
            java.lang.Object r10 = com.google.android.gms.measurement.internal.c4.w(r11)     // Catch:{ SQLiteException -> 0x0249 }
            r8.b(r9, r10)     // Catch:{ SQLiteException -> 0x0249 }
            if (r6 == 0) goto L_0x00e4
            r6.close()     // Catch:{ all -> 0x101c }
            goto L_0x00e4
        L_0x012f:
            byte[] r13 = r6.getBlob(r14)     // Catch:{ SQLiteException -> 0x0249 }
            com.google.android.gms.internal.measurement.e1$a r15 = com.google.android.gms.internal.measurement.e1.P0()     // Catch:{ IOException -> 0x022b }
            com.google.android.gms.measurement.internal.ba.z(r15, r13)     // Catch:{ IOException -> 0x022b }
            com.google.android.gms.internal.measurement.e1$a r15 = (com.google.android.gms.internal.measurement.e1.a) r15     // Catch:{ IOException -> 0x022b }
            com.google.android.gms.internal.measurement.j8 r13 = r15.l()     // Catch:{ IOException -> 0x022b }
            com.google.android.gms.internal.measurement.z6 r13 = (com.google.android.gms.internal.measurement.z6) r13     // Catch:{ IOException -> 0x022b }
            com.google.android.gms.internal.measurement.e1 r13 = (com.google.android.gms.internal.measurement.e1) r13     // Catch:{ IOException -> 0x022b }
            boolean r15 = r6.moveToNext()     // Catch:{ SQLiteException -> 0x0249 }
            if (r15 == 0) goto L_0x015e
            com.google.android.gms.measurement.internal.c4 r15 = r7.i()     // Catch:{ SQLiteException -> 0x0249 }
            com.google.android.gms.measurement.internal.e4 r15 = r15.H()     // Catch:{ SQLiteException -> 0x0249 }
            java.lang.String r14 = "Get multiple raw event metadata records, expected one. appId"
            r25 = r4
            java.lang.Object r4 = com.google.android.gms.measurement.internal.c4.w(r11)     // Catch:{ SQLiteException -> 0x0246 }
            r15.b(r14, r4)     // Catch:{ SQLiteException -> 0x0246 }
            goto L_0x0160
        L_0x015e:
            r25 = r4
        L_0x0160:
            r6.close()     // Catch:{ SQLiteException -> 0x0246 }
            r5.b(r13)     // Catch:{ SQLiteException -> 0x0246 }
            r13 = -1
            int r4 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r4 == 0) goto L_0x0183
            java.lang.String r4 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?"
            r13 = 3
            java.lang.String[] r14 = new java.lang.String[r13]     // Catch:{ SQLiteException -> 0x0246 }
            r13 = 0
            r14[r13] = r11     // Catch:{ SQLiteException -> 0x0246 }
            r13 = 1
            r14[r13] = r12     // Catch:{ SQLiteException -> 0x0246 }
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ SQLiteException -> 0x0246 }
            r9 = 2
            r14[r9] = r8     // Catch:{ SQLiteException -> 0x0246 }
            r19 = r4
            r20 = r14
            goto L_0x0192
        L_0x0183:
            java.lang.String r4 = "app_id = ? and metadata_fingerprint = ?"
            r8 = 2
            java.lang.String[] r9 = new java.lang.String[r8]     // Catch:{ SQLiteException -> 0x0246 }
            r8 = 0
            r9[r8] = r11     // Catch:{ SQLiteException -> 0x0246 }
            r8 = 1
            r9[r8] = r12     // Catch:{ SQLiteException -> 0x0246 }
            r19 = r4
            r20 = r9
        L_0x0192:
            java.lang.String r17 = "raw_events"
            java.lang.String r4 = "rowid"
            java.lang.String r8 = "name"
            java.lang.String r9 = "timestamp"
            java.lang.String r12 = "data"
            java.lang.String[] r18 = new java.lang.String[]{r4, r8, r9, r12}     // Catch:{ SQLiteException -> 0x0246 }
            r21 = 0
            r22 = 0
            java.lang.String r23 = "rowid"
            r24 = 0
            r16 = r10
            android.database.Cursor r4 = r16.query(r17, r18, r19, r20, r21, r22, r23, r24)     // Catch:{ SQLiteException -> 0x0246 }
            boolean r6 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x0227, all -> 0x0223 }
            if (r6 != 0) goto L_0x01cc
            com.google.android.gms.measurement.internal.c4 r6 = r7.i()     // Catch:{ SQLiteException -> 0x0227, all -> 0x0223 }
            com.google.android.gms.measurement.internal.e4 r6 = r6.H()     // Catch:{ SQLiteException -> 0x0227, all -> 0x0223 }
            java.lang.String r8 = "Raw event data disappeared while in transaction. appId"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.c4.w(r11)     // Catch:{ SQLiteException -> 0x0227, all -> 0x0223 }
            r6.b(r8, r9)     // Catch:{ SQLiteException -> 0x0227, all -> 0x0223 }
            if (r4 == 0) goto L_0x0275
            r4.close()     // Catch:{ all -> 0x101c }
            goto L_0x0275
        L_0x01cc:
            r6 = 0
            long r8 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x0227, all -> 0x0223 }
            r6 = 3
            byte[] r10 = r4.getBlob(r6)     // Catch:{ SQLiteException -> 0x0227, all -> 0x0223 }
            com.google.android.gms.internal.measurement.a1$a r6 = com.google.android.gms.internal.measurement.a1.b0()     // Catch:{ IOException -> 0x0204 }
            com.google.android.gms.measurement.internal.ba.z(r6, r10)     // Catch:{ IOException -> 0x0204 }
            com.google.android.gms.internal.measurement.a1$a r6 = (com.google.android.gms.internal.measurement.a1.a) r6     // Catch:{ IOException -> 0x0204 }
            r10 = 1
            java.lang.String r12 = r4.getString(r10)     // Catch:{ SQLiteException -> 0x0227, all -> 0x0223 }
            r6.F(r12)     // Catch:{ SQLiteException -> 0x0227, all -> 0x0223 }
            r10 = 2
            long r12 = r4.getLong(r10)     // Catch:{ SQLiteException -> 0x0227, all -> 0x0223 }
            r6.B(r12)     // Catch:{ SQLiteException -> 0x0227, all -> 0x0223 }
            com.google.android.gms.internal.measurement.j8 r6 = r6.l()     // Catch:{ SQLiteException -> 0x0227, all -> 0x0223 }
            com.google.android.gms.internal.measurement.z6 r6 = (com.google.android.gms.internal.measurement.z6) r6     // Catch:{ SQLiteException -> 0x0227, all -> 0x0223 }
            com.google.android.gms.internal.measurement.a1 r6 = (com.google.android.gms.internal.measurement.a1) r6     // Catch:{ SQLiteException -> 0x0227, all -> 0x0223 }
            boolean r6 = r5.a(r8, r6)     // Catch:{ SQLiteException -> 0x0227, all -> 0x0223 }
            if (r6 != 0) goto L_0x0217
            if (r4 == 0) goto L_0x0275
            r4.close()     // Catch:{ all -> 0x101c }
            goto L_0x0275
        L_0x0204:
            r0 = move-exception
            r6 = r0
            com.google.android.gms.measurement.internal.c4 r8 = r7.i()     // Catch:{ SQLiteException -> 0x0227, all -> 0x0223 }
            com.google.android.gms.measurement.internal.e4 r8 = r8.E()     // Catch:{ SQLiteException -> 0x0227, all -> 0x0223 }
            java.lang.String r9 = "Data loss. Failed to merge raw event. appId"
            java.lang.Object r10 = com.google.android.gms.measurement.internal.c4.w(r11)     // Catch:{ SQLiteException -> 0x0227, all -> 0x0223 }
            r8.c(r9, r10, r6)     // Catch:{ SQLiteException -> 0x0227, all -> 0x0223 }
        L_0x0217:
            boolean r6 = r4.moveToNext()     // Catch:{ SQLiteException -> 0x0227, all -> 0x0223 }
            if (r6 != 0) goto L_0x01cc
            if (r4 == 0) goto L_0x0275
            r4.close()     // Catch:{ all -> 0x101c }
            goto L_0x0275
        L_0x0223:
            r0 = move-exception
            r5 = r1
            r6 = r4
            goto L_0x0256
        L_0x0227:
            r0 = move-exception
            r6 = r4
            goto L_0x00ab
        L_0x022b:
            r0 = move-exception
            r25 = r4
            r4 = r0
            com.google.android.gms.measurement.internal.c4 r8 = r7.i()     // Catch:{ SQLiteException -> 0x0246 }
            com.google.android.gms.measurement.internal.e4 r8 = r8.E()     // Catch:{ SQLiteException -> 0x0246 }
            java.lang.String r9 = "Data loss. Failed to merge raw event metadata. appId"
            java.lang.Object r10 = com.google.android.gms.measurement.internal.c4.w(r11)     // Catch:{ SQLiteException -> 0x0246 }
            r8.c(r9, r10, r4)     // Catch:{ SQLiteException -> 0x0246 }
            if (r6 == 0) goto L_0x0275
            r6.close()     // Catch:{ all -> 0x101c }
            goto L_0x0275
        L_0x0246:
            r0 = move-exception
            goto L_0x00ab
        L_0x0249:
            r0 = move-exception
            r25 = r4
            goto L_0x00ab
        L_0x024e:
            r0 = move-exception
            r25 = r4
            r4 = r0
            goto L_0x025e
        L_0x0253:
            r0 = move-exception
            r5 = r1
            r6 = 0
        L_0x0256:
            r1 = r0
            goto L_0x1014
        L_0x0259:
            r0 = move-exception
            r25 = r4
            r4 = r0
            r6 = 0
        L_0x025e:
            r11 = 0
        L_0x025f:
            com.google.android.gms.measurement.internal.c4 r7 = r7.i()     // Catch:{ all -> 0x1010 }
            com.google.android.gms.measurement.internal.e4 r7 = r7.E()     // Catch:{ all -> 0x1010 }
            java.lang.String r8 = "Data loss. Error selecting raw event. appId"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.c4.w(r11)     // Catch:{ all -> 0x1010 }
            r7.c(r8, r9, r4)     // Catch:{ all -> 0x1010 }
            if (r6 == 0) goto L_0x0275
            r6.close()     // Catch:{ all -> 0x101c }
        L_0x0275:
            java.util.List<com.google.android.gms.internal.measurement.a1> r4 = r5.c     // Catch:{ all -> 0x101c }
            if (r4 == 0) goto L_0x0284
            java.util.List<com.google.android.gms.internal.measurement.a1> r4 = r5.c     // Catch:{ all -> 0x101c }
            boolean r4 = r4.isEmpty()     // Catch:{ all -> 0x101c }
            if (r4 == 0) goto L_0x0282
            goto L_0x0284
        L_0x0282:
            r4 = 0
            goto L_0x0285
        L_0x0284:
            r4 = 1
        L_0x0285:
            if (r4 != 0) goto L_0x0fff
            com.google.android.gms.internal.measurement.e1 r4 = r5.a     // Catch:{ all -> 0x101c }
            com.google.android.gms.internal.measurement.z6$b r4 = r4.x()     // Catch:{ all -> 0x101c }
            com.google.android.gms.internal.measurement.e1$a r4 = (com.google.android.gms.internal.measurement.e1.a) r4     // Catch:{ all -> 0x101c }
            r4.R()     // Catch:{ all -> 0x101c }
            com.google.android.gms.measurement.internal.h5 r6 = r1.f3223j     // Catch:{ all -> 0x101c }
            com.google.android.gms.measurement.internal.wa r6 = r6.c()     // Catch:{ all -> 0x101c }
            com.google.android.gms.internal.measurement.e1 r7 = r5.a     // Catch:{ all -> 0x101c }
            java.lang.String r7 = r7.U2()     // Catch:{ all -> 0x101c }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r8 = com.google.android.gms.measurement.internal.u.V     // Catch:{ all -> 0x101c }
            boolean r6 = r6.C(r7, r8)     // Catch:{ all -> 0x101c }
            r7 = -1
            r8 = -1
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
        L_0x02ad:
            java.util.List<com.google.android.gms.internal.measurement.a1> r9 = r5.c     // Catch:{ all -> 0x101c }
            int r9 = r9.size()     // Catch:{ all -> 0x101c }
            r18 = r13
            java.lang.String r13 = "_fr"
            r19 = r2
            java.lang.String r2 = "_et"
            r20 = r14
            java.lang.String r14 = "_e"
            r21 = r6
            r22 = r7
            if (r12 >= r9) goto L_0x0948
            java.util.List<com.google.android.gms.internal.measurement.a1> r9 = r5.c     // Catch:{ all -> 0x101c }
            java.lang.Object r9 = r9.get(r12)     // Catch:{ all -> 0x101c }
            com.google.android.gms.internal.measurement.a1 r9 = (com.google.android.gms.internal.measurement.a1) r9     // Catch:{ all -> 0x101c }
            com.google.android.gms.internal.measurement.z6$b r9 = r9.x()     // Catch:{ all -> 0x101c }
            com.google.android.gms.internal.measurement.a1$a r9 = (com.google.android.gms.internal.measurement.a1.a) r9     // Catch:{ all -> 0x101c }
            com.google.android.gms.measurement.internal.b5 r6 = r42.V()     // Catch:{ all -> 0x101c }
            com.google.android.gms.internal.measurement.e1 r7 = r5.a     // Catch:{ all -> 0x101c }
            java.lang.String r7 = r7.U2()     // Catch:{ all -> 0x101c }
            r26 = r12
            java.lang.String r12 = r9.O()     // Catch:{ all -> 0x101c }
            boolean r6 = r6.A(r7, r12)     // Catch:{ all -> 0x101c }
            java.lang.String r7 = "_err"
            if (r6 == 0) goto L_0x0369
            com.google.android.gms.measurement.internal.h5 r2 = r1.f3223j     // Catch:{ all -> 0x101c }
            com.google.android.gms.measurement.internal.c4 r2 = r2.i()     // Catch:{ all -> 0x101c }
            com.google.android.gms.measurement.internal.e4 r2 = r2.H()     // Catch:{ all -> 0x101c }
            java.lang.String r6 = "Dropping blacklisted raw event. appId"
            com.google.android.gms.internal.measurement.e1 r12 = r5.a     // Catch:{ all -> 0x101c }
            java.lang.String r12 = r12.U2()     // Catch:{ all -> 0x101c }
            java.lang.Object r12 = com.google.android.gms.measurement.internal.c4.w(r12)     // Catch:{ all -> 0x101c }
            com.google.android.gms.measurement.internal.h5 r13 = r1.f3223j     // Catch:{ all -> 0x101c }
            com.google.android.gms.measurement.internal.a4 r13 = r13.H()     // Catch:{ all -> 0x101c }
            java.lang.String r14 = r9.O()     // Catch:{ all -> 0x101c }
            java.lang.String r13 = r13.v(r14)     // Catch:{ all -> 0x101c }
            r2.c(r6, r12, r13)     // Catch:{ all -> 0x101c }
            com.google.android.gms.measurement.internal.b5 r2 = r42.V()     // Catch:{ all -> 0x101c }
            com.google.android.gms.internal.measurement.e1 r6 = r5.a     // Catch:{ all -> 0x101c }
            java.lang.String r6 = r6.U2()     // Catch:{ all -> 0x101c }
            boolean r2 = r2.H(r6)     // Catch:{ all -> 0x101c }
            if (r2 != 0) goto L_0x0335
            com.google.android.gms.measurement.internal.b5 r2 = r42.V()     // Catch:{ all -> 0x101c }
            com.google.android.gms.internal.measurement.e1 r6 = r5.a     // Catch:{ all -> 0x101c }
            java.lang.String r6 = r6.U2()     // Catch:{ all -> 0x101c }
            boolean r2 = r2.I(r6)     // Catch:{ all -> 0x101c }
            if (r2 == 0) goto L_0x0333
            goto L_0x0335
        L_0x0333:
            r2 = 0
            goto L_0x0336
        L_0x0335:
            r2 = 1
        L_0x0336:
            if (r2 != 0) goto L_0x035b
            java.lang.String r2 = r9.O()     // Catch:{ all -> 0x101c }
            boolean r2 = r7.equals(r2)     // Catch:{ all -> 0x101c }
            if (r2 != 0) goto L_0x035b
            com.google.android.gms.measurement.internal.h5 r2 = r1.f3223j     // Catch:{ all -> 0x101c }
            com.google.android.gms.measurement.internal.fa r27 = r2.G()     // Catch:{ all -> 0x101c }
            com.google.android.gms.internal.measurement.e1 r2 = r5.a     // Catch:{ all -> 0x101c }
            java.lang.String r28 = r2.U2()     // Catch:{ all -> 0x101c }
            r29 = 11
            java.lang.String r30 = "_ev"
            java.lang.String r31 = r9.O()     // Catch:{ all -> 0x101c }
            r32 = 0
            r27.W(r28, r29, r30, r31, r32)     // Catch:{ all -> 0x101c }
        L_0x035b:
            r27 = r15
            r13 = r18
            r14 = r20
            r7 = r22
            r6 = r26
            r16 = r3
            goto L_0x093c
        L_0x0369:
            boolean r6 = com.google.android.gms.internal.measurement.ma.a()     // Catch:{ all -> 0x101c }
            if (r6 == 0) goto L_0x03f9
            com.google.android.gms.measurement.internal.h5 r6 = r1.f3223j     // Catch:{ all -> 0x101c }
            com.google.android.gms.measurement.internal.wa r6 = r6.c()     // Catch:{ all -> 0x101c }
            com.google.android.gms.internal.measurement.e1 r12 = r5.a     // Catch:{ all -> 0x101c }
            java.lang.String r12 = r12.U2()     // Catch:{ all -> 0x101c }
            r27 = r15
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r15 = com.google.android.gms.measurement.internal.u.T0     // Catch:{ all -> 0x101c }
            boolean r6 = r6.C(r12, r15)     // Catch:{ all -> 0x101c }
            if (r6 == 0) goto L_0x03fb
            java.lang.String r6 = r9.O()     // Catch:{ all -> 0x101c }
            java.lang.String r12 = com.google.android.gms.measurement.internal.e6.a(r3)     // Catch:{ all -> 0x101c }
            boolean r6 = r6.equals(r12)     // Catch:{ all -> 0x101c }
            if (r6 == 0) goto L_0x03fb
            r9.F(r3)     // Catch:{ all -> 0x101c }
            com.google.android.gms.measurement.internal.h5 r6 = r1.f3223j     // Catch:{ all -> 0x101c }
            com.google.android.gms.measurement.internal.c4 r6 = r6.i()     // Catch:{ all -> 0x101c }
            com.google.android.gms.measurement.internal.e4 r6 = r6.M()     // Catch:{ all -> 0x101c }
            java.lang.String r12 = "Renaming ad_impression to _ai"
            r6.a(r12)     // Catch:{ all -> 0x101c }
            com.google.android.gms.measurement.internal.h5 r6 = r1.f3223j     // Catch:{ all -> 0x101c }
            com.google.android.gms.measurement.internal.c4 r6 = r6.i()     // Catch:{ all -> 0x101c }
            r12 = 5
            boolean r6 = r6.B(r12)     // Catch:{ all -> 0x101c }
            if (r6 == 0) goto L_0x03fb
            r6 = 0
        L_0x03b3:
            int r12 = r9.I()     // Catch:{ all -> 0x101c }
            if (r6 >= r12) goto L_0x03fb
            java.lang.String r12 = "ad_platform"
            com.google.android.gms.internal.measurement.c1 r15 = r9.G(r6)     // Catch:{ all -> 0x101c }
            java.lang.String r15 = r15.M()     // Catch:{ all -> 0x101c }
            boolean r12 = r12.equals(r15)     // Catch:{ all -> 0x101c }
            if (r12 == 0) goto L_0x03f6
            com.google.android.gms.internal.measurement.c1 r12 = r9.G(r6)     // Catch:{ all -> 0x101c }
            java.lang.String r12 = r12.S()     // Catch:{ all -> 0x101c }
            boolean r12 = android.text.TextUtils.isEmpty(r12)     // Catch:{ all -> 0x101c }
            if (r12 != 0) goto L_0x03f6
            java.lang.String r12 = "admob"
            com.google.android.gms.internal.measurement.c1 r15 = r9.G(r6)     // Catch:{ all -> 0x101c }
            java.lang.String r15 = r15.S()     // Catch:{ all -> 0x101c }
            boolean r12 = r12.equalsIgnoreCase(r15)     // Catch:{ all -> 0x101c }
            if (r12 == 0) goto L_0x03f6
            com.google.android.gms.measurement.internal.h5 r12 = r1.f3223j     // Catch:{ all -> 0x101c }
            com.google.android.gms.measurement.internal.c4 r12 = r12.i()     // Catch:{ all -> 0x101c }
            com.google.android.gms.measurement.internal.e4 r12 = r12.J()     // Catch:{ all -> 0x101c }
            java.lang.String r15 = "AdMob ad impression logged from app. Potentially duplicative."
            r12.a(r15)     // Catch:{ all -> 0x101c }
        L_0x03f6:
            int r6 = r6 + 1
            goto L_0x03b3
        L_0x03f9:
            r27 = r15
        L_0x03fb:
            com.google.android.gms.measurement.internal.b5 r6 = r42.V()     // Catch:{ all -> 0x101c }
            com.google.android.gms.internal.measurement.e1 r12 = r5.a     // Catch:{ all -> 0x101c }
            java.lang.String r12 = r12.U2()     // Catch:{ all -> 0x101c }
            java.lang.String r15 = r9.O()     // Catch:{ all -> 0x101c }
            boolean r6 = r6.C(r12, r15)     // Catch:{ all -> 0x101c }
            java.lang.String r12 = "_c"
            if (r6 != 0) goto L_0x046c
            r42.d0()     // Catch:{ all -> 0x101c }
            java.lang.String r15 = r9.O()     // Catch:{ all -> 0x101c }
            com.google.android.gms.common.internal.r.g(r15)     // Catch:{ all -> 0x101c }
            r16 = r3
            int r3 = r15.hashCode()     // Catch:{ all -> 0x101c }
            r29 = r10
            r10 = 94660(0x171c4, float:1.32647E-40)
            if (r3 == r10) goto L_0x0447
            r10 = 95025(0x17331, float:1.33158E-40)
            if (r3 == r10) goto L_0x043d
            r10 = 95027(0x17333, float:1.33161E-40)
            if (r3 == r10) goto L_0x0433
            goto L_0x0451
        L_0x0433:
            java.lang.String r3 = "_ui"
            boolean r3 = r15.equals(r3)     // Catch:{ all -> 0x101c }
            if (r3 == 0) goto L_0x0451
            r3 = 1
            goto L_0x0452
        L_0x043d:
            java.lang.String r3 = "_ug"
            boolean r3 = r15.equals(r3)     // Catch:{ all -> 0x101c }
            if (r3 == 0) goto L_0x0451
            r3 = 2
            goto L_0x0452
        L_0x0447:
            java.lang.String r3 = "_in"
            boolean r3 = r15.equals(r3)     // Catch:{ all -> 0x101c }
            if (r3 == 0) goto L_0x0451
            r3 = 0
            goto L_0x0452
        L_0x0451:
            r3 = -1
        L_0x0452:
            if (r3 == 0) goto L_0x045c
            r10 = 1
            if (r3 == r10) goto L_0x045c
            r10 = 2
            if (r3 == r10) goto L_0x045c
            r3 = 0
            goto L_0x045d
        L_0x045c:
            r3 = 1
        L_0x045d:
            if (r3 == 0) goto L_0x0460
            goto L_0x0470
        L_0x0460:
            r30 = r2
            r31 = r4
            r32 = r11
            r10 = r13
            r11 = r14
        L_0x0468:
            r13 = r18
            goto L_0x064b
        L_0x046c:
            r16 = r3
            r29 = r10
        L_0x0470:
            r30 = r2
            r3 = 0
            r10 = 0
            r15 = 0
        L_0x0475:
            int r2 = r9.I()     // Catch:{ all -> 0x101c }
            r31 = r4
            java.lang.String r4 = "_r"
            if (r15 >= r2) goto L_0x04e0
            com.google.android.gms.internal.measurement.c1 r2 = r9.G(r15)     // Catch:{ all -> 0x101c }
            java.lang.String r2 = r2.M()     // Catch:{ all -> 0x101c }
            boolean r2 = r12.equals(r2)     // Catch:{ all -> 0x101c }
            if (r2 == 0) goto L_0x04ab
            com.google.android.gms.internal.measurement.c1 r2 = r9.G(r15)     // Catch:{ all -> 0x101c }
            com.google.android.gms.internal.measurement.z6$b r2 = r2.x()     // Catch:{ all -> 0x101c }
            com.google.android.gms.internal.measurement.c1$a r2 = (com.google.android.gms.internal.measurement.c1.a) r2     // Catch:{ all -> 0x101c }
            r3 = 1
            r2.B(r3)     // Catch:{ all -> 0x101c }
            com.google.android.gms.internal.measurement.j8 r2 = r2.l()     // Catch:{ all -> 0x101c }
            com.google.android.gms.internal.measurement.z6 r2 = (com.google.android.gms.internal.measurement.z6) r2     // Catch:{ all -> 0x101c }
            com.google.android.gms.internal.measurement.c1 r2 = (com.google.android.gms.internal.measurement.c1) r2     // Catch:{ all -> 0x101c }
            r9.A(r15, r2)     // Catch:{ all -> 0x101c }
            r32 = r11
            r3 = 1
            goto L_0x04d9
        L_0x04ab:
            com.google.android.gms.internal.measurement.c1 r2 = r9.G(r15)     // Catch:{ all -> 0x101c }
            java.lang.String r2 = r2.M()     // Catch:{ all -> 0x101c }
            boolean r2 = r4.equals(r2)     // Catch:{ all -> 0x101c }
            if (r2 == 0) goto L_0x04d7
            com.google.android.gms.internal.measurement.c1 r2 = r9.G(r15)     // Catch:{ all -> 0x101c }
            com.google.android.gms.internal.measurement.z6$b r2 = r2.x()     // Catch:{ all -> 0x101c }
            com.google.android.gms.internal.measurement.c1$a r2 = (com.google.android.gms.internal.measurement.c1.a) r2     // Catch:{ all -> 0x101c }
            r32 = r11
            r10 = 1
            r2.B(r10)     // Catch:{ all -> 0x101c }
            com.google.android.gms.internal.measurement.j8 r2 = r2.l()     // Catch:{ all -> 0x101c }
            com.google.android.gms.internal.measurement.z6 r2 = (com.google.android.gms.internal.measurement.z6) r2     // Catch:{ all -> 0x101c }
            com.google.android.gms.internal.measurement.c1 r2 = (com.google.android.gms.internal.measurement.c1) r2     // Catch:{ all -> 0x101c }
            r9.A(r15, r2)     // Catch:{ all -> 0x101c }
            r10 = 1
            goto L_0x04d9
        L_0x04d7:
            r32 = r11
        L_0x04d9:
            int r15 = r15 + 1
            r4 = r31
            r11 = r32
            goto L_0x0475
        L_0x04e0:
            r32 = r11
            if (r3 != 0) goto L_0x0515
            if (r6 == 0) goto L_0x0515
            com.google.android.gms.measurement.internal.h5 r2 = r1.f3223j     // Catch:{ all -> 0x101c }
            com.google.android.gms.measurement.internal.c4 r2 = r2.i()     // Catch:{ all -> 0x101c }
            com.google.android.gms.measurement.internal.e4 r2 = r2.M()     // Catch:{ all -> 0x101c }
            java.lang.String r3 = "Marking event as conversion"
            com.google.android.gms.measurement.internal.h5 r11 = r1.f3223j     // Catch:{ all -> 0x101c }
            com.google.android.gms.measurement.internal.a4 r11 = r11.H()     // Catch:{ all -> 0x101c }
            java.lang.String r15 = r9.O()     // Catch:{ all -> 0x101c }
            java.lang.String r11 = r11.v(r15)     // Catch:{ all -> 0x101c }
            r2.b(r3, r11)     // Catch:{ all -> 0x101c }
            com.google.android.gms.internal.measurement.c1$a r2 = com.google.android.gms.internal.measurement.c1.e0()     // Catch:{ all -> 0x101c }
            r2.E(r12)     // Catch:{ all -> 0x101c }
            r3 = r13
            r11 = r14
            r13 = 1
            r2.B(r13)     // Catch:{ all -> 0x101c }
            r9.C(r2)     // Catch:{ all -> 0x101c }
            goto L_0x0517
        L_0x0515:
            r3 = r13
            r11 = r14
        L_0x0517:
            if (r10 != 0) goto L_0x0545
            com.google.android.gms.measurement.internal.h5 r2 = r1.f3223j     // Catch:{ all -> 0x101c }
            com.google.android.gms.measurement.internal.c4 r2 = r2.i()     // Catch:{ all -> 0x101c }
            com.google.android.gms.measurement.internal.e4 r2 = r2.M()     // Catch:{ all -> 0x101c }
            java.lang.String r10 = "Marking event as real-time"
            com.google.android.gms.measurement.internal.h5 r13 = r1.f3223j     // Catch:{ all -> 0x101c }
            com.google.android.gms.measurement.internal.a4 r13 = r13.H()     // Catch:{ all -> 0x101c }
            java.lang.String r14 = r9.O()     // Catch:{ all -> 0x101c }
            java.lang.String r13 = r13.v(r14)     // Catch:{ all -> 0x101c }
            r2.b(r10, r13)     // Catch:{ all -> 0x101c }
            com.google.android.gms.internal.measurement.c1$a r2 = com.google.android.gms.internal.measurement.c1.e0()     // Catch:{ all -> 0x101c }
            r2.E(r4)     // Catch:{ all -> 0x101c }
            r13 = 1
            r2.B(r13)     // Catch:{ all -> 0x101c }
            r9.C(r2)     // Catch:{ all -> 0x101c }
        L_0x0545:
            com.google.android.gms.measurement.internal.d r33 = r42.Z()     // Catch:{ all -> 0x101c }
            long r34 = r42.o0()     // Catch:{ all -> 0x101c }
            com.google.android.gms.internal.measurement.e1 r2 = r5.a     // Catch:{ all -> 0x101c }
            java.lang.String r36 = r2.U2()     // Catch:{ all -> 0x101c }
            r37 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r41 = 1
            com.google.android.gms.measurement.internal.g r2 = r33.C(r34, r36, r37, r38, r39, r40, r41)     // Catch:{ all -> 0x101c }
            long r13 = r2.f2850e     // Catch:{ all -> 0x101c }
            com.google.android.gms.measurement.internal.h5 r2 = r1.f3223j     // Catch:{ all -> 0x101c }
            com.google.android.gms.measurement.internal.wa r2 = r2.c()     // Catch:{ all -> 0x101c }
            com.google.android.gms.internal.measurement.e1 r10 = r5.a     // Catch:{ all -> 0x101c }
            java.lang.String r10 = r10.U2()     // Catch:{ all -> 0x101c }
            int r2 = r2.w(r10)     // Catch:{ all -> 0x101c }
            r10 = r3
            long r2 = (long) r2     // Catch:{ all -> 0x101c }
            int r15 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r15 <= 0) goto L_0x057d
            m(r9, r4)     // Catch:{ all -> 0x101c }
            goto L_0x057f
        L_0x057d:
            r18 = 1
        L_0x057f:
            java.lang.String r2 = r9.O()     // Catch:{ all -> 0x101c }
            boolean r2 = com.google.android.gms.measurement.internal.fa.d0(r2)     // Catch:{ all -> 0x101c }
            if (r2 == 0) goto L_0x0468
            if (r6 == 0) goto L_0x0468
            com.google.android.gms.measurement.internal.d r33 = r42.Z()     // Catch:{ all -> 0x101c }
            long r34 = r42.o0()     // Catch:{ all -> 0x101c }
            com.google.android.gms.internal.measurement.e1 r2 = r5.a     // Catch:{ all -> 0x101c }
            java.lang.String r36 = r2.U2()     // Catch:{ all -> 0x101c }
            r37 = 0
            r38 = 0
            r39 = 1
            r40 = 0
            r41 = 0
            com.google.android.gms.measurement.internal.g r2 = r33.C(r34, r36, r37, r38, r39, r40, r41)     // Catch:{ all -> 0x101c }
            long r2 = r2.c     // Catch:{ all -> 0x101c }
            com.google.android.gms.measurement.internal.h5 r4 = r1.f3223j     // Catch:{ all -> 0x101c }
            com.google.android.gms.measurement.internal.wa r4 = r4.c()     // Catch:{ all -> 0x101c }
            com.google.android.gms.internal.measurement.e1 r13 = r5.a     // Catch:{ all -> 0x101c }
            java.lang.String r13 = r13.U2()     // Catch:{ all -> 0x101c }
            com.google.android.gms.measurement.internal.r3<java.lang.Integer> r14 = com.google.android.gms.measurement.internal.u.f3143n     // Catch:{ all -> 0x101c }
            int r4 = r4.u(r13, r14)     // Catch:{ all -> 0x101c }
            long r13 = (long) r4     // Catch:{ all -> 0x101c }
            int r4 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r4 <= 0) goto L_0x0468
            com.google.android.gms.measurement.internal.h5 r2 = r1.f3223j     // Catch:{ all -> 0x101c }
            com.google.android.gms.measurement.internal.c4 r2 = r2.i()     // Catch:{ all -> 0x101c }
            com.google.android.gms.measurement.internal.e4 r2 = r2.H()     // Catch:{ all -> 0x101c }
            java.lang.String r3 = "Too many conversions. Not logging as conversion. appId"
            com.google.android.gms.internal.measurement.e1 r4 = r5.a     // Catch:{ all -> 0x101c }
            java.lang.String r4 = r4.U2()     // Catch:{ all -> 0x101c }
            java.lang.Object r4 = com.google.android.gms.measurement.internal.c4.w(r4)     // Catch:{ all -> 0x101c }
            r2.b(r3, r4)     // Catch:{ all -> 0x101c }
            r2 = -1
            r3 = 0
            r4 = 0
            r13 = 0
        L_0x05dd:
            int r14 = r9.I()     // Catch:{ all -> 0x101c }
            if (r13 >= r14) goto L_0x0608
            com.google.android.gms.internal.measurement.c1 r14 = r9.G(r13)     // Catch:{ all -> 0x101c }
            java.lang.String r15 = r14.M()     // Catch:{ all -> 0x101c }
            boolean r15 = r12.equals(r15)     // Catch:{ all -> 0x101c }
            if (r15 == 0) goto L_0x05fa
            com.google.android.gms.internal.measurement.z6$b r2 = r14.x()     // Catch:{ all -> 0x101c }
            com.google.android.gms.internal.measurement.c1$a r2 = (com.google.android.gms.internal.measurement.c1.a) r2     // Catch:{ all -> 0x101c }
            r3 = r2
            r2 = r13
            goto L_0x0605
        L_0x05fa:
            java.lang.String r14 = r14.M()     // Catch:{ all -> 0x101c }
            boolean r14 = r7.equals(r14)     // Catch:{ all -> 0x101c }
            if (r14 == 0) goto L_0x0605
            r4 = 1
        L_0x0605:
            int r13 = r13 + 1
            goto L_0x05dd
        L_0x0608:
            if (r4 == 0) goto L_0x0611
            if (r3 == 0) goto L_0x0611
            r9.J(r2)     // Catch:{ all -> 0x101c }
            goto L_0x0468
        L_0x0611:
            if (r3 == 0) goto L_0x0630
            java.lang.Object r3 = r3.clone()     // Catch:{ all -> 0x101c }
            com.google.android.gms.internal.measurement.z6$b r3 = (com.google.android.gms.internal.measurement.z6.b) r3     // Catch:{ all -> 0x101c }
            com.google.android.gms.internal.measurement.c1$a r3 = (com.google.android.gms.internal.measurement.c1.a) r3     // Catch:{ all -> 0x101c }
            r3.E(r7)     // Catch:{ all -> 0x101c }
            r13 = 10
            r3.B(r13)     // Catch:{ all -> 0x101c }
            com.google.android.gms.internal.measurement.j8 r3 = r3.l()     // Catch:{ all -> 0x101c }
            com.google.android.gms.internal.measurement.z6 r3 = (com.google.android.gms.internal.measurement.z6) r3     // Catch:{ all -> 0x101c }
            com.google.android.gms.internal.measurement.c1 r3 = (com.google.android.gms.internal.measurement.c1) r3     // Catch:{ all -> 0x101c }
            r9.A(r2, r3)     // Catch:{ all -> 0x101c }
            goto L_0x0468
        L_0x0630:
            com.google.android.gms.measurement.internal.h5 r2 = r1.f3223j     // Catch:{ all -> 0x101c }
            com.google.android.gms.measurement.internal.c4 r2 = r2.i()     // Catch:{ all -> 0x101c }
            com.google.android.gms.measurement.internal.e4 r2 = r2.E()     // Catch:{ all -> 0x101c }
            java.lang.String r3 = "Did not find conversion parameter. appId"
            com.google.android.gms.internal.measurement.e1 r4 = r5.a     // Catch:{ all -> 0x101c }
            java.lang.String r4 = r4.U2()     // Catch:{ all -> 0x101c }
            java.lang.Object r4 = com.google.android.gms.measurement.internal.c4.w(r4)     // Catch:{ all -> 0x101c }
            r2.b(r3, r4)     // Catch:{ all -> 0x101c }
            goto L_0x0468
        L_0x064b:
            if (r6 == 0) goto L_0x070e
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x101c }
            java.util.List r3 = r9.H()     // Catch:{ all -> 0x101c }
            r2.<init>(r3)     // Catch:{ all -> 0x101c }
            r3 = 0
            r4 = -1
            r6 = -1
        L_0x0659:
            int r7 = r2.size()     // Catch:{ all -> 0x101c }
            java.lang.String r14 = "currency"
            java.lang.String r15 = "value"
            if (r3 >= r7) goto L_0x0689
            java.lang.Object r7 = r2.get(r3)     // Catch:{ all -> 0x101c }
            com.google.android.gms.internal.measurement.c1 r7 = (com.google.android.gms.internal.measurement.c1) r7     // Catch:{ all -> 0x101c }
            java.lang.String r7 = r7.M()     // Catch:{ all -> 0x101c }
            boolean r7 = r15.equals(r7)     // Catch:{ all -> 0x101c }
            if (r7 == 0) goto L_0x0675
            r4 = r3
            goto L_0x0686
        L_0x0675:
            java.lang.Object r7 = r2.get(r3)     // Catch:{ all -> 0x101c }
            com.google.android.gms.internal.measurement.c1 r7 = (com.google.android.gms.internal.measurement.c1) r7     // Catch:{ all -> 0x101c }
            java.lang.String r7 = r7.M()     // Catch:{ all -> 0x101c }
            boolean r7 = r14.equals(r7)     // Catch:{ all -> 0x101c }
            if (r7 == 0) goto L_0x0686
            r6 = r3
        L_0x0686:
            int r3 = r3 + 1
            goto L_0x0659
        L_0x0689:
            r3 = -1
            if (r4 == r3) goto L_0x070f
            java.lang.Object r3 = r2.get(r4)     // Catch:{ all -> 0x101c }
            com.google.android.gms.internal.measurement.c1 r3 = (com.google.android.gms.internal.measurement.c1) r3     // Catch:{ all -> 0x101c }
            boolean r3 = r3.V()     // Catch:{ all -> 0x101c }
            if (r3 != 0) goto L_0x06bf
            java.lang.Object r3 = r2.get(r4)     // Catch:{ all -> 0x101c }
            com.google.android.gms.internal.measurement.c1 r3 = (com.google.android.gms.internal.measurement.c1) r3     // Catch:{ all -> 0x101c }
            boolean r3 = r3.a0()     // Catch:{ all -> 0x101c }
            if (r3 != 0) goto L_0x06bf
            com.google.android.gms.measurement.internal.h5 r2 = r1.f3223j     // Catch:{ all -> 0x101c }
            com.google.android.gms.measurement.internal.c4 r2 = r2.i()     // Catch:{ all -> 0x101c }
            com.google.android.gms.measurement.internal.e4 r2 = r2.J()     // Catch:{ all -> 0x101c }
            java.lang.String r3 = "Value must be specified with a numeric type."
            r2.a(r3)     // Catch:{ all -> 0x101c }
            r9.J(r4)     // Catch:{ all -> 0x101c }
            m(r9, r12)     // Catch:{ all -> 0x101c }
            r2 = 18
            l(r9, r2, r15)     // Catch:{ all -> 0x101c }
            goto L_0x070e
        L_0x06bf:
            r3 = -1
            if (r6 != r3) goto L_0x06c5
            r2 = 1
            r7 = 3
            goto L_0x06f1
        L_0x06c5:
            java.lang.Object r2 = r2.get(r6)     // Catch:{ all -> 0x101c }
            com.google.android.gms.internal.measurement.c1 r2 = (com.google.android.gms.internal.measurement.c1) r2     // Catch:{ all -> 0x101c }
            java.lang.String r2 = r2.S()     // Catch:{ all -> 0x101c }
            int r6 = r2.length()     // Catch:{ all -> 0x101c }
            r7 = 3
            if (r6 == r7) goto L_0x06d8
        L_0x06d6:
            r2 = 1
            goto L_0x06f1
        L_0x06d8:
            r6 = 0
        L_0x06d9:
            int r15 = r2.length()     // Catch:{ all -> 0x101c }
            if (r6 >= r15) goto L_0x06f0
            int r15 = r2.codePointAt(r6)     // Catch:{ all -> 0x101c }
            boolean r17 = java.lang.Character.isLetter(r15)     // Catch:{ all -> 0x101c }
            if (r17 != 0) goto L_0x06ea
            goto L_0x06d6
        L_0x06ea:
            int r15 = java.lang.Character.charCount(r15)     // Catch:{ all -> 0x101c }
            int r6 = r6 + r15
            goto L_0x06d9
        L_0x06f0:
            r2 = 0
        L_0x06f1:
            if (r2 == 0) goto L_0x0710
            com.google.android.gms.measurement.internal.h5 r2 = r1.f3223j     // Catch:{ all -> 0x101c }
            com.google.android.gms.measurement.internal.c4 r2 = r2.i()     // Catch:{ all -> 0x101c }
            com.google.android.gms.measurement.internal.e4 r2 = r2.J()     // Catch:{ all -> 0x101c }
            java.lang.String r6 = "Value parameter discarded. You must also supply a 3-letter ISO_4217 currency code in the currency parameter."
            r2.a(r6)     // Catch:{ all -> 0x101c }
            r9.J(r4)     // Catch:{ all -> 0x101c }
            m(r9, r12)     // Catch:{ all -> 0x101c }
            r2 = 19
            l(r9, r2, r14)     // Catch:{ all -> 0x101c }
            goto L_0x0710
        L_0x070e:
            r3 = -1
        L_0x070f:
            r7 = 3
        L_0x0710:
            com.google.android.gms.measurement.internal.h5 r2 = r1.f3223j     // Catch:{ all -> 0x101c }
            com.google.android.gms.measurement.internal.wa r2 = r2.c()     // Catch:{ all -> 0x101c }
            com.google.android.gms.internal.measurement.e1 r4 = r5.a     // Catch:{ all -> 0x101c }
            java.lang.String r4 = r4.U2()     // Catch:{ all -> 0x101c }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r6 = com.google.android.gms.measurement.internal.u.U     // Catch:{ all -> 0x101c }
            boolean r2 = r2.C(r4, r6)     // Catch:{ all -> 0x101c }
            if (r2 == 0) goto L_0x08bb
            java.lang.String r2 = r9.O()     // Catch:{ all -> 0x101c }
            boolean r2 = r11.equals(r2)     // Catch:{ all -> 0x101c }
            if (r2 == 0) goto L_0x0784
            r42.d0()     // Catch:{ all -> 0x101c }
            com.google.android.gms.internal.measurement.j8 r2 = r9.l()     // Catch:{ all -> 0x101c }
            com.google.android.gms.internal.measurement.z6 r2 = (com.google.android.gms.internal.measurement.z6) r2     // Catch:{ all -> 0x101c }
            com.google.android.gms.internal.measurement.a1 r2 = (com.google.android.gms.internal.measurement.a1) r2     // Catch:{ all -> 0x101c }
            com.google.android.gms.internal.measurement.c1 r2 = com.google.android.gms.measurement.internal.ba.y(r2, r10)     // Catch:{ all -> 0x101c }
            if (r2 != 0) goto L_0x077c
            if (r32 == 0) goto L_0x0772
            long r14 = r32.P()     // Catch:{ all -> 0x101c }
            long r17 = r9.P()     // Catch:{ all -> 0x101c }
            long r14 = r14 - r17
            long r14 = java.lang.Math.abs(r14)     // Catch:{ all -> 0x101c }
            r17 = 1000(0x3e8, double:4.94E-321)
            int r2 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            if (r2 > 0) goto L_0x0772
            java.lang.Object r2 = r32.clone()     // Catch:{ all -> 0x101c }
            com.google.android.gms.internal.measurement.z6$b r2 = (com.google.android.gms.internal.measurement.z6.b) r2     // Catch:{ all -> 0x101c }
            com.google.android.gms.internal.measurement.a1$a r2 = (com.google.android.gms.internal.measurement.a1.a) r2     // Catch:{ all -> 0x101c }
            boolean r4 = r1.E(r9, r2)     // Catch:{ all -> 0x101c }
            if (r4 == 0) goto L_0x0772
            r4 = r31
            r4.A(r8, r2)     // Catch:{ all -> 0x101c }
            r7 = r22
            r6 = r30
        L_0x076c:
            r29 = 0
            r32 = 0
            goto L_0x08c2
        L_0x0772:
            r4 = r31
            r29 = r9
            r7 = r20
            r6 = r30
            goto L_0x08c2
        L_0x077c:
            r4 = r31
            r10 = r22
            r6 = r30
            goto L_0x08c1
        L_0x0784:
            r4 = r31
            java.lang.String r2 = "_vs"
            java.lang.String r6 = r9.O()     // Catch:{ all -> 0x101c }
            boolean r2 = r2.equals(r6)     // Catch:{ all -> 0x101c }
            if (r2 == 0) goto L_0x07dd
            r42.d0()     // Catch:{ all -> 0x101c }
            com.google.android.gms.internal.measurement.j8 r2 = r9.l()     // Catch:{ all -> 0x101c }
            com.google.android.gms.internal.measurement.z6 r2 = (com.google.android.gms.internal.measurement.z6) r2     // Catch:{ all -> 0x101c }
            com.google.android.gms.internal.measurement.a1 r2 = (com.google.android.gms.internal.measurement.a1) r2     // Catch:{ all -> 0x101c }
            r6 = r30
            com.google.android.gms.internal.measurement.c1 r2 = com.google.android.gms.measurement.internal.ba.y(r2, r6)     // Catch:{ all -> 0x101c }
            if (r2 != 0) goto L_0x07d9
            if (r29 == 0) goto L_0x07d0
            long r14 = r29.P()     // Catch:{ all -> 0x101c }
            long r17 = r9.P()     // Catch:{ all -> 0x101c }
            long r14 = r14 - r17
            long r14 = java.lang.Math.abs(r14)     // Catch:{ all -> 0x101c }
            r17 = 1000(0x3e8, double:4.94E-321)
            int r2 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            if (r2 > 0) goto L_0x07d0
            java.lang.Object r2 = r29.clone()     // Catch:{ all -> 0x101c }
            com.google.android.gms.internal.measurement.z6$b r2 = (com.google.android.gms.internal.measurement.z6.b) r2     // Catch:{ all -> 0x101c }
            com.google.android.gms.internal.measurement.a1$a r2 = (com.google.android.gms.internal.measurement.a1.a) r2     // Catch:{ all -> 0x101c }
            boolean r10 = r1.E(r2, r9)     // Catch:{ all -> 0x101c }
            if (r10 == 0) goto L_0x07d0
            r10 = r22
            r4.A(r10, r2)     // Catch:{ all -> 0x101c }
            r7 = r10
            goto L_0x076c
        L_0x07d0:
            r10 = r22
            r32 = r9
            r7 = r10
            r8 = r20
            goto L_0x08c2
        L_0x07d9:
            r10 = r22
            goto L_0x08c1
        L_0x07dd:
            r10 = r22
            r6 = r30
            com.google.android.gms.measurement.internal.h5 r2 = r1.f3223j     // Catch:{ all -> 0x101c }
            com.google.android.gms.measurement.internal.wa r2 = r2.c()     // Catch:{ all -> 0x101c }
            com.google.android.gms.internal.measurement.e1 r12 = r5.a     // Catch:{ all -> 0x101c }
            java.lang.String r12 = r12.U2()     // Catch:{ all -> 0x101c }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r14 = com.google.android.gms.measurement.internal.u.o0     // Catch:{ all -> 0x101c }
            boolean r2 = r2.C(r12, r14)     // Catch:{ all -> 0x101c }
            if (r2 == 0) goto L_0x08c1
            java.lang.String r2 = "_ab"
            java.lang.String r12 = r9.O()     // Catch:{ all -> 0x101c }
            boolean r2 = r2.equals(r12)     // Catch:{ all -> 0x101c }
            if (r2 == 0) goto L_0x08c1
            r42.d0()     // Catch:{ all -> 0x101c }
            com.google.android.gms.internal.measurement.j8 r2 = r9.l()     // Catch:{ all -> 0x101c }
            com.google.android.gms.internal.measurement.z6 r2 = (com.google.android.gms.internal.measurement.z6) r2     // Catch:{ all -> 0x101c }
            com.google.android.gms.internal.measurement.a1 r2 = (com.google.android.gms.internal.measurement.a1) r2     // Catch:{ all -> 0x101c }
            com.google.android.gms.internal.measurement.c1 r2 = com.google.android.gms.measurement.internal.ba.y(r2, r6)     // Catch:{ all -> 0x101c }
            if (r2 != 0) goto L_0x08c1
            if (r29 == 0) goto L_0x08c1
            long r14 = r29.P()     // Catch:{ all -> 0x101c }
            long r17 = r9.P()     // Catch:{ all -> 0x101c }
            long r14 = r14 - r17
            long r14 = java.lang.Math.abs(r14)     // Catch:{ all -> 0x101c }
            r17 = 4000(0xfa0, double:1.9763E-320)
            int r2 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            if (r2 > 0) goto L_0x08c1
            java.lang.Object r2 = r29.clone()     // Catch:{ all -> 0x101c }
            com.google.android.gms.internal.measurement.z6$b r2 = (com.google.android.gms.internal.measurement.z6.b) r2     // Catch:{ all -> 0x101c }
            com.google.android.gms.internal.measurement.a1$a r2 = (com.google.android.gms.internal.measurement.a1.a) r2     // Catch:{ all -> 0x101c }
            r1.N(r2, r9)     // Catch:{ all -> 0x101c }
            java.lang.String r12 = r2.O()     // Catch:{ all -> 0x101c }
            boolean r12 = r11.equals(r12)     // Catch:{ all -> 0x101c }
            com.google.android.gms.common.internal.r.a(r12)     // Catch:{ all -> 0x101c }
            r42.d0()     // Catch:{ all -> 0x101c }
            com.google.android.gms.internal.measurement.j8 r12 = r2.l()     // Catch:{ all -> 0x101c }
            com.google.android.gms.internal.measurement.z6 r12 = (com.google.android.gms.internal.measurement.z6) r12     // Catch:{ all -> 0x101c }
            com.google.android.gms.internal.measurement.a1 r12 = (com.google.android.gms.internal.measurement.a1) r12     // Catch:{ all -> 0x101c }
            java.lang.String r14 = "_sn"
            com.google.android.gms.internal.measurement.c1 r12 = com.google.android.gms.measurement.internal.ba.y(r12, r14)     // Catch:{ all -> 0x101c }
            r42.d0()     // Catch:{ all -> 0x101c }
            com.google.android.gms.internal.measurement.j8 r14 = r2.l()     // Catch:{ all -> 0x101c }
            com.google.android.gms.internal.measurement.z6 r14 = (com.google.android.gms.internal.measurement.z6) r14     // Catch:{ all -> 0x101c }
            com.google.android.gms.internal.measurement.a1 r14 = (com.google.android.gms.internal.measurement.a1) r14     // Catch:{ all -> 0x101c }
            java.lang.String r15 = "_sc"
            com.google.android.gms.internal.measurement.c1 r14 = com.google.android.gms.measurement.internal.ba.y(r14, r15)     // Catch:{ all -> 0x101c }
            r42.d0()     // Catch:{ all -> 0x101c }
            com.google.android.gms.internal.measurement.j8 r15 = r2.l()     // Catch:{ all -> 0x101c }
            com.google.android.gms.internal.measurement.z6 r15 = (com.google.android.gms.internal.measurement.z6) r15     // Catch:{ all -> 0x101c }
            com.google.android.gms.internal.measurement.a1 r15 = (com.google.android.gms.internal.measurement.a1) r15     // Catch:{ all -> 0x101c }
            java.lang.String r3 = "_si"
            com.google.android.gms.internal.measurement.c1 r3 = com.google.android.gms.measurement.internal.ba.y(r15, r3)     // Catch:{ all -> 0x101c }
            if (r12 == 0) goto L_0x0878
            java.lang.String r12 = r12.S()     // Catch:{ all -> 0x101c }
            goto L_0x087a
        L_0x0878:
            r12 = r25
        L_0x087a:
            boolean r15 = android.text.TextUtils.isEmpty(r12)     // Catch:{ all -> 0x101c }
            if (r15 != 0) goto L_0x0889
            com.google.android.gms.measurement.internal.ba r15 = r42.d0()     // Catch:{ all -> 0x101c }
            java.lang.String r7 = "_sn"
            r15.H(r9, r7, r12)     // Catch:{ all -> 0x101c }
        L_0x0889:
            if (r14 == 0) goto L_0x0890
            java.lang.String r7 = r14.S()     // Catch:{ all -> 0x101c }
            goto L_0x0892
        L_0x0890:
            r7 = r25
        L_0x0892:
            boolean r12 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x101c }
            if (r12 != 0) goto L_0x08a1
            com.google.android.gms.measurement.internal.ba r12 = r42.d0()     // Catch:{ all -> 0x101c }
            java.lang.String r14 = "_sc"
            r12.H(r9, r14, r7)     // Catch:{ all -> 0x101c }
        L_0x08a1:
            if (r3 == 0) goto L_0x08b4
            com.google.android.gms.measurement.internal.ba r7 = r42.d0()     // Catch:{ all -> 0x101c }
            java.lang.String r12 = "_si"
            long r14 = r3.W()     // Catch:{ all -> 0x101c }
            java.lang.Long r3 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x101c }
            r7.H(r9, r12, r3)     // Catch:{ all -> 0x101c }
        L_0x08b4:
            r4.A(r10, r2)     // Catch:{ all -> 0x101c }
            r7 = r10
            r29 = 0
            goto L_0x08c2
        L_0x08bb:
            r10 = r22
            r6 = r30
            r4 = r31
        L_0x08c1:
            r7 = r10
        L_0x08c2:
            if (r21 != 0) goto L_0x0924
            java.lang.String r2 = r9.O()     // Catch:{ all -> 0x101c }
            boolean r2 = r11.equals(r2)     // Catch:{ all -> 0x101c }
            if (r2 == 0) goto L_0x0924
            int r2 = r9.I()     // Catch:{ all -> 0x101c }
            if (r2 != 0) goto L_0x08ee
            com.google.android.gms.measurement.internal.h5 r2 = r1.f3223j     // Catch:{ all -> 0x101c }
            com.google.android.gms.measurement.internal.c4 r2 = r2.i()     // Catch:{ all -> 0x101c }
            com.google.android.gms.measurement.internal.e4 r2 = r2.H()     // Catch:{ all -> 0x101c }
            java.lang.String r3 = "Engagement event does not contain any parameters. appId"
            com.google.android.gms.internal.measurement.e1 r6 = r5.a     // Catch:{ all -> 0x101c }
            java.lang.String r6 = r6.U2()     // Catch:{ all -> 0x101c }
            java.lang.Object r6 = com.google.android.gms.measurement.internal.c4.w(r6)     // Catch:{ all -> 0x101c }
            r2.b(r3, r6)     // Catch:{ all -> 0x101c }
            goto L_0x0924
        L_0x08ee:
            com.google.android.gms.measurement.internal.ba r2 = r42.d0()     // Catch:{ all -> 0x101c }
            com.google.android.gms.internal.measurement.j8 r3 = r9.l()     // Catch:{ all -> 0x101c }
            com.google.android.gms.internal.measurement.z6 r3 = (com.google.android.gms.internal.measurement.z6) r3     // Catch:{ all -> 0x101c }
            com.google.android.gms.internal.measurement.a1 r3 = (com.google.android.gms.internal.measurement.a1) r3     // Catch:{ all -> 0x101c }
            java.lang.Object r2 = r2.U(r3, r6)     // Catch:{ all -> 0x101c }
            java.lang.Long r2 = (java.lang.Long) r2     // Catch:{ all -> 0x101c }
            if (r2 != 0) goto L_0x091c
            com.google.android.gms.measurement.internal.h5 r2 = r1.f3223j     // Catch:{ all -> 0x101c }
            com.google.android.gms.measurement.internal.c4 r2 = r2.i()     // Catch:{ all -> 0x101c }
            com.google.android.gms.measurement.internal.e4 r2 = r2.H()     // Catch:{ all -> 0x101c }
            java.lang.String r3 = "Engagement event does not include duration. appId"
            com.google.android.gms.internal.measurement.e1 r6 = r5.a     // Catch:{ all -> 0x101c }
            java.lang.String r6 = r6.U2()     // Catch:{ all -> 0x101c }
            java.lang.Object r6 = com.google.android.gms.measurement.internal.c4.w(r6)     // Catch:{ all -> 0x101c }
            r2.b(r3, r6)     // Catch:{ all -> 0x101c }
            goto L_0x0924
        L_0x091c:
            long r2 = r2.longValue()     // Catch:{ all -> 0x101c }
            long r2 = r27 + r2
            r27 = r2
        L_0x0924:
            java.util.List<com.google.android.gms.internal.measurement.a1> r2 = r5.c     // Catch:{ all -> 0x101c }
            com.google.android.gms.internal.measurement.j8 r3 = r9.l()     // Catch:{ all -> 0x101c }
            com.google.android.gms.internal.measurement.z6 r3 = (com.google.android.gms.internal.measurement.z6) r3     // Catch:{ all -> 0x101c }
            com.google.android.gms.internal.measurement.a1 r3 = (com.google.android.gms.internal.measurement.a1) r3     // Catch:{ all -> 0x101c }
            r6 = r26
            r2.set(r6, r3)     // Catch:{ all -> 0x101c }
            int r14 = r20 + 1
            r4.D(r9)     // Catch:{ all -> 0x101c }
            r10 = r29
            r11 = r32
        L_0x093c:
            int r12 = r6 + 1
            r3 = r16
            r2 = r19
            r6 = r21
            r15 = r27
            goto L_0x02ad
        L_0x0948:
            r6 = r2
            r10 = r13
            r11 = r14
            r27 = r15
            if (r21 == 0) goto L_0x09a4
            r14 = r20
            r15 = r27
            r2 = 0
        L_0x0954:
            if (r2 >= r14) goto L_0x09a2
            com.google.android.gms.internal.measurement.a1 r3 = r4.N(r2)     // Catch:{ all -> 0x101c }
            java.lang.String r7 = r3.T()     // Catch:{ all -> 0x101c }
            boolean r7 = r11.equals(r7)     // Catch:{ all -> 0x101c }
            if (r7 == 0) goto L_0x0975
            r42.d0()     // Catch:{ all -> 0x101c }
            com.google.android.gms.internal.measurement.c1 r7 = com.google.android.gms.measurement.internal.ba.y(r3, r10)     // Catch:{ all -> 0x101c }
            if (r7 == 0) goto L_0x0975
            r4.S(r2)     // Catch:{ all -> 0x101c }
            int r14 = r14 + -1
            int r2 = r2 + -1
            goto L_0x099f
        L_0x0975:
            r42.d0()     // Catch:{ all -> 0x101c }
            com.google.android.gms.internal.measurement.c1 r3 = com.google.android.gms.measurement.internal.ba.y(r3, r6)     // Catch:{ all -> 0x101c }
            if (r3 == 0) goto L_0x099f
            boolean r7 = r3.V()     // Catch:{ all -> 0x101c }
            if (r7 == 0) goto L_0x098d
            long r7 = r3.W()     // Catch:{ all -> 0x101c }
            java.lang.Long r3 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x101c }
            goto L_0x098e
        L_0x098d:
            r3 = 0
        L_0x098e:
            if (r3 == 0) goto L_0x099f
            long r7 = r3.longValue()     // Catch:{ all -> 0x101c }
            r12 = 0
            int r9 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r9 <= 0) goto L_0x099f
            long r7 = r3.longValue()     // Catch:{ all -> 0x101c }
            long r15 = r15 + r7
        L_0x099f:
            r3 = 1
            int r2 = r2 + r3
            goto L_0x0954
        L_0x09a2:
            r2 = r15
            goto L_0x09a6
        L_0x09a4:
            r2 = r27
        L_0x09a6:
            r6 = 0
            r1.o(r4, r2, r6)     // Catch:{ all -> 0x101c }
            java.util.List r6 = r4.J()     // Catch:{ all -> 0x101c }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x101c }
        L_0x09b2:
            boolean r7 = r6.hasNext()     // Catch:{ all -> 0x101c }
            if (r7 == 0) goto L_0x09cc
            java.lang.Object r7 = r6.next()     // Catch:{ all -> 0x101c }
            com.google.android.gms.internal.measurement.a1 r7 = (com.google.android.gms.internal.measurement.a1) r7     // Catch:{ all -> 0x101c }
            java.lang.String r8 = "_s"
            java.lang.String r7 = r7.T()     // Catch:{ all -> 0x101c }
            boolean r7 = r8.equals(r7)     // Catch:{ all -> 0x101c }
            if (r7 == 0) goto L_0x09b2
            r6 = 1
            goto L_0x09cd
        L_0x09cc:
            r6 = 0
        L_0x09cd:
            java.lang.String r7 = "_se"
            if (r6 == 0) goto L_0x09dc
            com.google.android.gms.measurement.internal.d r6 = r42.Z()     // Catch:{ all -> 0x101c }
            java.lang.String r8 = r4.C0()     // Catch:{ all -> 0x101c }
            r6.l0(r8, r7)     // Catch:{ all -> 0x101c }
        L_0x09dc:
            java.lang.String r6 = "_sid"
            int r6 = com.google.android.gms.measurement.internal.ba.u(r4, r6)     // Catch:{ all -> 0x101c }
            if (r6 < 0) goto L_0x09e6
            r6 = 1
            goto L_0x09e7
        L_0x09e6:
            r6 = 0
        L_0x09e7:
            if (r6 == 0) goto L_0x09ee
            r6 = 1
            r1.o(r4, r2, r6)     // Catch:{ all -> 0x101c }
            goto L_0x0a10
        L_0x09ee:
            int r2 = com.google.android.gms.measurement.internal.ba.u(r4, r7)     // Catch:{ all -> 0x101c }
            if (r2 < 0) goto L_0x0a10
            r4.d0(r2)     // Catch:{ all -> 0x101c }
            com.google.android.gms.measurement.internal.h5 r2 = r1.f3223j     // Catch:{ all -> 0x101c }
            com.google.android.gms.measurement.internal.c4 r2 = r2.i()     // Catch:{ all -> 0x101c }
            com.google.android.gms.measurement.internal.e4 r2 = r2.E()     // Catch:{ all -> 0x101c }
            java.lang.String r3 = "Session engagement user property is in the bundle without session ID. appId"
            com.google.android.gms.internal.measurement.e1 r6 = r5.a     // Catch:{ all -> 0x101c }
            java.lang.String r6 = r6.U2()     // Catch:{ all -> 0x101c }
            java.lang.Object r6 = com.google.android.gms.measurement.internal.c4.w(r6)     // Catch:{ all -> 0x101c }
            r2.b(r3, r6)     // Catch:{ all -> 0x101c }
        L_0x0a10:
            com.google.android.gms.measurement.internal.ba r2 = r42.d0()     // Catch:{ all -> 0x101c }
            com.google.android.gms.measurement.internal.c4 r3 = r2.i()     // Catch:{ all -> 0x101c }
            com.google.android.gms.measurement.internal.e4 r3 = r3.M()     // Catch:{ all -> 0x101c }
            java.lang.String r6 = "Checking account type status for ad personalization signals"
            r3.a(r6)     // Catch:{ all -> 0x101c }
            com.google.android.gms.measurement.internal.b5 r3 = r2.p()     // Catch:{ all -> 0x101c }
            java.lang.String r6 = r4.C0()     // Catch:{ all -> 0x101c }
            boolean r3 = r3.F(r6)     // Catch:{ all -> 0x101c }
            if (r3 == 0) goto L_0x0a9e
            com.google.android.gms.measurement.internal.d r3 = r2.o()     // Catch:{ all -> 0x101c }
            java.lang.String r6 = r4.C0()     // Catch:{ all -> 0x101c }
            com.google.android.gms.measurement.internal.f4 r3 = r3.j0(r6)     // Catch:{ all -> 0x101c }
            if (r3 == 0) goto L_0x0a9e
            boolean r3 = r3.l()     // Catch:{ all -> 0x101c }
            if (r3 == 0) goto L_0x0a9e
            com.google.android.gms.measurement.internal.m r3 = r2.d()     // Catch:{ all -> 0x101c }
            boolean r3 = r3.y()     // Catch:{ all -> 0x101c }
            if (r3 == 0) goto L_0x0a9e
            com.google.android.gms.measurement.internal.c4 r3 = r2.i()     // Catch:{ all -> 0x101c }
            com.google.android.gms.measurement.internal.e4 r3 = r3.L()     // Catch:{ all -> 0x101c }
            java.lang.String r6 = "Turning off ad personalization due to account type"
            r3.a(r6)     // Catch:{ all -> 0x101c }
            com.google.android.gms.internal.measurement.i1$a r3 = com.google.android.gms.internal.measurement.i1.X()     // Catch:{ all -> 0x101c }
            r6 = r19
            r3.C(r6)     // Catch:{ all -> 0x101c }
            com.google.android.gms.measurement.internal.m r2 = r2.d()     // Catch:{ all -> 0x101c }
            long r7 = r2.w()     // Catch:{ all -> 0x101c }
            r3.B(r7)     // Catch:{ all -> 0x101c }
            r7 = 1
            r3.E(r7)     // Catch:{ all -> 0x101c }
            com.google.android.gms.internal.measurement.j8 r2 = r3.l()     // Catch:{ all -> 0x101c }
            com.google.android.gms.internal.measurement.z6 r2 = (com.google.android.gms.internal.measurement.z6) r2     // Catch:{ all -> 0x101c }
            com.google.android.gms.internal.measurement.i1 r2 = (com.google.android.gms.internal.measurement.i1) r2     // Catch:{ all -> 0x101c }
            r3 = 0
        L_0x0a7c:
            int r7 = r4.c0()     // Catch:{ all -> 0x101c }
            if (r3 >= r7) goto L_0x0a98
            com.google.android.gms.internal.measurement.i1 r7 = r4.a0(r3)     // Catch:{ all -> 0x101c }
            java.lang.String r7 = r7.P()     // Catch:{ all -> 0x101c }
            boolean r7 = r6.equals(r7)     // Catch:{ all -> 0x101c }
            if (r7 == 0) goto L_0x0a95
            r4.B(r3, r2)     // Catch:{ all -> 0x101c }
            r3 = 1
            goto L_0x0a99
        L_0x0a95:
            int r3 = r3 + 1
            goto L_0x0a7c
        L_0x0a98:
            r3 = 0
        L_0x0a99:
            if (r3 != 0) goto L_0x0a9e
            r4.F(r2)     // Catch:{ all -> 0x101c }
        L_0x0a9e:
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r4.O(r2)     // Catch:{ all -> 0x101c }
            r2 = -9223372036854775808
            r4.T(r2)     // Catch:{ all -> 0x101c }
            r2 = 0
        L_0x0aac:
            int r3 = r4.M()     // Catch:{ all -> 0x101c }
            if (r2 >= r3) goto L_0x0adf
            com.google.android.gms.internal.measurement.a1 r3 = r4.N(r2)     // Catch:{ all -> 0x101c }
            long r6 = r3.V()     // Catch:{ all -> 0x101c }
            long r8 = r4.g0()     // Catch:{ all -> 0x101c }
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 >= 0) goto L_0x0ac9
            long r6 = r3.V()     // Catch:{ all -> 0x101c }
            r4.O(r6)     // Catch:{ all -> 0x101c }
        L_0x0ac9:
            long r6 = r3.V()     // Catch:{ all -> 0x101c }
            long r8 = r4.m0()     // Catch:{ all -> 0x101c }
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 <= 0) goto L_0x0adc
            long r6 = r3.V()     // Catch:{ all -> 0x101c }
            r4.T(r6)     // Catch:{ all -> 0x101c }
        L_0x0adc:
            int r2 = r2 + 1
            goto L_0x0aac
        L_0x0adf:
            boolean r2 = com.google.android.gms.internal.measurement.be.a()     // Catch:{ all -> 0x101c }
            if (r2 == 0) goto L_0x0afa
            com.google.android.gms.measurement.internal.h5 r2 = r1.f3223j     // Catch:{ all -> 0x101c }
            com.google.android.gms.measurement.internal.wa r2 = r2.c()     // Catch:{ all -> 0x101c }
            java.lang.String r3 = r4.C0()     // Catch:{ all -> 0x101c }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r6 = com.google.android.gms.measurement.internal.u.O0     // Catch:{ all -> 0x101c }
            boolean r2 = r2.C(r3, r6)     // Catch:{ all -> 0x101c }
            if (r2 == 0) goto L_0x0afa
            r4.R0()     // Catch:{ all -> 0x101c }
        L_0x0afa:
            r4.P0()     // Catch:{ all -> 0x101c }
            com.google.android.gms.measurement.internal.ma r6 = r42.b0()     // Catch:{ all -> 0x101c }
            java.lang.String r7 = r4.C0()     // Catch:{ all -> 0x101c }
            java.util.List r8 = r4.J()     // Catch:{ all -> 0x101c }
            java.util.List r9 = r4.b0()     // Catch:{ all -> 0x101c }
            long r2 = r4.g0()     // Catch:{ all -> 0x101c }
            java.lang.Long r10 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x101c }
            long r2 = r4.m0()     // Catch:{ all -> 0x101c }
            java.lang.Long r11 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x101c }
            java.util.List r2 = r6.v(r7, r8, r9, r10, r11)     // Catch:{ all -> 0x101c }
            r4.U(r2)     // Catch:{ all -> 0x101c }
            com.google.android.gms.measurement.internal.h5 r2 = r1.f3223j     // Catch:{ all -> 0x101c }
            com.google.android.gms.measurement.internal.wa r2 = r2.c()     // Catch:{ all -> 0x101c }
            com.google.android.gms.internal.measurement.e1 r3 = r5.a     // Catch:{ all -> 0x101c }
            java.lang.String r3 = r3.U2()     // Catch:{ all -> 0x101c }
            boolean r2 = r2.K(r3)     // Catch:{ all -> 0x101c }
            if (r2 == 0) goto L_0x0e6f
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ all -> 0x0ffb }
            r2.<init>()     // Catch:{ all -> 0x0ffb }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x0ffb }
            r3.<init>()     // Catch:{ all -> 0x0ffb }
            com.google.android.gms.measurement.internal.h5 r6 = r1.f3223j     // Catch:{ all -> 0x0ffb }
            com.google.android.gms.measurement.internal.fa r6 = r6.G()     // Catch:{ all -> 0x0ffb }
            java.security.SecureRandom r6 = r6.H0()     // Catch:{ all -> 0x0ffb }
            r7 = 0
        L_0x0b4b:
            int r8 = r4.M()     // Catch:{ all -> 0x0ffb }
            if (r7 >= r8) goto L_0x0e37
            com.google.android.gms.internal.measurement.a1 r8 = r4.N(r7)     // Catch:{ all -> 0x0ffb }
            com.google.android.gms.internal.measurement.z6$b r8 = r8.x()     // Catch:{ all -> 0x0ffb }
            com.google.android.gms.internal.measurement.a1$a r8 = (com.google.android.gms.internal.measurement.a1.a) r8     // Catch:{ all -> 0x0ffb }
            java.lang.String r9 = r8.O()     // Catch:{ all -> 0x0ffb }
            java.lang.String r10 = "_ep"
            boolean r9 = r9.equals(r10)     // Catch:{ all -> 0x0ffb }
            java.lang.String r10 = "_sr"
            if (r9 == 0) goto L_0x0bdf
            com.google.android.gms.measurement.internal.ba r9 = r42.d0()     // Catch:{ all -> 0x101c }
            com.google.android.gms.internal.measurement.j8 r11 = r8.l()     // Catch:{ all -> 0x101c }
            com.google.android.gms.internal.measurement.z6 r11 = (com.google.android.gms.internal.measurement.z6) r11     // Catch:{ all -> 0x101c }
            com.google.android.gms.internal.measurement.a1 r11 = (com.google.android.gms.internal.measurement.a1) r11     // Catch:{ all -> 0x101c }
            java.lang.String r12 = "_en"
            java.lang.Object r9 = r9.U(r11, r12)     // Catch:{ all -> 0x101c }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x101c }
            java.lang.Object r11 = r2.get(r9)     // Catch:{ all -> 0x101c }
            com.google.android.gms.measurement.internal.o r11 = (com.google.android.gms.measurement.internal.o) r11     // Catch:{ all -> 0x101c }
            if (r11 != 0) goto L_0x0b96
            com.google.android.gms.measurement.internal.d r11 = r42.Z()     // Catch:{ all -> 0x101c }
            com.google.android.gms.internal.measurement.e1 r12 = r5.a     // Catch:{ all -> 0x101c }
            java.lang.String r12 = r12.U2()     // Catch:{ all -> 0x101c }
            com.google.android.gms.measurement.internal.o r11 = r11.D(r12, r9)     // Catch:{ all -> 0x101c }
            r2.put(r9, r11)     // Catch:{ all -> 0x101c }
        L_0x0b96:
            java.lang.Long r9 = r11.f3008i     // Catch:{ all -> 0x101c }
            if (r9 != 0) goto L_0x0bd5
            java.lang.Long r9 = r11.f3009j     // Catch:{ all -> 0x101c }
            long r12 = r9.longValue()     // Catch:{ all -> 0x101c }
            r14 = 1
            int r9 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r9 <= 0) goto L_0x0baf
            com.google.android.gms.measurement.internal.ba r9 = r42.d0()     // Catch:{ all -> 0x101c }
            java.lang.Long r12 = r11.f3009j     // Catch:{ all -> 0x101c }
            r9.H(r8, r10, r12)     // Catch:{ all -> 0x101c }
        L_0x0baf:
            java.lang.Boolean r9 = r11.f3010k     // Catch:{ all -> 0x101c }
            if (r9 == 0) goto L_0x0bca
            java.lang.Boolean r9 = r11.f3010k     // Catch:{ all -> 0x101c }
            boolean r9 = r9.booleanValue()     // Catch:{ all -> 0x101c }
            if (r9 == 0) goto L_0x0bca
            com.google.android.gms.measurement.internal.ba r9 = r42.d0()     // Catch:{ all -> 0x101c }
            java.lang.String r10 = "_efs"
            r11 = 1
            java.lang.Long r13 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x101c }
            r9.H(r8, r10, r13)     // Catch:{ all -> 0x101c }
        L_0x0bca:
            com.google.android.gms.internal.measurement.j8 r9 = r8.l()     // Catch:{ all -> 0x101c }
            com.google.android.gms.internal.measurement.z6 r9 = (com.google.android.gms.internal.measurement.z6) r9     // Catch:{ all -> 0x101c }
            com.google.android.gms.internal.measurement.a1 r9 = (com.google.android.gms.internal.measurement.a1) r9     // Catch:{ all -> 0x101c }
            r3.add(r9)     // Catch:{ all -> 0x101c }
        L_0x0bd5:
            r4.A(r7, r8)     // Catch:{ all -> 0x101c }
        L_0x0bd8:
            r43 = r5
            r19 = r6
            r5 = r2
            goto L_0x0e2c
        L_0x0bdf:
            com.google.android.gms.measurement.internal.b5 r9 = r42.V()     // Catch:{ all -> 0x0ffb }
            com.google.android.gms.internal.measurement.e1 r11 = r5.a     // Catch:{ all -> 0x0ffb }
            java.lang.String r11 = r11.U2()     // Catch:{ all -> 0x0ffb }
            long r11 = r9.G(r11)     // Catch:{ all -> 0x0ffb }
            com.google.android.gms.measurement.internal.h5 r9 = r1.f3223j     // Catch:{ all -> 0x0ffb }
            r9.G()     // Catch:{ all -> 0x0ffb }
            long r13 = r8.P()     // Catch:{ all -> 0x0ffb }
            long r13 = com.google.android.gms.measurement.internal.fa.w(r13, r11)     // Catch:{ all -> 0x0ffb }
            com.google.android.gms.internal.measurement.j8 r9 = r8.l()     // Catch:{ all -> 0x0ffb }
            com.google.android.gms.internal.measurement.z6 r9 = (com.google.android.gms.internal.measurement.z6) r9     // Catch:{ all -> 0x0ffb }
            com.google.android.gms.internal.measurement.a1 r9 = (com.google.android.gms.internal.measurement.a1) r9     // Catch:{ all -> 0x0ffb }
            java.lang.String r15 = "_dbg"
            r19 = r11
            r16 = 1
            java.lang.Long r11 = java.lang.Long.valueOf(r16)     // Catch:{ all -> 0x0ffb }
            boolean r12 = android.text.TextUtils.isEmpty(r15)     // Catch:{ all -> 0x0ffb }
            if (r12 != 0) goto L_0x0c6c
            if (r11 != 0) goto L_0x0c15
            goto L_0x0c6c
        L_0x0c15:
            java.util.List r9 = r9.C()     // Catch:{ all -> 0x101c }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x101c }
        L_0x0c1d:
            boolean r12 = r9.hasNext()     // Catch:{ all -> 0x101c }
            if (r12 == 0) goto L_0x0c6c
            java.lang.Object r12 = r9.next()     // Catch:{ all -> 0x101c }
            com.google.android.gms.internal.measurement.c1 r12 = (com.google.android.gms.internal.measurement.c1) r12     // Catch:{ all -> 0x101c }
            r43 = r9
            java.lang.String r9 = r12.M()     // Catch:{ all -> 0x101c }
            boolean r9 = r15.equals(r9)     // Catch:{ all -> 0x101c }
            if (r9 == 0) goto L_0x0c69
            boolean r9 = r11 instanceof java.lang.Long     // Catch:{ all -> 0x101c }
            if (r9 == 0) goto L_0x0c47
            long r15 = r12.W()     // Catch:{ all -> 0x101c }
            java.lang.Long r9 = java.lang.Long.valueOf(r15)     // Catch:{ all -> 0x101c }
            boolean r9 = r11.equals(r9)     // Catch:{ all -> 0x101c }
            if (r9 != 0) goto L_0x0c67
        L_0x0c47:
            boolean r9 = r11 instanceof java.lang.String     // Catch:{ all -> 0x101c }
            if (r9 == 0) goto L_0x0c55
            java.lang.String r9 = r12.S()     // Catch:{ all -> 0x101c }
            boolean r9 = r11.equals(r9)     // Catch:{ all -> 0x101c }
            if (r9 != 0) goto L_0x0c67
        L_0x0c55:
            boolean r9 = r11 instanceof java.lang.Double     // Catch:{ all -> 0x101c }
            if (r9 == 0) goto L_0x0c6c
            double r15 = r12.b0()     // Catch:{ all -> 0x101c }
            java.lang.Double r9 = java.lang.Double.valueOf(r15)     // Catch:{ all -> 0x101c }
            boolean r9 = r11.equals(r9)     // Catch:{ all -> 0x101c }
            if (r9 == 0) goto L_0x0c6c
        L_0x0c67:
            r9 = 1
            goto L_0x0c6d
        L_0x0c69:
            r9 = r43
            goto L_0x0c1d
        L_0x0c6c:
            r9 = 0
        L_0x0c6d:
            if (r9 != 0) goto L_0x0c82
            com.google.android.gms.measurement.internal.b5 r9 = r42.V()     // Catch:{ all -> 0x101c }
            com.google.android.gms.internal.measurement.e1 r11 = r5.a     // Catch:{ all -> 0x101c }
            java.lang.String r11 = r11.U2()     // Catch:{ all -> 0x101c }
            java.lang.String r12 = r8.O()     // Catch:{ all -> 0x101c }
            int r9 = r9.D(r11, r12)     // Catch:{ all -> 0x101c }
            goto L_0x0c83
        L_0x0c82:
            r9 = 1
        L_0x0c83:
            if (r9 > 0) goto L_0x0cac
            com.google.android.gms.measurement.internal.h5 r10 = r1.f3223j     // Catch:{ all -> 0x101c }
            com.google.android.gms.measurement.internal.c4 r10 = r10.i()     // Catch:{ all -> 0x101c }
            com.google.android.gms.measurement.internal.e4 r10 = r10.H()     // Catch:{ all -> 0x101c }
            java.lang.String r11 = "Sample rate must be positive. event, rate"
            java.lang.String r12 = r8.O()     // Catch:{ all -> 0x101c }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x101c }
            r10.c(r11, r12, r9)     // Catch:{ all -> 0x101c }
            com.google.android.gms.internal.measurement.j8 r9 = r8.l()     // Catch:{ all -> 0x101c }
            com.google.android.gms.internal.measurement.z6 r9 = (com.google.android.gms.internal.measurement.z6) r9     // Catch:{ all -> 0x101c }
            com.google.android.gms.internal.measurement.a1 r9 = (com.google.android.gms.internal.measurement.a1) r9     // Catch:{ all -> 0x101c }
            r3.add(r9)     // Catch:{ all -> 0x101c }
            r4.A(r7, r8)     // Catch:{ all -> 0x101c }
            goto L_0x0bd8
        L_0x0cac:
            java.lang.String r11 = r8.O()     // Catch:{ all -> 0x0ffb }
            java.lang.Object r11 = r2.get(r11)     // Catch:{ all -> 0x0ffb }
            com.google.android.gms.measurement.internal.o r11 = (com.google.android.gms.measurement.internal.o) r11     // Catch:{ all -> 0x0ffb }
            if (r11 != 0) goto L_0x0d0a
            com.google.android.gms.measurement.internal.d r11 = r42.Z()     // Catch:{ all -> 0x0ffb }
            com.google.android.gms.internal.measurement.e1 r12 = r5.a     // Catch:{ all -> 0x0ffb }
            java.lang.String r12 = r12.U2()     // Catch:{ all -> 0x0ffb }
            java.lang.String r15 = r8.O()     // Catch:{ all -> 0x0ffb }
            com.google.android.gms.measurement.internal.o r11 = r11.D(r12, r15)     // Catch:{ all -> 0x0ffb }
            if (r11 != 0) goto L_0x0d0a
            com.google.android.gms.measurement.internal.h5 r11 = r1.f3223j     // Catch:{ all -> 0x0ffb }
            com.google.android.gms.measurement.internal.c4 r11 = r11.i()     // Catch:{ all -> 0x0ffb }
            com.google.android.gms.measurement.internal.e4 r11 = r11.H()     // Catch:{ all -> 0x0ffb }
            java.lang.String r12 = "Event being bundled has no eventAggregate. appId, eventName"
            com.google.android.gms.internal.measurement.e1 r15 = r5.a     // Catch:{ all -> 0x0ffb }
            java.lang.String r15 = r15.U2()     // Catch:{ all -> 0x0ffb }
            java.lang.String r1 = r8.O()     // Catch:{ all -> 0x0ffb }
            r11.c(r12, r15, r1)     // Catch:{ all -> 0x0ffb }
            com.google.android.gms.measurement.internal.o r11 = new com.google.android.gms.measurement.internal.o     // Catch:{ all -> 0x0ffb }
            com.google.android.gms.internal.measurement.e1 r1 = r5.a     // Catch:{ all -> 0x0ffb }
            java.lang.String r26 = r1.U2()     // Catch:{ all -> 0x0ffb }
            java.lang.String r27 = r8.O()     // Catch:{ all -> 0x0ffb }
            r28 = 1
            r30 = 1
            r32 = 1
            long r34 = r8.P()     // Catch:{ all -> 0x0ffb }
            r36 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r41 = 0
            r25 = r11
            r25.<init>(r26, r27, r28, r30, r32, r34, r36, r38, r39, r40, r41)     // Catch:{ all -> 0x0ffb }
        L_0x0d0a:
            com.google.android.gms.measurement.internal.ba r1 = r42.d0()     // Catch:{ all -> 0x0ffb }
            com.google.android.gms.internal.measurement.j8 r12 = r8.l()     // Catch:{ all -> 0x0ffb }
            com.google.android.gms.internal.measurement.z6 r12 = (com.google.android.gms.internal.measurement.z6) r12     // Catch:{ all -> 0x0ffb }
            com.google.android.gms.internal.measurement.a1 r12 = (com.google.android.gms.internal.measurement.a1) r12     // Catch:{ all -> 0x0ffb }
            java.lang.String r15 = "_eid"
            java.lang.Object r1 = r1.U(r12, r15)     // Catch:{ all -> 0x0ffb }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ all -> 0x0ffb }
            if (r1 == 0) goto L_0x0d22
            r12 = 1
            goto L_0x0d23
        L_0x0d22:
            r12 = 0
        L_0x0d23:
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)     // Catch:{ all -> 0x0ffb }
            r15 = 1
            if (r9 != r15) goto L_0x0d58
            com.google.android.gms.internal.measurement.j8 r1 = r8.l()     // Catch:{ all -> 0x0ffb }
            com.google.android.gms.internal.measurement.z6 r1 = (com.google.android.gms.internal.measurement.z6) r1     // Catch:{ all -> 0x0ffb }
            com.google.android.gms.internal.measurement.a1 r1 = (com.google.android.gms.internal.measurement.a1) r1     // Catch:{ all -> 0x0ffb }
            r3.add(r1)     // Catch:{ all -> 0x0ffb }
            boolean r1 = r12.booleanValue()     // Catch:{ all -> 0x0ffb }
            if (r1 == 0) goto L_0x0d53
            java.lang.Long r1 = r11.f3008i     // Catch:{ all -> 0x0ffb }
            if (r1 != 0) goto L_0x0d47
            java.lang.Long r1 = r11.f3009j     // Catch:{ all -> 0x0ffb }
            if (r1 != 0) goto L_0x0d47
            java.lang.Boolean r1 = r11.f3010k     // Catch:{ all -> 0x0ffb }
            if (r1 == 0) goto L_0x0d53
        L_0x0d47:
            r1 = 0
            com.google.android.gms.measurement.internal.o r9 = r11.c(r1, r1, r1)     // Catch:{ all -> 0x0ffb }
            java.lang.String r1 = r8.O()     // Catch:{ all -> 0x0ffb }
            r2.put(r1, r9)     // Catch:{ all -> 0x0ffb }
        L_0x0d53:
            r4.A(r7, r8)     // Catch:{ all -> 0x0ffb }
            goto L_0x0bd8
        L_0x0d58:
            int r15 = r6.nextInt(r9)     // Catch:{ all -> 0x0ffb }
            if (r15 != 0) goto L_0x0d9b
            com.google.android.gms.measurement.internal.ba r1 = r42.d0()     // Catch:{ all -> 0x0ffb }
            r43 = r5
            r15 = r6
            long r5 = (long) r9     // Catch:{ all -> 0x0ffb }
            java.lang.Long r9 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0ffb }
            r1.H(r8, r10, r9)     // Catch:{ all -> 0x0ffb }
            com.google.android.gms.internal.measurement.j8 r1 = r8.l()     // Catch:{ all -> 0x0ffb }
            com.google.android.gms.internal.measurement.z6 r1 = (com.google.android.gms.internal.measurement.z6) r1     // Catch:{ all -> 0x0ffb }
            com.google.android.gms.internal.measurement.a1 r1 = (com.google.android.gms.internal.measurement.a1) r1     // Catch:{ all -> 0x0ffb }
            r3.add(r1)     // Catch:{ all -> 0x0ffb }
            boolean r1 = r12.booleanValue()     // Catch:{ all -> 0x0ffb }
            if (r1 == 0) goto L_0x0d87
            java.lang.Long r1 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0ffb }
            r5 = 0
            com.google.android.gms.measurement.internal.o r11 = r11.c(r5, r1, r5)     // Catch:{ all -> 0x0ffb }
        L_0x0d87:
            java.lang.String r1 = r8.O()     // Catch:{ all -> 0x0ffb }
            long r5 = r8.P()     // Catch:{ all -> 0x0ffb }
            com.google.android.gms.measurement.internal.o r5 = r11.b(r5, r13)     // Catch:{ all -> 0x0ffb }
            r2.put(r1, r5)     // Catch:{ all -> 0x0ffb }
            r5 = r2
            r19 = r15
            goto L_0x0e29
        L_0x0d9b:
            r43 = r5
            r15 = r6
            java.lang.Long r5 = r11.f3007h     // Catch:{ all -> 0x0ffb }
            if (r5 == 0) goto L_0x0dad
            java.lang.Long r5 = r11.f3007h     // Catch:{ all -> 0x0ffb }
            long r5 = r5.longValue()     // Catch:{ all -> 0x0ffb }
            r17 = r1
            r16 = r2
            goto L_0x0dc2
        L_0x0dad:
            r5 = r42
            com.google.android.gms.measurement.internal.h5 r6 = r5.f3223j     // Catch:{ all -> 0x0ffb }
            r6.G()     // Catch:{ all -> 0x0ffb }
            long r5 = r8.Q()     // Catch:{ all -> 0x0ffb }
            r17 = r1
            r16 = r2
            r1 = r19
            long r5 = com.google.android.gms.measurement.internal.fa.w(r5, r1)     // Catch:{ all -> 0x0ffb }
        L_0x0dc2:
            int r1 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r1 == 0) goto L_0x0e11
            com.google.android.gms.measurement.internal.ba r1 = r42.d0()     // Catch:{ all -> 0x0ffb }
            java.lang.String r2 = "_efs"
            r19 = r15
            r5 = 1
            java.lang.Long r15 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0ffb }
            r1.H(r8, r2, r15)     // Catch:{ all -> 0x0ffb }
            com.google.android.gms.measurement.internal.ba r1 = r42.d0()     // Catch:{ all -> 0x0ffb }
            long r5 = (long) r9     // Catch:{ all -> 0x0ffb }
            java.lang.Long r2 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0ffb }
            r1.H(r8, r10, r2)     // Catch:{ all -> 0x0ffb }
            com.google.android.gms.internal.measurement.j8 r1 = r8.l()     // Catch:{ all -> 0x0ffb }
            com.google.android.gms.internal.measurement.z6 r1 = (com.google.android.gms.internal.measurement.z6) r1     // Catch:{ all -> 0x0ffb }
            com.google.android.gms.internal.measurement.a1 r1 = (com.google.android.gms.internal.measurement.a1) r1     // Catch:{ all -> 0x0ffb }
            r3.add(r1)     // Catch:{ all -> 0x0ffb }
            boolean r1 = r12.booleanValue()     // Catch:{ all -> 0x0ffb }
            if (r1 == 0) goto L_0x0dff
            java.lang.Long r1 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0ffb }
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0ffb }
            r5 = 0
            com.google.android.gms.measurement.internal.o r11 = r11.c(r5, r1, r2)     // Catch:{ all -> 0x0ffb }
        L_0x0dff:
            java.lang.String r1 = r8.O()     // Catch:{ all -> 0x0ffb }
            long r5 = r8.P()     // Catch:{ all -> 0x0ffb }
            com.google.android.gms.measurement.internal.o r2 = r11.b(r5, r13)     // Catch:{ all -> 0x0ffb }
            r5 = r16
            r5.put(r1, r2)     // Catch:{ all -> 0x0ffb }
            goto L_0x0e29
        L_0x0e11:
            r19 = r15
            r5 = r16
            boolean r1 = r12.booleanValue()     // Catch:{ all -> 0x0ffb }
            if (r1 == 0) goto L_0x0e29
            java.lang.String r1 = r8.O()     // Catch:{ all -> 0x0ffb }
            r2 = r17
            r6 = 0
            com.google.android.gms.measurement.internal.o r2 = r11.c(r2, r6, r6)     // Catch:{ all -> 0x0ffb }
            r5.put(r1, r2)     // Catch:{ all -> 0x0ffb }
        L_0x0e29:
            r4.A(r7, r8)     // Catch:{ all -> 0x0ffb }
        L_0x0e2c:
            int r7 = r7 + 1
            r1 = r42
            r2 = r5
            r6 = r19
            r5 = r43
            goto L_0x0b4b
        L_0x0e37:
            r43 = r5
            r5 = r2
            int r1 = r3.size()     // Catch:{ all -> 0x0ffb }
            int r2 = r4.M()     // Catch:{ all -> 0x0ffb }
            if (r1 >= r2) goto L_0x0e4a
            r4.R()     // Catch:{ all -> 0x0ffb }
            r4.G(r3)     // Catch:{ all -> 0x0ffb }
        L_0x0e4a:
            java.util.Set r1 = r5.entrySet()     // Catch:{ all -> 0x0ffb }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0ffb }
        L_0x0e52:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0ffb }
            if (r2 == 0) goto L_0x0e6c
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0ffb }
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ all -> 0x0ffb }
            com.google.android.gms.measurement.internal.d r3 = r42.Z()     // Catch:{ all -> 0x0ffb }
            java.lang.Object r2 = r2.getValue()     // Catch:{ all -> 0x0ffb }
            com.google.android.gms.measurement.internal.o r2 = (com.google.android.gms.measurement.internal.o) r2     // Catch:{ all -> 0x0ffb }
            r3.N(r2)     // Catch:{ all -> 0x0ffb }
            goto L_0x0e52
        L_0x0e6c:
            r1 = r43
            goto L_0x0e70
        L_0x0e6f:
            r1 = r5
        L_0x0e70:
            com.google.android.gms.internal.measurement.e1 r2 = r1.a     // Catch:{ all -> 0x0ffb }
            java.lang.String r2 = r2.U2()     // Catch:{ all -> 0x0ffb }
            com.google.android.gms.measurement.internal.d r3 = r42.Z()     // Catch:{ all -> 0x0ffb }
            com.google.android.gms.measurement.internal.f4 r3 = r3.j0(r2)     // Catch:{ all -> 0x0ffb }
            if (r3 != 0) goto L_0x0e9c
            r5 = r42
            com.google.android.gms.measurement.internal.h5 r3 = r5.f3223j     // Catch:{ all -> 0x101a }
            com.google.android.gms.measurement.internal.c4 r3 = r3.i()     // Catch:{ all -> 0x101a }
            com.google.android.gms.measurement.internal.e4 r3 = r3.E()     // Catch:{ all -> 0x101a }
            java.lang.String r6 = "Bundling raw events w/o app info. appId"
            com.google.android.gms.internal.measurement.e1 r7 = r1.a     // Catch:{ all -> 0x101a }
            java.lang.String r7 = r7.U2()     // Catch:{ all -> 0x101a }
            java.lang.Object r7 = com.google.android.gms.measurement.internal.c4.w(r7)     // Catch:{ all -> 0x101a }
            r3.b(r6, r7)     // Catch:{ all -> 0x101a }
            goto L_0x0ef9
        L_0x0e9c:
            r5 = r42
            int r6 = r4.M()     // Catch:{ all -> 0x101a }
            if (r6 <= 0) goto L_0x0ef9
            long r6 = r3.R()     // Catch:{ all -> 0x101a }
            r8 = 0
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 == 0) goto L_0x0eb2
            r4.e0(r6)     // Catch:{ all -> 0x101a }
            goto L_0x0eb5
        L_0x0eb2:
            r4.w0()     // Catch:{ all -> 0x101a }
        L_0x0eb5:
            long r8 = r3.P()     // Catch:{ all -> 0x101a }
            r10 = 0
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 != 0) goto L_0x0ec0
            goto L_0x0ec1
        L_0x0ec0:
            r6 = r8
        L_0x0ec1:
            int r8 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r8 == 0) goto L_0x0ec9
            r4.W(r6)     // Catch:{ all -> 0x101a }
            goto L_0x0ecc
        L_0x0ec9:
            r4.r0()     // Catch:{ all -> 0x101a }
        L_0x0ecc:
            r3.i0()     // Catch:{ all -> 0x101a }
            long r6 = r3.f0()     // Catch:{ all -> 0x101a }
            int r7 = (int) r6     // Catch:{ all -> 0x101a }
            r4.o0(r7)     // Catch:{ all -> 0x101a }
            long r6 = r4.g0()     // Catch:{ all -> 0x101a }
            r3.a(r6)     // Catch:{ all -> 0x101a }
            long r6 = r4.m0()     // Catch:{ all -> 0x101a }
            r3.q(r6)     // Catch:{ all -> 0x101a }
            java.lang.String r6 = r3.j()     // Catch:{ all -> 0x101a }
            if (r6 == 0) goto L_0x0eef
            r4.B0(r6)     // Catch:{ all -> 0x101a }
            goto L_0x0ef2
        L_0x0eef:
            r4.L0()     // Catch:{ all -> 0x101a }
        L_0x0ef2:
            com.google.android.gms.measurement.internal.d r6 = r42.Z()     // Catch:{ all -> 0x101a }
            r6.O(r3)     // Catch:{ all -> 0x101a }
        L_0x0ef9:
            int r3 = r4.M()     // Catch:{ all -> 0x101a }
            if (r3 <= 0) goto L_0x0f5a
            com.google.android.gms.measurement.internal.b5 r3 = r42.V()     // Catch:{ all -> 0x101a }
            com.google.android.gms.internal.measurement.e1 r6 = r1.a     // Catch:{ all -> 0x101a }
            java.lang.String r6 = r6.U2()     // Catch:{ all -> 0x101a }
            com.google.android.gms.internal.measurement.u0 r3 = r3.u(r6)     // Catch:{ all -> 0x101a }
            if (r3 == 0) goto L_0x0f1e
            boolean r6 = r3.F()     // Catch:{ all -> 0x101a }
            if (r6 != 0) goto L_0x0f16
            goto L_0x0f1e
        L_0x0f16:
            long r6 = r3.G()     // Catch:{ all -> 0x101a }
            r4.y0(r6)     // Catch:{ all -> 0x101a }
            goto L_0x0f49
        L_0x0f1e:
            com.google.android.gms.internal.measurement.e1 r3 = r1.a     // Catch:{ all -> 0x101a }
            java.lang.String r3 = r3.j0()     // Catch:{ all -> 0x101a }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x101a }
            if (r3 == 0) goto L_0x0f30
            r6 = -1
            r4.y0(r6)     // Catch:{ all -> 0x101a }
            goto L_0x0f49
        L_0x0f30:
            com.google.android.gms.measurement.internal.h5 r3 = r5.f3223j     // Catch:{ all -> 0x101a }
            com.google.android.gms.measurement.internal.c4 r3 = r3.i()     // Catch:{ all -> 0x101a }
            com.google.android.gms.measurement.internal.e4 r3 = r3.H()     // Catch:{ all -> 0x101a }
            java.lang.String r6 = "Did not find measurement config or missing version info. appId"
            com.google.android.gms.internal.measurement.e1 r7 = r1.a     // Catch:{ all -> 0x101a }
            java.lang.String r7 = r7.U2()     // Catch:{ all -> 0x101a }
            java.lang.Object r7 = com.google.android.gms.measurement.internal.c4.w(r7)     // Catch:{ all -> 0x101a }
            r3.b(r6, r7)     // Catch:{ all -> 0x101a }
        L_0x0f49:
            com.google.android.gms.measurement.internal.d r3 = r42.Z()     // Catch:{ all -> 0x101a }
            com.google.android.gms.internal.measurement.j8 r4 = r4.l()     // Catch:{ all -> 0x101a }
            com.google.android.gms.internal.measurement.z6 r4 = (com.google.android.gms.internal.measurement.z6) r4     // Catch:{ all -> 0x101a }
            com.google.android.gms.internal.measurement.e1 r4 = (com.google.android.gms.internal.measurement.e1) r4     // Catch:{ all -> 0x101a }
            r13 = r18
            r3.R(r4, r13)     // Catch:{ all -> 0x101a }
        L_0x0f5a:
            com.google.android.gms.measurement.internal.d r3 = r42.Z()     // Catch:{ all -> 0x101a }
            java.util.List<java.lang.Long> r1 = r1.b     // Catch:{ all -> 0x101a }
            com.google.android.gms.common.internal.r.k(r1)     // Catch:{ all -> 0x101a }
            r3.c()     // Catch:{ all -> 0x101a }
            r3.r()     // Catch:{ all -> 0x101a }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x101a }
            java.lang.String r6 = "rowid in ("
            r4.<init>(r6)     // Catch:{ all -> 0x101a }
            r6 = 0
        L_0x0f71:
            int r7 = r1.size()     // Catch:{ all -> 0x101a }
            if (r6 >= r7) goto L_0x0f8e
            if (r6 == 0) goto L_0x0f7e
            java.lang.String r7 = ","
            r4.append(r7)     // Catch:{ all -> 0x101a }
        L_0x0f7e:
            java.lang.Object r7 = r1.get(r6)     // Catch:{ all -> 0x101a }
            java.lang.Long r7 = (java.lang.Long) r7     // Catch:{ all -> 0x101a }
            long r7 = r7.longValue()     // Catch:{ all -> 0x101a }
            r4.append(r7)     // Catch:{ all -> 0x101a }
            int r6 = r6 + 1
            goto L_0x0f71
        L_0x0f8e:
            java.lang.String r6 = ")"
            r4.append(r6)     // Catch:{ all -> 0x101a }
            android.database.sqlite.SQLiteDatabase r6 = r3.v()     // Catch:{ all -> 0x101a }
            java.lang.String r7 = "raw_events"
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x101a }
            r8 = 0
            int r4 = r6.delete(r7, r4, r8)     // Catch:{ all -> 0x101a }
            int r6 = r1.size()     // Catch:{ all -> 0x101a }
            if (r4 == r6) goto L_0x0fc1
            com.google.android.gms.measurement.internal.c4 r3 = r3.i()     // Catch:{ all -> 0x101a }
            com.google.android.gms.measurement.internal.e4 r3 = r3.E()     // Catch:{ all -> 0x101a }
            java.lang.String r6 = "Deleted fewer rows from raw events table than expected"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x101a }
            int r1 = r1.size()     // Catch:{ all -> 0x101a }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x101a }
            r3.c(r6, r4, r1)     // Catch:{ all -> 0x101a }
        L_0x0fc1:
            com.google.android.gms.measurement.internal.d r1 = r42.Z()     // Catch:{ all -> 0x101a }
            android.database.sqlite.SQLiteDatabase r3 = r1.v()     // Catch:{ all -> 0x101a }
            java.lang.String r4 = "delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)"
            r6 = 2
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch:{ SQLiteException -> 0x0fd8 }
            r7 = 0
            r6[r7] = r2     // Catch:{ SQLiteException -> 0x0fd8 }
            r7 = 1
            r6[r7] = r2     // Catch:{ SQLiteException -> 0x0fd8 }
            r3.execSQL(r4, r6)     // Catch:{ SQLiteException -> 0x0fd8 }
            goto L_0x0feb
        L_0x0fd8:
            r0 = move-exception
            r3 = r0
            com.google.android.gms.measurement.internal.c4 r1 = r1.i()     // Catch:{ all -> 0x101a }
            com.google.android.gms.measurement.internal.e4 r1 = r1.E()     // Catch:{ all -> 0x101a }
            java.lang.String r4 = "Failed to remove unused event metadata. appId"
            java.lang.Object r2 = com.google.android.gms.measurement.internal.c4.w(r2)     // Catch:{ all -> 0x101a }
            r1.c(r4, r2, r3)     // Catch:{ all -> 0x101a }
        L_0x0feb:
            com.google.android.gms.measurement.internal.d r1 = r42.Z()     // Catch:{ all -> 0x101a }
            r1.u()     // Catch:{ all -> 0x101a }
            com.google.android.gms.measurement.internal.d r1 = r42.Z()
            r1.y0()
            r1 = 1
            return r1
        L_0x0ffb:
            r0 = move-exception
            r5 = r42
            goto L_0x101e
        L_0x0fff:
            r5 = r1
            com.google.android.gms.measurement.internal.d r1 = r42.Z()     // Catch:{ all -> 0x101a }
            r1.u()     // Catch:{ all -> 0x101a }
            com.google.android.gms.measurement.internal.d r1 = r42.Z()
            r1.y0()
            r1 = 0
            return r1
        L_0x1010:
            r0 = move-exception
            r5 = r1
            goto L_0x0256
        L_0x1014:
            if (r6 == 0) goto L_0x1019
            r6.close()     // Catch:{ all -> 0x101a }
        L_0x1019:
            throw r1     // Catch:{ all -> 0x101a }
        L_0x101a:
            r0 = move-exception
            goto L_0x101e
        L_0x101c:
            r0 = move-exception
            r5 = r1
        L_0x101e:
            r1 = r0
            com.google.android.gms.measurement.internal.d r2 = r42.Z()
            r2.y0()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.x9.F(java.lang.String, long):boolean");
    }

    private final boolean G() {
        n0();
        g0();
        return Z().G0() || !TextUtils.isEmpty(Z().w());
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x018c  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x01aa  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void H() {
        /*
            r21 = this;
            r0 = r21
            r21.n0()
            r21.g0()
            long r1 = r0.f3226m
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x004d
            com.google.android.gms.measurement.internal.h5 r1 = r0.f3223j
            com.google.android.gms.common.util.e r1 = r1.f()
            long r1 = r1.c()
            r5 = 3600000(0x36ee80, double:1.7786363E-317)
            long r7 = r0.f3226m
            long r1 = r1 - r7
            long r1 = java.lang.Math.abs(r1)
            long r5 = r5 - r1
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x004b
            com.google.android.gms.measurement.internal.h5 r1 = r0.f3223j
            com.google.android.gms.measurement.internal.c4 r1 = r1.i()
            com.google.android.gms.measurement.internal.e4 r1 = r1.M()
            java.lang.Long r2 = java.lang.Long.valueOf(r5)
            java.lang.String r3 = "Upload has been suspended. Will update scheduling later in approximately ms"
            r1.b(r3, r2)
            com.google.android.gms.measurement.internal.n4 r1 = r21.l0()
            r1.c()
            com.google.android.gms.measurement.internal.t9 r1 = r21.m0()
            r1.v()
            return
        L_0x004b:
            r0.f3226m = r3
        L_0x004d:
            com.google.android.gms.measurement.internal.h5 r1 = r0.f3223j
            boolean r1 = r1.u()
            if (r1 == 0) goto L_0x0255
            boolean r1 = r21.G()
            if (r1 != 0) goto L_0x005d
            goto L_0x0255
        L_0x005d:
            com.google.android.gms.measurement.internal.h5 r1 = r0.f3223j
            com.google.android.gms.common.util.e r1 = r1.f()
            long r1 = r1.b()
            com.google.android.gms.measurement.internal.r3<java.lang.Long> r5 = com.google.android.gms.measurement.internal.u.A
            r6 = 0
            java.lang.Object r5 = r5.a(r6)
            java.lang.Long r5 = (java.lang.Long) r5
            long r7 = r5.longValue()
            long r7 = java.lang.Math.max(r3, r7)
            com.google.android.gms.measurement.internal.d r5 = r21.Z()
            boolean r5 = r5.H0()
            if (r5 != 0) goto L_0x008f
            com.google.android.gms.measurement.internal.d r5 = r21.Z()
            boolean r5 = r5.x()
            if (r5 == 0) goto L_0x008d
            goto L_0x008f
        L_0x008d:
            r5 = 0
            goto L_0x0090
        L_0x008f:
            r5 = 1
        L_0x0090:
            if (r5 == 0) goto L_0x00cc
            com.google.android.gms.measurement.internal.h5 r10 = r0.f3223j
            com.google.android.gms.measurement.internal.wa r10 = r10.c()
            java.lang.String r10 = r10.O()
            boolean r11 = android.text.TextUtils.isEmpty(r10)
            if (r11 != 0) goto L_0x00bb
            java.lang.String r11 = ".none."
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x00bb
            com.google.android.gms.measurement.internal.r3<java.lang.Long> r10 = com.google.android.gms.measurement.internal.u.v
            java.lang.Object r10 = r10.a(r6)
            java.lang.Long r10 = (java.lang.Long) r10
            long r10 = r10.longValue()
            long r10 = java.lang.Math.max(r3, r10)
            goto L_0x00dc
        L_0x00bb:
            com.google.android.gms.measurement.internal.r3<java.lang.Long> r10 = com.google.android.gms.measurement.internal.u.u
            java.lang.Object r10 = r10.a(r6)
            java.lang.Long r10 = (java.lang.Long) r10
            long r10 = r10.longValue()
            long r10 = java.lang.Math.max(r3, r10)
            goto L_0x00dc
        L_0x00cc:
            com.google.android.gms.measurement.internal.r3<java.lang.Long> r10 = com.google.android.gms.measurement.internal.u.t
            java.lang.Object r10 = r10.a(r6)
            java.lang.Long r10 = (java.lang.Long) r10
            long r10 = r10.longValue()
            long r10 = java.lang.Math.max(r3, r10)
        L_0x00dc:
            com.google.android.gms.measurement.internal.h5 r12 = r0.f3223j
            com.google.android.gms.measurement.internal.p4 r12 = r12.x()
            com.google.android.gms.measurement.internal.t4 r12 = r12.f3025e
            long r12 = r12.a()
            com.google.android.gms.measurement.internal.h5 r14 = r0.f3223j
            com.google.android.gms.measurement.internal.p4 r14 = r14.x()
            com.google.android.gms.measurement.internal.t4 r14 = r14.f3026f
            long r14 = r14.a()
            com.google.android.gms.measurement.internal.d r16 = r21.Z()
            r17 = r10
            long r9 = r16.E0()
            com.google.android.gms.measurement.internal.d r11 = r21.Z()
            r19 = r7
            long r6 = r11.F0()
            long r6 = java.lang.Math.max(r9, r6)
            int r8 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r8 != 0) goto L_0x0113
        L_0x0110:
            r10 = r3
            goto L_0x0188
        L_0x0113:
            long r6 = r6 - r1
            long r6 = java.lang.Math.abs(r6)
            long r6 = r1 - r6
            long r12 = r12 - r1
            long r8 = java.lang.Math.abs(r12)
            long r8 = r1 - r8
            long r14 = r14 - r1
            long r10 = java.lang.Math.abs(r14)
            long r1 = r1 - r10
            long r8 = java.lang.Math.max(r8, r1)
            long r10 = r6 + r19
            if (r5 == 0) goto L_0x0139
            int r5 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x0139
            long r10 = java.lang.Math.min(r6, r8)
            long r10 = r10 + r17
        L_0x0139:
            com.google.android.gms.measurement.internal.ba r5 = r21.d0()
            r12 = r17
            boolean r5 = r5.Q(r8, r12)
            if (r5 != 0) goto L_0x0147
            long r10 = r8 + r12
        L_0x0147:
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x0188
            int r5 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r5 < 0) goto L_0x0188
            r5 = 0
        L_0x0150:
            r6 = 20
            com.google.android.gms.measurement.internal.r3<java.lang.Integer> r7 = com.google.android.gms.measurement.internal.u.C
            r8 = 0
            java.lang.Object r7 = r7.a(r8)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r9 = 0
            int r7 = java.lang.Math.max(r9, r7)
            int r6 = java.lang.Math.min(r6, r7)
            if (r5 >= r6) goto L_0x0110
            r6 = 1
            long r6 = r6 << r5
            com.google.android.gms.measurement.internal.r3<java.lang.Long> r12 = com.google.android.gms.measurement.internal.u.B
            java.lang.Object r12 = r12.a(r8)
            java.lang.Long r12 = (java.lang.Long) r12
            long r12 = r12.longValue()
            long r12 = java.lang.Math.max(r3, r12)
            long r12 = r12 * r6
            long r10 = r10 + r12
            int r6 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r6 <= 0) goto L_0x0185
            goto L_0x0188
        L_0x0185:
            int r5 = r5 + 1
            goto L_0x0150
        L_0x0188:
            int r1 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x01aa
            com.google.android.gms.measurement.internal.h5 r1 = r0.f3223j
            com.google.android.gms.measurement.internal.c4 r1 = r1.i()
            com.google.android.gms.measurement.internal.e4 r1 = r1.M()
            java.lang.String r2 = "Next upload time is 0"
            r1.a(r2)
            com.google.android.gms.measurement.internal.n4 r1 = r21.l0()
            r1.c()
            com.google.android.gms.measurement.internal.t9 r1 = r21.m0()
            r1.v()
            return
        L_0x01aa:
            com.google.android.gms.measurement.internal.g4 r1 = r21.X()
            boolean r1 = r1.x()
            if (r1 != 0) goto L_0x01d2
            com.google.android.gms.measurement.internal.h5 r1 = r0.f3223j
            com.google.android.gms.measurement.internal.c4 r1 = r1.i()
            com.google.android.gms.measurement.internal.e4 r1 = r1.M()
            java.lang.String r2 = "No network"
            r1.a(r2)
            com.google.android.gms.measurement.internal.n4 r1 = r21.l0()
            r1.b()
            com.google.android.gms.measurement.internal.t9 r1 = r21.m0()
            r1.v()
            return
        L_0x01d2:
            com.google.android.gms.measurement.internal.h5 r1 = r0.f3223j
            com.google.android.gms.measurement.internal.p4 r1 = r1.x()
            com.google.android.gms.measurement.internal.t4 r1 = r1.f3027g
            long r1 = r1.a()
            com.google.android.gms.measurement.internal.r3<java.lang.Long> r5 = com.google.android.gms.measurement.internal.u.r
            r6 = 0
            java.lang.Object r5 = r5.a(r6)
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            long r5 = java.lang.Math.max(r3, r5)
            com.google.android.gms.measurement.internal.ba r7 = r21.d0()
            boolean r7 = r7.Q(r1, r5)
            if (r7 != 0) goto L_0x01fe
            long r1 = r1 + r5
            long r10 = java.lang.Math.max(r10, r1)
        L_0x01fe:
            com.google.android.gms.measurement.internal.n4 r1 = r21.l0()
            r1.c()
            com.google.android.gms.measurement.internal.h5 r1 = r0.f3223j
            com.google.android.gms.common.util.e r1 = r1.f()
            long r1 = r1.b()
            long r10 = r10 - r1
            int r1 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r1 > 0) goto L_0x023a
            com.google.android.gms.measurement.internal.r3<java.lang.Long> r1 = com.google.android.gms.measurement.internal.u.w
            r2 = 0
            java.lang.Object r1 = r1.a(r2)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            long r10 = java.lang.Math.max(r3, r1)
            com.google.android.gms.measurement.internal.h5 r1 = r0.f3223j
            com.google.android.gms.measurement.internal.p4 r1 = r1.x()
            com.google.android.gms.measurement.internal.t4 r1 = r1.f3025e
            com.google.android.gms.measurement.internal.h5 r2 = r0.f3223j
            com.google.android.gms.common.util.e r2 = r2.f()
            long r2 = r2.b()
            r1.b(r2)
        L_0x023a:
            com.google.android.gms.measurement.internal.h5 r1 = r0.f3223j
            com.google.android.gms.measurement.internal.c4 r1 = r1.i()
            com.google.android.gms.measurement.internal.e4 r1 = r1.M()
            java.lang.Long r2 = java.lang.Long.valueOf(r10)
            java.lang.String r3 = "Upload scheduled in approximately ms"
            r1.b(r3, r2)
            com.google.android.gms.measurement.internal.t9 r1 = r21.m0()
            r1.u(r10)
            return
        L_0x0255:
            com.google.android.gms.measurement.internal.h5 r1 = r0.f3223j
            com.google.android.gms.measurement.internal.c4 r1 = r1.i()
            com.google.android.gms.measurement.internal.e4 r1 = r1.M()
            java.lang.String r2 = "Nothing to upload or uploading impossible"
            r1.a(r2)
            com.google.android.gms.measurement.internal.n4 r1 = r21.l0()
            r1.c()
            com.google.android.gms.measurement.internal.t9 r1 = r21.m0()
            r1.v()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.x9.H():void");
    }

    private final void I() {
        n0();
        if (this.q || this.r || this.s) {
            this.f3223j.i().M().d("Not stopping services. fetch, network, upload", Boolean.valueOf(this.q), Boolean.valueOf(this.r), Boolean.valueOf(this.s));
            return;
        }
        this.f3223j.i().M().a("Stopping uploading service(s)");
        List<Runnable> list = this.f3227n;
        if (list != null) {
            for (Runnable run : list) {
                run.run();
            }
            this.f3227n.clear();
        }
    }

    private final boolean J() {
        FileLock fileLock;
        n0();
        if (!this.f3223j.c().s(u.j0) || (fileLock = this.t) == null || !fileLock.isValid()) {
            try {
                FileChannel channel = new RandomAccessFile(new File(this.f3223j.j().getFilesDir(), "google_app_measurement.db"), "rw").getChannel();
                this.u = channel;
                FileLock tryLock = channel.tryLock();
                this.t = tryLock;
                if (tryLock != null) {
                    this.f3223j.i().M().a("Storage concurrent access okay");
                    return true;
                }
                this.f3223j.i().E().a("Storage concurrent data access panic");
                return false;
            } catch (FileNotFoundException e2) {
                this.f3223j.i().E().b("Failed to acquire storage lock", e2);
                return false;
            } catch (IOException e3) {
                this.f3223j.i().E().b("Failed to access storage lock file", e3);
                return false;
            } catch (OverlappingFileLockException e4) {
                this.f3223j.i().H().b("Storage lock already acquired", e4);
                return false;
            }
        } else {
            this.f3223j.i().M().a("Storage concurrent access okay");
            return true;
        }
    }

    private final la K(String str) {
        String str2 = str;
        f4 j0 = Z().j0(str2);
        if (j0 == null || TextUtils.isEmpty(j0.T())) {
            this.f3223j.i().L().b("No app data available; dropping", str2);
            return null;
        }
        Boolean M = M(j0);
        if (M == null || M.booleanValue()) {
            return new la(str, j0.A(), j0.T(), j0.V(), j0.X(), j0.Z(), j0.b0(), (String) null, j0.e0(), false, j0.M(), j0.k(), 0, 0, j0.l(), j0.m(), false, j0.D(), j0.n(), j0.d0(), j0.o(), (!vc.a() || !this.f3223j.c().C(str2, u.k0)) ? null : j0.G(), (!fb.a() || !this.f3223j.c().s(u.Q0)) ? "" : c(str).e());
        }
        this.f3223j.i().E().b("App version does not match; dropping. appId", c4.w(str));
        return null;
    }

    private final Boolean M(f4 f4Var) {
        try {
            if (f4Var.V() != -2147483648L) {
                if (f4Var.V() == ((long) c.a(this.f3223j.j()).d(f4Var.t(), 0).versionCode)) {
                    return Boolean.TRUE;
                }
            } else {
                String str = c.a(this.f3223j.j()).d(f4Var.t(), 0).versionName;
                if (f4Var.T() != null && f4Var.T().equals(str)) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private final void N(a1.a aVar, a1.a aVar2) {
        r.a("_e".equals(aVar.O()));
        d0();
        c1 y2 = ba.y((a1) ((z6) aVar.l()), "_et");
        if (y2.V() && y2.W() > 0) {
            long W = y2.W();
            d0();
            c1 y3 = ba.y((a1) ((z6) aVar2.l()), "_et");
            if (y3 != null && y3.W() > 0) {
                W += y3.W();
            }
            d0().H(aVar2, "_et", Long.valueOf(W));
            d0().H(aVar, "_fr", 1L);
        }
    }

    private final void O(s sVar, la laVar) {
        if (wc.a() && this.f3223j.c().s(u.I0)) {
            h4 b2 = h4.b(sVar);
            this.f3223j.G().M(b2.f2867d, Z().B0(laVar.f2956g));
            this.f3223j.G().V(b2, this.f3223j.c().m(laVar.f2956g));
            sVar = b2.a();
        }
        if (this.f3223j.c().s(u.f0) && "_cmp".equals(sVar.f3081g) && "referrer API v2".equals(sVar.f3082h.L("_cis"))) {
            String L = sVar.f3082h.L("gclid");
            if (!TextUtils.isEmpty(L)) {
                v(new ea("_lgclid", sVar.f3084j, L, "auto"), laVar);
            }
        }
        p(sVar, laVar);
    }

    private static void P(u9 u9Var) {
        if (u9Var == null) {
            throw new IllegalStateException("Upload Component not created");
        } else if (!u9Var.q()) {
            String valueOf = String.valueOf(u9Var.getClass());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
            sb.append("Component not initialized: ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:315:0x096a, code lost:
        r11 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x02e1 A[Catch:{ SQLiteException -> 0x02a9, all -> 0x09fb }] */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0318 A[Catch:{ SQLiteException -> 0x02a9, all -> 0x09fb }] */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0327  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x034e A[Catch:{ SQLiteException -> 0x02a9, all -> 0x09fb }] */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x035d A[Catch:{ SQLiteException -> 0x02a9, all -> 0x09fb }] */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0391 A[Catch:{ SQLiteException -> 0x02a9, all -> 0x09fb }] */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x03be  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x017d A[Catch:{ SQLiteException -> 0x02a9, all -> 0x09fb }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0185 A[Catch:{ SQLiteException -> 0x02a9, all -> 0x09fb }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void W(com.google.android.gms.measurement.internal.s r27, com.google.android.gms.measurement.internal.la r28) {
        /*
            r26 = this;
            r1 = r26
            r2 = r27
            r3 = r28
            java.lang.String r4 = "_sno"
            com.google.android.gms.common.internal.r.k(r28)
            java.lang.String r5 = r3.f2956g
            com.google.android.gms.common.internal.r.g(r5)
            long r5 = java.lang.System.nanoTime()
            r26.n0()
            r26.g0()
            java.lang.String r15 = r3.f2956g
            r26.d0()
            boolean r7 = com.google.android.gms.measurement.internal.ba.R(r27, r28)
            if (r7 != 0) goto L_0x0026
            return
        L_0x0026:
            boolean r7 = r3.f2963n
            if (r7 != 0) goto L_0x002e
            r1.U(r3)
            return
        L_0x002e:
            com.google.android.gms.measurement.internal.b5 r7 = r26.V()
            java.lang.String r8 = r2.f3081g
            boolean r7 = r7.A(r15, r8)
            java.lang.String r14 = "_err"
            r13 = 0
            if (r7 == 0) goto L_0x00d9
            com.google.android.gms.measurement.internal.h5 r3 = r1.f3223j
            com.google.android.gms.measurement.internal.c4 r3 = r3.i()
            com.google.android.gms.measurement.internal.e4 r3 = r3.H()
            java.lang.Object r4 = com.google.android.gms.measurement.internal.c4.w(r15)
            com.google.android.gms.measurement.internal.h5 r5 = r1.f3223j
            com.google.android.gms.measurement.internal.a4 r5 = r5.H()
            java.lang.String r6 = r2.f3081g
            java.lang.String r5 = r5.v(r6)
            java.lang.String r6 = "Dropping blacklisted event. appId"
            r3.c(r6, r4, r5)
            com.google.android.gms.measurement.internal.b5 r3 = r26.V()
            boolean r3 = r3.H(r15)
            if (r3 != 0) goto L_0x0073
            com.google.android.gms.measurement.internal.b5 r3 = r26.V()
            boolean r3 = r3.I(r15)
            if (r3 == 0) goto L_0x0071
            goto L_0x0073
        L_0x0071:
            r3 = 0
            goto L_0x0074
        L_0x0073:
            r3 = 1
        L_0x0074:
            if (r3 != 0) goto L_0x008f
            java.lang.String r4 = r2.f3081g
            boolean r4 = r14.equals(r4)
            if (r4 != 0) goto L_0x008f
            com.google.android.gms.measurement.internal.h5 r4 = r1.f3223j
            com.google.android.gms.measurement.internal.fa r7 = r4.G()
            r9 = 11
            java.lang.String r11 = r2.f3081g
            r12 = 0
            java.lang.String r10 = "_ev"
            r8 = r15
            r7.W(r8, r9, r10, r11, r12)
        L_0x008f:
            if (r3 == 0) goto L_0x00d8
            com.google.android.gms.measurement.internal.d r2 = r26.Z()
            com.google.android.gms.measurement.internal.f4 r2 = r2.j0(r15)
            if (r2 == 0) goto L_0x00d8
            long r3 = r2.h0()
            long r5 = r2.g0()
            long r3 = java.lang.Math.max(r3, r5)
            com.google.android.gms.measurement.internal.h5 r5 = r1.f3223j
            com.google.android.gms.common.util.e r5 = r5.f()
            long r5 = r5.b()
            long r5 = r5 - r3
            long r3 = java.lang.Math.abs(r5)
            com.google.android.gms.measurement.internal.r3<java.lang.Long> r5 = com.google.android.gms.measurement.internal.u.z
            java.lang.Object r5 = r5.a(r13)
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x00d8
            com.google.android.gms.measurement.internal.h5 r3 = r1.f3223j
            com.google.android.gms.measurement.internal.c4 r3 = r3.i()
            com.google.android.gms.measurement.internal.e4 r3 = r3.L()
            java.lang.String r4 = "Fetching config for blacklisted app"
            r3.a(r4)
            r1.r(r2)
        L_0x00d8:
            return
        L_0x00d9:
            boolean r7 = com.google.android.gms.internal.measurement.eb.a()
            if (r7 == 0) goto L_0x0108
            com.google.android.gms.measurement.internal.h5 r7 = r1.f3223j
            com.google.android.gms.measurement.internal.wa r7 = r7.c()
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r8 = com.google.android.gms.measurement.internal.u.E0
            boolean r7 = r7.s(r8)
            if (r7 == 0) goto L_0x0108
            com.google.android.gms.measurement.internal.h4 r2 = com.google.android.gms.measurement.internal.h4.b(r27)
            com.google.android.gms.measurement.internal.h5 r7 = r1.f3223j
            com.google.android.gms.measurement.internal.fa r7 = r7.G()
            com.google.android.gms.measurement.internal.h5 r8 = r1.f3223j
            com.google.android.gms.measurement.internal.wa r8 = r8.c()
            int r8 = r8.m(r15)
            r7.V(r2, r8)
            com.google.android.gms.measurement.internal.s r2 = r2.a()
        L_0x0108:
            com.google.android.gms.measurement.internal.h5 r7 = r1.f3223j
            com.google.android.gms.measurement.internal.c4 r7 = r7.i()
            r8 = 2
            boolean r7 = r7.B(r8)
            if (r7 == 0) goto L_0x012e
            com.google.android.gms.measurement.internal.h5 r7 = r1.f3223j
            com.google.android.gms.measurement.internal.c4 r7 = r7.i()
            com.google.android.gms.measurement.internal.e4 r7 = r7.M()
            com.google.android.gms.measurement.internal.h5 r9 = r1.f3223j
            com.google.android.gms.measurement.internal.a4 r9 = r9.H()
            java.lang.String r9 = r9.u(r2)
            java.lang.String r10 = "Logging event"
            r7.b(r10, r9)
        L_0x012e:
            com.google.android.gms.measurement.internal.d r7 = r26.Z()
            r7.t0()
            r1.U(r3)     // Catch:{ all -> 0x09fb }
            boolean r7 = com.google.android.gms.internal.measurement.lb.a()     // Catch:{ all -> 0x09fb }
            if (r7 == 0) goto L_0x014e
            com.google.android.gms.measurement.internal.h5 r7 = r1.f3223j     // Catch:{ all -> 0x09fb }
            com.google.android.gms.measurement.internal.wa r7 = r7.c()     // Catch:{ all -> 0x09fb }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r9 = com.google.android.gms.measurement.internal.u.D0     // Catch:{ all -> 0x09fb }
            boolean r7 = r7.s(r9)     // Catch:{ all -> 0x09fb }
            if (r7 == 0) goto L_0x014e
            r7 = 1
            goto L_0x014f
        L_0x014e:
            r7 = 0
        L_0x014f:
            java.lang.String r9 = "ecommerce_purchase"
            java.lang.String r10 = r2.f3081g     // Catch:{ all -> 0x09fb }
            boolean r9 = r9.equals(r10)     // Catch:{ all -> 0x09fb }
            java.lang.String r10 = "refund"
            if (r9 != 0) goto L_0x0172
            if (r7 == 0) goto L_0x0170
            java.lang.String r7 = "purchase"
            java.lang.String r9 = r2.f3081g     // Catch:{ all -> 0x09fb }
            boolean r7 = r7.equals(r9)     // Catch:{ all -> 0x09fb }
            if (r7 != 0) goto L_0x0172
            java.lang.String r7 = r2.f3081g     // Catch:{ all -> 0x09fb }
            boolean r7 = r10.equals(r7)     // Catch:{ all -> 0x09fb }
            if (r7 == 0) goto L_0x0170
            goto L_0x0172
        L_0x0170:
            r7 = 0
            goto L_0x0173
        L_0x0172:
            r7 = 1
        L_0x0173:
            java.lang.String r9 = "_iap"
            java.lang.String r11 = r2.f3081g     // Catch:{ all -> 0x09fb }
            boolean r9 = r9.equals(r11)     // Catch:{ all -> 0x09fb }
            if (r9 != 0) goto L_0x0182
            if (r7 == 0) goto L_0x0180
            goto L_0x0182
        L_0x0180:
            r9 = 0
            goto L_0x0183
        L_0x0182:
            r9 = 1
        L_0x0183:
            if (r9 == 0) goto L_0x0327
            com.google.android.gms.measurement.internal.n r9 = r2.f3082h     // Catch:{ all -> 0x09fb }
            java.lang.String r11 = "currency"
            java.lang.String r9 = r9.L(r11)     // Catch:{ all -> 0x09fb }
            java.lang.String r11 = "value"
            if (r7 == 0) goto L_0x0200
            com.google.android.gms.measurement.internal.n r7 = r2.f3082h     // Catch:{ all -> 0x09fb }
            java.lang.Double r7 = r7.K(r11)     // Catch:{ all -> 0x09fb }
            double r17 = r7.doubleValue()     // Catch:{ all -> 0x09fb }
            r19 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r17 = r17 * r19
            r21 = 0
            int r7 = (r17 > r21 ? 1 : (r17 == r21 ? 0 : -1))
            if (r7 != 0) goto L_0x01b5
            com.google.android.gms.measurement.internal.n r7 = r2.f3082h     // Catch:{ all -> 0x09fb }
            java.lang.Long r7 = r7.q(r11)     // Catch:{ all -> 0x09fb }
            long r12 = r7.longValue()     // Catch:{ all -> 0x09fb }
            double r11 = (double) r12     // Catch:{ all -> 0x09fb }
            double r17 = r11 * r19
        L_0x01b5:
            r11 = 4890909195324358656(0x43e0000000000000, double:9.223372036854776E18)
            int r7 = (r17 > r11 ? 1 : (r17 == r11 ? 0 : -1))
            if (r7 > 0) goto L_0x01e3
            r11 = -4332462841530417152(0xc3e0000000000000, double:-9.223372036854776E18)
            int r7 = (r17 > r11 ? 1 : (r17 == r11 ? 0 : -1))
            if (r7 < 0) goto L_0x01e3
            long r11 = java.lang.Math.round(r17)     // Catch:{ all -> 0x09fb }
            boolean r7 = com.google.android.gms.internal.measurement.lb.a()     // Catch:{ all -> 0x09fb }
            if (r7 == 0) goto L_0x020a
            com.google.android.gms.measurement.internal.h5 r7 = r1.f3223j     // Catch:{ all -> 0x09fb }
            com.google.android.gms.measurement.internal.wa r7 = r7.c()     // Catch:{ all -> 0x09fb }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r13 = com.google.android.gms.measurement.internal.u.D0     // Catch:{ all -> 0x09fb }
            boolean r7 = r7.s(r13)     // Catch:{ all -> 0x09fb }
            if (r7 == 0) goto L_0x020a
            java.lang.String r7 = r2.f3081g     // Catch:{ all -> 0x09fb }
            boolean r7 = r10.equals(r7)     // Catch:{ all -> 0x09fb }
            if (r7 == 0) goto L_0x020a
            long r11 = -r11
            goto L_0x020a
        L_0x01e3:
            com.google.android.gms.measurement.internal.h5 r7 = r1.f3223j     // Catch:{ all -> 0x09fb }
            com.google.android.gms.measurement.internal.c4 r7 = r7.i()     // Catch:{ all -> 0x09fb }
            com.google.android.gms.measurement.internal.e4 r7 = r7.H()     // Catch:{ all -> 0x09fb }
            java.lang.String r8 = "Data lost. Currency value is too big. appId"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.c4.w(r15)     // Catch:{ all -> 0x09fb }
            java.lang.Double r10 = java.lang.Double.valueOf(r17)     // Catch:{ all -> 0x09fb }
            r7.c(r8, r9, r10)     // Catch:{ all -> 0x09fb }
            r23 = r5
            r5 = 0
            r11 = 0
            goto L_0x0316
        L_0x0200:
            com.google.android.gms.measurement.internal.n r7 = r2.f3082h     // Catch:{ all -> 0x09fb }
            java.lang.Long r7 = r7.q(r11)     // Catch:{ all -> 0x09fb }
            long r11 = r7.longValue()     // Catch:{ all -> 0x09fb }
        L_0x020a:
            boolean r7 = android.text.TextUtils.isEmpty(r9)     // Catch:{ all -> 0x09fb }
            if (r7 != 0) goto L_0x0312
            java.util.Locale r7 = java.util.Locale.US     // Catch:{ all -> 0x09fb }
            java.lang.String r7 = r9.toUpperCase(r7)     // Catch:{ all -> 0x09fb }
            java.lang.String r9 = "[A-Z]{3}"
            boolean r9 = r7.matches(r9)     // Catch:{ all -> 0x09fb }
            if (r9 == 0) goto L_0x0312
            java.lang.String r9 = "_ltv_"
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x09fb }
            int r10 = r7.length()     // Catch:{ all -> 0x09fb }
            if (r10 == 0) goto L_0x022f
            java.lang.String r7 = r9.concat(r7)     // Catch:{ all -> 0x09fb }
            goto L_0x0234
        L_0x022f:
            java.lang.String r7 = new java.lang.String     // Catch:{ all -> 0x09fb }
            r7.<init>(r9)     // Catch:{ all -> 0x09fb }
        L_0x0234:
            r10 = r7
            com.google.android.gms.measurement.internal.d r7 = r26.Z()     // Catch:{ all -> 0x09fb }
            com.google.android.gms.measurement.internal.ga r7 = r7.o0(r15, r10)     // Catch:{ all -> 0x09fb }
            if (r7 == 0) goto L_0x0270
            java.lang.Object r9 = r7.f2866e     // Catch:{ all -> 0x09fb }
            boolean r9 = r9 instanceof java.lang.Long     // Catch:{ all -> 0x09fb }
            if (r9 != 0) goto L_0x0246
            goto L_0x0270
        L_0x0246:
            java.lang.Object r7 = r7.f2866e     // Catch:{ all -> 0x09fb }
            java.lang.Long r7 = (java.lang.Long) r7     // Catch:{ all -> 0x09fb }
            long r7 = r7.longValue()     // Catch:{ all -> 0x09fb }
            com.google.android.gms.measurement.internal.ga r17 = new com.google.android.gms.measurement.internal.ga     // Catch:{ all -> 0x09fb }
            java.lang.String r9 = r2.f3083i     // Catch:{ all -> 0x09fb }
            com.google.android.gms.measurement.internal.h5 r13 = r1.f3223j     // Catch:{ all -> 0x09fb }
            com.google.android.gms.common.util.e r13 = r13.f()     // Catch:{ all -> 0x09fb }
            long r18 = r13.b()     // Catch:{ all -> 0x09fb }
            long r7 = r7 + r11
            java.lang.Long r13 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x09fb }
            r7 = r17
            r8 = r15
            r23 = r5
            r5 = 0
            r6 = 1
            r11 = r18
            r7.<init>(r8, r9, r10, r11, r13)     // Catch:{ all -> 0x09fb }
        L_0x026d:
            r6 = r17
            goto L_0x02d7
        L_0x0270:
            r23 = r5
            r5 = 0
            r6 = 1
            com.google.android.gms.measurement.internal.d r7 = r26.Z()     // Catch:{ all -> 0x09fb }
            com.google.android.gms.measurement.internal.h5 r9 = r1.f3223j     // Catch:{ all -> 0x09fb }
            com.google.android.gms.measurement.internal.wa r9 = r9.c()     // Catch:{ all -> 0x09fb }
            com.google.android.gms.measurement.internal.r3<java.lang.Integer> r13 = com.google.android.gms.measurement.internal.u.E     // Catch:{ all -> 0x09fb }
            int r9 = r9.u(r15, r13)     // Catch:{ all -> 0x09fb }
            int r9 = r9 - r6
            com.google.android.gms.common.internal.r.g(r15)     // Catch:{ all -> 0x09fb }
            r7.c()     // Catch:{ all -> 0x09fb }
            r7.r()     // Catch:{ all -> 0x09fb }
            android.database.sqlite.SQLiteDatabase r13 = r7.v()     // Catch:{ SQLiteException -> 0x02a9 }
            java.lang.String r8 = "delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '_ltv_%' order by set_timestamp desc limit ?,10);"
            r6 = 3
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch:{ SQLiteException -> 0x02a9 }
            r6[r5] = r15     // Catch:{ SQLiteException -> 0x02a9 }
            r16 = 1
            r6[r16] = r15     // Catch:{ SQLiteException -> 0x02a9 }
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ SQLiteException -> 0x02a9 }
            r16 = 2
            r6[r16] = r9     // Catch:{ SQLiteException -> 0x02a9 }
            r13.execSQL(r8, r6)     // Catch:{ SQLiteException -> 0x02a9 }
            goto L_0x02bc
        L_0x02a9:
            r0 = move-exception
            r6 = r0
            com.google.android.gms.measurement.internal.c4 r7 = r7.i()     // Catch:{ all -> 0x09fb }
            com.google.android.gms.measurement.internal.e4 r7 = r7.E()     // Catch:{ all -> 0x09fb }
            java.lang.String r8 = "Error pruning currencies. appId"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.c4.w(r15)     // Catch:{ all -> 0x09fb }
            r7.c(r8, r9, r6)     // Catch:{ all -> 0x09fb }
        L_0x02bc:
            com.google.android.gms.measurement.internal.ga r17 = new com.google.android.gms.measurement.internal.ga     // Catch:{ all -> 0x09fb }
            java.lang.String r9 = r2.f3083i     // Catch:{ all -> 0x09fb }
            com.google.android.gms.measurement.internal.h5 r6 = r1.f3223j     // Catch:{ all -> 0x09fb }
            com.google.android.gms.common.util.e r6 = r6.f()     // Catch:{ all -> 0x09fb }
            long r18 = r6.b()     // Catch:{ all -> 0x09fb }
            java.lang.Long r13 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x09fb }
            r7 = r17
            r8 = r15
            r11 = r18
            r7.<init>(r8, r9, r10, r11, r13)     // Catch:{ all -> 0x09fb }
            goto L_0x026d
        L_0x02d7:
            com.google.android.gms.measurement.internal.d r7 = r26.Z()     // Catch:{ all -> 0x09fb }
            boolean r7 = r7.T(r6)     // Catch:{ all -> 0x09fb }
            if (r7 != 0) goto L_0x0315
            com.google.android.gms.measurement.internal.h5 r7 = r1.f3223j     // Catch:{ all -> 0x09fb }
            com.google.android.gms.measurement.internal.c4 r7 = r7.i()     // Catch:{ all -> 0x09fb }
            com.google.android.gms.measurement.internal.e4 r7 = r7.E()     // Catch:{ all -> 0x09fb }
            java.lang.String r8 = "Too many unique user properties are set. Ignoring user property. appId"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.c4.w(r15)     // Catch:{ all -> 0x09fb }
            com.google.android.gms.measurement.internal.h5 r10 = r1.f3223j     // Catch:{ all -> 0x09fb }
            com.google.android.gms.measurement.internal.a4 r10 = r10.H()     // Catch:{ all -> 0x09fb }
            java.lang.String r11 = r6.c     // Catch:{ all -> 0x09fb }
            java.lang.String r10 = r10.z(r11)     // Catch:{ all -> 0x09fb }
            java.lang.Object r6 = r6.f2866e     // Catch:{ all -> 0x09fb }
            r7.d(r8, r9, r10, r6)     // Catch:{ all -> 0x09fb }
            com.google.android.gms.measurement.internal.h5 r6 = r1.f3223j     // Catch:{ all -> 0x09fb }
            com.google.android.gms.measurement.internal.fa r7 = r6.G()     // Catch:{ all -> 0x09fb }
            r9 = 9
            r10 = 0
            r11 = 0
            r12 = 0
            r8 = r15
            r7.W(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x09fb }
            goto L_0x0315
        L_0x0312:
            r23 = r5
            r5 = 0
        L_0x0315:
            r11 = 1
        L_0x0316:
            if (r11 != 0) goto L_0x032a
            com.google.android.gms.measurement.internal.d r2 = r26.Z()     // Catch:{ all -> 0x09fb }
            r2.u()     // Catch:{ all -> 0x09fb }
            com.google.android.gms.measurement.internal.d r2 = r26.Z()
            r2.y0()
            return
        L_0x0327:
            r23 = r5
            r5 = 0
        L_0x032a:
            java.lang.String r6 = r2.f3081g     // Catch:{ all -> 0x09fb }
            boolean r6 = com.google.android.gms.measurement.internal.fa.d0(r6)     // Catch:{ all -> 0x09fb }
            java.lang.String r7 = r2.f3081g     // Catch:{ all -> 0x09fb }
            boolean r18 = r14.equals(r7)     // Catch:{ all -> 0x09fb }
            boolean r7 = com.google.android.gms.internal.measurement.lb.a()     // Catch:{ all -> 0x09fb }
            r19 = 1
            if (r7 == 0) goto L_0x035d
            com.google.android.gms.measurement.internal.h5 r7 = r1.f3223j     // Catch:{ all -> 0x09fb }
            com.google.android.gms.measurement.internal.wa r7 = r7.c()     // Catch:{ all -> 0x09fb }
            java.lang.String r8 = r3.f2956g     // Catch:{ all -> 0x09fb }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r9 = com.google.android.gms.measurement.internal.u.z0     // Catch:{ all -> 0x09fb }
            boolean r7 = r7.C(r8, r9)     // Catch:{ all -> 0x09fb }
            if (r7 == 0) goto L_0x035d
            com.google.android.gms.measurement.internal.h5 r7 = r1.f3223j     // Catch:{ all -> 0x09fb }
            r7.G()     // Catch:{ all -> 0x09fb }
            com.google.android.gms.measurement.internal.n r7 = r2.f3082h     // Catch:{ all -> 0x09fb }
            long r7 = com.google.android.gms.measurement.internal.fa.y(r7)     // Catch:{ all -> 0x09fb }
            long r7 = r7 + r19
            r11 = r7
            goto L_0x035f
        L_0x035d:
            r11 = r19
        L_0x035f:
            com.google.android.gms.measurement.internal.d r7 = r26.Z()     // Catch:{ all -> 0x09fb }
            long r8 = r26.o0()     // Catch:{ all -> 0x09fb }
            r13 = 1
            r16 = 0
            r17 = 0
            r10 = r15
            r14 = r6
            r27 = r15
            r15 = r16
            r16 = r18
            com.google.android.gms.measurement.internal.g r7 = r7.B(r8, r10, r11, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x09fb }
            long r8 = r7.b     // Catch:{ all -> 0x09fb }
            com.google.android.gms.measurement.internal.r3<java.lang.Integer> r10 = com.google.android.gms.measurement.internal.u.f3140k     // Catch:{ all -> 0x09fb }
            r14 = 0
            java.lang.Object r10 = r10.a(r14)     // Catch:{ all -> 0x09fb }
            java.lang.Integer r10 = (java.lang.Integer) r10     // Catch:{ all -> 0x09fb }
            int r10 = r10.intValue()     // Catch:{ all -> 0x09fb }
            long r10 = (long) r10     // Catch:{ all -> 0x09fb }
            long r8 = r8 - r10
            r10 = 1000(0x3e8, double:4.94E-321)
            r12 = 0
            int r15 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r15 <= 0) goto L_0x03be
            long r8 = r8 % r10
            int r2 = (r8 > r19 ? 1 : (r8 == r19 ? 0 : -1))
            if (r2 != 0) goto L_0x03af
            com.google.android.gms.measurement.internal.h5 r2 = r1.f3223j     // Catch:{ all -> 0x09fb }
            com.google.android.gms.measurement.internal.c4 r2 = r2.i()     // Catch:{ all -> 0x09fb }
            com.google.android.gms.measurement.internal.e4 r2 = r2.E()     // Catch:{ all -> 0x09fb }
            java.lang.String r3 = "Data loss. Too many events logged. appId, count"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.c4.w(r27)     // Catch:{ all -> 0x09fb }
            long r5 = r7.b     // Catch:{ all -> 0x09fb }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x09fb }
            r2.c(r3, r4, r5)     // Catch:{ all -> 0x09fb }
        L_0x03af:
            com.google.android.gms.measurement.internal.d r2 = r26.Z()     // Catch:{ all -> 0x09fb }
            r2.u()     // Catch:{ all -> 0x09fb }
            com.google.android.gms.measurement.internal.d r2 = r26.Z()
            r2.y0()
            return
        L_0x03be:
            if (r6 == 0) goto L_0x0413
            long r8 = r7.a     // Catch:{ all -> 0x09fb }
            com.google.android.gms.measurement.internal.r3<java.lang.Integer> r15 = com.google.android.gms.measurement.internal.u.f3142m     // Catch:{ all -> 0x09fb }
            java.lang.Object r15 = r15.a(r14)     // Catch:{ all -> 0x09fb }
            java.lang.Integer r15 = (java.lang.Integer) r15     // Catch:{ all -> 0x09fb }
            int r15 = r15.intValue()     // Catch:{ all -> 0x09fb }
            long r14 = (long) r15     // Catch:{ all -> 0x09fb }
            long r8 = r8 - r14
            int r14 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r14 <= 0) goto L_0x0413
            long r8 = r8 % r10
            int r3 = (r8 > r19 ? 1 : (r8 == r19 ? 0 : -1))
            if (r3 != 0) goto L_0x03f2
            com.google.android.gms.measurement.internal.h5 r3 = r1.f3223j     // Catch:{ all -> 0x09fb }
            com.google.android.gms.measurement.internal.c4 r3 = r3.i()     // Catch:{ all -> 0x09fb }
            com.google.android.gms.measurement.internal.e4 r3 = r3.E()     // Catch:{ all -> 0x09fb }
            java.lang.String r4 = "Data loss. Too many public events logged. appId, count"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.c4.w(r27)     // Catch:{ all -> 0x09fb }
            long r6 = r7.a     // Catch:{ all -> 0x09fb }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x09fb }
            r3.c(r4, r5, r6)     // Catch:{ all -> 0x09fb }
        L_0x03f2:
            com.google.android.gms.measurement.internal.h5 r3 = r1.f3223j     // Catch:{ all -> 0x09fb }
            com.google.android.gms.measurement.internal.fa r7 = r3.G()     // Catch:{ all -> 0x09fb }
            r9 = 16
            java.lang.String r10 = "_ev"
            java.lang.String r11 = r2.f3081g     // Catch:{ all -> 0x09fb }
            r12 = 0
            r8 = r27
            r7.W(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x09fb }
            com.google.android.gms.measurement.internal.d r2 = r26.Z()     // Catch:{ all -> 0x09fb }
            r2.u()     // Catch:{ all -> 0x09fb }
            com.google.android.gms.measurement.internal.d r2 = r26.Z()
            r2.y0()
            return
        L_0x0413:
            if (r18 == 0) goto L_0x0462
            long r8 = r7.f2849d     // Catch:{ all -> 0x09fb }
            com.google.android.gms.measurement.internal.h5 r10 = r1.f3223j     // Catch:{ all -> 0x09fb }
            com.google.android.gms.measurement.internal.wa r10 = r10.c()     // Catch:{ all -> 0x09fb }
            java.lang.String r11 = r3.f2956g     // Catch:{ all -> 0x09fb }
            com.google.android.gms.measurement.internal.r3<java.lang.Integer> r14 = com.google.android.gms.measurement.internal.u.f3141l     // Catch:{ all -> 0x09fb }
            int r10 = r10.u(r11, r14)     // Catch:{ all -> 0x09fb }
            r11 = 1000000(0xf4240, float:1.401298E-39)
            int r10 = java.lang.Math.min(r11, r10)     // Catch:{ all -> 0x09fb }
            int r10 = java.lang.Math.max(r5, r10)     // Catch:{ all -> 0x09fb }
            long r10 = (long) r10     // Catch:{ all -> 0x09fb }
            long r8 = r8 - r10
            int r10 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r10 <= 0) goto L_0x0462
            int r2 = (r8 > r19 ? 1 : (r8 == r19 ? 0 : -1))
            if (r2 != 0) goto L_0x0453
            com.google.android.gms.measurement.internal.h5 r2 = r1.f3223j     // Catch:{ all -> 0x09fb }
            com.google.android.gms.measurement.internal.c4 r2 = r2.i()     // Catch:{ all -> 0x09fb }
            com.google.android.gms.measurement.internal.e4 r2 = r2.E()     // Catch:{ all -> 0x09fb }
            java.lang.String r3 = "Too many error events logged. appId, count"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.c4.w(r27)     // Catch:{ all -> 0x09fb }
            long r5 = r7.f2849d     // Catch:{ all -> 0x09fb }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x09fb }
            r2.c(r3, r4, r5)     // Catch:{ all -> 0x09fb }
        L_0x0453:
            com.google.android.gms.measurement.internal.d r2 = r26.Z()     // Catch:{ all -> 0x09fb }
            r2.u()     // Catch:{ all -> 0x09fb }
            com.google.android.gms.measurement.internal.d r2 = r26.Z()
            r2.y0()
            return
        L_0x0462:
            com.google.android.gms.measurement.internal.n r7 = r2.f3082h     // Catch:{ all -> 0x09fb }
            android.os.Bundle r14 = r7.o()     // Catch:{ all -> 0x09fb }
            com.google.android.gms.measurement.internal.h5 r7 = r1.f3223j     // Catch:{ all -> 0x09fb }
            com.google.android.gms.measurement.internal.fa r7 = r7.G()     // Catch:{ all -> 0x09fb }
            java.lang.String r8 = "_o"
            java.lang.String r9 = r2.f3083i     // Catch:{ all -> 0x09fb }
            r7.N(r14, r8, r9)     // Catch:{ all -> 0x09fb }
            com.google.android.gms.measurement.internal.h5 r7 = r1.f3223j     // Catch:{ all -> 0x09fb }
            com.google.android.gms.measurement.internal.fa r7 = r7.G()     // Catch:{ all -> 0x09fb }
            r15 = r27
            boolean r7 = r7.D0(r15)     // Catch:{ all -> 0x09fb }
            java.lang.String r11 = "_r"
            if (r7 == 0) goto L_0x04a1
            com.google.android.gms.measurement.internal.h5 r7 = r1.f3223j     // Catch:{ all -> 0x09fb }
            com.google.android.gms.measurement.internal.fa r7 = r7.G()     // Catch:{ all -> 0x09fb }
            java.lang.String r8 = "_dbg"
            java.lang.Long r9 = java.lang.Long.valueOf(r19)     // Catch:{ all -> 0x09fb }
            r7.N(r14, r8, r9)     // Catch:{ all -> 0x09fb }
            com.google.android.gms.measurement.internal.h5 r7 = r1.f3223j     // Catch:{ all -> 0x09fb }
            com.google.android.gms.measurement.internal.fa r7 = r7.G()     // Catch:{ all -> 0x09fb }
            java.lang.Long r8 = java.lang.Long.valueOf(r19)     // Catch:{ all -> 0x09fb }
            r7.N(r14, r11, r8)     // Catch:{ all -> 0x09fb }
        L_0x04a1:
            java.lang.String r7 = "_s"
            java.lang.String r8 = r2.f3081g     // Catch:{ all -> 0x09fb }
            boolean r7 = r7.equals(r8)     // Catch:{ all -> 0x09fb }
            if (r7 == 0) goto L_0x04c8
            com.google.android.gms.measurement.internal.d r7 = r26.Z()     // Catch:{ all -> 0x09fb }
            java.lang.String r8 = r3.f2956g     // Catch:{ all -> 0x09fb }
            com.google.android.gms.measurement.internal.ga r7 = r7.o0(r8, r4)     // Catch:{ all -> 0x09fb }
            if (r7 == 0) goto L_0x04c8
            java.lang.Object r8 = r7.f2866e     // Catch:{ all -> 0x09fb }
            boolean r8 = r8 instanceof java.lang.Long     // Catch:{ all -> 0x09fb }
            if (r8 == 0) goto L_0x04c8
            com.google.android.gms.measurement.internal.h5 r8 = r1.f3223j     // Catch:{ all -> 0x09fb }
            com.google.android.gms.measurement.internal.fa r8 = r8.G()     // Catch:{ all -> 0x09fb }
            java.lang.Object r7 = r7.f2866e     // Catch:{ all -> 0x09fb }
            r8.N(r14, r4, r7)     // Catch:{ all -> 0x09fb }
        L_0x04c8:
            com.google.android.gms.measurement.internal.d r4 = r26.Z()     // Catch:{ all -> 0x09fb }
            long r7 = r4.n0(r15)     // Catch:{ all -> 0x09fb }
            int r4 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r4 <= 0) goto L_0x04eb
            com.google.android.gms.measurement.internal.h5 r4 = r1.f3223j     // Catch:{ all -> 0x09fb }
            com.google.android.gms.measurement.internal.c4 r4 = r4.i()     // Catch:{ all -> 0x09fb }
            com.google.android.gms.measurement.internal.e4 r4 = r4.H()     // Catch:{ all -> 0x09fb }
            java.lang.String r9 = "Data lost. Too many events stored on disk, deleted. appId"
            java.lang.Object r10 = com.google.android.gms.measurement.internal.c4.w(r15)     // Catch:{ all -> 0x09fb }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x09fb }
            r4.c(r9, r10, r7)     // Catch:{ all -> 0x09fb }
        L_0x04eb:
            com.google.android.gms.measurement.internal.l r4 = new com.google.android.gms.measurement.internal.l     // Catch:{ all -> 0x09fb }
            com.google.android.gms.measurement.internal.h5 r8 = r1.f3223j     // Catch:{ all -> 0x09fb }
            java.lang.String r9 = r2.f3083i     // Catch:{ all -> 0x09fb }
            java.lang.String r10 = r2.f3081g     // Catch:{ all -> 0x09fb }
            long r12 = r2.f3084j     // Catch:{ all -> 0x09fb }
            r18 = 0
            r7 = r4
            r2 = r10
            r10 = r15
            r5 = r11
            r11 = r2
            r16 = r14
            r2 = r15
            r25 = 0
            r14 = r18
            r7.<init>((com.google.android.gms.measurement.internal.h5) r8, (java.lang.String) r9, (java.lang.String) r10, (java.lang.String) r11, (long) r12, (long) r14, (android.os.Bundle) r16)     // Catch:{ all -> 0x09fb }
            com.google.android.gms.measurement.internal.d r7 = r26.Z()     // Catch:{ all -> 0x09fb }
            java.lang.String r8 = r4.b     // Catch:{ all -> 0x09fb }
            com.google.android.gms.measurement.internal.o r7 = r7.D(r2, r8)     // Catch:{ all -> 0x09fb }
            if (r7 != 0) goto L_0x0589
            com.google.android.gms.measurement.internal.d r7 = r26.Z()     // Catch:{ all -> 0x09fb }
            long r7 = r7.z0(r2)     // Catch:{ all -> 0x09fb }
            com.google.android.gms.measurement.internal.h5 r9 = r1.f3223j     // Catch:{ all -> 0x09fb }
            com.google.android.gms.measurement.internal.wa r9 = r9.c()     // Catch:{ all -> 0x09fb }
            int r9 = r9.t(r2)     // Catch:{ all -> 0x09fb }
            long r9 = (long) r9     // Catch:{ all -> 0x09fb }
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 < 0) goto L_0x056f
            if (r6 == 0) goto L_0x056f
            com.google.android.gms.measurement.internal.h5 r3 = r1.f3223j     // Catch:{ all -> 0x09fb }
            com.google.android.gms.measurement.internal.c4 r3 = r3.i()     // Catch:{ all -> 0x09fb }
            com.google.android.gms.measurement.internal.e4 r3 = r3.E()     // Catch:{ all -> 0x09fb }
            java.lang.String r5 = "Too many event names used, ignoring event. appId, name, supported count"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.c4.w(r2)     // Catch:{ all -> 0x09fb }
            com.google.android.gms.measurement.internal.h5 r7 = r1.f3223j     // Catch:{ all -> 0x09fb }
            com.google.android.gms.measurement.internal.a4 r7 = r7.H()     // Catch:{ all -> 0x09fb }
            java.lang.String r4 = r4.b     // Catch:{ all -> 0x09fb }
            java.lang.String r4 = r7.v(r4)     // Catch:{ all -> 0x09fb }
            com.google.android.gms.measurement.internal.h5 r7 = r1.f3223j     // Catch:{ all -> 0x09fb }
            com.google.android.gms.measurement.internal.wa r7 = r7.c()     // Catch:{ all -> 0x09fb }
            int r7 = r7.t(r2)     // Catch:{ all -> 0x09fb }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x09fb }
            r3.d(r5, r6, r4, r7)     // Catch:{ all -> 0x09fb }
            com.google.android.gms.measurement.internal.h5 r3 = r1.f3223j     // Catch:{ all -> 0x09fb }
            com.google.android.gms.measurement.internal.fa r7 = r3.G()     // Catch:{ all -> 0x09fb }
            r9 = 8
            r10 = 0
            r11 = 0
            r12 = 0
            r8 = r2
            r7.W(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x09fb }
            com.google.android.gms.measurement.internal.d r2 = r26.Z()
            r2.y0()
            return
        L_0x056f:
            com.google.android.gms.measurement.internal.o r6 = new com.google.android.gms.measurement.internal.o     // Catch:{ all -> 0x09fb }
            java.lang.String r9 = r4.b     // Catch:{ all -> 0x09fb }
            r10 = 0
            r12 = 0
            long r14 = r4.f2930d     // Catch:{ all -> 0x09fb }
            r16 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r7 = r6
            r8 = r2
            r7.<init>(r8, r9, r10, r12, r14, r16, r18, r19, r20, r21)     // Catch:{ all -> 0x09fb }
            goto L_0x0597
        L_0x0589:
            com.google.android.gms.measurement.internal.h5 r2 = r1.f3223j     // Catch:{ all -> 0x09fb }
            long r8 = r7.f3005f     // Catch:{ all -> 0x09fb }
            com.google.android.gms.measurement.internal.l r4 = r4.a(r2, r8)     // Catch:{ all -> 0x09fb }
            long r8 = r4.f2930d     // Catch:{ all -> 0x09fb }
            com.google.android.gms.measurement.internal.o r6 = r7.a(r8)     // Catch:{ all -> 0x09fb }
        L_0x0597:
            com.google.android.gms.measurement.internal.d r2 = r26.Z()     // Catch:{ all -> 0x09fb }
            r2.N(r6)     // Catch:{ all -> 0x09fb }
            r26.n0()     // Catch:{ all -> 0x09fb }
            r26.g0()     // Catch:{ all -> 0x09fb }
            com.google.android.gms.common.internal.r.k(r4)     // Catch:{ all -> 0x09fb }
            com.google.android.gms.common.internal.r.k(r28)     // Catch:{ all -> 0x09fb }
            java.lang.String r2 = r4.a     // Catch:{ all -> 0x09fb }
            com.google.android.gms.common.internal.r.g(r2)     // Catch:{ all -> 0x09fb }
            java.lang.String r2 = r4.a     // Catch:{ all -> 0x09fb }
            java.lang.String r6 = r3.f2956g     // Catch:{ all -> 0x09fb }
            boolean r2 = r2.equals(r6)     // Catch:{ all -> 0x09fb }
            com.google.android.gms.common.internal.r.a(r2)     // Catch:{ all -> 0x09fb }
            com.google.android.gms.internal.measurement.e1$a r2 = com.google.android.gms.internal.measurement.e1.P0()     // Catch:{ all -> 0x09fb }
            r6 = 1
            r2.z(r6)     // Catch:{ all -> 0x09fb }
            java.lang.String r7 = "android"
            r2.H(r7)     // Catch:{ all -> 0x09fb }
            java.lang.String r7 = r3.f2956g     // Catch:{ all -> 0x09fb }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x09fb }
            if (r7 != 0) goto L_0x05d4
            java.lang.String r7 = r3.f2956g     // Catch:{ all -> 0x09fb }
            r2.k0(r7)     // Catch:{ all -> 0x09fb }
        L_0x05d4:
            java.lang.String r7 = r3.f2959j     // Catch:{ all -> 0x09fb }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x09fb }
            if (r7 != 0) goto L_0x05e1
            java.lang.String r7 = r3.f2959j     // Catch:{ all -> 0x09fb }
            r2.f0(r7)     // Catch:{ all -> 0x09fb }
        L_0x05e1:
            java.lang.String r7 = r3.f2958i     // Catch:{ all -> 0x09fb }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x09fb }
            if (r7 != 0) goto L_0x05ee
            java.lang.String r7 = r3.f2958i     // Catch:{ all -> 0x09fb }
            r2.q0(r7)     // Catch:{ all -> 0x09fb }
        L_0x05ee:
            long r7 = r3.p     // Catch:{ all -> 0x09fb }
            r9 = -2147483648(0xffffffff80000000, double:NaN)
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 == 0) goto L_0x05fd
            long r7 = r3.p     // Catch:{ all -> 0x09fb }
            int r8 = (int) r7     // Catch:{ all -> 0x09fb }
            r2.s0(r8)     // Catch:{ all -> 0x09fb }
        L_0x05fd:
            long r7 = r3.f2960k     // Catch:{ all -> 0x09fb }
            r2.j0(r7)     // Catch:{ all -> 0x09fb }
            java.lang.String r7 = r3.f2957h     // Catch:{ all -> 0x09fb }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x09fb }
            if (r7 != 0) goto L_0x060f
            java.lang.String r7 = r3.f2957h     // Catch:{ all -> 0x09fb }
            r2.F0(r7)     // Catch:{ all -> 0x09fb }
        L_0x060f:
            boolean r7 = com.google.android.gms.internal.measurement.fb.a()     // Catch:{ all -> 0x09fb }
            if (r7 == 0) goto L_0x0642
            com.google.android.gms.measurement.internal.h5 r7 = r1.f3223j     // Catch:{ all -> 0x09fb }
            com.google.android.gms.measurement.internal.wa r7 = r7.c()     // Catch:{ all -> 0x09fb }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r8 = com.google.android.gms.measurement.internal.u.Q0     // Catch:{ all -> 0x09fb }
            boolean r7 = r7.s(r8)     // Catch:{ all -> 0x09fb }
            if (r7 == 0) goto L_0x0642
            java.lang.String r7 = r3.f2956g     // Catch:{ all -> 0x09fb }
            com.google.android.gms.measurement.internal.e r7 = r1.c(r7)     // Catch:{ all -> 0x09fb }
            java.lang.String r8 = r3.C     // Catch:{ all -> 0x09fb }
            com.google.android.gms.measurement.internal.e r8 = com.google.android.gms.measurement.internal.e.b(r8)     // Catch:{ all -> 0x09fb }
            com.google.android.gms.measurement.internal.e r7 = r7.k(r8)     // Catch:{ all -> 0x09fb }
            java.lang.String r8 = r3.C     // Catch:{ all -> 0x09fb }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x09fb }
            if (r8 != 0) goto L_0x0642
            java.lang.String r7 = r7.e()     // Catch:{ all -> 0x09fb }
            r2.S0(r7)     // Catch:{ all -> 0x09fb }
        L_0x0642:
            boolean r7 = com.google.android.gms.internal.measurement.vc.a()     // Catch:{ all -> 0x09fb }
            if (r7 == 0) goto L_0x0691
            com.google.android.gms.measurement.internal.h5 r7 = r1.f3223j     // Catch:{ all -> 0x09fb }
            com.google.android.gms.measurement.internal.wa r7 = r7.c()     // Catch:{ all -> 0x09fb }
            java.lang.String r8 = r3.f2956g     // Catch:{ all -> 0x09fb }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r9 = com.google.android.gms.measurement.internal.u.k0     // Catch:{ all -> 0x09fb }
            boolean r7 = r7.C(r8, r9)     // Catch:{ all -> 0x09fb }
            if (r7 == 0) goto L_0x0691
            java.lang.String r7 = r2.O0()     // Catch:{ all -> 0x09fb }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x09fb }
            if (r7 == 0) goto L_0x066f
            java.lang.String r7 = r3.B     // Catch:{ all -> 0x09fb }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x09fb }
            if (r7 != 0) goto L_0x066f
            java.lang.String r7 = r3.B     // Catch:{ all -> 0x09fb }
            r2.Q0(r7)     // Catch:{ all -> 0x09fb }
        L_0x066f:
            java.lang.String r7 = r2.O0()     // Catch:{ all -> 0x09fb }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x09fb }
            if (r7 == 0) goto L_0x06a8
            java.lang.String r7 = r2.U0()     // Catch:{ all -> 0x09fb }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x09fb }
            if (r7 == 0) goto L_0x06a8
            java.lang.String r7 = r3.x     // Catch:{ all -> 0x09fb }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x09fb }
            if (r7 != 0) goto L_0x06a8
            java.lang.String r7 = r3.x     // Catch:{ all -> 0x09fb }
            r2.N0(r7)     // Catch:{ all -> 0x09fb }
            goto L_0x06a8
        L_0x0691:
            java.lang.String r7 = r2.O0()     // Catch:{ all -> 0x09fb }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x09fb }
            if (r7 == 0) goto L_0x06a8
            java.lang.String r7 = r3.x     // Catch:{ all -> 0x09fb }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x09fb }
            if (r7 != 0) goto L_0x06a8
            java.lang.String r7 = r3.x     // Catch:{ all -> 0x09fb }
            r2.N0(r7)     // Catch:{ all -> 0x09fb }
        L_0x06a8:
            long r7 = r3.f2961l     // Catch:{ all -> 0x09fb }
            r9 = 0
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 == 0) goto L_0x06b5
            long r7 = r3.f2961l     // Catch:{ all -> 0x09fb }
            r2.u0(r7)     // Catch:{ all -> 0x09fb }
        L_0x06b5:
            long r7 = r3.z     // Catch:{ all -> 0x09fb }
            r2.E0(r7)     // Catch:{ all -> 0x09fb }
            com.google.android.gms.measurement.internal.ba r7 = r26.d0()     // Catch:{ all -> 0x09fb }
            java.util.List r7 = r7.X()     // Catch:{ all -> 0x09fb }
            if (r7 == 0) goto L_0x06c7
            r2.X(r7)     // Catch:{ all -> 0x09fb }
        L_0x06c7:
            java.lang.String r7 = r3.f2956g     // Catch:{ all -> 0x09fb }
            com.google.android.gms.measurement.internal.e r7 = r1.c(r7)     // Catch:{ all -> 0x09fb }
            java.lang.String r8 = r3.C     // Catch:{ all -> 0x09fb }
            com.google.android.gms.measurement.internal.e r8 = com.google.android.gms.measurement.internal.e.b(r8)     // Catch:{ all -> 0x09fb }
            com.google.android.gms.measurement.internal.e r7 = r7.k(r8)     // Catch:{ all -> 0x09fb }
            boolean r8 = com.google.android.gms.internal.measurement.fb.a()     // Catch:{ all -> 0x09fb }
            if (r8 == 0) goto L_0x06f1
            com.google.android.gms.measurement.internal.h5 r8 = r1.f3223j     // Catch:{ all -> 0x09fb }
            com.google.android.gms.measurement.internal.wa r8 = r8.c()     // Catch:{ all -> 0x09fb }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r11 = com.google.android.gms.measurement.internal.u.Q0     // Catch:{ all -> 0x09fb }
            boolean r8 = r8.s(r11)     // Catch:{ all -> 0x09fb }
            if (r8 == 0) goto L_0x06f1
            boolean r8 = r7.o()     // Catch:{ all -> 0x09fb }
            if (r8 == 0) goto L_0x0799
        L_0x06f1:
            com.google.android.gms.measurement.internal.c9 r8 = r1.f3222i     // Catch:{ all -> 0x09fb }
            java.lang.String r11 = r3.f2956g     // Catch:{ all -> 0x09fb }
            android.util.Pair r8 = r8.u(r11, r7)     // Catch:{ all -> 0x09fb }
            if (r8 == 0) goto L_0x0721
            java.lang.Object r11 = r8.first     // Catch:{ all -> 0x09fb }
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11     // Catch:{ all -> 0x09fb }
            boolean r11 = android.text.TextUtils.isEmpty(r11)     // Catch:{ all -> 0x09fb }
            if (r11 != 0) goto L_0x0721
            boolean r11 = r3.u     // Catch:{ all -> 0x09fb }
            if (r11 == 0) goto L_0x0799
            java.lang.Object r11 = r8.first     // Catch:{ all -> 0x09fb }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x09fb }
            r2.v0(r11)     // Catch:{ all -> 0x09fb }
            java.lang.Object r11 = r8.second     // Catch:{ all -> 0x09fb }
            if (r11 == 0) goto L_0x0799
            java.lang.Object r8 = r8.second     // Catch:{ all -> 0x09fb }
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch:{ all -> 0x09fb }
            boolean r8 = r8.booleanValue()     // Catch:{ all -> 0x09fb }
            r2.I(r8)     // Catch:{ all -> 0x09fb }
            goto L_0x0799
        L_0x0721:
            com.google.android.gms.measurement.internal.h5 r8 = r1.f3223j     // Catch:{ all -> 0x09fb }
            com.google.android.gms.measurement.internal.m r8 = r8.Q()     // Catch:{ all -> 0x09fb }
            com.google.android.gms.measurement.internal.h5 r11 = r1.f3223j     // Catch:{ all -> 0x09fb }
            android.content.Context r11 = r11.j()     // Catch:{ all -> 0x09fb }
            boolean r8 = r8.t(r11)     // Catch:{ all -> 0x09fb }
            if (r8 != 0) goto L_0x0799
            boolean r8 = r3.v     // Catch:{ all -> 0x09fb }
            if (r8 == 0) goto L_0x0799
            boolean r8 = com.google.android.gms.internal.measurement.be.a()     // Catch:{ all -> 0x09fb }
            if (r8 == 0) goto L_0x074d
            com.google.android.gms.measurement.internal.h5 r8 = r1.f3223j     // Catch:{ all -> 0x09fb }
            com.google.android.gms.measurement.internal.wa r8 = r8.c()     // Catch:{ all -> 0x09fb }
            java.lang.String r11 = r3.f2956g     // Catch:{ all -> 0x09fb }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r12 = com.google.android.gms.measurement.internal.u.O0     // Catch:{ all -> 0x09fb }
            boolean r8 = r8.C(r11, r12)     // Catch:{ all -> 0x09fb }
            if (r8 != 0) goto L_0x0799
        L_0x074d:
            com.google.android.gms.measurement.internal.h5 r8 = r1.f3223j     // Catch:{ all -> 0x09fb }
            android.content.Context r8 = r8.j()     // Catch:{ all -> 0x09fb }
            android.content.ContentResolver r8 = r8.getContentResolver()     // Catch:{ all -> 0x09fb }
            java.lang.String r11 = "android_id"
            java.lang.String r8 = android.provider.Settings.Secure.getString(r8, r11)     // Catch:{ all -> 0x09fb }
            if (r8 != 0) goto L_0x0779
            com.google.android.gms.measurement.internal.h5 r8 = r1.f3223j     // Catch:{ all -> 0x09fb }
            com.google.android.gms.measurement.internal.c4 r8 = r8.i()     // Catch:{ all -> 0x09fb }
            com.google.android.gms.measurement.internal.e4 r8 = r8.H()     // Catch:{ all -> 0x09fb }
            java.lang.String r11 = "null secure ID. appId"
            java.lang.String r12 = r2.C0()     // Catch:{ all -> 0x09fb }
            java.lang.Object r12 = com.google.android.gms.measurement.internal.c4.w(r12)     // Catch:{ all -> 0x09fb }
            r8.b(r11, r12)     // Catch:{ all -> 0x09fb }
            java.lang.String r8 = "null"
            goto L_0x0796
        L_0x0779:
            boolean r11 = r8.isEmpty()     // Catch:{ all -> 0x09fb }
            if (r11 == 0) goto L_0x0796
            com.google.android.gms.measurement.internal.h5 r11 = r1.f3223j     // Catch:{ all -> 0x09fb }
            com.google.android.gms.measurement.internal.c4 r11 = r11.i()     // Catch:{ all -> 0x09fb }
            com.google.android.gms.measurement.internal.e4 r11 = r11.H()     // Catch:{ all -> 0x09fb }
            java.lang.String r12 = "empty secure ID. appId"
            java.lang.String r13 = r2.C0()     // Catch:{ all -> 0x09fb }
            java.lang.Object r13 = com.google.android.gms.measurement.internal.c4.w(r13)     // Catch:{ all -> 0x09fb }
            r11.b(r12, r13)     // Catch:{ all -> 0x09fb }
        L_0x0796:
            r2.K0(r8)     // Catch:{ all -> 0x09fb }
        L_0x0799:
            com.google.android.gms.measurement.internal.h5 r8 = r1.f3223j     // Catch:{ all -> 0x09fb }
            com.google.android.gms.measurement.internal.m r8 = r8.Q()     // Catch:{ all -> 0x09fb }
            r8.o()     // Catch:{ all -> 0x09fb }
            java.lang.String r8 = android.os.Build.MODEL     // Catch:{ all -> 0x09fb }
            r2.V(r8)     // Catch:{ all -> 0x09fb }
            com.google.android.gms.measurement.internal.h5 r8 = r1.f3223j     // Catch:{ all -> 0x09fb }
            com.google.android.gms.measurement.internal.m r8 = r8.Q()     // Catch:{ all -> 0x09fb }
            r8.o()     // Catch:{ all -> 0x09fb }
            java.lang.String r8 = android.os.Build.VERSION.RELEASE     // Catch:{ all -> 0x09fb }
            r2.P(r8)     // Catch:{ all -> 0x09fb }
            com.google.android.gms.measurement.internal.h5 r8 = r1.f3223j     // Catch:{ all -> 0x09fb }
            com.google.android.gms.measurement.internal.m r8 = r8.Q()     // Catch:{ all -> 0x09fb }
            long r11 = r8.u()     // Catch:{ all -> 0x09fb }
            int r8 = (int) r11     // Catch:{ all -> 0x09fb }
            r2.h0(r8)     // Catch:{ all -> 0x09fb }
            com.google.android.gms.measurement.internal.h5 r8 = r1.f3223j     // Catch:{ all -> 0x09fb }
            com.google.android.gms.measurement.internal.m r8 = r8.Q()     // Catch:{ all -> 0x09fb }
            java.lang.String r8 = r8.v()     // Catch:{ all -> 0x09fb }
            r2.Y(r8)     // Catch:{ all -> 0x09fb }
            com.google.android.gms.measurement.internal.h5 r8 = r1.f3223j     // Catch:{ all -> 0x09fb }
            com.google.android.gms.measurement.internal.wa r8 = r8.c()     // Catch:{ all -> 0x09fb }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r11 = com.google.android.gms.measurement.internal.u.G0     // Catch:{ all -> 0x09fb }
            boolean r8 = r8.s(r11)     // Catch:{ all -> 0x09fb }
            if (r8 != 0) goto L_0x07e3
            long r11 = r3.r     // Catch:{ all -> 0x09fb }
            r2.A0(r11)     // Catch:{ all -> 0x09fb }
        L_0x07e3:
            com.google.android.gms.measurement.internal.h5 r8 = r1.f3223j     // Catch:{ all -> 0x09fb }
            boolean r8 = r8.p()     // Catch:{ all -> 0x09fb }
            if (r8 == 0) goto L_0x0811
            boolean r8 = com.google.android.gms.internal.measurement.fb.a()     // Catch:{ all -> 0x09fb }
            if (r8 == 0) goto L_0x0803
            com.google.android.gms.measurement.internal.h5 r8 = r1.f3223j     // Catch:{ all -> 0x09fb }
            com.google.android.gms.measurement.internal.wa r8 = r8.c()     // Catch:{ all -> 0x09fb }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r11 = com.google.android.gms.measurement.internal.u.Q0     // Catch:{ all -> 0x09fb }
            boolean r8 = r8.s(r11)     // Catch:{ all -> 0x09fb }
            if (r8 == 0) goto L_0x0803
            r2.C0()     // Catch:{ all -> 0x09fb }
            goto L_0x0806
        L_0x0803:
            r2.C0()     // Catch:{ all -> 0x09fb }
        L_0x0806:
            boolean r8 = android.text.TextUtils.isEmpty(r25)     // Catch:{ all -> 0x09fb }
            if (r8 != 0) goto L_0x0811
            r8 = r25
            r2.M0(r8)     // Catch:{ all -> 0x09fb }
        L_0x0811:
            com.google.android.gms.measurement.internal.d r8 = r26.Z()     // Catch:{ all -> 0x09fb }
            java.lang.String r11 = r3.f2956g     // Catch:{ all -> 0x09fb }
            com.google.android.gms.measurement.internal.f4 r8 = r8.j0(r11)     // Catch:{ all -> 0x09fb }
            if (r8 != 0) goto L_0x08be
            com.google.android.gms.measurement.internal.f4 r8 = new com.google.android.gms.measurement.internal.f4     // Catch:{ all -> 0x09fb }
            com.google.android.gms.measurement.internal.h5 r11 = r1.f3223j     // Catch:{ all -> 0x09fb }
            java.lang.String r12 = r3.f2956g     // Catch:{ all -> 0x09fb }
            r8.<init>(r11, r12)     // Catch:{ all -> 0x09fb }
            boolean r11 = com.google.android.gms.internal.measurement.fb.a()     // Catch:{ all -> 0x09fb }
            if (r11 == 0) goto L_0x0842
            com.google.android.gms.measurement.internal.h5 r11 = r1.f3223j     // Catch:{ all -> 0x09fb }
            com.google.android.gms.measurement.internal.wa r11 = r11.c()     // Catch:{ all -> 0x09fb }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r12 = com.google.android.gms.measurement.internal.u.Q0     // Catch:{ all -> 0x09fb }
            boolean r11 = r11.s(r12)     // Catch:{ all -> 0x09fb }
            if (r11 == 0) goto L_0x0842
            java.lang.String r11 = r1.g(r7)     // Catch:{ all -> 0x09fb }
            r8.c(r11)     // Catch:{ all -> 0x09fb }
            goto L_0x0849
        L_0x0842:
            java.lang.String r11 = r26.p0()     // Catch:{ all -> 0x09fb }
            r8.c(r11)     // Catch:{ all -> 0x09fb }
        L_0x0849:
            java.lang.String r11 = r3.q     // Catch:{ all -> 0x09fb }
            r8.F(r11)     // Catch:{ all -> 0x09fb }
            java.lang.String r11 = r3.f2957h     // Catch:{ all -> 0x09fb }
            r8.r(r11)     // Catch:{ all -> 0x09fb }
            boolean r11 = com.google.android.gms.internal.measurement.fb.a()     // Catch:{ all -> 0x09fb }
            if (r11 == 0) goto L_0x086d
            com.google.android.gms.measurement.internal.h5 r11 = r1.f3223j     // Catch:{ all -> 0x09fb }
            com.google.android.gms.measurement.internal.wa r11 = r11.c()     // Catch:{ all -> 0x09fb }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r12 = com.google.android.gms.measurement.internal.u.Q0     // Catch:{ all -> 0x09fb }
            boolean r11 = r11.s(r12)     // Catch:{ all -> 0x09fb }
            if (r11 == 0) goto L_0x086d
            boolean r11 = r7.o()     // Catch:{ all -> 0x09fb }
            if (r11 == 0) goto L_0x0878
        L_0x086d:
            com.google.android.gms.measurement.internal.c9 r11 = r1.f3222i     // Catch:{ all -> 0x09fb }
            java.lang.String r12 = r3.f2956g     // Catch:{ all -> 0x09fb }
            java.lang.String r11 = r11.v(r12)     // Catch:{ all -> 0x09fb }
            r8.C(r11)     // Catch:{ all -> 0x09fb }
        L_0x0878:
            r8.H(r9)     // Catch:{ all -> 0x09fb }
            r8.a(r9)     // Catch:{ all -> 0x09fb }
            r8.q(r9)     // Catch:{ all -> 0x09fb }
            java.lang.String r11 = r3.f2958i     // Catch:{ all -> 0x09fb }
            r8.I(r11)     // Catch:{ all -> 0x09fb }
            long r11 = r3.p     // Catch:{ all -> 0x09fb }
            r8.u(r11)     // Catch:{ all -> 0x09fb }
            java.lang.String r11 = r3.f2959j     // Catch:{ all -> 0x09fb }
            r8.L(r11)     // Catch:{ all -> 0x09fb }
            long r11 = r3.f2960k     // Catch:{ all -> 0x09fb }
            r8.y(r11)     // Catch:{ all -> 0x09fb }
            long r11 = r3.f2961l     // Catch:{ all -> 0x09fb }
            r8.B(r11)     // Catch:{ all -> 0x09fb }
            boolean r11 = r3.f2963n     // Catch:{ all -> 0x09fb }
            r8.e(r11)     // Catch:{ all -> 0x09fb }
            com.google.android.gms.measurement.internal.h5 r11 = r1.f3223j     // Catch:{ all -> 0x09fb }
            com.google.android.gms.measurement.internal.wa r11 = r11.c()     // Catch:{ all -> 0x09fb }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r12 = com.google.android.gms.measurement.internal.u.G0     // Catch:{ all -> 0x09fb }
            boolean r11 = r11.s(r12)     // Catch:{ all -> 0x09fb }
            if (r11 != 0) goto L_0x08b2
            long r11 = r3.r     // Catch:{ all -> 0x09fb }
            r8.c0(r11)     // Catch:{ all -> 0x09fb }
        L_0x08b2:
            long r11 = r3.z     // Catch:{ all -> 0x09fb }
            r8.E(r11)     // Catch:{ all -> 0x09fb }
            com.google.android.gms.measurement.internal.d r11 = r26.Z()     // Catch:{ all -> 0x09fb }
            r11.O(r8)     // Catch:{ all -> 0x09fb }
        L_0x08be:
            boolean r11 = com.google.android.gms.internal.measurement.fb.a()     // Catch:{ all -> 0x09fb }
            if (r11 == 0) goto L_0x08d8
            com.google.android.gms.measurement.internal.h5 r11 = r1.f3223j     // Catch:{ all -> 0x09fb }
            com.google.android.gms.measurement.internal.wa r11 = r11.c()     // Catch:{ all -> 0x09fb }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r12 = com.google.android.gms.measurement.internal.u.Q0     // Catch:{ all -> 0x09fb }
            boolean r11 = r11.s(r12)     // Catch:{ all -> 0x09fb }
            if (r11 == 0) goto L_0x08d8
            boolean r7 = r7.q()     // Catch:{ all -> 0x09fb }
            if (r7 == 0) goto L_0x08e9
        L_0x08d8:
            java.lang.String r7 = r8.x()     // Catch:{ all -> 0x09fb }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x09fb }
            if (r7 != 0) goto L_0x08e9
            java.lang.String r7 = r8.x()     // Catch:{ all -> 0x09fb }
            r2.z0(r7)     // Catch:{ all -> 0x09fb }
        L_0x08e9:
            java.lang.String r7 = r8.M()     // Catch:{ all -> 0x09fb }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x09fb }
            if (r7 != 0) goto L_0x08fa
            java.lang.String r7 = r8.M()     // Catch:{ all -> 0x09fb }
            r2.I0(r7)     // Catch:{ all -> 0x09fb }
        L_0x08fa:
            com.google.android.gms.measurement.internal.d r7 = r26.Z()     // Catch:{ all -> 0x09fb }
            java.lang.String r3 = r3.f2956g     // Catch:{ all -> 0x09fb }
            java.util.List r3 = r7.I(r3)     // Catch:{ all -> 0x09fb }
            r11 = 0
        L_0x0905:
            int r7 = r3.size()     // Catch:{ all -> 0x09fb }
            if (r11 >= r7) goto L_0x093a
            com.google.android.gms.internal.measurement.i1$a r7 = com.google.android.gms.internal.measurement.i1.X()     // Catch:{ all -> 0x09fb }
            java.lang.Object r8 = r3.get(r11)     // Catch:{ all -> 0x09fb }
            com.google.android.gms.measurement.internal.ga r8 = (com.google.android.gms.measurement.internal.ga) r8     // Catch:{ all -> 0x09fb }
            java.lang.String r8 = r8.c     // Catch:{ all -> 0x09fb }
            r7.C(r8)     // Catch:{ all -> 0x09fb }
            java.lang.Object r8 = r3.get(r11)     // Catch:{ all -> 0x09fb }
            com.google.android.gms.measurement.internal.ga r8 = (com.google.android.gms.measurement.internal.ga) r8     // Catch:{ all -> 0x09fb }
            long r12 = r8.f2865d     // Catch:{ all -> 0x09fb }
            r7.B(r12)     // Catch:{ all -> 0x09fb }
            com.google.android.gms.measurement.internal.ba r8 = r26.d0()     // Catch:{ all -> 0x09fb }
            java.lang.Object r12 = r3.get(r11)     // Catch:{ all -> 0x09fb }
            com.google.android.gms.measurement.internal.ga r12 = (com.google.android.gms.measurement.internal.ga) r12     // Catch:{ all -> 0x09fb }
            java.lang.Object r12 = r12.f2866e     // Catch:{ all -> 0x09fb }
            r8.J(r7, r12)     // Catch:{ all -> 0x09fb }
            r2.E(r7)     // Catch:{ all -> 0x09fb }
            int r11 = r11 + 1
            goto L_0x0905
        L_0x093a:
            com.google.android.gms.measurement.internal.d r3 = r26.Z()     // Catch:{ IOException -> 0x09af }
            com.google.android.gms.internal.measurement.j8 r7 = r2.l()     // Catch:{ IOException -> 0x09af }
            com.google.android.gms.internal.measurement.z6 r7 = (com.google.android.gms.internal.measurement.z6) r7     // Catch:{ IOException -> 0x09af }
            com.google.android.gms.internal.measurement.e1 r7 = (com.google.android.gms.internal.measurement.e1) r7     // Catch:{ IOException -> 0x09af }
            long r2 = r3.y(r7)     // Catch:{ IOException -> 0x09af }
            com.google.android.gms.measurement.internal.d r7 = r26.Z()     // Catch:{ all -> 0x09fb }
            com.google.android.gms.measurement.internal.n r8 = r4.f2932f     // Catch:{ all -> 0x09fb }
            if (r8 == 0) goto L_0x09a5
            com.google.android.gms.measurement.internal.n r8 = r4.f2932f     // Catch:{ all -> 0x09fb }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ all -> 0x09fb }
        L_0x0958:
            boolean r11 = r8.hasNext()     // Catch:{ all -> 0x09fb }
            if (r11 == 0) goto L_0x096c
            java.lang.Object r11 = r8.next()     // Catch:{ all -> 0x09fb }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x09fb }
            boolean r11 = r5.equals(r11)     // Catch:{ all -> 0x09fb }
            if (r11 == 0) goto L_0x0958
        L_0x096a:
            r11 = 1
            goto L_0x09a6
        L_0x096c:
            com.google.android.gms.measurement.internal.b5 r5 = r26.V()     // Catch:{ all -> 0x09fb }
            java.lang.String r8 = r4.a     // Catch:{ all -> 0x09fb }
            java.lang.String r11 = r4.b     // Catch:{ all -> 0x09fb }
            boolean r5 = r5.C(r8, r11)     // Catch:{ all -> 0x09fb }
            com.google.android.gms.measurement.internal.d r11 = r26.Z()     // Catch:{ all -> 0x09fb }
            long r12 = r26.o0()     // Catch:{ all -> 0x09fb }
            java.lang.String r14 = r4.a     // Catch:{ all -> 0x09fb }
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            com.google.android.gms.measurement.internal.g r8 = r11.C(r12, r14, r15, r16, r17, r18, r19)     // Catch:{ all -> 0x09fb }
            if (r5 == 0) goto L_0x09a5
            long r11 = r8.f2850e     // Catch:{ all -> 0x09fb }
            com.google.android.gms.measurement.internal.h5 r5 = r1.f3223j     // Catch:{ all -> 0x09fb }
            com.google.android.gms.measurement.internal.wa r5 = r5.c()     // Catch:{ all -> 0x09fb }
            java.lang.String r8 = r4.a     // Catch:{ all -> 0x09fb }
            int r5 = r5.w(r8)     // Catch:{ all -> 0x09fb }
            long r13 = (long) r5     // Catch:{ all -> 0x09fb }
            int r5 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r5 >= 0) goto L_0x09a5
            goto L_0x096a
        L_0x09a5:
            r11 = 0
        L_0x09a6:
            boolean r2 = r7.S(r4, r2, r11)     // Catch:{ all -> 0x09fb }
            if (r2 == 0) goto L_0x09c8
            r1.f3226m = r9     // Catch:{ all -> 0x09fb }
            goto L_0x09c8
        L_0x09af:
            r0 = move-exception
            r3 = r0
            com.google.android.gms.measurement.internal.h5 r4 = r1.f3223j     // Catch:{ all -> 0x09fb }
            com.google.android.gms.measurement.internal.c4 r4 = r4.i()     // Catch:{ all -> 0x09fb }
            com.google.android.gms.measurement.internal.e4 r4 = r4.E()     // Catch:{ all -> 0x09fb }
            java.lang.String r5 = "Data loss. Failed to insert raw event metadata. appId"
            java.lang.String r2 = r2.C0()     // Catch:{ all -> 0x09fb }
            java.lang.Object r2 = com.google.android.gms.measurement.internal.c4.w(r2)     // Catch:{ all -> 0x09fb }
            r4.c(r5, r2, r3)     // Catch:{ all -> 0x09fb }
        L_0x09c8:
            com.google.android.gms.measurement.internal.d r2 = r26.Z()     // Catch:{ all -> 0x09fb }
            r2.u()     // Catch:{ all -> 0x09fb }
            com.google.android.gms.measurement.internal.d r2 = r26.Z()
            r2.y0()
            r26.H()
            com.google.android.gms.measurement.internal.h5 r2 = r1.f3223j
            com.google.android.gms.measurement.internal.c4 r2 = r2.i()
            com.google.android.gms.measurement.internal.e4 r2 = r2.M()
            long r3 = java.lang.System.nanoTime()
            long r3 = r3 - r23
            r5 = 500000(0x7a120, double:2.47033E-318)
            long r3 = r3 + r5
            r5 = 1000000(0xf4240, double:4.940656E-318)
            long r3 = r3 / r5
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.String r4 = "Background event processing time, ms"
            r2.b(r4, r3)
            return
        L_0x09fb:
            r0 = move-exception
            r2 = r0
            com.google.android.gms.measurement.internal.d r3 = r26.Z()
            r3.y0()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.x9.W(com.google.android.gms.measurement.internal.s, com.google.android.gms.measurement.internal.la):void");
    }

    private final boolean a0(la laVar) {
        return (!vc.a() || !this.f3223j.c().C(laVar.f2956g, u.k0)) ? !TextUtils.isEmpty(laVar.f2957h) || !TextUtils.isEmpty(laVar.x) : !TextUtils.isEmpty(laVar.f2957h) || !TextUtils.isEmpty(laVar.B) || !TextUtils.isEmpty(laVar.x);
    }

    private final int b(FileChannel fileChannel) {
        n0();
        if (fileChannel == null || !fileChannel.isOpen()) {
            this.f3223j.i().E().a("Bad channel to read from");
            return 0;
        }
        ByteBuffer allocate = ByteBuffer.allocate(4);
        try {
            fileChannel.position(0);
            int read = fileChannel.read(allocate);
            if (read != 4) {
                if (read != -1) {
                    this.f3223j.i().H().b("Unexpected data length. Bytes read", Integer.valueOf(read));
                }
                return 0;
            }
            allocate.flip();
            return allocate.getInt();
        } catch (IOException e2) {
            this.f3223j.i().E().b("Failed to read from channel", e2);
            return 0;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x0205  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x020b  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x020e  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0181  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x018f  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01d5  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01e3  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x01f1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.gms.measurement.internal.f4 d(com.google.android.gms.measurement.internal.la r9, com.google.android.gms.measurement.internal.f4 r10, java.lang.String r11) {
        /*
            r8 = this;
            com.google.android.gms.measurement.internal.e r0 = com.google.android.gms.measurement.internal.e.c
            boolean r1 = com.google.android.gms.internal.measurement.fb.a()
            if (r1 == 0) goto L_0x0026
            com.google.android.gms.measurement.internal.h5 r1 = r8.f3223j
            com.google.android.gms.measurement.internal.wa r1 = r1.c()
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r2 = com.google.android.gms.measurement.internal.u.Q0
            boolean r1 = r1.s(r2)
            if (r1 == 0) goto L_0x0026
            java.lang.String r0 = r9.f2956g
            com.google.android.gms.measurement.internal.e r0 = r8.c(r0)
            java.lang.String r1 = r9.C
            com.google.android.gms.measurement.internal.e r1 = com.google.android.gms.measurement.internal.e.b(r1)
            com.google.android.gms.measurement.internal.e r0 = r0.k(r1)
        L_0x0026:
            r1 = 1
            if (r10 != 0) goto L_0x0069
            com.google.android.gms.measurement.internal.f4 r10 = new com.google.android.gms.measurement.internal.f4
            com.google.android.gms.measurement.internal.h5 r2 = r8.f3223j
            java.lang.String r3 = r9.f2956g
            r10.<init>(r2, r3)
            boolean r2 = com.google.android.gms.internal.measurement.fb.a()
            if (r2 == 0) goto L_0x005d
            com.google.android.gms.measurement.internal.h5 r2 = r8.f3223j
            com.google.android.gms.measurement.internal.wa r2 = r2.c()
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.u.Q0
            boolean r2 = r2.s(r3)
            if (r2 == 0) goto L_0x005d
            boolean r2 = r0.q()
            if (r2 == 0) goto L_0x0053
            java.lang.String r2 = r8.g(r0)
            r10.c(r2)
        L_0x0053:
            boolean r0 = r0.o()
            if (r0 == 0) goto L_0x0067
            r10.C(r11)
            goto L_0x0067
        L_0x005d:
            java.lang.String r0 = r8.p0()
            r10.c(r0)
            r10.C(r11)
        L_0x0067:
            r11 = 1
            goto L_0x00bb
        L_0x0069:
            boolean r2 = com.google.android.gms.internal.measurement.fb.a()
            if (r2 == 0) goto L_0x0083
            com.google.android.gms.measurement.internal.h5 r2 = r8.f3223j
            com.google.android.gms.measurement.internal.wa r2 = r2.c()
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.u.Q0
            boolean r2 = r2.s(r3)
            if (r2 == 0) goto L_0x0083
            boolean r2 = r0.o()
            if (r2 == 0) goto L_0x00ba
        L_0x0083:
            java.lang.String r2 = r10.J()
            boolean r2 = r11.equals(r2)
            if (r2 != 0) goto L_0x00ba
            r10.C(r11)
            boolean r11 = com.google.android.gms.internal.measurement.fb.a()
            if (r11 == 0) goto L_0x00b2
            com.google.android.gms.measurement.internal.h5 r11 = r8.f3223j
            com.google.android.gms.measurement.internal.wa r11 = r11.c()
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r2 = com.google.android.gms.measurement.internal.u.Q0
            boolean r11 = r11.s(r2)
            if (r11 == 0) goto L_0x00b2
            boolean r11 = r0.q()
            if (r11 == 0) goto L_0x0067
            java.lang.String r11 = r8.g(r0)
            r10.c(r11)
            goto L_0x0067
        L_0x00b2:
            java.lang.String r11 = r8.p0()
            r10.c(r11)
            goto L_0x0067
        L_0x00ba:
            r11 = 0
        L_0x00bb:
            java.lang.String r0 = r9.f2957h
            java.lang.String r2 = r10.A()
            boolean r0 = android.text.TextUtils.equals(r0, r2)
            if (r0 != 0) goto L_0x00cd
            java.lang.String r11 = r9.f2957h
            r10.r(r11)
            r11 = 1
        L_0x00cd:
            java.lang.String r0 = r9.x
            java.lang.String r2 = r10.D()
            boolean r0 = android.text.TextUtils.equals(r0, r2)
            if (r0 != 0) goto L_0x00df
            java.lang.String r11 = r9.x
            r10.v(r11)
            r11 = 1
        L_0x00df:
            boolean r0 = com.google.android.gms.internal.measurement.vc.a()
            if (r0 == 0) goto L_0x0109
            com.google.android.gms.measurement.internal.h5 r0 = r8.f3223j
            com.google.android.gms.measurement.internal.wa r0 = r0.c()
            java.lang.String r2 = r10.t()
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.u.k0
            boolean r0 = r0.C(r2, r3)
            if (r0 == 0) goto L_0x0109
            java.lang.String r0 = r9.B
            java.lang.String r2 = r10.G()
            boolean r0 = android.text.TextUtils.equals(r0, r2)
            if (r0 != 0) goto L_0x0109
            java.lang.String r11 = r9.B
            r10.z(r11)
            r11 = 1
        L_0x0109:
            java.lang.String r0 = r9.q
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0123
            java.lang.String r0 = r9.q
            java.lang.String r2 = r10.M()
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0123
            java.lang.String r11 = r9.q
            r10.F(r11)
            r11 = 1
        L_0x0123:
            long r2 = r9.f2960k
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0139
            long r6 = r10.Z()
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x0139
            long r2 = r9.f2960k
            r10.y(r2)
            r11 = 1
        L_0x0139:
            java.lang.String r0 = r9.f2958i
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0153
            java.lang.String r0 = r9.f2958i
            java.lang.String r2 = r10.T()
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0153
            java.lang.String r11 = r9.f2958i
            r10.I(r11)
            r11 = 1
        L_0x0153:
            long r2 = r9.p
            long r6 = r10.V()
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x0163
            long r2 = r9.p
            r10.u(r2)
            r11 = 1
        L_0x0163:
            java.lang.String r0 = r9.f2959j
            if (r0 == 0) goto L_0x0177
            java.lang.String r2 = r10.X()
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0177
            java.lang.String r11 = r9.f2959j
            r10.L(r11)
            r11 = 1
        L_0x0177:
            long r2 = r9.f2961l
            long r6 = r10.b0()
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x0187
            long r2 = r9.f2961l
            r10.B(r2)
            r11 = 1
        L_0x0187:
            boolean r0 = r9.f2963n
            boolean r2 = r10.e0()
            if (r0 == r2) goto L_0x0195
            boolean r11 = r9.f2963n
            r10.e(r11)
            r11 = 1
        L_0x0195:
            java.lang.String r0 = r9.f2962m
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x01af
            java.lang.String r0 = r9.f2962m
            java.lang.String r2 = r10.i()
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x01af
            java.lang.String r11 = r9.f2962m
            r10.O(r11)
            r11 = 1
        L_0x01af:
            com.google.android.gms.measurement.internal.h5 r0 = r8.f3223j
            com.google.android.gms.measurement.internal.wa r0 = r0.c()
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r2 = com.google.android.gms.measurement.internal.u.G0
            boolean r0 = r0.s(r2)
            if (r0 != 0) goto L_0x01cd
            long r2 = r9.r
            long r6 = r10.k()
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x01cd
            long r2 = r9.r
            r10.c0(r2)
            r11 = 1
        L_0x01cd:
            boolean r0 = r9.u
            boolean r2 = r10.l()
            if (r0 == r2) goto L_0x01db
            boolean r11 = r9.u
            r10.s(r11)
            r11 = 1
        L_0x01db:
            boolean r0 = r9.v
            boolean r2 = r10.m()
            if (r0 == r2) goto L_0x01e9
            boolean r11 = r9.v
            r10.w(r11)
            r11 = 1
        L_0x01e9:
            java.lang.Boolean r0 = r9.y
            java.lang.Boolean r2 = r10.n()
            if (r0 == r2) goto L_0x01f7
            java.lang.Boolean r11 = r9.y
            r10.b(r11)
            r11 = 1
        L_0x01f7:
            long r2 = r9.z
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x020b
            long r4 = r10.d0()
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x020b
            long r2 = r9.z
            r10.E(r2)
            goto L_0x020c
        L_0x020b:
            r1 = r11
        L_0x020c:
            if (r1 == 0) goto L_0x0215
            com.google.android.gms.measurement.internal.d r9 = r8.Z()
            r9.O(r10)
        L_0x0215:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.x9.d(com.google.android.gms.measurement.internal.la, com.google.android.gms.measurement.internal.f4, java.lang.String):com.google.android.gms.measurement.internal.f4");
    }

    public static x9 e(Context context) {
        r.k(context);
        r.k(context.getApplicationContext());
        if (z == null) {
            synchronized (x9.class) {
                if (z == null) {
                    z = new x9(new ca(context));
                }
            }
        }
        return z;
    }

    private final String g(e eVar) {
        if (!fb.a() || !this.f3223j.c().s(u.Q0) || eVar.q()) {
            return p0();
        }
        return null;
    }

    private static void l(a1.a aVar, int i2, String str) {
        List<c1> H = aVar.H();
        int i3 = 0;
        while (i3 < H.size()) {
            if (!"_err".equals(H.get(i3).M())) {
                i3++;
            } else {
                return;
            }
        }
        c1.a e0 = c1.e0();
        e0.E("_err");
        e0.B(Long.valueOf((long) i2).longValue());
        c1.a e02 = c1.e0();
        e02.E("_ev");
        e02.G(str);
        aVar.D((c1) ((z6) e0.l()));
        aVar.D((c1) ((z6) e02.l()));
    }

    private final n4 l0() {
        n4 n4Var = this.f3217d;
        if (n4Var != null) {
            return n4Var;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    private static void m(a1.a aVar, String str) {
        List<c1> H = aVar.H();
        for (int i2 = 0; i2 < H.size(); i2++) {
            if (str.equals(H.get(i2).M())) {
                aVar.J(i2);
                return;
            }
        }
    }

    private final t9 m0() {
        P(this.f3218e);
        return this.f3218e;
    }

    private final void n0() {
        this.f3223j.a().c();
    }

    private final void o(e1.a aVar, long j2, boolean z2) {
        ga gaVar;
        String str = z2 ? "_se" : "_lte";
        ga o0 = Z().o0(aVar.C0(), str);
        if (o0 == null || o0.f2866e == null) {
            gaVar = new ga(aVar.C0(), "auto", str, this.f3223j.f().b(), Long.valueOf(j2));
        } else {
            gaVar = new ga(aVar.C0(), "auto", str, this.f3223j.f().b(), Long.valueOf(((Long) o0.f2866e).longValue() + j2));
        }
        i1.a X = i1.X();
        X.C(str);
        X.B(this.f3223j.f().b());
        X.E(((Long) gaVar.f2866e).longValue());
        i1 i1Var = (i1) ((z6) X.l());
        boolean z3 = false;
        int u2 = ba.u(aVar, str);
        if (u2 >= 0) {
            aVar.B(u2, i1Var);
            z3 = true;
        }
        if (!z3) {
            aVar.F(i1Var);
        }
        if (j2 > 0) {
            Z().T(gaVar);
            this.f3223j.i().M().c("Updated engagement user property. scope, value", z2 ? "session-scoped" : "lifetime", gaVar.f2866e);
        }
    }

    private final long o0() {
        long b2 = this.f3223j.f().b();
        p4 x2 = this.f3223j.x();
        x2.o();
        x2.c();
        long a2 = x2.f3029i.a();
        if (a2 == 0) {
            a2 = 1 + ((long) x2.g().H0().nextInt(86400000));
            x2.f3029i.b(a2);
        }
        return ((((b2 + a2) / 1000) / 60) / 60) / 24;
    }

    @Deprecated
    private final String p0() {
        byte[] bArr = new byte[16];
        this.f3223j.G().H0().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new Object[]{new BigInteger(1, bArr)});
    }

    private final void r(f4 f4Var) {
        e.e.a aVar;
        n0();
        if (!vc.a() || !this.f3223j.c().C(f4Var.t(), u.k0)) {
            if (TextUtils.isEmpty(f4Var.A()) && TextUtils.isEmpty(f4Var.D())) {
                A(f4Var.t(), 204, (Throwable) null, (byte[]) null, (Map<String, List<String>>) null);
                return;
            }
        } else if (TextUtils.isEmpty(f4Var.A()) && TextUtils.isEmpty(f4Var.G()) && TextUtils.isEmpty(f4Var.D())) {
            A(f4Var.t(), 204, (Throwable) null, (byte[]) null, (Map<String, List<String>>) null);
            return;
        }
        String q2 = this.f3223j.c().q(f4Var);
        try {
            URL url = new URL(q2);
            this.f3223j.i().M().b("Fetching remote configuration", f4Var.t());
            u0 u2 = V().u(f4Var.t());
            String z2 = V().z(f4Var.t());
            if (u2 == null || TextUtils.isEmpty(z2)) {
                aVar = null;
            } else {
                e.e.a aVar2 = new e.e.a();
                aVar2.put("If-Modified-Since", z2);
                aVar = aVar2;
            }
            this.q = true;
            g4 X = X();
            String t2 = f4Var.t();
            y9 y9Var = new y9(this);
            X.c();
            X.r();
            r.k(url);
            r.k(y9Var);
            X.a().E(new k4(X, t2, url, (byte[]) null, aVar, y9Var));
        } catch (MalformedURLException unused) {
            this.f3223j.i().E().c("Failed to parse config URL. Not fetching. appId", c4.w(f4Var.t()), q2);
        }
    }

    /* access modifiers changed from: private */
    public final void u(ca caVar) {
        this.f3223j.a().c();
        d dVar = new d(this);
        dVar.s();
        this.c = dVar;
        this.f3223j.c().r(this.a);
        c9 c9Var = new c9(this);
        c9Var.s();
        this.f3222i = c9Var;
        ma maVar = new ma(this);
        maVar.s();
        this.f3219f = maVar;
        s7 s7Var = new s7(this);
        s7Var.s();
        this.f3221h = s7Var;
        t9 t9Var = new t9(this);
        t9Var.s();
        this.f3218e = t9Var;
        this.f3217d = new n4(this);
        if (this.o != this.p) {
            this.f3223j.i().E().c("Not all upload components initialized", Integer.valueOf(this.o), Integer.valueOf(this.p));
        }
        this.f3224k = true;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x013a A[Catch:{ all -> 0x018d, all -> 0x0196 }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x014a A[Catch:{ all -> 0x018d, all -> 0x0196 }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0172 A[Catch:{ all -> 0x018d, all -> 0x0196 }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0176 A[Catch:{ all -> 0x018d, all -> 0x0196 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A(java.lang.String r7, int r8, java.lang.Throwable r9, byte[] r10, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r11) {
        /*
            r6 = this;
            r6.n0()
            r6.g0()
            com.google.android.gms.common.internal.r.g(r7)
            r0 = 0
            if (r10 != 0) goto L_0x000e
            byte[] r10 = new byte[r0]     // Catch:{ all -> 0x0196 }
        L_0x000e:
            com.google.android.gms.measurement.internal.h5 r1 = r6.f3223j     // Catch:{ all -> 0x0196 }
            com.google.android.gms.measurement.internal.c4 r1 = r1.i()     // Catch:{ all -> 0x0196 }
            com.google.android.gms.measurement.internal.e4 r1 = r1.M()     // Catch:{ all -> 0x0196 }
            java.lang.String r2 = "onConfigFetched. Response size"
            int r3 = r10.length     // Catch:{ all -> 0x0196 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0196 }
            r1.b(r2, r3)     // Catch:{ all -> 0x0196 }
            com.google.android.gms.measurement.internal.d r1 = r6.Z()     // Catch:{ all -> 0x0196 }
            r1.t0()     // Catch:{ all -> 0x0196 }
            com.google.android.gms.measurement.internal.d r1 = r6.Z()     // Catch:{ all -> 0x018d }
            com.google.android.gms.measurement.internal.f4 r1 = r1.j0(r7)     // Catch:{ all -> 0x018d }
            r2 = 200(0xc8, float:2.8E-43)
            r3 = 304(0x130, float:4.26E-43)
            r4 = 1
            if (r8 == r2) goto L_0x003e
            r2 = 204(0xcc, float:2.86E-43)
            if (r8 == r2) goto L_0x003e
            if (r8 != r3) goto L_0x0042
        L_0x003e:
            if (r9 != 0) goto L_0x0042
            r2 = 1
            goto L_0x0043
        L_0x0042:
            r2 = 0
        L_0x0043:
            if (r1 != 0) goto L_0x005a
            com.google.android.gms.measurement.internal.h5 r8 = r6.f3223j     // Catch:{ all -> 0x018d }
            com.google.android.gms.measurement.internal.c4 r8 = r8.i()     // Catch:{ all -> 0x018d }
            com.google.android.gms.measurement.internal.e4 r8 = r8.H()     // Catch:{ all -> 0x018d }
            java.lang.String r9 = "App does not exist in onConfigFetched. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.c4.w(r7)     // Catch:{ all -> 0x018d }
            r8.b(r9, r7)     // Catch:{ all -> 0x018d }
            goto L_0x0179
        L_0x005a:
            r5 = 404(0x194, float:5.66E-43)
            if (r2 != 0) goto L_0x00ca
            if (r8 != r5) goto L_0x0061
            goto L_0x00ca
        L_0x0061:
            com.google.android.gms.measurement.internal.h5 r10 = r6.f3223j     // Catch:{ all -> 0x018d }
            com.google.android.gms.common.util.e r10 = r10.f()     // Catch:{ all -> 0x018d }
            long r10 = r10.b()     // Catch:{ all -> 0x018d }
            r1.N(r10)     // Catch:{ all -> 0x018d }
            com.google.android.gms.measurement.internal.d r10 = r6.Z()     // Catch:{ all -> 0x018d }
            r10.O(r1)     // Catch:{ all -> 0x018d }
            com.google.android.gms.measurement.internal.h5 r10 = r6.f3223j     // Catch:{ all -> 0x018d }
            com.google.android.gms.measurement.internal.c4 r10 = r10.i()     // Catch:{ all -> 0x018d }
            com.google.android.gms.measurement.internal.e4 r10 = r10.M()     // Catch:{ all -> 0x018d }
            java.lang.String r11 = "Fetching config failed. code, error"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x018d }
            r10.c(r11, r1, r9)     // Catch:{ all -> 0x018d }
            com.google.android.gms.measurement.internal.b5 r9 = r6.V()     // Catch:{ all -> 0x018d }
            r9.B(r7)     // Catch:{ all -> 0x018d }
            com.google.android.gms.measurement.internal.h5 r7 = r6.f3223j     // Catch:{ all -> 0x018d }
            com.google.android.gms.measurement.internal.p4 r7 = r7.x()     // Catch:{ all -> 0x018d }
            com.google.android.gms.measurement.internal.t4 r7 = r7.f3026f     // Catch:{ all -> 0x018d }
            com.google.android.gms.measurement.internal.h5 r9 = r6.f3223j     // Catch:{ all -> 0x018d }
            com.google.android.gms.common.util.e r9 = r9.f()     // Catch:{ all -> 0x018d }
            long r9 = r9.b()     // Catch:{ all -> 0x018d }
            r7.b(r9)     // Catch:{ all -> 0x018d }
            r7 = 503(0x1f7, float:7.05E-43)
            if (r8 == r7) goto L_0x00ae
            r7 = 429(0x1ad, float:6.01E-43)
            if (r8 != r7) goto L_0x00ad
            goto L_0x00ae
        L_0x00ad:
            r4 = 0
        L_0x00ae:
            if (r4 == 0) goto L_0x00c5
            com.google.android.gms.measurement.internal.h5 r7 = r6.f3223j     // Catch:{ all -> 0x018d }
            com.google.android.gms.measurement.internal.p4 r7 = r7.x()     // Catch:{ all -> 0x018d }
            com.google.android.gms.measurement.internal.t4 r7 = r7.f3027g     // Catch:{ all -> 0x018d }
            com.google.android.gms.measurement.internal.h5 r8 = r6.f3223j     // Catch:{ all -> 0x018d }
            com.google.android.gms.common.util.e r8 = r8.f()     // Catch:{ all -> 0x018d }
            long r8 = r8.b()     // Catch:{ all -> 0x018d }
            r7.b(r8)     // Catch:{ all -> 0x018d }
        L_0x00c5:
            r6.H()     // Catch:{ all -> 0x018d }
            goto L_0x0179
        L_0x00ca:
            r9 = 0
            if (r11 == 0) goto L_0x00d6
            java.lang.String r2 = "Last-Modified"
            java.lang.Object r11 = r11.get(r2)     // Catch:{ all -> 0x018d }
            java.util.List r11 = (java.util.List) r11     // Catch:{ all -> 0x018d }
            goto L_0x00d7
        L_0x00d6:
            r11 = r9
        L_0x00d7:
            if (r11 == 0) goto L_0x00e6
            int r2 = r11.size()     // Catch:{ all -> 0x018d }
            if (r2 <= 0) goto L_0x00e6
            java.lang.Object r11 = r11.get(r0)     // Catch:{ all -> 0x018d }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x018d }
            goto L_0x00e7
        L_0x00e6:
            r11 = r9
        L_0x00e7:
            if (r8 == r5) goto L_0x0103
            if (r8 != r3) goto L_0x00ec
            goto L_0x0103
        L_0x00ec:
            com.google.android.gms.measurement.internal.b5 r9 = r6.V()     // Catch:{ all -> 0x018d }
            boolean r9 = r9.y(r7, r10, r11)     // Catch:{ all -> 0x018d }
            if (r9 != 0) goto L_0x0124
            com.google.android.gms.measurement.internal.d r7 = r6.Z()     // Catch:{ all -> 0x0196 }
            r7.y0()     // Catch:{ all -> 0x0196 }
            r6.q = r0
            r6.I()
            return
        L_0x0103:
            com.google.android.gms.measurement.internal.b5 r11 = r6.V()     // Catch:{ all -> 0x018d }
            com.google.android.gms.internal.measurement.u0 r11 = r11.u(r7)     // Catch:{ all -> 0x018d }
            if (r11 != 0) goto L_0x0124
            com.google.android.gms.measurement.internal.b5 r11 = r6.V()     // Catch:{ all -> 0x018d }
            boolean r9 = r11.y(r7, r9, r9)     // Catch:{ all -> 0x018d }
            if (r9 != 0) goto L_0x0124
            com.google.android.gms.measurement.internal.d r7 = r6.Z()     // Catch:{ all -> 0x0196 }
            r7.y0()     // Catch:{ all -> 0x0196 }
            r6.q = r0
            r6.I()
            return
        L_0x0124:
            com.google.android.gms.measurement.internal.h5 r9 = r6.f3223j     // Catch:{ all -> 0x018d }
            com.google.android.gms.common.util.e r9 = r9.f()     // Catch:{ all -> 0x018d }
            long r2 = r9.b()     // Catch:{ all -> 0x018d }
            r1.K(r2)     // Catch:{ all -> 0x018d }
            com.google.android.gms.measurement.internal.d r9 = r6.Z()     // Catch:{ all -> 0x018d }
            r9.O(r1)     // Catch:{ all -> 0x018d }
            if (r8 != r5) goto L_0x014a
            com.google.android.gms.measurement.internal.h5 r8 = r6.f3223j     // Catch:{ all -> 0x018d }
            com.google.android.gms.measurement.internal.c4 r8 = r8.i()     // Catch:{ all -> 0x018d }
            com.google.android.gms.measurement.internal.e4 r8 = r8.J()     // Catch:{ all -> 0x018d }
            java.lang.String r9 = "Config not found. Using empty config. appId"
            r8.b(r9, r7)     // Catch:{ all -> 0x018d }
            goto L_0x0162
        L_0x014a:
            com.google.android.gms.measurement.internal.h5 r7 = r6.f3223j     // Catch:{ all -> 0x018d }
            com.google.android.gms.measurement.internal.c4 r7 = r7.i()     // Catch:{ all -> 0x018d }
            com.google.android.gms.measurement.internal.e4 r7 = r7.M()     // Catch:{ all -> 0x018d }
            java.lang.String r9 = "Successfully fetched config. Got network response. code, size"
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x018d }
            int r10 = r10.length     // Catch:{ all -> 0x018d }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x018d }
            r7.c(r9, r8, r10)     // Catch:{ all -> 0x018d }
        L_0x0162:
            com.google.android.gms.measurement.internal.g4 r7 = r6.X()     // Catch:{ all -> 0x018d }
            boolean r7 = r7.x()     // Catch:{ all -> 0x018d }
            if (r7 == 0) goto L_0x0176
            boolean r7 = r6.G()     // Catch:{ all -> 0x018d }
            if (r7 == 0) goto L_0x0176
            r6.h0()     // Catch:{ all -> 0x018d }
            goto L_0x0179
        L_0x0176:
            r6.H()     // Catch:{ all -> 0x018d }
        L_0x0179:
            com.google.android.gms.measurement.internal.d r7 = r6.Z()     // Catch:{ all -> 0x018d }
            r7.u()     // Catch:{ all -> 0x018d }
            com.google.android.gms.measurement.internal.d r7 = r6.Z()     // Catch:{ all -> 0x0196 }
            r7.y0()     // Catch:{ all -> 0x0196 }
            r6.q = r0
            r6.I()
            return
        L_0x018d:
            r7 = move-exception
            com.google.android.gms.measurement.internal.d r8 = r6.Z()     // Catch:{ all -> 0x0196 }
            r8.y0()     // Catch:{ all -> 0x0196 }
            throw r7     // Catch:{ all -> 0x0196 }
        L_0x0196:
            r7 = move-exception
            r6.q = r0
            r6.I()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.x9.A(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }

    /* access modifiers changed from: package-private */
    public final void B(String str, e eVar) {
        if (fb.a() && this.f3223j.c().s(u.Q0)) {
            n0();
            g0();
            this.y.put(str, eVar);
            d Z = Z();
            if (fb.a() && Z.l().s(u.Q0)) {
                r.k(str);
                r.k(eVar);
                Z.c();
                Z.r();
                ContentValues contentValues = new ContentValues();
                contentValues.put("app_id", str);
                contentValues.put("consent_state", eVar.e());
                try {
                    if (Z.v().insertWithOnConflict("consent_settings", (String) null, contentValues, 5) == -1) {
                        Z.i().E().b("Failed to insert/update consent setting (got -1). appId", c4.w(str));
                    }
                } catch (SQLiteException e2) {
                    Z.i().E().c("Error storing consent setting. appId, error", c4.w(str), e2);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void C(boolean z2) {
        H();
    }

    public final wa L() {
        return this.f3223j.c();
    }

    /* access modifiers changed from: package-private */
    public final void Q(ea eaVar, la laVar) {
        n0();
        g0();
        if (a0(laVar)) {
            if (!laVar.f2963n) {
                U(laVar);
            } else if (!"_npa".equals(eaVar.f2823h) || laVar.y == null) {
                this.f3223j.i().L().b("Removing user property", this.f3223j.H().z(eaVar.f2823h));
                Z().t0();
                try {
                    U(laVar);
                    Z().l0(laVar.f2956g, eaVar.f2823h);
                    Z().u();
                    this.f3223j.i().L().b("User property removed", this.f3223j.H().z(eaVar.f2823h));
                } finally {
                    Z().y0();
                }
            } else {
                this.f3223j.i().L().a("Falling back to manifest metadata value for ad personalization");
                v(new ea("_npa", this.f3223j.f().b(), Long.valueOf(laVar.y.booleanValue() ? 1 : 0), "auto"), laVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0493 A[Catch:{ SQLiteException -> 0x01bd, all -> 0x04bf }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x011b A[Catch:{ SQLiteException -> 0x01bd, all -> 0x04bf }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01d2 A[Catch:{ SQLiteException -> 0x01bd, all -> 0x04bf }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0206 A[Catch:{ SQLiteException -> 0x01bd, all -> 0x04bf }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0208 A[Catch:{ SQLiteException -> 0x01bd, all -> 0x04bf }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x020c A[Catch:{ SQLiteException -> 0x01bd, all -> 0x04bf }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x022f A[Catch:{ SQLiteException -> 0x01bd, all -> 0x04bf }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0235 A[Catch:{ SQLiteException -> 0x01bd, all -> 0x04bf }] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0242 A[Catch:{ SQLiteException -> 0x01bd, all -> 0x04bf }] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0255 A[Catch:{ SQLiteException -> 0x01bd, all -> 0x04bf }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void R(com.google.android.gms.measurement.internal.la r22) {
        /*
            r21 = this;
            r1 = r21
            r2 = r22
            java.lang.String r3 = "_sysu"
            java.lang.String r4 = "_sys"
            java.lang.String r5 = "_pfo"
            java.lang.String r6 = "_uwa"
            java.lang.String r0 = "app_id=?"
            r21.n0()
            r21.g0()
            com.google.android.gms.common.internal.r.k(r22)
            java.lang.String r7 = r2.f2956g
            com.google.android.gms.common.internal.r.g(r7)
            boolean r7 = r21.a0(r22)
            if (r7 != 0) goto L_0x0023
            return
        L_0x0023:
            com.google.android.gms.measurement.internal.d r7 = r21.Z()
            java.lang.String r8 = r2.f2956g
            com.google.android.gms.measurement.internal.f4 r7 = r7.j0(r8)
            r8 = 0
            if (r7 == 0) goto L_0x0056
            java.lang.String r10 = r7.A()
            boolean r10 = android.text.TextUtils.isEmpty(r10)
            if (r10 == 0) goto L_0x0056
            java.lang.String r10 = r2.f2957h
            boolean r10 = android.text.TextUtils.isEmpty(r10)
            if (r10 != 0) goto L_0x0056
            r7.K(r8)
            com.google.android.gms.measurement.internal.d r10 = r21.Z()
            r10.O(r7)
            com.google.android.gms.measurement.internal.b5 r7 = r21.V()
            java.lang.String r10 = r2.f2956g
            r7.E(r10)
        L_0x0056:
            boolean r7 = r2.f2963n
            if (r7 != 0) goto L_0x005e
            r21.U(r22)
            return
        L_0x005e:
            long r10 = r2.s
            int r7 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r7 != 0) goto L_0x006e
            com.google.android.gms.measurement.internal.h5 r7 = r1.f3223j
            com.google.android.gms.common.util.e r7 = r7.f()
            long r10 = r7.b()
        L_0x006e:
            com.google.android.gms.measurement.internal.h5 r7 = r1.f3223j
            com.google.android.gms.measurement.internal.m r7 = r7.Q()
            r7.x()
            int r7 = r2.t
            r15 = 1
            if (r7 == 0) goto L_0x0098
            if (r7 == r15) goto L_0x0098
            com.google.android.gms.measurement.internal.h5 r12 = r1.f3223j
            com.google.android.gms.measurement.internal.c4 r12 = r12.i()
            com.google.android.gms.measurement.internal.e4 r12 = r12.H()
            java.lang.String r13 = r2.f2956g
            java.lang.Object r13 = com.google.android.gms.measurement.internal.c4.w(r13)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.String r14 = "Incorrect app type, assuming installed app. appId, appType"
            r12.c(r14, r13, r7)
            r7 = 0
        L_0x0098:
            com.google.android.gms.measurement.internal.d r12 = r21.Z()
            r12.t0()
            com.google.android.gms.measurement.internal.d r12 = r21.Z()     // Catch:{ all -> 0x04bf }
            java.lang.String r13 = r2.f2956g     // Catch:{ all -> 0x04bf }
            java.lang.String r14 = "_npa"
            com.google.android.gms.measurement.internal.ga r14 = r12.o0(r13, r14)     // Catch:{ all -> 0x04bf }
            if (r14 == 0) goto L_0x00bc
            java.lang.String r12 = "auto"
            java.lang.String r13 = r14.b     // Catch:{ all -> 0x04bf }
            boolean r12 = r12.equals(r13)     // Catch:{ all -> 0x04bf }
            if (r12 == 0) goto L_0x00b8
            goto L_0x00bc
        L_0x00b8:
            r18 = r3
            r3 = 1
            goto L_0x010f
        L_0x00bc:
            java.lang.Boolean r12 = r2.y     // Catch:{ all -> 0x04bf }
            if (r12 == 0) goto L_0x00f9
            com.google.android.gms.measurement.internal.ea r13 = new com.google.android.gms.measurement.internal.ea     // Catch:{ all -> 0x04bf }
            java.lang.String r18 = "_npa"
            java.lang.Boolean r12 = r2.y     // Catch:{ all -> 0x04bf }
            boolean r12 = r12.booleanValue()     // Catch:{ all -> 0x04bf }
            if (r12 == 0) goto L_0x00cf
            r19 = 1
            goto L_0x00d1
        L_0x00cf:
            r19 = r8
        L_0x00d1:
            java.lang.Long r19 = java.lang.Long.valueOf(r19)     // Catch:{ all -> 0x04bf }
            java.lang.String r20 = "auto"
            r8 = 1
            r12 = r13
            r8 = r13
            r13 = r18
            r18 = r3
            r9 = r14
            r3 = 1
            r14 = r10
            r16 = r19
            r17 = r20
            r12.<init>(r13, r14, r16, r17)     // Catch:{ all -> 0x04bf }
            if (r9 == 0) goto L_0x00f5
            java.lang.Object r9 = r9.f2866e     // Catch:{ all -> 0x04bf }
            java.lang.Long r12 = r8.f2825j     // Catch:{ all -> 0x04bf }
            boolean r9 = r9.equals(r12)     // Catch:{ all -> 0x04bf }
            if (r9 != 0) goto L_0x010f
        L_0x00f5:
            r1.v(r8, r2)     // Catch:{ all -> 0x04bf }
            goto L_0x010f
        L_0x00f9:
            r18 = r3
            r9 = r14
            r3 = 1
            if (r9 == 0) goto L_0x010f
            com.google.android.gms.measurement.internal.ea r8 = new com.google.android.gms.measurement.internal.ea     // Catch:{ all -> 0x04bf }
            java.lang.String r13 = "_npa"
            r16 = 0
            java.lang.String r17 = "auto"
            r12 = r8
            r14 = r10
            r12.<init>(r13, r14, r16, r17)     // Catch:{ all -> 0x04bf }
            r1.Q(r8, r2)     // Catch:{ all -> 0x04bf }
        L_0x010f:
            com.google.android.gms.measurement.internal.d r8 = r21.Z()     // Catch:{ all -> 0x04bf }
            java.lang.String r9 = r2.f2956g     // Catch:{ all -> 0x04bf }
            com.google.android.gms.measurement.internal.f4 r8 = r8.j0(r9)     // Catch:{ all -> 0x04bf }
            if (r8 == 0) goto L_0x01d0
            com.google.android.gms.measurement.internal.h5 r12 = r1.f3223j     // Catch:{ all -> 0x04bf }
            r12.G()     // Catch:{ all -> 0x04bf }
            java.lang.String r12 = r2.f2957h     // Catch:{ all -> 0x04bf }
            java.lang.String r13 = r8.A()     // Catch:{ all -> 0x04bf }
            java.lang.String r14 = r2.x     // Catch:{ all -> 0x04bf }
            java.lang.String r15 = r8.D()     // Catch:{ all -> 0x04bf }
            boolean r12 = com.google.android.gms.measurement.internal.fa.j0(r12, r13, r14, r15)     // Catch:{ all -> 0x04bf }
            if (r12 == 0) goto L_0x01d0
            com.google.android.gms.measurement.internal.h5 r12 = r1.f3223j     // Catch:{ all -> 0x04bf }
            com.google.android.gms.measurement.internal.c4 r12 = r12.i()     // Catch:{ all -> 0x04bf }
            com.google.android.gms.measurement.internal.e4 r12 = r12.H()     // Catch:{ all -> 0x04bf }
            java.lang.String r13 = "New GMP App Id passed in. Removing cached database data. appId"
            java.lang.String r14 = r8.t()     // Catch:{ all -> 0x04bf }
            java.lang.Object r14 = com.google.android.gms.measurement.internal.c4.w(r14)     // Catch:{ all -> 0x04bf }
            r12.b(r13, r14)     // Catch:{ all -> 0x04bf }
            com.google.android.gms.measurement.internal.d r12 = r21.Z()     // Catch:{ all -> 0x04bf }
            java.lang.String r8 = r8.t()     // Catch:{ all -> 0x04bf }
            r12.r()     // Catch:{ all -> 0x04bf }
            r12.c()     // Catch:{ all -> 0x04bf }
            com.google.android.gms.common.internal.r.g(r8)     // Catch:{ all -> 0x04bf }
            android.database.sqlite.SQLiteDatabase r13 = r12.v()     // Catch:{ SQLiteException -> 0x01bd }
            java.lang.String[] r14 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x01bd }
            r15 = 0
            r14[r15] = r8     // Catch:{ SQLiteException -> 0x01bd }
            java.lang.String r9 = "events"
            int r9 = r13.delete(r9, r0, r14)     // Catch:{ SQLiteException -> 0x01bd }
            int r9 = r9 + r15
            java.lang.String r15 = "user_attributes"
            int r15 = r13.delete(r15, r0, r14)     // Catch:{ SQLiteException -> 0x01bd }
            int r9 = r9 + r15
            java.lang.String r15 = "conditional_properties"
            int r15 = r13.delete(r15, r0, r14)     // Catch:{ SQLiteException -> 0x01bd }
            int r9 = r9 + r15
            java.lang.String r15 = "apps"
            int r15 = r13.delete(r15, r0, r14)     // Catch:{ SQLiteException -> 0x01bd }
            int r9 = r9 + r15
            java.lang.String r15 = "raw_events"
            int r15 = r13.delete(r15, r0, r14)     // Catch:{ SQLiteException -> 0x01bd }
            int r9 = r9 + r15
            java.lang.String r15 = "raw_events_metadata"
            int r15 = r13.delete(r15, r0, r14)     // Catch:{ SQLiteException -> 0x01bd }
            int r9 = r9 + r15
            java.lang.String r15 = "event_filters"
            int r15 = r13.delete(r15, r0, r14)     // Catch:{ SQLiteException -> 0x01bd }
            int r9 = r9 + r15
            java.lang.String r15 = "property_filters"
            int r15 = r13.delete(r15, r0, r14)     // Catch:{ SQLiteException -> 0x01bd }
            int r9 = r9 + r15
            java.lang.String r15 = "audience_filter_values"
            int r15 = r13.delete(r15, r0, r14)     // Catch:{ SQLiteException -> 0x01bd }
            int r9 = r9 + r15
            java.lang.String r15 = "consent_settings"
            int r0 = r13.delete(r15, r0, r14)     // Catch:{ SQLiteException -> 0x01bd }
            int r9 = r9 + r0
            if (r9 <= 0) goto L_0x01cf
            com.google.android.gms.measurement.internal.c4 r0 = r12.i()     // Catch:{ SQLiteException -> 0x01bd }
            com.google.android.gms.measurement.internal.e4 r0 = r0.M()     // Catch:{ SQLiteException -> 0x01bd }
            java.lang.String r13 = "Deleted application data. app, records"
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ SQLiteException -> 0x01bd }
            r0.c(r13, r8, r9)     // Catch:{ SQLiteException -> 0x01bd }
            goto L_0x01cf
        L_0x01bd:
            r0 = move-exception
            com.google.android.gms.measurement.internal.c4 r9 = r12.i()     // Catch:{ all -> 0x04bf }
            com.google.android.gms.measurement.internal.e4 r9 = r9.E()     // Catch:{ all -> 0x04bf }
            java.lang.String r12 = "Error deleting application data. appId, error"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.c4.w(r8)     // Catch:{ all -> 0x04bf }
            r9.c(r12, r8, r0)     // Catch:{ all -> 0x04bf }
        L_0x01cf:
            r8 = 0
        L_0x01d0:
            if (r8 == 0) goto L_0x022f
            long r12 = r8.V()     // Catch:{ all -> 0x04bf }
            r14 = -2147483648(0xffffffff80000000, double:NaN)
            int r0 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r0 == 0) goto L_0x01ea
            long r12 = r8.V()     // Catch:{ all -> 0x04bf }
            r9 = r4
            long r3 = r2.p     // Catch:{ all -> 0x04bf }
            int r0 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x01eb
            r0 = 1
            goto L_0x01ec
        L_0x01ea:
            r9 = r4
        L_0x01eb:
            r0 = 0
        L_0x01ec:
            long r3 = r8.V()     // Catch:{ all -> 0x04bf }
            int r12 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r12 != 0) goto L_0x0208
            java.lang.String r3 = r8.T()     // Catch:{ all -> 0x04bf }
            if (r3 == 0) goto L_0x0208
            java.lang.String r3 = r8.T()     // Catch:{ all -> 0x04bf }
            java.lang.String r4 = r2.f2958i     // Catch:{ all -> 0x04bf }
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x04bf }
            if (r3 != 0) goto L_0x0208
            r14 = 1
            goto L_0x0209
        L_0x0208:
            r14 = 0
        L_0x0209:
            r0 = r0 | r14
            if (r0 == 0) goto L_0x0230
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x04bf }
            r0.<init>()     // Catch:{ all -> 0x04bf }
            java.lang.String r3 = "_pv"
            java.lang.String r4 = r8.T()     // Catch:{ all -> 0x04bf }
            r0.putString(r3, r4)     // Catch:{ all -> 0x04bf }
            com.google.android.gms.measurement.internal.s r3 = new com.google.android.gms.measurement.internal.s     // Catch:{ all -> 0x04bf }
            java.lang.String r13 = "_au"
            com.google.android.gms.measurement.internal.n r14 = new com.google.android.gms.measurement.internal.n     // Catch:{ all -> 0x04bf }
            r14.<init>(r0)     // Catch:{ all -> 0x04bf }
            java.lang.String r15 = "auto"
            r12 = r3
            r16 = r10
            r12.<init>(r13, r14, r15, r16)     // Catch:{ all -> 0x04bf }
            r1.p(r3, r2)     // Catch:{ all -> 0x04bf }
            goto L_0x0230
        L_0x022f:
            r9 = r4
        L_0x0230:
            r21.U(r22)     // Catch:{ all -> 0x04bf }
            if (r7 != 0) goto L_0x0242
            com.google.android.gms.measurement.internal.d r0 = r21.Z()     // Catch:{ all -> 0x04bf }
            java.lang.String r3 = r2.f2956g     // Catch:{ all -> 0x04bf }
            java.lang.String r4 = "_f"
            com.google.android.gms.measurement.internal.o r0 = r0.D(r3, r4)     // Catch:{ all -> 0x04bf }
            goto L_0x0253
        L_0x0242:
            r3 = 1
            if (r7 != r3) goto L_0x0252
            com.google.android.gms.measurement.internal.d r0 = r21.Z()     // Catch:{ all -> 0x04bf }
            java.lang.String r3 = r2.f2956g     // Catch:{ all -> 0x04bf }
            java.lang.String r4 = "_v"
            com.google.android.gms.measurement.internal.o r0 = r0.D(r3, r4)     // Catch:{ all -> 0x04bf }
            goto L_0x0253
        L_0x0252:
            r0 = 0
        L_0x0253:
            if (r0 != 0) goto L_0x0493
            r3 = 3600000(0x36ee80, double:1.7786363E-317)
            long r12 = r10 / r3
            r14 = 1
            long r12 = r12 + r14
            long r12 = r12 * r3
            java.lang.String r0 = "_dac"
            java.lang.String r3 = "_r"
            java.lang.String r4 = "_c"
            java.lang.String r8 = "_et"
            if (r7 != 0) goto L_0x03f1
            com.google.android.gms.measurement.internal.ea r7 = new com.google.android.gms.measurement.internal.ea     // Catch:{ all -> 0x04bf }
            java.lang.String r14 = "_fot"
            java.lang.Long r16 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x04bf }
            java.lang.String r17 = "auto"
            r12 = r7
            r13 = r14
            r14 = r10
            r12.<init>(r13, r14, r16, r17)     // Catch:{ all -> 0x04bf }
            r1.v(r7, r2)     // Catch:{ all -> 0x04bf }
            com.google.android.gms.measurement.internal.h5 r7 = r1.f3223j     // Catch:{ all -> 0x04bf }
            com.google.android.gms.measurement.internal.wa r7 = r7.c()     // Catch:{ all -> 0x04bf }
            java.lang.String r12 = r2.f2957h     // Catch:{ all -> 0x04bf }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r13 = com.google.android.gms.measurement.internal.u.S     // Catch:{ all -> 0x04bf }
            boolean r7 = r7.C(r12, r13)     // Catch:{ all -> 0x04bf }
            if (r7 == 0) goto L_0x029a
            r21.n0()     // Catch:{ all -> 0x04bf }
            com.google.android.gms.measurement.internal.h5 r7 = r1.f3223j     // Catch:{ all -> 0x04bf }
            com.google.android.gms.measurement.internal.u4 r7 = r7.D()     // Catch:{ all -> 0x04bf }
            java.lang.String r12 = r2.f2956g     // Catch:{ all -> 0x04bf }
            r7.b(r12)     // Catch:{ all -> 0x04bf }
        L_0x029a:
            r21.n0()     // Catch:{ all -> 0x04bf }
            r21.g0()     // Catch:{ all -> 0x04bf }
            android.os.Bundle r7 = new android.os.Bundle     // Catch:{ all -> 0x04bf }
            r7.<init>()     // Catch:{ all -> 0x04bf }
            r12 = 1
            r7.putLong(r4, r12)     // Catch:{ all -> 0x04bf }
            r7.putLong(r3, r12)     // Catch:{ all -> 0x04bf }
            r3 = 0
            r7.putLong(r6, r3)     // Catch:{ all -> 0x04bf }
            r7.putLong(r5, r3)     // Catch:{ all -> 0x04bf }
            r7.putLong(r9, r3)     // Catch:{ all -> 0x04bf }
            r14 = r18
            r7.putLong(r14, r3)     // Catch:{ all -> 0x04bf }
            com.google.android.gms.measurement.internal.h5 r3 = r1.f3223j     // Catch:{ all -> 0x04bf }
            com.google.android.gms.measurement.internal.wa r3 = r3.c()     // Catch:{ all -> 0x04bf }
            java.lang.String r4 = r2.f2956g     // Catch:{ all -> 0x04bf }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r12 = com.google.android.gms.measurement.internal.u.U     // Catch:{ all -> 0x04bf }
            boolean r3 = r3.C(r4, r12)     // Catch:{ all -> 0x04bf }
            if (r3 == 0) goto L_0x02d3
            r3 = 1
            r7.putLong(r8, r3)     // Catch:{ all -> 0x04bf }
            goto L_0x02d5
        L_0x02d3:
            r3 = 1
        L_0x02d5:
            boolean r12 = r2.w     // Catch:{ all -> 0x04bf }
            if (r12 == 0) goto L_0x02dc
            r7.putLong(r0, r3)     // Catch:{ all -> 0x04bf }
        L_0x02dc:
            com.google.android.gms.measurement.internal.d r0 = r21.Z()     // Catch:{ all -> 0x04bf }
            java.lang.String r3 = r2.f2956g     // Catch:{ all -> 0x04bf }
            com.google.android.gms.common.internal.r.g(r3)     // Catch:{ all -> 0x04bf }
            r0.c()     // Catch:{ all -> 0x04bf }
            r0.r()     // Catch:{ all -> 0x04bf }
            java.lang.String r4 = "first_open_count"
            long r3 = r0.A0(r3, r4)     // Catch:{ all -> 0x04bf }
            com.google.android.gms.measurement.internal.h5 r0 = r1.f3223j     // Catch:{ all -> 0x04bf }
            android.content.Context r0 = r0.j()     // Catch:{ all -> 0x04bf }
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch:{ all -> 0x04bf }
            if (r0 != 0) goto L_0x0316
            com.google.android.gms.measurement.internal.h5 r0 = r1.f3223j     // Catch:{ all -> 0x04bf }
            com.google.android.gms.measurement.internal.c4 r0 = r0.i()     // Catch:{ all -> 0x04bf }
            com.google.android.gms.measurement.internal.e4 r0 = r0.E()     // Catch:{ all -> 0x04bf }
            java.lang.String r6 = "PackageManager is null, first open report might be inaccurate. appId"
            java.lang.String r9 = r2.f2956g     // Catch:{ all -> 0x04bf }
            java.lang.Object r9 = com.google.android.gms.measurement.internal.c4.w(r9)     // Catch:{ all -> 0x04bf }
            r0.b(r6, r9)     // Catch:{ all -> 0x04bf }
        L_0x0312:
            r12 = 0
            goto L_0x03d5
        L_0x0316:
            com.google.android.gms.measurement.internal.h5 r0 = r1.f3223j     // Catch:{ NameNotFoundException -> 0x0328 }
            android.content.Context r0 = r0.j()     // Catch:{ NameNotFoundException -> 0x0328 }
            com.google.android.gms.common.m.b r0 = com.google.android.gms.common.m.c.a(r0)     // Catch:{ NameNotFoundException -> 0x0328 }
            java.lang.String r12 = r2.f2956g     // Catch:{ NameNotFoundException -> 0x0328 }
            r13 = 0
            android.content.pm.PackageInfo r0 = r0.d(r12, r13)     // Catch:{ NameNotFoundException -> 0x0328 }
            goto L_0x033f
        L_0x0328:
            r0 = move-exception
            com.google.android.gms.measurement.internal.h5 r12 = r1.f3223j     // Catch:{ all -> 0x04bf }
            com.google.android.gms.measurement.internal.c4 r12 = r12.i()     // Catch:{ all -> 0x04bf }
            com.google.android.gms.measurement.internal.e4 r12 = r12.E()     // Catch:{ all -> 0x04bf }
            java.lang.String r13 = "Package info is null, first open report might be inaccurate. appId"
            java.lang.String r15 = r2.f2956g     // Catch:{ all -> 0x04bf }
            java.lang.Object r15 = com.google.android.gms.measurement.internal.c4.w(r15)     // Catch:{ all -> 0x04bf }
            r12.c(r13, r15, r0)     // Catch:{ all -> 0x04bf }
            r0 = 0
        L_0x033f:
            if (r0 == 0) goto L_0x0391
            long r12 = r0.firstInstallTime     // Catch:{ all -> 0x04bf }
            r15 = 0
            int r17 = (r12 > r15 ? 1 : (r12 == r15 ? 0 : -1))
            if (r17 == 0) goto L_0x0391
            long r12 = r0.firstInstallTime     // Catch:{ all -> 0x04bf }
            r18 = r14
            long r14 = r0.lastUpdateTime     // Catch:{ all -> 0x04bf }
            int r0 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r0 == 0) goto L_0x0374
            com.google.android.gms.measurement.internal.h5 r0 = r1.f3223j     // Catch:{ all -> 0x04bf }
            com.google.android.gms.measurement.internal.wa r0 = r0.c()     // Catch:{ all -> 0x04bf }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r12 = com.google.android.gms.measurement.internal.u.p0     // Catch:{ all -> 0x04bf }
            boolean r0 = r0.s(r12)     // Catch:{ all -> 0x04bf }
            if (r0 == 0) goto L_0x036d
            r12 = 0
            int r0 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r0 != 0) goto L_0x0372
            r12 = 1
            r7.putLong(r6, r12)     // Catch:{ all -> 0x04bf }
            goto L_0x0372
        L_0x036d:
            r12 = 1
            r7.putLong(r6, r12)     // Catch:{ all -> 0x04bf }
        L_0x0372:
            r14 = 0
            goto L_0x0375
        L_0x0374:
            r14 = 1
        L_0x0375:
            com.google.android.gms.measurement.internal.ea r0 = new com.google.android.gms.measurement.internal.ea     // Catch:{ all -> 0x04bf }
            java.lang.String r13 = "_fi"
            if (r14 == 0) goto L_0x037e
            r14 = 1
            goto L_0x0380
        L_0x037e:
            r14 = 0
        L_0x0380:
            java.lang.Long r16 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x04bf }
            java.lang.String r17 = "auto"
            r12 = r0
            r6 = r18
            r14 = r10
            r12.<init>(r13, r14, r16, r17)     // Catch:{ all -> 0x04bf }
            r1.v(r0, r2)     // Catch:{ all -> 0x04bf }
            goto L_0x0392
        L_0x0391:
            r6 = r14
        L_0x0392:
            com.google.android.gms.measurement.internal.h5 r0 = r1.f3223j     // Catch:{ NameNotFoundException -> 0x03a4 }
            android.content.Context r0 = r0.j()     // Catch:{ NameNotFoundException -> 0x03a4 }
            com.google.android.gms.common.m.b r0 = com.google.android.gms.common.m.c.a(r0)     // Catch:{ NameNotFoundException -> 0x03a4 }
            java.lang.String r12 = r2.f2956g     // Catch:{ NameNotFoundException -> 0x03a4 }
            r13 = 0
            android.content.pm.ApplicationInfo r0 = r0.b(r12, r13)     // Catch:{ NameNotFoundException -> 0x03a4 }
            goto L_0x03bb
        L_0x03a4:
            r0 = move-exception
            com.google.android.gms.measurement.internal.h5 r12 = r1.f3223j     // Catch:{ all -> 0x04bf }
            com.google.android.gms.measurement.internal.c4 r12 = r12.i()     // Catch:{ all -> 0x04bf }
            com.google.android.gms.measurement.internal.e4 r12 = r12.E()     // Catch:{ all -> 0x04bf }
            java.lang.String r13 = "Application info is null, first open report might be inaccurate. appId"
            java.lang.String r14 = r2.f2956g     // Catch:{ all -> 0x04bf }
            java.lang.Object r14 = com.google.android.gms.measurement.internal.c4.w(r14)     // Catch:{ all -> 0x04bf }
            r12.c(r13, r14, r0)     // Catch:{ all -> 0x04bf }
            r0 = 0
        L_0x03bb:
            if (r0 == 0) goto L_0x0312
            int r12 = r0.flags     // Catch:{ all -> 0x04bf }
            r13 = 1
            r12 = r12 & r13
            if (r12 == 0) goto L_0x03c8
            r12 = 1
            r7.putLong(r9, r12)     // Catch:{ all -> 0x04bf }
        L_0x03c8:
            int r0 = r0.flags     // Catch:{ all -> 0x04bf }
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0312
            r12 = 1
            r7.putLong(r6, r12)     // Catch:{ all -> 0x04bf }
            goto L_0x0312
        L_0x03d5:
            int r0 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r0 < 0) goto L_0x03dc
            r7.putLong(r5, r3)     // Catch:{ all -> 0x04bf }
        L_0x03dc:
            com.google.android.gms.measurement.internal.s r0 = new com.google.android.gms.measurement.internal.s     // Catch:{ all -> 0x04bf }
            java.lang.String r13 = "_f"
            com.google.android.gms.measurement.internal.n r14 = new com.google.android.gms.measurement.internal.n     // Catch:{ all -> 0x04bf }
            r14.<init>(r7)     // Catch:{ all -> 0x04bf }
            java.lang.String r15 = "auto"
            r12 = r0
            r16 = r10
            r12.<init>(r13, r14, r15, r16)     // Catch:{ all -> 0x04bf }
            r1.O(r0, r2)     // Catch:{ all -> 0x04bf }
            goto L_0x044d
        L_0x03f1:
            r5 = 1
            if (r7 != r5) goto L_0x044d
            com.google.android.gms.measurement.internal.ea r5 = new com.google.android.gms.measurement.internal.ea     // Catch:{ all -> 0x04bf }
            java.lang.String r6 = "_fvt"
            java.lang.Long r16 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x04bf }
            java.lang.String r17 = "auto"
            r12 = r5
            r13 = r6
            r14 = r10
            r12.<init>(r13, r14, r16, r17)     // Catch:{ all -> 0x04bf }
            r1.v(r5, r2)     // Catch:{ all -> 0x04bf }
            r21.n0()     // Catch:{ all -> 0x04bf }
            r21.g0()     // Catch:{ all -> 0x04bf }
            android.os.Bundle r5 = new android.os.Bundle     // Catch:{ all -> 0x04bf }
            r5.<init>()     // Catch:{ all -> 0x04bf }
            r6 = 1
            r5.putLong(r4, r6)     // Catch:{ all -> 0x04bf }
            r5.putLong(r3, r6)     // Catch:{ all -> 0x04bf }
            com.google.android.gms.measurement.internal.h5 r3 = r1.f3223j     // Catch:{ all -> 0x04bf }
            com.google.android.gms.measurement.internal.wa r3 = r3.c()     // Catch:{ all -> 0x04bf }
            java.lang.String r4 = r2.f2956g     // Catch:{ all -> 0x04bf }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r6 = com.google.android.gms.measurement.internal.u.U     // Catch:{ all -> 0x04bf }
            boolean r3 = r3.C(r4, r6)     // Catch:{ all -> 0x04bf }
            if (r3 == 0) goto L_0x0430
            r3 = 1
            r5.putLong(r8, r3)     // Catch:{ all -> 0x04bf }
            goto L_0x0432
        L_0x0430:
            r3 = 1
        L_0x0432:
            boolean r6 = r2.w     // Catch:{ all -> 0x04bf }
            if (r6 == 0) goto L_0x0439
            r5.putLong(r0, r3)     // Catch:{ all -> 0x04bf }
        L_0x0439:
            com.google.android.gms.measurement.internal.s r0 = new com.google.android.gms.measurement.internal.s     // Catch:{ all -> 0x04bf }
            java.lang.String r13 = "_v"
            com.google.android.gms.measurement.internal.n r14 = new com.google.android.gms.measurement.internal.n     // Catch:{ all -> 0x04bf }
            r14.<init>(r5)     // Catch:{ all -> 0x04bf }
            java.lang.String r15 = "auto"
            r12 = r0
            r16 = r10
            r12.<init>(r13, r14, r15, r16)     // Catch:{ all -> 0x04bf }
            r1.O(r0, r2)     // Catch:{ all -> 0x04bf }
        L_0x044d:
            com.google.android.gms.measurement.internal.h5 r0 = r1.f3223j     // Catch:{ all -> 0x04bf }
            com.google.android.gms.measurement.internal.wa r0 = r0.c()     // Catch:{ all -> 0x04bf }
            java.lang.String r3 = r2.f2956g     // Catch:{ all -> 0x04bf }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r4 = com.google.android.gms.measurement.internal.u.V     // Catch:{ all -> 0x04bf }
            boolean r0 = r0.C(r3, r4)     // Catch:{ all -> 0x04bf }
            if (r0 != 0) goto L_0x04b0
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x04bf }
            r0.<init>()     // Catch:{ all -> 0x04bf }
            r3 = 1
            r0.putLong(r8, r3)     // Catch:{ all -> 0x04bf }
            com.google.android.gms.measurement.internal.h5 r3 = r1.f3223j     // Catch:{ all -> 0x04bf }
            com.google.android.gms.measurement.internal.wa r3 = r3.c()     // Catch:{ all -> 0x04bf }
            java.lang.String r4 = r2.f2956g     // Catch:{ all -> 0x04bf }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r5 = com.google.android.gms.measurement.internal.u.U     // Catch:{ all -> 0x04bf }
            boolean r3 = r3.C(r4, r5)     // Catch:{ all -> 0x04bf }
            if (r3 == 0) goto L_0x047e
            java.lang.String r3 = "_fr"
            r4 = 1
            r0.putLong(r3, r4)     // Catch:{ all -> 0x04bf }
        L_0x047e:
            com.google.android.gms.measurement.internal.s r3 = new com.google.android.gms.measurement.internal.s     // Catch:{ all -> 0x04bf }
            java.lang.String r13 = "_e"
            com.google.android.gms.measurement.internal.n r14 = new com.google.android.gms.measurement.internal.n     // Catch:{ all -> 0x04bf }
            r14.<init>(r0)     // Catch:{ all -> 0x04bf }
            java.lang.String r15 = "auto"
            r12 = r3
            r16 = r10
            r12.<init>(r13, r14, r15, r16)     // Catch:{ all -> 0x04bf }
            r1.O(r3, r2)     // Catch:{ all -> 0x04bf }
            goto L_0x04b0
        L_0x0493:
            boolean r0 = r2.o     // Catch:{ all -> 0x04bf }
            if (r0 == 0) goto L_0x04b0
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x04bf }
            r0.<init>()     // Catch:{ all -> 0x04bf }
            com.google.android.gms.measurement.internal.s r3 = new com.google.android.gms.measurement.internal.s     // Catch:{ all -> 0x04bf }
            java.lang.String r13 = "_cd"
            com.google.android.gms.measurement.internal.n r14 = new com.google.android.gms.measurement.internal.n     // Catch:{ all -> 0x04bf }
            r14.<init>(r0)     // Catch:{ all -> 0x04bf }
            java.lang.String r15 = "auto"
            r12 = r3
            r16 = r10
            r12.<init>(r13, r14, r15, r16)     // Catch:{ all -> 0x04bf }
            r1.O(r3, r2)     // Catch:{ all -> 0x04bf }
        L_0x04b0:
            com.google.android.gms.measurement.internal.d r0 = r21.Z()     // Catch:{ all -> 0x04bf }
            r0.u()     // Catch:{ all -> 0x04bf }
            com.google.android.gms.measurement.internal.d r0 = r21.Z()
            r0.y0()
            return
        L_0x04bf:
            r0 = move-exception
            com.google.android.gms.measurement.internal.d r2 = r21.Z()
            r2.y0()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.x9.R(com.google.android.gms.measurement.internal.la):void");
    }

    /* access modifiers changed from: package-private */
    public final void S(ua uaVar) {
        la K = K(uaVar.f3163g);
        if (K != null) {
            T(uaVar, K);
        }
    }

    /* access modifiers changed from: package-private */
    public final void T(ua uaVar, la laVar) {
        r.k(uaVar);
        r.g(uaVar.f3163g);
        r.k(uaVar.f3165i);
        r.g(uaVar.f3165i.f2823h);
        n0();
        g0();
        if (a0(laVar)) {
            if (!laVar.f2963n) {
                U(laVar);
                return;
            }
            Z().t0();
            try {
                U(laVar);
                ua p0 = Z().p0(uaVar.f3163g, uaVar.f3165i.f2823h);
                if (p0 != null) {
                    this.f3223j.i().L().c("Removing conditional user property", uaVar.f3163g, this.f3223j.H().z(uaVar.f3165i.f2823h));
                    Z().r0(uaVar.f3163g, uaVar.f3165i.f2823h);
                    if (p0.f3167k) {
                        Z().l0(uaVar.f3163g, uaVar.f3165i.f2823h);
                    }
                    if (uaVar.q != null) {
                        Bundle bundle = null;
                        if (uaVar.q.f3082h != null) {
                            bundle = uaVar.q.f3082h.o();
                        }
                        W(this.f3223j.G().E(uaVar.f3163g, uaVar.q.f3081g, bundle, p0.f3164h, uaVar.q.f3084j, true, false, ma.a() && this.f3223j.c().s(u.T0)), laVar);
                    }
                } else {
                    this.f3223j.i().H().c("Conditional user property doesn't exist", c4.w(uaVar.f3163g), this.f3223j.H().z(uaVar.f3165i.f2823h));
                }
                Z().u();
            } finally {
                Z().y0();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final f4 U(la laVar) {
        String str;
        n0();
        g0();
        r.k(laVar);
        r.g(laVar.f2956g);
        f4 j0 = Z().j0(laVar.f2956g);
        e eVar = e.c;
        if (fb.a() && this.f3223j.c().s(u.Q0)) {
            eVar = c(laVar.f2956g).k(e.b(laVar.C));
        }
        if (!fb.a() || !this.f3223j.c().s(u.Q0) || eVar.o()) {
            str = this.f3222i.v(laVar.f2956g);
        } else {
            str = "";
        }
        if (!dc.a() || !this.f3223j.c().s(u.q0)) {
            return d(laVar, j0, str);
        }
        if (j0 == null) {
            j0 = new f4(this.f3223j, laVar.f2956g);
            if (!fb.a() || !this.f3223j.c().s(u.Q0)) {
                j0.c(p0());
                j0.C(str);
            } else {
                if (eVar.q()) {
                    j0.c(g(eVar));
                }
                if (eVar.o()) {
                    j0.C(str);
                }
            }
        } else if ((!fb.a() || !this.f3223j.c().s(u.Q0) || eVar.o()) && !str.equals(j0.J())) {
            j0.C(str);
            if (!fb.a() || !this.f3223j.c().s(u.Q0)) {
                j0.c(p0());
            } else {
                j0.c(g(eVar));
            }
        }
        j0.r(laVar.f2957h);
        j0.v(laVar.x);
        if (vc.a() && this.f3223j.c().C(j0.t(), u.k0)) {
            j0.z(laVar.B);
        }
        if (!TextUtils.isEmpty(laVar.q)) {
            j0.F(laVar.q);
        }
        long j2 = laVar.f2960k;
        if (j2 != 0) {
            j0.y(j2);
        }
        if (!TextUtils.isEmpty(laVar.f2958i)) {
            j0.I(laVar.f2958i);
        }
        j0.u(laVar.p);
        String str2 = laVar.f2959j;
        if (str2 != null) {
            j0.L(str2);
        }
        j0.B(laVar.f2961l);
        j0.e(laVar.f2963n);
        if (!TextUtils.isEmpty(laVar.f2962m)) {
            j0.O(laVar.f2962m);
        }
        if (!this.f3223j.c().s(u.G0)) {
            j0.c0(laVar.r);
        }
        j0.s(laVar.u);
        j0.w(laVar.v);
        j0.b(laVar.y);
        j0.E(laVar.z);
        if (j0.f()) {
            Z().O(j0);
        }
        return j0;
    }

    public final b5 V() {
        P(this.a);
        return this.a;
    }

    public final g4 X() {
        P(this.b);
        return this.b;
    }

    /* access modifiers changed from: package-private */
    public final String Y(la laVar) {
        try {
            return (String) this.f3223j.a().v(new aa(this, laVar)).get(30000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            this.f3223j.i().E().c("Failed to get app instance id. appId", c4.w(laVar.f2956g), e2);
            return null;
        }
    }

    public final d Z() {
        P(this.c);
        return this.c;
    }

    public final a5 a() {
        return this.f3223j.a();
    }

    public final ma b0() {
        P(this.f3219f);
        return this.f3219f;
    }

    /* access modifiers changed from: package-private */
    public final e c(String str) {
        e eVar = e.c;
        if (fb.a() && this.f3223j.c().s(u.Q0)) {
            n0();
            g0();
            eVar = this.y.get(str);
            if (eVar == null) {
                eVar = Z().C0(str);
                if (eVar == null) {
                    eVar = e.c;
                }
                B(str, eVar);
            }
        }
        return eVar;
    }

    public final s7 c0() {
        P(this.f3221h);
        return this.f3221h;
    }

    public final ba d0() {
        P(this.f3220g);
        return this.f3220g;
    }

    public final a4 e0() {
        return this.f3223j.H();
    }

    public final e f() {
        return this.f3223j.f();
    }

    public final fa f0() {
        return this.f3223j.G();
    }

    /* access modifiers changed from: package-private */
    public final void g0() {
        if (!this.f3224k) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    /* access modifiers changed from: protected */
    public final void h() {
        this.f3223j.a().c();
        Z().D0();
        if (this.f3223j.x().f3025e.a() == 0) {
            this.f3223j.x().f3025e.b(this.f3223j.f().b());
        }
        H();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:136|137) */
    /* JADX WARNING: Code restructure failed: missing block: B:137:?, code lost:
        r1.f3223j.i().E().c("Failed to parse upload URL. Not uploading. appId", com.google.android.gms.measurement.internal.c4.w(r5), r0);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:136:0x036f */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x022e A[Catch:{ all -> 0x03ab }] */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x02bf A[Catch:{ all -> 0x03ab }] */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x02d0 A[Catch:{ all -> 0x03ab }] */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x02f4 A[Catch:{ MalformedURLException -> 0x036f }] */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x02f6 A[Catch:{ MalformedURLException -> 0x036f }] */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x02fe A[Catch:{ MalformedURLException -> 0x036f }] */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x030e A[Catch:{ MalformedURLException -> 0x036f }] */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0326 A[Catch:{ MalformedURLException -> 0x036f }] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0227 A[Catch:{ all -> 0x03ab }] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0228 A[Catch:{ all -> 0x03ab }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h0() {
        /*
            r17 = this;
            r1 = r17
            r17.n0()
            r17.g0()
            r0 = 1
            r1.s = r0
            r2 = 0
            com.google.android.gms.measurement.internal.h5 r3 = r1.f3223j     // Catch:{ all -> 0x03ab }
            com.google.android.gms.measurement.internal.c8 r3 = r3.P()     // Catch:{ all -> 0x03ab }
            java.lang.Boolean r3 = r3.a0()     // Catch:{ all -> 0x03ab }
            if (r3 != 0) goto L_0x002d
            com.google.android.gms.measurement.internal.h5 r0 = r1.f3223j     // Catch:{ all -> 0x03ab }
            com.google.android.gms.measurement.internal.c4 r0 = r0.i()     // Catch:{ all -> 0x03ab }
            com.google.android.gms.measurement.internal.e4 r0 = r0.H()     // Catch:{ all -> 0x03ab }
            java.lang.String r3 = "Upload data called on the client side before use of service was decided"
            r0.a(r3)     // Catch:{ all -> 0x03ab }
            r1.s = r2
            r17.I()
            return
        L_0x002d:
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x03ab }
            if (r3 == 0) goto L_0x0048
            com.google.android.gms.measurement.internal.h5 r0 = r1.f3223j     // Catch:{ all -> 0x03ab }
            com.google.android.gms.measurement.internal.c4 r0 = r0.i()     // Catch:{ all -> 0x03ab }
            com.google.android.gms.measurement.internal.e4 r0 = r0.E()     // Catch:{ all -> 0x03ab }
            java.lang.String r3 = "Upload called in the client side when service should be used"
            r0.a(r3)     // Catch:{ all -> 0x03ab }
            r1.s = r2
            r17.I()
            return
        L_0x0048:
            long r3 = r1.f3226m     // Catch:{ all -> 0x03ab }
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x0059
            r17.H()     // Catch:{ all -> 0x03ab }
            r1.s = r2
            r17.I()
            return
        L_0x0059:
            r17.n0()     // Catch:{ all -> 0x03ab }
            java.util.List<java.lang.Long> r3 = r1.v     // Catch:{ all -> 0x03ab }
            if (r3 == 0) goto L_0x0062
            r3 = 1
            goto L_0x0063
        L_0x0062:
            r3 = 0
        L_0x0063:
            if (r3 == 0) goto L_0x007a
            com.google.android.gms.measurement.internal.h5 r0 = r1.f3223j     // Catch:{ all -> 0x03ab }
            com.google.android.gms.measurement.internal.c4 r0 = r0.i()     // Catch:{ all -> 0x03ab }
            com.google.android.gms.measurement.internal.e4 r0 = r0.M()     // Catch:{ all -> 0x03ab }
            java.lang.String r3 = "Uploading requested multiple times"
            r0.a(r3)     // Catch:{ all -> 0x03ab }
            r1.s = r2
            r17.I()
            return
        L_0x007a:
            com.google.android.gms.measurement.internal.g4 r3 = r17.X()     // Catch:{ all -> 0x03ab }
            boolean r3 = r3.x()     // Catch:{ all -> 0x03ab }
            if (r3 != 0) goto L_0x009c
            com.google.android.gms.measurement.internal.h5 r0 = r1.f3223j     // Catch:{ all -> 0x03ab }
            com.google.android.gms.measurement.internal.c4 r0 = r0.i()     // Catch:{ all -> 0x03ab }
            com.google.android.gms.measurement.internal.e4 r0 = r0.M()     // Catch:{ all -> 0x03ab }
            java.lang.String r3 = "Network not connected, ignoring upload request"
            r0.a(r3)     // Catch:{ all -> 0x03ab }
            r17.H()     // Catch:{ all -> 0x03ab }
            r1.s = r2
            r17.I()
            return
        L_0x009c:
            com.google.android.gms.measurement.internal.h5 r3 = r1.f3223j     // Catch:{ all -> 0x03ab }
            com.google.android.gms.common.util.e r3 = r3.f()     // Catch:{ all -> 0x03ab }
            long r3 = r3.b()     // Catch:{ all -> 0x03ab }
            com.google.android.gms.measurement.internal.h5 r7 = r1.f3223j     // Catch:{ all -> 0x03ab }
            com.google.android.gms.measurement.internal.wa r7 = r7.c()     // Catch:{ all -> 0x03ab }
            com.google.android.gms.measurement.internal.r3<java.lang.Integer> r8 = com.google.android.gms.measurement.internal.u.Q     // Catch:{ all -> 0x03ab }
            r9 = 0
            int r7 = r7.u(r9, r8)     // Catch:{ all -> 0x03ab }
            long r10 = com.google.android.gms.measurement.internal.wa.L()     // Catch:{ all -> 0x03ab }
            long r10 = r3 - r10
            r8 = 0
        L_0x00ba:
            if (r8 >= r7) goto L_0x00c5
            boolean r12 = r1.F(r9, r10)     // Catch:{ all -> 0x03ab }
            if (r12 == 0) goto L_0x00c5
            int r8 = r8 + 1
            goto L_0x00ba
        L_0x00c5:
            com.google.android.gms.measurement.internal.h5 r7 = r1.f3223j     // Catch:{ all -> 0x03ab }
            com.google.android.gms.measurement.internal.p4 r7 = r7.x()     // Catch:{ all -> 0x03ab }
            com.google.android.gms.measurement.internal.t4 r7 = r7.f3025e     // Catch:{ all -> 0x03ab }
            long r7 = r7.a()     // Catch:{ all -> 0x03ab }
            int r10 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r10 == 0) goto L_0x00ee
            com.google.android.gms.measurement.internal.h5 r5 = r1.f3223j     // Catch:{ all -> 0x03ab }
            com.google.android.gms.measurement.internal.c4 r5 = r5.i()     // Catch:{ all -> 0x03ab }
            com.google.android.gms.measurement.internal.e4 r5 = r5.L()     // Catch:{ all -> 0x03ab }
            java.lang.String r6 = "Uploading events. Elapsed time since last upload attempt (ms)"
            long r7 = r3 - r7
            long r7 = java.lang.Math.abs(r7)     // Catch:{ all -> 0x03ab }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x03ab }
            r5.b(r6, r7)     // Catch:{ all -> 0x03ab }
        L_0x00ee:
            com.google.android.gms.measurement.internal.d r5 = r17.Z()     // Catch:{ all -> 0x03ab }
            java.lang.String r5 = r5.w()     // Catch:{ all -> 0x03ab }
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x03ab }
            r7 = -1
            if (r6 != 0) goto L_0x0383
            long r10 = r1.x     // Catch:{ all -> 0x03ab }
            int r6 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r6 != 0) goto L_0x010e
            com.google.android.gms.measurement.internal.d r6 = r17.Z()     // Catch:{ all -> 0x03ab }
            long r6 = r6.I0()     // Catch:{ all -> 0x03ab }
            r1.x = r6     // Catch:{ all -> 0x03ab }
        L_0x010e:
            com.google.android.gms.measurement.internal.h5 r6 = r1.f3223j     // Catch:{ all -> 0x03ab }
            com.google.android.gms.measurement.internal.wa r6 = r6.c()     // Catch:{ all -> 0x03ab }
            com.google.android.gms.measurement.internal.r3<java.lang.Integer> r7 = com.google.android.gms.measurement.internal.u.f3136g     // Catch:{ all -> 0x03ab }
            int r6 = r6.u(r5, r7)     // Catch:{ all -> 0x03ab }
            com.google.android.gms.measurement.internal.h5 r7 = r1.f3223j     // Catch:{ all -> 0x03ab }
            com.google.android.gms.measurement.internal.wa r7 = r7.c()     // Catch:{ all -> 0x03ab }
            com.google.android.gms.measurement.internal.r3<java.lang.Integer> r8 = com.google.android.gms.measurement.internal.u.f3137h     // Catch:{ all -> 0x03ab }
            int r7 = r7.u(r5, r8)     // Catch:{ all -> 0x03ab }
            int r7 = java.lang.Math.max(r2, r7)     // Catch:{ all -> 0x03ab }
            com.google.android.gms.measurement.internal.d r8 = r17.Z()     // Catch:{ all -> 0x03ab }
            java.util.List r6 = r8.J(r5, r6, r7)     // Catch:{ all -> 0x03ab }
            boolean r7 = r6.isEmpty()     // Catch:{ all -> 0x03ab }
            if (r7 != 0) goto L_0x03a5
            boolean r7 = com.google.android.gms.internal.measurement.fb.a()     // Catch:{ all -> 0x03ab }
            if (r7 == 0) goto L_0x0156
            com.google.android.gms.measurement.internal.h5 r7 = r1.f3223j     // Catch:{ all -> 0x03ab }
            com.google.android.gms.measurement.internal.wa r7 = r7.c()     // Catch:{ all -> 0x03ab }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r8 = com.google.android.gms.measurement.internal.u.Q0     // Catch:{ all -> 0x03ab }
            boolean r7 = r7.s(r8)     // Catch:{ all -> 0x03ab }
            if (r7 == 0) goto L_0x0156
            com.google.android.gms.measurement.internal.e r7 = r1.c(r5)     // Catch:{ all -> 0x03ab }
            boolean r7 = r7.o()     // Catch:{ all -> 0x03ab }
            if (r7 == 0) goto L_0x01a9
        L_0x0156:
            java.util.Iterator r7 = r6.iterator()     // Catch:{ all -> 0x03ab }
        L_0x015a:
            boolean r8 = r7.hasNext()     // Catch:{ all -> 0x03ab }
            if (r8 == 0) goto L_0x0179
            java.lang.Object r8 = r7.next()     // Catch:{ all -> 0x03ab }
            android.util.Pair r8 = (android.util.Pair) r8     // Catch:{ all -> 0x03ab }
            java.lang.Object r8 = r8.first     // Catch:{ all -> 0x03ab }
            com.google.android.gms.internal.measurement.e1 r8 = (com.google.android.gms.internal.measurement.e1) r8     // Catch:{ all -> 0x03ab }
            java.lang.String r10 = r8.Y()     // Catch:{ all -> 0x03ab }
            boolean r10 = android.text.TextUtils.isEmpty(r10)     // Catch:{ all -> 0x03ab }
            if (r10 != 0) goto L_0x015a
            java.lang.String r7 = r8.Y()     // Catch:{ all -> 0x03ab }
            goto L_0x017a
        L_0x0179:
            r7 = r9
        L_0x017a:
            if (r7 == 0) goto L_0x01a9
            r8 = 0
        L_0x017d:
            int r10 = r6.size()     // Catch:{ all -> 0x03ab }
            if (r8 >= r10) goto L_0x01a9
            java.lang.Object r10 = r6.get(r8)     // Catch:{ all -> 0x03ab }
            android.util.Pair r10 = (android.util.Pair) r10     // Catch:{ all -> 0x03ab }
            java.lang.Object r10 = r10.first     // Catch:{ all -> 0x03ab }
            com.google.android.gms.internal.measurement.e1 r10 = (com.google.android.gms.internal.measurement.e1) r10     // Catch:{ all -> 0x03ab }
            java.lang.String r11 = r10.Y()     // Catch:{ all -> 0x03ab }
            boolean r11 = android.text.TextUtils.isEmpty(r11)     // Catch:{ all -> 0x03ab }
            if (r11 != 0) goto L_0x01a6
            java.lang.String r10 = r10.Y()     // Catch:{ all -> 0x03ab }
            boolean r10 = r10.equals(r7)     // Catch:{ all -> 0x03ab }
            if (r10 != 0) goto L_0x01a6
            java.util.List r6 = r6.subList(r2, r8)     // Catch:{ all -> 0x03ab }
            goto L_0x01a9
        L_0x01a6:
            int r8 = r8 + 1
            goto L_0x017d
        L_0x01a9:
            com.google.android.gms.internal.measurement.d1$a r7 = com.google.android.gms.internal.measurement.d1.F()     // Catch:{ all -> 0x03ab }
            int r8 = r6.size()     // Catch:{ all -> 0x03ab }
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ all -> 0x03ab }
            int r11 = r6.size()     // Catch:{ all -> 0x03ab }
            r10.<init>(r11)     // Catch:{ all -> 0x03ab }
            com.google.android.gms.measurement.internal.h5 r11 = r1.f3223j     // Catch:{ all -> 0x03ab }
            com.google.android.gms.measurement.internal.wa r11 = r11.c()     // Catch:{ all -> 0x03ab }
            boolean r11 = r11.I(r5)     // Catch:{ all -> 0x03ab }
            if (r11 == 0) goto L_0x01e6
            boolean r11 = com.google.android.gms.internal.measurement.fb.a()     // Catch:{ all -> 0x03ab }
            if (r11 == 0) goto L_0x01e4
            com.google.android.gms.measurement.internal.h5 r11 = r1.f3223j     // Catch:{ all -> 0x03ab }
            com.google.android.gms.measurement.internal.wa r11 = r11.c()     // Catch:{ all -> 0x03ab }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r12 = com.google.android.gms.measurement.internal.u.Q0     // Catch:{ all -> 0x03ab }
            boolean r11 = r11.s(r12)     // Catch:{ all -> 0x03ab }
            if (r11 == 0) goto L_0x01e4
            com.google.android.gms.measurement.internal.e r11 = r1.c(r5)     // Catch:{ all -> 0x03ab }
            boolean r11 = r11.o()     // Catch:{ all -> 0x03ab }
            if (r11 == 0) goto L_0x01e6
        L_0x01e4:
            r11 = 1
            goto L_0x01e7
        L_0x01e6:
            r11 = 0
        L_0x01e7:
            boolean r12 = com.google.android.gms.internal.measurement.fb.a()     // Catch:{ all -> 0x03ab }
            if (r12 == 0) goto L_0x0208
            com.google.android.gms.measurement.internal.h5 r12 = r1.f3223j     // Catch:{ all -> 0x03ab }
            com.google.android.gms.measurement.internal.wa r12 = r12.c()     // Catch:{ all -> 0x03ab }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r13 = com.google.android.gms.measurement.internal.u.Q0     // Catch:{ all -> 0x03ab }
            boolean r12 = r12.s(r13)     // Catch:{ all -> 0x03ab }
            if (r12 == 0) goto L_0x0208
            com.google.android.gms.measurement.internal.e r12 = r1.c(r5)     // Catch:{ all -> 0x03ab }
            boolean r12 = r12.o()     // Catch:{ all -> 0x03ab }
            if (r12 == 0) goto L_0x0206
            goto L_0x0208
        L_0x0206:
            r12 = 0
            goto L_0x0209
        L_0x0208:
            r12 = 1
        L_0x0209:
            boolean r13 = com.google.android.gms.internal.measurement.fb.a()     // Catch:{ all -> 0x03ab }
            if (r13 == 0) goto L_0x022a
            com.google.android.gms.measurement.internal.h5 r13 = r1.f3223j     // Catch:{ all -> 0x03ab }
            com.google.android.gms.measurement.internal.wa r13 = r13.c()     // Catch:{ all -> 0x03ab }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r14 = com.google.android.gms.measurement.internal.u.Q0     // Catch:{ all -> 0x03ab }
            boolean r13 = r13.s(r14)     // Catch:{ all -> 0x03ab }
            if (r13 == 0) goto L_0x022a
            com.google.android.gms.measurement.internal.e r13 = r1.c(r5)     // Catch:{ all -> 0x03ab }
            boolean r13 = r13.q()     // Catch:{ all -> 0x03ab }
            if (r13 == 0) goto L_0x0228
            goto L_0x022a
        L_0x0228:
            r13 = 0
            goto L_0x022b
        L_0x022a:
            r13 = 1
        L_0x022b:
            r14 = 0
        L_0x022c:
            if (r14 >= r8) goto L_0x02b0
            java.lang.Object r15 = r6.get(r14)     // Catch:{ all -> 0x03ab }
            android.util.Pair r15 = (android.util.Pair) r15     // Catch:{ all -> 0x03ab }
            java.lang.Object r15 = r15.first     // Catch:{ all -> 0x03ab }
            com.google.android.gms.internal.measurement.e1 r15 = (com.google.android.gms.internal.measurement.e1) r15     // Catch:{ all -> 0x03ab }
            com.google.android.gms.internal.measurement.z6$b r15 = r15.x()     // Catch:{ all -> 0x03ab }
            com.google.android.gms.internal.measurement.e1$a r15 = (com.google.android.gms.internal.measurement.e1.a) r15     // Catch:{ all -> 0x03ab }
            java.lang.Object r16 = r6.get(r14)     // Catch:{ all -> 0x03ab }
            r0 = r16
            android.util.Pair r0 = (android.util.Pair) r0     // Catch:{ all -> 0x03ab }
            java.lang.Object r0 = r0.second     // Catch:{ all -> 0x03ab }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x03ab }
            r10.add(r0)     // Catch:{ all -> 0x03ab }
            r16 = r10
            r9 = 31049(0x7949, double:1.534E-319)
            r15.p0(r9)     // Catch:{ all -> 0x03ab }
            r15.C(r3)     // Catch:{ all -> 0x03ab }
            r15.Q(r2)     // Catch:{ all -> 0x03ab }
            if (r11 != 0) goto L_0x025f
            r15.T0()     // Catch:{ all -> 0x03ab }
        L_0x025f:
            boolean r9 = com.google.android.gms.internal.measurement.fb.a()     // Catch:{ all -> 0x03ab }
            if (r9 == 0) goto L_0x0280
            com.google.android.gms.measurement.internal.h5 r9 = r1.f3223j     // Catch:{ all -> 0x03ab }
            com.google.android.gms.measurement.internal.wa r9 = r9.c()     // Catch:{ all -> 0x03ab }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r10 = com.google.android.gms.measurement.internal.u.Q0     // Catch:{ all -> 0x03ab }
            boolean r9 = r9.s(r10)     // Catch:{ all -> 0x03ab }
            if (r9 == 0) goto L_0x0280
            if (r12 != 0) goto L_0x027b
            r15.D0()     // Catch:{ all -> 0x03ab }
            r15.G0()     // Catch:{ all -> 0x03ab }
        L_0x027b:
            if (r13 != 0) goto L_0x0280
            r15.J0()     // Catch:{ all -> 0x03ab }
        L_0x0280:
            com.google.android.gms.measurement.internal.h5 r9 = r1.f3223j     // Catch:{ all -> 0x03ab }
            com.google.android.gms.measurement.internal.wa r9 = r9.c()     // Catch:{ all -> 0x03ab }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r10 = com.google.android.gms.measurement.internal.u.Y     // Catch:{ all -> 0x03ab }
            boolean r9 = r9.C(r5, r10)     // Catch:{ all -> 0x03ab }
            if (r9 == 0) goto L_0x02a5
            com.google.android.gms.internal.measurement.j8 r9 = r15.l()     // Catch:{ all -> 0x03ab }
            com.google.android.gms.internal.measurement.z6 r9 = (com.google.android.gms.internal.measurement.z6) r9     // Catch:{ all -> 0x03ab }
            com.google.android.gms.internal.measurement.e1 r9 = (com.google.android.gms.internal.measurement.e1) r9     // Catch:{ all -> 0x03ab }
            byte[] r9 = r9.i()     // Catch:{ all -> 0x03ab }
            com.google.android.gms.measurement.internal.ba r10 = r17.d0()     // Catch:{ all -> 0x03ab }
            long r9 = r10.v(r9)     // Catch:{ all -> 0x03ab }
            r15.H0(r9)     // Catch:{ all -> 0x03ab }
        L_0x02a5:
            r7.z(r15)     // Catch:{ all -> 0x03ab }
            int r14 = r14 + 1
            r10 = r16
            r0 = 1
            r9 = 0
            goto L_0x022c
        L_0x02b0:
            r16 = r10
            com.google.android.gms.measurement.internal.h5 r6 = r1.f3223j     // Catch:{ all -> 0x03ab }
            com.google.android.gms.measurement.internal.c4 r6 = r6.i()     // Catch:{ all -> 0x03ab }
            r9 = 2
            boolean r6 = r6.B(r9)     // Catch:{ all -> 0x03ab }
            if (r6 == 0) goto L_0x02d0
            com.google.android.gms.measurement.internal.ba r6 = r17.d0()     // Catch:{ all -> 0x03ab }
            com.google.android.gms.internal.measurement.j8 r9 = r7.l()     // Catch:{ all -> 0x03ab }
            com.google.android.gms.internal.measurement.z6 r9 = (com.google.android.gms.internal.measurement.z6) r9     // Catch:{ all -> 0x03ab }
            com.google.android.gms.internal.measurement.d1 r9 = (com.google.android.gms.internal.measurement.d1) r9     // Catch:{ all -> 0x03ab }
            java.lang.String r6 = r6.C(r9)     // Catch:{ all -> 0x03ab }
            goto L_0x02d1
        L_0x02d0:
            r6 = 0
        L_0x02d1:
            r17.d0()     // Catch:{ all -> 0x03ab }
            com.google.android.gms.internal.measurement.j8 r9 = r7.l()     // Catch:{ all -> 0x03ab }
            com.google.android.gms.internal.measurement.z6 r9 = (com.google.android.gms.internal.measurement.z6) r9     // Catch:{ all -> 0x03ab }
            com.google.android.gms.internal.measurement.d1 r9 = (com.google.android.gms.internal.measurement.d1) r9     // Catch:{ all -> 0x03ab }
            byte[] r14 = r9.i()     // Catch:{ all -> 0x03ab }
            com.google.android.gms.measurement.internal.r3<java.lang.String> r9 = com.google.android.gms.measurement.internal.u.q     // Catch:{ all -> 0x03ab }
            r0 = 0
            java.lang.Object r0 = r9.a(r0)     // Catch:{ all -> 0x03ab }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x03ab }
            java.net.URL r13 = new java.net.URL     // Catch:{ MalformedURLException -> 0x036f }
            r13.<init>(r0)     // Catch:{ MalformedURLException -> 0x036f }
            boolean r9 = r16.isEmpty()     // Catch:{ MalformedURLException -> 0x036f }
            if (r9 != 0) goto L_0x02f6
            r9 = 1
            goto L_0x02f7
        L_0x02f6:
            r9 = 0
        L_0x02f7:
            com.google.android.gms.common.internal.r.a(r9)     // Catch:{ MalformedURLException -> 0x036f }
            java.util.List<java.lang.Long> r9 = r1.v     // Catch:{ MalformedURLException -> 0x036f }
            if (r9 == 0) goto L_0x030e
            com.google.android.gms.measurement.internal.h5 r9 = r1.f3223j     // Catch:{ MalformedURLException -> 0x036f }
            com.google.android.gms.measurement.internal.c4 r9 = r9.i()     // Catch:{ MalformedURLException -> 0x036f }
            com.google.android.gms.measurement.internal.e4 r9 = r9.E()     // Catch:{ MalformedURLException -> 0x036f }
            java.lang.String r10 = "Set uploading progress before finishing the previous upload"
            r9.a(r10)     // Catch:{ MalformedURLException -> 0x036f }
            goto L_0x0317
        L_0x030e:
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ MalformedURLException -> 0x036f }
            r10 = r16
            r9.<init>(r10)     // Catch:{ MalformedURLException -> 0x036f }
            r1.v = r9     // Catch:{ MalformedURLException -> 0x036f }
        L_0x0317:
            com.google.android.gms.measurement.internal.h5 r9 = r1.f3223j     // Catch:{ MalformedURLException -> 0x036f }
            com.google.android.gms.measurement.internal.p4 r9 = r9.x()     // Catch:{ MalformedURLException -> 0x036f }
            com.google.android.gms.measurement.internal.t4 r9 = r9.f3026f     // Catch:{ MalformedURLException -> 0x036f }
            r9.b(r3)     // Catch:{ MalformedURLException -> 0x036f }
            java.lang.String r3 = "?"
            if (r8 <= 0) goto L_0x032e
            com.google.android.gms.internal.measurement.e1 r3 = r7.A(r2)     // Catch:{ MalformedURLException -> 0x036f }
            java.lang.String r3 = r3.U2()     // Catch:{ MalformedURLException -> 0x036f }
        L_0x032e:
            com.google.android.gms.measurement.internal.h5 r4 = r1.f3223j     // Catch:{ MalformedURLException -> 0x036f }
            com.google.android.gms.measurement.internal.c4 r4 = r4.i()     // Catch:{ MalformedURLException -> 0x036f }
            com.google.android.gms.measurement.internal.e4 r4 = r4.M()     // Catch:{ MalformedURLException -> 0x036f }
            java.lang.String r7 = "Uploading data. app, uncompressed size, data"
            int r8 = r14.length     // Catch:{ MalformedURLException -> 0x036f }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ MalformedURLException -> 0x036f }
            r4.d(r7, r3, r8, r6)     // Catch:{ MalformedURLException -> 0x036f }
            r3 = 1
            r1.r = r3     // Catch:{ MalformedURLException -> 0x036f }
            com.google.android.gms.measurement.internal.g4 r11 = r17.X()     // Catch:{ MalformedURLException -> 0x036f }
            com.google.android.gms.measurement.internal.z9 r3 = new com.google.android.gms.measurement.internal.z9     // Catch:{ MalformedURLException -> 0x036f }
            r3.<init>(r1, r5)     // Catch:{ MalformedURLException -> 0x036f }
            r11.c()     // Catch:{ MalformedURLException -> 0x036f }
            r11.r()     // Catch:{ MalformedURLException -> 0x036f }
            com.google.android.gms.common.internal.r.k(r13)     // Catch:{ MalformedURLException -> 0x036f }
            com.google.android.gms.common.internal.r.k(r14)     // Catch:{ MalformedURLException -> 0x036f }
            com.google.android.gms.common.internal.r.k(r3)     // Catch:{ MalformedURLException -> 0x036f }
            com.google.android.gms.measurement.internal.a5 r4 = r11.a()     // Catch:{ MalformedURLException -> 0x036f }
            com.google.android.gms.measurement.internal.k4 r6 = new com.google.android.gms.measurement.internal.k4     // Catch:{ MalformedURLException -> 0x036f }
            r15 = 0
            r10 = r6
            r12 = r5
            r16 = r3
            r10.<init>(r11, r12, r13, r14, r15, r16)     // Catch:{ MalformedURLException -> 0x036f }
            r4.E(r6)     // Catch:{ MalformedURLException -> 0x036f }
            goto L_0x03a5
        L_0x036f:
            com.google.android.gms.measurement.internal.h5 r3 = r1.f3223j     // Catch:{ all -> 0x03ab }
            com.google.android.gms.measurement.internal.c4 r3 = r3.i()     // Catch:{ all -> 0x03ab }
            com.google.android.gms.measurement.internal.e4 r3 = r3.E()     // Catch:{ all -> 0x03ab }
            java.lang.String r4 = "Failed to parse upload URL. Not uploading. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.c4.w(r5)     // Catch:{ all -> 0x03ab }
            r3.c(r4, r5, r0)     // Catch:{ all -> 0x03ab }
            goto L_0x03a5
        L_0x0383:
            r1.x = r7     // Catch:{ all -> 0x03ab }
            com.google.android.gms.measurement.internal.d r0 = r17.Z()     // Catch:{ all -> 0x03ab }
            long r5 = com.google.android.gms.measurement.internal.wa.L()     // Catch:{ all -> 0x03ab }
            long r3 = r3 - r5
            java.lang.String r0 = r0.G(r3)     // Catch:{ all -> 0x03ab }
            boolean r3 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x03ab }
            if (r3 != 0) goto L_0x03a5
            com.google.android.gms.measurement.internal.d r3 = r17.Z()     // Catch:{ all -> 0x03ab }
            com.google.android.gms.measurement.internal.f4 r0 = r3.j0(r0)     // Catch:{ all -> 0x03ab }
            if (r0 == 0) goto L_0x03a5
            r1.r(r0)     // Catch:{ all -> 0x03ab }
        L_0x03a5:
            r1.s = r2
            r17.I()
            return
        L_0x03ab:
            r0 = move-exception
            r1.s = r2
            r17.I()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.x9.h0():void");
    }

    public final c4 i() {
        return this.f3223j.i();
    }

    /* access modifiers changed from: package-private */
    public final void i0() {
        n0();
        g0();
        if (!this.f3225l) {
            this.f3225l = true;
            if (J()) {
                int b2 = b(this.u);
                int G = this.f3223j.R().G();
                n0();
                if (b2 > G) {
                    this.f3223j.i().E().c("Panic: can't downgrade version. Previous, current version", Integer.valueOf(b2), Integer.valueOf(G));
                } else if (b2 >= G) {
                } else {
                    if (D(G, this.u)) {
                        this.f3223j.i().M().c("Storage version upgraded. Previous, current version", Integer.valueOf(b2), Integer.valueOf(G));
                    } else {
                        this.f3223j.i().E().c("Storage version upgrade failed. Previous, current version", Integer.valueOf(b2), Integer.valueOf(G));
                    }
                }
            }
        }
    }

    public final Context j() {
        return this.f3223j.j();
    }

    /* access modifiers changed from: package-private */
    public final void j0() {
        this.p++;
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    public final void k(int i2, Throwable th, byte[] bArr, String str) {
        d Z;
        n0();
        g0();
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } catch (Throwable th2) {
                this.r = false;
                I();
                throw th2;
            }
        }
        List<Long> list = this.v;
        this.v = null;
        boolean z2 = true;
        if ((i2 == 200 || i2 == 204) && th == null) {
            try {
                this.f3223j.x().f3025e.b(this.f3223j.f().b());
                this.f3223j.x().f3026f.b(0);
                H();
                this.f3223j.i().M().c("Successful upload. Got network response. code, size", Integer.valueOf(i2), Integer.valueOf(bArr.length));
                Z().t0();
                try {
                    for (Long next : list) {
                        try {
                            Z = Z();
                            long longValue = next.longValue();
                            Z.c();
                            Z.r();
                            if (Z.v().delete("queue", "rowid=?", new String[]{String.valueOf(longValue)}) != 1) {
                                throw new SQLiteException("Deleted fewer rows from queue than expected");
                            }
                        } catch (SQLiteException e2) {
                            Z.i().E().b("Failed to delete a bundle in a queue table", e2);
                            throw e2;
                        } catch (SQLiteException e3) {
                            if (this.w == null || !this.w.contains(next)) {
                                throw e3;
                            }
                        }
                    }
                    Z().u();
                    Z().y0();
                    this.w = null;
                    if (!X().x() || !G()) {
                        this.x = -1;
                        H();
                    } else {
                        h0();
                    }
                    this.f3226m = 0;
                } catch (Throwable th3) {
                    Z().y0();
                    throw th3;
                }
            } catch (SQLiteException e4) {
                this.f3223j.i().E().b("Database error while trying to delete uploaded bundles", e4);
                this.f3226m = this.f3223j.f().c();
                this.f3223j.i().M().b("Disable upload, time", Long.valueOf(this.f3226m));
            }
        } else {
            this.f3223j.i().M().c("Network upload failed. Will retry later. code, error", Integer.valueOf(i2), th);
            this.f3223j.x().f3026f.b(this.f3223j.f().b());
            if (i2 != 503) {
                if (i2 != 429) {
                    z2 = false;
                }
            }
            if (z2) {
                this.f3223j.x().f3027g.b(this.f3223j.f().b());
            }
            Z().Q(list);
            H();
        }
        this.r = false;
        I();
    }

    /* access modifiers changed from: package-private */
    public final h5 k0() {
        return this.f3223j;
    }

    public final va n() {
        return this.f3223j.n();
    }

    /* access modifiers changed from: package-private */
    public final void p(s sVar, la laVar) {
        List<ua> list;
        List<ua> list2;
        List<ua> list3;
        s sVar2 = sVar;
        la laVar2 = laVar;
        r.k(laVar);
        r.g(laVar2.f2956g);
        n0();
        g0();
        String str = laVar2.f2956g;
        long j2 = sVar2.f3084j;
        d0();
        if (ba.R(sVar, laVar)) {
            if (!laVar2.f2963n) {
                U(laVar2);
                return;
            }
            List<String> list4 = laVar2.A;
            if (list4 != null) {
                if (list4.contains(sVar2.f3081g)) {
                    Bundle o2 = sVar2.f3082h.o();
                    o2.putLong("ga_safelisted", 1);
                    sVar2 = new s(sVar2.f3081g, new n(o2), sVar2.f3083i, sVar2.f3084j);
                } else {
                    this.f3223j.i().L().d("Dropping non-safelisted event. appId, event name, origin", str, sVar2.f3081g, sVar2.f3083i);
                    return;
                }
            }
            Z().t0();
            try {
                d Z = Z();
                r.g(str);
                Z.c();
                Z.r();
                int i2 = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
                if (i2 < 0) {
                    Z.i().H().c("Invalid time querying timed out conditional properties", c4.w(str), Long.valueOf(j2));
                    list = Collections.emptyList();
                } else {
                    list = Z.L("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str, String.valueOf(j2)});
                }
                for (ua next : list) {
                    if (next != null) {
                        this.f3223j.i().M().d("User property timed out", next.f3163g, this.f3223j.H().z(next.f3165i.f2823h), next.f3165i.l());
                        if (next.f3169m != null) {
                            W(new s(next.f3169m, j2), laVar2);
                        }
                        Z().r0(str, next.f3165i.f2823h);
                    }
                }
                d Z2 = Z();
                r.g(str);
                Z2.c();
                Z2.r();
                if (i2 < 0) {
                    Z2.i().H().c("Invalid time querying expired conditional properties", c4.w(str), Long.valueOf(j2));
                    list2 = Collections.emptyList();
                } else {
                    list2 = Z2.L("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str, String.valueOf(j2)});
                }
                ArrayList arrayList = new ArrayList(list2.size());
                for (ua next2 : list2) {
                    if (next2 != null) {
                        this.f3223j.i().M().d("User property expired", next2.f3163g, this.f3223j.H().z(next2.f3165i.f2823h), next2.f3165i.l());
                        Z().l0(str, next2.f3165i.f2823h);
                        if (next2.q != null) {
                            arrayList.add(next2.q);
                        }
                        Z().r0(str, next2.f3165i.f2823h);
                    }
                }
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    W(new s((s) obj, j2), laVar2);
                }
                d Z3 = Z();
                String str2 = sVar2.f3081g;
                r.g(str);
                r.g(str2);
                Z3.c();
                Z3.r();
                if (i2 < 0) {
                    Z3.i().H().d("Invalid time querying triggered conditional properties", c4.w(str), Z3.e().v(str2), Long.valueOf(j2));
                    list3 = Collections.emptyList();
                } else {
                    list3 = Z3.L("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str, str2, String.valueOf(j2)});
                }
                ArrayList arrayList2 = new ArrayList(list3.size());
                for (ua next3 : list3) {
                    if (next3 != null) {
                        ea eaVar = next3.f3165i;
                        ga gaVar = r4;
                        ga gaVar2 = new ga(next3.f3163g, next3.f3164h, eaVar.f2823h, j2, eaVar.l());
                        if (Z().T(gaVar)) {
                            this.f3223j.i().M().d("User property triggered", next3.f3163g, this.f3223j.H().z(gaVar.c), gaVar.f2866e);
                        } else {
                            this.f3223j.i().E().d("Too many active user properties, ignoring", c4.w(next3.f3163g), this.f3223j.H().z(gaVar.c), gaVar.f2866e);
                        }
                        if (next3.o != null) {
                            arrayList2.add(next3.o);
                        }
                        next3.f3165i = new ea(gaVar);
                        next3.f3167k = true;
                        Z().U(next3);
                    }
                }
                W(sVar2, laVar2);
                int size2 = arrayList2.size();
                int i4 = 0;
                while (i4 < size2) {
                    Object obj2 = arrayList2.get(i4);
                    i4++;
                    W(new s((s) obj2, j2), laVar2);
                }
                Z().u();
            } finally {
                Z().y0();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00df  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void q(com.google.android.gms.measurement.internal.s r36, java.lang.String r37) {
        /*
            r35 = this;
            r0 = r35
            r1 = r36
            r3 = r37
            com.google.android.gms.measurement.internal.d r2 = r35.Z()
            com.google.android.gms.measurement.internal.f4 r2 = r2.j0(r3)
            if (r2 == 0) goto L_0x0112
            java.lang.String r4 = r2.T()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L_0x001c
            goto L_0x0112
        L_0x001c:
            java.lang.Boolean r4 = r0.M(r2)
            if (r4 != 0) goto L_0x0040
            java.lang.String r4 = r1.f3081g
            java.lang.String r5 = "_ui"
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L_0x005a
            com.google.android.gms.measurement.internal.h5 r4 = r0.f3223j
            com.google.android.gms.measurement.internal.c4 r4 = r4.i()
            com.google.android.gms.measurement.internal.e4 r4 = r4.H()
            java.lang.Object r5 = com.google.android.gms.measurement.internal.c4.w(r37)
            java.lang.String r6 = "Could not find package. appId"
            r4.b(r6, r5)
            goto L_0x005a
        L_0x0040:
            boolean r4 = r4.booleanValue()
            if (r4 != 0) goto L_0x005a
            com.google.android.gms.measurement.internal.h5 r1 = r0.f3223j
            com.google.android.gms.measurement.internal.c4 r1 = r1.i()
            com.google.android.gms.measurement.internal.e4 r1 = r1.E()
            java.lang.Object r2 = com.google.android.gms.measurement.internal.c4.w(r37)
            java.lang.String r3 = "App version does not match; dropping event. appId"
            r1.b(r3, r2)
            return
        L_0x005a:
            com.google.android.gms.measurement.internal.la r15 = new com.google.android.gms.measurement.internal.la
            java.lang.String r4 = r2.A()
            java.lang.String r5 = r2.T()
            long r6 = r2.V()
            java.lang.String r8 = r2.X()
            long r9 = r2.Z()
            long r11 = r2.b0()
            boolean r14 = r2.e0()
            r16 = 0
            java.lang.String r17 = r2.M()
            long r18 = r2.k()
            r20 = 0
            r22 = 0
            boolean r23 = r2.l()
            boolean r24 = r2.m()
            r25 = 0
            java.lang.String r26 = r2.D()
            java.lang.Boolean r27 = r2.n()
            long r28 = r2.d0()
            java.util.List r30 = r2.o()
            boolean r31 = com.google.android.gms.internal.measurement.vc.a()
            if (r31 == 0) goto L_0x00bf
            com.google.android.gms.measurement.internal.h5 r13 = r0.f3223j
            com.google.android.gms.measurement.internal.wa r13 = r13.c()
            java.lang.String r1 = r2.t()
            r32 = r14
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r14 = com.google.android.gms.measurement.internal.u.k0
            boolean r1 = r13.C(r1, r14)
            if (r1 == 0) goto L_0x00c1
            java.lang.String r1 = r2.G()
            goto L_0x00c2
        L_0x00bf:
            r32 = r14
        L_0x00c1:
            r1 = 0
        L_0x00c2:
            boolean r2 = com.google.android.gms.internal.measurement.fb.a()
            if (r2 == 0) goto L_0x00df
            com.google.android.gms.measurement.internal.h5 r2 = r0.f3223j
            com.google.android.gms.measurement.internal.wa r2 = r2.c()
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r13 = com.google.android.gms.measurement.internal.u.Q0
            boolean r2 = r2.s(r13)
            if (r2 == 0) goto L_0x00df
            com.google.android.gms.measurement.internal.e r2 = r0.c(r3)
            java.lang.String r2 = r2.e()
            goto L_0x00e1
        L_0x00df:
            java.lang.String r2 = ""
        L_0x00e1:
            r33 = r2
            r2 = r15
            r3 = r37
            r13 = 0
            r14 = r32
            r34 = r15
            r15 = r16
            r16 = r17
            r17 = r18
            r19 = r20
            r21 = r22
            r22 = r23
            r23 = r24
            r24 = r25
            r25 = r26
            r26 = r27
            r27 = r28
            r29 = r30
            r30 = r1
            r31 = r33
            r2.<init>((java.lang.String) r3, (java.lang.String) r4, (java.lang.String) r5, (long) r6, (java.lang.String) r8, (long) r9, (long) r11, (java.lang.String) r13, (boolean) r14, (boolean) r15, (java.lang.String) r16, (long) r17, (long) r19, (int) r21, (boolean) r22, (boolean) r23, (boolean) r24, (java.lang.String) r25, (java.lang.Boolean) r26, (long) r27, (java.util.List<java.lang.String>) r29, (java.lang.String) r30, (java.lang.String) r31)
            r1 = r36
            r2 = r34
            r0.O(r1, r2)
            return
        L_0x0112:
            com.google.android.gms.measurement.internal.h5 r1 = r0.f3223j
            com.google.android.gms.measurement.internal.c4 r1 = r1.i()
            com.google.android.gms.measurement.internal.e4 r1 = r1.L()
            java.lang.String r2 = "No app data available; dropping event"
            r1.b(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.x9.q(com.google.android.gms.measurement.internal.s, java.lang.String):void");
    }

    /* access modifiers changed from: package-private */
    public final void s(u9 u9Var) {
        this.o++;
    }

    /* access modifiers changed from: package-private */
    public final void v(ea eaVar, la laVar) {
        n0();
        g0();
        if (a0(laVar)) {
            if (!laVar.f2963n) {
                U(laVar);
                return;
            }
            int p0 = this.f3223j.G().p0(eaVar.f2823h);
            if (p0 != 0) {
                this.f3223j.G();
                String H = fa.H(eaVar.f2823h, 24, true);
                String str = eaVar.f2823h;
                this.f3223j.G().W(laVar.f2956g, p0, "_ev", H, str != null ? str.length() : 0);
                return;
            }
            int q0 = this.f3223j.G().q0(eaVar.f2823h, eaVar.l());
            if (q0 != 0) {
                this.f3223j.G();
                String H2 = fa.H(eaVar.f2823h, 24, true);
                Object l2 = eaVar.l();
                this.f3223j.G().W(laVar.f2956g, q0, "_ev", H2, (l2 == null || (!(l2 instanceof String) && !(l2 instanceof CharSequence))) ? 0 : String.valueOf(l2).length());
                return;
            }
            Object y0 = this.f3223j.G().y0(eaVar.f2823h, eaVar.l());
            if (y0 != null) {
                if ("_sid".equals(eaVar.f2823h)) {
                    long j2 = eaVar.f2824i;
                    String str2 = eaVar.f2827l;
                    long j3 = 0;
                    ga o0 = Z().o0(laVar.f2956g, "_sno");
                    if (o0 != null) {
                        Object obj = o0.f2866e;
                        if (obj instanceof Long) {
                            j3 = ((Long) obj).longValue();
                            v(new ea("_sno", j2, Long.valueOf(j3 + 1), str2), laVar);
                        }
                    }
                    if (o0 != null) {
                        this.f3223j.i().H().b("Retrieved last session number from database does not contain a valid (long) value", o0.f2866e);
                    }
                    o D = Z().D(laVar.f2956g, "_s");
                    if (D != null) {
                        j3 = D.c;
                        this.f3223j.i().M().b("Backfill the session number. Last used session number", Long.valueOf(j3));
                    }
                    v(new ea("_sno", j2, Long.valueOf(j3 + 1), str2), laVar);
                }
                ga gaVar = new ga(laVar.f2956g, eaVar.f2827l, eaVar.f2823h, eaVar.f2824i, y0);
                this.f3223j.i().M().c("Setting user property", this.f3223j.H().z(gaVar.c), y0);
                Z().t0();
                try {
                    U(laVar);
                    boolean T = Z().T(gaVar);
                    Z().u();
                    if (!T) {
                        this.f3223j.i().E().c("Too many unique user properties are set. Ignoring user property", this.f3223j.H().z(gaVar.c), gaVar.f2866e);
                        this.f3223j.G().W(laVar.f2956g, 9, (String) null, (String) null, 0);
                    }
                } finally {
                    Z().y0();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void w(la laVar) {
        if (this.v != null) {
            ArrayList arrayList = new ArrayList();
            this.w = arrayList;
            arrayList.addAll(this.v);
        }
        d Z = Z();
        String str = laVar.f2956g;
        r.g(str);
        Z.c();
        Z.r();
        try {
            SQLiteDatabase v2 = Z.v();
            String[] strArr = {str};
            int delete = v2.delete("apps", "app_id=?", strArr) + 0 + v2.delete("events", "app_id=?", strArr) + v2.delete("user_attributes", "app_id=?", strArr) + v2.delete("conditional_properties", "app_id=?", strArr) + v2.delete("raw_events", "app_id=?", strArr) + v2.delete("raw_events_metadata", "app_id=?", strArr) + v2.delete("queue", "app_id=?", strArr) + v2.delete("audience_filter_values", "app_id=?", strArr) + v2.delete("main_event_params", "app_id=?", strArr) + v2.delete("default_event_params", "app_id=?", strArr);
            if (delete > 0) {
                Z.i().M().c("Reset analytics data. app, records", str, Integer.valueOf(delete));
            }
        } catch (SQLiteException e2) {
            Z.i().E().c("Error resetting analytics data. appId, error", c4.w(str), e2);
        }
        if (laVar.f2963n) {
            R(laVar);
        }
    }

    /* access modifiers changed from: package-private */
    public final void x(ua uaVar) {
        la K = K(uaVar.f3163g);
        if (K != null) {
            y(uaVar, K);
        }
    }

    /* access modifiers changed from: package-private */
    public final void y(ua uaVar, la laVar) {
        r.k(uaVar);
        r.g(uaVar.f3163g);
        r.k(uaVar.f3164h);
        r.k(uaVar.f3165i);
        r.g(uaVar.f3165i.f2823h);
        n0();
        g0();
        if (a0(laVar)) {
            if (!laVar.f2963n) {
                U(laVar);
                return;
            }
            ua uaVar2 = new ua(uaVar);
            boolean z2 = false;
            uaVar2.f3167k = false;
            Z().t0();
            try {
                ua p0 = Z().p0(uaVar2.f3163g, uaVar2.f3165i.f2823h);
                if (p0 != null && !p0.f3164h.equals(uaVar2.f3164h)) {
                    this.f3223j.i().H().d("Updating a conditional user property with different origin. name, origin, origin (from DB)", this.f3223j.H().z(uaVar2.f3165i.f2823h), uaVar2.f3164h, p0.f3164h);
                }
                if (p0 != null && p0.f3167k) {
                    uaVar2.f3164h = p0.f3164h;
                    uaVar2.f3166j = p0.f3166j;
                    uaVar2.f3170n = p0.f3170n;
                    uaVar2.f3168l = p0.f3168l;
                    uaVar2.o = p0.o;
                    uaVar2.f3167k = p0.f3167k;
                    uaVar2.f3165i = new ea(uaVar2.f3165i.f2823h, p0.f3165i.f2824i, uaVar2.f3165i.l(), p0.f3165i.f2827l);
                } else if (TextUtils.isEmpty(uaVar2.f3168l)) {
                    uaVar2.f3165i = new ea(uaVar2.f3165i.f2823h, uaVar2.f3166j, uaVar2.f3165i.l(), uaVar2.f3165i.f2827l);
                    uaVar2.f3167k = true;
                    z2 = true;
                }
                if (uaVar2.f3167k) {
                    ea eaVar = uaVar2.f3165i;
                    ga gaVar = new ga(uaVar2.f3163g, uaVar2.f3164h, eaVar.f2823h, eaVar.f2824i, eaVar.l());
                    if (Z().T(gaVar)) {
                        this.f3223j.i().L().d("User property updated immediately", uaVar2.f3163g, this.f3223j.H().z(gaVar.c), gaVar.f2866e);
                    } else {
                        this.f3223j.i().E().d("(2)Too many active user properties, ignoring", c4.w(uaVar2.f3163g), this.f3223j.H().z(gaVar.c), gaVar.f2866e);
                    }
                    if (z2 && uaVar2.o != null) {
                        W(new s(uaVar2.o, uaVar2.f3166j), laVar);
                    }
                }
                if (Z().U(uaVar2)) {
                    this.f3223j.i().L().d("Conditional property added", uaVar2.f3163g, this.f3223j.H().z(uaVar2.f3165i.f2823h), uaVar2.f3165i.l());
                } else {
                    this.f3223j.i().E().d("Too many conditional properties, ignoring", c4.w(uaVar2.f3163g), this.f3223j.H().z(uaVar2.f3165i.f2823h), uaVar2.f3165i.l());
                }
                Z().u();
            } finally {
                Z().y0();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void z(Runnable runnable) {
        n0();
        if (this.f3227n == null) {
            this.f3227n = new ArrayList();
        }
        this.f3227n.add(runnable);
    }

    private x9(ca caVar, h5 h5Var) {
        this.f3224k = false;
        r.k(caVar);
        this.f3223j = h5.b(caVar.a, (f) null, (Long) null);
        this.x = -1;
        ba baVar = new ba(this);
        baVar.s();
        this.f3220g = baVar;
        g4 g4Var = new g4(this);
        g4Var.s();
        this.b = g4Var;
        b5 b5Var = new b5(this);
        b5Var.s();
        this.a = b5Var;
        this.y = new HashMap();
        this.f3223j.a().y(new w9(this, caVar));
    }
}
