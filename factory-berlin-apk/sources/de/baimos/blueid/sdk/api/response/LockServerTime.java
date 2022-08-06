package de.baimos.blueid.sdk.api.response;

import java.util.Date;

public class LockServerTime implements ResponseObject {
    private Date date;

    LockServerTime(Date date2) {
        this.date = date2;
    }

    public Date getTime() {
        return new Date(this.date.getTime());
    }

    public String toString() {
        return "LockServerTime{" + this.date + '}';
    }
}
