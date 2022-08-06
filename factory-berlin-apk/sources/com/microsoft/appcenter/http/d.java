package com.microsoft.appcenter.http;

import java.io.Closeable;
import java.net.URL;
import java.util.Map;

/* compiled from: HttpClient */
public interface d extends Closeable {

    /* compiled from: HttpClient */
    public interface a {
        void a(URL url, Map<String, String> map);

        String b();
    }

    void c();

    k p0(String str, String str2, Map<String, String> map, a aVar, l lVar);
}
