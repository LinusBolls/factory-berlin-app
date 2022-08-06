package androidx.work;

/* compiled from: WorkInfo */
public enum p {
    ENQUEUED,
    RUNNING,
    SUCCEEDED,
    FAILED,
    BLOCKED,
    CANCELLED;

    public boolean a() {
        return this == SUCCEEDED || this == FAILED || this == CANCELLED;
    }
}
