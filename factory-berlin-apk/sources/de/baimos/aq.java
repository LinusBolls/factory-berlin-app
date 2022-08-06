package de.baimos;

public class aq extends Exception {
    private int a;

    public aq(int i2) {
        this.a = i2;
    }

    public int a() {
        return this.a;
    }
}
