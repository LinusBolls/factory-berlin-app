package de.baimos.core.util.filter;

import java.util.Enumeration;
import java.util.Hashtable;

public class ConnectionParameters {
    public static final String IS_SERVER_SIDE = "server";
    public static final String REMOTE_ADDRESS = "remoteAddress";
    private Hashtable parameters = new Hashtable();

    public ConnectionParameters() {
    }

    public ConnectionParameters(ConnectionParameters connectionParameters) {
        Hashtable hashtable = connectionParameters.parameters;
        Enumeration keys = hashtable.keys();
        while (keys.hasMoreElements()) {
            Object nextElement = keys.nextElement();
            this.parameters.put(nextElement, hashtable.get(nextElement));
        }
    }

    public Object getParameter(String str) {
        return this.parameters.get(str);
    }

    public String getRemoteAddress() {
        return (String) this.parameters.get(REMOTE_ADDRESS);
    }

    public boolean isServerSide() {
        return ((Boolean) getParameter(IS_SERVER_SIDE)).booleanValue();
    }

    public void setIsServerSide(boolean z) {
        setParameter(IS_SERVER_SIDE, new Boolean(z));
    }

    public void setParameter(String str, Object obj) {
        if (obj != null) {
            this.parameters.put(str, obj);
        }
    }

    public void setRemoteAddress(String str) {
        setParameter(REMOTE_ADDRESS, str);
    }

    public String toString() {
        return this.parameters.toString();
    }
}
