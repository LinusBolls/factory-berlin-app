package org.threeten.bp.format;

/* compiled from: TextStyle */
public enum n {
    FULL,
    FULL_STANDALONE,
    SHORT,
    SHORT_STANDALONE,
    NARROW,
    NARROW_STANDALONE;

    public n a() {
        return values()[ordinal() & -2];
    }
}
