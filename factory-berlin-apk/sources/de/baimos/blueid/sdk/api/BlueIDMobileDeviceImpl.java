package de.baimos.blueid.sdk.api;

import de.baimos.al;
import de.baimos.an;
import de.baimos.ao;
import de.baimos.ap;
import de.baimos.aq;
import de.baimos.as;
import de.baimos.at;
import de.baimos.au;
import de.baimos.av;
import de.baimos.bg;
import de.baimos.blueid.sdk.api.BlueIDMobileDevice;
import de.baimos.blueid.sdk.api.exceptions.AuthorizationException;
import de.baimos.blueid.sdk.api.exceptions.ClientAlreadyInitializedException;
import de.baimos.blueid.sdk.api.exceptions.ClientNotInitializedException;
import de.baimos.blueid.sdk.api.exceptions.MarshalException;
import de.baimos.blueid.sdk.api.exceptions.RemoteException;
import de.baimos.blueid.sdk.api.response.AuthorizationStatus;
import de.baimos.blueid.sdk.conn.SdkClientFactory;
import de.baimos.blueid.sdk.conn.d;
import de.baimos.blueid.sdk.internal.DeviceInitializer;
import de.baimos.blueid.sdk.metrics.AndroidSdkMetrics;
import de.baimos.blueid.sdk.metrics.a;
import de.baimos.core.util.filter.ConnectionFilter;
import de.baimos.cs;
import de.baimos.dr;
import de.baimos.ds;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.Key;
import java.util.Date;
import java.util.List;
import org.json.JSONException;

public class BlueIDMobileDeviceImpl implements BlueIDMobileDevice, DeviceInitializer {
    private static final dr a = ds.a(BlueIDMobileDeviceImpl.class);
    private bg b;
    private an c;

    /* renamed from: d  reason: collision with root package name */
    private al f8214d;

    /* renamed from: e  reason: collision with root package name */
    private at f8215e;

    /* renamed from: f  reason: collision with root package name */
    private av f8216f;

    /* renamed from: g  reason: collision with root package name */
    private as f8217g;

    /* renamed from: h  reason: collision with root package name */
    private ap f8218h;

    /* renamed from: i  reason: collision with root package name */
    private SdkClientFactory f8219i;

    /* renamed from: j  reason: collision with root package name */
    private ao f8220j;

    /* renamed from: k  reason: collision with root package name */
    private String f8221k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f8222l;

    /* renamed from: m  reason: collision with root package name */
    private AndroidSdkMetrics f8223m;

    /* renamed from: n  reason: collision with root package name */
    private au f8224n;

    /* renamed from: de.baimos.blueid.sdk.api.BlueIDMobileDeviceImpl$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|(3:19|20|22)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                de.baimos.blueid.sdk.api.response.AuthorizationStatus[] r0 = de.baimos.blueid.sdk.api.response.AuthorizationStatus.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                de.baimos.blueid.sdk.api.response.AuthorizationStatus r1 = de.baimos.blueid.sdk.api.response.AuthorizationStatus.TICKET_INVALID     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001d }
                de.baimos.blueid.sdk.api.response.AuthorizationStatus r1 = de.baimos.blueid.sdk.api.response.AuthorizationStatus.TICKET_NOT_VALID_YET     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0028 }
                de.baimos.blueid.sdk.api.response.AuthorizationStatus r1 = de.baimos.blueid.sdk.api.response.AuthorizationStatus.TICKET_NOT_VALID_ANYMORE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0033 }
                de.baimos.blueid.sdk.api.response.AuthorizationStatus r1 = de.baimos.blueid.sdk.api.response.AuthorizationStatus.TICKET_REVOKED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x003e }
                de.baimos.blueid.sdk.api.response.AuthorizationStatus r1 = de.baimos.blueid.sdk.api.response.AuthorizationStatus.COMMAND_NOT_ALLOWED     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0049 }
                de.baimos.blueid.sdk.api.response.AuthorizationStatus r1 = de.baimos.blueid.sdk.api.response.AuthorizationStatus.CHANNEL_NOT_ALLOWED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0054 }
                de.baimos.blueid.sdk.api.response.AuthorizationStatus r1 = de.baimos.blueid.sdk.api.response.AuthorizationStatus.TICKET_FOR_OTHER_DEVICE     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0060 }
                de.baimos.blueid.sdk.api.response.AuthorizationStatus r1 = de.baimos.blueid.sdk.api.response.AuthorizationStatus.MOBILE_NOT_TRUSTED     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x006c }
                de.baimos.blueid.sdk.api.response.AuthorizationStatus r1 = de.baimos.blueid.sdk.api.response.AuthorizationStatus.NO_TICKET_ON_LOCKSERVER     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0078 }
                de.baimos.blueid.sdk.api.response.AuthorizationStatus r1 = de.baimos.blueid.sdk.api.response.AuthorizationStatus.INTERNAL_ERROR     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: de.baimos.blueid.sdk.api.BlueIDMobileDeviceImpl.AnonymousClass1.<clinit>():void");
        }
    }

    BlueIDMobileDeviceImpl(String str, SdkClientFactory sdkClientFactory, Key key) {
        this(str, sdkClientFactory, key, new a());
    }

    BlueIDMobileDeviceImpl(String str, SdkClientFactory sdkClientFactory, Key key, AndroidSdkMetrics androidSdkMetrics) {
        this.f8222l = false;
        this.f8221k = str;
        this.f8219i = sdkClientFactory;
        this.b = new bg();
        a.c("BlueID SDK for Android 3.4.2, revision 53484, built at 2019-09-03 13:41");
        this.c = new an(str, androidSdkMetrics);
        this.f8214d = new al(str, SdkInfo.VERSION, key);
        this.f8218h = new ap(str, SdkInfo.VERSION, key, sdkClientFactory, androidSdkMetrics);
        this.f8220j = new ao(str, SdkInfo.VERSION, key);
        this.f8215e = new at(this.c, this.f8214d, sdkClientFactory, androidSdkMetrics);
        this.f8224n = new au(this.f8214d, sdkClientFactory, androidSdkMetrics);
        this.f8216f = new av(this.f8214d, this.f8218h, this.f8220j, sdkClientFactory, androidSdkMetrics);
        this.f8217g = new as(this.c, this.f8218h, this.f8220j, new d(this.f8220j, androidSdkMetrics), androidSdkMetrics);
        this.f8223m = androidSdkMetrics;
    }

    private synchronized void d() {
        this.f8214d.a();
        this.f8218h.a();
        this.f8220j.a();
        this.f8222l = true;
    }

    private void e() {
        if (!isInitialized()) {
            throw new ClientNotInitializedException();
        }
    }

    public CommandExecutionResponse a(SecuredObject securedObject, Channel channel, Command command, byte[] bArr, List<ConnectionFilter> list) {
        e();
        this.b.a(securedObject, getDeviceId(), command, channel);
        try {
            return this.f8217g.a(securedObject, channel, command, bArr, this.f8219i, list);
        } catch (aq e2) {
            int a2 = e2.a();
            dr drVar = a;
            drVar.a("Failed to execute command with SecuredObjectException code " + a2);
            AuthorizationStatus convertToStatus = AuthorizationStatus.convertToStatus(a2);
            switch (AnonymousClass1.a[convertToStatus.ordinal()]) {
                case 1:
                    throw new AuthorizationException(convertToStatus, "BlueID Token is not valid. Please make sure that the time of the mobile device and secured object are correct.");
                case 2:
                    throw new AuthorizationException(convertToStatus, "BlueID Token is not valid yet, i.e. the begin date was in the future. Please make sure that the time of the mobile device and secured object are correct.");
                case 3:
                    throw new AuthorizationException(convertToStatus, "BlueID Token is not valid anymore, i.e. the end date was in the past. Please make sure that the time of the mobile device and secured object are correct.");
                case 4:
                    throw new AuthorizationException(convertToStatus, "BlueID Token was revoked.");
                case 5:
                    throw new AuthorizationException(convertToStatus, "The command is not allowed by the BlueID Token. Please use only supported commands or create a corresponding BlueID Token.");
                case 6:
                    throw new AuthorizationException(convertToStatus, "The channel is not allowed by the BlueID Token. Please use only supported channels or create a corresponding BlueID Token.");
                case 7:
                    throw new AuthorizationException(convertToStatus, "BlueID Token is not for this mobile device. Please initialize your mobile device correctly.");
                case 8:
                    throw new AuthorizationException(convertToStatus, "The identity of this mobile device could not be verified. Please try again.");
                case 9:
                    throw new AuthorizationException(convertToStatus, "No BlueID Token was available on the secured object. This only matters if a BlueID protocol was used that does not transfer the BlueID Token.");
                case 10:
                    throw new AuthorizationException(convertToStatus, "An internal error occurred on the secured object. Please try again.");
                default:
                    throw new AuthorizationException(a2, "unknown error " + a2);
            }
        }
    }

    public String a() {
        return this.f8224n.b();
    }

    /* access modifiers changed from: protected */
    public String b() {
        return this.f8221k;
    }

    public synchronized void destroy() {
        this.f8222l = false;
        this.c.b();
        this.f8214d.d();
        this.f8218h.d();
        this.f8220j.d();
    }

    public CommandExecutionResponse executeCommand(SecuredObject securedObject, Channel channel, Command command) {
        return a(securedObject, channel, command, (byte[]) null, (List<ConnectionFilter>) null);
    }

    public CommandExecutionResponse executeCommand(SecuredObject securedObject, Channel channel, Command command, byte[] bArr) {
        return a(securedObject, channel, command, bArr, (List<ConnectionFilter>) null);
    }

    public String getDeviceId() {
        if (!this.f8222l) {
            return null;
        }
        if (this.c == null) {
            a.a("Can not load device id. The key store is not properly initialized.");
            return null;
        }
        try {
            byte[] bytes = this.f8214d.b("DEVICE_ID").getBytes();
            if (bytes.length > 0) {
                try {
                    return new String(bytes, "UTF-8");
                } catch (UnsupportedEncodingException e2) {
                    dr drVar = a;
                    drVar.b("Can not load device id. Is not in encoding " + "UTF-8");
                    AndroidSdkMetrics androidSdkMetrics = this.f8223m;
                    androidSdkMetrics.addMessage("Can not load device id. Is not in encoding " + "UTF-8", e2);
                    return null;
                }
            } else {
                a.b("Can not load device id. Please initialize your mobile device first.");
                this.f8223m.addMessage("Can not load device id. Please initialize your mobile device first.");
                return null;
            }
        } catch (Exception e3) {
            a.b("Can not get device id. Maybe the device is not initialized yet.", e3);
            this.f8223m.addMessage("Can not get device id. Maybe the device is not initialized yet.", e3);
            return null;
        }
    }

    public Date getLastSynchronizationDate() {
        e();
        String b2 = this.f8214d.b("LAST_SYNC_DATE");
        if (b2 == null || b2.isEmpty()) {
            return null;
        }
        return new Date(Long.parseLong(b2));
    }

    public String getLogs() {
        return this.b.b();
    }

    public AndroidSdkMetrics getSdkMetrics() {
        return this.f8223m;
    }

    public SecuredObject getSecuredObjectById(String str) {
        e();
        if (!cs.a(str)) {
            for (SecuredObject next : this.f8218h.g()) {
                if (str.equals(next.getId())) {
                    return next;
                }
            }
            return null;
        }
        throw new IllegalArgumentException("id must not be null");
    }

    public List<SecuredObject> getSecuredObjects() {
        e();
        return this.f8218h.g();
    }

    public void initLogs() {
        this.b.a();
    }

    public BlueIDMobileDevice.InitParametersBuilder initialize() {
        return new BlueIDMobileDevice.InitParametersBuilder(this);
    }

    public String initialize(BlueIDMobileDevice.InitParametersBuilder initParametersBuilder) {
        if (isInitialized()) {
            throw new ClientAlreadyInitializedException();
        } else if (initParametersBuilder == null || (initParametersBuilder.apiKey == null && initParametersBuilder.trustCenterHostName == null)) {
            throw new IllegalArgumentException("Parameters must be set");
        } else if (cs.a(initParametersBuilder.apiKey)) {
            throw new IllegalArgumentException("API key must be set");
        } else if (!cs.a(initParametersBuilder.trustCenterHostName)) {
            if (initParametersBuilder.trustCenterHostName.startsWith("http://")) {
                if (Boolean.getBoolean("de.baimos.blueid.sdk.allowHttp")) {
                    a.c("HTTP url detected");
                } else {
                    a.b("Tried to initialize BlueIDMobileDeviceInitParameters with insecure Trust Center URL");
                    throw new IllegalArgumentException("Protocol must be HTTPS");
                }
            }
            this.b.a("", initParametersBuilder.trustCenterHostName);
            return this.f8215e.a(initParametersBuilder.apiKey, initParametersBuilder.trustCenterHostName);
        } else {
            throw new IllegalArgumentException("TrustCenter host name must be set");
        }
    }

    public boolean isInitialized() {
        if (!this.f8222l) {
            synchronized (this) {
                if (!this.f8222l) {
                    try {
                        d();
                    } catch (Exception e2) {
                        a.b("failed to retrieve database information, deleting them and starting with fresh databases", e2);
                        this.f8223m.addMessage("failed to retrieve database information, deleting them and starting with fresh databases", e2);
                        destroy();
                        d();
                    }
                }
            }
        }
        return this.f8215e.a();
    }

    public synchronized void synchronize() {
        e();
        this.b.a(getDeviceId(), this.f8216f.b());
        try {
            this.f8216f.a();
        } catch (JSONException e2) {
            throw new MarshalException(e2);
        } catch (RemoteException e3) {
            throw e3;
        } catch (IOException e4) {
            throw new RuntimeException(e4);
        }
    }
}
