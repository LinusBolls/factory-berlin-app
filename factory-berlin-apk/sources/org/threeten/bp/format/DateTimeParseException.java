package org.threeten.bp.format;

import org.threeten.bp.DateTimeException;

public class DateTimeParseException extends DateTimeException {
    public DateTimeParseException(String str, CharSequence charSequence, int i2) {
        super(str);
        charSequence.toString();
    }

    public DateTimeParseException(String str, CharSequence charSequence, int i2, Throwable th) {
        super(str, th);
        charSequence.toString();
    }
}
