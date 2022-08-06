package de.baimos.blueid.sdk.api.exceptions;

import java.util.Date;

public class TimeDriftException extends RemoteException {
    private Date serverTime;
    private int timeDriftInMinutes;

    public TimeDriftException(Date date, int i2) {
        super("time drift to server time too large! time drift = " + i2 + " minutes. Please adjust your smartphone clock and try again!");
        this.serverTime = date;
        this.timeDriftInMinutes = i2;
    }

    public Date getServerTime() {
        return this.serverTime;
    }

    public int getTimeDriftInMinutes() {
        return this.timeDriftInMinutes;
    }
}
