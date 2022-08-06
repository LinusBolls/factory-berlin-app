package de.baimos;

public class ck extends RuntimeException {
    private Exception a;

    public ck() {
    }

    public ck(String str, Exception exc) {
        super(str);
        this.a = exc;
    }

    public void printStackTrace() {
        super.printStackTrace();
        if (this.a != null) {
            System.err.println("caused by:");
            this.a.printStackTrace();
        }
    }
}
