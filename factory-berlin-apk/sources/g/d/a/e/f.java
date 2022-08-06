package g.d.a.e;

import android.util.Base64;
import g.d.a.d;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
import org.apache.commons.io.b;

final class f {
    public static HttpsURLConnection a(String str, String str2, String str3) {
        try {
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) new URL(str).openConnection();
            httpsURLConnection.setRequestMethod("GET");
            String str4 = str2 + ":" + str3;
            httpsURLConnection.setRequestProperty("Authorization", "Basic " + new String(Base64.encode(str4.getBytes(), 2)));
            return httpsURLConnection;
        } catch (IOException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static String b() {
        return "/pkalogisticapi/v1";
    }

    public static String c() {
        return "/pkaapi/v1";
    }

    public static String d(String str) {
        b bVar;
        String str2 = "#demo#";
        if (str.contains(str2)) {
            bVar = b.PortalEnvironmentDEMOMYRENZCOM;
        } else {
            str2 = "#show#";
            if (str.contains(str2)) {
                bVar = b.PortalEnvironmentSHOWMYRENZCOM;
            } else {
                str2 = "#hot#";
                if (!str.contains(str2)) {
                    return str;
                }
                bVar = b.PortalEnvironmentHOTMYRENZCOM;
            }
        }
        d.h(bVar, (String) null);
        return str.replace(str2, "");
    }

    public static String e(InputStream inputStream) {
        StringWriter stringWriter = new StringWriter();
        b.b(inputStream, stringWriter);
        return stringWriter.toString();
    }
}
