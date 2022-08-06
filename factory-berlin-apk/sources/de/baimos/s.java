package de.baimos;

public class s extends Exception {
    public s(String str) {
        super(str);
    }

    public s(String str, Throwable th) {
        super(str, th);
    }
}
