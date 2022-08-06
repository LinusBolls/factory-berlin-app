package de.baimos.blueid.sdk.metrics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class a extends AndroidSdkMetrics {
    private boolean a;
    private boolean b;
    private long c;

    /* renamed from: d  reason: collision with root package name */
    private long f8231d;

    /* renamed from: e  reason: collision with root package name */
    private long f8232e;

    /* renamed from: f  reason: collision with root package name */
    private long f8233f;

    /* renamed from: g  reason: collision with root package name */
    private long f8234g;

    /* renamed from: h  reason: collision with root package name */
    private long f8235h;

    /* renamed from: i  reason: collision with root package name */
    private long f8236i;

    /* renamed from: j  reason: collision with root package name */
    private long f8237j;

    /* renamed from: k  reason: collision with root package name */
    private long f8238k;

    /* renamed from: l  reason: collision with root package name */
    private long f8239l;

    /* renamed from: m  reason: collision with root package name */
    private long f8240m;

    /* renamed from: n  reason: collision with root package name */
    private long f8241n;
    private long o;
    private long p;
    private long q;
    private long r;
    private List<String> s = new ArrayList();
    private Map<Long, Exception> t = new HashMap();

    public void addMessage(Exception exc) {
        addMessage(exc.getClass().getSimpleName());
        this.t.put(Long.valueOf(System.currentTimeMillis()), exc);
    }

    public void addMessage(String str) {
        String replaceAll = str.replaceAll("\n\t", " -> ").replaceAll("\t", " ").replaceAll("\n", " ").replaceAll(AndroidSdkMetrics.SEPARATOR, " ");
        List<String> list = this.s;
        list.add(System.currentTimeMillis() + ": " + replaceAll);
    }

    public void addMessage(String str, Exception exc) {
        addMessage(exc.getClass().getSimpleName() + "(" + str + ")");
        this.t.put(Long.valueOf(System.currentTimeMillis()), exc);
    }

    public void clearMetrics() {
        this.s.clear();
        this.t.clear();
        this.b = false;
        this.f8231d = -1;
        this.f8232e = -1;
        this.f8234g = -1;
        this.f8235h = -1;
        this.f8236i = -1;
        this.f8237j = -1;
        this.f8238k = -1;
        this.f8239l = -1;
        this.f8240m = -1;
        this.f8241n = -1;
        this.o = -1;
        this.p = -1;
        this.q = -1;
        this.r = -1;
        this.f8233f = -1;
    }

    public void connectionClosed() {
        long currentTimeMillis = System.currentTimeMillis();
        this.q = currentTimeMillis;
        long j2 = this.o;
        long j3 = -1;
        this.r = j2 > 0 ? currentTimeMillis - j2 : -1;
        long j4 = this.c;
        if (j4 > 0) {
            j3 = this.q - j4;
        }
        this.f8231d = j3;
    }

    public void connectionEstablished() {
        this.b = true;
        long currentTimeMillis = System.currentTimeMillis();
        this.f8234g = currentTimeMillis;
        long j2 = this.f8240m;
        this.f8235h = j2 > 0 ? currentTimeMillis - j2 : -1;
    }

    public void deviceFound() {
        if (this.a) {
            this.f8232e = 0;
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.f8236i = currentTimeMillis;
        long j2 = this.f8233f;
        this.f8237j = j2 > 0 ? currentTimeMillis - j2 : -1;
    }

    public void fillMapWithMetrics(Map<String, Object> map) {
        if (map != null) {
            map.put(AndroidSdkMetrics.CACHE_USED_TAB_TITLE_TAG, Boolean.valueOf(this.a));
            long j2 = this.f8232e;
            Long l2 = null;
            map.put(AndroidSdkMetrics.SCAN_TIME_TAB_TITLE_TAG, j2 != -1 ? Long.valueOf(j2) : null);
            long j3 = this.f8237j;
            map.put(AndroidSdkMetrics.DEVICE_DISCOVERY_TIME_TAB_TITLE_TAG, j3 != -1 ? Long.valueOf(j3) : null);
            long j4 = this.f8239l;
            map.put(AndroidSdkMetrics.GATT_CONNECTION_TIME_TAB_TITLE_TAG, j4 != -1 ? Long.valueOf(j4) : null);
            long j5 = this.f8241n;
            map.put(AndroidSdkMetrics.SERVICE_DISCOVER_TIME_TAB_TITLE_TAG, j5 != -1 ? Long.valueOf(j5) : null);
            map.put(AndroidSdkMetrics.CONNECTION_SUCCESS_TAB_TITLE_TAG, Boolean.valueOf(this.b));
            long j6 = this.f8235h;
            map.put(AndroidSdkMetrics.NOTIFICATION_ENABLED_TIME_TAB_TITLE_TAG, j6 != -1 ? Long.valueOf(j6) : null);
            long j7 = this.p;
            map.put(AndroidSdkMetrics.COMMAND_EXECUTION_TIME_TAB_TITLE_TAG, j7 != -1 ? Long.valueOf(j7) : null);
            long j8 = this.r;
            map.put(AndroidSdkMetrics.DISCONNECTION_TIME_TAB_TITLE_TAG, j8 != -1 ? Long.valueOf(j8) : null);
            long j9 = this.f8231d;
            if (j9 != -1) {
                l2 = Long.valueOf(j9);
            }
            map.put(AndroidSdkMetrics.TOTAL_TIME_TAB_TITLE_TAG, l2);
            map.put(AndroidSdkMetrics.SDK_MESSAGE_TAB_TITLE_TAG, this.s);
            map.put(AndroidSdkMetrics.SDK_EXCEPTION_TAB_TITLE_TAG, this.t);
        }
        clearMetrics();
    }

    public void finishedExecution() {
        long currentTimeMillis = System.currentTimeMillis();
        this.o = currentTimeMillis;
        long j2 = this.f8234g;
        this.p = j2 > 0 ? currentTimeMillis - j2 : -1;
    }

    public void gattConnected() {
        long currentTimeMillis = System.currentTimeMillis();
        this.f8238k = currentTimeMillis;
        long j2 = this.f8236i;
        this.f8239l = j2 > 0 ? currentTimeMillis - j2 : -1;
    }

    public void servicesDiscovered() {
        long currentTimeMillis = System.currentTimeMillis();
        this.f8240m = currentTimeMillis;
        long j2 = this.f8238k;
        this.f8241n = j2 > 0 ? currentTimeMillis - j2 : -1;
    }

    public void setConnectedByCache(boolean z) {
        this.a = z;
    }

    public void setScanDuration(long j2) {
        this.f8232e = j2;
    }

    public void startConnectionAttempt() {
        this.f8233f = System.currentTimeMillis();
    }

    public void startExecution() {
        this.c = System.currentTimeMillis();
    }

    public String toString() {
        return "CacheUsed: " + this.a + ", ScanMs: " + this.f8232e + ", DeviceDiscoveredMs: " + this.f8237j + ", GattConnectionMs: " + this.f8239l + ", ServicesDiscoveredMs: " + this.f8241n + ", NotificationEnabledMs: " + this.f8235h + ", CMDExecutionMs: " + this.p + ", DisconnectMs: " + this.r + ", TotalMs: " + this.f8231d + ", ExecutionStart: " + this.c + ", SdkMessages: " + this.s.toString() + ", SdkExceptions: " + this.t.toString();
    }

    public void writeResultsInCSVFormat(StringBuilder sb) {
        sb.setLength(0);
        sb.append(this.a);
        sb.append(AndroidSdkMetrics.SEPARATOR);
        sb.append(this.f8232e);
        sb.append(AndroidSdkMetrics.SEPARATOR);
        sb.append(this.f8237j);
        sb.append(AndroidSdkMetrics.SEPARATOR);
        sb.append(this.f8239l);
        sb.append(AndroidSdkMetrics.SEPARATOR);
        sb.append(this.f8241n);
        sb.append(AndroidSdkMetrics.SEPARATOR);
        sb.append(this.b);
        sb.append(AndroidSdkMetrics.SEPARATOR);
        sb.append(this.f8235h);
        sb.append(AndroidSdkMetrics.SEPARATOR);
        sb.append(this.p);
        sb.append(AndroidSdkMetrics.SEPARATOR);
        sb.append(this.r);
        sb.append(AndroidSdkMetrics.SEPARATOR);
        sb.append(this.f8231d);
        sb.append(AndroidSdkMetrics.SEPARATOR);
        sb.append(this.c);
        sb.append(AndroidSdkMetrics.SEPARATOR);
        for (String append : this.s) {
            sb.append(append);
            sb.append("    ");
        }
        clearMetrics();
    }
}
