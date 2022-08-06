package de.baimos;

import de.baimos.blueid.sdk.data.d;
import de.baimos.blueid.sdk.metrics.AndroidSdkMetrics;

public class as {
    private static final dr a = ds.a(as.class);
    private final AndroidSdkMetrics b;
    private an c;

    /* renamed from: d  reason: collision with root package name */
    private ap f8195d;

    /* renamed from: e  reason: collision with root package name */
    private ao f8196e;

    /* renamed from: f  reason: collision with root package name */
    private d f8197f;

    /* renamed from: de.baimos.as$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                de.baimos.blueid.sdk.api.Channel$ChannelStatus[] r0 = de.baimos.blueid.sdk.api.Channel.ChannelStatus.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                de.baimos.blueid.sdk.api.Channel$ChannelStatus r1 = de.baimos.blueid.sdk.api.Channel.ChannelStatus.NOT_SUPPORTED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001d }
                de.baimos.blueid.sdk.api.Channel$ChannelStatus r1 = de.baimos.blueid.sdk.api.Channel.ChannelStatus.NOT_AUTHORIZED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0028 }
                de.baimos.blueid.sdk.api.Channel$ChannelStatus r1 = de.baimos.blueid.sdk.api.Channel.ChannelStatus.NOT_ENABLED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: de.baimos.as.AnonymousClass1.<clinit>():void");
        }
    }

    public as(an anVar, ap apVar, ao aoVar, d dVar, AndroidSdkMetrics androidSdkMetrics) {
        this.c = anVar;
        this.f8195d = apVar;
        this.f8196e = aoVar;
        this.f8197f = dVar;
        this.b = androidSdkMetrics;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v12, resolved type: de.baimos.blueid.sdk.api.SecuredObject} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: de.baimos.blueid.sdk.data.b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0272  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x01b1 A[Catch:{ RemoteException -> 0x01f6, aq -> 0x01f2, IOException -> 0x01ef, Exception -> 0x01ec, all -> 0x01e8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x01c1  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01e2 A[SYNTHETIC, Splitter:B:63:0x01e2] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0214 A[Catch:{ RemoteException -> 0x026e, aq -> 0x026c, IOException -> 0x0205, Exception -> 0x01fc, all -> 0x01fa }] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0215 A[Catch:{ RemoteException -> 0x026e, aq -> 0x026c, IOException -> 0x0205, Exception -> 0x01fc, all -> 0x01fa }] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0244 A[Catch:{ RemoteException -> 0x026e, aq -> 0x026c, IOException -> 0x0205, Exception -> 0x01fc, all -> 0x01fa }] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0264 A[Catch:{ RemoteException -> 0x026e, aq -> 0x026c, IOException -> 0x0205, Exception -> 0x01fc, all -> 0x01fa }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public de.baimos.blueid.sdk.api.CommandExecutionResponse a(de.baimos.blueid.sdk.api.SecuredObject r19, de.baimos.blueid.sdk.api.Channel r20, de.baimos.blueid.sdk.api.Command r21, byte[] r22, de.baimos.blueid.sdk.conn.SdkClientFactory r23, java.util.List<de.baimos.core.util.filter.ConnectionFilter> r24) {
        /*
            r18 = this;
            r1 = r18
            r0 = r20
            r2 = r21
            r3 = r23
            java.lang.String r4 = "de.baimos.blueid.sdk.forceSniffingFilter"
            java.lang.String r5 = "true"
            long r6 = java.lang.System.currentTimeMillis()
            if (r19 == 0) goto L_0x02d5
            java.lang.String r8 = r19.getId()
            boolean r9 = de.baimos.cs.a(r8)
            if (r9 != 0) goto L_0x02cd
            de.baimos.ap r9 = r1.f8195d
            java.util.List r9 = r9.g()
            java.util.Iterator r9 = r9.iterator()
            r10 = 0
            r11 = r10
        L_0x0028:
            boolean r12 = r9.hasNext()
            if (r12 == 0) goto L_0x0042
            java.lang.Object r12 = r9.next()
            de.baimos.blueid.sdk.api.SecuredObject r12 = (de.baimos.blueid.sdk.api.SecuredObject) r12
            java.lang.String r13 = r12.getId()
            boolean r13 = r13.equals(r8)
            if (r13 == 0) goto L_0x0028
            r11 = r12
            de.baimos.blueid.sdk.data.b r11 = (de.baimos.blueid.sdk.data.b) r11
            goto L_0x0028
        L_0x0042:
            if (r11 == 0) goto L_0x02c5
            if (r0 == 0) goto L_0x02bd
            if (r2 == 0) goto L_0x02b5
            if (r3 == 0) goto L_0x02ad
            java.util.Set r8 = r11.getChannelsForCommand(r2)
            de.baimos.dr r9 = a
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "available channels: "
            r12.append(r13)
            r12.append(r8)
            java.lang.String r12 = r12.toString()
            r9.d(r12)
            de.baimos.dr r9 = a
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "selected channel: "
            r12.append(r13)
            r12.append(r0)
            java.lang.String r12 = r12.toString()
            r9.d(r12)
            if (r8 == 0) goto L_0x02a3
            boolean r9 = r8.isEmpty()
            if (r9 != 0) goto L_0x02a3
            boolean r8 = r8.contains(r0)
            if (r8 == 0) goto L_0x02a3
            java.lang.String r8 = r11.a((de.baimos.blueid.sdk.api.Channel) r0)
            de.baimos.dr r9 = a
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "securedObjectUrl = "
            r12.append(r13)
            r12.append(r8)
            java.lang.String r12 = r12.toString()
            r9.d(r12)
            de.baimos.blueid.sdk.api.Channel$ChannelStatus r9 = r20.getChannelStatus()
            int[] r12 = de.baimos.as.AnonymousClass1.a
            int r9 = r9.ordinal()
            r9 = r12[r9]
            r12 = 1
            if (r9 == r12) goto L_0x029d
            r13 = 2
            if (r9 == r13) goto L_0x0297
            r13 = 3
            if (r9 == r13) goto L_0x0291
            de.baimos.blueid.sdk.data.a r9 = new de.baimos.blueid.sdk.data.a
            r9.<init>()
            de.baimos.bp r8 = r3.b(r8)
            de.baimos.dr r13 = a
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "client = "
            r14.append(r15)
            r14.append(r8)
            java.lang.String r14 = r14.toString()
            r13.d(r14)
            boolean r13 = r8 instanceof de.baimos.a
            if (r13 == 0) goto L_0x00e0
            r13 = r8
            de.baimos.a r13 = (de.baimos.a) r13
            r13.a(r0)
        L_0x00e0:
            boolean r13 = r8 instanceof de.baimos.b
            if (r13 == 0) goto L_0x00ec
            r13 = r8
            de.baimos.b r13 = (de.baimos.b) r13
            de.baimos.blueid.sdk.metrics.AndroidSdkMetrics r14 = r1.b
            r13.a(r14)
        L_0x00ec:
            r13 = 10000(0x2710, double:4.9407E-320)
            r8.a((long) r13)
            if (r24 == 0) goto L_0x0107
            java.util.Iterator r13 = r24.iterator()
        L_0x00f7:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L_0x0107
            java.lang.Object r14 = r13.next()
            de.baimos.core.util.filter.ConnectionFilter r14 = (de.baimos.core.util.filter.ConnectionFilter) r14
            r8.a((de.baimos.core.util.filter.ConnectionFilter) r14)
            goto L_0x00f7
        L_0x0107:
            de.baimos.blueid.sdk.conn.c r13 = new de.baimos.blueid.sdk.conn.c
            r13.<init>()
            r8.a((de.baimos.core.util.filter.ConnectionFilter) r13)
            de.baimos.blueid.sdk.conn.a r14 = new de.baimos.blueid.sdk.conn.a
            r14.<init>(r9)
            r8.a((de.baimos.core.util.filter.ConnectionFilter) r14)
            de.baimos.blueid.sdk.conn.b r14 = new de.baimos.blueid.sdk.conn.b
            r14.<init>(r3)
            r8.a((de.baimos.core.util.filter.ConnectionFilter) r14)
            de.baimos.dr r3 = a     // Catch:{ RemoteException -> 0x026e, aq -> 0x026c, IOException -> 0x0205, Exception -> 0x01fc }
            java.lang.String r14 = "open connection"
            r3.d(r14)     // Catch:{ RemoteException -> 0x026e, aq -> 0x026c, IOException -> 0x0205, Exception -> 0x01fc }
            de.baimos.cm r3 = r8.h()     // Catch:{ RemoteException -> 0x026e, aq -> 0x026c, IOException -> 0x0205, Exception -> 0x01fc }
            de.baimos.core.util.filter.b r3 = (de.baimos.core.util.filter.b) r3     // Catch:{ RemoteException -> 0x026e, aq -> 0x026c, IOException -> 0x0205, Exception -> 0x01fc }
            java.lang.String r10 = r21.getId()     // Catch:{ RemoteException -> 0x01f6, aq -> 0x01f2, IOException -> 0x01ef, Exception -> 0x01ec, all -> 0x01e8 }
            java.lang.String r14 = "time"
            boolean r10 = r10.equals(r14)     // Catch:{ RemoteException -> 0x01f6, aq -> 0x01f2, IOException -> 0x01ef, Exception -> 0x01ec, all -> 0x01e8 }
            if (r10 == 0) goto L_0x0158
            if (r22 != 0) goto L_0x0151
            r10 = 4
            java.nio.ByteBuffer r10 = java.nio.ByteBuffer.allocate(r10)     // Catch:{ RemoteException -> 0x01f6, aq -> 0x01f2, IOException -> 0x01ef, Exception -> 0x01ec, all -> 0x01e8 }
            long r14 = java.lang.System.currentTimeMillis()     // Catch:{ RemoteException -> 0x01f6, aq -> 0x01f2, IOException -> 0x01ef, Exception -> 0x01ec, all -> 0x01e8 }
            r16 = 1000(0x3e8, double:4.94E-321)
            long r14 = r14 / r16
            int r15 = (int) r14     // Catch:{ RemoteException -> 0x01f6, aq -> 0x01f2, IOException -> 0x01ef, Exception -> 0x01ec, all -> 0x01e8 }
            java.nio.ByteBuffer r10 = r10.putInt(r15)     // Catch:{ RemoteException -> 0x01f6, aq -> 0x01f2, IOException -> 0x01ef, Exception -> 0x01ec, all -> 0x01e8 }
            byte[] r10 = r10.array()     // Catch:{ RemoteException -> 0x01f6, aq -> 0x01f2, IOException -> 0x01ef, Exception -> 0x01ec, all -> 0x01e8 }
            goto L_0x015a
        L_0x0151:
            de.baimos.dr r10 = a     // Catch:{ RemoteException -> 0x01f6, aq -> 0x01f2, IOException -> 0x01ef, Exception -> 0x01ec, all -> 0x01e8 }
            java.lang.String r14 = "Parameter for time command already set! The SDK sets it automatically to the correct value if you don't set the parameter!"
            r10.b(r14)     // Catch:{ RemoteException -> 0x01f6, aq -> 0x01f2, IOException -> 0x01ef, Exception -> 0x01ec, all -> 0x01e8 }
        L_0x0158:
            r10 = r22
        L_0x015a:
            long r14 = java.lang.System.currentTimeMillis()     // Catch:{ RemoteException -> 0x01f6, aq -> 0x01f2, IOException -> 0x01ef, Exception -> 0x01ec, all -> 0x01e8 }
            long r14 = r14 - r6
            r9.a((long) r14)     // Catch:{ RemoteException -> 0x01f6, aq -> 0x01f2, IOException -> 0x01ef, Exception -> 0x01ec, all -> 0x01e8 }
            de.baimos.dr r6 = a     // Catch:{ RemoteException -> 0x01f6, aq -> 0x01f2, IOException -> 0x01ef, Exception -> 0x01ec, all -> 0x01e8 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ RemoteException -> 0x01f6, aq -> 0x01f2, IOException -> 0x01ef, Exception -> 0x01ec, all -> 0x01e8 }
            r7.<init>()     // Catch:{ RemoteException -> 0x01f6, aq -> 0x01f2, IOException -> 0x01ef, Exception -> 0x01ec, all -> 0x01e8 }
            java.lang.String r14 = "connection opened in "
            r7.append(r14)     // Catch:{ RemoteException -> 0x01f6, aq -> 0x01f2, IOException -> 0x01ef, Exception -> 0x01ec, all -> 0x01e8 }
            long r14 = r9.c()     // Catch:{ RemoteException -> 0x01f6, aq -> 0x01f2, IOException -> 0x01ef, Exception -> 0x01ec, all -> 0x01e8 }
            r7.append(r14)     // Catch:{ RemoteException -> 0x01f6, aq -> 0x01f2, IOException -> 0x01ef, Exception -> 0x01ec, all -> 0x01e8 }
            java.lang.String r14 = "ms"
            r7.append(r14)     // Catch:{ RemoteException -> 0x01f6, aq -> 0x01f2, IOException -> 0x01ef, Exception -> 0x01ec, all -> 0x01e8 }
            java.lang.String r7 = r7.toString()     // Catch:{ RemoteException -> 0x01f6, aq -> 0x01f2, IOException -> 0x01ef, Exception -> 0x01ec, all -> 0x01e8 }
            r6.c(r7)     // Catch:{ RemoteException -> 0x01f6, aq -> 0x01f2, IOException -> 0x01ef, Exception -> 0x01ec, all -> 0x01e8 }
            java.lang.String r6 = "client"
            r3.a((java.lang.String) r6, (java.lang.Object) r8)     // Catch:{ RemoteException -> 0x01f6, aq -> 0x01f2, IOException -> 0x01ef, Exception -> 0x01ec, all -> 0x01e8 }
            java.lang.String r6 = "command"
            r3.a((java.lang.String) r6, (java.lang.Object) r2)     // Catch:{ RemoteException -> 0x01f6, aq -> 0x01f2, IOException -> 0x01ef, Exception -> 0x01ec, all -> 0x01e8 }
            java.lang.String r2 = "channel"
            r3.a((java.lang.String) r2, (java.lang.Object) r0)     // Catch:{ RemoteException -> 0x01f6, aq -> 0x01f2, IOException -> 0x01ef, Exception -> 0x01ec, all -> 0x01e8 }
            java.lang.String r0 = "keyStore"
            de.baimos.an r2 = r1.c     // Catch:{ RemoteException -> 0x01f6, aq -> 0x01f2, IOException -> 0x01ef, Exception -> 0x01ec, all -> 0x01e8 }
            r3.a((java.lang.String) r0, (java.lang.Object) r2)     // Catch:{ RemoteException -> 0x01f6, aq -> 0x01f2, IOException -> 0x01ef, Exception -> 0x01ec, all -> 0x01e8 }
            java.lang.String r0 = "securedObject"
            r3.a((java.lang.String) r0, (java.lang.Object) r11)     // Catch:{ RemoteException -> 0x01f6, aq -> 0x01f2, IOException -> 0x01ef, Exception -> 0x01ec, all -> 0x01e8 }
            java.lang.String r0 = "commandExecutionResponse"
            r3.a((java.lang.String) r0, (java.lang.Object) r9)     // Catch:{ RemoteException -> 0x01f6, aq -> 0x01f2, IOException -> 0x01ef, Exception -> 0x01ec, all -> 0x01e8 }
            java.lang.String r0 = "parameter"
            r3.a((java.lang.String) r0, (java.lang.Object) r10)     // Catch:{ RemoteException -> 0x01f6, aq -> 0x01f2, IOException -> 0x01ef, Exception -> 0x01ec, all -> 0x01e8 }
            java.lang.String r0 = "revocationDatabase"
            de.baimos.ao r2 = r1.f8196e     // Catch:{ RemoteException -> 0x01f6, aq -> 0x01f2, IOException -> 0x01ef, Exception -> 0x01ec, all -> 0x01e8 }
            r3.a((java.lang.String) r0, (java.lang.Object) r2)     // Catch:{ RemoteException -> 0x01f6, aq -> 0x01f2, IOException -> 0x01ef, Exception -> 0x01ec, all -> 0x01e8 }
            de.baimos.blueid.sdk.data.d r0 = r1.f8197f     // Catch:{ RemoteException -> 0x01f6, aq -> 0x01f2, IOException -> 0x01ef, Exception -> 0x01ec, all -> 0x01e8 }
            if (r0 == 0) goto L_0x01b8
            java.lang.String r0 = "revocationDataListener"
            de.baimos.blueid.sdk.data.d r2 = r1.f8197f     // Catch:{ RemoteException -> 0x01f6, aq -> 0x01f2, IOException -> 0x01ef, Exception -> 0x01ec, all -> 0x01e8 }
            r3.a((java.lang.String) r0, (java.lang.Object) r2)     // Catch:{ RemoteException -> 0x01f6, aq -> 0x01f2, IOException -> 0x01ef, Exception -> 0x01ec, all -> 0x01e8 }
        L_0x01b8:
            r3.e()     // Catch:{ RemoteException -> 0x01f6, aq -> 0x01f2, IOException -> 0x01ef, Exception -> 0x01ec, all -> 0x01e8 }
            int r0 = r9.b()     // Catch:{ RemoteException -> 0x01f6, aq -> 0x01f2, IOException -> 0x01ef, Exception -> 0x01ec, all -> 0x01e8 }
            if (r0 != 0) goto L_0x01e2
            if (r3 == 0) goto L_0x01c6
            r3.d()
        L_0x01c6:
            int r0 = r9.b()
            if (r0 != 0) goto L_0x01dc
            int r0 = r9.getResponseCode()
            if (r0 != 0) goto L_0x01dc
            java.lang.String r0 = java.lang.System.getProperty(r4)
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x01e1
        L_0x01dc:
            de.baimos.blueid.sdk.metrics.AndroidSdkMetrics r0 = r1.b
            r13.a((de.baimos.blueid.sdk.metrics.AndroidSdkMetrics) r0)
        L_0x01e1:
            return r9
        L_0x01e2:
            de.baimos.aq r2 = new de.baimos.aq     // Catch:{ RemoteException -> 0x01f6, aq -> 0x01f2, IOException -> 0x01ef, Exception -> 0x01ec, all -> 0x01e8 }
            r2.<init>(r0)     // Catch:{ RemoteException -> 0x01f6, aq -> 0x01f2, IOException -> 0x01ef, Exception -> 0x01ec, all -> 0x01e8 }
            throw r2     // Catch:{ RemoteException -> 0x01f6, aq -> 0x01f2, IOException -> 0x01ef, Exception -> 0x01ec, all -> 0x01e8 }
        L_0x01e8:
            r0 = move-exception
            r10 = r3
            goto L_0x0270
        L_0x01ec:
            r0 = move-exception
            r10 = r3
            goto L_0x01fd
        L_0x01ef:
            r0 = move-exception
            r10 = r3
            goto L_0x0206
        L_0x01f2:
            r0 = move-exception
            r10 = r3
            goto L_0x026d
        L_0x01f6:
            r0 = move-exception
            r10 = r3
            goto L_0x026f
        L_0x01fa:
            r0 = move-exception
            goto L_0x0270
        L_0x01fc:
            r0 = move-exception
        L_0x01fd:
            de.baimos.blueid.sdk.api.exceptions.RemoteException r2 = new de.baimos.blueid.sdk.api.exceptions.RemoteException     // Catch:{ all -> 0x01fa }
            java.lang.String r3 = "Unexpected exception"
            r2.<init>(r3, r0)     // Catch:{ all -> 0x01fa }
            throw r2     // Catch:{ all -> 0x01fa }
        L_0x0205:
            r0 = move-exception
        L_0x0206:
            boolean r2 = r0 instanceof java.net.SocketTimeoutException     // Catch:{ all -> 0x01fa }
            boolean r3 = r8 instanceof de.baimos.bn     // Catch:{ all -> 0x01fa }
            if (r3 == 0) goto L_0x0215
            de.baimos.bn r8 = (de.baimos.bn) r8     // Catch:{ all -> 0x01fa }
            boolean r3 = r8.f()     // Catch:{ all -> 0x01fa }
            if (r3 == 0) goto L_0x0215
            goto L_0x0216
        L_0x0215:
            r12 = 0
        L_0x0216:
            de.baimos.dr r3 = a     // Catch:{ all -> 0x01fa }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x01fa }
            r6.<init>()     // Catch:{ all -> 0x01fa }
            java.lang.String r7 = "timeout exception: "
            r6.append(r7)     // Catch:{ all -> 0x01fa }
            r6.append(r2)     // Catch:{ all -> 0x01fa }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x01fa }
            r3.d(r6)     // Catch:{ all -> 0x01fa }
            de.baimos.dr r3 = a     // Catch:{ all -> 0x01fa }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x01fa }
            r6.<init>()     // Catch:{ all -> 0x01fa }
            java.lang.String r7 = "client timeout: "
            r6.append(r7)     // Catch:{ all -> 0x01fa }
            r6.append(r12)     // Catch:{ all -> 0x01fa }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x01fa }
            r3.d(r6)     // Catch:{ all -> 0x01fa }
            if (r2 != 0) goto L_0x0264
            if (r12 != 0) goto L_0x025c
            boolean r2 = r9.a()     // Catch:{ all -> 0x01fa }
            if (r2 != 0) goto L_0x0254
            de.baimos.blueid.sdk.api.exceptions.ConnectException r2 = new de.baimos.blueid.sdk.api.exceptions.ConnectException     // Catch:{ all -> 0x01fa }
            java.lang.String r3 = "Failed to connect to Secured Object"
            r2.<init>(r3, r0)     // Catch:{ all -> 0x01fa }
            throw r2     // Catch:{ all -> 0x01fa }
        L_0x0254:
            de.baimos.blueid.sdk.api.exceptions.ConnectionIOException r2 = new de.baimos.blueid.sdk.api.exceptions.ConnectionIOException     // Catch:{ all -> 0x01fa }
            java.lang.String r3 = "Failed to communicate with Secured Object"
            r2.<init>(r3, r0)     // Catch:{ all -> 0x01fa }
            throw r2     // Catch:{ all -> 0x01fa }
        L_0x025c:
            de.baimos.blueid.sdk.api.exceptions.ConnectionTimeoutException r2 = new de.baimos.blueid.sdk.api.exceptions.ConnectionTimeoutException     // Catch:{ all -> 0x01fa }
            java.lang.String r3 = "Client timeout"
            r2.<init>(r3, r0)     // Catch:{ all -> 0x01fa }
            throw r2     // Catch:{ all -> 0x01fa }
        L_0x0264:
            de.baimos.blueid.sdk.api.exceptions.ConnectionTimeoutException r2 = new de.baimos.blueid.sdk.api.exceptions.ConnectionTimeoutException     // Catch:{ all -> 0x01fa }
            java.lang.String r3 = "Socket timeout"
            r2.<init>(r3, r0)     // Catch:{ all -> 0x01fa }
            throw r2     // Catch:{ all -> 0x01fa }
        L_0x026c:
            r0 = move-exception
        L_0x026d:
            throw r0     // Catch:{ all -> 0x01fa }
        L_0x026e:
            r0 = move-exception
        L_0x026f:
            throw r0     // Catch:{ all -> 0x01fa }
        L_0x0270:
            if (r10 == 0) goto L_0x0275
            r10.d()
        L_0x0275:
            int r2 = r9.b()
            if (r2 != 0) goto L_0x028b
            int r2 = r9.getResponseCode()
            if (r2 != 0) goto L_0x028b
            java.lang.String r2 = java.lang.System.getProperty(r4)
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0290
        L_0x028b:
            de.baimos.blueid.sdk.metrics.AndroidSdkMetrics r2 = r1.b
            r13.a((de.baimos.blueid.sdk.metrics.AndroidSdkMetrics) r2)
        L_0x0290:
            throw r0
        L_0x0291:
            de.baimos.blueid.sdk.api.exceptions.ChannelNotAvailableException r2 = new de.baimos.blueid.sdk.api.exceptions.ChannelNotAvailableException
            r2.<init>(r0)
            throw r2
        L_0x0297:
            de.baimos.blueid.sdk.api.exceptions.ChannelNotAuthorizedException r2 = new de.baimos.blueid.sdk.api.exceptions.ChannelNotAuthorizedException
            r2.<init>(r0)
            throw r2
        L_0x029d:
            de.baimos.blueid.sdk.api.exceptions.ChannelNotSupportedException r2 = new de.baimos.blueid.sdk.api.exceptions.ChannelNotSupportedException
            r2.<init>(r0)
            throw r2
        L_0x02a3:
            de.baimos.blueid.sdk.api.exceptions.ChannelNotAllowedException r2 = new de.baimos.blueid.sdk.api.exceptions.ChannelNotAllowedException
            java.lang.String r0 = r20.getId()
            r2.<init>((java.lang.String) r0)
            throw r2
        L_0x02ad:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "sdkClientFactory must not be null!"
            r0.<init>(r2)
            throw r0
        L_0x02b5:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Command must not be null! Make sure to set the command parameter properly."
            r0.<init>(r2)
            throw r0
        L_0x02bd:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Channel must not be null! Make sure to set the channel parameter properly."
            r0.<init>(r2)
            throw r0
        L_0x02c5:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "No matching secured object found! Make sure to use a secured object with valid tickets."
            r0.<init>(r2)
            throw r0
        L_0x02cd:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Secured object id must not be null! Make sure to use a valid secured object"
            r0.<init>(r2)
            throw r0
        L_0x02d5:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Secured object must not be null! Make sure to set the secured object parameter properly."
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: de.baimos.as.a(de.baimos.blueid.sdk.api.SecuredObject, de.baimos.blueid.sdk.api.Channel, de.baimos.blueid.sdk.api.Command, byte[], de.baimos.blueid.sdk.conn.SdkClientFactory, java.util.List):de.baimos.blueid.sdk.api.CommandExecutionResponse");
    }
}
