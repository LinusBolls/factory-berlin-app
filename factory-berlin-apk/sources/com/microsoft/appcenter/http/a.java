package com.microsoft.appcenter.http;

import com.microsoft.appcenter.http.d;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/* compiled from: AbstractAppCallTemplate */
public abstract class a implements d.a {
    public void a(URL url, Map<String, String> map) {
        if (com.microsoft.appcenter.utils.a.d() <= 2) {
            com.microsoft.appcenter.utils.a.g("AppCenter", "Calling " + url + "...");
            HashMap hashMap = new HashMap(map);
            String str = (String) hashMap.get("App-Secret");
            if (str != null) {
                hashMap.put("App-Secret", j.f(str));
            }
            com.microsoft.appcenter.utils.a.g("AppCenter", "Headers: " + hashMap);
        }
    }
}
