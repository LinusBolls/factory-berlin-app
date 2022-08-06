package de.baimos.blueid.sdk.util;

import de.baimos.dr;
import de.baimos.ds;
import java.util.HashMap;
import java.util.Map;

public class a {
    private static final dr a = ds.a(a.class);
    private static final Map<String, String> b = new HashMap<String, String>() {
        {
            put("deviceapi.int.core.nue.baimos.de", "deviceapi-int.blueid.net");
            put("deviceapi.core.nue.baimos.com", "deviceapi-prod.blueid.net");
        }
    };

    public static String a(String str) {
        String str2 = b.get(str);
        if (str2 == null) {
            return str;
        }
        dr drVar = a;
        drVar.d("replacing hostname, old=" + str + ", new=" + str2);
        return str2;
    }
}
