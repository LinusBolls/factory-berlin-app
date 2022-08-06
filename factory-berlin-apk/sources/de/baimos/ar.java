package de.baimos;

import de.baimos.blueid.sdk.api.exceptions.RemoteException;
import java.net.MalformedURLException;
import java.net.URL;

public class ar extends RemoteException {
    private String a;
    private String b;
    private int c;

    public ar(String str, int i2) {
        this.a = str;
        try {
            this.b = new URL(this.a).getHost();
            this.c = i2;
        } catch (MalformedURLException e2) {
            throw new RuntimeException(e2);
        }
    }

    public String a() {
        return this.a;
    }

    public int b() {
        return this.c;
    }

    public String getMessage() {
        return "failed to contact " + this.b + " (" + this.c + ")";
    }
}
