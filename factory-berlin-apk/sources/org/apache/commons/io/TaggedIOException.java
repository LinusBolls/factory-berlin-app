package org.apache.commons.io;

import java.io.IOException;

public class TaggedIOException extends IOExceptionWithCause {
    /* renamed from: a */
    public IOException getCause() {
        return (IOException) super.getCause();
    }
}
