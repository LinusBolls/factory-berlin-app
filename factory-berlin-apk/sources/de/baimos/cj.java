package de.baimos;

public class cj extends RuntimeException {
    private Exception a;

    public cj() {
    }

    public cj(String str) {
        super(str);
    }

    public void printStackTrace() {
        super.printStackTrace();
        if (this.a != null) {
            System.err.println("caused by:");
            this.a.printStackTrace();
        }
    }
}
