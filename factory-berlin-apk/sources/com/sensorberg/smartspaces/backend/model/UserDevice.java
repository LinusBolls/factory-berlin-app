package com.sensorberg.smartspaces.backend.model;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.provider.Settings;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.jasminb.jsonapi.p.a;
import com.github.jasminb.jsonapi.p.g;
import com.sensorberg.smartspaces.backend.q.o;

@JsonInclude(JsonInclude.Include.NON_NULL)
@g("user-devices")
public class UserDevice {
    @JsonProperty("aes-encryption-mode")
    public String aesEncryptionMode;
    @JsonProperty("unique-device-identifier")
    public String androidDeviceId;
    @JsonProperty("app-version")
    public String appVersion;
    @JsonProperty("blueid-identifier")
    public String blueIdIdentifier;
    @JsonProperty("device-name")
    public String deviceName;
    @a
    public String id;
    @JsonProperty("manufacturer")
    public String manufacturer;
    @JsonProperty("operating-system")
    public String operatingSystem;
    @JsonProperty("operating-system-version")
    public String operatingSystemVersion;
    @JsonProperty("rsa-public-key")
    public String pubKey;
    @JsonProperty("push-notifications-token")
    public String pushNotificationToken;
    @JsonProperty("user-agent")
    public String userAgent;

    public UserDevice() {
    }

    @SuppressLint({"HardwareIds"})
    public UserDevice(Context context, String str, String str2) {
        this.id = null;
        this.userAgent = o.b;
        this.blueIdIdentifier = str;
        this.androidDeviceId = context.getPackageName() + "-" + Settings.Secure.getString(context.getContentResolver(), "android_id");
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            this.appVersion = packageInfo.versionName + "-" + packageInfo.versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            this.appVersion = "null";
        }
        this.operatingSystem = "android";
        this.operatingSystemVersion = Build.VERSION.RELEASE;
        this.manufacturer = Build.MANUFACTURER;
        this.deviceName = Build.MODEL;
        this.pubKey = str2;
        this.aesEncryptionMode = "aes-128-gcm";
    }
}
